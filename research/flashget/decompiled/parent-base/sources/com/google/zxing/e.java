package com.google.zxing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Dimension.java */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f62903a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62904b;

    public e(int i4, int i5) {
        if (i4 < 0 || i5 < 0) {
            throw new IllegalArgumentException();
        }
        this.f62903a = i4;
        this.f62904b = i5;
    }

    public int a() {
        return this.f62904b;
    }

    public int b() {
        return this.f62903a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f62903a == eVar.f62903a && this.f62904b == eVar.f62904b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f62903a * 32713) + this.f62904b;
    }

    public String toString() {
        return this.f62903a + ProtectedSandApp.s("ન\u0001") + this.f62904b;
    }
}
