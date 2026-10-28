package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.model.f0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RolloutAssignment.java */
@j2.a
@AutoValue
/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final int f15844a = 256;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.firebase.encoders.a f15845b;

    static {
        com.google.firebase.encoders.json.e eVar = new com.google.firebase.encoders.json.e();
        a.f15792b.a(eVar);
        f15845b = eVar.j();
    }

    static i a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString(ProtectedSandApp.s("ᔃ")), jSONObject.getString(ProtectedSandApp.s("ᔄ")), jSONObject.getString(ProtectedSandApp.s("ᔅ")), jSONObject.getString(ProtectedSandApp.s("ᔆ")), jSONObject.getLong(ProtectedSandApp.s("ᔇ")));
    }

    public static i b(String str, String str2, String str3, String str4, long j5) {
        return new b(str, str2, i(str3), str4, j5);
    }

    private static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public f0.f.d.e h() {
        return f0.f.d.e.a().d(f0.f.d.e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
