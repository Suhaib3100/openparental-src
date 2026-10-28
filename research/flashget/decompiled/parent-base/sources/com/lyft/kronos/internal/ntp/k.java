package com.lyft.kronos.internal.ntp;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lyft.kronos.internal.ntp.e;
import com.lyft.kronos.internal.ntp.h;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: SntpService.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\"Ba\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010&R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\"\u00102\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010.0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00104R\u001c\u00109\u001a\n /*\u0004\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u0004\u0018\u00010:8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010;R\u0014\u0010>\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010=¨\u0006?"}, d2 = {"Lcom/lyft/kronos/internal/ntp/k;", "Lcom/lyft/kronos/internal/ntp/h;", "Lcom/lyft/kronos/internal/ntp/e;", "sntpClient", "Lhb/c;", "deviceClock", "Lcom/lyft/kronos/internal/ntp/f;", "responseCache", "Lhb/i;", "ntpSyncListener", "", "", "ntpHosts", "", "requestTimeoutMs", "minWaitTimeBetweenSyncMs", "cacheExpirationMs", "maxNtpResponseTimeMs", "<init>", "(Lcom/lyft/kronos/internal/ntp/e;Lhb/c;Lcom/lyft/kronos/internal/ntp/f;Lhb/i;Ljava/util/List;JJJJ)V", "Lkotlin/k2;", "g", "()V", "host", "", "k", "(Ljava/lang/String;)Z", "Lhb/g;", "c", "()Lhb/g;", "d", "shutdown", "b", "()Z", "a", "Lcom/lyft/kronos/internal/ntp/e;", "Lhb/c;", "Lcom/lyft/kronos/internal/ntp/f;", "Lhb/i;", "e", "Ljava/util/List;", "f", "J", "h", "i", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/lyft/kronos/internal/ntp/k$a;", "kotlin.jvm.PlatformType", "j", "Ljava/util/concurrent/atomic/AtomicReference;", "state", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "cachedSyncTime", "Ljava/util/concurrent/ExecutorService;", "l", "Ljava/util/concurrent/ExecutorService;", "executor", "Lcom/lyft/kronos/internal/ntp/e$b;", "()Lcom/lyft/kronos/internal/ntp/e$b;", "response", "()J", "cacheSyncAge", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final e sntpClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final hb.c deviceClock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final f responseCache;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private final hb.i ntpSyncListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private final List<String> ntpHosts;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long requestTimeoutMs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long minWaitTimeBetweenSyncMs;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long cacheExpirationMs;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long maxNtpResponseTimeMs;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicReference<a> state;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicLong cachedSyncTime;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ExecutorService executor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SntpService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/lyft/kronos/internal/ntp/k$a;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "SYNCING", "STOPPED", "kronos-java"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a IDLE = new a(ProtectedSandApp.s("ᠹ\u0001"), 0);
        public static final a SYNCING = new a(ProtectedSandApp.s("ᠺ\u0001"), 1);
        public static final a STOPPED = new a(ProtectedSandApp.s("ᠻ\u0001"), 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{IDLE, SYNCING, STOPPED};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.c.c($values);
        }

        private a(String str, int i4) {
        }

        @l
        public static kotlin.enums.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public k(@l e eVar, @l hb.c cVar, @l f fVar, @m hb.i iVar, @l List<String> list) {
        this(eVar, cVar, fVar, iVar, list, 0L, 0L, 0L, 0L, 480, null);
        l0.p(eVar, ProtectedSandApp.s("ᠼ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ᠽ\u0001"));
        l0.p(fVar, ProtectedSandApp.s("ᠾ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᠿ\u0001"));
    }

    private final void g() {
        if (this.state.get() == a.STOPPED) {
            throw new IllegalStateException(ProtectedSandApp.s("ᡀ\u0001"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread h(Runnable runnable) {
        return new Thread(runnable, ProtectedSandApp.s("ᡁ\u0001"));
    }

    private final long i() {
        return this.deviceClock.f() - this.cachedSyncTime.get();
    }

    private final e.b j() {
        e.b bVar = this.responseCache.get();
        if (this.state.get() != a.IDLE || bVar == null || bVar.f()) {
            return bVar;
        }
        this.responseCache.clear();
        return null;
    }

    private final boolean k(String host) {
        String s4 = ProtectedSandApp.s("ᡂ\u0001");
        String s5 = ProtectedSandApp.s("ᡃ\u0001");
        AtomicReference<a> atomicReference = this.state;
        a aVar = a.SYNCING;
        if (atomicReference.getAndSet(aVar) == aVar) {
            return false;
        }
        long f4 = this.deviceClock.f();
        hb.i iVar = this.ntpSyncListener;
        if (iVar != null) {
            iVar.a(host);
        }
        try {
            e.b d5 = this.sntpClient.d(host, Long.valueOf(this.requestTimeoutMs));
            if (d5.a() < 0) {
                throw new NTPSyncException(s5 + d5.a() + ProtectedSandApp.s("ᡇ\u0001") + host);
            }
            long f5 = this.deviceClock.f() - f4;
            if (f5 > this.maxNtpResponseTimeMs) {
                throw new NTPSyncException(s4 + host + ProtectedSandApp.s("ᡄ\u0001") + f5 + ProtectedSandApp.s("ᡅ\u0001") + this.maxNtpResponseTimeMs + ProtectedSandApp.s("ᡆ\u0001"));
            }
            f fVar = this.responseCache;
            l0.m(d5);
            fVar.a(d5);
            long d6 = d5.d();
            hb.i iVar2 = this.ntpSyncListener;
            if (iVar2 != null) {
                iVar2.c(d6, f5);
            }
            this.state.set(a.IDLE);
            this.cachedSyncTime.set(this.deviceClock.f());
            return true;
        } catch (Throwable th) {
            try {
                hb.i iVar3 = this.ntpSyncListener;
                if (iVar3 != null) {
                    iVar3.b(host, th);
                }
                return false;
            } finally {
                this.state.set(a.IDLE);
                this.cachedSyncTime.set(this.deviceClock.f());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(k kVar) {
        l0.p(kVar, ProtectedSandApp.s("ᡈ\u0001"));
        kVar.b();
    }

    @Override // com.lyft.kronos.internal.ntp.h
    public boolean b() {
        g();
        Iterator<String> it = this.ntpHosts.iterator();
        while (it.hasNext()) {
            if (k(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.lyft.kronos.internal.ntp.h
    @m
    public hb.g c() {
        g();
        e.b j4 = j();
        if (j4 == null) {
            if (i() < this.minWaitTimeBetweenSyncMs) {
                return null;
            }
            d();
            return null;
        }
        long e4 = j4.e();
        if (e4 >= this.cacheExpirationMs && i() >= this.minWaitTimeBetweenSyncMs) {
            d();
        }
        return new hb.g(j4.a(), Long.valueOf(e4));
    }

    @Override // com.lyft.kronos.internal.ntp.h
    public void d() {
        g();
        if (this.state.get() != a.SYNCING) {
            this.executor.submit(new Runnable() { // from class: com.lyft.kronos.internal.ntp.i
                @Override // java.lang.Runnable
                public final void run() {
                    k.l(k.this);
                }
            });
        }
    }

    @Override // com.lyft.kronos.internal.ntp.h
    public long e() {
        return h.a.a(this);
    }

    @Override // com.lyft.kronos.internal.ntp.h
    public void shutdown() {
        g();
        this.state.set(a.STOPPED);
        this.executor.shutdown();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public k(@l e eVar, @l hb.c cVar, @l f fVar, @m hb.i iVar, @l List<String> list, long j4) {
        this(eVar, cVar, fVar, iVar, list, j4, 0L, 0L, 0L, net.minidev.json.parser.f.f81763q, null);
        l0.p(eVar, ProtectedSandApp.s("ᠼ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ᠽ\u0001"));
        l0.p(fVar, ProtectedSandApp.s("ᠾ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᠿ\u0001"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public k(@l e eVar, @l hb.c cVar, @l f fVar, @m hb.i iVar, @l List<String> list, long j4, long j5) {
        this(eVar, cVar, fVar, iVar, list, j4, j5, 0L, 0L, 384, null);
        l0.p(eVar, ProtectedSandApp.s("ᠼ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ᠽ\u0001"));
        l0.p(fVar, ProtectedSandApp.s("ᠾ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᠿ\u0001"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kd.j
    public k(@l e eVar, @l hb.c cVar, @l f fVar, @m hb.i iVar, @l List<String> list, long j4, long j5, long j6) {
        this(eVar, cVar, fVar, iVar, list, j4, j5, j6, 0L, 256, null);
        l0.p(eVar, ProtectedSandApp.s("ᠼ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ᠽ\u0001"));
        l0.p(fVar, ProtectedSandApp.s("ᠾ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᠿ\u0001"));
    }

    @kd.j
    public k(@l e eVar, @l hb.c cVar, @l f fVar, @m hb.i iVar, @l List<String> list, long j4, long j5, long j6, long j7) {
        l0.p(eVar, ProtectedSandApp.s("ᠼ\u0001"));
        l0.p(cVar, ProtectedSandApp.s("ᠽ\u0001"));
        l0.p(fVar, ProtectedSandApp.s("ᠾ\u0001"));
        l0.p(list, ProtectedSandApp.s("ᠿ\u0001"));
        this.sntpClient = eVar;
        this.deviceClock = cVar;
        this.responseCache = fVar;
        this.ntpSyncListener = iVar;
        this.ntpHosts = list;
        this.requestTimeoutMs = j4;
        this.minWaitTimeBetweenSyncMs = j5;
        this.cacheExpirationMs = j6;
        this.maxNtpResponseTimeMs = j7;
        this.state = new AtomicReference<>(a.IDLE);
        this.cachedSyncTime = new AtomicLong(0L);
        this.executor = Executors.newSingleThreadExecutor(new j());
    }

    public /* synthetic */ k(e eVar, hb.c cVar, f fVar, hb.i iVar, List list, long j4, long j5, long j6, long j7, int i4, w wVar) {
        this(eVar, cVar, fVar, iVar, list, (i4 & 32) != 0 ? hb.e.f74129a.e() : j4, (i4 & 64) != 0 ? hb.e.f74129a.c() : j5, (i4 & 128) != 0 ? hb.e.f74129a.a() : j6, (i4 & 256) != 0 ? hb.e.f74129a.b() : j7);
    }
}
