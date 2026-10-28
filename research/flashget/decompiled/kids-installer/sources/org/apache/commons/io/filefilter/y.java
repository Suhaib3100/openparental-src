package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* compiled from: WildcardFilter.java */
@Deprecated
/* loaded from: classes6.dex */
public class y extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final String[] f31904o;

    public y(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The wildcard must not be null");
        }
        this.f31904o = new String[]{str};
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (file != null && new File(file, str).isDirectory()) {
            return false;
        }
        for (String str2 : this.f31904o) {
            if (org.apache.commons.io.k.J(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public y(String[] strArr) {
        if (strArr != null) {
            String[] strArr2 = new String[strArr.length];
            this.f31904o = strArr2;
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            return;
        }
        throw new IllegalArgumentException("The wildcard array must not be null");
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return false;
        }
        for (String str : this.f31904o) {
            if (org.apache.commons.io.k.J(file.getName(), str)) {
                return true;
            }
        }
        return false;
    }

    public y(List<String> list) {
        if (list != null) {
            this.f31904o = (String[]) list.toArray(new String[list.size()]);
            return;
        }
        throw new IllegalArgumentException("The wildcard list must not be null");
    }
}
