package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Trace;
import android.text.TextUtils;
import android.view.x;
import androidx.annotation.b0;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.os.c0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
import com.google.firebase.components.u;
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
/* loaded from: classes2.dex */
public class g {

    /* renamed from: k, reason: collision with root package name */
    private static final String f16634k = ProtectedSandApp.s("ᘇ");

    /* renamed from: l, reason: collision with root package name */
    @o0
    public static final String f16635l = ProtectedSandApp.s("ᘈ");

    /* renamed from: m, reason: collision with root package name */
    private static final Object f16636m = new Object();

    /* renamed from: n, reason: collision with root package name */
    @b0("LOCK")
    static final Map<String, g> f16637n = new androidx.collection.a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f16638a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16639b;

    /* renamed from: c, reason: collision with root package name */
    private final p f16640c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.components.o f16641d;

    /* renamed from: g, reason: collision with root package name */
    private final u<t2.a> f16644g;

    /* renamed from: h, reason: collision with root package name */
    private final o2.b<com.google.firebase.heartbeatinfo.g> f16645h;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f16642e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f16643f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final List<a> f16646i = new CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final List<h> f16647j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z5);
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(14)
    /* loaded from: classes3.dex */
    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private static AtomicReference<b> f16648a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f16648a.get() == null) {
                    b bVar = new b();
                    if (x.a(f16648a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z5) {
            synchronized (g.f16636m) {
                Iterator it = new ArrayList(g.f16637n.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.f16642e.get()) {
                        gVar.F(z5);
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    @TargetApi(24)
    private static class c extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        private static AtomicReference<c> f16649b = new AtomicReference<>();

        /* renamed from: a, reason: collision with root package name */
        private final Context f16650a;

        public c(Context context) {
            this.f16650a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f16649b.get() == null) {
                c cVar = new c(context);
                if (x.a(f16649b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter(ProtectedSandApp.s("ᘆ")));
                }
            }
        }

        public void c() {
            this.f16650a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (g.f16636m) {
                Iterator<g> it = g.f16637n.values().iterator();
                while (it.hasNext()) {
                    it.next().v();
                }
            }
            c();
        }
    }

    protected g(final Context context, String str, p pVar) {
        this.f16638a = (Context) Preconditions.checkNotNull(context);
        this.f16639b = Preconditions.checkNotEmpty(str);
        this.f16640c = (p) Preconditions.checkNotNull(pVar);
        r b6 = FirebaseInitProvider.b();
        Trace.beginSection(ProtectedSandApp.s("ᘉ"));
        Trace.beginSection(ProtectedSandApp.s("ᘊ"));
        List<o2.b<ComponentRegistrar>> c6 = com.google.firebase.components.f.d(context, ComponentDiscoveryService.class).c();
        Trace.endSection();
        Trace.beginSection(ProtectedSandApp.s("ᘋ"));
        o.b g5 = com.google.firebase.components.o.p(com.google.firebase.concurrent.o0.INSTANCE).d(c6).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(com.google.firebase.components.c.D(context, Context.class, new Class[0])).b(com.google.firebase.components.c.D(this, g.class, new Class[0])).b(com.google.firebase.components.c.D(pVar, p.class, new Class[0])).g(new a3.b());
        if (c0.a(context) && FirebaseInitProvider.c()) {
            g5.b(com.google.firebase.components.c.D(b6, r.class, new Class[0]));
        }
        com.google.firebase.components.o e6 = g5.e();
        this.f16641d = e6;
        Trace.endSection();
        this.f16644g = new u<>(new o2.b() { // from class: com.google.firebase.e
            @Override // o2.b
            public final Object get() {
                t2.a C;
                C = g.this.C(context);
                return C;
            }
        });
        this.f16645h = e6.c(com.google.firebase.heartbeatinfo.g.class);
        g(new a() { // from class: com.google.firebase.f
            @Override // com.google.firebase.g.a
            public final void onBackgroundStateChanged(boolean z5) {
                g.this.D(z5);
            }
        });
        Trace.endSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t2.a C(Context context) {
        return new t2.a(context, t(), (l2.c) this.f16641d.a(l2.c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(boolean z5) {
        if (z5) {
            return;
        }
        this.f16645h.get().l();
    }

    private static String E(@o0 String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(boolean z5) {
        Iterator<a> it = this.f16646i.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z5);
        }
    }

    private void G() {
        Iterator<h> it = this.f16647j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f16639b, this.f16640c);
        }
    }

    private void i() {
        Preconditions.checkState(!this.f16643f.get(), ProtectedSandApp.s("ᘌ"));
    }

    @m1
    public static void j() {
        synchronized (f16636m) {
            f16637n.clear();
        }
    }

    private static List<String> m() {
        ArrayList arrayList = new ArrayList();
        synchronized (f16636m) {
            Iterator<g> it = f16637n.values().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().r());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @o0
    public static List<g> o(@o0 Context context) {
        ArrayList arrayList;
        synchronized (f16636m) {
            arrayList = new ArrayList(f16637n.values());
        }
        return arrayList;
    }

    @o0
    public static g p() {
        g gVar;
        String s5 = ProtectedSandApp.s("ᘍ");
        synchronized (f16636m) {
            gVar = f16637n.get(ProtectedSandApp.s("ᘎ"));
            if (gVar == null) {
                throw new IllegalStateException(s5 + ProcessUtils.getMyProcessName() + ProtectedSandApp.s("ᘏ"));
            }
            gVar.f16645h.get().l();
        }
        return gVar;
    }

    @o0
    public static g q(@o0 String str) {
        g gVar;
        String str2;
        String s5 = ProtectedSandApp.s("ᘐ");
        synchronized (f16636m) {
            gVar = f16637n.get(str.trim());
            if (gVar == null) {
                List<String> m5 = m();
                if (m5.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = s5 + TextUtils.join(ProtectedSandApp.s("ᘑ"), m5);
                }
                throw new IllegalStateException(String.format(ProtectedSandApp.s("ᘒ"), str, str2));
            }
            gVar.f16645h.get().l();
        }
        return gVar;
    }

    @KeepForSdk
    public static String u(String str, p pVar) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + ProtectedSandApp.s("ᘓ") + Base64Utils.encodeUrlSafeNoPadding(pVar.j().getBytes(Charset.defaultCharset()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (!c0.a(this.f16638a)) {
            r();
            c.b(this.f16638a);
        } else {
            r();
            this.f16641d.u(B());
            this.f16645h.get().l();
        }
    }

    @q0
    public static g x(@o0 Context context) {
        synchronized (f16636m) {
            if (f16637n.containsKey(ProtectedSandApp.s("ᘔ"))) {
                return p();
            }
            p h5 = p.h(context);
            if (h5 == null) {
                return null;
            }
            return y(context, h5);
        }
    }

    @o0
    public static g y(@o0 Context context, @o0 p pVar) {
        return z(context, pVar, ProtectedSandApp.s("ᘕ"));
    }

    @o0
    public static g z(@o0 Context context, @o0 p pVar, @o0 String str) {
        g gVar;
        String s5 = ProtectedSandApp.s("ᘖ");
        b.b(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f16636m) {
            Map<String, g> map = f16637n;
            Preconditions.checkState(!map.containsKey(trim), s5 + trim + ProtectedSandApp.s("ᘗ"));
            Preconditions.checkNotNull(context, ProtectedSandApp.s("ᘘ"));
            gVar = new g(context, trim, pVar);
            map.put(trim, gVar);
        }
        gVar.v();
        return gVar;
    }

    @KeepForSdk
    public boolean A() {
        i();
        return this.f16644g.get().b();
    }

    @KeepForSdk
    @m1
    public boolean B() {
        return ProtectedSandApp.s("ᘙ").equals(r());
    }

    @KeepForSdk
    public void H(a aVar) {
        i();
        this.f16646i.remove(aVar);
    }

    @KeepForSdk
    public void I(@o0 h hVar) {
        i();
        Preconditions.checkNotNull(hVar);
        this.f16647j.remove(hVar);
    }

    public void J(boolean z5) {
        i();
        if (this.f16642e.compareAndSet(!z5, z5)) {
            boolean isInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z5 && isInBackground) {
                F(true);
            } else {
                if (z5 || !isInBackground) {
                    return;
                }
                F(false);
            }
        }
    }

    @KeepForSdk
    public void K(Boolean bool) {
        i();
        this.f16644g.get().e(bool);
    }

    @KeepForSdk
    @Deprecated
    public void L(boolean z5) {
        K(Boolean.valueOf(z5));
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f16639b.equals(((g) obj).r());
        }
        return false;
    }

    @KeepForSdk
    public void g(a aVar) {
        i();
        if (this.f16642e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f16646i.add(aVar);
    }

    @KeepForSdk
    public void h(@o0 h hVar) {
        i();
        Preconditions.checkNotNull(hVar);
        this.f16647j.add(hVar);
    }

    public int hashCode() {
        return this.f16639b.hashCode();
    }

    public void k() {
        if (this.f16643f.compareAndSet(false, true)) {
            synchronized (f16636m) {
                f16637n.remove(this.f16639b);
            }
            G();
        }
    }

    @KeepForSdk
    public <T> T l(Class<T> cls) {
        i();
        return (T) this.f16641d.a(cls);
    }

    @o0
    public Context n() {
        i();
        return this.f16638a;
    }

    @o0
    public String r() {
        i();
        return this.f16639b;
    }

    @o0
    public p s() {
        i();
        return this.f16640c;
    }

    @KeepForSdk
    public String t() {
        return Base64Utils.encodeUrlSafeNoPadding(r().getBytes(Charset.defaultCharset())) + ProtectedSandApp.s("ᘚ") + Base64Utils.encodeUrlSafeNoPadding(s().j().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add(ProtectedSandApp.s("ᘛ"), this.f16639b).add(ProtectedSandApp.s("ᘜ"), this.f16640c).toString();
    }

    @c1({c1.a.TESTS})
    @m1
    void w() {
        this.f16641d.t();
    }
}
