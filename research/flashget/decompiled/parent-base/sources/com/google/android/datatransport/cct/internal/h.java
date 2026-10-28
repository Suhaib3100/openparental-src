package com.google.android.datatransport.cct.internal;

import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.cct.internal.r;

/* compiled from: AutoValue_ExternalPRequestContext.java */
/* loaded from: classes5.dex */
final class h extends r {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f51890a;

    /* compiled from: AutoValue_ExternalPRequestContext.java */
    static final class b extends r.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f51891a;

        b() {
        }

        @Override // com.google.android.datatransport.cct.internal.r.a
        public r a() {
            return new h(this.f51891a);
        }

        @Override // com.google.android.datatransport.cct.internal.r.a
        public r.a b(@q0 Integer num) {
            this.f51891a = num;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.internal.r
    @q0
    public Integer b() {
        return this.f51890a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f51890a;
        Integer b5 = ((r) obj).b();
        return num == null ? b5 == null : num.equals(b5);
    }

    public int hashCode() {
        Integer num = this.f51890a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return ProtectedSandApp.s("씭") + this.f51890a + ProtectedSandApp.s("씮");
    }

    private h(@q0 Integer num) {
        this.f51890a = num;
    }
}
