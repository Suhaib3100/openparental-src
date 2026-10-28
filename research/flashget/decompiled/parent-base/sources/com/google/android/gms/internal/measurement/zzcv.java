package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
@TargetApi(24)
/* loaded from: classes5.dex */
public final class zzcv {

    @q0
    private static final Method zza = zzc();

    @q0
    private static final Method zzb = zzb();
    private final JobScheduler zzc;

    private zzcv(JobScheduler jobScheduler) {
        this.zzc = jobScheduler;
    }

    private static int zza() {
        Method method = zzb;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(UserHandle.class, null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException unused) {
                Log.isLoggable(ProtectedSandApp.s("틤"), 6);
            }
        }
        return 0;
    }

    @q0
    private static Method zzb() {
        try {
            return UserHandle.class.getDeclaredMethod(ProtectedSandApp.s("틧"), null);
        } catch (NoSuchMethodException unused) {
            Log.isLoggable(ProtectedSandApp.s("틤"), 6);
            return null;
        }
    }

    @q0
    private static Method zzc() {
        try {
            return JobScheduler.class.getDeclaredMethod(ProtectedSandApp.s("틨"), JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            Log.isLoggable(ProtectedSandApp.s("틤"), 6);
            return null;
        }
    }

    private final int zza(JobInfo jobInfo, String str, int i4, String str2) {
        Method method = zza;
        if (method != null) {
            try {
                Integer num = (Integer) method.invoke(this.zzc, jobInfo, str, Integer.valueOf(i4), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.zzc.schedule(jobInfo);
    }

    public static int zza(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(ProtectedSandApp.s("틥"));
        jobScheduler.getClass();
        if (zza != null && context.checkSelfPermission(ProtectedSandApp.s("틦")) == 0) {
            return new zzcv(jobScheduler).zza(jobInfo, str, zza(), str2);
        }
        return jobScheduler.schedule(jobInfo);
    }
}
