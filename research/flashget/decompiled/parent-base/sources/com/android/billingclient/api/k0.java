package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@g5
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private final Locale f40441a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40442b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.o0
    private final String f40443c;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        private Locale f40444a;

        /* renamed from: b, reason: collision with root package name */
        private int f40445b = 0;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.o0
        private String f40446c;

        private a() {
        }

        @androidx.annotation.o0
        public k0 a() {
            if (this.f40445b != 5) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ӝ"));
            }
            if (this.f40446c != null) {
                return new k0(this);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("Ӝ"));
        }

        @androidx.annotation.o0
        public a b(int i4) {
            this.f40445b = i4;
            return this;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.o0 String str) {
            this.f40446c = str;
            return this;
        }

        @androidx.annotation.o0
        public a d(@androidx.annotation.q0 Locale locale) {
            this.f40444a = locale;
            return this;
        }

        /* synthetic */ a(c5 c5Var) {
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        @androidx.annotation.o0
        public static final String S0 = ProtectedSandApp.s("Ӟ");

        @androidx.annotation.o0
        public static final String R0 = ProtectedSandApp.s("ӟ");

        @androidx.annotation.o0
        public static final String Q0 = ProtectedSandApp.s("Ӡ");
    }

    @androidx.annotation.o0
    public static a d() {
        return new a(null);
    }

    public int a() {
        return this.f40442b;
    }

    @androidx.annotation.o0
    public String b() {
        return this.f40443c;
    }

    @androidx.annotation.q0
    public Locale c() {
        return this.f40441a;
    }

    private k0(a aVar) {
        this.f40441a = aVar.f40444a;
        this.f40442b = aVar.f40445b;
        this.f40443c = aVar.f40446c;
    }
}
