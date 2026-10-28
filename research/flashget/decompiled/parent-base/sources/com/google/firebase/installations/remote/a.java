package com.google.firebase.installations.remote;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.installations.remote.d;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes6.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f59786a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59787b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59788c;

    /* renamed from: d, reason: collision with root package name */
    private final f f59789d;

    /* renamed from: e, reason: collision with root package name */
    private final d.b f59790e;

    /* compiled from: AutoValue_InstallationResponse.java */
    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59791a;

        /* renamed from: b, reason: collision with root package name */
        private String f59792b;

        /* renamed from: c, reason: collision with root package name */
        private String f59793c;

        /* renamed from: d, reason: collision with root package name */
        private f f59794d;

        /* renamed from: e, reason: collision with root package name */
        private d.b f59795e;

        b() {
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d a() {
            return new a(this.f59791a, this.f59792b, this.f59793c, this.f59794d, this.f59795e);
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a b(f fVar) {
            this.f59794d = fVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a c(String str) {
            this.f59792b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a d(String str) {
            this.f59793c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a e(d.b bVar) {
            this.f59795e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.remote.d.a
        public d.a f(String str) {
            this.f59791a = str;
            return this;
        }

        private b(d dVar) {
            this.f59791a = dVar.f();
            this.f59792b = dVar.c();
            this.f59793c = dVar.d();
            this.f59794d = dVar.b();
            this.f59795e = dVar.e();
        }
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public f b() {
        return this.f59789d;
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public String c() {
        return this.f59787b;
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public String d() {
        return this.f59788c;
    }

    @Override // com.google.firebase.installations.remote.d
    @q0
    public d.b e() {
        return this.f59790e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f59786a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f59787b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f59788c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f59789d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f59790e;
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
        return this.f59786a;
    }

    @Override // com.google.firebase.installations.remote.d
    public d.a g() {
        return new b(this);
    }

    public int hashCode() {
        String str = this.f59786a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f59787b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f59788c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f59789d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f59790e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("Ú\u0001") + this.f59786a + ProtectedSandApp.s("Û\u0001") + this.f59787b + ProtectedSandApp.s("Ü\u0001") + this.f59788c + ProtectedSandApp.s("Ý\u0001") + this.f59789d + ProtectedSandApp.s("Þ\u0001") + this.f59790e + ProtectedSandApp.s("ß\u0001");
    }

    private a(@q0 String str, @q0 String str2, @q0 String str3, @q0 f fVar, @q0 d.b bVar) {
        this.f59786a = str;
        this.f59787b = str2;
        this.f59788c = str3;
        this.f59789d = fVar;
        this.f59790e = bVar;
    }
}
