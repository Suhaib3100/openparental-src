package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n1.a;

/* loaded from: classes3.dex */
public final class LinearProgressIndicator extends com.google.android.material.progressindicator.b<LinearProgressIndicatorSpec> {
    public static final int M = a.n.Cb;
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 0;
    public static final int Q = 1;
    public static final int R = 2;
    public static final int S = 3;

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    @c1({c1.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public LinearProgressIndicator(@o0 Context context) {
        this(context, null);
    }

    private void N() {
        setIndeterminateDrawable(j.x(getContext(), (LinearProgressIndicatorSpec) this.f13812o));
        setProgressDrawable(f.z(getContext(), (LinearProgressIndicatorSpec) this.f13812o));
    }

    @Override // com.google.android.material.progressindicator.b
    public void A(@o0 int... iArr) {
        super.A(iArr);
        ((LinearProgressIndicatorSpec) this.f13812o).e();
    }

    @Override // com.google.android.material.progressindicator.b
    public void B(int i5, boolean z5) {
        S s5 = this.f13812o;
        if (s5 != 0 && ((LinearProgressIndicatorSpec) s5).f13808g == 0 && isIndeterminate()) {
            return;
        }
        super.B(i5, z5);
    }

    @Override // com.google.android.material.progressindicator.b
    public void E(int i5) {
        super.E(i5);
        ((LinearProgressIndicatorSpec) this.f13812o).e();
        invalidate();
    }

    LinearProgressIndicatorSpec K(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public int L() {
        return ((LinearProgressIndicatorSpec) this.f13812o).f13808g;
    }

    public int M() {
        return ((LinearProgressIndicatorSpec) this.f13812o).f13809h;
    }

    public void O(int i5) {
        if (((LinearProgressIndicatorSpec) this.f13812o).f13808g == i5) {
            return;
        }
        if (J() && isIndeterminate()) {
            throw new IllegalStateException(ProtectedSandApp.s("✏"));
        }
        S s5 = this.f13812o;
        ((LinearProgressIndicatorSpec) s5).f13808g = i5;
        ((LinearProgressIndicatorSpec) s5).e();
        if (i5 == 0) {
            getIndeterminateDrawable().A(new l((LinearProgressIndicatorSpec) this.f13812o));
        } else {
            getIndeterminateDrawable().A(new m(getContext(), (LinearProgressIndicatorSpec) this.f13812o));
        }
        invalidate();
    }

    public void P(int i5) {
        S s5 = this.f13812o;
        ((LinearProgressIndicatorSpec) s5).f13809h = i5;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s5;
        boolean z5 = true;
        if (i5 != 1 && ((y1.Z(this) != 1 || ((LinearProgressIndicatorSpec) this.f13812o).f13809h != 2) && (y1.Z(this) != 0 || i5 != 3))) {
            z5 = false;
        }
        linearProgressIndicatorSpec.f13810i = z5;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.b
    LinearProgressIndicatorSpec i(@o0 Context context, @o0 AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        S s5 = this.f13812o;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s5;
        boolean z6 = true;
        if (((LinearProgressIndicatorSpec) s5).f13809h != 1 && ((y1.Z(this) != 1 || ((LinearProgressIndicatorSpec) this.f13812o).f13809h != 2) && (y1.Z(this) != 0 || ((LinearProgressIndicatorSpec) this.f13812o).f13809h != 3))) {
            z6 = false;
        }
        linearProgressIndicatorSpec.f13810i = z6;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        int paddingRight = i5 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i6 - (getPaddingBottom() + getPaddingTop());
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
        this(context, attributeSet, a.c.Y8);
    }

    public LinearProgressIndicator(@o0 Context context, @q0 AttributeSet attributeSet, @androidx.annotation.f int i5) {
        super(context, attributeSet, i5, M);
        N();
    }
}
