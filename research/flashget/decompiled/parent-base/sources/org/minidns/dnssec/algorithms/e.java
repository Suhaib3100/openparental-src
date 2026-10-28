package org.minidns.dnssec.algorithms;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: JavaSecDigestCalculator.java */
/* loaded from: classes.dex */
public class e implements org.minidns.dnssec.a {

    /* renamed from: a, reason: collision with root package name */
    private MessageDigest f87266a;

    public e(String str) throws NoSuchAlgorithmException {
        this.f87266a = MessageDigest.getInstance(str);
    }

    @Override // org.minidns.dnssec.a
    public byte[] a(byte[] bArr) {
        return this.f87266a.digest(bArr);
    }
}
