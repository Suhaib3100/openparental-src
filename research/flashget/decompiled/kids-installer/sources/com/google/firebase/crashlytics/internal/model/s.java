package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes3.dex */
final class s extends f0.f.d.a.b.e.AbstractC0210b {

    /* renamed from: a, reason: collision with root package name */
    private final long f16231a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16232b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16233c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16234d;

    /* renamed from: e, reason: collision with root package name */
    private final int f16235e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    static final class b extends f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a {

        /* renamed from: a, reason: collision with root package name */
        private Long f16236a;

        /* renamed from: b, reason: collision with root package name */
        private String f16237b;

        /* renamed from: c, reason: collision with root package name */
        private String f16238c;

        /* renamed from: d, reason: collision with root package name */
        private Long f16239d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f16240e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a
        public f0.f.d.a.b.e.AbstractC0210b a() {
            String s5 = this.f16236a == null ? ProtectedSandApp.s("⧙") : "";
            if (this.f16237b == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧚"));
            }
            if (this.f16239d == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧛"));
            }
            if (this.f16240e == null) {
                s5 = androidx.concurrent.futures.b.a(s5, ProtectedSandApp.s("⧜"));
            }
            if (s5.isEmpty()) {
                return new s(this.f16236a.longValue(), this.f16237b, this.f16238c, this.f16239d.longValue(), this.f16240e.intValue());
            }
            throw new IllegalStateException(ProtectedSandApp.s("⧝").concat(s5));
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a
        public f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a b(String str) {
            this.f16238c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a
        public f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a c(int i5) {
            this.f16240e = Integer.valueOf(i5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a
        public f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a d(long j5) {
            this.f16239d = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a
        public f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a e(long j5) {
            this.f16236a = Long.valueOf(j5);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a
        public f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("⧞"));
            }
            this.f16237b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b
    @q0
    public String b() {
        return this.f16233c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b
    public int c() {
        return this.f16235e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b
    public long d() {
        return this.f16234d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b
    public long e() {
        return this.f16231a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.f.d.a.b.e.AbstractC0210b)) {
            return false;
        }
        f0.f.d.a.b.e.AbstractC0210b abstractC0210b = (f0.f.d.a.b.e.AbstractC0210b) obj;
        return this.f16231a == abstractC0210b.e() && this.f16232b.equals(abstractC0210b.f()) && ((str = this.f16233c) != null ? str.equals(abstractC0210b.b()) : abstractC0210b.b() == null) && this.f16234d == abstractC0210b.d() && this.f16235e == abstractC0210b.c();
    }

    @Override // com.google.firebase.crashlytics.internal.model.f0.f.d.a.b.e.AbstractC0210b
    @o0
    public String f() {
        return this.f16232b;
    }

    public int hashCode() {
        long j5 = this.f16231a;
        int hashCode = (((((int) (j5 ^ (j5 >>> 32))) ^ 1000003) * 1000003) ^ this.f16232b.hashCode()) * 1000003;
        String str = this.f16233c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j6 = this.f16234d;
        return ((hashCode2 ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f16235e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⧟"));
        sb.append(this.f16231a);
        sb.append(ProtectedSandApp.s("⧠"));
        sb.append(this.f16232b);
        sb.append(ProtectedSandApp.s("⧡"));
        sb.append(this.f16233c);
        sb.append(ProtectedSandApp.s("⧢"));
        sb.append(this.f16234d);
        sb.append(ProtectedSandApp.s("⧣"));
        return androidx.constraintlayout.solver.e.a(sb, this.f16235e, ProtectedSandApp.s("⧤"));
    }

    private s(long j5, String str, @q0 String str2, long j6, int i5) {
        this.f16231a = j5;
        this.f16232b = str;
        this.f16233c = str2;
        this.f16234d = j6;
        this.f16235e = i5;
    }
}
