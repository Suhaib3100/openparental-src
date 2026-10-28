package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.auto.value.AutoValue;
import com.google.firebase.remoteconfig.interop.rollouts.b;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RolloutAssignment.java */
@j2.a
@AutoValue
/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18106a = ProtectedSandApp.s("᧧");

    /* renamed from: b, reason: collision with root package name */
    private static final String f18107b = ProtectedSandApp.s("᧨");

    /* renamed from: c, reason: collision with root package name */
    private static final String f18108c = ProtectedSandApp.s("᧩");

    /* renamed from: d, reason: collision with root package name */
    private static final String f18109d = ProtectedSandApp.s("᧪");

    /* renamed from: e, reason: collision with root package name */
    private static final String f18110e = ProtectedSandApp.s("᧫");

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.firebase.encoders.a f18111f;

    /* compiled from: RolloutAssignment.java */
    @AutoValue.Builder
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
        public abstract a e(long j5);

        @o0
        public abstract a f(@o0 String str);
    }

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        com.google.firebase.remoteconfig.interop.rollouts.a.f18087b.a(eVar);
        f18111f = eVar.j();
    }

    @o0
    public static a a() {
        return new b.C0227b();
    }

    @o0
    public static d b(@o0 String str) throws JSONException {
        return c(new JSONObject(str));
    }

    @o0
    public static d c(@o0 JSONObject jSONObject) throws JSONException {
        return new b.C0227b().d(jSONObject.getString(ProtectedSandApp.s("᧬"))).f(jSONObject.getString(ProtectedSandApp.s("᧭"))).b(jSONObject.getString(ProtectedSandApp.s("᧮"))).c(jSONObject.getString(ProtectedSandApp.s("᧯"))).e(jSONObject.getLong(ProtectedSandApp.s("᧰"))).a();
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
