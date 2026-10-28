package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n1.a;

/* loaded from: classes3.dex */
public final class CircularProgressIndicator extends b<CircularProgressIndicatorSpec> {
    public static final int M = a.n.qb;
    public static final int N = 0;
    public static final int O = 1;

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public CircularProgressIndicator(@o0 Context context) {
        this(context, null);
    }

    private void O() {
        setIndeterminateDrawable(j.w(getContext(), (CircularProgressIndicatorSpec) this.f13812o));
        setProgressDrawable(f.y(getContext(), (CircularProgressIndicatorSpec) this.f13812o));
    }

    @Override // com.google.android.material.progressindicator.b
    public void F(int i5) {
        super.F(i5);
        ((CircularProgressIndicatorSpec) this.f13812o).getClass();
    }

    CircularProgressIndicatorSpec K(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int L() {
        return ((CircularProgressIndicatorSpec) this.f13812o).f13807i;
    }

    @u0
    public int M() {
        return ((CircularProgressIndicatorSpec) this.f13812o).f13806h;
    }

    @u0
    public int N() {
        return ((CircularProgressIndicatorSpec) this.f13812o).f13805g;
    }

    public void P(int i5) {
        ((CircularProgressIndicatorSpec) this.f13812o).f13807i = i5;
        invalidate();
    }

    public void Q(@u0 int i5) {
        S s5 = this.f13812o;
        if (((CircularProgressIndicatorSpec) s5).f13806h != i5) {
            ((CircularProgressIndicatorSpec) s5).f13806h = i5;
            invalidate();
        }
    }

    public void R(@u0 int i5) {
        int max = Math.max(i5, this.f13812o.f13828a * 2);
        S s5 = this.f13812o;
        if (((CircularProgressIndicatorSpec) s5).f13805g != max) {
            ((CircularProgressIndicatorSpec) s5).f13805g = max;
            ((CircularProgressIndicatorSpec) s5).getClass();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.b
    CircularProgressIndicatorSpec i(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public CircularProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f29185c2);
    }

    public CircularProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5) {
        super(context, attributeSet, i5, M);
        O();
    }
}
