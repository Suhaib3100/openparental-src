package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: MessageDigestHashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
final class c0 extends com.google.common.hash.c implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final MessageDigest f56903b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56904c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f56905d;

    /* renamed from: e, reason: collision with root package name */
    private final String f56906e;

    /* compiled from: MessageDigestHashFunction.java */
    private static final class b extends com.google.common.hash.a {

        /* renamed from: b, reason: collision with root package name */
        private final MessageDigest f56907b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56908c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56909d;

        private void u() {
            l0.h0(!this.f56909d, ProtectedSandApp.s("\uf5f0"));
        }

        @Override // com.google.common.hash.r
        public p o() {
            u();
            this.f56909d = true;
            return this.f56908c == this.f56907b.getDigestLength() ? p.h(this.f56907b.digest()) : p.h(Arrays.copyOf(this.f56907b.digest(), this.f56908c));
        }

        @Override // com.google.common.hash.a
        protected void q(byte b5) {
            u();
            this.f56907b.update(b5);
        }

        @Override // com.google.common.hash.a
        protected void r(ByteBuffer byteBuffer) {
            u();
            this.f56907b.update(byteBuffer);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] bArr, int i4, int i5) {
            u();
            this.f56907b.update(bArr, i4, i5);
        }

        private b(MessageDigest messageDigest, int i4) {
            this.f56907b = messageDigest;
            this.f56908c = i4;
        }
    }

    /* compiled from: MessageDigestHashFunction.java */
    private static final class c implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f56910e = 0;

        /* renamed from: b, reason: collision with root package name */
        private final String f56911b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56912c;

        /* renamed from: d, reason: collision with root package name */
        private final String f56913d;

        private Object a() {
            return new c0(this.f56911b, this.f56912c, this.f56913d);
        }

        private c(String str, int i4, String str2) {
            this.f56911b = str;
            this.f56912c = i4;
            this.f56913d = str2;
        }
    }

    c0(String str, String str2) {
        MessageDigest l4 = l(str);
        this.f56903b = l4;
        this.f56904c = l4.getDigestLength();
        str2.getClass();
        this.f56906e = str2;
        this.f56905d = m(l4);
    }

    private static MessageDigest l(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e4) {
            throw new AssertionError(e4);
        }
    }

    private static boolean m(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.q
    public int c() {
        return this.f56904c * 8;
    }

    @Override // com.google.common.hash.q
    public r f() {
        if (this.f56905d) {
            try {
                return new b((MessageDigest) this.f56903b.clone(), this.f56904c);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f56903b.getAlgorithm()), this.f56904c);
    }

    Object n() {
        return new c(this.f56903b.getAlgorithm(), this.f56904c, this.f56906e);
    }

    public String toString() {
        return this.f56906e;
    }

    c0(String str, int i4, String str2) {
        str2.getClass();
        this.f56906e = str2;
        MessageDigest l4 = l(str);
        this.f56903b = l4;
        int digestLength = l4.getDigestLength();
        l0.m(i4 >= 4 && i4 <= digestLength, ProtectedSandApp.s("\uf5f1"), i4, digestLength);
        this.f56904c = i4;
        this.f56905d = m(l4);
    }
}
