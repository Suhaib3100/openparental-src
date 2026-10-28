package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzjv {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName(ProtectedSandApp.s("프"));
        zza = Charset.forName(ProtectedSandApp.s("픅"));
        Charset.forName(ProtectedSandApp.s("픆"));
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zziw.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static int zza(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    static int zza(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    static <T> T zza(T t4) {
        t4.getClass();
        return t4;
    }

    static <T> T zza(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    static boolean zza(zzlc zzlcVar) {
        boolean z4 = zzlcVar instanceof zzic;
        return false;
    }
}
