package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzgq extends zzfb implements RandomAccess, zzgt {
    private static final int[] zza;
    private static final zzgq zzb;
    private int[] zzc;
    private int zzd;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        zzb = new zzgq(iArr, 0, false);
    }

    zzgq() {
        this(zza, 0, true);
    }

    public static zzgq zzf() {
        return zzb;
    }

    private static int zzj(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i4) {
        return q.a(ProtectedSandApp.s("ퟣ"), i4, ProtectedSandApp.s("ퟤ"), this.zzd);
    }

    private final void zzl(int i4) {
        if (i4 < 0 || i4 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i4));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i4));
        }
        int i6 = i4 + 1;
        int[] iArr = this.zzc;
        int length = iArr.length;
        if (i5 < length) {
            System.arraycopy(iArr, i4, iArr, i6, i5 - i4);
        } else {
            int[] iArr2 = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr2, 0, i4);
            System.arraycopy(this.zzc, i4, iArr2, i6, this.zzd - i4);
            this.zzc = iArr2;
        }
        this.zzc[i4] = intValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        collection.getClass();
        if (!(collection instanceof zzgq)) {
            return super.addAll(collection);
        }
        zzgq zzgqVar = (zzgq) collection;
        int i4 = zzgqVar.zzd;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.zzd;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        int[] iArr = this.zzc;
        if (i6 > iArr.length) {
            this.zzc = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(zzgqVar.zzc, 0, this.zzc, this.zzd, zzgqVar.zzd);
        this.zzd = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgq)) {
            return super.equals(obj);
        }
        zzgq zzgqVar = (zzgq) obj;
        if (this.zzd != zzgqVar.zzd) {
            return false;
        }
        int[] iArr = zzgqVar.zzc;
        for (int i4 = 0; i4 < this.zzd; i4++) {
            if (this.zzc[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        zzl(i4);
        return Integer.valueOf(this.zzc[i4]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.zzd; i5++) {
            i4 = (i4 * 31) + this.zzc[i5];
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i4 = this.zzd;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.zzc[i5] == intValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        zza();
        zzl(i4);
        int[] iArr = this.zzc;
        int i5 = iArr[i4];
        if (i4 < this.zzd - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        zza();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("ퟥ"));
        }
        int[] iArr = this.zzc;
        System.arraycopy(iArr, i5, iArr, i4, this.zzd - i5);
        this.zzd -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzl(i4);
        int[] iArr = this.zzc;
        int i5 = iArr[i4];
        iArr[i4] = intValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final int zze(int i4) {
        zzl(i4);
        return this.zzc[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgu
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgt zzd(int i4) {
        if (i4 >= this.zzd) {
            return new zzgq(i4 == 0 ? zza : Arrays.copyOf(this.zzc, i4), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgt
    public final void zzh(int i4) {
        zza();
        int i5 = this.zzd;
        int length = this.zzc.length;
        if (i5 == length) {
            int[] iArr = new int[zzj(length)];
            System.arraycopy(this.zzc, 0, iArr, 0, this.zzd);
            this.zzc = iArr;
        }
        int[] iArr2 = this.zzc;
        int i6 = this.zzd;
        this.zzd = i6 + 1;
        iArr2[i6] = i4;
    }

    final void zzi(int i4) {
        int length = this.zzc.length;
        if (i4 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new int[Math.max(i4, 10)];
            return;
        }
        while (length < i4) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzgq(int[] iArr, int i4, boolean z4) {
        super(z4);
        this.zzc = iArr;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
