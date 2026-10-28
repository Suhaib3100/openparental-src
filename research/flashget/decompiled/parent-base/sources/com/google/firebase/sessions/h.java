package com.google.firebase.sessions;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: EventGDTLogger.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/h;", "Lcom/google/firebase/sessions/i;", "Ly9/b;", "Lcom/google/android/datatransport/m;", "transportFactoryProvider", "<init>", "(Ly9/b;)V", "Lcom/google/firebase/sessions/c0;", "value", "", "c", "(Lcom/google/firebase/sessions/c0;)[B", "sessionEvent", "Lkotlin/k2;", "a", "(Lcom/google/firebase/sessions/c0;)V", "Ly9/b;", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final y9.b<com.google.android.datatransport.m> transportFactoryProvider;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final String f60894c = ProtectedSandApp.s("Ӳ\u0001");

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final String f60895d = ProtectedSandApp.s("ӳ\u0001");

    public h(@fg.l y9.b<com.google.android.datatransport.m> bVar) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("Ӵ\u0001"));
        this.transportFactoryProvider = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(c0 value) {
        String a5 = d0.f60857a.d().a(value);
        kotlin.jvm.internal.l0.o(a5, ProtectedSandApp.s("ӵ\u0001"));
        byte[] bytes = a5.getBytes(kotlin.text.f.UTF_8);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("Ӷ\u0001"));
        return bytes;
    }

    @Override // com.google.firebase.sessions.i
    public void a(@fg.l c0 sessionEvent) {
        kotlin.jvm.internal.l0.p(sessionEvent, ProtectedSandApp.s("ӷ\u0001"));
        this.transportFactoryProvider.get().b(ProtectedSandApp.s("ӳ\u0001"), c0.class, com.google.android.datatransport.e.b(ProtectedSandApp.s("Ӹ\u0001")), new com.google.android.datatransport.k() { // from class: com.google.firebase.sessions.g
            @Override // com.google.android.datatransport.k
            public final Object apply(Object obj) {
                byte[] c5;
                c5 = h.this.c((c0) obj);
                return c5;
            }
        }).b(com.google.android.datatransport.f.j(sessionEvent));
    }
}
