package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ReverseComparator.java */
/* loaded from: classes6.dex */
class i extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final Comparator<File> f31850o;

    public i(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.f31850o = comparator;
    }

    @Override // java.util.Comparator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        return this.f31850o.compare(file2, file);
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[" + this.f31850o.toString() + "]";
    }
}
