package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.t;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: StreetViewCameraPositionState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u00012\u0019\b\u0006\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lcom/google/maps/android/compose/streetview/a;", "Lkotlin/k2;", "Lkotlin/u;", "init", "a", "(Lld/l;Landroidx/compose/runtime/t;II)Lcom/google/maps/android/compose/streetview/a;", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nStreetViewCameraPositionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewCameraPositionState.kt\ncom/google/maps/android/compose/streetview/StreetViewCameraPositionStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,89:1\n1116#2,6:90\n*S KotlinDebug\n*F\n+ 1 StreetViewCameraPositionState.kt\ncom/google/maps/android/compose/streetview/StreetViewCameraPositionStateKt\n*L\n17#1:90,6\n*E\n"})
/* loaded from: classes6.dex */
public final class b {

    /* compiled from: StreetViewCameraPositionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nStreetViewCameraPositionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewCameraPositionState.kt\ncom/google/maps/android/compose/streetview/StreetViewCameraPositionStateKt$rememberStreetViewCameraPositionState$1\n*L\n1#1,89:1\n*E\n"})
    public static final class a extends n0 implements ld.l<com.google.maps.android.compose.streetview.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f62109b = new a(1);

        public a() {
            super(1);
        }

        public final void a(@fg.l com.google.maps.android.compose.streetview.a aVar) {
            l0.p(aVar, ProtectedSandApp.s("࠙\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(com.google.maps.android.compose.streetview.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    @fg.l
    @androidx.compose.runtime.i
    public static final com.google.maps.android.compose.streetview.a a(@fg.m ld.l<? super com.google.maps.android.compose.streetview.a, k2> lVar, @fg.m t tVar, int i4, int i5) {
        tVar.P(144033085);
        if ((i5 & 1) != 0) {
            lVar = a.f62109b;
        }
        tVar.P(658017866);
        Object Q = tVar.Q();
        if (Q == t.INSTANCE.a()) {
            Q = new com.google.maps.android.compose.streetview.a();
            lVar.invoke(Q);
            tVar.E(Q);
        }
        com.google.maps.android.compose.streetview.a aVar = (com.google.maps.android.compose.streetview.a) Q;
        tVar.p0();
        tVar.p0();
        return aVar;
    }
}
