package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes3.dex */
public class f implements n, a.b, k {

    /* renamed from: i, reason: collision with root package name */
    private static final float f38677i = 0.55228f;

    /* renamed from: b, reason: collision with root package name */
    private final String f38679b;

    /* renamed from: c, reason: collision with root package name */
    private final n0 f38680c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f38681d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f38682e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.model.content.b f38683f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f38685h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f38678a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final b f38684g = new b();

    public f(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.b bVar2) {
        this.f38679b = bVar2.b();
        this.f38680c = n0Var;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p4 = bVar2.d().p();
        this.f38681d = p4;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p5 = bVar2.c().p();
        this.f38682e = p5;
        this.f38683f = bVar2;
        bVar.i(p4);
        bVar.i(p5);
        p4.a(this);
        p5.a(this);
    }

    private void g() {
        this.f38685h = false;
        this.f38680c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        g();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f38684g.a(vVar);
                    vVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        if (t4 == s0.f39350k) {
            this.f38681d.n(jVar);
        } else if (t4 == s0.f39353n) {
            this.f38682e.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i4, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38679b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f38685h) {
            return this.f38678a;
        }
        this.f38678a.reset();
        if (this.f38683f.e()) {
            this.f38685h = true;
            return this.f38678a;
        }
        PointF h4 = this.f38681d.h();
        float f4 = h4.x / 2.0f;
        float f5 = h4.y / 2.0f;
        float f6 = f4 * f38677i;
        float f7 = f38677i * f5;
        this.f38678a.reset();
        if (this.f38683f.f()) {
            float f10 = -f5;
            this.f38678a.moveTo(0.0f, f10);
            float f11 = 0.0f - f6;
            float f12 = -f4;
            float f13 = 0.0f - f7;
            this.f38678a.cubicTo(f11, f10, f12, f13, f12, 0.0f);
            float f14 = f7 + 0.0f;
            this.f38678a.cubicTo(f12, f14, f11, f5, 0.0f, f5);
            float f15 = f6 + 0.0f;
            this.f38678a.cubicTo(f15, f5, f4, f14, f4, 0.0f);
            this.f38678a.cubicTo(f4, f13, f15, f10, 0.0f, f10);
        } else {
            float f16 = -f5;
            this.f38678a.moveTo(0.0f, f16);
            float f17 = f6 + 0.0f;
            float f18 = 0.0f - f7;
            this.f38678a.cubicTo(f17, f16, f4, f18, f4, 0.0f);
            float f19 = f7 + 0.0f;
            this.f38678a.cubicTo(f4, f19, f17, f5, 0.0f, f5);
            float f20 = 0.0f - f6;
            float f21 = -f4;
            this.f38678a.cubicTo(f20, f5, f21, f19, f21, 0.0f);
            this.f38678a.cubicTo(f21, f18, f20, f16, 0.0f, f16);
        }
        PointF h5 = this.f38682e.h();
        this.f38678a.offset(h5.x, h5.y);
        this.f38678a.close();
        this.f38684g.b(this.f38678a);
        this.f38685h = true;
        return this.f38678a;
    }
}
