package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.i2;
import androidx.content.preferences.protobuf.p1;
import androidx.content.preferences.protobuf.s1;
import androidx.content.preferences.protobuf.t4;
import androidx.datastore.preferences.protobuf.c1.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* loaded from: classes3.dex */
final class c1<T extends c<T>> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f28650d = 16;

    /* renamed from: e, reason: collision with root package name */
    private static final c1 f28651e = new c1(true);

    /* renamed from: a, reason: collision with root package name */
    private final p3<T, Object> f28652a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28653b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28654c;

    /* compiled from: FieldSet.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28655a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28656b;

        static {
            int[] iArr = new int[t4.b.values().length];
            f28656b = iArr;
            try {
                iArr[t4.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28656b[t4.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28656b[t4.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28656b[t4.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28656b[t4.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28656b[t4.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28656b[t4.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28656b[t4.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28656b[t4.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28656b[t4.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28656b[t4.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28656b[t4.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f28656b[t4.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f28656b[t4.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f28656b[t4.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f28656b[t4.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f28656b[t4.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f28656b[t4.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[t4.c.values().length];
            f28655a = iArr2;
            try {
                iArr2[t4.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f28655a[t4.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f28655a[t4.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f28655a[t4.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f28655a[t4.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f28655a[t4.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f28655a[t4.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f28655a[t4.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f28655a[t4.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    static final class b<T extends c<T>> {

        /* renamed from: a, reason: collision with root package name */
        private p3<T, Object> f28657a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f28658b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f28659c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f28660d;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void d() {
            if (this.f28659c) {
                return;
            }
            this.f28657a = c1.l(this.f28657a, true);
            this.f28659c = true;
        }

        public static <T extends c<T>> b<T> e(c1<T> c1Var) {
            b<T> bVar = new b<>(c1.l(((c1) c1Var).f28652a, true));
            ((b) bVar).f28658b = ((c1) c1Var).f28654c;
            return bVar;
        }

        private void o(Map.Entry<T, Object> entry) {
            T key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof s1) {
                value = ((s1) value).p();
            }
            if (key.F()) {
                Object g4 = g(key);
                if (g4 == null) {
                    g4 = new ArrayList();
                }
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    ((List) g4).add(c1.n(it.next()));
                }
                this.f28657a.put(key, g4);
                return;
            }
            if (key.O() != t4.c.MESSAGE) {
                this.f28657a.put(key, c1.n(value));
                return;
            }
            Object g5 = g(key);
            if (g5 == null) {
                this.f28657a.put(key, c1.n(value));
            } else if (g5 instanceof i2.a) {
                key.K1((i2.a) g5, (i2) value);
            } else {
                this.f28657a.put(key, key.K1(((i2) g5).q(), (i2) value).a());
            }
        }

        private static Object p(Object obj) {
            return obj instanceof i2.a ? ((i2.a) obj).a() : obj;
        }

        private static <T extends c<T>> Object q(T t4, Object obj) {
            if (obj == null) {
                return obj;
            }
            if (t4.O() != t4.c.MESSAGE) {
                return obj;
            }
            if (!t4.F()) {
                return p(obj);
            }
            if (!(obj instanceof List)) {
                throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
            }
            List list = (List) obj;
            for (int i4 = 0; i4 < list.size(); i4++) {
                Object obj2 = list.get(i4);
                Object p4 = p(obj2);
                if (p4 != obj2) {
                    if (list == obj) {
                        list = new ArrayList(list);
                    }
                    list.set(i4, p4);
                }
            }
            return list;
        }

        private static <T extends c<T>> void r(p3<T, Object> p3Var) {
            for (int i4 = 0; i4 < p3Var.m(); i4++) {
                s(p3Var.l(i4));
            }
            Iterator<Map.Entry<T, Object>> it = p3Var.o().iterator();
            while (it.hasNext()) {
                s(it.next());
            }
        }

        private static <T extends c<T>> void s(Map.Entry<T, Object> entry) {
            entry.setValue(q(entry.getKey(), entry.getValue()));
        }

        private static void v(t4.b bVar, Object obj) {
            if (c1.G(bVar, obj)) {
                return;
            }
            if (bVar.getJavaType() != t4.c.MESSAGE || !(obj instanceof i2.a)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }

        public void a(T t4, Object obj) {
            List list;
            d();
            if (!t4.F()) {
                throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
            }
            this.f28660d = this.f28660d || (obj instanceof i2.a);
            v(t4.H(), obj);
            Object g4 = g(t4);
            if (g4 == null) {
                list = new ArrayList();
                this.f28657a.put(t4, list);
            } else {
                list = (List) g4;
            }
            list.add(obj);
        }

        public c1<T> b() {
            if (this.f28657a.isEmpty()) {
                return c1.s();
            }
            this.f28659c = false;
            p3<T, Object> p3Var = this.f28657a;
            if (this.f28660d) {
                p3Var = c1.l(p3Var, false);
                r(p3Var);
            }
            c1<T> c1Var = new c1<>(p3Var, null);
            ((c1) c1Var).f28654c = this.f28658b;
            return c1Var;
        }

        public void c(T t4) {
            d();
            this.f28657a.remove(t4);
            if (this.f28657a.isEmpty()) {
                this.f28658b = false;
            }
        }

        public Map<T, Object> f() {
            if (!this.f28658b) {
                return this.f28657a.r() ? this.f28657a : Collections.unmodifiableMap(this.f28657a);
            }
            p3 l4 = c1.l(this.f28657a, false);
            if (this.f28657a.r()) {
                l4.t();
            } else {
                r(l4);
            }
            return l4;
        }

        public Object g(T t4) {
            return q(t4, h(t4));
        }

        Object h(T t4) {
            Object obj = this.f28657a.get(t4);
            return obj instanceof s1 ? ((s1) obj).p() : obj;
        }

        public Object i(T t4, int i4) {
            if (this.f28660d) {
                d();
            }
            return p(j(t4, i4));
        }

        Object j(T t4, int i4) {
            if (!t4.F()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object h4 = h(t4);
            if (h4 != null) {
                return ((List) h4).get(i4);
            }
            throw new IndexOutOfBoundsException();
        }

        public int k(T t4) {
            if (!t4.F()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object g4 = g(t4);
            if (g4 == null) {
                return 0;
            }
            return ((List) g4).size();
        }

        public boolean l(T t4) {
            if (t4.F()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return this.f28657a.get(t4) != null;
        }

        public boolean m() {
            for (int i4 = 0; i4 < this.f28657a.m(); i4++) {
                if (!c1.F(this.f28657a.l(i4))) {
                    return false;
                }
            }
            Iterator<Map.Entry<T, Object>> it = this.f28657a.o().iterator();
            while (it.hasNext()) {
                if (!c1.F(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public void n(c1<T> c1Var) {
            d();
            for (int i4 = 0; i4 < ((c1) c1Var).f28652a.m(); i4++) {
                o(((c1) c1Var).f28652a.l(i4));
            }
            Iterator it = ((c1) c1Var).f28652a.o().iterator();
            while (it.hasNext()) {
                o((Map.Entry) it.next());
            }
        }

        public void t(T t4, Object obj) {
            d();
            if (!t4.F()) {
                v(t4.H(), obj);
            } else {
                if (!(obj instanceof List)) {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    v(t4.H(), next);
                    this.f28660d = this.f28660d || (next instanceof i2.a);
                }
                obj = arrayList;
            }
            if (obj instanceof s1) {
                this.f28658b = true;
            }
            this.f28660d = this.f28660d || (obj instanceof i2.a);
            this.f28657a.put(t4, obj);
        }

        public void u(T t4, int i4, Object obj) {
            d();
            if (!t4.F()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            this.f28660d = this.f28660d || (obj instanceof i2.a);
            Object g4 = g(t4);
            if (g4 == null) {
                throw new IndexOutOfBoundsException();
            }
            v(t4.H(), obj);
            ((List) g4).set(i4, obj);
        }

        private b() {
            this(p3.u(16));
        }

        private b(p3<T, Object> p3Var) {
            this.f28657a = p3Var;
            this.f28659c = true;
        }
    }

    /* compiled from: FieldSet.java */
    public interface c<T extends c<T>> extends Comparable<T> {
        boolean F();

        t4.b H();

        i2.a K1(i2.a aVar, i2 i2Var);

        p1.d<?> M0();

        t4.c O();

        int getNumber();

        boolean isPacked();
    }

    /* synthetic */ c1(p3 p3Var, a aVar) {
        this(p3Var);
    }

    static int A(t4.b bVar, boolean z4) {
        if (z4) {
            return 2;
        }
        return bVar.getWireType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> boolean F(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.O() == t4.c.MESSAGE) {
            if (key.F()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((i2) it.next()).p()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof i2)) {
                    if (value instanceof s1) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((i2) value).p()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean G(t4.b bVar, Object obj) {
        p1.d(obj);
        switch (a.f28655a[bVar.getJavaType().ordinal()]) {
            case 7:
                if (!(obj instanceof w) && !(obj instanceof byte[])) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof p1.c)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof i2) && !(obj instanceof s1)) {
                    break;
                }
                break;
        }
        return false;
    }

    private void K(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof s1) {
            value = ((s1) value).p();
        }
        if (key.F()) {
            Object u4 = u(key);
            if (u4 == null) {
                u4 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) u4).add(n(it.next()));
            }
            this.f28652a.put(key, u4);
            return;
        }
        if (key.O() != t4.c.MESSAGE) {
            this.f28652a.put(key, n(value));
            return;
        }
        Object u5 = u(key);
        if (u5 == null) {
            this.f28652a.put(key, n(value));
        } else {
            this.f28652a.put(key, key.K1(((i2) u5).q(), (i2) value).a());
        }
    }

    public static <T extends c<T>> b<T> L() {
        return new b<>((a) null);
    }

    public static <T extends c<T>> c1<T> M() {
        return new c1<>();
    }

    public static Object N(z zVar, t4.b bVar, boolean z4) throws IOException {
        return z4 ? t4.d(zVar, bVar, t4.d.STRICT) : t4.d(zVar, bVar, t4.d.LOOSE);
    }

    private void Q(t4.b bVar, Object obj) {
        if (!G(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void R(CodedOutputStream codedOutputStream, t4.b bVar, int i4, Object obj) throws IOException {
        if (bVar == t4.b.GROUP) {
            codedOutputStream.F1(i4, (i2) obj);
        } else {
            codedOutputStream.g2(i4, A(bVar, false));
            S(codedOutputStream, bVar, obj);
        }
    }

    static void S(CodedOutputStream codedOutputStream, t4.b bVar, Object obj) throws IOException {
        switch (a.f28656b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.A1(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.E1(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.i2(((Long) obj).longValue());
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
                codedOutputStream.T(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                codedOutputStream.getClass();
                ((i2) obj).c1(codedOutputStream);
                break;
            case 10:
                codedOutputStream.N1((i2) obj);
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
                codedOutputStream.C1(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.D1(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.d2(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.e2(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof p1.c)) {
                    codedOutputStream.J1(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.J1(((p1.c) obj).getNumber());
                    break;
                }
        }
    }

    public static void T(c<?> cVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        t4.b H = cVar.H();
        int number = cVar.getNumber();
        if (!cVar.F()) {
            if (obj instanceof s1) {
                R(codedOutputStream, H, number, ((s1) obj).p());
                return;
            } else {
                R(codedOutputStream, H, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                R(codedOutputStream, H, number, it.next());
            }
            return;
        }
        codedOutputStream.g2(number, 2);
        Iterator it2 = list.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            i4 += p(H, it2.next());
        }
        codedOutputStream.h2(i4);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            S(codedOutputStream, H, it3.next());
        }
    }

    private void V(Map.Entry<T, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        T key = entry.getKey();
        if (key.O() != t4.c.MESSAGE || key.F() || key.isPacked()) {
            T(key, entry.getValue(), codedOutputStream);
            return;
        }
        Object value = entry.getValue();
        if (value instanceof s1) {
            value = ((s1) value).p();
        }
        codedOutputStream.P1(entry.getKey().getNumber(), (i2) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends c<T>> p3<T, Object> l(p3<T, Object> p3Var, boolean z4) {
        p3<T, Object> u4 = p3.u(16);
        for (int i4 = 0; i4 < p3Var.m(); i4++) {
            m(u4, p3Var.l(i4), z4);
        }
        Iterator<Map.Entry<T, Object>> it = p3Var.o().iterator();
        while (it.hasNext()) {
            m(u4, it.next(), z4);
        }
        return u4;
    }

    private static <T extends c<T>> void m(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z4) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof s1) {
            map.put(key, ((s1) value).p());
        } else if (z4 && (value instanceof List)) {
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

    static int o(t4.b bVar, int i4, Object obj) {
        int X0 = CodedOutputStream.X0(i4);
        if (bVar == t4.b.GROUP) {
            X0 *= 2;
        }
        return X0 + p(bVar, obj);
    }

    static int p(t4.b bVar, Object obj) {
        switch (a.f28656b[bVar.ordinal()]) {
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
                return CodedOutputStream.u0((i2) obj);
            case 10:
                return obj instanceof s1 ? CodedOutputStream.C0((s1) obj) : CodedOutputStream.H0((i2) obj);
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
                return obj instanceof p1.c ? CodedOutputStream.l0(((p1.c) obj).getNumber()) : CodedOutputStream.l0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int q(c<?> cVar, Object obj) {
        t4.b H = cVar.H();
        int number = cVar.getNumber();
        if (!cVar.F()) {
            return o(H, number, obj);
        }
        int i4 = 0;
        if (!cVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i4 += o(H, number, it.next());
            }
            return i4;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i4 += p(H, it2.next());
        }
        return CodedOutputStream.Z0(i4) + CodedOutputStream.X0(number) + i4;
    }

    public static <T extends c<T>> c1<T> s() {
        return f28651e;
    }

    private int w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        return (key.O() != t4.c.MESSAGE || key.F() || key.isPacked()) ? q(key, value) : value instanceof s1 ? CodedOutputStream.A0(entry.getKey().getNumber(), (s1) value) : CodedOutputStream.E0(entry.getKey().getNumber(), (i2) value);
    }

    public boolean B(T t4) {
        if (t4.F()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f28652a.get(t4) != null;
    }

    boolean C() {
        return this.f28652a.isEmpty();
    }

    public boolean D() {
        return this.f28653b;
    }

    public boolean E() {
        for (int i4 = 0; i4 < this.f28652a.m(); i4++) {
            if (!F(this.f28652a.l(i4))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f28652a.o().iterator();
        while (it.hasNext()) {
            if (!F(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> H() {
        return this.f28654c ? new s1.c(this.f28652a.entrySet().iterator()) : this.f28652a.entrySet().iterator();
    }

    public void I() {
        if (this.f28653b) {
            return;
        }
        this.f28652a.t();
        this.f28653b = true;
    }

    public void J(c1<T> c1Var) {
        for (int i4 = 0; i4 < c1Var.f28652a.m(); i4++) {
            K(c1Var.f28652a.l(i4));
        }
        Iterator<Map.Entry<T, Object>> it = c1Var.f28652a.o().iterator();
        while (it.hasNext()) {
            K(it.next());
        }
    }

    public void O(T t4, Object obj) {
        if (!t4.F()) {
            Q(t4.H(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Q(t4.H(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof s1) {
            this.f28654c = true;
        }
        this.f28652a.put(t4, obj);
    }

    public void P(T t4, int i4, Object obj) {
        if (!t4.F()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object u4 = u(t4);
        if (u4 == null) {
            throw new IndexOutOfBoundsException();
        }
        Q(t4.H(), obj);
        ((List) u4).set(i4, obj);
    }

    public void U(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f28652a.m(); i4++) {
            V(this.f28652a.l(i4), codedOutputStream);
        }
        Iterator<Map.Entry<T, Object>> it = this.f28652a.o().iterator();
        while (it.hasNext()) {
            V(it.next(), codedOutputStream);
        }
    }

    public void W(CodedOutputStream codedOutputStream) throws IOException {
        for (int i4 = 0; i4 < this.f28652a.m(); i4++) {
            Map.Entry<T, Object> l4 = this.f28652a.l(i4);
            T(l4.getKey(), l4.getValue(), codedOutputStream);
        }
        for (Map.Entry<T, Object> entry : this.f28652a.o()) {
            T(entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            return this.f28652a.equals(((c1) obj).f28652a);
        }
        return false;
    }

    public void h(T t4, Object obj) {
        List list;
        if (!t4.F()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        Q(t4.H(), obj);
        Object u4 = u(t4);
        if (u4 == null) {
            list = new ArrayList();
            this.f28652a.put(t4, list);
        } else {
            list = (List) u4;
        }
        list.add(obj);
    }

    public int hashCode() {
        return this.f28652a.hashCode();
    }

    public void i() {
        this.f28652a.clear();
        this.f28654c = false;
    }

    public void j(T t4) {
        this.f28652a.remove(t4);
        if (this.f28652a.isEmpty()) {
            this.f28654c = false;
        }
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c1<T> clone() {
        c1<T> c1Var = new c1<>();
        for (int i4 = 0; i4 < this.f28652a.m(); i4++) {
            Map.Entry<T, Object> l4 = this.f28652a.l(i4);
            c1Var.O(l4.getKey(), l4.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f28652a.o()) {
            c1Var.O(entry.getKey(), entry.getValue());
        }
        c1Var.f28654c = this.f28654c;
        return c1Var;
    }

    Iterator<Map.Entry<T, Object>> r() {
        return this.f28654c ? new s1.c(this.f28652a.j().iterator()) : this.f28652a.j().iterator();
    }

    public Map<T, Object> t() {
        if (!this.f28654c) {
            return this.f28652a.r() ? this.f28652a : Collections.unmodifiableMap(this.f28652a);
        }
        p3 l4 = l(this.f28652a, false);
        if (this.f28652a.r()) {
            l4.t();
        }
        return l4;
    }

    public Object u(T t4) {
        Object obj = this.f28652a.get(t4);
        return obj instanceof s1 ? ((s1) obj).p() : obj;
    }

    public int v() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f28652a.m(); i5++) {
            i4 += w(this.f28652a.l(i5));
        }
        Iterator<Map.Entry<T, Object>> it = this.f28652a.o().iterator();
        while (it.hasNext()) {
            i4 += w(it.next());
        }
        return i4;
    }

    public Object x(T t4, int i4) {
        if (!t4.F()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object u4 = u(t4);
        if (u4 != null) {
            return ((List) u4).get(i4);
        }
        throw new IndexOutOfBoundsException();
    }

    public int y(T t4) {
        if (!t4.F()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object u4 = u(t4);
        if (u4 == null) {
            return 0;
        }
        return ((List) u4).size();
    }

    public int z() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f28652a.m(); i5++) {
            Map.Entry<T, Object> l4 = this.f28652a.l(i5);
            i4 += q(l4.getKey(), l4.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f28652a.o()) {
            i4 += q(entry.getKey(), entry.getValue());
        }
        return i4;
    }

    private c1() {
        this.f28652a = p3.u(16);
    }

    private c1(boolean z4) {
        this(p3.u(0));
        I();
    }

    private c1(p3<T, Object> p3Var) {
        this.f28652a = p3Var;
        I();
    }
}
