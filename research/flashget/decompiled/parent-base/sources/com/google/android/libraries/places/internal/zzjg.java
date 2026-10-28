package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzjg {
    private static final zzjj zza = new zzje();
    private static final zzji zzb = new zzjf();
    private final zzjj zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzji zzf = null;

    /* synthetic */ zzjg(zzjj zzjjVar, zzjd zzjdVar) {
        this.zze = zzjjVar;
    }

    public final zzjg zza(zzji zzjiVar) {
        this.zzf = zzjiVar;
        return this;
    }

    public final zzjk zzd() {
        return new zzjh(this, null);
    }

    final void zzg(zzix zzixVar) {
        String s4 = ProtectedSandApp.s("\uea03");
        zzkt.zza(zzixVar, s4);
        if (!zzixVar.zzb()) {
            zzjj zzjjVar = zza;
            zzkt.zza(zzixVar, s4);
            this.zzd.remove(zzixVar);
            this.zzc.put(zzixVar, zzjjVar);
            return;
        }
        zzji zzjiVar = zzb;
        zzkt.zza(zzixVar, s4);
        if (!zzixVar.zzb()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uea04"));
        }
        this.zzc.remove(zzixVar);
        this.zzd.put(zzixVar, zzjiVar);
    }
}
