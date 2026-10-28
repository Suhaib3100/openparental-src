package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private String f40789a;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f40790a;

        private a() {
            throw null;
        }

        @androidx.annotation.o0
        public z a() {
            String str = this.f40790a;
            if (str == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("؇"));
            }
            z zVar = new z();
            zVar.f40789a = str;
            return zVar;
        }

        @androidx.annotation.o0
        public a b(@androidx.annotation.o0 String str) {
            this.f40790a = str;
            return this;
        }

        /* synthetic */ a(o4 o4Var) {
        }
    }

    private z() {
        throw null;
    }

    @androidx.annotation.o0
    public static a b() {
        return new a();
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40789a;
    }

    /* synthetic */ z(o4 o4Var) {
    }
}
