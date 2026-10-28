package com.google.firebase.remoteconfig;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes6.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final long f60703a;

    /* renamed from: b, reason: collision with root package name */
    private final long f60704b;

    /* compiled from: FirebaseRemoteConfigSettings.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f60705a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f60706b = com.google.firebase.remoteconfig.internal.n.f60490j;

        @o0
        public r c() {
            return new r(this);
        }

        public long d() {
            return this.f60705a;
        }

        public long e() {
            return this.f60706b;
        }

        @o0
        public b f(long j4) throws IllegalArgumentException {
            if (j4 >= 0) {
                this.f60705a = j4;
                return this;
            }
            throw new IllegalArgumentException(String.format(ProtectedSandApp.s("Є\u0001"), Long.valueOf(j4)));
        }

        @o0
        public b g(long j4) {
            if (j4 < 0) {
                throw new IllegalArgumentException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("Ѕ\u0001"), j4, ProtectedSandApp.s("І\u0001")));
            }
            this.f60706b = j4;
            return this;
        }
    }

    public long a() {
        return this.f60703a;
    }

    public long b() {
        return this.f60704b;
    }

    @o0
    public b c() {
        b bVar = new b();
        bVar.f(a());
        bVar.g(b());
        return bVar;
    }

    private r(b bVar) {
        this.f60703a = bVar.f60705a;
        this.f60704b = bVar.f60706b;
    }
}
