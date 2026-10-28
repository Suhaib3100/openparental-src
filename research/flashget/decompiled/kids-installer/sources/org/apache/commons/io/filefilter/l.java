package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: FileFilterUtils.java */
/* loaded from: classes5.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final n f31882a;

    /* renamed from: b, reason: collision with root package name */
    private static final n f31883b;

    static {
        n nVar = h.f31875o;
        f31882a = new q(g(nVar, C("CVS")));
        f31883b = new q(g(nVar, C(".svn")));
    }

    public static n A(n nVar) {
        return nVar == null ? k.f31881o : new c(k.f31881o, nVar);
    }

    public static n B(n nVar) {
        return nVar == null ? f31883b : g(nVar, f31883b);
    }

    public static n C(String str) {
        return new p(str, (org.apache.commons.io.m) null);
    }

    public static n D(String str, org.apache.commons.io.m mVar) {
        return new p(str, mVar);
    }

    public static n E(n nVar) {
        return new q(nVar);
    }

    public static n F(n... nVarArr) {
        return new r(O(nVarArr));
    }

    @Deprecated
    public static n G(n nVar, n nVar2) {
        return new r(nVar, nVar2);
    }

    public static n H(String str) {
        return new s(str);
    }

    public static n I(String str, org.apache.commons.io.m mVar) {
        return new s(str, mVar);
    }

    public static n J(long j5) {
        return new u(j5, true);
    }

    public static n K(long j5, boolean z5) {
        return new u(j5, z5);
    }

    public static n L(long j5, long j6) {
        return new c(new u(j5, true), new u(j6 + 1, false));
    }

    public static n M(String str) {
        return new v(str);
    }

    public static n N(String str, org.apache.commons.io.m mVar) {
        return new v(str, mVar);
    }

    public static List<n> O(n... nVarArr) {
        if (nVarArr == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        ArrayList arrayList = new ArrayList(nVarArr.length);
        for (int i5 = 0; i5 < nVarArr.length; i5++) {
            n nVar = nVarArr[i5];
            if (nVar == null) {
                throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a("The filter[", i5, "] is null"));
            }
            arrayList.add(nVar);
        }
        return arrayList;
    }

    public static n P() {
        return w.f31900o;
    }

    public static n a(long j5) {
        return new b(j5, true);
    }

    public static n b(long j5, boolean z5) {
        return new b(j5, z5);
    }

    public static n c(File file) {
        return new b(file, true);
    }

    public static n d(File file, boolean z5) {
        return new b(file, z5);
    }

    public static n e(Date date) {
        return new b(date, true);
    }

    public static n f(Date date, boolean z5) {
        return new b(date, z5);
    }

    public static n g(n... nVarArr) {
        return new c(O(nVarArr));
    }

    @Deprecated
    public static n h(n nVar, n nVar2) {
        return new c(nVar, nVar2);
    }

    public static n i(FileFilter fileFilter) {
        return new g(fileFilter);
    }

    public static n j(FilenameFilter filenameFilter) {
        return new g(filenameFilter);
    }

    public static n k() {
        return h.f31875o;
    }

    public static n l() {
        return j.f31879o;
    }

    public static n m() {
        return k.f31881o;
    }

    private static <T extends Collection<File>> T n(n nVar, Iterable<File> iterable, T t5) {
        if (nVar == null) {
            throw new IllegalArgumentException("file filter is null");
        }
        if (iterable != null) {
            for (File file : iterable) {
                if (file == null) {
                    throw new IllegalArgumentException("file collection contains null");
                }
                if (nVar.accept(file)) {
                    t5.add(file);
                }
            }
        }
        return t5;
    }

    public static File[] o(n nVar, Iterable<File> iterable) {
        List<File> q5 = q(nVar, iterable);
        return (File[]) q5.toArray(new File[q5.size()]);
    }

    public static File[] p(n nVar, File... fileArr) {
        if (nVar == null) {
            throw new IllegalArgumentException("file filter is null");
        }
        if (fileArr == null) {
            return new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArr) {
            if (file == null) {
                throw new IllegalArgumentException("file array contains null");
            }
            if (nVar.accept(file)) {
                arrayList.add(file);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    public static List<File> q(n nVar, Iterable<File> iterable) {
        return (List) n(nVar, iterable, new ArrayList());
    }

    public static List<File> r(n nVar, File... fileArr) {
        return Arrays.asList(p(nVar, fileArr));
    }

    public static Set<File> s(n nVar, Iterable<File> iterable) {
        return (Set) n(nVar, iterable, new HashSet());
    }

    public static Set<File> t(n nVar, File... fileArr) {
        return new HashSet(Arrays.asList(p(nVar, fileArr)));
    }

    public static n u(String str) {
        return new o(str);
    }

    public static n v(String str, long j5) {
        return new o(str, j5);
    }

    public static n w(byte[] bArr) {
        return new o(bArr);
    }

    public static n x(byte[] bArr, long j5) {
        return new o(bArr, j5);
    }

    public static n y(n nVar) {
        return nVar == null ? f31882a : g(nVar, f31882a);
    }

    public static n z(n nVar) {
        return nVar == null ? h.f31875o : new c(h.f31875o, nVar);
    }
}
