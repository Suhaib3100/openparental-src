package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

/* compiled from: AgeFileFilter.java */
/* loaded from: classes6.dex */
public class b extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final long f31865o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f31866p;

    public b(long j5) {
        this(j5, true);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        boolean O = org.apache.commons.io.j.O(file, this.f31865o);
        return this.f31866p ? !O : O;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + (this.f31866p ? "<=" : ">") + this.f31865o + ")";
    }

    public b(long j5, boolean z5) {
        this.f31866p = z5;
        this.f31865o = j5;
    }

    public b(Date date) {
        this(date, true);
    }

    public b(Date date, boolean z5) {
        this(date.getTime(), z5);
    }

    public b(File file) {
        this(file, true);
    }

    public b(File file, boolean z5) {
        this(file.lastModified(), z5);
    }
}
