package com.google.firebase.sessions;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/y;", "", "", "sessionId", "Lkotlin/m2;", "b", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = Companion.f18902a;

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/y$a;", "", "Lcom/google/firebase/sessions/y;", "a", "()Lcom/google/firebase/sessions/y;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.sessions.y$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18902a = new Companion();

        private Companion() {
        }

        @d5.d
        public final y a() {
            Object l5 = com.google.firebase.o.c(com.google.firebase.d.f16581a).l(y.class);
            kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("\u1af3"));
            return (y) l5;
        }
    }

    @d5.e
    String a();

    void b(@d5.d String str);
}
