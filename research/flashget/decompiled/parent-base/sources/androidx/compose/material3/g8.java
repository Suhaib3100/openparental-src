package androidx.compose.material3;

import androidx.compose.material3.k5;
import androidx.compose.ui.layout.i1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Scaffold.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a±\u0001\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0087\u0001\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0087\u0001\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\t2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u00042\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0019\"1\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8G@GX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u001b\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\"\"\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*\"\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/k5;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/n2;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/l1;", "content", "b", "(Landroidx/compose/ui/q;Lld/p;Lld/p;Lld/p;Lld/p;IJJLandroidx/compose/foundation/layout/n2;Lld/q;Landroidx/compose/runtime/t;II)V", "fabPosition", "snackbar", "fab", "c", "(ILld/p;Lld/q;Lld/p;Lld/p;Landroidx/compose/foundation/layout/n2;Lld/p;Landroidx/compose/runtime/t;I)V", "d", "a", "", "<set-?>", "Landroidx/compose/runtime/k2;", "j", "()Z", "l", "(Z)V", "k", "()V", "ScaffoldSubcomposeInMeasureFix", "Landroidx/compose/runtime/a3;", "Landroidx/compose/material3/j5;", "Landroidx/compose/runtime/a3;", "i", "()Landroidx/compose/runtime/a3;", "LocalFabPlacement", "Landroidx/compose/ui/unit/h;", "F", "FabSpacing", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,598:1\n1116#2,6:599\n1116#2,6:605\n1116#2,6:611\n1116#2,6:617\n81#3:623\n107#3,2:624\n154#4:626\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n98#1:599,6\n102#1:605,6\n179#1:611,6\n349#1:617,6\n572#1:623\n572#1:624,2\n595#1:626\n*E\n"})
/* loaded from: classes.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.k2 f11021a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.a3<j5> f11022b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f11023c;

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/s1;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.s1, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11025c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11026d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11027e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11028f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11029g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11030h;

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$LegacyScaffoldLayout$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,598:1\n151#2,3:599\n33#2,4:602\n154#2,2:606\n38#2:608\n156#2:609\n171#2,13:610\n151#2,3:623\n33#2,4:626\n154#2,2:630\n38#2:632\n156#2:633\n171#2,13:634\n171#2,13:647\n416#2,3:660\n33#2,4:663\n419#2:667\n420#2:670\n38#2:671\n421#2:672\n171#2,13:673\n171#2,13:686\n151#2,3:699\n33#2,4:702\n154#2,2:706\n38#2:708\n156#2:709\n171#2,13:710\n151#2,3:723\n33#2,4:726\n154#2,2:730\n38#2:732\n156#2:733\n33#2,6:734\n33#2,6:740\n33#2,6:746\n33#2,6:752\n33#2,6:758\n1#3:668\n1#3:669\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$LegacyScaffoldLayout$1$1$1\n*L\n356#1:599,3\n356#1:602,4\n356#1:606,2\n356#1:608\n356#1:609\n360#1:610,13\n362#1:623,3\n362#1:626,4\n362#1:630,2\n362#1:632\n362#1:633\n378#1:634,13\n379#1:647,13\n382#1:660,3\n382#1:663,4\n382#1:667\n382#1:670\n382#1:671\n382#1:672\n399#1:673,13\n400#1:686,13\n434#1:699,3\n434#1:702,4\n434#1:706,2\n434#1:708\n434#1:709\n436#1:710,13\n475#1:723,3\n475#1:726,4\n475#1:730,2\n475#1:732\n475#1:733\n478#1:734,6\n481#1:740,6\n484#1:746,6\n492#1:752,6\n497#1:758,6\n382#1:669\n*E\n"})
        /* renamed from: androidx.compose.material3.g8$a$a, reason: collision with other inner class name */
        static final class C0245a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.s1 f11031b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11032c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11033d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11034e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f11035f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f11036g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.n2 f11037h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ long f11038i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11039j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11040k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f11041l;

            /* compiled from: Scaffold.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.g8$a$a$a, reason: collision with other inner class name */
            static final class C0246a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.layout.n2 f11042b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.layout.s1 f11043c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.layout.i1> f11044d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ int f11045e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ List<androidx.compose.ui.layout.i1> f11046f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Integer f11047g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11048h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0246a(androidx.compose.foundation.layout.n2 n2Var, androidx.compose.ui.layout.s1 s1Var, List<? extends androidx.compose.ui.layout.i1> list, int i4, List<? extends androidx.compose.ui.layout.i1> list2, Integer num, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                    super(2);
                    this.f11042b = n2Var;
                    this.f11043c = s1Var;
                    this.f11044d = list;
                    this.f11045e = i4;
                    this.f11046f = list2;
                    this.f11047g = num;
                    this.f11048h = qVar;
                }

                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    Integer num;
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(495329982, i4, -1, "androidx.compose.material3.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:456)");
                    }
                    androidx.compose.foundation.layout.l1 h4 = androidx.compose.foundation.layout.r2.h(this.f11042b, this.f11043c);
                    this.f11048h.R(androidx.compose.foundation.layout.j1.d(androidx.compose.foundation.layout.j1.i(h4, this.f11043c.getLayoutDirection()), this.f11044d.isEmpty() ? h4.getTop() : this.f11043c.R(this.f11045e), androidx.compose.foundation.layout.j1.h(h4, this.f11043c.getLayoutDirection()), (this.f11046f.isEmpty() || (num = this.f11047g) == null) ? h4.getBottom() : this.f11043c.R(num.intValue())), tVar, 0);
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.p
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                    a(tVar, num.intValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* compiled from: Scaffold.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.g8$a$a$b */
            static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j5 f11049b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11050c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(j5 j5Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                    super(2);
                    this.f11049b = j5Var;
                    this.f11050c = pVar;
                }

                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(-791102355, i4, -1, "androidx.compose.material3.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:429)");
                    }
                    androidx.compose.runtime.f0.b(g8.i().e(this.f11049b), this.f11050c, tVar, androidx.compose.runtime.b3.f15974d);
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.q0();
                    }
                }

                @Override // ld.p
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                    a(tVar, num.intValue());
                    return kotlin.k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0245a(androidx.compose.ui.layout.s1 s1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, int i4, int i5, androidx.compose.foundation.layout.n2 n2Var, long j4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, int i6) {
                super(1);
                this.f11031b = s1Var;
                this.f11032c = pVar;
                this.f11033d = pVar2;
                this.f11034e = pVar3;
                this.f11035f = i4;
                this.f11036g = i5;
                this.f11037h = n2Var;
                this.f11038i = j4;
                this.f11039j = pVar4;
                this.f11040k = qVar;
                this.f11041l = i6;
            }

            public final void a(@fg.l i1.a aVar) {
                Object obj;
                Object obj2;
                Object obj3;
                j5 j5Var;
                int i4;
                Object obj4;
                Integer num;
                Object obj5;
                Object obj6;
                int i5;
                int i6;
                int q22;
                List<androidx.compose.ui.layout.l0> E2 = this.f11031b.E2(h8.TopBar, this.f11032c);
                long j4 = this.f11038i;
                ArrayList arrayList = new ArrayList(E2.size());
                for (int i7 = 0; i7 < E2.size(); i7 = androidx.compose.animation.n.a(E2.get(i7), j4, arrayList, i7, 1)) {
                }
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int height = ((androidx.compose.ui.layout.i1) obj).getHeight();
                    int J = kotlin.collections.w.J(arrayList);
                    if (1 <= J) {
                        int i10 = 1;
                        while (true) {
                            Object obj7 = arrayList.get(i10);
                            int height2 = ((androidx.compose.ui.layout.i1) obj7).getHeight();
                            if (height < height2) {
                                obj = obj7;
                                height = height2;
                            }
                            if (i10 == J) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                androidx.compose.ui.layout.i1 i1Var = (androidx.compose.ui.layout.i1) obj;
                int height3 = i1Var != null ? i1Var.getHeight() : 0;
                List<androidx.compose.ui.layout.l0> E22 = this.f11031b.E2(h8.Snackbar, this.f11033d);
                androidx.compose.foundation.layout.n2 n2Var = this.f11037h;
                androidx.compose.ui.layout.s1 s1Var = this.f11031b;
                long j5 = this.f11038i;
                ArrayList arrayList2 = new ArrayList(E22.size());
                for (int i11 = 0; i11 < E22.size(); i11 = androidx.compose.animation.n.a(E22.get(i11), androidx.compose.ui.unit.c.i(j5, (-n2Var.d(s1Var, s1Var.getLayoutDirection())) - n2Var.b(s1Var, s1Var.getLayoutDirection()), -n2Var.c(s1Var)), arrayList2, i11, 1)) {
                }
                if (arrayList2.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = arrayList2.get(0);
                    int height4 = ((androidx.compose.ui.layout.i1) obj2).getHeight();
                    int J2 = kotlin.collections.w.J(arrayList2);
                    if (1 <= J2) {
                        int i12 = 1;
                        while (true) {
                            Object obj8 = arrayList2.get(i12);
                            int height5 = ((androidx.compose.ui.layout.i1) obj8).getHeight();
                            if (height4 < height5) {
                                obj2 = obj8;
                                height4 = height5;
                            }
                            if (i12 == J2) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                androidx.compose.ui.layout.i1 i1Var2 = (androidx.compose.ui.layout.i1) obj2;
                int height6 = i1Var2 != null ? i1Var2.getHeight() : 0;
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int width = ((androidx.compose.ui.layout.i1) obj3).getWidth();
                    int J3 = kotlin.collections.w.J(arrayList2);
                    if (1 <= J3) {
                        int i13 = 1;
                        while (true) {
                            Object obj9 = arrayList2.get(i13);
                            int width2 = ((androidx.compose.ui.layout.i1) obj9).getWidth();
                            if (width < width2) {
                                obj3 = obj9;
                                width = width2;
                            }
                            if (i13 == J3) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                androidx.compose.ui.layout.i1 i1Var3 = (androidx.compose.ui.layout.i1) obj3;
                int width3 = i1Var3 != null ? i1Var3.getWidth() : 0;
                List<androidx.compose.ui.layout.l0> E23 = this.f11031b.E2(h8.Fab, this.f11034e);
                androidx.compose.foundation.layout.n2 n2Var2 = this.f11037h;
                androidx.compose.ui.layout.s1 s1Var2 = this.f11031b;
                long j6 = this.f11038i;
                ArrayList arrayList3 = new ArrayList(E23.size());
                int size = E23.size();
                int i14 = 0;
                while (i14 < size) {
                    List<androidx.compose.ui.layout.l0> list = E23;
                    int i15 = size;
                    androidx.compose.foundation.layout.n2 n2Var3 = n2Var2;
                    androidx.compose.ui.layout.i1 m02 = E23.get(i14).m0(androidx.compose.ui.unit.c.i(j6, (-n2Var2.d(s1Var2, s1Var2.getLayoutDirection())) - n2Var2.b(s1Var2, s1Var2.getLayoutDirection()), -n2Var2.c(s1Var2)));
                    if (m02.getHeight() == 0 || m02.getWidth() == 0) {
                        m02 = null;
                    }
                    if (m02 != null) {
                        arrayList3.add(m02);
                    }
                    i14++;
                    n2Var2 = n2Var3;
                    E23 = list;
                    size = i15;
                }
                if (arrayList3.isEmpty()) {
                    j5Var = null;
                } else {
                    if (arrayList3.isEmpty()) {
                        obj5 = null;
                    } else {
                        obj5 = arrayList3.get(0);
                        int width4 = ((androidx.compose.ui.layout.i1) obj5).getWidth();
                        int J4 = kotlin.collections.w.J(arrayList3);
                        if (1 <= J4) {
                            int i16 = 1;
                            while (true) {
                                Object obj10 = arrayList3.get(i16);
                                int width5 = ((androidx.compose.ui.layout.i1) obj10).getWidth();
                                if (width4 < width5) {
                                    obj5 = obj10;
                                    width4 = width5;
                                }
                                if (i16 == J4) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                        }
                    }
                    kotlin.jvm.internal.l0.m(obj5);
                    int width6 = ((androidx.compose.ui.layout.i1) obj5).getWidth();
                    if (arrayList3.isEmpty()) {
                        obj6 = null;
                    } else {
                        obj6 = arrayList3.get(0);
                        int height7 = ((androidx.compose.ui.layout.i1) obj6).getHeight();
                        int J5 = kotlin.collections.w.J(arrayList3);
                        if (1 <= J5) {
                            int i17 = 1;
                            while (true) {
                                Object obj11 = arrayList3.get(i17);
                                int height8 = ((androidx.compose.ui.layout.i1) obj11).getHeight();
                                if (height7 < height8) {
                                    obj6 = obj11;
                                    height7 = height8;
                                }
                                if (i17 == J5) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                    kotlin.jvm.internal.l0.m(obj6);
                    int height9 = ((androidx.compose.ui.layout.i1) obj6).getHeight();
                    int i18 = this.f11035f;
                    k5.Companion companion = k5.INSTANCE;
                    companion.getClass();
                    if (!k5.h(i18, k5.f12090c)) {
                        companion.getClass();
                        if (!k5.h(i18, k5.f12092e)) {
                            i5 = (this.f11036g - width6) / 2;
                        } else if (this.f11031b.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
                            i6 = this.f11036g;
                            q22 = this.f11031b.q2(g8.f11023c);
                            i5 = (i6 - q22) - width6;
                        } else {
                            i5 = this.f11031b.q2(g8.f11023c);
                        }
                        j5Var = new j5(i5, width6, height9);
                    } else if (this.f11031b.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
                        i5 = this.f11031b.q2(g8.f11023c);
                        j5Var = new j5(i5, width6, height9);
                    } else {
                        i6 = this.f11036g;
                        q22 = this.f11031b.q2(g8.f11023c);
                        i5 = (i6 - q22) - width6;
                        j5Var = new j5(i5, width6, height9);
                    }
                }
                List<androidx.compose.ui.layout.l0> E24 = this.f11031b.E2(h8.BottomBar, new androidx.compose.runtime.internal.b(-791102355, true, new b(j5Var, this.f11039j)));
                long j7 = this.f11038i;
                ArrayList arrayList4 = new ArrayList(E24.size());
                for (int i19 = 0; i19 < E24.size(); i19 = androidx.compose.animation.n.a(E24.get(i19), j7, arrayList4, i19, 1)) {
                }
                if (arrayList4.isEmpty()) {
                    i4 = 0;
                    obj4 = null;
                } else {
                    i4 = 0;
                    obj4 = arrayList4.get(0);
                    int height10 = ((androidx.compose.ui.layout.i1) obj4).getHeight();
                    int J6 = kotlin.collections.w.J(arrayList4);
                    if (1 <= J6) {
                        int i20 = 1;
                        while (true) {
                            Object obj12 = arrayList4.get(i20);
                            int height11 = ((androidx.compose.ui.layout.i1) obj12).getHeight();
                            if (height10 < height11) {
                                obj4 = obj12;
                                height10 = height11;
                            }
                            if (i20 == J6) {
                                break;
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                androidx.compose.ui.layout.i1 i1Var4 = (androidx.compose.ui.layout.i1) obj4;
                Integer valueOf = i1Var4 != null ? Integer.valueOf(i1Var4.getHeight()) : null;
                if (j5Var != null) {
                    androidx.compose.ui.layout.s1 s1Var3 = this.f11031b;
                    num = Integer.valueOf(valueOf == null ? this.f11037h.c(s1Var3) + s1Var3.q2(g8.f11023c) + j5Var.getHeight() : s1Var3.q2(g8.f11023c) + j5Var.getHeight() + valueOf.intValue());
                } else {
                    num = null;
                }
                int intValue = height6 != 0 ? height6 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : this.f11037h.c(this.f11031b)) : i4;
                androidx.compose.ui.layout.s1 s1Var4 = this.f11031b;
                Integer num2 = num;
                j5 j5Var2 = j5Var;
                ArrayList arrayList5 = arrayList4;
                List<androidx.compose.ui.layout.l0> E25 = s1Var4.E2(h8.MainContent, new androidx.compose.runtime.internal.b(495329982, true, new C0246a(this.f11037h, s1Var4, arrayList, height3, arrayList5, valueOf, this.f11040k)));
                long j10 = this.f11038i;
                ArrayList arrayList6 = new ArrayList(E25.size());
                int i21 = 0;
                for (int size2 = E25.size(); i21 < size2; size2 = size2) {
                    i21 = androidx.compose.animation.n.a(E25.get(i21), j10, arrayList6, i21, 1);
                }
                int size3 = arrayList6.size();
                for (int i22 = 0; i22 < size3; i22++) {
                    i1.a.g(aVar, (androidx.compose.ui.layout.i1) arrayList6.get(i22), 0, 0, 0.0f, 4, null);
                }
                int size4 = arrayList.size();
                for (int i23 = 0; i23 < size4; i23++) {
                    i1.a.g(aVar, (androidx.compose.ui.layout.i1) arrayList.get(i23), 0, 0, 0.0f, 4, null);
                }
                int i24 = this.f11036g;
                androidx.compose.foundation.layout.n2 n2Var4 = this.f11037h;
                androidx.compose.ui.layout.s1 s1Var5 = this.f11031b;
                int i25 = this.f11041l;
                int size5 = arrayList2.size();
                for (int i26 = 0; i26 < size5; i26++) {
                    i1.a.g(aVar, (androidx.compose.ui.layout.i1) arrayList2.get(i26), n2Var4.d(s1Var5, s1Var5.getLayoutDirection()) + ((i24 - width3) / 2), i25 - intValue, 0.0f, 4, null);
                }
                int i27 = this.f11041l;
                int size6 = arrayList5.size();
                int i28 = 0;
                while (i28 < size6) {
                    ArrayList arrayList7 = arrayList5;
                    i1.a.g(aVar, (androidx.compose.ui.layout.i1) arrayList7.get(i28), 0, i27 - (valueOf != null ? valueOf.intValue() : 0), 0.0f, 4, null);
                    i28++;
                    arrayList5 = arrayList7;
                }
                if (j5Var2 != null) {
                    int i29 = this.f11041l;
                    int size7 = arrayList3.size();
                    for (int i30 = 0; i30 < size7; i30++) {
                        androidx.compose.ui.layout.i1 i1Var5 = (androidx.compose.ui.layout.i1) arrayList3.get(i30);
                        int left = j5Var2.getLeft();
                        kotlin.jvm.internal.l0.m(num2);
                        i1.a.g(aVar, i1Var5, left, i29 - num2.intValue(), 0.0f, 4, null);
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, int i4, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f11024b = pVar;
            this.f11025c = pVar2;
            this.f11026d = pVar3;
            this.f11027e = i4;
            this.f11028f = n2Var;
            this.f11029g = pVar4;
            this.f11030h = qVar;
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.s1 s1Var, long j4) {
            int p4 = androidx.compose.ui.unit.b.p(j4);
            int o4 = androidx.compose.ui.unit.b.o(j4);
            return androidx.compose.ui.layout.o0.x2(s1Var, p4, o4, null, new C0245a(s1Var, this.f11024b, this.f11025c, this.f11026d, this.f11027e, p4, this.f11028f, androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null), this.f11029g, this.f11030h, o4), 4, null);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 invoke(androidx.compose.ui.layout.s1 s1Var, androidx.compose.ui.unit.b bVar) {
            return a(s1Var, bVar.getValue());
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11052c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11053d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11054e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11055f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11056g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11057h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11058i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(int i4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, int i5) {
            super(2);
            this.f11051b = i4;
            this.f11052c = pVar;
            this.f11053d = qVar;
            this.f11054e = pVar2;
            this.f11055f = pVar3;
            this.f11056g = n2Var;
            this.f11057h = pVar4;
            this.f11058i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g8.a(this.f11051b, this.f11052c, this.f11053d, this.f11054e, this.f11055f, this.f11056g, this.f11057h, tVar, androidx.compose.runtime.g3.b(this.f11058i | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material3/j5;", "a", "()Landroidx/compose/material3/j5;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<j5> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f11059b = new c(0);

        c() {
            super(0);
        }

        @fg.m
        public final j5 a() {
            return null;
        }

        @Override // ld.a
        public j5 invoke() {
            return null;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/n2;", "consumedWindowInsets", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/layout/n2;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.foundation.layout.n2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e7 f11060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e7 e7Var, androidx.compose.foundation.layout.n2 n2Var) {
            super(1);
            this.f11060b = e7Var;
            this.f11061c = n2Var;
        }

        public final void a(@fg.l androidx.compose.foundation.layout.n2 n2Var) {
            this.f11060b.f(androidx.compose.foundation.layout.r2.i(this.f11061c, n2Var));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.foundation.layout.n2 n2Var) {
            a(n2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11062b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11063c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11064d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11065e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11066f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ e7 f11067g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11068h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(int i4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, e7 e7Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4) {
            super(2);
            this.f11062b = i4;
            this.f11063c = pVar;
            this.f11064d = qVar;
            this.f11065e = pVar2;
            this.f11066f = pVar3;
            this.f11067g = e7Var;
            this.f11068h = pVar4;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1979205334, i4, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:107)");
            }
            g8.c(this.f11062b, this.f11063c, this.f11064d, this.f11065e, this.f11066f, this.f11067g, this.f11068h, tVar, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11069b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11070c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11071d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11072e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11073f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11074g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f11075h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f11076i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11077j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11078k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11079l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f11080m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, int i4, long j4, long j5, androidx.compose.foundation.layout.n2 n2Var, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i5, int i6) {
            super(2);
            this.f11069b = qVar;
            this.f11070c = pVar;
            this.f11071d = pVar2;
            this.f11072e = pVar3;
            this.f11073f = pVar4;
            this.f11074g = i4;
            this.f11075h = j4;
            this.f11076i = j5;
            this.f11077j = n2Var;
            this.f11078k = qVar2;
            this.f11079l = i5;
            this.f11080m = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g8.b(this.f11069b, this.f11070c, this.f11071d, this.f11072e, this.f11073f, this.f11074g, this.f11075h, this.f11076i, this.f11077j, this.f11078k, tVar, androidx.compose.runtime.g3.b(this.f11079l | 1), this.f11080m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11082c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11083d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11084e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11085f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11086g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11087h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11088i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(int i4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, int i5) {
            super(2);
            this.f11081b = i4;
            this.f11082c = pVar;
            this.f11083d = qVar;
            this.f11084e = pVar2;
            this.f11085f = pVar3;
            this.f11086g = n2Var;
            this.f11087h = pVar4;
            this.f11088i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g8.c(this.f11081b, this.f11082c, this.f11083d, this.f11084e, this.f11085f, this.f11086g, this.f11087h, tVar, androidx.compose.runtime.g3.b(this.f11088i | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/s1;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/s1;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,598:1\n151#2,3:599\n33#2,4:602\n154#2,2:606\n38#2:608\n156#2:609\n171#2,13:610\n151#2,3:623\n33#2,4:626\n154#2,2:630\n38#2:632\n156#2:633\n171#2,13:634\n171#2,13:647\n416#2,3:660\n33#2,4:663\n419#2:667\n420#2:670\n38#2:671\n421#2:672\n171#2,13:673\n171#2,13:686\n151#2,3:699\n33#2,4:702\n154#2,2:706\n38#2:708\n156#2:709\n171#2,13:710\n151#2,3:723\n33#2,4:726\n154#2,2:730\n38#2:732\n156#2:733\n1#3:668\n1#3:669\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1\n*L\n185#1:599,3\n185#1:602,4\n185#1:606,2\n185#1:608\n185#1:609\n189#1:610,13\n191#1:623,3\n191#1:626,4\n191#1:630,2\n191#1:632\n191#1:633\n207#1:634,13\n208#1:647,13\n211#1:660,3\n211#1:663,4\n211#1:667\n211#1:670\n211#1:671\n211#1:672\n228#1:673,13\n229#1:686,13\n263#1:699,3\n263#1:702,4\n263#1:706,2\n263#1:708\n263#1:709\n265#1:710,13\n304#1:723,3\n304#1:726,4\n304#1:730,2\n304#1:732\n304#1:733\n211#1:669\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.layout.s1, androidx.compose.ui.unit.b, androidx.compose.ui.layout.n0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11090c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11091d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11092e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11093f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11094g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11095h;

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,598:1\n33#2,6:599\n33#2,6:605\n33#2,6:611\n33#2,6:617\n33#2,6:623\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1$1\n*L\n309#1:599,6\n312#1:605,6\n315#1:611,6\n323#1:617,6\n328#1:623,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f11096b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f11097c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f11098d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f11099e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j5 f11100f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f11101g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f11102h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.n2 f11103i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.s1 f11104j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f11105k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f11106l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Integer f11107m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f11108n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ Integer f11109o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends androidx.compose.ui.layout.i1> list, List<? extends androidx.compose.ui.layout.i1> list2, List<? extends androidx.compose.ui.layout.i1> list3, List<? extends androidx.compose.ui.layout.i1> list4, j5 j5Var, int i4, int i5, androidx.compose.foundation.layout.n2 n2Var, androidx.compose.ui.layout.s1 s1Var, int i6, int i7, Integer num, List<? extends androidx.compose.ui.layout.i1> list5, Integer num2) {
                super(1);
                this.f11096b = list;
                this.f11097c = list2;
                this.f11098d = list3;
                this.f11099e = list4;
                this.f11100f = j5Var;
                this.f11101g = i4;
                this.f11102h = i5;
                this.f11103i = n2Var;
                this.f11104j = s1Var;
                this.f11105k = i6;
                this.f11106l = i7;
                this.f11107m = num;
                this.f11108n = list5;
                this.f11109o = num2;
            }

            public final void a(@fg.l i1.a aVar) {
                List<androidx.compose.ui.layout.i1> list = this.f11096b;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    i1.a.g(aVar, list.get(i4), 0, 0, 0.0f, 4, null);
                }
                List<androidx.compose.ui.layout.i1> list2 = this.f11097c;
                int size2 = list2.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    i1.a.g(aVar, list2.get(i5), 0, 0, 0.0f, 4, null);
                }
                List<androidx.compose.ui.layout.i1> list3 = this.f11098d;
                int i6 = this.f11101g;
                int i7 = this.f11102h;
                androidx.compose.foundation.layout.n2 n2Var = this.f11103i;
                androidx.compose.ui.layout.s1 s1Var = this.f11104j;
                int i10 = this.f11105k;
                int i11 = this.f11106l;
                int size3 = list3.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    i1.a.g(aVar, list3.get(i12), n2Var.d(s1Var, s1Var.getLayoutDirection()) + ((i6 - i7) / 2), i10 - i11, 0.0f, 4, null);
                }
                List<androidx.compose.ui.layout.i1> list4 = this.f11099e;
                int i13 = this.f11105k;
                Integer num = this.f11107m;
                int size4 = list4.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    i1.a.g(aVar, list4.get(i14), 0, i13 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                j5 j5Var = this.f11100f;
                if (j5Var != null) {
                    List<androidx.compose.ui.layout.i1> list5 = this.f11108n;
                    int i15 = this.f11105k;
                    Integer num2 = this.f11109o;
                    int size5 = list5.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        androidx.compose.ui.layout.i1 i1Var = list5.get(i16);
                        int left = j5Var.getLeft();
                        kotlin.jvm.internal.l0.m(num2);
                        i1.a.g(aVar, i1Var, left, i15 - num2.intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.n2 f11110b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.s1 f11111c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f11112d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f11113e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<androidx.compose.ui.layout.i1> f11114f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Integer f11115g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11116h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.foundation.layout.n2 n2Var, androidx.compose.ui.layout.s1 s1Var, List<? extends androidx.compose.ui.layout.i1> list, int i4, List<? extends androidx.compose.ui.layout.i1> list2, Integer num, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                super(2);
                this.f11110b = n2Var;
                this.f11111c = s1Var;
                this.f11112d = list;
                this.f11113e = i4;
                this.f11114f = list2;
                this.f11115g = num;
                this.f11116h = qVar;
            }

            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                Integer num;
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1655277373, i4, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:285)");
                }
                androidx.compose.foundation.layout.l1 h4 = androidx.compose.foundation.layout.r2.h(this.f11110b, this.f11111c);
                this.f11116h.R(androidx.compose.foundation.layout.j1.d(androidx.compose.foundation.layout.j1.i(h4, this.f11111c.getLayoutDirection()), this.f11112d.isEmpty() ? h4.getTop() : this.f11111c.R(this.f11113e), androidx.compose.foundation.layout.j1.h(h4, this.f11111c.getLayoutDirection()), (this.f11114f.isEmpty() || (num = this.f11115g) == null) ? h4.getBottom() : this.f11111c.R(num.intValue())), tVar, 0);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: Scaffold.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j5 f11117b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11118c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(j5 j5Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f11117b = j5Var;
                this.f11118c = pVar;
            }

            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(1843374446, i4, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:258)");
                }
                androidx.compose.runtime.f0.b(g8.i().e(this.f11117b), this.f11118c, tVar, androidx.compose.runtime.b3.f15974d);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, int i4, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
            super(2);
            this.f11089b = pVar;
            this.f11090c = pVar2;
            this.f11091d = pVar3;
            this.f11092e = i4;
            this.f11093f = n2Var;
            this.f11094g = pVar4;
            this.f11095h = qVar;
        }

        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.s1 s1Var, long j4) {
            Object obj;
            ArrayList arrayList;
            Object obj2;
            Object obj3;
            j5 j5Var;
            Object obj4;
            boolean z4;
            Integer num;
            int c5;
            Object obj5;
            Object obj6;
            boolean h4;
            int i4;
            int q22;
            int p4 = androidx.compose.ui.unit.b.p(j4);
            int o4 = androidx.compose.ui.unit.b.o(j4);
            long e4 = androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null);
            List<androidx.compose.ui.layout.l0> E2 = s1Var.E2(h8.TopBar, this.f11089b);
            ArrayList arrayList2 = new ArrayList(E2.size());
            for (int i5 = 0; i5 < E2.size(); i5 = androidx.compose.animation.n.a(E2.get(i5), e4, arrayList2, i5, 1)) {
            }
            if (arrayList2.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList2.get(0);
                int height = ((androidx.compose.ui.layout.i1) obj).getHeight();
                int J = kotlin.collections.w.J(arrayList2);
                if (1 <= J) {
                    int i6 = 1;
                    while (true) {
                        Object obj7 = arrayList2.get(i6);
                        int height2 = ((androidx.compose.ui.layout.i1) obj7).getHeight();
                        if (height < height2) {
                            obj = obj7;
                            height = height2;
                        }
                        if (i6 == J) {
                            break;
                        }
                        i6++;
                    }
                }
            }
            androidx.compose.ui.layout.i1 i1Var = (androidx.compose.ui.layout.i1) obj;
            int height3 = i1Var != null ? i1Var.getHeight() : 0;
            List<androidx.compose.ui.layout.l0> E22 = s1Var.E2(h8.Snackbar, this.f11090c);
            androidx.compose.foundation.layout.n2 n2Var = this.f11093f;
            ArrayList arrayList3 = new ArrayList(E22.size());
            int i7 = 0;
            for (int size = E22.size(); i7 < size; size = size) {
                i7 = androidx.compose.animation.n.a(E22.get(i7), androidx.compose.ui.unit.c.i(e4, (-n2Var.d(s1Var, s1Var.getLayoutDirection())) - n2Var.b(s1Var, s1Var.getLayoutDirection()), -n2Var.c(s1Var)), arrayList3, i7, 1);
                arrayList3 = arrayList3;
            }
            ArrayList arrayList4 = arrayList3;
            if (arrayList4.isEmpty()) {
                arrayList = arrayList4;
                obj2 = null;
            } else {
                arrayList = arrayList4;
                obj2 = arrayList.get(0);
                int height4 = ((androidx.compose.ui.layout.i1) obj2).getHeight();
                int J2 = kotlin.collections.w.J(arrayList);
                if (1 <= J2) {
                    int i10 = 1;
                    while (true) {
                        Object obj8 = arrayList.get(i10);
                        int height5 = ((androidx.compose.ui.layout.i1) obj8).getHeight();
                        if (height4 < height5) {
                            obj2 = obj8;
                            height4 = height5;
                        }
                        if (i10 == J2) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            androidx.compose.ui.layout.i1 i1Var2 = (androidx.compose.ui.layout.i1) obj2;
            int height6 = i1Var2 != null ? i1Var2.getHeight() : 0;
            if (arrayList.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList.get(0);
                int width = ((androidx.compose.ui.layout.i1) obj3).getWidth();
                int J3 = kotlin.collections.w.J(arrayList);
                if (1 <= J3) {
                    int i11 = 1;
                    while (true) {
                        Object obj9 = arrayList.get(i11);
                        int width2 = ((androidx.compose.ui.layout.i1) obj9).getWidth();
                        if (width < width2) {
                            obj3 = obj9;
                            width = width2;
                        }
                        if (i11 == J3) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            androidx.compose.ui.layout.i1 i1Var3 = (androidx.compose.ui.layout.i1) obj3;
            int width3 = i1Var3 != null ? i1Var3.getWidth() : 0;
            List<androidx.compose.ui.layout.l0> E23 = s1Var.E2(h8.Fab, this.f11091d);
            androidx.compose.foundation.layout.n2 n2Var2 = this.f11093f;
            ArrayList arrayList5 = new ArrayList(E23.size());
            int size2 = E23.size();
            for (int i12 = 0; i12 < size2; i12++) {
                androidx.compose.ui.layout.i1 m02 = E23.get(i12).m0(androidx.compose.ui.unit.c.i(e4, (-n2Var2.d(s1Var, s1Var.getLayoutDirection())) - n2Var2.b(s1Var, s1Var.getLayoutDirection()), -n2Var2.c(s1Var)));
                if (m02.getHeight() == 0 || m02.getWidth() == 0) {
                    m02 = null;
                }
                if (m02 != null) {
                    arrayList5.add(m02);
                }
            }
            if (arrayList5.isEmpty()) {
                j5Var = null;
            } else {
                if (arrayList5.isEmpty()) {
                    obj5 = null;
                } else {
                    obj5 = arrayList5.get(0);
                    int width4 = ((androidx.compose.ui.layout.i1) obj5).getWidth();
                    int J4 = kotlin.collections.w.J(arrayList5);
                    if (1 <= J4) {
                        Object obj10 = obj5;
                        int i13 = width4;
                        int i14 = 1;
                        while (true) {
                            Object obj11 = arrayList5.get(i14);
                            int width5 = ((androidx.compose.ui.layout.i1) obj11).getWidth();
                            if (i13 < width5) {
                                obj10 = obj11;
                                i13 = width5;
                            }
                            if (i14 == J4) {
                                break;
                            }
                            i14++;
                        }
                        obj5 = obj10;
                    }
                }
                kotlin.jvm.internal.l0.m(obj5);
                int width6 = ((androidx.compose.ui.layout.i1) obj5).getWidth();
                if (arrayList5.isEmpty()) {
                    obj6 = null;
                } else {
                    obj6 = arrayList5.get(0);
                    int height7 = ((androidx.compose.ui.layout.i1) obj6).getHeight();
                    int J5 = kotlin.collections.w.J(arrayList5);
                    if (1 <= J5) {
                        Object obj12 = obj6;
                        int i15 = height7;
                        int i16 = 1;
                        while (true) {
                            Object obj13 = arrayList5.get(i16);
                            int height8 = ((androidx.compose.ui.layout.i1) obj13).getHeight();
                            if (i15 < height8) {
                                obj12 = obj13;
                                i15 = height8;
                            }
                            if (i16 == J5) {
                                break;
                            }
                            i16++;
                        }
                        obj6 = obj12;
                    }
                }
                kotlin.jvm.internal.l0.m(obj6);
                int height9 = ((androidx.compose.ui.layout.i1) obj6).getHeight();
                int i17 = this.f11092e;
                k5.Companion companion = k5.INSTANCE;
                companion.getClass();
                if (!k5.h(i17, k5.f12090c)) {
                    companion.getClass();
                    if (k5.h(i17, k5.f12092e)) {
                        h4 = true;
                    } else {
                        companion.getClass();
                        h4 = k5.h(i17, k5.f12093f);
                    }
                    if (!h4) {
                        i4 = (p4 - width6) / 2;
                    } else if (s1Var.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
                        q22 = s1Var.q2(g8.f11023c);
                        i4 = (p4 - q22) - width6;
                    } else {
                        i4 = s1Var.q2(g8.f11023c);
                    }
                    j5Var = new j5(i4, width6, height9);
                } else if (s1Var.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr) {
                    i4 = s1Var.q2(g8.f11023c);
                    j5Var = new j5(i4, width6, height9);
                } else {
                    q22 = s1Var.q2(g8.f11023c);
                    i4 = (p4 - q22) - width6;
                    j5Var = new j5(i4, width6, height9);
                }
            }
            List<androidx.compose.ui.layout.l0> E24 = s1Var.E2(h8.BottomBar, new androidx.compose.runtime.internal.b(1843374446, true, new c(j5Var, this.f11094g)));
            ArrayList arrayList6 = new ArrayList(E24.size());
            int i18 = 0;
            for (int size3 = E24.size(); i18 < size3; size3 = size3) {
                i18 = androidx.compose.animation.n.a(E24.get(i18), e4, arrayList6, i18, 1);
                arrayList5 = arrayList5;
            }
            ArrayList arrayList7 = arrayList5;
            if (arrayList6.isEmpty()) {
                obj4 = null;
                z4 = true;
            } else {
                obj4 = arrayList6.get(0);
                int height10 = ((androidx.compose.ui.layout.i1) obj4).getHeight();
                int J6 = kotlin.collections.w.J(arrayList6);
                z4 = true;
                if (1 <= J6) {
                    int i19 = height10;
                    int i20 = 1;
                    while (true) {
                        Object obj14 = arrayList6.get(i20);
                        int height11 = ((androidx.compose.ui.layout.i1) obj14).getHeight();
                        if (i19 < height11) {
                            i19 = height11;
                            obj4 = obj14;
                        }
                        if (i20 == J6) {
                            break;
                        }
                        i20++;
                    }
                }
            }
            androidx.compose.ui.layout.i1 i1Var4 = (androidx.compose.ui.layout.i1) obj4;
            Integer valueOf = i1Var4 != null ? Integer.valueOf(i1Var4.getHeight()) : null;
            if (j5Var != null) {
                int i21 = this.f11092e;
                androidx.compose.foundation.layout.n2 n2Var3 = this.f11093f;
                if (valueOf != null) {
                    k5.INSTANCE.getClass();
                    if (!k5.h(i21, k5.f12093f)) {
                        c5 = s1Var.q2(g8.f11023c) + j5Var.getHeight() + valueOf.intValue();
                        num = Integer.valueOf(c5);
                    }
                }
                c5 = n2Var3.c(s1Var) + s1Var.q2(g8.f11023c) + j5Var.getHeight();
                num = Integer.valueOf(c5);
            } else {
                num = null;
            }
            int intValue = height6 != 0 ? height6 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : this.f11093f.c(s1Var)) : 0;
            ArrayList arrayList8 = arrayList;
            j5 j5Var2 = j5Var;
            List<androidx.compose.ui.layout.l0> E25 = s1Var.E2(h8.MainContent, new androidx.compose.runtime.internal.b(1655277373, z4, new b(this.f11093f, s1Var, arrayList2, height3, arrayList6, valueOf, this.f11095h)));
            ArrayList arrayList9 = new ArrayList(E25.size());
            for (int i22 = 0; i22 < E25.size(); i22 = androidx.compose.animation.n.a(E25.get(i22), e4, arrayList9, i22, 1)) {
            }
            return androidx.compose.ui.layout.o0.x2(s1Var, p4, o4, null, new a(arrayList9, arrayList2, arrayList8, arrayList6, j5Var2, p4, width3, this.f11093f, s1Var, o4, intValue, valueOf, arrayList7, num), 4, null);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.n0 invoke(androidx.compose.ui.layout.s1 s1Var, androidx.compose.ui.unit.b bVar) {
            return a(s1Var, bVar.getValue());
        }
    }

    /* compiled from: Scaffold.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11119b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11120c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.l1, androidx.compose.runtime.t, Integer, kotlin.k2> f11121d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11122e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11123f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f11124g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11125h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f11126i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(int i4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, int i5) {
            super(2);
            this.f11119b = i4;
            this.f11120c = pVar;
            this.f11121d = qVar;
            this.f11122e = pVar2;
            this.f11123f = pVar3;
            this.f11124g = n2Var;
            this.f11125h = pVar4;
            this.f11126i = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            g8.d(this.f11119b, this.f11120c, this.f11121d, this.f11122e, this.f11123f, this.f11124g, this.f11125h, tVar, androidx.compose.runtime.g3.b(this.f11126i | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        androidx.compose.runtime.k2 g4;
        g4 = androidx.compose.runtime.t4.g(Boolean.TRUE, null, 2, null);
        f11021a = g4;
        f11022b = androidx.compose.runtime.f0.f(c.f11059b);
        f11023c = androidx.compose.ui.unit.h.g(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.i
    public static final void a(int i4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.runtime.t tVar, int i5) {
        int i6;
        int i7;
        androidx.compose.runtime.t o4 = tVar.o(1307205667);
        if ((i5 & 6) == 0) {
            i6 = (o4.f(i4) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= o4.S(qVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= o4.S(pVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= o4.S(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= o4.q0(n2Var) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i6 |= o4.S(pVar4) ? 1048576 : 524288;
        }
        if ((i6 & 599187) == 599186 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1307205667, i6, -1, "androidx.compose.material3.LegacyScaffoldLayout (Scaffold.kt:347)");
            }
            o4.P(1646578117);
            boolean z4 = ((i6 & 112) == 32) | ((i6 & 7168) == 2048) | ((458752 & i6) == 131072) | ((57344 & i6) == 16384) | ((i6 & 14) == 4) | ((3670016 & i6) == 1048576) | ((i6 & 896) == 256);
            Object Q = o4.Q();
            if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                i7 = 1;
                Q = new a(pVar, pVar2, pVar3, i4, n2Var, pVar4, qVar);
                o4.E(Q);
            } else {
                i7 = 1;
            }
            o4.p0();
            androidx.compose.ui.layout.q1.a(null, (ld.p) Q, o4, 0, i7);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new b(i4, pVar, qVar, pVar2, pVar3, n2Var, pVar4, i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0274  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.m androidx.compose.ui.q r29, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r30, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r31, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r32, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, int r34, long r35, long r37, @fg.m androidx.compose.foundation.layout.n2 r39, @fg.l ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r40, @fg.m androidx.compose.runtime.t r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.g8.b(androidx.compose.ui.q, ld.p, ld.p, ld.p, ld.p, int, long, long, androidx.compose.foundation.layout.n2, ld.q, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.i
    public static final void c(int i4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.runtime.t tVar, int i5) {
        int i6;
        androidx.compose.runtime.t o4 = tVar.o(-975511942);
        if ((i5 & 6) == 0) {
            i6 = (o4.f(i4) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= o4.S(qVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= o4.S(pVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= o4.S(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= o4.q0(n2Var) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= o4.S(pVar4) ? 1048576 : 524288;
        }
        if ((599187 & i6) == 599186 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-975511942, i6, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:141)");
            }
            if (j()) {
                o4.P(-915303637);
                d(i4, pVar, qVar, pVar2, pVar3, n2Var, pVar4, o4, i6 & 4194302);
                o4.p0();
            } else {
                o4.P(-915303332);
                a(i4, pVar, qVar, pVar2, pVar3, n2Var, pVar4, o4, i6 & 4194302);
                o4.p0();
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new g(i4, pVar, qVar, pVar2, pVar3, n2Var, pVar4, i5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.i
    public static final void d(int i4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.q<? super androidx.compose.foundation.layout.l1, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.runtime.t tVar, int i5) {
        int i6;
        int i7;
        androidx.compose.runtime.t o4 = tVar.o(-2037614249);
        if ((i5 & 6) == 0) {
            i6 = (o4.f(i4) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= o4.S(pVar) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= o4.S(qVar) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= o4.S(pVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= o4.S(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= o4.q0(n2Var) ? 131072 : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i6 |= o4.S(pVar4) ? 1048576 : 524288;
        }
        if ((i6 & 599187) == 599186 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2037614249, i6, -1, "androidx.compose.material3.ScaffoldLayoutWithMeasureFix (Scaffold.kt:177)");
            }
            o4.P(-273325894);
            boolean z4 = ((i6 & 112) == 32) | ((i6 & 7168) == 2048) | ((458752 & i6) == 131072) | ((57344 & i6) == 16384) | ((i6 & 14) == 4) | ((3670016 & i6) == 1048576) | ((i6 & 896) == 256);
            Object Q = o4.Q();
            if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                i7 = 1;
                Q = new h(pVar, pVar2, pVar3, i4, n2Var, pVar4, qVar);
                o4.E(Q);
            } else {
                i7 = 1;
            }
            o4.p0();
            androidx.compose.ui.layout.q1.a(null, (ld.p) Q, o4, 0, i7);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new i(i4, pVar, qVar, pVar2, pVar3, n2Var, pVar4, i5));
        }
    }

    @fg.l
    public static final androidx.compose.runtime.a3<j5> i() {
        return f11022b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @f5
    public static final boolean j() {
        return ((Boolean) f11021a.getValue()).booleanValue();
    }

    @f5
    public static /* synthetic */ void k() {
    }

    @f5
    public static final void l(boolean z4) {
        f11021a.setValue(Boolean.valueOf(z4));
    }
}
