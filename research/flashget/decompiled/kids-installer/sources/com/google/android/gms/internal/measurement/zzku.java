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
final class zzku extends zzjl implements RandomAccess, zzli, zzmp {
    private static final zzku zza = new zzku(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    zzku() {
        this(new float[10], 0, true);
    }

    private final String zzf(int i5) {
        return v.a(ProtectedSandApp.s("⎎"), i5, ProtectedSandApp.s("⎏"), this.zzc);
    }

    private final void zzg(int i5) {
        if (i5 < 0 || i5 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i5, Object obj) {
        int i6;
        float floatValue = ((Float) obj).floatValue();
        zzbW();
        if (i5 < 0 || i5 > (i6 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i5));
        }
        float[] fArr = this.zzb;
        if (i6 < fArr.length) {
            System.arraycopy(fArr, i5, fArr, i5 + 1, i6 - i5);
        } else {
            float[] fArr2 = new float[q.a(i6, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            System.arraycopy(this.zzb, i5, fArr2, i5 + 1, this.zzc - i5);
            this.zzb = fArr2;
        }
        this.zzb[i5] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbW();
        byte[] bArr = zzlj.zzd;
        collection.getClass();
        if (!(collection instanceof zzku)) {
            return super.addAll(collection);
        }
        zzku zzkuVar = (zzku) collection;
        int i5 = zzkuVar.zzc;
        if (i5 == 0) {
            return false;
        }
        int i6 = this.zzc;
        if (Integer.MAX_VALUE - i6 < i5) {
            throw new OutOfMemoryError();
        }
        int i7 = i6 + i5;
        float[] fArr = this.zzb;
        if (i7 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i7);
        }
        System.arraycopy(zzkuVar.zzb, 0, this.zzb, this.zzc, zzkuVar.zzc);
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
        if (!(obj instanceof zzku)) {
            return super.equals(obj);
        }
        zzku zzkuVar = (zzku) obj;
        if (this.zzc != zzkuVar.zzc) {
            return false;
        }
        float[] fArr = zzkuVar.zzb;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            if (Float.floatToIntBits(this.zzb[i5]) != Float.floatToIntBits(fArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i5) {
        zzg(i5);
        return Float.valueOf(this.zzb[i5]);
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i6 = 0; i6 < this.zzc; i6++) {
            i5 = (i5 * 31) + Float.floatToIntBits(this.zzb[i6]);
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i5 = this.zzc;
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zzb[i6] == floatValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i5) {
        zzbW();
        zzg(i5);
        float[] fArr = this.zzb;
        float f6 = fArr[i5];
        if (i5 < this.zzc - 1) {
            System.arraycopy(fArr, i5 + 1, fArr, i5, (r2 - i5) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i5, int i6) {
        zzbW();
        if (i6 < i5) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("⎐"));
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i6, fArr, i5, this.zzc - i6);
        this.zzc -= i6 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i5, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzbW();
        zzg(i5);
        float[] fArr = this.zzb;
        float f6 = fArr[i5];
        fArr[i5] = floatValue;
        return Float.valueOf(f6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i5) {
        if (i5 >= this.zzc) {
            return new zzku(Arrays.copyOf(this.zzb, i5), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f6) {
        zzbW();
        int i5 = this.zzc;
        float[] fArr = this.zzb;
        if (i5 == fArr.length) {
            float[] fArr2 = new float[q.a(i5, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i6 = this.zzc;
        this.zzc = i6 + 1;
        fArr3[i6] = f6;
    }

    private zzku(float[] fArr, int i5, boolean z5) {
        super(z5);
        this.zzb = fArr;
        this.zzc = i5;
    }

    @Override // com.google.android.gms.internal.measurement.zzjl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }
}
