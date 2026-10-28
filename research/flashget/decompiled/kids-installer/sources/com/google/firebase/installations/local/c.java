package com.google.firebase.installations.local;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final String f16748c = ProtectedSandApp.s("᙮");

    /* renamed from: d, reason: collision with root package name */
    private static final String f16749d = ProtectedSandApp.s("ᙯ");

    /* renamed from: e, reason: collision with root package name */
    private static final String f16750e = ProtectedSandApp.s("ᙰ");

    /* renamed from: f, reason: collision with root package name */
    private static final String f16751f = ProtectedSandApp.s("ᙱ");

    /* renamed from: g, reason: collision with root package name */
    private static final String f16752g = ProtectedSandApp.s("ᙲ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f16753h = ProtectedSandApp.s("ᙳ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f16754i = ProtectedSandApp.s("ᙴ");

    /* renamed from: j, reason: collision with root package name */
    private static final String f16755j = ProtectedSandApp.s("ᙵ");

    /* renamed from: a, reason: collision with root package name */
    private File f16756a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final g f16757b;

    /* compiled from: PersistedInstallation.java */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(@o0 g gVar) {
        this.f16757b = gVar;
    }

    private File b() {
        String s5 = ProtectedSandApp.s("ᙚ");
        if (this.f16756a == null) {
            synchronized (this) {
                if (this.f16756a == null) {
                    this.f16756a = new File(this.f16757b.n().getFilesDir(), s5 + this.f16757b.t() + ProtectedSandApp.s("ᙛ"));
                }
            }
        }
        return this.f16756a;
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
            jSONObject.put(ProtectedSandApp.s("ᙜ"), dVar.d());
            jSONObject.put(ProtectedSandApp.s("ᙝ"), dVar.g().ordinal());
            jSONObject.put(ProtectedSandApp.s("ᙞ"), dVar.b());
            jSONObject.put(ProtectedSandApp.s("ᙟ"), dVar.f());
            jSONObject.put(ProtectedSandApp.s("ᙠ"), dVar.h());
            jSONObject.put(ProtectedSandApp.s("ᙡ"), dVar.c());
            jSONObject.put(ProtectedSandApp.s("ᙢ"), dVar.e());
            createTempFile = File.createTempFile(ProtectedSandApp.s("ᙣ"), ProtectedSandApp.s("ᙤ"), this.f16757b.n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(ProtectedSandApp.s("ᙥ")));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(b())) {
            return dVar;
        }
        throw new IOException(ProtectedSandApp.s("ᙦ"));
    }

    @o0
    public d e() {
        JSONObject d6 = d();
        String optString = d6.optString(ProtectedSandApp.s("ᙧ"), null);
        int optInt = d6.optInt(ProtectedSandApp.s("ᙨ"), a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = d6.optString(ProtectedSandApp.s("ᙩ"), null);
        String optString3 = d6.optString(ProtectedSandApp.s("ᙪ"), null);
        long optLong = d6.optLong(ProtectedSandApp.s("ᙫ"), 0L);
        long optLong2 = d6.optLong(ProtectedSandApp.s("ᙬ"), 0L);
        return d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(d6.optString(ProtectedSandApp.s("᙭"), null)).a();
    }
}
