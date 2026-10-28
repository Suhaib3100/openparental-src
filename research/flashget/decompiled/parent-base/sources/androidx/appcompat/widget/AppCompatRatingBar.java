package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import d.a;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    private final m f1485b;

    public AppCompatRatingBar(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap b5 = this.f1485b.b();
        if (b5 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b5.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.I2);
    }

    public AppCompatRatingBar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o0.a(this, getContext());
        m mVar = new m(this);
        this.f1485b = mVar;
        mVar.c(attributeSet, i4);
    }
}
