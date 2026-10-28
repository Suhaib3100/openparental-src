package com.google.android.gms.internal.fido;

import android.support.v4.media.a;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzbm {
    public static int zza(int i4, int i5, String str) {
        String zza;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        String s4 = ProtectedSandApp.s("퀄");
        if (i4 < 0) {
            zza = zzbo.zza(ProtectedSandApp.s("퀇"), s4, Integer.valueOf(i4));
        } else {
            if (i5 < 0) {
                throw new IllegalArgumentException(a.a(ProtectedSandApp.s("퀅"), i5));
            }
            zza = zzbo.zza(ProtectedSandApp.s("퀆"), s4, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zzg(i4, i5, ProtectedSandApp.s("퀄")));
        }
        return i4;
    }

    public static void zzc(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(zzbo.zza(str, Character.valueOf(c5)));
        }
    }

    public static void zze(int i4, int i5, int i6) {
        String zzg;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                zzg = zzg(i4, i6, ProtectedSandApp.s("퀊"));
            } else if (i5 < 0 || i5 > i6) {
                zzg = zzg(i5, i6, ProtectedSandApp.s("퀉"));
            } else {
                zzg = zzbo.zza(ProtectedSandApp.s("퀈"), Integer.valueOf(i5), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(zzg);
        }
    }

    public static void zzf(boolean z4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzg(int i4, int i5, String str) {
        if (i4 < 0) {
            return zzbo.zza(ProtectedSandApp.s("퀇"), str, Integer.valueOf(i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(a.a(ProtectedSandApp.s("퀅"), i5));
        }
        return zzbo.zza(ProtectedSandApp.s("퀋"), str, Integer.valueOf(i4), Integer.valueOf(i5));
    }
}
