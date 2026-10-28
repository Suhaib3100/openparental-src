package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.material3.qb;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.i;
import androidx.compose.runtime.j;
import androidx.compose.runtime.m5;
import androidx.compose.runtime.n;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v0;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.w0;
import androidx.compose.runtime.x;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.m0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.u;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.unit.r;
import androidx.compose.ui.unit.t;
import androidx.compose.ui.unit.w;
import androidx.compose.ui.window.o;
import fg.m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.l;
import ld.p;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a<\u0010\u0007\u001a\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0013\b\b\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0083\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u0017\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroidx/compose/ui/window/o;", "popupPositionProvider", "Landroidx/compose/runtime/i;", "content", "a", "(Lld/a;Landroidx/compose/ui/window/o;Lld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/q;", "modifier", "d", "(Landroidx/compose/ui/q;Lld/p;Landroidx/compose/runtime/t;I)V", "", "isTouchExplorationEnabled", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,436:1\n74#2:437\n74#2:438\n74#2:439\n1116#3,6:440\n1116#3,6:446\n1116#3,6:452\n1116#3,6:458\n1116#3,6:464\n78#4,11:470\n91#4:501\n78#4,11:502\n91#4:533\n456#5,8:481\n464#5,6:495\n456#5,8:513\n464#5,6:527\n3737#6,6:489\n3737#6,6:521\n81#7:534\n81#7:535\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n*L\n86#1:437\n87#1:438\n88#1:439\n94#1:440,6\n121#1:446,6\n134#1:452,6\n146#1:458,6\n157#1:464,6\n144#1:470,11\n144#1:501\n168#1:502,11\n168#1:533\n144#1:481,8\n144#1:495,6\n168#1:513,8\n168#1:527,6\n144#1:489,6\n168#1:521,6\n89#1:534\n92#1:535\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,436:1\n64#2,5:437\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1\n*L\n127#1:437,5\n*E\n"})
    static final class a extends n0 implements l<w0, v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.c f11677b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f11678c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f11679d;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1\n*L\n1#1,497:1\n128#2,4:498\n*E\n"})
        /* renamed from: androidx.compose.material3.internal.b$a$a, reason: collision with other inner class name */
        public static final class C0252a implements v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.c f11680a;

            public C0252a(androidx.compose.material3.internal.c cVar) {
                this.f11680a = cVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f11680a.i();
                this.f11680a.z();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.material3.internal.c cVar, ld.a<k2> aVar, w wVar) {
            super(1);
            this.f11677b = cVar;
            this.f11678c = aVar;
            this.f11679d = wVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v0 invoke(@fg.l w0 w0Var) {
            this.f11677b.K();
            this.f11677b.M(this.f11678c, this.f11679d);
            return new C0252a(this.f11677b);
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.internal.b$b, reason: collision with other inner class name */
    static final class C0253b extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.c f11681b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f11682c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w f11683d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0253b(androidx.compose.material3.internal.c cVar, ld.a<k2> aVar, w wVar) {
            super(0);
            this.f11681b = cVar;
            this.f11682c = aVar;
            this.f11683d = wVar;
        }

        public final void a() {
            this.f11681b.M(this.f11682c, this.f11683d);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/u;", "childCoordinates", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/u;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements l<u, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.c f11684b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.material3.internal.c cVar) {
            super(1);
            this.f11684b = cVar;
        }

        public final void a(@fg.l u uVar) {
            u n02 = uVar.n0();
            l0.m(n02);
            long c5 = n02.c();
            long g4 = v.g(n02);
            this.f11684b.H(t.b(r.a(kotlin.math.b.L0(i0.f.p(g4)), kotlin.math.b.L0(i0.f.r(g4))), c5));
            this.f11684b.N();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(u uVar) {
            a(uVar);
            return k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "<anonymous parameter 1>", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class d implements m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.c f11685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f11686b;

        /* compiled from: ExposedDropdownMenuPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f11687b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l i1.a aVar) {
            }

            @Override // ld.l
            public k2 invoke(i1.a aVar) {
                return k2.f75408a;
            }
        }

        d(androidx.compose.material3.internal.c cVar, w wVar) {
            this.f11685a = cVar;
            this.f11686b = wVar;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            this.f11685a.I(this.f11686b);
            return o0.x2(o0Var, 0, 0, null, a.f11687b, 4, null);
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<k2> f11688b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f11689c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.t, Integer, k2> f11690d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11691e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f11692f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.a<k2> aVar, o oVar, p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4, int i5) {
            super(2);
            this.f11688b = aVar;
            this.f11689c = oVar;
            this.f11690d = pVar;
            this.f11691e = i4;
            this.f11692f = i5;
        }

        public final void a(@m androidx.compose.runtime.t tVar, int i4) {
            b.a(this.f11688b, this.f11689c, this.f11690d, tVar, g3.b(this.f11691e | 1), this.f11692f);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.a<UUID> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f11693b = new f(0);

        f() {
            super(0);
        }

        public final UUID a() {
            return UUID.randomUUID();
        }

        @Override // ld.a
        public UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,436:1\n1116#2,6:437\n168#3:443\n195#3:476\n78#4,11:444\n91#4:475\n456#5,8:455\n464#5,6:469\n3737#6,6:463\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1\n*L\n108#1:437,6\n104#1:443\n104#1:476\n104#1:444,11\n104#1:475\n104#1:455,8\n104#1:469,6\n104#1:463,6\n*E\n"})
    static final class g extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.material3.internal.c f11694b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b5<p<androidx.compose.runtime.t, Integer, k2>> f11695c;

        /* compiled from: ExposedDropdownMenuPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends n0 implements l<z, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f11696b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l z zVar) {
                androidx.compose.ui.semantics.w.P0(zVar);
            }

            @Override // ld.l
            public k2 invoke(z zVar) {
                androidx.compose.ui.semantics.w.P0(zVar);
                return k2.f75408a;
            }
        }

        /* compiled from: ExposedDropdownMenuPopup.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.internal.b$g$b, reason: collision with other inner class name */
        static final class C0254b extends n0 implements l<androidx.compose.ui.unit.u, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.material3.internal.c f11697b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0254b(androidx.compose.material3.internal.c cVar) {
                super(1);
                this.f11697b = cVar;
            }

            public final void a(long j4) {
                this.f11697b.J(androidx.compose.ui.unit.u.b(j4));
                this.f11697b.N();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.unit.u uVar) {
                a(uVar.getPackedValue());
                return k2.f75408a;
            }
        }

        /* compiled from: ExposedDropdownMenuPopup.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b5<p<androidx.compose.runtime.t, Integer, k2>> f11698b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(b5<? extends p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var) {
                super(2);
                this.f11698b = b5Var;
            }

            @n(applier = "androidx.compose.ui.UiComposable")
            @i
            public final void a(@m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (x.b0()) {
                    x.r0(1824588059, i4, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:114)");
                }
                if (androidx.compose.animation.r.a(0, this.f11698b.getValue(), tVar)) {
                    x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.material3.internal.c cVar, b5<? extends p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var) {
            super(2);
            this.f11694b = cVar;
            this.f11695c = b5Var;
        }

        @n(applier = "androidx.compose.ui.UiComposable")
        @i
        public final void a(@m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(-493861435, i4, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup.<anonymous>.<anonymous>.<anonymous> (ExposedDropdownMenuPopup.android.kt:103)");
            }
            q f4 = androidx.compose.ui.semantics.o.f(q.INSTANCE, false, a.f11696b, 1, null);
            tVar.P(-2041182138);
            boolean S = tVar.S(this.f11694b);
            androidx.compose.material3.internal.c cVar = this.f11694b;
            Object Q = tVar.Q();
            if (S || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new C0254b(cVar);
                tVar.E(Q);
            }
            tVar.p0();
            q a5 = androidx.compose.ui.draw.a.a(c1.a(f4, (l) Q), this.f11694b.A() ? 1.0f : 0.0f);
            androidx.compose.runtime.internal.a b5 = androidx.compose.runtime.internal.c.b(tVar, 1824588059, true, new c(this.f11695c));
            tVar.P(437877758);
            h hVar = h.f11699a;
            tVar.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = a0.g(a5);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            m5.j(tVar, hVar, companion.f());
            m5.j(tVar, B, companion.h());
            p<androidx.compose.ui.node.g, Integer, k2> b6 = companion.b();
            if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, b6);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            b5.invoke(tVar, 6);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,436:1\n151#2,3:437\n33#2,4:440\n154#2,2:444\n38#2:446\n156#2:447\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n*L\n178#1:437,3\n178#1:440,4\n178#1:444,2\n178#1:446\n178#1:447\n*E\n"})
    public static final class h implements m0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f11699a = new h();

        /* compiled from: ExposedDropdownMenuPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1\n*L\n1#1,436:1\n*E\n"})
        public static final class a extends n0 implements l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f11700b = new a(1);

            public a() {
                super(1);
            }

            public final void a(@fg.l i1.a aVar) {
            }

            @Override // ld.l
            public k2 invoke(i1.a aVar) {
                return k2.f75408a;
            }
        }

        /* compiled from: ExposedDropdownMenuPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$2\n*L\n1#1,436:1\n*E\n"})
        /* renamed from: androidx.compose.material3.internal.b$h$b, reason: collision with other inner class name */
        public static final class C0255b extends n0 implements l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i1 f11701b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0255b(i1 i1Var) {
                super(1);
                this.f11701b = i1Var;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.m(aVar, this.f11701b, 0, 0, 0.0f, 4, null);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        /* compiled from: ExposedDropdownMenuPopup.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material3/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$3\n*L\n1#1,436:1\n*E\n"})
        public static final class c extends n0 implements l<i1.a, k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<i1> f11702b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends i1> list) {
                super(1);
                this.f11702b = list;
            }

            public final void a(@fg.l i1.a aVar) {
                int J = kotlin.collections.w.J(this.f11702b);
                if (J < 0) {
                    return;
                }
                int i4 = 0;
                while (true) {
                    i1.a.m(aVar, this.f11702b.get(i4), 0, 0, 0.0f, 4, null);
                    if (i4 == J) {
                        return;
                    } else {
                        i4++;
                    }
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
                a(aVar);
                return k2.f75408a;
            }
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            int i4;
            int i5;
            int size = list.size();
            if (size == 0) {
                return o0.x2(o0Var, 0, 0, null, a.f11700b, 4, null);
            }
            int i6 = 0;
            if (size == 1) {
                i1 m02 = list.get(0).m0(j4);
                return o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new C0255b(m02), 4, null);
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size2 = list.size();
            int i7 = 0;
            while (i7 < size2) {
                i7 = androidx.compose.animation.n.a(list.get(i7), j4, arrayList, i7, 1);
            }
            int J = kotlin.collections.w.J(arrayList);
            if (J >= 0) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    i1 i1Var = (i1) arrayList.get(i6);
                    i10 = Math.max(i10, i1Var.getWidth());
                    i11 = Math.max(i11, i1Var.getHeight());
                    if (i6 == J) {
                        break;
                    }
                    i6++;
                }
                i4 = i10;
                i5 = i11;
            } else {
                i4 = 0;
                i5 = 0;
            }
            return o0.x2(o0Var, i4, i5, null, new c(arrayList), 4, null);
        }
    }

    @j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @i
    public static final void a(@m ld.a<k2> aVar, @fg.l o oVar, @fg.l p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @m androidx.compose.runtime.t tVar, int i4, int i5) {
        ld.a<k2> aVar2;
        int i6;
        ld.a<k2> aVar3;
        w wVar;
        int i7;
        Object obj;
        androidx.compose.runtime.t o4 = tVar.o(-727958629);
        int i10 = i5 & 1;
        if (i10 != 0) {
            i6 = i4 | 6;
            aVar2 = aVar;
        } else if ((i4 & 6) == 0) {
            aVar2 = aVar;
            i6 = (o4.S(aVar2) ? 4 : 2) | i4;
        } else {
            aVar2 = aVar;
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= o4.q0(oVar) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= o4.S(pVar) ? 256 : 128;
        }
        int i11 = i6;
        if ((i11 & 147) == 146 && o4.p()) {
            o4.d0();
            aVar3 = aVar2;
        } else {
            aVar3 = i10 != 0 ? null : aVar2;
            if (x.b0()) {
                x.r0(-727958629, i11, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:84)");
            }
            View view = (View) o4.x(androidx.compose.ui.platform.o0.k());
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) o4.x(h1.i());
            w wVar2 = (w) o4.x(h1.p());
            b5<Boolean> c5 = qb.c(o4, 0);
            androidx.compose.runtime.z u4 = androidx.compose.runtime.p.u(o4, 0);
            b5 u5 = o4.u(pVar, o4, (i11 >> 6) & 14);
            UUID uuid = (UUID) androidx.compose.runtime.saveable.d.d(new Object[0], null, null, f.f11693b, o4, 3072, 6);
            boolean b5 = b(c5);
            o4.P(-246571242);
            boolean b6 = o4.b(b5);
            Object Q = o4.Q();
            if (b6 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                wVar = wVar2;
                i7 = i11;
                androidx.compose.material3.internal.c cVar = new androidx.compose.material3.internal.c(aVar3, view, oVar, b(c5), dVar, uuid);
                cVar.F(u4, new androidx.compose.runtime.internal.b(-493861435, true, new g(cVar, u5)));
                o4.E(cVar);
                obj = cVar;
            } else {
                wVar = wVar2;
                i7 = i11;
                obj = Q;
            }
            androidx.compose.material3.internal.c cVar2 = (androidx.compose.material3.internal.c) obj;
            o4.p0();
            o4.P(-246570242);
            int i12 = i7 & 14;
            boolean S = o4.S(cVar2) | (i12 == 4) | o4.q0(wVar);
            Object Q2 = o4.Q();
            if (S || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = new a(cVar2, aVar3, wVar);
                o4.E(Q2);
            }
            o4.p0();
            a1.c(cVar2, (l) Q2, o4, 0);
            o4.P(-246569906);
            boolean S2 = o4.S(cVar2) | (i12 == 4) | o4.q0(wVar);
            Object Q3 = o4.Q();
            if (S2 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q3 = new C0253b(cVar2, aVar3, wVar);
                o4.E(Q3);
            }
            o4.p0();
            a1.k((ld.a) Q3, o4, 0);
            q.Companion companion = q.INSTANCE;
            o4.P(-246569499);
            boolean S3 = o4.S(cVar2);
            Object Q4 = o4.Q();
            if (S3 || Q4 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q4 = new c(cVar2);
                o4.E(Q4);
            }
            o4.p0();
            q a5 = androidx.compose.ui.layout.w0.a(companion, (l) Q4);
            o4.P(-246569030);
            boolean S4 = o4.S(cVar2) | o4.q0(wVar);
            Object Q5 = o4.Q();
            if (S4 || Q5 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q5 = new d(cVar2, wVar);
                o4.E(Q5);
            }
            m0 m0Var = (m0) Q5;
            o4.p0();
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = a0.g(a5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            p a7 = androidx.compose.animation.p.a(companion2, o4, m0Var, o4, B);
            if (o4.getInserting() || !l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a7);
            }
            g4.R(v3.a(o4), o4, 0);
            o4.P(2058660585);
            o4.p0();
            o4.H();
            o4.p0();
            if (x.b0()) {
                x.q0();
            }
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new e(aVar3, oVar, pVar, i4, i5));
        }
    }

    private static final boolean b(b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    private static final p<androidx.compose.runtime.t, Integer, k2> c(b5<? extends p<? super androidx.compose.runtime.t, ? super Integer, k2>> b5Var) {
        return (p) b5Var.getValue();
    }

    @j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @i
    private static final void d(q qVar, p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        tVar.P(437877758);
        h hVar = h.f11699a;
        tVar.P(-1323940314);
        int j4 = androidx.compose.runtime.p.j(tVar, 0);
        g0 B = tVar.B();
        g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
        ld.a<androidx.compose.ui.node.g> a5 = companion.a();
        ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = a0.g(qVar);
        int i5 = (((((i4 << 3) & 112) | ((i4 >> 3) & 14)) << 9) & 7168) | 6;
        if (tVar.s() == null) {
            androidx.compose.runtime.p.n();
        }
        tVar.W();
        if (tVar.getInserting()) {
            tVar.F(a5);
        } else {
            tVar.C();
        }
        m5.j(tVar, hVar, companion.f());
        m5.j(tVar, B, companion.h());
        p<androidx.compose.ui.node.g, Integer, k2> b5 = companion.b();
        if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j4))) {
            androidx.compose.animation.d.a(j4, tVar, j4, b5);
        }
        androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
        androidx.compose.material3.q.a((i5 >> 9) & 14, pVar, tVar);
    }

    public static final p e(b5 b5Var) {
        return (p) b5Var.getValue();
    }
}
