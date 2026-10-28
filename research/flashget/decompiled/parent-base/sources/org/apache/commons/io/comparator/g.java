package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.l;

/* compiled from: NameFileComparator.java */
/* loaded from: classes4.dex */
public class g extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f85336c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f85337d;

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f85338e;

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f85339f;

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator<File> f85340g;

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator<File> f85341h;

    /* renamed from: b, reason: collision with root package name */
    private final l f85342b;

    static {
        g gVar = new g();
        f85336c = gVar;
        f85337d = new i(gVar);
        g gVar2 = new g(l.f85546e);
        f85338e = gVar2;
        f85339f = new i(gVar2);
        g gVar3 = new g(l.f85547f);
        f85340g = gVar3;
        f85341h = new i(gVar3);
    }

    public g() {
        this.f85342b = l.f85545d;
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
        return this.f85342b.a(file.getName(), file2.getName());
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f85342b + "]";
    }

    public g(l lVar) {
        this.f85342b = lVar == null ? l.f85545d : lVar;
    }
}
