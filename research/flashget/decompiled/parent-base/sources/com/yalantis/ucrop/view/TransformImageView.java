package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatImageView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.UCropDevelopConfig;
import com.yalantis.ucrop.UCropImageEngine;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import com.yalantis.ucrop.util.FastBitmapDrawable;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.RectUtils;

/* loaded from: classes7.dex */
public class TransformImageView extends AppCompatImageView {
    private static final int MATRIX_VALUES_COUNT = 9;
    private static final int RECT_CENTER_POINT_COORDS = 2;
    private static final int RECT_CORNER_POINTS_COORDS = 8;
    private static final String TAG = ProtectedSandApp.s("彏\u0001");
    protected boolean mBitmapDecoded;
    protected boolean mBitmapLaidOut;
    protected final float[] mCurrentImageCenter;
    protected final float[] mCurrentImageCorners;
    protected Matrix mCurrentImageMatrix;
    private ExifInfo mExifInfo;
    private String mImageInputPath;
    private Uri mImageInputUri;
    private String mImageOutputPath;
    private Uri mImageOutputUri;
    private float[] mInitialImageCenter;
    private float[] mInitialImageCorners;
    private final float[] mMatrixValues;
    private int mMaxBitmapSize;
    protected int mThisHeight;
    protected int mThisWidth;
    protected TransformImageListener mTransformImageListener;

    public interface TransformImageListener {
        void onLoadComplete();

        void onLoadFailure(@o0 Exception exc);

        void onRotate(float f4);

        void onScale(float f4);
    }

    public TransformImageView(Context context) {
        this(context, null);
    }

    private void updateCurrentImagePoints() {
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCorners, this.mInitialImageCorners);
        this.mCurrentImageMatrix.mapPoints(this.mCurrentImageCenter, this.mInitialImageCenter);
    }

    private void useCustomLoaderCrop(@o0 final Uri uri, @q0 final Uri uri2) {
        int[] maxImageSize = BitmapLoadUtils.getMaxImageSize(getContext(), uri);
        if (maxImageSize[0] <= 0 || maxImageSize[1] <= 0) {
            useDefaultLoaderCrop(uri, uri2);
        } else {
            UCropDevelopConfig.imageEngine.loadImage(getContext(), uri, maxImageSize[0], maxImageSize[1], new UCropImageEngine.OnCallbackListener<Bitmap>() { // from class: com.yalantis.ucrop.view.TransformImageView.1
                @Override // com.yalantis.ucrop.UCropImageEngine.OnCallbackListener
                public void onCall(Bitmap bitmap) {
                    if (bitmap == null) {
                        TransformImageView.this.useDefaultLoaderCrop(uri, uri2);
                    } else {
                        TransformImageView.this.setBitmapLoadedResult(bitmap.copy(bitmap.getConfig(), true), new ExifInfo(0, 0, 0), uri, uri2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void useDefaultLoaderCrop(@o0 Uri uri, @q0 Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        BitmapLoadUtils.decodeBitmapInBackground(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new BitmapLoadCallback() { // from class: com.yalantis.ucrop.view.TransformImageView.2
            @Override // com.yalantis.ucrop.callback.BitmapLoadCallback
            public void onBitmapLoaded(@o0 Bitmap bitmap, @o0 ExifInfo exifInfo, @o0 Uri uri3, @q0 Uri uri4) {
                TransformImageView.this.setBitmapLoadedResult(bitmap, exifInfo, uri3, uri4);
            }

            @Override // com.yalantis.ucrop.callback.BitmapLoadCallback
            public void onFailure(@o0 Exception exc) {
                TransformImageListener transformImageListener = TransformImageView.this.mTransformImageListener;
                if (transformImageListener != null) {
                    transformImageListener.onLoadFailure(exc);
                }
            }
        });
    }

    public float getCurrentAngle() {
        return getMatrixAngle(this.mCurrentImageMatrix);
    }

    public float getCurrentScale() {
        return getMatrixScale(this.mCurrentImageMatrix);
    }

    public ExifInfo getExifInfo() {
        return this.mExifInfo;
    }

    public String getImageInputPath() {
        return this.mImageInputPath;
    }

    public Uri getImageInputUri() {
        return this.mImageInputUri;
    }

    public String getImageOutputPath() {
        return this.mImageOutputPath;
    }

    public Uri getImageOutputUri() {
        return this.mImageOutputUri;
    }

    public float getMatrixAngle(@o0 Matrix matrix) {
        return (float) (-(Math.atan2(getMatrixValue(matrix, 1), getMatrixValue(matrix, 0)) * 57.29577951308232d));
    }

    public float getMatrixScale(@o0 Matrix matrix) {
        return (float) Math.sqrt(Math.pow(getMatrixValue(matrix, 3), 2.0d) + Math.pow(getMatrixValue(matrix, 0), 2.0d));
    }

    protected float getMatrixValue(@o0 Matrix matrix, @g0(from = 0, to = 9) int i4) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i4];
    }

    public int getMaxBitmapSize() {
        if (this.mMaxBitmapSize <= 0) {
            this.mMaxBitmapSize = BitmapLoadUtils.calculateMaxBitmapSize(getContext());
        }
        return this.mMaxBitmapSize;
    }

    @q0
    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof FastBitmapDrawable)) {
            return null;
        }
        return ((FastBitmapDrawable) getDrawable()).getBitmap();
    }

    protected void init() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    protected void onImageLaidOut() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        String.format(ProtectedSandApp.s("彎\u0001"), Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.mInitialImageCorners = RectUtils.getCornersFromRect(rectF);
        this.mInitialImageCenter = RectUtils.getCenterFromRect(rectF);
        this.mBitmapLaidOut = true;
        TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onLoadComplete();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        if (z4 || (this.mBitmapDecoded && !this.mBitmapLaidOut)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            onImageLaidOut();
        }
    }

    public void postRotate(float f4, float f5, float f6) {
        if (f4 != 0.0f) {
            this.mCurrentImageMatrix.postRotate(f4, f5, f6);
            setImageMatrix(this.mCurrentImageMatrix);
            TransformImageListener transformImageListener = this.mTransformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onRotate(getMatrixAngle(this.mCurrentImageMatrix));
            }
        }
    }

    public void postScale(float f4, float f5, float f6) {
        if (f4 != 0.0f) {
            this.mCurrentImageMatrix.postScale(f4, f4, f5, f6);
            setImageMatrix(this.mCurrentImageMatrix);
            TransformImageListener transformImageListener = this.mTransformImageListener;
            if (transformImageListener != null) {
                transformImageListener.onScale(getMatrixScale(this.mCurrentImageMatrix));
            }
        }
    }

    public void postTranslate(float f4, float f5) {
        if (f4 == 0.0f && f5 == 0.0f) {
            return;
        }
        this.mCurrentImageMatrix.postTranslate(f4, f5);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    protected void printMatrix(@o0 String str, @o0 Matrix matrix) {
        getMatrixValue(matrix, 2);
        getMatrixValue(matrix, 5);
        getMatrixScale(matrix);
        getMatrixAngle(matrix);
    }

    public void setBitmapLoadedResult(@o0 Bitmap bitmap, @o0 ExifInfo exifInfo, @o0 Uri uri, @q0 Uri uri2) {
        this.mImageInputUri = uri;
        this.mImageOutputUri = uri2;
        this.mImageInputPath = FileUtils.isContent(uri.toString()) ? uri.toString() : uri.getPath();
        this.mImageOutputPath = uri2 != null ? FileUtils.isContent(uri2.toString()) ? uri2.toString() : uri2.getPath() : null;
        this.mExifInfo = exifInfo;
        this.mBitmapDecoded = true;
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new FastBitmapDrawable(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.mCurrentImageMatrix.set(matrix);
        updateCurrentImagePoints();
    }

    public void setImageUri(@o0 Uri uri, @q0 Uri uri2, boolean z4) {
        if (UCropDevelopConfig.imageEngine == null || !z4) {
            useDefaultLoaderCrop(uri, uri2);
        } else {
            useCustomLoaderCrop(uri, uri2);
        }
    }

    public void setMaxBitmapSize(int i4) {
        this.mMaxBitmapSize = i4;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(TransformImageListener transformImageListener) {
        this.mTransformImageListener = transformImageListener;
    }

    public TransformImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransformImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mCurrentImageCorners = new float[8];
        this.mCurrentImageCenter = new float[2];
        this.mMatrixValues = new float[9];
        this.mCurrentImageMatrix = new Matrix();
        this.mBitmapDecoded = false;
        this.mBitmapLaidOut = false;
        this.mMaxBitmapSize = 0;
        init();
    }
}
