package com.google.android.datatransport;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AutoValue_ProductData.java */
/* loaded from: classes5.dex */
final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f51757a;

    c(@q0 Integer num) {
        this.f51757a = num;
    }

    @Override // com.google.android.datatransport.i
    @q0
    public Integer a() {
        return this.f51757a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        Integer num = this.f51757a;
        Integer a5 = ((i) obj).a();
        return num == null ? a5 == null : num.equals(a5);
    }

    public int hashCode() {
        Integer num = this.f51757a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("쒯") + this.f51757a + ProtectedSandApp.s("쒰");
    }
}
