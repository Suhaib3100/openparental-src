package com.google.common.hash;

import com.google.common.base.l0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: AbstractHasher.java */
@k
@f9.a
/* loaded from: classes6.dex */
abstract class d implements r {
    d() {
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public final r f(boolean z4) {
        return d(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.r
    public <T> r n(@f0 T t4, n<? super T> nVar) {
        nVar.funnel(t4, this);
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r a(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public final r b(double d5) {
        return h(Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public final r c(float f4) {
        return g(Float.floatToRawIntBits(f4));
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r e(short s4) {
        d((byte) s4);
        d((byte) (s4 >>> 8));
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public g0 f(boolean z4) {
        return d(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r g(int i4) {
        d((byte) i4);
        d((byte) (i4 >>> 8));
        d((byte) (i4 >>> 16));
        d((byte) (i4 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r h(long j4) {
        for (int i4 = 0; i4 < 64; i4 += 8) {
            d((byte) (j4 >>> i4));
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r i(char c5) {
        d((byte) c5);
        d((byte) (c5 >>> '\b'));
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            i(charSequence.charAt(i4));
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r k(byte[] bArr, int i4, int i5) {
        l0.f0(i4, i4 + i5, bArr.length);
        for (int i6 = 0; i6 < i5; i6++) {
            d(bArr[i4 + i6]);
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r l(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            k(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
        } else {
            for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
                d(byteBuffer.get());
            }
        }
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r m(CharSequence charSequence, Charset charset) {
        return a(charSequence.toString().getBytes(charset));
    }
}
