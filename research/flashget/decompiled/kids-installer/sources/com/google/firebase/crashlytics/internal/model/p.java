package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes3.dex */
final class p extends f0.f.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f16209a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16210b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f0.f.d.a.b.e.AbstractC0210b> f16211c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.f.d.a.b.c f16212d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16213e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
    static final class b extends f0.f.d.a.b.c.AbstractC0206a {

        /* renamed from: a, reason: collision with root package name */
        private String f16214a;

        /* renamed from: b, reason: collision with root package name */
        private String f16215b;

        /* renamed from: c, reason: collision with root package name */
        private List<f0.f.d.a.b.e.AbstractC0210b> f16216c;

        /* renamed from: d, reason: collision with root package name */
        private f0.f.d.a.b.c f16217d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f16218e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC0206a
        public f0.f.d.a.b.c a() {
            String s5 = this.f16214a == null ? ProtectedSandApp.s("⦹") : "";
            if (this.f16216c == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦺"));
            }
            if (this.f16218e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦻"));
            }
            if (s5.isEmpty()) {
                return new p(this.f16214a, this.f16215b, this.f16216c, this.f16217d, this.f16218e.intValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⦼").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC0206a
        public f0.f.d.a.b.c.AbstractC0206a b(f0.f.d.a.b.c cVar) {
            this.f16217d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC0206a
        public f0.f.d.a.b.c.AbstractC0206a c(List<f0.f.d.a.b.e.AbstractC0210b> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦽"));
            }
            this.f16216c = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC0206a
        public f0.f.d.a.b.c.AbstractC0206a d(int i5) {
            this.f16218e = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC0206a
        public f0.f.d.a.b.c.AbstractC0206a e(String str) {
            this.f16215b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c.AbstractC0206a
        public f0.f.d.a.b.c.AbstractC0206a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦾"));
            }
            this.f16214a = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @q0
    public f0.f.d.a.b.c b() {
        return this.f16212d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @o0
    public List<f0.f.d.a.b.e.AbstractC0210b> c() {
        return this.f16211c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    public int d() {
        return this.f16213e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @q0
    public String e() {
        return this.f16210b;
    }

    public boolean equals(Object obj) {
        String str;
        f0.f.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a.b.c)) {
            return false;
        }
        f0.f.d.a.b.c cVar2 = (f0.f.d.a.b.c) obj;
        return this.f16209a.equals(cVar2.f()) && ((str = this.f16210b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f16211c.equals(cVar2.c()) && ((cVar = this.f16212d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f16213e == cVar2.d();
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.c
    @o0
    public String f() {
        return this.f16209a;
    }

    public int hashCode() {
        int hashCode = (this.f16209a.hashCode() ^ 1000003) * 1000003;
        String str = this.f16210b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f16211c.hashCode()) * 1000003;
        f0.f.d.a.b.c cVar = this.f16212d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f16213e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⦿"));
        sb.append(this.f16209a);
        sb.append(ProtectedSandApp.s("⧀"));
        sb.append(this.f16210b);
        sb.append(ProtectedSandApp.s("⧁"));
        sb.append(this.f16211c);
        sb.append(ProtectedSandApp.s("⧂"));
        sb.append(this.f16212d);
        sb.append(ProtectedSandApp.s("⧃"));
        return androidx.constraintlayout.solver.e.a(sb, this.f16213e, ProtectedSandApp.s("⧄"));
    }

    private p(String str, @q0 String str2, List<f0.f.d.a.b.e.AbstractC0210b> list, @q0 f0.f.d.a.b.c cVar, int i5) {
        this.f16209a = str;
        this.f16210b = str2;
        this.f16211c = list;
        this.f16212d = cVar;
        this.f16213e = i5;
    }
}
