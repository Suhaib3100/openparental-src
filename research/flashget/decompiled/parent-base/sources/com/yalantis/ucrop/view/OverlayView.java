package com.yalantis.ucrop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.o0;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.OverlayViewChangeListener;
import com.yalantis.ucrop.util.DensityUtil;
import com.yalantis.ucrop.util.RectUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private static final long SMOOTH_CENTER_DURATION = 1000;
    private boolean isDragCenter;
    private OverlayViewChangeListener mCallback;
    private boolean mCircleDimmedLayer;
    private Path mCircularPath;
    private Paint mCropFrameCornersPaint;
    private Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;
    private ValueAnimator smoothAnimator;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    private int getCurrentTouchIndex(float f4, float f5) {
        double d5 = this.mTouchPointThreshold;
        int i4 = -1;
        for (int i5 = 0; i5 < 8; i5 += 2) {
            double sqrt = Math.sqrt(Math.pow(f5 - this.mCropGridCorners[i5 + 1], 2.0d) + Math.pow(f4 - this.mCropGridCorners[i5], 2.0d));
            if (sqrt < d5) {
                i4 = i5 / 2;
                d5 = sqrt;
            }
        }
        if (this.mFreestyleCropMode == 1 && i4 < 0 && this.mCropViewRect.contains(f4, f5)) {
            return 4;
        }
        return i4;
    }

    private void initCropFrameStyle(@o0 TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        Paint paint = this.mCropFramePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(style);
    }

    private void initCropGridStyle(@o0 TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.mCropGridColumnCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    private void smoothToCenter() {
        Point point = new Point((getLeft() + getRight()) / 2, (getBottom() + getTop()) / 2);
        final int centerY = (int) (point.y - this.mCropViewRect.centerY());
        final int centerX = (int) (point.x - this.mCropViewRect.centerX());
        final RectF rectF = new RectF(this.mCropViewRect);
        new RectF(this.mCropViewRect).offset(centerX, centerY);
        ValueAnimator valueAnimator = this.smoothAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.smoothAnimator = ofFloat;
        ofFloat.setDuration(1000L);
        this.smoothAnimator.setInterpolator(new OvershootInterpolator(1.0f));
        this.smoothAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.yalantis.ucrop.view.OverlayView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (OverlayView.this.mCallback != null) {
                    OverlayView.this.mCallback.onCropRectUpdated(OverlayView.this.mCropViewRect);
                }
            }
        });
        this.smoothAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yalantis.ucrop.view.OverlayView.2
            float lastAnimationValue = 0.0f;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue() * centerX;
                float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue() * centerY;
                RectF rectF2 = OverlayView.this.mCropViewRect;
                RectF rectF3 = rectF;
                rectF2.set(new RectF(rectF3.left + floatValue, rectF3.top + floatValue2, rectF3.right + floatValue, rectF3.bottom + floatValue2));
                OverlayView.this.updateGridPoints();
                OverlayView.this.postInvalidate();
                if (OverlayView.this.mCallback != null) {
                    OverlayView.this.mCallback.postTranslate((((Float) valueAnimator2.getAnimatedValue()).floatValue() - this.lastAnimationValue) * centerX, (((Float) valueAnimator2.getAnimatedValue()).floatValue() - this.lastAnimationValue) * centerY);
                }
                this.lastAnimationValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
            }
        });
        this.smoothAnimator.start();
    }

    private void updateCropViewRect(float f4, float f5) {
        this.mTempRect.set(this.mCropViewRect);
        int i4 = this.mCurrentTouchCornerIndex;
        if (i4 == 0) {
            RectF rectF = this.mTempRect;
            RectF rectF2 = this.mCropViewRect;
            rectF.set(f4, f5, rectF2.right, rectF2.bottom);
        } else if (i4 == 1) {
            RectF rectF3 = this.mTempRect;
            RectF rectF4 = this.mCropViewRect;
            rectF3.set(rectF4.left, f5, f4, rectF4.bottom);
        } else if (i4 == 2) {
            RectF rectF5 = this.mTempRect;
            RectF rectF6 = this.mCropViewRect;
            rectF5.set(rectF6.left, rectF6.top, f4, f5);
        } else if (i4 == 3) {
            RectF rectF7 = this.mTempRect;
            RectF rectF8 = this.mCropViewRect;
            rectF7.set(f4, rectF8.top, rectF8.right, f5);
        } else if (i4 == 4) {
            this.mTempRect.offset(f4 - this.mPreviousTouchX, f5 - this.mPreviousTouchY);
            if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop() || this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                return;
            }
            this.mCropViewRect.set(this.mTempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z4 = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z5 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        RectF rectF9 = this.mCropViewRect;
        rectF9.set(z5 ? this.mTempRect.left : rectF9.left, z4 ? this.mTempRect.top : rectF9.top, z5 ? this.mTempRect.right : rectF9.right, z4 ? this.mTempRect.bottom : rectF9.bottom);
        if (z4 || z5) {
            updateGridPoints();
            postInvalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateGridPoints() {
        this.mCropGridCorners = RectUtils.getCornersFromRect(this.mCropViewRect);
        this.mCropGridCenter = RectUtils.getCenterFromRect(this.mCropViewRect);
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, Path.Direction.CW);
    }

    protected void drawCropGrid(@o0 Canvas canvas) {
        if (this.mShowCropGrid) {
            if (this.mGridPoints == null && !this.mCropViewRect.isEmpty()) {
                this.mGridPoints = new float[(this.mCropGridColumnCount * 4) + (this.mCropGridRowCount * 4)];
                int i4 = 0;
                for (int i5 = 0; i5 < this.mCropGridRowCount; i5++) {
                    float[] fArr = this.mGridPoints;
                    RectF rectF = this.mCropViewRect;
                    fArr[i4] = rectF.left;
                    float f4 = i5 + 1.0f;
                    float height = (f4 / (this.mCropGridRowCount + 1)) * rectF.height();
                    RectF rectF2 = this.mCropViewRect;
                    fArr[i4 + 1] = height + rectF2.top;
                    float[] fArr2 = this.mGridPoints;
                    int i6 = i4 + 3;
                    fArr2[i4 + 2] = rectF2.right;
                    i4 += 4;
                    fArr2[i6] = ((f4 / (this.mCropGridRowCount + 1)) * rectF2.height()) + this.mCropViewRect.top;
                }
                for (int i7 = 0; i7 < this.mCropGridColumnCount; i7++) {
                    float[] fArr3 = this.mGridPoints;
                    float f5 = i7 + 1.0f;
                    float width = (f5 / (this.mCropGridColumnCount + 1)) * this.mCropViewRect.width();
                    RectF rectF3 = this.mCropViewRect;
                    fArr3[i4] = width + rectF3.left;
                    float[] fArr4 = this.mGridPoints;
                    fArr4[i4 + 1] = rectF3.top;
                    int i10 = i4 + 3;
                    float width2 = (f5 / (this.mCropGridColumnCount + 1)) * rectF3.width();
                    RectF rectF4 = this.mCropViewRect;
                    fArr4[i4 + 2] = width2 + rectF4.left;
                    i4 += 4;
                    this.mGridPoints[i10] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.mGridPoints;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(this.mCropRectCornerTouchAreaLineLength, -r1);
            RectF rectF5 = this.mTempRect;
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF5, op);
            this.mTempRect.set(this.mCropViewRect);
            this.mTempRect.inset(-r2, this.mCropRectCornerTouchAreaLineLength);
            canvas.clipRect(this.mTempRect, op);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    protected void drawDimmedLayer(@o0 Canvas canvas) {
        canvas.save();
        if (this.mCircleDimmedLayer) {
            canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (this.mCircleDimmedLayer) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    @o0
    public RectF getCropViewRect() {
        return this.mCropViewRect;
    }

    public int getFreestyleCropMode() {
        return this.mFreestyleCropMode;
    }

    public OverlayViewChangeListener getOverlayViewChangeListener() {
        return this.mCallback;
    }

    protected void init() {
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.mFreestyleCropMode == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            if (this.mShouldSetupCropBounds) {
                this.mShouldSetupCropBounds = false;
                setTargetAspectRatio(this.mTargetAspectRatio);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCropViewRect.isEmpty() && this.mFreestyleCropMode != 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x4, y4);
                this.mCurrentTouchCornerIndex = currentTouchIndex;
                boolean z4 = currentTouchIndex != -1;
                if (!z4) {
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                } else if (this.mPreviousTouchX < 0.0f) {
                    this.mPreviousTouchX = x4;
                    this.mPreviousTouchY = y4;
                }
                return z4;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.mCurrentTouchCornerIndex != -1) {
                float min = Math.min(Math.max(x4, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y4, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(min, min2);
                this.mPreviousTouchX = min;
                this.mPreviousTouchY = min2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.mPreviousTouchX = -1.0f;
                this.mPreviousTouchY = -1.0f;
                this.mCurrentTouchCornerIndex = -1;
                OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
                if (overlayViewChangeListener != null) {
                    overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                }
                if (this.isDragCenter) {
                    smoothToCenter();
                }
            }
        }
        return false;
    }

    protected void processStyledAttributes(@o0 TypedArray typedArray) {
        this.mCircleDimmedLayer = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(DensityUtil.dip2px(getContext(), 1.0f));
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    public void setCircleDimmedLayer(boolean z4) {
        this.mCircleDimmedLayer = z4;
    }

    public void setCircleStrokeColor(@l int i4) {
        this.mDimmedStrokePaint.setColor(i4);
    }

    public void setCropFrameColor(@l int i4) {
        this.mCropFramePaint.setColor(i4);
    }

    public void setCropFrameStrokeWidth(@g0(from = 0) int i4) {
        this.mCropFramePaint.setStrokeWidth(i4);
    }

    public void setCropGridColor(@l int i4) {
        this.mCropGridPaint.setColor(i4);
    }

    public void setCropGridColumnCount(@g0(from = 0) int i4) {
        this.mCropGridColumnCount = i4;
        this.mGridPoints = null;
    }

    public void setCropGridRowCount(@g0(from = 0) int i4) {
        this.mCropGridRowCount = i4;
        this.mGridPoints = null;
    }

    public void setCropGridStrokeWidth(@g0(from = 0) int i4) {
        this.mCropGridPaint.setStrokeWidth(i4);
    }

    public void setDimmedColor(@l int i4) {
        this.mDimmedColor = i4;
    }

    public void setDimmedStrokeWidth(@g0(from = 0) int i4) {
        this.mDimmedStrokePaint.setStrokeWidth(i4);
    }

    public void setDragSmoothToCenter(boolean z4) {
        this.isDragCenter = z4;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z4) {
        this.mFreestyleCropMode = z4 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i4) {
        this.mFreestyleCropMode = i4;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(OverlayViewChangeListener overlayViewChangeListener) {
        this.mCallback = overlayViewChangeListener;
    }

    public void setShowCropFrame(boolean z4) {
        this.mShowCropFrame = z4;
    }

    public void setShowCropGrid(boolean z4) {
        this.mShowCropGrid = z4;
    }

    public void setTargetAspectRatio(float f4) {
        this.mTargetAspectRatio = f4;
        if (this.mThisWidth <= 0) {
            this.mShouldSetupCropBounds = true;
        } else {
            setupCropBounds();
            postInvalidate();
        }
    }

    public void setupCropBounds() {
        int i4 = this.mThisWidth;
        float f4 = this.mTargetAspectRatio;
        int i5 = (int) (i4 / f4);
        int i6 = this.mThisHeight;
        if (i5 > i6) {
            int i7 = (i4 - ((int) (i6 * f4))) / 2;
            this.mCropViewRect.set(getPaddingLeft() + i7, getPaddingTop(), getPaddingLeft() + r1 + i7, getPaddingTop() + this.mThisHeight);
        } else {
            int i10 = (i6 - i5) / 2;
            this.mCropViewRect.set(getPaddingLeft(), getPaddingTop() + i10, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i5 + i10);
        }
        OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
        if (overlayViewChangeListener != null) {
            overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mCropViewRect = new RectF();
        this.mTempRect = new RectF();
        this.mGridPoints = null;
        this.mCircularPath = new Path();
        this.mDimmedStrokePaint = new Paint(1);
        this.mCropGridPaint = new Paint(1);
        this.mCropFramePaint = new Paint(1);
        this.mCropFrameCornersPaint = new Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }
}
