package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: RuntimeCompat.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11309a = ProtectedSandApp.s("Ľ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f11310b = ProtectedSandApp.s("ľ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f11311c = ProtectedSandApp.s("Ŀ");

    /* compiled from: RuntimeCompat.java */
    class a implements FilenameFilter {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Pattern f11312o;

        a(Pattern pattern) {
            this.f11312o = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f11312o.matcher(str).matches();
        }
    }

    private b() {
    }

    static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    private static int b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                fileArr = new File(ProtectedSandApp.s("ĺ")).listFiles(new a(Pattern.compile(ProtectedSandApp.s("Ļ"))));
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (Throwable unused) {
            Log.isLoggable(ProtectedSandApp.s("ļ"), 6);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            fileArr = null;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
