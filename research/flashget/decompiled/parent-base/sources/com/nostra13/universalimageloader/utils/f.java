package com.nostra13.universalimageloader.utils;

import android.content.Context;
import android.os.Environment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;

/* compiled from: StorageUtils.java */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f70526a = ProtectedSandApp.s("᪼\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final String f70527b = ProtectedSandApp.s("᪻\u0001");

    private f() {
    }

    public static File a(Context context) {
        return b(context, true);
    }

    public static File b(Context context, boolean z4) {
        String str = "";
        try {
            str = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError | NullPointerException unused) {
        }
        File c5 = (z4 && ProtectedSandApp.s("᪱\u0001").equals(str) && h(context)) ? c(context) : null;
        if (c5 == null) {
            c5 = context.getCacheDir();
        }
        if (c5 != null) {
            return c5;
        }
        String str2 = ProtectedSandApp.s("᪲\u0001") + context.getPackageName() + ProtectedSandApp.s("᪳\u0001");
        d.i(ProtectedSandApp.s("᪴\u0001"), str2);
        return new File(str2);
    }

    private static File c(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), ProtectedSandApp.s("᪵\u0001")), ProtectedSandApp.s("᪶\u0001")), context.getPackageName()), ProtectedSandApp.s("᪷\u0001"));
        if (!file.exists()) {
            if (!file.mkdirs()) {
                d.i(ProtectedSandApp.s("᪸\u0001"), new Object[0]);
                return null;
            }
            try {
                new File(file, ProtectedSandApp.s("᪹\u0001")).createNewFile();
            } catch (IOException unused) {
                d.g(ProtectedSandApp.s("᪺\u0001"), new Object[0]);
            }
        }
        return file;
    }

    public static File d(Context context) {
        return e(context, ProtectedSandApp.s("᪻\u0001"));
    }

    public static File e(Context context, String str) {
        File b5 = b(context, true);
        File file = new File(b5, str);
        return (file.exists() || file.mkdir()) ? file : b5;
    }

    public static File f(Context context, String str) {
        File file = (ProtectedSandApp.s("᪱\u0001").equals(Environment.getExternalStorageState()) && h(context)) ? new File(Environment.getExternalStorageDirectory(), str) : null;
        return (file == null || !(file.exists() || file.mkdirs())) ? context.getCacheDir() : file;
    }

    public static File g(Context context, String str, boolean z4) {
        File file = (z4 && ProtectedSandApp.s("᪱\u0001").equals(Environment.getExternalStorageState()) && h(context)) ? new File(Environment.getExternalStorageDirectory(), str) : null;
        return (file == null || !(file.exists() || file.mkdirs())) ? context.getCacheDir() : file;
    }

    private static boolean h(Context context) {
        return context.checkCallingOrSelfPermission(ProtectedSandApp.s("᪼\u0001")) == 0;
    }
}
