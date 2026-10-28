package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: FalseFileFilter.java */
/* loaded from: classes4.dex */
public class j implements n, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85379b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f85380c;

    static {
        j jVar = new j();
        f85379b = jVar;
        f85380c = jVar;
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
