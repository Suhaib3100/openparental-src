package com.thetransactioncompany.jsonrpc2;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class JSONRPC2Error extends Exception {

    /* renamed from: d, reason: collision with root package name */
    private static final long f72798d = 4682571044532698806L;

    /* renamed from: e, reason: collision with root package name */
    public static final JSONRPC2Error f72799e = new JSONRPC2Error(-32700, ProtectedSandApp.s("嶈\u0001"), null);

    /* renamed from: f, reason: collision with root package name */
    public static final JSONRPC2Error f72800f = new JSONRPC2Error(-32600, ProtectedSandApp.s("嶉\u0001"), null);

    /* renamed from: g, reason: collision with root package name */
    public static final JSONRPC2Error f72801g = new JSONRPC2Error(-32601, ProtectedSandApp.s("嶊\u0001"), null);

    /* renamed from: h, reason: collision with root package name */
    public static final JSONRPC2Error f72802h = new JSONRPC2Error(-32602, ProtectedSandApp.s("嶋\u0001"), null);

    /* renamed from: i, reason: collision with root package name */
    public static final JSONRPC2Error f72803i = new JSONRPC2Error(-32603, ProtectedSandApp.s("嶌\u0001"), null);

    /* renamed from: b, reason: collision with root package name */
    private final int f72804b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f72805c;

    public JSONRPC2Error(int i4, String str) {
        this(i4, str, null);
    }

    public static JSONRPC2Error a(JSONRPC2Error jSONRPC2Error, String str) {
        return new JSONRPC2Error(jSONRPC2Error.c(), jSONRPC2Error.getMessage() + str, jSONRPC2Error.d());
    }

    public static JSONRPC2Error e(JSONRPC2Error jSONRPC2Error, Object obj) {
        return new JSONRPC2Error(jSONRPC2Error.c(), jSONRPC2Error.getMessage(), obj);
    }

    public JSONRPC2Error b(String str) {
        return new JSONRPC2Error(this.f72804b, getMessage() + str, this.f72805c);
    }

    public int c() {
        return this.f72804b;
    }

    public Object d() {
        return this.f72805c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof JSONRPC2Error) && this.f72804b == ((JSONRPC2Error) obj).c();
    }

    @Deprecated
    public net.minidev.json.e f() {
        return g();
    }

    public net.minidev.json.e g() {
        net.minidev.json.e eVar = new net.minidev.json.e();
        eVar.put(ProtectedSandApp.s("嶍\u0001"), Integer.valueOf(this.f72804b));
        eVar.put(ProtectedSandApp.s("嶎\u0001"), super.getMessage());
        Object obj = this.f72805c;
        if (obj != null) {
            eVar.put(ProtectedSandApp.s("嶏\u0001"), obj);
        }
        return eVar;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return f().toString();
    }

    public JSONRPC2Error(int i4, String str, Object obj) {
        super(str);
        this.f72804b = i4;
        this.f72805c = obj;
    }
}
