package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzlx implements Iterator<Map.Entry<Object, Object>> {
    private int zza;
    private Iterator<Map.Entry<Object, Object>> zzb;
    private final /* synthetic */ zzlv zzc;

    private final Iterator<Map.Entry<Object, Object>> zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        int i5 = this.zza;
        if (i5 > 0) {
            i4 = this.zzc.zzb;
            if (i5 <= i4) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        Object[] objArr;
        if (zza().hasNext()) {
            return zza().next();
        }
        objArr = this.zzc.zza;
        int i4 = this.zza - 1;
        this.zza = i4;
        return (zzlz) objArr[i4];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzlx(zzlv zzlvVar) {
        int i4;
        this.zzc = zzlvVar;
        i4 = zzlvVar.zzb;
        this.zza = i4;
    }
}
