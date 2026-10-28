package h4;

import java.util.ArrayList;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes5.dex */
public final class a extends ArrayList<n> implements m {
    public a(int i5) {
        super(i5);
    }

    public /* bridge */ boolean b(n nVar) {
        return super.contains(nVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof n) {
            return super.contains((n) obj);
        }
        return false;
    }

    public /* bridge */ int f() {
        return super.size();
    }

    public /* bridge */ int i(n nVar) {
        return super.indexOf(nVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof n) {
            return super.indexOf((n) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof n) {
            return super.lastIndexOf((n) obj);
        }
        return -1;
    }

    public /* bridge */ int o(n nVar) {
        return super.lastIndexOf(nVar);
    }

    public /* bridge */ boolean p(n nVar) {
        return super.remove(nVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof n) {
            return super.remove((n) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return super.size();
    }
}
