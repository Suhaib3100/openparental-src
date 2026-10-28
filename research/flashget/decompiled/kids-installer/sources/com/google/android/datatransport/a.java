package com.google.android.datatransport;

import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes3.dex */
final class a<T> extends d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f12241a;

    /* renamed from: b, reason: collision with root package name */
    private final T f12242b;

    /* renamed from: c, reason: collision with root package name */
    private final e f12243c;

    a(@q0 Integer num, T t5, e eVar) {
        this.f12241a = num;
        if (t5 == null) {
            throw new NullPointerException(ProtectedSandApp.s("\u1f47"));
        }
        this.f12242b = t5;
        if (eVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("\u1f46"));
        }
        this.f12243c = eVar;
    }

    @Override // com.google.android.datatransport.d
    @q0
    public Integer a() {
        return this.f12241a;
    }

    @Override // com.google.android.datatransport.d
    public T b() {
        return this.f12242b;
    }

    @Override // com.google.android.datatransport.d
    public e c() {
        return this.f12243c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        Integer num = this.f12241a;
        if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
            if (this.f12242b.equals(dVar.b()) && this.f12243c.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f12241a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f12242b.hashCode()) * 1000003) ^ this.f12243c.hashCode();
    }

    public String toString() {
        return ProtectedSandApp.s("Ὀ") + this.f12241a + ProtectedSandApp.s("Ὁ") + this.f12242b + ProtectedSandApp.s("Ὂ") + this.f12243c + ProtectedSandApp.s("Ὃ");
    }
}
