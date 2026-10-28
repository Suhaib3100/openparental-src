package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzjs extends zzie<Float> implements zzkc<Float>, zzlo, RandomAccess {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzjs(fArr, 0, false);
    }

    zzjs() {
        this(zza, 0, true);
    }

    private static int zzd(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    private final String zze(int i4) {
        return q.a(ProtectedSandApp.s("퓿"), i4, ProtectedSandApp.s("픀"), this.zzc);
    }

    private final void zzf(int i4) {
        if (i4 < 0 || i4 >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i4));
        }
        float[] fArr = this.zzb;
        if (i5 < fArr.length) {
            System.arraycopy(fArr, i4, fArr, i4 + 1, i5 - i4);
        } else {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i4);
            System.arraycopy(this.zzb, i4, fArr2, i4 + 1, this.zzc - i4);
            this.zzb = fArr2;
        }
        this.zzb[i4] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zza();
        zzjv.zza(collection);
        if (!(collection instanceof zzjs)) {
            return super.addAll(collection);
        }
        zzjs zzjsVar = (zzjs) collection;
        int i4 = zzjsVar.zzc;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.zzc;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        float[] fArr = this.zzb;
        if (i6 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i6);
        }
        System.arraycopy(zzjsVar.zzb, 0, this.zzb, this.zzc, zzjsVar.zzc);
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
        if (!(obj instanceof zzjs)) {
            return super.equals(obj);
        }
        zzjs zzjsVar = (zzjs) obj;
        if (this.zzc != zzjsVar.zzc) {
            return false;
        }
        float[] fArr = zzjsVar.zzb;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            if (Float.floatToIntBits(this.zzb[i4]) != Float.floatToIntBits(fArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        return Float.valueOf(zzb(i4));
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.zzc; i5++) {
            i4 = (i4 * 31) + Float.floatToIntBits(this.zzb[i5]);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.zzb[i4] == floatValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i4) {
        zza();
        zzf(i4);
        float[] fArr = this.zzb;
        float f4 = fArr[i4];
        if (i4 < this.zzc - 1) {
            System.arraycopy(fArr, i4 + 1, fArr, i4, (r2 - i4) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i4, int i5) {
        zza();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("픁"));
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i5, fArr, i4, this.zzc - i5);
        this.zzc -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i4, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzf(i4);
        float[] fArr = this.zzb;
        float f4 = fArr[i4];
        fArr[i4] = floatValue;
        return Float.valueOf(f4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final /* synthetic */ zzkc<Float> zza(int i4) {
        if (i4 >= this.zzc) {
            return new zzjs(i4 == 0 ? zza : Arrays.copyOf(this.zzb, i4), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzb(int i4) {
        zzf(i4);
        return this.zzb[i4];
    }

    final void zzc(int i4) {
        float[] fArr = this.zzb;
        if (i4 <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.zzb = new float[Math.max(i4, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i4) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzjs(float[] fArr, int i4, boolean z4) {
        super(z4);
        this.zzb = fArr;
        this.zzc = i4;
    }

    public final void zza(float f4) {
        zza();
        int i4 = this.zzc;
        float[] fArr = this.zzb;
        if (i4 == fArr.length) {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, this.zzc);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        fArr3[i5] = f4;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
