package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes3.dex */
final class i extends f0.f.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16131a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16132b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16133c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.f.a.b f16134d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16135e;

    /* renamed from: f, reason: collision with root package name */
    private final String f16136f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16137g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    static final class b extends f0.f.a.AbstractC0200a {

        /* renamed from: a, reason: collision with root package name */
        private String f16138a;

        /* renamed from: b, reason: collision with root package name */
        private String f16139b;

        /* renamed from: c, reason: collision with root package name */
        private String f16140c;

        /* renamed from: d, reason: collision with root package name */
        private f0.f.a.b f16141d;

        /* renamed from: e, reason: collision with root package name */
        private String f16142e;

        /* renamed from: f, reason: collision with root package name */
        private String f16143f;

        /* renamed from: g, reason: collision with root package name */
        private String f16144g;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a a() {
            String s5 = this.f16138a == null ? ProtectedSandApp.s("⥠") : "";
            if (this.f16139b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⥡"));
            }
            if (s5.isEmpty()) {
                return new i(this.f16138a, this.f16139b, this.f16140c, this.f16141d, this.f16142e, this.f16143f, this.f16144g);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⥢").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a.AbstractC0200a b(@q0 String str) {
            this.f16143f = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a.AbstractC0200a c(@q0 String str) {
            this.f16144g = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a.AbstractC0200a d(String str) {
            this.f16140c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a.AbstractC0200a e(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥣"));
            }
            this.f16138a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a.AbstractC0200a f(String str) {
            this.f16142e = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a.AbstractC0200a g(f0.f.a.b bVar) {
            this.f16141d = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.a.AbstractC0200a
        public f0.f.a.AbstractC0200a h(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⥤"));
            }
            this.f16139b = str;
            return this;
        }

        b() {
        }

        private b(f0.f.a aVar) {
            this.f16138a = aVar.e();
            this.f16139b = aVar.h();
            this.f16140c = aVar.d();
            this.f16141d = aVar.g();
            this.f16142e = aVar.f();
            this.f16143f = aVar.b();
            this.f16144g = aVar.c();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @q0
    public String b() {
        return this.f16136f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @q0
    public String c() {
        return this.f16137g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @q0
    public String d() {
        return this.f16133c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @o0
    public String e() {
        return this.f16131a;
    }

    public boolean equals(Object obj) {
        String str;
        f0.f.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.a)) {
            return false;
        }
        f0.f.a aVar = (f0.f.a) obj;
        if (this.f16131a.equals(aVar.e()) && this.f16132b.equals(aVar.h()) && ((str = this.f16133c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f16134d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f16135e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f16136f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f16137g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @q0
    public String f() {
        return this.f16135e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @q0
    public f0.f.a.b g() {
        return this.f16134d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    @o0
    public String h() {
        return this.f16132b;
    }

    public int hashCode() {
        int hashCode = (((this.f16131a.hashCode() ^ 1000003) * 1000003) ^ this.f16132b.hashCode()) * 1000003;
        String str = this.f16133c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        f0.f.a.b bVar = this.f16134d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f16135e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16136f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f16137g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.a
    protected f0.f.a.AbstractC0200a i() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⥥"));
        sb.append(this.f16131a);
        sb.append(ProtectedSandApp.s("⥦"));
        sb.append(this.f16132b);
        sb.append(ProtectedSandApp.s("⥧"));
        sb.append(this.f16133c);
        sb.append(ProtectedSandApp.s("⥨"));
        sb.append(this.f16134d);
        sb.append(ProtectedSandApp.s("⥩"));
        sb.append(this.f16135e);
        sb.append(ProtectedSandApp.s("⥪"));
        sb.append(this.f16136f);
        sb.append(ProtectedSandApp.s("⥫"));
        return androidx.concurrent.futures.a.a(sb, this.f16137g, ProtectedSandApp.s("⥬"));
    }

    private i(String str, String str2, @q0 String str3, @q0 f0.f.a.b bVar, @q0 String str4, @q0 String str5, @q0 String str6) {
        this.f16131a = str;
        this.f16132b = str2;
        this.f16133c = str3;
        this.f16134d = bVar;
        this.f16135e = str4;
        this.f16136f = str5;
        this.f16137g = str6;
    }
}
