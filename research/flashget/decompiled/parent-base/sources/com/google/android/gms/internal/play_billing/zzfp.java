package com.google.android.gms.internal.play_billing;

import androidx.collection.r2;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
public abstract class zzfp implements Iterable, Serializable {
    public static final zzfp zza = new zzfn(zzgv.zza);
    private int zzb = 0;

    static {
        int i4 = zzfc.zza;
    }

    zzfp() {
    }

    static int zzj(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r2.a(ProtectedSandApp.s("힕"), i4, ProtectedSandApp.s("힖")));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("힑"), i4, ProtectedSandApp.s("힒"), i5));
        }
        throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("힓"), i5, ProtectedSandApp.s("힔"), i6));
    }

    public static zzfp zzk(byte[] bArr, int i4, int i5) {
        try {
            zzj(i4, i4 + i5, bArr.length);
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            return new zzfn(bArr2);
        } catch (zzhb e4) {
            throw new AssertionError(ProtectedSandApp.s("힗"), e4);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = i4 + i6;
        zzj(i4, i7, bArr.length);
        zzj(i5, i6 + i5, bArr2.length);
        while (i4 < i7) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfp)) {
            return false;
        }
        zzfp zzfpVar = (zzfp) obj;
        int zzd = zzd();
        if (zzd != zzfpVar.zzd()) {
            return false;
        }
        if (zzd == 0) {
            return true;
        }
        int i4 = this.zzb;
        int i5 = zzfpVar.zzb;
        if (i4 == 0 || i5 == 0 || i4 == i5) {
            return zzh(zzfpVar);
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.zzb;
        if (i4 == 0) {
            int zzd = zzd();
            i4 = zzc(zzd, 0, zzd);
            if (i4 == 0) {
                i4 = 1;
            }
            this.zzb = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfh(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, ProtectedSandApp.s("힙"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzio.zza(zzm()) : zzio.zza(zze(0, 47).zzm()).concat(ProtectedSandApp.s("힘")));
    }

    abstract byte zza(int i4);

    protected abstract int zzc(int i4, int i5, int i6);

    public abstract int zzd();

    public abstract zzfp zze(int i4, int i5);

    protected abstract void zzf(byte[] bArr, int i4, int i5, int i6);

    abstract void zzg(zzfg zzfgVar) throws IOException;

    protected abstract boolean zzh(zzfp zzfpVar);

    public final byte[] zzm() {
        int zzd = zzd();
        if (zzd == 0) {
            return zzgv.zza;
        }
        byte[] bArr = new byte[zzd];
        zzf(bArr, 0, 0, zzd);
        return bArr;
    }
}
