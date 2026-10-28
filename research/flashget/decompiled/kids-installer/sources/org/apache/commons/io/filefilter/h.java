package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: DirectoryFileFilter.java */
/* loaded from: classes6.dex */
public class h extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final n f31875o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f31876p;

    static {
        h hVar = new h();
        f31875o = hVar;
        f31876p = hVar;
    }

    protected h() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
