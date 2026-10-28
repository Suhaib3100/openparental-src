package org.apache.commons.io.comparator;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: AbstractFileComparator.java */
/* loaded from: classes5.dex */
abstract class a implements Comparator<File> {
    a() {
    }

    public List<File> a(List<File> list) {
        if (list != null) {
            Collections.sort(list, this);
        }
        return list;
    }

    public File[] b(File... fileArr) {
        if (fileArr != null) {
            Arrays.sort(fileArr, this);
        }
        return fileArr;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
