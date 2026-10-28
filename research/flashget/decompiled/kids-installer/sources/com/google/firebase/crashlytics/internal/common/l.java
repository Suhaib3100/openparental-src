package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: CrashlyticsAppQualitySessionsStore.java */
/* loaded from: classes2.dex */
class l {

    /* renamed from: d, reason: collision with root package name */
    private static final String f15623d = ProtectedSandApp.s("ᐙ");

    /* renamed from: e, reason: collision with root package name */
    private static final FilenameFilter f15624e = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean d6;
            d6 = l.d(file, str);
            return d6;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final Comparator<File> f15625f = new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e6;
            e6 = l.e((File) obj, (File) obj2);
            return e6;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.f f15626a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private String f15627b = null;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.q0
    private String f15628c = null;

    l(com.google.firebase.crashlytics.internal.persistence.f fVar) {
        this.f15626a = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith(ProtectedSandApp.s("ᐚ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(com.google.firebase.crashlytics.internal.persistence.f fVar, @androidx.annotation.q0 String str, @androidx.annotation.q0 String str2) {
        String s5 = ProtectedSandApp.s("ᐛ");
        if (str == null || str2 == null) {
            return;
        }
        try {
            fVar.p(str, s5.concat(str2)).createNewFile();
        } catch (IOException e6) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ᐜ"), e6);
        }
    }

    @androidx.annotation.q0
    @m1
    static String g(com.google.firebase.crashlytics.internal.persistence.f fVar, @androidx.annotation.o0 String str) {
        List<File> q5 = fVar.q(str, f15624e);
        if (!q5.isEmpty()) {
            return ((File) Collections.min(q5, f15625f)).getName().substring(4);
        }
        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ᐝ"));
        return null;
    }

    @androidx.annotation.q0
    public synchronized String c(@androidx.annotation.o0 String str) {
        if (Objects.equals(this.f15627b, str)) {
            return this.f15628c;
        }
        return g(this.f15626a, str);
    }

    public synchronized void h(@androidx.annotation.o0 String str) {
        if (!Objects.equals(this.f15628c, str)) {
            f(this.f15626a, this.f15627b, str);
            this.f15628c = str;
        }
    }

    public synchronized void i(@androidx.annotation.q0 String str) {
        if (!Objects.equals(this.f15627b, str)) {
            f(this.f15626a, str, this.f15628c);
            this.f15627b = str;
        }
    }
}
