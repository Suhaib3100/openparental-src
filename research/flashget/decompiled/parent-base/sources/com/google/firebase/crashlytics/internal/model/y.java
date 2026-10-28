package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* loaded from: classes6.dex */
final class y extends g0.f.d.e.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f59403a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59404b;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    static final class b extends g0.f.d.e.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f59405a;

        /* renamed from: b, reason: collision with root package name */
        private String f59406b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.b.a
        public g0.f.d.e.b a() {
            String str;
            String str2 = this.f59405a;
            if (str2 != null && (str = this.f59406b) != null) {
                return new y(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f59405a == null) {
                sb.append(ProtectedSandApp.s("ｧ"));
            }
            if (this.f59406b == null) {
                sb.append(ProtectedSandApp.s("ｨ"));
            }
            throw new IllegalStateException(c.a(ProtectedSandApp.s("ｩ"), sb));
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.b.a
        public g0.f.d.e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ｪ"));
            }
            this.f59405a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.b.a
        public g0.f.d.e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException(ProtectedSandApp.s("ｫ"));
            }
            this.f59406b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.b
    @o0
    public String b() {
        return this.f59403a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.g0.f.d.e.b
    @o0
    public String c() {
        return this.f59404b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.f.d.e.b)) {
            return false;
        }
        g0.f.d.e.b bVar = (g0.f.d.e.b) obj;
        return this.f59403a.equals(bVar.b()) && this.f59404b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f59403a.hashCode() ^ 1000003) * 1000003) ^ this.f59404b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ｬ"));
        sb.append(this.f59403a);
        sb.append(ProtectedSandApp.s("ｭ"));
        return android.support.v4.media.c.a(sb, this.f59404b, ProtectedSandApp.s("ｮ"));
    }

    private y(String str, String str2) {
        this.f59403a = str;
        this.f59404b = str2;
    }
}
