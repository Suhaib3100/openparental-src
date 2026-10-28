package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.c1;

@c1({c1.a.LIBRARY_GROUP})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: o, reason: collision with root package name */
    private int f13607o;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final int p() {
        return this.f13607o;
    }

    public final void q(int i5, boolean z5) {
        super.setVisibility(i5);
        if (z5) {
            this.f13607o = i5;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i5) {
        q(i5, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f13607o = getVisibility();
    }
}
