package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@s6
/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40643a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40644b;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @s6
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f40645a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f40646b;

        private a() {
        }

        @androidx.annotation.o0
        public s0 a() {
            if (!this.f40645a) {
                throw new IllegalArgumentException(ProtectedSandApp.s("։"));
            }
            return new s0(true, this.f40646b);
        }

        @androidx.annotation.o0
        public a b() {
            this.f40645a = true;
            return this;
        }

        @androidx.annotation.o0
        public a c() {
            this.f40646b = true;
            return this;
        }

        a(i5 i5Var) {
        }
    }

    private s0(boolean z4, boolean z5) {
        this.f40643a = z4;
        this.f40644b = z5;
    }

    @androidx.annotation.o0
    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f40643a;
    }

    boolean b() {
        return this.f40644b;
    }
}
