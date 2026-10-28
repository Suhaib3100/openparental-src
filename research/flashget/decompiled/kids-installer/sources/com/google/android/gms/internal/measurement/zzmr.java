package com.google.android.gms.internal.measurement;

import android.content.preferences.protobuf.q;
import android.content.preferences.protobuf.v;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
final class zzmr extends zzjl implements RandomAccess {
    private static final zzmr zza = new zzmr(new Object[0], 0, false);
    private Object[] zzb;
    private int zzc;

    zzmr() {
        this(new Object[10], 0, true);
    }

    public static zzmr zze() {
        return zza;
    }

    private final String zzf(int i5) {
        return v.a(ProtectedSandApp.s("⎯"), i5, ProtectedSandApp.s("⎰"), this.zzc);
    }

    private final void zzg(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        zzbW();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
        Object[] objArr = this.zzb;
        if (i6 < objArr.length) {
            System.arraycopy(objArr, i5, objArr, i5 + 1, i6 - i5);
        } else {
            Object[] objArr2 = new Object[q.a(i6, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i5);
            System.arraycopy(this.zzb, i5, objArr2, i5 + 1, this.zzc - i5);
            this.zzb = objArr2;
        }
        this.zzb[i5] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        zzg(i5);
        return this.zzb[i5];
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        zzbW();
        zzg(i5);
        Object[] objArr = this.zzb;
        Object obj = objArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        zzbW();
        zzg(i5);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzmr(Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzmr(Object[] objArr, int i5, boolean z5) {
        super(z5);
        this.zzb = objArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzbW();
        int i5 = this.zzc;
        Object[] objArr = this.zzb;
        if (i5 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        objArr2[i6] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
