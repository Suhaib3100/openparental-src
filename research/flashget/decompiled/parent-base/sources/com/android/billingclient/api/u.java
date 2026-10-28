package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@g5
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final int f40717a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40718b;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f40719a;

        /* renamed from: b, reason: collision with root package name */
        private String f40720b;

        private a() {
            throw null;
        }

        @androidx.annotation.o0
        public u a() {
            int i4 = this.f40719a;
            if (i4 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ם"));
            }
            if (i4 != 5) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ל"));
            }
            if (this.f40720b != null) {
                return new u(this);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("כ"));
        }

        @androidx.annotation.o0
        public a b(int i4) {
            this.f40719a = i4;
            return this;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.o0 String str) {
            this.f40720b = str;
            return this;
        }

        /* synthetic */ a(k4 k4Var) {
        }
    }

    @androidx.annotation.o0
    public static a c() {
        return new a();
    }

    public int a() {
        return this.f40717a;
    }

    @androidx.annotation.o0
    public String b() {
        return this.f40718b;
    }

    private u(a aVar) {
        this.f40717a = aVar.f40719a;
        this.f40718b = aVar.f40720b;
    }
}
