package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: RegexFileFilter.java */
/* loaded from: classes4.dex */
public class t extends a implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Pattern f85395b;

    public t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.f85395b = Pattern.compile(str);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f85395b.matcher(str).matches();
    }

    public t(String str, org.apache.commons.io.l lVar) {
        if (str != null) {
            this.f85395b = Pattern.compile(str, (lVar == null || lVar.i()) ? 0 : 2);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public t(String str, int i4) {
        if (str != null) {
            this.f85395b = Pattern.compile(str, i4);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public t(Pattern pattern) {
        if (pattern != null) {
            this.f85395b = pattern;
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }
}
