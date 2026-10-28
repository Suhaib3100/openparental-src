package org.eclipse.paho.client.mqttv3.internal;

import java.io.IOException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes5.dex */
public class SSLNetworkModule extends TCPNetworkModule {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.internal.SSLNetworkModule";
    private static final Logger log = LoggerFactory.getLogger("org.eclipse.paho.client.mqttv3.internal.nls.logcat", SSLNetworkModule.class.getName());
    private String[] enabledCiphers;
    private int handshakeTimeoutSecs;
    private String host;
    private HostnameVerifier hostnameVerifier;
    private int port;

    public SSLNetworkModule(SSLSocketFactory sSLSocketFactory, String str, int i4, String str2) {
        super(sSLSocketFactory, str, i4, str2);
        this.host = str;
        this.port = i4;
        log.setResourceName(str2);
    }

    public String[] getEnabledCiphers() {
        return this.enabledCiphers;
    }

    public HostnameVerifier getSSLHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.TCPNetworkModule, org.eclipse.paho.client.mqttv3.internal.NetworkModule
    public String getServerURI() {
        return "ssl://" + this.host + ":" + this.port;
    }

    public void setEnabledCiphers(String[] strArr) {
        this.enabledCiphers = strArr;
        if (this.socket == null || strArr == null) {
            return;
        }
        if (log.isLoggable(5)) {
            String str = "";
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (i4 > 0) {
                    str = String.valueOf(str).concat(",");
                }
                str = String.valueOf(str) + strArr[i4];
            }
            log.fine(CLASS_NAME, "setEnabledCiphers", "260", new Object[]{str});
        }
        ((SSLSocket) this.socket).setEnabledCipherSuites(strArr);
    }

    public void setSSLHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setSSLhandshakeTimeout(int i4) {
        super.setConnectTimeout(i4);
        this.handshakeTimeoutSecs = i4;
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.TCPNetworkModule, org.eclipse.paho.client.mqttv3.internal.NetworkModule
    public void start() throws IOException, MqttException {
        super.start();
        setEnabledCiphers(this.enabledCiphers);
        int soTimeout = this.socket.getSoTimeout();
        this.socket.setSoTimeout(this.handshakeTimeoutSecs * 1000);
        ((SSLSocket) this.socket).startHandshake();
        if (this.hostnameVerifier != null) {
            this.hostnameVerifier.verify(this.host, ((SSLSocket) this.socket).getSession());
        }
        this.socket.setSoTimeout(soTimeout);
    }
}
