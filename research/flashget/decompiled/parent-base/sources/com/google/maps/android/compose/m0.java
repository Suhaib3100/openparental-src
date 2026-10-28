package com.google.maps.android.compose;

import android.content.Context;
import android.view.View;
import androidx.annotation.c1;
import androidx.compose.ui.platform.AbstractComposeView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.MapView;
import com.google.maps.android.compose.h;
import com.google.maps.android.compose.k1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: MapComposeViewRender.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/android/gms/maps/MapView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/k2;", "onAddedToWindow", "Landroidx/compose/runtime/z;", "parentContext", "c", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Lld/l;Landroidx/compose/runtime/z;)V", "Lcom/google/maps/android/compose/h$a;", "e", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/z;)Lcom/google/maps/android/compose/h$a;", "Lcom/google/maps/android/compose/f1;", "a", "(Lcom/google/android/gms/maps/MapView;)Lcom/google/maps/android/compose/f1;", "Lcom/google/maps/android/compose/h;", "b", "(Landroidx/compose/runtime/t;I)Lcom/google/maps/android/compose/h;", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMapComposeViewRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapComposeViewRender.kt\ncom/google/maps/android/compose/MapComposeViewRenderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,142:1\n1#2:143\n1116#3,6:144\n*S KotlinDebug\n*F\n+ 1 MapComposeViewRender.kt\ncom/google/maps/android/compose/MapComposeViewRenderKt\n*L\n75#1:144,6\n*E\n"})
/* loaded from: classes6.dex */
public final class m0 {

    /* compiled from: MapComposeViewRender.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/google/maps/android/compose/m0$a", "Lcom/google/maps/android/compose/h;", "Landroidx/compose/ui/platform/AbstractComposeView;", "view", "Lkotlin/Function0;", "Lkotlin/k2;", "onAddedToWindow", "a", "(Landroidx/compose/ui/platform/AbstractComposeView;Lld/a;)V", "Lcom/google/maps/android/compose/h$a;", "b", "(Landroidx/compose/ui/platform/AbstractComposeView;)Lcom/google/maps/android/compose/h$a;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nMapComposeViewRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapComposeViewRender.kt\ncom/google/maps/android/compose/MapComposeViewRenderKt$rememberComposeUiViewRenderer$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n1#2:143\n*E\n"})
    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MapView f61920a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.z f61921b;

        /* compiled from: MapComposeViewRender.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/k2;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.google.maps.android.compose.m0$a$a, reason: collision with other inner class name */
        static final class C0952a extends kotlin.jvm.internal.n0 implements ld.l<View, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<k2> f61922b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0952a(ld.a<k2> aVar) {
                super(1);
                this.f61922b = aVar;
            }

            public final void a(@fg.l View view) {
                kotlin.jvm.internal.l0.p(view, ProtectedSandApp.s("ޭ\u0001"));
                this.f61922b.invoke();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(View view) {
                a(view);
                return k2.f75408a;
            }
        }

        a(MapView mapView, androidx.compose.runtime.z zVar) {
            this.f61920a = mapView;
            this.f61921b = zVar;
        }

        @Override // com.google.maps.android.compose.h
        public void a(@fg.l AbstractComposeView view, @fg.m ld.a<k2> onAddedToWindow) {
            kotlin.jvm.internal.l0.p(view, ProtectedSandApp.s("ޮ\u0001"));
            m0.c(this.f61920a, view, onAddedToWindow != null ? new C0952a(onAddedToWindow) : null, this.f61921b);
        }

        @Override // com.google.maps.android.compose.h
        @fg.l
        public h.a b(@fg.l AbstractComposeView view) {
            kotlin.jvm.internal.l0.p(view, ProtectedSandApp.s("ޮ\u0001"));
            return m0.e(this.f61920a, view, this.f61921b);
        }
    }

    /* compiled from: MapComposeViewRender.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/google/maps/android/compose/m0$b", "Lcom/google/maps/android/compose/h$a;", "Lkotlin/k2;", "dispose", "()V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f1 f61923b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractComposeView f61924c;

        b(f1 f1Var, AbstractComposeView abstractComposeView) {
            this.f61923b = f1Var;
            this.f61924c = abstractComposeView;
        }

        @Override // com.google.maps.android.compose.h.a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            dispose();
        }

        @Override // com.google.maps.android.compose.h.a
        public void dispose() {
            this.f61923b.removeView(this.f61924c);
        }
    }

    private static final f1 a(MapView mapView) {
        int i4 = k1.e.f61686o0;
        f1 f1Var = (f1) mapView.findViewById(i4);
        if (f1Var != null) {
            return f1Var;
        }
        Context context = mapView.getContext();
        kotlin.jvm.internal.l0.o(context, ProtectedSandApp.s("ޯ\u0001"));
        f1 f1Var2 = new f1(context);
        f1Var2.setId(i4);
        mapView.addView(f1Var2);
        return f1Var2;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @androidx.compose.runtime.i
    public static final h b(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(124209494);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(124209494, i4, -1, ProtectedSandApp.s("ް\u0001"));
        }
        androidx.compose.runtime.e<?> s4 = tVar.s();
        kotlin.jvm.internal.l0.n(s4, ProtectedSandApp.s("ޱ\u0001"));
        MapView mapView = ((b0) s4).getMapView();
        androidx.compose.runtime.z u4 = androidx.compose.runtime.p.u(tVar, 0);
        tVar.P(2119739299);
        boolean q02 = tVar.q0(u4);
        Object Q = tVar.Q();
        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
            Q = new a(mapView, u4);
            tVar.E(Q);
        }
        a aVar = (a) Q;
        tVar.p0();
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return aVar;
    }

    public static final void c(@fg.l MapView mapView, @fg.l AbstractComposeView abstractComposeView, @fg.m ld.l<? super View, k2> lVar, @fg.l androidx.compose.runtime.z zVar) {
        kotlin.jvm.internal.l0.p(mapView, ProtectedSandApp.s("\u07b2\u0001"));
        kotlin.jvm.internal.l0.p(abstractComposeView, ProtectedSandApp.s("\u07b3\u0001"));
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("\u07b4\u0001"));
        h.a e4 = e(mapView, abstractComposeView, zVar);
        if (lVar != null) {
            try {
                lVar.invoke(abstractComposeView);
                k2 k2Var = k2.f75408a;
            } finally {
            }
        }
        kotlin.io.b.a(e4, null);
    }

    public static /* synthetic */ void d(MapView mapView, AbstractComposeView abstractComposeView, ld.l lVar, androidx.compose.runtime.z zVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            lVar = null;
        }
        c(mapView, abstractComposeView, lVar, zVar);
    }

    @fg.l
    public static final h.a e(@fg.l MapView mapView, @fg.l AbstractComposeView abstractComposeView, @fg.l androidx.compose.runtime.z zVar) {
        kotlin.jvm.internal.l0.p(mapView, ProtectedSandApp.s("\u07b2\u0001"));
        kotlin.jvm.internal.l0.p(abstractComposeView, ProtectedSandApp.s("\u07b3\u0001"));
        kotlin.jvm.internal.l0.p(zVar, ProtectedSandApp.s("\u07b4\u0001"));
        f1 a5 = a(mapView);
        a5.addView(abstractComposeView);
        abstractComposeView.t(zVar);
        return new b(a5, abstractComposeView);
    }
}
