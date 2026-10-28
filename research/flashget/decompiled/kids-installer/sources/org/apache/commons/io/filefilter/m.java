package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: HiddenFileFilter.java */
/* loaded from: classes6.dex */
public class m extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final n f31884o;

    /* renamed from: p, reason: collision with root package name */
    public static final n f31885p;

    static {
        m mVar = new m();
        f31884o = mVar;
        f31885p = new q(mVar);
    }

    protected m() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.isHidden();
    }
}
