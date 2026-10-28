package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: DirectoryFileComparator.java */
/* loaded from: classes4.dex */
public class d extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator<File> f85325b;

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f85326c;

    static {
        d dVar = new d();
        f85325b = dVar;
        f85326c = new i(dVar);
    }

    private int g(File file) {
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
    public File[] d(File[] fileArr) {
        if (fileArr != null) {
            Arrays.sort(fileArr, this);
        }
        return fileArr;
    }

    @Override // java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        return g(file) - g(file2);
    }

    @Override // org.apache.commons.io.comparator.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
