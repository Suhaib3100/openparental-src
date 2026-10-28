package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: NotFileFilter.java */
/* loaded from: classes4.dex */
public class q extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final n f85391b;

    public q(n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.f85391b = nVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return !this.f85391b.accept(file);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + this.f85391b.toString() + ")";
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return !this.f85391b.accept(file, str);
    }
}
