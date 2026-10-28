package com.tencent.liteav.live;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.rtmp.ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Method f71984a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f71985b;

    static {
        try {
            Method declaredMethod = TXCloudVideoView.class.getDeclaredMethod(ProtectedSandApp.s("含\u0001"), WeakReference.class);
            f71984a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = TXCloudVideoView.class.getDeclaredMethod(ProtectedSandApp.s("听\u0001"), null);
            f71985b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public static boolean a(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView == null) {
            return false;
        }
        try {
            Object invoke = f71985b.invoke(tXCloudVideoView, null);
            if (invoke == null || !(invoke instanceof Boolean)) {
                return false;
            }
            return ((Boolean) invoke).booleanValue();
        } catch (Exception e4) {
            e4.printStackTrace();
            return false;
        }
    }

    public static void a(TXCloudVideoView tXCloudVideoView, WeakReference<TXCloudVideoView.b> weakReference) {
        if (tXCloudVideoView == null) {
            return;
        }
        try {
            f71984a.invoke(tXCloudVideoView, weakReference);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }
}
