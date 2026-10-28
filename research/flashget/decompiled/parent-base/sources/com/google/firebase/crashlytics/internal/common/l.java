package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: CrashlyticsAppQualitySessionsStore.java */
/* loaded from: classes6.dex */
class l {

    /* renamed from: d, reason: collision with root package name */
    private static final String f58752d = ProtectedSandApp.s("ﱛ");

    /* renamed from: e, reason: collision with root package name */
    private static final FilenameFilter f58753e = new j();

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator<File> f58754f = new k();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f58755a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private String f58756b = null;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    private String f58757c = null;

    l(com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f58755a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(com.google.firebase.crashlytics.internal.persistence.g gVar, @androidx.annotation.q0 String str, @androidx.annotation.q0 String str2) {
        String s4 = ProtectedSandApp.s("ﱛ");
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.r(str, s4.concat(str2)).createNewFile();
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﱜ"), e4);
        }
    }

    @androidx.annotation.q0
    @m1
    static String g(com.google.firebase.crashlytics.internal.persistence.g gVar, @androidx.annotation.o0 String str) {
        List<File> s4 = gVar.s(str, f58753e);
        if (!s4.isEmpty()) {
            return ((File) Collections.min(s4, f58754f)).getName().substring(4);
        }
        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﱝ"));
        return null;
    }

    @androidx.annotation.q0
    public synchronized String c(@androidx.annotation.o0 String str) {
        if (Objects.equals(this.f58756b, str)) {
            return this.f58757c;
        }
        return g(this.f58755a, str);
    }

    public synchronized void h(@androidx.annotation.o0 String str) {
        if (!Objects.equals(this.f58757c, str)) {
            f(this.f58755a, this.f58756b, str);
            this.f58757c = str;
        }
    }

    public synchronized void i(@androidx.annotation.q0 String str) {
        if (!Objects.equals(this.f58756b, str)) {
            f(this.f58755a, str, this.f58757c);
            this.f58756b = str;
        }
    }
}
