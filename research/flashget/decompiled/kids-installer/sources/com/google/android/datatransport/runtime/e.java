package com.google.android.datatransport.runtime;

import androidx.annotation.c1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.s;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes3.dex */
final class e extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f12494a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f12495b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.e f12496c;

    /* compiled from: AutoValue_TransportContext.java */
    static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        private String f12497a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f12498b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.android.datatransport.e f12499c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s a() {
            String s5 = this.f12497a == null ? ProtectedSandApp.s("⁒") : "";
            if (this.f12499c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⁓"));
            }
            if (s5.isEmpty()) {
                return new e(this.f12497a, this.f12498b, this.f12499c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⁔").concat(s5));
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁕"));
            }
            this.f12497a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s.a c(@q0 byte[] bArr) {
            this.f12498b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s.a d(com.google.android.datatransport.e eVar) {
            if (eVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⁖"));
            }
            this.f12499c = eVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.s
    public String b() {
        return this.f12494a;
    }

    @Override // com.google.android.datatransport.runtime.s
    @q0
    public byte[] c() {
        return this.f12495b;
    }

    @Override // com.google.android.datatransport.runtime.s
    @c1({c1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.e d() {
        return this.f12496c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f12494a.equals(sVar.b())) {
            if (Arrays.equals(this.f12495b, sVar instanceof e ? ((e) sVar).f12495b : sVar.c()) && this.f12496c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f12494a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12495b)) * 1000003) ^ this.f12496c.hashCode();
    }

    private e(String str, @q0 byte[] bArr, com.google.android.datatransport.e eVar) {
        this.f12494a = str;
        this.f12495b = bArr;
        this.f12496c = eVar;
    }
}
