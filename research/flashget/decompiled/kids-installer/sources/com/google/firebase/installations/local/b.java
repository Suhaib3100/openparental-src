package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16738c = ProtectedSandApp.s("ᘿ");

    /* renamed from: d, reason: collision with root package name */
    private static final String f16739d = ProtectedSandApp.s("ᙀ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f16740e = ProtectedSandApp.s("ᙁ");

    /* renamed from: f, reason: collision with root package name */
    private static final String f16741f = ProtectedSandApp.s("ᙂ");

    /* renamed from: g, reason: collision with root package name */
    private static final String f16742g = ProtectedSandApp.s("ᙃ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f16743h = ProtectedSandApp.s("ᙄ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f16744i = ProtectedSandApp.s("ᙅ");

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f16745j = {ProtectedSandApp.s("ᙇ"), ProtectedSandApp.s("ᙈ"), ProtectedSandApp.s("ᙆ"), ""};

    /* renamed from: a, reason: collision with root package name */
    @b0("iidPrefs")
    private final SharedPreferences f16746a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16747b;

    public b(@o0 g gVar) {
        this.f16746a = gVar.n().getSharedPreferences(ProtectedSandApp.s("ᙉ"), 0);
        this.f16747b = b(gVar);
    }

    private String a(@o0 String str, @o0 String str2) {
        return ProtectedSandApp.s("ᙊ") + str + ProtectedSandApp.s("ᙋ") + str2;
    }

    private static String b(g gVar) {
        String m5 = gVar.s().m();
        if (m5 != null) {
            return m5;
        }
        String j5 = gVar.s().j();
        if (!j5.startsWith(ProtectedSandApp.s("ᙌ")) && !j5.startsWith(ProtectedSandApp.s("ᙍ"))) {
            return j5;
        }
        String[] split = j5.split(ProtectedSandApp.s("ᙎ"));
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
            byte[] digest = MessageDigest.getInstance(ProtectedSandApp.s("ᙏ")).digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString(ProtectedSandApp.s("ᙐ"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @q0
    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance(ProtectedSandApp.s("ᙑ")).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e6) {
            e6.toString();
            return null;
        }
    }

    @q0
    private String g() {
        String string;
        synchronized (this.f16746a) {
            string = this.f16746a.getString(ProtectedSandApp.s("ᙒ"), null);
        }
        return string;
    }

    @q0
    private String h() {
        synchronized (this.f16746a) {
            String string = this.f16746a.getString(ProtectedSandApp.s("ᙓ"), null);
            if (string == null) {
                return null;
            }
            PublicKey e6 = e(string);
            if (e6 == null) {
                return null;
            }
            return c(e6);
        }
    }

    @q0
    public String f() {
        synchronized (this.f16746a) {
            String g5 = g();
            if (g5 != null) {
                return g5;
            }
            return h();
        }
    }

    @q0
    public String i() {
        synchronized (this.f16746a) {
            for (String str : f16745j) {
                String string = this.f16746a.getString(a(this.f16747b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(ProtectedSandApp.s("ᙔ"))) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    @m1
    public b(@o0 SharedPreferences sharedPreferences, @q0 String str) {
        this.f16746a = sharedPreferences;
        this.f16747b = str;
    }
}
