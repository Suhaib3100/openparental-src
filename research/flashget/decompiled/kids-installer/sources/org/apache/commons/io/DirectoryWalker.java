package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.filefilter.w;

/* loaded from: classes5.dex */
public abstract class DirectoryWalker<T> {

    /* renamed from: a, reason: collision with root package name */
    private final FileFilter f31797a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31798b;

    public static class CancelException extends IOException {

        /* renamed from: q, reason: collision with root package name */
        private static final long f31799q = 1347339620135041008L;

        /* renamed from: o, reason: collision with root package name */
        private final File f31800o;

        /* renamed from: p, reason: collision with root package name */
        private final int f31801p;

        public CancelException(File file, int i5) {
            this("Operation Cancelled", file, i5);
        }

        public int a() {
            return this.f31801p;
        }

        public File b() {
            return this.f31800o;
        }

        public CancelException(String str, File file, int i5) {
            super(str);
            this.f31800o = file;
            this.f31801p = i5;
        }
    }

    protected DirectoryWalker() {
        this(null, -1);
    }

    private void l(File file, int i5, Collection<T> collection) throws IOException {
        a(file, i5, collection);
        if (d(file, i5, collection)) {
            f(file, i5, collection);
            int i6 = i5 + 1;
            int i7 = this.f31798b;
            if (i7 < 0 || i6 <= i7) {
                a(file, i5, collection);
                FileFilter fileFilter = this.f31797a;
                File[] b6 = b(file, i5, fileFilter == null ? file.listFiles() : file.listFiles(fileFilter));
                if (b6 == null) {
                    j(file, i6, collection);
                } else {
                    for (File file2 : b6) {
                        if (file2.isDirectory()) {
                            l(file2, i6, collection);
                        } else {
                            a(file2, i6, collection);
                            h(file2, i6, collection);
                            a(file2, i6, collection);
                        }
                    }
                }
            }
            e(file, i5, collection);
        }
        a(file, i5, collection);
    }

    protected final void a(File file, int i5, Collection<T> collection) throws IOException {
        if (i(file, i5, collection)) {
            throw new CancelException(file, i5);
        }
    }

    protected File[] b(File file, int i5, File[] fileArr) throws IOException {
        return fileArr;
    }

    protected void c(File file, Collection<T> collection, CancelException cancelException) throws IOException {
        throw cancelException;
    }

    protected boolean d(File file, int i5, Collection<T> collection) throws IOException {
        return true;
    }

    protected void e(File file, int i5, Collection<T> collection) throws IOException {
    }

    protected void f(File file, int i5, Collection<T> collection) throws IOException {
    }

    protected void g(Collection<T> collection) throws IOException {
    }

    protected void h(File file, int i5, Collection<T> collection) throws IOException {
    }

    protected boolean i(File file, int i5, Collection<T> collection) throws IOException {
        return false;
    }

    protected void j(File file, int i5, Collection<T> collection) throws IOException {
    }

    protected void k(File file, Collection<T> collection) throws IOException {
    }

    protected final void m(File file, Collection<T> collection) throws IOException {
        if (file == null) {
            throw new NullPointerException("Start Directory is null");
        }
        try {
            k(file, collection);
            l(file, 0, collection);
            g(collection);
        } catch (CancelException e6) {
            c(file, collection, e6);
        }
    }

    protected DirectoryWalker(FileFilter fileFilter, int i5) {
        this.f31797a = fileFilter;
        this.f31798b = i5;
    }

    protected DirectoryWalker(org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2, int i5) {
        if (nVar == null && nVar2 == null) {
            this.f31797a = null;
        } else {
            this.f31797a = org.apache.commons.io.filefilter.l.F(org.apache.commons.io.filefilter.l.z(nVar == null ? w.f31900o : nVar), org.apache.commons.io.filefilter.l.A(nVar2 == null ? w.f31900o : nVar2));
        }
        this.f31798b = i5;
    }
}
