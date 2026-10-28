package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* compiled from: ReverseComparator.java */
/* loaded from: classes4.dex */
class i extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<File> f85350b;

    public i(Comparator<File> comparator) {
        if (comparator == null) {
            throw new IllegalArgumentException("Delegate comparator is missing");
        }
        this.f85350b = comparator;
    }

    @Override // java.util.Comparator
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        return this.f85350b.compare(file2, file);
    }

    @Override // org.apache.commons.io.comparator.a
    public String toString() {
        return super.toString() + "[" + this.f85350b.toString() + "]";
    }
}
