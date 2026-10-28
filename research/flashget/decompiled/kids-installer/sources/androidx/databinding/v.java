package androidx.databinding;

import androidx.databinding.y;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: ObservableArrayList.java */
/* loaded from: classes3.dex */
public class v<T> extends ArrayList<T> implements y<T> {

    /* renamed from: o, reason: collision with root package name */
    private transient s f6924o = new s();

    private void b(int i5, int i6) {
        s sVar = this.f6924o;
        if (sVar != null) {
            sVar.x(this, i5, i6);
        }
    }

    private void f(int i5, int i6) {
        s sVar = this.f6924o;
        if (sVar != null) {
            sVar.z(this, i5, i6);
        }
    }

    @Override // androidx.databinding.y
    public void J0(y.a aVar) {
        if (this.f6924o == null) {
            this.f6924o = new s();
        }
        this.f6924o.a(aVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t5) {
        super.add(t5);
        b(size() - 1, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            b(size, size() - size);
        }
        return addAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            f(0, size);
        }
    }

    @Override // androidx.databinding.y
    public void n(y.a aVar) {
        s sVar = this.f6924o;
        if (sVar != null) {
            sVar.o(aVar);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i5) {
        T t5 = (T) super.remove(i5);
        f(i5, 1);
        return t5;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected void removeRange(int i5, int i6) {
        super.removeRange(i5, i6);
        f(i5, i6 - i5);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i5, T t5) {
        T t6 = (T) super.set(i5, t5);
        s sVar = this.f6924o;
        if (sVar != null) {
            sVar.w(this, i5, 1);
        }
        return t6;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i5, T t5) {
        super.add(i5, t5);
        b(i5, 1);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i5, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i5, collection);
        if (addAll) {
            b(i5, collection.size());
        }
        return addAll;
    }
}
