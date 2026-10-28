package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f40491a;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f40492a = new HashSet();

        @androidx.annotation.o0
        public a a() {
            this.f40492a.add(2);
            return this;
        }

        @androidx.annotation.o0
        public a b(int i4) {
            this.f40492a.add(Integer.valueOf(i4));
            return this;
        }

        @androidx.annotation.o0
        public m0 c() {
            return new m0(this.f40492a, null);
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int T0 = 0;
        public static final int U0 = 2;
    }

    /* synthetic */ m0(Set set, f5 f5Var) {
        this.f40491a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    @androidx.annotation.o0
    public static a a() {
        return new a();
    }

    final ArrayList b() {
        return this.f40491a;
    }
}
