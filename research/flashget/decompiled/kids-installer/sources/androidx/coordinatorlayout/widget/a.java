package androidx.coordinatorlayout.widget;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.i;
import androidx.core.util.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: DirectedAcyclicGraph.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final p.a<ArrayList<T>> f3946a = new p.b(10);

    /* renamed from: b, reason: collision with root package name */
    private final i<T, ArrayList<T>> f3947b = new i<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f3948c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f3949d = new HashSet<>();

    private void e(T t5, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t5)) {
            return;
        }
        if (hashSet.contains(t5)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t5);
        ArrayList<T> arrayList2 = this.f3947b.get(t5);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                e(arrayList2.get(i5), arrayList, hashSet);
            }
        }
        hashSet.remove(t5);
        arrayList.add(t5);
    }

    @o0
    private ArrayList<T> f() {
        ArrayList<T> b6 = this.f3946a.b();
        return b6 == null ? new ArrayList<>() : b6;
    }

    private void k(@o0 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3946a.a(arrayList);
    }

    public void a(@o0 T t5, @o0 T t6) {
        if (!this.f3947b.containsKey(t5) || !this.f3947b.containsKey(t6)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f3947b.get(t5);
        if (arrayList == null) {
            arrayList = f();
            this.f3947b.put(t5, arrayList);
        }
        arrayList.add(t6);
    }

    public void b(@o0 T t5) {
        if (this.f3947b.containsKey(t5)) {
            return;
        }
        this.f3947b.put(t5, null);
    }

    public void c() {
        int size = this.f3947b.size();
        for (int i5 = 0; i5 < size; i5++) {
            ArrayList<T> q5 = this.f3947b.q(i5);
            if (q5 != null) {
                k(q5);
            }
        }
        this.f3947b.clear();
    }

    public boolean d(@o0 T t5) {
        return this.f3947b.containsKey(t5);
    }

    @q0
    public List g(@o0 T t5) {
        return this.f3947b.get(t5);
    }

    @q0
    public List<T> h(@o0 T t5) {
        int size = this.f3947b.size();
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            ArrayList<T> q5 = this.f3947b.q(i5);
            if (q5 != null && q5.contains(t5)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3947b.l(i5));
            }
        }
        return arrayList;
    }

    @o0
    public ArrayList<T> i() {
        this.f3948c.clear();
        this.f3949d.clear();
        int size = this.f3947b.size();
        for (int i5 = 0; i5 < size; i5++) {
            e(this.f3947b.l(i5), this.f3948c, this.f3949d);
        }
        return this.f3948c;
    }

    public boolean j(@o0 T t5) {
        int size = this.f3947b.size();
        for (int i5 = 0; i5 < size; i5++) {
            ArrayList<T> q5 = this.f3947b.q(i5);
            if (q5 != null && q5.contains(t5)) {
                return true;
            }
        }
        return false;
    }

    int l() {
        return this.f3947b.size();
    }
}
