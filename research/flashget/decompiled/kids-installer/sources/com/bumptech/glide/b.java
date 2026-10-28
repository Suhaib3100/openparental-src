package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.engine.prefill.d;
import com.bumptech.glide.load.model.a;
import com.bumptech.glide.load.model.b;
import com.bumptech.glide.load.model.d;
import com.bumptech.glide.load.model.e;
import com.bumptech.glide.load.model.f;
import com.bumptech.glide.load.model.k;
import com.bumptech.glide.load.model.s;
import com.bumptech.glide.load.model.stream.b;
import com.bumptech.glide.load.model.stream.d;
import com.bumptech.glide.load.model.stream.e;
import com.bumptech.glide.load.model.stream.f;
import com.bumptech.glide.load.model.stream.i;
import com.bumptech.glide.load.model.t;
import com.bumptech.glide.load.model.u;
import com.bumptech.glide.load.model.v;
import com.bumptech.glide.load.model.w;
import com.bumptech.glide.load.model.x;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.d0;
import com.bumptech.glide.load.resource.bitmap.f0;
import com.bumptech.glide.load.resource.bitmap.h0;
import com.bumptech.glide.load.resource.bitmap.k0;
import com.bumptech.glide.load.resource.bitmap.m0;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x0.a;

/* compiled from: Glide.java */
/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {
    private static final String A = ProtectedSandApp.s("§");
    private static final String B = ProtectedSandApp.s("¨");

    @b0("Glide.class")
    private static volatile b C;
    private static volatile boolean D;

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.k f10711o;

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f10712p;

    /* renamed from: q, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f10713q;

    /* renamed from: r, reason: collision with root package name */
    private final d f10714r;

    /* renamed from: s, reason: collision with root package name */
    private final Registry f10715s;

    /* renamed from: t, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f10716t;

    /* renamed from: u, reason: collision with root package name */
    private final q f10717u;

    /* renamed from: v, reason: collision with root package name */
    private final com.bumptech.glide.manager.d f10718v;

    /* renamed from: x, reason: collision with root package name */
    private final a f10720x;

    /* renamed from: z, reason: collision with root package name */
    @q0
    @b0("this")
    private com.bumptech.glide.load.engine.prefill.b f10722z;

    /* renamed from: w, reason: collision with root package name */
    @b0("managers")
    private final List<l> f10719w = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    private g f10721y = g.NORMAL;

    /* compiled from: Glide.java */
    public interface a {
        @o0
        com.bumptech.glide.request.i build();
    }

    b(@o0 Context context, @o0 com.bumptech.glide.load.engine.k kVar, @o0 com.bumptech.glide.load.engine.cache.j jVar, @o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar, @o0 q qVar, @o0 com.bumptech.glide.manager.d dVar, int i5, @o0 a aVar, @o0 Map<Class<?>, m<?, ?>> map, @o0 List<com.bumptech.glide.request.h<Object>> list, e eVar2) {
        com.bumptech.glide.load.k jVar2;
        com.bumptech.glide.load.k k0Var;
        this.f10711o = kVar;
        this.f10712p = eVar;
        this.f10716t = bVar;
        this.f10713q = jVar;
        this.f10717u = qVar;
        this.f10718v = dVar;
        this.f10720x = aVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f10715s = registry;
        registry.t(new DefaultImageHeaderParser());
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 27) {
            registry.t(new y());
        }
        List<ImageHeaderParser> g5 = registry.g();
        com.bumptech.glide.load.resource.gif.a aVar2 = new com.bumptech.glide.load.resource.gif.a(context, g5, eVar, bVar);
        com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> h5 = com.bumptech.glide.load.resource.bitmap.q0.h(eVar);
        v vVar = new v(registry.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (!eVar2.b(c.C0131c.class) || i6 < 28) {
            jVar2 = new com.bumptech.glide.load.resource.bitmap.j(vVar);
            k0Var = new k0(vVar, bVar);
        } else {
            k0Var = new d0();
            jVar2 = new com.bumptech.glide.load.resource.bitmap.l();
        }
        com.bumptech.glide.load.resource.drawable.e eVar3 = new com.bumptech.glide.load.resource.drawable.e(context);
        s.c cVar = new s.c(resources);
        s.d dVar2 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        com.bumptech.glide.load.resource.bitmap.e eVar4 = new com.bumptech.glide.load.resource.bitmap.e(bVar);
        com.bumptech.glide.load.resource.transcode.a aVar4 = new com.bumptech.glide.load.resource.transcode.a();
        com.bumptech.glide.load.resource.transcode.d dVar3 = new com.bumptech.glide.load.resource.transcode.d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry a6 = registry.a(ByteBuffer.class, new com.bumptech.glide.load.model.c()).a(InputStream.class, new t(bVar));
        String s5 = ProtectedSandApp.s("\u0099");
        a6.e(s5, ByteBuffer.class, Bitmap.class, jVar2).e(s5, InputStream.class, Bitmap.class, k0Var);
        registry.e(s5, ParcelFileDescriptor.class, Bitmap.class, new f0(vVar));
        Registry b6 = registry.e(s5, ParcelFileDescriptor.class, Bitmap.class, h5).e(s5, AssetFileDescriptor.class, Bitmap.class, com.bumptech.glide.load.resource.bitmap.q0.c(eVar)).d(Bitmap.class, Bitmap.class, v.a.b()).e(s5, Bitmap.class, Bitmap.class, new m0()).b(Bitmap.class, eVar4);
        com.bumptech.glide.load.resource.bitmap.a aVar5 = new com.bumptech.glide.load.resource.bitmap.a(resources, jVar2);
        String s6 = ProtectedSandApp.s("\u009a");
        Registry b7 = b6.e(s6, ByteBuffer.class, BitmapDrawable.class, aVar5).e(s6, InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, k0Var)).e(s6, ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, h5)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(eVar, eVar4));
        com.bumptech.glide.load.resource.gif.j jVar3 = new com.bumptech.glide.load.resource.gif.j(g5, aVar2, bVar);
        String s7 = ProtectedSandApp.s("\u009b");
        b7.e(s7, InputStream.class, com.bumptech.glide.load.resource.gif.c.class, jVar3).e(s7, ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, aVar2).b(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d()).d(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, v.a.b()).e(s5, com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new com.bumptech.glide.load.resource.gif.h(eVar)).c(Uri.class, Drawable.class, eVar3).c(Uri.class, Bitmap.class, new h0(eVar3, eVar)).u(new a.C0519a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new f.e()).c(File.class, File.class, new y0.a()).d(File.class, ParcelFileDescriptor.class, new f.b()).d(File.class, File.class, v.a.b()).u(new k.a(bVar));
        registry.u(new ParcelFileDescriptorRewinder.a());
        Class cls = Integer.TYPE;
        registry.d(cls, InputStream.class, cVar).d(cls, ParcelFileDescriptor.class, bVar2).d(Integer.class, InputStream.class, cVar).d(Integer.class, ParcelFileDescriptor.class, bVar2).d(Integer.class, Uri.class, dVar2).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, Uri.class, dVar2).d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new u.c()).d(String.class, ParcelFileDescriptor.class, new u.b()).d(String.class, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new d.a(context)).d(Uri.class, InputStream.class, new e.a(context));
        if (i6 >= 29) {
            registry.d(Uri.class, InputStream.class, new f.c(context));
            registry.d(Uri.class, ParcelFileDescriptor.class, new f.b(context));
        }
        registry.d(Uri.class, InputStream.class, new w.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).d(Uri.class, InputStream.class, new x.a()).d(URL.class, InputStream.class, new i.a()).d(Uri.class, File.class, new k.a(context)).d(com.bumptech.glide.load.model.g.class, InputStream.class, new b.a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, v.a.b()).d(Drawable.class, Drawable.class, v.a.b()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.resource.drawable.f()).x(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.transcode.b(resources)).x(Bitmap.class, byte[].class, aVar4).x(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(eVar, aVar4, dVar3)).x(com.bumptech.glide.load.resource.gif.c.class, byte[].class, dVar3);
        com.bumptech.glide.load.k<ByteBuffer, Bitmap> d6 = com.bumptech.glide.load.resource.bitmap.q0.d(eVar);
        registry.c(ByteBuffer.class, Bitmap.class, d6);
        registry.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, d6));
        this.f10714r = new d(context, bVar, registry, new com.bumptech.glide.request.target.k(), aVar, map, list, kVar, eVar2, i5);
    }

    @o0
    public static l C(@o0 Activity activity) {
        return p(activity).j(activity);
    }

    @o0
    @Deprecated
    public static l D(@o0 Fragment fragment) {
        return p(fragment.getActivity()).k(fragment);
    }

    @o0
    public static l E(@o0 Context context) {
        return p(context).l(context);
    }

    @o0
    public static l F(@o0 View view) {
        return p(view.getContext()).m(view);
    }

    @o0
    public static l G(@o0 androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).n(fragment);
    }

    @o0
    public static l H(@o0 FragmentActivity fragmentActivity) {
        return p(fragmentActivity).o(fragmentActivity);
    }

    @b0("Glide.class")
    private static void a(@o0 Context context, @q0 GeneratedAppGlideModule generatedAppGlideModule) {
        if (D) {
            throw new IllegalStateException(ProtectedSandApp.s("\u009c"));
        }
        D = true;
        s(context, generatedAppGlideModule);
        D = false;
    }

    @m1
    public static void d() {
        com.bumptech.glide.load.resource.bitmap.b0.d().l();
    }

    @o0
    public static b e(@o0 Context context) {
        if (C == null) {
            GeneratedAppGlideModule f6 = f(context.getApplicationContext());
            synchronized (b.class) {
                if (C == null) {
                    a(context, f6);
                }
            }
        }
        return C;
    }

    @q0
    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName(ProtectedSandApp.s("\u009d")).getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable(ProtectedSandApp.s("\u009e"), 5);
            return null;
        } catch (IllegalAccessException e6) {
            z(e6);
            return null;
        } catch (InstantiationException e7) {
            z(e7);
            return null;
        } catch (NoSuchMethodException e8) {
            z(e8);
            return null;
        } catch (InvocationTargetException e9) {
            z(e9);
            return null;
        }
    }

    @q0
    public static File l(@o0 Context context) {
        return m(context, ProtectedSandApp.s("\u009f"));
    }

    @q0
    public static File m(@o0 Context context, @o0 String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.isLoggable(ProtectedSandApp.s(" "), 6);
            return null;
        }
        File file = new File(cacheDir, str);
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @o0
    private static q p(@q0 Context context) {
        com.bumptech.glide.util.l.e(context, ProtectedSandApp.s("¡"));
        return e(context).o();
    }

    @m1
    public static void q(@o0 Context context, @o0 c cVar) {
        GeneratedAppGlideModule f6 = f(context);
        synchronized (b.class) {
            if (C != null) {
                y();
            }
            t(context, cVar, f6);
        }
    }

    @m1
    @Deprecated
    public static synchronized void r(b bVar) {
        synchronized (b.class) {
            if (C != null) {
                y();
            }
            C = bVar;
        }
    }

    @b0("Glide.class")
    private static void s(@o0 Context context, @q0 GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new c(), generatedAppGlideModule);
    }

    @b0("Glide.class")
    private static void t(@o0 Context context, @o0 c cVar, @q0 GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.module.c> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new com.bumptech.glide.module.e(applicationContext).a();
        }
        String s5 = ProtectedSandApp.s("¢");
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> d6 = generatedAppGlideModule.d();
            Iterator<com.bumptech.glide.module.c> it = emptyList.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.module.c next = it.next();
                if (d6.contains(next.getClass())) {
                    if (Log.isLoggable(s5, 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(s5, 3)) {
            Iterator<com.bumptech.glide.module.c> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                it2.next().getClass().toString();
            }
        }
        cVar.t(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<com.bumptech.glide.module.c> it3 = emptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, cVar);
        }
        b b6 = cVar.b(applicationContext);
        for (com.bumptech.glide.module.c cVar2 : emptyList) {
            try {
                cVar2.b(applicationContext, b6, b6.f10715s);
            } catch (AbstractMethodError e6) {
                throw new IllegalStateException(ProtectedSandApp.s("£").concat(cVar2.getClass().getName()), e6);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, b6, b6.f10715s);
        }
        applicationContext.registerComponentCallbacks(b6);
        C = b6;
    }

    @m1
    public static void y() {
        synchronized (b.class) {
            if (C != null) {
                C.j().getApplicationContext().unregisterComponentCallbacks(C);
                C.f10711o.m();
            }
            C = null;
        }
    }

    private static void z(Exception exc) {
        throw new IllegalStateException(ProtectedSandApp.s("¤"), exc);
    }

    public void A(int i5) {
        n.b();
        synchronized (this.f10719w) {
            Iterator<l> it = this.f10719w.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i5);
            }
        }
        this.f10713q.a(i5);
        this.f10712p.a(i5);
        this.f10716t.a(i5);
    }

    void B(l lVar) {
        synchronized (this.f10719w) {
            if (!this.f10719w.contains(lVar)) {
                throw new IllegalStateException(ProtectedSandApp.s("¥"));
            }
            this.f10719w.remove(lVar);
        }
    }

    public void b() {
        n.a();
        this.f10711o.e();
    }

    public void c() {
        n.b();
        this.f10713q.b();
        this.f10712p.b();
        this.f10716t.b();
    }

    @o0
    public com.bumptech.glide.load.engine.bitmap_recycle.b g() {
        return this.f10716t;
    }

    @o0
    public com.bumptech.glide.load.engine.bitmap_recycle.e h() {
        return this.f10712p;
    }

    com.bumptech.glide.manager.d i() {
        return this.f10718v;
    }

    @o0
    public Context j() {
        return this.f10714r.getBaseContext();
    }

    @o0
    d k() {
        return this.f10714r;
    }

    @o0
    public Registry n() {
        return this.f10715s;
    }

    @o0
    public q o() {
        return this.f10717u;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        A(i5);
    }

    public synchronized void u(@o0 d.a... aVarArr) {
        if (this.f10722z == null) {
            this.f10722z = new com.bumptech.glide.load.engine.prefill.b(this.f10713q, this.f10712p, (com.bumptech.glide.load.b) this.f10720x.build().S().c(com.bumptech.glide.load.resource.bitmap.v.f11782g));
        }
        this.f10722z.c(aVarArr);
    }

    void v(l lVar) {
        synchronized (this.f10719w) {
            if (this.f10719w.contains(lVar)) {
                throw new IllegalStateException(ProtectedSandApp.s("¦"));
            }
            this.f10719w.add(lVar);
        }
    }

    boolean w(@o0 p<?> pVar) {
        synchronized (this.f10719w) {
            Iterator<l> it = this.f10719w.iterator();
            while (it.hasNext()) {
                if (it.next().Z(pVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    @o0
    public g x(@o0 g gVar) {
        n.b();
        this.f10713q.c(gVar.getMultiplier());
        this.f10712p.c(gVar.getMultiplier());
        g gVar2 = this.f10721y;
        this.f10721y = gVar;
        return gVar2;
    }
}
