package com.airbnb.lottie.utils;

import com.airbnb.lottie.q0;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LogcatLogger.java */
/* loaded from: classes3.dex */
public class e implements q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f39374a = new HashSet();

    @Override // com.airbnb.lottie.q0
    public void a(String str) {
        c(str, null);
    }

    @Override // com.airbnb.lottie.q0
    public void b(String str, Throwable th) {
        boolean z4 = com.airbnb.lottie.e.f38877a;
    }

    @Override // com.airbnb.lottie.q0
    public void c(String str, Throwable th) {
        Set<String> set = f39374a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    @Override // com.airbnb.lottie.q0
    public void d(String str, Throwable th) {
        boolean z4 = com.airbnb.lottie.e.f38877a;
    }

    @Override // com.airbnb.lottie.q0
    public void debug(String str) {
        d(str, null);
    }
}
