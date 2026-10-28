package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes6.dex */
public class l extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: p, reason: collision with root package name */
    public static final m f25754p = new u(new l());

    /* renamed from: o, reason: collision with root package name */
    private final List<Object> f25755o;

    public l() {
        this.f25755o = new ArrayList();
    }

    private static d f(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.o((String) obj) : d.h((byte[]) obj);
    }

    private static String g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).E() : i.b((byte[]) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i5, String str) {
        this.f25755o.add(i5, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f25755o.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i5) {
        Object obj = this.f25755o.get(i5);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String E = dVar.E();
            if (dVar.t()) {
                this.f25755o.set(i5, E);
            }
            return E;
        }
        byte[] bArr = (byte[]) obj;
        String b6 = i.b(bArr);
        if (v.e(bArr)) {
            this.f25755o.set(i5, b6);
        }
        return b6;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i5) {
        Object remove = this.f25755o.remove(i5);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void i1(d dVar) {
        this.f25755o.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> j() {
        return Collections.unmodifiableList(this.f25755o);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d k(int i5) {
        Object obj = this.f25755o.get(i5);
        d f6 = f(obj);
        if (f6 != obj) {
            this.f25755o.set(i5, f6);
        }
        return f6;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m l() {
        return new u(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public String set(int i5, String str) {
        return g(this.f25755o.set(i5, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f25755o.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i5, Collection<? extends String> collection) {
        if (collection instanceof m) {
            collection = ((m) collection).j();
        }
        boolean addAll = this.f25755o.addAll(i5, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public l(m mVar) {
        this.f25755o = new ArrayList(mVar.size());
        addAll(mVar);
    }
}
