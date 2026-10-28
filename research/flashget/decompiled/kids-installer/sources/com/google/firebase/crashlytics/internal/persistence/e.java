package com.google.firebase.crashlytics.internal.persistence;

import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.common.m;
import com.google.firebase.crashlytics.internal.common.w;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.crashlytics.internal.metadata.n;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.settings.j;
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
/* loaded from: classes2.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    private static final int f16287f = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final int f16291j = 10;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f16299a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final f f16300b;

    /* renamed from: c, reason: collision with root package name */
    private final j f16301c;

    /* renamed from: d, reason: collision with root package name */
    private final m f16302d;

    /* renamed from: g, reason: collision with root package name */
    private static final String f16288g = ProtectedSandApp.s("ᖈ");

    /* renamed from: h, reason: collision with root package name */
    private static final String f16289h = ProtectedSandApp.s("ᖉ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f16290i = ProtectedSandApp.s("ᖊ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f16292k = ProtectedSandApp.s("ᖋ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f16294m = ProtectedSandApp.s("ᖌ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f16295n = "";

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f16286e = Charset.forName(ProtectedSandApp.s("ᖍ"));

    /* renamed from: l, reason: collision with root package name */
    private static final int f16293l = 15;

    /* renamed from: o, reason: collision with root package name */
    private static final com.google.firebase.crashlytics.internal.model.serialization.j f16296o = new com.google.firebase.crashlytics.internal.model.serialization.j();

    /* renamed from: p, reason: collision with root package name */
    private static final Comparator<? super File> f16297p = new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u5;
            u5 = e.u((File) obj, (File) obj2);
            return u5;
        }
    };

    /* renamed from: q, reason: collision with root package name */
    private static final FilenameFilter f16298q = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.d
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v5;
            v5 = e.v(file, str);
            return v5;
        }
    };

    public e(f fVar, j jVar, m mVar) {
        this.f16300b = fVar;
        this.f16301c = jVar;
        this.f16302d = mVar;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f16286e);
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

    private void C(@o0 File file, @o0 f0.e eVar, @o0 String str, f0.a aVar) {
        String d6 = this.f16302d.d(str);
        try {
            com.google.firebase.crashlytics.internal.model.serialization.j jVar = f16296o;
            G(this.f16300b.h(str), jVar.O(jVar.N(B(file)).t(eVar).q(aVar).p(d6)));
        } catch (IOException e6) {
            g.f().n(ProtectedSandApp.s("ᖎ") + file, e6);
        }
    }

    private void D(String str, long j5) {
        boolean z5;
        List<File> q5 = this.f16300b.q(str, f16298q);
        if (q5.isEmpty()) {
            g.f().k(ProtectedSandApp.s("ᖏ") + str + ProtectedSandApp.s("ᖐ"));
            return;
        }
        Collections.sort(q5);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z5 = false;
            for (File file : q5) {
                try {
                    arrayList.add(f16296o.l(B(file)));
                } catch (IOException e6) {
                    g.f().n(ProtectedSandApp.s("ᖑ") + file, e6);
                }
                if (z5 || s(file.getName())) {
                    z5 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            E(this.f16300b.p(str, ProtectedSandApp.s("ᖓ")), arrayList, j5, z5, n.m(str, this.f16300b), this.f16302d.d(str));
        } else {
            g.f().m(ProtectedSandApp.s("ᖒ") + str);
        }
    }

    private void E(@o0 File file, @o0 List<f0.f.d> list, long j5, boolean z5, @q0 String str, @q0 String str2) {
        String s5 = ProtectedSandApp.s("ᖔ");
        try {
            com.google.firebase.crashlytics.internal.model.serialization.j jVar = f16296o;
            f0 r5 = jVar.N(B(file)).v(j5, z5, str).p(str2).r(list);
            f0.f m5 = r5.m();
            if (m5 == null) {
                return;
            }
            g.f().b(s5 + str2);
            G(z5 ? this.f16300b.k(m5.i()) : this.f16300b.m(m5.i()), jVar.O(r5));
        } catch (IOException e6) {
            g.f().n(ProtectedSandApp.s("ᖕ") + file, e6);
        }
    }

    private int F(String str, int i5) {
        List<File> q5 = this.f16300b.q(str, new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.persistence.a
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t5;
                t5 = e.t(file, str2);
                return t5;
            }
        });
        Collections.sort(q5, new Comparator() { // from class: com.google.firebase.crashlytics.internal.persistence.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x5;
                x5 = e.x((File) obj, (File) obj2);
                return x5;
            }
        });
        return f(q5, i5);
    }

    private static void G(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f16286e);
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

    private static void H(File file, String str, long j5) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f16286e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(j5 * 1000);
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
        this.f16300b.b();
        SortedSet<String> p5 = p();
        if (str != null) {
            p5.remove(str);
        }
        if (p5.size() <= 8) {
            return p5;
        }
        while (p5.size() > 8) {
            String last = p5.last();
            g.f().b(ProtectedSandApp.s("ᖖ") + last);
            this.f16300b.d(last);
            p5.remove(last);
        }
        return p5;
    }

    private static int f(List<File> list, int i5) {
        int size = list.size();
        for (File file : list) {
            if (size <= i5) {
                return size;
            }
            f.t(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i5 = this.f16301c.b().f16368a.f16380b;
        List<File> n5 = n();
        int size = n5.size();
        if (size <= i5) {
            return;
        }
        Iterator<File> it = n5.subList(i5, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j5) {
        return j5 * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    @o0
    private static String m(int i5, boolean z5) {
        return androidx.constraintlayout.solver.widgets.analyzer.e.a(ProtectedSandApp.s("ᖙ"), String.format(Locale.US, ProtectedSandApp.s("ᖗ"), Integer.valueOf(i5)), z5 ? ProtectedSandApp.s("ᖘ") : "");
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f16300b.l());
        arrayList.addAll(this.f16300b.i());
        Comparator<? super File> comparator = f16297p;
        Collections.sort(arrayList, comparator);
        List<File> n5 = this.f16300b.n();
        Collections.sort(n5, comparator);
        arrayList.addAll(n5);
        return arrayList;
    }

    @o0
    private static String o(@o0 String str) {
        return str.substring(0, f16293l);
    }

    private static boolean s(@o0 String str) {
        return str.startsWith(ProtectedSandApp.s("ᖚ")) && str.endsWith(ProtectedSandApp.s("ᖛ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@o0 File file, @o0 String str) {
        return str.startsWith(ProtectedSandApp.s("ᖜ")) && !str.endsWith(ProtectedSandApp.s("ᖝ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith(ProtectedSandApp.s("ᖞ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(@o0 File file, @o0 File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void A(@o0 f0 f0Var) {
        f0.f m5 = f0Var.m();
        if (m5 == null) {
            g.f().b(ProtectedSandApp.s("ᖟ"));
            return;
        }
        String i5 = m5.i();
        try {
            G(this.f16300b.p(i5, ProtectedSandApp.s("ᖠ")), f16296o.O(f0Var));
            H(this.f16300b.p(i5, ProtectedSandApp.s("ᖡ")), "", m5.l());
        } catch (IOException e6) {
            g.f().c(ProtectedSandApp.s("ᖢ") + i5, e6);
        }
    }

    public void i() {
        j(this.f16300b.n());
        j(this.f16300b.l());
        j(this.f16300b.i());
    }

    public void k(@q0 String str, long j5) {
        for (String str2 : e(str)) {
            g.f().k(ProtectedSandApp.s("ᖣ") + str2);
            D(str2, j5);
            this.f16300b.d(str2);
        }
        g();
    }

    public void l(String str, f0.e eVar, f0.a aVar) {
        File p5 = this.f16300b.p(str, ProtectedSandApp.s("ᖤ"));
        g.f().b(ProtectedSandApp.s("ᖥ") + str + ProtectedSandApp.s("ᖦ") + p5);
        C(p5, eVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.f16300b.e()).descendingSet();
    }

    public long q(String str) {
        return this.f16300b.p(str, ProtectedSandApp.s("ᖧ")).lastModified();
    }

    public boolean r() {
        return (this.f16300b.n().isEmpty() && this.f16300b.l().isEmpty() && this.f16300b.i().isEmpty()) ? false : true;
    }

    @o0
    public List<w> w() {
        List<File> n5 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n5) {
            try {
                arrayList.add(w.a(f16296o.N(B(file)), file.getName(), file));
            } catch (IOException e6) {
                g.f().n(ProtectedSandApp.s("ᖨ") + file + ProtectedSandApp.s("ᖩ"), e6);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(@o0 f0.f.d dVar, @o0 String str) {
        z(dVar, str, false);
    }

    public void z(@o0 f0.f.d dVar, @o0 String str, boolean z5) {
        int i5 = this.f16301c.b().f16368a.f16379a;
        try {
            G(this.f16300b.p(str, m(this.f16299a.getAndIncrement(), z5)), f16296o.m(dVar));
        } catch (IOException e6) {
            g.f().n(ProtectedSandApp.s("ᖪ") + str, e6);
        }
        F(str, i5);
    }
}
