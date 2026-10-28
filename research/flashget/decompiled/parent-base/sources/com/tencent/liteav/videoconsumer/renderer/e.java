package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface;

/* loaded from: classes7.dex */
public final class e extends RenderViewHelperInterface {

    /* renamed from: a, reason: collision with root package name */
    private final String f72440a;

    /* renamed from: b, reason: collision with root package name */
    private final CustomHandler f72441b;

    /* renamed from: c, reason: collision with root package name */
    private final RenderViewHelperInterface.RenderViewListener f72442c;

    /* renamed from: d, reason: collision with root package name */
    private SurfaceView f72443d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f72444e;

    /* renamed from: f, reason: collision with root package name */
    private final Size f72445f;

    /* renamed from: g, reason: collision with root package name */
    private GLConstants.GLScaleType f72446g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f72447h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f72448i;

    /* renamed from: j, reason: collision with root package name */
    private final SurfaceHolder.Callback f72449j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnLayoutChangeListener f72450k;

    public e(String str, SurfaceView surfaceView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f72441b = customHandler;
        this.f72444e = new Size();
        this.f72445f = new Size();
        this.f72446g = null;
        this.f72447h = false;
        this.f72448i = true;
        this.f72449j = new SurfaceHolder.Callback() { // from class: com.tencent.liteav.videoconsumer.renderer.e.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
                if (surfaceHolder != null) {
                    LiteavLog.i(e.this.f72440a, ProtectedSandApp.s("嘑\u0001"), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
                    e.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (surfaceHolder != null) {
                    Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                    LiteavLog.i(e.this.f72440a, ProtectedSandApp.s("嘒\u0001"), Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
                    e.this.a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                LiteavLog.i(e.this.f72440a, ProtectedSandApp.s("嘓\u0001"));
                e.this.a();
            }
        };
        this.f72450k = new View.OnLayoutChangeListener() { // from class: com.tencent.liteav.videoconsumer.renderer.e.2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i10, int i11, int i12, int i13) {
                if (e.this.f72447h) {
                    if (e.this.f72445f.width == view.getWidth() && e.this.f72445f.height == view.getHeight()) {
                        return;
                    }
                    e.this.b();
                }
            }
        };
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("嘔\u0001"));
        a5.append(hashCode());
        String sb = a5.toString();
        this.f72440a = sb;
        this.f72442c = renderViewListener;
        if (surfaceView == null) {
            LiteavLog.w(sb, ProtectedSandApp.s("嘕\u0001"));
        } else {
            this.f72443d = surfaceView;
            customHandler.post(f.a(this, surfaceView));
        }
    }

    static /* synthetic */ void b(e eVar) {
        SurfaceView surfaceView = eVar.f72443d;
        if (surfaceView == null) {
            LiteavLog.i(eVar.f72440a, ProtectedSandApp.s("嘙\u0001"));
            return;
        }
        Surface surface = surfaceView.getHolder().getSurface();
        boolean z4 = surface != null && surface.isValid();
        if (!z4 || eVar.f72443d.getWidth() == 0 || eVar.f72443d.getHeight() == 0 || !eVar.f72443d.isShown()) {
            String str = eVar.f72440a;
            SurfaceView surfaceView2 = eVar.f72443d;
            LiteavLog.i(str, ProtectedSandApp.s("嘚\u0001"), surfaceView2, Boolean.valueOf(surfaceView2.isShown()), Boolean.valueOf(z4));
        }
        eVar.f72448i = eVar.f72443d.isShown();
    }

    static /* synthetic */ void c(e eVar) {
        LiteavLog.i(eVar.f72440a, ProtectedSandApp.s("嘛\u0001") + eVar.f72443d);
        if (eVar.f72443d == null) {
            return;
        }
        eVar.a();
        eVar.f72443d.getHolder().removeCallback(eVar.f72449j);
        eVar.f72443d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f72441b.post(h.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void enableNonUniformScale(boolean z4) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final Matrix getTransformMatrix(int i4, int i5) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i4 / 2.0f, i5 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return false;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isVisible() {
        return this.f72448i;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z4) {
        this.f72441b.post(g.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i4, int i5, boolean z4) {
        if (this.f72446g == gLScaleType && this.f72447h == z4) {
            Size size = this.f72444e;
            if (size.width == i4 && size.height == i5) {
                return;
            }
        }
        this.f72447h = z4;
        this.f72446g = gLScaleType;
        this.f72444e.set(i4, i5);
        if (this.f72447h) {
            this.f72441b.runOrPost(i.a(this));
        }
    }

    static /* synthetic */ void a(e eVar, SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface().isValid()) {
            Surface surface = holder.getSurface();
            Rect surfaceFrame = holder.getSurfaceFrame();
            LiteavLog.i(eVar.f72440a, ProtectedSandApp.s("嘖\u0001"), surface, Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
            eVar.a(surface);
        } else {
            LiteavLog.i(eVar.f72440a, ProtectedSandApp.s("嘗\u0001"));
        }
        holder.addCallback(eVar.f72449j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r0 == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72151a) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r0 == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72151a) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r9 = this;
            android.view.SurfaceView r0 = r9.f72443d
            if (r0 == 0) goto Lb5
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof com.tencent.rtmp.ui.TXCloudVideoView
            if (r0 != 0) goto Le
            goto Lb5
        Le:
            android.view.SurfaceView r0 = r9.f72443d
            android.view.ViewParent r0 = r0.getParent()
            com.tencent.rtmp.ui.TXCloudVideoView r0 = (com.tencent.rtmp.ui.TXCloudVideoView) r0
            com.tencent.liteav.base.util.Size r1 = new com.tencent.liteav.base.util.Size
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r1.<init>(r2, r3)
            com.tencent.liteav.base.util.Size r2 = r9.f72444e
            boolean r2 = r2.isValid()
            if (r2 == 0) goto Lb5
            boolean r2 = r1.isValid()
            if (r2 != 0) goto L33
            goto Lb5
        L33:
            com.tencent.liteav.base.util.Size r2 = r9.f72445f
            boolean r2 = r2.isValid()
            if (r2 != 0) goto L40
            android.view.View$OnLayoutChangeListener r2 = r9.f72450k
            r0.addOnLayoutChangeListener(r2)
        L40:
            com.tencent.liteav.base.util.Size r0 = r9.f72445f
            r0.set(r1)
            double r2 = r1.aspectRatio()
            com.tencent.liteav.base.util.Size r0 = r9.f72444e
            double r4 = r0.aspectRatio()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r0 >= 0) goto L65
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r0 = r9.f72446g
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72152b
            if (r0 != r8) goto L5f
        L5b:
            double r4 = r4 / r2
            r2 = r6
            r6 = r4
            goto L72
        L5f:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72151a
            if (r0 != r8) goto L71
        L63:
            double r2 = r2 / r4
            goto L72
        L65:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r0 = r9.f72446g
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72152b
            if (r0 != r8) goto L6c
            goto L63
        L6c:
            com.tencent.liteav.videobase.base.GLConstants$GLScaleType r8 = com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72151a
            if (r0 != r8) goto L71
            goto L5b
        L71:
            r2 = r6
        L72:
            android.view.SurfaceView r0 = r9.f72443d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r4 = r1.getWidth()
            double r4 = (double) r4
            double r4 = r4 * r6
            int r4 = (int) r4
            r0.width = r4
            int r1 = r1.getHeight()
            double r4 = (double) r1
            double r4 = r4 * r2
            int r1 = (int) r4
            r0.height = r1
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto L95
            r1 = r0
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r2 = 17
            r1.gravity = r2
        L95:
            android.view.SurfaceView r1 = r9.f72443d
            r1.setLayoutParams(r0)
            java.lang.String r1 = r9.f72440a
            int r2 = r0.width
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r0 = r0.height
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "嘘\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            com.tencent.liteav.base.util.LiteavLog.i(r1, r2, r0)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.renderer.e.b():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Surface surface) {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f72442c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f72442c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }
}
