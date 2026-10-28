package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes3.dex */
public class v implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f38794a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38795b;

    /* renamed from: c, reason: collision with root package name */
    private final List<a.b> f38796c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final s.a f38797d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38798e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38799f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38800g;

    public v(com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.s sVar) {
        this.f38794a = sVar.c();
        this.f38795b = sVar.g();
        this.f38797d = sVar.f();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p4 = sVar.e().p();
        this.f38798e = p4;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p5 = sVar.b().p();
        this.f38799f = p5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p6 = sVar.d().p();
        this.f38800g = p6;
        bVar.i(p4);
        bVar.i(p5);
        bVar.i(p6);
        p4.a(this);
        p5.a(this);
        p6.a(this);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        for (int i4 = 0; i4 < this.f38796c.size(); i4++) {
            this.f38796c.get(i4).a();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
    }

    void d(a.b bVar) {
        this.f38796c.add(bVar);
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> e() {
        return this.f38799f;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> g() {
        return this.f38800g;
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38794a;
    }

    public com.airbnb.lottie.animation.keyframe.a<?, Float> i() {
        return this.f38798e;
    }

    s.a j() {
        return this.f38797d;
    }

    public boolean k() {
        return this.f38795b;
    }
}
