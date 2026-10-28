package com.google.firebase.remoteconfig.interop.rollouts;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes6.dex */
public final class a implements u9.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f60632a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final u9.a f60633b = new a();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: com.google.firebase.remoteconfig.interop.rollouts.a$a, reason: collision with other inner class name */
    private static final class C0931a implements com.google.firebase.encoders.d<d> {

        /* renamed from: a, reason: collision with root package name */
        static final C0931a f60634a = new C0931a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f60635b = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ϑ\u0001"));

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f60636c = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ϒ\u0001"));

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f60637d = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ϓ\u0001"));

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f60638e = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ϔ\u0001"));

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f60639f = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ϕ\u0001"));

        private C0931a() {
        }

        @Override // com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.m(f60635b, dVar.f());
            eVar.m(f60636c, dVar.h());
            eVar.m(f60637d, dVar.d());
            eVar.m(f60638e, dVar.e());
            eVar.c(f60639f, dVar.g());
        }
    }

    private a() {
    }

    @Override // u9.a
    public void a(u9.b<?> bVar) {
        C0931a c0931a = C0931a.f60634a;
        bVar.b(d.class, c0931a);
        bVar.b(b.class, c0931a);
    }
}
