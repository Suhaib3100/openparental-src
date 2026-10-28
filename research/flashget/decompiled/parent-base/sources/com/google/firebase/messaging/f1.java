package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Store.java */
/* loaded from: classes6.dex */
class f1 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f60118b = ProtectedSandApp.s("ȳ\u0001");

    /* renamed from: c, reason: collision with root package name */
    private static final String f60119c = ProtectedSandApp.s("ȵ\u0001");

    /* renamed from: d, reason: collision with root package name */
    static final String f60120d = ProtectedSandApp.s("Ȱ\u0001");

    /* renamed from: e, reason: collision with root package name */
    static final String f60121e = ProtectedSandApp.s("ȱ\u0001");

    /* renamed from: a, reason: collision with root package name */
    final SharedPreferences f60122a;

    /* compiled from: Store.java */
    static class a {

        /* renamed from: d, reason: collision with root package name */
        private static final String f60123d = ProtectedSandApp.s("Ȭ\u0001");

        /* renamed from: e, reason: collision with root package name */
        private static final String f60124e = ProtectedSandApp.s("ȭ\u0001");

        /* renamed from: f, reason: collision with root package name */
        private static final String f60125f = ProtectedSandApp.s("Ȯ\u0001");

        /* renamed from: g, reason: collision with root package name */
        private static final long f60126g = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a, reason: collision with root package name */
        final String f60127a;

        /* renamed from: b, reason: collision with root package name */
        final String f60128b;

        /* renamed from: c, reason: collision with root package name */
        final long f60129c;

        private a(String str, String str2, long j4) {
            this.f60127a = str;
            this.f60128b = str2;
            this.f60129c = j4;
        }

        static String a(String str, String str2, long j4) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ProtectedSandApp.s("Ȭ\u0001"), str);
                jSONObject.put(ProtectedSandApp.s("ȭ\u0001"), str2);
                jSONObject.put(ProtectedSandApp.s("Ȯ\u0001"), j4);
                return jSONObject.toString();
            } catch (JSONException e4) {
                e4.toString();
                return null;
            }
        }

        static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith(ProtectedSandApp.s("ȯ\u0001"))) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString(ProtectedSandApp.s("Ȭ\u0001")), jSONObject.getString(ProtectedSandApp.s("ȭ\u0001")), jSONObject.getLong(ProtectedSandApp.s("Ȯ\u0001")));
            } catch (JSONException e4) {
                e4.toString();
                return null;
            }
        }

        boolean b(String str) {
            return System.currentTimeMillis() > this.f60129c + f60126g || !str.equals(this.f60128b);
        }
    }

    public f1(Context context) {
        this.f60122a = context.getSharedPreferences(ProtectedSandApp.s("Ȱ\u0001"), 0);
        a(context, ProtectedSandApp.s("ȱ\u0001"));
    }

    private void a(Context context, String str) {
        File file = new File(androidx.core.content.d.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || f()) {
                return;
            }
            c();
        } catch (IOException e4) {
            if (Log.isLoggable(ProtectedSandApp.s("Ȳ\u0001"), 3)) {
                e4.getMessage();
            }
        }
    }

    private String b(String str, String str2) {
        return com.cby.txliteav.live.impl.tx.a.a(str, ProtectedSandApp.s("ȳ\u0001"), str2, ProtectedSandApp.s("ȴ\u0001"));
    }

    public synchronized void c() {
        this.f60122a.edit().clear().commit();
    }

    public synchronized void d(String str, String str2) {
        String b5 = b(str, str2);
        SharedPreferences.Editor edit = this.f60122a.edit();
        edit.remove(b5);
        edit.commit();
    }

    public synchronized a e(String str, String str2) {
        return a.c(this.f60122a.getString(b(str, str2), null));
    }

    public synchronized boolean f() {
        return this.f60122a.getAll().isEmpty();
    }

    public synchronized void g(String str, String str2, String str3, String str4) {
        String a5 = a.a(str3, str4, System.currentTimeMillis());
        if (a5 == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f60122a.edit();
        edit.putString(b(str, str2), a5);
        edit.commit();
    }
}
