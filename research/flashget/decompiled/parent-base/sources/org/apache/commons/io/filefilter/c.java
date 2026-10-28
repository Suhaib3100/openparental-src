package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: AndFileFilter.java */
/* loaded from: classes4.dex */
public class c extends a implements f, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final List<n> f85367b;

    public c() {
        this.f85367b = new ArrayList();
    }

    @Override // org.apache.commons.io.filefilter.f
    public void a(List<n> list) {
        this.f85367b.clear();
        this.f85367b.addAll(list);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (this.f85367b.isEmpty()) {
            return false;
        }
        Iterator<n> it = this.f85367b.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.io.filefilter.f
    public void b(n nVar) {
        this.f85367b.add(nVar);
    }

    @Override // org.apache.commons.io.filefilter.f
    public boolean c(n nVar) {
        return this.f85367b.remove(nVar);
    }

    @Override // org.apache.commons.io.filefilter.f
    public List<n> d() {
        return Collections.unmodifiableList(this.f85367b);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.f85367b != null) {
            for (int i4 = 0; i4 < this.f85367b.size(); i4++) {
                if (i4 > 0) {
                    sb.append(",");
                }
                n nVar = this.f85367b.get(i4);
                sb.append(nVar == null ? "null" : nVar.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public c(List<n> list) {
        if (list == null) {
            this.f85367b = new ArrayList();
        } else {
            this.f85367b = new ArrayList(list);
        }
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (this.f85367b.isEmpty()) {
            return false;
        }
        Iterator<n> it = this.f85367b.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    public c(n nVar, n nVar2) {
        if (nVar != null && nVar2 != null) {
            this.f85367b = new ArrayList(2);
            b(nVar);
            b(nVar2);
            return;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }
}
