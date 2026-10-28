package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: DirectoryFileComparator.java */
/* loaded from: classes6.dex */
public class d extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final Comparator<File> f31825o;

    /* renamed from: p, reason: collision with root package name */
    public static final Comparator<File> f31826p;

    static {
        d dVar = new d();
        f31825o = dVar;
        f31826p = new i(dVar);
    }

    private int d(File file) {
        return file.isDirectory() ? 1 : 2;
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
        return d(file) - d(file2);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
