package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.c1;
import androidx.core.view.y1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class Slide extends Visibility {

    /* renamed from: r0, reason: collision with root package name */
    private g f9779r0;

    /* renamed from: s0, reason: collision with root package name */
    private int f9780s0;

    /* renamed from: v0, reason: collision with root package name */
    private static final String f9774v0 = "android:slide:screenPosition";

    /* renamed from: t0, reason: collision with root package name */
    private static final TimeInterpolator f9772t0 = new DecelerateInterpolator();

    /* renamed from: u0, reason: collision with root package name */
    private static final TimeInterpolator f9773u0 = new AccelerateInterpolator();

    /* renamed from: w0, reason: collision with root package name */
    private static final g f9775w0 = new a();

    /* renamed from: x0, reason: collision with root package name */
    private static final g f9776x0 = new b();

    /* renamed from: y0, reason: collision with root package name */
    private static final g f9777y0 = new c();

    /* renamed from: z0, reason: collision with root package name */
    private static final g f9778z0 = new d();
    private static final g A0 = new e();
    private static final g B0 = new f();

    static class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    static class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return y1.Z(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    static class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    static class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    static class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return y1.Z(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    static class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    private static abstract class h implements g {
        private h() {
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        h(a aVar) {
        }
    }

    private static abstract class i implements g {
        private i() {
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        i(a aVar) {
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface j {
    }

    public Slide() {
        this.f9779r0 = B0;
        this.f9780s0 = 80;
        a1(80);
    }

    private void P0(d0 d0Var) {
        int[] iArr = new int[2];
        d0Var.f9860b.getLocationOnScreen(iArr);
        d0Var.f9859a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility
    public Animator U0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        if (d0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var2.f9859a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return f0.a(view, d0Var2, iArr[0], iArr[1], this.f9779r0.b(viewGroup, view), this.f9779r0.a(viewGroup, view), translationX, translationY, f9772t0, this);
    }

    @Override // androidx.transition.Visibility
    public Animator W0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var.f9859a.get("android:slide:screenPosition");
        return f0.a(view, d0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f9779r0.b(viewGroup, view), this.f9779r0.a(viewGroup, view), f9773u0, this);
    }

    public int Z0() {
        return this.f9780s0;
    }

    public void a1(int i5) {
        if (i5 == 3) {
            this.f9779r0 = f9775w0;
        } else if (i5 == 5) {
            this.f9779r0 = f9778z0;
        } else if (i5 == 48) {
            this.f9779r0 = f9777y0;
        } else if (i5 == 80) {
            this.f9779r0 = B0;
        } else if (i5 == 8388611) {
            this.f9779r0 = f9776x0;
        } else {
            if (i5 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f9779r0 = A0;
        }
        this.f9780s0 = i5;
        v vVar = new v();
        vVar.k(i5);
        J0(vVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void l(@androidx.annotation.o0 d0 d0Var) {
        super.l(d0Var);
        P0(d0Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        super.o(d0Var);
        P0(d0Var);
    }

    public Slide(int i5) {
        this.f9779r0 = B0;
        this.f9780s0 = 80;
        a1(i5);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9779r0 = B0;
        this.f9780s0 = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10087h);
        int k5 = androidx.core.content.res.p.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        a1(k5);
    }
}
