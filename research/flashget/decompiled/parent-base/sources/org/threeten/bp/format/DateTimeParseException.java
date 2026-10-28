package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;

/* loaded from: classes9.dex */
public class DateTimeParseException extends DateTimeException {

    /* renamed from: e, reason: collision with root package name */
    private static final long f88091e = 4304633501674722597L;

    /* renamed from: c, reason: collision with root package name */
    private final String f88092c;

    /* renamed from: d, reason: collision with root package name */
    private final int f88093d;

    public DateTimeParseException(String str, CharSequence charSequence, int i4) {
        super(str);
        this.f88092c = charSequence.toString();
        this.f88093d = i4;
    }

    public int a() {
        return this.f88093d;
    }

    public String b() {
        return this.f88092c;
    }

    public DateTimeParseException(String str, CharSequence charSequence, int i4, Throwable th) {
        super(str, th);
        this.f88092c = charSequence.toString();
        this.f88093d = i4;
    }
}
