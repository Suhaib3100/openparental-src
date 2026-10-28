package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import androidx.annotation.q0;
import com.bumptech.glide.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.model.a;
import com.bumptech.glide.load.model.b;
import com.bumptech.glide.load.model.d;
import com.bumptech.glide.load.model.e;
import com.bumptech.glide.load.model.g;
import com.bumptech.glide.load.model.l;
import com.bumptech.glide.load.model.p;
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
import com.bumptech.glide.load.model.y;
import com.bumptech.glide.load.model.z;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.e0;
import com.bumptech.glide.load.resource.bitmap.g0;
import com.bumptech.glide.load.resource.bitmap.i0;
import com.bumptech.glide.load.resource.bitmap.l0;
import com.bumptech.glide.load.resource.bitmap.n0;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.util.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import w3.a;

/* compiled from: RegistryFactory.java */
/* loaded from: classes3.dex */
final class l {

    /* compiled from: RegistryFactory.java */
    class a implements h.b<Registry> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f43751a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f43752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f43753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.module.a f43754d;

        a(c cVar, List list, com.bumptech.glide.module.a aVar) {
            this.f43752b = cVar;
            this.f43753c = list;
            this.f43754d = aVar;
        }

        @Override // com.bumptech.glide.util.h.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f43751a) {
                throw new IllegalStateException(ProtectedSandApp.s("ࡈ"));
            }
            androidx.tracing.b.c(ProtectedSandApp.s("ࡇ"));
            this.f43751a = true;
            try {
                return l.a(this.f43752b, this.f43753c, this.f43754d);
            } finally {
                this.f43751a = false;
                Trace.endSection();
            }
        }
    }

    private l() {
    }

    static Registry a(c cVar, List<com.bumptech.glide.module.c> list, @q0 com.bumptech.glide.module.a aVar) {
        com.bumptech.glide.load.engine.bitmap_recycle.e h4 = cVar.h();
        com.bumptech.glide.load.engine.bitmap_recycle.b g4 = cVar.g();
        Context applicationContext = cVar.k().getApplicationContext();
        f g5 = cVar.k().g();
        Registry registry = new Registry();
        b(applicationContext, registry, h4, g4, g5);
        c(applicationContext, cVar, registry, list, aVar);
        return registry;
    }

    private static void b(Context context, Registry registry, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, f fVar) {
        com.bumptech.glide.load.k kVar;
        com.bumptech.glide.load.k l0Var;
        Object obj;
        Registry registry2;
        registry.t(new DefaultImageHeaderParser());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 27) {
            registry.t(new z());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> g4 = registry.g();
        com.bumptech.glide.load.resource.gif.a aVar = new com.bumptech.glide.load.resource.gif.a(context, g4, eVar, bVar);
        com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> m4 = com.bumptech.glide.load.resource.bitmap.q0.m(eVar);
        w wVar = new w(registry.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (i4 < 28 || !fVar.b(d.c.class)) {
            kVar = new com.bumptech.glide.load.resource.bitmap.k(wVar);
            l0Var = new l0(wVar, bVar);
        } else {
            l0Var = new e0();
            kVar = new com.bumptech.glide.load.resource.bitmap.m();
        }
        String s4 = ProtectedSandApp.s("ࡉ");
        if (i4 >= 28) {
            registry.e(s4, InputStream.class, Drawable.class, com.bumptech.glide.load.resource.drawable.g.f(g4, bVar));
            registry.e(s4, ByteBuffer.class, Drawable.class, com.bumptech.glide.load.resource.drawable.g.a(g4, bVar));
        }
        com.bumptech.glide.load.resource.drawable.m mVar = new com.bumptech.glide.load.resource.drawable.m(context);
        com.bumptech.glide.load.resource.bitmap.e eVar2 = new com.bumptech.glide.load.resource.bitmap.e(bVar);
        com.bumptech.glide.load.resource.transcode.a aVar2 = new com.bumptech.glide.load.resource.transcode.a();
        com.bumptech.glide.load.resource.transcode.d dVar = new com.bumptech.glide.load.resource.transcode.d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry a5 = registry.a(ByteBuffer.class, new com.bumptech.glide.load.model.c()).a(InputStream.class, new v(bVar));
        String s5 = ProtectedSandApp.s("ࡊ");
        a5.e(s5, ByteBuffer.class, Bitmap.class, kVar).e(s5, InputStream.class, Bitmap.class, l0Var);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e(s5, ParcelFileDescriptor.class, Bitmap.class, new g0(wVar));
        }
        registry.e(s5, AssetFileDescriptor.class, Bitmap.class, com.bumptech.glide.load.resource.bitmap.q0.c(eVar));
        Registry b5 = registry.e(s5, ParcelFileDescriptor.class, Bitmap.class, m4).d(Bitmap.class, Bitmap.class, x.a.a()).e(s5, Bitmap.class, Bitmap.class, new n0()).b(Bitmap.class, eVar2);
        com.bumptech.glide.load.resource.bitmap.a aVar3 = new com.bumptech.glide.load.resource.bitmap.a(resources, kVar);
        String s6 = ProtectedSandApp.s("ࡋ");
        b5.e(s6, ByteBuffer.class, BitmapDrawable.class, aVar3).e(s6, InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, l0Var)).e(s6, ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, m4)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(eVar, eVar2)).e(s4, InputStream.class, com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.j(g4, aVar, bVar)).e(s4, ByteBuffer.class, com.bumptech.glide.load.resource.gif.c.class, aVar).b(com.bumptech.glide.load.resource.gif.c.class, new com.bumptech.glide.load.resource.gif.d()).d(com.bumptech.glide.gifdecoder.a.class, com.bumptech.glide.gifdecoder.a.class, x.a.a()).e(s5, com.bumptech.glide.gifdecoder.a.class, Bitmap.class, new com.bumptech.glide.load.resource.gif.h(eVar)).c(Uri.class, Drawable.class, mVar).c(Uri.class, Bitmap.class, new i0(mVar, eVar)).u(new a.C1403a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new x3.a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, x.a.a()).u(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            obj = BitmapDrawable.class;
            registry2 = registry;
            registry2.u(new ParcelFileDescriptorRewinder.a());
        } else {
            obj = BitmapDrawable.class;
            registry2 = registry;
        }
        p<Integer, InputStream> g5 = com.bumptech.glide.load.model.f.g(context);
        p<Integer, AssetFileDescriptor> c5 = com.bumptech.glide.load.model.f.c(context);
        p<Integer, Drawable> e4 = com.bumptech.glide.load.model.f.e(context);
        Class cls = Integer.TYPE;
        registry2.d(cls, InputStream.class, g5).d(Integer.class, InputStream.class, g5).d(cls, AssetFileDescriptor.class, c5).d(Integer.class, AssetFileDescriptor.class, c5).d(cls, Drawable.class, e4).d(Integer.class, Drawable.class, e4).d(Uri.class, InputStream.class, u.f(context)).d(Uri.class, AssetFileDescriptor.class, u.e(context));
        t.d dVar2 = new t.d(resources);
        t.a aVar4 = new t.a(resources);
        t.c cVar = new t.c(resources);
        Object obj2 = obj;
        registry2.d(Integer.class, Uri.class, dVar2).d(cls, Uri.class, dVar2).d(Integer.class, AssetFileDescriptor.class, aVar4).d(cls, AssetFileDescriptor.class, aVar4).d(Integer.class, InputStream.class, cVar).d(cls, InputStream.class, cVar);
        registry2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new w.c()).d(String.class, ParcelFileDescriptor.class, new w.b()).d(String.class, AssetFileDescriptor.class, new w.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new d.a(context)).d(Uri.class, InputStream.class, new e.a(context));
        if (i4 >= 29) {
            registry2.d(Uri.class, InputStream.class, new f.c(context));
            registry2.d(Uri.class, ParcelFileDescriptor.class, new f.b(context));
        }
        registry2.d(Uri.class, InputStream.class, new y.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver)).d(Uri.class, InputStream.class, new z.a()).d(URL.class, InputStream.class, new i.a()).d(Uri.class, File.class, new l.a(context)).d(com.bumptech.glide.load.model.h.class, InputStream.class, new b.a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, x.a.a()).d(Drawable.class, Drawable.class, x.a.a()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.resource.drawable.n()).x(Bitmap.class, obj2, new com.bumptech.glide.load.resource.transcode.b(resources)).x(Bitmap.class, byte[].class, aVar2).x(Drawable.class, byte[].class, new com.bumptech.glide.load.resource.transcode.c(eVar, aVar2, dVar)).x(com.bumptech.glide.load.resource.gif.c.class, byte[].class, dVar);
        com.bumptech.glide.load.k<ByteBuffer, Bitmap> d5 = com.bumptech.glide.load.resource.bitmap.q0.d(eVar);
        registry2.c(ByteBuffer.class, Bitmap.class, d5);
        registry2.c(ByteBuffer.class, obj2, new com.bumptech.glide.load.resource.bitmap.a(resources, d5));
    }

    private static void c(Context context, c cVar, Registry registry, List<com.bumptech.glide.module.c> list, @q0 com.bumptech.glide.module.a aVar) {
        for (com.bumptech.glide.module.c cVar2 : list) {
            try {
                cVar2.b(context, cVar, registry);
            } catch (AbstractMethodError e4) {
                throw new IllegalStateException(ProtectedSandApp.s("ࡌ").concat(cVar2.getClass().getName()), e4);
            }
        }
        if (aVar != null) {
            aVar.b(context, cVar, registry);
        }
    }

    static h.b<Registry> d(c cVar, List<com.bumptech.glide.module.c> list, @q0 com.bumptech.glide.module.a aVar) {
        return new a(cVar, list, aVar);
    }
}
