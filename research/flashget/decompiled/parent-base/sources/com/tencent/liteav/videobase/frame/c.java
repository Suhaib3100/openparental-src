package com.tencent.liteav.videobase.frame;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int f72257a = -1;

    public final void a() {
        if (this.f72257a == -1) {
            this.f72257a = OpenGlUtils.generateFrameBufferId();
        }
    }

    public final void b() {
        OpenGlUtils.bindFramebuffer(36160, this.f72257a);
    }

    public final void c() {
        int i4 = this.f72257a;
        if (i4 == -1) {
            LiteavLog.d(ProtectedSandApp.s("唤\u0001"), ProtectedSandApp.s("唥\u0001"));
        } else {
            OpenGlUtils.detachTextureFromFrameBuffer(i4);
        }
    }

    public final void d() {
        int i4 = this.f72257a;
        if (i4 != -1) {
            OpenGlUtils.deleteFrameBuffer(i4);
            this.f72257a = -1;
        }
    }

    public final void a(int i4) {
        int i5 = this.f72257a;
        if (i5 == -1) {
            LiteavLog.d(ProtectedSandApp.s("唤\u0001"), ProtectedSandApp.s("唥\u0001"));
        } else {
            OpenGlUtils.attachTextureToFrameBuffer(i4, i5);
        }
    }
}
