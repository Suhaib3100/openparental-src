package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class WorkSourceUtil {
    private static final int zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|2|3|4|(21:47|48|7|8|9|10|11|12|13|(12:39|40|16|(9:35|36|19|(6:31|32|22|(2:27|28)|24|25)|21|22|(0)|24|25)|18|19|(0)|21|22|(0)|24|25)|15|16|(0)|18|19|(0)|21|22|(0)|24|25)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0059, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0045, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "౽"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1c
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1c
            r5[r3] = r6     // Catch: java.lang.Exception -> L1c
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L1c
            goto L1d
        L1c:
            r5 = r4
        L1d:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r5
            boolean r5 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L35
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L35
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L35
            r5[r3] = r8     // Catch: java.lang.Exception -> L35
            r5[r2] = r6     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L35
            goto L36
        L35:
            r0 = r4
        L36:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r0
            java.lang.String r0 = "౾"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Exception -> L45
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L45
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L45
            goto L46
        L45:
            r0 = r4
        L46:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L59
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L59
            r0[r3] = r5     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = "౿"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)     // Catch: java.lang.Exception -> L59
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r0 = r4
        L5a:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L73
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L73
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L73
            r0[r3] = r5     // Catch: java.lang.Exception -> L73
            java.lang.String r5 = "ಀ"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)     // Catch: java.lang.Exception -> L73
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: java.lang.Exception -> L73
            goto L74
        L73:
            r0 = r4
        L74:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L89
            java.lang.String r0 = "ಁ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Exception -> L89
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L89
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: java.lang.Exception -> L89
            goto L8a
        L89:
            r0 = r4
        L8a:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Laf
            java.lang.String r0 = "ಂ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Exception -> Laf
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> Laf
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> Laf
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Laf
            r5[r3] = r7     // Catch: java.lang.Exception -> Laf
            r5[r2] = r6     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = "ಃ"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)     // Catch: java.lang.Exception -> Laf
            java.lang.reflect.Method r0 = r0.getMethod(r6, r5)     // Catch: java.lang.Exception -> Laf
            goto Lb0
        Laf:
            r0 = r4
        Lb0:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "಄"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)     // Catch: java.lang.Exception -> Lc7
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> Lc7
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lc7
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> Lc7
        Lc7:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@o0 WorkSource workSource, int i5, @o0 String str) {
        Method method = zzc;
        String s5 = ProtectedSandApp.s("ಅ");
        String s6 = ProtectedSandApp.s("ಆ");
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i5), str);
                return;
            } catch (Exception e6) {
                Log.wtf(s6, s5, e6);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i5));
            } catch (Exception e7) {
                Log.wtf(s6, s5, e7);
            }
        }
    }

    @o0
    @KeepForSdk
    public static WorkSource fromPackage(@o0 Context context, @o0 String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    ProtectedSandApp.s("ಇ").concat(str);
                    return null;
                }
                int i5 = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i5, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                ProtectedSandApp.s("ಈ").concat(str);
            }
        }
        return null;
    }

    @o0
    @KeepForSdk
    public static WorkSource fromPackageAndModuleExperimentalPi(@o0 Context context, @o0 String str, @o0 String str2) {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            return null;
        }
        int i5 = -1;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                ProtectedSandApp.s("ಉ").concat(str);
            } else {
                i5 = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            ProtectedSandApp.s("ಊ").concat(str);
        }
        if (i5 < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = zzg;
        if (method2 == null || (method = zzh) == null) {
            add(workSource, i5, str);
        } else {
            try {
                Object invoke = method2.invoke(workSource, new Object[0]);
                int i6 = zza;
                if (i5 != i6) {
                    method.invoke(invoke, Integer.valueOf(i5), str);
                }
                method.invoke(invoke, Integer.valueOf(i6), str2);
            } catch (Exception unused2) {
            }
        }
        return workSource;
    }

    @KeepForSdk
    public static int get(@o0 WorkSource workSource, int i5) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i5));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e6) {
                Log.wtf(ProtectedSandApp.s("ಋ"), ProtectedSandApp.s("ಌ"), e6);
            }
        }
        return 0;
    }

    @o0
    @KeepForSdk
    public static String getName(@o0 WorkSource workSource, int i5) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i5));
        } catch (Exception e6) {
            Log.wtf(ProtectedSandApp.s("\u0c8d"), ProtectedSandApp.s("ಎ"), e6);
            return null;
        }
    }

    @o0
    @KeepForSdk
    public static List<String> getNames(@o0 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i5 = 0; i5 < size; i5++) {
                String name = getName(workSource, i5);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static boolean hasWorkSourcePermission(@o0 Context context) {
        return (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission(ProtectedSandApp.s("ಏ"), context.getPackageName()) != 0) ? false : true;
    }

    @KeepForSdk
    public static boolean isEmpty(@o0 WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        return size(workSource) == 0;
    }

    @KeepForSdk
    public static int size(@o0 WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e6) {
                Log.wtf(ProtectedSandApp.s("ಐ"), ProtectedSandApp.s("\u0c91"), e6);
            }
        }
        return 0;
    }
}
