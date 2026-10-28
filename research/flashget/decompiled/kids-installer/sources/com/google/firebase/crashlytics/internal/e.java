package com.google.firebase.crashlytics.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.n;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b0;
import kotlin.jvm.internal.l0;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/crashlytics/internal/e;", "Lcom/google/firebase/remoteconfig/interop/rollouts/f;", "Lcom/google/firebase/remoteconfig/interop/rollouts/e;", "rolloutsState", "Lkotlin/m2;", "a", "Lcom/google/firebase/crashlytics/internal/metadata/n;", "Lcom/google/firebase/crashlytics/internal/metadata/n;", "userMetadata", "<init>", "(Lcom/google/firebase/crashlytics/internal/metadata/n;)V", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class e implements com.google.firebase.remoteconfig.interop.rollouts.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final n userMetadata;

    public e(@d5.d n nVar) {
        l0.p(nVar, ProtectedSandApp.s("⠼"));
        this.userMetadata = nVar;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.f
    public void a(@d5.d com.google.firebase.remoteconfig.interop.rollouts.e eVar) {
        int b02;
        l0.p(eVar, ProtectedSandApp.s("⠽"));
        n nVar = this.userMetadata;
        Set<com.google.firebase.remoteconfig.interop.rollouts.d> b6 = eVar.b();
        l0.o(b6, ProtectedSandApp.s("⠾"));
        b02 = b0.b0(b6, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (com.google.firebase.remoteconfig.interop.rollouts.d dVar : b6) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.i.b(dVar.f(), dVar.d(), dVar.e(), dVar.h(), dVar.g()));
        }
        nVar.t(arrayList);
        g.f().b(ProtectedSandApp.s("⠿"));
    }
}
