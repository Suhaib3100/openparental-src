package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes3.dex */
public class p implements a.b, k, n {

    /* renamed from: c, reason: collision with root package name */
    private final String f38757c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f38758d;

    /* renamed from: e, reason: collision with root package name */
    private final n0 f38759e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f38760f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f38761g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38762h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f38765k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f38755a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f38756b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final b f38763i = new b();

    /* renamed from: j, reason: collision with root package name */
    @q0
    private com.airbnb.lottie.animation.keyframe.a<Float, Float> f38764j = null;

    public p(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.k kVar) {
        this.f38757c = kVar.c();
        this.f38758d = kVar.f();
        this.f38759e = n0Var;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p4 = kVar.d().p();
        this.f38760f = p4;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p5 = kVar.e().p();
        this.f38761g = p5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p6 = kVar.b().p();
        this.f38762h = p6;
        bVar.i(p4);
        bVar.i(p5);
        bVar.i(p6);
        p4.a(this);
        p5.a(this);
        p6.a(this);
    }

    private void g() {
        this.f38765k = false;
        this.f38759e.invalidateSelf();
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
                    this.f38763i.a(vVar);
                    vVar.d(this);
                }
            }
            if (cVar instanceof r) {
                this.f38764j = ((r) cVar).g();
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        if (t4 == s0.f39351l) {
            this.f38761g.n(jVar);
        } else if (t4 == s0.f39353n) {
            this.f38760f.n(jVar);
        } else if (t4 == s0.f39352m) {
            this.f38762h.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i4, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38757c;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar;
        if (this.f38765k) {
            return this.f38755a;
        }
        this.f38755a.reset();
        if (this.f38758d) {
            this.f38765k = true;
            return this.f38755a;
        }
        PointF h4 = this.f38761g.h();
        float f4 = h4.x / 2.0f;
        float f5 = h4.y / 2.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f38762h;
        float p4 = aVar2 == null ? 0.0f : ((com.airbnb.lottie.animation.keyframe.d) aVar2).p();
        if (p4 == 0.0f && (aVar = this.f38764j) != null) {
            p4 = Math.min(aVar.h().floatValue(), Math.min(f4, f5));
        }
        float min = Math.min(f4, f5);
        if (p4 > min) {
            p4 = min;
        }
        PointF h5 = this.f38760f.h();
        this.f38755a.moveTo(h5.x + f4, (h5.y - f5) + p4);
        this.f38755a.lineTo(h5.x + f4, (h5.y + f5) - p4);
        if (p4 > 0.0f) {
            RectF rectF = this.f38756b;
            float f6 = h5.x;
            float f7 = p4 * 2.0f;
            float f10 = h5.y;
            rectF.set((f6 + f4) - f7, (f10 + f5) - f7, f6 + f4, f10 + f5);
            this.f38755a.arcTo(this.f38756b, 0.0f, 90.0f, false);
        }
        this.f38755a.lineTo((h5.x - f4) + p4, h5.y + f5);
        if (p4 > 0.0f) {
            RectF rectF2 = this.f38756b;
            float f11 = h5.x;
            float f12 = h5.y;
            float f13 = p4 * 2.0f;
            rectF2.set(f11 - f4, (f12 + f5) - f13, (f11 - f4) + f13, f12 + f5);
            this.f38755a.arcTo(this.f38756b, 90.0f, 90.0f, false);
        }
        this.f38755a.lineTo(h5.x - f4, (h5.y - f5) + p4);
        if (p4 > 0.0f) {
            RectF rectF3 = this.f38756b;
            float f14 = h5.x;
            float f15 = h5.y;
            float f16 = p4 * 2.0f;
            rectF3.set(f14 - f4, f15 - f5, (f14 - f4) + f16, (f15 - f5) + f16);
            this.f38755a.arcTo(this.f38756b, 180.0f, 90.0f, false);
        }
        this.f38755a.lineTo((h5.x + f4) - p4, h5.y - f5);
        if (p4 > 0.0f) {
            RectF rectF4 = this.f38756b;
            float f17 = h5.x;
            float f18 = p4 * 2.0f;
            float f19 = h5.y;
            rectF4.set((f17 + f4) - f18, f19 - f5, f17 + f4, (f19 - f5) + f18);
            this.f38755a.arcTo(this.f38756b, 270.0f, 90.0f, false);
        }
        this.f38755a.close();
        this.f38763i.b(this.f38755a);
        this.f38765k = true;
        return this.f38755a;
    }
}
