package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.i1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.resources.b;
import com.google.android.material.resources.c;
import s8.a;

/* loaded from: classes6.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@o0 Context context) {
        this(context, null);
    }

    private void d(@o0 Resources.Theme theme, int i4) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i4, a.o.Nl);
        int k4 = k(getContext(), obtainStyledAttributes, a.o.Pl, a.o.Ql);
        obtainStyledAttributes.recycle();
        if (k4 >= 0) {
            setLineHeight(k4);
        }
    }

    private static boolean f(Context context) {
        return b.b(context, a.c.f90560re, true);
    }

    private static int j(@o0 Resources.Theme theme, @q0 AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.Rl, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(a.o.Sl, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int k(@o0 Context context, @o0 TypedArray typedArray, @o0 @i1 int... iArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length && i4 < 0; i5++) {
            i4 = c.c(context, typedArray, iArr[i5], -1);
        }
        return i4;
    }

    private static boolean l(@o0 Context context, @o0 Resources.Theme theme, @q0 AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, a.o.Rl, i4, i5);
        int k4 = k(context, obtainStyledAttributes, a.o.Tl, a.o.Ul);
        obtainStyledAttributes.recycle();
        return k4 != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@o0 Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (f(context)) {
            d(context.getTheme(), i4);
        }
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public MaterialTextView(@o0 Context context, @q0 AttributeSet attributeSet, int i4, int i5) {
        super(a9.a.c(context, attributeSet, i4, i5), attributeSet, i4);
        int j4;
        Context context2 = getContext();
        if (f(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (l(context2, theme, attributeSet, i4, i5) || (j4 = j(theme, attributeSet, i4, i5)) == -1) {
                return;
            }
            d(theme, j4);
        }
    }
}
