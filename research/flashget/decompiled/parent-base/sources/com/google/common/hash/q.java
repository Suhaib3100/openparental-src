package com.google.common.hash;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: HashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
public interface q {
    p a(CharSequence charSequence, Charset charset);

    p b(CharSequence charSequence);

    int c();

    r d(int i4);

    p e(byte[] bArr);

    r f();

    p g(int i4);

    <T> p h(@f0 T t4, n<? super T> nVar);

    p i(ByteBuffer byteBuffer);

    p j(long j4);

    p k(byte[] bArr, int i4, int i5);
}
