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
import n1.a;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes2.dex */
public class o {

    /* renamed from: m, reason: collision with root package name */
    public static final d f14040m = new m(0.5f);

    /* renamed from: a, reason: collision with root package name */
    e f14041a;

    /* renamed from: b, reason: collision with root package name */
    e f14042b;

    /* renamed from: c, reason: collision with root package name */
    e f14043c;

    /* renamed from: d, reason: collision with root package name */
    e f14044d;

    /* renamed from: e, reason: collision with root package name */
    d f14045e;

    /* renamed from: f, reason: collision with root package name */
    d f14046f;

    /* renamed from: g, reason: collision with root package name */
    d f14047g;

    /* renamed from: h, reason: collision with root package name */
    d f14048h;

    /* renamed from: i, reason: collision with root package name */
    g f14049i;

    /* renamed from: j, reason: collision with root package name */
    g f14050j;

    /* renamed from: k, reason: collision with root package name */
    g f14051k;

    /* renamed from: l, reason: collision with root package name */
    g f14052l;

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
    public static b b(Context context, @h1 int i5, @h1 int i6) {
        return c(context, i5, i6, 0);
    }

    @o0
    private static b c(Context context, @h1 int i5, @h1 int i6, int i7) {
        return d(context, i5, i6, new com.google.android.material.shape.a(i7));
    }

    @o0
    private static b d(Context context, @h1 int i5, @h1 int i6, @o0 d dVar) {
        if (i6 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i5);
            i5 = i6;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, a.o.jo);
        try {
            int i7 = obtainStyledAttributes.getInt(a.o.ko, 0);
            int i8 = obtainStyledAttributes.getInt(a.o.no, i7);
            int i9 = obtainStyledAttributes.getInt(a.o.oo, i7);
            int i10 = obtainStyledAttributes.getInt(a.o.mo, i7);
            int i11 = obtainStyledAttributes.getInt(a.o.lo, i7);
            d m5 = m(obtainStyledAttributes, a.o.po, dVar);
            d m6 = m(obtainStyledAttributes, a.o.so, m5);
            d m7 = m(obtainStyledAttributes, a.o.to, m5);
            d m8 = m(obtainStyledAttributes, a.o.ro, m5);
            return new b().I(i8, m6).N(i9, m7).A(i10, m8).v(i11, m(obtainStyledAttributes, a.o.qo, m5));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @o0
    public static b e(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6) {
        return f(context, attributeSet, i5, i6, 0);
    }

    @o0
    public static b f(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6, int i7) {
        return g(context, attributeSet, i5, i6, new com.google.android.material.shape.a(i7));
    }

    @o0
    public static b g(@o0 Context context, AttributeSet attributeSet, @androidx.annotation.f int i5, @h1 int i6, @o0 d dVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.rk, i5, i6);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.sk, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(a.o.tk, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    @o0
    private static d m(TypedArray typedArray, int i5, @o0 d dVar) {
        TypedValue peekValue = typedArray.peekValue(i5);
        if (peekValue == null) {
            return dVar;
        }
        int i6 = peekValue.type;
        return i6 == 5 ? new com.google.android.material.shape.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i6 == 6 ? new m(peekValue.getFraction(1.0f, 1.0f)) : dVar;
    }

    @o0
    public g h() {
        return this.f14051k;
    }

    @o0
    public e i() {
        return this.f14044d;
    }

    @o0
    public d j() {
        return this.f14048h;
    }

    @o0
    public e k() {
        return this.f14043c;
    }

    @o0
    public d l() {
        return this.f14047g;
    }

    @o0
    public g n() {
        return this.f14052l;
    }

    @o0
    public g o() {
        return this.f14050j;
    }

    @o0
    public g p() {
        return this.f14049i;
    }

    @o0
    public e q() {
        return this.f14041a;
    }

    @o0
    public d r() {
        return this.f14045e;
    }

    @o0
    public e s() {
        return this.f14042b;
    }

    @o0
    public d t() {
        return this.f14046f;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public boolean u(@o0 RectF rectF) {
        boolean z5 = this.f14052l.getClass().equals(g.class) && this.f14050j.getClass().equals(g.class) && this.f14049i.getClass().equals(g.class) && this.f14051k.getClass().equals(g.class);
        float a6 = this.f14045e.a(rectF);
        return z5 && ((this.f14046f.a(rectF) > a6 ? 1 : (this.f14046f.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f14048h.a(rectF) > a6 ? 1 : (this.f14048h.a(rectF) == a6 ? 0 : -1)) == 0 && (this.f14047g.a(rectF) > a6 ? 1 : (this.f14047g.a(rectF) == a6 ? 0 : -1)) == 0) && ((this.f14042b instanceof n) && (this.f14041a instanceof n) && (this.f14043c instanceof n) && (this.f14044d instanceof n));
    }

    @o0
    public b v() {
        return new b(this);
    }

    @o0
    public o w(float f6) {
        return v().o(f6).m();
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
        this.f14041a = bVar.f14053a;
        this.f14042b = bVar.f14054b;
        this.f14043c = bVar.f14055c;
        this.f14044d = bVar.f14056d;
        this.f14045e = bVar.f14057e;
        this.f14046f = bVar.f14058f;
        this.f14047g = bVar.f14059g;
        this.f14048h = bVar.f14060h;
        this.f14049i = bVar.f14061i;
        this.f14050j = bVar.f14062j;
        this.f14051k = bVar.f14063k;
        this.f14052l = bVar.f14064l;
    }

    public o() {
        this.f14041a = new n();
        this.f14042b = new n();
        this.f14043c = new n();
        this.f14044d = new n();
        this.f14045e = new com.google.android.material.shape.a(0.0f);
        this.f14046f = new com.google.android.material.shape.a(0.0f);
        this.f14047g = new com.google.android.material.shape.a(0.0f);
        this.f14048h = new com.google.android.material.shape.a(0.0f);
        this.f14049i = new g();
        this.f14050j = new g();
        this.f14051k = new g();
        this.f14052l = new g();
    }

    /* compiled from: ShapeAppearanceModel.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @o0
        private e f14053a;

        /* renamed from: b, reason: collision with root package name */
        @o0
        private e f14054b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        private e f14055c;

        /* renamed from: d, reason: collision with root package name */
        @o0
        private e f14056d;

        /* renamed from: e, reason: collision with root package name */
        @o0
        private d f14057e;

        /* renamed from: f, reason: collision with root package name */
        @o0
        private d f14058f;

        /* renamed from: g, reason: collision with root package name */
        @o0
        private d f14059g;

        /* renamed from: h, reason: collision with root package name */
        @o0
        private d f14060h;

        /* renamed from: i, reason: collision with root package name */
        @o0
        private g f14061i;

        /* renamed from: j, reason: collision with root package name */
        @o0
        private g f14062j;

        /* renamed from: k, reason: collision with root package name */
        @o0
        private g f14063k;

        /* renamed from: l, reason: collision with root package name */
        @o0
        private g f14064l;

        public b() {
            this.f14053a = new n();
            this.f14054b = new n();
            this.f14055c = new n();
            this.f14056d = new n();
            this.f14057e = new com.google.android.material.shape.a(0.0f);
            this.f14058f = new com.google.android.material.shape.a(0.0f);
            this.f14059g = new com.google.android.material.shape.a(0.0f);
            this.f14060h = new com.google.android.material.shape.a(0.0f);
            this.f14061i = new g();
            this.f14062j = new g();
            this.f14063k = new g();
            this.f14064l = new g();
        }

        private static float n(e eVar) {
            if (eVar instanceof n) {
                return ((n) eVar).f14039a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f13990a;
            }
            return -1.0f;
        }

        @o0
        public b A(int i5, @o0 d dVar) {
            b B = B(k.a(i5));
            B.f14059g = dVar;
            return B;
        }

        @o0
        public b B(@o0 e eVar) {
            this.f14055c = eVar;
            float n5 = n(eVar);
            if (n5 != -1.0f) {
                C(n5);
            }
            return this;
        }

        @o0
        public b C(@androidx.annotation.r float f6) {
            this.f14059g = new com.google.android.material.shape.a(f6);
            return this;
        }

        @o0
        public b D(@o0 d dVar) {
            this.f14059g = dVar;
            return this;
        }

        @o0
        public b E(@o0 g gVar) {
            this.f14064l = gVar;
            return this;
        }

        @o0
        public b F(@o0 g gVar) {
            this.f14062j = gVar;
            return this;
        }

        @o0
        public b G(@o0 g gVar) {
            this.f14061i = gVar;
            return this;
        }

        @o0
        public b H(int i5, @androidx.annotation.r float f6) {
            return J(k.a(i5)).K(f6);
        }

        @o0
        public b I(int i5, @o0 d dVar) {
            b J = J(k.a(i5));
            J.f14057e = dVar;
            return J;
        }

        @o0
        public b J(@o0 e eVar) {
            this.f14053a = eVar;
            float n5 = n(eVar);
            if (n5 != -1.0f) {
                K(n5);
            }
            return this;
        }

        @o0
        public b K(@androidx.annotation.r float f6) {
            this.f14057e = new com.google.android.material.shape.a(f6);
            return this;
        }

        @o0
        public b L(@o0 d dVar) {
            this.f14057e = dVar;
            return this;
        }

        @o0
        public b M(int i5, @androidx.annotation.r float f6) {
            return O(k.a(i5)).P(f6);
        }

        @o0
        public b N(int i5, @o0 d dVar) {
            b O = O(k.a(i5));
            O.f14058f = dVar;
            return O;
        }

        @o0
        public b O(@o0 e eVar) {
            this.f14054b = eVar;
            float n5 = n(eVar);
            if (n5 != -1.0f) {
                P(n5);
            }
            return this;
        }

        @o0
        public b P(@androidx.annotation.r float f6) {
            this.f14058f = new com.google.android.material.shape.a(f6);
            return this;
        }

        @o0
        public b Q(@o0 d dVar) {
            this.f14058f = dVar;
            return this;
        }

        @o0
        public o m() {
            return new o(this);
        }

        @o0
        public b o(@androidx.annotation.r float f6) {
            return K(f6).P(f6).C(f6).x(f6);
        }

        @o0
        public b p(@o0 d dVar) {
            this.f14057e = dVar;
            this.f14058f = dVar;
            this.f14059g = dVar;
            this.f14060h = dVar;
            return this;
        }

        @o0
        public b q(int i5, @androidx.annotation.r float f6) {
            return r(k.a(i5)).o(f6);
        }

        @o0
        public b r(@o0 e eVar) {
            return J(eVar).O(eVar).B(eVar).w(eVar);
        }

        @o0
        public b s(@o0 g gVar) {
            this.f14064l = gVar;
            this.f14061i = gVar;
            this.f14062j = gVar;
            this.f14063k = gVar;
            return this;
        }

        @o0
        public b t(@o0 g gVar) {
            this.f14063k = gVar;
            return this;
        }

        @o0
        public b u(int i5, @androidx.annotation.r float f6) {
            return w(k.a(i5)).x(f6);
        }

        @o0
        public b v(int i5, @o0 d dVar) {
            b w5 = w(k.a(i5));
            w5.f14060h = dVar;
            return w5;
        }

        @o0
        public b w(@o0 e eVar) {
            this.f14056d = eVar;
            float n5 = n(eVar);
            if (n5 != -1.0f) {
                x(n5);
            }
            return this;
        }

        @o0
        public b x(@androidx.annotation.r float f6) {
            this.f14060h = new com.google.android.material.shape.a(f6);
            return this;
        }

        @o0
        public b y(@o0 d dVar) {
            this.f14060h = dVar;
            return this;
        }

        @o0
        public b z(int i5, @androidx.annotation.r float f6) {
            return B(k.a(i5)).C(f6);
        }

        public b(@o0 o oVar) {
            this.f14053a = new n();
            this.f14054b = new n();
            this.f14055c = new n();
            this.f14056d = new n();
            this.f14057e = new com.google.android.material.shape.a(0.0f);
            this.f14058f = new com.google.android.material.shape.a(0.0f);
            this.f14059g = new com.google.android.material.shape.a(0.0f);
            this.f14060h = new com.google.android.material.shape.a(0.0f);
            this.f14061i = new g();
            this.f14062j = new g();
            this.f14063k = new g();
            this.f14064l = new g();
            this.f14053a = oVar.f14041a;
            this.f14054b = oVar.f14042b;
            this.f14055c = oVar.f14043c;
            this.f14056d = oVar.f14044d;
            this.f14057e = oVar.f14045e;
            this.f14058f = oVar.f14046f;
            this.f14059g = oVar.f14047g;
            this.f14060h = oVar.f14048h;
            this.f14061i = oVar.f14049i;
            this.f14062j = oVar.f14050j;
            this.f14063k = oVar.f14051k;
            this.f14064l = oVar.f14052l;
        }
    }
}
