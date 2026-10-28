package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: TrueFileFilter.java */
/* loaded from: classes6.dex */
public class w implements n, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final n f31900o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f31901p;

    static {
        w wVar = new w();
        f31900o = wVar;
        f31901p = wVar;
    }

    protected w() {
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }
}
