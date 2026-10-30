package app.monii.managed.mqtt

import android.content.Context
import android.util.Log
import app.monii.managed.identity.DeviceStore
import app.monii.managed.sync.SyncScheduler
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended
import org.eclipse.paho.client.mqttv3.MqttClient
import org.eclipse.paho.client.mqttv3.MqttConnectOptions
import org.eclipse.paho.client.mqttv3.MqttMessage
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence

/**
 * Persistent MQTT connection — the realtime command spine (parallel to FCM).
 * When the backend publishes to this device's topic, we trigger an immediate
 * sync so the device pulls and executes the waiting command over the idempotent
 * REST path. No-op unless an MQTT broker URL is configured.
 *
 * The message payload is only a wake nudge; the REST spine stays the source of
 * truth, so a lost or duplicate publish is harmless.
 */
class MqttClientManager(context: Context) {
    private val appContext = context.applicationContext
    private val store = DeviceStore(appContext)
    private var client: MqttClient? = null

    fun start() {
        val brokerUrl = store.mqttUrl()
        val deviceId = store.deviceId()
        if (brokerUrl.isNullOrBlank() || deviceId == null) return
        if (client?.isConnected == true) return

        try {
            val c = MqttClient(brokerUrl, "op-$deviceId", MemoryPersistence())
            val opts = MqttConnectOptions().apply {
                isAutomaticReconnect = true
                isCleanSession = true
                connectionTimeout = 10
                keepAliveInterval = 60
                userName = deviceId
                store.token()?.let { password = it.toCharArray() }
            }
            c.setCallback(object : MqttCallbackExtended {
                override fun connectComplete(reconnect: Boolean, serverURI: String?) {
                    runCatching { c.subscribe(topic(deviceId), 1) }
                }

                override fun connectionLost(cause: Throwable?) {
                    Log.w(TAG, "MQTT lost: ${cause?.message}")
                }

                override fun messageArrived(topic: String?, message: MqttMessage?) {
                    // A command is waiting — pull it immediately.
                    SyncScheduler.runOnce(appContext)
                }

                override fun deliveryComplete(token: IMqttDeliveryToken?) {}
            })
            c.connect(opts)
            client = c
        } catch (e: Exception) {
            Log.w(TAG, "MQTT connect failed: ${e.message}")
        }
    }

    fun stop() {
        runCatching { client?.disconnectForcibly(500) }
        runCatching { client?.close() }
        client = null
    }

    private fun topic(deviceId: String) = "openparental/device/$deviceId/cmd"

    companion object {
        private const val TAG = "MqttClient"
    }
}
