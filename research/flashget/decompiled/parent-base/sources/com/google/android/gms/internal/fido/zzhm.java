package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhm extends zzhp {
    private final int zza;
    private final zzcj zzb;

    zzhm(zzcj zzcjVar) throws zzhf {
        zzcjVar.getClass();
        this.zzb = zzcjVar;
        zzdc it = zzcjVar.entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int zzb = ((zzhp) entry.getKey()).zzb();
            i4 = i4 < zzb ? zzb : i4;
            int zzb2 = ((zzhp) entry.getValue()).zzb();
            if (i4 < zzb2) {
                i4 = zzb2;
            }
        }
        int i5 = i4 + 1;
        this.zza = i5;
        if (i5 > 8) {
            throw new zzhf(ProtectedSandApp.s("탙"));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int compareTo;
        int size;
        int size2;
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd((byte) -96) != zzhpVar.zza()) {
            size2 = zzhpVar.zza();
            size = zzhp.zzd((byte) -96);
        } else {
            zzhm zzhmVar = (zzhm) zzhpVar;
            if (this.zzb.size() == zzhmVar.zzb.size()) {
                zzdc it = this.zzb.entrySet().iterator();
                zzdc it2 = zzhmVar.zzb.entrySet().iterator();
                do {
                    if (!it.hasNext() && !it2.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    int compareTo2 = ((zzhp) entry.getKey()).compareTo((zzhp) entry2.getKey());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    compareTo = ((zzhp) entry.getValue()).compareTo((zzhp) entry2.getValue());
                } while (compareTo == 0);
                return compareTo;
            }
            size = this.zzb.size();
            size2 = zzhmVar.zzb.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhm.class == obj.getClass()) {
            return this.zzb.equals(((zzhm) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) -96)), this.zzb});
    }

    public final String toString() {
        if (this.zzb.isEmpty()) {
            return ProtectedSandApp.s("탚");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzdc it = this.zzb.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String obj = ((zzhp) entry.getKey()).toString();
            String s4 = ProtectedSandApp.s("탛");
            String s5 = ProtectedSandApp.s("태");
            linkedHashMap.put(obj.replace(s4, s5), ((zzhp) entry.getValue()).toString().replace(s4, s5));
        }
        zzbd zza = zzbd.zza(ProtectedSandApp.s("택"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("탞"));
        try {
            zzbc.zza(sb, linkedHashMap.entrySet().iterator(), zza, ProtectedSandApp.s("탟"));
            sb.append(ProtectedSandApp.s("탠"));
            return sb.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzhp.zzd((byte) -96);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zza;
    }

    public final zzcj zzc() {
        return this.zzb;
    }
}
