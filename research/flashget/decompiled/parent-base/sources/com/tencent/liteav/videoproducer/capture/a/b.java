package com.tencent.liteav.videoproducer.capture.a;

import android.hardware.Camera;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;

/* loaded from: classes7.dex */
final /* synthetic */ class b implements Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    private static final b f72519a = new b();

    private b() {
    }

    public static Camera.AutoFocusCallback a() {
        return f72519a;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z4, Camera camera) {
        LiteavLog.d(ProtectedSandApp.s("嚏\u0001"), ProtectedSandApp.s("嚚\u0001"), Boolean.valueOf(z4));
    }
}
