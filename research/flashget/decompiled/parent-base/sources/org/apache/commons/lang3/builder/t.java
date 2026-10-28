package org.apache.commons.lang3.builder;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.text.m0;
import org.apache.commons.lang3.a1;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.p0;

/* compiled from: ToStringStyle.java */
/* loaded from: classes6.dex */
public abstract class t implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    private static final long f85779v = -2587890625525655916L;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85784b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f85785c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85786d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f85787e = true;

    /* renamed from: f, reason: collision with root package name */
    private String f85788f = "[";

    /* renamed from: g, reason: collision with root package name */
    private String f85789g = "]";

    /* renamed from: h, reason: collision with root package name */
    private String f85790h = "=";

    /* renamed from: i, reason: collision with root package name */
    private boolean f85791i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f85792j = false;

    /* renamed from: k, reason: collision with root package name */
    private String f85793k = ",";

    /* renamed from: l, reason: collision with root package name */
    private String f85794l = "{";

    /* renamed from: m, reason: collision with root package name */
    private String f85795m = ",";

    /* renamed from: n, reason: collision with root package name */
    private boolean f85796n = true;

    /* renamed from: o, reason: collision with root package name */
    private String f85797o = "}";

    /* renamed from: p, reason: collision with root package name */
    private boolean f85798p = true;

    /* renamed from: q, reason: collision with root package name */
    private String f85799q = "<null>";

    /* renamed from: r, reason: collision with root package name */
    private String f85800r = "<size=";

    /* renamed from: s, reason: collision with root package name */
    private String f85801s = ">";

    /* renamed from: t, reason: collision with root package name */
    private String f85802t = "<";

    /* renamed from: u, reason: collision with root package name */
    private String f85803u = ">";

    /* renamed from: w, reason: collision with root package name */
    public static final t f85780w = new a();

    /* renamed from: x, reason: collision with root package name */
    public static final t f85781x = new c();

    /* renamed from: y, reason: collision with root package name */
    public static final t f85782y = new e();

    /* renamed from: z, reason: collision with root package name */
    public static final t f85783z = new f();
    public static final t A = new g();
    public static final t B = new d();
    public static final t C = new b();
    private static final ThreadLocal<WeakHashMap<Object, Object>> D = new ThreadLocal<>();

    /* compiled from: ToStringStyle.java */
    private static final class a extends t {
        private static final long E = 1;

        a() {
        }

        private Object i1() {
            return t.f85780w;
        }
    }

    /* compiled from: ToStringStyle.java */
    private static final class b extends t {
        private static final long E = 1;
        private static final String F = "\"";

        b() {
            d1(false);
            f1(false);
            S0("{");
            R0("}");
            Q0("[");
            O0("]");
            V0(",");
            U0(":");
            Y0("null");
            c1("\"<");
            b1(">\"");
            a1("\"<size=");
            Z0(">\"");
        }

        private void i1(StringBuffer stringBuffer, String str) {
            stringBuffer.append(m0.quote);
            stringBuffer.append(a1.f(str));
            stringBuffer.append(m0.quote);
        }

        private boolean j1(String str) {
            return str.startsWith(o0()) && str.endsWith(m0());
        }

        private boolean k1(String str) {
            return str.startsWith(q0()) && str.endsWith(p0());
        }

        private Object l1() {
            return t.C;
        }

        @Override // org.apache.commons.lang3.builder.t
        protected void D(StringBuffer stringBuffer, String str, Object obj) {
            if (obj == null) {
                X(stringBuffer, str);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Character)) {
                i1(stringBuffer, obj.toString());
                return;
            }
            if ((obj instanceof Number) || (obj instanceof Boolean)) {
                stringBuffer.append(obj);
                return;
            }
            String obj2 = obj.toString();
            if (k1(obj2) || j1(obj2)) {
                stringBuffer.append(obj);
            } else {
                D(stringBuffer, str, obj2);
            }
        }

        @Override // org.apache.commons.lang3.builder.t
        protected void F(StringBuffer stringBuffer, String str, Map<?, ?> map) {
            if (map == null || map.isEmpty()) {
                stringBuffer.append(map);
                return;
            }
            stringBuffer.append(q0());
            boolean z4 = true;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String objects = Objects.toString(entry.getKey(), null);
                if (objects != null) {
                    if (z4) {
                        z4 = false;
                    } else {
                        T(stringBuffer);
                    }
                    U(stringBuffer, objects);
                    Object value = entry.getValue();
                    if (value == null) {
                        X(stringBuffer, objects);
                    } else {
                        W(stringBuffer, objects, value, true);
                    }
                }
            }
            stringBuffer.append(p0());
        }

        @Override // org.apache.commons.lang3.builder.t
        protected void U(StringBuffer stringBuffer, String str) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            super.U(stringBuffer, "\"" + a1.f(str) + "\"");
        }

        @Override // org.apache.commons.lang3.builder.t
        public void g(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.g(stringBuffer, str, obj, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void j(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.j(stringBuffer, str, bArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void k(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.k(stringBuffer, str, cArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void l(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.l(stringBuffer, str, dArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void m(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.m(stringBuffer, str, fArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void n(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.n(stringBuffer, str, iArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void o(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.o(stringBuffer, str, jArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void p(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.p(stringBuffer, str, objArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void q(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.q(stringBuffer, str, sArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        public void r(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
            if (str == null) {
                throw new UnsupportedOperationException("Field names are mandatory when using JsonToStringStyle");
            }
            if (!E0(bool)) {
                throw new UnsupportedOperationException("FullDetail must be true when using JsonToStringStyle");
            }
            super.r(stringBuffer, str, zArr, bool);
        }

        @Override // org.apache.commons.lang3.builder.t
        protected void x(StringBuffer stringBuffer, String str, char c5) {
            i1(stringBuffer, String.valueOf(c5));
        }
    }

    /* compiled from: ToStringStyle.java */
    private static final class c extends t {
        private static final long E = 1;

        c() {
            S0("[");
            V0(System.lineSeparator() + "  ");
            X0(true);
            R0(System.lineSeparator() + "]");
        }

        private Object i1() {
            return t.f85781x;
        }
    }

    /* compiled from: ToStringStyle.java */
    private static final class d extends t {
        private static final long E = 1;

        d() {
            d1(false);
            f1(false);
        }

        private Object i1() {
            return t.B;
        }
    }

    /* compiled from: ToStringStyle.java */
    private static final class e extends t {
        private static final long E = 1;

        e() {
            e1(false);
        }

        private Object i1() {
            return t.f85782y;
        }
    }

    /* compiled from: ToStringStyle.java */
    private static final class f extends t {
        private static final long E = 1;

        f() {
            g1(true);
            f1(false);
        }

        private Object i1() {
            return t.f85783z;
        }
    }

    /* compiled from: ToStringStyle.java */
    private static final class g extends t {
        private static final long E = 1;

        g() {
            d1(false);
            f1(false);
            e1(false);
            S0("");
            R0("");
        }

        private Object i1() {
            return t.A;
        }
    }

    protected t() {
    }

    static boolean F0(Object obj) {
        Map<Object, Object> u02 = u0();
        return u02 != null && u02.containsKey(obj);
    }

    static void L0(Object obj) {
        if (obj != null) {
            if (u0() == null) {
                D.set(new WeakHashMap<>());
            }
            u0().put(obj, null);
        }
    }

    static void h1(Object obj) {
        Map<Object, Object> u02;
        if (obj == null || (u02 = u0()) == null) {
            return;
        }
        u02.remove(obj);
        if (u02.isEmpty()) {
            D.remove();
        }
    }

    static Map<Object, Object> u0() {
        return D.get();
    }

    protected void A(StringBuffer stringBuffer, String str, int i4) {
        stringBuffer.append(i4);
    }

    protected boolean A0() {
        return this.f85796n;
    }

    protected void B(StringBuffer stringBuffer, String str, int i4, Object obj) {
        if (i4 > 0) {
            stringBuffer.append(this.f85795m);
        }
        if (obj == null) {
            X(stringBuffer, str);
        } else {
            W(stringBuffer, str, obj, this.f85796n);
        }
    }

    protected boolean B0() {
        return this.f85798p;
    }

    protected void C(StringBuffer stringBuffer, String str, long j4) {
        stringBuffer.append(j4);
    }

    protected boolean C0() {
        return this.f85792j;
    }

    protected void D(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(obj);
    }

    protected boolean D0() {
        return this.f85791i;
    }

    protected void E(StringBuffer stringBuffer, String str, Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            stringBuffer.append(collection);
            return;
        }
        stringBuffer.append(this.f85794l);
        Iterator<?> it = collection.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            B(stringBuffer, str, i4, it.next());
            i4++;
        }
        stringBuffer.append(this.f85797o);
    }

    protected boolean E0(Boolean bool) {
        return bool == null ? this.f85798p : bool.booleanValue();
    }

    protected void F(StringBuffer stringBuffer, String str, Map<?, ?> map) {
        stringBuffer.append(map);
    }

    protected void G(StringBuffer stringBuffer, String str, short s4) {
        stringBuffer.append((int) s4);
    }

    protected boolean G0() {
        return this.f85785c;
    }

    protected void H(StringBuffer stringBuffer, String str, boolean z4) {
        stringBuffer.append(z4);
    }

    protected boolean H0() {
        return this.f85784b;
    }

    protected void I(StringBuffer stringBuffer, String str, byte[] bArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < bArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            w(stringBuffer, str, bArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected boolean I0() {
        return this.f85787e;
    }

    protected void J(StringBuffer stringBuffer, String str, char[] cArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < cArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            x(stringBuffer, str, cArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected boolean J0() {
        return this.f85786d;
    }

    protected void K(StringBuffer stringBuffer, String str, double[] dArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < dArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            y(stringBuffer, str, dArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected void K0(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f85794l);
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            B(stringBuffer, str, i4, Array.get(obj, i4));
        }
        stringBuffer.append(this.f85797o);
    }

    protected void L(StringBuffer stringBuffer, String str, float[] fArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < fArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            z(stringBuffer, str, fArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected void M(StringBuffer stringBuffer, String str, int[] iArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            A(stringBuffer, str, iArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected void M0(StringBuffer stringBuffer) {
        if (b1.N(stringBuffer, this.f85793k)) {
            stringBuffer.setLength(stringBuffer.length() - this.f85793k.length());
        }
    }

    protected void N(StringBuffer stringBuffer, String str, long[] jArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < jArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            C(stringBuffer, str, jArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected void N0(boolean z4) {
        this.f85796n = z4;
    }

    protected void O(StringBuffer stringBuffer, String str, Object[] objArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < objArr.length; i4++) {
            B(stringBuffer, str, i4, objArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected void O0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85797o = str;
    }

    protected void P(StringBuffer stringBuffer, String str, short[] sArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < sArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            G(stringBuffer, str, sArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected void P0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85795m = str;
    }

    protected void Q(StringBuffer stringBuffer, String str, boolean[] zArr) {
        stringBuffer.append(this.f85794l);
        for (int i4 = 0; i4 < zArr.length; i4++) {
            if (i4 > 0) {
                stringBuffer.append(this.f85795m);
            }
            H(stringBuffer, str, zArr[i4]);
        }
        stringBuffer.append(this.f85797o);
    }

    protected void Q0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85794l = str;
    }

    public void R(StringBuffer stringBuffer, Object obj) {
        if (!this.f85792j) {
            M0(stringBuffer);
        }
        t(stringBuffer);
        h1(obj);
    }

    protected void R0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85789g = str;
    }

    protected void S(StringBuffer stringBuffer, String str) {
        T(stringBuffer);
    }

    protected void S0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85788f = str;
    }

    protected void T(StringBuffer stringBuffer) {
        stringBuffer.append(this.f85793k);
    }

    protected void T0(boolean z4) {
        this.f85798p = z4;
    }

    protected void U(StringBuffer stringBuffer, String str) {
        if (!this.f85784b || str == null) {
            return;
        }
        stringBuffer.append(str);
        stringBuffer.append(this.f85790h);
    }

    protected void U0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85790h = str;
    }

    protected void V(StringBuffer stringBuffer, Object obj) {
        if (!I0() || obj == null) {
            return;
        }
        L0(obj);
        stringBuffer.append('@');
        stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    protected void V0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85793k = str;
    }

    protected void W(StringBuffer stringBuffer, String str, Object obj, boolean z4) {
        if (F0(obj) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character)) {
            v(stringBuffer, str, obj);
            return;
        }
        L0(obj);
        try {
            if (obj instanceof Collection) {
                if (z4) {
                    E(stringBuffer, str, (Collection) obj);
                } else {
                    j0(stringBuffer, str, ((Collection) obj).size());
                }
            } else if (obj instanceof Map) {
                if (z4) {
                    F(stringBuffer, str, (Map) obj);
                } else {
                    j0(stringBuffer, str, ((Map) obj).size());
                }
            } else if (obj instanceof long[]) {
                if (z4) {
                    N(stringBuffer, str, (long[]) obj);
                } else {
                    f0(stringBuffer, str, (long[]) obj);
                }
            } else if (obj instanceof int[]) {
                if (z4) {
                    M(stringBuffer, str, (int[]) obj);
                } else {
                    e0(stringBuffer, str, (int[]) obj);
                }
            } else if (obj instanceof short[]) {
                if (z4) {
                    P(stringBuffer, str, (short[]) obj);
                } else {
                    h0(stringBuffer, str, (short[]) obj);
                }
            } else if (obj instanceof byte[]) {
                if (z4) {
                    I(stringBuffer, str, (byte[]) obj);
                } else {
                    a0(stringBuffer, str, (byte[]) obj);
                }
            } else if (obj instanceof char[]) {
                if (z4) {
                    J(stringBuffer, str, (char[]) obj);
                } else {
                    b0(stringBuffer, str, (char[]) obj);
                }
            } else if (obj instanceof double[]) {
                if (z4) {
                    K(stringBuffer, str, (double[]) obj);
                } else {
                    c0(stringBuffer, str, (double[]) obj);
                }
            } else if (obj instanceof float[]) {
                if (z4) {
                    L(stringBuffer, str, (float[]) obj);
                } else {
                    d0(stringBuffer, str, (float[]) obj);
                }
            } else if (obj instanceof boolean[]) {
                if (z4) {
                    Q(stringBuffer, str, (boolean[]) obj);
                } else {
                    i0(stringBuffer, str, (boolean[]) obj);
                }
            } else if (obj.getClass().isArray()) {
                if (z4) {
                    O(stringBuffer, str, (Object[]) obj);
                } else {
                    g0(stringBuffer, str, (Object[]) obj);
                }
            } else if (z4) {
                D(stringBuffer, str, obj);
            } else {
                Z(stringBuffer, str, obj);
            }
            h1(obj);
        } catch (Throwable th) {
            h1(obj);
            throw th;
        }
    }

    protected void W0(boolean z4) {
        this.f85792j = z4;
    }

    protected void X(StringBuffer stringBuffer, String str) {
        stringBuffer.append(this.f85799q);
    }

    protected void X0(boolean z4) {
        this.f85791i = z4;
    }

    public void Y(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            s(stringBuffer, obj);
            V(stringBuffer, obj);
            u(stringBuffer);
            if (this.f85791i) {
                T(stringBuffer);
            }
        }
    }

    protected void Y0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85799q = str;
    }

    protected void Z(StringBuffer stringBuffer, String str, Object obj) {
        stringBuffer.append(this.f85802t);
        stringBuffer.append(v0(obj.getClass()));
        stringBuffer.append(this.f85803u);
    }

    protected void Z0(String str) {
        if (str == null) {
            str = "";
        }
        this.f85801s = str;
    }

    public void a(StringBuffer stringBuffer, String str, byte b5) {
        U(stringBuffer, str);
        w(stringBuffer, str, b5);
        S(stringBuffer, str);
    }

    protected void a0(StringBuffer stringBuffer, String str, byte[] bArr) {
        j0(stringBuffer, str, bArr.length);
    }

    protected void a1(String str) {
        if (str == null) {
            str = "";
        }
        this.f85800r = str;
    }

    public void b(StringBuffer stringBuffer, String str, char c5) {
        U(stringBuffer, str);
        x(stringBuffer, str, c5);
        S(stringBuffer, str);
    }

    protected void b0(StringBuffer stringBuffer, String str, char[] cArr) {
        j0(stringBuffer, str, cArr.length);
    }

    protected void b1(String str) {
        if (str == null) {
            str = "";
        }
        this.f85803u = str;
    }

    public void c(StringBuffer stringBuffer, String str, double d5) {
        U(stringBuffer, str);
        y(stringBuffer, str, d5);
        S(stringBuffer, str);
    }

    protected void c0(StringBuffer stringBuffer, String str, double[] dArr) {
        j0(stringBuffer, str, dArr.length);
    }

    protected void c1(String str) {
        if (str == null) {
            str = "";
        }
        this.f85802t = str;
    }

    public void d(StringBuffer stringBuffer, String str, float f4) {
        U(stringBuffer, str);
        z(stringBuffer, str, f4);
        S(stringBuffer, str);
    }

    protected void d0(StringBuffer stringBuffer, String str, float[] fArr) {
        j0(stringBuffer, str, fArr.length);
    }

    protected void d1(boolean z4) {
        this.f85785c = z4;
    }

    public void e(StringBuffer stringBuffer, String str, int i4) {
        U(stringBuffer, str);
        A(stringBuffer, str, i4);
        S(stringBuffer, str);
    }

    protected void e0(StringBuffer stringBuffer, String str, int[] iArr) {
        j0(stringBuffer, str, iArr.length);
    }

    protected void e1(boolean z4) {
        this.f85784b = z4;
    }

    public void f(StringBuffer stringBuffer, String str, long j4) {
        U(stringBuffer, str);
        C(stringBuffer, str, j4);
        S(stringBuffer, str);
    }

    protected void f0(StringBuffer stringBuffer, String str, long[] jArr) {
        j0(stringBuffer, str, jArr.length);
    }

    protected void f1(boolean z4) {
        this.f85787e = z4;
    }

    public void g(StringBuffer stringBuffer, String str, Object obj, Boolean bool) {
        U(stringBuffer, str);
        if (obj == null) {
            X(stringBuffer, str);
        } else {
            W(stringBuffer, str, obj, E0(bool));
        }
        S(stringBuffer, str);
    }

    protected void g0(StringBuffer stringBuffer, String str, Object[] objArr) {
        j0(stringBuffer, str, objArr.length);
    }

    protected void g1(boolean z4) {
        this.f85786d = z4;
    }

    public void h(StringBuffer stringBuffer, String str, short s4) {
        U(stringBuffer, str);
        G(stringBuffer, str, s4);
        S(stringBuffer, str);
    }

    protected void h0(StringBuffer stringBuffer, String str, short[] sArr) {
        j0(stringBuffer, str, sArr.length);
    }

    public void i(StringBuffer stringBuffer, String str, boolean z4) {
        U(stringBuffer, str);
        H(stringBuffer, str, z4);
        S(stringBuffer, str);
    }

    protected void i0(StringBuffer stringBuffer, String str, boolean[] zArr) {
        j0(stringBuffer, str, zArr.length);
    }

    public void j(StringBuffer stringBuffer, String str, byte[] bArr, Boolean bool) {
        U(stringBuffer, str);
        if (bArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            I(stringBuffer, str, bArr);
        } else {
            a0(stringBuffer, str, bArr);
        }
        S(stringBuffer, str);
    }

    protected void j0(StringBuffer stringBuffer, String str, int i4) {
        stringBuffer.append(this.f85800r);
        stringBuffer.append(i4);
        stringBuffer.append(this.f85801s);
    }

    public void k(StringBuffer stringBuffer, String str, char[] cArr, Boolean bool) {
        U(stringBuffer, str);
        if (cArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            J(stringBuffer, str, cArr);
        } else {
            b0(stringBuffer, str, cArr);
        }
        S(stringBuffer, str);
    }

    public void k0(StringBuffer stringBuffer, String str) {
        l0(stringBuffer, str);
    }

    public void l(StringBuffer stringBuffer, String str, double[] dArr, Boolean bool) {
        U(stringBuffer, str);
        if (dArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            K(stringBuffer, str, dArr);
        } else {
            c0(stringBuffer, str, dArr);
        }
        S(stringBuffer, str);
    }

    public void l0(StringBuffer stringBuffer, String str) {
        if (str != null) {
            int length = this.f85788f.length() + str.indexOf(this.f85788f);
            int lastIndexOf = str.lastIndexOf(this.f85789g);
            if (length == lastIndexOf || length < 0 || lastIndexOf < 0) {
                return;
            }
            if (this.f85791i) {
                M0(stringBuffer);
            }
            stringBuffer.append((CharSequence) str, length, lastIndexOf);
            T(stringBuffer);
        }
    }

    public void m(StringBuffer stringBuffer, String str, float[] fArr, Boolean bool) {
        U(stringBuffer, str);
        if (fArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            L(stringBuffer, str, fArr);
        } else {
            d0(stringBuffer, str, fArr);
        }
        S(stringBuffer, str);
    }

    protected String m0() {
        return this.f85797o;
    }

    public void n(StringBuffer stringBuffer, String str, int[] iArr, Boolean bool) {
        U(stringBuffer, str);
        if (iArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            M(stringBuffer, str, iArr);
        } else {
            e0(stringBuffer, str, iArr);
        }
        S(stringBuffer, str);
    }

    protected String n0() {
        return this.f85795m;
    }

    public void o(StringBuffer stringBuffer, String str, long[] jArr, Boolean bool) {
        U(stringBuffer, str);
        if (jArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            N(stringBuffer, str, jArr);
        } else {
            f0(stringBuffer, str, jArr);
        }
        S(stringBuffer, str);
    }

    protected String o0() {
        return this.f85794l;
    }

    public void p(StringBuffer stringBuffer, String str, Object[] objArr, Boolean bool) {
        U(stringBuffer, str);
        if (objArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            O(stringBuffer, str, objArr);
        } else {
            g0(stringBuffer, str, objArr);
        }
        S(stringBuffer, str);
    }

    protected String p0() {
        return this.f85789g;
    }

    public void q(StringBuffer stringBuffer, String str, short[] sArr, Boolean bool) {
        U(stringBuffer, str);
        if (sArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            P(stringBuffer, str, sArr);
        } else {
            h0(stringBuffer, str, sArr);
        }
        S(stringBuffer, str);
    }

    protected String q0() {
        return this.f85788f;
    }

    public void r(StringBuffer stringBuffer, String str, boolean[] zArr, Boolean bool) {
        U(stringBuffer, str);
        if (zArr == null) {
            X(stringBuffer, str);
        } else if (E0(bool)) {
            Q(stringBuffer, str, zArr);
        } else {
            i0(stringBuffer, str, zArr);
        }
        S(stringBuffer, str);
    }

    protected String r0() {
        return this.f85790h;
    }

    protected void s(StringBuffer stringBuffer, Object obj) {
        if (!this.f85785c || obj == null) {
            return;
        }
        L0(obj);
        if (this.f85786d) {
            stringBuffer.append(v0(obj.getClass()));
        } else {
            stringBuffer.append(obj.getClass().getName());
        }
    }

    protected String s0() {
        return this.f85793k;
    }

    protected void t(StringBuffer stringBuffer) {
        stringBuffer.append(this.f85789g);
    }

    protected String t0() {
        return this.f85799q;
    }

    protected void u(StringBuffer stringBuffer) {
        stringBuffer.append(this.f85788f);
    }

    protected void v(StringBuffer stringBuffer, String str, Object obj) {
        p0.C(stringBuffer, obj);
    }

    protected String v0(Class<?> cls) {
        return org.apache.commons.lang3.s.G(cls);
    }

    protected void w(StringBuffer stringBuffer, String str, byte b5) {
        stringBuffer.append((int) b5);
    }

    protected String w0() {
        return this.f85801s;
    }

    protected void x(StringBuffer stringBuffer, String str, char c5) {
        stringBuffer.append(c5);
    }

    protected String x0() {
        return this.f85800r;
    }

    protected void y(StringBuffer stringBuffer, String str, double d5) {
        stringBuffer.append(d5);
    }

    protected String y0() {
        return this.f85803u;
    }

    protected void z(StringBuffer stringBuffer, String str, float f4) {
        stringBuffer.append(f4);
    }

    protected String z0() {
        return this.f85802t;
    }
}
