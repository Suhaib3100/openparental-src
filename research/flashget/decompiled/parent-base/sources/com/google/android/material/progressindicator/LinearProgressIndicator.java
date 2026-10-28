package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s8.a;

/* loaded from: classes6.dex */
public final class LinearProgressIndicator extends com.google.android.material.progressindicator.b<LinearProgressIndicatorSpec> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f53630z = a.n.Cb;

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public LinearProgressIndicator(@o0 Context context) {
        this(context, null);
    }

    private void N() {
        setIndeterminateDrawable(j.y(getContext(), (LinearProgressIndicatorSpec) this.f53645b));
        setProgressDrawable(f.A(getContext(), (LinearProgressIndicatorSpec) this.f53645b));
    }

    @Override // com.google.android.material.progressindicator.b
    public void A(@o0 int... iArr) {
        super.A(iArr);
        ((LinearProgressIndicatorSpec) this.f53645b).e();
    }

    @Override // com.google.android.material.progressindicator.b
    public void B(int i4, boolean z4) {
        S s4 = this.f53645b;
        if (s4 != 0 && ((LinearProgressIndicatorSpec) s4).f53631g == 0 && isIndeterminate()) {
            return;
        }
        super.B(i4, z4);
    }

    @Override // com.google.android.material.progressindicator.b
    public void E(int i4) {
        super.E(i4);
        ((LinearProgressIndicatorSpec) this.f53645b).e();
        invalidate();
    }

    LinearProgressIndicatorSpec K(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public int L() {
        return ((LinearProgressIndicatorSpec) this.f53645b).f53631g;
    }

    public int M() {
        return ((LinearProgressIndicatorSpec) this.f53645b).f53632h;
    }

    public void O(int i4) {
        if (((LinearProgressIndicatorSpec) this.f53645b).f53631g == i4) {
            return;
        }
        if (J() && isIndeterminate()) {
            throw new IllegalStateException(ProtectedSandApp.s("\uf1fe"));
        }
        S s4 = this.f53645b;
        ((LinearProgressIndicatorSpec) s4).f53631g = i4;
        ((LinearProgressIndicatorSpec) s4).e();
        if (i4 == 0) {
            getIndeterminateDrawable().B(new l((LinearProgressIndicatorSpec) this.f53645b));
        } else {
            getIndeterminateDrawable().B(new m(getContext(), (LinearProgressIndicatorSpec) this.f53645b));
        }
        invalidate();
    }

    public void P(int i4) {
        S s4 = this.f53645b;
        ((LinearProgressIndicatorSpec) s4).f53632h = i4;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s4;
        boolean z4 = true;
        if (i4 != 1 && ((x1.c0(this) != 1 || ((LinearProgressIndicatorSpec) this.f53645b).f53632h != 2) && (getLayoutDirection() != 0 || i4 != 3))) {
            z4 = false;
        }
        linearProgressIndicatorSpec.f53633i = z4;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    LinearProgressIndicatorSpec i(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        S s4 = this.f53645b;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s4;
        boolean z5 = true;
        if (((LinearProgressIndicatorSpec) s4).f53632h != 1 && ((x1.c0(this) != 1 || ((LinearProgressIndicatorSpec) this.f53645b).f53632h != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) this.f53645b).f53632h != 3))) {
            z5 = false;
        }
        linearProgressIndicatorSpec.f53633i = z5;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        int paddingRight = i4 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i5 - (getPaddingBottom() + getPaddingTop());
        j<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        f<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public LinearProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.X8);
    }

    public LinearProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i4) {
        super(context, attributeSet, i4, f53630z);
        N();
    }
}
