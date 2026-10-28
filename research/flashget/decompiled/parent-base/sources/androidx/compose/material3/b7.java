package androidx.compose.material3;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.foundation.layout.i;
import androidx.compose.material3.t9;
import androidx.compose.material3.x7;
import androidx.compose.runtime.t;
import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: ModalBottomSheet.android.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a¹\u0001\u0010\u001a\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u001c\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010 \u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0\u0016H\u0007¢\u0006\u0004\b \u0010!\u001a0\u0010$\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010#\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0003¢\u0006\u0004\b(\u0010)\u001a@\u0010*\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u00020\u001c*\u00020,H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001b\u00101\u001a\u00020\u001c*\u00020/2\u0006\u00100\u001a\u00020\u001cH\u0002¢\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065²\u0006\f\u00103\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\u0017\u00104\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "onDismissRequest", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/material3/z8;", "sheetState", "Landroidx/compose/ui/unit/h;", "sheetMaxWidth", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "tonalElevation", "scrimColor", "Landroidx/compose/runtime/i;", "dragHandle", "Landroidx/compose/foundation/layout/n2;", "windowInsets", "Landroidx/compose/material3/y6;", "properties", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/u;", "Lkotlin/u;", "content", "a", "(Lld/a;Landroidx/compose/ui/q;Landroidx/compose/material3/z8;FLandroidx/compose/ui/graphics/e6;JJFJLld/p;Landroidx/compose/foundation/layout/n2;Landroidx/compose/material3/y6;Lld/q;Landroidx/compose/runtime/t;III)V", "", "skipPartiallyExpanded", "Landroidx/compose/material3/a9;", "confirmValueChange", "n", "(ZLld/l;Landroidx/compose/runtime/t;II)Landroidx/compose/material3/z8;", "color", "visible", "d", "(JLld/a;ZLandroidx/compose/runtime/t;I)V", "", "fullHeight", "m", "(Landroidx/compose/ui/q;Landroidx/compose/material3/z8;F)Landroidx/compose/ui/q;", "b", "(Landroidx/compose/material3/y6;Lld/a;Landroidx/compose/foundation/layout/n2;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroid/view/View;", "l", "(Landroid/view/View;)Z", "Landroidx/compose/ui/window/q;", "isSecureFlagSetOnParent", "o", "(Landroidx/compose/ui/window/q;Z)Z", "alpha", "currentContent", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,702:1\n74#2:703\n74#2:762\n74#2:763\n1116#3,6:704\n1116#3,3:715\n1119#3,3:721\n1116#3,6:725\n1116#3,6:731\n1116#3,6:737\n1116#3,6:743\n1116#3,6:750\n1116#3,6:756\n1116#3,6:764\n1116#3,6:770\n487#4,4:710\n491#4,2:718\n495#4:724\n25#5:714\n487#6:720\n646#7:749\n81#8:776\n81#8:777\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt\n*L\n153#1:703\n438#1:762\n442#1:763\n154#1:704,6\n157#1:715,3\n157#1:721,3\n158#1:725,6\n167#1:731,6\n175#1:737,6\n281#1:743,6\n379#1:750,6\n392#1:756,6\n443#1:764,6\n471#1:770,6\n157#1:710,4\n157#1:718,2\n157#1:724\n157#1:714\n157#1:720\n372#1:749\n373#1:776\n441#1:777\n*E\n"})
/* loaded from: classes.dex */
public final class b7 {

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f9858b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f9859c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z8 z8Var, androidx.compose.ui.unit.d dVar) {
            super(0);
            this.f9858b = z8Var;
            this.f9859c = dVar;
        }

        public final void a() {
            this.f9858b.t(this.f9859c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f9860b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9861c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9862d;

        /* compiled from: ModalBottomSheet.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9863b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z8 f9864c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z8 z8Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9864c = z8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9864c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9863b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    z8 z8Var = this.f9864c;
                    this.f9863b = 1;
                    if (z8Var.p(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: ModalBottomSheet.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2$1$2", f = "ModalBottomSheet.android.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.b7$b$b, reason: collision with other inner class name */
        static final class C0211b extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9865b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z8 f9866c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0211b(z8 z8Var, kotlin.coroutines.d<? super C0211b> dVar) {
                super(2, dVar);
                this.f9866c = z8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new C0211b(this.f9866c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9865b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    z8 z8Var = this.f9866c;
                    this.f9865b = 1;
                    if (z8Var.n(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((C0211b) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f9867b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(ld.a<kotlin.k2> aVar) {
                super(1);
                this.f9867b = aVar;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
                invoke2(th);
                return kotlin.k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                this.f9867b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z8 z8Var, kotlinx.coroutines.r0 r0Var, ld.a<kotlin.k2> aVar) {
            super(0);
            this.f9860b = z8Var;
            this.f9861c = r0Var;
            this.f9862d = aVar;
        }

        public final void a() {
            kotlinx.coroutines.k2 f4;
            if (this.f9860b.f() == a9.Expanded && this.f9860b.i()) {
                kotlinx.coroutines.k.f(this.f9861c, null, null, new a(this.f9860b, null), 3, null);
            } else {
                f4 = kotlinx.coroutines.k.f(this.f9861c, null, null, new C0211b(this.f9860b, null), 3, null);
                f4.F(new c(this.f9862d));
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9868b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9869c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z8 f9870d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9871e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f9872f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.l<Float, kotlin.k2> f9873g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f9874h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f9875i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f9876j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f9877k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9878l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9879m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f9880n;

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/r;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/layout/r;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1\n+ 2 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,702:1\n125#2:703\n1116#3,6:704\n1116#3,6:710\n1116#3,6:716\n1116#3,6:722\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1\n*L\n191#1:703\n197#1:704,6\n198#1:710,6\n207#1:716,6\n220#1:722,6\n*E\n"})
        static final class a extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.foundation.layout.r, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f9881b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f9882c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z8 f9883d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.q f9884e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ float f9885f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ld.l<Float, kotlin.k2> f9886g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.e6 f9887h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ long f9888i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ long f9889j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f9890k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9891l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.r0 f9892m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f9893n;

            /* compiled from: ModalBottomSheet.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.b7$c$a$a, reason: collision with other inner class name */
            static final class C0212a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f9894b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0212a(String str) {
                    super(1);
                    this.f9894b = str;
                }

                public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                    androidx.compose.ui.semantics.w.h1(zVar, this.f9894b);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                    a(zVar);
                    return kotlin.k2.f75408a;
                }
            }

            /* compiled from: ModalBottomSheet.android.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/ui/unit/d;)J"}, k = 3, mv = {1, 8, 0})
            static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z8 f9895b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(z8 z8Var) {
                    super(1);
                    this.f9895b = z8Var;
                }

                public final long a(@fg.l androidx.compose.ui.unit.d dVar) {
                    return androidx.compose.ui.unit.r.a(0, (int) this.f9895b.r());
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.d dVar) {
                    return androidx.compose.ui.unit.q.b(a(dVar));
                }
            }

            /* compiled from: ModalBottomSheet.android.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$4$1", f = "ModalBottomSheet.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/r0;", "", "it", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;F)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.material3.b7$c$a$c, reason: collision with other inner class name */
            static final class C0213c extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.r0, Float, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                /* renamed from: b, reason: collision with root package name */
                int f9896b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ float f9897c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ld.l<Float, kotlin.k2> f9898d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0213c(ld.l<? super Float, kotlin.k2> lVar, kotlin.coroutines.d<? super C0213c> dVar) {
                    super(3, dVar);
                    this.f9898d = lVar;
                }

                @Override // ld.q
                public /* bridge */ /* synthetic */ Object R(kotlinx.coroutines.r0 r0Var, Float f4, kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    return a(r0Var, f4.floatValue(), dVar);
                }

                @fg.m
                public final Object a(@fg.l kotlinx.coroutines.r0 r0Var, float f4, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                    C0213c c0213c = new C0213c(this.f9898d, dVar);
                    c0213c.f9897c = f4;
                    return c0213c.invokeSuspend(kotlin.k2.f75408a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                    if (this.f9896b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                    this.f9898d.invoke(new Float(this.f9897c));
                    return kotlin.k2.f75408a;
                }
            }

            /* compiled from: ModalBottomSheet.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.jvm.internal.r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Strings.android.kt\nandroidx/compose/material3/Strings$Companion\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,702:1\n74#2,6:703\n80#2:737\n84#2:791\n78#3,11:709\n78#3,11:753\n91#3:785\n91#3:790\n456#4,8:720\n464#4,3:734\n456#4,8:764\n464#4,3:778\n467#4,3:782\n467#4,3:787\n3737#5,6:728\n3737#5,6:772\n129#6:738\n131#6:739\n133#6:740\n1116#7,6:741\n68#8,6:747\n74#8:781\n78#8:786\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5\n*L\n231#1:703,6\n231#1:737\n231#1:791\n231#1:709,11\n237#1:753,11\n237#1:785\n231#1:790\n231#1:720,8\n231#1:734,3\n237#1:764,8\n237#1:778,3\n237#1:782,3\n231#1:787,3\n231#1:728,6\n237#1:772,6\n234#1:738\n235#1:739\n236#1:740\n240#1:741,6\n237#1:747,6\n237#1:781\n237#1:786\n*E\n"})
            static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9899b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z8 f9900c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ld.a<kotlin.k2> f9901d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.r0 f9902e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f9903f;

                /* compiled from: ModalBottomSheet.android.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.material3.b7$c$a$d$a, reason: collision with other inner class name */
                static final class C0214a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z8 f9904b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ String f9905c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ String f9906d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f9907e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ ld.a<kotlin.k2> f9908f;

                    /* renamed from: g, reason: collision with root package name */
                    final /* synthetic */ kotlinx.coroutines.r0 f9909g;

                    /* compiled from: ModalBottomSheet.android.kt */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.b7$c$a$d$a$a, reason: collision with other inner class name */
                    static final class C0215a extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ ld.a<kotlin.k2> f9910b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0215a(ld.a<kotlin.k2> aVar) {
                            super(0);
                            this.f9910b = aVar;
                        }

                        @Override // ld.a
                        @fg.l
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            this.f9910b.invoke();
                            return Boolean.TRUE;
                        }
                    }

                    /* compiled from: ModalBottomSheet.android.kt */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.b7$c$a$d$a$b */
                    static final class b extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ z8 f9911b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ kotlinx.coroutines.r0 f9912c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ z8 f9913d;

                        /* compiled from: ModalBottomSheet.android.kt */
                        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$2$1", f = "ModalBottomSheet.android.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                        /* renamed from: androidx.compose.material3.b7$c$a$d$a$b$a, reason: collision with other inner class name */
                        static final class C0216a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                            /* renamed from: b, reason: collision with root package name */
                            int f9914b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ z8 f9915c;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0216a(z8 z8Var, kotlin.coroutines.d<? super C0216a> dVar) {
                                super(2, dVar);
                                this.f9915c = z8Var;
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @fg.l
                            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                                return new C0216a(this.f9915c, dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @fg.m
                            public final Object invokeSuspend(@fg.l Object obj) {
                                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                                int i4 = this.f9914b;
                                if (i4 == 0) {
                                    kotlin.a1.n(obj);
                                    z8 z8Var = this.f9915c;
                                    this.f9914b = 1;
                                    if (z8Var.d(this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (i4 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.a1.n(obj);
                                }
                                return kotlin.k2.f75408a;
                            }

                            @Override // ld.p
                            @fg.m
                            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                                return ((C0216a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        b(z8 z8Var, kotlinx.coroutines.r0 r0Var, z8 z8Var2) {
                            super(0);
                            this.f9911b = z8Var;
                            this.f9912c = r0Var;
                            this.f9913d = z8Var2;
                        }

                        @Override // ld.a
                        @fg.l
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            if (this.f9911b.e().s().invoke(a9.Expanded).booleanValue()) {
                                kotlinx.coroutines.k.f(this.f9912c, null, null, new C0216a(this.f9913d, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }

                    /* compiled from: ModalBottomSheet.android.kt */
                    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
                    /* renamed from: androidx.compose.material3.b7$c$a$d$a$c, reason: collision with other inner class name */
                    static final class C0217c extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ z8 f9916b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ kotlinx.coroutines.r0 f9917c;

                        /* compiled from: ModalBottomSheet.android.kt */
                        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$3$1$5$1$1$1$1$3$1", f = "ModalBottomSheet.android.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
                        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
                        /* renamed from: androidx.compose.material3.b7$c$a$d$a$c$a, reason: collision with other inner class name */
                        static final class C0218a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

                            /* renamed from: b, reason: collision with root package name */
                            int f9918b;

                            /* renamed from: c, reason: collision with root package name */
                            final /* synthetic */ z8 f9919c;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C0218a(z8 z8Var, kotlin.coroutines.d<? super C0218a> dVar) {
                                super(2, dVar);
                                this.f9919c = z8Var;
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @fg.l
                            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                                return new C0218a(this.f9919c, dVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            @fg.m
                            public final Object invokeSuspend(@fg.l Object obj) {
                                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                                int i4 = this.f9918b;
                                if (i4 == 0) {
                                    kotlin.a1.n(obj);
                                    z8 z8Var = this.f9919c;
                                    this.f9918b = 1;
                                    if (z8Var.p(this) == aVar) {
                                        return aVar;
                                    }
                                } else {
                                    if (i4 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.a1.n(obj);
                                }
                                return kotlin.k2.f75408a;
                            }

                            @Override // ld.p
                            @fg.m
                            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                                return ((C0218a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C0217c(z8 z8Var, kotlinx.coroutines.r0 r0Var) {
                            super(0);
                            this.f9916b = z8Var;
                            this.f9917c = r0Var;
                        }

                        @Override // ld.a
                        @fg.l
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke() {
                            if (this.f9916b.e().s().invoke(a9.PartiallyExpanded).booleanValue()) {
                                kotlinx.coroutines.k.f(this.f9917c, null, null, new C0218a(this.f9916b, null), 3, null);
                            }
                            return Boolean.TRUE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0214a(z8 z8Var, String str, String str2, String str3, ld.a<kotlin.k2> aVar, kotlinx.coroutines.r0 r0Var) {
                        super(1);
                        this.f9904b = z8Var;
                        this.f9905c = str;
                        this.f9906d = str2;
                        this.f9907e = str3;
                        this.f9908f = aVar;
                        this.f9909g = r0Var;
                    }

                    public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                        z8 z8Var = this.f9904b;
                        String str = this.f9905c;
                        String str2 = this.f9906d;
                        String str3 = this.f9907e;
                        ld.a<kotlin.k2> aVar = this.f9908f;
                        kotlinx.coroutines.r0 r0Var = this.f9909g;
                        androidx.compose.ui.semantics.w.o(zVar, str, new C0215a(aVar));
                        if (z8Var.f() == a9.PartiallyExpanded) {
                            androidx.compose.ui.semantics.w.r(zVar, str2, new b(z8Var, r0Var, z8Var));
                        } else if (z8Var.i()) {
                            androidx.compose.ui.semantics.w.g(zVar, str3, new C0217c(z8Var, r0Var));
                        }
                    }

                    @Override // ld.l
                    public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                        a(zVar);
                        return kotlin.k2.f75408a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, z8 z8Var, ld.a<kotlin.k2> aVar, kotlinx.coroutines.r0 r0Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar) {
                    super(2);
                    this.f9899b = pVar;
                    this.f9900c = z8Var;
                    this.f9901d = aVar;
                    this.f9902e = r0Var;
                    this.f9903f = qVar;
                }

                @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.i
                public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                    int i5;
                    if ((i4 & 3) == 2 && tVar.p()) {
                        tVar.d0();
                        return;
                    }
                    if (androidx.compose.runtime.x.b0()) {
                        androidx.compose.runtime.x.r0(1096570852, i4, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:230)");
                    }
                    q.Companion companion = androidx.compose.ui.q.INSTANCE;
                    androidx.compose.ui.q h4 = androidx.compose.foundation.layout.c2.h(companion, 0.0f, 1, null);
                    ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f9899b;
                    z8 z8Var = this.f9900c;
                    ld.a<kotlin.k2> aVar = this.f9901d;
                    kotlinx.coroutines.r0 r0Var = this.f9902e;
                    ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> qVar = this.f9903f;
                    tVar.P(-483455358);
                    i.m r4 = androidx.compose.foundation.layout.i.f5073a.r();
                    c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
                    androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(companion2, r4, tVar, 0, -1323940314);
                    int j4 = androidx.compose.runtime.p.j(tVar, 0);
                    androidx.compose.runtime.g0 B = tVar.B();
                    g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
                    ld.a<androidx.compose.ui.node.g> a6 = companion3.a();
                    ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(h4);
                    if (tVar.s() == null) {
                        androidx.compose.runtime.p.n();
                    }
                    tVar.W();
                    if (tVar.getInserting()) {
                        tVar.F(a6);
                    } else {
                        tVar.C();
                    }
                    ld.p a7 = androidx.compose.animation.p.a(companion3, tVar, a5, tVar, B);
                    if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j4))) {
                        androidx.compose.animation.d.a(j4, tVar, j4, a7);
                    }
                    androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                    androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
                    tVar.P(-11289086);
                    if (pVar != null) {
                        t9.Companion companion4 = t9.INSTANCE;
                        String a8 = v9.a(x7.a.f15589a, tVar, 0);
                        String a10 = v9.a(x7.a.f15591b, tVar, 0);
                        String a11 = v9.a(x7.a.f15595d, tVar, 0);
                        androidx.compose.ui.q e4 = vVar.e(companion, companion2.m());
                        tVar.P(-11288530);
                        boolean q02 = tVar.q0(z8Var) | tVar.q0(a10) | tVar.q0(aVar) | tVar.q0(a11) | tVar.S(r0Var) | tVar.q0(a8);
                        Object Q = tVar.Q();
                        if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                            i5 = -1323940314;
                            Q = new C0214a(z8Var, a10, a11, a8, aVar, r0Var);
                            tVar.E(Q);
                        } else {
                            i5 = -1323940314;
                        }
                        tVar.p0();
                        androidx.compose.ui.q e5 = androidx.compose.ui.semantics.o.e(e4, true, (ld.l) Q);
                        tVar.P(733328855);
                        androidx.compose.ui.layout.m0 a12 = androidx.compose.animation.a0.a(companion2, false, tVar, 0, i5);
                        int j5 = androidx.compose.runtime.p.j(tVar, 0);
                        androidx.compose.runtime.g0 B2 = tVar.B();
                        ld.a<androidx.compose.ui.node.g> a13 = companion3.a();
                        ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(e5);
                        if (tVar.s() == null) {
                            androidx.compose.runtime.p.n();
                        }
                        tVar.W();
                        if (tVar.getInserting()) {
                            tVar.F(a13);
                        } else {
                            tVar.C();
                        }
                        ld.p a14 = androidx.compose.animation.p.a(companion3, tVar, a12, tVar, B2);
                        if (tVar.getInserting() || !kotlin.jvm.internal.l0.g(tVar.Q(), Integer.valueOf(j5))) {
                            androidx.compose.animation.d.a(j5, tVar, j5, a14);
                        }
                        androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(tVar), tVar, 2058660585);
                        androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
                        androidx.compose.material3.q.a(0, pVar, tVar);
                    }
                    tVar.p0();
                    qVar.R(vVar, tVar, 6);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(long j4, ld.a<kotlin.k2> aVar, z8 z8Var, androidx.compose.ui.q qVar, float f4, ld.l<? super Float, kotlin.k2> lVar, androidx.compose.ui.graphics.e6 e6Var, long j5, long j6, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, kotlinx.coroutines.r0 r0Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2) {
                super(3);
                this.f9881b = j4;
                this.f9882c = aVar;
                this.f9883d = z8Var;
                this.f9884e = qVar;
                this.f9885f = f4;
                this.f9886g = lVar;
                this.f9887h = e6Var;
                this.f9888i = j5;
                this.f9889j = j6;
                this.f9890k = f5;
                this.f9891l = pVar;
                this.f9892m = r0Var;
                this.f9893n = qVar2;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.foundation.layout.r rVar, androidx.compose.runtime.t tVar, Integer num) {
                a(rVar, tVar, num.intValue());
                return kotlin.k2.f75408a;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.l androidx.compose.foundation.layout.r rVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
                int i5;
                if ((i4 & 6) == 0) {
                    i5 = i4 | (tVar.q0(rVar) ? 4 : 2);
                } else {
                    i5 = i4;
                }
                if ((i5 & 19) == 18 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(2008499679, i5, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:184)");
                }
                int o4 = androidx.compose.ui.unit.b.o(rVar.getConstraints());
                b7.d(this.f9881b, this.f9882c, this.f9883d.m() != a9.Hidden, tVar, 0);
                t9.Companion companion = t9.INSTANCE;
                String a5 = v9.a(x7.a.f15597e, tVar, 0);
                androidx.compose.ui.q c5 = rVar.c(androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.layout.c2.D(this.f9884e, 0.0f, this.f9885f, 1, null), 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.y());
                tVar.P(-1482644208);
                boolean q02 = tVar.q0(a5);
                Object Q = tVar.Q();
                if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q = new C0212a(a5);
                    tVar.E(Q);
                }
                tVar.p0();
                androidx.compose.ui.q f4 = androidx.compose.ui.semantics.o.f(c5, false, (ld.l) Q, 1, null);
                tVar.P(-1482644143);
                boolean q03 = tVar.q0(this.f9883d);
                z8 z8Var = this.f9883d;
                Object Q2 = tVar.Q();
                if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = new b(z8Var);
                    tVar.E(Q2);
                }
                tVar.p0();
                androidx.compose.ui.q d5 = androidx.compose.foundation.layout.f1.d(f4, (ld.l) Q2);
                tVar.P(-1482643839);
                boolean q04 = tVar.q0(this.f9883d);
                z8 z8Var2 = this.f9883d;
                ld.l<Float, kotlin.k2> lVar = this.f9886g;
                Object Q3 = tVar.Q();
                if (q04 || Q3 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q3 = y8.a(z8Var2, androidx.compose.foundation.gestures.j0.Vertical, lVar);
                    tVar.E(Q3);
                }
                tVar.p0();
                androidx.compose.ui.q b5 = androidx.compose.ui.input.nestedscroll.c.b(d5, (androidx.compose.ui.input.nestedscroll.a) Q3, null, 2, null);
                androidx.compose.foundation.gestures.d0 draggableState = this.f9883d.e().getDraggableState();
                androidx.compose.foundation.gestures.j0 j0Var = androidx.compose.foundation.gestures.j0.Vertical;
                boolean o5 = this.f9883d.o();
                boolean C = this.f9883d.e().C();
                tVar.P(-1482643097);
                boolean q05 = tVar.q0(this.f9886g);
                ld.l<Float, kotlin.k2> lVar2 = this.f9886g;
                Object Q4 = tVar.Q();
                if (q05 || Q4 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q4 = new C0213c(lVar2, null);
                    tVar.E(Q4);
                }
                tVar.p0();
                x9.a(b7.m(androidx.compose.foundation.gestures.b0.k(b5, draggableState, j0Var, o5, null, C, null, (ld.q) Q4, false, SyslogAppender.LOG_LOCAL5, null), this.f9883d, o4), this.f9887h, this.f9888i, this.f9889j, this.f9890k, 0.0f, null, androidx.compose.runtime.internal.c.b(tVar, 1096570852, true, new d(this.f9891l, this.f9883d, this.f9882c, this.f9892m, this.f9893n)), tVar, 12582912, 96);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(long j4, ld.a<kotlin.k2> aVar, z8 z8Var, androidx.compose.ui.q qVar, float f4, ld.l<? super Float, kotlin.k2> lVar, androidx.compose.ui.graphics.e6 e6Var, long j5, long j6, float f5, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, kotlinx.coroutines.r0 r0Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2) {
            super(2);
            this.f9868b = j4;
            this.f9869c = aVar;
            this.f9870d = z8Var;
            this.f9871e = qVar;
            this.f9872f = f4;
            this.f9873g = lVar;
            this.f9874h = e6Var;
            this.f9875i = j5;
            this.f9876j = j6;
            this.f9877k = f5;
            this.f9878l = pVar;
            this.f9879m = r0Var;
            this.f9880n = qVar2;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1311525899, i4, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:183)");
            }
            androidx.compose.foundation.layout.q.a(androidx.compose.foundation.layout.c2.f(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null), null, false, androidx.compose.runtime.internal.c.b(tVar, 2008499679, true, new a(this.f9868b, this.f9869c, this.f9870d, this.f9871e, this.f9872f, this.f9873g, this.f9874h, this.f9875i, this.f9876j, this.f9877k, this.f9878l, this.f9879m, this.f9880n)), tVar, 3078, 6);
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

    /* compiled from: ModalBottomSheet.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.android.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9920b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z8 f9921c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(z8 z8Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f9921c = z8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return new d(this.f9921c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9920b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                z8 z8Var = this.f9921c;
                this.f9920b = 1;
                if (z8Var.v(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((d) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9922b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f9923c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z8 f9924d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f9925e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f9926f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f9927g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f9928h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f9929i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f9930j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9931k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f9932l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ y6 f9933m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ ld.q<androidx.compose.foundation.layout.u, androidx.compose.runtime.t, Integer, kotlin.k2> f9934n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f9935o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f9936p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f9937q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(ld.a<kotlin.k2> aVar, androidx.compose.ui.q qVar, z8 z8Var, float f4, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, float f5, long j6, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.foundation.layout.n2 n2Var, y6 y6Var, ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> qVar2, int i4, int i5, int i6) {
            super(2);
            this.f9922b = aVar;
            this.f9923c = qVar;
            this.f9924d = z8Var;
            this.f9925e = f4;
            this.f9926f = e6Var;
            this.f9927g = j4;
            this.f9928h = j5;
            this.f9929i = f5;
            this.f9930j = j6;
            this.f9931k = pVar;
            this.f9932l = n2Var;
            this.f9933m = y6Var;
            this.f9934n = qVar2;
            this.f9935o = i4;
            this.f9936p = i5;
            this.f9937q = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b7.a(this.f9922b, this.f9923c, this.f9924d, this.f9925e, this.f9926f, this.f9927g, this.f9928h, this.f9929i, this.f9930j, this.f9931k, this.f9932l, this.f9933m, this.f9934n, tVar, androidx.compose.runtime.g3.b(this.f9935o | 1), androidx.compose.runtime.g3.b(this.f9936p), this.f9937q);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f9938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9939c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9940d;

        /* compiled from: ModalBottomSheet.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$animateToDismiss$1$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9941b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z8 f9942c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z8 z8Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9942c = z8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9942c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9941b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    z8 z8Var = this.f9942c;
                    this.f9941b = 1;
                    if (z8Var.n(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z8 f9943b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f9944c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z8 z8Var, ld.a<kotlin.k2> aVar) {
                super(1);
                this.f9943b = z8Var;
                this.f9944c = aVar;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
                invoke2(th);
                return kotlin.k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                if (this.f9943b.o()) {
                    return;
                }
                this.f9944c.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(z8 z8Var, kotlinx.coroutines.r0 r0Var, ld.a<kotlin.k2> aVar) {
            super(0);
            this.f9938b = z8Var;
            this.f9939c = r0Var;
            this.f9940d = aVar;
        }

        public final void a() {
            kotlinx.coroutines.k2 f4;
            if (this.f9938b.e().s().invoke(a9.Hidden).booleanValue()) {
                f4 = kotlinx.coroutines.k.f(this.f9939c, null, null, new a(this.f9938b, null), 3, null);
                f4.F(new b(this.f9938b, this.f9940d));
            }
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.l<Float, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f9945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z8 f9946c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9947d;

        /* compiled from: ModalBottomSheet.android.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {SyslogAppender.LOG_LOCAL5}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f9948b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z8 f9949c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f9950d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z8 z8Var, float f4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f9949c = z8Var;
                this.f9950d = f4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f9949c, this.f9950d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f9948b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    z8 z8Var = this.f9949c;
                    float f4 = this.f9950d;
                    this.f9948b = 1;
                    if (z8Var.u(f4, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a1.n(obj);
                }
                return kotlin.k2.f75408a;
            }

            @Override // ld.p
            @fg.m
            public final Object invoke(@fg.l kotlinx.coroutines.r0 r0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
                return ((a) create(r0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
            }
        }

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<Throwable, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z8 f9951b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f9952c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(z8 z8Var, ld.a<kotlin.k2> aVar) {
                super(1);
                this.f9951b = z8Var;
                this.f9952c = aVar;
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(Throwable th) {
                invoke2(th);
                return kotlin.k2.f75408a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@fg.m Throwable th) {
                if (this.f9951b.o()) {
                    return;
                }
                this.f9952c.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(kotlinx.coroutines.r0 r0Var, z8 z8Var, ld.a<kotlin.k2> aVar) {
            super(1);
            this.f9945b = r0Var;
            this.f9946c = z8Var;
            this.f9947d = aVar;
        }

        public final void a(float f4) {
            kotlinx.coroutines.k2 f5;
            f5 = kotlinx.coroutines.k.f(this.f9945b, null, null, new a(this.f9946c, f4, null), 3, null);
            f5.F(new b(this.f9946c, this.f9947d));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(Float f4) {
            a(f4.floatValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,702:1\n64#2,5:703\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1\n*L\n474#1:703,5\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a7 f9953b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.w f9954c;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$1$1\n*L\n1#1,497:1\n475#2,3:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a7 f9955a;

            public a(a7 a7Var) {
                this.f9955a = a7Var;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f9955a.i();
                this.f9955a.y();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a7 a7Var, androidx.compose.ui.unit.w wVar) {
            super(1);
            this.f9953b = a7Var;
            this.f9954c = wVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            this.f9953b.G();
            this.f9953b.H(this.f9954c);
            return new a(this.f9953b);
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y6 f9956b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9957c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f9958d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f9959e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9960f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(y6 y6Var, ld.a<kotlin.k2> aVar, androidx.compose.foundation.layout.n2 n2Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f9956b = y6Var;
            this.f9957c = aVar;
            this.f9958d = n2Var;
            this.f9959e = pVar;
            this.f9960f = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b7.b(this.f9956b, this.f9957c, this.f9958d, this.f9959e, tVar, androidx.compose.runtime.g3.b(this.f9960f | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<UUID> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f9961b = new j(0);

        j() {
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

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nModalBottomSheet.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,702:1\n68#2,6:703\n74#2:737\n78#2:742\n78#3,11:709\n91#3:741\n456#4,8:720\n464#4,3:734\n467#4,3:738\n3737#5,6:728\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.android.kt\nandroidx/compose/material3/ModalBottomSheet_androidKt$ModalBottomSheetPopup$modalBottomSheetWindow$1$1$1\n*L\n453#1:703,6\n453#1:737\n453#1:742\n453#1:709,11\n453#1:741\n453#1:720,8\n453#1:734,3\n453#1:738,3\n453#1:728,6\n*E\n"})
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.n2 f9962b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<ld.p<androidx.compose.runtime.t, Integer, kotlin.k2>> f9963c;

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f9964b = new a(1);

            a() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.P0(zVar);
            }

            @Override // ld.l
            public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
                androidx.compose.ui.semantics.w.P0(zVar);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(androidx.compose.foundation.layout.n2 n2Var, androidx.compose.runtime.b5<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2>> b5Var) {
            super(2);
            this.f9962b = n2Var;
            this.f9963c = b5Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-114385661, i4, -1, "androidx.compose.material3.ModalBottomSheetPopup.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.android.kt:452)");
            }
            androidx.compose.ui.q qVar = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q e4 = androidx.compose.foundation.layout.d3.e(androidx.compose.ui.semantics.o.f(qVar, false, a.f9964b, 1, null), this.f9962b);
            if (Build.VERSION.SDK_INT >= 33) {
                qVar = androidx.compose.foundation.layout.e3.c(qVar);
            }
            androidx.compose.ui.q w32 = e4.w3(qVar);
            androidx.compose.runtime.b5<ld.p<androidx.compose.runtime.t, Integer, kotlin.k2>> b5Var = this.f9963c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(w32);
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
            androidx.compose.foundation.layout.p pVar = androidx.compose.foundation.layout.p.f5235a;
            if (androidx.compose.foundation.x.a(0, b5Var.getValue(), tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/graphics/drawscope/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.graphics.drawscope.f, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9965b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f9966c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j4, androidx.compose.runtime.b5<Float> b5Var) {
            super(1);
            this.f9965b = j4;
            this.f9966c = b5Var;
        }

        public final void a(@fg.l androidx.compose.ui.graphics.drawscope.f fVar) {
            androidx.compose.ui.graphics.drawscope.f.t5(fVar, this.f9965b, 0L, 0L, b7.e(this.f9966c), null, null, 0, 118, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.graphics.drawscope.f fVar) {
            a(fVar);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9967b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9968c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f9969d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f9970e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(long j4, ld.a<kotlin.k2> aVar, boolean z4, int i4) {
            super(2);
            this.f9967b = j4;
            this.f9968c = aVar;
            this.f9969d = z4;
            this.f9970e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b7.d(this.f9967b, this.f9968c, this.f9969d, tVar, androidx.compose.runtime.g3.b(this.f9970e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.ModalBottomSheet_androidKt$Scrim$dismissSheet$1$1", f = "ModalBottomSheet.android.kt", i = {}, l = {380}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.compose.ui.input.pointer.k0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f9971b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f9972c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.a<kotlin.k2> f9973d;

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Li0/f;", "it", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i0.f, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.a<kotlin.k2> f9974b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ld.a<kotlin.k2> aVar) {
                super(1);
                this.f9974b = aVar;
            }

            public final void a(long j4) {
                this.f9974b.invoke();
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i0.f fVar) {
                a(fVar.getPackedValue());
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ld.a<kotlin.k2> aVar, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f9973d = aVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.ui.input.pointer.k0 k0Var, @fg.m kotlin.coroutines.d<? super kotlin.k2> dVar) {
            return ((n) create(k0Var, dVar)).invokeSuspend(kotlin.k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f9973d, dVar);
            nVar.f9972c = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f9971b;
            if (i4 == 0) {
                kotlin.a1.n(obj);
                androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) this.f9972c;
                a aVar2 = new a(this.f9973d);
                this.f9971b = 1;
                if (androidx.compose.foundation.gestures.z0.m(k0Var, null, null, null, aVar2, this, 7, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a1.n(obj);
            }
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f9975b = new o(1);

        o() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class p {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9976a;

        static {
            int[] iArr = new int[androidx.compose.ui.window.q.values().length];
            try {
                iArr[androidx.compose.ui.window.q.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.window.q.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.window.q.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9976a = iArr;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/u;", "sheetSize", "Lkotlin/k2;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.u, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z8 f9977b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f9978c;

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9979a;

            static {
                int[] iArr = new int[a9.values().length];
                try {
                    iArr[a9.Hidden.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a9.PartiallyExpanded.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a9.Expanded.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f9979a = iArr;
            }
        }

        /* compiled from: ModalBottomSheet.android.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/u4;", "Landroidx/compose/material3/a9;", "Lkotlin/k2;", "a", "(Landroidx/compose/material3/u4;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<u4<a9>, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ float f9980b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f9981c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z8 f9982d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f4, long j4, z8 z8Var) {
                super(1);
                this.f9980b = f4;
                this.f9981c = j4;
                this.f9982d = z8Var;
            }

            public final void a(@fg.l u4<a9> u4Var) {
                u4Var.a(a9.Hidden, this.f9980b);
                if (androidx.compose.ui.unit.u.j(this.f9981c) > this.f9980b / 2 && !this.f9982d.getSkipPartiallyExpanded()) {
                    u4Var.a(a9.PartiallyExpanded, this.f9980b / 2.0f);
                }
                if (((int) (this.f9981c & 4294967295L)) != 0) {
                    u4Var.a(a9.Expanded, Math.max(0.0f, this.f9980b - ((int) (r0 & 4294967295L))));
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(u4<a9> u4Var) {
                a(u4Var);
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(z8 z8Var, float f4) {
            super(1);
            this.f9977b = z8Var;
            this.f9978c = f4;
        }

        public final void a(long j4) {
            a9 a9Var;
            t4<a9> a5 = androidx.compose.material3.j.a(new b(this.f9978c, j4, this.f9977b));
            int i4 = a.f9979a[this.f9977b.e().A().ordinal()];
            if (i4 == 1) {
                a9Var = a9.Hidden;
            } else {
                if (i4 != 2 && i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a9Var = a9.PartiallyExpanded;
                if (!a5.c(a9Var)) {
                    a9Var = a9.Expanded;
                    if (!a5.c(a9Var)) {
                        a9Var = a9.Hidden;
                    }
                }
            }
            this.f9977b.e().M(a5, a9Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.unit.u uVar) {
            a(uVar.getPackedValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class r extends kotlin.jvm.internal.n0 implements ld.l<a9, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f9983b = new r(1);

        r() {
            super(1);
        }

        @fg.l
        public final Boolean a(@fg.l a9 a9Var) {
            return Boolean.TRUE;
        }

        @Override // ld.l
        public Boolean invoke(a9 a9Var) {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    @androidx.compose.material3.f5
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.a<kotlin.k2> r44, @fg.m androidx.compose.ui.q r45, @fg.m androidx.compose.material3.z8 r46, float r47, @fg.m androidx.compose.ui.graphics.e6 r48, long r49, long r51, float r53, long r54, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r56, @fg.m androidx.compose.foundation.layout.n2 r57, @fg.m androidx.compose.material3.y6 r58, @fg.l ld.q<? super androidx.compose.foundation.layout.u, ? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r59, @fg.m androidx.compose.runtime.t r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.b7.a(ld.a, androidx.compose.ui.q, androidx.compose.material3.z8, float, androidx.compose.ui.graphics.e6, long, long, float, long, ld.p, androidx.compose.foundation.layout.n2, androidx.compose.material3.y6, ld.q, androidx.compose.runtime.t, int, int, int):void");
    }

    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(@fg.l y6 y6Var, @fg.l ld.a<kotlin.k2> aVar, @fg.l androidx.compose.foundation.layout.n2 n2Var, @fg.l ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(738805080);
        if ((i4 & 6) == 0) {
            i5 = (o4.q0(y6Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(aVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.q0(n2Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar) ? 2048 : 1024;
        }
        int i6 = i5;
        if ((i6 & 1171) == 1170 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(738805080, i6, -1, "androidx.compose.material3.ModalBottomSheetPopup (ModalBottomSheet.android.kt:436)");
            }
            View view = (View) o4.x(androidx.compose.ui.platform.o0.k());
            UUID uuid = (UUID) androidx.compose.runtime.saveable.d.d(new Object[0], null, null, j.f9961b, o4, 3072, 6);
            androidx.compose.runtime.z u4 = androidx.compose.runtime.p.u(o4, 0);
            androidx.compose.runtime.b5 u5 = androidx.compose.runtime.o4.u(pVar, o4, (i6 >> 9) & 14);
            androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) o4.x(androidx.compose.ui.platform.h1.p());
            o4.P(173201889);
            Object Q = o4.Q();
            t.Companion companion = androidx.compose.runtime.t.INSTANCE;
            Object obj = Q;
            if (Q == companion.a()) {
                a7 a7Var = new a7(y6Var, aVar, view, uuid);
                a7Var.E(u4, new androidx.compose.runtime.internal.b(-114385661, true, new k(n2Var, u5)));
                o4.E(a7Var);
                obj = a7Var;
            }
            a7 a7Var2 = (a7) obj;
            o4.p0();
            o4.P(173202877);
            boolean S = o4.S(a7Var2) | o4.q0(wVar);
            Object Q2 = o4.Q();
            if (S || Q2 == companion.a()) {
                Q2 = new h(a7Var2, wVar);
                o4.E(Q2);
            }
            o4.p0();
            androidx.compose.runtime.a1.c(a7Var2, (ld.l) Q2, o4, 0);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new i(y6Var, aVar, n2Var, pVar, i4));
        }
    }

    private static final ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> c(androidx.compose.runtime.b5<? extends ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2>> b5Var) {
        return (ld.p) b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void d(long j4, ld.a<kotlin.k2> aVar, boolean z4, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.ui.q qVar;
        androidx.compose.runtime.t o4 = tVar.o(1053897700);
        if ((i4 & 6) == 0) {
            i5 = (o4.g(j4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(aVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.b(z4) ? 256 : 128;
        }
        int i6 = i5;
        if ((i6 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1053897700, i6, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.android.kt:370)");
            }
            androidx.compose.ui.graphics.d2.INSTANCE.getClass();
            if (j4 != androidx.compose.ui.graphics.d2.f17778o) {
                androidx.compose.runtime.b5<Float> e4 = androidx.compose.animation.core.d.e(z4 ? 1.0f : 0.0f, new androidx.compose.animation.core.h2(0, 0, null, 7, null), 0.0f, null, null, o4, 48, 28);
                o4.P(-1858718943);
                if (z4) {
                    q.Companion companion = androidx.compose.ui.q.INSTANCE;
                    o4.P(-1858718859);
                    boolean z5 = (i6 & 112) == 32;
                    Object Q = o4.Q();
                    if (z5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                        Q = new n(aVar, null);
                        o4.E(Q);
                    }
                    o4.p0();
                    qVar = androidx.compose.ui.semantics.o.c(androidx.compose.ui.input.pointer.u0.e(companion, aVar, (ld.p) Q), o.f9975b);
                } else {
                    qVar = androidx.compose.ui.q.INSTANCE;
                }
                o4.p0();
                androidx.compose.ui.q w32 = androidx.compose.foundation.layout.c2.f(androidx.compose.ui.q.INSTANCE, 0.0f, 1, null).w3(qVar);
                o4.P(-1858718531);
                boolean q02 = o4.q0(e4) | ((i6 & 14) == 4);
                Object Q2 = o4.Q();
                if (q02 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                    Q2 = new l(j4, e4);
                    o4.E(Q2);
                }
                o4.p0();
                androidx.compose.foundation.e0.b(w32, (ld.l) Q2, o4, 0);
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new m(j4, aVar, z4, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(androidx.compose.runtime.b5<Float> b5Var) {
        return b5Var.getValue().floatValue();
    }

    public static final ld.p f(androidx.compose.runtime.b5 b5Var) {
        return (ld.p) b5Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f5
    public static final androidx.compose.ui.q m(androidx.compose.ui.q qVar, z8 z8Var, float f4) {
        return androidx.compose.ui.layout.c1.a(qVar, new q(z8Var, f4));
    }

    @fg.l
    @f5
    @androidx.compose.runtime.i
    public static final z8 n(boolean z4, @fg.m ld.l<? super a9, Boolean> lVar, @fg.m androidx.compose.runtime.t tVar, int i4, int i5) {
        tVar.P(-1261794383);
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        boolean z5 = z4;
        if ((i5 & 2) != 0) {
            lVar = r.f9983b;
        }
        ld.l<? super a9, Boolean> lVar2 = lVar;
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(-1261794383, i4, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.android.kt:363)");
        }
        z8 c5 = y8.c(z5, lVar2, a9.Hidden, false, tVar, (i4 & 14) | 384 | (i4 & 112), 8);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return c5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(androidx.compose.ui.window.q qVar, boolean z4) {
        int i4 = p.f9976a[qVar.ordinal()];
        if (i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            return true;
        }
        if (i4 == 3) {
            return z4;
        }
        throw new NoWhenBranchMatchedException();
    }
}
