package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.c1;

@c1({c1.a.LIBRARY_GROUP})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes6.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    private int f53389b;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public final int h() {
        return this.f53389b;
    }

    public final void i(int i4, boolean z4) {
        super.setVisibility(i4);
        if (z4) {
            this.f53389b = i4;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i4) {
        i(i4, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53389b = getVisibility();
    }
}
