package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.m;

/* compiled from: PathFileComparator.java */
/* loaded from: classes6.dex */
public class h extends a implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final Comparator<File> f31843p;

    /* renamed from: q, reason: collision with root package name */
    public static final Comparator<File> f31844q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator<File> f31845r;

    /* renamed from: s, reason: collision with root package name */
    public static final Comparator<File> f31846s;

    /* renamed from: t, reason: collision with root package name */
    public static final Comparator<File> f31847t;

    /* renamed from: u, reason: collision with root package name */
    public static final Comparator<File> f31848u;

    /* renamed from: o, reason: collision with root package name */
    private final m f31849o;

    static {
        h hVar = new h();
        f31843p = hVar;
        f31844q = new i(hVar);
        h hVar2 = new h(m.f32036r);
        f31845r = hVar2;
        f31846s = new i(hVar2);
        h hVar3 = new h(m.f32037s);
        f31847t = hVar3;
        f31848u = new i(hVar3);
    }

    public h() {
        this.f31849o = m.f32035q;
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
        return this.f31849o.a(file.getPath(), file2.getPath());
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f31849o + "]";
    }

    public h(m mVar) {
        this.f31849o = mVar == null ? m.f32035q : mVar;
    }
}
