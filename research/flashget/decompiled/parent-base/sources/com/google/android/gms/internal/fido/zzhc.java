package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhc {
    static final Charset zza = Charset.forName(ProtectedSandApp.s("타"));
    static final Charset zzb = Charset.forName(ProtectedSandApp.s("탁"));
    static final Charset zzc = Charset.forName(ProtectedSandApp.s("탂"));
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzhb zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i4 = zzhb.zza;
        zzgz zzgzVar = new zzgz(bArr, 0, 0, false, null);
        try {
            zzgzVar.zza(0);
            zzf = zzgzVar;
        } catch (zzhd e4) {
            throw new IllegalArgumentException(e4);
        }
    }
}
