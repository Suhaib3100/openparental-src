package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.p4;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* compiled from: ForwardingSortedMap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class l2<K, V> extends b2<K, V> implements SortedMap<K, V> {

    /* compiled from: ForwardingSortedMap.java */
    @d9.a
    protected class a extends p4.g0<K, V> {
        public a(l2 l2Var) {
            super((Map) l2Var);
        }
    }

    protected l2() {
    }

    static int T3(@zc.a Comparator<?> comparator, @zc.a Object obj, @zc.a Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.b2
    @d9.a
    protected boolean E3(@zc.a Object obj) {
        try {
            return T3(comparator(), tailMap(obj).firstKey(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b2
    /* renamed from: R3 */
    public abstract SortedMap<K, V> u3();

    @d9.a
    protected SortedMap<K, V> S3(K k4, K k5) {
        com.google.common.base.l0.e(T3(comparator(), k4, k5) <= 0, ProtectedSandApp.s("\uf4bb"));
        return tailMap(k4).headMap(k5);
    }

    @Override // java.util.SortedMap
    @zc.a
    public Comparator<? super K> comparator() {
        return u3().comparator();
    }

    @Override // java.util.SortedMap
    @f5
    public K firstKey() {
        return u3().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@f5 K k4) {
        return u3().headMap(k4);
    }

    @Override // java.util.SortedMap
    @f5
    public K lastKey() {
        return u3().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@f5 K k4, @f5 K k5) {
        return u3().subMap(k4, k5);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@f5 K k4) {
        return u3().tailMap(k4);
    }
}
