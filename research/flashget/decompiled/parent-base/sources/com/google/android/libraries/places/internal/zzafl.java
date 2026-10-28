package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzafl implements Iterator {
    final /* synthetic */ zzafp zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

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
        List list;
        Map map;
        int i4 = this.zzb + 1;
        list = this.zza.zzb;
        if (i4 < list.size()) {
            return true;
        }
        map = this.zza.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzc = true;
        int i4 = this.zzb + 1;
        this.zzb = i4;
        list = this.zza.zzb;
        if (i4 >= list.size()) {
            return (Map.Entry) zza().next();
        }
        list2 = this.zza.zzb;
        return (Map.Entry) list2.get(this.zzb);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            throw new IllegalStateException(ProtectedSandApp.s("\ue7c8"));
        }
        this.zzc = false;
        this.zza.zzn();
        int i4 = this.zzb;
        list = this.zza.zzb;
        if (i4 >= list.size()) {
            zza().remove();
            return;
        }
        zzafp zzafpVar = this.zza;
        int i5 = this.zzb;
        this.zzb = i5 - 1;
        zzafpVar.zzl(i5);
    }
}
