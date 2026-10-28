package com.google.android.gms.internal.auth;

import androidx.collection.r2;
import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public abstract class zzef implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzef zzb = new zzec(zzfa.zzd);
    private static final zzee zzd;
    private int zzc = 0;

    static {
        int i4 = zzds.zza;
        zzd = new zzee(null);
        zza = new zzdx();
    }

    zzef() {
    }

    static int zzi(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(r2.a(ProtectedSandApp.s("켥"), i4, ProtectedSandApp.s("켦")));
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("켡"), i4, ProtectedSandApp.s("켢"), i5));
        }
        throw new IndexOutOfBoundsException(q.a(ProtectedSandApp.s("켣"), i5, ProtectedSandApp.s("켤"), i6));
    }

    public static zzef zzk(byte[] bArr, int i4, int i5) {
        zzi(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new zzec(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i4 = this.zzc;
        if (i4 == 0) {
            int zzd2 = zzd();
            i4 = zze(zzd2, 0, zzd2);
            if (i4 == 0) {
                i4 = 1;
            }
            this.zzc = i4;
        }
        return i4;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdw(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, ProtectedSandApp.s("켨"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzgx.zza(this) : zzgx.zza(zzf(0, 47)).concat(ProtectedSandApp.s("켧")));
    }

    public abstract byte zza(int i4);

    abstract byte zzb(int i4);

    public abstract int zzd();

    protected abstract int zze(int i4, int i5, int i6);

    public abstract zzef zzf(int i4, int i5);

    protected abstract String zzg(Charset charset);

    public abstract boolean zzh();

    protected final int zzj() {
        return this.zzc;
    }

    public final String zzl(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
