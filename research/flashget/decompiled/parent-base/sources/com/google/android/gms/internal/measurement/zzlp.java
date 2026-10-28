package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzlp<E> extends zzie<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzlp<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzlp<>(objArr, 0, false);
    }

    zzlp() {
        this(zza, 0, true);
    }

    private static int zzc(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    public static <E> zzlp<E> zzd() {
        return (zzlp<E>) zzb;
    }

    private final void zze(int i4) {
        if (i4 < 0 || i4 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzd(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final void add(int i4, E e4) {
        int i5;
        zza();
        if (i4 < 0 || i4 > (i5 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzd(i4));
        }
        E[] eArr = this.zzc;
        if (i5 < eArr.length) {
            System.arraycopy(eArr, i4, eArr, i4 + 1, i5 - i4);
        } else {
            E[] eArr2 = (E[]) new Object[zzc(eArr.length)];
            System.arraycopy(this.zzc, 0, eArr2, 0, i4);
            System.arraycopy(this.zzc, i4, eArr2, i4 + 1, this.zzd - i4);
            this.zzc = eArr2;
        }
        this.zzc[i4] = e4;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i4) {
        zze(i4);
        return this.zzc[i4];
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final E remove(int i4) {
        zza();
        zze(i4);
        E[] eArr = this.zzc;
        E e4 = eArr[i4];
        if (i4 < this.zzd - 1) {
            System.arraycopy(eArr, i4 + 1, eArr, i4, (r2 - i4) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e4;
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.List
    public final E set(int i4, E e4) {
        zza();
        zze(i4);
        E[] eArr = this.zzc;
        E e5 = eArr[i4];
        eArr[i4] = e4;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzkc
    public final /* synthetic */ zzkc zza(int i4) {
        if (i4 >= this.zzd) {
            return new zzlp(i4 == 0 ? zza : Arrays.copyOf(this.zzc, i4), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    final void zzb(int i4) {
        E[] eArr = this.zzc;
        if (i4 <= eArr.length) {
            return;
        }
        if (eArr.length == 0) {
            this.zzc = (E[]) new Object[Math.max(i4, 10)];
            return;
        }
        int length = eArr.length;
        while (length < i4) {
            length = zzc(length);
        }
        this.zzc = (E[]) Arrays.copyOf(this.zzc, length);
    }

    private zzlp(E[] eArr, int i4, boolean z4) {
        super(z4);
        this.zzc = eArr;
        this.zzd = i4;
    }

    private final String zzd(int i4) {
        return q.a(ProtectedSandApp.s("핁"), i4, ProtectedSandApp.s("핂"), this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzie, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e4) {
        zza();
        int i4 = this.zzd;
        E[] eArr = this.zzc;
        if (i4 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzc(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i5 = this.zzd;
        this.zzd = i5 + 1;
        eArr2[i5] = e4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
