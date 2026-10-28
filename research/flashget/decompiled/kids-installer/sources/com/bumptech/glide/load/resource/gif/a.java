package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.resource.l;
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes3.dex */
public class a implements k<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f11814f = ProtectedSandApp.s("ᵼ");

    /* renamed from: g, reason: collision with root package name */
    private static final C0150a f11815g = new C0150a();

    /* renamed from: h, reason: collision with root package name */
    private static final b f11816h = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f11817a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f11818b;

    /* renamed from: c, reason: collision with root package name */
    private final b f11819c;

    /* renamed from: d, reason: collision with root package name */
    private final C0150a f11820d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.gif.b f11821e;

    /* compiled from: ByteBufferGifDecoder.java */
    @m1
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0150a {
        C0150a() {
        }

        com.bumptech.glide.gifdecoder.a a(a.InterfaceC0133a interfaceC0133a, com.bumptech.glide.gifdecoder.c cVar, ByteBuffer byteBuffer, int i5) {
            return new com.bumptech.glide.gifdecoder.f(interfaceC0133a, cVar, byteBuffer, i5);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    @m1
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<com.bumptech.glide.gifdecoder.d> f11822a = n.f(0);

        b() {
        }

        synchronized com.bumptech.glide.gifdecoder.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.gifdecoder.d poll;
            poll = this.f11822a.poll();
            if (poll == null) {
                poll = new com.bumptech.glide.gifdecoder.d();
            }
            return poll.q(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.a();
            this.f11822a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, com.bumptech.glide.b.e(context).n().g(), com.bumptech.glide.b.e(context).h(), com.bumptech.glide.b.e(context).g());
    }

    @q0
    private e c(ByteBuffer byteBuffer, int i5, int i6, com.bumptech.glide.gifdecoder.d dVar, com.bumptech.glide.load.i iVar) {
        String s5 = ProtectedSandApp.s("ᵽ");
        long b6 = com.bumptech.glide.util.h.b();
        try {
            com.bumptech.glide.gifdecoder.c d6 = dVar.d();
            if (d6.b() > 0 && d6.c() == 0) {
                Bitmap.Config config = iVar.c(i.f11867a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.gifdecoder.a a6 = this.f11820d.a(this.f11821e, d6, byteBuffer, e(d6, i5, i6));
                a6.i(config);
                a6.e();
                Bitmap c6 = a6.c();
                if (c6 == null) {
                    return null;
                }
                e eVar = new e(new c(this.f11817a, a6, l.c(), i5, i6, c6));
                if (Log.isLoggable(s5, 2)) {
                    com.bumptech.glide.util.h.a(b6);
                }
                return eVar;
            }
            if (Log.isLoggable(s5, 2)) {
                com.bumptech.glide.util.h.a(b6);
            }
            return null;
        } finally {
            if (Log.isLoggable(s5, 2)) {
                com.bumptech.glide.util.h.a(b6);
            }
        }
    }

    private static int e(com.bumptech.glide.gifdecoder.c cVar, int i5, int i6) {
        int min = Math.min(cVar.a() / i6, cVar.d() / i5);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable(ProtectedSandApp.s("ᵾ"), 2) && max > 1) {
            cVar.d();
            cVar.a();
        }
        return max;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(@o0 ByteBuffer byteBuffer, int i5, int i6, @o0 com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.gifdecoder.d a6 = this.f11819c.a(byteBuffer);
        try {
            return c(byteBuffer, i5, i6, a6, iVar);
        } finally {
            this.f11819c.b(a6);
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        return !((Boolean) iVar.c(i.f11868b)).booleanValue() && com.bumptech.glide.load.e.f(this.f11818b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(context, list, eVar, bVar, f11816h, f11815g);
    }

    @m1
    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, b bVar2, C0150a c0150a) {
        this.f11817a = context.getApplicationContext();
        this.f11818b = list;
        this.f11820d = c0150a;
        this.f11821e = new com.bumptech.glide.load.resource.gif.b(eVar, bVar);
        this.f11819c = bVar2;
    }
}
