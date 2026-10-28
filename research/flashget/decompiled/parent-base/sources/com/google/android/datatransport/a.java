package com.google.android.datatransport;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes5.dex */
final class a<T> extends f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f51746a;

    /* renamed from: b, reason: collision with root package name */
    private final T f51747b;

    /* renamed from: c, reason: collision with root package name */
    private final h f51748c;

    /* renamed from: d, reason: collision with root package name */
    private final i f51749d;

    /* renamed from: e, reason: collision with root package name */
    private final g f51750e;

    a(@q0 Integer num, T t4, h hVar, @q0 i iVar, @q0 g gVar) {
        this.f51746a = num;
        if (t4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("쒤"));
        }
        this.f51747b = t4;
        if (hVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("쒣"));
        }
        this.f51748c = hVar;
        this.f51749d = iVar;
        this.f51750e = gVar;
    }

    @Override // com.google.android.datatransport.f
    @q0
    public Integer a() {
        return this.f51746a;
    }

    @Override // com.google.android.datatransport.f
    @q0
    public g b() {
        return this.f51750e;
    }

    @Override // com.google.android.datatransport.f
    public T c() {
        return this.f51747b;
    }

    @Override // com.google.android.datatransport.f
    public h d() {
        return this.f51748c;
    }

    @Override // com.google.android.datatransport.f
    @q0
    public i e() {
        return this.f51749d;
    }

    public boolean equals(Object obj) {
        i iVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        Integer num = this.f51746a;
        if (num != null ? num.equals(fVar.a()) : fVar.a() == null) {
            if (this.f51747b.equals(fVar.c()) && this.f51748c.equals(fVar.d()) && ((iVar = this.f51749d) != null ? iVar.equals(fVar.e()) : fVar.e() == null)) {
                g gVar = this.f51750e;
                if (gVar == null) {
                    if (fVar.b() == null) {
                        return true;
                    }
                } else if (gVar.equals(fVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f51746a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f51747b.hashCode()) * 1000003) ^ this.f51748c.hashCode()) * 1000003;
        i iVar = this.f51749d;
        int hashCode2 = (hashCode ^ (iVar == null ? 0 : iVar.hashCode())) * 1000003;
        g gVar = this.f51750e;
        return hashCode2 ^ (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return ProtectedSandApp.s("쒥") + this.f51746a + ProtectedSandApp.s("쒦") + this.f51747b + ProtectedSandApp.s("쒧") + this.f51748c + ProtectedSandApp.s("쒨") + this.f51749d + ProtectedSandApp.s("쒩") + this.f51750e + ProtectedSandApp.s("쒪");
    }
}
