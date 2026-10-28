package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.p;
import com.airbnb.lottie.n0;

/* compiled from: AnimatableTransform.java */
/* loaded from: classes3.dex */
public class l implements com.airbnb.lottie.animation.content.m, com.airbnb.lottie.model.content.c {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private final e f38959a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private final m<PointF, PointF> f38960b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private final g f38961c;

    /* renamed from: d, reason: collision with root package name */
    @q0
    private final b f38962d;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private final d f38963e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private final b f38964f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private final b f38965g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private final b f38966h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private final b f38967i;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // com.airbnb.lottie.model.content.c
    @q0
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return null;
    }

    public p b() {
        return new p(this);
    }

    @q0
    public e c() {
        return this.f38959a;
    }

    @q0
    public b d() {
        return this.f38967i;
    }

    @q0
    public d e() {
        return this.f38963e;
    }

    @q0
    public m<PointF, PointF> f() {
        return this.f38960b;
    }

    @q0
    public b g() {
        return this.f38962d;
    }

    @q0
    public g h() {
        return this.f38961c;
    }

    @q0
    public b i() {
        return this.f38964f;
    }

    @q0
    public b j() {
        return this.f38965g;
    }

    @q0
    public b k() {
        return this.f38966h;
    }

    public l(@q0 e eVar, @q0 m<PointF, PointF> mVar, @q0 g gVar, @q0 b bVar, @q0 d dVar, @q0 b bVar2, @q0 b bVar3, @q0 b bVar4, @q0 b bVar5) {
        this.f38959a = eVar;
        this.f38960b = mVar;
        this.f38961c = gVar;
        this.f38962d = bVar;
        this.f38963e = dVar;
        this.f38966h = bVar2;
        this.f38967i = bVar3;
        this.f38964f = bVar4;
        this.f38965g = bVar5;
    }
}
