package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzha {
    public static int zza(int i4, int i5, String str) {
        String zza;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        String s4 = ProtectedSandApp.s("\ue9b7");
        if (i4 < 0) {
            zza = zzhf.zza(ProtectedSandApp.s("\ue9ba"), s4, Integer.valueOf(i4));
        } else {
            if (i5 < 0) {
                throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(26, ProtectedSandApp.s("\ue9b8"), i5));
            }
            zza = zzhf.zza(ProtectedSandApp.s("\ue9b9"), s4, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zzl(i4, i5, ProtectedSandApp.s("\ue9b7")));
        }
        return i4;
    }

    public static Object zzc(@zc.a Object obj, @zc.a Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void zzf(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(zzhf.zza(str, Character.valueOf(c5)));
        }
    }

    public static void zzg(int i4, int i5, int i6) {
        String zzl;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                zzl = zzl(i4, i6, ProtectedSandApp.s("\ue9bd"));
            } else if (i5 < 0 || i5 > i6) {
                zzl = zzl(i5, i6, ProtectedSandApp.s("\ue9bc"));
            } else {
                zzl = zzhf.zza(ProtectedSandApp.s("\ue9bb"), Integer.valueOf(i5), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(zzl);
        }
    }

    public static void zzh(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z4, @zc.a Object obj) {
        if (!z4) {
            throw new IllegalStateException((String) obj);
        }
    }

    public static void zzj(boolean z4, String str, int i4) {
        if (!z4) {
            throw new IllegalStateException(zzhf.zza(str, Integer.valueOf(i4)));
        }
    }

    public static void zzk(boolean z4, String str, @zc.a Object obj, @zc.a Object obj2, @zc.a Object obj3) {
        if (!z4) {
            throw new IllegalStateException(zzhf.zza(str, obj, obj2, obj3));
        }
    }

    private static String zzl(int i4, int i5, String str) {
        if (i4 < 0) {
            return zzhf.zza(ProtectedSandApp.s("\ue9ba"), str, Integer.valueOf(i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.location.a.a(26, ProtectedSandApp.s("\ue9b8"), i5));
        }
        return zzhf.zza(ProtectedSandApp.s("\ue9be"), str, Integer.valueOf(i4), Integer.valueOf(i5));
    }
}
