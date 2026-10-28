package com.luck.picture.lib.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.appcompat.graphics.drawable.d;
import androidx.compose.material3.f4;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class PhotoViewAttacher implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static final float DEFAULT_MAX_SCALE = 3.0f;
    private static final float DEFAULT_MID_SCALE = 1.75f;
    private static final float DEFAULT_MIN_SCALE = 1.0f;
    private static final int DEFAULT_ZOOM_DURATION = 200;
    private static final int HORIZONTAL_EDGE_BOTH = 2;
    private static final int HORIZONTAL_EDGE_LEFT = 0;
    private static final int HORIZONTAL_EDGE_NONE = -1;
    private static final int HORIZONTAL_EDGE_RIGHT = 1;
    private static final int SINGLE_TOUCH = 1;
    private static final int VERTICAL_EDGE_BOTH = 2;
    private static final int VERTICAL_EDGE_BOTTOM = 1;
    private static final int VERTICAL_EDGE_NONE = -1;
    private static final int VERTICAL_EDGE_TOP = 0;
    private float mBaseRotation;
    private FlingRunnable mCurrentFlingRunnable;
    private GestureDetector mGestureDetector;
    private final ImageView mImageView;
    private View.OnLongClickListener mLongClickListener;
    private OnMatrixChangedListener mMatrixChangeListener;
    private View.OnClickListener mOnClickListener;
    private OnViewDragListener mOnViewDragListener;
    private OnOutsidePhotoTapListener mOutsidePhotoTapListener;
    private OnPhotoTapListener mPhotoTapListener;
    private OnScaleChangedListener mScaleChangeListener;
    private CustomGestureDetector mScaleDragDetector;
    private OnSingleFlingListener mSingleFlingListener;
    private OnViewTapListener mViewTapListener;
    private final OnGestureListener onGestureListener;
    private Interpolator mInterpolator = new AccelerateDecelerateInterpolator();
    private int mZoomDuration = 200;
    private float mMinScale = 1.0f;
    private float mMidScale = DEFAULT_MID_SCALE;
    private float mMaxScale = DEFAULT_MAX_SCALE;
    private boolean mAllowParentInterceptOnEdge = true;
    private boolean mBlockParentIntercept = false;
    private final Matrix mBaseMatrix = new Matrix();
    private final Matrix mDrawMatrix = new Matrix();
    private final Matrix mSuppMatrix = new Matrix();
    private final RectF mDisplayRect = new RectF();
    private final float[] mMatrixValues = new float[9];
    private int mHorizontalScrollEdge = 2;
    private int mVerticalScrollEdge = 2;
    private boolean mZoomEnabled = true;
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: com.luck.picture.lib.photoview.PhotoViewAttacher$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class AnimatedZoomRunnable implements Runnable {
        private final float mFocalX;
        private final float mFocalY;
        private final long mStartTime = System.currentTimeMillis();
        private final float mZoomEnd;
        private final float mZoomStart;

        public AnimatedZoomRunnable(float f4, float f5, float f6, float f7) {
            this.mFocalX = f6;
            this.mFocalY = f7;
            this.mZoomStart = f4;
            this.mZoomEnd = f5;
        }

        private float interpolate() {
            return PhotoViewAttacher.this.mInterpolator.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.mStartTime) * 1.0f) / PhotoViewAttacher.this.mZoomDuration));
        }

        @Override // java.lang.Runnable
        public void run() {
            float interpolate = interpolate();
            float f4 = this.mZoomStart;
            PhotoViewAttacher.this.onGestureListener.onScale(d.a(this.mZoomEnd, f4, interpolate, f4) / PhotoViewAttacher.this.getScale(), this.mFocalX, this.mFocalY);
            if (interpolate < 1.0f) {
                Compat.postOnAnimation(PhotoViewAttacher.this.mImageView, this);
            }
        }
    }

    private class FlingRunnable implements Runnable {
        private int mCurrentX;
        private int mCurrentY;
        private final OverScroller mScroller;

        public FlingRunnable(Context context) {
            this.mScroller = new OverScroller(context);
        }

        public void cancelFling() {
            this.mScroller.forceFinished(true);
        }

        public void fling(int i4, int i5, int i6, int i7) {
            int i10;
            int i11;
            int i12;
            int i13;
            RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int round = Math.round(-displayRect.left);
            float f4 = i4;
            if (f4 < displayRect.width()) {
                i11 = Math.round(displayRect.width() - f4);
                i10 = 0;
            } else {
                i10 = round;
                i11 = i10;
            }
            int round2 = Math.round(-displayRect.top);
            float f5 = i5;
            if (f5 < displayRect.height()) {
                i13 = Math.round(displayRect.height() - f5);
                i12 = 0;
            } else {
                i12 = round2;
                i13 = i12;
            }
            this.mCurrentX = round;
            this.mCurrentY = round2;
            if (round == i11 && round2 == i13) {
                return;
            }
            this.mScroller.fling(round, round2, i6, i7, i10, i11, i12, i13, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                PhotoViewAttacher.this.mSuppMatrix.postTranslate(this.mCurrentX - currX, this.mCurrentY - currY);
                PhotoViewAttacher.this.checkAndDisplayMatrix();
                this.mCurrentX = currX;
                this.mCurrentY = currY;
                Compat.postOnAnimation(PhotoViewAttacher.this.mImageView, this);
            }
        }
    }

    public PhotoViewAttacher(ImageView imageView) {
        OnGestureListener onGestureListener = new OnGestureListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.1
            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onDrag(float f4, float f5) {
                if (PhotoViewAttacher.this.mScaleDragDetector.isScaling()) {
                    return;
                }
                if (PhotoViewAttacher.this.mOnViewDragListener != null) {
                    PhotoViewAttacher.this.mOnViewDragListener.onDrag(f4, f5);
                }
                PhotoViewAttacher.this.mSuppMatrix.postTranslate(f4, f5);
                PhotoViewAttacher.this.checkAndDisplayMatrix();
                ViewParent parent = PhotoViewAttacher.this.mImageView.getParent();
                if (!PhotoViewAttacher.this.mAllowParentInterceptOnEdge || PhotoViewAttacher.this.mScaleDragDetector.isScaling() || PhotoViewAttacher.this.mBlockParentIntercept) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((PhotoViewAttacher.this.mHorizontalScrollEdge == 2 || ((PhotoViewAttacher.this.mHorizontalScrollEdge == 0 && f4 >= 1.0f) || ((PhotoViewAttacher.this.mHorizontalScrollEdge == 1 && f4 <= -1.0f) || ((PhotoViewAttacher.this.mVerticalScrollEdge == 0 && f5 >= 1.0f) || (PhotoViewAttacher.this.mVerticalScrollEdge == 1 && f5 <= -1.0f))))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onFling(float f4, float f5, float f6, float f7) {
                PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                photoViewAttacher.mCurrentFlingRunnable = photoViewAttacher.new FlingRunnable(photoViewAttacher.mImageView.getContext());
                FlingRunnable flingRunnable = PhotoViewAttacher.this.mCurrentFlingRunnable;
                PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                int imageViewWidth = photoViewAttacher2.getImageViewWidth(photoViewAttacher2.mImageView);
                PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                flingRunnable.fling(imageViewWidth, photoViewAttacher3.getImageViewHeight(photoViewAttacher3.mImageView), (int) f6, (int) f7);
                PhotoViewAttacher.this.mImageView.post(PhotoViewAttacher.this.mCurrentFlingRunnable);
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onScale(float f4, float f5, float f6) {
                onScale(f4, f5, f6, 0.0f, 0.0f);
            }

            @Override // com.luck.picture.lib.photoview.OnGestureListener
            public void onScale(float f4, float f5, float f6, float f7, float f10) {
                if (PhotoViewAttacher.this.getScale() < PhotoViewAttacher.this.mMaxScale || f4 < 1.0f) {
                    if (PhotoViewAttacher.this.mScaleChangeListener != null) {
                        PhotoViewAttacher.this.mScaleChangeListener.onScaleChange(f4, f5, f6);
                    }
                    PhotoViewAttacher.this.mSuppMatrix.postScale(f4, f4, f5, f6);
                    PhotoViewAttacher.this.mSuppMatrix.postTranslate(f7, f10);
                    PhotoViewAttacher.this.checkAndDisplayMatrix();
                }
            }
        };
        this.onGestureListener = onGestureListener;
        this.mImageView = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.mBaseRotation = 0.0f;
        this.mScaleDragDetector = new CustomGestureDetector(imageView.getContext(), onGestureListener);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f4, float f5) {
                if (PhotoViewAttacher.this.mSingleFlingListener == null || PhotoViewAttacher.this.getScale() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                    return false;
                }
                return PhotoViewAttacher.this.mSingleFlingListener.onFling(motionEvent, motionEvent2, f4, f5);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                if (PhotoViewAttacher.this.mLongClickListener != null) {
                    PhotoViewAttacher.this.mLongClickListener.onLongClick(PhotoViewAttacher.this.mImageView);
                }
            }
        });
        this.mGestureDetector = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.luck.picture.lib.photoview.PhotoViewAttacher.3
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                try {
                    float scale = PhotoViewAttacher.this.getScale();
                    float x4 = motionEvent.getX();
                    float y4 = motionEvent.getY();
                    if (scale < PhotoViewAttacher.this.getMediumScale()) {
                        PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                        photoViewAttacher.setScale(photoViewAttacher.getMediumScale(), x4, y4, true);
                    } else if (scale < PhotoViewAttacher.this.getMediumScale() || scale >= PhotoViewAttacher.this.getMaximumScale()) {
                        PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                        photoViewAttacher2.setScale(photoViewAttacher2.getMinimumScale(), x4, y4, true);
                    } else {
                        PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                        photoViewAttacher3.setScale(photoViewAttacher3.getMaximumScale(), x4, y4, true);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (PhotoViewAttacher.this.mOnClickListener != null) {
                    PhotoViewAttacher.this.mOnClickListener.onClick(PhotoViewAttacher.this.mImageView);
                }
                RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
                float x4 = motionEvent.getX();
                float y4 = motionEvent.getY();
                if (PhotoViewAttacher.this.mViewTapListener != null) {
                    PhotoViewAttacher.this.mViewTapListener.onViewTap(PhotoViewAttacher.this.mImageView, x4, y4);
                }
                if (displayRect == null) {
                    return false;
                }
                if (!displayRect.contains(x4, y4)) {
                    if (PhotoViewAttacher.this.mOutsidePhotoTapListener == null) {
                        return false;
                    }
                    PhotoViewAttacher.this.mOutsidePhotoTapListener.onOutsidePhotoTap(PhotoViewAttacher.this.mImageView);
                    return false;
                }
                float width = (x4 - displayRect.left) / displayRect.width();
                float height = (y4 - displayRect.top) / displayRect.height();
                if (PhotoViewAttacher.this.mPhotoTapListener == null) {
                    return true;
                }
                PhotoViewAttacher.this.mPhotoTapListener.onPhotoTap(PhotoViewAttacher.this.mImageView, width, height);
                return true;
            }
        });
    }

    private void cancelFling() {
        FlingRunnable flingRunnable = this.mCurrentFlingRunnable;
        if (flingRunnable != null) {
            flingRunnable.cancelFling();
            this.mCurrentFlingRunnable = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndDisplayMatrix() {
        if (checkMatrixBounds()) {
            setImageViewMatrix(getDrawMatrix());
        }
    }

    private boolean checkMatrixBounds() {
        float f4;
        float f5;
        float f6;
        float f7;
        float f10;
        RectF displayRect = getDisplayRect(getDrawMatrix());
        if (displayRect == null) {
            return false;
        }
        float height = displayRect.height();
        float width = displayRect.width();
        float imageViewHeight = getImageViewHeight(this.mImageView);
        float f11 = 0.0f;
        if (height <= imageViewHeight) {
            int i4 = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i4 != 2) {
                if (i4 != 3) {
                    f7 = (imageViewHeight - height) / 2.0f;
                    f10 = displayRect.top;
                } else {
                    f7 = imageViewHeight - height;
                    f10 = displayRect.top;
                }
                f4 = f7 - f10;
            } else {
                f4 = -displayRect.top;
            }
            this.mVerticalScrollEdge = 2;
        } else {
            float f12 = displayRect.top;
            if (f12 > 0.0f) {
                this.mVerticalScrollEdge = 0;
                f4 = -f12;
            } else {
                float f13 = displayRect.bottom;
                if (f13 < imageViewHeight) {
                    this.mVerticalScrollEdge = 1;
                    f4 = imageViewHeight - f13;
                } else {
                    this.mVerticalScrollEdge = -1;
                    f4 = 0.0f;
                }
            }
        }
        float imageViewWidth = getImageViewWidth(this.mImageView);
        if (width <= imageViewWidth) {
            int i5 = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i5 != 2) {
                if (i5 != 3) {
                    f5 = (imageViewWidth - width) / 2.0f;
                    f6 = displayRect.left;
                } else {
                    f5 = imageViewWidth - width;
                    f6 = displayRect.left;
                }
                f11 = f5 - f6;
            } else {
                f11 = -displayRect.left;
            }
            this.mHorizontalScrollEdge = 2;
        } else {
            float f14 = displayRect.left;
            if (f14 > 0.0f) {
                this.mHorizontalScrollEdge = 0;
                f11 = -f14;
            } else {
                float f15 = displayRect.right;
                if (f15 < imageViewWidth) {
                    f11 = imageViewWidth - f15;
                    this.mHorizontalScrollEdge = 1;
                } else {
                    this.mHorizontalScrollEdge = -1;
                }
            }
        }
        this.mSuppMatrix.postTranslate(f11, f4);
        return true;
    }

    private Matrix getDrawMatrix() {
        this.mDrawMatrix.set(this.mBaseMatrix);
        this.mDrawMatrix.postConcat(this.mSuppMatrix);
        return this.mDrawMatrix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewHeight(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getImageViewWidth(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float getValue(Matrix matrix, int i4) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i4];
    }

    private void resetMatrix() {
        this.mSuppMatrix.reset();
        setRotationBy(this.mBaseRotation);
        setImageViewMatrix(getDrawMatrix());
        checkMatrixBounds();
    }

    private void setImageViewMatrix(Matrix matrix) {
        RectF displayRect;
        this.mImageView.setImageMatrix(matrix);
        if (this.mMatrixChangeListener == null || (displayRect = getDisplayRect(matrix)) == null) {
            return;
        }
        this.mMatrixChangeListener.onMatrixChanged(displayRect);
    }

    private void updateBaseMatrix(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float imageViewWidth = getImageViewWidth(this.mImageView);
        float imageViewHeight = getImageViewHeight(this.mImageView);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.mBaseMatrix.reset();
        float f4 = intrinsicWidth;
        float f5 = imageViewWidth / f4;
        float f6 = intrinsicHeight;
        float f7 = imageViewHeight / f6;
        ImageView.ScaleType scaleType = this.mScaleType;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.mBaseMatrix.postTranslate((imageViewWidth - f4) / 2.0f, (imageViewHeight - f6) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f5, f7);
            this.mBaseMatrix.postScale(max, max);
            this.mBaseMatrix.postTranslate(f4.a(f4, max, imageViewWidth, 2.0f), f4.a(f6, max, imageViewHeight, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f5, f7));
            this.mBaseMatrix.postScale(min, min);
            this.mBaseMatrix.postTranslate(f4.a(f4, min, imageViewWidth, 2.0f), f4.a(f6, min, imageViewHeight, 2.0f));
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f4, f6);
            RectF rectF2 = new RectF(0.0f, 0.0f, imageViewWidth, imageViewHeight);
            if (((int) this.mBaseRotation) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f6, f4);
            }
            int i4 = AnonymousClass4.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
            if (i4 == 1) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i4 == 2) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i4 == 3) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i4 == 4) {
                this.mBaseMatrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        resetMatrix();
    }

    public void getDisplayMatrix(Matrix matrix) {
        matrix.set(getDrawMatrix());
    }

    public RectF getDisplayRect() {
        checkMatrixBounds();
        return getDisplayRect(getDrawMatrix());
    }

    public Matrix getImageMatrix() {
        return this.mDrawMatrix;
    }

    public float getMaximumScale() {
        return this.mMaxScale;
    }

    public float getMediumScale() {
        return this.mMidScale;
    }

    public float getMinimumScale() {
        return this.mMinScale;
    }

    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(getValue(this.mSuppMatrix, 0), 2.0d)) + ((float) Math.pow(getValue(this.mSuppMatrix, 3), 2.0d)));
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public void getSuppMatrix(Matrix matrix) {
        matrix.set(this.mSuppMatrix);
    }

    @Deprecated
    public boolean isZoomEnabled() {
        return this.mZoomEnabled;
    }

    public boolean isZoomable() {
        return this.mZoomEnabled;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
        if (i4 == i10 && i5 == i11 && i6 == i12 && i7 == i13) {
            return;
        }
        updateBaseMatrix(this.mImageView.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.mZoomEnabled
            r1 = 0
            if (r0 == 0) goto Lbe
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = com.luck.picture.lib.photoview.Util.hasDrawable(r0)
            if (r0 == 0) goto Lbe
            int r0 = r12.getAction()
            r2 = 1
            if (r0 == 0) goto L6e
            if (r0 == r2) goto L1b
            r3 = 3
            if (r0 == r3) goto L1b
            goto L7a
        L1b:
            float r0 = r10.getScale()
            float r3 = r10.mMinScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L44
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L7a
            com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable r9 = new com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable
            float r5 = r10.getScale()
            float r6 = r10.mMinScale
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L6c
        L44:
            float r0 = r10.getScale()
            float r3 = r10.mMaxScale
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7a
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L7a
            com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable r9 = new com.luck.picture.lib.photoview.PhotoViewAttacher$AnimatedZoomRunnable
            float r5 = r10.getScale()
            float r6 = r10.mMaxScale
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L6c:
            r11 = r2
            goto L7b
        L6e:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L77
            r11.requestDisallowInterceptTouchEvent(r2)
        L77:
            r10.cancelFling()
        L7a:
            r11 = r1
        L7b:
            com.luck.picture.lib.photoview.CustomGestureDetector r0 = r10.mScaleDragDetector
            if (r0 == 0) goto Lb2
            boolean r11 = r0.isScaling()
            com.luck.picture.lib.photoview.CustomGestureDetector r0 = r10.mScaleDragDetector
            boolean r0 = r0.isDragging()
            com.luck.picture.lib.photoview.CustomGestureDetector r3 = r10.mScaleDragDetector
            boolean r3 = r3.onTouchEvent(r12)
            if (r11 != 0) goto L9b
            com.luck.picture.lib.photoview.CustomGestureDetector r11 = r10.mScaleDragDetector
            boolean r11 = r11.isScaling()
            if (r11 != 0) goto L9b
            r11 = r2
            goto L9c
        L9b:
            r11 = r1
        L9c:
            if (r0 != 0) goto La8
            com.luck.picture.lib.photoview.CustomGestureDetector r0 = r10.mScaleDragDetector
            boolean r0 = r0.isDragging()
            if (r0 != 0) goto La8
            r0 = r2
            goto La9
        La8:
            r0 = r1
        La9:
            if (r11 == 0) goto Lae
            if (r0 == 0) goto Lae
            r1 = r2
        Lae:
            r10.mBlockParentIntercept = r1
            r1 = r3
            goto Lb3
        Lb2:
            r1 = r11
        Lb3:
            android.view.GestureDetector r11 = r10.mGestureDetector
            if (r11 == 0) goto Lbe
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lbe
            r1 = r2
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.photoview.PhotoViewAttacher.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setAllowParentInterceptOnEdge(boolean z4) {
        this.mAllowParentInterceptOnEdge = z4;
    }

    public void setBaseRotation(float f4) {
        this.mBaseRotation = f4 % 360.0f;
        update();
        setRotationBy(this.mBaseRotation);
        checkAndDisplayMatrix();
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᛀ\u0001"));
        }
        if (this.mImageView.getDrawable() == null) {
            return false;
        }
        this.mSuppMatrix.set(matrix);
        checkAndDisplayMatrix();
        return true;
    }

    public void setMaximumScale(float f4) {
        Util.checkZoomLevels(this.mMinScale, this.mMidScale, f4);
        this.mMaxScale = f4;
    }

    public void setMediumScale(float f4) {
        Util.checkZoomLevels(this.mMinScale, f4, this.mMaxScale);
        this.mMidScale = f4;
    }

    public void setMinimumScale(float f4) {
        Util.checkZoomLevels(f4, this.mMidScale, this.mMaxScale);
        this.mMinScale = f4;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mGestureDetector.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.mLongClickListener = onLongClickListener;
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.mMatrixChangeListener = onMatrixChangedListener;
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.mOutsidePhotoTapListener = onOutsidePhotoTapListener;
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.mPhotoTapListener = onPhotoTapListener;
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.mScaleChangeListener = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.mSingleFlingListener = onSingleFlingListener;
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.mOnViewDragListener = onViewDragListener;
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.mViewTapListener = onViewTapListener;
    }

    public void setRotationBy(float f4) {
        this.mSuppMatrix.postRotate(f4 % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setRotationTo(float f4) {
        this.mSuppMatrix.setRotate(f4 % 360.0f);
        checkAndDisplayMatrix();
    }

    public void setScale(float f4) {
        setScale(f4, false);
    }

    public void setScaleLevels(float f4, float f5, float f6) {
        Util.checkZoomLevels(f4, f5, f6);
        this.mMinScale = f4;
        this.mMidScale = f5;
        this.mMaxScale = f6;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (!Util.isSupportedScaleType(scaleType) || scaleType == this.mScaleType) {
            return;
        }
        this.mScaleType = scaleType;
        update();
    }

    public void setZoomInterpolator(Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }

    public void setZoomTransitionDuration(int i4) {
        this.mZoomDuration = i4;
    }

    public void setZoomable(boolean z4) {
        this.mZoomEnabled = z4;
        update();
    }

    public void update() {
        if (this.mZoomEnabled) {
            updateBaseMatrix(this.mImageView.getDrawable());
        } else {
            resetMatrix();
        }
    }

    public void setScale(float f4, boolean z4) {
        setScale(f4, this.mImageView.getRight() / 2, this.mImageView.getBottom() / 2, z4);
    }

    private RectF getDisplayRect(Matrix matrix) {
        if (this.mImageView.getDrawable() == null) {
            return null;
        }
        this.mDisplayRect.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.mDisplayRect);
        return this.mDisplayRect;
    }

    public void setScale(float f4, float f5, float f6, boolean z4) {
        if (f4 < this.mMinScale || f4 > this.mMaxScale) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᛁ\u0001"));
        }
        if (z4) {
            this.mImageView.post(new AnimatedZoomRunnable(getScale(), f4, f5, f6));
        } else {
            this.mSuppMatrix.setScale(f4, f4, f5, f6);
            checkAndDisplayMatrix();
        }
    }
}
