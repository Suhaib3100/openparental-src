package com.google.android.gms.internal.measurement;

import androidx.appcompat.view.menu.s;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzae implements Iterable, zzap, zzal {
    final SortedMap zza;
    final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int intValue = ((Integer) this.zza.firstKey()).intValue(); intValue <= ((Integer) this.zza.lastKey()).intValue(); intValue++) {
            if (!zze(intValue).equals(zzaeVar.zze(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(ProtectedSandApp.s("⊷"));
    }

    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        return (ProtectedSandApp.s("⊸").equals(str) || ProtectedSandApp.s("⊹").equals(str) || ProtectedSandApp.s("⊺").equals(str) || ProtectedSandApp.s("⊻").equals(str) || ProtectedSandApp.s("⊼").equals(str) || ProtectedSandApp.s("⊽").equals(str) || ProtectedSandApp.s("⊾").equals(str) || ProtectedSandApp.s("⊿").equals(str) || ProtectedSandApp.s("⋀").equals(str) || ProtectedSandApp.s("⋁").equals(str) || ProtectedSandApp.s("⋂").equals(str) || ProtectedSandApp.s("⋃").equals(str) || ProtectedSandApp.s("⋄").equals(str) || ProtectedSandApp.s("⋅").equals(str) || ProtectedSandApp.s("⋆").equals(str) || ProtectedSandApp.s("⋇").equals(str) || ProtectedSandApp.s("⋈").equals(str) || ProtectedSandApp.s("⋉").equals(str) || ProtectedSandApp.s("⋊").equals(str) || ProtectedSandApp.s("⋋").equals(str)) ? zzbb.zza(str, this, zzgVar, list) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final int zzc() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return ((Integer) this.zza.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzaeVar.zza.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzaeVar.zza.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i5) {
        zzap zzapVar;
        if (i5 < zzc()) {
            return (!zzs(i5) || (zzapVar = (zzap) this.zza.get(Integer.valueOf(i5))) == null) ? zzap.zzf : zzapVar;
        }
        throw new IndexOutOfBoundsException(ProtectedSandApp.s("⋌"));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        return ProtectedSandApp.s("⋍").equals(str) ? new zzah(Double.valueOf(zzc())) : (!zzt(str) || (zzapVar = (zzap) this.zzb.get(str)) == null) ? zzap.zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return this.zza.size() == 1 ? zze(0).zzh() : this.zza.size() <= 0 ? Double.valueOf(p.f18289o) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(ProtectedSandApp.s("⋎"));
    }

    public final String zzj(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i5 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i5 >= zzc()) {
                    break;
                }
                zzap zze = zze(i5);
                sb.append(str2);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb.append(zze.zzi());
                }
                i5++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i5 = 0; i5 < zzc(); i5++) {
            arrayList.add(zze(i5));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i5, zzap zzapVar) {
        if (i5 < 0) {
            throw new IllegalArgumentException(s.a(ProtectedSandApp.s("⋏"), i5));
        }
        if (i5 >= zzc()) {
            zzq(i5, zzapVar);
            return;
        }
        for (int intValue = ((Integer) this.zza.lastKey()).intValue(); intValue >= i5; intValue--) {
            SortedMap sortedMap = this.zza;
            Integer valueOf = Integer.valueOf(intValue);
            zzap zzapVar2 = (zzap) sortedMap.get(valueOf);
            if (zzapVar2 != null) {
                zzq(intValue + 1, zzapVar2);
                this.zza.remove(valueOf);
            }
        }
        zzq(i5, zzapVar);
    }

    public final void zzp(int i5) {
        int intValue = ((Integer) this.zza.lastKey()).intValue();
        if (i5 > intValue || i5 < 0) {
            return;
        }
        this.zza.remove(Integer.valueOf(i5));
        if (i5 == intValue) {
            SortedMap sortedMap = this.zza;
            int i6 = i5 - 1;
            Integer valueOf = Integer.valueOf(i6);
            if (sortedMap.containsKey(valueOf) || i6 < 0) {
                return;
            }
            this.zza.put(valueOf, zzap.zzf);
            return;
        }
        while (true) {
            i5++;
            if (i5 > ((Integer) this.zza.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.zza;
            Integer valueOf2 = Integer.valueOf(i5);
            zzap zzapVar = (zzap) sortedMap2.get(valueOf2);
            if (zzapVar != null) {
                this.zza.put(Integer.valueOf(i5 - 1), zzapVar);
                this.zza.remove(valueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void zzq(int i5, zzap zzapVar) {
        if (i5 > 32468) {
            throw new IllegalStateException(ProtectedSandApp.s("⋑"));
        }
        if (i5 < 0) {
            throw new IndexOutOfBoundsException(s.a(ProtectedSandApp.s("⋐"), i5));
        }
        if (zzapVar == null) {
            this.zza.remove(Integer.valueOf(i5));
        } else {
            this.zza.put(Integer.valueOf(i5), zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i5) {
        if (i5 < 0 || i5 > ((Integer) this.zza.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException(s.a(ProtectedSandApp.s("⋒"), i5));
        }
        return this.zza.containsKey(Integer.valueOf(i5));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return ProtectedSandApp.s("⋓").equals(str) || this.zzb.containsKey(str);
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                zzq(i5, (zzap) list.get(i5));
            }
        }
    }
}
