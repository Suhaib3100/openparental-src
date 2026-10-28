package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.internal.play_billing.zzc;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private int f40776a;

    /* renamed from: b, reason: collision with root package name */
    private int f40777b;

    /* renamed from: c, reason: collision with root package name */
    private String f40778c;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f40779a;

        /* renamed from: b, reason: collision with root package name */
        private int f40780b = 0;

        /* renamed from: c, reason: collision with root package name */
        private String f40781c = "";

        private a() {
        }

        @androidx.annotation.o0
        public y a() {
            y yVar = new y();
            yVar.f40776a = this.f40779a;
            yVar.f40777b = this.f40780b;
            yVar.f40778c = this.f40781c;
            return yVar;
        }

        @androidx.annotation.o0
        public a b(@androidx.annotation.o0 String str) {
            this.f40781c = str;
            return this;
        }

        @o6
        @androidx.annotation.o0
        public a c(int i4) {
            this.f40780b = i4;
            return this;
        }

        @androidx.annotation.o0
        public a d(int i4) {
            this.f40779a = i4;
            return this;
        }

        /* synthetic */ a(m4 m4Var) {
        }
    }

    @androidx.annotation.o0
    public static a d() {
        return new a(null);
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40778c;
    }

    @o6
    public int b() {
        return this.f40777b;
    }

    public int c() {
        return this.f40776a;
    }

    @androidx.annotation.o0
    public String toString() {
        return androidx.fragment.app.y.a(ProtectedSandApp.s("\u0605"), zzc.zzk(this.f40776a), ProtectedSandApp.s("؆"), this.f40778c);
    }
}
