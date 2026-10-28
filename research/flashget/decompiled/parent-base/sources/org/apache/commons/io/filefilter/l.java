package org.apache.commons.io.filefilter;

import androidx.collection.r2;
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
/* loaded from: classes4.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final n f85382a;

    /* renamed from: b, reason: collision with root package name */
    private static final n f85383b;

    static {
        n nVar = h.f85375b;
        f85382a = new q(g(nVar, C("CVS")));
        f85383b = new q(g(nVar, C(".svn")));
    }

    public static n A(n nVar) {
        return nVar == null ? k.f85381b : new c(k.f85381b, nVar);
    }

    public static n B(n nVar) {
        return nVar == null ? f85383b : g(nVar, f85383b);
    }

    public static n C(String str) {
        return new p(str, (org.apache.commons.io.l) null);
    }

    public static n D(String str, org.apache.commons.io.l lVar) {
        return new p(str, lVar);
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

    public static n I(String str, org.apache.commons.io.l lVar) {
        return new s(str, lVar);
    }

    public static n J(long j4) {
        return new u(j4, true);
    }

    public static n K(long j4, boolean z4) {
        return new u(j4, z4);
    }

    public static n L(long j4, long j5) {
        return new c(new u(j4, true), new u(j5 + 1, false));
    }

    public static n M(String str) {
        return new v(str);
    }

    public static n N(String str, org.apache.commons.io.l lVar) {
        return new v(str, lVar);
    }

    public static List<n> O(n... nVarArr) {
        if (nVarArr == null) {
            throw new IllegalArgumentException("The filters must not be null");
        }
        ArrayList arrayList = new ArrayList(nVarArr.length);
        for (int i4 = 0; i4 < nVarArr.length; i4++) {
            n nVar = nVarArr[i4];
            if (nVar == null) {
                throw new IllegalArgumentException(r2.a("The filter[", i4, "] is null"));
            }
            arrayList.add(nVar);
        }
        return arrayList;
    }

    public static n P() {
        return w.f85400b;
    }

    public static n a(long j4) {
        return new b(j4, true);
    }

    public static n b(long j4, boolean z4) {
        return new b(j4, z4);
    }

    public static n c(File file) {
        return new b(file, true);
    }

    public static n d(File file, boolean z4) {
        return new b(file, z4);
    }

    public static n e(Date date) {
        return new b(date, true);
    }

    public static n f(Date date, boolean z4) {
        return new b(date, z4);
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
        return h.f85375b;
    }

    public static n l() {
        return j.f85379b;
    }

    public static n m() {
        return k.f85381b;
    }

    private static <T extends Collection<File>> T n(n nVar, Iterable<File> iterable, T t4) {
        if (nVar == null) {
            throw new IllegalArgumentException("file filter is null");
        }
        if (iterable != null) {
            for (File file : iterable) {
                if (file == null) {
                    throw new IllegalArgumentException("file collection contains null");
                }
                if (nVar.accept(file)) {
                    t4.add(file);
                }
            }
        }
        return t4;
    }

    public static File[] o(n nVar, Iterable<File> iterable) {
        List<File> q4 = q(nVar, iterable);
        return (File[]) q4.toArray(new File[q4.size()]);
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

    public static n v(String str, long j4) {
        return new o(str, j4);
    }

    public static n w(byte[] bArr) {
        return new o(bArr);
    }

    public static n x(byte[] bArr, long j4) {
        return new o(bArr, j4);
    }

    public static n y(n nVar) {
        return nVar == null ? f85382a : g(nVar, f85382a);
    }

    public static n z(n nVar) {
        return nVar == null ? h.f85375b : new c(h.f85375b, nVar);
    }
}
