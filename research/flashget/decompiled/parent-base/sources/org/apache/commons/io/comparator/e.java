package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.l;

/* compiled from: ExtensionFileComparator.java */
/* loaded from: classes4.dex */
public class e extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator<File> f85327c;

    /* renamed from: d, reason: collision with root package name */
    public static final Comparator<File> f85328d;

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator<File> f85329e;

    /* renamed from: f, reason: collision with root package name */
    public static final Comparator<File> f85330f;

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator<File> f85331g;

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator<File> f85332h;

    /* renamed from: b, reason: collision with root package name */
    private final l f85333b;

    static {
        e eVar = new e();
        f85327c = eVar;
        f85328d = new i(eVar);
        e eVar2 = new e(l.f85546e);
        f85329e = eVar2;
        f85330f = new i(eVar2);
        e eVar3 = new e(l.f85547f);
        f85331g = eVar3;
        f85332h = new i(eVar3);
    }

    public e() {
        this.f85333b = l.f85545d;
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
        return this.f85333b.a(org.apache.commons.io.j.l(file.getName()), org.apache.commons.io.j.l(file2.getName()));
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f85333b + "]";
    }

    public e(l lVar) {
        this.f85333b = lVar == null ? l.f85545d : lVar;
    }
}
