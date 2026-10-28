package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: SchedulerConfig.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final long f12607a = 86400000;

    /* renamed from: b, reason: collision with root package name */
    private static final long f12608b = 30000;

    /* renamed from: c, reason: collision with root package name */
    private static final long f12609c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private static final long f12610d = 10000;

    /* compiled from: SchedulerConfig.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.datatransport.runtime.time.a f12611a;

        /* renamed from: b, reason: collision with root package name */
        private Map<com.google.android.datatransport.e, b> f12612b = new HashMap();

        public a a(com.google.android.datatransport.e eVar, b bVar) {
            this.f12612b.put(eVar, bVar);
            return this;
        }

        public g b() {
            if (this.f12611a == null) {
                throw new NullPointerException(ProtectedSandApp.s("ॆ"));
            }
            if (this.f12612b.keySet().size() < com.google.android.datatransport.e.values().length) {
                throw new IllegalStateException(ProtectedSandApp.s("ॅ"));
            }
            Map<com.google.android.datatransport.e, b> map = this.f12612b;
            this.f12612b = new HashMap();
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(this.f12611a, map);
        }

        public a c(com.google.android.datatransport.runtime.time.a aVar) {
            this.f12611a = aVar;
            return this;
        }
    }

    /* compiled from: SchedulerConfig.java */
    @AutoValue
    public static abstract class b {

        /* compiled from: SchedulerConfig.java */
        @AutoValue.Builder
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j5);

            public abstract a c(Set<c> set);

            public abstract a d(long j5);
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

    private long a(int i5, long j5) {
        return (long) (Math.pow(3.0d, i5 - 1) * j5 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j5 > 1 ? j5 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static g d(com.google.android.datatransport.runtime.time.a aVar, Map<com.google.android.datatransport.e, b> map) {
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(aVar, map);
    }

    public static g f(com.google.android.datatransport.runtime.time.a aVar) {
        return new a().a(com.google.android.datatransport.e.DEFAULT, b.a().b(f12608b).d(f12607a).a()).a(com.google.android.datatransport.e.HIGHEST, b.a().b(f12609c).d(f12607a).a()).a(com.google.android.datatransport.e.VERY_LOW, b.a().b(f12607a).d(f12607a).c(j(c.DEVICE_IDLE)).a()).c(aVar).b();
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
    public JobInfo.Builder c(JobInfo.Builder builder, com.google.android.datatransport.e eVar, long j5, int i5) {
        builder.setMinimumLatency(h(eVar, j5, i5));
        k(builder, i().get(eVar).c());
        return builder;
    }

    abstract com.google.android.datatransport.runtime.time.a e();

    public Set<c> g(com.google.android.datatransport.e eVar) {
        return i().get(eVar).c();
    }

    public long h(com.google.android.datatransport.e eVar, long j5, int i5) {
        long a6 = j5 - e().a();
        b bVar = i().get(eVar);
        return Math.min(Math.max(a(i5, bVar.b()), a6), bVar.d());
    }

    abstract Map<com.google.android.datatransport.e, b> i();
}
