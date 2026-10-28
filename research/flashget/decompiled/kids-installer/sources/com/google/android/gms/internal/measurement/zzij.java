package com.google.android.gms.internal.measurement;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzij {
    public static int zza(int i5, int i6, String str) {
        String zza;
        if (i5 >= 0 && i5 < i6) {
            return i5;
        }
        String s5 = ProtectedSandApp.s("ත");
        if (i5 < 0) {
            zza = zzil.zza(ProtectedSandApp.s("ධ"), s5, Integer.valueOf(i5));
        } else {
            if (i6 < 0) {
                throw new IllegalArgumentException(s.a(ProtectedSandApp.s("ථ"), i6));
            }
            zza = zzil.zza(ProtectedSandApp.s("ද"), s5, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i5, int i6, String str) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(zzd(i5, i6, ProtectedSandApp.s("න")));
        }
        return i5;
    }

    public static void zzc(int i5, int i6, int i7) {
        if (i5 < 0 || i6 < i5 || i6 > i7) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i7) ? zzd(i5, i7, ProtectedSandApp.s("ප")) : (i6 < 0 || i6 > i7) ? zzd(i6, i7, ProtectedSandApp.s("ඳ")) : zzil.zza(ProtectedSandApp.s("\u0db2"), Integer.valueOf(i6), Integer.valueOf(i5)));
        }
    }

    private static String zzd(int i5, int i6, String str) {
        if (i5 < 0) {
            return zzil.zza(ProtectedSandApp.s("ඵ"), str, Integer.valueOf(i5));
        }
        if (i6 >= 0) {
            return zzil.zza(ProtectedSandApp.s("බ"), str, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("භ"), i6));
    }
}
