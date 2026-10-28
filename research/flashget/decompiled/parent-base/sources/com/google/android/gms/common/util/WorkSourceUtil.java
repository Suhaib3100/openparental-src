package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.core.content.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
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

    @b0("WorkSourceUtil.class")
    private static Boolean zzj;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.String r1 = "찙"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            int r3 = android.os.Process.myUid()
            com.google.android.gms.common.util.WorkSourceUtil.zza = r3
            r3 = 0
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L1c
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L1c
            java.lang.reflect.Method r4 = r2.getMethod(r1, r4)     // Catch: java.lang.Exception -> L1c
            goto L1d
        L1c:
            r4 = r3
        L1d:
            com.google.android.gms.common.util.WorkSourceUtil.zzb = r4
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L2a
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r0}     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            com.google.android.gms.common.util.WorkSourceUtil.zzc = r1
            java.lang.String r1 = "찚"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Exception -> L38
            java.lang.reflect.Method r1 = r2.getMethod(r1, r3)     // Catch: java.lang.Exception -> L38
            goto L39
        L38:
            r1 = r3
        L39:
            com.google.android.gms.common.util.WorkSourceUtil.zzd = r1
            java.lang.String r1 = "찛"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Exception -> L4c
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4c
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L4c
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4c:
            r1 = r3
        L4d:
            com.google.android.gms.common.util.WorkSourceUtil.zze = r1
            java.lang.String r1 = "찜"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Exception -> L60
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L60
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L60
            java.lang.reflect.Method r1 = r2.getMethod(r1, r4)     // Catch: java.lang.Exception -> L60
            goto L61
        L60:
            r1 = r3
        L61:
            com.google.android.gms.common.util.WorkSourceUtil.zzf = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto L74
            java.lang.String r1 = "찝"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Exception -> L74
            java.lang.reflect.Method r1 = r2.getMethod(r1, r3)     // Catch: java.lang.Exception -> L74
            goto L75
        L74:
            r1 = r3
        L75:
            com.google.android.gms.common.util.WorkSourceUtil.zzg = r1
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r1 == 0) goto L98
            java.lang.String r1 = "찞"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Exception -> L98
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L98
            java.lang.String r4 = "찟"
            java.lang.String r4 = com.flashget.parentalcontrol.ProtectedSandApp.s(r4)     // Catch: java.lang.Exception -> L98
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L98
            java.lang.Class[] r0 = new java.lang.Class[]{r5, r0}     // Catch: java.lang.Exception -> L98
            java.lang.reflect.Method r0 = r1.getMethod(r4, r0)     // Catch: java.lang.Exception -> L98
            goto L99
        L98:
            r0 = r3
        L99:
            com.google.android.gms.common.util.WorkSourceUtil.zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto Lb0
            java.lang.String r0 = "찠"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.reflect.Method r0 = r2.getMethod(r0, r3)     // Catch: java.lang.Exception -> Lb0
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lb1
            goto Lb1
        Lb0:
            r0 = r3
        Lb1:
            com.google.android.gms.common.util.WorkSourceUtil.zzi = r0
            com.google.android.gms.common.util.WorkSourceUtil.zzj = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    @KeepForSdk
    public static void add(@o0 WorkSource workSource, int i4, @o0 String str) {
        Method method = zzc;
        String s4 = ProtectedSandApp.s("찡");
        String s5 = ProtectedSandApp.s("찢");
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i4), str);
                return;
            } catch (Exception e4) {
                Log.wtf(s5, s4, e4);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i4));
            } catch (Exception e5) {
                Log.wtf(s5, s4, e5);
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
                    ProtectedSandApp.s("찣").concat(str);
                    return null;
                }
                int i4 = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i4, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                ProtectedSandApp.s("찤").concat(str);
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
        int i4 = -1;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                ProtectedSandApp.s("찣").concat(str);
            } else {
                i4 = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            ProtectedSandApp.s("찤").concat(str);
        }
        if (i4 < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = zzg;
        if (method2 == null || (method = zzh) == null) {
            add(workSource, i4, str);
        } else {
            try {
                Object invoke = method2.invoke(workSource, null);
                int i5 = zza;
                if (i4 != i5) {
                    method.invoke(invoke, Integer.valueOf(i4), str);
                }
                method.invoke(invoke, Integer.valueOf(i5), str2);
            } catch (Exception unused2) {
            }
        }
        return workSource;
    }

    @KeepForSdk
    public static int get(@o0 WorkSource workSource, int i4) {
        Method method = zze;
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, Integer.valueOf(i4));
            Preconditions.checkNotNull(invoke);
            return ((Integer) invoke).intValue();
        } catch (Exception e4) {
            Log.wtf(ProtectedSandApp.s("찢"), ProtectedSandApp.s("찡"), e4);
            return 0;
        }
    }

    @o0
    @KeepForSdk
    public static String getName(@o0 WorkSource workSource, int i4) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i4));
        } catch (Exception e4) {
            Log.wtf(ProtectedSandApp.s("찢"), ProtectedSandApp.s("찡"), e4);
            return null;
        }
    }

    @o0
    @KeepForSdk
    public static List<String> getNames(@o0 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int size = workSource == null ? 0 : size(workSource);
        if (size != 0) {
            for (int i4 = 0; i4 < size; i4++) {
                String name = getName(workSource, i4);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    @KeepForSdk
    public static synchronized boolean hasWorkSourcePermission(@o0 Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z4 = d.checkSelfPermission(context, ProtectedSandApp.s("찥")) == 0;
            zzj = Boolean.valueOf(z4);
            return z4;
        }
    }

    @KeepForSdk
    public static boolean isEmpty(@o0 WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
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
        if (method == null) {
            return 0;
        }
        try {
            Object invoke = method.invoke(workSource, null);
            Preconditions.checkNotNull(invoke);
            return ((Integer) invoke).intValue();
        } catch (Exception e4) {
            Log.wtf(ProtectedSandApp.s("찢"), ProtectedSandApp.s("찡"), e4);
            return 0;
        }
    }
}
