package android.content.preferences.protobuf;

import android.content.preferences.protobuf.h2;
import android.content.preferences.protobuf.q4;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* compiled from: MapEntryLite.java */
/* loaded from: classes.dex */
public class a2<K, V> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f7171d = 1;

    /* renamed from: e, reason: collision with root package name */
    private static final int f7172e = 2;

    /* renamed from: a, reason: collision with root package name */
    private final b<K, V> f7173a;

    /* renamed from: b, reason: collision with root package name */
    private final K f7174b;

    /* renamed from: c, reason: collision with root package name */
    private final V f7175c;

    /* compiled from: MapEntryLite.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7176a;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7176a = iArr;
            try {
                iArr[q4.b.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7176a[q4.b.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7176a[q4.b.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: MapEntryLite.java */
    static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final q4.b f7177a;

        /* renamed from: b, reason: collision with root package name */
        public final K f7178b;

        /* renamed from: c, reason: collision with root package name */
        public final q4.b f7179c;

        /* renamed from: d, reason: collision with root package name */
        public final V f7180d;

        public b(q4.b bVar, K k5, q4.b bVar2, V v5) {
            this.f7177a = bVar;
            this.f7178b = k5;
            this.f7179c = bVar2;
            this.f7180d = v5;
        }
    }

    private a2(q4.b bVar, K k5, q4.b bVar2, V v5) {
        this.f7173a = new b<>(bVar, k5, bVar2, v5);
        this.f7174b = k5;
        this.f7175c = v5;
    }

    static <K, V> int b(b<K, V> bVar, K k5, V v5) {
        return c1.o(bVar.f7177a, 1, k5) + c1.o(bVar.f7179c, 2, v5);
    }

    public static <K, V> a2<K, V> f(q4.b bVar, K k5, q4.b bVar2, V v5) {
        return new a2<>(bVar, k5, bVar2, v5);
    }

    static <K, V> Map.Entry<K, V> h(z zVar, b<K, V> bVar, s0 s0Var) throws IOException {
        Object obj = bVar.f7178b;
        Object obj2 = bVar.f7180d;
        while (true) {
            int Y = zVar.Y();
            if (Y == 0) {
                break;
            }
            if (Y == q4.c(1, bVar.f7177a.getWireType())) {
                obj = i(zVar, s0Var, bVar.f7177a, obj);
            } else if (Y == (bVar.f7179c.getWireType() | 16)) {
                obj2 = i(zVar, s0Var, bVar.f7179c, obj2);
            } else if (!zVar.g0(Y)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    static <T> T i(z zVar, s0 s0Var, q4.b bVar, T t5) throws IOException {
        int i5 = a.f7176a[bVar.ordinal()];
        if (i5 == 1) {
            h2.a n5 = ((h2) t5).n();
            zVar.I(n5, s0Var);
            return (T) n5.N0();
        }
        if (i5 == 2) {
            return (T) Integer.valueOf(zVar.z());
        }
        if (i5 != 3) {
            return (T) c1.N(zVar, bVar, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    static <K, V> void l(CodedOutputStream codedOutputStream, b<K, V> bVar, K k5, V v5) throws IOException {
        c1.R(codedOutputStream, bVar.f7177a, 1, k5);
        c1.R(codedOutputStream, bVar.f7179c, 2, v5);
    }

    public int a(int i5, K k5, V v5) {
        int X0 = CodedOutputStream.X0(i5);
        int b6 = b(this.f7173a, k5, v5);
        return CodedOutputStream.Z0(b6) + b6 + X0;
    }

    public K c() {
        return this.f7174b;
    }

    b<K, V> d() {
        return this.f7173a;
    }

    public V e() {
        return this.f7175c;
    }

    public Map.Entry<K, V> g(w wVar, s0 s0Var) throws IOException {
        return h(wVar.O(), this.f7173a, s0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(b2<K, V> b2Var, z zVar, s0 s0Var) throws IOException {
        int t5 = zVar.t(zVar.N());
        b<K, V> bVar = this.f7173a;
        Object obj = bVar.f7178b;
        Object obj2 = bVar.f7180d;
        while (true) {
            int Y = zVar.Y();
            if (Y == 0) {
                break;
            }
            if (Y == q4.c(1, this.f7173a.f7177a.getWireType())) {
                obj = i(zVar, s0Var, this.f7173a.f7177a, obj);
            } else if (Y == (this.f7173a.f7179c.getWireType() | 16)) {
                obj2 = i(zVar, s0Var, this.f7173a.f7179c, obj2);
            } else if (!zVar.g0(Y)) {
                break;
            }
        }
        zVar.a(0);
        zVar.s(t5);
        b2Var.put(obj, obj2);
    }

    public void k(CodedOutputStream codedOutputStream, int i5, K k5, V v5) throws IOException {
        codedOutputStream.g2(i5, 2);
        codedOutputStream.h2(b(this.f7173a, k5, v5));
        l(codedOutputStream, this.f7173a, k5, v5);
    }

    private a2(b<K, V> bVar, K k5, V v5) {
        this.f7173a = bVar;
        this.f7174b = k5;
        this.f7175c = v5;
    }
}
