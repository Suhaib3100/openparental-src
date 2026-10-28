package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
@u6
/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40374a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f40375b;

    /* renamed from: c, reason: collision with root package name */
    private final List<a> f40376c;

    g1(String str) throws JSONException {
        this.f40374a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f40375b = jSONObject;
        this.f40376c = d(jSONObject.optJSONArray(ProtectedSandApp.s("σ")));
    }

    private static List<a> d(@androidx.annotation.q0 JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    arrayList.add(new a(optJSONObject));
                }
            }
        }
        return arrayList;
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40375b.optString(ProtectedSandApp.s("τ"));
    }

    @androidx.annotation.q0
    public String b() {
        String optString = this.f40375b.optString(ProtectedSandApp.s("υ"));
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    @androidx.annotation.o0
    public List<a> c() {
        return this.f40376c;
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @u6
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f40377a;

        /* renamed from: b, reason: collision with root package name */
        private final String f40378b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40379c;

        a(String str, String str2, @androidx.annotation.q0 String str3) {
            this.f40377a = str;
            this.f40378b = str2;
            this.f40379c = str3;
        }

        @androidx.annotation.o0
        public String a() {
            return this.f40377a;
        }

        @androidx.annotation.q0
        public String b() {
            return this.f40379c;
        }

        @androidx.annotation.o0
        public String c() {
            return this.f40378b;
        }

        public boolean equals(@androidx.annotation.q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40377a.equals(aVar.a()) && this.f40378b.equals(aVar.c()) && Objects.equals(this.f40379c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f40377a, this.f40378b, this.f40379c);
        }

        @androidx.annotation.o0
        public String toString() {
            return String.format(ProtectedSandApp.s("ς"), this.f40377a, this.f40378b, this.f40379c);
        }

        private a(JSONObject jSONObject) {
            this.f40377a = jSONObject.optString(ProtectedSandApp.s("ο"));
            this.f40378b = jSONObject.optString(ProtectedSandApp.s("π"));
            String optString = jSONObject.optString(ProtectedSandApp.s("ρ"));
            this.f40379c = true == optString.isEmpty() ? null : optString;
        }
    }
}
