package com.android.billingclient.api;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f40653a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f40654b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40655c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40656d;

    /* renamed from: e, reason: collision with root package name */
    private final String f40657e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40658f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40659g;

    /* renamed from: h, reason: collision with root package name */
    private final String f40660h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.q0
    private final String f40661i;

    /* renamed from: j, reason: collision with root package name */
    @androidx.annotation.q0
    private final List f40662j;

    /* renamed from: k, reason: collision with root package name */
    @androidx.annotation.q0
    private final List f40663k;

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @l6
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f40664a;

        /* renamed from: b, reason: collision with root package name */
        private final int f40665b;

        a(JSONObject jSONObject) throws JSONException {
            this.f40664a = jSONObject.getInt(ProtectedSandApp.s("\u0590"));
            this.f40665b = jSONObject.optInt(ProtectedSandApp.s("֑"));
        }

        @l6
        public int a() {
            return this.f40664a;
        }

        @l6
        public int b() {
            return this.f40665b;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f40666a;

        /* renamed from: b, reason: collision with root package name */
        private final long f40667b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40668c;

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40669d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40670e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40671f;

        /* renamed from: g, reason: collision with root package name */
        private final List f40672g;

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.q0
        private final Long f40673h;

        /* renamed from: i, reason: collision with root package name */
        @androidx.annotation.q0
        private final a f40674i;

        /* renamed from: j, reason: collision with root package name */
        @androidx.annotation.q0
        private final e f40675j;

        /* renamed from: k, reason: collision with root package name */
        @androidx.annotation.q0
        private final C0670b f40676k;

        /* renamed from: l, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40677l;

        /* renamed from: m, reason: collision with root package name */
        @androidx.annotation.q0
        private final c f40678m;

        /* renamed from: n, reason: collision with root package name */
        @androidx.annotation.q0
        private final d f40679n;

        /* renamed from: o, reason: collision with root package name */
        @androidx.annotation.q0
        private final j5 f40680o;

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @p6
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @androidx.annotation.q0
            private final Integer f40681a;

            /* renamed from: b, reason: collision with root package name */
            @androidx.annotation.q0
            private final C0669a f40682b;

            /* compiled from: com.android.billingclient:billing@@9.1.0 */
            @p6
            /* renamed from: com.android.billingclient.api.t0$b$a$a, reason: collision with other inner class name */
            public static final class C0669a {

                /* renamed from: a, reason: collision with root package name */
                private final String f40683a;

                /* renamed from: b, reason: collision with root package name */
                private final long f40684b;

                /* renamed from: c, reason: collision with root package name */
                private final String f40685c;

                C0669a(JSONObject jSONObject) {
                    this.f40683a = jSONObject.optString(ProtectedSandApp.s("֒"));
                    this.f40684b = jSONObject.optLong(ProtectedSandApp.s("֓"));
                    this.f40685c = jSONObject.optString(ProtectedSandApp.s("֔"));
                }

                @androidx.annotation.o0
                public String a() {
                    return this.f40685c;
                }

                public long b() {
                    return this.f40684b;
                }

                @androidx.annotation.o0
                public String c() {
                    return this.f40683a;
                }
            }

            a(JSONObject jSONObject) throws JSONException {
                String s4 = ProtectedSandApp.s("֕");
                this.f40681a = jSONObject.has(s4) ? Integer.valueOf(jSONObject.optInt(s4)) : null;
                JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("֖"));
                this.f40682b = optJSONObject != null ? new C0669a(optJSONObject) : null;
            }

            @androidx.annotation.q0
            @p6
            public C0669a a() {
                return this.f40682b;
            }

            @androidx.annotation.q0
            @p6
            public Integer b() {
                return this.f40681a;
            }
        }

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @p6
        /* renamed from: com.android.billingclient.api.t0$b$b, reason: collision with other inner class name */
        public static final class C0670b {

            /* renamed from: a, reason: collision with root package name */
            private final int f40686a;

            /* renamed from: b, reason: collision with root package name */
            private final int f40687b;

            C0670b(JSONObject jSONObject) throws JSONException {
                this.f40686a = jSONObject.getInt(ProtectedSandApp.s("֗"));
                this.f40687b = jSONObject.getInt(ProtectedSandApp.s("֘"));
            }

            @p6
            public int a() {
                return this.f40686a;
            }

            @p6
            public int b() {
                return this.f40687b;
            }
        }

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @q6
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            private final long f40688a;

            /* renamed from: b, reason: collision with root package name */
            private final long f40689b;

            c(JSONObject jSONObject) throws JSONException {
                this.f40688a = jSONObject.getLong(ProtectedSandApp.s("֙"));
                this.f40689b = jSONObject.getLong(ProtectedSandApp.s("֚"));
            }

            @q6
            public long a() {
                return this.f40689b;
            }

            @q6
            public long b() {
                return this.f40688a;
            }
        }

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @r6
        public static final class d {

            /* renamed from: a, reason: collision with root package name */
            private final String f40690a;

            /* renamed from: b, reason: collision with root package name */
            @androidx.annotation.q0
            private final String f40691b;

            d(JSONObject jSONObject) throws JSONException {
                this.f40690a = jSONObject.getString(ProtectedSandApp.s("֛"));
                String optString = jSONObject.optString(ProtectedSandApp.s("֜"));
                this.f40691b = true == optString.isEmpty() ? null : optString;
            }

            @androidx.annotation.q0
            @r6
            public String a() {
                return this.f40691b;
            }

            @androidx.annotation.o0
            @r6
            public String b() {
                return this.f40690a;
            }
        }

        /* compiled from: com.android.billingclient:billing@@9.1.0 */
        @p6
        public static final class e {

            /* renamed from: a, reason: collision with root package name */
            @androidx.annotation.q0
            private final Long f40692a;

            /* renamed from: b, reason: collision with root package name */
            @androidx.annotation.q0
            private final Long f40693b;

            e(JSONObject jSONObject) throws JSONException {
                String s4 = ProtectedSandApp.s("֝");
                this.f40692a = jSONObject.has(s4) ? Long.valueOf(jSONObject.optLong(s4)) : null;
                String s5 = ProtectedSandApp.s("֞");
                this.f40693b = jSONObject.has(s5) ? Long.valueOf(jSONObject.optLong(s5)) : null;
            }

            @androidx.annotation.q0
            @p6
            public Long a() {
                return this.f40693b;
            }

            @androidx.annotation.q0
            @p6
            public Long b() {
                return this.f40692a;
            }
        }

        b(JSONObject jSONObject) throws JSONException {
            this.f40666a = jSONObject.optString(ProtectedSandApp.s("֟"));
            this.f40667b = jSONObject.optLong(ProtectedSandApp.s("֠"));
            this.f40668c = jSONObject.optString(ProtectedSandApp.s("֡"));
            String optString = jSONObject.optString(ProtectedSandApp.s("֢"));
            this.f40669d = true == optString.isEmpty() ? null : optString;
            String optString2 = jSONObject.optString(ProtectedSandApp.s("֣"));
            this.f40670e = true == optString2.isEmpty() ? null : optString2;
            String optString3 = jSONObject.optString(ProtectedSandApp.s("֤"));
            this.f40671f = true == optString3.isEmpty() ? null : optString3;
            jSONObject.optInt(ProtectedSandApp.s("֥"));
            JSONArray optJSONArray = jSONObject.optJSONArray(ProtectedSandApp.s("֦"));
            this.f40672g = new ArrayList();
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    this.f40672g.add(optJSONArray.getString(i4));
                }
            }
            String s4 = ProtectedSandApp.s("֧");
            this.f40673h = jSONObject.has(s4) ? Long.valueOf(jSONObject.optLong(s4)) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("֨"));
            this.f40674i = optJSONObject == null ? null : new a(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(ProtectedSandApp.s("֩"));
            this.f40675j = optJSONObject2 == null ? null : new e(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject(ProtectedSandApp.s("֪"));
            this.f40676k = optJSONObject3 == null ? null : new C0670b(optJSONObject3);
            this.f40677l = jSONObject.optString(ProtectedSandApp.s("֫"));
            JSONObject optJSONObject4 = jSONObject.optJSONObject(ProtectedSandApp.s("֬"));
            this.f40678m = optJSONObject4 == null ? null : new c(optJSONObject4);
            JSONObject optJSONObject5 = jSONObject.optJSONObject(ProtectedSandApp.s("֭"));
            this.f40679n = optJSONObject5 == null ? null : new d(optJSONObject5);
            JSONObject optJSONObject6 = jSONObject.optJSONObject(ProtectedSandApp.s("֮"));
            this.f40680o = optJSONObject6 != null ? new j5(optJSONObject6) : null;
            JSONArray optJSONArray2 = jSONObject.optJSONArray(ProtectedSandApp.s("֯"));
            if (optJSONArray2 == null) {
                return;
            }
            new d(optJSONArray2);
        }

        @androidx.annotation.q0
        @p6
        public a a() {
            return this.f40674i;
        }

        @androidx.annotation.o0
        public String b() {
            return this.f40666a;
        }

        @androidx.annotation.q0
        @p6
        public Long c() {
            return this.f40673h;
        }

        @androidx.annotation.q0
        @p6
        public C0670b d() {
            return this.f40676k;
        }

        @androidx.annotation.q0
        @p6
        @r6
        public String e() {
            return this.f40670e;
        }

        @androidx.annotation.q0
        @p6
        public List<String> f() {
            return this.f40672g;
        }

        @androidx.annotation.q0
        @p6
        @r6
        public String g() {
            return this.f40669d;
        }

        @androidx.annotation.q0
        @q6
        public c h() {
            return this.f40678m;
        }

        public long i() {
            return this.f40667b;
        }

        @androidx.annotation.o0
        public String j() {
            return this.f40668c;
        }

        @androidx.annotation.q0
        @r6
        public String k() {
            return this.f40671f;
        }

        @androidx.annotation.q0
        @r6
        public d l() {
            return this.f40679n;
        }

        @androidx.annotation.q0
        @p6
        public e m() {
            return this.f40675j;
        }

        @androidx.annotation.q0
        public final j5 n() {
            return this.f40680o;
        }

        @androidx.annotation.q0
        final String o() {
            return this.f40677l;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f40694a;

        /* renamed from: b, reason: collision with root package name */
        private final long f40695b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40696c;

        /* renamed from: d, reason: collision with root package name */
        private final String f40697d;

        /* renamed from: e, reason: collision with root package name */
        private final int f40698e;

        /* renamed from: f, reason: collision with root package name */
        private final int f40699f;

        c(JSONObject jSONObject) {
            this.f40697d = jSONObject.optString(ProtectedSandApp.s("ְ"));
            this.f40696c = jSONObject.optString(ProtectedSandApp.s("ֱ"));
            this.f40694a = jSONObject.optString(ProtectedSandApp.s("ֲ"));
            this.f40695b = jSONObject.optLong(ProtectedSandApp.s("ֳ"));
            this.f40699f = jSONObject.optInt(ProtectedSandApp.s("ִ"));
            this.f40698e = jSONObject.optInt(ProtectedSandApp.s("ֵ"));
        }

        public int a() {
            return this.f40698e;
        }

        @androidx.annotation.o0
        public String b() {
            return this.f40697d;
        }

        @androidx.annotation.o0
        public String c() {
            return this.f40694a;
        }

        public long d() {
            return this.f40695b;
        }

        @androidx.annotation.o0
        public String e() {
            return this.f40696c;
        }

        public int f() {
            return this.f40699f;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final List f40700a;

        d(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i4);
                    if (optJSONObject != null) {
                        arrayList.add(new c(optJSONObject));
                    }
                }
            }
            this.f40700a = arrayList;
        }

        @androidx.annotation.o0
        public List<c> a() {
            return this.f40700a;
        }
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {

        /* renamed from: d1, reason: collision with root package name */
        public static final int f40701d1 = 1;

        /* renamed from: e1, reason: collision with root package name */
        public static final int f40702e1 = 2;

        /* renamed from: f1, reason: collision with root package name */
        public static final int f40703f1 = 3;
    }

    /* compiled from: com.android.billingclient:billing@@9.1.0 */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final String f40704a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        private final String f40705b;

        /* renamed from: c, reason: collision with root package name */
        private final String f40706c;

        /* renamed from: d, reason: collision with root package name */
        private final d f40707d;

        /* renamed from: e, reason: collision with root package name */
        private final List f40708e;

        /* renamed from: f, reason: collision with root package name */
        @androidx.annotation.q0
        private final a f40709f;

        f(JSONObject jSONObject) throws JSONException {
            String s4 = ProtectedSandApp.s("ֶ");
            this.f40704a = jSONObject.optString(s4);
            String optString = jSONObject.optString(ProtectedSandApp.s("ַ"));
            this.f40705b = true == optString.isEmpty() ? null : optString;
            this.f40706c = jSONObject.getString(ProtectedSandApp.s("ָ"));
            this.f40707d = new d(jSONObject.getJSONArray(ProtectedSandApp.s("ֹ")));
            JSONObject optJSONObject = jSONObject.optJSONObject(ProtectedSandApp.s("ֺ"));
            this.f40709f = optJSONObject != null ? new a(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject(ProtectedSandApp.s("ֻ"));
            if (optJSONObject2 != null) {
                optJSONObject2.getString(ProtectedSandApp.s("ּ"));
                optJSONObject2.optString(ProtectedSandApp.s("ֽ"));
                optJSONObject2.optString(ProtectedSandApp.s("־"));
                optJSONObject2.optString(ProtectedSandApp.s("ֿ"));
                optJSONObject2.optString(s4);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(ProtectedSandApp.s("׀"));
                if (optJSONObject3 != null) {
                    new c(optJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray(ProtectedSandApp.s("ׁ"));
            if (optJSONArray != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    arrayList.add(optJSONArray.getString(i4));
                }
            }
            this.f40708e = arrayList;
        }

        @androidx.annotation.o0
        public String a() {
            return this.f40704a;
        }

        @androidx.annotation.q0
        @l6
        public a b() {
            return this.f40709f;
        }

        @androidx.annotation.q0
        public String c() {
            return this.f40705b;
        }

        @androidx.annotation.o0
        public List<String> d() {
            return this.f40708e;
        }

        @androidx.annotation.o0
        public String e() {
            return this.f40706c;
        }

        @androidx.annotation.o0
        public d f() {
            return this.f40707d;
        }
    }

    t0(String str) throws JSONException {
        this.f40653a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f40654b = jSONObject;
        String optString = jSONObject.optString(ProtectedSandApp.s("ׂ"));
        this.f40655c = optString;
        String optString2 = jSONObject.optString(ProtectedSandApp.s("׃"));
        this.f40656d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ב"));
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("א"));
        }
        this.f40657e = jSONObject.optString(ProtectedSandApp.s("ׄ"));
        this.f40658f = jSONObject.optString(ProtectedSandApp.s("ׅ"));
        this.f40659g = jSONObject.optString(ProtectedSandApp.s("׆"));
        jSONObject.optString(ProtectedSandApp.s("ׇ"));
        jSONObject.optString(ProtectedSandApp.s("\u05c8"));
        this.f40660h = jSONObject.optString(ProtectedSandApp.s("\u05c9"));
        this.f40661i = jSONObject.optString(ProtectedSandApp.s("\u05ca"));
        JSONArray optJSONArray = jSONObject.optJSONArray(ProtectedSandApp.s("\u05cb"));
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                arrayList.add(new f(optJSONArray.getJSONObject(i4)));
            }
            this.f40662j = arrayList;
        } else {
            this.f40662j = (optString2.equals(ProtectedSandApp.s("\u05cc")) || optString2.equals(ProtectedSandApp.s("\u05cd"))) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f40654b.optJSONObject(ProtectedSandApp.s("\u05ce"));
        JSONArray optJSONArray2 = this.f40654b.optJSONArray(ProtectedSandApp.s("\u05cf"));
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i5 = 0; i5 < optJSONArray2.length(); i5++) {
                arrayList2.add(new b(optJSONArray2.getJSONObject(i5)));
            }
            this.f40663k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.f40663k = null;
        } else {
            arrayList2.add(new b(optJSONObject));
            this.f40663k = arrayList2;
        }
    }

    @androidx.annotation.o0
    public String a() {
        return this.f40659g;
    }

    @androidx.annotation.o0
    public String b() {
        return this.f40658f;
    }

    @androidx.annotation.q0
    public b c() {
        List list = this.f40663k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (b) list.get(0);
    }

    @androidx.annotation.q0
    @p6
    @r6
    public List<b> d() {
        return this.f40663k;
    }

    @androidx.annotation.o0
    public String e() {
        return this.f40655c;
    }

    public boolean equals(@androidx.annotation.q0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return TextUtils.equals(this.f40653a, ((t0) obj).f40653a);
        }
        return false;
    }

    @androidx.annotation.o0
    public String f() {
        return this.f40656d;
    }

    @androidx.annotation.q0
    public List<f> g() {
        return this.f40662j;
    }

    @androidx.annotation.o0
    public String h() {
        return this.f40657e;
    }

    public int hashCode() {
        return this.f40653a.hashCode();
    }

    @androidx.annotation.o0
    public final String i() {
        return this.f40654b.optString(ProtectedSandApp.s("ג"));
    }

    final String j() {
        return this.f40660h;
    }

    @androidx.annotation.q0
    final String k(@androidx.annotation.q0 String str) {
        List<b> list;
        if (!TextUtils.isEmpty(str) && (list = this.f40663k) != null && !list.isEmpty()) {
            for (b bVar : list) {
                if (!TextUtils.isEmpty(bVar.o()) && Objects.equals(bVar.g(), str)) {
                    return bVar.o();
                }
            }
        }
        return this.f40661i;
    }

    @androidx.annotation.o0
    public String toString() {
        List list = this.f40662j;
        String obj = this.f40654b.toString();
        String valueOf = String.valueOf(list);
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ד"));
        androidx.room.l0.a(sb, this.f40653a, ProtectedSandApp.s("ה"), obj, ProtectedSandApp.s("ו"));
        sb.append(this.f40655c);
        sb.append(ProtectedSandApp.s("ז"));
        sb.append(this.f40656d);
        sb.append(ProtectedSandApp.s("ח"));
        sb.append(this.f40657e);
        sb.append(ProtectedSandApp.s("ט"));
        return androidx.fragment.app.c.a(sb, this.f40660h, ProtectedSandApp.s("י"), valueOf, ProtectedSandApp.s("ך"));
    }
}
