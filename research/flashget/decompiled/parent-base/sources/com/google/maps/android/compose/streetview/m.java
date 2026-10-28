package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.m5;
import androidx.compose.runtime.t;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.StreetViewPanorama;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.p;

/* compiled from: StreetViewPanoramaUpdater.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0081\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/google/maps/android/compose/streetview/a;", "cameraPositionState", "", "isPanningGesturesEnabled", "isStreetNamesEnabled", "isUserNavigationEnabled", "isZoomGesturesEnabled", "Lcom/google/maps/android/compose/streetview/f;", "clickListeners", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/streetview/a;ZZZZLcom/google/maps/android/compose/streetview/f;Landroidx/compose/runtime/t;I)V", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nStreetViewPanoramaUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,77:1\n251#2,10:78\n*S KotlinDebug\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt\n*L\n58#1:78,10\n*E\n"})
/* loaded from: classes6.dex */
public final class m {

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/runtime/p$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class a extends n0 implements ld.a<l> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f62177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ld.a aVar) {
            super(0);
            this.f62177b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.streetview.l, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final l invoke() {
            return this.f62177b.invoke();
        }
    }

    /* compiled from: StreetViewPanoramaUpdater.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/maps/android/compose/streetview/l;", "a", "()Lcom/google/maps/android/compose/streetview/l;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetViewPanoramaUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt$StreetViewUpdater$1\n*L\n1#1,77:1\n*E\n"})
    public static final class b extends n0 implements ld.a<l> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.streetview.a f62178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ StreetViewPanorama f62179c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.streetview.f f62180d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.google.maps.android.compose.streetview.a aVar, StreetViewPanorama streetViewPanorama, com.google.maps.android.compose.streetview.f fVar) {
            super(0);
            this.f62178b = aVar;
            this.f62179c = streetViewPanorama;
            this.f62180d = fVar;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke() {
            return new l(this.f62178b, this.f62179c, this.f62180d);
        }
    }

    /* compiled from: StreetViewPanoramaUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/streetview/l;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/streetview/l;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetViewPanoramaUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$1\n*L\n1#1,77:1\n*E\n"})
    static final class c extends n0 implements p<l, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f62181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4) {
            super(2);
            this.f62181b = z4;
        }

        public final void a(@fg.l l lVar, boolean z4) {
            l0.p(lVar, ProtectedSandApp.s("࠵\u0001"));
            lVar.getPanorama().setPanningGesturesEnabled(this.f62181b);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(l lVar, Boolean bool) {
            a(lVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/streetview/l;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/streetview/l;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetViewPanoramaUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$2\n*L\n1#1,77:1\n*E\n"})
    static final class d extends n0 implements p<l, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f62182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4) {
            super(2);
            this.f62182b = z4;
        }

        public final void a(@fg.l l lVar, boolean z4) {
            l0.p(lVar, ProtectedSandApp.s("࠶\u0001"));
            lVar.getPanorama().setStreetNamesEnabled(this.f62182b);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(l lVar, Boolean bool) {
            a(lVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/streetview/l;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/streetview/l;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetViewPanoramaUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$3\n*L\n1#1,77:1\n*E\n"})
    static final class e extends n0 implements p<l, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f62183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4) {
            super(2);
            this.f62183b = z4;
        }

        public final void a(@fg.l l lVar, boolean z4) {
            l0.p(lVar, ProtectedSandApp.s("࠷\u0001"));
            lVar.getPanorama().setUserNavigationEnabled(this.f62183b);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(l lVar, Boolean bool) {
            a(lVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/streetview/l;", "", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/streetview/l;Z)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetViewPanoramaUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$4\n*L\n1#1,77:1\n*E\n"})
    static final class f extends n0 implements p<l, Boolean, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f62184b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4) {
            super(2);
            this.f62184b = z4;
        }

        public final void a(@fg.l l lVar, boolean z4) {
            l0.p(lVar, ProtectedSandApp.s("࠸\u0001"));
            lVar.getPanorama().setZoomGesturesEnabled(this.f62184b);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(l lVar, Boolean bool) {
            a(lVar, bool.booleanValue());
            return k2.f75408a;
        }
    }

    /* compiled from: StreetViewPanoramaUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/maps/android/compose/streetview/l;", "Lcom/google/maps/android/compose/streetview/f;", "it", "Lkotlin/k2;", "a", "(Lcom/google/maps/android/compose/streetview/l;Lcom/google/maps/android/compose/streetview/f;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetViewPanoramaUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt$StreetViewUpdater$2$5\n*L\n1#1,77:1\n*E\n"})
    static final class g extends n0 implements p<l, com.google.maps.android.compose.streetview.f, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f62185b = new g(2);

        public g() {
            super(2);
        }

        public final void a(@fg.l l lVar, @fg.l com.google.maps.android.compose.streetview.f fVar) {
            l0.p(lVar, ProtectedSandApp.s("࠹\u0001"));
            l0.p(fVar, ProtectedSandApp.s("࠺\u0001"));
            lVar.o(fVar);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(l lVar, com.google.maps.android.compose.streetview.f fVar) {
            a(lVar, fVar);
            return k2.f75408a;
        }
    }

    @androidx.compose.runtime.i
    public static final void a(@fg.l com.google.maps.android.compose.streetview.a aVar, boolean z4, boolean z5, boolean z6, boolean z7, @fg.l com.google.maps.android.compose.streetview.f fVar, @fg.m t tVar, int i4) {
        l0.p(aVar, ProtectedSandApp.s("࠻\u0001"));
        l0.p(fVar, ProtectedSandApp.s("࠼\u0001"));
        tVar.P(-647819622);
        androidx.compose.runtime.e<?> s4 = tVar.s();
        l0.n(s4, ProtectedSandApp.s("࠽\u0001"));
        b bVar = new b(aVar, ((com.google.maps.android.compose.streetview.e) s4).getStreetViewPanorama(), fVar);
        tVar.P(1886828752);
        if (!(tVar.s() instanceof com.google.maps.android.compose.streetview.e)) {
            androidx.compose.runtime.p.n();
        }
        tVar.v();
        if (tVar.getInserting()) {
            tVar.F(new a(bVar));
        } else {
            tVar.C();
        }
        m5.j(tVar, Boolean.valueOf(z4), new c(z4));
        m5.j(tVar, Boolean.valueOf(z5), new d(z5));
        m5.j(tVar, Boolean.valueOf(z6), new e(z6));
        m5.j(tVar, Boolean.valueOf(z7), new f(z7));
        m5.j(tVar, fVar, g.f62185b);
        tVar.H();
        tVar.p0();
        tVar.p0();
    }
}
