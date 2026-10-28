package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import androidx.annotation.m1;
import androidx.collection.a3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.g0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzhg {

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
    public static class zza {
        private static volatile g0<zzhh> zza;

        private zza() {
        }

        public static g0<zzhh> zza(Context context) {
            g0<zzhh> zza2;
            g0<zzhh> g0Var = zza;
            if (g0Var == null) {
                synchronized (zza.class) {
                    try {
                        g0Var = zza;
                        if (g0Var == null) {
                            new zzhg();
                            if (zzhk.zza(Build.TYPE, Build.TAGS)) {
                                if (zzgs.zza() && !context.isDeviceProtectedStorage()) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                                zza2 = zzhg.zza(context);
                            } else {
                                zza2 = g0.a();
                            }
                            zza = zza2;
                            g0Var = zza2;
                        }
                    } finally {
                    }
                }
            }
            return g0Var;
        }
    }

    private static zzhh zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                a3 a3Var = new a3();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        String.valueOf(file);
                        context.getPackageName();
                        zzgy zzgyVar = new zzgy(a3Var);
                        bufferedReader.close();
                        return zzgyVar;
                    }
                    String[] split = readLine.split(ProtectedSandApp.s("풃"), 3);
                    if (split.length == 3) {
                        String zza2 = zza(split[0]);
                        String decode = Uri.decode(zza(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String zza3 = zza(split[2]);
                            str = Uri.decode(zza3);
                            if (str.length() < 1024 || str == zza3) {
                                hashMap.put(zza3, str);
                            }
                        }
                        a3 a3Var2 = (a3) a3Var.get(zza2);
                        if (a3Var2 == null) {
                            a3Var2 = new a3();
                            a3Var.put(zza2, a3Var2);
                        }
                        a3Var2.put(decode, str);
                    }
                }
            } finally {
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    private static g0<File> zzb(Context context) {
        try {
            File file = new File(context.getDir(ProtectedSandApp.s("풄"), 0), ProtectedSandApp.s("풅"));
            return file.exists() ? g0.f(file) : g0.a();
        } catch (RuntimeException unused) {
            return g0.a();
        }
    }

    @m1
    static g0<zzhh> zza(Context context) {
        g0<zzhh> a5;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            g0<File> zzb = zzb(context);
            if (zzb.e()) {
                a5 = g0.f(zza(context, zzb.d()));
            } else {
                a5 = g0.a();
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return a5;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
