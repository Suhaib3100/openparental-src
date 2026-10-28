package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\u001a¦\u0001\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001d\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"\"\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"\"\u0014\u0010)\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "buttons", "Landroidx/compose/ui/q;", "modifier", "icon", "title", "text", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "containerColor", "Landroidx/compose/ui/unit/h;", "tonalElevation", "buttonContentColor", "iconContentColor", "titleContentColor", "textContentColor", "a", "(Lld/p;Landroidx/compose/ui/q;Lld/p;Lld/p;Lld/p;Landroidx/compose/ui/graphics/e6;JFJJJJLandroidx/compose/runtime/t;III)V", "mainAxisSpacing", "crossAxisSpacing", "content", "b", "(FFLld/p;Landroidx/compose/runtime/t;I)V", "F", "h", "()F", "DialogMinWidth", "g", "DialogMaxWidth", "Landroidx/compose/foundation/layout/l1;", "c", "Landroidx/compose/foundation/layout/l1;", "DialogPadding", "d", "IconPadding", "e", "TitlePadding", "f", "TextPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,224:1\n1116#2,6:225\n75#3,14:231\n91#3:265\n456#4,8:245\n464#4,6:259\n3737#5,6:253\n154#6:266\n154#6:267\n154#6:268\n154#6:269\n154#6:270\n154#6:271\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt\n*L\n131#1:225,6\n131#1:231,14\n131#1:265\n131#1:245,8\n131#1:259,6\n131#1:253,6\n216#1:266\n217#1:267\n220#1:268\n221#1:269\n222#1:270\n223#1:271\n*E\n"})
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final float f10553a = androidx.compose.ui.unit.h.g(280);

    /* renamed from: b, reason: collision with root package name */
    private static final float f10554b = 560;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f10555c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f10556d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f10557e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.layout.l1 f10558f;

    /* compiled from: AlertDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,224:1\n74#2,6:225\n80#2:259\n84#2:304\n78#3,11:231\n78#3,11:266\n91#3:298\n91#3:303\n456#4,8:242\n464#4,3:256\n456#4,8:277\n464#4,3:291\n467#4,3:295\n467#4,3:300\n3737#5,6:250\n3737#5,6:285\n68#6,6:260\n74#6:294\n78#6:299\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n*L\n60#1:225,6\n60#1:259\n60#1:304\n60#1:231,11\n109#1:266,11\n109#1:298\n60#1:303\n60#1:242,8\n60#1:256,3\n109#1:277,8\n109#1:291,3\n109#1:295,3\n60#1:300,3\n60#1:250,6\n109#1:285,6\n109#1:260,6\n109#1:294\n109#1:299\n*E\n"})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10559b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10560c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10561d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f10562e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f10563f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f10564g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f10565h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10566i;

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,224:1\n68#2,6:225\n74#2:259\n78#2:264\n78#3,11:231\n91#3:263\n456#4,8:242\n464#4,3:256\n467#4,3:260\n3737#5,6:250\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$1$1\n*L\n65#1:225,6\n65#1:259\n65#1:264\n65#1:231,11\n65#1:263\n65#1:242,8\n65#1:256,3\n65#1:260,3\n65#1:250,6\n*E\n"})
        /* renamed from: androidx.compose.material3.e$a$a, reason: collision with other inner class name */
        static final class C0237a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.u f10567b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10568c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0237a(androidx.compose.foundation.layout.u uVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f10567b = uVar;
                this.f10568c = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(934657765, i4, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:64)");
                }
                androidx.compose.foundation.layout.u uVar = this.f10567b;
                androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, e.f10556d);
                c.Companion companion = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.q e4 = uVar.e(j4, companion.m());
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f10568c;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(companion, false, tVar, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$2$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,224:1\n68#2,6:225\n74#2:259\n78#2:264\n78#3,11:231\n91#3:263\n456#4,8:242\n464#4,3:256\n467#4,3:260\n3737#5,6:250\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$2$1\n*L\n78#1:225,6\n78#1:259\n78#1:264\n78#1:231,11\n78#1:263\n78#1:242,8\n78#1:256,3\n78#1:260,3\n78#1:250,6\n*E\n"})
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.u f10569b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10570c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10571d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(androidx.compose.foundation.layout.u uVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2) {
                super(2);
                this.f10569b = uVar;
                this.f10570c = pVar;
                this.f10571d = pVar2;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(434448772, i4, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:77)");
                }
                androidx.compose.ui.q e4 = this.f10569b.e(androidx.compose.foundation.layout.j1.j(androidx.compose.ui.q.INSTANCE, e.f10557e), this.f10570c == null ? androidx.compose.ui.c.INSTANCE.u() : androidx.compose.ui.c.INSTANCE.m());
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f10571d;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
                int j4 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                    androidx.compose.animation.d.a(j4, tVar, j4, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
                    androidx.compose.runtime.x.q0();
                }
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$3$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,224:1\n68#2,6:225\n74#2:259\n78#2:264\n78#3,11:231\n91#3:263\n456#4,8:242\n464#4,3:256\n467#4,3:260\n3737#5,6:250\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1$1$3$1\n*L\n99#1:225,6\n99#1:259\n99#1:264\n99#1:231,11\n99#1:263\n99#1:242,8\n99#1:256,3\n99#1:260,3\n99#1:250,6\n*E\n"})
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.u f10572b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10573c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(androidx.compose.foundation.layout.u uVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
                super(2);
                this.f10572b = uVar;
                this.f10573c = pVar;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(-796843771, i4, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:98)");
                }
                androidx.compose.foundation.layout.u uVar = this.f10572b;
                androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(uVar.b(androidx.compose.ui.q.INSTANCE, 1.0f, false), e.f10558f);
                c.Companion companion = androidx.compose.ui.c.INSTANCE;
                androidx.compose.ui.q e4 = uVar.e(j4, companion.u());
                ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f10573c;
                tVar.P(733328855);
                androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(companion, false, tVar, 0, -1323940314);
                int j5 = androidx.compose.runtime.p.j(tVar, 0);
                androidx.compose.runtime.g0 B = tVar.B();
                g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
                ld.a<androidx.compose.ui.node.g> a6 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(e4);
                if (tVar.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                tVar.W();
                if (tVar.getInserting()) {
                    tVar.F(a6);
                } else {
                    tVar.C();
                }
                ld.p a7 = androidx.compose.animation.p.a(companion2, tVar, a5, tVar, B);
                if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                    androidx.compose.animation.d.a(j5, tVar, j5, a7);
                }
                androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                if (androidx.compose.foundation.x.a(0, pVar, tVar)) {
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
        a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, long j4, long j5, long j6, long j7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4) {
            super(2);
            this.f10559b = pVar;
            this.f10560c = pVar2;
            this.f10561d = pVar3;
            this.f10562e = j4;
            this.f10563f = j5;
            this.f10564g = j6;
            this.f10565h = j7;
            this.f10566i = pVar4;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar;
            g.Companion companion;
            c.Companion companion2;
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-2126308228, i4, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:59)");
            }
            q.Companion companion3 = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q j4 = androidx.compose.foundation.layout.j1.j(companion3, e.f10555c);
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar2 = this.f10559b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar3 = this.f10560c;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar4 = this.f10561d;
            long j5 = this.f10562e;
            long j6 = this.f10563f;
            long j7 = this.f10564g;
            long j10 = this.f10565h;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar5 = this.f10566i;
            tVar.P(-483455358);
            i.m r4 = androidx.compose.foundation.layout.i.f5073a.r();
            c.Companion companion4 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(companion4, r4, tVar, 0, -1323940314);
            int j11 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion5 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion5.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(j4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion5, tVar, a5, tVar, B);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j11))) {
                androidx.compose.animation.d.a(j11, tVar, j11, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            tVar.P(76440827);
            if (pVar2 != null) {
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j5)), androidx.compose.runtime.internal.c.b(tVar, 934657765, true, new C0237a(vVar, pVar2)), tVar, androidx.compose.runtime.b3.f15974d | 48);
            }
            tVar.p0();
            tVar.P(76441222);
            if (pVar3 == null) {
                pVar = pVar5;
                companion = companion5;
                companion2 = companion4;
            } else {
                pVar = pVar5;
                companion = companion5;
                companion2 = companion4;
                w7.a(j6, tb.a(p6.f13227a.c(tVar, 6), c0.k.f37551a.k()), androidx.compose.runtime.internal.c.b(tVar, 434448772, true, new b(vVar, pVar2, pVar3)), tVar, 384);
            }
            tVar.p0();
            tVar.P(76442054);
            if (pVar4 != null) {
                w7.a(j7, tb.a(p6.f13227a.c(tVar, 6), c0.k.f37551a.o()), androidx.compose.runtime.internal.c.b(tVar, -796843771, true, new c(vVar, pVar4)), tVar, 384);
            }
            tVar.p0();
            androidx.compose.ui.q e4 = vVar.e(companion3, companion2.s());
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a8 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, -1323940314);
            int j12 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B2 = tVar.B();
            ld.a<androidx.compose.ui.node.g> a10 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(e4);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a10);
            } else {
                tVar.C();
            }
            ld.p a11 = androidx.compose.animation.p.a(companion, tVar, a8, tVar, B2);
            if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j12))) {
                androidx.compose.animation.d.a(j12, tVar, j12, a11);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar6 = androidx.compose.foundation.layout.p.f5235a;
            w7.a(j10, tb.a(p6.f13227a.c(tVar, 6), c0.k.f37551a.d()), pVar, tVar, 0);
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
            tVar.p0();
            tVar.H();
            tVar.p0();
            tVar.p0();
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

    /* compiled from: AlertDialog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10575c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10576d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10577e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10578f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f10579g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f10580h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f10581i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f10582j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f10583k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f10584l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f10585m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f10586n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f10587o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f10588p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, androidx.compose.ui.graphics.e6 e6Var, long j4, float f4, long j5, long j6, long j7, long j10, int i4, int i5, int i6) {
            super(2);
            this.f10574b = pVar;
            this.f10575c = qVar;
            this.f10576d = pVar2;
            this.f10577e = pVar3;
            this.f10578f = pVar4;
            this.f10579g = e6Var;
            this.f10580h = j4;
            this.f10581i = f4;
            this.f10582j = j5;
            this.f10583k = j6;
            this.f10584l = j7;
            this.f10585m = j10;
            this.f10586n = i4;
            this.f10587o = i5;
            this.f10588p = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            e.a(this.f10574b, this.f10575c, this.f10576d, this.f10577e, this.f10578f, this.f10579g, this.f10580h, this.f10581i, this.f10582j, this.f10583k, this.f10584l, this.f10585m, tVar, androidx.compose.runtime.g3.b(this.f10586n | 1), androidx.compose.runtime.g3.b(this.f10587o), this.f10588p);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: AlertDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,224:1\n33#2,6:225\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1\n*L\n167#1:225,6\n*E\n"})
    static final class c implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f10589a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f10590b;

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,224:1\n69#2,4:225\n69#2,6:229\n74#2:235\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogFlowRow$1$1$2\n*L\n194#1:225,4\n205#1:229,6\n194#1:235\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<List<androidx.compose.ui.layout.i1>> f10591b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.o0 f10592c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f10593d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f10594e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<Integer> f10595f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<List<androidx.compose.ui.layout.i1>> list, androidx.compose.ui.layout.o0 o0Var, float f4, int i4, List<Integer> list2) {
                super(1);
                this.f10591b = list;
                this.f10592c = o0Var;
                this.f10593d = f4;
                this.f10594e = i4;
                this.f10595f = list2;
            }

            public final void a(@fg.l i1.a aVar) {
                List<List<androidx.compose.ui.layout.i1>> list = this.f10591b;
                androidx.compose.ui.layout.o0 o0Var = this.f10592c;
                float f4 = this.f10593d;
                int i4 = this.f10594e;
                List<Integer> list2 = this.f10595f;
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    List<androidx.compose.ui.layout.i1> list3 = list.get(i5);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    int i6 = 0;
                    while (i6 < size2) {
                        iArr[i6] = list3.get(i6).getWidth() + (i6 < kotlin.collections.w.J(list3) ? o0Var.q2(f4) : 0);
                        i6++;
                    }
                    i.e h4 = androidx.compose.foundation.layout.i.f5073a.h();
                    int[] iArr2 = new int[size2];
                    for (int i7 = 0; i7 < size2; i7++) {
                        iArr2[i7] = 0;
                    }
                    h4.e(o0Var, i4, iArr, o0Var.getLayoutDirection(), iArr2);
                    int size3 = list3.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        i1.a.g(aVar, list3.get(i10), iArr2[i10], list2.get(i5).intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        c(float f4, float f5) {
            this.f10589a = f4;
            this.f10590b = f5;
        }

        private static final boolean j(List<androidx.compose.ui.layout.i1> list, k1.f fVar, androidx.compose.ui.layout.o0 o0Var, float f4, long j4, androidx.compose.ui.layout.i1 i1Var) {
            if (!list.isEmpty()) {
                if (i1Var.getWidth() + o0Var.q2(f4) + fVar.f75327b > androidx.compose.ui.unit.b.p(j4)) {
                    return false;
                }
            }
            return true;
        }

        private static final void k(List<List<androidx.compose.ui.layout.i1>> list, k1.f fVar, androidx.compose.ui.layout.o0 o0Var, float f4, List<androidx.compose.ui.layout.i1> list2, List<Integer> list3, k1.f fVar2, List<Integer> list4, k1.f fVar3, k1.f fVar4) {
            if (!list.isEmpty()) {
                fVar.f75327b = o0Var.q2(f4) + fVar.f75327b;
            }
            list.add(0, kotlin.collections.w.V5(list2));
            list3.add(Integer.valueOf(fVar2.f75327b));
            list4.add(Integer.valueOf(fVar.f75327b));
            fVar.f75327b += fVar2.f75327b;
            fVar3.f75327b = Math.max(fVar3.f75327b, fVar4.f75327b);
            list2.clear();
            fVar4.f75327b = 0;
            fVar2.f75327b = 0;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            k1.f fVar;
            k1.f fVar2;
            ArrayList arrayList;
            k1.f fVar3;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            k1.f fVar4 = new k1.f();
            k1.f fVar5 = new k1.f();
            ArrayList arrayList5 = new ArrayList();
            k1.f fVar6 = new k1.f();
            k1.f fVar7 = new k1.f();
            float f4 = this.f10589a;
            float f5 = this.f10590b;
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList6 = arrayList4;
                k1.f fVar8 = fVar4;
                androidx.compose.ui.layout.i1 m02 = list.get(i4).m0(j4);
                int i5 = i4;
                float f6 = f5;
                int i6 = size;
                float f7 = f4;
                if (j(arrayList5, fVar6, o0Var, f4, j4, m02)) {
                    fVar = fVar7;
                    fVar2 = fVar6;
                    arrayList = arrayList5;
                } else {
                    fVar = fVar7;
                    fVar2 = fVar6;
                    arrayList = arrayList5;
                    k(arrayList2, fVar5, o0Var, f6, arrayList5, arrayList3, fVar7, arrayList6, fVar8, fVar2);
                }
                if (arrayList.isEmpty()) {
                    fVar3 = fVar2;
                } else {
                    fVar3 = fVar2;
                    fVar3.f75327b = o0Var.q2(f7) + fVar3.f75327b;
                }
                ArrayList arrayList7 = arrayList;
                arrayList7.add(m02);
                fVar3.f75327b = m02.getWidth() + fVar3.f75327b;
                fVar.f75327b = Math.max(fVar.f75327b, m02.getHeight());
                i4 = i5 + 1;
                fVar6 = fVar3;
                f4 = f7;
                fVar7 = fVar;
                arrayList4 = arrayList6;
                fVar4 = fVar8;
                size = i6;
                arrayList5 = arrayList7;
                f5 = f6;
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList4;
            k1.f fVar9 = fVar4;
            k1.f fVar10 = fVar7;
            k1.f fVar11 = fVar6;
            if (!arrayList8.isEmpty()) {
                k(arrayList2, fVar5, o0Var, this.f10590b, arrayList8, arrayList3, fVar10, arrayList9, fVar9, fVar11);
            }
            int max = Math.max(fVar9.f75327b, androidx.compose.ui.unit.b.r(j4));
            return androidx.compose.ui.layout.o0.x2(o0Var, max, Math.max(fVar5.f75327b, androidx.compose.ui.unit.b.q(j4)), null, new a(arrayList2, o0Var, this.f10589a, max, arrayList9), 4, null);
        }
    }

    /* compiled from: AlertDialog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f10596b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10597c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10598d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f10599e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(float f4, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f10596b = f4;
            this.f10597c = f5;
            this.f10598d = pVar;
            this.f10599e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            e.b(this.f10596b, this.f10597c, this.f10598d, tVar, androidx.compose.runtime.g3.b(this.f10599e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 24;
        f10555c = androidx.compose.foundation.layout.j1.a(f4);
        float f5 = 16;
        f10556d = androidx.compose.foundation.layout.j1.e(0.0f, 0.0f, 0.0f, f5, 7, null);
        f10557e = androidx.compose.foundation.layout.j1.e(0.0f, 0.0f, 0.0f, f5, 7, null);
        f10558f = androidx.compose.foundation.layout.j1.e(0.0f, 0.0f, 0.0f, f4, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00be  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r33, @fg.m androidx.compose.ui.q r34, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r35, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r36, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r37, @fg.l androidx.compose.ui.graphics.e6 r38, long r39, float r41, long r42, long r44, long r46, long r48, @fg.m androidx.compose.runtime.t r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.e.a(ld.p, androidx.compose.ui.q, ld.p, ld.p, ld.p, androidx.compose.ui.graphics.e6, long, float, long, long, long, long, androidx.compose.runtime.t, int, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(float f4, float f5, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(586821353);
        if ((i4 & 6) == 0) {
            i5 = (o4.d(f4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.d(f5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(586821353, i5, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:129)");
            }
            o4.P(-1133133582);
            boolean z4 = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object Q = o4.Q();
            if (z4 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new c(f4, f5);
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            int i6 = (i5 >> 6) & 14;
            o4.P(-1323940314);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
            int i7 = ((i6 << 9) & 7168) | 6;
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a5);
            } else {
                o4.C();
            }
            ld.p a6 = androidx.compose.animation.p.a(companion2, o4, m0Var, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            pVar.invoke(o4, Integer.valueOf((i7 >> 9) & 14));
            o4.p0();
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new d(f4, f5, pVar, i4));
        }
    }

    public static final float g() {
        return f10554b;
    }

    public static final float h() {
        return f10553a;
    }
}
