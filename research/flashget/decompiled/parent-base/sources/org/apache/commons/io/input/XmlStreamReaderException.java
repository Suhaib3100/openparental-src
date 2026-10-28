package org.apache.commons.io.input;

import java.io.IOException;

/* loaded from: classes4.dex */
public class XmlStreamReaderException extends IOException {

    /* renamed from: g, reason: collision with root package name */
    private static final long f85433g = 1;

    /* renamed from: b, reason: collision with root package name */
    private final String f85434b;

    /* renamed from: c, reason: collision with root package name */
    private final String f85435c;

    /* renamed from: d, reason: collision with root package name */
    private final String f85436d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85437e;

    /* renamed from: f, reason: collision with root package name */
    private final String f85438f;

    public XmlStreamReaderException(String str, String str2, String str3, String str4) {
        this(str, null, null, str2, str3, str4);
    }

    public String a() {
        return this.f85434b;
    }

    public String b() {
        return this.f85438f;
    }

    public String c() {
        return this.f85437e;
    }

    public String d() {
        return this.f85436d;
    }

    public String e() {
        return this.f85435c;
    }

    public XmlStreamReaderException(String str, String str2, String str3, String str4, String str5, String str6) {
        super(str);
        this.f85437e = str2;
        this.f85438f = str3;
        this.f85434b = str4;
        this.f85435c = str5;
        this.f85436d = str6;
    }
}
