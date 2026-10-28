package com.bumptech.glide.load.engine.executor;

import android.os.StrictMode;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: RuntimeCompat.java */
/* loaded from: classes3.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44021a = ProtectedSandApp.s("ࣧ");

    /* renamed from: b, reason: collision with root package name */
    private static final String f44022b = ProtectedSandApp.s("ࣦ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f44023c = ProtectedSandApp.s("ࣥ");

    /* compiled from: RuntimeCompat.java */
    class a implements FilenameFilter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Pattern f44024b;

        a(Pattern pattern) {
            this.f44024b = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.f44024b.matcher(str).matches();
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
                fileArr = new File(ProtectedSandApp.s("ࣥ")).listFiles(new a(Pattern.compile(ProtectedSandApp.s("ࣦ"))));
            } catch (Throwable unused) {
                Log.isLoggable(ProtectedSandApp.s("ࣧ"), 6);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            }
            return Math.max(1, fileArr != null ? fileArr.length : 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
