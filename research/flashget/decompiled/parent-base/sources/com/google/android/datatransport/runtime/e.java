package com.google.android.datatransport.runtime;

import androidx.annotation.c1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.s;
import java.util.Arrays;

/* compiled from: AutoValue_TransportContext.java */
/* loaded from: classes5.dex */
final class e extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f52022a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f52023b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.h f52024c;

    /* compiled from: AutoValue_TransportContext.java */
    static final class b extends s.a {

        /* renamed from: a, reason: collision with root package name */
        private String f52025a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f52026b;

        /* renamed from: c, reason: collision with root package name */
        private com.google.android.datatransport.h f52027c;

        b() {
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s a() {
            String s4 = this.f52025a == null ? ProtectedSandApp.s("엪") : "";
            if (this.f52027c == null) {
                s4 = androidx.compose.runtime.changelist.j.a(s4, ProtectedSandApp.s("엫"));
            }
            if (s4.isEmpty()) {
                return new e(this.f52025a, this.f52026b, this.f52027c);
            }
            throw new IllegalStateException(ProtectedSandApp.s("여").concat(s4));
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("역"));
            }
            this.f52025a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s.a c(@q0 byte[] bArr) {
            this.f52026b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.s.a
        public s.a d(com.google.android.datatransport.h hVar) {
            if (hVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("엮"));
            }
            this.f52027c = hVar;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.s
    public String b() {
        return this.f52022a;
    }

    @Override // com.google.android.datatransport.runtime.s
    @q0
    public byte[] c() {
        return this.f52023b;
    }

    @Override // com.google.android.datatransport.runtime.s
    @c1({c1.a.LIBRARY_GROUP})
    public com.google.android.datatransport.h d() {
        return this.f52024c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f52022a.equals(sVar.b())) {
            if (Arrays.equals(this.f52023b, sVar instanceof e ? ((e) sVar).f52023b : sVar.c()) && this.f52024c.equals(sVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f52022a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52023b)) * 1000003) ^ this.f52024c.hashCode();
    }

    private e(String str, @q0 byte[] bArr, com.google.android.datatransport.h hVar) {
        this.f52022a = str;
        this.f52023b = bArr;
        this.f52024c = hVar;
    }
}
