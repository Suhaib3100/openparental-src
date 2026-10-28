package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import s8.a;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes6.dex */
public class o {

    /* renamed from: m, reason: collision with root package name */
    public static final d f53913m = new m(0.5f);

    /* renamed from: a, reason: collision with root package name */
    e f53914a;

    /* renamed from: b, reason: collision with root package name */
    e f53915b;

    /* renamed from: c, reason: collision with root package name */
    e f53916c;

    /* renamed from: d, reason: collision with root package name */
    e f53917d;

    /* renamed from: e, reason: collision with root package name */
    d f53918e;

    /* renamed from: f, reason: collision with root package name */
    d f53919f;

    /* renamed from: g, reason: collision with root package name */
    d f53920g;

    /* renamed from: h, reason: collision with root package name */
    d f53921h;

    /* renamed from: i, reason: collision with root package name */
    g f53922i;

    /* renamed from: j, reason: collision with root package name */
    g f53923j;

    /* renamed from: k, reason: collision with root package name */
    g f53924k;

    /* renamed from: l, reason: collision with root package name */
    g f53925l;

    /* compiled from: ShapeAppearanceModel.java */
    @c1({c1.a.LIBRARY_GROUP})
    public interface c {
        @o0
        d a(@o0 d dVar);
    }

    @o0
    public static b a() {
        return new b();
    }

    @o0
    public static b b(Context context, @h1 int i4, @h1 int i5) {
        return c(context, i4, i5, 0);
    }

    @o0
    private static b c(Context context, @h1 int i4, @h1 int i5, int i6) {
        return d(context, i4, i5, new com.google.android.material.shape.a(i6));
    }

    @o0
    private static b d(Context context, @h1 int i4, @h1 int i5, @o0 d dVar) {
        if (i5 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
            i4 = i5;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, a.o.Op);
        try {
            int i6 = obtainStyledAttributes.getInt(a.o.Pp, 0);
            int i7 = obtainStyledAttributes.getInt(a.o.Sp, i6);
            int i10 = obtainStyledAttributes.getInt(a.o.Tp, i6);
            int i11 = obtainStyledAttributes.getInt(a.o.Rp, i6);
            int i12 = obtainStyledAttributes.getInt(a.o.Qp, i6);
            d m4 = m(obtainStyledAttributes, a.o.Up, dVar);
            d m5 = m(obtainStyledAttributes, a.o.Xp, m4);
            d m6 = m(obtainStyledAttributes, a.o.Yp, m4);
            d m7 = m(obtainStyledAttributes, a.o.Wp, m4);
            return new b().I(i7, m5).N(i10, m6).A(i11, m7).v(i12, m(obtainStyledAttributes, a.o.Vp, m4));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @o0
    public static b e(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5) {
        return f(context, attributeSet, i4, i5, 0);
    }

    @o0
    public static b f(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5, int i6) {
        return g(context, attributeSet, i4, i5, new com.google.android.material.shape.a(i6));
    }

    @o0
    public static b g(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i4, @h1 int i5, @o0 d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.Kl, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.Ll, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(a.o.Ml, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    @o0
    private static d m(TypedArray typedArray, int i4, @o0 d dVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue == null) {
            return dVar;
        }
        int i5 = peekValue.type;
        return i5 == 5 ? new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i5 == 6 ? new m(peekValue.getFraction(1.0f, 1.0f)) : dVar;
    }

    @o0
    public g h() {
        return this.f53924k;
    }

    @o0
    public e i() {
        return this.f53917d;
    }

    @o0
    public d j() {
        return this.f53921h;
    }

    @o0
    public e k() {
        return this.f53916c;
    }

    @o0
    public d l() {
        return this.f53920g;
    }

    @o0
    public g n() {
        return this.f53925l;
    }

    @o0
    public g o() {
        return this.f53923j;
    }

    @o0
    public g p() {
        return this.f53922i;
    }

    @o0
    public e q() {
        return this.f53914a;
    }

    @o0
    public d r() {
        return this.f53918e;
    }

    @o0
    public e s() {
        return this.f53915b;
    }

    @o0
    public d t() {
        return this.f53919f;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean u(@o0 RectF rectF) {
        boolean z4 = this.f53925l.getClass().equals(g.class) && this.f53923j.getClass().equals(g.class) && this.f53922i.getClass().equals(g.class) && this.f53924k.getClass().equals(g.class);
        float a5 = this.f53918e.a(rectF);
        return z4 && ((this.f53919f.a(rectF) > a5 ? 1 : (this.f53919f.a(rectF) == a5 ? 0 : -1)) == 0 && (this.f53921h.a(rectF) > a5 ? 1 : (this.f53921h.a(rectF) == a5 ? 0 : -1)) == 0 && (this.f53920g.a(rectF) > a5 ? 1 : (this.f53920g.a(rectF) == a5 ? 0 : -1)) == 0) && ((this.f53915b instanceof n) && (this.f53914a instanceof n) && (this.f53916c instanceof n) && (this.f53917d instanceof n));
    }

    @o0
    public b v() {
        return new b(this);
    }

    @o0
    public o w(float f4) {
        return v().o(f4).m();
    }

    @o0
    public o x(@o0 d dVar) {
        return v().p(dVar).m();
    }

    @c1({c1.a.LIBRARY_GROUP})
    @o0
    public o y(@o0 c cVar) {
        return v().L(cVar.a(r())).Q(cVar.a(t())).y(cVar.a(j())).D(cVar.a(l())).m();
    }

    private o(@o0 b bVar) {
        this.f53914a = bVar.f53926a;
        this.f53915b = bVar.f53927b;
        this.f53916c = bVar.f53928c;
        this.f53917d = bVar.f53929d;
        this.f53918e = bVar.f53930e;
        this.f53919f = bVar.f53931f;
        this.f53920g = bVar.f53932g;
        this.f53921h = bVar.f53933h;
        this.f53922i = bVar.f53934i;
        this.f53923j = bVar.f53935j;
        this.f53924k = bVar.f53936k;
        this.f53925l = bVar.f53937l;
    }

    public o() {
        this.f53914a = new n();
        this.f53915b = new n();
        this.f53916c = new n();
        this.f53917d = new n();
        this.f53918e = new com.google.android.material.shape.a(0.0f);
        this.f53919f = new com.google.android.material.shape.a(0.0f);
        this.f53920g = new com.google.android.material.shape.a(0.0f);
        this.f53921h = new com.google.android.material.shape.a(0.0f);
        this.f53922i = new g();
        this.f53923j = new g();
        this.f53924k = new g();
        this.f53925l = new g();
    }

    /* compiled from: ShapeAppearanceModel.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private e f53926a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private e f53927b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private e f53928c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private e f53929d;

        /* renamed from: e, reason: collision with root package name */
        @o0
        private d f53930e;

        /* renamed from: f, reason: collision with root package name */
        @o0
        private d f53931f;

        /* renamed from: g, reason: collision with root package name */
        @o0
        private d f53932g;

        /* renamed from: h, reason: collision with root package name */
        @o0
        private d f53933h;

        /* renamed from: i, reason: collision with root package name */
        @o0
        private g f53934i;

        /* renamed from: j, reason: collision with root package name */
        @o0
        private g f53935j;

        /* renamed from: k, reason: collision with root package name */
        @o0
        private g f53936k;

        /* renamed from: l, reason: collision with root package name */
        @o0
        private g f53937l;

        public b() {
            this.f53926a = new n();
            this.f53927b = new n();
            this.f53928c = new n();
            this.f53929d = new n();
            this.f53930e = new com.google.android.material.shape.a(0.0f);
            this.f53931f = new com.google.android.material.shape.a(0.0f);
            this.f53932g = new com.google.android.material.shape.a(0.0f);
            this.f53933h = new com.google.android.material.shape.a(0.0f);
            this.f53934i = new g();
            this.f53935j = new g();
            this.f53936k = new g();
            this.f53937l = new g();
        }

        private static float n(e eVar) {
            if (eVar instanceof n) {
                return ((n) eVar).f53912a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f53850a;
            }
            return -1.0f;
        }

        @o0
        public b A(int i4, @o0 d dVar) {
            b B = B(k.a(i4));
            B.f53932g = dVar;
            return B;
        }

        @o0
        public b B(@o0 e eVar) {
            this.f53928c = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                C(n4);
            }
            return this;
        }

        @o0
        public b C(@androidx.annotation.r float f4) {
            this.f53932g = new com.google.android.material.shape.a(f4);
            return this;
        }

        @o0
        public b D(@o0 d dVar) {
            this.f53932g = dVar;
            return this;
        }

        @o0
        public b E(@o0 g gVar) {
            this.f53937l = gVar;
            return this;
        }

        @o0
        public b F(@o0 g gVar) {
            this.f53935j = gVar;
            return this;
        }

        @o0
        public b G(@o0 g gVar) {
            this.f53934i = gVar;
            return this;
        }

        @o0
        public b H(int i4, @androidx.annotation.r float f4) {
            return J(k.a(i4)).K(f4);
        }

        @o0
        public b I(int i4, @o0 d dVar) {
            b J = J(k.a(i4));
            J.f53930e = dVar;
            return J;
        }

        @o0
        public b J(@o0 e eVar) {
            this.f53926a = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                K(n4);
            }
            return this;
        }

        @o0
        public b K(@androidx.annotation.r float f4) {
            this.f53930e = new com.google.android.material.shape.a(f4);
            return this;
        }

        @o0
        public b L(@o0 d dVar) {
            this.f53930e = dVar;
            return this;
        }

        @o0
        public b M(int i4, @androidx.annotation.r float f4) {
            return O(k.a(i4)).P(f4);
        }

        @o0
        public b N(int i4, @o0 d dVar) {
            b O = O(k.a(i4));
            O.f53931f = dVar;
            return O;
        }

        @o0
        public b O(@o0 e eVar) {
            this.f53927b = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                P(n4);
            }
            return this;
        }

        @o0
        public b P(@androidx.annotation.r float f4) {
            this.f53931f = new com.google.android.material.shape.a(f4);
            return this;
        }

        @o0
        public b Q(@o0 d dVar) {
            this.f53931f = dVar;
            return this;
        }

        @o0
        public o m() {
            return new o(this);
        }

        @o0
        public b o(@androidx.annotation.r float f4) {
            return K(f4).P(f4).C(f4).x(f4);
        }

        @o0
        public b p(@o0 d dVar) {
            this.f53930e = dVar;
            this.f53931f = dVar;
            this.f53932g = dVar;
            this.f53933h = dVar;
            return this;
        }

        @o0
        public b q(int i4, @androidx.annotation.r float f4) {
            return r(k.a(i4)).o(f4);
        }

        @o0
        public b r(@o0 e eVar) {
            return J(eVar).O(eVar).B(eVar).w(eVar);
        }

        @o0
        public b s(@o0 g gVar) {
            this.f53937l = gVar;
            this.f53934i = gVar;
            this.f53935j = gVar;
            this.f53936k = gVar;
            return this;
        }

        @o0
        public b t(@o0 g gVar) {
            this.f53936k = gVar;
            return this;
        }

        @o0
        public b u(int i4, @androidx.annotation.r float f4) {
            return w(k.a(i4)).x(f4);
        }

        @o0
        public b v(int i4, @o0 d dVar) {
            b w4 = w(k.a(i4));
            w4.f53933h = dVar;
            return w4;
        }

        @o0
        public b w(@o0 e eVar) {
            this.f53929d = eVar;
            float n4 = n(eVar);
            if (n4 != -1.0f) {
                x(n4);
            }
            return this;
        }

        @o0
        public b x(@androidx.annotation.r float f4) {
            this.f53933h = new com.google.android.material.shape.a(f4);
            return this;
        }

        @o0
        public b y(@o0 d dVar) {
            this.f53933h = dVar;
            return this;
        }

        @o0
        public b z(int i4, @androidx.annotation.r float f4) {
            return B(k.a(i4)).C(f4);
        }

        public b(@o0 o oVar) {
            this.f53926a = new n();
            this.f53927b = new n();
            this.f53928c = new n();
            this.f53929d = new n();
            this.f53930e = new com.google.android.material.shape.a(0.0f);
            this.f53931f = new com.google.android.material.shape.a(0.0f);
            this.f53932g = new com.google.android.material.shape.a(0.0f);
            this.f53933h = new com.google.android.material.shape.a(0.0f);
            this.f53934i = new g();
            this.f53935j = new g();
            this.f53936k = new g();
            this.f53937l = new g();
            this.f53926a = oVar.f53914a;
            this.f53927b = oVar.f53915b;
            this.f53928c = oVar.f53916c;
            this.f53929d = oVar.f53917d;
            this.f53930e = oVar.f53918e;
            this.f53931f = oVar.f53919f;
            this.f53932g = oVar.f53920g;
            this.f53933h = oVar.f53921h;
            this.f53934i = oVar.f53922i;
            this.f53935j = oVar.f53923j;
            this.f53936k = oVar.f53924k;
            this.f53937l = oVar.f53925l;
        }
    }
}
