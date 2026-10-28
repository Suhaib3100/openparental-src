package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.d0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.graphics.j0;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.o;

/* compiled from: TransitionUtils.java */
/* loaded from: classes6.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static final int f54832a = -1;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.f
    static final int f54833b = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f54838g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f54839h = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final String f54834c = ProtectedSandApp.s("\uf2aa");

    /* renamed from: d, reason: collision with root package name */
    private static final String f54835d = ProtectedSandApp.s("\uf2ab");

    /* renamed from: e, reason: collision with root package name */
    private static final String f54836e = ProtectedSandApp.s("\uf2ac");

    /* renamed from: f, reason: collision with root package name */
    private static final String f54837f = ProtectedSandApp.s("\uf2ad");

    /* renamed from: i, reason: collision with root package name */
    private static final RectF f54840i = new RectF();

    /* compiled from: TransitionUtils.java */
    static class a implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f54841a;

        a(RectF rectF) {
            this.f54841a = rectF;
        }

        @Override // com.google.android.material.shape.o.c
        @o0
        public com.google.android.material.shape.d a(@o0 com.google.android.material.shape.d dVar) {
            return dVar instanceof com.google.android.material.shape.m ? dVar : new com.google.android.material.shape.m(dVar.a(this.f54841a) / this.f54841a.height());
        }
    }

    /* compiled from: TransitionUtils.java */
    static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f54842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectF f54843b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54844c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54845d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f54846e;

        b(RectF rectF, RectF rectF2, float f4, float f5, float f6) {
            this.f54842a = rectF;
            this.f54843b = rectF2;
            this.f54844c = f4;
            this.f54845d = f5;
            this.f54846e = f6;
        }

        @Override // com.google.android.material.transition.u.d
        @o0
        public com.google.android.material.shape.d a(@o0 com.google.android.material.shape.d dVar, @o0 com.google.android.material.shape.d dVar2) {
            return new com.google.android.material.shape.a(u.o(dVar.a(this.f54842a), dVar2.a(this.f54843b), this.f54844c, this.f54845d, this.f54846e));
        }
    }

    /* compiled from: TransitionUtils.java */
    interface c {
        void a(Canvas canvas);
    }

    /* compiled from: TransitionUtils.java */
    interface d {
        @o0
        com.google.android.material.shape.d a(@o0 com.google.android.material.shape.d dVar, @o0 com.google.android.material.shape.d dVar2);
    }

    private u() {
    }

    static void A(Canvas canvas, Rect rect, float f4, float f5, float f6, int i4, c cVar) {
        if (i4 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f4, f5);
        canvas.scale(f6, f6);
        if (i4 < 255) {
            z(canvas, rect, i4);
        }
        cVar.a(canvas);
        canvas.restoreToCount(save);
    }

    static com.google.android.material.shape.o B(com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, d dVar) {
        return (m(oVar, rectF) ? oVar : oVar2).v().L(dVar.a(oVar.r(), oVar2.r())).Q(dVar.a(oVar.t(), oVar2.t())).y(dVar.a(oVar.j(), oVar2.j())).D(dVar.a(oVar.l(), oVar2.l())).m();
    }

    static float a(@o0 RectF rectF) {
        return rectF.height() * rectF.width();
    }

    static com.google.android.material.shape.o b(com.google.android.material.shape.o oVar, RectF rectF) {
        return oVar.y(new a(rectF));
    }

    static Shader c(@androidx.annotation.l int i4) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i4, i4, Shader.TileMode.CLAMP);
    }

    @o0
    static <T> T d(@q0 T t4, @o0 T t5) {
        return t4 != null ? t4 : t5;
    }

    static View e(View view, @d0 int i4) {
        String resourceName = view.getResources().getResourceName(i4);
        while (view != null) {
            if (view.getId() != i4) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(resourceName, ProtectedSandApp.s("\uf2ae")));
    }

    static View f(View view, @d0 int i4) {
        View findViewById = view.findViewById(i4);
        return findViewById != null ? findViewById : e(view, i4);
    }

    private static float g(String[] strArr, int i4) {
        float parseFloat = Float.parseFloat(strArr[i4]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\uf2af") + parseFloat);
    }

    private static String h(String str, String str2) {
        return androidx.core.content.f.a(str, 1, str2.length() + 1);
    }

    static RectF i(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    static RectF j(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    static Rect k(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(ProtectedSandApp.s("\uf2ac"));
        return str.startsWith(sb.toString()) && str.endsWith(ProtectedSandApp.s("\uf2ad"));
    }

    private static boolean m(com.google.android.material.shape.o oVar, RectF rectF) {
        return (oVar.r().a(rectF) == 0.0f && oVar.t().a(rectF) == 0.0f && oVar.l().a(rectF) == 0.0f && oVar.j().a(rectF) == 0.0f) ? false : true;
    }

    static float n(float f4, float f5, float f6) {
        return androidx.appcompat.graphics.drawable.d.a(f5, f4, f6, f4);
    }

    static float o(float f4, float f5, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f10) {
        return p(f4, f5, f6, f7, f10, false);
    }

    static float p(float f4, float f5, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d) float f10, boolean z4) {
        return (!z4 || (f10 >= 0.0f && f10 <= 1.0f)) ? f10 < f6 ? f4 : f10 > f7 ? f5 : n(f4, f5, (f10 - f6) / (f7 - f6)) : n(f4, f5, f10);
    }

    static int q(int i4, int i5, @x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 1.0d) float f5, @x(from = 0.0d, to = 1.0d) float f6) {
        return f6 < f4 ? i4 : f6 > f5 ? i5 : (int) n(i4, i5, (f6 - f4) / (f5 - f4));
    }

    static com.google.android.material.shape.o r(com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, @x(from = 0.0d, to = 1.0d) float f4, @x(from = 0.0d, to = 1.0d) float f5, @x(from = 0.0d, to = 1.0d) float f6) {
        return f6 < f4 ? oVar : f6 > f5 ? oVar2 : B(oVar, oVar2, rectF, new b(rectF, rectF2, f4, f5, f6));
    }

    static void s(TransitionSet transitionSet, @q0 Transition transition) {
        if (transition != null) {
            transitionSet.Q0(transition);
        }
    }

    static boolean t(Transition transition, Context context, @androidx.annotation.f int i4) {
        int e4;
        if (i4 == 0 || transition.J() != -1 || (e4 = com.google.android.material.resources.b.e(context, i4, -1)) == -1) {
            return false;
        }
        transition.A0(e4);
        return true;
    }

    static boolean u(Transition transition, Context context, @androidx.annotation.f int i4, TimeInterpolator timeInterpolator) {
        if (i4 == 0 || transition.N() != null) {
            return false;
        }
        transition.C0(x(context, i4, timeInterpolator));
        return true;
    }

    static boolean v(Transition transition, Context context, @androidx.annotation.f int i4) {
        PathMotion y4;
        if (i4 == 0 || (y4 = y(context, i4)) == null) {
            return false;
        }
        transition.E0(y4);
        return true;
    }

    static void w(TransitionSet transitionSet, @q0 Transition transition) {
        if (transition != null) {
            transitionSet.a1(transition);
        }
    }

    static TimeInterpolator x(Context context, @androidx.annotation.f int i4, @o0 TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf2b3"));
        }
        String valueOf = String.valueOf(typedValue.string);
        String s4 = ProtectedSandApp.s("\uf2aa");
        if (!l(valueOf, s4)) {
            String s5 = ProtectedSandApp.s("\uf2ab");
            if (l(valueOf, s5)) {
                return new PathInterpolator(j0.e(h(valueOf, s5)));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf2b2").concat(valueOf));
        }
        String[] split = h(valueOf, s4).split(ProtectedSandApp.s("\uf2b0"));
        if (split.length == 4) {
            return new PathInterpolator(g(split, 0), g(split, 1), g(split, 2), g(split, 3));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\uf2b1") + split.length);
    }

    @q0
    static PathMotion y(Context context, @androidx.annotation.f int i4) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.type;
        if (i5 != 16) {
            if (i5 == 3) {
                return new PatternPathMotion(j0.e(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf2b5"));
        }
        int i6 = typedValue.data;
        if (i6 == 0) {
            return null;
        }
        if (i6 == 1) {
            return new k();
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("\uf2b4"), i6));
    }

    private static int z(Canvas canvas, Rect rect, int i4) {
        RectF rectF = f54840i;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i4);
    }
}
