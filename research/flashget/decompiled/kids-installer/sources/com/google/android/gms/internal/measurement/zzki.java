package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public abstract class zzki extends zzjq {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzki.class.getName());
    private static final boolean zzd = zznu.zzx();
    zzkj zza;

    private zzki() {
    }

    @Deprecated
    static int zzt(int i5, zzmi zzmiVar, zzmt zzmtVar) {
        int zzbu = ((zzjk) zzmiVar).zzbu(zzmtVar);
        int zzx = zzx(i5 << 3);
        return zzx + zzx + zzbu;
    }

    public static int zzu(int i5) {
        if (i5 >= 0) {
            return zzx(i5);
        }
        return 10;
    }

    static int zzv(zzmi zzmiVar, zzmt zzmtVar) {
        int zzbu = ((zzjk) zzmiVar).zzbu(zzmtVar);
        return zzx(zzbu) + zzbu;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zznz.zzc(str);
        } catch (zzny unused) {
            length = str.getBytes(zzlj.zzb).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i5) {
        if ((i5 & (-128)) == 0) {
            return 1;
        }
        if ((i5 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i5) == 0) {
            return 3;
        }
        return (i5 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j5) {
        int i5;
        if (((-128) & j5) == 0) {
            return 1;
        }
        if (j5 < 0) {
            return 10;
        }
        if (((-34359738368L) & j5) != 0) {
            j5 >>>= 28;
            i5 = 6;
        } else {
            i5 = 2;
        }
        if (((-2097152) & j5) != 0) {
            j5 >>>= 14;
            i5 += 2;
        }
        return (j5 & (-16384)) != 0 ? i5 + 1 : i5;
    }

    public static zzki zzz(byte[] bArr, int i5, int i6) {
        return new zzkf(bArr, 0, i6);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException(ProtectedSandApp.s("⍿"));
        }
    }

    final void zzB(String str, zzny zznyVar) throws IOException {
        zzc.logp(Level.WARNING, ProtectedSandApp.s("⎀"), ProtectedSandApp.s("⎁"), ProtectedSandApp.s("⎂"), (Throwable) zznyVar);
        byte[] bytes = str.getBytes(zzlj.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzkg(e6);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b6) throws IOException;

    public abstract void zzd(int i5, boolean z5) throws IOException;

    public abstract void zze(int i5, zzka zzkaVar) throws IOException;

    public abstract void zzf(int i5, int i6) throws IOException;

    public abstract void zzg(int i5) throws IOException;

    public abstract void zzh(int i5, long j5) throws IOException;

    public abstract void zzi(long j5) throws IOException;

    public abstract void zzj(int i5, int i6) throws IOException;

    public abstract void zzk(int i5) throws IOException;

    public abstract void zzl(byte[] bArr, int i5, int i6) throws IOException;

    public abstract void zzm(int i5, String str) throws IOException;

    public abstract void zzo(int i5, int i6) throws IOException;

    public abstract void zzp(int i5, int i6) throws IOException;

    public abstract void zzq(int i5) throws IOException;

    public abstract void zzr(int i5, long j5) throws IOException;

    public abstract void zzs(long j5) throws IOException;

    /* synthetic */ zzki(zzkh zzkhVar) {
    }
}
