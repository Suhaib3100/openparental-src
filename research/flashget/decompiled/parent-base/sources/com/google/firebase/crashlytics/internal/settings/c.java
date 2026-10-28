package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes6.dex */
class c implements m {

    /* renamed from: d, reason: collision with root package name */
    static final String f59475d = ProtectedSandApp.s("ﾳ");

    /* renamed from: e, reason: collision with root package name */
    static final String f59476e = ProtectedSandApp.s("ﾴ");

    /* renamed from: f, reason: collision with root package name */
    static final String f59477f = ProtectedSandApp.s("ﾶ");

    /* renamed from: g, reason: collision with root package name */
    static final String f59478g = ProtectedSandApp.s("\uffc9");

    /* renamed from: h, reason: collision with root package name */
    static final String f59479h = ProtectedSandApp.s("ﾸ");

    /* renamed from: i, reason: collision with root package name */
    static final String f59480i = ProtectedSandApp.s("ￏ");

    /* renamed from: j, reason: collision with root package name */
    static final String f59481j = ProtectedSandApp.s("ﾹ");

    /* renamed from: k, reason: collision with root package name */
    static final String f59482k = ProtectedSandApp.s("ﾵ");

    /* renamed from: l, reason: collision with root package name */
    static final String f59483l = ProtectedSandApp.s("\uffc0");

    /* renamed from: m, reason: collision with root package name */
    static final String f59484m = ProtectedSandApp.s("\uffc1");

    /* renamed from: n, reason: collision with root package name */
    static final String f59485n = ProtectedSandApp.s("ￃ");

    /* renamed from: o, reason: collision with root package name */
    static final String f59486o = ProtectedSandApp.s("ￂ");

    /* renamed from: p, reason: collision with root package name */
    static final String f59487p = ProtectedSandApp.s("ﾺ");

    /* renamed from: q, reason: collision with root package name */
    static final String f59488q = ProtectedSandApp.s("ﾻ");

    /* renamed from: r, reason: collision with root package name */
    static final String f59489r = ProtectedSandApp.s("ﾼ");

    /* renamed from: s, reason: collision with root package name */
    static final String f59490s = ProtectedSandApp.s("ﾽ");

    /* renamed from: a, reason: collision with root package name */
    private final String f59491a;

    /* renamed from: b, reason: collision with root package name */
    private final n9.b f59492b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.g f59493c;

    public c(String str, n9.b bVar) {
        this(str, bVar, com.google.firebase.crashlytics.internal.g.f());
    }

    private n9.a b(n9.a aVar, l lVar) {
        c(aVar, ProtectedSandApp.s("ﾳ"), lVar.f59546a);
        c(aVar, ProtectedSandApp.s("ﾴ"), ProtectedSandApp.s("ﾵ"));
        c(aVar, ProtectedSandApp.s("ﾶ"), ProtectedSandApp.s("ﾷ"));
        c(aVar, ProtectedSandApp.s("ﾸ"), ProtectedSandApp.s("ﾹ"));
        c(aVar, ProtectedSandApp.s("ﾺ"), lVar.f59547b);
        c(aVar, ProtectedSandApp.s("ﾻ"), lVar.f59548c);
        c(aVar, ProtectedSandApp.s("ﾼ"), lVar.f59549d);
        c(aVar, ProtectedSandApp.s("ﾽ"), lVar.f59550e.a().c());
        return aVar;
    }

    private void c(n9.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e4) {
            this.f59493c.n(ProtectedSandApp.s("ﾾ") + this.f59491a, e4);
            this.f59493c.m(ProtectedSandApp.s("\uffbf") + str);
            return null;
        }
    }

    private Map<String, String> f(l lVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("\uffc0"), lVar.f59553h);
        hashMap.put(ProtectedSandApp.s("\uffc1"), lVar.f59552g);
        hashMap.put(ProtectedSandApp.s("ￂ"), Integer.toString(lVar.f59554i));
        String str = lVar.f59551f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(ProtectedSandApp.s("ￃ"), str);
        }
        return hashMap;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.m
    public JSONObject a(l lVar, boolean z4) {
        String s4 = ProtectedSandApp.s("ￄ");
        String s5 = ProtectedSandApp.s("ￅ");
        com.google.firebase.crashlytics.internal.concurrency.k.d();
        if (!z4) {
            throw new RuntimeException(ProtectedSandApp.s("ￇ"));
        }
        try {
            Map<String, String> f4 = f(lVar);
            n9.a b5 = b(d(f4), lVar);
            this.f59493c.b(s5 + this.f59491a);
            this.f59493c.k(s4 + f4);
            return g(b5.c());
        } catch (IOException e4) {
            this.f59493c.e(ProtectedSandApp.s("ￆ"), e4);
            return null;
        }
    }

    protected n9.a d(Map<String, String> map) {
        return this.f59492b.b(this.f59491a, map).d(ProtectedSandApp.s("\uffc9"), ProtectedSandApp.s("\uffc8")).d(ProtectedSandApp.s("ￊ"), ProtectedSandApp.s("ￋ"));
    }

    JSONObject g(n9.c cVar) {
        int b5 = cVar.b();
        this.f59493c.k(ProtectedSandApp.s("ￌ") + b5);
        if (h(b5)) {
            return e(cVar.a());
        }
        com.google.firebase.crashlytics.internal.g gVar = this.f59493c;
        StringBuilder a5 = s.a(ProtectedSandApp.s("ￍ"), b5, ProtectedSandApp.s("ￎ"));
        a5.append(this.f59491a);
        gVar.d(a5.toString());
        return null;
    }

    boolean h(int i4) {
        return i4 == 200 || i4 == 201 || i4 == 202 || i4 == 203;
    }

    c(String str, n9.b bVar, com.google.firebase.crashlytics.internal.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ﾲ"));
        }
        this.f59493c = gVar;
        this.f59492b = bVar;
        this.f59491a = str;
    }
}
