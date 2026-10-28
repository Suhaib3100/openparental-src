package net.time4j.format;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PredefinedKey.java */
/* loaded from: classes7.dex */
final class q<A> implements net.time4j.engine.c<A> {

    /* renamed from: a, reason: collision with root package name */
    private final String f83108a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<A> f83109b;

    private q(String str, Class<A> cls) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("闬\u0001"));
        }
        if (cls == null) {
            throw new NullPointerException(ProtectedSandApp.s("闫\u0001"));
        }
        this.f83108a = str;
        this.f83109b = cls;
    }

    static <A> q<A> a(String str, Class<A> cls) {
        return new q<>(str, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f83108a.equals(qVar.f83108a) && this.f83109b.equals(qVar.f83109b);
    }

    public int hashCode() {
        return this.f83108a.hashCode();
    }

    @Override // net.time4j.engine.c
    public String name() {
        return this.f83108a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        m2.a(this.f83109b, sb, ProtectedSandApp.s("闭\u0001"));
        sb.append(this.f83108a);
        return sb.toString();
    }

    @Override // net.time4j.engine.c
    public Class<A> type() {
        return this.f83109b;
    }
}
