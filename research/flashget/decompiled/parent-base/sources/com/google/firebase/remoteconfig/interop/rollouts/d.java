package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.o0;
import b9.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.interop.rollouts.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RolloutAssignment.java */
@t9.a
@b9.c
/* loaded from: classes6.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f60652a = ProtectedSandApp.s("Ϡ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private static final String f60653b = ProtectedSandApp.s("ϡ\u0001");

    /* renamed from: c, reason: collision with root package name */
    private static final String f60654c = ProtectedSandApp.s("Ϣ\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final String f60655d = ProtectedSandApp.s("ϣ\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f60656e = ProtectedSandApp.s("Ϥ\u0001");

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.firebase.encoders.a f60657f;

    /* compiled from: RolloutAssignment.java */
    @c.a
    public static abstract class a {
        @o0
        public abstract d a();

        @o0
        public abstract a b(@o0 String str);

        @o0
        public abstract a c(@o0 String str);

        @o0
        public abstract a d(@o0 String str);

        @o0
        public abstract a e(long j4);

        @o0
        public abstract a f(@o0 String str);
    }

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        com.google.firebase.remoteconfig.interop.rollouts.a.f60633b.a(eVar);
        f60657f = eVar.j();
    }

    @o0
    public static a a() {
        return new b.C0932b();
    }

    @o0
    public static d b(@o0 String str) throws JSONException {
        return c(new JSONObject(str));
    }

    @o0
    public static d c(@o0 JSONObject jSONObject) throws JSONException {
        return new b.C0932b().d(jSONObject.getString(ProtectedSandApp.s("Ϡ\u0001"))).f(jSONObject.getString(ProtectedSandApp.s("ϡ\u0001"))).b(jSONObject.getString(ProtectedSandApp.s("Ϣ\u0001"))).c(jSONObject.getString(ProtectedSandApp.s("ϣ\u0001"))).e(jSONObject.getLong(ProtectedSandApp.s("Ϥ\u0001"))).a();
    }

    @o0
    public abstract String d();

    @o0
    public abstract String e();

    @o0
    public abstract String f();

    public abstract long g();

    @o0
    public abstract String h();
}
