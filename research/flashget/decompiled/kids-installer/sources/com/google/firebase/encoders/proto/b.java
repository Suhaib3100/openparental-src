package com.google.firebase.encoders.proto;

import androidx.annotation.o0;
import java.io.OutputStream;

/* compiled from: LengthCountingOutputStream.java */
/* loaded from: classes2.dex */
final class b extends OutputStream {

    /* renamed from: o, reason: collision with root package name */
    private long f16611o = 0;

    b() {
    }

    long a() {
        return this.f16611o;
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        this.f16611o++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f16611o += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@o0 byte[] bArr, int i5, int i6) {
        int i7;
        if (i5 >= 0 && i5 <= bArr.length && i6 >= 0 && (i7 = i5 + i6) <= bArr.length && i7 >= 0) {
            this.f16611o += i6;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
