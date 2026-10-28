package com.thetransactioncompany.jsonrpc2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;
import net.minidev.json.parser.ParseException;

/* compiled from: JSONRPC2Parser.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private net.minidev.json.parser.f f72859a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f72860b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f72861c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f72862d;

    public d() {
        this(false, false, false);
    }

    private static void a(Object obj, String str) throws JSONRPC2ParseException {
        if (obj == null) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巆\u0001"), str);
        }
        if (!(obj instanceof String)) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巅\u0001"), str);
        }
        if (!obj.equals(ProtectedSandApp.s("巃\u0001"))) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巄\u0001"), str);
        }
    }

    private Map<String, Object> d(String str) throws JSONRPC2ParseException {
        if (str.trim().length() == 0) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巊\u0001"), JSONRPC2ParseException.f72808f, str);
        }
        try {
            Object h4 = this.f72860b ? this.f72859a.h(str, net.minidev.json.parser.a.f81744b) : this.f72859a.g(str);
            if (h4 instanceof List) {
                throw new JSONRPC2ParseException(ProtectedSandApp.s("巈\u0001"), str);
            }
            if (h4 instanceof Map) {
                return (Map) h4;
            }
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巇\u0001"), str);
        } catch (ParseException unused) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巉\u0001"), JSONRPC2ParseException.f72808f, str);
        }
    }

    public void b(boolean z4) {
        this.f72861c = z4;
    }

    public boolean c() {
        return this.f72861c;
    }

    public a e(String str) throws JSONRPC2ParseException {
        try {
            return g(str);
        } catch (JSONRPC2ParseException e4) {
            if (e4.a() == JSONRPC2ParseException.f72808f) {
                throw e4;
            }
            try {
                return f(str);
            } catch (JSONRPC2ParseException e5) {
                if (e5.a() == JSONRPC2ParseException.f72808f) {
                    throw e5;
                }
                try {
                    return h(str);
                } catch (JSONRPC2ParseException e6) {
                    if (e6.a() == JSONRPC2ParseException.f72808f) {
                        throw e6;
                    }
                    throw new JSONRPC2ParseException(ProtectedSandApp.s("巋\u0001"), JSONRPC2ParseException.f72807e, str);
                }
            }
        }
    }

    public b f(String str) throws JSONRPC2ParseException {
        b bVar;
        Map<String, Object> d5 = d(str);
        Object remove = d5.remove(ProtectedSandApp.s("巌\u0001"));
        if (!this.f72861c) {
            a(remove, str);
        }
        Object remove2 = d5.remove(ProtectedSandApp.s("巍\u0001"));
        if (remove2 == null) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巒\u0001"), str);
        }
        if (!(remove2 instanceof String)) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巑\u0001"), str);
        }
        String str2 = (String) remove2;
        if (str2.length() == 0) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巐\u0001"), str);
        }
        Object obj = d5.get(ProtectedSandApp.s("巎\u0001"));
        if (obj == null) {
            bVar = new b(str2);
        } else if (obj instanceof List) {
            bVar = new b(str2, (List<Object>) obj);
        } else {
            if (!(obj instanceof Map)) {
                throw new JSONRPC2ParseException(ProtectedSandApp.s("巏\u0001"), str);
            }
            bVar = new b(str2, (Map<String, Object>) obj);
        }
        if (this.f72862d) {
            for (Map.Entry<String, Object> entry : d5.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        }
        return bVar;
    }

    public e g(String str) throws JSONRPC2ParseException {
        e eVar;
        Map<String, Object> d5 = d(str);
        Object remove = d5.remove(ProtectedSandApp.s("巌\u0001"));
        if (!this.f72861c) {
            a(remove, str);
        }
        Object remove2 = d5.remove(ProtectedSandApp.s("巍\u0001"));
        if (remove2 == null) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巙\u0001"), str);
        }
        if (!(remove2 instanceof String)) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巘\u0001"), str);
        }
        String str2 = (String) remove2;
        if (str2.length() == 0) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巗\u0001"), str);
        }
        String s4 = ProtectedSandApp.s("巓\u0001");
        if (!d5.containsKey(s4)) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巖\u0001"), str);
        }
        Object remove3 = d5.remove(s4);
        if (remove3 != null && !(remove3 instanceof Number) && !(remove3 instanceof Boolean) && !(remove3 instanceof String)) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巔\u0001"), str);
        }
        Object remove4 = d5.remove(ProtectedSandApp.s("巎\u0001"));
        if (remove4 == null) {
            eVar = new e(str2, remove3);
        } else if (remove4 instanceof List) {
            eVar = new e(str2, (List<Object>) remove4, remove3);
        } else {
            if (!(remove4 instanceof Map)) {
                throw new JSONRPC2ParseException(ProtectedSandApp.s("巕\u0001"), str);
            }
            eVar = new e(str2, (Map<String, Object>) remove4, remove3);
        }
        if (this.f72862d) {
            for (Map.Entry<String, Object> entry : d5.entrySet()) {
                eVar.a(entry.getKey(), entry.getValue());
            }
        }
        return eVar;
    }

    public f h(String str) throws JSONRPC2ParseException {
        f fVar;
        Map<String, Object> d5 = d(str);
        Object remove = d5.remove(ProtectedSandApp.s("巌\u0001"));
        if (!this.f72861c) {
            a(remove, str);
        }
        Object remove2 = d5.remove(ProtectedSandApp.s("巓\u0001"));
        if (remove2 != null && !(remove2 instanceof Boolean) && !(remove2 instanceof Number) && !(remove2 instanceof String)) {
            throw new JSONRPC2ParseException(ProtectedSandApp.s("巚\u0001"), str);
        }
        String s4 = ProtectedSandApp.s("巛\u0001");
        boolean containsKey = d5.containsKey(s4);
        String s5 = ProtectedSandApp.s("巜\u0001");
        if (containsKey && !d5.containsKey(s5)) {
            fVar = new f(d5.remove(s4), remove2);
        } else {
            if (d5.containsKey(s4) || !d5.containsKey(s5)) {
                if (d5.containsKey(s4) && d5.containsKey(s5)) {
                    throw new JSONRPC2ParseException(ProtectedSandApp.s("巤\u0001"), str);
                }
                if (d5.containsKey(s4) || d5.containsKey(s5)) {
                    throw new AssertionError();
                }
                throw new JSONRPC2ParseException(ProtectedSandApp.s("工\u0001"), str);
            }
            Object remove3 = d5.remove(s5);
            if (remove3 == null) {
                throw new JSONRPC2ParseException(ProtectedSandApp.s("巣\u0001"), str);
            }
            if (!(remove3 instanceof Map)) {
                throw new JSONRPC2ParseException(ProtectedSandApp.s("巢\u0001"));
            }
            Map map = (Map) remove3;
            try {
                try {
                    fVar = new f(new JSONRPC2Error(((Long) map.get(ProtectedSandApp.s("川\u0001"))).intValue(), (String) map.get(ProtectedSandApp.s("州\u0001")), map.get(ProtectedSandApp.s("巟\u0001"))), remove2);
                } catch (Exception unused) {
                    throw new JSONRPC2ParseException(ProtectedSandApp.s("巠\u0001"), str);
                }
            } catch (Exception unused2) {
                throw new JSONRPC2ParseException(ProtectedSandApp.s("巡\u0001"), str);
            }
        }
        if (this.f72862d) {
            for (Map.Entry<String, Object> entry : d5.entrySet()) {
                fVar.a(entry.getKey(), entry.getValue());
            }
        }
        return fVar;
    }

    public void i(boolean z4) {
        this.f72862d = z4;
    }

    public boolean j() {
        return this.f72862d;
    }

    public void k(boolean z4) {
        this.f72860b = z4;
    }

    public boolean l() {
        return this.f72860b;
    }

    public d(boolean z4) {
        this(z4, false, false);
    }

    public d(boolean z4, boolean z5) {
        this(z4, z5, false);
    }

    public d(boolean z4, boolean z5, boolean z6) {
        this.f72859a = new net.minidev.json.parser.f(net.minidev.json.parser.f.f81763q);
        this.f72860b = z4;
        this.f72861c = z5;
        this.f72862d = z6;
    }
}
