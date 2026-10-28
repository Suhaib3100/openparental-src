package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import d.a;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: o, reason: collision with root package name */
    private final i f884o;

    public AppCompatRatingBar(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        Bitmap b6 = this.f884o.b();
        if (b6 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b6.getWidth() * getNumStars(), i5, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.P2);
    }

    public AppCompatRatingBar(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        u0.a(this, getContext());
        i iVar = new i(this);
        this.f884o = iVar;
        iVar.c(attributeSet, i5);
    }
}
