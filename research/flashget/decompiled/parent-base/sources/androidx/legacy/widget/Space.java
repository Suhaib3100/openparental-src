package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;

@Deprecated
/* loaded from: classes3.dex */
public class Space extends View {
    @Deprecated
    public Space(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int a(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i4 : size : Math.min(i4, size);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    @Deprecated
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    @Deprecated
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i4), a(getSuggestedMinimumHeight(), i5));
    }

    @Deprecated
    public Space(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Space(@o0 Context context) {
        this(context, null);
    }
}
