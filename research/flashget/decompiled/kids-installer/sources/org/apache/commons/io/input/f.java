package org.apache.commons.io.input;

import com.bumptech.glide.load.resource.bitmap.p0;
import java.io.Reader;
import java.io.Serializable;

/* compiled from: CharSequenceReader.java */
/* loaded from: classes5.dex */
public class f extends Reader implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final CharSequence f31941o;

    /* renamed from: p, reason: collision with root package name */
    private int f31942p;

    /* renamed from: q, reason: collision with root package name */
    private int f31943q;

    public f(String str) {
        this.f31941o = str == null ? "" : str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31942p = 0;
        this.f31943q = 0;
    }

    @Override // java.io.Reader
    public void mark(int i5) {
        this.f31943q = this.f31942p;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.f31942p >= this.f31941o.length()) {
            return -1;
        }
        CharSequence charSequence = this.f31941o;
        int i5 = this.f31942p;
        this.f31942p = i5 + 1;
        return charSequence.charAt(i5);
    }

    @Override // java.io.Reader
    public void reset() {
        this.f31942p = this.f31943q;
    }

    @Override // java.io.Reader
    public long skip(long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(p0.a("Number of characters to skip is less than zero: ", j5));
        }
        if (this.f31942p >= this.f31941o.length()) {
            return -1L;
        }
        int min = (int) Math.min(this.f31941o.length(), this.f31942p + j5);
        int i5 = min - this.f31942p;
        this.f31942p = min;
        return i5;
    }

    public String toString() {
        return this.f31941o.toString();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i5, int i6) {
        if (this.f31942p >= this.f31941o.length()) {
            return -1;
        }
        if (cArr != null) {
            if (i6 < 0 || i5 < 0 || i5 + i6 > cArr.length) {
                throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i5 + ", length=" + i6);
            }
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                int read = read();
                if (read == -1) {
                    return i7;
                }
                cArr[i5 + i8] = (char) read;
                i7++;
            }
            return i7;
        }
        throw new NullPointerException("Character array is missing");
    }
}
