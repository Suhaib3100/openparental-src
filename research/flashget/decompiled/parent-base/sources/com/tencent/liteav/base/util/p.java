package com.tencent.liteav.base.util;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final class p<T> {

    /* renamed from: a, reason: collision with root package name */
    private T f71957a;

    /* renamed from: b, reason: collision with root package name */
    private Callable<T> f71958b;

    public p(Callable<T> callable) {
        this.f71958b = callable;
    }

    public final void a(T t4) {
        synchronized (this) {
            this.f71957a = t4;
        }
    }

    public final T a() {
        T t4 = this.f71957a;
        if (t4 instanceof String) {
            if (!TextUtils.isEmpty((CharSequence) t4)) {
                return this.f71957a;
            }
        } else if (t4 != null) {
            return t4;
        }
        synchronized (this) {
            try {
                T t5 = this.f71957a;
                if (t5 instanceof String) {
                    if (!TextUtils.isEmpty((CharSequence) t5)) {
                        return this.f71957a;
                    }
                } else if (t5 != null) {
                    return t5;
                }
                try {
                    this.f71957a = this.f71958b.call();
                } catch (Exception e4) {
                    e4.printStackTrace();
                    LiteavLog.e(ProtectedSandApp.s("叁\u0001"), ProtectedSandApp.s("参\u0001") + e4.getMessage());
                }
                return this.f71957a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
