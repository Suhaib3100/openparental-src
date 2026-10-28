package com.yalantis.ucrop.view.widget;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.Locale;

/* loaded from: classes7.dex */
public class AspectRatioTextView extends AppCompatTextView {
    private final float MARGIN_MULTIPLIER;
    private float mAspectRatio;
    private String mAspectRatioTitle;
    private float mAspectRatioX;
    private float mAspectRatioY;
    private final Rect mCanvasClipBounds;
    private Paint mDotPaint;
    private int mDotSize;

    public AspectRatioTextView(Context context) {
        this(context, null);
    }

    private void applyActiveColor(@l int i4) {
        Paint paint = this.mDotPaint;
        if (paint != null) {
            paint.setColor(i4);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i4, d.getColor(getContext(), com.yalantis.ucrop.R.color.ucrop_color_widget)}));
    }

    private void init(@o0 TypedArray typedArray) {
        setGravity(1);
        this.mAspectRatioTitle = typedArray.getString(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_title);
        this.mAspectRatioX = typedArray.getFloat(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_x, 0.0f);
        float f4 = typedArray.getFloat(com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView_ucrop_artv_ratio_y, 0.0f);
        this.mAspectRatioY = f4;
        float f5 = this.mAspectRatioX;
        if (f5 == 0.0f || f4 == 0.0f) {
            this.mAspectRatio = 0.0f;
        } else {
            this.mAspectRatio = f5 / f4;
        }
        this.mDotSize = getContext().getResources().getDimensionPixelSize(com.yalantis.ucrop.R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.mDotPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        setTitle();
        applyActiveColor(getResources().getColor(com.yalantis.ucrop.R.color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void setTitle() {
        if (!TextUtils.isEmpty(this.mAspectRatioTitle)) {
            setText(this.mAspectRatioTitle);
            return;
        }
        setText(String.format(Locale.US, ProtectedSandApp.s("彑\u0001"), Integer.valueOf((int) this.mAspectRatioX), Integer.valueOf((int) this.mAspectRatioY)));
    }

    private void toggleAspectRatio() {
        if (this.mAspectRatio != 0.0f) {
            float f4 = this.mAspectRatioX;
            float f5 = this.mAspectRatioY;
            this.mAspectRatioX = f5;
            this.mAspectRatioY = f4;
            this.mAspectRatio = f5 / f4;
        }
    }

    public float getAspectRatio(boolean z4) {
        if (z4) {
            toggleAspectRatio();
            setTitle();
        }
        return this.mAspectRatio;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.mCanvasClipBounds);
            Rect rect = this.mCanvasClipBounds;
            float f4 = (rect.right - rect.left) / 2.0f;
            float f5 = rect.bottom - (rect.top / 2.0f);
            int i4 = this.mDotSize;
            canvas.drawCircle(f4, f5 - (i4 * 1.5f), i4 / 2.0f, this.mDotPaint);
        }
    }

    public void setActiveColor(@l int i4) {
        applyActiveColor(i4);
        invalidate();
    }

    public void setAspectRatio(@o0 AspectRatio aspectRatio) {
        this.mAspectRatioTitle = aspectRatio.getAspectRatioTitle();
        this.mAspectRatioX = aspectRatio.getAspectRatioX();
        float aspectRatioY = aspectRatio.getAspectRatioY();
        this.mAspectRatioY = aspectRatioY;
        float f4 = this.mAspectRatioX;
        if (f4 == 0.0f || aspectRatioY == 0.0f) {
            this.mAspectRatio = 0.0f;
        } else {
            this.mAspectRatio = f4 / aspectRatioY;
        }
        setTitle();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView));
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, com.yalantis.ucrop.R.styleable.ucrop_AspectRatioTextView));
    }
}
