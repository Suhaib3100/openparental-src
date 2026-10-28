package com.google.zxing.oned.rss;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DataCharacter.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f63067a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63068b;

    public b(int i4, int i5) {
        this.f63067a = i4;
        this.f63068b = i5;
    }

    public final int a() {
        return this.f63068b;
    }

    public final int b() {
        return this.f63067a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f63067a == bVar.f63067a && this.f63068b == bVar.f63068b;
    }

    public final int hashCode() {
        return this.f63067a ^ this.f63068b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f63067a);
        sb.append(ProtectedSandApp.s("୩\u0001"));
        return androidx.view.e.a(sb, this.f63068b, ')');
    }
}
