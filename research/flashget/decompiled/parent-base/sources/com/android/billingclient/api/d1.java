package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40338a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40339b;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f40340a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f40341b = false;

        private a() {
        }

        @androidx.annotation.o0
        public d1 a() {
            String str = this.f40340a;
            if (str == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("Α"));
            }
            if (!this.f40341b || str.equals(ProtectedSandApp.s("Ώ"))) {
                return new d1(this, null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ΐ"));
        }

        @androidx.annotation.o0
        public a b(boolean z4) {
            this.f40341b = z4;
            return this;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.o0 String str) {
            this.f40340a = str;
            return this;
        }

        /* synthetic */ a(u5 u5Var) {
        }
    }

    /* synthetic */ d1(a aVar, u5 u5Var) {
        this.f40338a = aVar.f40340a;
        this.f40339b = aVar.f40341b;
    }

    @androidx.annotation.o0
    public static a b() {
        return new a(null);
    }

    public boolean a() {
        return this.f40339b;
    }

    @androidx.annotation.o0
    public final String c() {
        return this.f40338a;
    }
}
