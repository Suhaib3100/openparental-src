package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: CanWriteFileFilter.java */
/* loaded from: classes4.dex */
public class e extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85371b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f85372c;

    static {
        e eVar = new e();
        f85371b = eVar;
        f85372c = new q(eVar);
    }

    protected e() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.canWrite();
    }
}
