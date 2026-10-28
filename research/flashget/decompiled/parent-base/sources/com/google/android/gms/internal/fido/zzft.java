package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzft {
    private static final char[] zza = ProtectedSandApp.s("큮").toCharArray();
    public static final /* synthetic */ int zzb = 0;

    zzft() {
    }

    public final boolean equals(@a Object obj) {
        if (obj instanceof zzft) {
            zzft zzftVar = (zzft) obj;
            if (zzb() == zzftVar.zzb() && zzc(zzftVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i4 = zze[0] & 255;
        for (int i5 = 1; i5 < zze.length; i5++) {
            i4 |= (zze[i5] & 255) << (i5 * 8);
        }
        return i4;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b5 : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b5 >> 4) & 15]);
            sb.append(cArr[b5 & c.f54871q]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    abstract boolean zzc(zzft zzftVar);

    public abstract byte[] zzd();

    byte[] zze() {
        throw null;
    }
}
