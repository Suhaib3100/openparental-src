package com.airbnb.lottie;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;

/* compiled from: LottieConfig.java */
/* loaded from: classes3.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    final com.airbnb.lottie.network.f f39439a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    final com.airbnb.lottie.network.e f39440b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f39441c;

    /* compiled from: LottieConfig.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.q0
        private com.airbnb.lottie.network.f f39442a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        private com.airbnb.lottie.network.e f39443b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f39444c = false;

        /* compiled from: LottieConfig.java */
        class a implements com.airbnb.lottie.network.e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f39445a;

            a(File file) {
                this.f39445a = file;
            }

            @Override // com.airbnb.lottie.network.e
            @androidx.annotation.o0
            public File a() {
                if (this.f39445a.isDirectory()) {
                    return this.f39445a;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("̓"));
            }
        }

        /* compiled from: LottieConfig.java */
        /* renamed from: com.airbnb.lottie.x$b$b, reason: collision with other inner class name */
        class C0665b implements com.airbnb.lottie.network.e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.airbnb.lottie.network.e f39447a;

            C0665b(com.airbnb.lottie.network.e eVar) {
                this.f39447a = eVar;
            }

            @Override // com.airbnb.lottie.network.e
            @androidx.annotation.o0
            public File a() {
                File a5 = this.f39447a.a();
                if (a5.isDirectory()) {
                    return a5;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("̔"));
            }
        }

        @androidx.annotation.o0
        public x a() {
            return new x(this.f39442a, this.f39443b, this.f39444c);
        }

        @androidx.annotation.o0
        public b b(boolean z4) {
            this.f39444c = z4;
            return this;
        }

        @androidx.annotation.o0
        public b c(@androidx.annotation.o0 File file) {
            if (this.f39443b != null) {
                throw new IllegalStateException(ProtectedSandApp.s("̕"));
            }
            this.f39443b = new a(file);
            return this;
        }

        @androidx.annotation.o0
        public b d(@androidx.annotation.o0 com.airbnb.lottie.network.e eVar) {
            if (this.f39443b != null) {
                throw new IllegalStateException(ProtectedSandApp.s("̕"));
            }
            this.f39443b = new C0665b(eVar);
            return this;
        }

        @androidx.annotation.o0
        public b e(@androidx.annotation.o0 com.airbnb.lottie.network.f fVar) {
            this.f39442a = fVar;
            return this;
        }
    }

    private x(@androidx.annotation.q0 com.airbnb.lottie.network.f fVar, @androidx.annotation.q0 com.airbnb.lottie.network.e eVar, boolean z4) {
        this.f39439a = fVar;
        this.f39440b = eVar;
        this.f39441c = z4;
    }
}
