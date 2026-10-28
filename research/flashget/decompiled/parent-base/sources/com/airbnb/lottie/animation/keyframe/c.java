package com.airbnb.lottie.animation.keyframe;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes3.dex */
public class c implements a.b {

    /* renamed from: h, reason: collision with root package name */
    private static final double f38815h = 0.017453292519943295d;

    /* renamed from: a, reason: collision with root package name */
    private final a.b f38816a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Integer, Integer> f38817b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f38818c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f38819d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f38820e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<Float, Float> f38821f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f38822g = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    class a extends com.airbnb.lottie.value.j<Float> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.value.j f38823d;

        a(com.airbnb.lottie.value.j jVar) {
            this.f38823d = jVar;
        }

        @Override // com.airbnb.lottie.value.j
        @q0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float a(com.airbnb.lottie.value.b<Float> bVar) {
            Float f4 = (Float) this.f38823d.a(bVar);
            if (f4 == null) {
                return null;
            }
            return Float.valueOf(f4.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, com.airbnb.lottie.model.layer.b bVar2, com.airbnb.lottie.parser.j jVar) {
        this.f38816a = bVar;
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> p4 = jVar.a().p();
        this.f38817b = p4;
        p4.a(this);
        bVar2.i(p4);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p5 = jVar.d().p();
        this.f38818c = p5;
        p5.a(this);
        bVar2.i(p5);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p6 = jVar.b().p();
        this.f38819d = p6;
        p6.a(this);
        bVar2.i(p6);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p7 = jVar.c().p();
        this.f38820e = p7;
        p7.a(this);
        bVar2.i(p7);
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p10 = jVar.e().p();
        this.f38821f = p10;
        p10.a(this);
        bVar2.i(p10);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        this.f38822g = true;
        this.f38816a.a();
    }

    public void b(Paint paint) {
        if (this.f38822g) {
            this.f38822g = false;
            double floatValue = this.f38819d.h().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f38820e.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f38817b.h().intValue();
            paint.setShadowLayer(this.f38821f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f38818c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(@q0 com.airbnb.lottie.value.j<Integer> jVar) {
        this.f38817b.n(jVar);
    }

    public void d(@q0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f38819d.n(jVar);
    }

    public void e(@q0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f38820e.n(jVar);
    }

    public void f(@q0 com.airbnb.lottie.value.j<Float> jVar) {
        if (jVar == null) {
            this.f38818c.n(null);
        } else {
            this.f38818c.n(new a(jVar));
        }
    }

    public void g(@q0 com.airbnb.lottie.value.j<Float> jVar) {
        this.f38821f.n(jVar);
    }
}
