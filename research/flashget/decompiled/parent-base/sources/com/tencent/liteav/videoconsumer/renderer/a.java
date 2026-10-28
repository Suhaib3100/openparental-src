package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.os.Looper;
import android.view.Surface;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface;

/* loaded from: classes7.dex */
public final class a extends RenderViewHelperInterface {

    /* renamed from: a, reason: collision with root package name */
    private final String f72432a;

    /* renamed from: b, reason: collision with root package name */
    private final CustomHandler f72433b;

    /* renamed from: c, reason: collision with root package name */
    private final RenderViewHelperInterface.RenderViewListener f72434c;

    /* renamed from: d, reason: collision with root package name */
    private Surface f72435d;

    public a(String str, Surface surface, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f72433b = customHandler;
        StringBuilder a5 = androidx.constraintlayout.core.e.a(str, ProtectedSandApp.s("嘋\u0001"));
        a5.append(hashCode());
        String sb = a5.toString();
        this.f72432a = sb;
        this.f72434c = renderViewListener;
        if (surface == null) {
            LiteavLog.w(sb, ProtectedSandApp.s("嘌\u0001"));
        } else {
            this.f72435d = surface;
            customHandler.post(b.a(this, surface));
        }
    }

    static /* synthetic */ void a(a aVar, Surface surface) {
        LiteavLog.i(aVar.f72432a, ProtectedSandApp.s("嘏\u0001").concat(String.valueOf(surface)));
        RenderViewHelperInterface.RenderViewListener renderViewListener = aVar.f72434c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    static /* synthetic */ void b(a aVar) {
        LiteavLog.i(aVar.f72432a, ProtectedSandApp.s("嘐\u0001") + aVar.f72435d);
        if (aVar.f72435d == null) {
            return;
        }
        RenderViewHelperInterface.RenderViewListener renderViewListener = aVar.f72434c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
        aVar.f72435d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f72433b.post(d.a(this));
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
        return true;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z4) {
        this.f72433b.post(c.a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i4, int i5, boolean z4) {
    }

    static /* synthetic */ void a(a aVar) {
        Surface surface = aVar.f72435d;
        if (surface == null) {
            LiteavLog.i(aVar.f72432a, ProtectedSandApp.s("嘍\u0001"));
        } else {
            if (surface.isValid()) {
                return;
            }
            LiteavLog.i(aVar.f72432a, ProtectedSandApp.s("嘎\u0001"), aVar.f72435d);
        }
    }
}
