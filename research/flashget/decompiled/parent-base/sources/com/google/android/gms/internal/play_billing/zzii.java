package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
class zzii extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private boolean zzd;
    private volatile zzig zze;
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private zzii() {
    }

    private final int zzl(zzgg zzggVar) {
        int i4 = this.zzb;
        int i5 = i4 - 1;
        int i6 = 0;
        if (i5 >= 0) {
            int compareTo = zzggVar.compareTo(((zzie) this.zza[i5]).zza());
            if (compareTo > 0) {
                return -(i4 + 1);
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = zzggVar.compareTo(((zzie) this.zza[i7]).zza());
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        return -(i6 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzm(int i4) {
        zzo();
        Object value = ((zzie) this.zza[i4]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i4 + 1, objArr, i4, (this.zzb - i4) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i5 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i5] = new zzie(this, (zzgg) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        zzgg zzggVar = (zzgg) obj;
        return zzl(zzggVar) >= 0 || this.zzc.containsKey(zzggVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzig(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzii)) {
            return super.equals(obj);
        }
        zzii zziiVar = (zzii) obj;
        int size = size();
        if (size != zziiVar.size()) {
            return false;
        }
        int i4 = this.zzb;
        if (i4 != zziiVar.zzb) {
            return entrySet().equals(zziiVar.entrySet());
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!zzg(i5).equals(zziiVar.zzg(i5))) {
                return false;
            }
        }
        if (i4 != size) {
            return this.zzc.equals(zziiVar.zzc);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzgg zzggVar = (zzgg) obj;
        int zzl = zzl(zzggVar);
        return zzl >= 0 ? ((zzie) this.zza[zzl]).getValue() : this.zzc.get(zzggVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = this.zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += this.zza[i6].hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i5 : i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzo();
        zzgg zzggVar = (zzgg) obj;
        int zzl = zzl(zzggVar);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(zzggVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb;
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final Object put(zzgg zzggVar, Object obj) {
        zzo();
        int zzl = zzl(zzggVar);
        if (zzl >= 0) {
            return ((zzie) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i4 = -(zzl + 1);
        if (i4 >= 16) {
            return zzn().put(zzggVar, obj);
        }
        if (this.zzb == 16) {
            zzie zzieVar = (zzie) this.zza[15];
            this.zzb = 15;
            zzn().put(zzieVar.zza(), zzieVar.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i4, objArr, i4 + 1, 15 - i4);
        this.zza[i4] = new zzie(this, zzggVar, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i4) {
        if (i4 < this.zzb) {
            return (zzie) this.zza[i4];
        }
        throw new ArrayIndexOutOfBoundsException(i4);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    /* synthetic */ zzii(zzih zzihVar) {
    }
}
