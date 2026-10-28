package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzev {

    @q0
    @b0("CrashReporter.class")
    private static DropBoxManager zza;

    @b0("CrashReporter.class")
    private static final LinkedHashMap zzb = new zzeu(16, 0.75f, true);

    @q0
    @b0("CrashReporter.class")
    private static String zzc;

    public static synchronized void zza(Context context, boolean z4) {
        synchronized (zzev.class) {
            if (zza == null) {
                zza = (DropBoxManager) context.getApplicationContext().getSystemService(ProtectedSandApp.s("\ue95b"));
                zzc = ProtectedSandApp.s("\ue95c");
            }
        }
    }

    public static synchronized void zzb(Throwable th) {
        synchronized (zzev.class) {
            long id2 = Thread.currentThread().getId();
            int hashCode = th.hashCode();
            Integer num = (Integer) zzb.get(Long.valueOf(id2));
            if (num == null || num.intValue() != hashCode) {
                DropBoxManager dropBoxManager = zza;
                if (dropBoxManager == null || !dropBoxManager.isTagEnabled(ProtectedSandApp.s("\ue95d"))) {
                    return;
                }
                DropBoxManager dropBoxManager2 = zza;
                StringBuilder sb = new StringBuilder();
                String str = zzc;
                List zzc2 = zzhe.zzb('.').zzc(ProtectedSandApp.s("\ue95e"));
                long j4 = -1;
                if (zzc2.size() == 3) {
                    long j5 = 0;
                    for (int i4 = 0; i4 < zzc2.size(); i4++) {
                        try {
                            j5 = (j5 * 100) + Integer.parseInt((String) zzc2.get(i4));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    j4 = j5;
                }
                sb.append(String.format(ProtectedSandApp.s("\ue95f"), str, Long.valueOf(j4), ProtectedSandApp.s("\ue95e")));
                sb.append(String.format(ProtectedSandApp.s("\ue960"), Build.FINGERPRINT));
                sb.append(ProtectedSandApp.s("\ue961"));
                sb.append(Log.getStackTraceString(th));
                dropBoxManager2.addText(ProtectedSandApp.s("\ue95d"), sb.toString());
                zzb.put(Long.valueOf(id2), Integer.valueOf(hashCode));
            }
        }
    }
}
