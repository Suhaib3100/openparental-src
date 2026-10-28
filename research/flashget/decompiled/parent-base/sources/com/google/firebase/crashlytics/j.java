package com.google.firebase.crashlytics;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: FirebaseCrashlytics.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "Lkotlin/Function1;", "Lcom/google/firebase/crashlytics/k;", "Lkotlin/k2;", "Lkotlin/u;", "init", "b", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Lld/l;)V", "Lcom/google/firebase/d;", "a", "(Lcom/google/firebase/d;)Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "crashlytics", "com.google.firebase-firebase-crashlytics"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j {
    @fg.l
    public static final FirebaseCrashlytics a(@fg.l com.google.firebase.d dVar) {
        l0.p(dVar, ProtectedSandApp.s("\ufff9"));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        l0.o(firebaseCrashlytics, ProtectedSandApp.s("\ufffa"));
        return firebaseCrashlytics;
    }

    public static final void b(@fg.l FirebaseCrashlytics firebaseCrashlytics, @fg.l ld.l<? super k, k2> lVar) {
        l0.p(firebaseCrashlytics, ProtectedSandApp.s("\ufff9"));
        l0.p(lVar, ProtectedSandApp.s("\ufffb"));
        lVar.invoke(new k(firebaseCrashlytics));
    }
}
