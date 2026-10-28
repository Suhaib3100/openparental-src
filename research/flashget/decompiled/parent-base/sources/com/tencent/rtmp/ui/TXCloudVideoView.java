package com.tencent.rtmp.ui;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.g;
import com.tencent.liteav.base.util.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class TXCloudVideoView extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    private static final int FOCUS_AREA_SIZE_IN_DP = 70;
    private WeakReference<b> mCallback;
    private TextureView mCurrentInnerTextureView;
    private final a mDelayedTapRunnable;
    private boolean mEnableShowLog;
    private boolean mEnableTouchToFocus;
    private boolean mEnableZoom;
    private FocusIndicatorView mFocusIndicatorView;
    private TextureView mFreeInnerTextureView;
    protected Object mGLContext;
    private final Runnable mHideIndicatorViewRunnable;
    private final List<TextureView> mInactiveInnerTextureViews;
    private float mLastScaleFactor;
    private float mScaleFactor;
    private ScaleGestureDetector mScaleGestureDetector;
    private final WeakReference<Surface> mSurface;
    private final WeakReference<SurfaceView> mSurfaceView;
    private final String mTAG;
    private String mUserId;
    private TextureView mUserTextureView;
    private AndroidViewEventListener mViewEventListener;

    public interface b {
        void onShowLog(boolean z4);
    }

    public TXCloudVideoView(Context context) {
        this(context, null, null);
    }

    private void addViewInternal(TextureView textureView) {
        if (textureView == null) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尉\u0001"));
            return;
        }
        if (this.mCurrentInnerTextureView == textureView) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尊\u0001"));
            return;
        }
        if (textureView.getParent() != null && textureView.getParent() != this) {
            LiteavLog.e(this.mTAG, ProtectedSandApp.s("尋\u0001") + textureView.getParent());
            return;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尌\u0001") + textureView + ProtectedSandApp.s("對\u0001") + this.mCurrentInnerTextureView + ProtectedSandApp.s("導\u0001") + this.mFreeInnerTextureView);
        if (textureView.getParent() == null) {
            addView(textureView);
        }
        if (this.mFreeInnerTextureView == textureView) {
            this.mFreeInnerTextureView = null;
        }
        TextureView textureView2 = this.mCurrentInnerTextureView;
        if (textureView2 != null) {
            this.mInactiveInnerTextureViews.add(0, textureView2);
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("小\u0001") + this.mCurrentInnerTextureView);
        }
        this.mCurrentInnerTextureView = textureView;
        this.mInactiveInnerTextureViews.remove(textureView);
        updateZOrders();
    }

    private TextureView getFreeInnerTextureView() {
        return this.mFreeInnerTextureView;
    }

    private TextureView getTextureViewSetByUser() {
        return this.mUserTextureView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideIndicatorView() {
        FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
        if (focusIndicatorView != null) {
            focusIndicatorView.setVisibility(8);
        }
    }

    private boolean isShowLogEnabled() {
        return this.mEnableShowLog;
    }

    private void notifyFirstFrameRendered(TextureView textureView) {
        if (this.mCurrentInnerTextureView != textureView || this.mFreeInnerTextureView == null) {
            return;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尐\u0001") + this.mFreeInnerTextureView);
        removeChildView(this.mFreeInnerTextureView);
        this.mFreeInnerTextureView = null;
    }

    private void removeChildView(View view) {
        if (view == null) {
            return;
        }
        if (view.getParent() != this) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尓\u0001") + view.getParent());
            return;
        }
        try {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("少\u0001").concat(String.valueOf(view)));
            removeView(view);
        } catch (Exception e4) {
            LiteavLog.e(this.mTAG, ProtectedSandApp.s("尒\u0001"), e4);
        }
    }

    private void removeViewInternal(TextureView textureView, boolean z4) {
        if (textureView == null) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尔\u0001"));
            return;
        }
        if (this.mInactiveInnerTextureViews.contains(textureView)) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尕\u0001").concat(String.valueOf(textureView)));
            this.mInactiveInnerTextureViews.remove(textureView);
            removeChildView(textureView);
            return;
        }
        if (this.mCurrentInnerTextureView != textureView) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尖\u0001").concat(String.valueOf(textureView)));
            removeChildView(textureView);
            return;
        }
        if (this.mInactiveInnerTextureViews.isEmpty()) {
            this.mCurrentInnerTextureView = null;
        } else {
            this.mCurrentInnerTextureView = this.mInactiveInnerTextureViews.remove(0);
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尗\u0001") + this.mCurrentInnerTextureView);
            removeChildView(this.mFreeInnerTextureView);
            this.mFreeInnerTextureView = null;
        }
        if (!z4) {
            if (this.mFreeInnerTextureView != null) {
                removeChildView(textureView);
                updateZOrders();
                LiteavLog.i(this.mTAG, ProtectedSandApp.s("尘\u0001") + textureView + ProtectedSandApp.s("尙\u0001") + z4 + ProtectedSandApp.s("對\u0001") + this.mCurrentInnerTextureView + ProtectedSandApp.s("導\u0001") + this.mFreeInnerTextureView);
            }
            this.mFreeInnerTextureView = textureView;
            updateZOrders();
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尘\u0001") + textureView + ProtectedSandApp.s("尙\u0001") + z4 + ProtectedSandApp.s("對\u0001") + this.mCurrentInnerTextureView + ProtectedSandApp.s("導\u0001") + this.mFreeInnerTextureView);
        }
        removeChildView(this.mFreeInnerTextureView);
        if (this.mCurrentInnerTextureView == null) {
            resetChildView(textureView);
            this.mFreeInnerTextureView = textureView;
            updateZOrders();
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尘\u0001") + textureView + ProtectedSandApp.s("尙\u0001") + z4 + ProtectedSandApp.s("對\u0001") + this.mCurrentInnerTextureView + ProtectedSandApp.s("導\u0001") + this.mFreeInnerTextureView);
        }
        removeChildView(textureView);
        this.mFreeInnerTextureView = null;
        updateZOrders();
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尘\u0001") + textureView + ProtectedSandApp.s("尙\u0001") + z4 + ProtectedSandApp.s("對\u0001") + this.mCurrentInnerTextureView + ProtectedSandApp.s("導\u0001") + this.mFreeInnerTextureView);
    }

    private void resetChildView(View view) {
        if (view == null) {
            return;
        }
        if (view.getParent() != this) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尚\u0001") + view.getParent());
            return;
        }
        try {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尛\u0001").concat(String.valueOf(view)));
            removeView(view);
            addView(view);
        } catch (Exception e4) {
            LiteavLog.e(this.mTAG, ProtectedSandApp.s("尜\u0001"), e4);
        }
    }

    private void setAndroidViewEventListener(AndroidViewEventListener androidViewEventListener) {
        this.mViewEventListener = androidViewEventListener;
    }

    private void setBackgroundColorForInternalView(int i4) {
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尝\u0001").concat(String.valueOf(i4)));
        if (this.mSurface == null && this.mSurfaceView == null) {
            int i5 = (i4 >> 16) & 255;
            post(com.tencent.rtmp.ui.b.a(this, i4 & 255, (i4 >> 24) & 255, i5, (i4 >> 8) & 255));
        }
    }

    private void setShowLogCallback(WeakReference<b> weakReference) {
        this.mCallback = weakReference;
    }

    private void setTouchToFocusEnabled(boolean z4) {
        this.mEnableTouchToFocus = z4;
    }

    private void setZoomEnabled(boolean z4) {
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尞\u0001").concat(String.valueOf(z4)));
        this.mEnableZoom = z4;
    }

    private void showFocusView(int i4, int i5, int i6, int i7) {
        post(c.a(this, i4, i5, i6, i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showFocusViewInternal(int i4, int i5, int i6, int i7) {
        if ((i6 != 0 && i6 != getWidth()) || (i7 != 0 && i7 != getHeight())) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尟\u0001"));
            return;
        }
        LiteavLog.v(this.mTAG, ProtectedSandApp.s("尠\u0001"), Integer.valueOf(i4), Integer.valueOf(i5));
        removeCallbacks(this.mHideIndicatorViewRunnable);
        int i10 = (int) ((getResources().getDisplayMetrics().density * 70.0f) + 0.5f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i10);
        int i11 = i10 / 2;
        layoutParams.leftMargin = g.a(i4 - i11, 0, getWidth() - i10);
        layoutParams.topMargin = g.a(i5 - i11, 0, getHeight() - i10);
        View view = this.mFocusIndicatorView;
        if (view == null) {
            FocusIndicatorView focusIndicatorView = new FocusIndicatorView(getContext());
            this.mFocusIndicatorView = focusIndicatorView;
            addView(focusIndicatorView, layoutParams);
        } else if (indexOfChild(view) != getChildCount() - 1) {
            try {
                removeView(this.mFocusIndicatorView);
            } catch (Exception e4) {
                LiteavLog.e(this.mTAG, ProtectedSandApp.s("尡\u0001"), e4);
            }
            addView(this.mFocusIndicatorView, layoutParams);
        } else {
            this.mFocusIndicatorView.setLayoutParams(layoutParams);
        }
        this.mFocusIndicatorView.setVisibility(0);
        FocusIndicatorView focusIndicatorView2 = this.mFocusIndicatorView;
        focusIndicatorView2.startAnimation(focusIndicatorView2.f72702a);
        postDelayed(this.mHideIndicatorViewRunnable, TimeUnit.SECONDS.toMillis(1L));
    }

    private void updateZOrders() {
        TextureView textureView = this.mCurrentInnerTextureView;
        if (textureView != null && textureView.getParent() == this) {
            this.mCurrentInnerTextureView.bringToFront();
        }
        TextureView textureView2 = this.mFreeInnerTextureView;
        if (textureView2 != null && textureView2.getParent() == this) {
            this.mFreeInnerTextureView.bringToFront();
        }
        TextureView textureView3 = this.mUserTextureView;
        if (textureView3 != null && textureView3.getParent() == this) {
            this.mUserTextureView.bringToFront();
        }
        FocusIndicatorView focusIndicatorView = this.mFocusIndicatorView;
        if (focusIndicatorView == null || focusIndicatorView.getParent() != this) {
            return;
        }
        this.mFocusIndicatorView.bringToFront();
    }

    public void addVideoView(TextureView textureView) {
        if (textureView == null) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尢\u0001"));
            return;
        }
        if (h.a(this.mUserTextureView, textureView)) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尣\u0001"));
            return;
        }
        removeVideoView();
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尤\u0001").concat(String.valueOf(textureView)));
        if (textureView.getParent() == null) {
            addView(textureView);
        } else if (textureView.getParent() == this) {
            LiteavLog.i(this.mTAG, ProtectedSandApp.s("尥\u0001"));
        } else {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尦\u0001") + textureView.getParent());
        }
        this.mUserTextureView = textureView;
        updateZOrders();
    }

    public void clearLastFrame(boolean z4) {
        if (z4) {
            setVisibility(8);
        }
    }

    public void clearLog() {
    }

    public void disableLog(boolean z4) {
    }

    @Deprecated
    public TextureView getHWVideoView() {
        return getVideoView();
    }

    public Object getOpenGLContext() {
        return this.mGLContext;
    }

    public Surface getSurface() {
        WeakReference<Surface> weakReference = this.mSurface;
        if (weakReference == null) {
            return null;
        }
        Surface surface = weakReference.get();
        if (surface == null) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尧\u0001"));
        }
        return surface;
    }

    public SurfaceView getSurfaceView() {
        WeakReference<SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference == null) {
            return null;
        }
        SurfaceView surfaceView = weakReference.get();
        if (surfaceView == null) {
            LiteavLog.w(this.mTAG, ProtectedSandApp.s("尨\u0001"));
        }
        return surfaceView;
    }

    public String getUserId() {
        return this.mUserId;
    }

    @Deprecated
    public TextureView getVideoView() {
        TextureView textureView = this.mUserTextureView;
        return textureView != null ? textureView : this.mCurrentInnerTextureView;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尩\u0001"));
    }

    public void onDestroy() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尪\u0001"));
    }

    public void onPause() {
    }

    public void onResume() {
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.mEnableZoom) {
            return false;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() - this.mLastScaleFactor;
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        float a5 = g.a(this.mScaleFactor + scaleFactor, 0.0f);
        this.mScaleFactor = a5;
        AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onZoom(a5);
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.mLastScaleFactor = scaleGestureDetector.getScaleFactor();
        return this.mEnableZoom;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        AndroidViewEventListener androidViewEventListener = this.mViewEventListener;
        if (androidViewEventListener != null) {
            androidViewEventListener.onSizeChanged(i4, i5, i6, i7);
        }
        super.onSizeChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            if (this.mEnableTouchToFocus) {
                a aVar = this.mDelayedTapRunnable;
                int x4 = (int) motionEvent.getX();
                int y4 = (int) motionEvent.getY();
                int width = getWidth();
                int height = getHeight();
                Point point = aVar.f72706a;
                point.x = x4;
                point.y = y4;
                aVar.f72707b = width;
                aVar.f72708c = height;
                removeCallbacks(this.mDelayedTapRunnable);
                postDelayed(this.mDelayedTapRunnable, 100L);
            }
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2 && this.mEnableZoom) {
            removeCallbacks(this.mDelayedTapRunnable);
            hideIndicatorView();
            if (this.mScaleGestureDetector == null) {
                this.mScaleGestureDetector = new ScaleGestureDetector(getContext(), this);
            }
            this.mScaleGestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.mEnableZoom) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            performClick();
        }
        return true;
    }

    public void removeVideoView() {
        if (this.mUserTextureView == null) {
            return;
        }
        LiteavLog.i(this.mTAG, ProtectedSandApp.s("尫\u0001") + this.mUserTextureView);
        removeChildView(this.mUserTextureView);
        this.mUserTextureView = null;
    }

    public void setDashBoardMarginInPx(int i4, int i5, int i6, int i7) {
    }

    public void setDashBoardMarginInRatio(float f4, float f5, float f6, float f7) {
    }

    public void setLogMargin(float f4, float f5, float f6, float f7) {
    }

    public void setOpenGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }

    public void showLog(boolean z4) {
        this.mEnableShowLog = z4;
        WeakReference<b> weakReference = this.mCallback;
        b bVar = weakReference == null ? null : weakReference.get();
        if (bVar != null) {
            bVar.onShowLog(z4);
        }
    }

    public TXCloudVideoView(SurfaceView surfaceView) {
        this(surfaceView.getContext(), null, surfaceView);
    }

    public TXCloudVideoView(Context context, Surface surface) {
        this(context, null, null, surface);
    }

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Point f72706a;

        /* renamed from: b, reason: collision with root package name */
        int f72707b;

        /* renamed from: c, reason: collision with root package name */
        int f72708c;

        private a() {
            this.f72706a = new Point();
            this.f72707b = 0;
            this.f72708c = 0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TXCloudVideoView.this.mViewEventListener != null) {
                AndroidViewEventListener androidViewEventListener = TXCloudVideoView.this.mViewEventListener;
                Point point = this.f72706a;
                androidViewEventListener.onTap(point.x, point.y, this.f72707b, this.f72708c);
            }
        }

        /* synthetic */ a(TXCloudVideoView tXCloudVideoView, byte b5) {
            this();
        }
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    public TXCloudVideoView(Context context, AttributeSet attributeSet, SurfaceView surfaceView) {
        this(context, attributeSet, surfaceView, null);
    }

    private TXCloudVideoView(Context context, AttributeSet attributeSet, SurfaceView surfaceView, Surface surface) {
        super(context, attributeSet);
        this.mTAG = ProtectedSandApp.s("專\u0001") + hashCode();
        this.mInactiveInnerTextureViews = new ArrayList();
        this.mEnableTouchToFocus = false;
        this.mDelayedTapRunnable = new a(this, (byte) 0);
        this.mEnableZoom = false;
        this.mUserId = "";
        this.mHideIndicatorViewRunnable = com.tencent.rtmp.ui.a.a(this);
        this.mSurfaceView = surfaceView != null ? new WeakReference<>(surfaceView) : null;
        this.mSurface = surface != null ? new WeakReference<>(surface) : null;
        if (surfaceView == null && surface == null) {
            TextureView textureView = new TextureView(context);
            this.mFreeInnerTextureView = textureView;
            addView(textureView);
        }
    }
}
