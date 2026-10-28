package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import androidx.core.app.x;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall.java */
/* loaded from: classes3.dex */
class c implements l {

    /* renamed from: d, reason: collision with root package name */
    static final String f16349d = ProtectedSandApp.s("⩅");

    /* renamed from: e, reason: collision with root package name */
    static final String f16350e = ProtectedSandApp.s("⩆");

    /* renamed from: f, reason: collision with root package name */
    static final String f16351f = ProtectedSandApp.s("⩇");

    /* renamed from: g, reason: collision with root package name */
    static final String f16352g = ProtectedSandApp.s("⩈");

    /* renamed from: h, reason: collision with root package name */
    static final String f16353h = ProtectedSandApp.s("⩉");

    /* renamed from: i, reason: collision with root package name */
    static final String f16354i = ProtectedSandApp.s("⩊");

    /* renamed from: j, reason: collision with root package name */
    static final String f16355j = ProtectedSandApp.s("⩋");

    /* renamed from: k, reason: collision with root package name */
    static final String f16356k = ProtectedSandApp.s("⩌");

    /* renamed from: l, reason: collision with root package name */
    static final String f16357l = ProtectedSandApp.s("⩍");

    /* renamed from: m, reason: collision with root package name */
    static final String f16358m = ProtectedSandApp.s("⩎");

    /* renamed from: n, reason: collision with root package name */
    static final String f16359n = ProtectedSandApp.s("⩏");

    /* renamed from: o, reason: collision with root package name */
    static final String f16360o = ProtectedSandApp.s("⩐");

    /* renamed from: p, reason: collision with root package name */
    static final String f16361p = ProtectedSandApp.s("⩑");

    /* renamed from: q, reason: collision with root package name */
    static final String f16362q = ProtectedSandApp.s("⩒");

    /* renamed from: r, reason: collision with root package name */
    static final String f16363r = ProtectedSandApp.s("⩓");

    /* renamed from: s, reason: collision with root package name */
    static final String f16364s = ProtectedSandApp.s("⩔");

    /* renamed from: a, reason: collision with root package name */
    private final String f16365a;

    /* renamed from: b, reason: collision with root package name */
    private final d2.b f16366b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.g f16367c;

    public c(String str, d2.b bVar) {
        this(str, bVar, com.google.firebase.crashlytics.internal.g.f());
    }

    private d2.a b(d2.a aVar, k kVar) {
        c(aVar, ProtectedSandApp.s("⨩"), kVar.f16418a);
        c(aVar, ProtectedSandApp.s("⨪"), ProtectedSandApp.s("⨫"));
        c(aVar, ProtectedSandApp.s("⨬"), ProtectedSandApp.s("⨭"));
        c(aVar, ProtectedSandApp.s("⨮"), ProtectedSandApp.s("⨯"));
        c(aVar, ProtectedSandApp.s("⨰"), kVar.f16419b);
        c(aVar, ProtectedSandApp.s("⨱"), kVar.f16420c);
        c(aVar, ProtectedSandApp.s("⨲"), kVar.f16421d);
        c(aVar, ProtectedSandApp.s("⨳"), kVar.f16422e.a().c());
        return aVar;
    }

    private void c(d2.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e6) {
            this.f16367c.n(ProtectedSandApp.s("⨴") + this.f16365a, e6);
            this.f16367c.m(ProtectedSandApp.s("⨵") + str);
            return null;
        }
    }

    private Map<String, String> f(k kVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("⨶"), kVar.f16425h);
        hashMap.put(ProtectedSandApp.s("⨷"), kVar.f16424g);
        hashMap.put(ProtectedSandApp.s("⨸"), Integer.toString(kVar.f16426i));
        String str = kVar.f16423f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(ProtectedSandApp.s("⨹"), str);
        }
        return hashMap;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.l
    public JSONObject a(k kVar, boolean z5) {
        String s5 = ProtectedSandApp.s("⨺");
        String s6 = ProtectedSandApp.s("⨻");
        if (!z5) {
            throw new RuntimeException(ProtectedSandApp.s("⨽"));
        }
        try {
            Map<String, String> f6 = f(kVar);
            d2.a b6 = b(d(f6), kVar);
            this.f16367c.b(s6 + this.f16365a);
            this.f16367c.k(s5 + f6);
            return g(b6.c());
        } catch (IOException e6) {
            this.f16367c.e(ProtectedSandApp.s("⨼"), e6);
            return null;
        }
    }

    protected d2.a d(Map<String, String> map) {
        return this.f16366b.b(this.f16365a, map).d(ProtectedSandApp.s("⨿"), ProtectedSandApp.s("⨾")).d(ProtectedSandApp.s("⩀"), ProtectedSandApp.s("⩁"));
    }

    JSONObject g(d2.c cVar) {
        int b6 = cVar.b();
        this.f16367c.k(ProtectedSandApp.s("⩂") + b6);
        if (h(b6)) {
            return e(cVar.a());
        }
        com.google.firebase.crashlytics.internal.g gVar = this.f16367c;
        StringBuilder a6 = x.a(ProtectedSandApp.s("⩃"), b6, ProtectedSandApp.s("⩄"));
        a6.append(this.f16365a);
        gVar.d(a6.toString());
        return null;
    }

    boolean h(int i5) {
        return i5 == 200 || i5 == 201 || i5 == 202 || i5 == 203;
    }

    c(String str, d2.b bVar, com.google.firebase.crashlytics.internal.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⨨"));
        }
        this.f16367c = gVar;
        this.f16366b = bVar;
        this.f16365a = str;
    }
}
