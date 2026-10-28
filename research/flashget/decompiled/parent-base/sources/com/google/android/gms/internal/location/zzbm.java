package com.google.android.gms.internal.location;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public final class zzbm {
    public static int zza(int i4, int i5, @NullableDecl String str) {
        String zza;
        if (i4 >= 0 && i4 < i5) {
            return i4;
        }
        String s4 = ProtectedSandApp.s("텭");
        if (i4 < 0) {
            zza = zzbn.zza(ProtectedSandApp.s("텰"), s4, Integer.valueOf(i4));
        } else {
            if (i5 < 0) {
                throw new IllegalArgumentException(a.a(26, ProtectedSandApp.s("텮"), i5));
            }
            zza = zzbn.zza(ProtectedSandApp.s("텯"), s4, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i4, int i5, @NullableDecl String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(zzd(i4, i5, ProtectedSandApp.s("텭")));
        }
        return i4;
    }

    public static void zzc(int i4, int i5, int i6) {
        String zzd;
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            if (i4 < 0 || i4 > i6) {
                zzd = zzd(i4, i6, ProtectedSandApp.s("텳"));
            } else if (i5 < 0 || i5 > i6) {
                zzd = zzd(i5, i6, ProtectedSandApp.s("텲"));
            } else {
                zzd = zzbn.zza(ProtectedSandApp.s("텱"), Integer.valueOf(i5), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(zzd);
        }
    }

    private static String zzd(int i4, int i5, @NullableDecl String str) {
        if (i4 < 0) {
            return zzbn.zza(ProtectedSandApp.s("텰"), str, Integer.valueOf(i4));
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(a.a(26, ProtectedSandApp.s("텮"), i5));
        }
        return zzbn.zza(ProtectedSandApp.s("텴"), str, Integer.valueOf(i4), Integer.valueOf(i5));
    }
}
