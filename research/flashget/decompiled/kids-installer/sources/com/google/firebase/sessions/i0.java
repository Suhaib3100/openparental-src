package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;

/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/i0;", "", "Landroid/os/Messenger;", "callback", "Landroid/content/ServiceConnection;", "serviceConnection", "Lkotlin/m2;", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface i0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = Companion.f18646a;

    /* compiled from: SessionLifecycleServiceBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/i0$a;", "", "Lcom/google/firebase/sessions/i0;", "a", "()Lcom/google/firebase/sessions/i0;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.sessions.i0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f18646a = new Companion();

        private Companion() {
        }

        @d5.d
        public final i0 a() {
            Object l5 = com.google.firebase.o.c(com.google.firebase.d.f16581a).l(i0.class);
            kotlin.jvm.internal.l0.o(l5, ProtectedSandApp.s("᪺"));
            return (i0) l5;
        }
    }

    void a(@d5.d Messenger messenger, @d5.d ServiceConnection serviceConnection);
}
