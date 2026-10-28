package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public final class zzbl {
    public static int zza(int i4, int i5, String str) {
        String zzb;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        String s4 = ProtectedSandApp.s("횏");
        if (i4 < 0) {
            zzb = zzbo.zzb(ProtectedSandApp.s("횒"), s4, Integer.valueOf(i4));
        } else {
            if (i5 < 0) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("횐"), i5));
            }
            zzb = zzbo.zzb(ProtectedSandApp.s("횑"), s4, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zzf(i4, i5, ProtectedSandApp.s("횏")));
        }
        return i4;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(int i4, int i5, int i6) {
        String zzf;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                zzf = zzf(i4, i6, ProtectedSandApp.s("횕"));
            } else if (i5 < 0 || i5 > i6) {
                zzf = zzf(i5, i6, ProtectedSandApp.s("횔"));
            } else {
                zzf = zzbo.zzb(ProtectedSandApp.s("횓"), Integer.valueOf(i5), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(zzf);
        }
    }

    public static void zze(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i4, int i5, String str) {
        if (i4 < 0) {
            return zzbo.zzb(ProtectedSandApp.s("횒"), str, Integer.valueOf(i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("횐"), i5));
        }
        return zzbo.zzb(ProtectedSandApp.s("횖"), str, Integer.valueOf(i4), Integer.valueOf(i5));
    }
}
