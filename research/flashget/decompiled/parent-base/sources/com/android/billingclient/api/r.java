package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final int f40632a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private final a f40633b;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @g5
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f40634a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f40635b;

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @g5
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.android.billingclient.api.r$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0668a {
            public static final int H0 = 0;
            public static final int I0 = 1;
            public static final int J0 = 2;
        }

        a(int i4, boolean z4) {
            this.f40634a = i4;
            this.f40635b = z4;
        }

        public int a() {
            return this.f40634a;
        }

        public boolean b() {
            return this.f40635b;
        }

        public boolean equals(@androidx.annotation.q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40634a == aVar.f40634a && this.f40635b == aVar.f40635b;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f40634a), Boolean.valueOf(this.f40635b));
        }
    }

    r(int i4) {
        this.f40632a = i4;
        this.f40633b = null;
    }

    @androidx.annotation.q0
    @g5
    public a a() {
        return this.f40633b;
    }

    public int b() {
        return this.f40632a;
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f40632a == rVar.f40632a && Objects.equals(this.f40633b, rVar.f40633b);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f40632a), this.f40633b);
    }

    r(int i4, @androidx.annotation.q0 a aVar) {
        this.f40632a = 5;
        this.f40633b = aVar;
    }
}
