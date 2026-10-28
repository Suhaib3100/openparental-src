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
import androidx.annotation.d0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.graphics.b2;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.o;

/* compiled from: TransitionUtils.java */
/* loaded from: classes2.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    static final int f14996a = -1;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.f
    static final int f14997b = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f15002g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f15003h = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final String f14998c = ProtectedSandApp.s("ካ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f14999d = ProtectedSandApp.s("ኬ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f15000e = ProtectedSandApp.s("ክ");

    /* renamed from: f, reason: collision with root package name */
    private static final String f15001f = ProtectedSandApp.s("ኮ");

    /* renamed from: i, reason: collision with root package name */
    private static final RectF f15004i = new RectF();

    /* compiled from: TransitionUtils.java */
    /* loaded from: classes3.dex */
    static class a implements o.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f15005a;

        a(RectF rectF) {
            this.f15005a = rectF;
        }

        @Override // com.google.android.material.shape.o.c
        @o0
        public com.google.android.material.shape.d a(@o0 com.google.android.material.shape.d dVar) {
            return dVar instanceof com.google.android.material.shape.m ? dVar : new com.google.android.material.shape.m(dVar.a(this.f15005a) / this.f15005a.height());
        }
    }

    /* compiled from: TransitionUtils.java */
    /* loaded from: classes3.dex */
    static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RectF f15006a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RectF f15007b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f15008c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f15009d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f15010e;

        b(RectF rectF, RectF rectF2, float f6, float f7, float f8) {
            this.f15006a = rectF;
            this.f15007b = rectF2;
            this.f15008c = f6;
            this.f15009d = f7;
            this.f15010e = f8;
        }

        @Override // com.google.android.material.transition.u.d
        @o0
        public com.google.android.material.shape.d a(@o0 com.google.android.material.shape.d dVar, @o0 com.google.android.material.shape.d dVar2) {
            return new com.google.android.material.shape.a(u.o(dVar.a(this.f15006a), dVar2.a(this.f15007b), this.f15008c, this.f15009d, this.f15010e));
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

    static void A(Canvas canvas, Rect rect, float f6, float f7, float f8, int i5, c cVar) {
        if (i5 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f6, f7);
        canvas.scale(f8, f8);
        if (i5 < 255) {
            z(canvas, rect, i5);
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

    static Shader c(@androidx.annotation.l int i5) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i5, i5, Shader.TileMode.CLAMP);
    }

    @o0
    static <T> T d(@q0 T t5, @o0 T t6) {
        return t5 != null ? t5 : t6;
    }

    static View e(View view, @d0 int i5) {
        String resourceName = view.getResources().getResourceName(i5);
        while (view != null) {
            if (view.getId() != i5) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(androidx.concurrent.futures.b.a(resourceName, ProtectedSandApp.s("ኯ")));
    }

    static View f(View view, @d0 int i5) {
        View findViewById = view.findViewById(i5);
        return findViewById != null ? findViewById : e(view, i5);
    }

    private static float g(String[] strArr, int i5) {
        float parseFloat = Float.parseFloat(strArr[i5]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ኰ") + parseFloat);
    }

    private static String h(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
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
        sb.append(ProtectedSandApp.s("\u12b1"));
        return str.startsWith(sb.toString()) && str.endsWith(ProtectedSandApp.s("ኲ"));
    }

    private static boolean m(com.google.android.material.shape.o oVar, RectF rectF) {
        return (oVar.r().a(rectF) == 0.0f && oVar.t().a(rectF) == 0.0f && oVar.l().a(rectF) == 0.0f && oVar.j().a(rectF) == 0.0f) ? false : true;
    }

    static float n(float f6, float f7, float f8) {
        return androidx.appcompat.graphics.drawable.d.a(f7, f6, f8, f6);
    }

    static float o(float f6, float f7, @x(from = 0.0d, to = 1.0d) float f8, @x(from = 0.0d, to = 1.0d) float f9, @x(from = 0.0d, to = 1.0d) float f10) {
        return p(f6, f7, f8, f9, f10, false);
    }

    static float p(float f6, float f7, @x(from = 0.0d, to = 1.0d) float f8, @x(from = 0.0d, to = 1.0d) float f9, @x(from = 0.0d) float f10, boolean z5) {
        return (!z5 || (f10 >= 0.0f && f10 <= 1.0f)) ? f10 < f8 ? f6 : f10 > f9 ? f7 : androidx.appcompat.graphics.drawable.d.a(f7, f6, (f10 - f8) / (f9 - f8), f6) : androidx.appcompat.graphics.drawable.d.a(f7, f6, f10, f6);
    }

    static int q(int i5, int i6, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f8) {
        if (f8 < f6) {
            return i5;
        }
        if (f8 > f7) {
            return i6;
        }
        float f9 = i5;
        return (int) androidx.appcompat.graphics.drawable.d.a(i6, f9, (f8 - f6) / (f7 - f6), f9);
    }

    static com.google.android.material.shape.o r(com.google.android.material.shape.o oVar, com.google.android.material.shape.o oVar2, RectF rectF, RectF rectF2, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, @x(from = 0.0d, to = 1.0d) float f8) {
        return f8 < f6 ? oVar : f8 > f7 ? oVar2 : B(oVar, oVar2, rectF, new b(rectF, rectF2, f6, f7, f8));
    }

    static void s(TransitionSet transitionSet, @q0 Transition transition) {
        if (transition != null) {
            transitionSet.V0(transition);
        }
    }

    static boolean t(Transition transition, Context context, @androidx.annotation.f int i5) {
        int e6;
        if (i5 == 0 || transition.K() != -1 || (e6 = com.google.android.material.resources.b.e(context, i5, -1)) == -1) {
            return false;
        }
        transition.E0(e6);
        return true;
    }

    static boolean u(Transition transition, Context context, @androidx.annotation.f int i5, TimeInterpolator timeInterpolator) {
        if (i5 == 0 || transition.N() != null) {
            return false;
        }
        transition.G0(x(context, i5, timeInterpolator));
        return true;
    }

    static boolean v(Transition transition, Context context, @androidx.annotation.f int i5) {
        PathMotion y5;
        if (i5 == 0 || (y5 = y(context, i5)) == null) {
            return false;
        }
        transition.I0(y5);
        return true;
    }

    static void w(TransitionSet transitionSet, @q0 Transition transition) {
        if (transition != null) {
            transitionSet.f1(transition);
        }
    }

    static TimeInterpolator x(Context context, @androidx.annotation.f int i5, @o0 TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ኸ"));
        }
        String valueOf = String.valueOf(typedValue.string);
        String s5 = ProtectedSandApp.s("ኳ");
        if (!l(valueOf, s5)) {
            String s6 = ProtectedSandApp.s("\u12b6");
            if (l(valueOf, s6)) {
                return androidx.core.view.animation.b.c(b2.e(h(valueOf, s6)));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("\u12b7").concat(valueOf));
        }
        String[] split = h(valueOf, s5).split(ProtectedSandApp.s("ኴ"));
        if (split.length == 4) {
            return androidx.core.view.animation.b.b(g(split, 0), g(split, 1), g(split, 2), g(split, 3));
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("ኵ") + split.length);
    }

    @q0
    static PathMotion y(Context context, @androidx.annotation.f int i5) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.type;
        if (i6 != 16) {
            if (i6 == 3) {
                return new PatternPathMotion(b2.e(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ኺ"));
        }
        int i7 = typedValue.data;
        if (i7 == 0) {
            return null;
        }
        if (i7 == 1) {
            return new k();
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("ኹ"), i7));
    }

    private static int z(Canvas canvas, Rect rect, int i5) {
        RectF rectF = f15004i;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i5);
    }
}
