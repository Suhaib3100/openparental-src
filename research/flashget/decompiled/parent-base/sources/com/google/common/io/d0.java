package com.google.common.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: PatternFilenameFilter.java */
@p
@d9.a
@d9.c
/* loaded from: classes6.dex */
public final class d0 implements FilenameFilter {

    /* renamed from: b, reason: collision with root package name */
    private final Pattern f57096b;

    public d0(String str) {
        this(Pattern.compile(str));
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return this.f57096b.matcher(str).matches();
    }

    public d0(Pattern pattern) {
        pattern.getClass();
        this.f57096b = pattern;
    }
}
