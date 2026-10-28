package com.google.firebase.crashlytics.internal.settings;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16347b = ProtectedSandApp.s("ᗜ");

    /* renamed from: a, reason: collision with root package name */
    private final File f16348a;

    public a(com.google.firebase.crashlytics.internal.persistence.f fVar) {
        this.f16348a = fVar.f(ProtectedSandApp.s("ᗓ"));
    }

    private File a() {
        return this.f16348a;
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        Throwable th;
        JSONObject jSONObject;
        String s5 = ProtectedSandApp.s("ᗔ");
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ᗕ"));
        FileInputStream fileInputStream2 = null;
        try {
            File file = this.f16348a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e6) {
                        e = e6;
                        com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᗗ"), e);
                        com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
                    throw th;
                }
            } else {
                com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᗖ"));
                jSONObject = null;
            }
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, s5);
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s5);
            throw th;
        }
    }

    public void c(long j5, JSONObject jSONObject) {
        FileWriter fileWriter;
        String s5 = ProtectedSandApp.s("ᗘ");
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ᗙ"));
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put(ProtectedSandApp.s("ᗚ"), j5);
                    fileWriter = new FileWriter(this.f16348a);
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                com.google.firebase.crashlytics.internal.common.i.f(fileWriter, s5);
            } catch (Exception e7) {
                e = e7;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ᗛ"), e);
                com.google.firebase.crashlytics.internal.common.i.f(fileWriter2, s5);
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.internal.common.i.f(fileWriter2, s5);
                throw th;
            }
        }
    }
}
