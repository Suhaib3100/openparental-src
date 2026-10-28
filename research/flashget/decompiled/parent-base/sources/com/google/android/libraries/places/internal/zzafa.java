package com.google.android.libraries.places.internal;

import androidx.content.preferences.protobuf.r;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzafa extends zzacd implements RandomAccess {
    private static final zzafa zza;
    private Object[] zzb;
    private int zzc;

    static {
        zzafa zzafaVar = new zzafa(new Object[0], 0);
        zza = zzafaVar;
        zzafaVar.zzb();
    }

    zzafa() {
        this(new Object[10], 0);
    }

    public static zzafa zzd() {
        return zza;
    }

    private final String zze(int i4) {
        int i5 = this.zzc;
        StringBuilder sb = new StringBuilder(35);
        sb.append(ProtectedSandApp.s("\ue7c2"));
        sb.append(i4);
        sb.append(ProtectedSandApp.s("\ue7c3"));
        sb.append(i5);
        return sb.toString();
    }

    private final void zzg(int i4) {
        if (i4 < 0 || i4 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i4));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i4));
        }
        Object[] objArr = this.zzb;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
        } else {
            Object[] objArr2 = new Object[r.a(i5, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i4);
            System.arraycopy(this.zzb, i4, objArr2, i4 + 1, this.zzc - i4);
            this.zzb = objArr2;
        }
        this.zzb[i4] = obj;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        zzg(i4);
        return this.zzb[i4];
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        zza();
        zzg(i4);
        Object[] objArr = this.zzb;
        Object obj = objArr[i4];
        if (i4 < this.zzc - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        zza();
        zzg(i4);
        Object[] objArr = this.zzb;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzadr
    public final /* bridge */ /* synthetic */ zzadr zzf(int i4) {
        if (i4 >= this.zzc) {
            return new zzafa(Arrays.copyOf(this.zzb, i4), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    private zzafa(Object[] objArr, int i4) {
        this.zzb = objArr;
        this.zzc = i4;
    }

    @Override // com.google.android.libraries.places.internal.zzacd, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i4 = this.zzc;
        Object[] objArr = this.zzb;
        if (i4 == objArr.length) {
            this.zzb = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
