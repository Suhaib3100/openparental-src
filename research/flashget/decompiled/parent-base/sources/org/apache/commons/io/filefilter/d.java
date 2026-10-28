package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: CanReadFileFilter.java */
/* loaded from: classes4.dex */
public class d extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85368b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f85369c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f85370d;

    static {
        d dVar = new d();
        f85368b = dVar;
        f85369c = new q(dVar);
        f85370d = new c(dVar, e.f85372c);
    }

    protected d() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.canRead();
    }
}
