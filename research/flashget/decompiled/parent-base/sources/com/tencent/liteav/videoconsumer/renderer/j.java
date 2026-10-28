package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.collection.n1;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* loaded from: classes7.dex */
public final class j extends RenderViewHelperInterface implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    private final String f72458a;

    /* renamed from: b, reason: collision with root package name */
    private final CustomHandler f72459b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.liteav.base.b.b f72460c;

    /* renamed from: d, reason: collision with root package name */
    private final RenderViewHelperInterface.RenderViewListener f72461d;

    /* renamed from: e, reason: collision with root package name */
    private final TXCloudVideoView f72462e;

    /* renamed from: f, reason: collision with root package name */
    private TextureView f72463f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72464g;

    /* renamed from: h, reason: collision with root package name */
    private final Size f72465h;

    /* renamed from: i, reason: collision with root package name */
    private GLConstants.GLScaleType f72466i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f72467j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f72468k;

    /* renamed from: l, reason: collision with root package name */
    private Matrix f72469l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f72470m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f72471n;

    /* renamed from: o, reason: collision with root package name */
    private SurfaceTexture f72472o;

    /* renamed from: p, reason: collision with root package name */
    private Surface f72473p;

    /* renamed from: q, reason: collision with root package name */
    private final Size f72474q;

    public j(String str, TXCloudVideoView tXCloudVideoView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        this(str, renderViewListener, tXCloudVideoView, null);
        if (this.f72462e == null) {
            LiteavLog.e(this.f72458a, ProtectedSandApp.s("嘟\u0001"));
            return;
        }
        LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘠\u0001") + this.f72462e);
        this.f72471n = false;
        this.f72459b.post(k.a(this));
    }

    static /* synthetic */ void a(j jVar, boolean z4) {
        LiteavLog.i(jVar.f72458a, ProtectedSandApp.s("嘬\u0001").concat(String.valueOf(z4)));
        TextureView textureView = jVar.f72463f;
        if (textureView == null) {
            return;
        }
        if (textureView.getSurfaceTextureListener() == jVar) {
            jVar.f72463f.setSurfaceTextureListener(null);
        }
        Surface surface = jVar.f72473p;
        if (surface != null) {
            surface.release();
            jVar.f72473p = null;
        }
        if (jVar.f72472o != null) {
            SurfaceTexture surfaceTexture = jVar.f72463f.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = jVar.f72472o;
            if (surfaceTexture != surfaceTexture2) {
                surfaceTexture2.release();
            }
        }
        TXCloudVideoView tXCloudVideoView = jVar.f72462e;
        if (tXCloudVideoView != null) {
            TXCCloudVideoViewMethodInvoker.removeViewInternal(tXCloudVideoView, jVar.f72463f, z4);
        }
        jVar.f72472o = null;
        jVar.f72463f = null;
        jVar.f72464g = true;
    }

    static /* synthetic */ void b(j jVar) {
        jVar.b();
        jVar.c();
        TextureView textureView = jVar.f72463f;
        if (textureView == null || textureView.getVisibility() == 0) {
            return;
        }
        jVar.f72463f.setVisibility(0);
    }

    static /* synthetic */ void c(j jVar) {
        TextureView textureView = jVar.f72463f;
        if (textureView == null) {
            LiteavLog.w(jVar.f72458a, ProtectedSandApp.s("嘲\u0001"));
            return;
        }
        if (!textureView.isAvailable() || jVar.f72463f.getWidth() == 0 || jVar.f72463f.getHeight() == 0 || !jVar.f72463f.isShown()) {
            LiteavLog.w(jVar.f72458a, ProtectedSandApp.s("嘳\u0001"), a(jVar.f72463f), a(jVar.f72462e));
        }
        if (jVar.f72462e != null && jVar.f72463f.getVisibility() != 0) {
            jVar.f72463f.setVisibility(0);
        }
        jVar.f72467j = jVar.f72463f.isShown();
    }

    static /* synthetic */ void f(j jVar) {
        TextureView textureView;
        LiteavLog.i(jVar.f72458a, ProtectedSandApp.s("嘴\u0001"));
        TXCloudVideoView tXCloudVideoView = jVar.f72462e;
        if (tXCloudVideoView == null || (textureView = jVar.f72463f) == null) {
            return;
        }
        TXCCloudVideoViewMethodInvoker.notifyFirstFrameRendered(tXCloudVideoView, textureView);
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f72459b.runOrPost(n.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final synchronized void enableNonUniformScale(boolean z4) {
        if (this.f72470m == z4) {
            return;
        }
        this.f72470m = z4;
        LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘵\u0001").concat(String.valueOf(z4)));
        this.f72459b.post(p.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final Matrix getTransformMatrix(int i4, int i5) {
        Matrix matrix = new Matrix(this.f72469l);
        matrix.postScale(1.0f, -1.0f, i4 / 2.0f, i5 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return true;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isVisible() {
        return this.f72467j;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
        String str = this.f72458a;
        StringBuilder a5 = n1.a(ProtectedSandApp.s("嘶\u0001"), i4, ProtectedSandApp.s("嘷\u0001"), i5, ProtectedSandApp.s("嘸\u0001"));
        a5.append(surfaceTexture);
        LiteavLog.i(str, a5.toString());
        a(surfaceTexture, i4, i5);
        b();
        checkViewAvailability();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘹\u0001").concat(String.valueOf(surfaceTexture)));
        this.f72468k = false;
        return this.f72472o != surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
        TextureView textureView;
        Bitmap bitmap;
        LiteavLog.i(this.f72460c.a(ProtectedSandApp.s("嘺\u0001")), this.f72458a, ProtectedSandApp.s("嘻\u0001"), Integer.valueOf(this.f72474q.width), Integer.valueOf(this.f72474q.height), Integer.valueOf(i4), Integer.valueOf(i5));
        Size size = this.f72474q;
        boolean z4 = size.width > size.height;
        a(surfaceTexture, i4, i5);
        b();
        if (z4 == (i4 > i5) || this.f72461d == null || (textureView = this.f72463f) == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        this.f72461d.onRequestRedraw(bitmap);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f72468k) {
            return;
        }
        this.f72468k = true;
        checkViewAvailability();
        this.f72459b.post(q.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z4) {
        this.f72459b.post(m.a(this, z4));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final synchronized void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i4, int i5, boolean z4) {
        if (this.f72466i == gLScaleType) {
            Size size = this.f72465h;
            if (i4 == size.width && i5 == size.height) {
                return;
            }
        }
        LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘼\u0001"), gLScaleType, Integer.valueOf(i4), Integer.valueOf(i5));
        this.f72466i = gLScaleType;
        this.f72465h.set(i4, i5);
        this.f72459b.runOrPost(o.a(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r0 == com.tencent.liteav.videobase.base.GLConstants.GLScaleType.f72151a) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void b() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.renderer.j.b():void");
    }

    public j(String str, TextureView textureView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        this(str, renderViewListener, null, textureView);
        if (this.f72463f == null) {
            LiteavLog.e(this.f72458a, ProtectedSandApp.s("嘜\u0001"));
            return;
        }
        LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘝\u0001") + this.f72463f);
        this.f72471n = true;
        this.f72459b.post(l.a(this));
    }

    private j(String str, RenderViewHelperInterface.RenderViewListener renderViewListener, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        this.f72459b = new CustomHandler(Looper.getMainLooper());
        this.f72460c = new com.tencent.liteav.base.b.b();
        this.f72464g = false;
        this.f72465h = new Size();
        this.f72466i = null;
        this.f72467j = true;
        this.f72468k = false;
        this.f72469l = new Matrix();
        this.f72470m = true;
        this.f72471n = false;
        this.f72474q = new Size();
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("嘞\u0001"));
        a5.append(hashCode());
        this.f72458a = a5.toString();
        this.f72461d = renderViewListener;
        this.f72462e = tXCloudVideoView;
        this.f72463f = textureView;
    }

    private synchronized void c() {
        TextureView textureView = this.f72463f;
        if (textureView != null && !this.f72471n) {
            if (!this.f72470m && this.f72466i == GLConstants.GLScaleType.f72152b) {
                textureView.setOpaque(false);
            } else {
                textureView.setOpaque(true);
            }
        }
    }

    private static String a(View view) {
        if (view == null) {
            return ProtectedSandApp.s("嘡\u0001");
        }
        String format = String.format(ProtectedSandApp.s("嘢\u0001"), view.getClass().getSimpleName(), Boolean.valueOf(view.isShown()), Integer.valueOf(view.getVisibility()), Integer.valueOf(view.getWindowVisibility()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 19) {
            format = format.concat(String.format(ProtectedSandApp.s("嘣\u0001"), Boolean.valueOf(view.isAttachedToWindow())));
        }
        if (!(view instanceof TextureView)) {
            return format;
        }
        StringBuilder a5 = j4.a(format);
        a5.append(String.format(ProtectedSandApp.s("嘤\u0001"), Boolean.valueOf(((TextureView) view).isAvailable())));
        return a5.toString();
    }

    static /* synthetic */ void a(j jVar) {
        jVar.b();
        jVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f72463f == null && this.f72462e == null) {
            LiteavLog.e(this.f72458a, ProtectedSandApp.s("嘥\u0001"));
            return;
        }
        TXCloudVideoView tXCloudVideoView = this.f72462e;
        if (tXCloudVideoView != null) {
            TextureView freeTextureView = TXCCloudVideoViewMethodInvoker.getFreeTextureView(tXCloudVideoView);
            this.f72463f = freeTextureView;
            if (freeTextureView == null) {
                this.f72463f = new TextureView(this.f72462e.getContext());
            }
            TXCCloudVideoViewMethodInvoker.addViewInternal(this.f72462e, this.f72463f);
            LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘦\u0001") + this.f72463f);
        }
        this.f72463f.setSurfaceTextureListener(this);
        if (!this.f72463f.isAvailable()) {
            LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘧\u0001"));
            checkViewAvailability();
            return;
        }
        Size size = new Size(this.f72463f.getWidth(), this.f72463f.getHeight());
        LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘨\u0001") + this.f72463f + ProtectedSandApp.s("嘩\u0001") + size + ProtectedSandApp.s("嘪\u0001") + this.f72463f.isShown());
        a(this.f72463f.getSurfaceTexture(), size.width, size.height);
    }

    private void a(SurfaceTexture surfaceTexture, int i4, int i5) {
        SurfaceTexture surfaceTexture2 = this.f72472o;
        if (surfaceTexture2 == null) {
            this.f72472o = surfaceTexture;
        } else if (surfaceTexture != surfaceTexture2) {
            LiteavLog.i(this.f72458a, ProtectedSandApp.s("嘫\u0001") + this.f72472o);
            this.f72463f.setSurfaceTexture(this.f72472o);
        }
        this.f72474q.set(i4, i5);
        if (this.f72473p == null) {
            Surface surface = new Surface(this.f72472o);
            this.f72473p = surface;
            RenderViewHelperInterface.RenderViewListener renderViewListener = this.f72461d;
            if (renderViewListener != null) {
                renderViewListener.onSurfaceChanged(surface, false);
            }
        }
    }
}
