package com.google.android.gms.internal.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes5.dex */
public final class zzr {
    public static void zza(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static int zzb(int i4, int i5, String str) {
        String zza;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        String s4 = ProtectedSandApp.s("쿣");
        if (i4 < 0) {
            zza = zzx.zza(ProtectedSandApp.s("쿦"), s4, Integer.valueOf(i4));
        } else {
            if (i5 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
                sb.append(ProtectedSandApp.s("쿤"));
                sb.append(i5);
                throw new IllegalArgumentException(sb.toString());
            }
            zza = zzx.zza(ProtectedSandApp.s("쿥"), s4, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzc(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zze(i4, i5, ProtectedSandApp.s("쿣")));
        }
        return i4;
    }

    public static void zzd(int i4, int i5, int i6) {
        String zze;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                zze = zze(i4, i6, ProtectedSandApp.s("쿩"));
            } else if (i5 < 0 || i5 > i6) {
                zze = zze(i5, i6, ProtectedSandApp.s("쿨"));
            } else {
                zze = zzx.zza(ProtectedSandApp.s("쿧"), Integer.valueOf(i5), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(zze);
        }
    }

    private static String zze(int i4, int i5, String str) {
        if (i4 < 0) {
            return zzx.zza(ProtectedSandApp.s("쿦"), str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return zzx.zza(ProtectedSandApp.s("쿪"), str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 15);
        sb.append(ProtectedSandApp.s("쿤"));
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }
}
