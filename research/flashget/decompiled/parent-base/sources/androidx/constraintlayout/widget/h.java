package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: SharedValues.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final int f25278c = -1;

    /* renamed from: a, reason: collision with root package name */
    private SparseIntArray f25279a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<a>>> f25280b = new HashMap<>();

    /* compiled from: SharedValues.java */
    public interface a {
        void a(int key, int newValue, int oldValue);
    }

    public void a(int key, a listener) {
        HashSet<WeakReference<a>> hashSet = this.f25280b.get(Integer.valueOf(key));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f25280b.put(Integer.valueOf(key), hashSet);
        }
        hashSet.add(new WeakReference<>(listener));
    }

    public void b() {
        this.f25280b.clear();
    }

    public void c(int key, int value) {
        int i4 = this.f25279a.get(key, -1);
        if (i4 == value) {
            return;
        }
        this.f25279a.put(key, value);
        HashSet<WeakReference<a>> hashSet = this.f25280b.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<a>> it = hashSet.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.a(key, value, i4);
            } else {
                z4 = true;
            }
        }
        if (z4) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<a>> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                WeakReference<a> next = it2.next();
                if (next.get() == null) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int d(int key) {
        return this.f25279a.get(key, -1);
    }

    public void e(int key, a listener) {
        HashSet<WeakReference<a>> hashSet = this.f25280b.get(Integer.valueOf(key));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<a>> it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            a aVar = next.get();
            if (aVar == null || aVar == listener) {
                arrayList.add(next);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void f(a listener) {
        Iterator<Integer> it = this.f25280b.keySet().iterator();
        while (it.hasNext()) {
            e(it.next().intValue(), listener);
        }
    }
}
