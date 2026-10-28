package com.google.firebase.crashlytics.internal.settings;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f59473b = ProtectedSandApp.s("ﾩ");

    /* renamed from: a, reason: collision with root package name */
    private final File f59474a;

    public a(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f59474a = gVar.h(ProtectedSandApp.s("ﾩ"));
    }

    private File a() {
        return this.f59474a;
    }

    public JSONObject b() {
        FileInputStream fileInputStream;
        Throwable th;
        JSONObject jSONObject;
        String s4 = ProtectedSandApp.s("ﾪ");
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﾫ"));
        FileInputStream fileInputStream2 = null;
        try {
            File file = this.f59474a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(com.google.firebase.crashlytics.internal.common.i.D(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e4) {
                        e = e4;
                        com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﾭ"), e);
                        com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
                    throw th;
                }
            } else {
                com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﾬ"));
                jSONObject = null;
            }
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream2, s4);
            return jSONObject;
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            com.google.firebase.crashlytics.internal.common.i.f(fileInputStream, s4);
            throw th;
        }
    }

    public void c(long j4, JSONObject jSONObject) {
        FileWriter fileWriter;
        String s4 = ProtectedSandApp.s("ﾮ");
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﾯ"));
        if (jSONObject != null) {
            FileWriter fileWriter2 = null;
            try {
                try {
                    jSONObject.put(ProtectedSandApp.s("ﾰ"), j4);
                    fileWriter = new FileWriter(this.f59474a);
                } catch (Exception e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                fileWriter.write(jSONObject.toString());
                fileWriter.flush();
                com.google.firebase.crashlytics.internal.common.i.f(fileWriter, s4);
            } catch (Exception e5) {
                e = e5;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("ﾱ"), e);
                com.google.firebase.crashlytics.internal.common.i.f(fileWriter2, s4);
            } catch (Throwable th2) {
                th = th2;
                fileWriter2 = fileWriter;
                com.google.firebase.crashlytics.internal.common.i.f(fileWriter2, s4);
                throw th;
            }
        }
    }
}
