package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
class zzlv<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzmb zze;
    private Map<K, V> zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza((zzlv<K, V>) comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzmb(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlv)) {
            return super.equals(obj);
        }
        zzlv zzlvVar = (zzlv) obj;
        int size = size();
        if (size != zzlvVar.size()) {
            return false;
        }
        int i4 = this.zzb;
        if (i4 != zzlvVar.zzb) {
            return entrySet().equals(zzlvVar.entrySet());
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!zza(i5).equals(zzlvVar.zza(i5))) {
                return false;
            }
        }
        if (i4 != size) {
            return this.zzc.equals(zzlvVar.zzc);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlv<K, V>) comparable);
        return zza >= 0 ? (V) ((zzlz) this.zza[zza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i4 = this.zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += this.zza[i6].hashCode();
        }
        return this.zzc.size() > 0 ? i5 + this.zzc.hashCode() : i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return zza((zzlv<K, V>) obj, (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza = zza((zzlv<K, V>) comparable);
        if (zza >= 0) {
            return (V) zzb(zza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzc.size() + this.zzb;
    }

    private zzlv() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    final Set<Map.Entry<K, V>> zzc() {
        return new zzma(this);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }

    private final int zza(K k4) {
        int i4;
        int i5 = this.zzb;
        int i6 = i5 - 1;
        if (i6 >= 0) {
            int compareTo = k4.compareTo((Comparable) ((zzlz) this.zza[i6]).getKey());
            if (compareTo > 0) {
                i4 = i5 + 1;
                return -i4;
            }
            if (compareTo == 0) {
                return i6;
            }
        }
        int i7 = 0;
        while (i7 <= i6) {
            int i10 = (i7 + i6) / 2;
            int compareTo2 = k4.compareTo((Comparable) ((zzlz) this.zza[i10]).getKey());
            if (compareTo2 < 0) {
                i6 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i7 = i10 + 1;
            }
        }
        i4 = i7 + 1;
        return -i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i4) {
        zzg();
        V v4 = (V) ((zzlz) this.zza[i4]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i4 + 1, objArr, i4, (this.zzb - i4) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzlz(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v4;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K k4, V v4) {
        zzg();
        int zza = zza((zzlv<K, V>) k4);
        if (zza >= 0) {
            return (V) ((zzlz) this.zza[zza]).setValue(v4);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i4 = -(zza + 1);
        if (i4 >= 16) {
            return zzf().put(k4, v4);
        }
        int i5 = this.zzb;
        if (i5 == 16) {
            zzlz zzlzVar = (zzlz) this.zza[15];
            this.zzb = i5 - 1;
            zzf().put((Comparable) zzlzVar.getKey(), zzlzVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i4, objArr, i4 + 1, (objArr.length - i4) - 1);
        this.zza[i4] = new zzlz(this, k4, v4);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i4) {
        if (i4 < this.zzb) {
            return (zzlz) this.zza[i4];
        }
        throw new ArrayIndexOutOfBoundsException(i4);
    }
}
