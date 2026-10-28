package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.q0;
import com.airbnb.lottie.n0;

/* compiled from: GradientFill.java */
/* loaded from: classes3.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private final g f38993a;

    /* renamed from: b, reason: collision with root package name */
    private final Path.FillType f38994b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.c f38995c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.d f38996d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f38997e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.f f38998f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38999g;

    /* renamed from: h, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.b f39000h;

    /* renamed from: i, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.model.animatable.b f39001i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39002j;

    public e(String str, g gVar, Path.FillType fillType, com.airbnb.lottie.model.animatable.c cVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.f fVar, com.airbnb.lottie.model.animatable.f fVar2, com.airbnb.lottie.model.animatable.b bVar, com.airbnb.lottie.model.animatable.b bVar2, boolean z4) {
        this.f38993a = gVar;
        this.f38994b = fillType;
        this.f38995c = cVar;
        this.f38996d = dVar;
        this.f38997e = fVar;
        this.f38998f = fVar2;
        this.f38999g = str;
        this.f39000h = bVar;
        this.f39001i = bVar2;
        this.f39002j = z4;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(n0 n0Var, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(n0Var, bVar, this);
    }

    public com.airbnb.lottie.model.animatable.f b() {
        return this.f38998f;
    }

    public Path.FillType c() {
        return this.f38994b;
    }

    public com.airbnb.lottie.model.animatable.c d() {
        return this.f38995c;
    }

    public g e() {
        return this.f38993a;
    }

    public String f() {
        return this.f38999g;
    }

    public com.airbnb.lottie.model.animatable.d g() {
        return this.f38996d;
    }

    public com.airbnb.lottie.model.animatable.f h() {
        return this.f38997e;
    }

    public boolean i() {
        return this.f39002j;
    }
}
