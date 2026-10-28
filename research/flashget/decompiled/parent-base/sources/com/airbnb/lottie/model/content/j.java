package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.n0;

/* compiled from: PolystarShape.java */
/* loaded from: classes3.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39023a;

    /* renamed from: b, reason: collision with root package name */
    private final a f39024b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39025c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.m<PointF, PointF> f39026d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39027e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39028f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39029g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39030h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39031i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39032j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f39033k;

    /* compiled from: PolystarShape.java */
    public enum a {
        STAR(1),
        POLYGON(2);

        private final int value;

        a(int i4) {
            this.value = i4;
        }

        public static a forValue(int i4) {
            for (a aVar : values()) {
                if (aVar.value == i4) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.m<PointF, PointF> mVar, com.airbnb.lottie.model.animatable.b bVar2, com.airbnb.lottie.model.animatable.b bVar3, com.airbnb.lottie.model.animatable.b bVar4, com.airbnb.lottie.model.animatable.b bVar5, com.airbnb.lottie.model.animatable.b bVar6, boolean z4, boolean z5) {
        this.f39023a = str;
        this.f39024b = aVar;
        this.f39025c = bVar;
        this.f39026d = mVar;
        this.f39027e = bVar2;
        this.f39028f = bVar3;
        this.f39029g = bVar4;
        this.f39030h = bVar5;
        this.f39031i = bVar6;
        this.f39032j = z4;
        this.f39033k = z5;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.o(n0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.b b() {
        return this.f39028f;
    }

    public com.airbnb.lottie.model.animatable.b c() {
        return this.f39030h;
    }

    public String d() {
        return this.f39023a;
    }

    public com.airbnb.lottie.model.animatable.b e() {
        return this.f39029g;
    }

    public com.airbnb.lottie.model.animatable.b f() {
        return this.f39031i;
    }

    public com.airbnb.lottie.model.animatable.b g() {
        return this.f39025c;
    }

    public com.airbnb.lottie.model.animatable.m<PointF, PointF> h() {
        return this.f39026d;
    }

    public com.airbnb.lottie.model.animatable.b i() {
        return this.f39027e;
    }

    public a j() {
        return this.f39024b;
    }

    public boolean k() {
        return this.f39032j;
    }

    public boolean l() {
        return this.f39033k;
    }
}
