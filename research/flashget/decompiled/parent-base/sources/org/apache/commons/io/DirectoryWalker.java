package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.filefilter.w;

/* loaded from: classes4.dex */
public abstract class DirectoryWalker<T> {

    /* renamed from: a, reason: collision with root package name */
    private final FileFilter f85297a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85298b;

    public static class CancelException extends IOException {

        /* renamed from: d, reason: collision with root package name */
        private static final long f85299d = 1347339620135041008L;

        /* renamed from: b, reason: collision with root package name */
        private final File f85300b;

        /* renamed from: c, reason: collision with root package name */
        private final int f85301c;

        public CancelException(File file, int i4) {
            this("Operation Cancelled", file, i4);
        }

        public int a() {
            return this.f85301c;
        }

        public File b() {
            return this.f85300b;
        }

        public CancelException(String str, File file, int i4) {
            super(str);
            this.f85300b = file;
            this.f85301c = i4;
        }
    }

    protected DirectoryWalker() {
        this(null, -1);
    }

    private void l(File file, int i4, Collection<T> collection) throws IOException {
        a(file, i4, collection);
        if (d(file, i4, collection)) {
            f(file, i4, collection);
            int i5 = i4 + 1;
            int i6 = this.f85298b;
            if (i6 < 0 || i5 <= i6) {
                a(file, i4, collection);
                FileFilter fileFilter = this.f85297a;
                File[] b5 = b(file, i4, fileFilter == null ? file.listFiles() : file.listFiles(fileFilter));
                if (b5 == null) {
                    j(file, i5, collection);
                } else {
                    for (File file2 : b5) {
                        if (file2.isDirectory()) {
                            l(file2, i5, collection);
                        } else {
                            a(file2, i5, collection);
                            h(file2, i5, collection);
                            a(file2, i5, collection);
                        }
                    }
                }
            }
            e(file, i4, collection);
        }
        a(file, i4, collection);
    }

    protected final void a(File file, int i4, Collection<T> collection) throws IOException {
        if (i(file, i4, collection)) {
            throw new CancelException(file, i4);
        }
    }

    protected File[] b(File file, int i4, File[] fileArr) throws IOException {
        return fileArr;
    }

    protected void c(File file, Collection<T> collection, CancelException cancelException) throws IOException {
        throw cancelException;
    }

    protected boolean d(File file, int i4, Collection<T> collection) throws IOException {
        return true;
    }

    protected void e(File file, int i4, Collection<T> collection) throws IOException {
    }

    protected void f(File file, int i4, Collection<T> collection) throws IOException {
    }

    protected void g(Collection<T> collection) throws IOException {
    }

    protected void h(File file, int i4, Collection<T> collection) throws IOException {
    }

    protected boolean i(File file, int i4, Collection<T> collection) throws IOException {
        return false;
    }

    protected void j(File file, int i4, Collection<T> collection) throws IOException {
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
        } catch (CancelException e4) {
            c(file, collection, e4);
        }
    }

    protected DirectoryWalker(FileFilter fileFilter, int i4) {
        this.f85297a = fileFilter;
        this.f85298b = i4;
    }

    protected DirectoryWalker(org.apache.commons.io.filefilter.n nVar, org.apache.commons.io.filefilter.n nVar2, int i4) {
        if (nVar == null && nVar2 == null) {
            this.f85297a = null;
        } else {
            this.f85297a = org.apache.commons.io.filefilter.l.F(org.apache.commons.io.filefilter.l.z(nVar == null ? w.f85400b : nVar), org.apache.commons.io.filefilter.l.A(nVar2 == null ? w.f85400b : nVar2));
        }
        this.f85298b = i4;
    }
}
