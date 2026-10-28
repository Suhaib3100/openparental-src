package com.google.maps.android.compose;

import androidx.annotation.c1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: ReattachClickListeners.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)Lld/a;", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nReattachClickListeners.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReattachClickListeners.kt\ncom/google/maps/android/compose/ReattachClickListenersKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,23:1\n1116#2,6:24\n*S KotlinDebug\n*F\n+ 1 ReattachClickListeners.kt\ncom/google/maps/android/compose/ReattachClickListenersKt\n*L\n19#1:24,6\n*E\n"})
/* loaded from: classes6.dex */
public final class l1 {

    /* compiled from: ReattachClickListeners.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f61827b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var) {
            super(0);
            this.f61827b = b0Var;
        }

        public final void a() {
            this.f61827b.H();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @androidx.compose.runtime.i
    public static final ld.a<k2> a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(1516905133);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(1516905133, i4, -1, ProtectedSandApp.s("ޡ\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ޢ\u0001"));
        b0 b0Var = (b0) s4;
        tVar.P(-1739785230);
        boolean q02 = tVar.q0(b0Var);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(b0Var);
            tVar.E(Q);
        }
        ld.a<k2> aVar = (ld.a) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return aVar;
    }
}
