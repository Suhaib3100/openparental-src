package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: EmptyFileFilter.java */
/* loaded from: classes6.dex */
public class i extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final n f31877o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f31878p;

    static {
        i iVar = new i();
        f31877o = iVar;
        f31878p = new q(iVar);
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
