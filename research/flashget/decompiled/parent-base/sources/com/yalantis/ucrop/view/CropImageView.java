package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.compose.material3.f4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.callback.CropBoundsChangeListener;
import com.yalantis.ucrop.model.CropParameters;
import com.yalantis.ucrop.model.ImageState;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.util.CubicEasing;
import com.yalantis.ucrop.util.RectUtils;
import com.yalantis.ucrop.view.TransformImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class CropImageView extends TransformImageView {
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;
    public static final int DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = 500;
    public static final int DEFAULT_MAX_BITMAP_SIZE = 0;
    public static final float DEFAULT_MAX_SCALE_MULTIPLIER = 10.0f;
    public static final float SOURCE_IMAGE_ASPECT_RATIO = 0.0f;
    private CropBoundsChangeListener mCropBoundsChangeListener;
    private final RectF mCropRect;
    private long mImageToWrapCropBoundsAnimDuration;
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;
    private float mMaxScale;
    private float mMaxScaleMultiplier;
    private float mMinScale;
    private float mTargetAspectRatio;
    private final Matrix mTempMatrix;
    private Runnable mWrapCropBoundsRunnable;
    private Runnable mZoomImageToPositionRunnable;

    private static class WrapCropBoundsRunnable implements Runnable {
        private final float mCenterDiffX;
        private final float mCenterDiffY;
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final long mDurationMs;
        private final float mOldScale;
        private final float mOldX;
        private final float mOldY;
        private final long mStartTime = System.currentTimeMillis();
        private final boolean mWillBeImageInBoundsAfterTranslate;

        public WrapCropBoundsRunnable(CropImageView cropImageView, long j4, float f4, float f5, float f6, float f7, float f10, float f11, boolean z4) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j4;
            this.mOldX = f4;
            this.mOldY = f5;
            this.mCenterDiffX = f6;
            this.mCenterDiffY = f7;
            this.mOldScale = f10;
            this.mDeltaScale = f11;
            this.mWillBeImageInBoundsAfterTranslate = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.mCropImageView.get();
            if (cropImageView == null) {
                return;
            }
            float min = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float easeOut = CubicEasing.easeOut(min, 0.0f, this.mCenterDiffX, this.mDurationMs);
            float easeOut2 = CubicEasing.easeOut(min, 0.0f, this.mCenterDiffY, this.mDurationMs);
            float easeInOut = CubicEasing.easeInOut(min, 0.0f, this.mDeltaScale, this.mDurationMs);
            if (min < this.mDurationMs) {
                float[] fArr = cropImageView.mCurrentImageCenter;
                cropImageView.postTranslate(easeOut - (fArr[0] - this.mOldX), easeOut2 - (fArr[1] - this.mOldY));
                if (!this.mWillBeImageInBoundsAfterTranslate) {
                    cropImageView.zoomInImage(this.mOldScale + easeInOut, cropImageView.mCropRect.centerX(), cropImageView.mCropRect.centerY());
                }
                if (cropImageView.isImageWrapCropBounds()) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    private static class ZoomImageToPosition implements Runnable {
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final float mDestX;
        private final float mDestY;
        private final long mDurationMs;
        private final float mOldScale;
        private final long mStartTime = System.currentTimeMillis();

        public ZoomImageToPosition(CropImageView cropImageView, long j4, float f4, float f5, float f6, float f7) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j4;
            this.mOldScale = f4;
            this.mDeltaScale = f5;
            this.mDestX = f6;
            this.mDestY = f7;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.mCropImageView.get();
            if (cropImageView == null) {
                return;
            }
            float min = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float easeInOut = CubicEasing.easeInOut(min, 0.0f, this.mDeltaScale, this.mDurationMs);
            if (min >= this.mDurationMs) {
                cropImageView.setImageToWrapCropBounds();
            } else {
                cropImageView.zoomInImage(this.mOldScale + easeInOut, this.mDestX, this.mDestY);
                cropImageView.post(this);
            }
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    private float[] calculateImageIndents() {
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArr = this.mCurrentImageCorners;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] cornersFromRect = RectUtils.getCornersFromRect(this.mCropRect);
        this.mTempMatrix.mapPoints(copyOf);
        this.mTempMatrix.mapPoints(cornersFromRect);
        RectF trapToRect = RectUtils.trapToRect(copyOf);
        RectF trapToRect2 = RectUtils.trapToRect(cornersFromRect);
        float f4 = trapToRect.left - trapToRect2.left;
        float f5 = trapToRect.top - trapToRect2.top;
        float f6 = trapToRect.right - trapToRect2.right;
        float f7 = trapToRect.bottom - trapToRect2.bottom;
        if (f4 <= 0.0f) {
            f4 = 0.0f;
        }
        if (f5 <= 0.0f) {
            f5 = 0.0f;
        }
        if (f6 >= 0.0f) {
            f6 = 0.0f;
        }
        if (f7 >= 0.0f) {
            f7 = 0.0f;
        }
        float[] fArr2 = {f4, f5, f6, f7};
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(getCurrentAngle());
        this.mTempMatrix.mapPoints(fArr2);
        return fArr2;
    }

    private void calculateImageScaleBounds() {
        if (getDrawable() == null) {
            return;
        }
        calculateImageScaleBounds(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    private void setupInitialImagePosition(float f4, float f5) {
        float width = this.mCropRect.width();
        float height = this.mCropRect.height();
        float max = Math.max(this.mCropRect.width() / f4, this.mCropRect.height() / f5);
        float a5 = f4.a(f4, max, width, 2.0f);
        RectF rectF = this.mCropRect;
        float f6 = a5 + rectF.left;
        float a6 = f4.a(f5, max, height, 2.0f) + rectF.top;
        this.mCurrentImageMatrix.reset();
        this.mCurrentImageMatrix.postScale(max, max);
        this.mCurrentImageMatrix.postTranslate(f6, a6);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void cancelAllAnimations() {
        removeCallbacks(this.mWrapCropBoundsRunnable);
        removeCallbacks(this.mZoomImageToPositionRunnable);
    }

    public void cropAndSaveImage(@o0 Bitmap.CompressFormat compressFormat, int i4, @q0 BitmapCropCallback bitmapCropCallback) {
        cancelAllAnimations();
        setImageToWrapCropBounds(false);
        ImageState imageState = new ImageState(this.mCropRect, RectUtils.trapToRect(this.mCurrentImageCorners), getCurrentScale(), getCurrentAngle());
        CropParameters cropParameters = new CropParameters(this.mMaxResultImageSizeX, this.mMaxResultImageSizeY, compressFormat, i4, getImageInputPath(), getImageOutputPath(), getExifInfo());
        cropParameters.setContentImageInputUri(getImageInputUri());
        cropParameters.setContentImageOutputUri(getImageOutputUri());
        new BitmapCropTask(getContext(), getViewBitmap(), imageState, cropParameters, bitmapCropCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @q0
    public CropBoundsChangeListener getCropBoundsChangeListener() {
        return this.mCropBoundsChangeListener;
    }

    public float getMaxScale() {
        return this.mMaxScale;
    }

    public float getMinScale() {
        return this.mMinScale;
    }

    public float getTargetAspectRatio() {
        return this.mTargetAspectRatio;
    }

    protected boolean isImageWrapCropBounds() {
        return isImageWrapCropBounds(this.mCurrentImageCorners);
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    protected void onImageLaidOut() {
        super.onImageLaidOut();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.mTargetAspectRatio == 0.0f) {
            this.mTargetAspectRatio = intrinsicWidth / intrinsicHeight;
        }
        int i4 = this.mThisWidth;
        float f4 = this.mTargetAspectRatio;
        int i5 = (int) (i4 / f4);
        int i6 = this.mThisHeight;
        if (i5 > i6) {
            this.mCropRect.set((i4 - ((int) (i6 * f4))) / 2, 0.0f, r4 + r2, i6);
        } else {
            this.mCropRect.set(0.0f, (i6 - i5) / 2, i4, i5 + r6);
        }
        calculateImageScaleBounds(intrinsicWidth, intrinsicHeight);
        setupInitialImagePosition(intrinsicWidth, intrinsicHeight);
        CropBoundsChangeListener cropBoundsChangeListener = this.mCropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
        TransformImageView.TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onScale(getCurrentScale());
            this.mTransformImageListener.onRotate(getCurrentAngle());
        }
    }

    public void postRotate(float f4) {
        postRotate(f4, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void postScale(float f4, float f5, float f6) {
        if (f4 > 1.0f && getCurrentScale() * f4 <= getMaxScale()) {
            super.postScale(f4, f5, f6);
        } else {
            if (f4 >= 1.0f || getCurrentScale() * f4 < getMinScale()) {
                return;
            }
            super.postScale(f4, f5, f6);
        }
    }

    protected void processStyledAttributes(@o0 TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.mTargetAspectRatio = 0.0f;
        } else {
            this.mTargetAspectRatio = abs / abs2;
        }
    }

    public void setCropBoundsChangeListener(@q0 CropBoundsChangeListener cropBoundsChangeListener) {
        this.mCropBoundsChangeListener = cropBoundsChangeListener;
    }

    public void setCropRect(RectF rectF) {
        this.mTargetAspectRatio = rectF.width() / rectF.height();
        this.mCropRect.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        calculateImageScaleBounds();
        setImageToWrapCropBounds();
    }

    public void setImageToWrapCropBounds() {
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBoundsAnimDuration(@g0(from = 100) long j4) {
        if (j4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("彐\u0001"));
        }
        this.mImageToWrapCropBoundsAnimDuration = j4;
    }

    public void setMaxResultImageSizeX(@g0(from = 10) int i4) {
        this.mMaxResultImageSizeX = i4;
    }

    public void setMaxResultImageSizeY(@g0(from = 10) int i4) {
        this.mMaxResultImageSizeY = i4;
    }

    public void setMaxScaleMultiplier(float f4) {
        this.mMaxScaleMultiplier = f4;
    }

    public void setTargetAspectRatio(float f4) {
        if (getDrawable() == null) {
            this.mTargetAspectRatio = f4;
            return;
        }
        if (f4 == 0.0f) {
            this.mTargetAspectRatio = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        } else {
            this.mTargetAspectRatio = f4;
        }
        CropBoundsChangeListener cropBoundsChangeListener = this.mCropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
    }

    protected void zoomImageToPosition(float f4, float f5, float f6, long j4) {
        if (f4 > getMaxScale()) {
            f4 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        ZoomImageToPosition zoomImageToPosition = new ZoomImageToPosition(this, j4, currentScale, f4 - currentScale, f5, f6);
        this.mZoomImageToPositionRunnable = zoomImageToPosition;
        post(zoomImageToPosition);
    }

    public void zoomInImage(float f4) {
        zoomInImage(f4, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void zoomOutImage(float f4) {
        zoomOutImage(f4, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected boolean isImageWrapCropBounds(float[] fArr) {
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.mTempMatrix.mapPoints(copyOf);
        float[] cornersFromRect = RectUtils.getCornersFromRect(this.mCropRect);
        this.mTempMatrix.mapPoints(cornersFromRect);
        return RectUtils.trapToRect(copyOf).contains(RectUtils.trapToRect(cornersFromRect));
    }

    public void setImageToWrapCropBounds(boolean z4) {
        float f4;
        float max;
        float f5;
        if (!this.mBitmapLaidOut || isImageWrapCropBounds()) {
            return;
        }
        float[] fArr = this.mCurrentImageCenter;
        float f6 = fArr[0];
        float f7 = fArr[1];
        float currentScale = getCurrentScale();
        float centerX = this.mCropRect.centerX() - f6;
        float centerY = this.mCropRect.centerY() - f7;
        this.mTempMatrix.reset();
        this.mTempMatrix.setTranslate(centerX, centerY);
        float[] fArr2 = this.mCurrentImageCorners;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.mTempMatrix.mapPoints(copyOf);
        boolean isImageWrapCropBounds = isImageWrapCropBounds(copyOf);
        if (isImageWrapCropBounds) {
            float[] calculateImageIndents = calculateImageIndents();
            float f10 = -(calculateImageIndents[0] + calculateImageIndents[2]);
            f5 = -(calculateImageIndents[1] + calculateImageIndents[3]);
            f4 = f10;
            max = 0.0f;
        } else {
            RectF rectF = new RectF(this.mCropRect);
            this.mTempMatrix.reset();
            this.mTempMatrix.setRotate(getCurrentAngle());
            this.mTempMatrix.mapRect(rectF);
            float[] rectSidesFromCorners = RectUtils.getRectSidesFromCorners(this.mCurrentImageCorners);
            f4 = centerX;
            max = (Math.max(rectF.width() / rectSidesFromCorners[0], rectF.height() / rectSidesFromCorners[1]) * currentScale) - currentScale;
            f5 = centerY;
        }
        if (z4) {
            WrapCropBoundsRunnable wrapCropBoundsRunnable = new WrapCropBoundsRunnable(this, this.mImageToWrapCropBoundsAnimDuration, f6, f7, f4, f5, currentScale, max, isImageWrapCropBounds);
            this.mWrapCropBoundsRunnable = wrapCropBoundsRunnable;
            post(wrapCropBoundsRunnable);
        } else {
            postTranslate(f4, f5);
            if (isImageWrapCropBounds) {
                return;
            }
            zoomInImage(currentScale + max, this.mCropRect.centerX(), this.mCropRect.centerY());
        }
    }

    public void zoomInImage(float f4, float f5, float f6) {
        if (f4 <= getMaxScale()) {
            postScale(f4 / getCurrentScale(), f5, f6);
        }
    }

    public void zoomOutImage(float f4, float f5, float f6) {
        if (f4 >= getMinScale()) {
            postScale(f4 / getCurrentScale(), f5, f6);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mCropRect = new RectF();
        this.mTempMatrix = new Matrix();
        this.mMaxScaleMultiplier = 10.0f;
        this.mZoomImageToPositionRunnable = null;
        this.mMaxResultImageSizeX = 0;
        this.mMaxResultImageSizeY = 0;
        this.mImageToWrapCropBoundsAnimDuration = 500L;
    }

    private void calculateImageScaleBounds(float f4, float f5) {
        float min = Math.min(Math.min(this.mCropRect.width() / f4, this.mCropRect.width() / f5), Math.min(this.mCropRect.height() / f5, this.mCropRect.height() / f4));
        this.mMinScale = min;
        this.mMaxScale = min * this.mMaxScaleMultiplier;
    }
}
