package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* loaded from: classes6.dex */
public class d implements b, m9.b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f58606b = ProtectedSandApp.s("\ufbc9");

    /* renamed from: c, reason: collision with root package name */
    private static final String f58607c = ProtectedSandApp.s("\ufbca");

    /* renamed from: d, reason: collision with root package name */
    private static final String f58608d = ProtectedSandApp.s("\ufbcc");

    /* renamed from: a, reason: collision with root package name */
    @q0
    private m9.a f58609a;

    @o0
    private static String b(@o0 String str, @o0 Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(ProtectedSandApp.s("\ufbc9"), str);
        jSONObject.put(ProtectedSandApp.s("\ufbca"), jSONObject2);
        return jSONObject.toString();
    }

    @Override // m9.b
    public void a(@q0 m9.a aVar) {
        this.f58609a = aVar;
        g.f().b(ProtectedSandApp.s("\ufbcb"));
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(@o0 String str, @o0 Bundle bundle) {
        String s4 = ProtectedSandApp.s("\ufbcc");
        m9.a aVar = this.f58609a;
        if (aVar != null) {
            try {
                aVar.a(s4 + b(str, bundle));
            } catch (JSONException unused) {
                g.f().m(ProtectedSandApp.s("\ufbcd"));
            }
        }
    }
}
