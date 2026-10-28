package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* compiled from: DelegateFileFilter.java */
/* loaded from: classes4.dex */
public class g extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final FilenameFilter f85373b;

    /* renamed from: c, reason: collision with root package name */
    private final FileFilter f85374c;

    public g(FilenameFilter filenameFilter) {
        if (filenameFilter == null) {
            throw new IllegalArgumentException("The FilenameFilter must not be null");
        }
        this.f85373b = filenameFilter;
        this.f85374c = null;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        FileFilter fileFilter = this.f85374c;
        return fileFilter != null ? fileFilter.accept(file) : super.accept(file);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        Object obj = this.f85374c;
        if (obj == null) {
            obj = this.f85373b;
        }
        return androidx.fragment.app.c.a(new StringBuilder(), super.toString(), "(", obj.toString(), ")");
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FilenameFilter filenameFilter = this.f85373b;
        if (filenameFilter != null) {
            return filenameFilter.accept(file, str);
        }
        return super.accept(file, str);
    }

    public g(FileFilter fileFilter) {
        if (fileFilter != null) {
            this.f85374c = fileFilter;
            this.f85373b = null;
            return;
        }
        throw new IllegalArgumentException("The FileFilter must not be null");
    }
}
