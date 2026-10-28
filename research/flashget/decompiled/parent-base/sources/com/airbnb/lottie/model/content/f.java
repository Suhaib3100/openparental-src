package com.airbnb.lottie.model.content;

import androidx.annotation.q0;
import com.airbnb.lottie.model.content.r;
import com.airbnb.lottie.n0;
import java.util.List;

/* compiled from: GradientStroke.java */
/* loaded from: classes3.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f39003a;

    /* renamed from: b, reason: collision with root package name */
    private final g f39004b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f39005c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f39006d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f39007e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f39008f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.b f39009g;

    /* renamed from: h, reason: collision with root package name */
    private final r.b f39010h;

    /* renamed from: i, reason: collision with root package name */
    private final r.c f39011i;

    /* renamed from: j, reason: collision with root package name */
    private final float f39012j;

    /* renamed from: k, reason: collision with root package name */
    private final List<com.airbnb.lottie.model.animatable.b> f39013k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.b f39014l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f39015m;

    public f(String str, g gVar, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, r.b bVar2, r.c cVar2, float f4, List<com.airbnb.lottie.model.animatable.b> list, @q0 com.airbnb.lottie.model.animatable.b bVar3, boolean z4) {
        this.f39003a = str;
        this.f39004b = gVar;
        this.f39005c = cVar;
        this.f39006d = dVar;
        this.f39007e = fVar;
        this.f39008f = fVar2;
        this.f39009g = bVar;
        this.f39010h = bVar2;
        this.f39011i = cVar2;
        this.f39012j = f4;
        this.f39013k = list;
        this.f39014l = bVar3;
        this.f39015m = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.i(n0Var, bVar, this);
    }

    public r.b b() {
        return this.f39010h;
    }

    @q0
    public com.airbnb.lottie.model.animatable.b c() {
        return this.f39014l;
    }

    public com.airbnb.lottie.model.animatable.f d() {
        return this.f39008f;
    }

    public com.airbnb.lottie.model.animatable.c e() {
        return this.f39005c;
    }

    public g f() {
        return this.f39004b;
    }

    public r.c g() {
        return this.f39011i;
    }

    public List<com.airbnb.lottie.model.animatable.b> h() {
        return this.f39013k;
    }

    public float i() {
        return this.f39012j;
    }

    public String j() {
        return this.f39003a;
    }

    public com.airbnb.lottie.model.animatable.d k() {
        return this.f39006d;
    }

    public com.airbnb.lottie.model.animatable.f l() {
        return this.f39007e;
    }

    public com.airbnb.lottie.model.animatable.b m() {
        return this.f39009g;
    }

    public boolean n() {
        return this.f39015m;
    }
}
