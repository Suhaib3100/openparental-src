package com.google.android.gms.internal.measurement;

import android.content.preferences.protobuf.q;
import android.content.preferences.protobuf.v;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzlc extends zzjl implements RandomAccess, zzlg, zzmp {
    private static final zzlc zza = new zzlc(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    zzlc() {
        this(new int[10], 0, true);
    }

    public static zzlc zzf() {
        return zza;
    }

    private final String zzi(int i5) {
        return v.a(ProtectedSandApp.s("⎚"), i5, ProtectedSandApp.s("⎛"), this.zzc);
    }

    private final void zzj(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        int intValue = ((Integer) obj).intValue();
        zzbW();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i5));
        }
        int[] iArr = this.zzb;
        if (i6 < iArr.length) {
            System.arraycopy(iArr, i5, iArr, i5 + 1, i6 - i5);
        } else {
            int[] iArr2 = new int[q.a(i6, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            System.arraycopy(this.zzb, i5, iArr2, i5 + 1, this.zzc - i5);
            this.zzb = iArr2;
        }
        this.zzb[i5] = intValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbW();
        byte[] bArr = zzlj.zzd;
        collection.getClass();
        if (!(collection instanceof zzlc)) {
            return super.addAll(collection);
        }
        zzlc zzlcVar = (zzlc) collection;
        int i5 = zzlcVar.zzc;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzc;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        int[] iArr = this.zzb;
        if (i7 > iArr.length) {
            this.zzb = Arrays.copyOf(iArr, i7);
        }
        System.arraycopy(zzlcVar.zzb, 0, this.zzb, this.zzc, zzlcVar.zzc);
        this.zzc = i7;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlc)) {
            return super.equals(obj);
        }
        zzlc zzlcVar = (zzlc) obj;
        if (this.zzc != zzlcVar.zzc) {
            return false;
        }
        int[] iArr = zzlcVar.zzb;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            if (this.zzb[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzj(i5);
        return Integer.valueOf(this.zzb[i5]);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            i5 = (i5 * 31) + this.zzb[i6];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i5 = this.zzc;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzb[i6] == intValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzbW();
        zzj(i5);
        int[] iArr = this.zzb;
        int i6 = iArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i5, int i6) {
        zzbW();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("⎜"));
        }
        int[] iArr = this.zzb;
        System.arraycopy(iArr, i6, iArr, i5, this.zzc - i6);
        this.zzc -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbW();
        zzj(i5);
        int[] iArr = this.zzb;
        int i6 = iArr[i5];
        iArr[i5] = intValue;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zze(int i5) {
        zzj(i5);
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzlg zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzlc(Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i5) {
        zzbW();
        int i6 = this.zzc;
        int[] iArr = this.zzb;
        if (i6 == iArr.length) {
            int[] iArr2 = new int[q.a(i6, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i6);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i7 = this.zzc;
        this.zzc = i7 + 1;
        iArr3[i7] = i5;
    }

    private zzlc(int[] iArr, int i5, boolean z5) {
        super(z5);
        this.zzb = iArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
