package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.l;
import com.bumptech.glide.load.engine.prefill.d;
import com.bumptech.glide.load.resource.bitmap.c0;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.request.target.p;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Glide.java */
/* loaded from: classes3.dex */
public class c implements ComponentCallbacks2 {

    /* renamed from: m, reason: collision with root package name */
    private static final String f42794m = ProtectedSandApp.s("ࠏ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f42795n = ProtectedSandApp.s("ࠌ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f42796o = ProtectedSandApp.s("ࠎ");

    /* renamed from: p, reason: collision with root package name */
    @b0("Glide.class")
    private static volatile c f42797p;

    /* renamed from: q, reason: collision with root package name */
    private static volatile boolean f42798q;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f42799b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f42800c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f42801d;

    /* renamed from: e, reason: collision with root package name */
    private final e f42802e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f42803f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.manager.o f42804g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f42805h;

    /* renamed from: j, reason: collision with root package name */
    private final a f42807j;

    /* renamed from: l, reason: collision with root package name */
    @q0
    @b0("this")
    private com.bumptech.glide.load.engine.prefill.b f42809l;

    /* renamed from: i, reason: collision with root package name */
    @b0("managers")
    private final List<n> f42806i = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private h f42808k = h.NORMAL;

    /* compiled from: Glide.java */
    public interface a {
        @o0
        com.bumptech.glide.request.i a();
    }

    c(@o0 Context context, @o0 com.bumptech.glide.load.engine.k kVar, @o0 com.bumptech.glide.load.engine.cache.j jVar, @o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @o0 com.bumptech.glide.manager.o oVar, @o0 com.bumptech.glide.manager.c cVar, int i4, @o0 a aVar, @o0 Map<Class<?>, o<?, ?>> map, @o0 List<com.bumptech.glide.request.h<Object>> list, @o0 List<com.bumptech.glide.module.c> list2, @q0 com.bumptech.glide.module.a aVar2, @o0 f fVar) {
        this.f42799b = kVar;
        this.f42800c = eVar;
        this.f42803f = bVar;
        this.f42801d = jVar;
        this.f42804g = oVar;
        this.f42805h = cVar;
        this.f42807j = aVar;
        this.f42802e = new e(context, bVar, new l.a(this, list2, aVar2), new com.bumptech.glide.request.target.k(), aVar, map, list, kVar, fVar, i4);
    }

    private static void A(Exception exc) {
        throw new IllegalStateException(ProtectedSandApp.s("ࠋ"), exc);
    }

    @o0
    @Deprecated
    public static n D(@o0 Activity activity) {
        return F(activity.getApplicationContext());
    }

    @o0
    @Deprecated
    public static n E(@o0 Fragment fragment) {
        Activity activity = fragment.getActivity();
        com.bumptech.glide.util.m.f(activity, ProtectedSandApp.s("ࠌ"));
        return F(activity.getApplicationContext());
    }

    @o0
    public static n F(@o0 Context context) {
        return p(context).h(context);
    }

    @o0
    public static n G(@o0 View view) {
        return p(view.getContext()).i(view);
    }

    @o0
    public static n H(@o0 androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).j(fragment);
    }

    @o0
    public static n I(@o0 FragmentActivity fragmentActivity) {
        return p(fragmentActivity).k(fragmentActivity);
    }

    @b0("Glide.class")
    @m1
    static void a(@o0 Context context, @q0 GeneratedAppGlideModule generatedAppGlideModule) {
        if (f42798q) {
            throw new IllegalStateException(ProtectedSandApp.s("ࠍ"));
        }
        f42798q = true;
        try {
            s(context, generatedAppGlideModule);
        } finally {
            f42798q = false;
        }
    }

    @m1
    public static void d() {
        c0.c().i();
    }

    @o0
    public static c e(@o0 Context context) {
        if (f42797p == null) {
            GeneratedAppGlideModule f4 = f(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f42797p == null) {
                        a(context, f4);
                    }
                } finally {
                }
            }
        }
        return f42797p;
    }

    @q0
    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable(ProtectedSandApp.s("ࠎ"), 5);
            return null;
        } catch (IllegalAccessException e4) {
            A(e4);
            return null;
        } catch (InstantiationException e5) {
            A(e5);
            return null;
        } catch (NoSuchMethodException e6) {
            A(e6);
            return null;
        } catch (InvocationTargetException e7) {
            A(e7);
            return null;
        }
    }

    @q0
    public static File l(@o0 Context context) {
        return m(context, ProtectedSandApp.s("ࠏ"));
    }

    @q0
    public static File m(@o0 Context context, @o0 String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.isLoggable(ProtectedSandApp.s("ࠎ"), 6);
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @o0
    private static com.bumptech.glide.manager.o p(@q0 Context context) {
        com.bumptech.glide.util.m.f(context, ProtectedSandApp.s("ࠌ"));
        return e(context).o();
    }

    @m1
    public static void q(@o0 Context context, @o0 d dVar) {
        GeneratedAppGlideModule f4 = f(context);
        synchronized (c.class) {
            try {
                if (f42797p != null) {
                    z();
                }
                t(context, dVar, f4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @m1
    @Deprecated
    public static synchronized void r(c cVar) {
        synchronized (c.class) {
            try {
                if (f42797p != null) {
                    z();
                }
                f42797p = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @b0("Glide.class")
    private static void s(@o0 Context context, @q0 GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new d(), generatedAppGlideModule);
    }

    @b0("Glide.class")
    private static void t(@o0 Context context, @o0 d dVar, @q0 GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.module.c> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new com.bumptech.glide.module.e(applicationContext).b();
        }
        String s4 = ProtectedSandApp.s("ࠎ");
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d5 = generatedAppGlideModule.d();
            Iterator<com.bumptech.glide.module.c> it = emptyList.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.module.c next = it.next();
                if (d5.contains(next.getClass())) {
                    if (Log.isLoggable(s4, 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(s4, 3)) {
            Iterator<com.bumptech.glide.module.c> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                it2.next().getClass().toString();
            }
        }
        dVar.u(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<com.bumptech.glide.module.c> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, dVar);
        }
        c b5 = dVar.b(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(b5);
        f42797p = b5;
    }

    @m1
    public static synchronized boolean u() {
        boolean z4;
        synchronized (c.class) {
            z4 = f42797p != null;
        }
        return z4;
    }

    @m1
    public static void z() {
        synchronized (c.class) {
            try {
                if (f42797p != null) {
                    f42797p.j().getApplicationContext().unregisterComponentCallbacks(f42797p);
                    f42797p.f42799b.m();
                }
                f42797p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void B(int i4) {
        com.bumptech.glide.util.o.b();
        synchronized (this.f42806i) {
            try {
                Iterator<n> it = this.f42806i.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f42801d.b(i4);
        this.f42800c.b(i4);
        this.f42803f.b(i4);
    }

    void C(n nVar) {
        synchronized (this.f42806i) {
            try {
                if (!this.f42806i.contains(nVar)) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࠐ"));
                }
                this.f42806i.remove(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        com.bumptech.glide.util.o.a();
        this.f42799b.e();
    }

    public void c() {
        com.bumptech.glide.util.o.b();
        this.f42801d.c();
        this.f42800c.c();
        this.f42803f.c();
    }

    @o0
    public com.bumptech.glide.load.engine.bitmap_recycle.b g() {
        return this.f42803f;
    }

    @o0
    public com.bumptech.glide.load.engine.bitmap_recycle.e h() {
        return this.f42800c;
    }

    com.bumptech.glide.manager.c i() {
        return this.f42805h;
    }

    @o0
    public Context j() {
        return this.f42802e.getBaseContext();
    }

    @o0
    e k() {
        return this.f42802e;
    }

    @o0
    public Registry n() {
        return this.f42802e.i();
    }

    @o0
    public com.bumptech.glide.manager.o o() {
        return this.f42804g;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        B(i4);
    }

    public synchronized void v(@o0 d.a... aVarArr) {
        try {
            if (this.f42809l == null) {
                this.f42809l = new com.bumptech.glide.load.engine.prefill.b(this.f42801d, this.f42800c, (com.bumptech.glide.load.b) this.f42807j.a().O().c(w.f44549g));
            }
            this.f42809l.c(aVarArr);
        } catch (Throwable th) {
            throw th;
        }
    }

    void w(n nVar) {
        synchronized (this.f42806i) {
            try {
                if (this.f42806i.contains(nVar)) {
                    throw new IllegalStateException(ProtectedSandApp.s("ࠑ"));
                }
                this.f42806i.add(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean x(@o0 p<?> pVar) {
        synchronized (this.f42806i) {
            try {
                Iterator<n> it = this.f42806i.iterator();
                while (it.hasNext()) {
                    if (it.next().a0(pVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @o0
    public h y(@o0 h hVar) {
        com.bumptech.glide.util.o.b();
        this.f42801d.d(hVar.getMultiplier());
        this.f42800c.d(hVar.getMultiplier());
        h hVar2 = this.f42808k;
        this.f42808k = hVar;
        return hVar2;
    }
}
