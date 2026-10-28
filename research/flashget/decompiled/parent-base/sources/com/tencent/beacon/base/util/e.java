package com.tencent.beacon.base.util;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Pools.java */
/* loaded from: classes6.dex */
public class e<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f71368a;

    /* renamed from: b, reason: collision with root package name */
    private int f71369b;

    public e(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ㆾ\u0001"));
        }
        this.f71368a = new Object[i4];
    }

    private boolean b(@o0 T t4) {
        for (int i4 = 0; i4 < this.f71369b; i4++) {
            if (this.f71368a[i4] == t4) {
                return true;
            }
        }
        return false;
    }

    public T a() {
        int i4 = this.f71369b;
        if (i4 <= 0) {
            return null;
        }
        int i5 = i4 - 1;
        Object[] objArr = this.f71368a;
        T t4 = (T) objArr[i5];
        objArr[i5] = null;
        this.f71369b = i5;
        return t4;
    }

    public boolean a(@o0 T t4) {
        if (!b(t4)) {
            int i4 = this.f71369b;
            Object[] objArr = this.f71368a;
            if (i4 >= objArr.length) {
                return false;
            }
            objArr[i4] = t4;
            this.f71369b = i4 + 1;
            return true;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ㆿ\u0001"));
    }
}
