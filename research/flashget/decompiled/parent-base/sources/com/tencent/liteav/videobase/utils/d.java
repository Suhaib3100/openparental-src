package com.tencent.liteav.videobase.utils;

import android.content.Intent;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.util.LiteavLog;
import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.b.a f72316a = new com.tencent.liteav.base.b.a(1000);

    public static byte[] a(int i4) {
        try {
            return new byte[i4];
        } catch (OutOfMemoryError e4) {
            a(e4.getMessage());
            return null;
        }
    }

    public static ByteBuffer b(int i4) {
        try {
            return ByteBuffer.allocateDirect(i4);
        } catch (OutOfMemoryError e4) {
            a(e4.getMessage());
            return null;
        }
    }

    private static synchronized void a(String str) {
        synchronized (d.class) {
            if (f72316a.a()) {
                LiteavLog.e(ProtectedSandApp.s("啫\u0001"), ProtectedSandApp.s("啬\u0001").concat(String.valueOf(str)));
                c.a().a(new Intent(ProtectedSandApp.s("啭\u0001")));
            }
        }
    }
}
