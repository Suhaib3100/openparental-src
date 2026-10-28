package org.apache.commons.io;

import java.nio.charset.Charset;

/* compiled from: Charsets.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f31814a = Charset.forName("ISO-8859-1");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f31815b = Charset.forName("US-ASCII");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f31816c = Charset.forName("UTF-16");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f31817d = Charset.forName("UTF-16BE");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f31818e = Charset.forName("UTF-16LE");

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f31819f = Charset.forName("UTF-8");

    public static Charset a(String str) {
        return str == null ? Charset.defaultCharset() : Charset.forName(str);
    }

    public static Charset b(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
