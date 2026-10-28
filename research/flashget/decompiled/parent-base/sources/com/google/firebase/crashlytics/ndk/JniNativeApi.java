package com.google.firebase.crashlytics.ndk;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
class JniNativeApi implements i {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f59558b;

    /* renamed from: c, reason: collision with root package name */
    private static final FilenameFilter f59559c = new h();

    /* renamed from: a, reason: collision with root package name */
    private final Context f59560a;

    static {
        boolean z4;
        try {
            System.loadLibrary(ProtectedSandApp.s("\u0004\u0001"));
            z4 = true;
        } catch (UnsatisfiedLinkError e4) {
            com.google.firebase.crashlytics.internal.g.f().d(ProtectedSandApp.s("\u0005\u0001") + e4.getLocalizedMessage());
            z4 = false;
        }
        f59558b = z4;
    }

    public JniNativeApi(Context context) {
        this.f59560a = context;
    }

    @TargetApi(21)
    public static void c(List<String> list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format(ProtectedSandApp.s("\u0006\u0001"), e(packageInfo)));
        if (!file.exists()) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("\u0007\u0001") + file.getAbsolutePath());
            return;
        }
        File[] listFiles = file.listFiles(f59559c);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("\b\u0001") + listFiles.length + ProtectedSandApp.s("\t\u0001") + file.getAbsolutePath());
        for (File file2 : listFiles) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("\n\u0001") + file2.getName() + ProtectedSandApp.s("\u000b\u0001"));
            list.add(file2.getAbsolutePath());
        }
    }

    private static int d() {
        return 9216;
    }

    private static String e(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }

    public static boolean f() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(File file, String str) {
        return str.toLowerCase().endsWith(ProtectedSandApp.s("\f\u0001"));
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.i
    public boolean a(String str, AssetManager assetManager) {
        String[] h4 = h(Build.CPU_ABI);
        if (h4.length < 2) {
            return false;
        }
        return f59558b && nativeInit(new String[]{h4[0], h4[1], str}, assetManager);
    }

    public String[] h(String str) {
        String s4 = ProtectedSandApp.s("\r\u0001");
        String s5 = ProtectedSandApp.s("\u000e\u0001");
        try {
            PackageInfo packageInfo = this.f59560a.getPackageManager().getPackageInfo(this.f59560a.getPackageName(), 9216);
            ArrayList arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            c(arrayList, packageInfo);
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith(s5)) {
                    arrayList2.add(new File(parentFile, s5).getPath());
                } else if (str.startsWith(s4)) {
                    arrayList2.add(new File(parentFile, s4).getPath());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2.endsWith(ProtectedSandApp.s("\f\u0001"))) {
                    arrayList2.add(str2 + ProtectedSandApp.s("\u000f\u0001") + str);
                }
            }
            arrayList2.add(System.getProperty(ProtectedSandApp.s("\u0010\u0001")));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("\u0011\u0001"), e4);
            throw new RuntimeException(e4);
        }
    }
}
