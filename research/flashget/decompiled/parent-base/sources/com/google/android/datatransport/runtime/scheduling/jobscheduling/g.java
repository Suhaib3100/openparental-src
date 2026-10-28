package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.x0;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: SchedulerConfig.java */
@b9.c
/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final long f52137a = 86400000;

    /* renamed from: b, reason: collision with root package name */
    private static final long f52138b = 30000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f52139c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private static final long f52140d = 10000;

    /* compiled from: SchedulerConfig.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.datatransport.runtime.time.a f52141a;

        /* renamed from: b, reason: collision with root package name */
        private Map<com.google.android.datatransport.h, b> f52142b = new HashMap();

        public a a(com.google.android.datatransport.h hVar, b bVar) {
            this.f52142b.put(hVar, bVar);
            return this;
        }

        public g b() {
            if (this.f52141a == null) {
                throw new NullPointerException(ProtectedSandApp.s("올"));
            }
            if (this.f52142b.keySet().size() < com.google.android.datatransport.h.values().length) {
                throw new IllegalStateException(ProtectedSandApp.s("옫"));
            }
            Map<com.google.android.datatransport.h, b> map = this.f52142b;
            this.f52142b = new HashMap();
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(this.f52141a, map);
        }

        public a c(com.google.android.datatransport.runtime.time.a aVar) {
            this.f52141a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @b9.c
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @c.a
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j4);

            public abstract a c(Set<c> set);

            public abstract a d(long j4);
        }

        public static a a() {
            return new d.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    /* compiled from: SchedulerConfig.java */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i4, long j4) {
        return (long) (Math.pow(3.0d, i4 - 1) * j4 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j4 > 1 ? j4 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static g d(com.google.android.datatransport.runtime.time.a aVar, Map<com.google.android.datatransport.h, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(aVar, map);
    }

    public static g f(com.google.android.datatransport.runtime.time.a aVar) {
        return new a().a(com.google.android.datatransport.h.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(com.google.android.datatransport.h.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(com.google.android.datatransport.h.VERY_LOW, b.a().b(86400000L).d(86400000L).c(j(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @x0(api = 21)
    private void k(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    @x0(api = 21)
    public JobInfo.Builder c(JobInfo.Builder builder, com.google.android.datatransport.h hVar, long j4, int i4) {
        builder.setMinimumLatency(h(hVar, j4, i4));
        k(builder, i().get(hVar).c());
        return builder;
    }

    abstract com.google.android.datatransport.runtime.time.a e();

    public Set<c> g(com.google.android.datatransport.h hVar) {
        return i().get(hVar).c();
    }

    public long h(com.google.android.datatransport.h hVar, long j4, int i4) {
        long a5 = j4 - e().a();
        b bVar = i().get(hVar);
        return Math.min(Math.max(a(i4, bVar.b()), a5), bVar.d());
    }

    abstract Map<com.google.android.datatransport.h, b> i();
}
