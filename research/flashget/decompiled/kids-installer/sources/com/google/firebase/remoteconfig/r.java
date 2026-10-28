package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final long f18312a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18313b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f18314a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f18315b = com.google.firebase.remoteconfig.internal.n.f17957j;

        @o0
        public r c() {
            return new r(this);
        }

        public long d() {
            return this.f18314a;
        }

        public long e() {
            return this.f18315b;
        }

        @o0
        public b f(long j5) throws IllegalArgumentException {
            if (j5 < 0) {
                throw new IllegalArgumentException(String.format(ProtectedSandApp.s("ᨁ"), Long.valueOf(j5)));
            }
            this.f18314a = j5;
            return this;
        }

        @o0
        public b g(long j5) {
            if (j5 >= 0) {
                this.f18315b = j5;
                return this;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("ᨂ") + j5 + ProtectedSandApp.s("ᨃ"));
        }
    }

    public long a() {
        return this.f18312a;
    }

    public long b() {
        return this.f18313b;
    }

    @o0
    public b c() {
        b bVar = new b();
        bVar.f(a());
        bVar.g(b());
        return bVar;
    }

    private r(b bVar) {
        this.f18312a = bVar.f18314a;
        this.f18313b = bVar.f18315b;
    }
}
