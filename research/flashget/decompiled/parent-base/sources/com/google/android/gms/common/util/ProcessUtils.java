package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import zc.h;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class ProcessUtils {

    @h
    private static String zza;
    private static int zzb;

    @h
    private static Boolean zzc;

    private ProcessUtils() {
    }

    @q0
    @KeepForSdk
    public static String getMyProcessName() {
        BufferedReader bufferedReader;
        String processName;
        if (zza == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                zza = processName;
            } else {
                int i4 = zzb;
                if (i4 == 0) {
                    i4 = Process.myPid();
                    zzb = i4;
                }
                String s4 = ProtectedSandApp.s("찐");
                String s5 = ProtectedSandApp.s("찑");
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i4 > 0) {
                    try {
                        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 14);
                        sb.append(s5);
                        sb.append(i4);
                        sb.append(s4);
                        String sb2 = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(sb2));
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        String readLine = bufferedReader.readLine();
                        Preconditions.checkNotNull(readLine);
                        str = readLine.trim();
                    } catch (IOException unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        IOUtils.closeQuietly(bufferedReader2);
                        throw th;
                    }
                    IOUtils.closeQuietly(bufferedReader);
                }
                zza = str;
            }
        }
        return zza;
    }

    public static boolean zza() {
        boolean isIsolated;
        Boolean bool = zzc;
        if (bool == null) {
            if (PlatformVersion.isAtLeastP()) {
                isIsolated = Process.isIsolated();
                bool = Boolean.valueOf(isIsolated);
            } else {
                try {
                    Object zza2 = zzj.zza(Process.class, ProtectedSandApp.s("찒"), new zzi[0]);
                    Object[] objArr = new Object[0];
                    String s4 = ProtectedSandApp.s("찓");
                    if (zza2 == null) {
                        throw new zzy(zzx.zza(s4, objArr));
                    }
                    bool = (Boolean) zza2;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            zzc = bool;
        }
        return bool.booleanValue();
    }
}
