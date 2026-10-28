package org.eclipse.paho.client.mqttv3;

/* loaded from: classes5.dex */
public class MqttMessage {
    private int messageId;
    private byte[] payload;
    private boolean mutable = true;
    private int qos = 1;
    private boolean retained = false;
    private boolean dup = false;

    public MqttMessage() {
        setPayload(new byte[0]);
    }

    public static void validateQos(int i4) {
        if (i4 < 0 || i4 > 2) {
            throw new IllegalArgumentException();
        }
    }

    protected void checkMutable() throws IllegalStateException {
        if (!this.mutable) {
            throw new IllegalStateException();
        }
    }

    public void clearPayload() {
        checkMutable();
        this.payload = new byte[0];
    }

    public int getId() {
        return this.messageId;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public int getQos() {
        return this.qos;
    }

    public boolean isDuplicate() {
        return this.dup;
    }

    public boolean isRetained() {
        return this.retained;
    }

    protected void setDuplicate(boolean z4) {
        this.dup = z4;
    }

    public void setId(int i4) {
        this.messageId = i4;
    }

    protected void setMutable(boolean z4) {
        this.mutable = z4;
    }

    public void setPayload(byte[] bArr) {
        checkMutable();
        bArr.getClass();
        this.payload = bArr;
    }

    public void setQos(int i4) {
        checkMutable();
        validateQos(i4);
        this.qos = i4;
    }

    public void setRetained(boolean z4) {
        checkMutable();
        this.retained = z4;
    }

    public String toString() {
        return new String(this.payload);
    }

    public MqttMessage(byte[] bArr) {
        setPayload(bArr);
    }
}
