package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.k;
import org.apache.commons.io.m;

/* compiled from: ExtensionFileComparator.java */
/* loaded from: classes6.dex */
public class e extends a implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final Comparator<File> f31827p;

    /* renamed from: q, reason: collision with root package name */
    public static final Comparator<File> f31828q;

    /* renamed from: r, reason: collision with root package name */
    public static final Comparator<File> f31829r;

    /* renamed from: s, reason: collision with root package name */
    public static final Comparator<File> f31830s;

    /* renamed from: t, reason: collision with root package name */
    public static final Comparator<File> f31831t;

    /* renamed from: u, reason: collision with root package name */
    public static final Comparator<File> f31832u;

    /* renamed from: o, reason: collision with root package name */
    private final m f31833o;

    static {
        e eVar = new e();
        f31827p = eVar;
        f31828q = new i(eVar);
        e eVar2 = new e(m.f32036r);
        f31829r = eVar2;
        f31830s = new i(eVar2);
        e eVar3 = new e(m.f32037s);
        f31831t = eVar3;
        f31832u = new i(eVar3);
    }

    public e() {
        this.f31833o = m.f32035q;
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
        return this.f31833o.a(k.l(file.getName()), k.l(file2.getName()));
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[caseSensitivity=" + this.f31833o + "]";
    }

    public e(m mVar) {
        this.f31833o = mVar == null ? m.f32035q : mVar;
    }
}
