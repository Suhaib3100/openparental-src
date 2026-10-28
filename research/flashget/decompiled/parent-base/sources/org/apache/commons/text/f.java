package org.apache.commons.text;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;

/* compiled from: CompositeFormat.java */
/* loaded from: classes3.dex */
public class f extends Format {

    /* renamed from: d, reason: collision with root package name */
    private static final long f86443d = -4329119827877627683L;

    /* renamed from: b, reason: collision with root package name */
    private final Format f86444b;

    /* renamed from: c, reason: collision with root package name */
    private final Format f86445c;

    public f(Format format, Format format2) {
        this.f86444b = format;
        this.f86445c = format2;
    }

    public Format b() {
        return this.f86445c;
    }

    public Format c() {
        return this.f86444b;
    }

    public String d(String str) throws ParseException {
        return format(parseObject(str));
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.f86445c.format(obj, stringBuffer, fieldPosition);
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.f86444b.parseObject(str, parsePosition);
    }
}
