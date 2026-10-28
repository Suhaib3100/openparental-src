package com.bumptech.glide.load;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* loaded from: classes.dex */
public final class HttpException extends IOException {

    /* renamed from: p, reason: collision with root package name */
    private static final long f11050p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f11051q = -1;

    /* renamed from: o, reason: collision with root package name */
    private final int f11052o;

    public HttpException(int i5) {
        this(ProtectedSandApp.s("ð"), i5, null);
    }

    public int a() {
        return this.f11052o;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1, null);
    }

    public HttpException(String str, int i5) {
        this(str, i5, null);
    }

    public HttpException(String str, int i5, @q0 Throwable th) {
        super(str + ProtectedSandApp.s("ñ") + i5, th);
        this.f11052o = i5;
    }
}
