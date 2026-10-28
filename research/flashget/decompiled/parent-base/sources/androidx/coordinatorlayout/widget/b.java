package androidx.coordinatorlayout.widget;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a3;
import androidx.core.util.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final v.a<ArrayList<T>> f25348a = new v.b(10);

    /* renamed from: b, reason: collision with root package name */
    private final a3<T, ArrayList<T>> f25349b = new a3<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f25350c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f25351d = new HashSet<>();

    private void e(T t4, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t4)) {
            return;
        }
        if (hashSet.contains(t4)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t4);
        ArrayList<T> arrayList2 = this.f25349b.get(t4);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                e(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(t4);
        arrayList.add(t4);
    }

    @o0
    private ArrayList<T> f() {
        ArrayList<T> acquire = this.f25348a.acquire();
        return acquire == null ? new ArrayList<>() : acquire;
    }

    private void k(@o0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f25348a.release(arrayList);
    }

    public void a(@o0 T t4, @o0 T t5) {
        if (!this.f25349b.containsKey(t4) || !this.f25349b.containsKey(t5)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f25349b.get(t4);
        if (arrayList == null) {
            arrayList = f();
            this.f25349b.put(t4, arrayList);
        }
        arrayList.add(t5);
    }

    public void b(@o0 T t4) {
        if (this.f25349b.containsKey(t4)) {
            return;
        }
        this.f25349b.put(t4, null);
    }

    public void c() {
        int size = this.f25349b.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> valueAt = this.f25349b.valueAt(i4);
            if (valueAt != null) {
                k(valueAt);
            }
        }
        this.f25349b.clear();
    }

    public boolean d(@o0 T t4) {
        return this.f25349b.containsKey(t4);
    }

    @q0
    public List g(@o0 T t4) {
        return this.f25349b.get(t4);
    }

    @q0
    public List<T> h(@o0 T t4) {
        int size = this.f25349b.getSize();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> valueAt = this.f25349b.valueAt(i4);
            if (valueAt != null && valueAt.contains(t4)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f25349b.keyAt(i4));
            }
        }
        return arrayList;
    }

    @o0
    public ArrayList<T> i() {
        this.f25350c.clear();
        this.f25351d.clear();
        int size = this.f25349b.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            e(this.f25349b.keyAt(i4), this.f25350c, this.f25351d);
        }
        return this.f25350c;
    }

    public boolean j(@o0 T t4) {
        int size = this.f25349b.getSize();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> valueAt = this.f25349b.valueAt(i4);
            if (valueAt != null && valueAt.contains(t4)) {
                return true;
            }
        }
        return false;
    }

    int l() {
        return this.f25349b.getSize();
    }
}
