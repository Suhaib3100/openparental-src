package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

/* compiled from: SizeFileFilter.java */
/* loaded from: classes4.dex */
public class u extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final long f85396b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f85397c;

    public u(long j4) {
        this(j4, true);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        boolean z4 = file.length() < this.f85396b;
        return this.f85397c ? !z4 : z4;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        String str = this.f85397c ? ">=" : "<";
        StringBuilder sb = new StringBuilder();
        androidx.concurrent.futures.a.a(sb, super.toString(), "(", str);
        return android.support.v4.media.session.b.a(sb, this.f85396b, ")");
    }

    public u(long j4, boolean z4) {
        if (j4 < 0) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.f85396b = j4;
        this.f85397c = z4;
    }
}
