package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* loaded from: classes3.dex */
public class d implements b, c2.b {

    /* renamed from: b, reason: collision with root package name */
    private static final String f15530b = ProtectedSandApp.s("⟺");

    /* renamed from: c, reason: collision with root package name */
    private static final String f15531c = ProtectedSandApp.s("⟻");

    /* renamed from: d, reason: collision with root package name */
    private static final String f15532d = ProtectedSandApp.s("⟼");

    /* renamed from: a, reason: collision with root package name */
    @q0
    private c2.a f15533a;

    @o0
    private static String b(@o0 String str, @o0 Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(ProtectedSandApp.s("⟵"), str);
        jSONObject.put(ProtectedSandApp.s("⟶"), jSONObject2);
        return jSONObject.toString();
    }

    @Override // c2.b
    public void a(@q0 c2.a aVar) {
        this.f15533a = aVar;
        g.f().b(ProtectedSandApp.s("⟷"));
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.b
    public void onEvent(@o0 String str, @o0 Bundle bundle) {
        String s5 = ProtectedSandApp.s("⟸");
        c2.a aVar = this.f15533a;
        if (aVar != null) {
            try {
                aVar.a(s5 + b(str, bundle));
            } catch (JSONException unused) {
                g.f().m(ProtectedSandApp.s("⟹"));
            }
        }
    }
}
