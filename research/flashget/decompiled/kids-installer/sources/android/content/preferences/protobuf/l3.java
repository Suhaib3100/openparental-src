package android.content.preferences.protobuf;

import android.content.preferences.protobuf.c1;
import android.content.preferences.protobuf.o1;
import com.google.firebase.remoteconfig.p;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* loaded from: classes.dex */
final class l3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f7327a = D();

    /* renamed from: b, reason: collision with root package name */
    private static final i4<?, ?> f7328b = F(false);

    /* renamed from: c, reason: collision with root package name */
    private static final i4<?, ?> f7329c = F(true);

    /* renamed from: d, reason: collision with root package name */
    private static final i4<?, ?> f7330d = new k4();

    /* renamed from: e, reason: collision with root package name */
    private static final int f7331e = 40;

    private l3() {
    }

    static int A(List<Long> list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y1) {
            y1 y1Var = (y1) list;
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.b1(y1Var.getLong(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.b1(list.get(i6).longValue());
                i6++;
            }
        }
        return i5;
    }

    private static void A0(int i5, String str, s4 s4Var) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        s4Var.o(i5, str);
    }

    static <UT, UB> UB B(int i5, List<Integer> list, o1.d<?> dVar, UB ub, i4<UT, UB> i4Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                int intValue = list.get(i7).intValue();
                if (dVar.a(intValue) != null) {
                    if (i7 != i6) {
                        list.set(i6, Integer.valueOf(intValue));
                    }
                    i6++;
                } else {
                    ub = (UB) Q(i5, intValue, ub, i4Var);
                }
            }
            if (i6 != size) {
                list.subList(i6, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) Q(i5, intValue2, ub, i4Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void B0(int i5, List<String> list, s4 s4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.l(i5, list);
    }

    static <UT, UB> UB C(int i5, List<Integer> list, o1.e eVar, UB ub, i4<UT, UB> i4Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                int intValue = list.get(i7).intValue();
                if (eVar.a(intValue)) {
                    if (i7 != i6) {
                        list.set(i6, Integer.valueOf(intValue));
                    }
                    i6++;
                } else {
                    ub = (UB) Q(i5, intValue, ub, i4Var);
                }
            }
            if (i6 != size) {
                list.subList(i6, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) Q(i5, intValue2, ub, i4Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void C0(int i5, int i6, s4 s4Var) throws IOException {
        if (i6 != 0) {
            s4Var.b(i5, i6);
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D0(int i5, List<Integer> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.F(i5, list, z5);
    }

    static Object E(Class<?> cls, String str) {
        try {
            Field[] declaredFields = Class.forName(cls.getName() + "$" + R(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return m4.Q(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static void E0(int i5, long j5, s4 s4Var) throws IOException {
        if (j5 != 0) {
            s4Var.p(i5, j5);
        }
    }

    private static i4<?, ?> F(boolean z5) {
        try {
            Class<?> G = G();
            if (G == null) {
                return null;
            }
            return (i4) G.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z5));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F0(int i5, List<Long> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.g(i5, list, z5);
    }

    private static Class<?> G() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends c1.c<FT>> void H(t0<FT> t0Var, T t5, T t6) {
        c1<FT> c6 = t0Var.c(t6);
        if (c6.C()) {
            return;
        }
        t0Var.d(t5).J(c6);
    }

    static <T> void I(c2 c2Var, T t5, T t6, long j5) {
        m4.q0(t5, j5, c2Var.a(m4.O(t5, j5), m4.O(t6, j5)));
    }

    static <T, UT, UB> void J(i4<UT, UB> i4Var, T t5, T t6) {
        i4Var.p(t5, i4Var.k(i4Var.g(t5), i4Var.g(t6)));
    }

    public static i4<?, ?> K() {
        return f7328b;
    }

    public static i4<?, ?> L() {
        return f7329c;
    }

    public static void M(Class<?> cls) {
        Class<?> cls2;
        if (!i1.class.isAssignableFrom(cls) && (cls2 = f7327a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean N(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean O(int i5, int i6, int i7) {
        if (i6 < 40) {
            return true;
        }
        long j5 = (i6 - i5) + 1;
        long j6 = i7;
        return j5 + 9 <= ((j6 + 3) * 3) + ((2 * j6) + 3);
    }

    public static boolean P(x0[] x0VarArr) {
        if (x0VarArr.length == 0) {
            return false;
        }
        return O(x0VarArr[0].y(), x0VarArr[x0VarArr.length - 1].y(), x0VarArr.length);
    }

    static <UT, UB> UB Q(int i5, int i6, UB ub, i4<UT, UB> i4Var) {
        if (ub == null) {
            ub = i4Var.n();
        }
        i4Var.e(ub, i5, i6);
        return ub;
    }

    static String R(String str, boolean z5) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if ('a' > charAt || charAt > 'z') {
                if ('A' > charAt || charAt > 'Z') {
                    if ('0' <= charAt && charAt <= '9') {
                        sb.append(charAt);
                    }
                    z5 = true;
                } else if (i5 != 0 || z5) {
                    sb.append(charAt);
                } else {
                    sb.append((char) (charAt + ' '));
                }
            } else if (z5) {
                sb.append((char) (charAt - ' '));
            } else {
                sb.append(charAt);
            }
            z5 = false;
        }
        return sb.toString();
    }

    public static i4<?, ?> S() {
        return f7330d;
    }

    public static void T(int i5, boolean z5, s4 s4Var) throws IOException {
        if (z5) {
            s4Var.t(i5, true);
        }
    }

    public static void U(int i5, List<Boolean> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.D(i5, list, z5);
    }

    public static void V(int i5, w wVar, s4 s4Var) throws IOException {
        if (wVar == null || wVar.isEmpty()) {
            return;
        }
        s4Var.z(i5, wVar);
    }

    public static void W(int i5, List<w> list, s4 s4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.R(i5, list);
    }

    public static void X(int i5, double d6, s4 s4Var) throws IOException {
        if (Double.compare(d6, p.f18289o) != 0) {
            s4Var.e(i5, d6);
        }
    }

    public static void Y(int i5, List<Double> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.O(i5, list, z5);
    }

    public static void Z(int i5, int i6, s4 s4Var) throws IOException {
        if (i6 != 0) {
            s4Var.L(i5, i6);
        }
    }

    static int a(int i5, List<?> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z5) {
            return CodedOutputStream.a0(i5, true) * size;
        }
        return CodedOutputStream.Z0(size) + size + CodedOutputStream.X0(i5);
    }

    public static void a0(int i5, List<Integer> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.N(i5, list, z5);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i5, int i6, s4 s4Var) throws IOException {
        if (i6 != 0) {
            s4Var.d(i5, i6);
        }
    }

    static int c(int i5, List<w> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i5) * size;
        for (int i6 = 0; i6 < list.size(); i6++) {
            X0 += CodedOutputStream.h0(list.get(i6));
        }
        return X0;
    }

    public static void c0(int i5, List<Integer> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.B(i5, list, z5);
    }

    static int d(int i5, List<Integer> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e6 = e(list);
        if (!z5) {
            return (CodedOutputStream.X0(i5) * size) + e6;
        }
        return CodedOutputStream.Z0(e6) + e6 + CodedOutputStream.X0(i5);
    }

    public static void d0(int i5, long j5, s4 s4Var) throws IOException {
        if (j5 != 0) {
            s4Var.i(i5, j5);
        }
    }

    static int e(List<Integer> list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.l0(n1Var.getInt(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.l0(list.get(i6).intValue());
                i6++;
            }
        }
        return i5;
    }

    public static void e0(int i5, List<Long> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.x(i5, list, z5);
    }

    static int f(int i5, List<?> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z5) {
            return CodedOutputStream.m0(i5, 0) * size;
        }
        int i6 = size * 4;
        return CodedOutputStream.Z0(i6) + i6 + CodedOutputStream.X0(i5);
    }

    public static void f0(int i5, float f6, s4 s4Var) throws IOException {
        if (Float.compare(f6, 0.0f) != 0) {
            s4Var.I(i5, f6);
        }
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    public static void g0(int i5, List<Float> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.a(i5, list, z5);
    }

    static int h(int i5, List<?> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z5) {
            return CodedOutputStream.o0(i5, 0L) * size;
        }
        int i6 = size * 8;
        return CodedOutputStream.Z0(i6) + i6 + CodedOutputStream.X0(i5);
    }

    public static void h0(int i5, List<?> list, s4 s4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.h(i5, list);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    public static void i0(int i5, List<?> list, s4 s4Var, j3 j3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.m(i5, list, j3Var);
    }

    static int j(int i5, List<h2> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += CodedOutputStream.s0(i5, list.get(i7));
        }
        return i6;
    }

    public static void j0(int i5, int i6, s4 s4Var) throws IOException {
        if (i6 != 0) {
            s4Var.w(i5, i6);
        }
    }

    static int k(int i5, List<h2> list, j3 j3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            i6 += CodedOutputStream.t0(i5, list.get(i7), j3Var);
        }
        return i6;
    }

    public static void k0(int i5, List<Integer> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.r(i5, list, z5);
    }

    static int l(int i5, List<Integer> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m5 = m(list);
        if (!z5) {
            return (CodedOutputStream.X0(i5) * size) + m5;
        }
        return CodedOutputStream.Z0(m5) + m5 + CodedOutputStream.X0(i5);
    }

    public static void l0(int i5, long j5, s4 s4Var) throws IOException {
        if (j5 != 0) {
            s4Var.s(i5, j5);
        }
    }

    static int m(List<Integer> list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.x0(n1Var.getInt(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.x0(list.get(i6).intValue());
                i6++;
            }
        }
        return i5;
    }

    public static void m0(int i5, List<Long> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.M(i5, list, z5);
    }

    static int n(int i5, List<Long> list, boolean z5) {
        if (list.size() == 0) {
            return 0;
        }
        int o5 = o(list);
        if (z5) {
            return CodedOutputStream.Z0(o5) + o5 + CodedOutputStream.X0(i5);
        }
        return (CodedOutputStream.X0(i5) * list.size()) + o5;
    }

    public static void n0(int i5, List<?> list, s4 s4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((s1) it.next()).o(s4Var, i5);
        }
    }

    static int o(List<Long> list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y1) {
            y1 y1Var = (y1) list;
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.z0(y1Var.getLong(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.z0(list.get(i6).longValue());
                i6++;
            }
        }
        return i5;
    }

    public static void o0(int i5, Object obj, s4 s4Var) throws IOException {
        if (obj != null) {
            s4Var.q(i5, obj);
        }
    }

    static int p(int i5, Object obj, j3 j3Var) {
        return obj instanceof s1 ? CodedOutputStream.B0(i5, (s1) obj) : CodedOutputStream.G0(i5, (h2) obj, j3Var);
    }

    public static void p0(int i5, List<?> list, s4 s4Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.n(i5, list);
    }

    static int q(int i5, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i5) * size;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            X0 = (obj instanceof s1 ? CodedOutputStream.C0((s1) obj) : CodedOutputStream.H0((h2) obj)) + X0;
        }
        return X0;
    }

    public static void q0(int i5, List<?> list, s4 s4Var, j3 j3Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.k(i5, list, j3Var);
    }

    static int r(int i5, List<?> list, j3 j3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i5) * size;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = list.get(i6);
            X0 = obj instanceof s1 ? CodedOutputStream.C0((s1) obj) + X0 : X0 + CodedOutputStream.I0((h2) obj, j3Var);
        }
        return X0;
    }

    public static void r0(int i5, int i6, s4 s4Var) throws IOException {
        if (i6 != 0) {
            s4Var.u(i5, i6);
        }
    }

    static int s(int i5, List<Integer> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t5 = t(list);
        if (!z5) {
            return (CodedOutputStream.X0(i5) * size) + t5;
        }
        return CodedOutputStream.Z0(t5) + t5 + CodedOutputStream.X0(i5);
    }

    public static void s0(int i5, List<Integer> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.y(i5, list, z5);
    }

    static int t(List<Integer> list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.S0(n1Var.getInt(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.S0(list.get(i6).intValue());
                i6++;
            }
        }
        return i5;
    }

    public static void t0(int i5, long j5, s4 s4Var) throws IOException {
        if (j5 != 0) {
            s4Var.A(i5, j5);
        }
    }

    static int u(int i5, List<Long> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int v5 = v(list);
        if (!z5) {
            return (CodedOutputStream.X0(i5) * size) + v5;
        }
        return CodedOutputStream.Z0(v5) + v5 + CodedOutputStream.X0(i5);
    }

    public static void u0(int i5, List<Long> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.f(i5, list, z5);
    }

    static int v(List<Long> list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y1) {
            y1 y1Var = (y1) list;
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.U0(y1Var.getLong(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.U0(list.get(i6).longValue());
                i6++;
            }
        }
        return i5;
    }

    public static void v0(int i5, int i6, s4 s4Var) throws IOException {
        if (i6 != 0) {
            s4Var.Q(i5, i6);
        }
    }

    static int w(int i5, List<?> list) {
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        int X0 = CodedOutputStream.X0(i5) * size;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            while (i6 < size) {
                Object b12 = u1Var.b1(i6);
                X0 = (b12 instanceof w ? CodedOutputStream.h0((w) b12) : CodedOutputStream.W0((String) b12)) + X0;
                i6++;
            }
        } else {
            while (i6 < size) {
                Object obj = list.get(i6);
                X0 = (obj instanceof w ? CodedOutputStream.h0((w) obj) : CodedOutputStream.W0((String) obj)) + X0;
                i6++;
            }
        }
        return X0;
    }

    public static void w0(int i5, List<Integer> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.K(i5, list, z5);
    }

    static int x(int i5, List<Integer> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y5 = y(list);
        if (!z5) {
            return (CodedOutputStream.X0(i5) * size) + y5;
        }
        return CodedOutputStream.Z0(y5) + y5 + CodedOutputStream.X0(i5);
    }

    public static void x0(int i5, long j5, s4 s4Var) throws IOException {
        if (j5 != 0) {
            s4Var.H(i5, j5);
        }
    }

    static int y(List<Integer> list) {
        int i5;
        int size = list.size();
        int i6 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n1) {
            n1 n1Var = (n1) list;
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.Z0(n1Var.getInt(i6));
                i6++;
            }
        } else {
            i5 = 0;
            while (i6 < size) {
                i5 += CodedOutputStream.Z0(list.get(i6).intValue());
                i6++;
            }
        }
        return i5;
    }

    public static void y0(int i5, List<Long> list, s4 s4Var, boolean z5) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s4Var.G(i5, list, z5);
    }

    static int z(int i5, List<Long> list, boolean z5) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int A = A(list);
        if (!z5) {
            return (CodedOutputStream.X0(i5) * size) + A;
        }
        return CodedOutputStream.Z0(A) + A + CodedOutputStream.X0(i5);
    }

    public static void z0(int i5, Object obj, s4 s4Var) throws IOException {
        if (obj instanceof String) {
            A0(i5, (String) obj, s4Var);
        } else {
            V(i5, (w) obj, s4Var);
        }
    }
}
