package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final int f40759a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40760b;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private int f40761a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f40762b = 0;

        private a() {
        }

        @androidx.annotation.o0
        public x a() {
            int i4 = this.f40761a;
            if (i4 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\u05f5"));
            }
            if (i4 == 5 && this.f40762b == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("״"));
            }
            return new x(this, null);
        }

        @androidx.annotation.o0
        public a b(int i4) {
            this.f40761a = i4;
            return this;
        }

        @g5
        @androidx.annotation.o0
        public a c(int i4) {
            this.f40762b = i4;
            return this;
        }

        /* synthetic */ a(l4 l4Var) {
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @g5
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int K0 = 0;
        public static final int L0 = 1;
        public static final int M0 = 2;
    }

    /* synthetic */ x(a aVar, l4 l4Var) {
        this.f40759a = aVar.f40761a;
        this.f40760b = aVar.f40762b;
    }

    @androidx.annotation.o0
    public static a c() {
        return new a(null);
    }

    public int a() {
        return this.f40759a;
    }

    @g5
    public int b() {
        return this.f40760b;
    }
}
