package com.google.firebase.crashlytics.internal.persistence;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    private static final String f16303g = ProtectedSandApp.s("ᖻ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f16304h = ProtectedSandApp.s("ᖼ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f16305i = ProtectedSandApp.s("ᖽ");

    /* renamed from: j, reason: collision with root package name */
    private static final String f16306j = ProtectedSandApp.s("ᖾ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f16307k = ProtectedSandApp.s("ᖿ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f16308l = ProtectedSandApp.s("ᗀ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f16309m = ProtectedSandApp.s("ᗁ");

    /* renamed from: a, reason: collision with root package name */
    private final File f16310a;

    /* renamed from: b, reason: collision with root package name */
    private final File f16311b;

    /* renamed from: c, reason: collision with root package name */
    private final File f16312c;

    /* renamed from: d, reason: collision with root package name */
    private final File f16313d;

    /* renamed from: e, reason: collision with root package name */
    private final File f16314e;

    /* renamed from: f, reason: collision with root package name */
    private final File f16315f;

    public f(Context context) {
        String s5;
        String processName;
        File filesDir = context.getFilesDir();
        this.f16310a = filesDir;
        if (w()) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ᖫ"));
            sb.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb.append(v(processName));
            s5 = sb.toString();
        } else {
            s5 = ProtectedSandApp.s("ᖬ");
        }
        File r5 = r(new File(filesDir, s5));
        this.f16311b = r5;
        this.f16312c = r(new File(r5, ProtectedSandApp.s("ᖭ")));
        this.f16313d = r(new File(r5, ProtectedSandApp.s("ᖮ")));
        this.f16314e = r(new File(r5, ProtectedSandApp.s("ᖯ")));
        this.f16315f = r(new File(r5, ProtectedSandApp.s("ᖰ")));
    }

    private void a(File file) {
        if (file.exists() && t(file)) {
            g.f().b(ProtectedSandApp.s("ᖱ") + file.getPath());
        }
    }

    private File o(String str) {
        File file = new File(this.f16312c, str);
        file.mkdirs();
        return file;
    }

    private static synchronized File r(File file) {
        String s5 = ProtectedSandApp.s("ᖲ");
        String s6 = ProtectedSandApp.s("ᖳ");
        synchronized (f.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                g.f().b(s5 + file + ProtectedSandApp.s("ᖴ"));
                file.delete();
            }
            if (!file.mkdirs()) {
                g.f().d(s6 + file);
            }
            return file;
        }
    }

    private static File s(File file) {
        file.mkdirs();
        return file;
    }

    static boolean t(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                t(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> u(@q0 T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @m1
    static String v(String str) {
        return str.replaceAll(ProtectedSandApp.s("ᖵ"), ProtectedSandApp.s("ᖶ"));
    }

    @SuppressLint({"AnnotateVersionCheck"})
    private static boolean w() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public void b() {
        a(new File(this.f16310a, ProtectedSandApp.s("ᖷ")));
        a(new File(this.f16310a, ProtectedSandApp.s("ᖸ")));
        if (w()) {
            a(new File(this.f16310a, ProtectedSandApp.s("ᖹ")));
        }
    }

    @m1
    public void c() {
        t(this.f16311b);
    }

    public boolean d(String str) {
        return t(new File(this.f16312c, str));
    }

    public List<String> e() {
        return u(this.f16312c.list());
    }

    public File f(String str) {
        return new File(this.f16311b, str);
    }

    public List<File> g(FilenameFilter filenameFilter) {
        return u(this.f16311b.listFiles(filenameFilter));
    }

    public File h(String str) {
        return new File(this.f16315f, str);
    }

    public List<File> i() {
        return u(this.f16315f.listFiles());
    }

    public File j(String str) {
        File file = new File(o(str), ProtectedSandApp.s("ᖺ"));
        file.mkdirs();
        return file;
    }

    public File k(String str) {
        return new File(this.f16314e, str);
    }

    public List<File> l() {
        return u(this.f16314e.listFiles());
    }

    public File m(String str) {
        return new File(this.f16313d, str);
    }

    public List<File> n() {
        return u(this.f16313d.listFiles());
    }

    public File p(String str, String str2) {
        return new File(o(str), str2);
    }

    public List<File> q(String str, FilenameFilter filenameFilter) {
        return u(o(str).listFiles(filenameFilter));
    }
}
