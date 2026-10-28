package org.eclipse.paho.client.mqttv3.internal.wire;

/* loaded from: classes5.dex */
public class MultiByteInteger {
    private int length;
    private long value;

    public MultiByteInteger(long j4) {
        this(j4, -1);
    }

    public int getEncodedLength() {
        return this.length;
    }

    public long getValue() {
        return this.value;
    }

    public MultiByteInteger(long j4, int i4) {
        this.value = j4;
        this.length = i4;
    }
}
