package com.google.firebase.remoteconfig.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f60464a;

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f60465b;

    /* renamed from: c, reason: collision with root package name */
    private Date f60466c;

    /* renamed from: d, reason: collision with root package name */
    private JSONArray f60467d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f60468e;

    /* renamed from: f, reason: collision with root package name */
    private long f60469f;

    /* renamed from: g, reason: collision with root package name */
    private JSONArray f60470g;

    /* renamed from: p, reason: collision with root package name */
    public static final String f60462p = ProtectedSandApp.s("ͮ\u0001");

    /* renamed from: h, reason: collision with root package name */
    static final String f60454h = ProtectedSandApp.s("ͯ\u0001");

    /* renamed from: i, reason: collision with root package name */
    static final String f60455i = ProtectedSandApp.s("Ͱ\u0001");

    /* renamed from: j, reason: collision with root package name */
    static final String f60456j = ProtectedSandApp.s("ͱ\u0001");

    /* renamed from: k, reason: collision with root package name */
    static final String f60457k = ProtectedSandApp.s("Ͳ\u0001");

    /* renamed from: l, reason: collision with root package name */
    static final String f60458l = ProtectedSandApp.s("ͳ\u0001");

    /* renamed from: m, reason: collision with root package name */
    static final String f60459m = ProtectedSandApp.s("ʹ\u0001");

    /* renamed from: n, reason: collision with root package name */
    public static final String f60460n = ProtectedSandApp.s("͵\u0001");

    /* renamed from: o, reason: collision with root package name */
    public static final String f60461o = ProtectedSandApp.s("Ͷ\u0001");

    /* renamed from: q, reason: collision with root package name */
    private static final Date f60463q = new Date(0);

    /* compiled from: ConfigContainer.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f60471a;

        /* renamed from: b, reason: collision with root package name */
        private Date f60472b;

        /* renamed from: c, reason: collision with root package name */
        private JSONArray f60473c;

        /* renamed from: d, reason: collision with root package name */
        private JSONObject f60474d;

        /* renamed from: e, reason: collision with root package name */
        private long f60475e;

        /* renamed from: f, reason: collision with root package name */
        private JSONArray f60476f;

        public h a() throws JSONException {
            return new h(this.f60471a, this.f60472b, this.f60473c, this.f60474d, this.f60475e, this.f60476f);
        }

        public b b(Map<String, String> map) {
            this.f60471a = new JSONObject(map);
            return this;
        }

        public b c(JSONObject jSONObject) {
            try {
                this.f60471a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(JSONArray jSONArray) {
            try {
                this.f60473c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b e(Date date) {
            this.f60472b = date;
            return this;
        }

        public b f(JSONObject jSONObject) {
            try {
                this.f60474d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b g(JSONArray jSONArray) {
            try {
                this.f60476f = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b h(long j4) {
            this.f60475e = j4;
            return this;
        }

        private b() {
            this.f60471a = new JSONObject();
            this.f60472b = h.f60463q;
            this.f60473c = new JSONArray();
            this.f60474d = new JSONObject();
            this.f60475e = 0L;
            this.f60476f = new JSONArray();
        }

        public b(h hVar) {
            this.f60471a = hVar.g();
            this.f60472b = hVar.h();
            this.f60473c = hVar.e();
            this.f60474d = hVar.i();
            this.f60475e = hVar.k();
            this.f60476f = hVar.j();
        }
    }

    static h b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("Ͳ\u0001"));
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray(ProtectedSandApp.s("ʹ\u0001"));
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        return new h(jSONObject.getJSONObject(ProtectedSandApp.s("ͯ\u0001")), new Date(jSONObject.getLong(ProtectedSandApp.s("Ͱ\u0001"))), jSONObject.getJSONArray(ProtectedSandApp.s("ͱ\u0001")), jSONObject2, jSONObject.optLong(ProtectedSandApp.s("ͳ\u0001")), optJSONArray);
    }

    private Map<String, Map<String, String>> c() throws JSONException {
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < j().length(); i4++) {
            JSONObject jSONObject = j().getJSONObject(i4);
            String string = jSONObject.getString(ProtectedSandApp.s("Ͷ\u0001"));
            String string2 = jSONObject.getString(ProtectedSandApp.s("ͮ\u0001"));
            JSONArray jSONArray = jSONObject.getJSONArray(ProtectedSandApp.s("͵\u0001"));
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                String string3 = jSONArray.getString(i5);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new HashMap());
                }
                Map map = (Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    private static h d(JSONObject jSONObject) throws JSONException {
        return b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public static b m(h hVar) {
        return new b(hVar);
    }

    public JSONArray e() {
        return this.f60467d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f60464a.toString().equals(((h) obj).toString());
        }
        return false;
    }

    public Set<String> f(h hVar) throws JSONException {
        JSONObject g4 = d(hVar.f60464a).g();
        Map<String, Map<String, String>> c5 = c();
        Map<String, Map<String, String>> c6 = hVar.c();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = g().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!hVar.g().has(next)) {
                hashSet.add(next);
            } else if (!g().get(next).equals(hVar.g().get(next))) {
                hashSet.add(next);
            } else if ((i().has(next) && !hVar.i().has(next)) || (!i().has(next) && hVar.i().has(next))) {
                hashSet.add(next);
            } else if (i().has(next) && hVar.i().has(next) && !i().getJSONObject(next).toString().equals(hVar.i().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (c5.containsKey(next) != c6.containsKey(next)) {
                hashSet.add(next);
            } else if (c5.containsKey(next) && c6.containsKey(next) && !c5.get(next).equals(c6.get(next))) {
                hashSet.add(next);
            } else {
                g4.remove(next);
            }
        }
        Iterator<String> keys2 = g4.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.f60465b;
    }

    public Date h() {
        return this.f60466c;
    }

    public int hashCode() {
        return this.f60464a.hashCode();
    }

    public JSONObject i() {
        return this.f60468e;
    }

    public JSONArray j() {
        return this.f60470g;
    }

    public long k() {
        return this.f60469f;
    }

    public String toString() {
        return this.f60464a.toString();
    }

    private h(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j4, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(ProtectedSandApp.s("ͯ\u0001"), jSONObject);
        jSONObject3.put(ProtectedSandApp.s("Ͱ\u0001"), date.getTime());
        jSONObject3.put(ProtectedSandApp.s("ͱ\u0001"), jSONArray);
        jSONObject3.put(ProtectedSandApp.s("Ͳ\u0001"), jSONObject2);
        jSONObject3.put(ProtectedSandApp.s("ͳ\u0001"), j4);
        jSONObject3.put(ProtectedSandApp.s("ʹ\u0001"), jSONArray2);
        this.f60465b = jSONObject;
        this.f60466c = date;
        this.f60467d = jSONArray;
        this.f60468e = jSONObject2;
        this.f60469f = j4;
        this.f60470g = jSONArray2;
        this.f60464a = jSONObject3;
    }
}
