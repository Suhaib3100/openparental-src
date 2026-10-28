package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzje extends zzie<Double> implements zzkc<Double>, zzlo, RandomAccess {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzje(dArr, 0, false);
    }

    zzje() {
        this(zza, 0, true);
    }

    private static int zzd(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    private final String zze(int i4) {
        return q.a(ProtectedSandApp.s("풹"), i4, ProtectedSandApp.s("풺"), this.zzc);
    }

    private final void zzf(int i4) {
        if (i4 < 0 || i4 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i4));
        }
        double[] dArr = this.zzb;
        if (i5 < dArr.length) {
            System.arraycopy(dArr, i4, dArr, i4 + 1, i5 - i4);
        } else {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i4);
            System.arraycopy(this.zzb, i4, dArr2, i4 + 1, this.zzc - i4);
            this.zzb = dArr2;
        }
        this.zzb[i4] = doubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzjv.zza(collection);
        if (!(collection instanceof zzje)) {
            return super.addAll(collection);
        }
        zzje zzjeVar = (zzje) collection;
        int i4 = zzjeVar.zzc;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        double[] dArr = this.zzb;
        if (i6 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i6);
        }
        System.arraycopy(zzjeVar.zzb, 0, this.zzb, this.zzc, zzjeVar.zzc);
        this.zzc = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzje)) {
            return super.equals(obj);
        }
        zzje zzjeVar = (zzje) obj;
        if (this.zzc != zzjeVar.zzc) {
            return false;
        }
        double[] dArr = zzjeVar.zzb;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            if (Double.doubleToLongBits(this.zzb[i4]) != Double.doubleToLongBits(dArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        return Double.valueOf(zzb(i4));
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i4 = (i4 * 31) + zzjv.zza(Double.doubleToLongBits(this.zzb[i5]));
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.zzb[i4] == doubleValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i4) {
        zza();
        zzf(i4);
        double[] dArr = this.zzb;
        double d5 = dArr[i4];
        if (i4 < this.zzc - 1) {
            System.arraycopy(dArr, i4 + 1, dArr, i4, (r3 - i4) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        zza();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("풻"));
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i5, dArr, i4, this.zzc - i5);
        this.zzc -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i4, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzf(i4);
        double[] dArr = this.zzb;
        double d5 = dArr[i4];
        dArr[i4] = doubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final /* synthetic */ zzkc<Double> zza(int i4) {
        if (i4 >= this.zzc) {
            return new zzje(i4 == 0 ? zza : Arrays.copyOf(this.zzb, i4), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzb(int i4) {
        zzf(i4);
        return this.zzb[i4];
    }

    final void zzc(int i4) {
        double[] dArr = this.zzb;
        if (i4 <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.zzb = new double[Math.max(i4, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i4) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzje(double[] dArr, int i4, boolean z4) {
        super(z4);
        this.zzb = dArr;
        this.zzc = i4;
    }

    public final void zza(double d5) {
        zza();
        int i4 = this.zzc;
        double[] dArr = this.zzb;
        if (i4 == dArr.length) {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, this.zzc);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        dArr3[i5] = d5;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
