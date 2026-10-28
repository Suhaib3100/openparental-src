package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzgf {
    private static final zzgf zza = new zzgd(ProtectedSandApp.s("큼"), ProtectedSandApp.s("큽"), '=');
    private static final zzgf zzb = new zzgd(ProtectedSandApp.s("큾"), ProtectedSandApp.s("큿"), '=');
    private static final zzgf zzc = new zzge(ProtectedSandApp.s("킀"), ProtectedSandApp.s("킁"), '=');
    private static final zzgf zzd = new zzge(ProtectedSandApp.s("킂"), ProtectedSandApp.s("킃"), '=');
    private static final zzgf zze = new zzgc(ProtectedSandApp.s("킄"), ProtectedSandApp.s("킅"));

    zzgf() {
    }

    public static zzgf zzf() {
        return zze;
    }

    abstract void zzb(Appendable appendable, byte[] bArr, int i4, int i5) throws IOException;

    abstract int zzc(int i4);

    public abstract zzgf zzd();

    public final String zzg(byte[] bArr, int i4, int i5) {
        zzbm.zze(0, i5, bArr.length);
        StringBuilder sb = new StringBuilder(zzc(i5));
        try {
            zzb(sb, bArr, 0, i5);
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }
}
