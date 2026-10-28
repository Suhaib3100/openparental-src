package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class zzbt {

    @q0
    private static final Method zza;

    @q0
    private static final Method zzb;

    static {
        Method method;
        String s5 = ProtectedSandApp.s("൲");
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod(ProtectedSandApp.s("൳"), JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            Log.isLoggable(s5, 6);
            method = null;
        }
        zza = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod(ProtectedSandApp.s("൴"), new Class[0]);
        } catch (NoSuchMethodException unused2) {
            Log.isLoggable(s5, 6);
        }
        zzb = method2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "൵"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r8 == 0) goto L75
            java.lang.String r8 = "൶"
            java.lang.String r8 = com.flashget.kidsdownloader.ProtectedSandApp.s(r8)
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L20
            goto L75
        L20:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.zzbt.zzb
            r8 = 0
            if (r5 == 0) goto L40
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L36
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L40
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L36
            goto L41
        L36:
            java.lang.String r5 = "൷"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r0 = 6
            android.util.Log.isLoggable(r5, r0)
        L40:
            r5 = r8
        L41:
            java.lang.String r0 = "൸"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            java.lang.String r1 = "൹"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r2 == 0) goto L70
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L70
            r3[r8] = r6     // Catch: java.lang.Throwable -> L70
            r4 = 1
            r3[r4] = r1     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L70
            r1 = 2
            r3[r1] = r5     // Catch: java.lang.Throwable -> L70
            r5 = 3
            r3[r5] = r0     // Catch: java.lang.Throwable -> L70
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L70
            if (r5 == 0) goto L74
            int r8 = r5.intValue()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            int r8 = r7.schedule(r6)
        L74:
            return r8
        L75:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
