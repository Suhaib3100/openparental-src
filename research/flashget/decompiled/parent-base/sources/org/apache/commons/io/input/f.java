package org.apache.commons.io.input;

import androidx.collection.p0;
import java.io.Reader;
import java.io.Serializable;

/* compiled from: CharSequenceReader.java */
/* loaded from: classes4.dex */
public class f extends Reader implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f85458b;

    /* renamed from: c, reason: collision with root package name */
    private int f85459c;

    /* renamed from: d, reason: collision with root package name */
    private int f85460d;

    public f(String str) {
        this.f85458b = str == null ? "" : str;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f85459c = 0;
        this.f85460d = 0;
    }

    @Override // java.io.Reader
    public void mark(int i4) {
        this.f85460d = this.f85459c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public int read() {
        if (this.f85459c >= this.f85458b.length()) {
            return -1;
        }
        CharSequence charSequence = this.f85458b;
        int i4 = this.f85459c;
        this.f85459c = i4 + 1;
        return charSequence.charAt(i4);
    }

    @Override // java.io.Reader
    public void reset() {
        this.f85459c = this.f85460d;
    }

    @Override // java.io.Reader
    public long skip(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(p0.a("Number of characters to skip is less than zero: ", j4));
        }
        if (this.f85459c >= this.f85458b.length()) {
            return -1L;
        }
        int min = (int) Math.min(this.f85458b.length(), this.f85459c + j4);
        int i4 = min - this.f85459c;
        this.f85459c = min;
        return i4;
    }

    public String toString() {
        return this.f85458b.toString();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i4, int i5) {
        if (this.f85459c >= this.f85458b.length()) {
            return -1;
        }
        if (cArr != null) {
            if (i5 < 0 || i4 < 0 || i4 + i5 > cArr.length) {
                StringBuilder sb = new StringBuilder("Array Size=");
                androidx.paging.l.a(sb, cArr.length, ", offset=", i4, ", length=");
                sb.append(i5);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                int read = read();
                if (read == -1) {
                    return i6;
                }
                cArr[i4 + i7] = (char) read;
                i6++;
            }
            return i6;
        }
        throw new NullPointerException("Character array is missing");
    }
}
