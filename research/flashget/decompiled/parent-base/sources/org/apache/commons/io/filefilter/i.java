package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: EmptyFileFilter.java */
/* loaded from: classes4.dex */
public class i extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85377b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f85378c;

    static {
        i iVar = new i();
        f85377b = iVar;
        f85378c = new q(iVar);
    }

    protected i() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (!file.isDirectory()) {
            return file.length() == 0;
        }
        File[] listFiles = file.listFiles();
        return listFiles == null || listFiles.length == 0;
    }
}
