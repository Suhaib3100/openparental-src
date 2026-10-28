package org.java_websocket_new.exceptions;

/* loaded from: classes6.dex */
public class InvalidDataException extends Exception {

    /* renamed from: c, reason: collision with root package name */
    private static final long f86974c = 3731842424390998726L;

    /* renamed from: b, reason: collision with root package name */
    private int f86975b;

    public InvalidDataException(int i4) {
        this.f86975b = i4;
    }

    public int a() {
        return this.f86975b;
    }

    public InvalidDataException(int i4, String str) {
        super(str);
        this.f86975b = i4;
    }

    public InvalidDataException(int i4, Throwable th) {
        super(th);
        this.f86975b = i4;
    }

    public InvalidDataException(int i4, String str, Throwable th) {
        super(str, th);
        this.f86975b = i4;
    }
}
