package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: SizeFileFilter.java */
/* loaded from: classes6.dex */
public class u extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final long f31896o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f31897p;

    public u(long j5) {
        this(j5, true);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        boolean z5 = file.length() < this.f31896o;
        return this.f31897p ? !z5 : z5;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + (this.f31897p ? ">=" : "<") + this.f31896o + ")";
    }

    public u(long j5, boolean z5) {
        if (j5 < 0) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.f31896o = j5;
        this.f31897p = z5;
    }
}
