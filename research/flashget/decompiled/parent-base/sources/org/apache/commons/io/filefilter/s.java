package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* compiled from: PrefixFileFilter.java */
/* loaded from: classes4.dex */
public class s extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final String[] f85393b;

    /* renamed from: c, reason: collision with root package name */
    private final org.apache.commons.io.l f85394c;

    public s(String str) {
        this(str, org.apache.commons.io.l.f85545d);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        String name = file.getName();
        for (String str : this.f85393b) {
            if (this.f85394c.f(name, str)) {
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
        if (this.f85393b != null) {
            for (int i4 = 0; i4 < this.f85393b.length; i4++) {
                if (i4 > 0) {
                    sb.append(",");
                }
                sb.append(this.f85393b[i4]);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public s(String str, org.apache.commons.io.l lVar) {
        if (str == null) {
            throw new IllegalArgumentException("The prefix must not be null");
        }
        this.f85393b = new String[]{str};
        this.f85394c = lVar == null ? org.apache.commons.io.l.f85545d : lVar;
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        for (String str2 : this.f85393b) {
            if (this.f85394c.f(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public s(String[] strArr) {
        this(strArr, org.apache.commons.io.l.f85545d);
    }

    public s(String[] strArr, org.apache.commons.io.l lVar) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f85393b = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            this.f85394c = lVar == null ? org.apache.commons.io.l.f85545d : lVar;
            return;
        }
        throw new IllegalArgumentException("The array of prefixes must not be null");
    }

    public s(List<String> list) {
        this(list, org.apache.commons.io.l.f85545d);
    }

    public s(List<String> list, org.apache.commons.io.l lVar) {
        if (list != null) {
            this.f85393b = (String[]) list.toArray(new String[list.size()]);
            this.f85394c = lVar == null ? org.apache.commons.io.l.f85545d : lVar;
            return;
        }
        throw new IllegalArgumentException("The list of prefixes must not be null");
    }
}
