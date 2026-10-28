package org.apache.commons.text.matcher;

import kotlin.text.m0;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.e;
import org.apache.commons.text.matcher.a;

/* compiled from: StringMatcherFactory.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final a.c f86562a = new a.c(',');

    /* renamed from: b, reason: collision with root package name */
    private static final a.c f86563b = new a.c(m0.quote);

    /* renamed from: c, reason: collision with root package name */
    public static final c f86564c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final a.e f86565d = new a.e();

    /* renamed from: e, reason: collision with root package name */
    private static final a.d f86566e = new a.d("'\"".toCharArray());

    /* renamed from: f, reason: collision with root package name */
    private static final a.c f86567f = new a.c('\'');

    /* renamed from: g, reason: collision with root package name */
    private static final a.c f86568g = new a.c(' ');

    /* renamed from: h, reason: collision with root package name */
    private static final a.d f86569h = new a.d(" \t\n\r\f".toCharArray());

    /* renamed from: i, reason: collision with root package name */
    private static final a.c f86570i = new a.c('\t');

    /* renamed from: j, reason: collision with root package name */
    private static final a.f f86571j = new a.f();

    private c() {
    }

    public b a(b... bVarArr) {
        int h02 = e.h0(bVarArr);
        return h02 == 0 ? f86565d : h02 == 1 ? bVarArr[0] : new a.C1343a(bVarArr);
    }

    public b b(char c5) {
        return new a.c(c5);
    }

    public b c(String str) {
        int B1 = b1.B1(str);
        return B1 == 0 ? f86565d : B1 == 1 ? new a.c(str.charAt(0)) : new a.d(str.toCharArray());
    }

    public b d(char... cArr) {
        int h02 = e.h0(cArr);
        return h02 == 0 ? f86565d : h02 == 1 ? new a.c(cArr[0]) : new a.d(cArr);
    }

    public b e() {
        return f86562a;
    }

    public b f() {
        return f86563b;
    }

    public b g() {
        return f86565d;
    }

    public b h() {
        return f86566e;
    }

    public b i() {
        return f86567f;
    }

    public b j() {
        return f86568g;
    }

    public b k() {
        return f86569h;
    }

    public b l(String str) {
        return b1.G0(str) ? f86565d : m(str.toCharArray());
    }

    public b m(char... cArr) {
        int h02 = e.h0(cArr);
        if (h02 == 0) {
            return f86565d;
        }
        return h02 == 1 ? new a.c(cArr[0]) : new a.b(cArr);
    }

    public b n() {
        return f86570i;
    }

    public b o() {
        return f86571j;
    }
}
