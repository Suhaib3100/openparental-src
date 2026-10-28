package com.android.billingclient.api;

import android.net.Uri;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f40314a;

    /* renamed from: b, reason: collision with root package name */
    private final int f40315b;

    /* renamed from: c, reason: collision with root package name */
    private final int f40316c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40317d;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Uri f40318a;

        /* renamed from: b, reason: collision with root package name */
        private int f40319b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f40320c = 0;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private String f40321d;

        private a() {
        }

        @androidx.annotation.o0
        public c0 a() {
            int i4 = this.f40320c;
            if (i4 == 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("Ϳ"));
            }
            if (i4 == 5 && this.f40318a != null && TextUtils.isEmpty(this.f40321d)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ͽ"));
            }
            Uri uri = this.f40318a;
            if (uri == null || uri.getScheme() != null) {
                return new c0(this, null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s(";"));
        }

        @androidx.annotation.o0
        public a b(int i4) {
            this.f40320c = i4;
            return this;
        }

        @g5
        @androidx.annotation.o0
        public a c(@androidx.annotation.q0 String str) {
            this.f40321d = str;
            return this;
        }

        @androidx.annotation.o0
        public a d(int i4) {
            this.f40319b = i4;
            return this;
        }

        @androidx.annotation.o0
        public a e(@androidx.annotation.o0 Uri uri) {
            this.f40318a = uri;
            return this;
        }

        /* synthetic */ a(t4 t4Var) {
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int N0 = 0;
        public static final int O0 = 1;
        public static final int P0 = 2;
    }

    /* synthetic */ c0(a aVar, t4 t4Var) {
        this.f40314a = aVar.f40318a;
        this.f40315b = aVar.f40319b;
        this.f40316c = aVar.f40320c;
        this.f40317d = aVar.f40321d;
    }

    @androidx.annotation.o0
    public static a e() {
        return new a(null);
    }

    public int a() {
        return this.f40316c;
    }

    @androidx.annotation.q0
    @g5
    public String b() {
        return this.f40317d;
    }

    public int c() {
        return this.f40315b;
    }

    @androidx.annotation.q0
    public Uri d() {
        return this.f40314a;
    }
}
