package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: FileFileFilter.java */
/* loaded from: classes4.dex */
public class k extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85381b = new k();

    protected k() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.isFile();
    }
}
