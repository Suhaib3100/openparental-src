package org.apache.commons.io.monitor;

import java.io.File;
import java.io.FileFilter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.io.comparator.g;
import org.apache.commons.io.j;
import org.apache.commons.io.m;

/* compiled from: FileAlterationObserver.java */
/* loaded from: classes5.dex */
public class d implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final List<a> f32046o;

    /* renamed from: p, reason: collision with root package name */
    private final e f32047p;

    /* renamed from: q, reason: collision with root package name */
    private final FileFilter f32048q;

    /* renamed from: r, reason: collision with root package name */
    private final Comparator<File> f32049r;

    public d(String str) {
        this(new File(str), (FileFilter) null, (m) null);
    }

    private void c(e eVar, e[] eVarArr, File[] fileArr) {
        e[] eVarArr2 = fileArr.length > 0 ? new e[fileArr.length] : e.f32050w;
        int i5 = 0;
        for (e eVar2 : eVarArr) {
            while (i5 < fileArr.length && this.f32049r.compare(eVar2.b(), fileArr[i5]) > 0) {
                e d6 = d(eVar, fileArr[i5]);
                eVarArr2[i5] = d6;
                f(d6);
                i5++;
            }
            if (i5 >= fileArr.length || this.f32049r.compare(eVar2.b(), fileArr[i5]) != 0) {
                c(eVar2, eVar2.a(), j.f32024p);
                g(eVar2);
            } else {
                h(eVar2, fileArr[i5]);
                c(eVar2, eVar2.a(), m(fileArr[i5]));
                eVarArr2[i5] = eVar2;
                i5++;
            }
        }
        while (i5 < fileArr.length) {
            e d7 = d(eVar, fileArr[i5]);
            eVarArr2[i5] = d7;
            f(d7);
            i5++;
        }
        eVar.l(eVarArr2);
    }

    private e d(e eVar, File file) {
        e j5 = eVar.j(file);
        j5.k(file);
        File[] m5 = m(file);
        e[] eVarArr = m5.length > 0 ? new e[m5.length] : e.f32050w;
        for (int i5 = 0; i5 < m5.length; i5++) {
            eVarArr[i5] = d(j5, m5[i5]);
        }
        j5.l(eVarArr);
        return j5;
    }

    private void f(e eVar) {
        for (a aVar : this.f32046o) {
            if (eVar.h()) {
                aVar.c(eVar.b());
            } else {
                aVar.g(eVar.b());
            }
        }
        for (e eVar2 : eVar.a()) {
            f(eVar2);
        }
    }

    private void g(e eVar) {
        for (a aVar : this.f32046o) {
            if (eVar.h()) {
                aVar.a(eVar.b());
            } else {
                aVar.d(eVar.b());
            }
        }
    }

    private void h(e eVar, File file) {
        if (eVar.k(file)) {
            for (a aVar : this.f32046o) {
                if (eVar.h()) {
                    aVar.b(file);
                } else {
                    aVar.f(file);
                }
            }
        }
    }

    private File[] m(File file) {
        File[] fileArr;
        if (file.isDirectory()) {
            FileFilter fileFilter = this.f32048q;
            fileArr = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        } else {
            fileArr = null;
        }
        if (fileArr == null) {
            fileArr = j.f32024p;
        }
        Comparator<File> comparator = this.f32049r;
        if (comparator != null && fileArr.length > 1) {
            Arrays.sort(fileArr, comparator);
        }
        return fileArr;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f32046o.add(aVar);
        }
    }

    public void b() {
        Iterator<a> it = this.f32046o.iterator();
        while (it.hasNext()) {
            it.next().e(this);
        }
        File b6 = this.f32047p.b();
        if (b6.exists()) {
            e eVar = this.f32047p;
            c(eVar, eVar.a(), m(b6));
        } else if (this.f32047p.i()) {
            e eVar2 = this.f32047p;
            c(eVar2, eVar2.a(), j.f32024p);
        }
        Iterator<a> it2 = this.f32046o.iterator();
        while (it2.hasNext()) {
            it2.next().h(this);
        }
    }

    public void e() throws Exception {
    }

    public File i() {
        return this.f32047p.b();
    }

    public FileFilter j() {
        return this.f32048q;
    }

    public Iterable<a> k() {
        return this.f32046o;
    }

    public void l() throws Exception {
        e eVar = this.f32047p;
        eVar.k(eVar.b());
        File[] m5 = m(this.f32047p.b());
        e[] eVarArr = m5.length > 0 ? new e[m5.length] : e.f32050w;
        for (int i5 = 0; i5 < m5.length; i5++) {
            eVarArr[i5] = d(this.f32047p, m5[i5]);
        }
        this.f32047p.l(eVarArr);
    }

    public void n(a aVar) {
        if (aVar != null) {
            while (this.f32046o.remove(aVar)) {
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[file='");
        sb.append(i().getPath());
        sb.append('\'');
        if (this.f32048q != null) {
            sb.append(", ");
            sb.append(this.f32048q.toString());
        }
        sb.append(", listeners=");
        sb.append(this.f32046o.size());
        sb.append("]");
        return sb.toString();
    }

    public d(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter, (m) null);
    }

    public d(String str, FileFilter fileFilter, m mVar) {
        this(new File(str), fileFilter, mVar);
    }

    public d(File file) {
        this(file, (FileFilter) null, (m) null);
    }

    public d(File file, FileFilter fileFilter) {
        this(file, fileFilter, (m) null);
    }

    public d(File file, FileFilter fileFilter, m mVar) {
        this(new e(null, file), fileFilter, mVar);
    }

    protected d(e eVar, FileFilter fileFilter, m mVar) {
        this.f32046o = new CopyOnWriteArrayList();
        if (eVar != null) {
            if (eVar.b() != null) {
                this.f32047p = eVar;
                this.f32048q = fileFilter;
                if (mVar != null && !mVar.equals(m.f32037s)) {
                    if (mVar.equals(m.f32036r)) {
                        this.f32049r = g.f31838r;
                        return;
                    } else {
                        this.f32049r = g.f31836p;
                        return;
                    }
                }
                this.f32049r = g.f31840t;
                return;
            }
            throw new IllegalArgumentException("Root directory is missing");
        }
        throw new IllegalArgumentException("Root entry is missing");
    }
}
