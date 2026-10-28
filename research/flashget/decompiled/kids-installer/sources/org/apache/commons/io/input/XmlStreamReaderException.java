package org.apache.commons.io.input;

import java.io.IOException;

/* loaded from: classes5.dex */
public class XmlStreamReaderException extends IOException {

    /* renamed from: t, reason: collision with root package name */
    private static final long f31916t = 1;

    /* renamed from: o, reason: collision with root package name */
    private final String f31917o;

    /* renamed from: p, reason: collision with root package name */
    private final String f31918p;

    /* renamed from: q, reason: collision with root package name */
    private final String f31919q;

    /* renamed from: r, reason: collision with root package name */
    private final String f31920r;

    /* renamed from: s, reason: collision with root package name */
    private final String f31921s;

    public XmlStreamReaderException(String str, String str2, String str3, String str4) {
        this(str, null, null, str2, str3, str4);
    }

    public String a() {
        return this.f31917o;
    }

    public String b() {
        return this.f31921s;
    }

    public String c() {
        return this.f31920r;
    }

    public String d() {
        return this.f31919q;
    }

    public String e() {
        return this.f31918p;
    }

    public XmlStreamReaderException(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.f31920r = str2;
        this.f31921s = str3;
        this.f31917o = str4;
        this.f31918p = str5;
        this.f31919q = str6;
    }
}
