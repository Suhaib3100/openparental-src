package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzacx extends zzacf {
    private static final Logger zzb = Logger.getLogger(zzacx.class.getName());
    private static final boolean zzc = zzagd.zzx();
    zzacy zza;

    private zzacx() {
    }

    public static int zzA(int i4) {
        if ((i4 & (-128)) == 0) {
            return 1;
        }
        if ((i4 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i4) == 0) {
            return 3;
        }
        return (i4 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzB(long j4) {
        int i4;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            j4 >>>= 28;
            i4 = 6;
        } else {
            i4 = 2;
        }
        if (((-2097152) & j4) != 0) {
            i4 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? i4 + 1 : i4;
    }

    public static zzacx zzC(byte[] bArr) {
        return new zzacu(bArr, 0, bArr.length);
    }

    public static int zzt(zzacp zzacpVar) {
        int zzd = zzacpVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    static int zzu(int i4, zzaer zzaerVar, zzafc zzafcVar) {
        int zzA = zzA(i4 << 3);
        int i5 = zzA + zzA;
        zzacc zzaccVar = (zzacc) zzaerVar;
        int zzr = zzaccVar.zzr();
        if (zzr == -1) {
            zzr = zzafcVar.zza(zzaccVar);
            zzaccVar.zzu(zzr);
        }
        return i5 + zzr;
    }

    public static int zzv(int i4) {
        if (i4 >= 0) {
            return zzA(i4);
        }
        return 10;
    }

    public static int zzw(zzadx zzadxVar) {
        int zza = zzadxVar.zza();
        return zzA(zza) + zza;
    }

    static int zzx(zzaer zzaerVar, zzafc zzafcVar) {
        zzacc zzaccVar = (zzacc) zzaerVar;
        int zzr = zzaccVar.zzr();
        if (zzr == -1) {
            zzr = zzafcVar.zza(zzaccVar);
            zzaccVar.zzu(zzr);
        }
        return zzA(zzr) + zzr;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzagh.zzc(str);
        } catch (zzagg unused) {
            length = str.getBytes(zzads.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i4) {
        return zzA(i4 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException(ProtectedSandApp.s("\ue744"));
        }
    }

    final void zzE(String str, zzagg zzaggVar) throws IOException {
        zzb.logp(Level.WARNING, ProtectedSandApp.s("\ue747"), ProtectedSandApp.s("\ue745"), ProtectedSandApp.s("\ue746"), (Throwable) zzaggVar);
        byte[] bytes = str.getBytes(zzads.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (zzacv e4) {
            throw e4;
        } catch (IndexOutOfBoundsException e5) {
            throw new zzacv(e5);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b5) throws IOException;

    public abstract void zzd(int i4, boolean z4) throws IOException;

    public abstract void zze(int i4, zzacp zzacpVar) throws IOException;

    public abstract void zzf(int i4, int i5) throws IOException;

    public abstract void zzg(int i4) throws IOException;

    public abstract void zzh(int i4, long j4) throws IOException;

    public abstract void zzi(long j4) throws IOException;

    public abstract void zzj(int i4, int i5) throws IOException;

    public abstract void zzk(int i4) throws IOException;

    public abstract void zzl(byte[] bArr, int i4, int i5) throws IOException;

    public abstract void zzm(int i4, String str) throws IOException;

    public abstract void zzo(int i4, int i5) throws IOException;

    public abstract void zzp(int i4, int i5) throws IOException;

    public abstract void zzq(int i4) throws IOException;

    public abstract void zzr(int i4, long j4) throws IOException;

    public abstract void zzs(long j4) throws IOException;

    /* synthetic */ zzacx(zzacw zzacwVar) {
    }
}
