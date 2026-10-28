package com.google.firebase.sessions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;

/* compiled from: SessionGenerator.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u001e\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001d¨\u0006 "}, d2 = {"Lcom/google/firebase/sessions/g0;", "", "Lcom/google/firebase/sessions/m0;", "timeProvider", "Lkotlin/Function0;", "Ljava/util/UUID;", "uuidGenerator", "<init>", "(Lcom/google/firebase/sessions/m0;Lld/a;)V", "", "b", "()Ljava/lang/String;", "Lcom/google/firebase/sessions/b0;", "a", "()Lcom/google/firebase/sessions/b0;", "Lcom/google/firebase/sessions/m0;", "Lld/a;", "c", "Ljava/lang/String;", "firstSessionId", "", "d", "I", "sessionIndex", "<set-?>", "e", "Lcom/google/firebase/sessions/b0;", "currentSession", "", "()Z", "hasGenerateSession", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g0 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m0 timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<UUID> uuidGenerator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String firstSessionId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int sessionIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private b0 currentSession;

    /* compiled from: SessionGenerator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends kotlin.jvm.internal.h0 implements ld.a<UUID> {

        /* renamed from: d, reason: collision with root package name */
        public static final a f60892d = new a();

        a() {
            super(0, UUID.class, ProtectedSandApp.s("Ӟ\u0001"), ProtectedSandApp.s("ӝ\u0001"), 0);
        }

        public final UUID Z() {
            return UUID.randomUUID();
        }

        @Override // ld.a
        public UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: SessionGenerator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/g0$b;", "", "<init>", "()V", "Lcom/google/firebase/sessions/g0;", "a", "()Lcom/google/firebase/sessions/g0;", "instance", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.g0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final g0 a() {
            Object l4 = com.google.firebase.o.c(com.google.firebase.d.f59602a).l(g0.class);
            kotlin.jvm.internal.l0.o(l4, ProtectedSandApp.s("ӟ\u0001"));
            return (g0) l4;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public g0(@fg.l m0 m0Var, @fg.l ld.a<UUID> aVar) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("Ӡ\u0001"));
        kotlin.jvm.internal.l0.p(aVar, ProtectedSandApp.s("ӡ\u0001"));
        this.timeProvider = m0Var;
        this.uuidGenerator = aVar;
        this.firstSessionId = b();
        this.sessionIndex = -1;
    }

    private final String b() {
        String uuid = this.uuidGenerator.invoke().toString();
        kotlin.jvm.internal.l0.o(uuid, ProtectedSandApp.s("Ӣ\u0001"));
        String lowerCase = kotlin.text.v.i2(uuid, ProtectedSandApp.s("ӣ\u0001"), "", false, 4, null).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("Ӥ\u0001"));
        return lowerCase;
    }

    @fg.l
    @f9.a
    public final b0 a() {
        int i4 = this.sessionIndex + 1;
        this.sessionIndex = i4;
        this.currentSession = new b0(i4 == 0 ? this.firstSessionId : b(), this.firstSessionId, this.sessionIndex, this.timeProvider.b());
        return c();
    }

    @fg.l
    public final b0 c() {
        b0 b0Var = this.currentSession;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.l0.S(ProtectedSandApp.s("ӥ\u0001"));
        return null;
    }

    public final boolean d() {
        return this.currentSession != null;
    }

    public /* synthetic */ g0(m0 m0Var, ld.a aVar, int i4, kotlin.jvm.internal.w wVar) {
        this(m0Var, (i4 & 2) != 0 ? a.f60892d : aVar);
    }
}
