package com.thetransactioncompany.jsonrpc2;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import java.util.Map;

/* compiled from: JSONRPC2Response.java */
/* loaded from: classes7.dex */
public class f extends a {

    /* renamed from: c, reason: collision with root package name */
    private Object f72868c = null;

    /* renamed from: d, reason: collision with root package name */
    private JSONRPC2Error f72869d = null;

    /* renamed from: e, reason: collision with root package name */
    private Object f72870e = null;

    public f(Object obj, Object obj2) {
        s(obj);
        r(obj2);
    }

    public static f m(String str) throws JSONRPC2ParseException {
        return p(str, false, false, false);
    }

    public static f n(String str, boolean z4) throws JSONRPC2ParseException {
        return p(str, z4, false, false);
    }

    public static f o(String str, boolean z4, boolean z5) throws JSONRPC2ParseException {
        return p(str, z4, z5, false);
    }

    public static f p(String str, boolean z4, boolean z5, boolean z6) throws JSONRPC2ParseException {
        return new d(z4, z5, z6).h(str);
    }

    @Override // com.thetransactioncompany.jsonrpc2.a
    public net.minidev.json.e g() {
        net.minidev.json.e eVar = new net.minidev.json.e();
        JSONRPC2Error jSONRPC2Error = this.f72869d;
        if (jSONRPC2Error != null) {
            eVar.put(ProtectedSandApp.s("差\u0001"), jSONRPC2Error.g());
        } else {
            eVar.put(ProtectedSandApp.s("巯\u0001"), this.f72868c);
        }
        eVar.put(ProtectedSandApp.s("巰\u0001"), this.f72870e);
        eVar.put(ProtectedSandApp.s("己\u0001"), ProtectedSandApp.s("已\u0001"));
        Map<String, Object> c5 = c();
        if (c5 != null) {
            for (Map.Entry<String, Object> entry : c5.entrySet()) {
                eVar.put(entry.getKey(), entry.getValue());
            }
        }
        return eVar;
    }

    public JSONRPC2Error h() {
        return this.f72869d;
    }

    public Object j() {
        return this.f72870e;
    }

    public Object k() {
        return this.f72868c;
    }

    public boolean l() {
        return this.f72869d == null;
    }

    public void q(JSONRPC2Error jSONRPC2Error) {
        if (jSONRPC2Error == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("巳\u0001"));
        }
        this.f72869d = jSONRPC2Error;
        this.f72868c = null;
    }

    public void r(Object obj) {
        if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof String)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("巴\u0001"));
        }
        this.f72870e = obj;
    }

    public void s(Object obj) {
        if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof String) && !(obj instanceof List) && !(obj instanceof Map)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("巵\u0001"));
        }
        this.f72868c = obj;
        this.f72869d = null;
    }

    public f(Object obj) {
        s(null);
        r(obj);
    }

    public f(JSONRPC2Error jSONRPC2Error, Object obj) {
        q(jSONRPC2Error);
        r(obj);
    }
}
