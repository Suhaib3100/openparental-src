package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import zc.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzck extends zzcf implements NavigableSet, zzda {
    final transient Comparator zza;

    @a
    transient zzck zzb;

    zzck(Comparator comparator) {
        this.zza = comparator;
    }

    static zzcv zzs(Comparator comparator) {
        if (zzcq.zza.equals(comparator)) {
            return zzcv.zzc;
        }
        int i4 = zzcc.zzd;
        return new zzcv(zzct.zza, comparator);
    }

    @a
    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @a
    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @a
    public Object ceiling(Object obj) {
        obj.getClass();
        return zzcl.zza(zzr(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.android.gms.internal.fido.zzda
    public final Comparator comparator() {
        return this.zza;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    @a
    public Object floor(Object obj) {
        obj.getClass();
        return zzcn.zza(zzo(obj, true).descendingIterator(), null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzo(obj, false);
    }

    @Override // java.util.NavigableSet
    @a
    public Object higher(Object obj) {
        obj.getClass();
        return zzcl.zza(zzr(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    @a
    public Object lower(Object obj) {
        obj.getClass();
        return zzcn.zza(zzo(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @a
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @a
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzr(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzcf, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdc iterator();

    abstract zzck zzf();

    @Override // java.util.NavigableSet
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final zzck descendingSet() {
        zzck zzckVar = this.zzb;
        if (zzckVar != null) {
            return zzckVar;
        }
        zzck zzf = zzf();
        this.zzb = zzf;
        zzf.zzb = this;
        return zzf;
    }

    abstract zzck zzo(Object obj, boolean z4);

    @Override // java.util.NavigableSet
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] */
    public final zzck subSet(Object obj, boolean z4, Object obj2, boolean z5) {
        obj.getClass();
        obj2.getClass();
        zzbm.zzc(this.zza.compare(obj, obj2) <= 0);
        return zzq(obj, z4, obj2, z5);
    }

    abstract zzck zzq(Object obj, boolean z4, Object obj2, boolean z5);

    abstract zzck zzr(Object obj, boolean z4);

    @Override // java.util.NavigableSet
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public abstract zzdc descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z4) {
        obj.getClass();
        return zzo(obj, z4);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z4) {
        obj.getClass();
        return zzr(obj, z4);
    }
}
