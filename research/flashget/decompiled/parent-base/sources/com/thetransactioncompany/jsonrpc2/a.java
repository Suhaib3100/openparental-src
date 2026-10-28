package com.thetransactioncompany.jsonrpc2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: JSONRPC2Message.java */
/* loaded from: classes7.dex */
public abstract class a implements net.minidev.json.b {

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f72811b = null;

    public static a d(String str) throws JSONRPC2ParseException {
        return e(str, false, false);
    }

    public static a e(String str, boolean z4, boolean z5) throws JSONRPC2ParseException {
        return new d(z4, z5, false).e(str);
    }

    public void a(String str, Object obj) {
        if (str == null || str.equals(ProtectedSandApp.s("嶑\u0001")) || str.equals(ProtectedSandApp.s("嶒\u0001")) || str.equals(ProtectedSandApp.s("嶓\u0001")) || str.equals(ProtectedSandApp.s("嶔\u0001")) || str.equals(ProtectedSandApp.s("嶕\u0001")) || str.equals(ProtectedSandApp.s("嶖\u0001"))) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶘\u0001"));
        }
        if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof List) && !(obj instanceof Map)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶗\u0001"));
        }
        if (this.f72811b == null) {
            this.f72811b = new HashMap();
        }
        this.f72811b.put(str, obj);
    }

    public Object b(String str) {
        Map<String, Object> map = this.f72811b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, Object> c() {
        return this.f72811b;
    }

    public abstract net.minidev.json.e g();

    @Override // net.minidev.json.b
    public String i() {
        return toString();
    }

    public String toString() {
        return g().toString();
    }
}
