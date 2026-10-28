package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: SessionGenerator.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/google/firebase/sessions/f0;", "", "", "b", "Lcom/google/firebase/sessions/a0;", "a", "Lcom/google/firebase/sessions/l0;", "Lcom/google/firebase/sessions/l0;", "timeProvider", "Lkotlin/Function0;", "Ljava/util/UUID;", "Lq3/a;", "uuidGenerator", "c", "Ljava/lang/String;", "firstSessionId", "", "d", "I", "sessionIndex", "<set-?>", "e", "Lcom/google/firebase/sessions/a0;", "()Lcom/google/firebase/sessions/a0;", "currentSession", "", "()Z", "hasGenerateSession", "<init>", "(Lcom/google/firebase/sessions/l0;Lq3/a;)V", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final l0 timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final q3.a<UUID> uuidGenerator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final String firstSessionId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int sessionIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a0 currentSession;

    /* compiled from: SessionGenerator.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.h0 implements q3.a<UUID> {

        /* renamed from: x, reason: collision with root package name */
        public static final a f18618x = new a();

        a() {
            super(0, UUID.class, ProtectedSandApp.s("㍔"), ProtectedSandApp.s("㍕"), 0);
        }

        public final UUID A0() {
            return UUID.randomUUID();
        }

        @Override // q3.a
        public UUID n() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: SessionGenerator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/f0$b;", "", "Lcom/google/firebase/sessions/f0;", "a", "()Lcom/google/firebase/sessions/f0;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.sessions.f0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @d5.d
        public final f0 a() {
            Object l5 = com.google.firebase.o.c(com.google.firebase.d.f16581a).l(f0.class);
            kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("᪘"));
            return (f0) l5;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public f0(@d5.d l0 l0Var, @d5.d q3.a<UUID> aVar) {
        kotlin.jvm.internal.l0.p(l0Var, ProtectedSandApp.s("᪙"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("\u1a9a"));
        this.timeProvider = l0Var;
        this.uuidGenerator = aVar;
        this.firstSessionId = b();
        this.sessionIndex = -1;
    }

    private final String b() {
        String i22;
        String uuid = this.uuidGenerator.n().toString();
        kotlin.jvm.internal.l0.o(uuid, ProtectedSandApp.s("\u1a9b"));
        i22 = kotlin.text.e0.i2(uuid, ProtectedSandApp.s("\u1a9c"), "", false, 4, null);
        String lowerCase = i22.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("\u1a9d"));
        return lowerCase;
    }

    @d5.d
    public final a0 a() {
        int i5 = this.sessionIndex + 1;
        this.sessionIndex = i5;
        this.currentSession = new a0(i5 == 0 ? this.firstSessionId : b(), this.firstSessionId, this.sessionIndex, this.timeProvider.b());
        return c();
    }

    @d5.d
    public final a0 c() {
        a0 a0Var = this.currentSession;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("\u1a9e"));
        return null;
    }

    public final boolean d() {
        return this.currentSession != null;
    }

    public /* synthetic */ f0(l0 l0Var, q3.a aVar, int i5, kotlin.jvm.internal.w wVar) {
        this(l0Var, (i5 & 2) != 0 ? a.f18618x : aVar);
    }
}
