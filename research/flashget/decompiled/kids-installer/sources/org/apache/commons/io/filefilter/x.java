package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* compiled from: WildcardFileFilter.java */
/* loaded from: classes6.dex */
public class x extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final String[] f31902o;

    /* renamed from: p, reason: collision with root package name */
    private final org.apache.commons.io.m f31903p;

    public x(String str) {
        this(str, (org.apache.commons.io.m) null);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f31902o) {
            if (org.apache.commons.io.k.K(str, str2, this.f31903p)) {
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
        if (this.f31902o != null) {
            for (int i5 = 0; i5 < this.f31902o.length; i5++) {
                if (i5 > 0) {
                    sb.append(",");
                }
                sb.append(this.f31902o[i5]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public x(String str, org.apache.commons.io.m mVar) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.f31902o = new String[]{str};
        this.f31903p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f31902o) {
            if (org.apache.commons.io.k.K(name, str, this.f31903p)) {
                return true;
            }
        }
        return false;
    }

    public x(String[] strArr) {
        this(strArr, (org.apache.commons.io.m) null);
    }

    public x(String[] strArr, org.apache.commons.io.m mVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f31902o = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f31903p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
            return;
        }
        throw new IllegalArgumentException("The wildcard array must not be null");
    }

    public x(List<String> list) {
        this(list, (org.apache.commons.io.m) null);
    }

    public x(List<String> list, org.apache.commons.io.m mVar) {
        if (list != null) {
            this.f31902o = (String[]) list.toArray(new String[list.size()]);
            this.f31903p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
            return;
        }
        throw new IllegalArgumentException("The wildcard list must not be null");
    }
}
