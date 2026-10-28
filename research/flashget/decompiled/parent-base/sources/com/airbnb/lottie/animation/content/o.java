package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.j;
import com.airbnb.lottie.model.content.s;
import com.airbnb.lottie.n0;
import com.airbnb.lottie.s0;
import java.util.List;

/* compiled from: PolystarContent.java */
/* loaded from: classes3.dex */
public class o implements n, a.b, k {

    /* renamed from: p, reason: collision with root package name */
    private static final float f38737p = 0.47829f;

    /* renamed from: q, reason: collision with root package name */
    private static final float f38738q = 0.25f;

    /* renamed from: b, reason: collision with root package name */
    private final String f38740b;

    /* renamed from: c, reason: collision with root package name */
    private final n0 f38741c;

    /* renamed from: d, reason: collision with root package name */
    private final j.a f38742d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38743e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38744f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38745g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, PointF> f38746h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38747i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38748j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38749k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38750l;

    /* renamed from: m, reason: collision with root package name */
    private final com.airbnb.lottie.animation.keyframe.a<?, Float> f38751m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f38753o;

    /* renamed from: a, reason: collision with root package name */
    private final Path f38739a = new Path();

    /* renamed from: n, reason: collision with root package name */
    private final b f38752n = new b();

    /* compiled from: PolystarContent.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38754a;

        static {
            int[] iArr = new int[j.a.values().length];
            f38754a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38754a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(n0 n0Var, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.j jVar) {
        this.f38741c = n0Var;
        this.f38740b = jVar.d();
        j.a j4 = jVar.j();
        this.f38742d = j4;
        this.f38743e = jVar.k();
        this.f38744f = jVar.l();
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p4 = jVar.g().p();
        this.f38745g = p4;
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> p5 = jVar.h().p();
        this.f38746h = p5;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p6 = jVar.i().p();
        this.f38747i = p6;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p7 = jVar.e().p();
        this.f38749k = p7;
        com.airbnb.lottie.animation.keyframe.a<Float, Float> p10 = jVar.f().p();
        this.f38751m = p10;
        j.a aVar = j.a.STAR;
        if (j4 == aVar) {
            this.f38748j = jVar.b().p();
            this.f38750l = jVar.c().p();
        } else {
            this.f38748j = null;
            this.f38750l = null;
        }
        bVar.i(p4);
        bVar.i(p5);
        bVar.i(p6);
        bVar.i(p7);
        bVar.i(p10);
        if (j4 == aVar) {
            bVar.i(this.f38748j);
            bVar.i(this.f38750l);
        }
        p4.a(this);
        p5.a(this);
        p6.a(this);
        p7.a(this);
        p10.a(this);
        if (j4 == aVar) {
            this.f38748j.a(this);
            this.f38750l.a(this);
        }
    }

    private void g() {
        int i4;
        double d5;
        double d6;
        double d7;
        int floor = (int) Math.floor(this.f38745g.h().floatValue());
        double radians = Math.toRadians((this.f38747i == null ? com.google.firebase.remoteconfig.p.f60679p : r2.h().floatValue()) - 90.0d);
        double d10 = floor;
        float floatValue = this.f38751m.h().floatValue() / 100.0f;
        float floatValue2 = this.f38749k.h().floatValue();
        double d11 = floatValue2;
        float cos = (float) (Math.cos(radians) * d11);
        float sin = (float) (Math.sin(radians) * d11);
        this.f38739a.moveTo(cos, sin);
        double d12 = (float) (6.283185307179586d / d10);
        double d13 = radians + d12;
        double ceil = Math.ceil(d10);
        int i5 = 0;
        while (i5 < ceil) {
            float cos2 = (float) (Math.cos(d13) * d11);
            double d14 = ceil;
            float sin2 = (float) (Math.sin(d13) * d11);
            if (floatValue != 0.0f) {
                d6 = d11;
                i4 = i5;
                d5 = d13;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d7 = d12;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f4 = floatValue2 * floatValue * f38738q;
                this.f38739a.cubicTo(cos - (cos3 * f4), sin - (sin3 * f4), cos2 + (cos4 * f4), sin2 + (f4 * sin4), cos2, sin2);
            } else {
                i4 = i5;
                d5 = d13;
                d6 = d11;
                d7 = d12;
                this.f38739a.lineTo(cos2, sin2);
            }
            d13 = d5 + d7;
            i5 = i4 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d14;
            d11 = d6;
            d12 = d7;
        }
        PointF h4 = this.f38746h.h();
        this.f38739a.offset(h4.x, h4.y);
        this.f38739a.close();
    }

    private void i() {
        int i4;
        float f4;
        float f5;
        double d5;
        float f6;
        float f7;
        float f10;
        float f11;
        double d6;
        float f12;
        float f13;
        float f14;
        double d7;
        float floatValue = this.f38745g.h().floatValue();
        double radians = Math.toRadians((this.f38747i == null ? com.google.firebase.remoteconfig.p.f60679p : r2.h().floatValue()) - 90.0d);
        double d10 = floatValue;
        float f15 = (float) (6.283185307179586d / d10);
        if (this.f38744f) {
            f15 *= -1.0f;
        }
        float f16 = f15 / 2.0f;
        float f17 = floatValue - ((int) floatValue);
        int i5 = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1));
        if (i5 != 0) {
            radians += (1.0f - f17) * f16;
        }
        float floatValue2 = this.f38749k.h().floatValue();
        float floatValue3 = this.f38748j.h().floatValue();
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar = this.f38750l;
        float floatValue4 = aVar != null ? aVar.h().floatValue() / 100.0f : 0.0f;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2 = this.f38751m;
        float floatValue5 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        if (i5 != 0) {
            f7 = androidx.appcompat.graphics.drawable.d.a(floatValue2, floatValue3, f17, floatValue3);
            i4 = i5;
            double d11 = f7;
            float cos = (float) (Math.cos(radians) * d11);
            f6 = (float) (Math.sin(radians) * d11);
            this.f38739a.moveTo(cos, f6);
            d5 = radians + ((f15 * f17) / 2.0f);
            f4 = cos;
            f5 = f16;
        } else {
            i4 = i5;
            double d12 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d12);
            float sin = (float) (d12 * Math.sin(radians));
            this.f38739a.moveTo(cos2, sin);
            f4 = cos2;
            f5 = f16;
            d5 = radians + f5;
            f6 = sin;
            f7 = 0.0f;
        }
        double ceil = Math.ceil(d10) * 2.0d;
        int i6 = 0;
        float f18 = f5;
        float f19 = f4;
        boolean z4 = false;
        while (true) {
            double d13 = i6;
            if (d13 >= ceil) {
                PointF h4 = this.f38746h.h();
                this.f38739a.offset(h4.x, h4.y);
                this.f38739a.close();
                return;
            }
            float f20 = z4 ? floatValue2 : floatValue3;
            if (f7 == 0.0f || d13 != ceil - 2.0d) {
                f10 = f15;
                f11 = f18;
            } else {
                f10 = f15;
                f11 = (f15 * f17) / 2.0f;
            }
            if (f7 == 0.0f || d13 != ceil - 1.0d) {
                d6 = d13;
                f12 = f7;
                f7 = f20;
            } else {
                d6 = d13;
                f12 = f7;
            }
            double d14 = f7;
            double d15 = ceil;
            float cos3 = (float) (Math.cos(d5) * d14);
            float sin2 = (float) (d14 * Math.sin(d5));
            if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                this.f38739a.lineTo(cos3, sin2);
                d7 = d5;
                f13 = floatValue4;
                f14 = floatValue5;
            } else {
                f13 = floatValue4;
                double atan2 = (float) (Math.atan2(f6, f19) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                f14 = floatValue5;
                d7 = d5;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f21 = z4 ? f13 : f14;
                float f22 = z4 ? f14 : f13;
                float f23 = z4 ? floatValue3 : floatValue2;
                float f24 = z4 ? floatValue2 : floatValue3;
                float f25 = f23 * f21 * f38737p;
                float f26 = cos4 * f25;
                float f27 = f25 * sin3;
                float f28 = f24 * f22 * f38737p;
                float f29 = cos5 * f28;
                float f30 = f28 * sin4;
                if (i4 != 0) {
                    if (i6 == 0) {
                        f26 *= f17;
                        f27 *= f17;
                    } else if (d6 == d15 - 1.0d) {
                        f29 *= f17;
                        f30 *= f17;
                    }
                }
                this.f38739a.cubicTo(f19 - f26, f6 - f27, cos3 + f29, sin2 + f30, cos3, sin2);
            }
            d5 = d7 + f11;
            z4 = !z4;
            i6++;
            f19 = cos3;
            f6 = sin2;
            floatValue5 = f14;
            floatValue4 = f13;
            f7 = f12;
            f15 = f10;
            ceil = d15;
        }
    }

    private void j() {
        this.f38753o = false;
        this.f38741c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public void a() {
        j();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List<c> list, List<c> list2) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            c cVar = list.get(i4);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f38752n.a(vVar);
                    vVar.d(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.model.f
    public <T> void d(T t4, @q0 com.airbnb.lottie.value.j<T> jVar) {
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar;
        com.airbnb.lottie.animation.keyframe.a<?, Float> aVar2;
        if (t4 == s0.f39362w) {
            this.f38745g.n(jVar);
            return;
        }
        if (t4 == s0.f39363x) {
            this.f38747i.n(jVar);
            return;
        }
        if (t4 == s0.f39353n) {
            this.f38746h.n(jVar);
            return;
        }
        if (t4 == s0.f39364y && (aVar2 = this.f38748j) != null) {
            aVar2.n(jVar);
            return;
        }
        if (t4 == s0.f39365z) {
            this.f38749k.n(jVar);
            return;
        }
        if (t4 == s0.A && (aVar = this.f38750l) != null) {
            aVar.n(jVar);
        } else if (t4 == s0.B) {
            this.f38751m.n(jVar);
        }
    }

    @Override // com.airbnb.lottie.model.f
    public void e(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2) {
        com.airbnb.lottie.utils.i.m(eVar, i4, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f38740b;
    }

    @Override // com.airbnb.lottie.animation.content.n
    public Path getPath() {
        if (this.f38753o) {
            return this.f38739a;
        }
        this.f38739a.reset();
        if (this.f38743e) {
            this.f38753o = true;
            return this.f38739a;
        }
        int i4 = a.f38754a[this.f38742d.ordinal()];
        if (i4 == 1) {
            i();
        } else if (i4 == 2) {
            g();
        }
        this.f38739a.close();
        this.f38752n.b(this.f38739a);
        this.f38753o = true;
        return this.f38739a;
    }
}
