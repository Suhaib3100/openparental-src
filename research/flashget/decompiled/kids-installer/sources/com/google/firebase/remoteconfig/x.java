package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RemoteConfigComponent.java */
@KeepForSdk
/* loaded from: classes2.dex */
public class x {

    /* renamed from: m, reason: collision with root package name */
    public static final long f18474m = 60;

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Map<String, p> f18481a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f18482b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f18483c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g f18484d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.k f18485e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.abt.c f18486f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private final o2.b<com.google.firebase.analytics.connector.a> f18487g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18488h;

    /* renamed from: i, reason: collision with root package name */
    @b0("this")
    private Map<String, String> f18489i;

    /* renamed from: p, reason: collision with root package name */
    @m1
    public static final String f18477p = ProtectedSandApp.s("ᨄ");

    /* renamed from: j, reason: collision with root package name */
    public static final String f18471j = ProtectedSandApp.s("ᨅ");

    /* renamed from: k, reason: collision with root package name */
    public static final String f18472k = ProtectedSandApp.s("ᨆ");

    /* renamed from: l, reason: collision with root package name */
    public static final String f18473l = ProtectedSandApp.s("ᨇ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f18475n = ProtectedSandApp.s("ᨈ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f18476o = ProtectedSandApp.s("ᨉ");

    /* renamed from: q, reason: collision with root package name */
    private static final Clock f18478q = DefaultClock.getInstance();

    /* renamed from: r, reason: collision with root package name */
    private static final Random f18479r = new Random();

    /* renamed from: s, reason: collision with root package name */
    private static final Map<String, p> f18480s = new HashMap();

    /* compiled from: RemoteConfigComponent.java */
    /* loaded from: classes3.dex */
    private static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicReference<a> f18490a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f18490a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (android.view.x.a(atomicReference, null, aVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z5) {
            x.p(z5);
        }
    }

    x(Context context, @b2.b ScheduledExecutorService scheduledExecutorService, com.google.firebase.g gVar, com.google.firebase.installations.k kVar, com.google.firebase.abt.c cVar, o2.b<com.google.firebase.analytics.connector.a> bVar) {
        this(context, scheduledExecutorService, gVar, kVar, cVar, bVar, true);
    }

    public static /* synthetic */ com.google.firebase.analytics.connector.a a() {
        return null;
    }

    private com.google.firebase.remoteconfig.internal.g e(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.g.j(this.f18483c, com.google.firebase.remoteconfig.internal.v.d(this.f18482b, String.format(ProtectedSandApp.s("ᨋ"), ProtectedSandApp.s("ᨊ"), this.f18488h, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.p i(com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2) {
        return new com.google.firebase.remoteconfig.internal.p(this.f18483c, gVar, gVar2);
    }

    @m1
    static com.google.firebase.remoteconfig.internal.q j(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.q(context.getSharedPreferences(String.format(ProtectedSandApp.s("ᨎ"), ProtectedSandApp.s("ᨌ"), str, str2, ProtectedSandApp.s("ᨍ")), 0));
    }

    @q0
    private static com.google.firebase.remoteconfig.internal.z k(com.google.firebase.g gVar, String str, o2.b<com.google.firebase.analytics.connector.a> bVar) {
        if (n(gVar) && str.equals(ProtectedSandApp.s("ᨏ"))) {
            return new com.google.firebase.remoteconfig.internal.z(bVar);
        }
        return null;
    }

    private static boolean m(com.google.firebase.g gVar, String str) {
        return str.equals(ProtectedSandApp.s("ᨐ")) && n(gVar);
    }

    private static boolean n(com.google.firebase.g gVar) {
        return gVar.r().equals(ProtectedSandApp.s("ᨑ"));
    }

    private static /* synthetic */ com.google.firebase.analytics.connector.a o() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void p(boolean z5) {
        synchronized (x.class) {
            Iterator<p> it = f18480s.values().iterator();
            while (it.hasNext()) {
                it.next().M(z5);
            }
        }
    }

    @m1
    synchronized p c(com.google.firebase.g gVar, String str, com.google.firebase.installations.k kVar, com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.g gVar2, com.google.firebase.remoteconfig.internal.g gVar3, com.google.firebase.remoteconfig.internal.g gVar4, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.p pVar, com.google.firebase.remoteconfig.internal.q qVar) {
        if (!this.f18481a.containsKey(str)) {
            p pVar2 = new p(this.f18482b, gVar, kVar, m(gVar, str) ? cVar : null, executor, gVar2, gVar3, gVar4, nVar, pVar, qVar, l(gVar, kVar, nVar, gVar3, this.f18482b, str, qVar));
            pVar2.Q();
            this.f18481a.put(str, pVar2);
            f18480s.put(str, pVar2);
        }
        return this.f18481a.get(str);
    }

    @KeepForSdk
    @m1
    public synchronized p d(String str) {
        com.google.firebase.remoteconfig.internal.g e6;
        com.google.firebase.remoteconfig.internal.g e7;
        com.google.firebase.remoteconfig.internal.g e8;
        com.google.firebase.remoteconfig.internal.q j5;
        com.google.firebase.remoteconfig.internal.p i5;
        e6 = e(str, ProtectedSandApp.s("ᨒ"));
        e7 = e(str, ProtectedSandApp.s("ᨓ"));
        e8 = e(str, ProtectedSandApp.s("ᨔ"));
        j5 = j(this.f18482b, this.f18488h, str);
        i5 = i(e7, e8);
        final com.google.firebase.remoteconfig.internal.z k5 = k(this.f18484d, str, this.f18487g);
        if (k5 != null) {
            i5.b(new BiConsumer() { // from class: com.google.firebase.remoteconfig.v
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    com.google.firebase.remoteconfig.internal.z.this.a((String) obj, (com.google.firebase.remoteconfig.internal.h) obj2);
                }
            });
        }
        return c(this.f18484d, str, this.f18485e, this.f18486f, this.f18483c, e6, e7, e8, g(str, e6, j5), i5, j5);
    }

    p f() {
        return d(ProtectedSandApp.s("ᨕ"));
    }

    @m1
    synchronized com.google.firebase.remoteconfig.internal.n g(String str, com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.q qVar) {
        return new com.google.firebase.remoteconfig.internal.n(this.f18485e, n(this.f18484d) ? this.f18487g : new o2.b() { // from class: com.google.firebase.remoteconfig.u
            @Override // o2.b
            public final Object get() {
                return x.a();
            }
        }, this.f18483c, f18478q, f18479r, gVar, h(this.f18484d.s().i(), str, qVar), qVar, this.f18489i);
    }

    @m1
    ConfigFetchHttpClient h(String str, String str2, com.google.firebase.remoteconfig.internal.q qVar) {
        return new ConfigFetchHttpClient(this.f18482b, this.f18484d.s().j(), str, str2, qVar.c(), qVar.c());
    }

    synchronized com.google.firebase.remoteconfig.internal.r l(com.google.firebase.g gVar, com.google.firebase.installations.k kVar, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.g gVar2, Context context, String str, com.google.firebase.remoteconfig.internal.q qVar) {
        return new com.google.firebase.remoteconfig.internal.r(gVar, kVar, nVar, gVar2, context, str, qVar, this.f18483c);
    }

    @m1
    public synchronized void q(Map<String, String> map) {
        this.f18489i = map;
    }

    @m1
    protected x(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.g gVar, com.google.firebase.installations.k kVar, com.google.firebase.abt.c cVar, o2.b<com.google.firebase.analytics.connector.a> bVar, boolean z5) {
        this.f18481a = new HashMap();
        this.f18489i = new HashMap();
        this.f18482b = context;
        this.f18483c = scheduledExecutorService;
        this.f18484d = gVar;
        this.f18485e = kVar;
        this.f18486f = cVar;
        this.f18487g = bVar;
        this.f18488h = gVar.s().j();
        a.b(context);
        if (z5) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.w
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return x.this.f();
                }
            });
        }
    }
}
