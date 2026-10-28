package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: TrueFileFilter.java */
/* loaded from: classes4.dex */
public class w implements n, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85400b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f85401c;

    static {
        w wVar = new w();
        f85400b = wVar;
        f85401c = wVar;
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
