package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: SizeFileComparator.java */
/* loaded from: classes4.dex */
public class j extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f85351c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f85352d;

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f85353e;

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f85354f;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f85355b;

    static {
        j jVar = new j();
        f85351c = jVar;
        f85352d = new i(jVar);
        j jVar2 = new j(true);
        f85353e = jVar2;
        f85354f = new i(jVar2);
    }

    public j() {
        this.f85355b = false;
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
        long w02 = (file.isDirectory() ? (this.f85355b && file.exists()) ? org.apache.commons.io.i.w0(file) : 0L : file.length()) - (file2.isDirectory() ? (this.f85355b && file2.exists()) ? org.apache.commons.io.i.w0(file2) : 0L : file2.length());
        if (w02 < 0) {
            return -1;
        }
        return w02 > 0 ? 1 : 0;
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[sumDirectoryContents=");
        return androidx.appcompat.app.h.a(sb, this.f85355b, "]");
    }

    public j(boolean z4) {
        this.f85355b = z4;
    }
}
