package org.eclipse.paho.client.mqttv3;

import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;
import org.eclipse.paho.client.mqttv3.util.Debug;

/* loaded from: classes5.dex */
public class MqttClient implements IMqttClient {
    protected MqttAsyncClient aClient;
    protected long timeToWait;

    public MqttClient(String str, String str2) throws MqttException {
        this(str, str2, new MqttDefaultFilePersistence());
    }

    public static String generateClientId() {
        return MqttAsyncClient.generateClientId();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void close() throws MqttException {
        this.aClient.close(false);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void connect() throws MqttSecurityException, MqttException {
        connect(new MqttConnectOptions());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken connectWithResult(MqttConnectOptions mqttConnectOptions) throws MqttSecurityException, MqttException {
        IMqttToken connect = this.aClient.connect(mqttConnectOptions, null, null);
        connect.waitForCompletion(getTimeToWait());
        return connect;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnect() throws MqttException {
        this.aClient.disconnect().waitForCompletion();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnectForcibly() throws MqttException {
        this.aClient.disconnectForcibly();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public String getClientId() {
        return this.aClient.getClientId();
    }

    public String getCurrentServerURI() {
        return this.aClient.getCurrentServerURI();
    }

    public Debug getDebug() {
        return this.aClient.getDebug();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttDeliveryToken[] getPendingDeliveryTokens() {
        return this.aClient.getPendingDeliveryTokens();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public String getServerURI() {
        return this.aClient.getServerURI();
    }

    public long getTimeToWait() {
        return this.timeToWait;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public MqttTopic getTopic(String str) {
        return this.aClient.getTopic(str);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public boolean isConnected() {
        return this.aClient.isConnected();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void messageArrivedComplete(int i4, int i5) throws MqttException {
        this.aClient.messageArrivedComplete(i4, i5);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void publish(String str, byte[] bArr, int i4, boolean z4) throws MqttException, MqttPersistenceException {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i4);
        mqttMessage.setRetained(z4);
        publish(str, mqttMessage);
    }

    public void reconnect() throws MqttException {
        this.aClient.reconnect();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void setCallback(MqttCallback mqttCallback) {
        this.aClient.setCallback(mqttCallback);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void setManualAcks(boolean z4) {
        this.aClient.setManualAcks(z4);
    }

    public void setTimeToWait(long j4) throws IllegalArgumentException {
        if (j4 < -1) {
            throw new IllegalArgumentException();
        }
        this.timeToWait = j4;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str) throws MqttException {
        subscribe(new String[]{str}, new int[]{1});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str) throws MqttException {
        return subscribeWithResponse(new String[]{str}, new int[]{1});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void unsubscribe(String str) throws MqttException {
        unsubscribe(new String[]{str});
    }

    public MqttClient(String str, String str2, MqttClientPersistence mqttClientPersistence) throws MqttException {
        this.aClient = null;
        this.timeToWait = -1L;
        this.aClient = new MqttAsyncClient(str, str2, mqttClientPersistence);
    }

    public void close(boolean z4) throws MqttException {
        this.aClient.close(z4);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void connect(MqttConnectOptions mqttConnectOptions) throws MqttSecurityException, MqttException {
        this.aClient.connect(mqttConnectOptions, null, null).waitForCompletion(getTimeToWait());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnect(long j4) throws MqttException {
        this.aClient.disconnect(j4, null, null).waitForCompletion();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnectForcibly(long j4) throws MqttException {
        this.aClient.disconnectForcibly(j4);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr) throws MqttException {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = 1;
        }
        subscribe(strArr, iArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str, IMqttMessageListener iMqttMessageListener) throws MqttException {
        return subscribeWithResponse(new String[]{str}, new int[]{1}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void unsubscribe(String[] strArr) throws MqttException {
        this.aClient.unsubscribe(strArr, (Object) null, (IMqttActionListener) null).waitForCompletion(getTimeToWait());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnectForcibly(long j4, long j5) throws MqttException {
        this.aClient.disconnectForcibly(j4, j5);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str, int i4) throws MqttException {
        return subscribeWithResponse(new String[]{str}, new int[]{i4});
    }

    public void disconnectForcibly(long j4, long j5, boolean z4) throws MqttException {
        this.aClient.disconnectForcibly(j4, j5, z4);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str, int i4, IMqttMessageListener iMqttMessageListener) throws MqttException {
        return subscribeWithResponse(new String[]{str}, new int[]{i4}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void publish(String str, MqttMessage mqttMessage) throws MqttException, MqttPersistenceException {
        this.aClient.publish(str, mqttMessage, (Object) null, (IMqttActionListener) null).waitForCompletion(getTimeToWait());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str, int i4) throws MqttException {
        subscribe(new String[]{str}, new int[]{i4});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr) throws MqttException {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = 1;
        }
        return subscribeWithResponse(strArr, iArr);
    }

    public MqttClient(String str, String str2, MqttClientPersistence mqttClientPersistence, ScheduledExecutorService scheduledExecutorService) throws MqttException {
        this.aClient = null;
        this.timeToWait = -1L;
        this.aClient = new MqttAsyncClient(str, str2, mqttClientPersistence, new ScheduledExecutorPingSender(scheduledExecutorService), scheduledExecutorService);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr, int[] iArr) throws MqttException {
        IMqttToken subscribe = this.aClient.subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null);
        subscribe.waitForCompletion(getTimeToWait());
        int[] grantedQos = subscribe.getGrantedQos();
        for (int i4 = 0; i4 < grantedQos.length; i4++) {
            iArr[i4] = grantedQos[i4];
        }
        if (grantedQos.length == 1 && iArr[0] == 128) {
            throw new MqttException(128);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = 1;
        }
        return subscribeWithResponse(strArr, iArr, iMqttMessageListenerArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, int[] iArr) throws MqttException {
        IMqttToken subscribe = this.aClient.subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null);
        subscribe.waitForCompletion(getTimeToWait());
        return subscribe;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str, IMqttMessageListener iMqttMessageListener) throws MqttException {
        subscribe(new String[]{str}, new int[]{1}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
        IMqttToken subscribeWithResponse = subscribeWithResponse(strArr, iArr);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            this.aClient.comms.setMessageListener(strArr[i4], iMqttMessageListenerArr[i4]);
        }
        return subscribeWithResponse;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = 1;
        }
        subscribe(strArr, iArr, iMqttMessageListenerArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str, int i4, IMqttMessageListener iMqttMessageListener) throws MqttException {
        subscribe(new String[]{str}, new int[]{i4}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws MqttException {
        subscribe(strArr, iArr);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            this.aClient.comms.setMessageListener(strArr[i4], iMqttMessageListenerArr[i4]);
        }
    }
}
