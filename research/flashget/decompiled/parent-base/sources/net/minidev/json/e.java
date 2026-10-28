package net.minidev.json;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.m0;

/* compiled from: JSONObject.java */
/* loaded from: classes7.dex */
public class e extends HashMap<String, Object> implements b, c, g {

    /* renamed from: b, reason: collision with root package name */
    private static final long f81708b = -503443796854799292L;

    public e() {
    }

    public static String d(String str) {
        return k.f(str);
    }

    protected static a e(a aVar, Object obj) {
        if (obj == null) {
            return aVar;
        }
        if (aVar != null) {
            aVar.addAll((a) obj);
            return aVar;
        }
        aVar.add(obj);
        return aVar;
    }

    private static a k(a aVar, a aVar2) {
        aVar.addAll(aVar2);
        return aVar;
    }

    protected static e l(e eVar, Object obj) {
        if (obj == null) {
            return eVar;
        }
        if (obj instanceof e) {
            return m(eVar, (e) obj);
        }
        throw new RuntimeException(ProtectedSandApp.s("褷\u0001") + obj.getClass());
    }

    private static e m(e eVar, e eVar2) {
        if (eVar2 == null) {
            return eVar;
        }
        for (String str : eVar.keySet()) {
            Object obj = eVar.get(str);
            Object obj2 = eVar2.get(str);
            if (obj2 != null) {
                if (obj instanceof a) {
                    eVar.put(str, e((a) obj, obj2));
                } else if (obj instanceof e) {
                    eVar.put(str, l((e) obj, obj2));
                } else if (!obj.equals(obj2)) {
                    throw new RuntimeException(ProtectedSandApp.s("褸\u0001") + obj.getClass() + ProtectedSandApp.s("褹\u0001") + obj2.getClass());
                }
            }
        }
        for (String str2 : eVar2.keySet()) {
            if (!eVar.containsKey(str2)) {
                eVar.put(str2, eVar2.get(str2));
            }
        }
        return eVar;
    }

    public static String o(Map<String, ? extends Object> map) {
        return p(map, k.f81725a);
    }

    public static String p(Map<String, ? extends Object> map, h hVar) {
        StringBuilder sb = new StringBuilder();
        try {
            t(map, sb, hVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void r(Map<String, Object> map, Appendable appendable) throws IOException {
        t(map, appendable, k.f81725a);
    }

    public static void t(Map<String, ? extends Object> map, Appendable appendable, h hVar) throws IOException {
        if (map == null) {
            appendable.append(ProtectedSandApp.s("褺\u0001"));
            return;
        }
        appendable.append('{');
        boolean z4 = true;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            if (z4) {
                z4 = false;
            } else {
                appendable.append(',');
            }
            u(entry.getKey().toString(), entry.getValue(), appendable, hVar);
        }
        appendable.append('}');
    }

    public static void u(String str, Object obj, Appendable appendable, h hVar) throws IOException {
        if (str == null) {
            appendable.append(ProtectedSandApp.s("褺\u0001"));
        } else if (hVar.l(str)) {
            appendable.append(m0.quote);
            k.i(str, appendable, hVar);
            appendable.append(m0.quote);
        } else {
            appendable.append(str);
        }
        appendable.append(':');
        if (!(obj instanceof String)) {
            k.H(obj, appendable, hVar);
            return;
        }
        String str2 = (String) obj;
        if (!hVar.m(str2)) {
            appendable.append(str2);
            return;
        }
        appendable.append(m0.quote);
        k.i(str2, appendable, hVar);
        appendable.append(m0.quote);
    }

    @Override // net.minidev.json.g
    public void b(Appendable appendable, h hVar) throws IOException {
        t(this, appendable, hVar);
    }

    @Override // net.minidev.json.f
    public void c(Appendable appendable) throws IOException {
        t(this, appendable, k.f81725a);
    }

    @Override // net.minidev.json.c
    public String f(h hVar) {
        return p(this, hVar);
    }

    @Override // net.minidev.json.b
    public String i() {
        return p(this, k.f81725a);
    }

    public void n(Object obj) {
        l(this, obj);
    }

    public String q(h hVar) {
        return p(this, hVar);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return p(this, k.f81725a);
    }

    public e(Map<String, ?> map) {
        super(map);
    }
}
