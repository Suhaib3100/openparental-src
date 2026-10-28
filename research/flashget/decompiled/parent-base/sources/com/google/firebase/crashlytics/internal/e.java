package com.google.firebase.crashlytics.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.metadata.o;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/firebase/crashlytics/internal/e;", "Lcom/google/firebase/remoteconfig/interop/rollouts/f;", "Lcom/google/firebase/crashlytics/internal/metadata/o;", "userMetadata", "<init>", "(Lcom/google/firebase/crashlytics/internal/metadata/o;)V", "Lcom/google/firebase/remoteconfig/interop/rollouts/e;", "rolloutsState", "Lkotlin/k2;", "a", "(Lcom/google/firebase/remoteconfig/interop/rollouts/e;)V", "Lcom/google/firebase/crashlytics/internal/metadata/o;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCrashlyticsRemoteConfigListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,3:42\n*S KotlinDebug\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n*L\n27#1:41\n27#1:42,3\n*E\n"})
/* loaded from: classes6.dex */
public final class e implements com.google.firebase.remoteconfig.interop.rollouts.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final o userMetadata;

    public e(@fg.l o oVar) {
        l0.p(oVar, ProtectedSandApp.s("ﳕ"));
        this.userMetadata = oVar;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.f
    public void a(@fg.l com.google.firebase.remoteconfig.interop.rollouts.e rolloutsState) {
        l0.p(rolloutsState, ProtectedSandApp.s("ﳖ"));
        o oVar = this.userMetadata;
        Set<com.google.firebase.remoteconfig.interop.rollouts.d> b5 = rolloutsState.b();
        l0.o(b5, ProtectedSandApp.s("ﳗ"));
        Set<com.google.firebase.remoteconfig.interop.rollouts.d> set = b5;
        ArrayList arrayList = new ArrayList(w.b0(set, 10));
        for (com.google.firebase.remoteconfig.interop.rollouts.d dVar : set) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.i.b(dVar.f(), dVar.d(), dVar.e(), dVar.h(), dVar.g()));
        }
        oVar.u(arrayList);
        g.f().b(ProtectedSandApp.s("ﳘ"));
    }
}
