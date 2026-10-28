package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: Murmur3_128HashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
final class d0 extends c implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    static final q f56914c = new d0(0);

    /* renamed from: d, reason: collision with root package name */
    static final q f56915d = new d0(s.f57033a);

    /* renamed from: e, reason: collision with root package name */
    private static final long f56916e = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f56917b;

    /* compiled from: Murmur3_128HashFunction.java */
    private static final class a extends f {

        /* renamed from: g, reason: collision with root package name */
        private static final int f56918g = 16;

        /* renamed from: h, reason: collision with root package name */
        private static final long f56919h = -8663945395140668459L;

        /* renamed from: i, reason: collision with root package name */
        private static final long f56920i = 5545529020109919103L;

        /* renamed from: d, reason: collision with root package name */
        private long f56921d;

        /* renamed from: e, reason: collision with root package name */
        private long f56922e;

        /* renamed from: f, reason: collision with root package name */
        private int f56923f;

        a(int i4) {
            super(16, 16);
            long j4 = i4;
            this.f56921d = j4;
            this.f56922e = j4;
            this.f56923f = 0;
        }

        private void v(long j4, long j5) {
            long x4 = x(j4) ^ this.f56921d;
            this.f56921d = x4;
            long rotateLeft = Long.rotateLeft(x4, 27);
            long j6 = this.f56922e;
            this.f56921d = ((rotateLeft + j6) * 5) + 1390208809;
            long y4 = y(j5) ^ j6;
            this.f56922e = y4;
            this.f56922e = ((Long.rotateLeft(y4, 31) + this.f56921d) * 5) + 944331445;
        }

        private static long w(long j4) {
            long j5 = (j4 ^ (j4 >>> 33)) * (-49064778989728563L);
            long j6 = (j5 ^ (j5 >>> 33)) * (-4265267296055464877L);
            return j6 ^ (j6 >>> 33);
        }

        private static long x(long j4) {
            return Long.rotateLeft(j4 * f56919h, 31) * f56920i;
        }

        private static long y(long j4) {
            return Long.rotateLeft(j4 * f56920i, 33) * f56919h;
        }

        @Override // com.google.common.hash.f
        protected p p() {
            long j4 = this.f56921d;
            int i4 = this.f56923f;
            long j5 = j4 ^ i4;
            long j6 = this.f56922e ^ i4;
            long j7 = j5 + j6;
            this.f56921d = j7;
            this.f56922e = j6 + j7;
            this.f56921d = w(j7);
            long w4 = w(this.f56922e);
            long j10 = this.f56921d + w4;
            this.f56921d = j10;
            this.f56922e = w4 + j10;
            return p.h(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f56921d).putLong(this.f56922e).array());
        }

        @Override // com.google.common.hash.f
        protected void s(ByteBuffer byteBuffer) {
            v(byteBuffer.getLong(), byteBuffer.getLong());
            this.f56923f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.f
        protected void t(ByteBuffer byteBuffer) {
            long j4;
            long j5;
            long j6;
            long j7;
            long j10;
            long j11;
            long j12;
            this.f56923f = byteBuffer.remaining() + this.f56923f;
            long j13 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j4 = 0;
                    j12 = j4 ^ (byteBuffer.get(0) & 255);
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 2:
                    j5 = 0;
                    j4 = j5 ^ ((byteBuffer.get(1) & 255) << 8);
                    j12 = j4 ^ (byteBuffer.get(0) & 255);
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 3:
                    j6 = 0;
                    j5 = ((byteBuffer.get(2) & 255) << 16) ^ j6;
                    j4 = j5 ^ ((byteBuffer.get(1) & 255) << 8);
                    j12 = j4 ^ (byteBuffer.get(0) & 255);
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 4:
                    j7 = 0;
                    j6 = j7 ^ ((byteBuffer.get(3) & 255) << 24);
                    j5 = ((byteBuffer.get(2) & 255) << 16) ^ j6;
                    j4 = j5 ^ ((byteBuffer.get(1) & 255) << 8);
                    j12 = j4 ^ (byteBuffer.get(0) & 255);
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 5:
                    j10 = 0;
                    j7 = j10 ^ ((byteBuffer.get(4) & 255) << 32);
                    j6 = j7 ^ ((byteBuffer.get(3) & 255) << 24);
                    j5 = ((byteBuffer.get(2) & 255) << 16) ^ j6;
                    j4 = j5 ^ ((byteBuffer.get(1) & 255) << 8);
                    j12 = j4 ^ (byteBuffer.get(0) & 255);
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 6:
                    j11 = 0;
                    j10 = ((byteBuffer.get(5) & 255) << 40) ^ j11;
                    j7 = j10 ^ ((byteBuffer.get(4) & 255) << 32);
                    j6 = j7 ^ ((byteBuffer.get(3) & 255) << 24);
                    j5 = ((byteBuffer.get(2) & 255) << 16) ^ j6;
                    j4 = j5 ^ ((byteBuffer.get(1) & 255) << 8);
                    j12 = j4 ^ (byteBuffer.get(0) & 255);
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 7:
                    j11 = (byteBuffer.get(6) & 255) << 48;
                    j10 = ((byteBuffer.get(5) & 255) << 40) ^ j11;
                    j7 = j10 ^ ((byteBuffer.get(4) & 255) << 32);
                    j6 = j7 ^ ((byteBuffer.get(3) & 255) << 24);
                    j5 = ((byteBuffer.get(2) & 255) << 16) ^ j6;
                    j4 = j5 ^ ((byteBuffer.get(1) & 255) << 8);
                    j12 = j4 ^ (byteBuffer.get(0) & 255);
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 8:
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 9:
                    j13 ^= byteBuffer.get(8) & 255;
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 10:
                    j13 ^= (byteBuffer.get(9) & 255) << 8;
                    j13 ^= byteBuffer.get(8) & 255;
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 11:
                    j13 ^= (byteBuffer.get(10) & 255) << 16;
                    j13 ^= (byteBuffer.get(9) & 255) << 8;
                    j13 ^= byteBuffer.get(8) & 255;
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 12:
                    j13 ^= (byteBuffer.get(11) & 255) << 24;
                    j13 ^= (byteBuffer.get(10) & 255) << 16;
                    j13 ^= (byteBuffer.get(9) & 255) << 8;
                    j13 ^= byteBuffer.get(8) & 255;
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 13:
                    j13 ^= (byteBuffer.get(12) & 255) << 32;
                    j13 ^= (byteBuffer.get(11) & 255) << 24;
                    j13 ^= (byteBuffer.get(10) & 255) << 16;
                    j13 ^= (byteBuffer.get(9) & 255) << 8;
                    j13 ^= byteBuffer.get(8) & 255;
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 14:
                    j13 ^= (byteBuffer.get(13) & 255) << 40;
                    j13 ^= (byteBuffer.get(12) & 255) << 32;
                    j13 ^= (byteBuffer.get(11) & 255) << 24;
                    j13 ^= (byteBuffer.get(10) & 255) << 16;
                    j13 ^= (byteBuffer.get(9) & 255) << 8;
                    j13 ^= byteBuffer.get(8) & 255;
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                case 15:
                    j13 = (byteBuffer.get(14) & 255) << 48;
                    j13 ^= (byteBuffer.get(13) & 255) << 40;
                    j13 ^= (byteBuffer.get(12) & 255) << 32;
                    j13 ^= (byteBuffer.get(11) & 255) << 24;
                    j13 ^= (byteBuffer.get(10) & 255) << 16;
                    j13 ^= (byteBuffer.get(9) & 255) << 8;
                    j13 ^= byteBuffer.get(8) & 255;
                    j12 = byteBuffer.getLong();
                    this.f56921d = x(j12) ^ this.f56921d;
                    this.f56922e ^= y(j13);
                    return;
                default:
                    throw new AssertionError(ProtectedSandApp.s("\uf5f2"));
            }
        }
    }

    d0(int i4) {
        this.f56917b = i4;
    }

    @Override // com.google.common.hash.q
    public int c() {
        return 128;
    }

    public boolean equals(@zc.a Object obj) {
        return (obj instanceof d0) && this.f56917b == ((d0) obj).f56917b;
    }

    @Override // com.google.common.hash.q
    public r f() {
        return new a(this.f56917b);
    }

    public int hashCode() {
        return d0.class.hashCode() ^ this.f56917b;
    }

    public String toString() {
        int i4 = this.f56917b;
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("\uf5f3"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf5f4"));
        return sb.toString();
    }
}
