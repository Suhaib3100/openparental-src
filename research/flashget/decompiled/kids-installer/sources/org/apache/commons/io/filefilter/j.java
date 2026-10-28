package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: FalseFileFilter.java */
/* loaded from: classes6.dex */
public class j implements n, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final n f31879o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f31880p;

    static {
        j jVar = new j();
        f31879o = jVar;
        f31880p = jVar;
    }

    protected j() {
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }
}
