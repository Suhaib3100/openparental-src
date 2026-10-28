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
/* loaded from: classes4.dex */
public class b extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator<?>[] f85321c = new Comparator[0];

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<File>[] f85322b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Comparator<File>... comparatorArr) {
        if (comparatorArr == null) {
            this.f85322b = f85321c;
            return;
        }
        Comparator<File>[] comparatorArr2 = new Comparator[comparatorArr.length];
        this.f85322b = comparatorArr2;
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
    public File[] d(File[] fileArr) {
        if (fileArr != null) {
            Arrays.sort(fileArr, this);
        }
        return fileArr;
    }

    @Override // java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        int i4 = 0;
        for (Comparator<File> comparator : this.f85322b) {
            i4 = comparator.compare(file, file2);
            if (i4 != 0) {
                break;
            }
        }
        return i4;
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('{');
        for (int i4 = 0; i4 < this.f85322b.length; i4++) {
            if (i4 > 0) {
                sb.append(',');
            }
            sb.append(this.f85322b[i4]);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Iterable<Comparator<File>> iterable) {
        if (iterable == null) {
            this.f85322b = f85321c;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Comparator<File>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f85322b = (Comparator[]) arrayList.toArray(new Comparator[arrayList.size()]);
    }
}
