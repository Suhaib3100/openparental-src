package com.google.firebase.remoteconfig.interop.rollouts;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes3.dex */
public final class a implements k2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f18086a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final k2.a f18087b = new a();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: com.google.firebase.remoteconfig.interop.rollouts.a$a, reason: collision with other inner class name */
    private static final class C0226a implements com.google.firebase.encoders.d<d> {

        /* renamed from: a, reason: collision with root package name */
        static final C0226a f18088a = new C0226a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f18089b = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⬯"));

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f18090c = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⬰"));

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f18091d = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⬱"));

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f18092e = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⬲"));

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f18093f = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⬳"));

        private C0226a() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.r(f18089b, dVar.f());
            eVar.r(f18090c, dVar.h());
            eVar.r(f18091d, dVar.d());
            eVar.r(f18092e, dVar.e());
            eVar.b(f18093f, dVar.g());
        }
    }

    private a() {
    }

    @Override // k2.a
    public void a(k2.b<?> bVar) {
        C0226a c0226a = C0226a.f18088a;
        bVar.b(d.class, c0226a);
        bVar.b(b.class, c0226a);
    }
}
