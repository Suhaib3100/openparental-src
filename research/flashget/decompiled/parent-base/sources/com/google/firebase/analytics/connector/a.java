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

/* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
/* loaded from: classes6.dex */
public interface a {

    /* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
    @KeepForSdk
    /* renamed from: com.google.firebase.analytics.connector.a$a, reason: collision with other inner class name */
    public interface InterfaceC0895a {
        @KeepForSdk
        void a();

        @KeepForSdk
        void b();

        @KeepForSdk
        void c(@o0 Set<String> set);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
    @KeepForSdk
    public interface b {
        @KeepForSdk
        void a(int i4, @q0 Bundle bundle);
    }

    /* compiled from: com.google.firebase:firebase-measurement-connector@@20.0.1 */
    @KeepForSdk
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @o0
        @KeepForSdk
        public String f58364a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        @KeepForSdk
        public String f58365b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Object f58366c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f58367d;

        /* renamed from: e, reason: collision with root package name */
        @KeepForSdk
        public long f58368e;

        /* renamed from: f, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f58369f;

        /* renamed from: g, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Bundle f58370g;

        /* renamed from: h, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f58371h;

        /* renamed from: i, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Bundle f58372i;

        /* renamed from: j, reason: collision with root package name */
        @KeepForSdk
        public long f58373j;

        /* renamed from: k, reason: collision with root package name */
        @q0
        @KeepForSdk
        public String f58374k;

        /* renamed from: l, reason: collision with root package name */
        @q0
        @KeepForSdk
        public Bundle f58375l;

        /* renamed from: m, reason: collision with root package name */
        @KeepForSdk
        public long f58376m;

        /* renamed from: n, reason: collision with root package name */
        @KeepForSdk
        public boolean f58377n;

        /* renamed from: o, reason: collision with root package name */
        @KeepForSdk
        public long f58378o;
    }

    @KeepForSdk
    void a(@o0 c cVar);

    @KeepForSdk
    void b(@o0 String str, @o0 String str2, @q0 Bundle bundle);

    @KeepForSdk
    void c(@o0 String str, @o0 String str2, @o0 Object obj);

    @KeepForSdk
    void clearConditionalUserProperty(@e1(max = 24, min = 1) @o0 String str, @q0 String str2, @q0 Bundle bundle);

    @n1
    @o0
    @KeepForSdk
    Map<String, Object> d(boolean z4);

    @n1
    @KeepForSdk
    int e(@e1(min = 1) @o0 String str);

    @n1
    @o0
    @KeepForSdk
    List<c> f(@o0 String str, @e1(max = 23, min = 1) @q0 String str2);

    @q0
    @k9.a
    @KeepForSdk
    InterfaceC0895a g(@o0 String str, @o0 b bVar);
}
