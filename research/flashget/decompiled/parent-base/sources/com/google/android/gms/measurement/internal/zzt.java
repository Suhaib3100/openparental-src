package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.n1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes5.dex */
final class zzt extends zznr {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzv> zzc;
    private Long zzd;
    private Long zze;

    zzt(zznv zznvVar) {
        super(zznvVar);
    }

    private final zzv zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzv zzvVar = new zzv(this, this.zza);
        this.zzc.put(num, zzvVar);
        return zzvVar;
    }

    @o0
    private final List<zzfy.zzd> zzu() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.zzc.keySet();
        keySet.removeAll(this.zzb);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            zzv zzvVar = this.zzc.get(num);
            Preconditions.checkNotNull(zzvVar);
            zzfy.zzd zza = zzvVar.zza(intValue);
            arrayList.add(zza);
            zzal zzh = zzh();
            String str = this.zza;
            zzfy.zzm zzd = zza.zzd();
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzd);
            byte[] zzca = zzd.zzca();
            ContentValues contentValues = new ContentValues();
            contentValues.put(ProtectedSandApp.s("\ue49c"), str);
            contentValues.put(ProtectedSandApp.s("\ue49d"), num);
            contentValues.put(ProtectedSandApp.s("\ue49e"), zzca);
            try {
                if (zzh.e_().insertWithOnConflict(ProtectedSandApp.s("\ue49f"), null, contentValues, 5) == -1) {
                    zzh.zzj().zzg().zza(ProtectedSandApp.s("\ue4a0"), zzgo.zza(str));
                }
            } catch (SQLiteException e4) {
                zzh.zzj().zzg().zza(ProtectedSandApp.s("\ue4a1"), zzgo.zza(str), e4);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    protected final boolean zzc() {
        return false;
    }

    @n1
    final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l4, Long l5) {
        return zza(str, list, list2, l4, l5, false);
    }

    @n1
    final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l4, Long l5, boolean z4) {
        boolean z5;
        Map<Integer, zzfy.zzm> map;
        List<zzfo.zzb> list3;
        Iterator it;
        Iterator<zzfy.zzn> it2;
        Map<Integer, zzfy.zzm> map2;
        Map<Integer, List<Integer>> map3;
        Iterator<Integer> it3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new androidx.collection.a();
        this.zzd = l4;
        this.zze = l5;
        Iterator<zzfy.zzf> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z5 = false;
                break;
            }
            if (ProtectedSandApp.s("\ue4a2").equals(it4.next().zzg())) {
                z5 = true;
                break;
            }
        }
        boolean z6 = com.google.android.gms.internal.measurement.zzoe.zza() && zze().zzf(this.zza, zzbh.zzbp);
        boolean z7 = com.google.android.gms.internal.measurement.zzoe.zza() && zze().zzf(this.zza, zzbh.zzbo);
        if (z5) {
            zzal zzh = zzh();
            String str2 = this.zza;
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put(ProtectedSandApp.s("\ue4a3"), (Integer) 0);
            try {
                zzh.e_().update(ProtectedSandApp.s("\ue4a4"), contentValues, ProtectedSandApp.s("\ue4a5"), new String[]{str2});
            } catch (SQLiteException e4) {
                zzh.zzj().zzg().zza(ProtectedSandApp.s("\ue4a6"), zzgo.zza(str2), e4);
            }
        }
        Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
        if (z7 && z6) {
            emptyMap = zzh().zzn(this.zza);
        }
        Map<Integer, zzfy.zzm> zzm = zzh().zzm(this.zza);
        if (!zzm.isEmpty()) {
            HashSet hashSet = new HashSet(zzm.keySet());
            if (z5) {
                String str3 = this.zza;
                Map<Integer, List<Integer>> zzo = zzh().zzo(this.zza);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(zzm);
                androidx.collection.a aVar = new androidx.collection.a();
                if (!zzm.isEmpty()) {
                    Iterator<Integer> it5 = zzm.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer next = it5.next();
                        next.intValue();
                        zzfy.zzm zzmVar = zzm.get(next);
                        List<Integer> list4 = zzo.get(next);
                        if (list4 != null && !list4.isEmpty()) {
                            List<Long> zza = g_().zza(zzmVar.zzi(), list4);
                            if (!zza.isEmpty()) {
                                zzfy.zzm.zza zzb = zzmVar.zzcd().zzb().zzb(zza);
                                zzb.zzd().zzd(g_().zza(zzmVar.zzk(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzfy.zze zzeVar : zzmVar.zzh()) {
                                    Map<Integer, List<Integer>> map4 = zzo;
                                    Iterator<Integer> it6 = it5;
                                    if (!list4.contains(Integer.valueOf(zzeVar.zza()))) {
                                        arrayList.add(zzeVar);
                                    }
                                    zzo = map4;
                                    it5 = it6;
                                }
                                map3 = zzo;
                                it3 = it5;
                                zzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfy.zzn zznVar : zzmVar.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zznVar.zzb()))) {
                                        arrayList2.add(zznVar);
                                    }
                                }
                                zzb.zzc().zzc(arrayList2);
                                aVar.put(next, (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) zzb.zzai()));
                            }
                        } else {
                            map3 = zzo;
                            it3 = it5;
                            aVar.put(next, zzmVar);
                        }
                        zzo = map3;
                        it5 = it3;
                    }
                }
                map = aVar;
            } else {
                map = zzm;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num = (Integer) it7.next();
                num.intValue();
                zzfy.zzm zzmVar2 = map.get(num);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                androidx.collection.a aVar2 = new androidx.collection.a();
                if (zzmVar2 != null && zzmVar2.zza() != 0) {
                    for (zzfy.zze zzeVar2 : zzmVar2.zzh()) {
                        if (zzeVar2.zzf()) {
                            aVar2.put(Integer.valueOf(zzeVar2.zza()), zzeVar2.zze() ? Long.valueOf(zzeVar2.zzb()) : null);
                        }
                    }
                }
                androidx.collection.a aVar3 = new androidx.collection.a();
                if (zzmVar2 != null && zzmVar2.zzc() != 0) {
                    Iterator<zzfy.zzn> it8 = zzmVar2.zzj().iterator();
                    while (it8.hasNext()) {
                        zzfy.zzn next2 = it8.next();
                        if (!next2.zzf() || next2.zza() <= 0) {
                            it2 = it8;
                            map2 = map;
                        } else {
                            it2 = it8;
                            map2 = map;
                            aVar3.put(Integer.valueOf(next2.zzb()), Long.valueOf(next2.zza(next2.zza() - 1)));
                        }
                        it8 = it2;
                        map = map2;
                    }
                }
                Map<Integer, zzfy.zzm> map5 = map;
                if (zzmVar2 != null) {
                    int i4 = 0;
                    while (i4 < (zzmVar2.zzd() << 6)) {
                        if (zzoo.zza(zzmVar2.zzk(), i4)) {
                            it = it7;
                            zzj().zzp().zza(ProtectedSandApp.s("\ue4a7"), num, Integer.valueOf(i4));
                            bitSet2.set(i4);
                            if (zzoo.zza(zzmVar2.zzi(), i4)) {
                                bitSet.set(i4);
                                i4++;
                                it7 = it;
                            }
                        } else {
                            it = it7;
                        }
                        aVar2.remove(Integer.valueOf(i4));
                        i4++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                zzfy.zzm zzmVar3 = zzm.get(num);
                if (z7 && z6 && (list3 = emptyMap.get(num)) != null && this.zze != null && this.zzd != null) {
                    for (zzfo.zzb zzbVar : list3) {
                        int zzb2 = zzbVar.zzb();
                        long longValue = this.zze.longValue() / 1000;
                        if (zzbVar.zzi()) {
                            longValue = this.zzd.longValue() / 1000;
                        }
                        if (aVar2.containsKey(Integer.valueOf(zzb2))) {
                            aVar2.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        if (aVar3.containsKey(Integer.valueOf(zzb2))) {
                            aVar3.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                    }
                }
                this.zzc.put(num, new zzv(this, this.zza, zzmVar3, bitSet, bitSet2, aVar2, aVar3));
                it7 = it9;
                zzm = zzm;
                map = map5;
            }
        }
        if (com.google.android.gms.internal.measurement.zznm.zza() && zze().zzf(null, zzbh.zzcy)) {
            zza(list, z4);
            if (z4) {
                return new ArrayList();
            }
            zza(list2);
            return zzu();
        }
        zza(list, true);
        zza(list2);
        return zzu();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(List<zzfy.zzf> list, boolean z4) {
        zzbb zzbbVar;
        zzy zzyVar;
        Integer num;
        Map<Integer, List<zzfo.zzb>> map;
        long j4;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        zzy zzyVar2 = new zzy(this);
        androidx.collection.a aVar = new androidx.collection.a();
        for (zzfy.zzf zzfVar : list) {
            zzfy.zzf zza = zzyVar2.zza(this.zza, zzfVar);
            if (zza != null) {
                zzal zzh = zzh();
                String str2 = this.zza;
                String zzg = zza.zzg();
                zzbb zzd = zzh.zzd(str2, zzfVar.zzg());
                if (zzd == null) {
                    zzh.zzj().zzu().zza(ProtectedSandApp.s("\ue49b"), zzgo.zza(str2), zzh.zzi().zza(zzg));
                    zzbbVar = new zzbb(str2, zzfVar.zzg(), 1L, 1L, 1L, zzfVar.zzd(), 0L, null, null, null, null);
                } else {
                    zzbbVar = new zzbb(zzd.zza, zzd.zzb, zzd.zzc + 1, zzd.zzd + 1, zzd.zze + 1, zzd.zzf, zzd.zzg, zzd.zzh, zzd.zzi, zzd.zzj, zzd.zzk);
                }
                zzbb zzbbVar2 = zzbbVar;
                zzh().zza(zzbbVar2);
                if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zzf(str, zzbh.zzcy) || !z4) {
                    long j5 = zzbbVar2.zzc;
                    String zzg2 = zza.zzg();
                    Map<Integer, List<zzfo.zzb>> map2 = (Map) aVar.get(zzg2);
                    if (map2 == null) {
                        map2 = zzh().zzf(this.zza, zzg2);
                        aVar.put(zzg2, map2);
                    }
                    Map<Integer, List<zzfo.zzb>> map3 = map2;
                    Iterator<Integer> it = map3.keySet().iterator();
                    while (it.hasNext()) {
                        Integer next = it.next();
                        int intValue = next.intValue();
                        if (this.zzb.contains(next)) {
                            zzj().zzp().zza(ProtectedSandApp.s("\ue497"), next);
                        } else {
                            Iterator<zzfo.zzb> it2 = map3.get(next).iterator();
                            boolean z5 = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    zzyVar = zzyVar2;
                                    num = next;
                                    map = map3;
                                    j4 = j5;
                                    break;
                                }
                                zzfo.zzb next2 = it2.next();
                                zzx zzxVar = new zzx(this, this.zza, intValue, next2);
                                zzyVar = zzyVar2;
                                num = next;
                                int i4 = intValue;
                                map = map3;
                                j4 = j5;
                                z5 = zzxVar.zza(this.zzd, this.zze, zza, j5, zzbbVar2, zza(intValue, next2.zzb()));
                                if (z5) {
                                    zza(num).zza(zzxVar);
                                    next = num;
                                    zzyVar2 = zzyVar;
                                    intValue = i4;
                                    map3 = map;
                                    j5 = j4;
                                } else {
                                    this.zzb.add(num);
                                    break;
                                }
                            }
                            if (!z5) {
                                this.zzb.add(num);
                            }
                            zzyVar2 = zzyVar;
                            map3 = map;
                            j5 = j4;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    private final void zza(List<zzfy.zzo> list) {
        zzfo.zze next;
        if (list.isEmpty()) {
            return;
        }
        androidx.collection.a aVar = new androidx.collection.a();
        for (zzfy.zzo zzoVar : list) {
            String zzg = zzoVar.zzg();
            Map<Integer, List<zzfo.zze>> map = (Map) aVar.get(zzg);
            if (map == null) {
                map = zzh().zzg(this.zza, zzg);
                aVar.put(zzg, map);
            }
            Iterator<Integer> it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Integer next2 = it.next();
                    int intValue = next2.intValue();
                    if (this.zzb.contains(next2)) {
                        zzj().zzp().zza(ProtectedSandApp.s("\ue497"), next2);
                        break;
                    }
                    Iterator<zzfo.zze> it2 = map.get(next2).iterator();
                    boolean z4 = true;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        next = it2.next();
                        if (zzj().zza(2)) {
                            zzj().zzp().zza(ProtectedSandApp.s("\ue498"), next2, next.zzi() ? Integer.valueOf(next.zza()) : null, zzi().zzc(next.zze()));
                            zzj().zzp().zza(ProtectedSandApp.s("\ue499"), g_().zza(next));
                        }
                        if (!next.zzi() || next.zza() > 256) {
                            break;
                        }
                        zzz zzzVar = new zzz(this, this.zza, intValue, next);
                        z4 = zzzVar.zza(this.zzd, this.zze, zzoVar, zza(intValue, next.zza()));
                        if (z4) {
                            zza(next2).zza(zzzVar);
                        } else {
                            this.zzb.add(next2);
                            break;
                        }
                    }
                    zzj().zzu().zza(ProtectedSandApp.s("\ue49a"), zzgo.zza(this.zza), String.valueOf(next.zzi() ? Integer.valueOf(next.zza()) : null));
                    z4 = false;
                    if (!z4) {
                        this.zzb.add(next2);
                    }
                }
            }
        }
    }

    private final boolean zza(int i4, int i5) {
        BitSet bitSet;
        zzv zzvVar = this.zzc.get(Integer.valueOf(i4));
        if (zzvVar == null) {
            return false;
        }
        bitSet = zzvVar.zzd;
        return bitSet.get(i5);
    }
}
