package com.tencent.qcloud.core.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import okhttp3.f0;
import okhttp3.u;

/* loaded from: classes7.dex */
public class OkhttpInternalUtils {
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    public static long contentLength(f0 f0Var) {
        return contentLength(f0Var.getHeaders());
    }

    public static boolean hasBody(f0 f0Var) {
        if (f0Var.getRequest().m().equals(ProtectedSandApp.s("媸\u0001"))) {
            return false;
        }
        int u4 = f0Var.u();
        if (((u4 >= 100 && u4 < 200) || u4 == 204 || u4 == 304) && contentLength(f0Var) == -1) {
            if (!ProtectedSandApp.s("媺\u0001").equalsIgnoreCase(f0.C(f0Var, ProtectedSandApp.s("媹\u0001"), null, 2, null))) {
                return false;
            }
        }
        return true;
    }

    public static boolean permitsRequestBody(String str) {
        return (str.equals(ProtectedSandApp.s("媻\u0001")) || str.equals(ProtectedSandApp.s("媸\u0001"))) ? false : true;
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals(ProtectedSandApp.s("媼\u0001"));
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals(ProtectedSandApp.s("媼\u0001"));
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static long contentLength(u uVar) {
        return stringToLong(uVar.f(ProtectedSandApp.s("媷\u0001")));
    }
}
