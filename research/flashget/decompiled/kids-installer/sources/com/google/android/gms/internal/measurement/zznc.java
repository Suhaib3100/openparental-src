package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zznc implements Iterator {
    final /* synthetic */ zzng zza;
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
        int i5 = this.zzb + 1;
        list = this.zza.zzb;
        if (i5 < list.size()) {
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
        int i5 = this.zzb + 1;
        this.zzb = i5;
        list = this.zza.zzb;
        if (i5 >= list.size()) {
            return (Map.Entry) zza().next();
        }
        list2 = this.zza.zzb;
        return (Map.Entry) list2.get(this.zzb);
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            throw new IllegalStateException(ProtectedSandApp.s("ู"));
        }
        this.zzc = false;
        this.zza.zzn();
        int i5 = this.zzb;
        list = this.zza.zzb;
        if (i5 >= list.size()) {
            zza().remove();
            return;
        }
        zzng zzngVar = this.zza;
        int i6 = this.zzb;
        this.zzb = i6 - 1;
        zzngVar.zzl(i6);
    }
}
