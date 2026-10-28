package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: LastModifiedFileComparator.java */
/* loaded from: classes6.dex */
public class f extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final Comparator<File> f31834o;

    /* renamed from: p, reason: collision with root package name */
    public static final Comparator<File> f31835p;

    static {
        f fVar = new f();
        f31834o = fVar;
        f31835p = new i(fVar);
    }

    @Override // org.apache.commons.io.comparator.a
    public List a(List list) {
        if (list != null) {
            Collections.sort(list, this);
        }
        return list;
    }

    @Override // org.apache.commons.io.comparator.a
    public File[] b(File[] fileArr) {
        if (fileArr != null) {
            Arrays.sort(fileArr, this);
        }
        return fileArr;
    }

    @Override // java.util.Comparator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        long lastModified = file.lastModified() - file2.lastModified();
        if (lastModified < 0) {
            return -1;
        }
        return lastModified > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
