package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzif implements Iterator {
    final /* synthetic */ zzii zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzif(zzii zziiVar, zzih zzihVar) {
        Objects.requireNonNull(zziiVar);
        this.zza = zziiVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i4;
        Map map;
        int i5 = this.zzb + 1;
        zzii zziiVar = this.zza;
        i4 = zziiVar.zzb;
        if (i5 < i4) {
            return true;
        }
        map = zziiVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i4;
        Object[] objArr;
        this.zzc = true;
        int i5 = this.zzb + 1;
        this.zzb = i5;
        zzii zziiVar = this.zza;
        i4 = zziiVar.zzb;
        if (i5 >= i4) {
            return (Map.Entry) zza().next();
        }
        objArr = zziiVar.zza;
        return (zzie) objArr[i5];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i4;
        if (!this.zzc) {
            throw new IllegalStateException(ProtectedSandApp.s("\ud820"));
        }
        this.zzc = false;
        zzii zziiVar = this.zza;
        zziiVar.zzo();
        int i5 = this.zzb;
        i4 = zziiVar.zzb;
        if (i5 >= i4) {
            zza().remove();
        } else {
            this.zzb = i5 - 1;
            zziiVar.zzm(i5);
        }
    }
}
