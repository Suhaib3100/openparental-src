package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i2;
import androidx.content.preferences.protobuf.t4;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: MapEntryLite.java */
/* loaded from: classes3.dex */
public class b2<K, V> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f28634d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f28635e = 2;

    /* renamed from: a, reason: collision with root package name */
    private final b<K, V> f28636a;

    /* renamed from: b, reason: collision with root package name */
    private final K f28637b;

    /* renamed from: c, reason: collision with root package name */
    private final V f28638c;

    /* compiled from: MapEntryLite.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28639a;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28639a = iArr;
            try {
                iArr[t4.b.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28639a[t4.b.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28639a[t4.b.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MapEntryLite.java */
    static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final t4.b f28640a;

        /* renamed from: b, reason: collision with root package name */
        public final K f28641b;

        /* renamed from: c, reason: collision with root package name */
        public final t4.b f28642c;

        /* renamed from: d, reason: collision with root package name */
        public final V f28643d;

        public b(t4.b bVar, K k4, t4.b bVar2, V v4) {
            this.f28640a = bVar;
            this.f28641b = k4;
            this.f28642c = bVar2;
            this.f28643d = v4;
        }
    }

    private b2(t4.b bVar, K k4, t4.b bVar2, V v4) {
        this.f28636a = new b<>(bVar, k4, bVar2, v4);
        this.f28637b = k4;
        this.f28638c = v4;
    }

    static <K, V> int b(b<K, V> bVar, K k4, V v4) {
        return c1.o(bVar.f28640a, 1, k4) + c1.o(bVar.f28642c, 2, v4);
    }

    public static <K, V> b2<K, V> f(t4.b bVar, K k4, t4.b bVar2, V v4) {
        return new b2<>(bVar, k4, bVar2, v4);
    }

    static <K, V> Map.Entry<K, V> h(z zVar, b<K, V> bVar, s0 s0Var) throws IOException {
        Object obj = bVar.f28641b;
        Object obj2 = bVar.f28643d;
        while (true) {
            int Y = zVar.Y();
            if (Y == 0) {
                break;
            }
            if (Y == t4.c(1, bVar.f28640a.getWireType())) {
                obj = i(zVar, s0Var, bVar.f28640a, obj);
            } else if (Y == (bVar.f28642c.getWireType() | 16)) {
                obj2 = i(zVar, s0Var, bVar.f28642c, obj2);
            } else if (!zVar.g0(Y)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    static <T> T i(z zVar, s0 s0Var, t4.b bVar, T t4) throws IOException {
        int i4 = a.f28639a[bVar.ordinal()];
        if (i4 == 1) {
            i2.a q4 = ((i2) t4).q();
            zVar.I(q4, s0Var);
            return (T) q4.l1();
        }
        if (i4 == 2) {
            return (T) Integer.valueOf(zVar.z());
        }
        if (i4 != 3) {
            return (T) c1.N(zVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void l(CodedOutputStream codedOutputStream, b<K, V> bVar, K k4, V v4) throws IOException {
        c1.R(codedOutputStream, bVar.f28640a, 1, k4);
        c1.R(codedOutputStream, bVar.f28642c, 2, v4);
    }

    public int a(int i4, K k4, V v4) {
        int X0 = CodedOutputStream.X0(i4);
        int b5 = b(this.f28636a, k4, v4);
        return CodedOutputStream.Z0(b5) + b5 + X0;
    }

    public K c() {
        return this.f28637b;
    }

    b<K, V> d() {
        return this.f28636a;
    }

    public V e() {
        return this.f28638c;
    }

    public Map.Entry<K, V> g(w wVar, s0 s0Var) throws IOException {
        return h(wVar.S(), this.f28636a, s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(c2<K, V> c2Var, z zVar, s0 s0Var) throws IOException {
        int t4 = zVar.t(zVar.N());
        b<K, V> bVar = this.f28636a;
        Object obj = bVar.f28641b;
        Object obj2 = bVar.f28643d;
        while (true) {
            int Y = zVar.Y();
            if (Y == 0) {
                break;
            }
            if (Y == t4.c(1, this.f28636a.f28640a.getWireType())) {
                obj = i(zVar, s0Var, this.f28636a.f28640a, obj);
            } else if (Y == (this.f28636a.f28642c.getWireType() | 16)) {
                obj2 = i(zVar, s0Var, this.f28636a.f28642c, obj2);
            } else if (!zVar.g0(Y)) {
                break;
            }
        }
        zVar.a(0);
        zVar.s(t4);
        c2Var.put(obj, obj2);
    }

    public void k(CodedOutputStream codedOutputStream, int i4, K k4, V v4) throws IOException {
        codedOutputStream.g2(i4, 2);
        codedOutputStream.h2(b(this.f28636a, k4, v4));
        l(codedOutputStream, this.f28636a, k4, v4);
    }

    private b2(b<K, V> bVar, K k4, V v4) {
        this.f28636a = bVar;
        this.f28637b = k4;
        this.f28638c = v4;
    }
}
