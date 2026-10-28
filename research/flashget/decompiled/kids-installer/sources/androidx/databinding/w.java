package androidx.databinding;

import androidx.databinding.z;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ObservableArrayMap.java */
/* loaded from: classes3.dex */
public class w<K, V> extends androidx.collection.a<K, V> implements z<K, V> {
    private transient t B;

    private void v(Object obj) {
        t tVar = this.B;
        if (tVar != null) {
            tVar.j(this, 0, obj);
        }
    }

    @Override // androidx.databinding.z
    public void a(z.a<? extends z<K, V>, K, V> aVar) {
        if (this.B == null) {
            this.B = new t();
        }
        this.B.a(aVar);
    }

    @Override // androidx.databinding.z
    public void b(z.a<? extends z<K, V>, K, V> aVar) {
        t tVar = this.B;
        if (tVar != null) {
            tVar.o(aVar);
        }
    }

    @Override // androidx.collection.i, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        v(null);
    }

    @Override // androidx.collection.i
    public V n(int i5) {
        K l5 = l(i5);
        V v5 = (V) super.n(i5);
        if (v5 != null) {
            v(l5);
        }
        return v5;
    }

    @Override // androidx.collection.i
    public V p(int i5, V v5) {
        K l5 = l(i5);
        V v6 = (V) super.p(i5, v5);
        v(l5);
        return v6;
    }

    @Override // androidx.collection.i, java.util.Map
    public V put(K k5, V v5) {
        super.put(k5, v5);
        v(k5);
        return v5;
    }

    @Override // androidx.collection.a
    public boolean t(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            int h5 = h(it.next());
            if (h5 >= 0) {
                n(h5);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // androidx.collection.a
    public boolean u(Collection<?> collection) {
        boolean z5 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(l(size))) {
                n(size);
                z5 = true;
            }
        }
        return z5;
    }
}
