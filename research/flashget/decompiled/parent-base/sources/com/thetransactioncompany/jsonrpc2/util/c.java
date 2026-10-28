package com.thetransactioncompany.jsonrpc2.util;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.thetransactioncompany.jsonrpc2.JSONRPC2Error;
import java.util.List;
import java.util.Map;
import kotlin.text.m0;

/* compiled from: PositionalParamsRetriever.java */
/* loaded from: classes7.dex */
public class c extends b {

    /* renamed from: a, reason: collision with root package name */
    private List<Object> f72872a;

    public c(List<Object> list) {
        this.f72872a = null;
        if (list == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("布\u0001"));
        }
        this.f72872a = list;
    }

    private static JSONRPC2Error Z(int i4) {
        return JSONRPC2Error.f72802h.b(ProtectedSandApp.s("帄\u0001") + i4 + ProtectedSandApp.s("帅\u0001"));
    }

    private static JSONRPC2Error a0(int i4) {
        return JSONRPC2Error.f72802h.b(ProtectedSandApp.s("帄\u0001") + i4 + ProtectedSandApp.s("帆\u0001"));
    }

    private static <T extends Enum<T>> void b0(int i4, Class<T> cls) throws JSONRPC2Error {
        StringBuilder sb = new StringBuilder(r2.a(ProtectedSandApp.s("帇\u0001"), i4, ProtectedSandApp.s("师\u0001")));
        T[] enumConstants = cls.getEnumConstants();
        for (int i5 = 0; i5 < enumConstants.length; i5++) {
            if (i5 > 0 && i5 == enumConstants.length - 1) {
                sb.append(ProtectedSandApp.s("帉\u0001"));
            } else if (i5 > 0) {
                sb.append(ProtectedSandApp.s("帊\u0001"));
            }
            sb.append(m0.quote);
            sb.append(enumConstants[i5].toString());
            sb.append(m0.quote);
        }
        throw JSONRPC2Error.f72802h.b(sb.toString());
    }

    private static void c0(int i4, String[] strArr) throws JSONRPC2Error {
        StringBuilder sb = new StringBuilder(r2.a(ProtectedSandApp.s("帇\u0001"), i4, ProtectedSandApp.s("帋\u0001")));
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (i5 > 0 && i5 == strArr.length - 1) {
                sb.append(ProtectedSandApp.s("帉\u0001"));
            } else if (i5 > 0) {
                sb.append(ProtectedSandApp.s("帊\u0001"));
            }
            sb.append(m0.quote);
            sb.append(strArr[i5]);
            sb.append(m0.quote);
        }
        throw JSONRPC2Error.f72802h.b(sb.toString());
    }

    private static void d0(int i4) throws JSONRPC2Error {
        throw JSONRPC2Error.f72802h.b(ProtectedSandApp.s("希\u0001") + i4);
    }

    private static void e0(int i4) throws JSONRPC2Error {
        throw JSONRPC2Error.f72802h.b(ProtectedSandApp.s("帄\u0001") + i4 + ProtectedSandApp.s("帍\u0001"));
    }

    public <T> T A(int i4, Class<T> cls, boolean z4, T t4) throws JSONRPC2Error {
        if (!Y(i4)) {
            return t4;
        }
        i(i4, cls, z4);
        try {
            return (T) this.f72872a.get(i4);
        } catch (ClassCastException unused) {
            throw a0(i4);
        }
    }

    public boolean B(int i4, boolean z4) throws JSONRPC2Error {
        return ((Boolean) z(i4, Boolean.class, Boolean.valueOf(z4))).booleanValue();
    }

    public double C(int i4, double d5) throws JSONRPC2Error {
        return ((Number) z(i4, Number.class, Double.valueOf(d5))).doubleValue();
    }

    public <T extends Enum<T>> T D(int i4, Class<T> cls, String str) throws JSONRPC2Error {
        return (T) E(i4, cls, str, false);
    }

    public <T extends Enum<T>> T E(int i4, Class<T> cls, String str, boolean z4) throws JSONRPC2Error {
        String str2 = (String) z(i4, String.class, str);
        if (str == null && str2 == null) {
            return null;
        }
        T t4 = (T) b.a(str2, cls, z4);
        if (t4 == null) {
            b0(i4, cls);
        }
        return t4;
    }

    public String F(int i4, String[] strArr, String str) throws JSONRPC2Error {
        return G(i4, strArr, str, false);
    }

    public String G(int i4, String[] strArr, String str, boolean z4) throws JSONRPC2Error {
        String str2 = (String) z(i4, String.class, str);
        if (str == null && str2 == null) {
            return null;
        }
        String b5 = b.b(str2, strArr, z4);
        if (b5 == null) {
            c0(i4, strArr);
        }
        return b5;
    }

    public float H(int i4, float f4) throws JSONRPC2Error {
        return ((Number) z(i4, Number.class, Float.valueOf(f4))).floatValue();
    }

    public int I(int i4, int i5) throws JSONRPC2Error {
        return ((Number) z(i4, Number.class, Integer.valueOf(i5))).intValue();
    }

    public List<Object> J(int i4, List<Object> list) throws JSONRPC2Error {
        return K(i4, false, list);
    }

    public List<Object> K(int i4, boolean z4, List<Object> list) throws JSONRPC2Error {
        return (List) A(i4, List.class, z4, list);
    }

    public long L(int i4, long j4) throws JSONRPC2Error {
        return ((Number) z(i4, Number.class, Long.valueOf(j4))).longValue();
    }

    public Map<String, Object> M(int i4, Map<String, Object> map) throws JSONRPC2Error {
        return N(i4, false, map);
    }

    public Map<String, Object> N(int i4, boolean z4, Map<String, Object> map) throws JSONRPC2Error {
        try {
            return (Map) A(i4, Map.class, z4, map);
        } catch (ClassCastException unused) {
            throw a0(i4);
        }
    }

    public String O(int i4, String str) throws JSONRPC2Error {
        return P(i4, false, str);
    }

    public String P(int i4, boolean z4, String str) throws JSONRPC2Error {
        return (String) A(i4, String.class, z4, str);
    }

    public String[] Q(int i4, boolean z4, String[] strArr) throws JSONRPC2Error {
        return !Y(i4) ? strArr : W(i4, z4);
    }

    public String[] R(int i4, String[] strArr) throws JSONRPC2Error {
        return Q(i4, false, strArr);
    }

    public List<Object> S() {
        return this.f72872a;
    }

    public String T(int i4) throws JSONRPC2Error {
        return U(i4, false);
    }

    public String U(int i4, boolean z4) throws JSONRPC2Error {
        return (String) l(i4, String.class, z4);
    }

    public String[] V(int i4) throws JSONRPC2Error {
        return W(i4, false);
    }

    public String[] W(int i4, boolean z4) throws JSONRPC2Error {
        List<Object> v4 = v(i4, z4);
        if (v4 == null) {
            return null;
        }
        try {
            return (String[]) v4.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw Z(i4);
        }
    }

    public boolean X(int i4) {
        return i4 < this.f72872a.size();
    }

    @Deprecated
    public boolean Y(int i4) {
        return X(i4);
    }

    @Override // com.thetransactioncompany.jsonrpc2.util.b
    public int c() {
        return this.f72872a.size();
    }

    public void d(int i4) throws JSONRPC2Error {
        if (i4 >= this.f72872a.size()) {
            d0(i4);
        }
    }

    public <T> void e(int i4, Class<T> cls) throws JSONRPC2Error {
        i(i4, cls, false);
    }

    public <T> void f(int i4, Class<T> cls, boolean z4) throws JSONRPC2Error {
        g(i4);
        Object obj = this.f72872a.get(i4);
        if (obj == null) {
            if (z4) {
                return;
            } else {
                e0(i4);
            }
        }
        if (!cls.isAssignableFrom(obj.getClass())) {
            throw a0(i4);
        }
    }

    @Deprecated
    public void g(int i4) throws JSONRPC2Error {
        d(i4);
    }

    @Deprecated
    public <T> void h(int i4, Class<T> cls) throws JSONRPC2Error {
        e(i4, cls);
    }

    @Deprecated
    public <T> void i(int i4, Class<T> cls, boolean z4) throws JSONRPC2Error {
        f(i4, cls, z4);
    }

    public Object j(int i4) throws JSONRPC2Error {
        g(i4);
        return this.f72872a.get(i4);
    }

    public <T> T k(int i4, Class<T> cls) throws JSONRPC2Error {
        return (T) l(i4, cls, false);
    }

    public <T> T l(int i4, Class<T> cls, boolean z4) throws JSONRPC2Error {
        i(i4, cls, z4);
        try {
            return (T) this.f72872a.get(i4);
        } catch (ClassCastException unused) {
            throw a0(i4);
        }
    }

    public boolean m(int i4) throws JSONRPC2Error {
        return ((Boolean) k(i4, Boolean.class)).booleanValue();
    }

    public double n(int i4) throws JSONRPC2Error {
        return ((Number) k(i4, Number.class)).doubleValue();
    }

    public <T extends Enum<T>> T o(int i4, Class<T> cls) throws JSONRPC2Error {
        return (T) p(i4, cls, false);
    }

    public <T extends Enum<T>> T p(int i4, Class<T> cls, boolean z4) throws JSONRPC2Error {
        T t4 = (T) b.a((String) k(i4, String.class), cls, z4);
        if (t4 == null) {
            b0(i4, cls);
        }
        return t4;
    }

    public String q(int i4, String[] strArr) throws JSONRPC2Error {
        return r(i4, strArr, false);
    }

    public String r(int i4, String[] strArr, boolean z4) throws JSONRPC2Error {
        String b5 = b.b((String) k(i4, String.class), strArr, z4);
        if (b5 == null) {
            c0(i4, strArr);
        }
        return b5;
    }

    public float s(int i4) throws JSONRPC2Error {
        return ((Number) k(i4, Number.class)).floatValue();
    }

    public int t(int i4) throws JSONRPC2Error {
        return ((Number) k(i4, Number.class)).intValue();
    }

    public List<Object> u(int i4) throws JSONRPC2Error {
        return v(i4, false);
    }

    public List<Object> v(int i4, boolean z4) throws JSONRPC2Error {
        return (List) l(i4, List.class, z4);
    }

    public long w(int i4) throws JSONRPC2Error {
        return ((Number) k(i4, Number.class)).longValue();
    }

    public Map<String, Object> x(int i4) throws JSONRPC2Error {
        return y(i4, false);
    }

    public Map<String, Object> y(int i4, boolean z4) throws JSONRPC2Error {
        try {
            return (Map) l(i4, Map.class, z4);
        } catch (ClassCastException unused) {
            throw a0(i4);
        }
    }

    public <T> T z(int i4, Class<T> cls, T t4) throws JSONRPC2Error {
        return (T) A(i4, cls, false, t4);
    }
}
