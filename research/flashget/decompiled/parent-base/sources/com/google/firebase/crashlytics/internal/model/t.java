package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes6.dex */
final class t extends g0.f.d.a.b.e.AbstractC0913b {

    /* renamed from: a, reason: collision with root package name */
    private final long f59359a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59360b;

    /* renamed from: c, reason: collision with root package name */
    private final String f59361c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59362d;

    /* renamed from: e, reason: collision with root package name */
    private final int f59363e;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    static final class b extends g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a {

        /* renamed from: a, reason: collision with root package name */
        private long f59364a;

        /* renamed from: b, reason: collision with root package name */
        private String f59365b;

        /* renamed from: c, reason: collision with root package name */
        private String f59366c;

        /* renamed from: d, reason: collision with root package name */
        private long f59367d;

        /* renamed from: e, reason: collision with root package name */
        private int f59368e;

        /* renamed from: f, reason: collision with root package name */
        private byte f59369f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a
        public g0.f.d.a.b.e.AbstractC0913b a() {
            String str;
            if (this.f59369f == 7 && (str = this.f59365b) != null) {
                return new t(this.f59364a, str, this.f59366c, this.f59367d, this.f59368e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f59369f & 1) == 0) {
                sb.append(ProtectedSandApp.s("Ｒ"));
            }
            if (this.f59365b == null) {
                sb.append(ProtectedSandApp.s("Ｓ"));
            }
            if ((this.f59369f & 2) == 0) {
                sb.append(ProtectedSandApp.s("Ｔ"));
            }
            if ((this.f59369f & 4) == 0) {
                sb.append(ProtectedSandApp.s("Ｕ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("Ｖ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a
        public g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a b(String str) {
            this.f59366c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a
        public g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a c(int i4) {
            this.f59368e = i4;
            this.f59369f = (byte) (this.f59369f | 4);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a
        public g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a d(long j4) {
            this.f59367d = j4;
            this.f59369f = (byte) (this.f59369f | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a
        public g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a e(long j4) {
            this.f59364a = j4;
            this.f59369f = (byte) (this.f59369f | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a
        public g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a f(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("Ｗ"));
            }
            this.f59365b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b
    @q0
    public String b() {
        return this.f59361c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b
    public int c() {
        return this.f59363e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b
    public long d() {
        return this.f59362d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b
    public long e() {
        return this.f59359a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.a.b.e.AbstractC0913b)) {
            return false;
        }
        g0.f.d.a.b.e.AbstractC0913b abstractC0913b = (g0.f.d.a.b.e.AbstractC0913b) obj;
        return this.f59359a == abstractC0913b.e() && this.f59360b.equals(abstractC0913b.f()) && ((str = this.f59361c) != null ? str.equals(abstractC0913b.b()) : abstractC0913b.b() == null) && this.f59362d == abstractC0913b.d() && this.f59363e == abstractC0913b.c();
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.a.b.e.AbstractC0913b
    @o0
    public String f() {
        return this.f59360b;
    }

    public int hashCode() {
        long j4 = this.f59359a;
        int hashCode = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f59360b.hashCode()) * 1000003;
        String str = this.f59361c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j5 = this.f59362d;
        return ((hashCode2 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f59363e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ｘ"));
        sb.append(this.f59359a);
        sb.append(ProtectedSandApp.s("Ｙ"));
        sb.append(this.f59360b);
        sb.append(ProtectedSandApp.s("Ｚ"));
        sb.append(this.f59361c);
        sb.append(ProtectedSandApp.s("［"));
        sb.append(this.f59362d);
        sb.append(ProtectedSandApp.s("＼"));
        return android.support.v4.media.b.a(sb, this.f59363e, ProtectedSandApp.s("］"));
    }

    private t(long j4, String str, @q0 String str2, long j5, int i4) {
        this.f59359a = j4;
        this.f59360b = str;
        this.f59361c = str2;
        this.f59362d = j5;
        this.f59363e = i4;
    }
}
