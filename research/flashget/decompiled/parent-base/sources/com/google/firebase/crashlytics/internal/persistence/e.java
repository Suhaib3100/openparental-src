package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.f0;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.metadata.o;
import com.google.firebase.crashlytics.internal.model.g0;
import com.google.firebase.crashlytics.internal.model.serialization.j;
import com.google.firebase.crashlytics.internal.settings.k;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CrashlyticsReportPersistence.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private static final int f59410f = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final int f59414j = 10;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f59422a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final g f59423b;

    /* renamed from: c, reason: collision with root package name */
    private final k f59424c;

    /* renamed from: d, reason: collision with root package name */
    private final m f59425d;

    /* renamed from: g, reason: collision with root package name */
    private static final String f59411g = ProtectedSandApp.s("ｳ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f59412h = ProtectedSandApp.s("ｴ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f59413i = ProtectedSandApp.s("ｵ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f59415k = ProtectedSandApp.s("ｶ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f59417m = ProtectedSandApp.s("ｷ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f59418n = "";

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f59409e = Charset.forName(ProtectedSandApp.s("ｸ"));

    /* renamed from: l, reason: collision with root package name */
    private static final int f59416l = 15;

    /* renamed from: o, reason: collision with root package name */
    private static final j f59419o = new j();

    /* renamed from: p, reason: collision with root package name */
    private static final Comparator<? super File> f59420p = new a();

    /* renamed from: q, reason: collision with root package name */
    private static final FilenameFilter f59421q = new b();

    public e(g gVar, k kVar, m mVar) {
        this.f59423b = gVar;
        this.f59424c = kVar;
        this.f59425d = mVar;
    }

    @o0
    private static String B(@o0 File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f59409e);
                    fileInputStream.close();
                    return str;
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
    }

    private void C(@o0 File file, @o0 g0.e eVar, @o0 String str, g0.a aVar) {
        String d5 = this.f59425d.d(str);
        try {
            j jVar = f59419o;
            G(this.f59423b.j(str), jVar.O(jVar.N(B(file)).v(eVar).r(aVar).q(d5)));
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ｹ") + file, e4);
        }
    }

    private void D(String str, long j4) {
        boolean z4;
        List<File> s4 = this.f59423b.s(str, f59421q);
        if (s4.isEmpty()) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ｺ") + str + ProtectedSandApp.s("ｻ"));
            return;
        }
        Collections.sort(s4);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z4 = false;
            for (File file : s4) {
                try {
                    arrayList.add(f59419o.l(B(file)));
                } catch (IOException e4) {
                    com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ｼ") + file, e4);
                }
                if (z4 || s(file.getName())) {
                    z4 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            E(this.f59423b.r(str, ProtectedSandApp.s("ｳ")), arrayList, j4, z4, o.n(str, this.f59423b), this.f59425d.d(str));
        } else {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ｽ") + str);
        }
    }

    private void E(@o0 File file, @o0 List<g0.f.d> list, long j4, boolean z4, @q0 String str, @q0 String str2) {
        String s4 = ProtectedSandApp.s("ｾ");
        try {
            j jVar = f59419o;
            g0 s5 = jVar.N(B(file)).x(j4, z4, str).q(str2).s(list);
            g0.f n4 = s5.n();
            if (n4 == null) {
                return;
            }
            com.google.firebase.crashlytics.internal.g.f().b(s4 + str2);
            G(z4 ? this.f59423b.m(n4.i()) : this.f59423b.o(n4.i()), jVar.O(s5));
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ｿ") + file, e4);
        }
    }

    private int F(String str, int i4) {
        List<File> s4 = this.f59423b.s(str, new c());
        Collections.sort(s4, new d());
        return f(s4, i4);
    }

    private static void G(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f59409e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void H(File file, String str, long j4) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f59409e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(j4 * 1000);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> e(@q0 String str) {
        this.f59423b.d();
        SortedSet<String> p4 = p();
        if (str != null) {
            p4.remove(str);
        }
        if (p4.size() <= 8) {
            return p4;
        }
        while (p4.size() > 8) {
            String last = p4.last();
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﾀ") + last);
            this.f59423b.f(last);
            p4.remove(last);
        }
        return p4;
    }

    private static int f(List<File> list, int i4) {
        int size = list.size();
        for (File file : list) {
            if (size <= i4) {
                return size;
            }
            g.w(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i4 = this.f59424c.b().f59494a.f59506b;
        List<File> n4 = n();
        int size = n4.size();
        if (size <= i4) {
            return;
        }
        Iterator<File> it = n4.subList(i4, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j4) {
        return j4 * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @o0
    private static String m(int i4, boolean z4) {
        return android.support.v4.media.d.a(ProtectedSandApp.s("ｵ"), String.format(Locale.US, ProtectedSandApp.s("ｶ"), Integer.valueOf(i4)), z4 ? ProtectedSandApp.s("ｷ") : "");
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f59423b.n());
        arrayList.addAll(this.f59423b.k());
        Comparator<? super File> comparator = f59420p;
        Collections.sort(arrayList, comparator);
        List<File> p4 = this.f59423b.p();
        Collections.sort(p4, comparator);
        arrayList.addAll(p4);
        return arrayList;
    }

    @o0
    private static String o(@o0 String str) {
        return str.substring(0, f59416l);
    }

    private static boolean s(@o0 String str) {
        return str.startsWith(ProtectedSandApp.s("ｵ")) && str.endsWith(ProtectedSandApp.s("ｷ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@o0 File file, @o0 String str) {
        return str.startsWith(ProtectedSandApp.s("ｵ")) && !str.endsWith(ProtectedSandApp.s("ｷ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(@o0 File file, @o0 File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void A(@o0 g0 g0Var) {
        g0.f n4 = g0Var.n();
        if (n4 == null) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﾁ"));
            return;
        }
        String i4 = n4.i();
        try {
            G(this.f59423b.r(i4, ProtectedSandApp.s("ｳ")), f59419o.O(g0Var));
            H(this.f59423b.r(i4, ProtectedSandApp.s("ｴ")), "", n4.l());
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().c(ProtectedSandApp.s("ﾂ") + i4, e4);
        }
    }

    public void i() {
        j(this.f59423b.p());
        j(this.f59423b.n());
        j(this.f59423b.k());
    }

    public void k(@q0 String str, long j4) {
        for (String str2 : e(str)) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﾃ") + str2);
            D(str2, j4);
            this.f59423b.f(str2);
        }
        g();
    }

    public void l(String str, g0.e eVar, g0.a aVar) {
        File r4 = this.f59423b.r(str, ProtectedSandApp.s("ｳ"));
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﾄ") + str + ProtectedSandApp.s("ﾅ") + r4);
        C(r4, eVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f59423b.g()).descendingSet();
    }

    public long q(String str) {
        return this.f59423b.r(str, ProtectedSandApp.s("ｴ")).lastModified();
    }

    public boolean r() {
        return (this.f59423b.p().isEmpty() && this.f59423b.n().isEmpty() && this.f59423b.k().isEmpty()) ? false : true;
    }

    @o0
    public List<f0> w() {
        List<File> n4 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n4) {
            try {
                arrayList.add(f0.a(f59419o.N(B(file)), file.getName(), file));
            } catch (IOException e4) {
                com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﾆ") + file + ProtectedSandApp.s("ﾇ"), e4);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(@o0 g0.f.d dVar, @o0 String str) {
        z(dVar, str, false);
    }

    public void z(@o0 g0.f.d dVar, @o0 String str, boolean z4) {
        int i4 = this.f59424c.b().f59494a.f59505a;
        try {
            G(this.f59423b.r(str, m(this.f59422a.getAndIncrement(), z4)), f59419o.m(dVar));
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﾈ") + str, e4);
        }
        F(str, i4);
    }
}
