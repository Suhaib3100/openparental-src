package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: SizeFileComparator.java */
/* loaded from: classes6.dex */
public class j extends a implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final Comparator<File> f31851p;

    /* renamed from: q, reason: collision with root package name */
    public static final Comparator<File> f31852q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator<File> f31853r;

    /* renamed from: s, reason: collision with root package name */
    public static final Comparator<File> f31854s;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f31855o;

    static {
        j jVar = new j();
        f31851p = jVar;
        f31852q = new i(jVar);
        j jVar2 = new j(true);
        f31853r = jVar2;
        f31854s = new i(jVar2);
    }

    public j() {
        this.f31855o = false;
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
        long w02 = (file.isDirectory() ? (this.f31855o && file.exists()) ? org.apache.commons.io.j.w0(file) : 0L : file.length()) - (file2.isDirectory() ? (this.f31855o && file2.exists()) ? org.apache.commons.io.j.w0(file2) : 0L : file2.length());
        if (w02 < 0) {
            return -1;
        }
        return w02 > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[sumDirectoryContents=" + this.f31855o + "]";
    }

    public j(boolean z5) {
        this.f31855o = z5;
    }
}
