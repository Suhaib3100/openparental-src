package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: NotFileFilter.java */
/* loaded from: classes6.dex */
public class q extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final n f31891o;

    public q(n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.f31891o = nVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return !this.f31891o.accept(file);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + this.f31891o.toString() + ")";
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.f31891o.accept(file, str);
    }
}
