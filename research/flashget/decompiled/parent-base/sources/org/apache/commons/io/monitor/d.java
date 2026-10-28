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
import org.apache.commons.io.i;
import org.apache.commons.io.l;

/* compiled from: FileAlterationObserver.java */
/* loaded from: classes4.dex */
public class d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f85567b;

    /* renamed from: c, reason: collision with root package name */
    private final e f85568c;

    /* renamed from: d, reason: collision with root package name */
    private final FileFilter f85569d;

    /* renamed from: e, reason: collision with root package name */
    private final Comparator<File> f85570e;

    public d(String str) {
        this(new File(str), (FileFilter) null, (l) null);
    }

    private void c(e eVar, e[] eVarArr, File[] fileArr) {
        e[] eVarArr2 = fileArr.length > 0 ? new e[fileArr.length] : e.f85571j;
        int i4 = 0;
        for (e eVar2 : eVarArr) {
            while (i4 < fileArr.length && this.f85570e.compare(eVar2.b(), fileArr[i4]) > 0) {
                e d5 = d(eVar, fileArr[i4]);
                eVarArr2[i4] = d5;
                f(d5);
                i4++;
            }
            if (i4 >= fileArr.length || this.f85570e.compare(eVar2.b(), fileArr[i4]) != 0) {
                c(eVar2, eVar2.a(), i.f85431p);
                g(eVar2);
            } else {
                h(eVar2, fileArr[i4]);
                c(eVar2, eVar2.a(), m(fileArr[i4]));
                eVarArr2[i4] = eVar2;
                i4++;
            }
        }
        while (i4 < fileArr.length) {
            e d6 = d(eVar, fileArr[i4]);
            eVarArr2[i4] = d6;
            f(d6);
            i4++;
        }
        eVar.l(eVarArr2);
    }

    private e d(e eVar, File file) {
        e j4 = eVar.j(file);
        j4.k(file);
        File[] m4 = m(file);
        e[] eVarArr = m4.length > 0 ? new e[m4.length] : e.f85571j;
        for (int i4 = 0; i4 < m4.length; i4++) {
            eVarArr[i4] = d(j4, m4[i4]);
        }
        j4.l(eVarArr);
        return j4;
    }

    private void f(e eVar) {
        for (a aVar : this.f85567b) {
            if (eVar.h()) {
                aVar.f(eVar.b());
            } else {
                aVar.c(eVar.b());
            }
        }
        for (e eVar2 : eVar.a()) {
            f(eVar2);
        }
    }

    private void g(e eVar) {
        for (a aVar : this.f85567b) {
            if (eVar.h()) {
                aVar.d(eVar.b());
            } else {
                aVar.a(eVar.b());
            }
        }
    }

    private void h(e eVar, File file) {
        if (eVar.k(file)) {
            for (a aVar : this.f85567b) {
                if (eVar.h()) {
                    aVar.e(file);
                } else {
                    aVar.b(file);
                }
            }
        }
    }

    private File[] m(File file) {
        File[] fileArr;
        if (file.isDirectory()) {
            FileFilter fileFilter = this.f85569d;
            fileArr = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        } else {
            fileArr = null;
        }
        if (fileArr == null) {
            fileArr = i.f85431p;
        }
        Comparator<File> comparator = this.f85570e;
        if (comparator != null && fileArr.length > 1) {
            Arrays.sort(fileArr, comparator);
        }
        return fileArr;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f85567b.add(aVar);
        }
    }

    public void b() {
        Iterator<a> it = this.f85567b.iterator();
        while (it.hasNext()) {
            it.next().g(this);
        }
        File b5 = this.f85568c.b();
        if (b5.exists()) {
            e eVar = this.f85568c;
            c(eVar, eVar.a(), m(b5));
        } else if (this.f85568c.i()) {
            e eVar2 = this.f85568c;
            c(eVar2, eVar2.a(), i.f85431p);
        }
        Iterator<a> it2 = this.f85567b.iterator();
        while (it2.hasNext()) {
            it2.next().h(this);
        }
    }

    public void e() throws Exception {
    }

    public File i() {
        return this.f85568c.b();
    }

    public FileFilter j() {
        return this.f85569d;
    }

    public Iterable<a> k() {
        return this.f85567b;
    }

    public void l() throws Exception {
        e eVar = this.f85568c;
        eVar.k(eVar.b());
        File[] m4 = m(this.f85568c.b());
        e[] eVarArr = m4.length > 0 ? new e[m4.length] : e.f85571j;
        for (int i4 = 0; i4 < m4.length; i4++) {
            eVarArr[i4] = d(this.f85568c, m4[i4]);
        }
        this.f85568c.l(eVarArr);
    }

    public void n(a aVar) {
        if (aVar != null) {
            while (this.f85567b.remove(aVar)) {
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[file='");
        sb.append(i().getPath());
        sb.append('\'');
        if (this.f85569d != null) {
            sb.append(", ");
            sb.append(this.f85569d.toString());
        }
        sb.append(", listeners=");
        sb.append(this.f85567b.size());
        sb.append("]");
        return sb.toString();
    }

    public d(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter, (l) null);
    }

    public d(String str, FileFilter fileFilter, l lVar) {
        this(new File(str), fileFilter, lVar);
    }

    public d(File file) {
        this(file, (FileFilter) null, (l) null);
    }

    public d(File file, FileFilter fileFilter) {
        this(file, fileFilter, (l) null);
    }

    public d(File file, FileFilter fileFilter, l lVar) {
        this(new e(null, file), fileFilter, lVar);
    }

    protected d(e eVar, FileFilter fileFilter, l lVar) {
        this.f85567b = new CopyOnWriteArrayList();
        if (eVar != null) {
            if (eVar.b() != null) {
                this.f85568c = eVar;
                this.f85569d = fileFilter;
                if (lVar != null && !lVar.equals(l.f85547f)) {
                    if (lVar.equals(l.f85546e)) {
                        this.f85570e = g.f85338e;
                        return;
                    } else {
                        this.f85570e = g.f85336c;
                        return;
                    }
                }
                this.f85570e = g.f85340g;
                return;
            }
            throw new IllegalArgumentException("Root directory is missing");
        }
        throw new IllegalArgumentException("Root entry is missing");
    }
}
