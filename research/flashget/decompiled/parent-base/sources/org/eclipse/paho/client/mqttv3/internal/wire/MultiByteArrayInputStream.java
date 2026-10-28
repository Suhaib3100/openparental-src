package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class MultiByteArrayInputStream extends InputStream {
    private byte[] bytesA;
    private byte[] bytesB;
    private int lengthA;
    private int lengthB;
    private int offsetA;
    private int offsetB;
    private int pos = 0;

    public MultiByteArrayInputStream(byte[] bArr, int i4, int i5, byte[] bArr2, int i6, int i7) {
        this.bytesA = bArr;
        this.bytesB = bArr2;
        this.offsetA = i4;
        this.offsetB = i6;
        this.lengthA = i5;
        this.lengthB = i7;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i4;
        int i5 = this.pos;
        int i6 = this.lengthA;
        if (i5 < i6) {
            i4 = this.bytesA[this.offsetA + i5];
        } else {
            if (i5 >= this.lengthB + i6) {
                return -1;
            }
            i4 = this.bytesB[(this.offsetB + i5) - i6];
        }
        if (i4 < 0) {
            i4 += 256;
        }
        this.pos = i5 + 1;
        return i4;
    }
}
