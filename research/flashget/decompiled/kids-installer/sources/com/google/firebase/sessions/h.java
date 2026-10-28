package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.text.Charsets;

/* compiled from: EventGDTLogger.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\bB\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/h;", "Lcom/google/firebase/sessions/i;", "Lcom/google/firebase/sessions/b0;", "value", "", "c", "sessionEvent", "Lkotlin/m2;", "a", "Lo2/b;", "Lcom/google/android/datatransport/i;", "Lo2/b;", "transportFactoryProvider", "<init>", "(Lo2/b;)V", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final o2.b<com.google.android.datatransport.i> transportFactoryProvider;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final String f18627c = ProtectedSandApp.s("⮑");

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final String f18628d = ProtectedSandApp.s("⮒");

    public h(@d5.d o2.b<com.google.android.datatransport.i> bVar) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("⮓"));
        this.transportFactoryProvider = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(b0 value) {
        String a6 = c0.f18578a.d().a(value);
        kotlin.jvm.internal.l0.o(a6, ProtectedSandApp.s("⮔"));
        byte[] bytes = a6.getBytes(Charsets.f27049b);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("⮕"));
        return bytes;
    }

    @Override // com.google.firebase.sessions.i
    public void a(@d5.d b0 b0Var) {
        kotlin.jvm.internal.l0.p(b0Var, ProtectedSandApp.s("\u2b96"));
        this.transportFactoryProvider.get().b(ProtectedSandApp.s("⮘"), b0.class, com.google.android.datatransport.c.b(ProtectedSandApp.s("⮗")), new com.google.android.datatransport.g() { // from class: com.google.firebase.sessions.g
            @Override // com.google.android.datatransport.g
            public final Object apply(Object obj) {
                byte[] c6;
                c6 = h.this.c((b0) obj);
                return c6;
            }
        }).a(com.google.android.datatransport.d.e(b0Var));
    }
}
