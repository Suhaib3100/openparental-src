package org.apache.commons.lang3;

/* loaded from: classes6.dex */
public class NotImplementedException extends UnsupportedOperationException {

    /* renamed from: c, reason: collision with root package name */
    private static final long f85627c = 20131021;

    /* renamed from: b, reason: collision with root package name */
    private final String f85628b;

    public NotImplementedException() {
        this.f85628b = null;
    }

    public String a() {
        return this.f85628b;
    }

    public NotImplementedException(String str) {
        this(str, (String) null);
    }

    public NotImplementedException(Throwable th) {
        this(th, (String) null);
    }

    public NotImplementedException(String str, Throwable th) {
        this(str, th, null);
    }

    public NotImplementedException(String str, String str2) {
        super(str);
        this.f85628b = str2;
    }

    public NotImplementedException(Throwable th, String str) {
        super(th);
        this.f85628b = str;
    }

    public NotImplementedException(String str, Throwable th, String str2) {
        super(str, th);
        this.f85628b = str2;
    }
}
