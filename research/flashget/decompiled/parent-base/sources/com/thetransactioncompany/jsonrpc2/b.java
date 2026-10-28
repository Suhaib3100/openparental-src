package com.thetransactioncompany.jsonrpc2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: JSONRPC2Notification.java */
/* loaded from: classes7.dex */
public class b extends com.thetransactioncompany.jsonrpc2.a {

    /* renamed from: c, reason: collision with root package name */
    private String f72812c;

    /* renamed from: d, reason: collision with root package name */
    private List<Object> f72813d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Object> f72814e;

    /* compiled from: JSONRPC2Notification.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f72815a;

        static {
            int[] iArr = new int[c.values().length];
            f72815a = iArr;
            try {
                iArr[c.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f72815a[c.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(String str) {
        r(str);
        t(null);
    }

    public static b n(String str) throws JSONRPC2ParseException {
        return q(str, false, false, false);
    }

    public static b o(String str, boolean z4) throws JSONRPC2ParseException {
        return q(str, z4, false, false);
    }

    public static b p(String str, boolean z4, boolean z5) throws JSONRPC2ParseException {
        return q(str, z4, z5, false);
    }

    public static b q(String str, boolean z4, boolean z5, boolean z6) throws JSONRPC2ParseException {
        return new d(z4, z5, z6).f(str);
    }

    @Override // com.thetransactioncompany.jsonrpc2.a
    public net.minidev.json.e g() {
        net.minidev.json.e eVar = new net.minidev.json.e();
        eVar.put(ProtectedSandApp.s("嶙\u0001"), this.f72812c);
        int i4 = a.f72815a[l().ordinal()];
        String s4 = ProtectedSandApp.s("嶚\u0001");
        if (i4 == 1) {
            eVar.put(s4, this.f72813d);
        } else if (i4 == 2) {
            eVar.put(s4, this.f72814e);
        }
        eVar.put(ProtectedSandApp.s("嶛\u0001"), ProtectedSandApp.s("嶜\u0001"));
        Map<String, Object> c5 = c();
        if (c5 != null) {
            for (Map.Entry<String, Object> entry : c5.entrySet()) {
                eVar.put(entry.getKey(), entry.getValue());
            }
        }
        return eVar;
    }

    public String h() {
        return this.f72812c;
    }

    public Map<String, Object> j() {
        return this.f72814e;
    }

    @Deprecated
    public Object k() {
        int i4 = a.f72815a[l().ordinal()];
        if (i4 == 1) {
            return this.f72813d;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f72814e;
    }

    public c l() {
        List<Object> list = this.f72813d;
        return (list == null && this.f72814e == null) ? c.NO_PARAMS : list != null ? c.ARRAY : this.f72814e != null ? c.OBJECT : c.NO_PARAMS;
    }

    public List<Object> m() {
        return this.f72813d;
    }

    public void r(String str) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶝\u0001"));
        }
        this.f72812c = str;
    }

    public void s(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f72814e = map;
    }

    @Deprecated
    public void t(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            this.f72813d = (List) obj;
        } else {
            if (!(obj instanceof Map)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("嶞\u0001"));
            }
            this.f72814e = (Map) obj;
        }
    }

    public void u(List<Object> list) {
        if (list == null) {
            return;
        }
        this.f72813d = list;
    }

    public b(String str, List<Object> list) {
        r(str);
        u(list);
    }

    public b(String str, Map<String, Object> map) {
        r(str);
        s(map);
    }
}
