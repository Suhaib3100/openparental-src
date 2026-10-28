package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* compiled from: OverflowAvoidingLockSupport.java */
@b0
/* loaded from: classes6.dex */
final class i1 {

    /* renamed from: a, reason: collision with root package name */
    static final long f57874a = 2147483647999999999L;

    private i1() {
    }

    static void a(@zc.a Object obj, long j4) {
        LockSupport.parkNanos(obj, Math.min(j4, f57874a));
    }
}
