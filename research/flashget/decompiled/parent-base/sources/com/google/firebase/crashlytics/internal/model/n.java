package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* loaded from: classes6.dex */
final class n extends g0.f.d.a {

    /* renamed from: a, reason: collision with root package name */
    private final g0.f.d.a.b f59299a;

    /* renamed from: b, reason: collision with root package name */
    private final List<g0.d> f59300b;

    /* renamed from: c, reason: collision with root package name */
    private final List<g0.d> f59301c;

    /* renamed from: d, reason: collision with root package name */
    private final Boolean f59302d;

    /* renamed from: e, reason: collision with root package name */
    private final g0.f.d.a.c f59303e;

    /* renamed from: f, reason: collision with root package name */
    private final List<g0.f.d.a.c> f59304f;

    /* renamed from: g, reason: collision with root package name */
    private final int f59305g;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    static final class b extends g0.f.d.a.AbstractC0905a {

        /* renamed from: a, reason: collision with root package name */
        private g0.f.d.a.b f59306a;

        /* renamed from: b, reason: collision with root package name */
        private List<g0.d> f59307b;

        /* renamed from: c, reason: collision with root package name */
        private List<g0.d> f59308c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f59309d;

        /* renamed from: e, reason: collision with root package name */
        private g0.f.d.a.c f59310e;

        /* renamed from: f, reason: collision with root package name */
        private List<g0.f.d.a.c> f59311f;

        /* renamed from: g, reason: collision with root package name */
        private int f59312g;

        /* renamed from: h, reason: collision with root package name */
        private byte f59313h;

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a a() {
            g0.f.d.a.b bVar;
            if (this.f59313h == 1 && (bVar = this.f59306a) != null) {
                return new n(bVar, this.f59307b, this.f59308c, this.f59309d, this.f59310e, this.f59311f, this.f59312g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59306a == null) {
                sb.append(ProtectedSandApp.s("ﺑ"));
            }
            if ((1 & this.f59313h) == 0) {
                sb.append(ProtectedSandApp.s("ﺒ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﺓ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a.AbstractC0905a b(@q0 List<g0.f.d.a.c> list) {
            this.f59311f = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a.AbstractC0905a c(@q0 Boolean bool) {
            this.f59309d = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a.AbstractC0905a d(@q0 g0.f.d.a.c cVar) {
            this.f59310e = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a.AbstractC0905a e(List<g0.d> list) {
            this.f59307b = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a.AbstractC0905a f(g0.f.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺔ"));
            }
            this.f59306a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a.AbstractC0905a g(List<g0.d> list) {
            this.f59308c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.AbstractC0905a
        public g0.f.d.a.AbstractC0905a h(int i4) {
            this.f59312g = i4;
            this.f59313h = (byte) (this.f59313h | 1);
            return this;
        }

        b() {
        }

        private b(g0.f.d.a aVar) {
            this.f59306a = aVar.f();
            this.f59307b = aVar.e();
            this.f59308c = aVar.g();
            this.f59309d = aVar.c();
            this.f59310e = aVar.d();
            this.f59311f = aVar.b();
            this.f59312g = aVar.h();
            this.f59313h = (byte) 1;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    @q0
    public List<g0.f.d.a.c> b() {
        return this.f59304f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    @q0
    public Boolean c() {
        return this.f59302d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    @q0
    public g0.f.d.a.c d() {
        return this.f59303e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    @q0
    public List<g0.d> e() {
        return this.f59300b;
    }

    public boolean equals(Object obj) {
        List<g0.d> list;
        List<g0.d> list2;
        Boolean bool;
        g0.f.d.a.c cVar;
        List<g0.f.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a)) {
            return false;
        }
        g0.f.d.a aVar = (g0.f.d.a) obj;
        return this.f59299a.equals(aVar.f()) && ((list = this.f59300b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f59301c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f59302d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f59303e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f59304f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f59305g == aVar.h();
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    @o0
    public g0.f.d.a.b f() {
        return this.f59299a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    @q0
    public List<g0.d> g() {
        return this.f59301c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    public int h() {
        return this.f59305g;
    }

    public int hashCode() {
        int hashCode = (this.f59299a.hashCode() ^ 1000003) * 1000003;
        List<g0.d> list = this.f59300b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<g0.d> list2 = this.f59301c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f59302d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        g0.f.d.a.c cVar = this.f59303e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<g0.f.d.a.c> list3 = this.f59304f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f59305g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a
    public g0.f.d.a.AbstractC0905a i() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﺕ"));
        sb.append(this.f59299a);
        sb.append(ProtectedSandApp.s("ﺖ"));
        sb.append(this.f59300b);
        sb.append(ProtectedSandApp.s("ﺗ"));
        sb.append(this.f59301c);
        sb.append(ProtectedSandApp.s("ﺘ"));
        sb.append(this.f59302d);
        sb.append(ProtectedSandApp.s("ﺙ"));
        sb.append(this.f59303e);
        sb.append(ProtectedSandApp.s("ﺚ"));
        sb.append(this.f59304f);
        sb.append(ProtectedSandApp.s("ﺛ"));
        return android.support.v4.media.b.a(sb, this.f59305g, ProtectedSandApp.s("ﺜ"));
    }

    private n(g0.f.d.a.b bVar, @q0 List<g0.d> list, @q0 List<g0.d> list2, @q0 Boolean bool, @q0 g0.f.d.a.c cVar, @q0 List<g0.f.d.a.c> list3, int i4) {
        this.f59299a = bVar;
        this.f59300b = list;
        this.f59301c = list2;
        this.f59302d = bool;
        this.f59303e = cVar;
        this.f59304f = list3;
        this.f59305g = i4;
    }
}
