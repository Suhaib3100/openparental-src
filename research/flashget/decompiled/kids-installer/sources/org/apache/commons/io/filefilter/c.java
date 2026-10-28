package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: AndFileFilter.java */
/* loaded from: classes6.dex */
public class c extends a implements f, Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final List<n> f31867o;

    public c() {
        this.f31867o = new ArrayList();
    }

    @Override // org.apache.commons.io.filefilter.f
    public void a(n nVar) {
        this.f31867o.add(nVar);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (this.f31867o.isEmpty()) {
            return false;
        }
        Iterator<n> it = this.f31867o.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.io.filefilter.f
    public boolean b(n nVar) {
        return this.f31867o.remove(nVar);
    }

    @Override // org.apache.commons.io.filefilter.f
    public void c(List<n> list) {
        this.f31867o.clear();
        this.f31867o.addAll(list);
    }

    @Override // org.apache.commons.io.filefilter.f
    public List<n> d() {
        return Collections.unmodifiableList(this.f31867o);
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.f31867o != null) {
            for (int i5 = 0; i5 < this.f31867o.size(); i5++) {
                if (i5 > 0) {
                    sb.append(",");
                }
                n nVar = this.f31867o.get(i5);
                sb.append(nVar == null ? "null" : nVar.toString());
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public c(List<n> list) {
        if (list == null) {
            this.f31867o = new ArrayList();
        } else {
            this.f31867o = new ArrayList(list);
        }
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (this.f31867o.isEmpty()) {
            return false;
        }
        Iterator<n> it = this.f31867o.iterator();
        while (it.hasNext()) {
            if (!it.next().accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    public c(n nVar, n nVar2) {
        if (nVar != null && nVar2 != null) {
            this.f31867o = new ArrayList(2);
            a(nVar);
            a(nVar2);
            return;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }
}
