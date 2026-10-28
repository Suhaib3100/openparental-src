package com.tencent.liteav.base;

import android.content.Context;
import android.support.v4.media.d;
import android.system.Os;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minidev.json.parser.f;

/* loaded from: classes7.dex */
public abstract class PathUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int CACHE_DIRECTORY = 2;
    private static final int DATA_DIRECTORY = 0;
    private static final int LOG_DIRECTORY = 3;
    private static final int NUM_DIRECTORIES = 4;
    private static final int THUMBNAIL_DIRECTORY = 1;
    private static String sCacheSubDirectory;
    private static String sDataDirectorySuffix;
    private static FutureTask<String[]> sDirPathFetchTask;
    private static final String TAG = ProtectedSandApp.s("剅\u0001");
    private static final String THUMBNAIL_DIRECTORY_NAME = ProtectedSandApp.s("剆\u0001");
    private static final AtomicBoolean sInitializationStarted = new AtomicBoolean();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f71775a = PathUtils.getOrComputeDirectoryPaths();
    }

    private PathUtils() {
    }

    private static void chmod(String str, int i4) {
        try {
            Os.chmod(str, i4);
        } catch (Exception unused) {
            Log.e(ProtectedSandApp.s("剅\u0001"), d.a(ProtectedSandApp.s("則\u0001"), str, ProtectedSandApp.s("剈\u0001")), new Object[0]);
        }
    }

    public static String getCacheDirectory() {
        return getDirectoryPath(2);
    }

    public static String getDataDirectory() {
        return getDirectoryPath(0);
    }

    private static String getDirectoryPath(int i4) {
        return a.f71775a[i4];
    }

    public static String getLogDirectory() {
        return getDirectoryPath(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] getOrComputeDirectoryPaths() {
        try {
            if (!sDirPathFetchTask.cancel(false)) {
                return sDirPathFetchTask.get();
            }
            b a5 = b.a();
            try {
                return setPrivateDataDirectorySuffixInternal();
            } finally {
            }
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public static String getThumbnailCacheDirectory() {
        return getDirectoryPath(1);
    }

    public static synchronized void setPrivateDataDirectorySuffix(String str, String str2) {
        synchronized (PathUtils.class) {
            if (!sInitializationStarted.getAndSet(true)) {
                sDataDirectorySuffix = str;
                sCacheSubDirectory = str2;
                sDirPathFetchTask = new FutureTask<>(com.tencent.liteav.base.a.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] setPrivateDataDirectorySuffixInternal() {
        String[] strArr = new String[4];
        Context applicationContext = ContextUtils.getApplicationContext();
        String path = applicationContext.getDir(sDataDirectorySuffix, 0).getPath();
        strArr[0] = path;
        chmod(path, f.f81763q);
        strArr[1] = applicationContext.getDir(ProtectedSandApp.s("剆\u0001"), 0).getPath();
        if (applicationContext.getCacheDir() != null) {
            if (sCacheSubDirectory == null) {
                strArr[2] = applicationContext.getCacheDir().getPath();
            } else {
                strArr[2] = new File(applicationContext.getCacheDir(), sCacheSubDirectory).getPath();
            }
        }
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            strArr[3] = externalFilesDir.getAbsolutePath() + ProtectedSandApp.s("剉\u0001");
        }
        return strArr;
    }

    public static void setPrivateDataDirectorySuffix(String str) {
        setPrivateDataDirectorySuffix(str, null);
    }
}
