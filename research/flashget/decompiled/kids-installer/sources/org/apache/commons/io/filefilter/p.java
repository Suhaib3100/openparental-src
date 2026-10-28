package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* compiled from: NameFileFilter.java */
/* loaded from: classes6.dex */
public class p extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final String[] f31889o;

    /* renamed from: p, reason: collision with root package name */
    private final org.apache.commons.io.m f31890p;

    public p(String str) {
        this(str, (org.apache.commons.io.m) null);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f31889o) {
            if (this.f31890p.c(name, str)) {
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
        if (this.f31889o != null) {
            for (int i5 = 0; i5 < this.f31889o.length; i5++) {
                if (i5 > 0) {
                    sb.append(",");
                }
                sb.append(this.f31889o[i5]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public p(String str, org.apache.commons.io.m mVar) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.f31889o = new String[]{str};
        this.f31890p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f31889o) {
            if (this.f31890p.c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public p(String[] strArr) {
        this(strArr, (org.apache.commons.io.m) null);
    }

    public p(String[] strArr, org.apache.commons.io.m mVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f31889o = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f31890p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
            return;
        }
        throw new IllegalArgumentException("The array of names must not be null");
    }

    public p(List<String> list) {
        this(list, (org.apache.commons.io.m) null);
    }

    public p(List<String> list, org.apache.commons.io.m mVar) {
        if (list != null) {
            this.f31889o = (String[]) list.toArray(new String[list.size()]);
            this.f31890p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
            return;
        }
        throw new IllegalArgumentException("The list of names must not be null");
    }
}
