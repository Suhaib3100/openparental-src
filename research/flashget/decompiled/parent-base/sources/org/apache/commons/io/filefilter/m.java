package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: HiddenFileFilter.java */
/* loaded from: classes4.dex */
public class m extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85384b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f85385c;

    static {
        m mVar = new m();
        f85384b = mVar;
        f85385c = new q(mVar);
    }

    protected m() {
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        return file.isHidden();
    }
}
