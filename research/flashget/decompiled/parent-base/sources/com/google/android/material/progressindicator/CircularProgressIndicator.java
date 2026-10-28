package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s8.a;

/* loaded from: classes6.dex */
public final class CircularProgressIndicator extends b<CircularProgressIndicatorSpec> {
    public static final int A = 0;
    public static final int B = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f53626z = a.n.f91420qb;

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public CircularProgressIndicator(@o0 Context context) {
        this(context, null);
    }

    private void O() {
        setIndeterminateDrawable(j.x(getContext(), (CircularProgressIndicatorSpec) this.f53645b));
        setProgressDrawable(f.z(getContext(), (CircularProgressIndicatorSpec) this.f53645b));
    }

    @Override // com.google.android.material.progressindicator.b
    public void F(int i4) {
        super.F(i4);
        ((CircularProgressIndicatorSpec) this.f53645b).getClass();
    }

    CircularProgressIndicatorSpec K(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int L() {
        return ((CircularProgressIndicatorSpec) this.f53645b).f53629i;
    }

    @u0
    public int M() {
        return ((CircularProgressIndicatorSpec) this.f53645b).f53628h;
    }

    @u0
    public int N() {
        return ((CircularProgressIndicatorSpec) this.f53645b).f53627g;
    }

    public void P(int i4) {
        ((CircularProgressIndicatorSpec) this.f53645b).f53629i = i4;
        invalidate();
    }

    public void Q(@u0 int i4) {
        S s4 = this.f53645b;
        if (((CircularProgressIndicatorSpec) s4).f53628h != i4) {
            ((CircularProgressIndicatorSpec) s4).f53628h = i4;
            invalidate();
        }
    }

    public void R(@u0 int i4) {
        int max = Math.max(i4, this.f53645b.f53663a * 2);
        S s4 = this.f53645b;
        if (((CircularProgressIndicatorSpec) s4).f53627g != max) {
            ((CircularProgressIndicatorSpec) s4).f53627g = max;
            ((CircularProgressIndicatorSpec) s4).getClass();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.b
    CircularProgressIndicatorSpec i(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public CircularProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f90339b2);
    }

    public CircularProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        super(context, attributeSet, i4, f53626z);
        O();
    }
}
