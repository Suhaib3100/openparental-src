package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* compiled from: MacHashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
final class b0 extends c {

    /* renamed from: b, reason: collision with root package name */
    private final Mac f56896b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f56897c;

    /* renamed from: d, reason: collision with root package name */
    private final String f56898d;

    /* renamed from: e, reason: collision with root package name */
    private final int f56899e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56900f;

    /* compiled from: MacHashFunction.java */
    private static final class b extends com.google.common.hash.a {

        /* renamed from: b, reason: collision with root package name */
        private final Mac f56901b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f56902c;

        private void u() {
            l0.h0(!this.f56902c, ProtectedSandApp.s("\uf5ee"));
        }

        @Override // com.google.common.hash.r
        public p o() {
            u();
            this.f56902c = true;
            return p.h(this.f56901b.doFinal());
        }

        @Override // com.google.common.hash.a
        protected void q(byte b5) {
            u();
            this.f56901b.update(b5);
        }

        @Override // com.google.common.hash.a
        protected void r(ByteBuffer byteBuffer) {
            u();
            byteBuffer.getClass();
            this.f56901b.update(byteBuffer);
        }

        @Override // com.google.common.hash.a
        protected void s(byte[] bArr) {
            u();
            this.f56901b.update(bArr);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] bArr, int i4, int i5) {
            u();
            this.f56901b.update(bArr, i4, i5);
        }

        private b(Mac mac) {
            this.f56901b = mac;
        }
    }

    b0(String str, Key key, String str2) {
        Mac l4 = l(str, key);
        this.f56896b = l4;
        key.getClass();
        this.f56897c = key;
        str2.getClass();
        this.f56898d = str2;
        this.f56899e = l4.getMacLength() * 8;
        this.f56900f = m(l4);
    }

    private static Mac l(String str, Key key) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(key);
            return mac;
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        } catch (NoSuchAlgorithmException e5) {
            throw new IllegalStateException(e5);
        }
    }

    private static boolean m(Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    @Override // com.google.common.hash.q
    public int c() {
        return this.f56899e;
    }

    @Override // com.google.common.hash.q
    public r f() {
        if (this.f56900f) {
            try {
                return new b((Mac) this.f56896b.clone());
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new b(l(this.f56896b.getAlgorithm(), this.f56897c));
    }

    public String toString() {
        return this.f56898d;
    }
}
