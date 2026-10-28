package com.android.billingclient.api;

import android.net.Uri;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@m6
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f40607a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40608b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40609c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40610d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40611e;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @m6
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Uri f40612a;

        /* renamed from: b, reason: collision with root package name */
        private int f40613b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f40614c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f40615d = 0;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private String f40616e;

        private a() {
        }

        @androidx.annotation.o0
        @m6
        public q0 a() {
            int i4 = this.f40614c;
            if (i4 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("բ"));
            }
            int i5 = this.f40613b;
            if (i5 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ա"));
            }
            if (i5 != 1 && i4 == 2) {
                throw new IllegalArgumentException(ProtectedSandApp.s("՛"));
            }
            int i6 = this.f40615d;
            if (i6 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ՠ"));
            }
            if (i6 == 5) {
                if (TextUtils.isEmpty(this.f40616e)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("՝"));
                }
                if (this.f40614c != 1) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("՜"));
                }
            }
            Uri uri = this.f40612a;
            if (uri == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("՟"));
            }
            if (uri.getScheme() != null) {
                return new q0(this, null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("՞"));
        }

        @androidx.annotation.o0
        @m6
        public a b(int i4) {
            this.f40615d = i4;
            return this;
        }

        @g5
        @androidx.annotation.o0
        public a c(@androidx.annotation.o0 String str) {
            this.f40616e = str;
            return this;
        }

        @androidx.annotation.o0
        @m6
        public a d(int i4) {
            this.f40613b = i4;
            return this;
        }

        @androidx.annotation.o0
        @m6
        public a e(int i4) {
            this.f40614c = i4;
            return this;
        }

        @androidx.annotation.o0
        @m6
        public a f(@androidx.annotation.o0 Uri uri) {
            this.f40612a = uri;
            return this;
        }

        /* synthetic */ a(h5 h5Var) {
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @m6
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {

        @m6
        public static final int X0 = 0;

        @m6
        public static final int Y0 = 1;

        @m6
        public static final int Z0 = 2;
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @m6
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {

        /* renamed from: a1, reason: collision with root package name */
        @m6
        public static final int f40617a1 = 0;

        /* renamed from: b1, reason: collision with root package name */
        @m6
        public static final int f40618b1 = 1;

        /* renamed from: c1, reason: collision with root package name */
        @n6
        public static final int f40619c1 = 2;
    }

    /* synthetic */ q0(a aVar, h5 h5Var) {
        this.f40607a = aVar.f40612a;
        this.f40608b = aVar.f40613b;
        this.f40609c = aVar.f40614c;
        this.f40610d = aVar.f40615d;
        this.f40611e = aVar.f40616e;
    }

    @androidx.annotation.o0
    @m6
    public static a f() {
        return new a(null);
    }

    @m6
    public int a() {
        return this.f40610d;
    }

    @androidx.annotation.q0
    @g5
    public String b() {
        return this.f40611e;
    }

    @m6
    public int c() {
        return this.f40608b;
    }

    @m6
    public int d() {
        return this.f40609c;
    }

    @androidx.annotation.o0
    @m6
    public Uri e() {
        return this.f40607a;
    }
}
