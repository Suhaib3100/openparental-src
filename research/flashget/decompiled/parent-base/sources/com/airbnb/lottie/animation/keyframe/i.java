package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.q0;

/* compiled from: PathKeyframe.java */
/* loaded from: classes3.dex */
public class i extends com.airbnb.lottie.value.a<PointF> {

    /* renamed from: s, reason: collision with root package name */
    @q0
    private Path f38829s;

    /* renamed from: t, reason: collision with root package name */
    private final com.airbnb.lottie.value.a<PointF> f38830t;

    public i(com.airbnb.lottie.k kVar, com.airbnb.lottie.value.a<PointF> aVar) {
        super(kVar, aVar.f39405b, aVar.f39406c, aVar.f39407d, aVar.f39408e, aVar.f39409f, aVar.f39410g, aVar.f39411h);
        this.f38830t = aVar;
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        T t4;
        T t5;
        T t6 = this.f39406c;
        boolean z4 = (t6 == 0 || (t5 = this.f39405b) == 0 || !((PointF) t5).equals(((PointF) t6).x, ((PointF) t6).y)) ? false : true;
        T t7 = this.f39405b;
        if (t7 == 0 || (t4 = this.f39406c) == 0 || z4) {
            return;
        }
        com.airbnb.lottie.value.a<PointF> aVar = this.f38830t;
        this.f38829s = com.airbnb.lottie.utils.j.d((PointF) t7, (PointF) t4, aVar.f39418o, aVar.f39419p);
    }

    @q0
    Path j() {
        return this.f38829s;
    }
}
