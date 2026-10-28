package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzfa {
    static final Charset zza = Charset.forName(ProtectedSandApp.s("콄"));
    static final Charset zzb = Charset.forName(ProtectedSandApp.s("콅"));
    static final Charset zzc = Charset.forName(ProtectedSandApp.s("콆"));
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzej zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i4 = zzej.zza;
        zzeh zzehVar = new zzeh(bArr, 0, 0, false, null);
        try {
            zzehVar.zza(0);
            zzf = zzehVar;
        } catch (zzfb e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    static int zzb(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(ProtectedSandApp.s("콇"));
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
