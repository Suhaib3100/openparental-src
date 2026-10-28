package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: RegexFileFilter.java */
/* loaded from: classes6.dex */
public class t extends a implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final Pattern f31895o;

    public t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Pattern is missing");
        }
        this.f31895o = Pattern.compile(str);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f31895o.matcher(str).matches();
    }

    public t(String str, org.apache.commons.io.m mVar) {
        if (str != null) {
            this.f31895o = Pattern.compile(str, (mVar == null || mVar.i()) ? 0 : 2);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public t(String str, int i5) {
        if (str != null) {
            this.f31895o = Pattern.compile(str, i5);
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }

    public t(Pattern pattern) {
        if (pattern != null) {
            this.f31895o = pattern;
            return;
        }
        throw new IllegalArgumentException("Pattern is missing");
    }
}
