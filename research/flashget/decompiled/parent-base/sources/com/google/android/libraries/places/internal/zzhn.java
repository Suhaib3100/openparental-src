package com.google.android.libraries.places.internal;

import java.io.Serializable;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
abstract class zzhn implements Comparable, Serializable {
    final Comparable zza;

    zzhn(Comparable comparable) {
        this.zza = comparable;
    }

    public final boolean equals(@zc.a Object obj) {
        if (obj instanceof zzhn) {
            try {
                if (compareTo((zzhn) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public int compareTo(zzhn zzhnVar) {
        zzhl zzhlVar;
        zzhj zzhjVar;
        zzhlVar = zzhl.zzb;
        if (zzhnVar != zzhlVar) {
            zzhjVar = zzhj.zzb;
            if (zzhnVar == zzhjVar) {
                return -1;
            }
            int zza = zzie.zza(this.zza, zzhnVar.zza);
            if (zza != 0) {
                return zza;
            }
            boolean z4 = this instanceof zzhk;
            if (z4 == (zzhnVar instanceof zzhk)) {
                return 0;
            }
            if (!z4) {
                return -1;
            }
        }
        return 1;
    }

    abstract void zzc(StringBuilder sb);

    abstract void zzd(StringBuilder sb);

    abstract boolean zze(Comparable comparable);
}
