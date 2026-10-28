package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* compiled from: SuffixFileFilter.java */
/* loaded from: classes4.dex */
public class v extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final String[] f85398b;

    /* renamed from: c, reason: collision with root package name */
    private final org.apache.commons.io.l f85399c;

    public v(String str) {
        this(str, org.apache.commons.io.l.f85545d);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f85398b) {
            if (this.f85399c.b(name, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        if (this.f85398b != null) {
            for (int i4 = 0; i4 < this.f85398b.length; i4++) {
                if (i4 > 0) {
                    sb.append(",");
                }
                sb.append(this.f85398b[i4]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public v(String str, org.apache.commons.io.l lVar) {
        if (str == null) {
            throw new IllegalArgumentException("The suffix must not be null");
        }
        this.f85398b = new String[]{str};
        this.f85399c = lVar == null ? org.apache.commons.io.l.f85545d : lVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f85398b) {
            if (this.f85399c.b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public v(String[] strArr) {
        this(strArr, org.apache.commons.io.l.f85545d);
    }

    public v(String[] strArr, org.apache.commons.io.l lVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f85398b = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f85399c = lVar == null ? org.apache.commons.io.l.f85545d : lVar;
            return;
        }
        throw new IllegalArgumentException("The array of suffixes must not be null");
    }

    public v(List<String> list) {
        this(list, org.apache.commons.io.l.f85545d);
    }

    public v(List<String> list, org.apache.commons.io.l lVar) {
        if (list != null) {
            this.f85398b = (String[]) list.toArray(new String[list.size()]);
            this.f85399c = lVar == null ? org.apache.commons.io.l.f85545d : lVar;
            return;
        }
        throw new IllegalArgumentException("The list of suffixes must not be null");
    }
}
