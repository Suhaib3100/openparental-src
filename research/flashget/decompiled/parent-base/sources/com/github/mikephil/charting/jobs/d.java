package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.h;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

/* compiled from: MoveViewJob.java */
/* loaded from: classes5.dex */
public class d extends e {

    /* renamed from: j, reason: collision with root package name */
    private static h<d> f50459j;

    static {
        h<d> a5 = h.a(2, new d(null, 0.0f, 0.0f, null, null));
        f50459j = a5;
        a5.l(0.5f);
    }

    public d(l lVar, float f4, float f5, i iVar, View view) {
        super(lVar, f4, f5, iVar, view);
    }

    public static d d(l lVar, float f4, float f5, i iVar, View view) {
        d b5 = f50459j.b();
        b5.f50461e = lVar;
        b5.f50462f = f4;
        b5.f50463g = f5;
        b5.f50464h = iVar;
        b5.f50465i = view;
        return b5;
    }

    public static void e(d dVar) {
        f50459j.g(dVar);
    }

    @Override // com.github.mikephil.charting.utils.h.a
    protected h.a a() {
        return new d(this.f50461e, this.f50462f, this.f50463g, this.f50464h, this.f50465i);
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = this.f50460d;
        fArr[0] = this.f50462f;
        fArr[1] = this.f50463g;
        this.f50464h.o(fArr);
        this.f50461e.e(this.f50460d, this.f50465i);
        e(this);
    }
}
