package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* compiled from: SipHashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
final class h0 extends c implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final q f56955f = new h0(2, 4, 506097522914230528L, 1084818905618843912L);

    /* renamed from: g, reason: collision with root package name */
    private static final long f56956g = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f56957b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56958c;

    /* renamed from: d, reason: collision with root package name */
    private final long f56959d;

    /* renamed from: e, reason: collision with root package name */
    private final long f56960e;

    /* compiled from: SipHashFunction.java */
    private static final class a extends f {

        /* renamed from: l, reason: collision with root package name */
        private static final int f56961l = 8;

        /* renamed from: d, reason: collision with root package name */
        private final int f56962d;

        /* renamed from: e, reason: collision with root package name */
        private final int f56963e;

        /* renamed from: f, reason: collision with root package name */
        private long f56964f;

        /* renamed from: g, reason: collision with root package name */
        private long f56965g;

        /* renamed from: h, reason: collision with root package name */
        private long f56966h;

        /* renamed from: i, reason: collision with root package name */
        private long f56967i;

        /* renamed from: j, reason: collision with root package name */
        private long f56968j;

        /* renamed from: k, reason: collision with root package name */
        private long f56969k;

        a(int i4, int i5, long j4, long j5) {
            super(8, 8);
            this.f56968j = 0L;
            this.f56969k = 0L;
            this.f56962d = i4;
            this.f56963e = i5;
            this.f56964f = 8317987319222330741L ^ j4;
            this.f56965g = 7237128888997146477L ^ j5;
            this.f56966h = 7816392313619706465L ^ j4;
            this.f56967i = 8387220255154660723L ^ j5;
        }

        private void v(long j4) {
            this.f56967i ^= j4;
            w(this.f56962d);
            this.f56964f = j4 ^ this.f56964f;
        }

        private void w(int i4) {
            for (int i5 = 0; i5 < i4; i5++) {
                long j4 = this.f56964f;
                long j5 = this.f56965g;
                this.f56964f = j4 + j5;
                this.f56966h += this.f56967i;
                this.f56965g = Long.rotateLeft(j5, 13);
                long rotateLeft = Long.rotateLeft(this.f56967i, 16);
                long j6 = this.f56965g;
                long j7 = this.f56964f;
                this.f56965g = j6 ^ j7;
                this.f56967i = rotateLeft ^ this.f56966h;
                long rotateLeft2 = Long.rotateLeft(j7, 32);
                long j10 = this.f56966h;
                long j11 = this.f56965g;
                this.f56966h = j10 + j11;
                this.f56964f = rotateLeft2 + this.f56967i;
                this.f56965g = Long.rotateLeft(j11, 17);
                long rotateLeft3 = Long.rotateLeft(this.f56967i, 21);
                long j12 = this.f56965g;
                long j13 = this.f56966h;
                this.f56965g = j12 ^ j13;
                this.f56967i = rotateLeft3 ^ this.f56964f;
                this.f56966h = Long.rotateLeft(j13, 32);
            }
        }

        @Override // com.google.common.hash.f
        protected p p() {
            long j4 = this.f56969k ^ (this.f56968j << 56);
            this.f56969k = j4;
            v(j4);
            this.f56966h ^= 255;
            w(this.f56963e);
            return p.j(((this.f56964f ^ this.f56965g) ^ this.f56966h) ^ this.f56967i);
        }

        @Override // com.google.common.hash.f
        protected void s(ByteBuffer byteBuffer) {
            this.f56968j += 8;
            v(byteBuffer.getLong());
        }

        @Override // com.google.common.hash.f
        protected void t(ByteBuffer byteBuffer) {
            this.f56968j += byteBuffer.remaining();
            int i4 = 0;
            while (byteBuffer.hasRemaining()) {
                this.f56969k ^= (byteBuffer.get() & 255) << i4;
                i4 += 8;
            }
        }
    }

    h0(int i4, int i5, long j4, long j5) {
        l0.k(i4 > 0, ProtectedSandApp.s("\uf60c"), i4);
        l0.k(i5 > 0, ProtectedSandApp.s("\uf60d"), i5);
        this.f56957b = i4;
        this.f56958c = i5;
        this.f56959d = j4;
        this.f56960e = j5;
    }

    @Override // com.google.common.hash.q
    public int c() {
        return 64;
    }

    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f56957b == h0Var.f56957b && this.f56958c == h0Var.f56958c && this.f56959d == h0Var.f56959d && this.f56960e == h0Var.f56960e;
    }

    @Override // com.google.common.hash.q
    public r f() {
        return new a(this.f56957b, this.f56958c, this.f56959d, this.f56960e);
    }

    public int hashCode() {
        return (int) ((((h0.class.hashCode() ^ this.f56957b) ^ this.f56958c) ^ this.f56959d) ^ this.f56960e);
    }

    public String toString() {
        int i4 = this.f56957b;
        int i5 = this.f56958c;
        long j4 = this.f56959d;
        long j5 = this.f56960e;
        StringBuilder sb = new StringBuilder(81);
        sb.append(ProtectedSandApp.s("\uf60e"));
        sb.append(i4);
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\uf60f"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("\uf610"));
        sb.append(j5);
        sb.append(ProtectedSandApp.s("\uf611"));
        return sb.toString();
    }
}
