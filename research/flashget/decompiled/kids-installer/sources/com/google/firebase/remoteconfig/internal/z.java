package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Personalization.java */
/* loaded from: classes2.dex */
public class z {

    /* renamed from: c, reason: collision with root package name */
    public static final String f18071c = ProtectedSandApp.s("᧚");

    /* renamed from: d, reason: collision with root package name */
    public static final String f18072d = ProtectedSandApp.s("\u19db");

    /* renamed from: e, reason: collision with root package name */
    public static final String f18073e = ProtectedSandApp.s("\u19dc");

    /* renamed from: f, reason: collision with root package name */
    public static final String f18074f = ProtectedSandApp.s("\u19dd");

    /* renamed from: g, reason: collision with root package name */
    public static final String f18075g = ProtectedSandApp.s("᧞");

    /* renamed from: h, reason: collision with root package name */
    public static final String f18076h = ProtectedSandApp.s("᧟");

    /* renamed from: i, reason: collision with root package name */
    public static final String f18077i = ProtectedSandApp.s("᧠");

    /* renamed from: j, reason: collision with root package name */
    public static final String f18078j = ProtectedSandApp.s("᧡");

    /* renamed from: k, reason: collision with root package name */
    public static final String f18079k = ProtectedSandApp.s("᧢");

    /* renamed from: l, reason: collision with root package name */
    public static final String f18080l = ProtectedSandApp.s("᧣");

    /* renamed from: m, reason: collision with root package name */
    public static final String f18081m = ProtectedSandApp.s("᧤");

    /* renamed from: n, reason: collision with root package name */
    public static final String f18082n = ProtectedSandApp.s("᧥");

    /* renamed from: o, reason: collision with root package name */
    public static final String f18083o = ProtectedSandApp.s("᧦");

    /* renamed from: a, reason: collision with root package name */
    private final o2.b<com.google.firebase.analytics.connector.a> f18084a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f18085b = Collections.synchronizedMap(new HashMap());

    public z(o2.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f18084a = bVar;
    }

    public void a(@o0 String str, @o0 h hVar) {
        JSONObject optJSONObject;
        com.google.firebase.analytics.connector.a aVar = this.f18084a.get();
        if (aVar == null) {
            return;
        }
        JSONObject h5 = hVar.h();
        if (h5.length() < 1) {
            return;
        }
        JSONObject f6 = hVar.f();
        if (f6.length() >= 1 && (optJSONObject = h5.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString(ProtectedSandApp.s("\u19cc"));
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.f18085b) {
                if (optString.equals(this.f18085b.get(str))) {
                    return;
                }
                this.f18085b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString(ProtectedSandApp.s("\u19cd"), str);
                bundle.putString(ProtectedSandApp.s("\u19ce"), f6.optString(str));
                bundle.putString(ProtectedSandApp.s("\u19cf"), optJSONObject.optString(ProtectedSandApp.s("᧐")));
                bundle.putInt(ProtectedSandApp.s("᧑"), optJSONObject.optInt(ProtectedSandApp.s("᧒"), -1));
                bundle.putString(ProtectedSandApp.s("᧓"), optJSONObject.optString(ProtectedSandApp.s("᧔")));
                aVar.c(ProtectedSandApp.s("᧕"), ProtectedSandApp.s("᧖"), bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString(ProtectedSandApp.s("᧗"), optString);
                aVar.c(ProtectedSandApp.s("᧘"), ProtectedSandApp.s("᧙"), bundle2);
            }
        }
    }
}
