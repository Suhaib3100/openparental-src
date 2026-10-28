package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.internal.ClientState;
import org.eclipse.paho.client.mqttv3.internal.ExceptionHelper;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes5.dex */
public class MqttInputStream extends InputStream {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.internal.wire.MqttInputStream";
    private static final Logger log = LoggerFactory.getLogger("org.eclipse.paho.client.mqttv3.internal.nls.logcat", MqttInputStream.class.getName());
    private ClientState clientState;
    private DataInputStream in;
    private byte[] packet;
    private long packetLen;
    private ByteArrayOutputStream bais = new ByteArrayOutputStream();
    private long remLen = -1;

    public MqttInputStream(ClientState clientState, InputStream inputStream) {
        this.clientState = clientState;
        this.in = new DataInputStream(inputStream);
    }

    private void readFully() throws IOException {
        int size = this.bais.size();
        long j4 = this.packetLen;
        int i4 = size + ((int) j4);
        int i5 = (int) (this.remLen - j4);
        if (i5 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i6 = 0;
        while (i6 < i5) {
            try {
                int read = this.in.read(this.packet, i4 + i6, i5 - i6);
                this.clientState.notifyReceivedBytes(read);
                if (read < 0) {
                    throw new EOFException();
                }
                i6 += read;
            } catch (SocketTimeoutException e4) {
                this.packetLen += i6;
                throw e4;
            }
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.in.read();
    }

    public MqttWireMessage readMqttWireMessage() throws IOException, MqttException {
        try {
            if (this.remLen < 0) {
                this.bais.reset();
                byte readByte = this.in.readByte();
                this.clientState.notifyReceivedBytes(1);
                byte b5 = (byte) ((readByte >>> 4) & 15);
                if (b5 < 1 || b5 > 14) {
                    throw ExceptionHelper.createMqttException(32108);
                }
                this.remLen = MqttWireMessage.readMBI(this.in).getValue();
                this.bais.write(readByte);
                this.bais.write(MqttWireMessage.encodeMBI(this.remLen));
                this.packet = new byte[(int) (this.bais.size() + this.remLen)];
                this.packetLen = 0L;
            }
            if (this.remLen < 0) {
                return null;
            }
            readFully();
            this.remLen = -1L;
            byte[] byteArray = this.bais.toByteArray();
            System.arraycopy(byteArray, 0, this.packet, 0, byteArray.length);
            MqttWireMessage createWireMessage = MqttWireMessage.createWireMessage(this.packet);
            log.fine(CLASS_NAME, "readMqttWireMessage", "501", new Object[]{createWireMessage});
            return createWireMessage;
        } catch (SocketTimeoutException unused) {
            return null;
        }
    }
}
