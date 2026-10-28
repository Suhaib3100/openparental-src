package android.content.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes3.dex */
public class t1 extends c<String> implements u1, RandomAccess {

    /* renamed from: r, reason: collision with root package name */
    private static final t1 f7522r;

    /* renamed from: s, reason: collision with root package name */
    public static final u1 f7523s;

    /* renamed from: q, reason: collision with root package name */
    private final List<Object> f7524q;

    /* compiled from: LazyStringArrayList.java */
    /* loaded from: classes.dex */
    private static class a extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: o, reason: collision with root package name */
        private final t1 f7525o;

        a(t1 t1Var) {
            this.f7525o = t1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(int i5, byte[] bArr) {
            this.f7525o.s(i5, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public byte[] get(int i5) {
            return this.f7525o.G(i5);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public byte[] remove(int i5) {
            String remove = this.f7525o.remove(i5);
            ((AbstractList) this).modCount++;
            return t1.t(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public byte[] set(int i5, byte[] bArr) {
            Object E = this.f7525o.E(i5, bArr);
            ((AbstractList) this).modCount++;
            return t1.t(E);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7525o.size();
        }
    }

    /* compiled from: LazyStringArrayList.java */
    /* loaded from: classes.dex */
    private static class b extends AbstractList<w> implements RandomAccess {

        /* renamed from: o, reason: collision with root package name */
        private final t1 f7526o;

        b(t1 t1Var) {
            this.f7526o = t1Var;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(int i5, w wVar) {
            this.f7526o.q(i5, wVar);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public w get(int i5) {
            return this.f7526o.k(i5);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w remove(int i5) {
            String remove = this.f7526o.remove(i5);
            ((AbstractList) this).modCount++;
            return t1.u(remove);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public w set(int i5, w wVar) {
            Object C = this.f7526o.C(i5, wVar);
            ((AbstractList) this).modCount++;
            return t1.u(C);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7526o.size();
        }
    }

    static {
        t1 t1Var = new t1();
        f7522r = t1Var;
        t1Var.w();
        f7523s = t1Var;
    }

    public t1() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object C(int i5, w wVar) {
        b();
        return this.f7524q.set(i5, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object E(int i5, byte[] bArr) {
        b();
        return this.f7524q.set(i5, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(int i5, w wVar) {
        b();
        this.f7524q.add(i5, wVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s(int i5, byte[] bArr) {
        b();
        this.f7524q.add(i5, bArr);
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] t(Object obj) {
        return obj instanceof byte[] ? (byte[]) obj : obj instanceof String ? o1.y((String) obj) : ((w) obj).f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w u(Object obj) {
        return obj instanceof w ? (w) obj : obj instanceof String ? w.z((String) obj) : w.x((byte[]) obj);
    }

    private static String v(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof w ? ((w) obj).p0() : o1.z((byte[]) obj);
    }

    static t1 x() {
        return f7522r;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public String remove(int i5) {
        b();
        Object remove = this.f7524q.remove(i5);
        ((AbstractList) this).modCount++;
        return v(remove);
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public String set(int i5, String str) {
        b();
        return v(this.f7524q.set(i5, str));
    }

    @Override // android.content.preferences.protobuf.u1
    public void B0(u1 u1Var) {
        b();
        for (Object obj : u1Var.j()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.f7524q.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f7524q.add(obj);
            }
        }
    }

    @Override // android.content.preferences.protobuf.u1
    public void F(w wVar) {
        b();
        this.f7524q.add(wVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.preferences.protobuf.u1
    public byte[] G(int i5) {
        Object obj = this.f7524q.get(i5);
        byte[] t5 = t(obj);
        if (t5 != obj) {
            this.f7524q.set(i5, t5);
        }
        return t5;
    }

    @Override // android.content.preferences.protobuf.f3
    public List<w> R0() {
        return new b(this);
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // android.content.preferences.protobuf.u1
    public void b0(int i5, w wVar) {
        C(i5, wVar);
    }

    @Override // android.content.preferences.protobuf.u1
    public Object b1(int i5) {
        return this.f7524q.get(i5);
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        b();
        this.f7524q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.u1
    public void d(byte[] bArr) {
        b();
        this.f7524q.add(bArr);
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.u1
    public boolean d0(Collection<byte[]> collection) {
        b();
        boolean addAll = this.f7524q.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // android.content.preferences.protobuf.u1
    public void g0(int i5, byte[] bArr) {
        E(i5, bArr);
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // android.content.preferences.protobuf.u1
    public List<?> j() {
        return Collections.unmodifiableList(this.f7524q);
    }

    @Override // android.content.preferences.protobuf.u1
    public w k(int i5) {
        Object obj = this.f7524q.get(i5);
        w u5 = u(obj);
        if (u5 != obj) {
            this.f7524q.set(i5, u5);
        }
        return u5;
    }

    @Override // android.content.preferences.protobuf.u1
    public List<byte[]> k0() {
        return new a(this);
    }

    @Override // android.content.preferences.protobuf.u1
    public u1 l() {
        return m1() ? new l4(this) : this;
    }

    @Override // android.content.preferences.protobuf.u1
    public boolean l0(Collection<? extends w> collection) {
        b();
        boolean addAll = this.f7524q.addAll(collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // android.content.preferences.protobuf.c, androidx.datastore.preferences.protobuf.o1.k
    public /* bridge */ /* synthetic */ boolean m1() {
        return super.m1();
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void add(int i5, String str) {
        b();
        this.f7524q.add(i5, str);
        ((AbstractList) this).modCount++;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7524q.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public String get(int i5) {
        Object obj = this.f7524q.get(i5);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            String p02 = wVar.p0();
            if (wVar.L()) {
                this.f7524q.set(i5, p02);
            }
            return p02;
        }
        byte[] bArr = (byte[]) obj;
        String z5 = o1.z(bArr);
        if (n4.t(bArr)) {
            this.f7524q.set(i5, z5);
        }
        return z5;
    }

    @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public t1 a2(int i5) {
        if (i5 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i5);
        arrayList.addAll(this.f7524q);
        return new t1((ArrayList<Object>) arrayList);
    }

    public t1(int i5) {
        this((ArrayList<Object>) new ArrayList(i5));
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i5, Collection<? extends String> collection) {
        b();
        if (collection instanceof u1) {
            collection = ((u1) collection).j();
        }
        boolean addAll = this.f7524q.addAll(i5, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // android.content.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public t1(u1 u1Var) {
        this.f7524q = new ArrayList(u1Var.size());
        addAll(u1Var);
    }

    public t1(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    private t1(ArrayList<Object> arrayList) {
        this.f7524q = arrayList;
    }
}
