package com.thetransactioncompany.jsonrpc2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: JSONRPC2Request.java */
/* loaded from: classes7.dex */
public class e extends com.thetransactioncompany.jsonrpc2.a {

    /* renamed from: c, reason: collision with root package name */
    private String f72863c;

    /* renamed from: d, reason: collision with root package name */
    private List<Object> f72864d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f72865e;

    /* renamed from: f, reason: collision with root package name */
    private Object f72866f;

    /* compiled from: JSONRPC2Request.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72867a;

        static {
            int[] iArr = new int[c.values().length];
            f72867a = iArr;
            try {
                iArr[c.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72867a[c.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(String str, Object obj) {
        t(str);
        s(obj);
    }

    public static e o(String str) throws JSONRPC2ParseException {
        return r(str, false, false, false);
    }

    public static e p(String str, boolean z4) throws JSONRPC2ParseException {
        return r(str, z4, false, false);
    }

    public static e q(String str, boolean z4, boolean z5) throws JSONRPC2ParseException {
        return r(str, z4, z5, false);
    }

    public static e r(String str, boolean z4, boolean z5, boolean z6) throws JSONRPC2ParseException {
        return new d(z4, z5, z6).g(str);
    }

    @Override // com.thetransactioncompany.jsonrpc2.a
    public net.minidev.json.e g() {
        net.minidev.json.e eVar = new net.minidev.json.e();
        eVar.put(ProtectedSandApp.s("左\u0001"), this.f72863c);
        int i4 = a.f72867a[m().ordinal()];
        String s4 = ProtectedSandApp.s("巧\u0001");
        if (i4 == 1) {
            eVar.put(s4, this.f72864d);
        } else if (i4 == 2) {
            eVar.put(s4, this.f72865e);
        }
        eVar.put(ProtectedSandApp.s("巨\u0001"), this.f72866f);
        eVar.put(ProtectedSandApp.s("巩\u0001"), ProtectedSandApp.s("巪\u0001"));
        Map<String, Object> c5 = c();
        if (c5 != null) {
            for (Map.Entry<String, Object> entry : c5.entrySet()) {
                eVar.put(entry.getKey(), entry.getValue());
            }
        }
        return eVar;
    }

    public Object h() {
        return this.f72866f;
    }

    public String j() {
        return this.f72863c;
    }

    public Map<String, Object> k() {
        return this.f72865e;
    }

    @Deprecated
    public Object l() {
        int i4 = a.f72867a[m().ordinal()];
        if (i4 == 1) {
            return this.f72864d;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f72865e;
    }

    public c m() {
        List<Object> list = this.f72864d;
        return (list == null && this.f72865e == null) ? c.NO_PARAMS : list != null ? c.ARRAY : this.f72865e != null ? c.OBJECT : c.NO_PARAMS;
    }

    public List<Object> n() {
        return this.f72864d;
    }

    public void s(Object obj) {
        if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof String)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("巫\u0001"));
        }
        this.f72866f = obj;
    }

    public void t(String str) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("巬\u0001"));
        }
        this.f72863c = str;
    }

    public void u(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f72865e = map;
    }

    @Deprecated
    public void v(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            this.f72864d = (List) obj;
        } else {
            if (!(obj instanceof Map)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("巭\u0001"));
            }
            this.f72865e = (Map) obj;
        }
    }

    public void w(List<Object> list) {
        if (list == null) {
            return;
        }
        this.f72864d = list;
    }

    public e(String str, List<Object> list, Object obj) {
        t(str);
        w(list);
        s(obj);
    }

    public e(String str, Map<String, Object> map, Object obj) {
        t(str);
        u(map);
        s(obj);
    }
}
