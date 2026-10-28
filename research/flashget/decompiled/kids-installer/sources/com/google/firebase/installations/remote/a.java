package com.google.firebase.installations.remote;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.installations.remote.d;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes3.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f16918a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16919b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16920c;

    /* renamed from: d, reason: collision with root package name */
    private final f f16921d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f16922e;

    /* compiled from: AutoValue_InstallationResponse.java */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f16923a;

        /* renamed from: b, reason: collision with root package name */
        private String f16924b;

        /* renamed from: c, reason: collision with root package name */
        private String f16925c;

        /* renamed from: d, reason: collision with root package name */
        private f f16926d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f16927e;

        @Override // com.google.firebase.installations.remote.d.a
        public d a() {
            return new a(this.f16923a, this.f16924b, this.f16925c, this.f16926d, this.f16927e);
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a b(f fVar) {
            this.f16926d = fVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a c(String str) {
            this.f16924b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a d(String str) {
            this.f16925c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a e(d.b bVar) {
            this.f16927e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a f(String str) {
            this.f16923a = str;
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f16923a = dVar.f();
            this.f16924b = dVar.c();
            this.f16925c = dVar.d();
            this.f16926d = dVar.b();
            this.f16927e = dVar.e();
        }
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public f b() {
        return this.f16921d;
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public String c() {
        return this.f16919b;
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public String d() {
        return this.f16920c;
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public d.b e() {
        return this.f16922e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f16918a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f16919b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f16920c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f16921d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f16922e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public String f() {
        return this.f16918a;
    }

    @Override // com.google.firebase.installations.remote.d
    public d.a g() {
        return new b(this);
    }

    public int hashCode() {
        String str = this.f16918a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f16919b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16920c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f16921d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f16922e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("⪿") + this.f16918a + ProtectedSandApp.s("⫀") + this.f16919b + ProtectedSandApp.s("⫁") + this.f16920c + ProtectedSandApp.s("⫂") + this.f16921d + ProtectedSandApp.s("⫃") + this.f16922e + ProtectedSandApp.s("⫄");
    }

    private a(@q0 String str, @q0 String str2, @q0 String str3, @q0 f fVar, @q0 d.b bVar) {
        this.f16918a = str;
        this.f16919b = str2;
        this.f16920c = str3;
        this.f16921d = fVar;
        this.f16922e = bVar;
    }
}
