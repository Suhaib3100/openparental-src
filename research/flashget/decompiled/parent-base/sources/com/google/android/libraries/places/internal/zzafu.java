package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzafu {
    private static final zzafu zza = new zzafu(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;

    private zzafu(int i4, int[] iArr, Object[] objArr, boolean z4) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
    }

    public static zzafu zzc() {
        return zza;
    }

    static zzafu zzd(zzafu zzafuVar, zzafu zzafuVar2) {
        int i4 = zzafuVar.zzb;
        int i5 = zzafuVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzafuVar.zzc, 0);
        System.arraycopy(zzafuVar2.zzc, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzafuVar.zzd, 0);
        System.arraycopy(zzafuVar2.zzd, 0, copyOf2, 0, 0);
        return new zzafu(0, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzafu)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzb() {
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        this.zze = 0;
        return 0;
    }

    final void zze(StringBuilder sb, int i4) {
    }

    private zzafu() {
        this(0, new int[8], new Object[8], true);
    }
}
