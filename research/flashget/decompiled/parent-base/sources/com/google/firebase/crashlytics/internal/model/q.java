package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes6.dex */
final class q extends g0.f.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f59333a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59334b;

    /* renamed from: c, reason: collision with root package name */
    private final List<g0.f.d.a.b.e.AbstractC0913b> f59335c;

    /* renamed from: d, reason: collision with root package name */
    private final g0.f.d.a.b.c f59336d;

    /* renamed from: e, reason: collision with root package name */
    private final int f59337e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    static final class b extends g0.f.d.a.b.c.AbstractC0909a {

        /* renamed from: a, reason: collision with root package name */
        private String f59338a;

        /* renamed from: b, reason: collision with root package name */
        private String f59339b;

        /* renamed from: c, reason: collision with root package name */
        private List<g0.f.d.a.b.e.AbstractC0913b> f59340c;

        /* renamed from: d, reason: collision with root package name */
        private g0.f.d.a.b.c f59341d;

        /* renamed from: e, reason: collision with root package name */
        private int f59342e;

        /* renamed from: f, reason: collision with root package name */
        private byte f59343f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c.AbstractC0909a
        public g0.f.d.a.b.c a() {
            String str;
            List<g0.f.d.a.b.e.AbstractC0913b> list;
            if (this.f59343f == 1 && (str = this.f59338a) != null && (list = this.f59340c) != null) {
                return new q(str, this.f59339b, list, this.f59341d, this.f59342e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59338a == null) {
                sb.append(ProtectedSandApp.s("ﺲ"));
            }
            if (this.f59340c == null) {
                sb.append(ProtectedSandApp.s("ﺳ"));
            }
            if ((1 & this.f59343f) == 0) {
                sb.append(ProtectedSandApp.s("ﺴ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ﺵ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c.AbstractC0909a
        public g0.f.d.a.b.c.AbstractC0909a b(g0.f.d.a.b.c cVar) {
            this.f59341d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c.AbstractC0909a
        public g0.f.d.a.b.c.AbstractC0909a c(List<g0.f.d.a.b.e.AbstractC0913b> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺶ"));
            }
            this.f59340c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c.AbstractC0909a
        public g0.f.d.a.b.c.AbstractC0909a d(int i4) {
            this.f59342e = i4;
            this.f59343f = (byte) (this.f59343f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c.AbstractC0909a
        public g0.f.d.a.b.c.AbstractC0909a e(String str) {
            this.f59339b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c.AbstractC0909a
        public g0.f.d.a.b.c.AbstractC0909a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ﺷ"));
            }
            this.f59338a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c
    @q0
    public g0.f.d.a.b.c b() {
        return this.f59336d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c
    @o0
    public List<g0.f.d.a.b.e.AbstractC0913b> c() {
        return this.f59335c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c
    public int d() {
        return this.f59337e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c
    @q0
    public String e() {
        return this.f59334b;
    }

    public boolean equals(Object obj) {
        String str;
        g0.f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a.b.c)) {
            return false;
        }
        g0.f.d.a.b.c cVar2 = (g0.f.d.a.b.c) obj;
        return this.f59333a.equals(cVar2.f()) && ((str = this.f59334b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f59335c.equals(cVar2.c()) && ((cVar = this.f59336d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f59337e == cVar2.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.c
    @o0
    public String f() {
        return this.f59333a;
    }

    public int hashCode() {
        int hashCode = (this.f59333a.hashCode() ^ 1000003) * 1000003;
        String str = this.f59334b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f59335c.hashCode()) * 1000003;
        g0.f.d.a.b.c cVar = this.f59336d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f59337e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﺸ"));
        sb.append(this.f59333a);
        sb.append(ProtectedSandApp.s("ﺹ"));
        sb.append(this.f59334b);
        sb.append(ProtectedSandApp.s("ﺺ"));
        sb.append(this.f59335c);
        sb.append(ProtectedSandApp.s("ﺻ"));
        sb.append(this.f59336d);
        sb.append(ProtectedSandApp.s("ﺼ"));
        return android.support.v4.media.b.a(sb, this.f59337e, ProtectedSandApp.s("ﺽ"));
    }

    private q(String str, @q0 String str2, List<g0.f.d.a.b.e.AbstractC0913b> list, @q0 g0.f.d.a.b.c cVar, int i4) {
        this.f59333a = str;
        this.f59334b = str2;
        this.f59335c = list;
        this.f59336d = cVar;
        this.f59337e = i4;
    }
}
