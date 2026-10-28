package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import androidx.annotation.m1;
import com.bumptech.glide.load.engine.bitmap_recycle.e;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.prefill.d;
import com.bumptech.glide.util.n;
import java.util.HashMap;

/* compiled from: BitmapPreFiller.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final j f11440a;

    /* renamed from: b, reason: collision with root package name */
    private final e f11441b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.b f11442c;

    /* renamed from: d, reason: collision with root package name */
    private a f11443d;

    public b(j jVar, e eVar, com.bumptech.glide.load.b bVar) {
        this.f11440a = jVar;
        this.f11441b = eVar;
        this.f11442c = bVar;
    }

    private static int b(d dVar) {
        return n.g(dVar.d(), dVar.b(), dVar.a());
    }

    @m1
    c a(d... dVarArr) {
        long e6 = this.f11441b.e() + (this.f11440a.e() - this.f11440a.d());
        int i5 = 0;
        for (d dVar : dVarArr) {
            i5 += dVar.c();
        }
        float f6 = e6 / i5;
        HashMap hashMap = new HashMap();
        for (d dVar2 : dVarArr) {
            hashMap.put(dVar2, Integer.valueOf(Math.round(dVar2.c() * f6) / b(dVar2)));
        }
        return new c(hashMap);
    }

    public void c(d.a... aVarArr) {
        a aVar = this.f11443d;
        if (aVar != null) {
            aVar.b();
        }
        d[] dVarArr = new d[aVarArr.length];
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            d.a aVar2 = aVarArr[i5];
            if (aVar2.b() == null) {
                aVar2.c(this.f11442c == com.bumptech.glide.load.b.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            dVarArr[i5] = aVar2.a();
        }
        a aVar3 = new a(this.f11441b, this.f11440a, a(dVarArr));
        this.f11443d = aVar3;
        n.x(aVar3);
    }
}
