package com.tencent.liteav.base;

import android.os.StrictMode;
import java.io.Closeable;

/* loaded from: classes7.dex */
public final class b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f71783a;

    /* renamed from: b, reason: collision with root package name */
    private final StrictMode.VmPolicy f71784b;

    private b(StrictMode.ThreadPolicy threadPolicy) {
        this.f71783a = threadPolicy;
        this.f71784b = null;
    }

    public static b a() {
        return new b(StrictMode.allowThreadDiskWrites(), (byte) 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f71783a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f71784b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private b(StrictMode.ThreadPolicy threadPolicy, byte b5) {
        this(threadPolicy);
    }
}
