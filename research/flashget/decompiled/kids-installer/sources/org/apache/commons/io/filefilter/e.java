package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: CanWriteFileFilter.java */
/* loaded from: classes6.dex */
public class e extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final n f31871o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f31872p;

    static {
        e eVar = new e();
        f31871o = eVar;
        f31872p = new q(eVar);
    }

    protected e() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.canWrite();
    }
}
