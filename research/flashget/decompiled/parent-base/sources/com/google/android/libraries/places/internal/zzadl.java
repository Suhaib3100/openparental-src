package com.google.android.libraries.places.internal;

import androidx.content.preferences.protobuf.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzadl extends zzacd implements RandomAccess, zzado, zzaey {
    private static final zzadl zza;
    private int[] zzb;
    private int zzc;

    static {
        zzadl zzadlVar = new zzadl(new int[0], 0);
        zza = zzadlVar;
        zzadlVar.zzb();
    }

    zzadl() {
        this(new int[10], 0);
    }

    public static zzadl zze() {
        return zza;
    }

    private final String zzg(int i4) {
        int i5 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append(ProtectedSandApp.s("\ue787"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue788"));
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
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i4));
        }
        int[] iArr = this.zzb;
        if (i5 < iArr.length) {
            System.arraycopy(iArr, i4, iArr, i4 + 1, i5 - i4);
        } else {
            int[] iArr2 = new int[r.a(i5, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            System.arraycopy(this.zzb, i4, iArr2, i4 + 1, this.zzc - i4);
            this.zzb = iArr2;
        }
        this.zzb[i4] = intValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzads.zze(collection);
        if (!(collection instanceof zzadl)) {
            return super.addAll(collection);
        }
        zzadl zzadlVar = (zzadl) collection;
        int i4 = zzadlVar.zzc;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        int[] iArr = this.zzb;
        if (i6 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(zzadlVar.zzb, 0, this.zzb, this.zzc, zzadlVar.zzc);
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
        if (!(obj instanceof zzadl)) {
            return super.equals(obj);
        }
        zzadl zzadlVar = (zzadl) obj;
        if (this.zzc != zzadlVar.zzc) {
            return false;
        }
        int[] iArr = zzadlVar.zzb;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            if (this.zzb[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        zzh(i4);
        return Integer.valueOf(this.zzb[i4]);
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i4 = (i4 * 31) + this.zzb[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.zzc;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.zzb[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        zza();
        zzh(i4);
        int[] iArr = this.zzb;
        int i5 = iArr[i4];
        if (i4 < this.zzc - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        zza();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("\ue789"));
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i5, iArr, i4, this.zzc - i5);
        this.zzc -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzh(i4);
        int[] iArr = this.zzb;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zzd(int i4) {
        zzh(i4);
        return this.zzb[i4];
    }

    @Override // com.google.android.libraries.places.internal.zzadr
    public final /* bridge */ /* synthetic */ zzadr zzf(int i4) {
        if (i4 >= this.zzc) {
            return new zzadl(Arrays.copyOf(this.zzb, i4), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzadl(int[] iArr, int i4) {
        this.zzb = iArr;
        this.zzc = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        int i4 = this.zzc;
        int[] iArr = this.zzb;
        if (i4 == iArr.length) {
            int[] iArr2 = new int[r.a(i4, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i4);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        iArr3[i5] = intValue;
        return true;
    }
}
