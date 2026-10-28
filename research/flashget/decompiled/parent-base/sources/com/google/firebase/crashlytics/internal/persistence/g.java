package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import androidx.annotation.m1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: FileStore.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    private static final String f59427h = ProtectedSandApp.s("ﾊ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f59428i = ProtectedSandApp.s("ﾗ");

    /* renamed from: j, reason: collision with root package name */
    private static final String f59429j = ProtectedSandApp.s("ﾉ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f59430k = ProtectedSandApp.s("ﾋ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f59431l = ProtectedSandApp.s("ﾘ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f59432m = ProtectedSandApp.s("ﾌ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f59433n = ProtectedSandApp.s("ﾍ");

    /* renamed from: o, reason: collision with root package name */
    private static final String f59434o = ProtectedSandApp.s("ﾎ");

    /* renamed from: a, reason: collision with root package name */
    final String f59435a;

    /* renamed from: b, reason: collision with root package name */
    private final File f59436b;

    /* renamed from: c, reason: collision with root package name */
    private final File f59437c;

    /* renamed from: d, reason: collision with root package name */
    private final File f59438d;

    /* renamed from: e, reason: collision with root package name */
    private final File f59439e;

    /* renamed from: f, reason: collision with root package name */
    private final File f59440f;

    /* renamed from: g, reason: collision with root package name */
    private final File f59441g;

    public g(Context context) {
        String s4;
        String d5 = j.f58890a.g(context).d();
        this.f59435a = d5;
        File filesDir = context.getFilesDir();
        this.f59436b = filesDir;
        if (z()) {
            s4 = ProtectedSandApp.s("ﾉ") + File.separator + y(d5);
        } else {
            s4 = ProtectedSandApp.s("ﾊ");
        }
        File u4 = u(new File(filesDir, s4));
        this.f59437c = u4;
        this.f59438d = u(new File(u4, ProtectedSandApp.s("ﾋ")));
        this.f59439e = u(new File(u4, ProtectedSandApp.s("ﾌ")));
        this.f59440f = u(new File(u4, ProtectedSandApp.s("ﾍ")));
        this.f59441g = u(new File(u4, ProtectedSandApp.s("ﾎ")));
    }

    private void b(String str) {
        File file = new File(this.f59436b, str);
        if (file.exists() && w(file)) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﾏ") + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.f59436b.exists() || (list = this.f59436b.list(new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File q(String str) {
        File file = new File(this.f59438d, str);
        file.mkdirs();
        return file;
    }

    private static synchronized File u(File file) {
        String s4 = ProtectedSandApp.s("ﾐ");
        String s5 = ProtectedSandApp.s("ﾑ");
        synchronized (g.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    com.google.firebase.crashlytics.internal.g.f().b(s5 + file + ProtectedSandApp.s("ﾒ"));
                    file.delete();
                }
                if (!file.mkdirs()) {
                    com.google.firebase.crashlytics.internal.g.f().d(s4 + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File v(File file) {
        file.mkdirs();
        return file;
    }

    static boolean w(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                w(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> x(@q0 T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @m1
    static String y(String str) {
        return str.length() > 40 ? i.C(str) : str.replaceAll(ProtectedSandApp.s("ﾓ"), ProtectedSandApp.s("ﾔ"));
    }

    private boolean z() {
        return !this.f59435a.isEmpty();
    }

    public void d() {
        b(ProtectedSandApp.s("ﾕ"));
        b(ProtectedSandApp.s("ﾖ"));
        if (z()) {
            b(ProtectedSandApp.s("ﾊ"));
            c(ProtectedSandApp.s("ﾗ") + File.pathSeparator);
        }
    }

    @m1
    public void e() {
        w(this.f59437c);
    }

    public boolean f(String str) {
        return w(new File(this.f59438d, str));
    }

    public List<String> g() {
        return x(this.f59438d.list());
    }

    public File h(String str) {
        return new File(this.f59437c, str);
    }

    public List<File> i(FilenameFilter filenameFilter) {
        return x(this.f59437c.listFiles(filenameFilter));
    }

    public File j(String str) {
        return new File(this.f59441g, str);
    }

    public List<File> k() {
        return x(this.f59441g.listFiles());
    }

    public File l(String str) {
        File file = new File(q(str), ProtectedSandApp.s("ﾘ"));
        file.mkdirs();
        return file;
    }

    public File m(String str) {
        return new File(this.f59440f, str);
    }

    public List<File> n() {
        return x(this.f59440f.listFiles());
    }

    public File o(String str) {
        return new File(this.f59439e, str);
    }

    public List<File> p() {
        return x(this.f59439e.listFiles());
    }

    public File r(String str, String str2) {
        return new File(q(str), str2);
    }

    public List<File> s(String str, FilenameFilter filenameFilter) {
        return x(q(str).listFiles(filenameFilter));
    }
}
