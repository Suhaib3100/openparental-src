package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.e1;
import androidx.annotation.n1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    /* renamed from: com.google.firebase.analytics.connector.a$a, reason: collision with other inner class name */
    public interface InterfaceC0192a {
        @KeepForSdk
        void a();

        @KeepForSdk
        void b();

        @KeepForSdk
        void c(@o0 Set<String> set);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    public interface b {
        @KeepForSdk
        void a(int i5, @q0 Bundle bundle);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@19.0.0 */
    @KeepForSdk
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        @KeepForSdk
        public String f15285a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        @KeepForSdk
        public String f15286b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Object f15287c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f15288d;

        /* renamed from: e, reason: collision with root package name */
        @KeepForSdk
        public long f15289e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f15290f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Bundle f15291g;

        /* renamed from: h, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f15292h;

        /* renamed from: i, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Bundle f15293i;

        /* renamed from: j, reason: collision with root package name */
        @KeepForSdk
        public long f15294j;

        /* renamed from: k, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f15295k;

        /* renamed from: l, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Bundle f15296l;

        /* renamed from: m, reason: collision with root package name */
        @KeepForSdk
        public long f15297m;

        /* renamed from: n, reason: collision with root package name */
        @KeepForSdk
        public boolean f15298n;

        /* renamed from: o, reason: collision with root package name */
        @KeepForSdk
        public long f15299o;
    }

    @n1
    @o0
    @KeepForSdk
    Map<String, Object> a(boolean z5);

    @KeepForSdk
    void b(@o0 c cVar);

    @KeepForSdk
    void c(@o0 String str, @o0 String str2, @q0 Bundle bundle);

    @KeepForSdk
    void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @q0 String str2, @q0 Bundle bundle);

    @n1
    @KeepForSdk
    int d(@e1(min = 1) @o0 String str);

    @n1
    @o0
    @KeepForSdk
    List<c> e(@o0 String str, @e1(max = 23, min = 1) @q0 String str2);

    @KeepForSdk
    void f(@o0 String str, @o0 String str2, @o0 Object obj);

    @q0
    @a2.a
    @KeepForSdk
    InterfaceC0192a g(@o0 String str, @o0 b bVar);
}
