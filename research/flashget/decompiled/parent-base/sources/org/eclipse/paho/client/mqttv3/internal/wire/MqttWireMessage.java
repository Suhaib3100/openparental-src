package org.eclipse.paho.client.mqttv3.internal.wire;

import com.google.common.base.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.internal.ExceptionHelper;

/* loaded from: classes5.dex */
public abstract class MqttWireMessage {
    public static final byte MESSAGE_TYPE_CONNACK = 2;
    public static final byte MESSAGE_TYPE_CONNECT = 1;
    public static final byte MESSAGE_TYPE_DISCONNECT = 14;
    public static final byte MESSAGE_TYPE_PINGREQ = 12;
    public static final byte MESSAGE_TYPE_PINGRESP = 13;
    public static final byte MESSAGE_TYPE_PUBACK = 4;
    public static final byte MESSAGE_TYPE_PUBCOMP = 7;
    public static final byte MESSAGE_TYPE_PUBLISH = 3;
    public static final byte MESSAGE_TYPE_PUBREC = 5;
    public static final byte MESSAGE_TYPE_PUBREL = 6;
    public static final byte MESSAGE_TYPE_SUBACK = 9;
    public static final byte MESSAGE_TYPE_SUBSCRIBE = 8;
    public static final byte MESSAGE_TYPE_UNSUBACK = 11;
    public static final byte MESSAGE_TYPE_UNSUBSCRIBE = 10;
    protected boolean duplicate = false;
    protected int msgId = 0;
    private byte type;
    protected static final String STRING_ENCODING = "UTF-8";
    private static final String[] PACKET_NAMES = {"reserved", "CONNECT", "CONNACK", "PUBLISH", "PUBACK", "PUBREC", "PUBREL", "PUBCOMP", "SUBSCRIBE", "SUBACK", "UNSUBSCRIBE", "UNSUBACK", "PINGREQ", "PINGRESP", "DISCONNECT"};

    public MqttWireMessage(byte b5) {
        this.type = b5;
    }

    public static MqttWireMessage createWireMessage(MqttPersistable mqttPersistable) throws MqttException {
        byte[] payloadBytes = mqttPersistable.getPayloadBytes();
        if (payloadBytes == null) {
            payloadBytes = new byte[0];
        }
        return createWireMessage(new MultiByteArrayInputStream(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength(), payloadBytes, mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength()));
    }

    protected static byte[] encodeMBI(long j4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        do {
            byte b5 = (byte) (j4 % 128);
            j4 /= 128;
            if (j4 > 0) {
                b5 = (byte) (b5 | 128);
            }
            byteArrayOutputStream.write(b5);
            i4++;
            if (j4 <= 0) {
                break;
            }
        } while (i4 < 4);
        return byteArrayOutputStream.toByteArray();
    }

    protected static MultiByteInteger readMBI(DataInputStream dataInputStream) throws IOException {
        long j4 = 0;
        int i4 = 0;
        int i5 = 1;
        do {
            i4++;
            j4 += (r5 & Byte.MAX_VALUE) * i5;
            i5 *= 128;
        } while ((dataInputStream.readByte() & 128) != 0);
        return new MultiByteInteger(j4, i4);
    }

    protected String decodeUTF8(DataInputStream dataInputStream) throws MqttException {
        try {
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            return new String(bArr, "UTF-8");
        } catch (IOException e4) {
            throw new MqttException(e4);
        }
    }

    protected byte[] encodeMessageId() throws MqttException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.msgId);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new MqttException(e4);
        }
    }

    protected void encodeUTF8(DataOutputStream dataOutputStream, String str) throws MqttException {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            byte length = (byte) ((bytes.length >>> 8) & 255);
            byte length2 = (byte) (bytes.length & 255);
            dataOutputStream.write(length);
            dataOutputStream.write(length2);
            dataOutputStream.write(bytes);
        } catch (UnsupportedEncodingException e4) {
            throw new MqttException(e4);
        } catch (IOException e5) {
            throw new MqttException(e5);
        }
    }

    public byte[] getHeader() throws MqttException {
        try {
            int type = ((getType() & c.f54871q) << 4) ^ (getMessageInfo() & c.f54871q);
            byte[] variableHeader = getVariableHeader();
            int length = variableHeader.length + getPayload().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(type);
            dataOutputStream.write(encodeMBI(length));
            dataOutputStream.write(variableHeader);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            throw new MqttException(e4);
        }
    }

    public String getKey() {
        return new Integer(getMessageId()).toString();
    }

    public int getMessageId() {
        return this.msgId;
    }

    protected abstract byte getMessageInfo();

    public byte[] getPayload() throws MqttException {
        return new byte[0];
    }

    public byte getType() {
        return this.type;
    }

    protected abstract byte[] getVariableHeader() throws MqttException;

    public boolean isMessageIdRequired() {
        return true;
    }

    public boolean isRetryable() {
        return false;
    }

    public void setDuplicate(boolean z4) {
        this.duplicate = z4;
    }

    public void setMessageId(int i4) {
        this.msgId = i4;
    }

    public String toString() {
        return PACKET_NAMES[this.type];
    }

    public static MqttWireMessage createWireMessage(byte[] bArr) throws MqttException {
        return createWireMessage(new ByteArrayInputStream(bArr));
    }

    private static MqttWireMessage createWireMessage(InputStream inputStream) throws MqttException {
        try {
            DataInputStream dataInputStream = new DataInputStream(new CountingInputStream(inputStream));
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            byte b5 = (byte) (readUnsignedByte >> 4);
            byte b6 = (byte) (readUnsignedByte & 15);
            long counter = (r0.getCounter() + readMBI(dataInputStream).getValue()) - r0.getCounter();
            byte[] bArr = new byte[0];
            if (counter > 0) {
                int i4 = (int) counter;
                byte[] bArr2 = new byte[i4];
                dataInputStream.readFully(bArr2, 0, i4);
                bArr = bArr2;
            }
            if (b5 == 1) {
                return new MqttConnect(b6, bArr);
            }
            if (b5 == 3) {
                return new MqttPublish(b6, bArr);
            }
            if (b5 == 4) {
                return new MqttPubAck(b6, bArr);
            }
            if (b5 == 7) {
                return new MqttPubComp(b6, bArr);
            }
            if (b5 == 2) {
                return new MqttConnack(b6, bArr);
            }
            if (b5 == 12) {
                return new MqttPingReq(b6, bArr);
            }
            if (b5 == 13) {
                return new MqttPingResp(b6, bArr);
            }
            if (b5 == 8) {
                return new MqttSubscribe(b6, bArr);
            }
            if (b5 == 9) {
                return new MqttSuback(b6, bArr);
            }
            if (b5 == 10) {
                return new MqttUnsubscribe(b6, bArr);
            }
            if (b5 == 11) {
                return new MqttUnsubAck(b6, bArr);
            }
            if (b5 == 6) {
                return new MqttPubRel(b6, bArr);
            }
            if (b5 == 5) {
                return new MqttPubRec(b6, bArr);
            }
            if (b5 == 14) {
                return new MqttDisconnect(b6, bArr);
            }
            throw ExceptionHelper.createMqttException(6);
        } catch (IOException e4) {
            throw new MqttException(e4);
        }
    }
}
