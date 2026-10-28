package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes7.dex */
public class l extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f77736c = new u(new l());

    /* renamed from: b, reason: collision with root package name */
    private final List<Object> f77737b;

    public l() {
        this.f77737b = new ArrayList();
    }

    private static d c(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.j((String) obj) : d.h((byte[]) obj);
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).H() : i.b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d B(int i4) {
        Object obj = this.f77737b.get(i4);
        d c5 = c(obj);
        if (c5 != obj) {
            this.f77737b.set(i4, c5);
        }
        return c5;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void L1(d dVar) {
        this.f77737b.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m N() {
        return new u(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i4, String str) {
        this.f77737b.add(i4, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f77737b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i4) {
        Object obj = this.f77737b.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String H = dVar.H();
            if (dVar.r()) {
                this.f77737b.set(i4, H);
            }
            return H;
        }
        byte[] bArr = (byte[]) obj;
        String b5 = i.b(bArr);
        if (v.f(bArr, 0, bArr.length)) {
            this.f77737b.set(i4, b5);
        }
        return b5;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i4) {
        Object remove = this.f77737b.remove(i4);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i4, String str) {
        return f(this.f77737b.set(i4, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f77737b.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> y() {
        return Collections.unmodifiableList(this.f77737b);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection<? extends String> collection) {
        if (collection instanceof m) {
            collection = ((m) collection).y();
        }
        boolean addAll = this.f77737b.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public l(m mVar) {
        this.f77737b = new ArrayList(mVar.size());
        addAll(mVar);
    }
}
