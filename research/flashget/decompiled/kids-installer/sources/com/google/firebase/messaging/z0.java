package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Store.java */
/* loaded from: classes2.dex */
class z0 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f17660b = ProtectedSandApp.s("ᣘ");

    /* renamed from: c, reason: collision with root package name */
    private static final String f17661c = ProtectedSandApp.s("ᣙ");

    /* renamed from: d, reason: collision with root package name */
    static final String f17662d = ProtectedSandApp.s("ᣚ");

    /* renamed from: e, reason: collision with root package name */
    static final String f17663e = ProtectedSandApp.s("ᣛ");

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f17664a;

    /* compiled from: Store.java */
    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f17665d = ProtectedSandApp.s("ᣉ");

        /* renamed from: e, reason: collision with root package name */
        private static final String f17666e = ProtectedSandApp.s("ᣊ");

        /* renamed from: f, reason: collision with root package name */
        private static final String f17667f = ProtectedSandApp.s("ᣋ");

        /* renamed from: g, reason: collision with root package name */
        private static final long f17668g = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f17669a;

        /* renamed from: b, reason: collision with root package name */
        final String f17670b;

        /* renamed from: c, reason: collision with root package name */
        final long f17671c;

        private a(String str, String str2, long j5) {
            this.f17669a = str;
            this.f17670b = str2;
            this.f17671c = j5;
        }

        static String a(String str, String str2, long j5) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ProtectedSandApp.s("ᣌ"), str);
                jSONObject.put(ProtectedSandApp.s("ᣍ"), str2);
                jSONObject.put(ProtectedSandApp.s("ᣎ"), j5);
                return jSONObject.toString();
            } catch (JSONException e6) {
                e6.toString();
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith(ProtectedSandApp.s("ᣏ"))) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString(ProtectedSandApp.s("ᣐ")), jSONObject.getString(ProtectedSandApp.s("ᣑ")), jSONObject.getLong(ProtectedSandApp.s("ᣒ")));
            } catch (JSONException e6) {
                e6.toString();
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f17671c + f17668g || !str.equals(this.f17670b);
        }
    }

    public z0(Context context) {
        this.f17664a = context.getSharedPreferences(ProtectedSandApp.s("ᣓ"), 0);
        a(context, ProtectedSandApp.s("ᣔ"));
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.d.m(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            c();
        } catch (IOException e6) {
            if (Log.isLoggable(ProtectedSandApp.s("ᣕ"), 3)) {
                e6.getMessage();
            }
        }
    }

    private String b(String str, String str2) {
        return str + ProtectedSandApp.s("ᣖ") + str2 + ProtectedSandApp.s("ᣗ");
    }

    public synchronized void c() {
        this.f17664a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b6 = b(str, str2);
        SharedPreferences.Editor edit = this.f17664a.edit();
        edit.remove(b6);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f17664a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f17664a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a6 = a.a(str3, str4, System.currentTimeMillis());
        if (a6 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f17664a.edit();
        edit.putString(b(str, str2), a6);
        edit.commit();
    }
}
