package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: CanReadFileFilter.java */
/* loaded from: classes6.dex */
public class d extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final n f31868o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f31869p;

    /* renamed from: q, reason: collision with root package name */
    public static final n f31870q;

    static {
        d dVar = new d();
        f31868o = dVar;
        f31869p = new q(dVar);
        f31870q = new c(dVar, e.f31872p);
    }

    protected d() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.canRead();
    }
}
