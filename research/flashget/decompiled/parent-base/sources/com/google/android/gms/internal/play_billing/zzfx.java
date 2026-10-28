package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzfx extends zzfg {
    Object zza;

    private zzfx() {
        throw null;
    }

    public static int zzx(zzhr zzhrVar) {
        int zzn = zzhrVar.zzn();
        return zzy(zzn) + zzn;
    }

    public static int zzy(int i4) {
        return (352 - (Integer.numberOfLeadingZeros(i4) * 9)) >>> 6;
    }

    public static int zzz(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public final void zzA() {
        if (zza() > 0) {
            throw new IllegalStateException(ProtectedSandApp.s("힡"));
        }
        if (zza() < 0) {
            throw new IllegalStateException(ProtectedSandApp.s("힠"));
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b5) throws IOException;

    public abstract void zzd(int i4, boolean z4) throws IOException;

    abstract void zze(byte[] bArr, int i4, int i5) throws IOException;

    public abstract void zzf(int i4, zzfp zzfpVar) throws IOException;

    public abstract void zzg(zzfp zzfpVar) throws IOException;

    public abstract void zzh(int i4, int i5) throws IOException;

    public abstract void zzi(int i4) throws IOException;

    public abstract void zzj(int i4, long j4) throws IOException;

    public abstract void zzk(long j4) throws IOException;

    public abstract void zzl(int i4, int i5) throws IOException;

    public abstract void zzm(int i4) throws IOException;

    public abstract void zzn(zzhr zzhrVar) throws IOException;

    public abstract void zzo(int i4, zzhr zzhrVar) throws IOException;

    public abstract void zzp(int i4, zzfp zzfpVar) throws IOException;

    public abstract void zzq(int i4, String str) throws IOException;

    public abstract void zzr(String str) throws IOException;

    public abstract void zzs(int i4, int i5) throws IOException;

    public abstract void zzt(int i4, int i5) throws IOException;

    public abstract void zzu(int i4) throws IOException;

    public abstract void zzv(int i4, long j4) throws IOException;

    public abstract void zzw(long j4) throws IOException;

    /* synthetic */ zzfx(zzfw zzfwVar) {
    }
}
