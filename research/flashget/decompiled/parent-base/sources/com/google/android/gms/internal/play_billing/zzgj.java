package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzgj extends zzfb implements RandomAccess, zzgu {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzgj(fArr, 0, false);
    }

    zzgj() {
        this(zza, 0, true);
    }

    private static int zzh(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    private final String zzi(int i4) {
        return q.a(ProtectedSandApp.s("ퟠ"), i4, ProtectedSandApp.s("ퟡ"), this.zzc);
    }

    private final void zzj(int i4) {
        if (i4 < 0 || i4 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i4));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzi(i4));
        }
        int i6 = i4 + 1;
        float[] fArr = this.zzb;
        int length = fArr.length;
        if (i5 < length) {
            System.arraycopy(fArr, i4, fArr, i6, i5 - i4);
        } else {
            float[] fArr2 = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i4);
            System.arraycopy(this.zzb, i4, fArr2, i6, this.zzc - i4);
            this.zzb = fArr2;
        }
        this.zzb[i4] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        collection.getClass();
        if (!(collection instanceof zzgj)) {
            return super.addAll(collection);
        }
        zzgj zzgjVar = (zzgj) collection;
        int i4 = zzgjVar.zzc;
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
        System.arraycopy(zzgjVar.zzb, 0, this.zzb, this.zzc, zzgjVar.zzc);
        this.zzc = i6;
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
        if (!(obj instanceof zzgj)) {
            return super.equals(obj);
        }
        zzgj zzgjVar = (zzgj) obj;
        if (this.zzc != zzgjVar.zzc) {
            return false;
        }
        float[] fArr = zzgjVar.zzb;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            if (Float.floatToIntBits(this.zzb[i4]) != Float.floatToIntBits(fArr[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        zzj(i4);
        return Float.valueOf(this.zzb[i4]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.Collection, java.util.List
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
        int i4 = this.zzc;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.zzb[i5] == floatValue) {
                return i5;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        zza();
        zzj(i4);
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
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("ퟢ"));
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i5, fArr, i4, this.zzc - i5);
        this.zzc -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzj(i4);
        float[] fArr = this.zzb;
        float f4 = fArr[i4];
        fArr[i4] = floatValue;
        return Float.valueOf(f4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgu
    public final /* bridge */ /* synthetic */ zzgu zzd(int i4) {
        if (i4 >= this.zzc) {
            return new zzgj(i4 == 0 ? zza : Arrays.copyOf(this.zzb, i4), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i4) {
        zzj(i4);
        return this.zzb[i4];
    }

    public final void zzf(float f4) {
        zza();
        int i4 = this.zzc;
        int length = this.zzb.length;
        if (i4 == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i5 = this.zzc;
        this.zzc = i5 + 1;
        fArr2[i5] = f4;
    }

    final void zzg(int i4) {
        int length = this.zzb.length;
        if (i4 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new float[Math.max(i4, 10)];
            return;
        }
        while (length < i4) {
            length = zzh(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzgj(float[] fArr, int i4, boolean z4) {
        super(z4);
        this.zzb = fArr;
        this.zzc = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
