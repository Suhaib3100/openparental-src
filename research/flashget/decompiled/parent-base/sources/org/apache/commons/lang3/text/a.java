package org.apache.commons.lang3.text;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;

/* compiled from: CompositeFormat.java */
@Deprecated
/* loaded from: classes6.dex */
public class a extends Format {

    /* renamed from: d, reason: collision with root package name */
    private static final long f86137d = -4329119827877627683L;

    /* renamed from: b, reason: collision with root package name */
    private final Format f86138b;

    /* renamed from: c, reason: collision with root package name */
    private final Format f86139c;

    public a(Format format, Format format2) {
        this.f86138b = format;
        this.f86139c = format2;
    }

    public Format b() {
        return this.f86139c;
    }

    public Format c() {
        return this.f86138b;
    }

    public String d(String str) throws ParseException {
        return format(parseObject(str));
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.f86139c.format(obj, stringBuffer, fieldPosition);
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.f86138b.parseObject(str, parsePosition);
    }
}
