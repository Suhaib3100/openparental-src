package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import androidx.annotation.q0;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;

/* compiled from: StrokeContent.java */
/* loaded from: classes3.dex */
public class u extends a {

    /* renamed from: r, reason: collision with root package name */
    private final com.airbnb.lottie.model.layer.b f38789r;

    /* renamed from: s, reason: collision with root package name */
    private final String f38790s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f38791t;

    /* renamed from: u, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f38792u;

    /* renamed from: v, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> f38793v;

    public u(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.r rVar) {
        super(n0Var, bVar, rVar.b().toPaintCap(), rVar.e().toPaintJoin(), rVar.g(), rVar.i(), rVar.j(), rVar.f(), rVar.d());
        this.f38789r = bVar;
        this.f38790s = rVar.h();
        this.f38791t = rVar.k();
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p4 = rVar.c().p();
        this.f38792u = p4;
        p4.a(this);
        bVar.i(p4);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        super.d(t4, jVar);
        if (t4 == s0.f39341b) {
            this.f38792u.n(jVar);
            return;
        }
        if (t4 == s0.K) {
            com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38793v;
            if (aVar != null) {
                this.f38789r.G(aVar);
            }
            if (jVar == null) {
                this.f38793v = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f38793v = qVar;
            qVar.a(this);
            this.f38789r.i(this.f38792u);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38790s;
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void h(Canvas canvas, Matrix matrix, int i4) {
        if (this.f38791t) {
            return;
        }
        this.f38654i.setColor(((com.airbnb.lottie.animation.keyframe.b) this.f38792u).p());
        com.airbnb.lottie.animation.keyframe.a<ColorFilter, ColorFilter> aVar = this.f38793v;
        if (aVar != null) {
            this.f38654i.setColorFilter(aVar.h());
        }
        super.h(canvas, matrix, i4);
    }
}
