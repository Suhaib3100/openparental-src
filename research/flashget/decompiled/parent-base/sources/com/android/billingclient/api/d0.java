package com.android.billingclient.api;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40330a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f40331b;

    /* renamed from: c, reason: collision with root package name */
    private final List f40332c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40333d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40334e;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f40335a;

        /* renamed from: b, reason: collision with root package name */
        private final String f40336b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40337c;

        /* synthetic */ a(JSONObject jSONObject, u4 u4Var) {
            this.f40335a = jSONObject.optString(ProtectedSandApp.s("·"));
            this.f40336b = jSONObject.optString(ProtectedSandApp.s("Έ"));
            String optString = jSONObject.optString(ProtectedSandApp.s("Ή"));
            this.f40337c = true == optString.isEmpty() ? null : optString;
        }

        @androidx.annotation.o0
        public String a() {
            return this.f40335a;
        }

        @androidx.annotation.q0
        public String b() {
            return this.f40337c;
        }

        @androidx.annotation.o0
        public String c() {
            return this.f40336b;
        }

        public boolean equals(@androidx.annotation.q0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40335a.equals(aVar.a()) && this.f40336b.equals(aVar.c()) && Objects.equals(this.f40337c, aVar.b());
        }

        public int hashCode() {
            return Objects.hash(this.f40335a, this.f40336b, this.f40337c);
        }

        @androidx.annotation.o0
        public String toString() {
            return String.format(ProtectedSandApp.s("Ί"), this.f40335a, this.f40336b, this.f40337c);
        }
    }

    d0(String str) throws JSONException {
        this.f40330a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f40331b = jSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray(ProtectedSandApp.s("\u038b"));
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    arrayList.add(new a(optJSONObject, null));
                }
            }
        }
        this.f40332c = arrayList;
        this.f40333d = e(ProtectedSandApp.s("Ό"));
        this.f40334e = e(ProtectedSandApp.s("\u038d"));
    }

    @androidx.annotation.q0
    private final String e(String str) {
        String optString = this.f40331b.optString(str);
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    @androidx.annotation.q0
    @g5
    public String a() {
        return this.f40334e;
    }

    @androidx.annotation.q0
    public String b() {
        return this.f40331b.optString(ProtectedSandApp.s("Ύ"));
    }

    @androidx.annotation.q0
    public String c() {
        return this.f40333d;
    }

    @androidx.annotation.o0
    public List<a> d() {
        return this.f40332c;
    }
}
