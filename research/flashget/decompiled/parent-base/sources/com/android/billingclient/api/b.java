package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f40286a;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f40287a;

        private a() {
            throw null;
        }

        @androidx.annotation.o0
        public b a() {
            String str = this.f40287a;
            if (str == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ͩ"));
            }
            b bVar = new b();
            bVar.f40286a = str;
            return bVar;
        }

        @androidx.annotation.o0
        public a b(@androidx.annotation.o0 String str) {
            this.f40287a = str;
            return this;
        }

        /* synthetic */ a(h1 h1Var) {
        }
    }

    private b() {
        throw null;
    }

    @androidx.annotation.o0
    public static a b() {
        return new a();
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40286a;
    }

    /* synthetic */ b(h1 h1Var) {
    }
}
