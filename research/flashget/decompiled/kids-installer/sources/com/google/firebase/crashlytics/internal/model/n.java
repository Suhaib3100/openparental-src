package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes3.dex */
final class n extends f0.f.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List<f0.f.d.a.b.e> f16191a;

    /* renamed from: b, reason: collision with root package name */
    private final f0.f.d.a.b.c f16192b;

    /* renamed from: c, reason: collision with root package name */
    private final f0.a f16193c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.f.d.a.b.AbstractC0207d f16194d;

    /* renamed from: e, reason: collision with root package name */
    private final List<f0.f.d.a.b.AbstractC0203a> f16195e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    static final class b extends f0.f.d.a.b.AbstractC0205b {

        /* renamed from: a, reason: collision with root package name */
        private List<f0.f.d.a.b.e> f16196a;

        /* renamed from: b, reason: collision with root package name */
        private f0.f.d.a.b.c f16197b;

        /* renamed from: c, reason: collision with root package name */
        private f0.a f16198c;

        /* renamed from: d, reason: collision with root package name */
        private f0.f.d.a.b.AbstractC0207d f16199d;

        /* renamed from: e, reason: collision with root package name */
        private List<f0.f.d.a.b.AbstractC0203a> f16200e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0205b
        public f0.f.d.a.b a() {
            String s5 = this.f16199d == null ? ProtectedSandApp.s("⦤") : "";
            if (this.f16200e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⦥"));
            }
            if (s5.isEmpty()) {
                return new n(this.f16196a, this.f16197b, this.f16198c, this.f16199d, this.f16200e);
            }
            throw new IllegalStateException(ProtectedSandApp.s("⦦").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0205b
        public f0.f.d.a.b.AbstractC0205b b(f0.a aVar) {
            this.f16198c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0205b
        public f0.f.d.a.b.AbstractC0205b c(List<f0.f.d.a.b.AbstractC0203a> list) {
            if (list == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦧"));
            }
            this.f16200e = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0205b
        public f0.f.d.a.b.AbstractC0205b d(f0.f.d.a.b.c cVar) {
            this.f16197b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0205b
        public f0.f.d.a.b.AbstractC0205b e(f0.f.d.a.b.AbstractC0207d abstractC0207d) {
            if (abstractC0207d == null) {
                throw new NullPointerException(ProtectedSandApp.s("⦨"));
            }
            this.f16199d = abstractC0207d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.AbstractC0205b
        public f0.f.d.a.b.AbstractC0205b f(List<f0.f.d.a.b.e> list) {
            this.f16196a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @q0
    public f0.a b() {
        return this.f16193c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @o0
    public List<f0.f.d.a.b.AbstractC0203a> c() {
        return this.f16195e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @q0
    public f0.f.d.a.b.c d() {
        return this.f16192b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @o0
    public f0.f.d.a.b.AbstractC0207d e() {
        return this.f16194d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a.b)) {
            return false;
        }
        f0.f.d.a.b bVar = (f0.f.d.a.b) obj;
        List<f0.f.d.a.b.e> list = this.f16191a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            f0.f.d.a.b.c cVar = this.f16192b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                f0.a aVar = this.f16193c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f16194d.equals(bVar.e()) && this.f16195e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b
    @q0
    public List<f0.f.d.a.b.e> f() {
        return this.f16191a;
    }

    public int hashCode() {
        List<f0.f.d.a.b.e> list = this.f16191a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        f0.f.d.a.b.c cVar = this.f16192b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        f0.a aVar = this.f16193c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f16194d.hashCode()) * 1000003) ^ this.f16195e.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("⦩") + this.f16191a + ProtectedSandApp.s("⦪") + this.f16192b + ProtectedSandApp.s("⦫") + this.f16193c + ProtectedSandApp.s("⦬") + this.f16194d + ProtectedSandApp.s("⦭") + this.f16195e + ProtectedSandApp.s("⦮");
    }

    private n(@q0 List<f0.f.d.a.b.e> list, @q0 f0.f.d.a.b.c cVar, @q0 f0.a aVar, f0.f.d.a.b.AbstractC0207d abstractC0207d, List<f0.f.d.a.b.AbstractC0203a> list2) {
        this.f16191a = list;
        this.f16192b = cVar;
        this.f16193c = aVar;
        this.f16194d = abstractC0207d;
        this.f16195e = list2;
    }
}
