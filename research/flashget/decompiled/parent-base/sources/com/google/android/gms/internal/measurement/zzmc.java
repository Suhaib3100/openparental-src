package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmc implements Iterator<Map.Entry<Object, Object>> {
    private int zza;
    private boolean zzb;
    private Iterator<Map.Entry<Object, Object>> zzc;
    private final /* synthetic */ zzlv zzd;

    private final Iterator<Map.Entry<Object, Object>> zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        Map map;
        int i5 = this.zza + 1;
        i4 = this.zzd.zzb;
        if (i5 >= i4) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<Object, Object> next() {
        int i4;
        Object[] objArr;
        this.zzb = true;
        int i5 = this.zza + 1;
        this.zza = i5;
        i4 = this.zzd.zzb;
        if (i5 >= i4) {
            return zza().next();
        }
        objArr = this.zzd.zza;
        return (zzlz) objArr[this.zza];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i4;
        if (!this.zzb) {
            throw new IllegalStateException(ProtectedSandApp.s("핇"));
        }
        this.zzb = false;
        this.zzd.zzg();
        int i5 = this.zza;
        i4 = this.zzd.zzb;
        if (i5 >= i4) {
            zza().remove();
            return;
        }
        zzlv zzlvVar = this.zzd;
        int i6 = this.zza;
        this.zza = i6 - 1;
        zzlvVar.zzb(i6);
    }

    private zzmc(zzlv zzlvVar) {
        this.zzd = zzlvVar;
        this.zza = -1;
    }
}
