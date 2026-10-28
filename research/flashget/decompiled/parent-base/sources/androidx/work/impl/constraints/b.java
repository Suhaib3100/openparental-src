package androidx.work.impl.constraints;

import androidx.annotation.o0;

/* compiled from: NetworkState.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f36112a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36113b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36114c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36115d;

    public b(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        this.f36112a = isConnected;
        this.f36113b = isValidated;
        this.f36114c = isMetered;
        this.f36115d = isNotRoaming;
    }

    public boolean a() {
        return this.f36112a;
    }

    public boolean b() {
        return this.f36114c;
    }

    public boolean c() {
        return this.f36115d;
    }

    public boolean d() {
        return this.f36113b;
    }

    public boolean equals(Object o4) {
        if (this == o4) {
            return true;
        }
        if (!(o4 instanceof b)) {
            return false;
        }
        b bVar = (b) o4;
        return this.f36112a == bVar.f36112a && this.f36113b == bVar.f36113b && this.f36114c == bVar.f36114c && this.f36115d == bVar.f36115d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f36112a;
        int i4 = r02;
        if (this.f36113b) {
            i4 = r02 + 16;
        }
        int i5 = i4;
        if (this.f36114c) {
            i5 = i4 + 256;
        }
        return this.f36115d ? i5 + 4096 : i5;
    }

    @o0
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f36112a), Boolean.valueOf(this.f36113b), Boolean.valueOf(this.f36114c), Boolean.valueOf(this.f36115d));
    }
}
