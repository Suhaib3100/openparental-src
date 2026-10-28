package android.content.preferences.protobuf;

import android.content.preferences.protobuf.h2;
import android.content.preferences.protobuf.o1;
import android.content.preferences.protobuf.q4;
import android.content.preferences.protobuf.r1;
import androidx.datastore.preferences.protobuf.c1.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* loaded from: classes.dex */
final class c1<T extends c<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f7192d = 16;

    /* renamed from: e, reason: collision with root package name */
    private static final c1 f7193e = new c1(true);

    /* renamed from: a, reason: collision with root package name */
    private final m3<T, Object> f7194a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7195b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7196c;

    /* compiled from: FieldSet.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7197a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7198b;

        static {
            int[] iArr = new int[q4.b.values().length];
            f7198b = iArr;
            try {
                iArr[q4.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7198b[q4.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7198b[q4.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7198b[q4.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7198b[q4.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7198b[q4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7198b[q4.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7198b[q4.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7198b[q4.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7198b[q4.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7198b[q4.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7198b[q4.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7198b[q4.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7198b[q4.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7198b[q4.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7198b[q4.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7198b[q4.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7198b[q4.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[q4.c.values().length];
            f7197a = iArr2;
            try {
                iArr2[q4.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7197a[q4.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7197a[q4.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7197a[q4.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7197a[q4.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7197a[q4.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f7197a[q4.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7197a[q4.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7197a[q4.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    static final class b<T extends c<T>> {

        /* renamed from: a, reason: collision with root package name */
        private m3<T, Object> f7199a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7200b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7201c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7202d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void d() {
            if (this.f7201c) {
                return;
            }
            this.f7199a = c1.l(this.f7199a, true);
            this.f7201c = true;
        }

        public static <T extends c<T>> b<T> e(c1<T> c1Var) {
            b<T> bVar = new b<>(c1.l(((c1) c1Var).f7194a, true));
            ((b) bVar).f7200b = ((c1) c1Var).f7196c;
            return bVar;
        }

        private void o(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof r1) {
                value = ((r1) value).p();
            }
            if (key.a()) {
                Object g5 = g(key);
                if (g5 == null) {
                    g5 = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) g5).add(c1.n(it.next()));
                }
                this.f7199a.put(key, g5);
                return;
            }
            if (key.e() != q4.c.MESSAGE) {
                this.f7199a.put(key, c1.n(value));
                return;
            }
            Object g6 = g(key);
            if (g6 == null) {
                this.f7199a.put(key, c1.n(value));
            } else if (g6 instanceof h2.a) {
                key.n((h2.a) g6, (h2) value);
            } else {
                this.f7199a.put(key, key.n(((h2) g6).n(), (h2) value).build());
            }
        }

        private static Object p(Object obj) {
            return obj instanceof h2.a ? ((h2.a) obj).build() : obj;
        }

        private static <T extends c<T>> Object q(T t5, Object obj) {
            if (obj == null) {
                return obj;
            }
            if (t5.e() != q4.c.MESSAGE) {
                return obj;
            }
            if (!t5.a()) {
                return p(obj);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List list = (List) obj;
            for (int i5 = 0; i5 < list.size(); i5++) {
                Object obj2 = list.get(i5);
                Object p5 = p(obj2);
                if (p5 != obj2) {
                    if (list == obj) {
                        list = new ArrayList(list);
                    }
                    list.set(i5, p5);
                }
            }
            return list;
        }

        private static <T extends c<T>> void r(m3<T, Object> m3Var) {
            for (int i5 = 0; i5 < m3Var.n(); i5++) {
                s(m3Var.m(i5));
            }
            Iterator<Map.Entry<T, Object>> it = m3Var.q().iterator();
            while (it.hasNext()) {
                s(it.next());
            }
        }

        private static <T extends c<T>> void s(Map.Entry<T, Object> entry) {
            entry.setValue(q(entry.getKey(), entry.getValue()));
        }

        private static void v(q4.b bVar, Object obj) {
            if (c1.G(bVar, obj)) {
                return;
            }
            if (bVar.getJavaType() != q4.c.MESSAGE || !(obj instanceof h2.a)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        public void a(T t5, Object obj) {
            List list;
            d();
            if (!t5.a()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f7202d = this.f7202d || (obj instanceof h2.a);
            v(t5.b(), obj);
            Object g5 = g(t5);
            if (g5 == null) {
                list = new ArrayList();
                this.f7199a.put(t5, list);
            } else {
                list = (List) g5;
            }
            list.add(obj);
        }

        public c1<T> b() {
            if (this.f7199a.isEmpty()) {
                return c1.s();
            }
            this.f7201c = false;
            m3<T, Object> m3Var = this.f7199a;
            if (this.f7202d) {
                m3Var = c1.l(m3Var, false);
                r(m3Var);
            }
            c1<T> c1Var = new c1<>(m3Var, null);
            ((c1) c1Var).f7196c = this.f7200b;
            return c1Var;
        }

        public void c(T t5) {
            d();
            this.f7199a.remove(t5);
            if (this.f7199a.isEmpty()) {
                this.f7200b = false;
            }
        }

        public Map<T, Object> f() {
            if (!this.f7200b) {
                return this.f7199a.t() ? this.f7199a : Collections.unmodifiableMap(this.f7199a);
            }
            m3 l5 = c1.l(this.f7199a, false);
            if (this.f7199a.t()) {
                l5.u();
            } else {
                r(l5);
            }
            return l5;
        }

        public Object g(T t5) {
            return q(t5, h(t5));
        }

        Object h(T t5) {
            Object obj = this.f7199a.get(t5);
            return obj instanceof r1 ? ((r1) obj).p() : obj;
        }

        public Object i(T t5, int i5) {
            if (this.f7202d) {
                d();
            }
            return p(j(t5, i5));
        }

        Object j(T t5, int i5) {
            if (!t5.a()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object h5 = h(t5);
            if (h5 != null) {
                return ((List) h5).get(i5);
            }
            throw new IndexOutOfBoundsException();
        }

        public int k(T t5) {
            if (!t5.a()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object g5 = g(t5);
            if (g5 == null) {
                return 0;
            }
            return ((List) g5).size();
        }

        public boolean l(T t5) {
            if (t5.a()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f7199a.get(t5) != null;
        }

        public boolean m() {
            for (int i5 = 0; i5 < this.f7199a.n(); i5++) {
                if (!c1.F(this.f7199a.m(i5))) {
                    return false;
                }
            }
            Iterator<Map.Entry<T, Object>> it = this.f7199a.q().iterator();
            while (it.hasNext()) {
                if (!c1.F(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void n(c1<T> c1Var) {
            d();
            for (int i5 = 0; i5 < ((c1) c1Var).f7194a.n(); i5++) {
                o(((c1) c1Var).f7194a.m(i5));
            }
            Iterator it = ((c1) c1Var).f7194a.q().iterator();
            while (it.hasNext()) {
                o((Map.Entry) it.next());
            }
        }

        public void t(T t5, Object obj) {
            d();
            if (!t5.a()) {
                v(t5.b(), obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    v(t5.b(), next);
                    this.f7202d = this.f7202d || (next instanceof h2.a);
                }
                obj = arrayList;
            }
            if (obj instanceof r1) {
                this.f7200b = true;
            }
            this.f7202d = this.f7202d || (obj instanceof h2.a);
            this.f7199a.put(t5, obj);
        }

        public void u(T t5, int i5, Object obj) {
            d();
            if (!t5.a()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f7202d = this.f7202d || (obj instanceof h2.a);
            Object g5 = g(t5);
            if (g5 == null) {
                throw new IndexOutOfBoundsException();
            }
            v(t5.b(), obj);
            ((List) g5).set(i5, obj);
        }

        private b() {
            this(m3.v(16));
        }

        private b(m3<T, Object> m3Var) {
            this.f7199a = m3Var;
            this.f7201c = true;
        }
    }

    /* compiled from: FieldSet.java */
    public interface c<T extends c<T>> extends Comparable<T> {
        boolean a();

        q4.b b();

        q4.c e();

        int getNumber();

        boolean isPacked();

        o1.d<?> k();

        h2.a n(h2.a aVar, h2 h2Var);
    }

    /* synthetic */ c1(m3 m3Var, a aVar) {
        this(m3Var);
    }

    static int A(q4.b bVar, boolean z5) {
        if (z5) {
            return 2;
        }
        return bVar.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean F(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.e() == q4.c.MESSAGE) {
            if (key.a()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((h2) it.next()).l()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof h2)) {
                    if (value instanceof r1) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((h2) value).l()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G(q4.b bVar, Object obj) {
        o1.d(obj);
        switch (a.f7197a[bVar.getJavaType().ordinal()]) {
            case 7:
                if (!(obj instanceof w) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof o1.c)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof h2) && !(obj instanceof r1)) {
                    break;
                }
                break;
        }
        return false;
    }

    private void K(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof r1) {
            value = ((r1) value).p();
        }
        if (key.a()) {
            Object u5 = u(key);
            if (u5 == null) {
                u5 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) u5).add(n(it.next()));
            }
            this.f7194a.put(key, u5);
            return;
        }
        if (key.e() != q4.c.MESSAGE) {
            this.f7194a.put(key, n(value));
            return;
        }
        Object u6 = u(key);
        if (u6 == null) {
            this.f7194a.put(key, n(value));
        } else {
            this.f7194a.put(key, key.n(((h2) u6).n(), (h2) value).build());
        }
    }

    public static <T extends c<T>> b<T> L() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> c1<T> M() {
        return new c1<>();
    }

    public static Object N(z zVar, q4.b bVar, boolean z5) throws IOException {
        return z5 ? q4.d(zVar, bVar, q4.d.STRICT) : q4.d(zVar, bVar, q4.d.LOOSE);
    }

    private void Q(q4.b bVar, Object obj) {
        if (!G(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void R(CodedOutputStream codedOutputStream, q4.b bVar, int i5, Object obj) throws IOException {
        if (bVar == q4.b.GROUP) {
            codedOutputStream.F1(i5, (h2) obj);
        } else {
            codedOutputStream.g2(i5, A(bVar, false));
            S(codedOutputStream, bVar, obj);
        }
    }

    static void S(CodedOutputStream codedOutputStream, q4.b bVar, Object obj) throws IOException {
        switch (a.f7198b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.A1(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.E1(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.K1(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.i2(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.J1(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.D1(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.C1(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.t1(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.H1((h2) obj);
                break;
            case 10:
                codedOutputStream.N1((h2) obj);
                break;
            case 11:
                if (!(obj instanceof w)) {
                    codedOutputStream.f2((String) obj);
                    break;
                } else {
                    codedOutputStream.z1((w) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof w)) {
                    codedOutputStream.w1((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.z1((w) obj);
                    break;
                }
            case 13:
                codedOutputStream.h2(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.b2(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.c2(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.d2(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.e2(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof o1.c)) {
                    codedOutputStream.B1(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.B1(((o1.c) obj).getNumber());
                    break;
                }
        }
    }

    public static void T(c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        q4.b b6 = cVar.b();
        int number = cVar.getNumber();
        if (!cVar.a()) {
            if (obj instanceof r1) {
                R(codedOutputStream, b6, number, ((r1) obj).p());
                return;
            } else {
                R(codedOutputStream, b6, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                R(codedOutputStream, b6, number, it.next());
            }
            return;
        }
        codedOutputStream.g2(number, 2);
        Iterator it2 = list.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            i5 += p(b6, it2.next());
        }
        codedOutputStream.Z1(i5);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            S(codedOutputStream, b6, it3.next());
        }
    }

    private void V(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.e() != q4.c.MESSAGE || key.a() || key.isPacked()) {
            T(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof r1) {
            value = ((r1) value).p();
        }
        codedOutputStream.P1(entry.getKey().getNumber(), (h2) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> m3<T, Object> l(m3<T, Object> m3Var, boolean z5) {
        m3<T, Object> v5 = m3.v(16);
        for (int i5 = 0; i5 < m3Var.n(); i5++) {
            m(v5, m3Var.m(i5), z5);
        }
        Iterator<Map.Entry<T, Object>> it = m3Var.q().iterator();
        while (it.hasNext()) {
            m(v5, it.next(), z5);
        }
        return v5;
    }

    private static <T extends c<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z5) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof r1) {
            map.put(key, ((r1) value).p());
        } else if (z5 && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object n(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static int o(q4.b bVar, int i5, Object obj) {
        int X0 = CodedOutputStream.X0(i5);
        if (bVar == q4.b.GROUP) {
            X0 *= 2;
        }
        return X0 + p(bVar, obj);
    }

    static int p(q4.b bVar, Object obj) {
        switch (a.f7198b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j0(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r0(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.z0(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.b1(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.x0(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p0(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n0(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.b0(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.u0((h2) obj);
            case 10:
                return obj instanceof r1 ? CodedOutputStream.C0((r1) obj) : CodedOutputStream.H0((h2) obj);
            case 11:
                return obj instanceof w ? CodedOutputStream.h0((w) obj) : CodedOutputStream.W0((String) obj);
            case 12:
                return obj instanceof w ? CodedOutputStream.h0((w) obj) : CodedOutputStream.d0((byte[]) obj);
            case 13:
                return CodedOutputStream.Z0(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.O0(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.Q0(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.S0(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.U0(((Long) obj).longValue());
            case 18:
                return obj instanceof o1.c ? CodedOutputStream.l0(((o1.c) obj).getNumber()) : CodedOutputStream.l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(c<?> cVar, Object obj) {
        q4.b b6 = cVar.b();
        int number = cVar.getNumber();
        if (!cVar.a()) {
            return o(b6, number, obj);
        }
        int i5 = 0;
        if (!cVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i5 += o(b6, number, it.next());
            }
            return i5;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i5 += p(b6, it2.next());
        }
        return CodedOutputStream.Z0(i5) + CodedOutputStream.X0(number) + i5;
    }

    public static <T extends c<T>> c1<T> s() {
        return f7193e;
    }

    private int w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.e() != q4.c.MESSAGE || key.a() || key.isPacked()) ? q(key, value) : value instanceof r1 ? CodedOutputStream.A0(entry.getKey().getNumber(), (r1) value) : CodedOutputStream.E0(entry.getKey().getNumber(), (h2) value);
    }

    public boolean B(T t5) {
        if (t5.a()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f7194a.get(t5) != null;
    }

    boolean C() {
        return this.f7194a.isEmpty();
    }

    public boolean D() {
        return this.f7195b;
    }

    public boolean E() {
        for (int i5 = 0; i5 < this.f7194a.n(); i5++) {
            if (!F(this.f7194a.m(i5))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f7194a.q().iterator();
        while (it.hasNext()) {
            if (!F(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> H() {
        return this.f7196c ? new r1.c(this.f7194a.entrySet().iterator()) : this.f7194a.entrySet().iterator();
    }

    public void I() {
        if (this.f7195b) {
            return;
        }
        this.f7194a.u();
        this.f7195b = true;
    }

    public void J(c1<T> c1Var) {
        for (int i5 = 0; i5 < c1Var.f7194a.n(); i5++) {
            K(c1Var.f7194a.m(i5));
        }
        Iterator<Map.Entry<T, Object>> it = c1Var.f7194a.q().iterator();
        while (it.hasNext()) {
            K(it.next());
        }
    }

    public void O(T t5, Object obj) {
        if (!t5.a()) {
            Q(t5.b(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Q(t5.b(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof r1) {
            this.f7196c = true;
        }
        this.f7194a.put(t5, obj);
    }

    public void P(T t5, int i5, Object obj) {
        if (!t5.a()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object u5 = u(t5);
        if (u5 == null) {
            throw new IndexOutOfBoundsException();
        }
        Q(t5.b(), obj);
        ((List) u5).set(i5, obj);
    }

    public void U(CodedOutputStream codedOutputStream) throws IOException {
        for (int i5 = 0; i5 < this.f7194a.n(); i5++) {
            V(this.f7194a.m(i5), codedOutputStream);
        }
        Iterator<Map.Entry<T, Object>> it = this.f7194a.q().iterator();
        while (it.hasNext()) {
            V(it.next(), codedOutputStream);
        }
    }

    public void W(CodedOutputStream codedOutputStream) throws IOException {
        for (int i5 = 0; i5 < this.f7194a.n(); i5++) {
            Map.Entry<T, Object> m5 = this.f7194a.m(i5);
            T(m5.getKey(), m5.getValue(), codedOutputStream);
        }
        for (Map.Entry<T, Object> entry : this.f7194a.q()) {
            T(entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            return this.f7194a.equals(((c1) obj).f7194a);
        }
        return false;
    }

    public void h(T t5, Object obj) {
        List list;
        if (!t5.a()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        Q(t5.b(), obj);
        Object u5 = u(t5);
        if (u5 == null) {
            list = new ArrayList();
            this.f7194a.put(t5, list);
        } else {
            list = (List) u5;
        }
        list.add(obj);
    }

    public int hashCode() {
        return this.f7194a.hashCode();
    }

    public void i() {
        this.f7194a.clear();
        this.f7196c = false;
    }

    public void j(T t5) {
        this.f7194a.remove(t5);
        if (this.f7194a.isEmpty()) {
            this.f7196c = false;
        }
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c1<T> clone() {
        c1<T> c1Var = new c1<>();
        for (int i5 = 0; i5 < this.f7194a.n(); i5++) {
            Map.Entry<T, Object> m5 = this.f7194a.m(i5);
            c1Var.O(m5.getKey(), m5.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f7194a.q()) {
            c1Var.O(entry.getKey(), entry.getValue());
        }
        c1Var.f7196c = this.f7196c;
        return c1Var;
    }

    Iterator<Map.Entry<T, Object>> r() {
        return this.f7196c ? new r1.c(this.f7194a.k().iterator()) : this.f7194a.k().iterator();
    }

    public Map<T, Object> t() {
        if (!this.f7196c) {
            return this.f7194a.t() ? this.f7194a : Collections.unmodifiableMap(this.f7194a);
        }
        m3 l5 = l(this.f7194a, false);
        if (this.f7194a.t()) {
            l5.u();
        }
        return l5;
    }

    public Object u(T t5) {
        Object obj = this.f7194a.get(t5);
        return obj instanceof r1 ? ((r1) obj).p() : obj;
    }

    public int v() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.f7194a.n(); i6++) {
            i5 += w(this.f7194a.m(i6));
        }
        Iterator<Map.Entry<T, Object>> it = this.f7194a.q().iterator();
        while (it.hasNext()) {
            i5 += w(it.next());
        }
        return i5;
    }

    public Object x(T t5, int i5) {
        if (!t5.a()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object u5 = u(t5);
        if (u5 != null) {
            return ((List) u5).get(i5);
        }
        throw new IndexOutOfBoundsException();
    }

    public int y(T t5) {
        if (!t5.a()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object u5 = u(t5);
        if (u5 == null) {
            return 0;
        }
        return ((List) u5).size();
    }

    public int z() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.f7194a.n(); i6++) {
            Map.Entry<T, Object> m5 = this.f7194a.m(i6);
            i5 += q(m5.getKey(), m5.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f7194a.q()) {
            i5 += q(entry.getKey(), entry.getValue());
        }
        return i5;
    }

    private c1() {
        this.f7194a = m3.v(16);
    }

    private c1(boolean z5) {
        this(m3.v(0));
        I();
    }

    private c1(m3<T, Object> m3Var) {
        this.f7194a = m3Var;
        I();
    }
}
