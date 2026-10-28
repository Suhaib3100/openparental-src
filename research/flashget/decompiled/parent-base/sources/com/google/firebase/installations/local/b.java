package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.g;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IidStore.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f59759c = ProtectedSandApp.s("³\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final String f59760d = ProtectedSandApp.s("´\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f59761e = ProtectedSandApp.s("µ\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f59762f = ProtectedSandApp.s("¶\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final String f59763g = ProtectedSandApp.s("·\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final String f59764h = ProtectedSandApp.s("¸\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f59765i = ProtectedSandApp.s("¹\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f59766j = {ProtectedSandApp.s("»\u0001"), ProtectedSandApp.s("¼\u0001"), ProtectedSandApp.s("º\u0001"), ""};

    /* renamed from: a, reason: collision with root package name */
    @b0("iidPrefs")
    private final SharedPreferences f59767a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59768b;

    public b(@o0 g gVar) {
        this.f59767a = gVar.n().getSharedPreferences(ProtectedSandApp.s("³\u0001"), 0);
        this.f59768b = b(gVar);
    }

    private String a(@o0 String str, @o0 String str2) {
        return y.a(ProtectedSandApp.s("¶\u0001"), str, ProtectedSandApp.s("·\u0001"), str2);
    }

    private static String b(g gVar) {
        String m4 = gVar.s().m();
        if (m4 != null) {
            return m4;
        }
        String j4 = gVar.s().j();
        if (!j4.startsWith(ProtectedSandApp.s("½\u0001")) && !j4.startsWith(ProtectedSandApp.s("¾\u0001"))) {
            return j4;
        }
        String[] split = j4.split(ProtectedSandApp.s("¿\u0001"));
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @q0
    private static String c(@o0 PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance(ProtectedSandApp.s("À\u0001")).digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & com.google.common.base.c.f54871q) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString(ProtectedSandApp.s("¸\u0001"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @q0
    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance(ProtectedSandApp.s("Á\u0001")).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e4) {
            e4.toString();
            return null;
        }
    }

    @q0
    private String g() {
        String string;
        synchronized (this.f59767a) {
            string = this.f59767a.getString(ProtectedSandApp.s("µ\u0001"), null);
        }
        return string;
    }

    @q0
    private String h() {
        synchronized (this.f59767a) {
            try {
                String string = this.f59767a.getString(ProtectedSandApp.s("´\u0001"), null);
                if (string == null) {
                    return null;
                }
                PublicKey e4 = e(string);
                if (e4 == null) {
                    return null;
                }
                return c(e4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @q0
    public String f() {
        synchronized (this.f59767a) {
            try {
                String g4 = g();
                if (g4 != null) {
                    return g4;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @q0
    public String i() {
        synchronized (this.f59767a) {
            try {
                for (String str : f59766j) {
                    String string = this.f59767a.getString(a(this.f59768b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith(ProtectedSandApp.s("¹\u0001"))) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @m1
    public b(@o0 SharedPreferences sharedPreferences, @q0 String str) {
        this.f59767a = sharedPreferences;
        this.f59768b = str;
    }
}
