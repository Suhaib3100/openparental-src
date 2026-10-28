package android.content.preferences.protobuf;

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
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f7439a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f7440b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    private static final int f7441c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f7442d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f7443e;

    /* renamed from: f, reason: collision with root package name */
    public static final z f7444f;

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface a extends k<Boolean> {
        @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
        k<Boolean> a(int i5);

        boolean getBoolean(int i5);

        void i0(boolean z5);

        boolean setBoolean(int i5, boolean z5);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface b extends k<Double> {
        @Override // 
        k<Double> a(int i5);

        double getDouble(int i5);

        void o0(double d6);

        double setDouble(int i5, double d6);
    }

    /* compiled from: Internal.java */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal.java */
    public interface d<T extends c> {
        T a(int i5);
    }

    /* compiled from: Internal.java */
    public interface e {
        boolean a(int i5);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface f extends k<Float> {
        @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
        k<Float> a(int i5);

        float getFloat(int i5);

        void m(float f6);

        float setFloat(int i5, float f6);
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface g extends k<Integer> {
        void D(int i5);

        @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
        k<Integer> a(int i5);

        int getInt(int i5);

        int setInt(int i5, int i6);
    }

    /* compiled from: Internal.java */
    public static class h<F, T> extends AbstractList<T> {

        /* renamed from: o, reason: collision with root package name */
        private final List<F> f7445o;

        /* renamed from: p, reason: collision with root package name */
        private final a<F, T> f7446p;

        /* compiled from: Internal.java */
        public interface a<F, T> {
            T a(F f6);
        }

        public h(List<F> list, a<F, T> aVar) {
            this.f7445o = list;
            this.f7446p = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i5) {
            return (T) this.f7446p.a(this.f7445o.get(i5));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7445o.size();
        }
    }

    /* compiled from: Internal.java */
    /* loaded from: classes3.dex */
    public interface i extends k<Long> {
        @Override // androidx.datastore.preferences.protobuf.o1.k, androidx.datastore.preferences.protobuf.o1.b
        k<Long> a(int i5);

        void e0(long j5);

        long getLong(int i5);

        long setLong(int i5, long j5);
    }

    /* compiled from: Internal.java */
    public static class j<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: o, reason: collision with root package name */
        private final Map<K, RealValue> f7447o;

        /* renamed from: p, reason: collision with root package name */
        private final b<RealValue, V> f7448p;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Internal.java */
        /* loaded from: classes3.dex */
        static class a<T> implements b<Integer, T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f7449a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f7450b;

            a(d dVar, c cVar) {
                this.f7449a = dVar;
                this.f7450b = cVar;
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Integer; */
            @Override // androidx.datastore.preferences.protobuf.o1.j.b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Integer b(c cVar) {
                return Integer.valueOf(cVar.getNumber());
            }

            /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Integer;)TT; */
            @Override // androidx.datastore.preferences.protobuf.o1.j.b
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public c a(Integer num) {
                c a6 = this.f7449a.a(num.intValue());
                return a6 == null ? this.f7450b : a6;
            }
        }

        /* compiled from: Internal.java */
        public interface b<A, B> {
            B a(A a6);

            A b(B b6);
        }

        /* compiled from: Internal.java */
        private class c implements Map.Entry<K, V> {

            /* renamed from: o, reason: collision with root package name */
            private final Map.Entry<K, RealValue> f7451o;

            public c(Map.Entry<K, RealValue> entry) {
                this.f7451o = entry;
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
                return this.f7451o.getKey();
            }

            @Override // java.util.Map.Entry
            public V getValue() {
                return (V) j.this.f7448p.a(this.f7451o.getValue());
            }

            @Override // java.util.Map.Entry
            public int hashCode() {
                return this.f7451o.hashCode();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Map.Entry
            public V setValue(V v5) {
                Object value = this.f7451o.setValue(j.this.f7448p.b(v5));
                if (value == null) {
                    return null;
                }
                return (V) j.this.f7448p.a(value);
            }
        }

        /* compiled from: Internal.java */
        private class d implements Iterator<Map.Entry<K, V>> {

            /* renamed from: o, reason: collision with root package name */
            private final Iterator<Map.Entry<K, RealValue>> f7453o;

            public d(Iterator<Map.Entry<K, RealValue>> it) {
                this.f7453o = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return new c(this.f7453o.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f7453o.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f7453o.remove();
            }
        }

        /* compiled from: Internal.java */
        private class e extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: o, reason: collision with root package name */
            private final Set<Map.Entry<K, RealValue>> f7455o;

            public e(Set<Map.Entry<K, RealValue>> set) {
                this.f7455o = set;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new d(this.f7455o.iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return this.f7455o.size();
            }
        }

        public j(Map<K, RealValue> map, b<RealValue, V> bVar) {
            this.f7447o = map;
            this.f7448p = bVar;
        }

        public static <T extends c> b<Integer, T> d(d<T> dVar, T t5) {
            return new a(dVar, t5);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new e(this.f7447o.entrySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            RealValue realvalue = this.f7447o.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f7448p.a(realvalue);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k5, V v5) {
            Object put = this.f7447o.put(k5, this.f7448p.b(v5));
            if (put == null) {
                return null;
            }
            return (V) this.f7448p.a(put);
        }
    }

    /* compiled from: Internal.java */
    public interface k<E> extends List<E>, RandomAccess {
        k<E> a(int i5);

        boolean m1();

        void w();
    }

    static {
        byte[] bArr = new byte[0];
        f7442d = bArr;
        f7443e = ByteBuffer.wrap(bArr);
        f7444f = z.p(bArr);
    }

    private o1() {
    }

    public static byte[] a(String str) {
        return str.getBytes(f7440b);
    }

    public static ByteBuffer b(String str) {
        return ByteBuffer.wrap(a(str));
    }

    public static w c(String str) {
        return w.x(str.getBytes(f7440b));
    }

    static <T> T d(T t5) {
        t5.getClass();
        return t5;
    }

    static <T> T e(T t5, String str) {
        if (t5 != null) {
            return t5;
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
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!Arrays.equals(list.get(i5), list2.get(i5))) {
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
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!h(list.get(i5), list2.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public static <T extends h2> T j(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (T) method.invoke(method, new Object[0]);
        } catch (Exception e6) {
            throw new RuntimeException("Failed to get default instance for " + cls, e6);
        }
    }

    public static int k(boolean z5) {
        return z5 ? 1231 : 1237;
    }

    public static int l(List<byte[]> list) {
        Iterator<byte[]> it = list.iterator();
        int i5 = 1;
        while (it.hasNext()) {
            i5 = (i5 * 31) + m(it.next());
        }
        return i5;
    }

    public static int m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    static int n(byte[] bArr, int i5, int i6) {
        int w5 = w(i6, bArr, i5, i6);
        if (w5 == 0) {
            return 1;
        }
        return w5;
    }

    public static int o(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int w5 = w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (w5 == 0) {
                return 1;
            }
            return w5;
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
        int i5 = 1;
        while (it.hasNext()) {
            i5 = (i5 * 31) + o(it.next());
        }
        return i5;
    }

    public static int q(c cVar) {
        return cVar.getNumber();
    }

    public static int r(List<? extends c> list) {
        Iterator<? extends c> it = list.iterator();
        int i5 = 1;
        while (it.hasNext()) {
            i5 = (i5 * 31) + it.next().getNumber();
        }
        return i5;
    }

    public static int s(long j5) {
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static boolean t(w wVar) {
        return wVar.L();
    }

    public static boolean u(byte[] bArr) {
        return n4.t(bArr);
    }

    static Object v(Object obj, Object obj2) {
        return ((h2) obj).n().H((h2) obj2).N0();
    }

    static int w(int i5, byte[] bArr, int i6, int i7) {
        for (int i8 = i6; i8 < i6 + i7; i8++) {
            i5 = (i5 * 31) + bArr[i8];
        }
        return i5;
    }

    public static String x(String str) {
        return new String(str.getBytes(f7440b), f7439a);
    }

    public static byte[] y(String str) {
        return str.getBytes(f7439a);
    }

    public static String z(byte[] bArr) {
        return new String(bArr, f7439a);
    }
}
