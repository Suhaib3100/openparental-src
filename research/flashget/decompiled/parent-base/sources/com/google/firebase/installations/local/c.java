package com.google.firebase.installations.local;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final String f59769c = ProtectedSandApp.s("Ð\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final String f59770d = ProtectedSandApp.s("É\u0001");

    /* renamed from: e, reason: collision with root package name */
    private static final String f59771e = ProtectedSandApp.s("Ë\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f59772f = ProtectedSandApp.s("Ì\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final String f59773g = ProtectedSandApp.s("Í\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final String f59774h = ProtectedSandApp.s("Î\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f59775i = ProtectedSandApp.s("Ê\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f59776j = ProtectedSandApp.s("Ï\u0001");

    /* renamed from: a, reason: collision with root package name */
    private File f59777a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final g f59778b;

    /* compiled from: PersistedInstallation.java */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(@o0 g gVar) {
        this.f59778b = gVar;
    }

    private File b() {
        String s4 = ProtectedSandApp.s("Ç\u0001");
        if (this.f59777a == null) {
            synchronized (this) {
                try {
                    if (this.f59777a == null) {
                        this.f59777a = new File(this.f59778b.n().getFilesDir(), s4 + this.f59778b.t() + ProtectedSandApp.s("È\u0001"));
                    }
                } finally {
                }
            }
        }
        return this.f59777a;
    }

    private JSONObject d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public void a() {
        b().delete();
    }

    @o0
    public d c(@o0 d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ProtectedSandApp.s("É\u0001"), dVar.d());
            jSONObject.put(ProtectedSandApp.s("Ê\u0001"), dVar.g().ordinal());
            jSONObject.put(ProtectedSandApp.s("Ë\u0001"), dVar.b());
            jSONObject.put(ProtectedSandApp.s("Ì\u0001"), dVar.f());
            jSONObject.put(ProtectedSandApp.s("Í\u0001"), dVar.h());
            jSONObject.put(ProtectedSandApp.s("Î\u0001"), dVar.c());
            jSONObject.put(ProtectedSandApp.s("Ï\u0001"), dVar.e());
            createTempFile = File.createTempFile(ProtectedSandApp.s("Ð\u0001"), ProtectedSandApp.s("Ñ\u0001"), this.f59778b.n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(ProtectedSandApp.s("Ò\u0001")));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(b())) {
            return dVar;
        }
        throw new IOException(ProtectedSandApp.s("Ó\u0001"));
    }

    @o0
    public d e() {
        JSONObject d5 = d();
        String optString = d5.optString(ProtectedSandApp.s("É\u0001"), null);
        int optInt = d5.optInt(ProtectedSandApp.s("Ê\u0001"), a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = d5.optString(ProtectedSandApp.s("Ë\u0001"), null);
        String optString3 = d5.optString(ProtectedSandApp.s("Ì\u0001"), null);
        long optLong = d5.optLong(ProtectedSandApp.s("Í\u0001"), 0L);
        long optLong2 = d5.optLong(ProtectedSandApp.s("Î\u0001"), 0L);
        return d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(d5.optString(ProtectedSandApp.s("Ï\u0001"), null)).a();
    }
}
