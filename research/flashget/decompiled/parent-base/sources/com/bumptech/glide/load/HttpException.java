package com.bumptech.glide.load;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class HttpException extends IOException {

    /* renamed from: c, reason: collision with root package name */
    private static final long f43755c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f43756d = -1;

    /* renamed from: b, reason: collision with root package name */
    private final int f43757b;

    public HttpException(int i4) {
        this(ProtectedSandApp.s("ࡍ"), i4, null);
    }

    public int a() {
        return this.f43757b;
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1, null);
    }

    public HttpException(String str, int i4) {
        this(str, i4, null);
    }

    public HttpException(String str, int i4, @q0 Throwable th) {
        super(str + ProtectedSandApp.s("ࡎ") + i4, th);
        this.f43757b = i4;
    }
}
