package com.google.common.hash;

import com.google.common.base.l0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: AbstractStreamingHasher.java */
@k
@f9.a
/* loaded from: classes6.dex */
abstract class f extends d {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f56940a;

    /* renamed from: b, reason: collision with root package name */
    private final int f56941b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56942c;

    protected f(int i4, int i5) {
        l0.d(i5 % i4 == 0);
        this.f56940a = ByteBuffer.allocate(i5 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f56941b = i5;
        this.f56942c = i4;
    }

    private void q() {
        this.f56940a.flip();
        while (this.f56940a.remaining() >= this.f56942c) {
            s(this.f56940a);
        }
        this.f56940a.compact();
    }

    private void r() {
        if (this.f56940a.remaining() < 8) {
            q();
        }
    }

    private r u(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f56940a.remaining()) {
            this.f56940a.put(byteBuffer);
            r();
            return this;
        }
        int position = this.f56941b - this.f56940a.position();
        for (int i4 = 0; i4 < position; i4++) {
            this.f56940a.put(byteBuffer.get());
        }
        q();
        while (byteBuffer.remaining() >= this.f56942c) {
            s(byteBuffer);
        }
        this.f56940a.put(byteBuffer);
        return this;
    }

    @Override // com.google.common.hash.r
    public final p o() {
        q();
        this.f56940a.flip();
        if (this.f56940a.remaining() > 0) {
            t(this.f56940a);
            ByteBuffer byteBuffer = this.f56940a;
            byteBuffer.position(byteBuffer.limit());
        }
        return p();
    }

    protected abstract p p();

    protected abstract void s(ByteBuffer byteBuffer);

    protected void t(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(this.f56942c + 7);
        while (true) {
            int position = byteBuffer.position();
            int i4 = this.f56942c;
            if (position >= i4) {
                byteBuffer.limit(i4);
                byteBuffer.flip();
                s(byteBuffer);
                return;
            }
            byteBuffer.putLong(0L);
        }
    }

    @Override // com.google.common.hash.r, com.google.common.hash.g0
    public final r d(byte b5) {
        this.f56940a.put(b5);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public final r e(short s4) {
        this.f56940a.putShort(s4);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public final r g(int i4) {
        this.f56940a.putInt(i4);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public final r h(long j4) {
        this.f56940a.putLong(j4);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public final r i(char c5) {
        this.f56940a.putChar(c5);
        r();
        return this;
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public final r k(byte[] bArr, int i4, int i5) {
        return u(ByteBuffer.wrap(bArr, i4, i5).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
    public final r l(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return u(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }

    protected f(int i4) {
        this(i4, i4);
    }
}
