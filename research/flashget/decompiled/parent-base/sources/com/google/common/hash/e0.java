package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: Murmur3_32HashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
final class e0 extends c implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final q f56926d = new e0(0, false);

    /* renamed from: e, reason: collision with root package name */
    static final q f56927e = new e0(0, true);

    /* renamed from: f, reason: collision with root package name */
    static final q f56928f = new e0(s.f57033a, true);

    /* renamed from: g, reason: collision with root package name */
    private static final int f56929g = 4;

    /* renamed from: h, reason: collision with root package name */
    private static final int f56930h = -862048943;

    /* renamed from: i, reason: collision with root package name */
    private static final int f56931i = 461845907;

    /* renamed from: j, reason: collision with root package name */
    private static final long f56932j = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f56933b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f56934c;

    /* compiled from: Murmur3_32HashFunction.java */
    @f9.a
    private static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private int f56935a;

        /* renamed from: b, reason: collision with root package name */
        private long f56936b;

        /* renamed from: c, reason: collision with root package name */
        private int f56937c;

        /* renamed from: d, reason: collision with root package name */
        private int f56938d = 0;

        /* renamed from: e, reason: collision with root package name */
        private boolean f56939e = false;

        a(int i4) {
            this.f56935a = i4;
        }

        private void p(int i4, long j4) {
            long j5 = this.f56936b;
            int i5 = this.f56937c;
            long j6 = ((j4 & 4294967295L) << i5) | j5;
            this.f56936b = j6;
            int i6 = (i4 * 8) + i5;
            this.f56937c = i6;
            this.f56938d += i4;
            if (i6 >= 32) {
                this.f56935a = e0.x(this.f56935a, e0.y((int) j6));
                this.f56936b >>>= 32;
                this.f56937c -= 32;
            }
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r g(int i4) {
            p(4, i4);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r i(char c5) {
            p(2, c5);
            return this;
        }

        @Override // com.google.common.hash.r
        public p o() {
            l0.g0(!this.f56939e);
            this.f56939e = true;
            int y4 = this.f56935a ^ e0.y((int) this.f56936b);
            this.f56935a = y4;
            return e0.v(y4, this.f56938d);
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r d(byte b5) {
            p(1, b5 & 255);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public g0 g(int i4) {
            p(4, i4);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r h(long j4) {
            p(4, (int) j4);
            p(4, j4 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public g0 i(char c5) {
            p(2, c5);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r k(byte[] bArr, int i4, int i5) {
            l0.f0(i4, i4 + i5, bArr.length);
            int i6 = 0;
            while (true) {
                int i7 = i6 + 4;
                if (i7 > i5) {
                    break;
                }
                p(4, e0.w(bArr, i6 + i4));
                i6 = i7;
            }
            while (i6 < i5) {
                d(bArr[i4 + i6]);
                i6++;
            }
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r l(ByteBuffer byteBuffer) {
            ByteOrder order = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                g(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                d(byteBuffer.get());
            }
            byteBuffer.order(order);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r m(CharSequence charSequence, Charset charset) {
            if (!com.google.common.base.j.f54949c.equals(charset)) {
                return super.m(charSequence, charset);
            }
            int length = charSequence.length();
            int i4 = 0;
            while (true) {
                int i5 = i4 + 4;
                if (i5 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i4);
                char charAt2 = charSequence.charAt(i4 + 1);
                char charAt3 = charSequence.charAt(i4 + 2);
                char charAt4 = charSequence.charAt(i4 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                p(4, (charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24));
                i4 = i5;
            }
            while (i4 < length) {
                char charAt5 = charSequence.charAt(i4);
                if (charAt5 < 128) {
                    p(1, charAt5);
                } else if (charAt5 < 2048) {
                    p(2, e0.t(charAt5));
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    p(3, e0.s(charAt5));
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i4);
                    if (codePointAt == charAt5) {
                        a(charSequence.subSequence(i4, length).toString().getBytes(charset));
                        return this;
                    }
                    i4++;
                    p(4, e0.u(codePointAt));
                }
                i4++;
            }
            return this;
        }
    }

    e0(int i4, boolean z4) {
        this.f56933b = i4;
        this.f56934c = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long s(char c5) {
        return (c5 >>> '\f') | 224 | ((((c5 >>> 6) & 63) | 128) << 8) | (((c5 & '?') | 128) << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long t(char c5) {
        return (c5 >>> 6) | 192 | (((c5 & '?') | 128) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long u(int i4) {
        return (i4 >>> 18) | 240 | ((((i4 >>> 12) & 63) | 128) << 8) | ((((i4 >>> 6) & 63) | 128) << 16) | (((i4 & 63) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p v(int i4, int i5) {
        int i6 = i4 ^ i5;
        int i7 = (i6 ^ (i6 >>> 16)) * (-2048144789);
        int i10 = (i7 ^ (i7 >>> 13)) * (-1028477387);
        return p.i(i10 ^ (i10 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(byte[] bArr, int i4) {
        return com.google.common.primitives.l.k(bArr[i4 + 3], bArr[i4 + 2], bArr[i4 + 1], bArr[i4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(int i4, int i5) {
        return (Integer.rotateLeft(i4 ^ i5, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(int i4) {
        return Integer.rotateLeft(i4 * (-862048943), 15) * f56931i;
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p a(CharSequence charSequence, Charset charset) {
        if (!com.google.common.base.j.f54949c.equals(charset)) {
            byte[] bytes = charSequence.toString().getBytes(charset);
            return k(bytes, 0, bytes.length);
        }
        int length = charSequence.length();
        int i4 = this.f56933b;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = i5 + 4;
            if (i7 > length) {
                break;
            }
            char charAt = charSequence.charAt(i5);
            char charAt2 = charSequence.charAt(i5 + 1);
            char charAt3 = charSequence.charAt(i5 + 2);
            char charAt4 = charSequence.charAt(i5 + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            i4 = x(i4, y((charAt2 << '\b') | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i6 += 4;
            i5 = i7;
        }
        long j4 = 0;
        int i10 = 0;
        while (i5 < length) {
            char charAt5 = charSequence.charAt(i5);
            if (charAt5 < 128) {
                j4 |= charAt5 << i10;
                i10 += 8;
                i6++;
            } else if (charAt5 < 2048) {
                j4 |= t(charAt5) << i10;
                i10 += 16;
                i6 += 2;
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                j4 |= s(charAt5) << i10;
                i10 += 24;
                i6 += 3;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i5);
                if (codePointAt == charAt5) {
                    byte[] bytes2 = charSequence.toString().getBytes(charset);
                    return k(bytes2, 0, bytes2.length);
                }
                i5++;
                j4 |= u(codePointAt) << i10;
                if (this.f56934c) {
                    i10 += 32;
                }
                i6 += 4;
            }
            if (i10 >= 32) {
                i4 = x(i4, y((int) j4));
                j4 >>>= 32;
                i10 -= 32;
            }
            i5++;
        }
        return v(y((int) j4) ^ i4, i6);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p b(CharSequence charSequence) {
        int i4 = this.f56933b;
        for (int i5 = 1; i5 < charSequence.length(); i5 += 2) {
            i4 = x(i4, y(charSequence.charAt(i5 - 1) | (charSequence.charAt(i5) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i4 ^= y(charSequence.charAt(charSequence.length() - 1));
        }
        return v(i4, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.q
    public int c() {
        return 32;
    }

    public boolean equals(@zc.a Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f56933b == e0Var.f56933b && this.f56934c == e0Var.f56934c;
    }

    @Override // com.google.common.hash.q
    public r f() {
        return new a(this.f56933b);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p g(int i4) {
        return v(x(this.f56933b, y(i4)), 4);
    }

    public int hashCode() {
        return e0.class.hashCode() ^ this.f56933b;
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p j(long j4) {
        return v(x(x(this.f56933b, y((int) j4)), y((int) (j4 >>> 32))), 8);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p k(byte[] bArr, int i4, int i5) {
        l0.f0(i4, i4 + i5, bArr.length);
        int i6 = this.f56933b;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int i11 = i10 + 4;
            if (i11 > i5) {
                break;
            }
            i6 = x(i6, y(w(bArr, i10 + i4)));
            i10 = i11;
        }
        int i12 = i10;
        int i13 = 0;
        while (i12 < i5) {
            i7 ^= (bArr[i4 + i12] & 255) << i13;
            i12++;
            i13 += 8;
        }
        return v(y(i7) ^ i6, i5);
    }

    public String toString() {
        int i4 = this.f56933b;
        StringBuilder sb = new StringBuilder(31);
        sb.append(ProtectedSandApp.s("\uf5f5"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\uf5f6"));
        return sb.toString();
    }
}
