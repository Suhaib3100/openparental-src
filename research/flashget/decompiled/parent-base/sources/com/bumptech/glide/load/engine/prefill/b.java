package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.prefill.d;
import com.bumptech.glide.util.o;
import java.util.HashMap;

/* compiled from: BitmapPreFiller.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final j f44180a;

    /* renamed from: b, reason: collision with root package name */
    private final e f44181b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.b f44182c;

    /* renamed from: d, reason: collision with root package name */
    private a f44183d;

    public b(j jVar, e eVar, com.bumptech.glide.load.b bVar) {
        this.f44180a = jVar;
        this.f44181b = eVar;
        this.f44182c = bVar;
    }

    private static int b(d dVar) {
        return o.h(dVar.d(), dVar.b(), dVar.a());
    }

    @m1
    c a(d... dVarArr) {
        long a5 = this.f44181b.a() + (this.f44180a.a() - this.f44180a.e());
        int i4 = 0;
        for (d dVar : dVarArr) {
            i4 += dVar.c();
        }
        float f4 = a5 / i4;
        HashMap hashMap = new HashMap();
        for (d dVar2 : dVarArr) {
            hashMap.put(dVar2, Integer.valueOf(Math.round(dVar2.c() * f4) / b(dVar2)));
        }
        return new c(hashMap);
    }

    public void c(d.a... aVarArr) {
        a aVar = this.f44183d;
        if (aVar != null) {
            aVar.b();
        }
        d[] dVarArr = new d[aVarArr.length];
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            d.a aVar2 = aVarArr[i4];
            if (aVar2.b() == null) {
                aVar2.c(this.f44182c == com.bumptech.glide.load.b.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            dVarArr[i4] = aVar2.a();
        }
        a aVar3 = new a(this.f44181b, this.f44180a, a(dVarArr));
        this.f44183d = aVar3;
        o.y(aVar3);
    }
}
