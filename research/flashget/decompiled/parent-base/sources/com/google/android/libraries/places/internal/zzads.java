package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzads {
    static final Charset zza = Charset.forName(ProtectedSandApp.s("\ue78a"));
    static final Charset zzb = Charset.forName(ProtectedSandApp.s("\ue78b"));
    static final Charset zzc = Charset.forName(ProtectedSandApp.s("\ue78c"));
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzact zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i4 = zzact.zza;
        zzacr zzacrVar = new zzacr(bArr, 0, 0, false, null);
        try {
            zzacrVar.zza(0);
            zzf = zzacrVar;
        } catch (zzadu e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    static int zzd(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    static Object zze(Object obj) {
        obj.getClass();
        return obj;
    }

    static Object zzf(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static Object zzg(Object obj, Object obj2) {
        return ((zzaer) obj).zzD().zzq((zzaer) obj2).zzv();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zzb);
    }

    public static boolean zzi(byte[] bArr) {
        return zzagh.zzd(bArr);
    }
}
