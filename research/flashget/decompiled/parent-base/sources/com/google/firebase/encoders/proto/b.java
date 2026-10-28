package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes6.dex */
final class b extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    private long f59632b = 0;

    b() {
    }

    long a() {
        return this.f59632b;
    }

    @Override // java.io.OutputStream
    public void write(int i4) {
        this.f59632b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f59632b += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@o0 byte[] bArr, int i4, int i5) {
        int i6;
        if (i4 >= 0 && i4 <= bArr.length && i5 >= 0 && (i6 = i4 + i5) <= bArr.length && i6 >= 0) {
            this.f59632b += i5;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
