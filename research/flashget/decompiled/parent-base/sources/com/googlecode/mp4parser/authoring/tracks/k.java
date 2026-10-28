package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: CleanInputStream.java */
/* loaded from: classes6.dex */
public class k extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    int f63712b;

    /* renamed from: c, reason: collision with root package name */
    int f63713c;

    public k(InputStream inputStream) {
        super(inputStream);
        this.f63712b = -1;
        this.f63713c = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read == 3 && this.f63712b == 0 && this.f63713c == 0) {
            this.f63712b = -1;
            this.f63713c = -1;
            read = super.read();
        }
        this.f63712b = this.f63713c;
        this.f63713c = read;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        bArr.getClass();
        if (i4 < 0 || i5 < 0 || i5 > bArr.length - i4) {
            throw new IndexOutOfBoundsException();
        }
        if (i5 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i4] = (byte) read;
        int i6 = 1;
        while (i6 < i5) {
            try {
                int read2 = read();
                if (read2 == -1) {
                    break;
                }
                bArr[i4 + i6] = (byte) read2;
                i6++;
            } catch (IOException unused) {
            }
        }
        return i6;
    }
}
