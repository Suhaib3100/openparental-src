package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhg extends zzhp {
    private final zzcc zza;
    private final int zzb;

    zzhg(zzcc zzccVar) throws zzhf {
        zzccVar.getClass();
        this.zza = zzccVar;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            zzcc zzccVar2 = this.zza;
            if (i4 >= zzccVar2.size()) {
                break;
            }
            int zzb = ((zzhp) zzccVar2.get(i4)).zzb();
            if (i5 < zzb) {
                i5 = zzb;
            }
            i4++;
        }
        int i6 = i5 + 1;
        this.zzb = i6;
        if (i6 > 8) {
            throw new zzhf(ProtectedSandApp.s("탏"));
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd(Byte.MIN_VALUE) != zzhpVar.zza()) {
            return zzhp.zzd(Byte.MIN_VALUE) - zzhpVar.zza();
        }
        zzhg zzhgVar = (zzhg) zzhpVar;
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        zzcc zzccVar2 = zzhgVar.zza;
        if (size != zzccVar2.size()) {
            return zzccVar.size() - zzccVar2.size();
        }
        int i4 = 0;
        while (true) {
            zzcc zzccVar3 = this.zza;
            if (i4 >= zzccVar3.size()) {
                return 0;
            }
            int compareTo = ((zzhp) zzccVar3.get(i4)).compareTo((zzhp) zzhgVar.zza.get(i4));
            if (compareTo != 0) {
                return compareTo;
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            return this.zza.equals(((zzhg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd(Byte.MIN_VALUE)), this.zza});
    }

    public final String toString() {
        if (this.zza.isEmpty()) {
            return ProtectedSandApp.s("탐");
        }
        ArrayList arrayList = new ArrayList();
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(((zzhp) zzccVar.get(i4)).toString().replace(ProtectedSandApp.s("탑"), ProtectedSandApp.s("탒")));
        }
        zzbd zza = zzbd.zza(ProtectedSandApp.s("탓"));
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("탔"));
        zza.zzc(sb, arrayList.iterator());
        sb.append(ProtectedSandApp.s("탕"));
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzhp.zzd(Byte.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zzb;
    }
}
