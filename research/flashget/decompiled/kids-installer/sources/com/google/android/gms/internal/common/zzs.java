package com.google.android.gms.internal.common;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import org.jspecify.nullness.NullMarked;
import x1.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* loaded from: classes2.dex */
public final class zzs {
    @a
    public static int zza(int i5, int i6, String str) {
        String zza;
        if (i5 >= 0 && i5 < i6) {
            return i5;
        }
        String s5 = ProtectedSandApp.s("೪");
        if (i5 < 0) {
            zza = zzy.zza(ProtectedSandApp.s("೭"), s5, Integer.valueOf(i5));
        } else {
            if (i6 < 0) {
                throw new IllegalArgumentException(s.a(ProtectedSandApp.s("೫"), i6));
            }
            zza = zzy.zza(ProtectedSandApp.s("೬"), s5, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    @a
    public static int zzb(int i5, int i6, String str) {
        if (i5 < 0 || i5 > i6) {
            throw new IndexOutOfBoundsException(zzd(i5, i6, ProtectedSandApp.s("೮")));
        }
        return i5;
    }

    public static void zzc(int i5, int i6, int i7) {
        if (i5 < 0 || i6 < i5 || i6 > i7) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i7) ? zzd(i5, i7, ProtectedSandApp.s("ೱ")) : (i6 < 0 || i6 > i7) ? zzd(i6, i7, ProtectedSandApp.s("\u0cf0")) : zzy.zza(ProtectedSandApp.s("೯"), Integer.valueOf(i6), Integer.valueOf(i5)));
        }
    }

    private static String zzd(int i5, int i6, String str) {
        if (i5 < 0) {
            return zzy.zza(ProtectedSandApp.s("ೲ"), str, Integer.valueOf(i5));
        }
        if (i6 >= 0) {
            return zzy.zza(ProtectedSandApp.s("ೳ"), str, Integer.valueOf(i5), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(s.a(ProtectedSandApp.s("\u0cf4"), i6));
    }
}
