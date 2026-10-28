package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: b, reason: collision with root package name */
    private boolean f23911b;

    public Guideline(Context context) {
        super(context);
        this.f23911b = true;
        super.setVisibility(8);
    }

    public void a(boolean filter) {
        this.f23911b = filter;
    }

    public void b(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f23911b && layoutParams.f23829b == margin) {
            return;
        }
        layoutParams.f23829b = margin;
        setLayoutParams(layoutParams);
    }

    public void c(int margin) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f23911b && layoutParams.f23831c == margin) {
            return;
        }
        layoutParams.f23831c = margin;
        setLayoutParams(layoutParams);
    }

    public void d(float ratio) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f23911b && layoutParams.f23833d == ratio) {
            return;
        }
        layoutParams.f23833d = ratio;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
    }

    public Guideline(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f23911b = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f23911b = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f23911b = true;
        super.setVisibility(8);
    }
}
