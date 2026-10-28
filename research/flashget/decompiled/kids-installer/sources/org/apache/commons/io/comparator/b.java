package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositeFileComparator.java */
/* loaded from: classes6.dex */
public class b extends a implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    private static final Comparator<?>[] f31821p = new Comparator[0];

    /* renamed from: o, reason: collision with root package name */
    private final Comparator<File>[] f31822o;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Comparator<File>... comparatorArr) {
        if (comparatorArr == null) {
            this.f31822o = f31821p;
            return;
        }
        Comparator<File>[] comparatorArr2 = new Comparator[comparatorArr.length];
        this.f31822o = comparatorArr2;
        System.arraycopy(comparatorArr, 0, comparatorArr2, 0, comparatorArr.length);
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
        int i5 = 0;
        for (Comparator<File> comparator : this.f31822o) {
            i5 = comparator.compare(file, file2);
            if (i5 != 0) {
                break;
            }
        }
        return i5;
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('{');
        for (int i5 = 0; i5 < this.f31822o.length; i5++) {
            if (i5 > 0) {
                sb.append(',');
            }
            sb.append(this.f31822o[i5]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Iterable<Comparator<File>> iterable) {
        if (iterable == null) {
            this.f31822o = f31821p;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Comparator<File>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f31822o = (Comparator[]) arrayList.toArray(new Comparator[arrayList.size()]);
    }
}
