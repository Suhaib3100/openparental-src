package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: AbstractHashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
abstract class c implements q {
    c() {
    }

    @Override // com.google.common.hash.q
    public p a(CharSequence charSequence, Charset charset) {
        return f().m(charSequence, charset).o();
    }

    @Override // com.google.common.hash.q
    public p b(CharSequence charSequence) {
        return d(charSequence.length() * 2).j(charSequence).o();
    }

    @Override // com.google.common.hash.q
    public r d(int i4) {
        l0.k(i4 >= 0, ProtectedSandApp.s("\uf5ef"), i4);
        return f();
    }

    @Override // com.google.common.hash.q
    public p e(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    @Override // com.google.common.hash.q
    public p g(int i4) {
        return d(4).g(i4).o();
    }

    @Override // com.google.common.hash.q
    public <T> p h(@f0 T t4, n<? super T> nVar) {
        return f().n(t4, nVar).o();
    }

    @Override // com.google.common.hash.q
    public p i(ByteBuffer byteBuffer) {
        return d(byteBuffer.remaining()).l(byteBuffer).o();
    }

    @Override // com.google.common.hash.q
    public p j(long j4) {
        return d(8).h(j4).o();
    }

    @Override // com.google.common.hash.q
    public p k(byte[] bArr, int i4, int i5) {
        l0.f0(i4, i4 + i5, bArr.length);
        return d(i5).k(bArr, i4, i5).o();
    }
}
