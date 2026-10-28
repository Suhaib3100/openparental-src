package androidx.recyclerview.widget;

import android.util.SparseArray;
import androidx.annotation.o0;
import java.lang.reflect.Array;

/* compiled from: TileList.java */
/* loaded from: classes3.dex */
class j0<T> {

    /* renamed from: a, reason: collision with root package name */
    final int f33225a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a<T>> f33226b = new SparseArray<>(10);

    /* renamed from: c, reason: collision with root package name */
    a<T> f33227c;

    /* compiled from: TileList.java */
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T[] f33228a;

        /* renamed from: b, reason: collision with root package name */
        public int f33229b;

        /* renamed from: c, reason: collision with root package name */
        public int f33230c;

        /* renamed from: d, reason: collision with root package name */
        a<T> f33231d;

        a(@o0 Class<T> cls, int i4) {
            this.f33228a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i4));
        }

        boolean a(int i4) {
            int i5 = this.f33229b;
            return i5 <= i4 && i4 < i5 + this.f33230c;
        }

        T b(int i4) {
            return this.f33228a[i4 - this.f33229b];
        }
    }

    public j0(int i4) {
        this.f33225a = i4;
    }

    public a<T> a(a<T> aVar) {
        int indexOfKey = this.f33226b.indexOfKey(aVar.f33229b);
        if (indexOfKey < 0) {
            this.f33226b.put(aVar.f33229b, aVar);
            return null;
        }
        a<T> valueAt = this.f33226b.valueAt(indexOfKey);
        this.f33226b.setValueAt(indexOfKey, aVar);
        if (this.f33227c == valueAt) {
            this.f33227c = aVar;
        }
        return valueAt;
    }

    public void b() {
        this.f33226b.clear();
    }

    public a<T> c(int i4) {
        if (i4 < 0 || i4 >= this.f33226b.size()) {
            return null;
        }
        return this.f33226b.valueAt(i4);
    }

    public T d(int i4) {
        a<T> aVar = this.f33227c;
        if (aVar == null || !aVar.a(i4)) {
            int indexOfKey = this.f33226b.indexOfKey(i4 - (i4 % this.f33225a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f33227c = this.f33226b.valueAt(indexOfKey);
        }
        return this.f33227c.b(i4);
    }

    public a<T> e(int i4) {
        a<T> aVar = this.f33226b.get(i4);
        if (this.f33227c == aVar) {
            this.f33227c = null;
        }
        this.f33226b.delete(i4);
        return aVar;
    }

    public int f() {
        return this.f33226b.size();
    }
}
