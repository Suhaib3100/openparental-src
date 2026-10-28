package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import androidx.annotation.b0;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.animation.core.k1;
import androidx.core.os.s0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.o;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FirebaseApp.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: k, reason: collision with root package name */
    private static final String f59655k = ProtectedSandApp.s("]\u0001");

    /* renamed from: l, reason: collision with root package name */
    @o0
    public static final String f59656l = ProtectedSandApp.s("^\u0001");

    /* renamed from: m, reason: collision with root package name */
    private static final Object f59657m = new Object();

    /* renamed from: n, reason: collision with root package name */
    @b0("LOCK")
    static final Map<String, g> f59658n = new androidx.collection.a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f59659a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59660b;

    /* renamed from: c, reason: collision with root package name */
    private final p f59661c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.components.o f59662d;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.components.u<da.a> f59665g;

    /* renamed from: h, reason: collision with root package name */
    private final y9.b<com.google.firebase.heartbeatinfo.g> f59666h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f59663e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f59664f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List<a> f59667i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<h> f59668j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z4);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f59669a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f59669a.get() == null) {
                    b bVar = new b();
                    if (k1.a(f59669a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z4) {
            synchronized (g.f59657m) {
                try {
                    Iterator it = new ArrayList(g.f59658n.values()).iterator();
                    while (it.hasNext()) {
                        g gVar = (g) it.next();
                        if (gVar.f59663e.get()) {
                            gVar.F(z4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f59670b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f59671a;

        public c(Context context) {
            this.f59671a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f59670b.get() == null) {
                c cVar = new c(context);
                if (k1.a(f59670b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter(ProtectedSandApp.s("\\\u0001")));
                }
            }
        }

        public void c() {
            this.f59671a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (g.f59657m) {
                try {
                    Iterator<g> it = g.f59658n.values().iterator();
                    while (it.hasNext()) {
                        it.next().v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected g(final Context context, String str, p pVar) {
        this.f59659a = (Context) Preconditions.checkNotNull(context);
        this.f59660b = Preconditions.checkNotEmpty(str);
        this.f59661c = (p) Preconditions.checkNotNull(pVar);
        r b5 = FirebaseInitProvider.b();
        Trace.beginSection(ProtectedSandApp.s("_\u0001"));
        Trace.beginSection(ProtectedSandApp.s("`\u0001"));
        List<y9.b<ComponentRegistrar>> c5 = com.google.firebase.components.f.d(context, ComponentDiscoveryService.class).c();
        Trace.endSection();
        Trace.beginSection(ProtectedSandApp.s("a\u0001"));
        o.b g4 = com.google.firebase.components.o.p(com.google.firebase.concurrent.o0.INSTANCE).d(c5).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(com.google.firebase.components.c.D(context, Context.class, new Class[0])).b(com.google.firebase.components.c.D(this, g.class, new Class[0])).b(com.google.firebase.components.c.D(pVar, p.class, new Class[0])).g(new ka.b());
        if (s0.a(context) && FirebaseInitProvider.c()) {
            g4.b(com.google.firebase.components.c.D(b5, r.class, new Class[0]));
        }
        com.google.firebase.components.o e4 = g4.e();
        this.f59662d = e4;
        Trace.endSection();
        this.f59665g = new com.google.firebase.components.u<>(new y9.b() { // from class: com.google.firebase.e
            @Override // y9.b
            public final Object get() {
                da.a C;
                C = g.this.C(context);
                return C;
            }
        });
        this.f59666h = e4.i(com.google.firebase.heartbeatinfo.g.class);
        g(new a() { // from class: com.google.firebase.f
            @Override // com.google.firebase.g.a
            public final void onBackgroundStateChanged(boolean z4) {
                g.this.D(z4);
            }
        });
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ da.a C(Context context) {
        return new da.a(context, t(), (v9.c) this.f59662d.a(v9.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(boolean z4) {
        if (z4) {
            return;
        }
        this.f59666h.get().l();
    }

    private static String E(@o0 String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(boolean z4) {
        Iterator<a> it = this.f59667i.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z4);
        }
    }

    private void G() {
        Iterator<h> it = this.f59668j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f59660b, this.f59661c);
        }
    }

    private void i() {
        Preconditions.checkState(!this.f59664f.get(), ProtectedSandApp.s("b\u0001"));
    }

    @m1
    public static void j() {
        synchronized (f59657m) {
            f59658n.clear();
        }
    }

    private static List<String> m() {
        ArrayList arrayList = new ArrayList();
        synchronized (f59657m) {
            try {
                Iterator<g> it = f59658n.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().r());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @o0
    public static List<g> o(@o0 Context context) {
        ArrayList arrayList;
        synchronized (f59657m) {
            arrayList = new ArrayList(f59658n.values());
        }
        return arrayList;
    }

    @o0
    public static g p() {
        g gVar;
        String s4 = ProtectedSandApp.s("c\u0001");
        synchronized (f59657m) {
            try {
                gVar = f59658n.get(ProtectedSandApp.s("^\u0001"));
                if (gVar == null) {
                    throw new IllegalStateException(s4 + ProcessUtils.getMyProcessName() + ProtectedSandApp.s("d\u0001"));
                }
                gVar.f59666h.get().l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @o0
    public static g q(@o0 String str) {
        g gVar;
        String str2;
        String s4 = ProtectedSandApp.s("e\u0001");
        synchronized (f59657m) {
            try {
                gVar = f59658n.get(str.trim());
                if (gVar == null) {
                    List<String> m4 = m();
                    if (m4.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = s4 + TextUtils.join(ProtectedSandApp.s("f\u0001"), m4);
                    }
                    throw new IllegalStateException(String.format(ProtectedSandApp.s("g\u0001"), str, str2));
                }
                gVar.f59666h.get().l();
            } finally {
            }
        }
        return gVar;
    }

    @KeepForSdk
    public static String u(String str, p pVar) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + ProtectedSandApp.s("h\u0001") + Base64Utils.encodeUrlSafeNoPadding(pVar.j().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (!s0.a(this.f59659a)) {
            r();
            c.b(this.f59659a);
        } else {
            r();
            this.f59662d.u(B());
            this.f59666h.get().l();
        }
    }

    @q0
    public static g x(@o0 Context context) {
        synchronized (f59657m) {
            try {
                if (f59658n.containsKey(ProtectedSandApp.s("^\u0001"))) {
                    return p();
                }
                p h4 = p.h(context);
                if (h4 == null) {
                    return null;
                }
                return z(context, h4, ProtectedSandApp.s("^\u0001"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @o0
    public static g y(@o0 Context context, @o0 p pVar) {
        return z(context, pVar, ProtectedSandApp.s("^\u0001"));
    }

    @o0
    public static g z(@o0 Context context, @o0 p pVar, @o0 String str) {
        g gVar;
        String s4 = ProtectedSandApp.s("i\u0001");
        b.b(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f59657m) {
            Map<String, g> map = f59658n;
            Preconditions.checkState(!map.containsKey(trim), s4 + trim + ProtectedSandApp.s("j\u0001"));
            Preconditions.checkNotNull(context, ProtectedSandApp.s("k\u0001"));
            gVar = new g(context, trim, pVar);
            map.put(trim, gVar);
        }
        gVar.v();
        return gVar;
    }

    @KeepForSdk
    public boolean A() {
        i();
        return this.f59665g.get().b();
    }

    @KeepForSdk
    @m1
    public boolean B() {
        return ProtectedSandApp.s("^\u0001").equals(r());
    }

    @KeepForSdk
    public void H(a aVar) {
        i();
        this.f59667i.remove(aVar);
    }

    @KeepForSdk
    public void I(@o0 h hVar) {
        i();
        Preconditions.checkNotNull(hVar);
        this.f59668j.remove(hVar);
    }

    public void J(boolean z4) {
        i();
        if (this.f59663e.compareAndSet(!z4, z4)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z4 && isInBackground) {
                F(true);
            } else {
                if (z4 || !isInBackground) {
                    return;
                }
                F(false);
            }
        }
    }

    @KeepForSdk
    public void K(Boolean bool) {
        i();
        this.f59665g.get().e(bool);
    }

    @KeepForSdk
    @Deprecated
    public void L(boolean z4) {
        K(Boolean.valueOf(z4));
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f59660b.equals(((g) obj).r());
        }
        return false;
    }

    @KeepForSdk
    public void g(a aVar) {
        i();
        if (this.f59663e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f59667i.add(aVar);
    }

    @KeepForSdk
    public void h(@o0 h hVar) {
        i();
        Preconditions.checkNotNull(hVar);
        this.f59668j.add(hVar);
    }

    public int hashCode() {
        return this.f59660b.hashCode();
    }

    public void k() {
        if (this.f59664f.compareAndSet(false, true)) {
            synchronized (f59657m) {
                f59658n.remove(this.f59660b);
            }
            G();
        }
    }

    @KeepForSdk
    public <T> T l(Class<T> cls) {
        i();
        return (T) this.f59662d.a(cls);
    }

    @o0
    public Context n() {
        i();
        return this.f59659a;
    }

    @o0
    public String r() {
        i();
        return this.f59660b;
    }

    @o0
    public p s() {
        i();
        return this.f59661c;
    }

    @KeepForSdk
    public String t() {
        return Base64Utils.encodeUrlSafeNoPadding(r().getBytes(Charset.defaultCharset())) + ProtectedSandApp.s("h\u0001") + Base64Utils.encodeUrlSafeNoPadding(s().j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("l\u0001"), this.f59660b).add(ProtectedSandApp.s("m\u0001"), this.f59661c).toString();
    }

    @c1({c1.a.TESTS})
    @m1
    void w() {
        this.f59662d.t();
    }
}
