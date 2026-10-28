package com.google.common.hash;

import com.google.common.base.l0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AbstractByteHasher.java */
@k
@f9.a
/* loaded from: classes6.dex */
abstract class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f56890a = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    a() {
    }

    private r p(int i4) {
        try {
            t(this.f56890a.array(), 0, i4);
            return this;
        } finally {
            this.f56890a.clear();
        }
    }

    protected abstract void q(byte b5);

    protected void r(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            t(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            q(byteBuffer.get());
        }
    }

    protected void s(byte[] bArr) {
        t(bArr, 0, bArr.length);
    }

    protected void t(byte[] bArr, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            q(bArr[i6]);
        }
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public r a(byte[] bArr) {
        bArr.getClass();
        s(bArr);
        return this;
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public r d(byte b5) {
        q(b5);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public r e(short s4) {
        this.f56890a.putShort(s4);
        return p(2);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public r g(int i4) {
        this.f56890a.putInt(i4);
        return p(4);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public r h(long j4) {
        this.f56890a.putLong(j4);
        return p(8);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public r i(char c5) {
        this.f56890a.putChar(c5);
        return p(2);
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public r k(byte[] bArr, int i4, int i5) {
        l0.f0(i4, i4 + i5, bArr.length);
        t(bArr, i4, i5);
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public r l(ByteBuffer byteBuffer) {
        r(byteBuffer);
        return this;
    }
}
