package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: OrFileFilter.java */
/* loaded from: classes4.dex */
public class r extends a implements f, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final List<n> f85392b;

    public r() {
        this.f85392b = new ArrayList();
    }

    @Override // org.apache.commons.io.filefilter.f
    public void a(List<n> list) {
        this.f85392b.clear();
        this.f85392b.addAll(list);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        Iterator<n> it = this.f85392b.iterator();
        while (it.hasNext()) {
            if (it.next().accept(file)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.f
    public void b(n nVar) {
        this.f85392b.add(nVar);
    }

    @Override // org.apache.commons.io.filefilter.f
    public boolean c(n nVar) {
        return this.f85392b.remove(nVar);
    }

    @Override // org.apache.commons.io.filefilter.f
    public List<n> d() {
        return Collections.unmodifiableList(this.f85392b);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.f85392b != null) {
            for (int i4 = 0; i4 < this.f85392b.size(); i4++) {
                if (i4 > 0) {
                    sb.append(",");
                }
                n nVar = this.f85392b.get(i4);
                sb.append(nVar == null ? "null" : nVar.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public r(List<n> list) {
        if (list == null) {
            this.f85392b = new ArrayList();
        } else {
            this.f85392b = new ArrayList(list);
        }
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        Iterator<n> it = this.f85392b.iterator();
        while (it.hasNext()) {
            if (it.next().accept(file, str)) {
                return true;
            }
        }
        return false;
    }

    public r(n nVar, n nVar2) {
        if (nVar != null && nVar2 != null) {
            this.f85392b = new ArrayList(2);
            b(nVar);
            b(nVar2);
            return;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }
}
