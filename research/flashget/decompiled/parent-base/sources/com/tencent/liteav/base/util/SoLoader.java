package com.tencent.liteav.base.util;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class SoLoader {
    private static ExternalSoLoader mExternalSoLoader;
    private static boolean mHasLoaded;
    private static String mLibraryPath = "";
    private static final String TAG = ProtectedSandApp.s("厜\u0001");
    private static final Object mLoadLock = new Object();

    public interface ExternalSoLoader {
        boolean loadLibrary(String[] strArr);
    }

    public static String getLibraryPath() {
        return mLibraryPath;
    }

    public static boolean loadAllLibraries() {
        boolean z4;
        synchronized (mLoadLock) {
            try {
                if (!mHasLoaded) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ProtectedSandApp.s("厝\u0001"));
                    arrayList.add(ProtectedSandApp.s("厞\u0001"));
                    arrayList.add(ProtectedSandApp.s("原\u0001"));
                    if (mExternalSoLoader != null) {
                        mHasLoaded = loadLibraryByExternal((String[]) arrayList.toArray(new String[arrayList.size()]));
                    } else if (TextUtils.isEmpty(mLibraryPath)) {
                        mHasLoaded = loadLibraryDefault((String[]) arrayList.toArray(new String[arrayList.size()]));
                    } else {
                        mHasLoaded = loadLibraryInCustomerPath((String[]) arrayList.toArray(new String[arrayList.size()]));
                    }
                }
                z4 = mHasLoaded;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4;
    }

    public static boolean loadLibrary(String str) {
        try {
            synchronized (mLoadLock) {
                try {
                    ExternalSoLoader externalSoLoader = mExternalSoLoader;
                    if (externalSoLoader != null) {
                        return externalSoLoader.loadLibrary(new String[]{str});
                    }
                    if (TextUtils.isEmpty(mLibraryPath)) {
                        System.loadLibrary(str);
                        return true;
                    }
                    return loadLibrary(mLibraryPath, str);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.toString();
            return false;
        }
    }

    private static boolean loadLibraryByExternal(String[] strArr) {
        ExternalSoLoader externalSoLoader = mExternalSoLoader;
        if (externalSoLoader != null && strArr != null && strArr.length != 0) {
            try {
                boolean loadLibrary = externalSoLoader.loadLibrary(strArr);
                Arrays.toString(strArr);
                return loadLibrary;
            } catch (Throwable th) {
                Arrays.toString(strArr);
                th.toString();
            }
        }
        return false;
    }

    private static boolean loadLibraryDefault(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            try {
                for (String str : strArr) {
                    System.loadLibrary(str);
                }
                return true;
            } catch (Throwable th) {
                Arrays.toString(strArr);
                th.toString();
            }
        }
        return false;
    }

    private static boolean loadLibraryInCustomerPath(String[] strArr) {
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(mLibraryPath)) {
            return false;
        }
        boolean z4 = false;
        for (String str : strArr) {
            z4 = loadLibrary(mLibraryPath, str);
            if (!z4) {
                break;
            }
        }
        return z4;
    }

    public static void setExternalSoLoader(ExternalSoLoader externalSoLoader) {
        synchronized (mLoadLock) {
            mExternalSoLoader = externalSoLoader;
        }
    }

    public static void setLibraryPath(String str) {
        ProtectedSandApp.s("厢\u0001").concat(String.valueOf(str));
        mLibraryPath = str;
    }

    private static boolean loadLibrary(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            System.load(str + ProtectedSandApp.s("厠\u0001") + str2 + ProtectedSandApp.s("厡\u0001"));
            return true;
        } catch (Throwable th) {
            th.toString();
            return false;
        }
    }
}
