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
final class zzlx extends zzjl implements RandomAccess, zzlh, zzmp {
    private static final zzlx zza = new zzlx(new long[0], 0, false);
    private long[] zzb;
    private int zzc;

    zzlx() {
        this(new long[10], 0, true);
    }

    public static zzlx zzf() {
        return zza;
    }

    private final String zzh(int i5) {
        return v.a(ProtectedSandApp.s("⎞"), i5, ProtectedSandApp.s("⎟"), this.zzc);
    }

    private final void zzi(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        long longValue = ((Long) obj).longValue();
        zzbW();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzh(i5));
        }
        long[] jArr = this.zzb;
        if (i6 < jArr.length) {
            System.arraycopy(jArr, i5, jArr, i5 + 1, i6 - i5);
        } else {
            long[] jArr2 = new long[q.a(i6, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            System.arraycopy(this.zzb, i5, jArr2, i5 + 1, this.zzc - i5);
            this.zzb = jArr2;
        }
        this.zzb[i5] = longValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbW();
        byte[] bArr = zzlj.zzd;
        collection.getClass();
        if (!(collection instanceof zzlx)) {
            return super.addAll(collection);
        }
        zzlx zzlxVar = (zzlx) collection;
        int i5 = zzlxVar.zzc;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzc;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        long[] jArr = this.zzb;
        if (i7 > jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i7);
        }
        System.arraycopy(zzlxVar.zzb, 0, this.zzb, this.zzc, zzlxVar.zzc);
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
        if (!(obj instanceof zzlx)) {
            return super.equals(obj);
        }
        zzlx zzlxVar = (zzlx) obj;
        if (this.zzc != zzlxVar.zzc) {
            return false;
        }
        long[] jArr = zzlxVar.zzb;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            if (this.zzb[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzi(i5);
        return Long.valueOf(this.zzb[i5]);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            long j5 = this.zzb[i6];
            byte[] bArr = zzlj.zzd;
            i5 = (i5 * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i5 = this.zzc;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzb[i6] == longValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzbW();
        zzi(i5);
        long[] jArr = this.zzb;
        long j5 = jArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i5, int i6) {
        zzbW();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("⎠"));
        }
        long[] jArr = this.zzb;
        System.arraycopy(jArr, i6, jArr, i5, this.zzc - i6);
        this.zzc -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbW();
        zzi(i5);
        long[] jArr = this.zzb;
        long j5 = jArr[i5];
        jArr[i5] = longValue;
        return Long.valueOf(j5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final long zza(int i5) {
        zzi(i5);
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzlh zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzlx(Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(long j5) {
        zzbW();
        int i5 = this.zzc;
        long[] jArr = this.zzb;
        if (i5 == jArr.length) {
            long[] jArr2 = new long[q.a(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        jArr3[i6] = j5;
    }

    private zzlx(long[] jArr, int i5, boolean z5) {
        super(z5);
        this.zzb = jArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
