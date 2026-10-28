package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: OrFileFilter.java */
/* loaded from: classes6.dex */
public class r extends a implements f, Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final List<n> f31892o;

    public r() {
        this.f31892o = new ArrayList();
    }

    @Override // org.apache.commons.io.filefilter.f
    public void a(n nVar) {
        this.f31892o.add(nVar);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        Iterator<n> it = this.f31892o.iterator();
        while (it.hasNext()) {
            if (it.next().accept(file)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.f
    public boolean b(n nVar) {
        return this.f31892o.remove(nVar);
    }

    @Override // org.apache.commons.io.filefilter.f
    public void c(List<n> list) {
        this.f31892o.clear();
        this.f31892o.addAll(list);
    }

    @Override // org.apache.commons.io.filefilter.f
    public List<n> d() {
        return Collections.unmodifiableList(this.f31892o);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.f31892o != null) {
            for (int i5 = 0; i5 < this.f31892o.size(); i5++) {
                if (i5 > 0) {
                    sb.append(",");
                }
                n nVar = this.f31892o.get(i5);
                sb.append(nVar == null ? "null" : nVar.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public r(List<n> list) {
        if (list == null) {
            this.f31892o = new ArrayList();
        } else {
            this.f31892o = new ArrayList(list);
        }
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Iterator<n> it = this.f31892o.iterator();
        while (it.hasNext()) {
            if (it.next().accept(file, str)) {
                return true;
            }
        }
        return false;
    }

    public r(n nVar, n nVar2) {
        if (nVar != null && nVar2 != null) {
            this.f31892o = new ArrayList(2);
            a(nVar);
            a(nVar2);
            return;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }
}
