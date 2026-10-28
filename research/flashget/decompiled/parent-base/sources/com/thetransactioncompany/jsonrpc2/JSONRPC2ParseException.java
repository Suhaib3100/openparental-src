package com.thetransactioncompany.jsonrpc2;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class JSONRPC2ParseException extends Exception {

    /* renamed from: d, reason: collision with root package name */
    private static final long f72806d = 3376608778436136410L;

    /* renamed from: e, reason: collision with root package name */
    public static int f72807e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f72808f = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f72809b;

    /* renamed from: c, reason: collision with root package name */
    private String f72810c;

    public JSONRPC2ParseException(String str) {
        super(str);
        this.f72809b = f72807e;
        this.f72810c = null;
    }

    public int a() {
        return this.f72809b;
    }

    public String b() {
        return this.f72810c;
    }

    public JSONRPC2ParseException(String str, String str2) {
        super(str);
        this.f72809b = f72807e;
        this.f72810c = str2;
    }

    public JSONRPC2ParseException(String str, int i4, String str2) {
        super(str);
        int i5 = f72807e;
        this.f72809b = i5;
        this.f72810c = null;
        if (i4 != i5 && i4 != f72808f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("嶐\u0001"));
        }
        this.f72809b = i4;
        this.f72810c = str2;
    }
}
