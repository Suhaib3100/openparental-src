package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.s;

/* loaded from: classes3.dex */
public class Explode extends Visibility {

    /* renamed from: r0, reason: collision with root package name */
    private int[] f9760r0;

    /* renamed from: u0, reason: collision with root package name */
    private static final String f9759u0 = "android:explode:screenBounds";

    /* renamed from: s0, reason: collision with root package name */
    private static final TimeInterpolator f9757s0 = new DecelerateInterpolator();

    /* renamed from: t0, reason: collision with root package name */
    private static final TimeInterpolator f9758t0 = new AccelerateInterpolator();

    public Explode() {
        this.f9760r0 = new int[2];
        J0(new e());
    }

    private void P0(d0 d0Var) {
        View view = d0Var.f9860b;
        view.getLocationOnScreen(this.f9760r0);
        int[] iArr = this.f9760r0;
        int i5 = iArr[0];
        int i6 = iArr[1];
        d0Var.f9859a.put("android:explode:screenBounds", new Rect(i5, i6, view.getWidth() + i5, view.getHeight() + i6));
    }

    private static float Z0(float f6, float f7) {
        return (float) Math.sqrt((f7 * f7) + (f6 * f6));
    }

    private static float a1(View view, int i5, int i6) {
        return Z0(Math.max(i5, view.getWidth() - i5), Math.max(i6, view.getHeight() - i6));
    }

    private void b1(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        view.getLocationOnScreen(this.f9760r0);
        int[] iArr2 = this.f9760r0;
        int i5 = iArr2[0];
        int i6 = iArr2[1];
        Rect L = L();
        if (L == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i5;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i6;
        } else {
            centerX = L.centerX();
            centerY = L.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float Z0 = Z0(centerX2, centerY2);
        float a12 = a1(view, centerX - i5, centerY - i6);
        iArr[0] = Math.round((centerX2 / Z0) * a12);
        iArr[1] = Math.round(a12 * (centerY2 / Z0));
    }

    @Override // androidx.transition.Visibility
    public Animator U0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        if (d0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) d0Var2.f9859a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        b1(viewGroup, rect, this.f9760r0);
        int[] iArr = this.f9760r0;
        return f0.a(view, d0Var2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f9757s0, this);
    }

    @Override // androidx.transition.Visibility
    public Animator W0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        float f6;
        float f7;
        if (d0Var == null) {
            return null;
        }
        Rect rect = (Rect) d0Var.f9859a.get("android:explode:screenBounds");
        int i5 = rect.left;
        int i6 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) d0Var.f9860b.getTag(s.e.J);
        if (iArr != null) {
            f6 = (r7 - rect.left) + translationX;
            f7 = (r0 - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f6 = translationX;
            f7 = translationY;
        }
        b1(viewGroup, rect, this.f9760r0);
        int[] iArr2 = this.f9760r0;
        return f0.a(view, d0Var, i5, i6, translationX, translationY, f6 + iArr2[0], f7 + iArr2[1], f9758t0, this);
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

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9760r0 = new int[2];
        J0(new e());
    }
}
