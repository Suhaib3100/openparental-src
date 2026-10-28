package com.thetransactioncompany.jsonrpc2.util;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.thetransactioncompany.jsonrpc2.JSONRPC2Error;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.m0;

/* compiled from: NamedParamsRetriever.java */
/* loaded from: classes7.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f72871a;

    public a(Map<String, Object> map) {
        this.f72871a = null;
        if (map == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("巶\u0001"));
        }
        this.f72871a = map;
    }

    private static JSONRPC2Error i0(String str) {
        return JSONRPC2Error.f72802h.b(ProtectedSandApp.s("巷\u0001") + str + ProtectedSandApp.s("巸\u0001"));
    }

    private static JSONRPC2Error j0(String str) {
        return JSONRPC2Error.f72802h.b(ProtectedSandApp.s("巷\u0001") + str + ProtectedSandApp.s("巹\u0001"));
    }

    private static <T extends Enum<T>> void k0(String str, Class<T> cls) throws JSONRPC2Error {
        StringBuilder sb = new StringBuilder(d.a(ProtectedSandApp.s("巺\u0001"), str, ProtectedSandApp.s("巻\u0001")));
        T[] enumConstants = cls.getEnumConstants();
        for (int i4 = 0; i4 < enumConstants.length; i4++) {
            if (i4 > 0 && i4 == enumConstants.length - 1) {
                sb.append(ProtectedSandApp.s("巼\u0001"));
            } else if (i4 > 0) {
                sb.append(ProtectedSandApp.s("巽\u0001"));
            }
            sb.append(m0.quote);
            sb.append(enumConstants[i4].toString());
            sb.append(m0.quote);
        }
        throw JSONRPC2Error.f72802h.b(sb.toString());
    }

    private static void l0(String str, String[] strArr) throws JSONRPC2Error {
        StringBuilder sb = new StringBuilder(d.a(ProtectedSandApp.s("巺\u0001"), str, ProtectedSandApp.s("巻\u0001")));
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (i4 > 0 && i4 == strArr.length - 1) {
                sb.append(ProtectedSandApp.s("巼\u0001"));
            } else if (i4 > 0) {
                sb.append(ProtectedSandApp.s("巽\u0001"));
            }
            sb.append(m0.quote);
            sb.append(strArr[i4]);
            sb.append(m0.quote);
        }
        throw JSONRPC2Error.f72802h.b(sb.toString());
    }

    private static void m0(String... strArr) throws JSONRPC2Error {
        if (strArr.length == 1) {
            throw JSONRPC2Error.f72802h.b(ProtectedSandApp.s("帀\u0001") + strArr[0] + ProtectedSandApp.s("币\u0001"));
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(m0.quote);
            sb.append(str);
            sb.append(m0.quote);
        }
        throw JSONRPC2Error.f72802h.b(ProtectedSandApp.s("巾\u0001") + sb.toString() + ProtectedSandApp.s("巿\u0001"));
    }

    private static void n0(String str) throws JSONRPC2Error {
        throw JSONRPC2Error.f72802h.b(ProtectedSandApp.s("巷\u0001") + str + ProtectedSandApp.s("市\u0001"));
    }

    public long A(String str) throws JSONRPC2Error {
        return ((Number) o(str, Number.class)).longValue();
    }

    public Map<String, Object> B(String str) throws JSONRPC2Error {
        return C(str, false);
    }

    public Map<String, Object> C(String str, boolean z4) throws JSONRPC2Error {
        try {
            return (Map) p(str, Map.class, z4);
        } catch (ClassCastException unused) {
            throw j0(str);
        }
    }

    public String[] D() {
        return (String[]) this.f72871a.keySet().toArray(new String[0]);
    }

    public <T> T E(String str, Class<T> cls, T t4) throws JSONRPC2Error {
        return (T) F(str, cls, false, t4);
    }

    public <T> T F(String str, Class<T> cls, boolean z4, T t4) throws JSONRPC2Error {
        if (!d0(str)) {
            return t4;
        }
        i(str, cls, z4);
        try {
            return (T) this.f72871a.get(str);
        } catch (ClassCastException unused) {
            throw j0(str);
        }
    }

    public boolean G(String str, boolean z4) throws JSONRPC2Error {
        return ((Boolean) E(str, Boolean.class, Boolean.valueOf(z4))).booleanValue();
    }

    public double H(String str, double d5) throws JSONRPC2Error {
        return ((Number) E(str, Number.class, Double.valueOf(d5))).doubleValue();
    }

    public <T extends Enum<T>> T I(String str, Class<T> cls, T t4) throws JSONRPC2Error {
        return (T) J(str, cls, t4, false);
    }

    public <T extends Enum<T>> T J(String str, Class<T> cls, T t4, boolean z4) throws JSONRPC2Error {
        String str2 = t4 != null ? (String) E(str, String.class, t4.toString()) : (String) E(str, String.class, null);
        if (t4 == null && str2 == null) {
            return null;
        }
        T t5 = (T) b.a(str2, cls, z4);
        if (t5 == null) {
            k0(str, cls);
        }
        return t5;
    }

    public String K(String str, String[] strArr, String str2) throws JSONRPC2Error {
        return L(str, strArr, str2, false);
    }

    public String L(String str, String[] strArr, String str2, boolean z4) throws JSONRPC2Error {
        String str3 = (String) E(str, String.class, str2);
        if (str2 == null && str3 == null) {
            return null;
        }
        String b5 = b.b(str3, strArr, z4);
        if (b5 == null) {
            l0(str, strArr);
        }
        return b5;
    }

    public float M(String str, float f4) throws JSONRPC2Error {
        return ((Number) E(str, Number.class, Float.valueOf(f4))).floatValue();
    }

    public int N(String str, int i4) throws JSONRPC2Error {
        return ((Number) E(str, Number.class, Integer.valueOf(i4))).intValue();
    }

    public List<Object> O(String str, List<Object> list) throws JSONRPC2Error {
        return P(str, false, list);
    }

    public List<Object> P(String str, boolean z4, List<Object> list) throws JSONRPC2Error {
        return (List) F(str, List.class, z4, list);
    }

    public long Q(String str, long j4) throws JSONRPC2Error {
        return ((Number) E(str, Number.class, Long.valueOf(j4))).longValue();
    }

    public Map<String, Object> R(String str, Map<String, Object> map) throws JSONRPC2Error {
        return S(str, false, map);
    }

    public Map<String, Object> S(String str, boolean z4, Map<String, Object> map) throws JSONRPC2Error {
        try {
            return (Map) F(str, Map.class, z4, map);
        } catch (ClassCastException unused) {
            throw j0(str);
        }
    }

    public String T(String str, String str2) throws JSONRPC2Error {
        return U(str, false, str2);
    }

    public String U(String str, boolean z4, String str2) throws JSONRPC2Error {
        return (String) F(str, String.class, z4, str2);
    }

    public String[] V(String str, boolean z4, String[] strArr) throws JSONRPC2Error {
        return !d0(str) ? strArr : b0(str, z4);
    }

    public String[] W(String str, String[] strArr) throws JSONRPC2Error {
        return V(str, false, strArr);
    }

    public Map<String, Object> X() {
        return this.f72871a;
    }

    public String Y(String str) throws JSONRPC2Error {
        return Z(str, false);
    }

    public String Z(String str, boolean z4) throws JSONRPC2Error {
        return (String) p(str, String.class, z4);
    }

    public String[] a0(String str) throws JSONRPC2Error {
        return b0(str, false);
    }

    public String[] b0(String str, boolean z4) throws JSONRPC2Error {
        List<Object> z5 = z(str, z4);
        if (z5 == null) {
            return null;
        }
        try {
            return (String[]) z5.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw i0(str);
        }
    }

    @Override // com.thetransactioncompany.jsonrpc2.util.b
    public int c() {
        return this.f72871a.size();
    }

    public boolean c0(String str) {
        return this.f72871a.containsKey(str);
    }

    public void d(String str) throws JSONRPC2Error {
        if (d0(str)) {
            return;
        }
        m0(str);
    }

    @Deprecated
    public boolean d0(String str) {
        return c0(str);
    }

    public <T> void e(String str, Class<T> cls) throws JSONRPC2Error {
        i(str, cls, false);
    }

    @Deprecated
    public boolean e0(String[] strArr) {
        return g0(strArr);
    }

    public <T> void f(String str, Class<T> cls, boolean z4) throws JSONRPC2Error {
        g(str);
        Object obj = this.f72871a.get(str);
        if (obj == null) {
            if (z4) {
                return;
            } else {
                n0(str);
            }
        }
        if (!cls.isAssignableFrom(obj.getClass())) {
            throw j0(str);
        }
    }

    @Deprecated
    public boolean f0(String[] strArr, String[] strArr2) {
        return h0(strArr, strArr2);
    }

    @Deprecated
    public void g(String str) throws JSONRPC2Error {
        d(str);
    }

    public boolean g0(String[] strArr) {
        return h0(strArr, null);
    }

    @Deprecated
    public <T> void h(String str, Class<T> cls) throws JSONRPC2Error {
        e(str, cls);
    }

    public boolean h0(String[] strArr, String[] strArr2) {
        Map map = (Map) ((HashMap) this.f72871a).clone();
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
            map.remove(str);
        }
        if (strArr2 != null) {
            for (String str2 : strArr2) {
                if (map.containsKey(str2)) {
                    map.remove(str2);
                }
            }
        }
        return map.size() == 0;
    }

    @Deprecated
    public <T> void i(String str, Class<T> cls, boolean z4) throws JSONRPC2Error {
        f(str, cls, z4);
    }

    @Deprecated
    public void j(String[] strArr) throws JSONRPC2Error {
        l(strArr);
    }

    @Deprecated
    public void k(String[] strArr, String[] strArr2) throws JSONRPC2Error {
        m(strArr, strArr2);
    }

    public void l(String[] strArr) throws JSONRPC2Error {
        k(strArr, null);
    }

    public void m(String[] strArr, String[] strArr2) throws JSONRPC2Error {
        if (f0(strArr, strArr2)) {
            return;
        }
        m0(strArr);
    }

    public Object n(String str) throws JSONRPC2Error {
        g(str);
        return this.f72871a.get(str);
    }

    public <T> T o(String str, Class<T> cls) throws JSONRPC2Error {
        return (T) p(str, cls, false);
    }

    public <T> T p(String str, Class<T> cls, boolean z4) throws JSONRPC2Error {
        i(str, cls, z4);
        try {
            return (T) this.f72871a.get(str);
        } catch (ClassCastException unused) {
            throw j0(str);
        }
    }

    public boolean q(String str) throws JSONRPC2Error {
        return ((Boolean) o(str, Boolean.class)).booleanValue();
    }

    public double r(String str) throws JSONRPC2Error {
        return ((Number) o(str, Number.class)).doubleValue();
    }

    public <T extends Enum<T>> T s(String str, Class<T> cls) throws JSONRPC2Error {
        return (T) t(str, cls, false);
    }

    public <T extends Enum<T>> T t(String str, Class<T> cls, boolean z4) throws JSONRPC2Error {
        T t4 = (T) b.a((String) o(str, String.class), cls, z4);
        if (t4 == null) {
            k0(str, cls);
        }
        return t4;
    }

    public String u(String str, String[] strArr) throws JSONRPC2Error {
        return v(str, strArr, false);
    }

    public String v(String str, String[] strArr, boolean z4) throws JSONRPC2Error {
        String b5 = b.b((String) o(str, String.class), strArr, z4);
        if (b5 == null) {
            l0(str, strArr);
        }
        return b5;
    }

    public float w(String str) throws JSONRPC2Error {
        return ((Number) o(str, Number.class)).floatValue();
    }

    public int x(String str) throws JSONRPC2Error {
        return ((Number) o(str, Number.class)).intValue();
    }

    public List<Object> y(String str) throws JSONRPC2Error {
        return z(str, false);
    }

    public List<Object> z(String str, boolean z4) throws JSONRPC2Error {
        return (List) p(str, List.class, z4);
    }
}
