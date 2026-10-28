package com.google.common.hash;

import com.google.common.base.l0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: AbstractNonStreamingHashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
abstract class e extends c {

    /* compiled from: AbstractNonStreamingHashFunction.java */
    private final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        final b f56924a;

        a(int i4) {
            this.f56924a = new b(i4);
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r d(byte b5) {
            this.f56924a.write(b5);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r k(byte[] bArr, int i4, int i5) {
            this.f56924a.write(bArr, i4, i5);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public r l(ByteBuffer byteBuffer) {
            this.f56924a.c(byteBuffer);
            return this;
        }

        @Override // com.google.common.hash.r
        public p o() {
            return e.this.k(this.f56924a.a(), 0, this.f56924a.b());
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public g0 d(byte b5) {
            this.f56924a.write(b5);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public g0 k(byte[] bArr, int i4, int i5) {
            this.f56924a.write(bArr, i4, i5);
            return this;
        }

        @Override // com.google.common.hash.d, com.google.common.hash.r, com.google.common.hash.g0
        public g0 l(ByteBuffer byteBuffer) {
            this.f56924a.c(byteBuffer);
            return this;
        }
    }

    /* compiled from: AbstractNonStreamingHashFunction.java */
    private static final class b extends ByteArrayOutputStream {
        b(int i4) {
            super(i4);
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }

        int b() {
            return ((ByteArrayOutputStream) this).count;
        }

        void c(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i4 = ((ByteArrayOutputStream) this).count;
            int i5 = i4 + remaining;
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            if (i5 > bArr.length) {
                ((ByteArrayOutputStream) this).buf = Arrays.copyOf(bArr, i4 + remaining);
            }
            byteBuffer.get(((ByteArrayOutputStream) this).buf, ((ByteArrayOutputStream) this).count, remaining);
            ((ByteArrayOutputStream) this).count += remaining;
        }
    }

    e() {
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p a(CharSequence charSequence, Charset charset) {
        return e(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p b(CharSequence charSequence) {
        int length = charSequence.length();
        ByteBuffer order = ByteBuffer.allocate(length * 2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i4 = 0; i4 < length; i4++) {
            order.putChar(charSequence.charAt(i4));
        }
        return e(order.array());
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public r d(int i4) {
        l0.d(i4 >= 0);
        return new a(i4);
    }

    @Override // com.google.common.hash.q
    public r f() {
        return d(32);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p g(int i4) {
        return e(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i4).array());
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p i(ByteBuffer byteBuffer) {
        return d(byteBuffer.remaining()).l(byteBuffer).o();
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public p j(long j4) {
        return e(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j4).array());
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public abstract p k(byte[] bArr, int i4, int i5);
}
