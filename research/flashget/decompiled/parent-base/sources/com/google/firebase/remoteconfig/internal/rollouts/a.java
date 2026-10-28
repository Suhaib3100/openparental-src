package com.google.firebase.remoteconfig.internal.rollouts;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.h;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RolloutsStateFactory.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    g f60557a;

    /* renamed from: b, reason: collision with root package name */
    g f60558b;

    a(g gVar, g gVar2) {
        this.f60557a = gVar;
        this.f60558b = gVar2;
    }

    @o0
    public static a a(@o0 g gVar, @o0 g gVar2) {
        return new a(gVar, gVar2);
    }

    @o0
    private String c(@o0 String str) {
        String d5 = d(this.f60557a, str);
        if (d5 != null) {
            return d5;
        }
        String d6 = d(this.f60558b, str);
        return d6 != null ? d6 : "";
    }

    @q0
    private static String d(@o0 g gVar, @o0 String str) {
        h g4 = gVar.g();
        if (g4 == null) {
            return null;
        }
        try {
            return g4.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    @o0
    com.google.firebase.remoteconfig.interop.rollouts.e b(@o0 h hVar) throws FirebaseRemoteConfigClientException {
        JSONArray j4 = hVar.j();
        long k4 = hVar.k();
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < j4.length(); i4++) {
            try {
                JSONObject jSONObject = j4.getJSONObject(i4);
                String string = jSONObject.getString(ProtectedSandApp.s("Λ\u0001"));
                JSONArray jSONArray = jSONObject.getJSONArray(ProtectedSandApp.s("Μ\u0001"));
                if (jSONArray.length() > 1) {
                    String.format(ProtectedSandApp.s("Ν\u0001"), string, jSONArray);
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(com.google.firebase.remoteconfig.interop.rollouts.d.a().d(string).f(jSONObject.getString(ProtectedSandApp.s("Ξ\u0001"))).b(optString).c(c(optString)).e(k4).a());
            } catch (JSONException e4) {
                throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("Ο\u0001"), e4);
            }
        }
        return com.google.firebase.remoteconfig.interop.rollouts.e.a(hashSet);
    }
}
