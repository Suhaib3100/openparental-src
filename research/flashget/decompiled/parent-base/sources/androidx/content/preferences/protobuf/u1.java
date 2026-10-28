package androidx.content.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes3.dex */
public class u1 extends c<String> implements v1, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    private static final u1 f28986e;

    /* renamed from: f, reason: collision with root package name */
    public static final v1 f28987f;

    /* renamed from: d, reason: collision with root package name */
    private final List<Object> f28988d;

    /* compiled from: LazyStringArrayList.java */
    private static class a extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        private final u1 f28989b;

        a(u1 u1Var) {
            this.f28989b = u1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(int i4, byte[] bArr) {
            this.f28989b.q(i4, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] get(int i4) {
            return this.f28989b.A0(i4);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int i4) {
            String remove = this.f28989b.remove(i4);
            ((AbstractList) this).modCount++;
            return u1.r(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public byte[] set(int i4, byte[] bArr) {
            Object H = this.f28989b.H(i4, bArr);
            ((AbstractList) this).modCount++;
            return u1.r(H);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28989b.size();
        }
    }

    /* compiled from: LazyStringArrayList.java */
    private static class b extends AbstractList<w> implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        private final u1 f28990b;

        b(u1 u1Var) {
            this.f28990b = u1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(int i4, w wVar) {
            this.f28990b.m(i4, wVar);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public w get(int i4) {
            return this.f28990b.B(i4);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public w remove(int i4) {
            String remove = this.f28990b.remove(i4);
            ((AbstractList) this).modCount++;
            return u1.s(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public w set(int i4, w wVar) {
            Object G = this.f28990b.G(i4, wVar);
            ((AbstractList) this).modCount++;
            return u1.s(G);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28990b.size();
        }
    }

    static {
        u1 u1Var = new u1();
        f28986e = u1Var;
        u1Var.c0();
        f28987f = u1Var;
    }

    public u1() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object G(int i4, w wVar) {
        b();
        return this.f28988d.set(i4, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object H(int i4, byte[] bArr) {
        b();
        return this.f28988d.set(i4, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(int i4, w wVar) {
        b();
        this.f28988d.add(i4, wVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i4, byte[] bArr) {
        b();
        this.f28988d.add(i4, bArr);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] r(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? p1.y((String) obj) : ((w) obj).i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w s(Object obj) {
        return obj instanceof w ? (w) obj : obj instanceof String ? w.A((String) obj) : w.w((byte[]) obj);
    }

    private static String v(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof w)) {
            return p1.z((byte[]) obj);
        }
        w wVar = (w) obj;
        wVar.getClass();
        return wVar.l0(p1.f28847a);
    }

    static u1 w() {
        return f28986e;
    }

    @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public u1 e2(int i4) {
        if (i4 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i4);
        arrayList.addAll(this.f28988d);
        return new u1((ArrayList<Object>) arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.v1
    public byte[] A0(int i4) {
        Object obj = this.f28988d.get(i4);
        byte[] r4 = r(obj);
        if (r4 != obj) {
            this.f28988d.set(i4, r4);
        }
        return r4;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public w B(int i4) {
        Object obj = this.f28988d.get(i4);
        w s4 = s(obj);
        if (s4 != obj) {
            this.f28988d.set(i4, s4);
        }
        return s4;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void C0(int i4, w wVar) {
        G(i4, wVar);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public String remove(int i4) {
        b();
        Object remove = this.f28988d.remove(i4);
        ((AbstractList) this).modCount++;
        return v(remove);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public Object D3(int i4) {
        return this.f28988d.get(i4);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public String set(int i4, String str) {
        b();
        return v(this.f28988d.set(i4, str));
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void G2(int i4, byte[] bArr) {
        H(i4, bArr);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public boolean H0(Collection<byte[]> collection) {
        b();
        boolean addAll = this.f28988d.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public v1 N() {
        return S1() ? new o4(this) : this;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public boolean R2(Collection<? extends w> collection) {
        b();
        boolean addAll = this.f28988d.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public List<byte[]> S0() {
        return new a(this);
    }

    @Override // androidx.content.preferences.protobuf.c, androidx.datastore.preferences.protobuf.p1.k
    public /* bridge */ /* synthetic */ boolean S1() {
        return super.S1();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f28988d.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void g1(v1 v1Var) {
        b();
        for (Object obj : v1Var.y()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f28988d.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f28988d.add(obj);
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void add(int i4, String str) {
        b();
        this.f28988d.add(i4, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28988d.size();
    }

    @Override // androidx.content.preferences.protobuf.i3
    public List<w> t1() {
        return new b(this);
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void u(byte[] bArr) {
        b();
        this.f28988d.add(bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public void w2(w wVar) {
        b();
        this.f28988d.add(wVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public String get(int i4) {
        Object obj = this.f28988d.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof w)) {
            byte[] bArr = (byte[]) obj;
            String z4 = p1.z(bArr);
            if (q4.t(bArr)) {
                this.f28988d.set(i4, z4);
            }
            return z4;
        }
        w wVar = (w) obj;
        wVar.getClass();
        String l02 = wVar.l0(p1.f28847a);
        if (wVar.P()) {
            this.f28988d.set(i4, l02);
        }
        return l02;
    }

    @Override // androidx.content.preferences.protobuf.v1
    public List<?> y() {
        return Collections.unmodifiableList(this.f28988d);
    }

    public u1(int i4) {
        this((ArrayList<Object>) new ArrayList(i4));
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection<? extends String> collection) {
        b();
        if (collection instanceof v1) {
            collection = ((v1) collection).y();
        }
        boolean addAll = this.f28988d.addAll(i4, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public u1(v1 v1Var) {
        this.f28988d = new ArrayList(v1Var.size());
        addAll(v1Var);
    }

    public u1(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    private u1(ArrayList<Object> arrayList) {
        this.f28988d = arrayList;
    }
}
