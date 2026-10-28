package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzacp implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzacp zzb = new zzacm(zzads.zzd);
    private static final zzaco zzd;
    private int zzc = 0;

    static {
        int i4 = zzace.zza;
        zzd = new zzaco(null);
        zza = new zzach();
    }

    zzacp() {
    }

    static int zzj(int i4, int i5, int i6) {
        if (((i6 - i5) | i5) >= 0) {
            return i5;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append(ProtectedSandApp.s("\ue73a"));
        sb.append(i5);
        sb.append(ProtectedSandApp.s("\ue73b"));
        sb.append(i6);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static zzacp zzl(String str) {
        return new zzacm(str.getBytes(zzads.zzb));
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
        return new zzacg(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, ProtectedSandApp.s("\ue73d"), Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzafr.zza(this) : zzafr.zza(zzf(0, 47)).concat(ProtectedSandApp.s("\ue73c")));
    }

    public abstract byte zza(int i4);

    abstract byte zzb(int i4);

    public abstract int zzd();

    protected abstract int zze(int i4, int i5, int i6);

    public abstract zzacp zzf(int i4, int i5);

    protected abstract String zzg(Charset charset);

    abstract void zzh(zzacf zzacfVar) throws IOException;

    public abstract boolean zzi();

    protected final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
