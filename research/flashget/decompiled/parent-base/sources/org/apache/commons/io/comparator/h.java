package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.l;

/* compiled from: PathFileComparator.java */
/* loaded from: classes4.dex */
public class h extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f85343c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f85344d;

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f85345e;

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f85346f;

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator<File> f85347g;

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator<File> f85348h;

    /* renamed from: b, reason: collision with root package name */
    private final l f85349b;

    static {
        h hVar = new h();
        f85343c = hVar;
        f85344d = new i(hVar);
        h hVar2 = new h(l.f85546e);
        f85345e = hVar2;
        f85346f = new i(hVar2);
        h hVar3 = new h(l.f85547f);
        f85347g = hVar3;
        f85348h = new i(hVar3);
    }

    public h() {
        this.f85349b = l.f85545d;
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
        return this.f85349b.a(file.getPath(), file2.getPath());
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f85349b + "]";
    }

    public h(l lVar) {
        this.f85349b = lVar == null ? l.f85545d : lVar;
    }
}
