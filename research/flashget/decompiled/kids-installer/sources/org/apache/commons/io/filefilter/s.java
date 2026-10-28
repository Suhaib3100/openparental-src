package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* compiled from: PrefixFileFilter.java */
/* loaded from: classes6.dex */
public class s extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final String[] f31893o;

    /* renamed from: p, reason: collision with root package name */
    private final org.apache.commons.io.m f31894p;

    public s(String str) {
        this(str, org.apache.commons.io.m.f32035q);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f31893o) {
            if (this.f31894p.f(name, str)) {
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
        if (this.f31893o != null) {
            for (int i5 = 0; i5 < this.f31893o.length; i5++) {
                if (i5 > 0) {
                    sb.append(",");
                }
                sb.append(this.f31893o[i5]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public s(String str, org.apache.commons.io.m mVar) {
        if (str == null) {
            throw new IllegalArgumentException("The prefix must not be null");
        }
        this.f31893o = new String[]{str};
        this.f31894p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f31893o) {
            if (this.f31894p.f(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public s(String[] strArr) {
        this(strArr, org.apache.commons.io.m.f32035q);
    }

    public s(String[] strArr, org.apache.commons.io.m mVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f31893o = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f31894p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
            return;
        }
        throw new IllegalArgumentException("The array of prefixes must not be null");
    }

    public s(List<String> list) {
        this(list, org.apache.commons.io.m.f32035q);
    }

    public s(List<String> list, org.apache.commons.io.m mVar) {
        if (list != null) {
            this.f31893o = (String[]) list.toArray(new String[list.size()]);
            this.f31894p = mVar == null ? org.apache.commons.io.m.f32035q : mVar;
            return;
        }
        throw new IllegalArgumentException("The list of prefixes must not be null");
    }
}
