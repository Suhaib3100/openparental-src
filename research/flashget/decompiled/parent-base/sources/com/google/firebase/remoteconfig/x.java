package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.animation.core.k1;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class x implements ia.a {

    /* renamed from: m, reason: collision with root package name */
    public static final long f60712m = 60;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private final Map<String, p> f60719a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f60720b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f60721c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.g f60722d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.k f60723e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.abt.c f60724f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private final y9.b<com.google.firebase.analytics.connector.a> f60725g;

    /* renamed from: h, reason: collision with root package name */
    private final String f60726h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private Map<String, String> f60727i;

    /* renamed from: p, reason: collision with root package name */
    @m1
    public static final String f60715p = ProtectedSandApp.s("Ї\u0001");

    /* renamed from: j, reason: collision with root package name */
    public static final String f60709j = ProtectedSandApp.s("Ј\u0001");

    /* renamed from: k, reason: collision with root package name */
    public static final String f60710k = ProtectedSandApp.s("Љ\u0001");

    /* renamed from: l, reason: collision with root package name */
    public static final String f60711l = ProtectedSandApp.s("Њ\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f60713n = ProtectedSandApp.s("Ћ\u0001");

    /* renamed from: o, reason: collision with root package name */
    private static final String f60714o = ProtectedSandApp.s("Ќ\u0001");

    /* renamed from: q, reason: collision with root package name */
    private static final Clock f60716q = DefaultClock.getInstance();

    /* renamed from: r, reason: collision with root package name */
    private static final Random f60717r = new Random();

    /* renamed from: s, reason: collision with root package name */
    private static final Map<String, p> f60718s = new HashMap();

    /* compiled from: RemoteConfigComponent.java */
    private static class a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private static final AtomicReference<a> f60728a = new AtomicReference<>();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<a> atomicReference = f60728a;
            if (atomicReference.get() == null) {
                a aVar = new a();
                if (k1.a(atomicReference, null, aVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(aVar);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z4) {
            x.r(z4);
        }
    }

    x(Context context, @l9.b ScheduledExecutorService scheduledExecutorService, com.google.firebase.g gVar, com.google.firebase.installations.k kVar, com.google.firebase.abt.c cVar, y9.b<com.google.firebase.analytics.connector.a> bVar) {
        this(context, scheduledExecutorService, gVar, kVar, cVar, bVar, true);
    }

    public static /* synthetic */ com.google.firebase.analytics.connector.a b() {
        return null;
    }

    private com.google.firebase.remoteconfig.internal.g f(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.g.j(this.f60721c, com.google.firebase.remoteconfig.internal.v.d(this.f60720b, String.format(ProtectedSandApp.s("Ѝ\u0001"), ProtectedSandApp.s("Ћ\u0001"), this.f60726h, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.p j(com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2) {
        return new com.google.firebase.remoteconfig.internal.p(this.f60721c, gVar, gVar2);
    }

    @m1
    static com.google.firebase.remoteconfig.internal.q k(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.q(context.getSharedPreferences(String.format(ProtectedSandApp.s("Ў\u0001"), ProtectedSandApp.s("Ћ\u0001"), str, str2, ProtectedSandApp.s("Ќ\u0001")), 0));
    }

    @q0
    private static com.google.firebase.remoteconfig.internal.z l(com.google.firebase.g gVar, String str, y9.b<com.google.firebase.analytics.connector.a> bVar) {
        if (p(gVar) && str.equals(ProtectedSandApp.s("Ї\u0001"))) {
            return new com.google.firebase.remoteconfig.internal.z(bVar);
        }
        return null;
    }

    private com.google.firebase.remoteconfig.internal.rollouts.e n(com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.g gVar2) {
        return new com.google.firebase.remoteconfig.internal.rollouts.e(gVar, com.google.firebase.remoteconfig.internal.rollouts.a.a(gVar, gVar2), this.f60721c);
    }

    private static boolean o(com.google.firebase.g gVar, String str) {
        return str.equals(ProtectedSandApp.s("Ї\u0001")) && p(gVar);
    }

    private static boolean p(com.google.firebase.g gVar) {
        return gVar.r().equals(ProtectedSandApp.s("Џ\u0001"));
    }

    private static /* synthetic */ com.google.firebase.analytics.connector.a q() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void r(boolean z4) {
        synchronized (x.class) {
            Iterator<p> it = f60718s.values().iterator();
            while (it.hasNext()) {
                it.next().N(z4);
            }
        }
    }

    @Override // ia.a
    public void a(@o0 String str, @o0 com.google.firebase.remoteconfig.interop.rollouts.f fVar) {
        e(str).x().h(fVar);
    }

    @m1
    synchronized p d(com.google.firebase.g gVar, String str, com.google.firebase.installations.k kVar, com.google.firebase.abt.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.g gVar2, com.google.firebase.remoteconfig.internal.g gVar3, com.google.firebase.remoteconfig.internal.g gVar4, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.p pVar, com.google.firebase.remoteconfig.internal.q qVar, com.google.firebase.remoteconfig.internal.rollouts.e eVar) {
        try {
            if (!this.f60719a.containsKey(str)) {
                p pVar2 = new p(this.f60720b, gVar, kVar, o(gVar, str) ? cVar : null, executor, gVar2, gVar3, gVar4, nVar, pVar, qVar, m(gVar, kVar, nVar, gVar3, this.f60720b, str, qVar), eVar);
                pVar2.R();
                this.f60719a.put(str, pVar2);
                f60718s.put(str, pVar2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f60719a.get(str);
    }

    @KeepForSdk
    @m1
    public synchronized p e(String str) {
        com.google.firebase.remoteconfig.internal.g f4;
        com.google.firebase.remoteconfig.internal.g f5;
        com.google.firebase.remoteconfig.internal.g f6;
        com.google.firebase.remoteconfig.internal.q k4;
        com.google.firebase.remoteconfig.internal.p j4;
        try {
            f4 = f(str, ProtectedSandApp.s("Љ\u0001"));
            f5 = f(str, ProtectedSandApp.s("Ј\u0001"));
            f6 = f(str, ProtectedSandApp.s("Њ\u0001"));
            k4 = k(this.f60720b, this.f60726h, str);
            j4 = j(f5, f6);
            final com.google.firebase.remoteconfig.internal.z l4 = l(this.f60722d, str, this.f60725g);
            if (l4 != null) {
                j4.b(new BiConsumer() { // from class: com.google.firebase.remoteconfig.u
                    @Override // com.google.android.gms.common.util.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        com.google.firebase.remoteconfig.internal.z.this.a((String) obj, (com.google.firebase.remoteconfig.internal.h) obj2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return d(this.f60722d, str, this.f60723e, this.f60724f, this.f60721c, f4, f5, f6, h(str, f4, k4), j4, k4, n(f5, f6));
    }

    p g() {
        return e(ProtectedSandApp.s("Ї\u0001"));
    }

    @m1
    synchronized com.google.firebase.remoteconfig.internal.n h(String str, com.google.firebase.remoteconfig.internal.g gVar, com.google.firebase.remoteconfig.internal.q qVar) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new com.google.firebase.remoteconfig.internal.n(this.f60723e, p(this.f60722d) ? this.f60725g : new w(), this.f60721c, f60716q, f60717r, gVar, i(this.f60722d.s().i(), str, qVar), qVar, this.f60727i);
    }

    @m1
    ConfigFetchHttpClient i(String str, String str2, com.google.firebase.remoteconfig.internal.q qVar) {
        return new ConfigFetchHttpClient(this.f60720b, this.f60722d.s().j(), str, str2, qVar.c(), qVar.c());
    }

    synchronized com.google.firebase.remoteconfig.internal.r m(com.google.firebase.g gVar, com.google.firebase.installations.k kVar, com.google.firebase.remoteconfig.internal.n nVar, com.google.firebase.remoteconfig.internal.g gVar2, Context context, String str, com.google.firebase.remoteconfig.internal.q qVar) {
        return new com.google.firebase.remoteconfig.internal.r(gVar, kVar, nVar, gVar2, context, str, qVar, this.f60721c);
    }

    @m1
    public synchronized void s(Map<String, String> map) {
        this.f60727i = map;
    }

    @m1
    protected x(Context context, ScheduledExecutorService scheduledExecutorService, com.google.firebase.g gVar, com.google.firebase.installations.k kVar, com.google.firebase.abt.c cVar, y9.b<com.google.firebase.analytics.connector.a> bVar, boolean z4) {
        this.f60719a = new HashMap();
        this.f60727i = new HashMap();
        this.f60720b = context;
        this.f60721c = scheduledExecutorService;
        this.f60722d = gVar;
        this.f60723e = kVar;
        this.f60724f = cVar;
        this.f60725g = bVar;
        this.f60726h = gVar.s().j();
        a.b(context);
        if (z4) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.remoteconfig.v
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return x.this.g();
                }
            });
        }
    }
}
