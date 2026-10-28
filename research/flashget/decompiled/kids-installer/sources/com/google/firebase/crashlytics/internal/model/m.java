package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes3.dex */
final class m extends f0.f.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final f0.f.d.a.b f16177a;

    /* renamed from: b, reason: collision with root package name */
    private final List<f0.d> f16178b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f0.d> f16179c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f16180d;

    /* renamed from: e, reason: collision with root package name */
    private final f0.f.d.a.c f16181e;

    /* renamed from: f, reason: collision with root package name */
    private final List<f0.f.d.a.c> f16182f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16183g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    static final class b extends f0.f.d.a.AbstractC0202a {

        /* renamed from: a, reason: collision with root package name */
        private f0.f.d.a.b f16184a;

        /* renamed from: b, reason: collision with root package name */
        private List<f0.d> f16185b;

        /* renamed from: c, reason: collision with root package name */
        private List<f0.d> f16186c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f16187d;

        /* renamed from: e, reason: collision with root package name */
        private f0.f.d.a.c f16188e;

        /* renamed from: f, reason: collision with root package name */
        private List<f0.f.d.a.c> f16189f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f16190g;

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a a() {
            String s5 = this.f16184a == null ? ProtectedSandApp.s("⦘") : "";
            if (this.f16190g == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦙"));
            }
            if (s5.isEmpty()) {
                return new m(this.f16184a, this.f16185b, this.f16186c, this.f16187d, this.f16188e, this.f16189f, this.f16190g.intValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⦚").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a.AbstractC0202a b(@q0 List<f0.f.d.a.c> list) {
            this.f16189f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a.AbstractC0202a c(@q0 Boolean bool) {
            this.f16187d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a.AbstractC0202a d(@q0 f0.f.d.a.c cVar) {
            this.f16188e = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a.AbstractC0202a e(List<f0.d> list) {
            this.f16185b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a.AbstractC0202a f(f0.f.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦛"));
            }
            this.f16184a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a.AbstractC0202a g(List<f0.d> list) {
            this.f16186c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.AbstractC0202a
        public f0.f.d.a.AbstractC0202a h(int i5) {
            this.f16190g = Integer.valueOf(i5);
            return this;
        }

        b() {
        }

        private b(f0.f.d.a aVar) {
            this.f16184a = aVar.f();
            this.f16185b = aVar.e();
            this.f16186c = aVar.g();
            this.f16187d = aVar.c();
            this.f16188e = aVar.d();
            this.f16189f = aVar.b();
            this.f16190g = Integer.valueOf(aVar.h());
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @q0
    public List<f0.f.d.a.c> b() {
        return this.f16182f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @q0
    public Boolean c() {
        return this.f16180d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @q0
    public f0.f.d.a.c d() {
        return this.f16181e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @q0
    public List<f0.d> e() {
        return this.f16178b;
    }

    public boolean equals(Object obj) {
        List<f0.d> list;
        List<f0.d> list2;
        Boolean bool;
        f0.f.d.a.c cVar;
        List<f0.f.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a)) {
            return false;
        }
        f0.f.d.a aVar = (f0.f.d.a) obj;
        return this.f16177a.equals(aVar.f()) && ((list = this.f16178b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f16179c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f16180d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f16181e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f16182f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f16183g == aVar.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @o0
    public f0.f.d.a.b f() {
        return this.f16177a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    @q0
    public List<f0.d> g() {
        return this.f16179c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    public int h() {
        return this.f16183g;
    }

    public int hashCode() {
        int hashCode = (this.f16177a.hashCode() ^ 1000003) * 1000003;
        List<f0.d> list = this.f16178b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.d> list2 = this.f16179c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f16180d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.f.d.a.c cVar = this.f16181e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.f.d.a.c> list3 = this.f16182f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f16183g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a
    public f0.f.d.a.AbstractC0202a i() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⦜"));
        sb.append(this.f16177a);
        sb.append(ProtectedSandApp.s("⦝"));
        sb.append(this.f16178b);
        sb.append(ProtectedSandApp.s("⦞"));
        sb.append(this.f16179c);
        sb.append(ProtectedSandApp.s("⦟"));
        sb.append(this.f16180d);
        sb.append(ProtectedSandApp.s("⦠"));
        sb.append(this.f16181e);
        sb.append(ProtectedSandApp.s("⦡"));
        sb.append(this.f16182f);
        sb.append(ProtectedSandApp.s("⦢"));
        return androidx.constraintlayout.solver.e.a(sb, this.f16183g, ProtectedSandApp.s("⦣"));
    }

    private m(f0.f.d.a.b bVar, @q0 List<f0.d> list, @q0 List<f0.d> list2, @q0 Boolean bool, @q0 f0.f.d.a.c cVar, @q0 List<f0.f.d.a.c> list3, int i5) {
        this.f16177a = bVar;
        this.f16178b = list;
        this.f16179c = list2;
        this.f16180d = bool;
        this.f16181e = cVar;
        this.f16182f = list3;
        this.f16183g = i5;
    }
}
