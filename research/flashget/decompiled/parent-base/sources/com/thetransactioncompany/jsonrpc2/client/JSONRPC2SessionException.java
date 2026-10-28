package com.thetransactioncompany.jsonrpc2.client;

/* loaded from: classes7.dex */
public class JSONRPC2SessionException extends Exception {

    /* renamed from: c, reason: collision with root package name */
    public static final int f72816c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f72817d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f72818e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f72819f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f72820g = 4;

    /* renamed from: h, reason: collision with root package name */
    public static final int f72821h = 5;

    /* renamed from: b, reason: collision with root package name */
    private int f72822b;

    public JSONRPC2SessionException(String str) {
        super(str);
        this.f72822b = 0;
    }

    public int a() {
        return this.f72822b;
    }

    public JSONRPC2SessionException(String str, int i4) {
        super(str);
        this.f72822b = i4;
    }

    public JSONRPC2SessionException(String str, int i4, Throwable th) {
        super(str, th);
        this.f72822b = i4;
    }
}
