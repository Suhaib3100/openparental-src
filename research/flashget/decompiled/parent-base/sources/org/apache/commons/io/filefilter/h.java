package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: DirectoryFileFilter.java */
/* loaded from: classes4.dex */
public class h extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85375b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f85376c;

    static {
        h hVar = new h();
        f85375b = hVar;
        f85376c = hVar;
    }

    protected h() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.isDirectory();
    }
}
