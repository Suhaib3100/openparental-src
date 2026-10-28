package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzhz extends zzfb implements RandomAccess {
    private static final Object[] zza;
    private static final zzhz zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzhz(objArr, 0, false);
    }

    zzhz() {
        this(zza, 0, true);
    }

    public static zzhz zze() {
        return zzb;
    }

    private static int zzg(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i4) {
        return q.a(ProtectedSandApp.s("\ud81d"), i4, ProtectedSandApp.s("\ud81e"), this.zzd);
    }

    private final void zzi(int i4) {
        if (i4 < 0 || i4 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzh(i4));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzh(i4));
        }
        int i6 = i4 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i5 < length) {
            System.arraycopy(objArr, i4, objArr, i6, i5 - i4);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i4);
            System.arraycopy(this.zzc, i4, objArr2, i6, this.zzd - i4);
            this.zzc = objArr2;
        }
        this.zzc[i4] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i4 = this.zzd;
        if (i4 != list.size()) {
            return false;
        }
        if (!(obj instanceof zzhz)) {
            for (int i5 = 0; i5 < i4; i5++) {
                if (!this.zzc[i5].equals(list.get(i5))) {
                    return false;
                }
            }
            return true;
        }
        zzhz zzhzVar = (zzhz) obj;
        for (int i6 = 0; i6 < i4; i6++) {
            if (!this.zzc[i6].equals(zzhzVar.zzc[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        zzi(i4);
        return this.zzc[i4];
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = this.zzd;
        int i5 = 1;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 = (i5 * 31) + this.zzc[i6].hashCode();
        }
        return i5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        zza();
        zzi(i4);
        Object[] objArr = this.zzc;
        Object obj = objArr[i4];
        if (i4 < this.zzd - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        zza();
        zzi(i4);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgu
    public final /* bridge */ /* synthetic */ zzgu zzd(int i4) {
        if (i4 >= this.zzd) {
            return new zzhz(i4 == 0 ? zza : Arrays.copyOf(this.zzc, i4), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzf(int i4) {
        int length = this.zzc.length;
        if (i4 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i4, 10)];
            return;
        }
        while (length < i4) {
            length = zzg(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhz(Object[] objArr, int i4, boolean z4) {
        super(z4);
        this.zzc = objArr;
        this.zzd = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i4 = this.zzd;
        int length = this.zzc.length;
        if (i4 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
