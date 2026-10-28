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
import com.bumptech.glide.util.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes3.dex */
public class a implements k<ByteBuffer, c> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f44592f = ProtectedSandApp.s("ਏ");

    /* renamed from: g, reason: collision with root package name */
    private static final C0749a f44593g = new C0749a();

    /* renamed from: h, reason: collision with root package name */
    private static final b f44594h = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f44595a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f44596b;

    /* renamed from: c, reason: collision with root package name */
    private final b f44597c;

    /* renamed from: d, reason: collision with root package name */
    private final C0749a f44598d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.resource.gif.b f44599e;

    /* compiled from: ByteBufferGifDecoder.java */
    @m1
    /* renamed from: com.bumptech.glide.load.resource.gif.a$a, reason: collision with other inner class name */
    static class C0749a {
        C0749a() {
        }

        com.bumptech.glide.gifdecoder.a a(a.InterfaceC0732a interfaceC0732a, com.bumptech.glide.gifdecoder.c cVar, ByteBuffer byteBuffer, int i4) {
            return new com.bumptech.glide.gifdecoder.f(interfaceC0732a, cVar, byteBuffer, i4);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    @m1
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<com.bumptech.glide.gifdecoder.d> f44600a = o.g(0);

        b() {
        }

        synchronized com.bumptech.glide.gifdecoder.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.gifdecoder.d poll;
            try {
                poll = this.f44600a.poll();
                if (poll == null) {
                    poll = new com.bumptech.glide.gifdecoder.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return poll.q(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.gifdecoder.d dVar) {
            dVar.a();
            this.f44600a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, com.bumptech.glide.c.e(context).n().g(), com.bumptech.glide.c.e(context).h(), com.bumptech.glide.c.e(context).g());
    }

    @q0
    private e c(ByteBuffer byteBuffer, int i4, int i5, com.bumptech.glide.gifdecoder.d dVar, com.bumptech.glide.load.i iVar) {
        String s4 = ProtectedSandApp.s("ਏ");
        long b5 = com.bumptech.glide.util.i.b();
        try {
            com.bumptech.glide.gifdecoder.c d5 = dVar.d();
            if (d5.b() > 0 && d5.c() == 0) {
                Bitmap.Config config = iVar.c(i.f44647a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.gifdecoder.a a5 = this.f44598d.a(this.f44599e, d5, byteBuffer, e(d5, i4, i5));
                a5.e(config);
                a5.c();
                Bitmap nextFrame = a5.getNextFrame();
                if (nextFrame == null) {
                    if (Log.isLoggable(s4, 2)) {
                        com.bumptech.glide.util.i.a(b5);
                    }
                    return null;
                }
                e eVar = new e(new c(this.f44595a, a5, com.bumptech.glide.load.resource.k.c(), i4, i5, nextFrame));
                if (Log.isLoggable(s4, 2)) {
                    com.bumptech.glide.util.i.a(b5);
                }
                return eVar;
            }
            return null;
        } finally {
            if (Log.isLoggable(s4, 2)) {
                com.bumptech.glide.util.i.a(b5);
            }
        }
    }

    private static int e(com.bumptech.glide.gifdecoder.c cVar, int i4, int i5) {
        int min = Math.min(cVar.a() / i5, cVar.d() / i4);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable(ProtectedSandApp.s("ਏ"), 2) && max > 1) {
            cVar.d();
            cVar.a();
        }
        return max;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(@o0 ByteBuffer byteBuffer, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.gifdecoder.d a5 = this.f44597c.a(byteBuffer);
        try {
            return c(byteBuffer, i4, i5, a5, iVar);
        } finally {
            this.f44597c.b(a5);
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        return !((Boolean) iVar.c(i.f44648b)).booleanValue() && com.bumptech.glide.load.e.g(this.f44596b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(context, list, eVar, bVar, f44594h, f44593g);
    }

    @m1
    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, b bVar2, C0749a c0749a) {
        this.f44595a = context.getApplicationContext();
        this.f44596b = list;
        this.f44598d = c0749a;
        this.f44599e = new com.bumptech.glide.load.resource.gif.b(eVar, bVar);
        this.f44597c = bVar2;
    }
}
