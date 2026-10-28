package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.c1;
import androidx.content.preferences.protobuf.p1;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* loaded from: classes3.dex */
final class o3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f28835a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final l4<?, ?> f28836b = F(false);

    /* renamed from: c, reason: collision with root package name */
    private static final l4<?, ?> f28837c = F(true);

    /* renamed from: d, reason: collision with root package name */
    private static final l4<?, ?> f28838d = new n4();

    /* renamed from: e, reason: collision with root package name */
    private static final int f28839e = 40;

    private o3() {
    }

    static int A(List<Long> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z1) {
            z1 z1Var = (z1) list;
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.b1(z1Var.getLong(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.b1(list.get(i5).longValue());
                i5++;
            }
        }
        return i4;
    }

    private static void A0(int i4, String str, v4 v4Var) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        v4Var.g(i4, str);
    }

    static <UT, UB> UB B(int i4, List<Integer> list, p1.d<?> dVar, UB ub, l4<UT, UB> l4Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = list.get(i6);
                int intValue = num.intValue();
                if (dVar.a(intValue) != null) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    ub = (UB) Q(i4, intValue, ub, l4Var);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) Q(i4, intValue2, ub, l4Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void B0(int i4, List<String> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.e(i4, list);
    }

    static <UT, UB> UB C(int i4, List<Integer> list, p1.e eVar, UB ub, l4<UT, UB> l4Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = list.get(i6);
                int intValue = num.intValue();
                if (eVar.a(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    ub = (UB) Q(i4, intValue, ub, l4Var);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) Q(i4, intValue2, ub, l4Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void C0(int i4, int i5, v4 v4Var) throws IOException {
        if (i5 != 0) {
            v4Var.u(i4, i5);
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D0(int i4, List<Integer> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.o(i4, list, z4);
    }

    static Object E(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + R(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return p4.Q(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static void E0(int i4, long j4, v4 v4Var) throws IOException {
        if (j4 != 0) {
            v4Var.h(i4, j4);
        }
    }

    private static l4<?, ?> F(boolean z4) {
        try {
            Class<?> G = G();
            if (G == null) {
                return null;
            }
            return (l4) G.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F0(int i4, List<Long> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.x(i4, list, z4);
    }

    private static Class<?> G() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends c1.c<FT>> void H(t0<FT> t0Var, T t4, T t5) {
        c1<FT> c5 = t0Var.c(t5);
        if (c5.C()) {
            return;
        }
        t0Var.d(t4).J(c5);
    }

    static <T> void I(d2 d2Var, T t4, T t5, long j4) {
        p4.q0(t4, j4, d2Var.a(p4.O(t4, j4), p4.O(t5, j4)));
    }

    static <T, UT, UB> void J(l4<UT, UB> l4Var, T t4, T t5) {
        l4Var.p(t4, l4Var.k(l4Var.g(t4), l4Var.g(t5)));
    }

    public static l4<?, ?> K() {
        return f28836b;
    }

    public static l4<?, ?> L() {
        return f28837c;
    }

    public static void M(Class<?> cls) {
        Class<?> cls2;
        if (!i1.class.isAssignableFrom(cls) && (cls2 = f28835a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean N(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean O(int i4, int i5, int i6) {
        if (i5 < 40) {
            return true;
        }
        long j4 = i5 - i4;
        long j5 = i6;
        return j4 + 10 <= ((j5 + 3) * 3) + ((2 * j5) + 3);
    }

    public static boolean P(x0[] x0VarArr) {
        if (x0VarArr.length == 0) {
            return false;
        }
        return O(x0VarArr[0].o(), x0VarArr[x0VarArr.length - 1].o(), x0VarArr.length);
    }

    static <UT, UB> UB Q(int i4, int i5, UB ub, l4<UT, UB> l4Var) {
        if (ub == null) {
            ub = l4Var.n();
        }
        l4Var.e(ub, i4, i5);
        return ub;
    }

    static String R(String str, boolean z4) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if ('a' > charAt || charAt > 'z') {
                if ('A' > charAt || charAt > 'Z') {
                    if ('0' <= charAt && charAt <= '9') {
                        sb.append(charAt);
                    }
                    z4 = true;
                } else if (i4 != 0 || z4) {
                    sb.append(charAt);
                } else {
                    sb.append((char) (charAt + ' '));
                }
            } else if (z4) {
                sb.append((char) (charAt - ' '));
            } else {
                sb.append(charAt);
            }
            z4 = false;
        }
        return sb.toString();
    }

    public static l4<?, ?> S() {
        return f28838d;
    }

    public static void T(int i4, boolean z4, v4 v4Var) throws IOException {
        if (z4) {
            v4Var.E(i4, true);
        }
    }

    public static void U(int i4, List<Boolean> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.J(i4, list, z4);
    }

    public static void V(int i4, w wVar, v4 v4Var) throws IOException {
        if (wVar == null || wVar.isEmpty()) {
            return;
        }
        v4Var.k(i4, wVar);
    }

    public static void W(int i4, List<w> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.S(i4, list);
    }

    public static void X(int i4, double d5, v4 v4Var) throws IOException {
        if (Double.compare(d5, p.f60679p) != 0) {
            v4Var.v(i4, d5);
        }
    }

    public static void Y(int i4, List<Double> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.Q(i4, list, z4);
    }

    public static void Z(int i4, int i5, v4 v4Var) throws IOException {
        if (i5 != 0) {
            v4Var.O(i4, i5);
        }
    }

    static int a(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z4) {
            return CodedOutputStream.a0(i4, true) * size;
        }
        return CodedOutputStream.Z0(size) + size + CodedOutputStream.X0(i4);
    }

    public static void a0(int i4, List<Integer> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.r(i4, list, z4);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i4, int i5, v4 v4Var) throws IOException {
        if (i5 != 0) {
            v4Var.c(i4, i5);
        }
    }

    static int c(int i4, List<w> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i4) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            X0 += CodedOutputStream.h0(list.get(i5));
        }
        return X0;
    }

    public static void c0(int i4, List<Integer> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.m(i4, list, z4);
    }

    static int d(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e4 = e(list);
        if (!z4) {
            return (CodedOutputStream.X0(i4) * size) + e4;
        }
        return CodedOutputStream.Z0(e4) + e4 + CodedOutputStream.X0(i4);
    }

    public static void d0(int i4, long j4, v4 v4Var) throws IOException {
        if (j4 != 0) {
            v4Var.y(i4, j4);
        }
    }

    static int e(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.l0(n1Var.getInt(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.l0(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static void e0(int i4, List<Long> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.H(i4, list, z4);
    }

    static int f(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z4) {
            return CodedOutputStream.m0(i4, 0) * size;
        }
        int i5 = size * 4;
        return CodedOutputStream.Z0(i5) + i5 + CodedOutputStream.X0(i4);
    }

    public static void f0(int i4, float f4, v4 v4Var) throws IOException {
        if (Float.compare(f4, 0.0f) != 0) {
            v4Var.L(i4, f4);
        }
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    public static void g0(int i4, List<Float> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.a(i4, list, z4);
    }

    static int h(int i4, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z4) {
            return CodedOutputStream.o0(i4, 0L) * size;
        }
        int i5 = size * 8;
        return CodedOutputStream.Z0(i5) + i5 + CodedOutputStream.X0(i4);
    }

    public static void h0(int i4, List<?> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.d(i4, list);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i0(int i4, List<?> list, v4 v4Var, m3 m3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.f(i4, list, m3Var);
    }

    static int j(int i4, List<i2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += CodedOutputStream.s0(i4, list.get(i6));
        }
        return i5;
    }

    public static void j0(int i4, int i5, v4 v4Var) throws IOException {
        if (i5 != 0) {
            v4Var.j(i4, i5);
        }
    }

    static int k(int i4, List<i2> list, m3 m3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += CodedOutputStream.t0(i4, list.get(i6), m3Var);
        }
        return i5;
    }

    public static void k0(int i4, List<Integer> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.i(i4, list, z4);
    }

    static int l(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m4 = m(list);
        if (!z4) {
            return (CodedOutputStream.X0(i4) * size) + m4;
        }
        return CodedOutputStream.Z0(m4) + m4 + CodedOutputStream.X0(i4);
    }

    public static void l0(int i4, long j4, v4 v4Var) throws IOException {
        if (j4 != 0) {
            v4Var.D(i4, j4);
        }
    }

    static int m(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.x0(n1Var.getInt(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.x0(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static void m0(int i4, List<Long> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.P(i4, list, z4);
    }

    static int n(int i4, List<Long> list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        int o4 = o(list);
        if (z4) {
            return CodedOutputStream.Z0(o4) + o4 + CodedOutputStream.X0(i4);
        }
        return (CodedOutputStream.X0(i4) * list.size()) + o4;
    }

    public static void n0(int i4, List<?> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((t1) it.next()).o(v4Var, i4);
        }
    }

    static int o(List<Long> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z1) {
            z1 z1Var = (z1) list;
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.z0(z1Var.getLong(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.z0(list.get(i5).longValue());
                i5++;
            }
        }
        return i4;
    }

    public static void o0(int i4, Object obj, v4 v4Var) throws IOException {
        if (obj != null) {
            v4Var.C(i4, obj);
        }
    }

    static int p(int i4, Object obj, m3 m3Var) {
        return obj instanceof t1 ? CodedOutputStream.B0(i4, (t1) obj) : CodedOutputStream.G0(i4, (i2) obj, m3Var);
    }

    public static void p0(int i4, List<?> list, v4 v4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.B(i4, list);
    }

    static int q(int i4, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            X0 = (obj instanceof t1 ? CodedOutputStream.C0((t1) obj) : CodedOutputStream.H0((i2) obj)) + X0;
        }
        return X0;
    }

    public static void q0(int i4, List<?> list, v4 v4Var, m3 m3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.A(i4, list, m3Var);
    }

    static int r(int i4, List<?> list, m3 m3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            X0 = obj instanceof t1 ? CodedOutputStream.C0((t1) obj) + X0 : X0 + CodedOutputStream.I0((i2) obj, m3Var);
        }
        return X0;
    }

    public static void r0(int i4, int i5, v4 v4Var) throws IOException {
        if (i5 != 0) {
            v4Var.F(i4, i5);
        }
    }

    static int s(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t4 = t(list);
        if (!z4) {
            return (CodedOutputStream.X0(i4) * size) + t4;
        }
        return CodedOutputStream.Z0(t4) + t4 + CodedOutputStream.X0(i4);
    }

    public static void s0(int i4, List<Integer> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.I(i4, list, z4);
    }

    static int t(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.S0(n1Var.getInt(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.S0(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static void t0(int i4, long j4, v4 v4Var) throws IOException {
        if (j4 != 0) {
            v4Var.l(i4, j4);
        }
    }

    static int u(int i4, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v4 = v(list);
        if (!z4) {
            return (CodedOutputStream.X0(i4) * size) + v4;
        }
        return CodedOutputStream.Z0(v4) + v4 + CodedOutputStream.X0(i4);
    }

    public static void u0(int i4, List<Long> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.w(i4, list, z4);
    }

    static int v(List<Long> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z1) {
            z1 z1Var = (z1) list;
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.U0(z1Var.getLong(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.U0(list.get(i5).longValue());
                i5++;
            }
        }
        return i4;
    }

    public static void v0(int i4, int i5, v4 v4Var) throws IOException {
        if (i5 != 0) {
            v4Var.R(i4, i5);
        }
    }

    static int w(int i4, List<?> list) {
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i4) * size;
        if (list instanceof v1) {
            v1 v1Var = (v1) list;
            while (i5 < size) {
                Object D3 = v1Var.D3(i5);
                X0 = (D3 instanceof w ? CodedOutputStream.h0((w) D3) : CodedOutputStream.W0((String) D3)) + X0;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                X0 = (obj instanceof w ? CodedOutputStream.h0((w) obj) : CodedOutputStream.W0((String) obj)) + X0;
                i5++;
            }
        }
        return X0;
    }

    public static void w0(int i4, List<Integer> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.N(i4, list, z4);
    }

    static int x(int i4, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y4 = y(list);
        if (!z4) {
            return (CodedOutputStream.X0(i4) * size) + y4;
        }
        return CodedOutputStream.Z0(y4) + y4 + CodedOutputStream.X0(i4);
    }

    public static void x0(int i4, long j4, v4 v4Var) throws IOException {
        if (j4 != 0) {
            v4Var.q(i4, j4);
        }
    }

    static int y(List<Integer> list) {
        int i4;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.Z0(n1Var.getInt(i5));
                i5++;
            }
        } else {
            i4 = 0;
            while (i5 < size) {
                i4 += CodedOutputStream.Z0(list.get(i5).intValue());
                i5++;
            }
        }
        return i4;
    }

    public static void y0(int i4, List<Long> list, v4 v4Var, boolean z4) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        v4Var.p(i4, list, z4);
    }

    static int z(int i4, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = A(list);
        if (!z4) {
            return (CodedOutputStream.X0(i4) * size) + A;
        }
        return CodedOutputStream.Z0(A) + A + CodedOutputStream.X0(i4);
    }

    public static void z0(int i4, Object obj, v4 v4Var) throws IOException {
        if (obj instanceof String) {
            A0(i4, (String) obj, v4Var);
        } else {
            V(i4, (w) obj, v4Var);
        }
    }
}
