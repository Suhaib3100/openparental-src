package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RolloutAssignment.java */
@t9.a
@b9.c
/* loaded from: classes6.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f58946a = 256;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.firebase.encoders.a f58947b;

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        a.f58894b.a(eVar);
        f58947b = eVar.j();
    }

    static i a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString(ProtectedSandApp.s("ﳳ")), jSONObject.getString(ProtectedSandApp.s("ﳴ")), jSONObject.getString(ProtectedSandApp.s("ﳵ")), jSONObject.getString(ProtectedSandApp.s("ﳶ")), jSONObject.getLong(ProtectedSandApp.s("ﳷ")));
    }

    public static i b(String str, String str2, String str3, String str4, long j4) {
        return new b(str, str2, i(str3), str4, j4);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public g0.f.d.e h() {
        return g0.f.d.e.a().d(g0.f.d.e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
