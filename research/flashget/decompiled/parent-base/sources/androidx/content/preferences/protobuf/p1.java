package androidx.content.preferences.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: Internal.java */
/* loaded from: classes3.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f28847a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f28848b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    private static final int f28849c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f28850d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f28851e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f28852f;

    /* compiled from: Internal.java */
    public interface a extends k<Boolean> {
        boolean C(int i4, boolean z4);

        boolean J(int i4);

        void N0(boolean z4);

        @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
        k<Boolean> e(int i4);
    }

    /* compiled from: Internal.java */
    public interface b extends k<Double> {
        double E(int i4, double d5);

        void V2(double d5);

        @Override // 
        k<Double> e(int i4);

        double getDouble(int i4);
    }

    /* compiled from: Internal.java */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal.java */
    public interface d<T extends c> {
        T a(int i4);
    }

    /* compiled from: Internal.java */
    public interface e {
        boolean a(int i4);
    }

    /* compiled from: Internal.java */
    public interface f extends k<Float> {
        void Y(float f4);

        @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
        k<Float> e(int i4);

        float getFloat(int i4);

        float z(int i4, float f4);
    }

    /* compiled from: Internal.java */
    public interface g extends k<Integer> {
        @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
        k<Integer> e(int i4);

        int getInt(int i4);

        void o2(int i4);

        int t(int i4, int i5);
    }

    /* compiled from: Internal.java */
    public static class h<F, T> extends AbstractList<T> {

        /* renamed from: b, reason: collision with root package name */
        private final List<F> f28853b;

        /* renamed from: c, reason: collision with root package name */
        private final a<F, T> f28854c;

        /* compiled from: Internal.java */
        public interface a<F, T> {
            T a(F f4);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f28853b = list;
            this.f28854c = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i4) {
            return (T) this.f28854c.a(this.f28853b.get(i4));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f28853b.size();
        }
    }

    /* compiled from: Internal.java */
    public interface i extends k<Long> {
        void D2(long j4);

        long M(int i4, long j4);

        @Override // androidx.datastore.preferences.protobuf.p1.k, androidx.datastore.preferences.protobuf.p1.b
        k<Long> e(int i4);

        long getLong(int i4);
    }

    /* compiled from: Internal.java */
    public static class j<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final Map<K, RealValue> f28855b;

        /* renamed from: c, reason: collision with root package name */
        private final b<RealValue, V> f28856c;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Internal.java */
        static class a<T> implements b<Integer, T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f28857a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f28858b;

            a(d dVar, c cVar) {
                this.f28857a = dVar;
                this.f28858b = cVar;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // androidx.datastore.preferences.protobuf.p1.j.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer b(c cVar) {
                return Integer.valueOf(cVar.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // androidx.datastore.preferences.protobuf.p1.j.b
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public c a(Integer num) {
                c a5 = this.f28857a.a(num.intValue());
                return a5 == null ? this.f28858b : a5;
            }
        }

        /* compiled from: Internal.java */
        public interface b<A, B> {
            B a(A a5);

            A b(B b5);
        }

        /* compiled from: Internal.java */
        private class c implements Map.Entry<K, V> {

            /* renamed from: b, reason: collision with root package name */
            private final Map.Entry<K, RealValue> f28859b;

            public c(Map.Entry<K, RealValue> entry) {
                this.f28859b = entry;
            }

            @Override // java.util.Map.Entry
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    return getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public K getKey() {
                return this.f28859b.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) j.this.f28856c.a(this.f28859b.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f28859b.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v4) {
                Object value = this.f28859b.setValue(j.this.f28856c.b(v4));
                if (value == null) {
                    return null;
                }
                return (V) j.this.f28856c.a(value);
            }
        }

        /* compiled from: Internal.java */
        private class d implements Iterator<Map.Entry<K, V>> {

            /* renamed from: b, reason: collision with root package name */
            private final Iterator<Map.Entry<K, RealValue>> f28861b;

            public d(Iterator<Map.Entry<K, RealValue>> it) {
                this.f28861b = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return new c(this.f28861b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f28861b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f28861b.remove();
            }
        }

        /* compiled from: Internal.java */
        private class e extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: b, reason: collision with root package name */
            private final Set<Map.Entry<K, RealValue>> f28863b;

            public e(Set<Map.Entry<K, RealValue>> set) {
                this.f28863b = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f28863b.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f28863b.size();
            }
        }

        public j(Map<K, RealValue> map, b<RealValue, V> bVar) {
            this.f28855b = map;
            this.f28856c = bVar;
        }

        public static <T extends c> b<Integer, T> c(d<T> dVar, T t4) {
            return new a(dVar, t4);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f28855b.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.f28855b.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f28856c.a(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k4, V v4) {
            Object put = this.f28855b.put(k4, this.f28856c.b(v4));
            if (put == null) {
                return null;
            }
            return (V) this.f28856c.a(put);
        }
    }

    /* compiled from: Internal.java */
    public interface k<E> extends List<E>, RandomAccess {
        boolean S1();

        void c0();

        k<E> e(int i4);
    }

    static {
        byte[] bArr = new byte[0];
        f28850d = bArr;
        f28851e = ByteBuffer.wrap(bArr);
        f28852f = z.r(bArr, 0, bArr.length, false);
    }

    private p1() {
    }

    public static byte[] a(String str) {
        return str.getBytes(f28848b);
    }

    public static ByteBuffer b(String str) {
        return ByteBuffer.wrap(str.getBytes(f28848b));
    }

    public static w c(String str) {
        return w.w(str.getBytes(f28848b));
    }

    static <T> T d(T t4) {
        t4.getClass();
        return t4;
    }

    static <T> T e(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    public static ByteBuffer f(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean g(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!Arrays.equals(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    public static boolean i(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!h(list.get(i4), list2.get(i4))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends i2> T j(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e4) {
            throw new RuntimeException(o1.a("Failed to get default instance for ", cls), e4);
        }
    }

    public static int k(boolean z4) {
        return z4 ? 1231 : 1237;
    }

    public static int l(List<byte[]> list) {
        int i4 = 1;
        for (byte[] bArr : list) {
            i4 = (i4 * 31) + n(bArr, 0, bArr.length);
        }
        return i4;
    }

    public static int m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    static int n(byte[] bArr, int i4, int i5) {
        int w4 = w(i5, bArr, i4, i5);
        if (w4 == 0) {
            return 1;
        }
        return w4;
    }

    public static int o(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int w4 = w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (w4 == 0) {
                return 1;
            }
            return w4;
        }
        int capacity = byteBuffer.capacity() <= 4096 ? byteBuffer.capacity() : 4096;
        byte[] bArr = new byte[capacity];
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        int capacity2 = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= capacity ? duplicate.remaining() : capacity;
            duplicate.get(bArr, 0, remaining);
            capacity2 = w(capacity2, bArr, 0, remaining);
        }
        if (capacity2 == 0) {
            return 1;
        }
        return capacity2;
    }

    public static int p(List<ByteBuffer> list) {
        Iterator<ByteBuffer> it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            i4 = (i4 * 31) + o(it.next());
        }
        return i4;
    }

    public static int q(c cVar) {
        return cVar.getNumber();
    }

    public static int r(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            i4 = (i4 * 31) + it.next().getNumber();
        }
        return i4;
    }

    public static int s(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static boolean t(w wVar) {
        return wVar.P();
    }

    public static boolean u(byte[] bArr) {
        return q4.t(bArr);
    }

    static Object v(Object obj, Object obj2) {
        return ((i2) obj).q().Q((i2) obj2).l1();
    }

    static int w(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    public static String x(String str) {
        return new String(str.getBytes(f28848b), f28847a);
    }

    public static byte[] y(String str) {
        return str.getBytes(f28847a);
    }

    public static String z(byte[] bArr) {
        return new String(bArr, f28847a);
    }
}
