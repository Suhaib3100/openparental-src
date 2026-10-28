package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* compiled from: TileList.java */
/* loaded from: classes.dex */
class j0<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f9334a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a<T>> f9335b = new SparseArray<>(10);

    /* renamed from: c, reason: collision with root package name */
    a<T> f9336c;

    /* compiled from: TileList.java */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f9337a;

        /* renamed from: b, reason: collision with root package name */
        public int f9338b;

        /* renamed from: c, reason: collision with root package name */
        public int f9339c;

        /* renamed from: d, reason: collision with root package name */
        a<T> f9340d;

        public a(Class<T> cls, int i5) {
            this.f9337a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i5));
        }

        boolean a(int i5) {
            int i6 = this.f9338b;
            return i6 <= i5 && i5 < i6 + this.f9339c;
        }

        T b(int i5) {
            return this.f9337a[i5 - this.f9338b];
        }
    }

    public j0(int i5) {
        this.f9334a = i5;
    }

    public a<T> a(a<T> aVar) {
        int indexOfKey = this.f9335b.indexOfKey(aVar.f9338b);
        if (indexOfKey < 0) {
            this.f9335b.put(aVar.f9338b, aVar);
            return null;
        }
        a<T> valueAt = this.f9335b.valueAt(indexOfKey);
        this.f9335b.setValueAt(indexOfKey, aVar);
        if (this.f9336c == valueAt) {
            this.f9336c = aVar;
        }
        return valueAt;
    }

    public void b() {
        this.f9335b.clear();
    }

    public a<T> c(int i5) {
        if (i5 < 0 || i5 >= this.f9335b.size()) {
            return null;
        }
        return this.f9335b.valueAt(i5);
    }

    public T d(int i5) {
        a<T> aVar = this.f9336c;
        if (aVar == null || !aVar.a(i5)) {
            int indexOfKey = this.f9335b.indexOfKey(i5 - (i5 % this.f9334a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f9336c = this.f9335b.valueAt(indexOfKey);
        }
        return this.f9336c.b(i5);
    }

    public a<T> e(int i5) {
        a<T> aVar = this.f9335b.get(i5);
        if (this.f9336c == aVar) {
            this.f9336c = null;
        }
        this.f9335b.delete(i5);
        return aVar;
    }

    public int f() {
        return this.f9335b.size();
    }
}
