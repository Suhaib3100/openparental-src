package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes6.dex */
public final class a implements u9.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f58893a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final u9.a f58894b = new a();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.metadata.a$a, reason: collision with other inner class name */
    private static final class C0898a implements com.google.firebase.encoders.d<i> {

        /* renamed from: a, reason: collision with root package name */
        static final C0898a f58895a = new C0898a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f58896b = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ﳮ"));

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f58897c = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ﳯ"));

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f58898d = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ﳰ"));

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f58899e = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ﳱ"));

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f58900f = com.google.firebase.encoders.c.d(ProtectedSandApp.s("ﳲ"));

        private C0898a() {
        }

        @Override // com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.m(f58896b, iVar.e());
            eVar.m(f58897c, iVar.c());
            eVar.m(f58898d, iVar.d());
            eVar.m(f58899e, iVar.g());
            eVar.c(f58900f, iVar.f());
        }
    }

    private a() {
    }

    @Override // u9.a
    public void a(u9.b<?> bVar) {
        C0898a c0898a = C0898a.f58895a;
        bVar.b(i.class, c0898a);
        bVar.b(b.class, c0898a);
    }
}
