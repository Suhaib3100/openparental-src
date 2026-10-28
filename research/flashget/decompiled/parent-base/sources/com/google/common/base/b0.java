package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: JdkPattern.java */
@d9.c
@o
/* loaded from: classes6.dex */
final class b0 extends l implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final long f54852c = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pattern f54853b;

    /* compiled from: JdkPattern.java */
    private static final class a extends k {

        /* renamed from: a, reason: collision with root package name */
        final Matcher f54854a;

        a(Matcher matcher) {
            matcher.getClass();
            this.f54854a = matcher;
        }

        @Override // com.google.common.base.k
        public int a() {
            return this.f54854a.end();
        }

        @Override // com.google.common.base.k
        public boolean b() {
            return this.f54854a.find();
        }

        @Override // com.google.common.base.k
        public boolean c(int i4) {
            return this.f54854a.find(i4);
        }

        @Override // com.google.common.base.k
        public boolean d() {
            return this.f54854a.matches();
        }

        @Override // com.google.common.base.k
        public String e(String str) {
            return this.f54854a.replaceAll(str);
        }

        @Override // com.google.common.base.k
        public int f() {
            return this.f54854a.start();
        }
    }

    b0(Pattern pattern) {
        pattern.getClass();
        this.f54853b = pattern;
    }

    @Override // com.google.common.base.l
    public int b() {
        return this.f54853b.flags();
    }

    @Override // com.google.common.base.l
    public k d(CharSequence charSequence) {
        return new a(this.f54853b.matcher(charSequence));
    }

    @Override // com.google.common.base.l
    public String e() {
        return this.f54853b.pattern();
    }

    @Override // com.google.common.base.l
    public String toString() {
        return this.f54853b.toString();
    }
}
