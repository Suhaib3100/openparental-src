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
import androidx.core.view.x1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class Slide extends Visibility {
    private g R2;
    private int S2;
    private static final String V2 = "android:slide:screenPosition";
    private static final TimeInterpolator T2 = new DecelerateInterpolator();
    private static final TimeInterpolator U2 = new AccelerateInterpolator();
    private static final g W2 = new a();
    private static final g X2 = new b();
    private static final g Y2 = new c();
    private static final g Z2 = new d();

    /* renamed from: a3, reason: collision with root package name */
    private static final g f34292a3 = new e();

    /* renamed from: b3, reason: collision with root package name */
    private static final g f34293b3 = new f();

    class a extends h {
        a() {
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class b extends h {
        b() {
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return x1.c0(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class c extends i {
        c() {
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    class d extends h {
        d() {
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class e extends h {
        e() {
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return x1.c0(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class f extends i {
        f() {
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

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
    public @interface j {
    }

    public Slide() {
        this.R2 = f34293b3;
        this.S2 = 80;
        V0(80);
    }

    private void J0(b0 b0Var) {
        int[] iArr = new int[2];
        b0Var.f34364b.getLocationOnScreen(iArr);
        b0Var.f34363a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.q0
    public Animator P0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        if (b0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) b0Var2.f34363a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return d0.a(view, b0Var2, iArr[0], iArr[1], this.R2.b(viewGroup, view), this.R2.a(viewGroup, view), translationX, translationY, T2, this);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.q0
    public Animator R0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        if (b0Var == null) {
            return null;
        }
        int[] iArr = (int[]) b0Var.f34363a.get("android:slide:screenPosition");
        return d0.a(view, b0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.R2.b(viewGroup, view), this.R2.a(viewGroup, view), U2, this);
    }

    public int U0() {
        return this.S2;
    }

    public void V0(int i4) {
        if (i4 == 3) {
            this.R2 = W2;
        } else if (i4 == 5) {
            this.R2 = Z2;
        } else if (i4 == 48) {
            this.R2 = Y2;
        } else if (i4 == 80) {
            this.R2 = f34293b3;
        } else if (i4 == 8388611) {
            this.R2 = X2;
        } else {
            if (i4 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.R2 = f34292a3;
        }
        this.S2 = i4;
        t tVar = new t();
        tVar.k(i4);
        F0(tVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void m(@androidx.annotation.o0 b0 b0Var) {
        super.m(b0Var);
        J0(b0Var);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        super.p(b0Var);
        J0(b0Var);
    }

    public Slide(int i4) {
        this.R2 = f34293b3;
        this.S2 = 80;
        V0(i4);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R2 = f34293b3;
        this.S2 = 80;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35212h);
        int k4 = androidx.core.content.res.n.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        V0(k4);
    }
}
