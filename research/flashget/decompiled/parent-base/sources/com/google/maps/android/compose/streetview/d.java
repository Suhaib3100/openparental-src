package com.google.maps.android.compose.streetview;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.n;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.w0;
import androidx.compose.runtime.x;
import androidx.compose.runtime.y;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.o0;
import androidx.compose.ui.q;
import androidx.view.AbstractC1450w;
import androidx.view.InterfaceC1416b0;
import androidx.view.InterfaceC1423e0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.maps.android.compose.streetview.m;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.z0;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: StreetView.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u001c\u001a\u00020\u001b*\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0013\b\b\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0002\b\u0019H\u0082H¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\"\u001a\u00020!*\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010%\u001a\u00020$*\u00020\u0013H\u0002¢\u0006\u0004\b%\u0010&¨\u0006.²\u0006\f\u0010'\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010*\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lcom/google/maps/android/compose/streetview/a;", "cameraPositionState", "Lkotlin/Function0;", "Lcom/google/android/gms/maps/StreetViewPanoramaOptions;", "streetViewPanoramaOptionsFactory", "", "isPanningGesturesEnabled", "isStreetNamesEnabled", "isUserNavigationEnabled", "isZoomGesturesEnabled", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "Lkotlin/k2;", "onClick", "onLongClick", "b", "(Landroidx/compose/ui/q;Lcom/google/maps/android/compose/streetview/a;Lld/a;ZZZZLld/l;Lld/l;Landroidx/compose/runtime/t;II)V", "Lcom/google/android/gms/maps/StreetViewPanoramaView;", "streetView", "i", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/runtime/z;", "parent", "Landroidx/compose/runtime/i;", "content", "Landroidx/compose/runtime/y;", "v", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Landroidx/compose/runtime/z;Lld/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/k2;", "Landroidx/lifecycle/w$a;", "previousState", "Landroidx/lifecycle/b0;", "t", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Landroidx/compose/runtime/k2;)Landroidx/lifecycle/b0;", "Landroid/content/ComponentCallbacks;", "s", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;)Landroid/content/ComponentCallbacks;", "currentCameraPositionState", "currentIsPanningGestureEnabled", "currentIsStreetNamesEnabled", "currentIsUserNavigationEnabled", "currentIsZoomGesturesEnabled", "Lcom/google/maps/android/compose/streetview/f;", "clickListeners", "maps-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nStreetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt\n+ 2 StreetViewCameraPositionState.kt\ncom/google/maps/android/compose/streetview/StreetViewCameraPositionStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 StreetViewPanoramaView.kt\ncom/google/maps/android/ktx/StreetViewPanoramaViewKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,178:1\n16#2,2:179\n18#2:184\n1116#3,3:181\n1119#3,3:185\n1116#3,6:189\n1116#3,6:197\n74#4:188\n74#4:195\n74#4:196\n23#5,5:203\n81#6:208\n81#6:209\n81#6:210\n81#6:211\n81#6:212\n81#6:213\n*S KotlinDebug\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt\n*L\n69#1:179,2\n69#1:184\n69#1:181,3\n69#1:185,3\n82#1:189,6\n118#1:197,6\n80#1:188\n116#1:195\n117#1:196\n138#1:203,5\n87#1:208\n88#1:209\n89#1:210\n90#1:211\n91#1:212\n92#1:213\n*E\n"})
/* loaded from: classes6.dex */
public final class d {

    /* compiled from: StreetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends n0 implements ld.a<StreetViewPanoramaOptions> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f62112b = new a(0);

        a() {
            super(0);
        }

        @fg.l
        public final StreetViewPanoramaOptions a() {
            return new StreetViewPanoramaOptions();
        }

        @Override // ld.a
        public StreetViewPanoramaOptions invoke() {
            return new StreetViewPanoramaOptions();
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends n0 implements ld.l<StreetViewPanoramaOrientation, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f62113b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            l0.p(streetViewPanoramaOrientation, ProtectedSandApp.s("ࠚ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            a(streetViewPanoramaOrientation);
            return k2.f75408a;
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends n0 implements ld.l<StreetViewPanoramaOrientation, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f62114b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            l0.p(streetViewPanoramaOrientation, ProtectedSandApp.s("ࠛ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            a(streetViewPanoramaOrientation);
            return k2.f75408a;
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "it", "Lcom/google/android/gms/maps/StreetViewPanoramaView;", "a", "(Landroid/content/Context;)Lcom/google/android/gms/maps/StreetViewPanoramaView;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.google.maps.android.compose.streetview.d$d, reason: collision with other inner class name */
    static final class C0953d extends n0 implements ld.l<Context, StreetViewPanoramaView> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StreetViewPanoramaView f62115b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0953d(StreetViewPanoramaView streetViewPanoramaView) {
            super(1);
            this.f62115b = streetViewPanoramaView;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StreetViewPanoramaView invoke(@fg.l Context context) {
            l0.p(context, ProtectedSandApp.s("ࠜ\u0001"));
            return this.f62115b;
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/StreetViewPanoramaView;", "it", "Lkotlin/k2;", "a", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends n0 implements ld.l<StreetViewPanoramaView, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f62116b = new e(1);

        e() {
            super(1);
        }

        public final void a(@fg.l StreetViewPanoramaView streetViewPanoramaView) {
            l0.p(streetViewPanoramaView, ProtectedSandApp.s("ࠝ\u0001"));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(StreetViewPanoramaView streetViewPanoramaView) {
            a(streetViewPanoramaView);
            return k2.f75408a;
        }
    }

    /* compiled from: StreetView.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.maps.android.compose.streetview.StreetViewKt$StreetView$6", f = "StreetView.kt", i = {0, 0, 0, 1}, l = {181, 193}, m = "invokeSuspend", n = {"content$iv", "$completion$iv", "$this$awaitStreetViewPanorama$iv$iv", "composition$iv"}, s = {"L$1", "L$2", "L$3", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt$StreetView$6\n+ 2 GoogleMap.kt\ncom/google/maps/android/compose/GoogleMapKt\n+ 3 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt\n+ 4 StreetViewPanoramaView.kt\ncom/google/maps/android/ktx/StreetViewPanoramaViewKt\n*L\n1#1,178:1\n152#2:179\n153#2,4:192\n138#3:180\n139#3,6:186\n23#4,5:181\n*S KotlinDebug\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt$StreetView$6\n*L\n99#1:179\n99#1:192,4\n100#1:180\n100#1:186,6\n100#1:181,5\n*E\n"})
    static final class f extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f62117b;

        /* renamed from: c, reason: collision with root package name */
        Object f62118c;

        /* renamed from: d, reason: collision with root package name */
        Object f62119d;

        /* renamed from: e, reason: collision with root package name */
        Object f62120e;

        /* renamed from: f, reason: collision with root package name */
        int f62121f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ StreetViewPanoramaView f62122g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ z f62123h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ b5<com.google.maps.android.compose.streetview.a> f62124i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ b5<Boolean> f62125j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ b5<Boolean> f62126k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ b5<Boolean> f62127l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ b5<Boolean> f62128m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ b5<com.google.maps.android.compose.streetview.f> f62129n;

        /* compiled from: StreetView.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 9, 0})
        @r1({"SMAP\nStreetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt$StreetView$6$1$1\n+ 2 StreetViewPanoramaUpdater.kt\ncom/google/maps/android/compose/streetview/StreetViewPanoramaUpdaterKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,178:1\n57#2:179\n56#2,3:180\n67#2,10:191\n77#2:203\n251#3,8:183\n259#3,2:201\n*S KotlinDebug\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt$StreetView$6$1$1\n*L\n101#1:179\n101#1:180,3\n101#1:191,10\n101#1:203\n101#1:183,8\n101#1:201,2\n*E\n"})
        static final class a extends n0 implements p<t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<com.google.maps.android.compose.streetview.a> f62130b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b5<Boolean> f62131c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b5<Boolean> f62132d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b5<Boolean> f62133e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b5<Boolean> f62134f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b5<com.google.maps.android.compose.streetview.f> f62135g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b5<com.google.maps.android.compose.streetview.a> b5Var, b5<Boolean> b5Var2, b5<Boolean> b5Var3, b5<Boolean> b5Var4, b5<Boolean> b5Var5, b5<com.google.maps.android.compose.streetview.f> b5Var6) {
                super(2);
                this.f62130b = b5Var;
                this.f62131c = b5Var2;
                this.f62132d = b5Var3;
                this.f62133e = b5Var4;
                this.f62134f = b5Var5;
                this.f62135g = b5Var6;
            }

            @n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m t tVar, int i4) {
                if ((i4 & 11) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (x.b0()) {
                    x.r0(-1039809540, i4, -1, ProtectedSandApp.s("ࠞ\u0001"));
                }
                com.google.maps.android.compose.streetview.a value = this.f62130b.getValue();
                boolean d5 = d.d(this.f62131c);
                boolean e4 = d.e(this.f62132d);
                boolean f4 = d.f(this.f62133e);
                boolean g4 = d.g(this.f62134f);
                com.google.maps.android.compose.streetview.f value2 = this.f62135g.getValue();
                tVar.P(-647819622);
                androidx.compose.runtime.e<?> s4 = tVar.s();
                l0.n(s4, ProtectedSandApp.s("ࠟ\u0001"));
                m.b bVar = new m.b(value, ((com.google.maps.android.compose.streetview.e) s4).getStreetViewPanorama(), value2);
                tVar.P(1886828752);
                if (!(tVar.s() instanceof com.google.maps.android.compose.streetview.e)) {
                    androidx.compose.runtime.p.n();
                }
                tVar.v();
                if (tVar.getInserting()) {
                    tVar.F(new m.a(bVar));
                } else {
                    tVar.C();
                }
                m5.j(tVar, Boolean.valueOf(d5), new m.c(d5));
                m5.j(tVar, Boolean.valueOf(e4), new m.d(e4));
                m5.j(tVar, Boolean.valueOf(f4), new m.e(f4));
                m5.j(tVar, Boolean.valueOf(g4), new m.f(g4));
                m5.j(tVar, value2, m.g.f62185b);
                tVar.H();
                tVar.p0();
                tVar.p0();
                if (x.b0()) {
                    x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(StreetViewPanoramaView streetViewPanoramaView, z zVar, b5<com.google.maps.android.compose.streetview.a> b5Var, b5<Boolean> b5Var2, b5<Boolean> b5Var3, b5<Boolean> b5Var4, b5<Boolean> b5Var5, b5<com.google.maps.android.compose.streetview.f> b5Var6, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f62122g = streetViewPanoramaView;
            this.f62123h = zVar;
            this.f62124i = b5Var;
            this.f62125j = b5Var2;
            this.f62126k = b5Var3;
            this.f62127l = b5Var4;
            this.f62128m = b5Var5;
            this.f62129n = b5Var6;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new f(this.f62122g, this.f62123h, this.f62124i, this.f62125j, this.f62126k, this.f62127l, this.f62128m, this.f62129n, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            z zVar;
            p<? super t, ? super Integer, k2> pVar;
            y a5;
            y yVar;
            Throwable th;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f62121f;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    StreetViewPanoramaView streetViewPanoramaView = this.f62122g;
                    z zVar2 = this.f62123h;
                    androidx.compose.runtime.internal.b bVar = new androidx.compose.runtime.internal.b(-1039809540, true, new a(this.f62124i, this.f62125j, this.f62126k, this.f62127l, this.f62128m, this.f62129n));
                    this.f62117b = zVar2;
                    this.f62118c = bVar;
                    this.f62119d = this;
                    this.f62120e = streetViewPanoramaView;
                    this.f62121f = 1;
                    kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(this));
                    streetViewPanoramaView.getStreetViewPanoramaAsync(new l(kVar));
                    obj = kVar.a();
                    if (obj == aVar) {
                        kotlin.coroutines.jvm.internal.h.c(this);
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                    zVar = zVar2;
                    pVar = bVar;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException(ProtectedSandApp.s("ࠠ\u0001"));
                        }
                        yVar = (y) this.f62117b;
                        try {
                            a1.n(obj);
                            throw new KotlinNothingValueException();
                        } catch (Throwable th2) {
                            th = th2;
                            yVar.dispose();
                            throw th;
                        }
                    }
                    pVar = (p) this.f62118c;
                    zVar = (z) this.f62117b;
                    a1.n(obj);
                }
                this.f62117b = a5;
                this.f62118c = null;
                this.f62119d = null;
                this.f62120e = null;
                this.f62121f = 2;
                if (c1.a(this) == aVar) {
                    return aVar;
                }
                yVar = a5;
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                yVar = a5;
                th = th3;
                yVar.dispose();
                throw th;
            }
            StreetViewPanorama streetViewPanorama = (StreetViewPanorama) obj;
            Objects.toString(streetViewPanorama.getLocation());
            a5 = c0.a(new com.google.maps.android.compose.streetview.e(streetViewPanorama), zVar);
            a5.e(pVar);
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f62136b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.maps.android.compose.streetview.a f62137c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<StreetViewPanoramaOptions> f62138d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f62139e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f62140f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f62141g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f62142h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.l<StreetViewPanoramaOrientation, k2> f62143i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ ld.l<StreetViewPanoramaOrientation, k2> f62144j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f62145k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f62146l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(q qVar, com.google.maps.android.compose.streetview.a aVar, ld.a<StreetViewPanoramaOptions> aVar2, boolean z4, boolean z5, boolean z6, boolean z7, ld.l<? super StreetViewPanoramaOrientation, k2> lVar, ld.l<? super StreetViewPanoramaOrientation, k2> lVar2, int i4, int i5) {
            super(2);
            this.f62136b = qVar;
            this.f62137c = aVar;
            this.f62138d = aVar2;
            this.f62139e = z4;
            this.f62140f = z5;
            this.f62141g = z6;
            this.f62142h = z7;
            this.f62143i = lVar;
            this.f62144j = lVar2;
            this.f62145k = i4;
            this.f62146l = i5;
        }

        public final void a(@fg.m t tVar, int i4) {
            d.b(this.f62136b, this.f62137c, this.f62138d, this.f62139e, this.f62140f, this.f62141g, this.f62142h, this.f62143i, this.f62144j, tVar, g3.b(this.f62145k | 1), this.f62146l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt$StreetViewLifecycle$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,178:1\n64#2,5:179\n*S KotlinDebug\n*F\n+ 1 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt$StreetViewLifecycle$1\n*L\n126#1:179,5\n*E\n"})
    static final class h extends n0 implements ld.l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StreetViewPanoramaView f62147b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<AbstractC1450w.a> f62148c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC1450w f62149d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f62150e;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 StreetView.kt\ncom/google/maps/android/compose/streetview/StreetViewKt$StreetViewLifecycle$1\n*L\n1#1,497:1\n127#2,4:498\n*E\n"})
        public static final class a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC1450w f62151a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC1416b0 f62152b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f62153c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ComponentCallbacks f62154d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ StreetViewPanoramaView f62155e;

            public a(AbstractC1450w abstractC1450w, InterfaceC1416b0 interfaceC1416b0, Context context, ComponentCallbacks componentCallbacks, StreetViewPanoramaView streetViewPanoramaView) {
                this.f62151a = abstractC1450w;
                this.f62152b = interfaceC1416b0;
                this.f62153c = context;
                this.f62154d = componentCallbacks;
                this.f62155e = streetViewPanoramaView;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f62151a.d(this.f62152b);
                this.f62153c.unregisterComponentCallbacks(this.f62154d);
                this.f62155e.onDestroy();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(StreetViewPanoramaView streetViewPanoramaView, androidx.compose.runtime.k2<AbstractC1450w.a> k2Var, AbstractC1450w abstractC1450w, Context context) {
            super(1);
            this.f62147b = streetViewPanoramaView;
            this.f62148c = k2Var;
            this.f62149d = abstractC1450w;
            this.f62150e = context;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            l0.p(w0Var, ProtectedSandApp.s("ࠡ\u0001"));
            com.google.maps.android.compose.streetview.c cVar = new com.google.maps.android.compose.streetview.c(this.f62148c, this.f62147b);
            k kVar = new k(this.f62147b);
            this.f62149d.a(cVar);
            this.f62150e.registerComponentCallbacks(kVar);
            return new a(this.f62149d, cVar, this.f62150e, kVar, this.f62147b);
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StreetViewPanoramaView f62156b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f62157c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(StreetViewPanoramaView streetViewPanoramaView, int i4) {
            super(2);
            this.f62156b = streetViewPanoramaView;
            this.f62157c = i4;
        }

        public final void a(@fg.m t tVar, int i4) {
            d.i(this.f62156b, tVar, g3.b(this.f62157c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class j {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62158a;

        static {
            int[] iArr = new int[AbstractC1450w.a.values().length];
            try {
                iArr[AbstractC1450w.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1450w.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1450w.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1450w.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1450w.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1450w.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f62158a = iArr;
        }
    }

    /* compiled from: StreetView.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/maps/android/compose/streetview/d$k", "Landroid/content/ComponentCallbacks;", "Landroid/content/res/Configuration;", "config", "Lkotlin/k2;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class k implements ComponentCallbacks {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StreetViewPanoramaView f62159b;

        k(StreetViewPanoramaView streetViewPanoramaView) {
            this.f62159b = streetViewPanoramaView;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@fg.l Configuration config) {
            l0.p(config, ProtectedSandApp.s("ࠢ\u0001"));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f62159b.onLowMemory();
        }
    }

    /* compiled from: StreetViewPanoramaView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/google/android/gms/maps/StreetViewPanorama;", "it", "Lkotlin/k2;", "onStreetViewPanoramaReady", "(Lcom/google/android/gms/maps/StreetViewPanorama;)V", "com/google/maps/android/ktx/p0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nStreetViewPanoramaView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreetViewPanoramaView.kt\ncom/google/maps/android/ktx/StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1\n*L\n1#1,87:1\n*E\n"})
    public static final class l implements OnStreetViewPanoramaReadyCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f62160a;

        public l(kotlin.coroutines.d dVar) {
            this.f62160a = dVar;
        }

        @Override // com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
        public final void onStreetViewPanoramaReady(@fg.l StreetViewPanorama streetViewPanorama) {
            l0.p(streetViewPanorama, ProtectedSandApp.s("ࠣ\u0001"));
            kotlin.coroutines.d dVar = this.f62160a;
            z0.Companion companion = z0.INSTANCE;
            dVar.resumeWith(streetViewPanorama);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00cf  */
    @com.google.maps.android.ktx.h0
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.m androidx.compose.ui.q r23, @fg.m com.google.maps.android.compose.streetview.a r24, @fg.m ld.a<com.google.android.gms.maps.StreetViewPanoramaOptions> r25, boolean r26, boolean r27, boolean r28, boolean r29, @fg.m ld.l<? super com.google.android.gms.maps.model.StreetViewPanoramaOrientation, kotlin.k2> r30, @fg.m ld.l<? super com.google.android.gms.maps.model.StreetViewPanoramaOrientation, kotlin.k2> r31, @fg.m androidx.compose.runtime.t r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.streetview.d.b(androidx.compose.ui.q, com.google.maps.android.compose.streetview.a, ld.a, boolean, boolean, boolean, boolean, ld.l, ld.l, androidx.compose.runtime.t, int, int):void");
    }

    private static final com.google.maps.android.compose.streetview.a c(b5<com.google.maps.android.compose.streetview.a> b5Var) {
        return b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final com.google.maps.android.compose.streetview.f h(b5<com.google.maps.android.compose.streetview.f> b5Var) {
        return b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i
    public static final void i(StreetViewPanoramaView streetViewPanoramaView, t tVar, int i4) {
        t o4 = tVar.o(1614301890);
        if (x.b0()) {
            x.r0(1614301890, i4, -1, ProtectedSandApp.s("ࠥ\u0001"));
        }
        Context context = (Context) o4.x(o0.g());
        AbstractC1450w lifecycle = ((InterfaceC1423e0) o4.x(o0.i())).getLifecycle();
        o4.P(-209868024);
        Object Q = o4.Q();
        if (Q == t.INSTANCE.a()) {
            Q = t4.g(AbstractC1450w.a.ON_CREATE, null, 2, null);
            o4.E(Q);
        }
        o4.p0();
        androidx.compose.runtime.a1.a(context, lifecycle, streetViewPanoramaView, new h(streetViewPanoramaView, (androidx.compose.runtime.k2) Q, lifecycle, context), o4, 584);
        if (x.b0()) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new i(streetViewPanoramaView, i4));
        }
    }

    public static final com.google.maps.android.compose.streetview.a j(b5 b5Var) {
        return (com.google.maps.android.compose.streetview.a) b5Var.getValue();
    }

    public static final com.google.maps.android.compose.streetview.f o(b5 b5Var) {
        return (com.google.maps.android.compose.streetview.f) b5Var.getValue();
    }

    public static final ComponentCallbacks q(StreetViewPanoramaView streetViewPanoramaView) {
        return new k(streetViewPanoramaView);
    }

    public static final InterfaceC1416b0 r(StreetViewPanoramaView streetViewPanoramaView, androidx.compose.runtime.k2 k2Var) {
        return new com.google.maps.android.compose.streetview.c(k2Var, streetViewPanoramaView);
    }

    private static final ComponentCallbacks s(StreetViewPanoramaView streetViewPanoramaView) {
        return new k(streetViewPanoramaView);
    }

    private static final InterfaceC1416b0 t(StreetViewPanoramaView streetViewPanoramaView, androidx.compose.runtime.k2<AbstractC1450w.a> k2Var) {
        return new com.google.maps.android.compose.streetview.c(k2Var, streetViewPanoramaView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(androidx.compose.runtime.k2 k2Var, StreetViewPanoramaView streetViewPanoramaView, InterfaceC1423e0 interfaceC1423e0, AbstractC1450w.a aVar) {
        l0.p(k2Var, ProtectedSandApp.s("ࠦ\u0001"));
        l0.p(streetViewPanoramaView, ProtectedSandApp.s("ࠧ\u0001"));
        l0.p(interfaceC1423e0, ProtectedSandApp.s("ࠨ\u0001"));
        l0.p(aVar, ProtectedSandApp.s("ࠩ\u0001"));
        aVar.getTargetState();
        switch (j.f62158a[aVar.ordinal()]) {
            case 1:
                if (k2Var.getValue() != AbstractC1450w.a.ON_STOP) {
                    streetViewPanoramaView.onCreate(new Bundle());
                    break;
                }
                break;
            case 2:
                streetViewPanoramaView.onStart();
                break;
            case 3:
                streetViewPanoramaView.onResume();
                break;
            case 4:
                streetViewPanoramaView.onPause();
                break;
            case 5:
                streetViewPanoramaView.onStop();
                break;
            case 6:
                break;
            default:
                throw new IllegalStateException();
        }
        k2Var.setValue(aVar);
    }

    @androidx.compose.runtime.j(scheme = "[0[0]]")
    private static final Object v(StreetViewPanoramaView streetViewPanoramaView, z zVar, p<? super t, ? super Integer, k2> pVar, kotlin.coroutines.d<? super y> dVar) {
        kotlin.coroutines.k kVar = new kotlin.coroutines.k(kotlin.coroutines.intrinsics.b.e(dVar));
        streetViewPanoramaView.getStreetViewPanoramaAsync(new l(kVar));
        k2 k2Var = k2.f75408a;
        Object a5 = kVar.a();
        if (a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        StreetViewPanorama streetViewPanorama = (StreetViewPanorama) a5;
        Objects.toString(streetViewPanorama.getLocation());
        y a6 = c0.a(new com.google.maps.android.compose.streetview.e(streetViewPanorama), zVar);
        a6.e(pVar);
        return a6;
    }
}
