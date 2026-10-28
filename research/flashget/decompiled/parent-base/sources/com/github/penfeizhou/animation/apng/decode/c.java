package com.github.penfeizhou.animation.apng.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;

/* compiled from: APNGFrame.java */
/* loaded from: classes5.dex */
public class c extends com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.apng.io.a, com.github.penfeizhou.animation.apng.io.b> {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f50714f = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f50715g = {0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<CRC32> f50716h = new ThreadLocal<>();

    /* renamed from: i, reason: collision with root package name */
    static final /* synthetic */ boolean f50717i = false;

    /* renamed from: a, reason: collision with root package name */
    public final byte f50718a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f50719b;

    /* renamed from: c, reason: collision with root package name */
    byte[] f50720c;

    /* renamed from: d, reason: collision with root package name */
    List<e> f50721d;

    /* renamed from: e, reason: collision with root package name */
    List<e> f50722e;

    public c(com.github.penfeizhou.animation.apng.io.a aVar, f fVar) {
        super(aVar);
        this.f50721d = new ArrayList();
        this.f50722e = new ArrayList();
        this.f50718a = fVar.f50741m;
        this.f50719b = fVar.f50740l;
        int i4 = fVar.f50738j * 1000;
        short s4 = fVar.f50739k;
        int i5 = i4 / (s4 == 0 ? (short) 100 : s4);
        this.frameDuration = i5;
        if (i5 < 10) {
            this.frameDuration = 100;
        }
        this.frameWidth = fVar.f50734f;
        this.frameHeight = fVar.f50735g;
        this.frameX = fVar.f50736h;
        this.frameY = fVar.f50737i;
    }

    private int b(com.github.penfeizhou.animation.apng.io.b bVar) throws IOException {
        int i4;
        Iterator<e> it = this.f50722e.iterator();
        int i5 = 33;
        while (it.hasNext()) {
            i5 += it.next().f50723a + 12;
        }
        for (e eVar : this.f50721d) {
            if (eVar instanceof h) {
                i4 = eVar.f50723a + 12;
            } else if (eVar instanceof g) {
                i4 = eVar.f50723a + 8;
            }
            i5 = i4 + i5;
        }
        int length = i5 + f50715g.length;
        bVar.e(length);
        bVar.a(f50714f);
        bVar.f(13);
        int position = bVar.position();
        bVar.c(j.f50746h);
        bVar.f(this.frameWidth);
        bVar.f(this.frameHeight);
        bVar.a(this.f50720c);
        CRC32 c5 = c();
        c5.reset();
        c5.update(bVar.m(), position, 17);
        bVar.f((int) c5.getValue());
        for (e eVar2 : this.f50722e) {
            if (!(eVar2 instanceof i)) {
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).reset();
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).skip(eVar2.f50726d);
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).read(bVar.m(), bVar.position(), eVar2.f50723a + 12);
                bVar.b(eVar2.f50723a + 12);
            }
        }
        for (e eVar3 : this.f50721d) {
            if (eVar3 instanceof h) {
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).reset();
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).skip(eVar3.f50726d);
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).read(bVar.m(), bVar.position(), eVar3.f50723a + 12);
                bVar.b(eVar3.f50723a + 12);
            } else if (eVar3 instanceof g) {
                bVar.f(eVar3.f50723a - 4);
                int position2 = bVar.position();
                bVar.c(h.f50744e);
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).reset();
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).skip(eVar3.f50726d + 12);
                ((com.github.penfeizhou.animation.apng.io.a) this.reader).read(bVar.m(), bVar.position(), eVar3.f50723a - 4);
                bVar.b(eVar3.f50723a - 4);
                c5.reset();
                c5.update(bVar.m(), position2, eVar3.f50723a);
                bVar.f((int) c5.getValue());
            }
        }
        bVar.a(f50715g);
        return length;
    }

    private CRC32 c() {
        ThreadLocal<CRC32> threadLocal = f50716h;
        CRC32 crc32 = threadLocal.get();
        if (crc32 != null) {
            return crc32;
        }
        CRC32 crc322 = new CRC32();
        threadLocal.set(crc322);
        return crc322;
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap draw(Canvas canvas, Paint paint, int i4, Bitmap bitmap, com.github.penfeizhou.animation.apng.io.b bVar) {
        Bitmap decodeByteArray;
        try {
            int b5 = b(bVar);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = false;
            options.inSampleSize = i4;
            options.inMutable = true;
            options.inBitmap = bitmap;
            byte[] m4 = bVar.m();
            try {
                decodeByteArray = BitmapFactory.decodeByteArray(m4, 0, b5, options);
            } catch (IllegalArgumentException unused) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = i4;
                options2.inMutable = true;
                decodeByteArray = BitmapFactory.decodeByteArray(m4, 0, b5, options2);
            }
            Rect rect = this.srcRect;
            rect.left = 0;
            rect.top = 0;
            rect.right = decodeByteArray.getWidth();
            this.srcRect.bottom = decodeByteArray.getHeight();
            Rect rect2 = this.dstRect;
            int i5 = this.frameX;
            float f4 = i4;
            rect2.left = (int) (i5 / f4);
            rect2.top = (int) (this.frameY / f4);
            rect2.right = (int) ((i5 / f4) + decodeByteArray.getWidth());
            this.dstRect.bottom = (int) ((this.frameY / f4) + decodeByteArray.getHeight());
            canvas.drawBitmap(decodeByteArray, this.srcRect, this.dstRect, paint);
            return decodeByteArray;
        } catch (IOException e4) {
            e4.printStackTrace();
            return null;
        }
    }
}
