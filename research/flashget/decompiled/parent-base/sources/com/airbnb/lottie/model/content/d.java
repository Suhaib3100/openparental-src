package com.airbnb.lottie.model.content;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: GradientColor.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f38991a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f38992b;

    public d(float[] fArr, int[] iArr) {
        this.f38991a = fArr;
        this.f38992b = iArr;
    }

    public int[] a() {
        return this.f38992b;
    }

    public float[] b() {
        return this.f38991a;
    }

    public int c() {
        return this.f38992b.length;
    }

    public void d(d dVar, d dVar2, float f4) {
        if (dVar.f38992b.length != dVar2.f38992b.length) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ĩ"));
            sb.append(dVar.f38992b.length);
            sb.append(ProtectedSandApp.s("ĩ"));
            throw new IllegalArgumentException(android.support.v4.media.b.a(sb, dVar2.f38992b.length, ProtectedSandApp.s("Ī")));
        }
        for (int i4 = 0; i4 < dVar.f38992b.length; i4++) {
            this.f38991a[i4] = com.airbnb.lottie.utils.i.k(dVar.f38991a[i4], dVar2.f38991a[i4], f4);
            this.f38992b[i4] = com.airbnb.lottie.utils.d.c(f4, dVar.f38992b[i4], dVar2.f38992b[i4]);
        }
    }
}
