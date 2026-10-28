package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* compiled from: DelegateFileFilter.java */
/* loaded from: classes6.dex */
public class g extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final FilenameFilter f31873o;

    /* renamed from: p, reason: collision with root package name */
    private final FileFilter f31874p;

    public g(FilenameFilter filenameFilter) {
        if (filenameFilter == null) {
            throw new IllegalArgumentException("The FilenameFilter must not be null");
        }
        this.f31873o = filenameFilter;
        this.f31874p = null;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        FileFilter fileFilter = this.f31874p;
        return fileFilter != null ? fileFilter.accept(file) : super.accept(file);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        Object obj = this.f31874p;
        if (obj == null) {
            obj = this.f31873o;
        }
        return super.toString() + "(" + obj.toString() + ")";
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FilenameFilter filenameFilter = this.f31873o;
        if (filenameFilter != null) {
            return filenameFilter.accept(file, str);
        }
        return super.accept(file, str);
    }

    public g(FileFilter fileFilter) {
        if (fileFilter != null) {
            this.f31874p = fileFilter;
            this.f31873o = null;
            return;
        }
        throw new IllegalArgumentException("The FileFilter must not be null");
    }
}
