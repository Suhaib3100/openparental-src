package com.google.firebase.crashlytics.internal.metadata;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes3.dex */
public final class a implements k2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f15791a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final k2.a f15792b = new a();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.internal.metadata.a$a, reason: collision with other inner class name */
    private static final class C0195a implements com.google.firebase.encoders.d<i> {

        /* renamed from: a, reason: collision with root package name */
        static final C0195a f15793a = new C0195a();

        /* renamed from: b, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f15794b = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⡀"));

        /* renamed from: c, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f15795c = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⡁"));

        /* renamed from: d, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f15796d = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⡂"));

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f15797e = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⡃"));

        /* renamed from: f, reason: collision with root package name */
        private static final com.google.firebase.encoders.c f15798f = com.google.firebase.encoders.c.d(ProtectedSandApp.s("⡄"));

        private C0195a() {
        }

        @Override // com.google.firebase.encoders.d, com.google.firebase.encoders.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(i iVar, com.google.firebase.encoders.e eVar) throws IOException {
            eVar.r(f15794b, iVar.e());
            eVar.r(f15795c, iVar.c());
            eVar.r(f15796d, iVar.d());
            eVar.r(f15797e, iVar.g());
            eVar.b(f15798f, iVar.f());
        }
    }

    private a() {
    }

    @Override // k2.a
    public void a(k2.b<?> bVar) {
        C0195a c0195a = C0195a.f15793a;
        bVar.b(i.class, c0195a);
        bVar.b(b.class, c0195a);
    }
}
