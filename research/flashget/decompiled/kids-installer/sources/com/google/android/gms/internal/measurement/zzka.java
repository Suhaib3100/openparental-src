package com.google.android.gms.internal.measurement;

import android.content.preferences.protobuf.v;
import androidx.constraintlayout.solver.f;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzka implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzka zzb = new zzjx(zzlj.zzd);
    private static final zzjz zzd;
    private int zzc = 0;

    static {
        int i5 = zzjm.zza;
        zzd = new zzjz(null);
        zza = new zzjs();
    }

    zzka() {
    }

    static int zzj(int i5, int i6, int i7) {
        int i8 = i6 - i5;
        if ((i5 | i6 | i8 | (i7 - i6)) >= 0) {
            return i8;
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(f.a(ProtectedSandApp.s("්"), i5, ProtectedSandApp.s("\u0dcb")));
        }
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(v.a(ProtectedSandApp.s("ෆ"), i5, ProtectedSandApp.s("\u0dc7"), i6));
        }
        throw new IndexOutOfBoundsException(v.a(ProtectedSandApp.s("\u0dc8"), i6, ProtectedSandApp.s("\u0dc9"), i7));
    }

    public static zzka zzl(byte[] bArr, int i5, int i6) {
        zzj(i5, i5 + i6, bArr.length);
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i5, bArr2, 0, i6);
        return new zzjx(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i5 = this.zzc;
        if (i5 == 0) {
            int zzd2 = zzd();
            i5 = zze(zzd2, 0, zzd2);
            if (i5 == 0) {
                i5 = 1;
            }
            this.zzc = i5;
        }
        return i5;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzjr(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzni.zza(this) : zzni.zza(zzf(0, 47)).concat(ProtectedSandApp.s("\u0dcc"));
        return String.format(locale, ProtectedSandApp.s("\u0dcd"), objArr);
    }

    public abstract byte zza(int i5);

    abstract byte zzb(int i5);

    public abstract int zzd();

    protected abstract int zze(int i5, int i6, int i7);

    public abstract zzka zzf(int i5, int i6);

    protected abstract String zzg(Charset charset);

    abstract void zzh(zzjq zzjqVar) throws IOException;

    public abstract boolean zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
