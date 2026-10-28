package com.google.android.gms.internal.location;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* loaded from: classes5.dex */
public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {
    private static final zzbv<Object> zza = new zzbq(zzbt.zza, 0);

    zzbs() {
    }

    public static <E> zzbs<E> zzi() {
        return (zzbs<E>) zzbt.zza;
    }

    public static <E> zzbs<E> zzj(Collection<? extends E> collection) {
        if (collection instanceof zzbp) {
            zzbs<E> zze = ((zzbp) collection).zze();
            if (!zze.zzf()) {
                return zze;
            }
            Object[] array = zze.toArray();
            return zzk(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (array2[i4] == null) {
                throw new NullPointerException(a.a(20, ProtectedSandApp.s("톀"), i4));
            }
        }
        return zzk(array2, length);
    }

    static <E> zzbs<E> zzk(Object[] objArr, int i4) {
        return i4 == 0 ? (zzbs<E>) zzbt.zza : new zzbt(objArr, i4);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i4, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i4 = 0; i4 < size; i4++) {
                        if (zzbl.zza(get(i4), list.get(i4))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzbl.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzbp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i4, E e4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    /* renamed from: zza */
    public final zzbu<E> iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final zzbs<E> zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    int zzg(Object[] objArr, int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzbs<E> subList(int i4, int i5) {
        zzbm.zzc(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? (zzbs<E>) zzbt.zza : new zzbr(this, i4, i6);
    }

    @Override // java.util.List
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final zzbv<E> listIterator(int i4) {
        zzbm.zzb(i4, size(), ProtectedSandApp.s("톁"));
        return isEmpty() ? (zzbv<E>) zza : new zzbq(this, i4);
    }
}
