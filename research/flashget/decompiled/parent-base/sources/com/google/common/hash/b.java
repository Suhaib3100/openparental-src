package com.google.common.hash;

import com.google.common.base.l0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: AbstractCompositeHashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
abstract class b extends c {

    /* renamed from: c, reason: collision with root package name */
    private static final long f56892c = 0;

    /* renamed from: b, reason: collision with root package name */
    final q[] f56893b;

    /* compiled from: AbstractCompositeHashFunction.java */
    class a implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ r[] f56894a;

        a(r[] rVarArr) {
            this.f56894a = rVarArr;
        }

        @Override // com.google.common.hash.r
        public <T> r n(@f0 T t4, n<? super T> nVar) {
            for (r rVar : this.f56894a) {
                rVar.n(t4, nVar);
            }
            return this;
        }

        @Override // com.google.common.hash.r
        public p o() {
            return b.this.m(this.f56894a);
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r a(byte[] bArr) {
            for (r rVar : this.f56894a) {
                rVar.a(bArr);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r b(double d5) {
            for (r rVar : this.f56894a) {
                rVar.b(d5);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r c(float f4) {
            for (r rVar : this.f56894a) {
                rVar.c(f4);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r d(byte b5) {
            for (r rVar : this.f56894a) {
                rVar.d(b5);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r e(short s4) {
            for (r rVar : this.f56894a) {
                rVar.e(s4);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r f(boolean z4) {
            for (r rVar : this.f56894a) {
                rVar.f(z4);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r g(int i4) {
            for (r rVar : this.f56894a) {
                rVar.g(i4);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r h(long j4) {
            for (r rVar : this.f56894a) {
                rVar.h(j4);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r i(char c5) {
            for (r rVar : this.f56894a) {
                rVar.i(c5);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r j(CharSequence charSequence) {
            for (r rVar : this.f56894a) {
                rVar.j(charSequence);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r k(byte[] bArr, int i4, int i5) {
            for (r rVar : this.f56894a) {
                rVar.k(bArr, i4, i5);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r l(ByteBuffer byteBuffer) {
            int position = byteBuffer.position();
            for (r rVar : this.f56894a) {
                byteBuffer.position(position);
                rVar.l(byteBuffer);
            }
            return this;
        }

        @Override // com.google.common.hash.r, com.google.common.hash.g0
        public r m(CharSequence charSequence, Charset charset) {
            for (r rVar : this.f56894a) {
                rVar.m(charSequence, charset);
            }
            return this;
        }
    }

    b(q... qVarArr) {
        for (q qVar : qVarArr) {
            qVar.getClass();
        }
        this.f56893b = qVarArr;
    }

    private r l(r[] rVarArr) {
        return new a(rVarArr);
    }

    @Override // com.google.common.hash.c, com.google.common.hash.q
    public r d(int i4) {
        l0.d(i4 >= 0);
        int length = this.f56893b.length;
        r[] rVarArr = new r[length];
        for (int i5 = 0; i5 < length; i5++) {
            rVarArr[i5] = this.f56893b[i5].d(i4);
        }
        return new a(rVarArr);
    }

    @Override // com.google.common.hash.q
    public r f() {
        int length = this.f56893b.length;
        r[] rVarArr = new r[length];
        for (int i4 = 0; i4 < length; i4++) {
            rVarArr[i4] = this.f56893b[i4].f();
        }
        return new a(rVarArr);
    }

    abstract p m(r[] rVarArr);
}
