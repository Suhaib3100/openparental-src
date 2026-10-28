package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzlj {
    static final Charset zza = Charset.forName(ProtectedSandApp.s("ฎ"));
    static final Charset zzb = Charset.forName(ProtectedSandApp.s("ฏ"));
    static final Charset zzc = Charset.forName(ProtectedSandApp.s("ฐ"));
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzke zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i5 = zzke.zza;
        zzkc zzkcVar = new zzkc(bArr, 0, 0, false, null);
        try {
            zzkcVar.zza(0);
            zzf = zzkcVar;
        } catch (zzll e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static int zza(boolean z5) {
        return z5 ? 1231 : 1237;
    }

    static int zzb(int i5, byte[] bArr, int i6, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            i5 = (i5 * 31) + bArr[i8];
        }
        return i5;
    }

    static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
