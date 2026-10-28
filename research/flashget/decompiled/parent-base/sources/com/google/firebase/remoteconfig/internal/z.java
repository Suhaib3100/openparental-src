package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Personalization.java */
/* loaded from: classes6.dex */
public class z {

    /* renamed from: c, reason: collision with root package name */
    public static final String f60617c = ProtectedSandApp.s("ύ\u0001");

    /* renamed from: d, reason: collision with root package name */
    public static final String f60618d = ProtectedSandApp.s("ώ\u0001");

    /* renamed from: e, reason: collision with root package name */
    public static final String f60619e = ProtectedSandApp.s("φ\u0001");

    /* renamed from: f, reason: collision with root package name */
    public static final String f60620f = ProtectedSandApp.s("χ\u0001");

    /* renamed from: g, reason: collision with root package name */
    public static final String f60621g = ProtectedSandApp.s("ω\u0001");

    /* renamed from: h, reason: collision with root package name */
    public static final String f60622h = ProtectedSandApp.s("ψ\u0001");

    /* renamed from: i, reason: collision with root package name */
    public static final String f60623i = ProtectedSandApp.s("ϋ\u0001");

    /* renamed from: j, reason: collision with root package name */
    public static final String f60624j = ProtectedSandApp.s("ϊ\u0001");

    /* renamed from: k, reason: collision with root package name */
    public static final String f60625k = ProtectedSandApp.s("ό\u0001");

    /* renamed from: l, reason: collision with root package name */
    public static final String f60626l = ProtectedSandApp.s("ό\u0001");

    /* renamed from: m, reason: collision with root package name */
    public static final String f60627m = ProtectedSandApp.s("ϐ\u0001");

    /* renamed from: n, reason: collision with root package name */
    public static final String f60628n = ProtectedSandApp.s("υ\u0001");

    /* renamed from: o, reason: collision with root package name */
    public static final String f60629o = ProtectedSandApp.s("Ϗ\u0001");

    /* renamed from: a, reason: collision with root package name */
    private final y9.b<com.google.firebase.analytics.connector.a> f60630a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f60631b = Collections.synchronizedMap(new HashMap());

    public z(y9.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f60630a = bVar;
    }

    public void a(@o0 String str, @o0 h hVar) {
        JSONObject optJSONObject;
        com.google.firebase.analytics.connector.a aVar = this.f60630a.get();
        if (aVar == null) {
            return;
        }
        JSONObject i4 = hVar.i();
        if (i4.length() < 1) {
            return;
        }
        JSONObject g4 = hVar.g();
        if (g4.length() >= 1 && (optJSONObject = i4.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString(ProtectedSandApp.s("υ\u0001"));
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f60631b) {
                try {
                    if (optString.equals(this.f60631b.get(str))) {
                        return;
                    }
                    this.f60631b.put(str, optString);
                    Bundle bundle = new Bundle();
                    bundle.putString(ProtectedSandApp.s("φ\u0001"), str);
                    bundle.putString(ProtectedSandApp.s("χ\u0001"), g4.optString(str));
                    bundle.putString(ProtectedSandApp.s("ψ\u0001"), optJSONObject.optString(ProtectedSandApp.s("ω\u0001")));
                    bundle.putInt(ProtectedSandApp.s("ϊ\u0001"), optJSONObject.optInt(ProtectedSandApp.s("ϋ\u0001"), -1));
                    bundle.putString(ProtectedSandApp.s("ό\u0001"), optJSONObject.optString(ProtectedSandApp.s("ό\u0001")));
                    aVar.b(ProtectedSandApp.s("ύ\u0001"), ProtectedSandApp.s("ώ\u0001"), bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(ProtectedSandApp.s("Ϗ\u0001"), optString);
                    aVar.b(ProtectedSandApp.s("ύ\u0001"), ProtectedSandApp.s("ϐ\u0001"), bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
