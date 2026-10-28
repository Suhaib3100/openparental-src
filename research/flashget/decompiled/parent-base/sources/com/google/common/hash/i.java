package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.io.Serializable;
import java.util.zip.Checksum;

/* compiled from: ChecksumHashFunction.java */
@k
@f9.j
/* loaded from: classes6.dex */
final class i extends c implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f56970e = 0;

    /* renamed from: b, reason: collision with root package name */
    private final v<? extends Checksum> f56971b;

    /* renamed from: c, reason: collision with root package name */
    private final int f56972c;

    /* renamed from: d, reason: collision with root package name */
    private final String f56973d;

    /* compiled from: ChecksumHashFunction.java */
    private final class b extends com.google.common.hash.a {

        /* renamed from: b, reason: collision with root package name */
        private final Checksum f56974b;

        @Override // com.google.common.hash.r
        public p o() {
            long value = this.f56974b.getValue();
            return i.this.f56972c == 32 ? p.i((int) value) : p.j(value);
        }

        @Override // com.google.common.hash.a
        protected void q(byte b5) {
            this.f56974b.update(b5);
        }

        @Override // com.google.common.hash.a
        protected void t(byte[] bArr, int i4, int i5) {
            this.f56974b.update(bArr, i4, i5);
        }

        private b(Checksum checksum) {
            checksum.getClass();
            this.f56974b = checksum;
        }
    }

    i(v<? extends Checksum> vVar, int i4, String str) {
        vVar.getClass();
        this.f56971b = vVar;
        l0.k(i4 == 32 || i4 == 64, ProtectedSandApp.s("\uf614"), i4);
        this.f56972c = i4;
        str.getClass();
        this.f56973d = str;
    }

    @Override // com.google.common.hash.q
    public int c() {
        return this.f56972c;
    }

    @Override // com.google.common.hash.q
    public r f() {
        return new b(this.f56971b.get());
    }

    public String toString() {
        return this.f56973d;
    }
}
