package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public final class zzhe {
    private final zzgq zza;
    private final zzhc zzb;

    private zzhe(zzhc zzhcVar, byte[] bArr) {
        zzgp zzgpVar = zzgp.zza;
        this.zzb = zzhcVar;
        this.zza = zzgpVar;
    }

    public static zzhe zzb(char c5) {
        return new zzhe(new zzhc(new zzgn('.')), null);
    }

    public final List zzc(CharSequence charSequence) {
        zzhb zzhbVar = new zzhb(this.zzb, this, ProtectedSandApp.s("\ue9c2"));
        ArrayList arrayList = new ArrayList();
        while (zzhbVar.hasNext()) {
            arrayList.add((String) zzhbVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
