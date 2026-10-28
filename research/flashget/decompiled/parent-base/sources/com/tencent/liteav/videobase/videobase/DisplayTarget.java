package com.tencent.liteav.videobase.videobase;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;

@JNINamespace("liteav::video")
/* loaded from: classes7.dex */
public class DisplayTarget {
    private static final String TAG = ProtectedSandApp.s("啴\u0001");
    private boolean mIsViewFromTXCloudVideoView;
    private Surface mSurface;
    private WeakReference<SurfaceView> mSurfaceView;
    private final a mTargetType;
    private WeakReference<TextureView> mTextureView;
    private WeakReference<TXCloudVideoView> mTxCloudVideoView;
    private final CustomHandler mUIHandler;

    /* renamed from: com.tencent.liteav.videobase.videobase.DisplayTarget$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72321a;

        static {
            int[] iArr = new int[a.values().length];
            f72321a = iArr;
            try {
                iArr[a.f72323b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72321a[a.f72322a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f72321a[a.f72324c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f72321a[a.f72325d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum a {
        f72322a,
        f72323b,
        f72324c,
        f72325d
    }

    public DisplayTarget(DisplayTarget displayTarget) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = displayTarget.mTargetType;
        this.mTxCloudVideoView = displayTarget.mTxCloudVideoView;
        this.mTextureView = displayTarget.mTextureView;
        this.mSurfaceView = displayTarget.mSurfaceView;
        this.mSurface = displayTarget.mSurface;
        this.mIsViewFromTXCloudVideoView = displayTarget.mIsViewFromTXCloudVideoView;
    }

    public static DisplayTarget create(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DisplayTarget) {
            return new DisplayTarget((DisplayTarget) obj);
        }
        if (obj instanceof TXCloudVideoView) {
            return new DisplayTarget((TXCloudVideoView) obj);
        }
        if (obj instanceof TextureView) {
            return new DisplayTarget((TextureView) obj);
        }
        if (obj instanceof SurfaceView) {
            return new DisplayTarget((SurfaceView) obj);
        }
        LiteavLog.w(ProtectedSandApp.s("啴\u0001"), ProtectedSandApp.s("啳\u0001").concat(String.valueOf(obj)));
        return null;
    }

    private void requestLayout(View view) {
        if (view == null) {
            return;
        }
        runOnUIThread(b.a(view));
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.myLooper() == this.mUIHandler.getLooper()) {
            runnable.run();
        } else {
            this.mUIHandler.post(runnable);
        }
    }

    private void setVisibility(View view, int i4) {
        if (view == null) {
            return;
        }
        runOnUIThread(com.tencent.liteav.videobase.videobase.a.a(view, i4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DisplayTarget displayTarget = (DisplayTarget) obj;
            if (this.mTargetType == displayTarget.mTargetType && CommonUtil.equals(getTXCloudVideoView(), displayTarget.getTXCloudVideoView()) && CommonUtil.equals(getTextureView(), displayTarget.getTextureView()) && CommonUtil.equals(getSurfaceView(), displayTarget.getSurfaceView()) && CommonUtil.equals(this.mSurface, displayTarget.mSurface)) {
                return true;
            }
        }
        return false;
    }

    public int getDisplayTargetType() {
        return getType().ordinal();
    }

    public Size getSize() {
        WeakReference<TXCloudVideoView> weakReference;
        WeakReference<TextureView> weakReference2;
        int i4;
        int i5;
        WeakReference<SurfaceView> weakReference3;
        a aVar = this.mTargetType;
        TXCloudVideoView tXCloudVideoView = (aVar != a.f72323b || (weakReference3 = this.mSurfaceView) == null) ? (aVar != a.f72322a || (weakReference2 = this.mTextureView) == null) ? (aVar != a.f72325d || (weakReference = this.mTxCloudVideoView) == null) ? null : weakReference.get() : weakReference2.get() : weakReference3.get();
        if (tXCloudVideoView != null) {
            i4 = tXCloudVideoView.getWidth();
            i5 = tXCloudVideoView.getHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        return new Size(i4, i5);
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public SurfaceView getSurfaceView() {
        WeakReference<SurfaceView> weakReference = this.mSurfaceView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public TXCloudVideoView getTXCloudVideoView() {
        WeakReference<TXCloudVideoView> weakReference = this.mTxCloudVideoView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public TextureView getTextureView() {
        WeakReference<TextureView> weakReference = this.mTextureView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public a getType() {
        return this.mTargetType;
    }

    public void hideAll() {
        if (this.mIsViewFromTXCloudVideoView) {
            return;
        }
        setVisibility(getTextureView(), 8);
        setVisibility(getSurfaceView(), 8);
    }

    public boolean isUseSameView(DisplayTarget displayTarget) {
        if (equals(displayTarget)) {
            return true;
        }
        if (displayTarget == null) {
            return false;
        }
        int i4 = AnonymousClass1.f72321a[this.mTargetType.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 == 4 && getTXCloudVideoView() == displayTarget.getTXCloudVideoView() : getSurface() == displayTarget.getSurface() : getTextureView() == displayTarget.getTextureView() : getSurfaceView() == displayTarget.getSurfaceView();
    }

    public boolean isValid() {
        int i4 = AnonymousClass1.f72321a[this.mTargetType.ordinal()];
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 == 4 && getTXCloudVideoView() != null : getSurface() != null : getTextureView() != null : getSurfaceView() != null;
    }

    public void showAll() {
        setVisibility(getTextureView(), 0);
        setVisibility(getSurfaceView(), 0);
        WeakReference<TXCloudVideoView> weakReference = this.mTxCloudVideoView;
        if (weakReference != null) {
            requestLayout(weakReference.get());
        }
        requestLayout(getTextureView());
        requestLayout(getSurfaceView());
    }

    public String toString() {
        return ProtectedSandApp.s("啵\u0001") + this.mTargetType + ProtectedSandApp.s("啶\u0001") + getTXCloudVideoView() + ProtectedSandApp.s("啷\u0001") + getTextureView() + ProtectedSandApp.s("啸\u0001") + getSurfaceView() + ProtectedSandApp.s("啹\u0001") + this.mSurface + '}';
    }

    public DisplayTarget(TXCloudVideoView tXCloudVideoView) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        if (tXCloudVideoView == null) {
            this.mTargetType = a.f72325d;
            return;
        }
        SurfaceView surfaceView = tXCloudVideoView.getSurfaceView();
        Surface surface = tXCloudVideoView.getSurface();
        TextureView textureViewSetByUser = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView);
        if (surfaceView != null) {
            this.mTargetType = a.f72323b;
            this.mSurfaceView = new WeakReference<>(surfaceView);
        } else if (surface != null) {
            this.mTargetType = a.f72324c;
            this.mSurface = surface;
        } else if (textureViewSetByUser != null) {
            this.mTargetType = a.f72322a;
            this.mTextureView = new WeakReference<>(textureViewSetByUser);
            this.mTxCloudVideoView = new WeakReference<>(tXCloudVideoView);
        } else {
            this.mTargetType = a.f72325d;
            this.mTxCloudVideoView = new WeakReference<>(tXCloudVideoView);
        }
        this.mIsViewFromTXCloudVideoView = true;
    }

    public DisplayTarget(TextureView textureView) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = a.f72322a;
        this.mTextureView = new WeakReference<>(textureView);
    }

    public DisplayTarget(SurfaceView surfaceView) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = a.f72323b;
        this.mSurfaceView = new WeakReference<>(surfaceView);
    }

    public DisplayTarget(Surface surface) {
        this.mUIHandler = new CustomHandler(Looper.getMainLooper());
        this.mIsViewFromTXCloudVideoView = false;
        this.mTargetType = a.f72324c;
        this.mSurface = surface;
    }
}
