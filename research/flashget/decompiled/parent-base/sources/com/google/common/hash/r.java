package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: Hasher.java */
@d9.a
@k
@f9.a
/* loaded from: classes6.dex */
public interface r extends g0 {
    @Override // com.google.common.hash.g0
    r a(byte[] bArr);

    @Override // com.google.common.hash.g0
    r b(double d5);

    @Override // com.google.common.hash.g0
    r c(float f4);

    @Override // com.google.common.hash.g0
    r d(byte b5);

    @Override // com.google.common.hash.g0
    r e(short s4);

    @Override // com.google.common.hash.g0
    r f(boolean z4);

    @Override // com.google.common.hash.g0
    r g(int i4);

    @Override // com.google.common.hash.g0
    r h(long j4);

    @Deprecated
    int hashCode();

    @Override // com.google.common.hash.g0
    r i(char c5);

    @Override // com.google.common.hash.g0
    r j(CharSequence charSequence);

    @Override // com.google.common.hash.g0
    r k(byte[] bArr, int i4, int i5);

    @Override // com.google.common.hash.g0
    r l(ByteBuffer byteBuffer);

    @Override // com.google.common.hash.g0
    r m(CharSequence charSequence, Charset charset);

    <T> r n(@f0 T t4, n<? super T> nVar);

    p o();
}
