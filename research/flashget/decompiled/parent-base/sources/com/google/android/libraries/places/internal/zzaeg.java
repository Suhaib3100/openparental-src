package com.google.android.libraries.places.internal;

import androidx.content.preferences.protobuf.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzaeg extends zzacd implements RandomAccess, zzadq, zzaey {
    private static final zzaeg zza;
    private long[] zzb;
    private int zzc;

    static {
        zzaeg zzaegVar = new zzaeg(new long[0], 0);
        zza = zzaegVar;
        zzaegVar.zzb();
    }

    zzaeg() {
        this(new long[10], 0);
    }

    public static zzaeg zze() {
        return zza;
    }

    private final String zzg(int i4) {
        int i5 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append(ProtectedSandApp.s("\ue7a3"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue7a4"));
        sb.append(i5);
        return sb.toString();
    }

    private final void zzh(int i4) {
        if (i4 < 0 || i4 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i4));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i4));
        }
        long[] jArr = this.zzb;
        if (i5 < jArr.length) {
            System.arraycopy(jArr, i4, jArr, i4 + 1, i5 - i4);
        } else {
            long[] jArr2 = new long[r.a(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            System.arraycopy(this.zzb, i4, jArr2, i4 + 1, this.zzc - i4);
            this.zzb = jArr2;
        }
        this.zzb[i4] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzads.zze(collection);
        if (!(collection instanceof zzaeg)) {
            return super.addAll(collection);
        }
        zzaeg zzaegVar = (zzaeg) collection;
        int i4 = zzaegVar.zzc;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        long[] jArr = this.zzb;
        if (i6 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(zzaegVar.zzb, 0, this.zzb, this.zzc, zzaegVar.zzc);
        this.zzc = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaeg)) {
            return super.equals(obj);
        }
        zzaeg zzaegVar = (zzaeg) obj;
        if (this.zzc != zzaegVar.zzc) {
            return false;
        }
        long[] jArr = zzaegVar.zzb;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            if (this.zzb[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        zzh(i4);
        return Long.valueOf(this.zzb[i4]);
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i4 = (i4 * 31) + zzads.zzc(this.zzb[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i4 = this.zzc;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.zzb[i5] == longValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        zza();
        zzh(i4);
        long[] jArr = this.zzb;
        long j4 = jArr[i4];
        if (i4 < this.zzc - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        zza();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("\ue7a5"));
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i5, jArr, i4, this.zzc - i5);
        this.zzc -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzh(i4);
        long[] jArr = this.zzb;
        long j4 = jArr[i4];
        jArr[i4] = longValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final long zzd(int i4) {
        zzh(i4);
        return this.zzb[i4];
    }

    @Override // com.google.android.libraries.places.internal.zzadr
    public final /* bridge */ /* synthetic */ zzadr zzf(int i4) {
        if (i4 >= this.zzc) {
            return new zzaeg(Arrays.copyOf(this.zzb, i4), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzaeg(long[] jArr, int i4) {
        this.zzb = jArr;
        this.zzc = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        int i4 = this.zzc;
        long[] jArr = this.zzb;
        if (i4 == jArr.length) {
            long[] jArr2 = new long[r.a(i4, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i4);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        jArr3[i5] = longValue;
        return true;
    }
}
