package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.m;

/* compiled from: NameFileComparator.java */
/* loaded from: classes6.dex */
public class g extends a implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final Comparator<File> f31836p;

    /* renamed from: q, reason: collision with root package name */
    public static final Comparator<File> f31837q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator<File> f31838r;

    /* renamed from: s, reason: collision with root package name */
    public static final Comparator<File> f31839s;

    /* renamed from: t, reason: collision with root package name */
    public static final Comparator<File> f31840t;

    /* renamed from: u, reason: collision with root package name */
    public static final Comparator<File> f31841u;

    /* renamed from: o, reason: collision with root package name */
    private final m f31842o;

    static {
        g gVar = new g();
        f31836p = gVar;
        f31837q = new i(gVar);
        g gVar2 = new g(m.f32036r);
        f31838r = gVar2;
        f31839s = new i(gVar2);
        g gVar3 = new g(m.f32037s);
        f31840t = gVar3;
        f31841u = new i(gVar3);
    }

    public g() {
        this.f31842o = m.f32035q;
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
        return this.f31842o.a(file.getName(), file2.getName());
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f31842o + "]";
    }

    public g(m mVar) {
        this.f31842o = mVar == null ? m.f32035q : mVar;
    }
}
