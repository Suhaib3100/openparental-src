package com.google.android.gms.internal.fido;

import androidx.collection.r2;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzgx implements Iterable<Byte>, Serializable {
    private static final Comparator zza;
    public static final zzgx zzb = new zzgu(zzhc.zzd);
    private static final zzgw zzd;
    private int zzc = 0;

    static {
        int i4 = zzgn.zza;
        zzd = new zzgw(null);
        zza = new zzgp();
    }

    zzgx() {
    }

    static int zzj(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r2.a(ProtectedSandApp.s("킗"), i4, ProtectedSandApp.s("킘")));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("킓"), i4, ProtectedSandApp.s("킔"), i5));
        }
        throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("킕"), i5, ProtectedSandApp.s("킖"), i6));
    }

    public static zzgx zzl(byte[] bArr, int i4, int i5) {
        zzj(0, i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        return new zzgu(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.zzc;
        if (i4 == 0) {
            int zzd2 = zzd();
            i4 = zzf(zzd2, 0, zzd2);
            if (i4 == 0) {
                i4 = 1;
            }
            this.zzc = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgo(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, ProtectedSandApp.s("킚"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzhe.zza(this) : zzhe.zza(zzg(0, 47)).concat(ProtectedSandApp.s("킙")));
    }

    public abstract byte zza(int i4);

    abstract byte zzb(int i4);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i4, int i5, int i6);

    protected abstract int zzf(int i4, int i5, int i6);

    public abstract zzgx zzg(int i4, int i5);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzhc.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
