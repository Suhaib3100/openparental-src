package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzca;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final zzca f40296a;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private zzca f40297a;

        private a() {
            throw null;
        }

        @androidx.annotation.o0
        public b1 a() {
            if (this.f40297a != null) {
                return new b1(this, null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ͮ"));
        }

        @androidx.annotation.o0
        public a b(@androidx.annotation.o0 List<b> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ͱ"));
            }
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                if (!ProtectedSandApp.s("ͯ").equals(bVar.d())) {
                    hashSet.add(bVar.d());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException(ProtectedSandApp.s("Ͱ"));
            }
            this.f40297a = zzca.zzj(list);
            return this;
        }

        /* synthetic */ a(t5 t5Var) {
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        @f6
        private final String f40298a;

        /* renamed from: b, reason: collision with root package name */
        private final String f40299b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40300c;

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            @androidx.annotation.q0
            @f6
            private String f40301a;

            /* renamed from: b, reason: collision with root package name */
            private String f40302b;

            /* renamed from: c, reason: collision with root package name */
            private String f40303c;

            private a() {
                throw null;
            }

            @androidx.annotation.o0
            public b a() {
                String str = this.f40303c;
                if (ProtectedSandApp.s("Ͳ").equals(str)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("͵"));
                }
                if (this.f40302b == null) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ʹ"));
                }
                if (str != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("ͳ"));
            }

            @androidx.annotation.o0
            @f6
            public a b(@androidx.annotation.o0 String str) {
                this.f40301a = str;
                return this;
            }

            @androidx.annotation.o0
            public a c(@androidx.annotation.o0 String str) {
                this.f40302b = str;
                return this;
            }

            @androidx.annotation.o0
            public a d(@androidx.annotation.o0 String str) {
                this.f40303c = str;
                return this;
            }

            /* synthetic */ a(t5 t5Var) {
            }
        }

        /* synthetic */ b(a aVar, t5 t5Var) {
            this.f40299b = aVar.f40302b;
            this.f40300c = aVar.f40303c;
            this.f40298a = aVar.f40301a;
        }

        @androidx.annotation.o0
        public static a b() {
            return new a();
        }

        @androidx.annotation.q0
        @f6
        public String a() {
            return this.f40298a;
        }

        @androidx.annotation.o0
        public final String c() {
            return this.f40299b;
        }

        @androidx.annotation.o0
        public final String d() {
            return this.f40300c;
        }
    }

    /* synthetic */ b1(a aVar, t5 t5Var) {
        this.f40296a = aVar.f40297a;
    }

    @androidx.annotation.o0
    public static a a() {
        return new a();
    }

    public final zzca b() {
        return this.f40296a;
    }

    @androidx.annotation.o0
    public final String c() {
        return ((b) this.f40296a.get(0)).d();
    }
}
