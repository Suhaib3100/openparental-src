package org.eclipse.paho.client.mqttv3;

import androidx.constraintlayout.core.motion.key.c;
import java.util.Timer;
import java.util.TimerTask;
import org.eclipse.paho.client.mqttv3.internal.ClientComms;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes5.dex */
public class TimerPingSender implements MqttPingSender {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.TimerPingSender";
    private static final Logger log = LoggerFactory.getLogger("org.eclipse.paho.client.mqttv3.internal.nls.logcat", TimerPingSender.class.getName());
    private ClientComms comms;
    private Timer timer;

    private class PingTask extends TimerTask {
        private static final String methodName = "PingTask.run";

        private PingTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            TimerPingSender.log.fine(TimerPingSender.CLASS_NAME, "PingTask.run", "660", new Object[]{new Long(System.currentTimeMillis())});
            TimerPingSender.this.comms.checkForActivity();
        }

        /* synthetic */ PingTask(TimerPingSender timerPingSender, PingTask pingTask) {
            this();
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void init(ClientComms clientComms) {
        if (clientComms == null) {
            throw new IllegalArgumentException("ClientComms cannot be null.");
        }
        this.comms = clientComms;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void schedule(long j4) {
        this.timer.schedule(new PingTask(this, null), j4);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void start() {
        String clientId = this.comms.getClient().getClientId();
        log.fine(CLASS_NAME, "start", "659", new Object[]{clientId});
        Timer timer = new Timer(c.a("MQTT Ping: ", clientId));
        this.timer = timer;
        timer.schedule(new PingTask(this, null), this.comms.getKeepAlive());
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPingSender
    public void stop() {
        log.fine(CLASS_NAME, "stop", "661", null);
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
    }
}
