package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

/* compiled from: AgeFileFilter.java */
/* loaded from: classes4.dex */
public class b extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final long f85365b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f85366c;

    public b(long j4) {
        this(j4, true);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        boolean O = org.apache.commons.io.i.O(file, this.f85365b);
        return this.f85366c ? !O : O;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        String str = this.f85366c ? "<=" : ">";
        StringBuilder sb = new StringBuilder();
        androidx.concurrent.futures.a.a(sb, super.toString(), "(", str);
        return android.support.v4.media.session.b.a(sb, this.f85365b, ")");
    }

    public b(long j4, boolean z4) {
        this.f85366c = z4;
        this.f85365b = j4;
    }

    public b(Date date) {
        this(date, true);
    }

    public b(Date date, boolean z4) {
        this(date.getTime(), z4);
    }

    public b(File file) {
        this(file, true);
    }

    public b(File file, boolean z4) {
        this(file.lastModified(), z4);
    }
}
