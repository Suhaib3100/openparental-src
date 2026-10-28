package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import d9.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import mf.m;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzaf implements zzak, zzaq, Iterable<zzaq> {

    @d
    private final SortedMap<Integer, zzaq> zza;

    @d
    private final Map<String, zzaq> zzb;

    public zzaf() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzafVar = (zzaf) obj;
        if (zzb() != zzafVar.zzb()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzafVar.zza.isEmpty();
        }
        for (int intValue = this.zza.firstKey().intValue(); intValue <= this.zza.lastKey().intValue(); intValue++) {
            if (!zza(intValue).equals(zzafVar.zza(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzah(this);
    }

    public final String toString() {
        return zzb(ProtectedSandApp.s("퇛"));
    }

    public final int zza() {
        return this.zza.size();
    }

    public final int zzb() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return this.zza.lastKey().intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        zzaf zzafVar = new zzaf();
        for (Map.Entry<Integer, zzaq> entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzak) {
                zzafVar.zza.put(entry.getKey(), entry.getValue());
            } else {
                zzafVar.zza.put(entry.getKey(), entry.getValue().zzc());
            }
        }
        return zzafVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        return this.zza.size() == 1 ? zza(0).zze() : this.zza.size() <= 0 ? Double.valueOf(p.f60679p) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return toString();
    }

    public final Iterator<Integer> zzg() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzae(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List<zzaq> zzi() {
        ArrayList arrayList = new ArrayList(zzb());
        for (int i4 = 0; i4 < zzb(); i4++) {
            arrayList.add(zza(i4));
        }
        return arrayList;
    }

    public final void zzj() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        return (ProtectedSandApp.s("퇞").equals(str) || ProtectedSandApp.s("퇟").equals(str) || ProtectedSandApp.s("퇠").equals(str) || ProtectedSandApp.s("퇡").equals(str) || ProtectedSandApp.s("퇢").equals(str) || ProtectedSandApp.s("퇣").equals(str) || ProtectedSandApp.s("퇤").equals(str) || ProtectedSandApp.s("퇥").equals(str) || ProtectedSandApp.s("퇦").equals(str) || ProtectedSandApp.s("퇧").equals(str) || ProtectedSandApp.s("퇨").equals(str) || ProtectedSandApp.s("퇩").equals(str) || ProtectedSandApp.s("퇪").equals(str) || ProtectedSandApp.s("퇫").equals(str) || ProtectedSandApp.s("퇬").equals(str) || ProtectedSandApp.s("퇭").equals(str) || ProtectedSandApp.s("퇮").equals(str) || ProtectedSandApp.s("퇯").equals(str) || ProtectedSandApp.s("퇰").equals(str) || ProtectedSandApp.s("퇱").equals(str)) ? zzbe.zza(str, this, zzhVar, list) : zzan.zza(this, new zzas(str), zzhVar, list);
    }

    public final String zzb(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            for (int i4 = 0; i4 < zzb(); i4++) {
                zzaq zza = zza(i4);
                sb.append(str);
                if (!(zza instanceof zzax) && !(zza instanceof zzao)) {
                    sb.append(zza.zzf());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public zzaf(List<zzaq> list) {
        this();
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                zzb(i4, list.get(i4));
            }
        }
    }

    public final boolean zzc(int i4) {
        if (i4 >= 0 && i4 <= this.zza.lastKey().intValue()) {
            return this.zza.containsKey(Integer.valueOf(i4));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.a(ProtectedSandApp.s("퇳"), i4));
    }

    public zzaf(zzaq... zzaqVarArr) {
        this((List<zzaq>) Arrays.asList(zzaqVarArr));
    }

    public final void zzb(int i4) {
        int intValue = this.zza.lastKey().intValue();
        if (i4 > intValue || i4 < 0) {
            return;
        }
        this.zza.remove(Integer.valueOf(i4));
        if (i4 == intValue) {
            int i5 = i4 - 1;
            if (this.zza.containsKey(Integer.valueOf(i5)) || i5 < 0) {
                return;
            }
            this.zza.put(Integer.valueOf(i5), zzaq.zzc);
            return;
        }
        while (true) {
            i4++;
            if (i4 > this.zza.lastKey().intValue()) {
                return;
            }
            zzaq zzaqVar = this.zza.get(Integer.valueOf(i4));
            if (zzaqVar != null) {
                this.zza.put(Integer.valueOf(i4 - 1), zzaqVar);
                this.zza.remove(Integer.valueOf(i4));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String str) {
        return ProtectedSandApp.s("퇝").equals(str) || this.zzb.containsKey(str);
    }

    @m({"elements"})
    public final void zzb(int i4, zzaq zzaqVar) {
        if (i4 > 32468) {
            throw new IllegalStateException(ProtectedSandApp.s("퇴"));
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.a(ProtectedSandApp.s("퇳"), i4));
        }
        if (zzaqVar == null) {
            this.zza.remove(Integer.valueOf(i4));
        } else {
            this.zza.put(Integer.valueOf(i4), zzaqVar);
        }
    }

    public final zzaq zza(int i4) {
        zzaq zzaqVar;
        if (i4 < zzb()) {
            return (!zzc(i4) || (zzaqVar = this.zza.get(Integer.valueOf(i4))) == null) ? zzaq.zzc : zzaqVar;
        }
        throw new IndexOutOfBoundsException(ProtectedSandApp.s("퇜"));
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String str) {
        zzaq zzaqVar;
        if (ProtectedSandApp.s("퇝").equals(str)) {
            return new zzai(Double.valueOf(zzb()));
        }
        return (!zzc(str) || (zzaqVar = this.zzb.get(str)) == null) ? zzaq.zzc : zzaqVar;
    }

    public final void zza(zzaq zzaqVar) {
        zzb(zzb(), zzaqVar);
    }

    public final void zza(int i4, zzaq zzaqVar) {
        if (i4 >= 0) {
            if (i4 >= zzb()) {
                zzb(i4, zzaqVar);
                return;
            }
            for (int intValue = this.zza.lastKey().intValue(); intValue >= i4; intValue--) {
                zzaq zzaqVar2 = this.zza.get(Integer.valueOf(intValue));
                if (zzaqVar2 != null) {
                    zzb(intValue + 1, zzaqVar2);
                    this.zza.remove(Integer.valueOf(intValue));
                }
            }
            zzb(i4, zzaqVar);
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("퇲"), i4));
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void zza(String str, zzaq zzaqVar) {
        if (zzaqVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzaqVar);
        }
    }
}
