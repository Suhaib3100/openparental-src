package com.google.firebase.remoteconfig.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    static final String f17927g = ProtectedSandApp.s("᥏");

    /* renamed from: h, reason: collision with root package name */
    static final String f17928h = ProtectedSandApp.s("ᥐ");

    /* renamed from: i, reason: collision with root package name */
    static final String f17929i = ProtectedSandApp.s("ᥑ");

    /* renamed from: j, reason: collision with root package name */
    static final String f17930j = ProtectedSandApp.s("ᥒ");

    /* renamed from: k, reason: collision with root package name */
    static final String f17931k = ProtectedSandApp.s("ᥓ");

    /* renamed from: l, reason: collision with root package name */
    private static final Date f17932l = new Date(0);

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f17933a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f17934b;

    /* renamed from: c, reason: collision with root package name */
    private Date f17935c;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f17936d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f17937e;

    /* renamed from: f, reason: collision with root package name */
    private long f17938f;

    /* compiled from: ConfigContainer.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f17939a;

        /* renamed from: b, reason: collision with root package name */
        private Date f17940b;

        /* renamed from: c, reason: collision with root package name */
        private JSONArray f17941c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f17942d;

        /* renamed from: e, reason: collision with root package name */
        private long f17943e;

        public h a() throws JSONException {
            return new h(this.f17939a, this.f17940b, this.f17941c, this.f17942d, this.f17943e);
        }

        public b b(Map<String, String> map) {
            this.f17939a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f17939a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f17941c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f17940b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f17942d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(long j5) {
            this.f17943e = j5;
            return this;
        }

        private b() {
            this.f17939a = new JSONObject();
            this.f17940b = h.f17932l;
            this.f17941c = new JSONArray();
            this.f17942d = new JSONObject();
            this.f17943e = 0L;
        }

        public b(h hVar) {
            this.f17939a = hVar.f();
            this.f17940b = hVar.g();
            this.f17941c = hVar.d();
            this.f17942d = hVar.h();
            this.f17943e = hVar.i();
        }
    }

    static h b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("ᥙ"));
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new h(jSONObject.getJSONObject(ProtectedSandApp.s("ᥚ")), new Date(jSONObject.getLong(ProtectedSandApp.s("ᥛ"))), jSONObject.getJSONArray(ProtectedSandApp.s("ᥜ")), optJSONObject, jSONObject.optLong(ProtectedSandApp.s("ᥝ")));
    }

    private static h c(JSONObject jSONObject) throws JSONException {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b j() {
        return new b();
    }

    public static b k(h hVar) {
        return new b(hVar);
    }

    public JSONArray d() {
        return this.f17936d;
    }

    public Set<String> e(h hVar) throws JSONException {
        JSONObject f6 = c(hVar.f17933a).f();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!hVar.f().has(next)) {
                hashSet.add(next);
            } else if (!f().get(next).equals(hVar.f().get(next))) {
                hashSet.add(next);
            } else if ((h().has(next) && !hVar.h().has(next)) || (!h().has(next) && hVar.h().has(next))) {
                hashSet.add(next);
            } else if (h().has(next) && hVar.h().has(next) && !h().getJSONObject(next).toString().equals(hVar.h().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else {
                f6.remove(next);
            }
        }
        Iterator<String> keys2 = f6.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f17933a.toString().equals(((h) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f17934b;
    }

    public Date g() {
        return this.f17935c;
    }

    public JSONObject h() {
        return this.f17937e;
    }

    public int hashCode() {
        return this.f17933a.hashCode();
    }

    public long i() {
        return this.f17938f;
    }

    public String toString() {
        return this.f17933a.toString();
    }

    private h(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j5) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(ProtectedSandApp.s("ᥔ"), jSONObject);
        jSONObject3.put(ProtectedSandApp.s("ᥕ"), date.getTime());
        jSONObject3.put(ProtectedSandApp.s("ᥖ"), jSONArray);
        jSONObject3.put(ProtectedSandApp.s("ᥗ"), jSONObject2);
        jSONObject3.put(ProtectedSandApp.s("ᥘ"), j5);
        this.f17934b = jSONObject;
        this.f17935c = date;
        this.f17936d = jSONArray;
        this.f17937e = jSONObject2;
        this.f17938f = j5;
        this.f17933a = jSONObject3;
    }
}
