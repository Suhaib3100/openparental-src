package androidx.compose.material3;

import androidx.compose.ui.c;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.internal.ClientDefaults;

/* compiled from: Switch.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u001al\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001ay\u0010\u001c\u001a\u00020\u0003*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\b2\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u001a\u0010!\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001a\u0010#\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\"\u0010 \"\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001e\"\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001e\"\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001e\"\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00130+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/²\u0006\f\u0010.\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lkotlin/Function1;", "Lkotlin/k2;", "onCheckedChange", "Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function0;", "Landroidx/compose/runtime/i;", "thumbContent", "enabled", "Landroidx/compose/material3/da;", "colors", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "a", "(ZLld/l;Landroidx/compose/ui/q;Lld/p;ZLandroidx/compose/material3/da;Landroidx/compose/foundation/interaction/k;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/layout/o;", "Landroidx/compose/runtime/b5;", "", "thumbValue", "Landroidx/compose/foundation/interaction/i;", "Landroidx/compose/ui/graphics/e6;", "thumbShape", "Landroidx/compose/ui/unit/h;", "uncheckedThumbDiameter", "minBound", "maxBound", "b", "(Landroidx/compose/foundation/layout/o;ZZLandroidx/compose/material3/da;Landroidx/compose/runtime/b5;Lld/p;Landroidx/compose/foundation/interaction/i;Landroidx/compose/ui/graphics/e6;FFFLandroidx/compose/runtime/t;II)V", "F", "f", "()F", "ThumbDiameter", "g", "UncheckedThumbDiameter", "c", "SwitchWidth", "d", "SwitchHeight", "e", "ThumbPadding", "ThumbPathLength", "Landroidx/compose/animation/core/h2;", "Landroidx/compose/animation/core/h2;", "AnimationSpec", "isPressed", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,573:1\n1116#2,6:574\n1116#2,6:585\n1116#2,6:591\n1116#2,3:602\n1119#2,3:608\n1116#2,6:612\n1116#2,6:618\n1116#2,6:707\n58#3:580\n75#3:581\n58#3:665\n58#3:666\n81#3:667\n88#3:668\n51#3:669\n58#3:671\n75#3:713\n58#3:759\n75#3:760\n58#3:761\n74#4:582\n74#4:584\n74#4:664\n74#4:670\n1#5:583\n487#6,4:597\n491#6,2:605\n495#6:611\n25#7:601\n456#7,8:641\n464#7,3:655\n467#7,3:659\n456#7,8:689\n464#7,3:703\n456#7,8:730\n464#7,3:744\n467#7,3:748\n467#7,3:753\n487#8:607\n68#9,6:624\n74#9:658\n78#9:663\n68#9,6:672\n74#9:706\n69#9,5:714\n74#9:747\n78#9:752\n78#9:757\n78#10,11:630\n91#10:662\n78#10,11:678\n78#10,11:719\n91#10:751\n91#10:756\n3737#11,6:649\n3737#11,6:697\n3737#11,6:738\n81#12:758\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n98#1:574,6\n109#1:585,6\n114#1:591,6\n115#1:602,3\n115#1:608,3\n117#1:612,6\n122#1:618,6\n229#1:707,6\n106#1:580\n106#1:581\n195#1:665\n196#1:666\n196#1:667\n195#1:668\n195#1:669\n202#1:671\n234#1:713\n256#1:759\n256#1:760\n257#1:761\n107#1:582\n108#1:584\n191#1:664\n200#1:670\n115#1:597,4\n115#1:605,2\n115#1:611\n115#1:601\n146#1:641,8\n146#1:655,3\n146#1:659,3\n223#1:689,8\n223#1:703,3\n226#1:730,8\n226#1:744,3\n226#1:748,3\n223#1:753,3\n115#1:607\n146#1:624,6\n146#1:658\n146#1:663\n223#1:672,6\n223#1:706\n226#1:714,5\n226#1:747\n226#1:752\n223#1:757\n146#1:630,11\n146#1:662\n223#1:678,11\n226#1:719,11\n226#1:751\n223#1:756\n146#1:649,6\n223#1:697,6\n226#1:738,6\n189#1:758\n*E\n"})
/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    private static final float f10742a;

    /* renamed from: b, reason: collision with root package name */
    private static final float f10743b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f10744c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f10745d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f10746e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f10747f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.h2<Float> f10748g;

    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f10749b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10750c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, float f4) {
            super(0);
            this.f10749b = bVar;
            this.f10750c = f4;
        }

        public final void a() {
            androidx.compose.animation.core.b.F(this.f10749b, Float.valueOf(this.f10750c), null, 2, null);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
            a();
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,573:1\n64#2,5:574\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3$1\n*L\n128#1:574,5\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.runtime.w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f10751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10752c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.r0 f10753d;

        /* compiled from: Switch.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SwitchKt$Switch$3$1$1", f = "Switch.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<kotlinx.coroutines.r0, kotlin.coroutines.d<? super kotlin.k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f10754b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> f10755c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f10756d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, float f4, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f10755c = bVar;
                this.f10756d = f4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<kotlin.k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                return new a(this.f10755c, this.f10756d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                int i4 = this.f10754b;
                if (i4 == 0) {
                    kotlin.a1.n(obj);
                    androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar = this.f10755c;
                    Float f4 = new Float(this.f10756d);
                    androidx.compose.animation.core.h2 h2Var = fa.f10748g;
                    this.f10754b = 1;
                    if (androidx.compose.animation.core.b.i(bVar, f4, h2Var, null, null, this, 12, null) == aVar) {
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

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlin.jvm.internal.r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Switch.kt\nandroidx/compose/material3/SwitchKt$Switch$3$1\n*L\n1#1,497:1\n128#2:498\n*E\n"})
        /* renamed from: androidx.compose.material3.fa$b$b, reason: collision with other inner class name */
        public static final class C0239b implements androidx.compose.runtime.v0 {
            @Override // androidx.compose.runtime.v0
            public void dispose() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.animation.core.b<Float, androidx.compose.animation.core.o> bVar, float f4, kotlinx.coroutines.r0 r0Var) {
            super(1);
            this.f10751b = bVar;
            this.f10752c = f4;
            this.f10753d = r0Var;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l androidx.compose.runtime.w0 w0Var) {
            float floatValue = this.f10751b.s().floatValue();
            float f4 = this.f10752c;
            if (floatValue != f4) {
                kotlinx.coroutines.k.f(this.f10753d, null, null, new a(this.f10751b, f4, null), 3, null);
            }
            return new C0239b();
        }
    }

    /* compiled from: Switch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Boolean, kotlin.k2> f10758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f10759d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10760e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10761f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ da f10762g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f10763h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f10764i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f10765j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(boolean z4, ld.l<? super Boolean, kotlin.k2> lVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, boolean z5, da daVar, androidx.compose.foundation.interaction.k kVar, int i4, int i5) {
            super(2);
            this.f10757b = z4;
            this.f10758c = lVar;
            this.f10759d = qVar;
            this.f10760e = pVar;
            this.f10761f = z5;
            this.f10762g = daVar;
            this.f10763h = kVar;
            this.f10764i = i4;
            this.f10765j = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            fa.a(this.f10757b, this.f10758c, this.f10759d, this.f10760e, this.f10761f, this.f10762g, this.f10763h, tVar, androidx.compose.runtime.g3.b(this.f10764i | 1), this.f10765j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "", "a", "(Z)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Float> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f10766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f10767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(float f4, float f5) {
            super(1);
            this.f10766b = f4;
            this.f10767c = f5;
        }

        @fg.l
        public final Float a(boolean z4) {
            return Float.valueOf(z4 ? this.f10766b : this.f10767c);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Float invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* compiled from: Switch.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/q;", "a", "(Landroidx/compose/ui/unit/d;)J"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f10768b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(float f4) {
            super(1);
            this.f10768b = f4;
        }

        public final long a(@fg.l androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.r.a(kotlin.math.b.L0(this.f10768b), 0);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.b(a(dVar));
        }
    }

    /* compiled from: Switch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.o f10769b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10770c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f10771d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ da f10772e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.b5<Float> f10773f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f10774g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.i f10775h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f10776i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f10777j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f10778k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f10779l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f10780m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f10781n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.foundation.layout.o oVar, boolean z4, boolean z5, da daVar, androidx.compose.runtime.b5<Float> b5Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.foundation.interaction.i iVar, androidx.compose.ui.graphics.e6 e6Var, float f4, float f5, float f6, int i4, int i5) {
            super(2);
            this.f10769b = oVar;
            this.f10770c = z4;
            this.f10771d = z5;
            this.f10772e = daVar;
            this.f10773f = b5Var;
            this.f10774g = pVar;
            this.f10775h = iVar;
            this.f10776i = e6Var;
            this.f10777j = f4;
            this.f10778k = f5;
            this.f10779l = f6;
            this.f10780m = i4;
            this.f10781n = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            fa.b(this.f10769b, this.f10770c, this.f10771d, this.f10772e, this.f10773f, this.f10774g, this.f10775h, this.f10776i, this.f10777j, this.f10778k, this.f10779l, tVar, androidx.compose.runtime.g3.b(this.f10780m | 1), androidx.compose.runtime.g3.b(this.f10781n));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    static {
        c0.h1 h1Var = c0.h1.f37382a;
        float r4 = h1Var.r();
        f10742a = r4;
        f10743b = h1Var.N();
        float G = h1Var.G();
        f10744c = G;
        float D = h1Var.D();
        f10745d = D;
        float g4 = androidx.compose.ui.unit.h.g(D - r4) / 2;
        f10746e = g4;
        f10747f = (G - r4) - g4;
        f10748g = new androidx.compose.animation.core.h2<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f4  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r27, @fg.m ld.l<? super java.lang.Boolean, kotlin.k2> r28, @fg.m androidx.compose.ui.q r29, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r30, boolean r31, @fg.m androidx.compose.material3.da r32, @fg.m androidx.compose.foundation.interaction.k r33, @fg.m androidx.compose.runtime.t r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.fa.a(boolean, ld.l, androidx.compose.ui.q, ld.p, boolean, androidx.compose.material3.da, androidx.compose.foundation.interaction.k, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(androidx.compose.foundation.layout.o oVar, boolean z4, boolean z5, da daVar, androidx.compose.runtime.b5<Float> b5Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.foundation.interaction.i iVar, androidx.compose.ui.graphics.e6 e6Var, float f4, float f5, float f6, androidx.compose.runtime.t tVar, int i4, int i5) {
        int i6;
        int i7;
        float floatValue;
        androidx.compose.runtime.t o4 = tVar.o(-1968109941);
        if ((i4 & 6) == 0) {
            i6 = (o4.q0(oVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= o4.b(z4) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= o4.b(z5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= o4.q0(daVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= o4.q0(b5Var) ? 16384 : 8192;
        }
        if ((i4 & o.c.f32821k) == 0) {
            i6 |= o4.S(pVar) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= o4.q0(iVar) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= o4.q0(e6Var) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= o4.d(f4) ? androidx.core.view.accessibility.b.f26943s : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= o4.d(f5) ? 536870912 : ClientDefaults.MAX_MSG_SIZE;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (o4.d(f6) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i6 & 306783379) == 306783378 && (i7 & 3) == 2 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1968109941, i6, i7, "androidx.compose.material3.SwitchImpl (Switch.kt:186)");
            }
            long v4 = daVar.v(z5, z4);
            androidx.compose.runtime.b5<Boolean> a5 = androidx.compose.foundation.interaction.n.a(iVar, o4, (i6 >> 18) & 14);
            int i10 = i6;
            float l4 = c(a5) ? c0.h1.f37382a.l() : (((((androidx.compose.ui.unit.d) o4.x(androidx.compose.ui.platform.h1.i())).S(b5Var.getValue().floatValue()) - f5) / (f6 - f5)) * androidx.compose.ui.unit.h.g(f10742a - f4)) + f4;
            o4.P(-993794132);
            if (c(a5)) {
                floatValue = ((androidx.compose.ui.unit.d) o4.x(androidx.compose.ui.platform.h1.i())).v5(z4 ? androidx.compose.ui.unit.h.g(f10747f - c0.h1.f37382a.E()) : c0.h1.f37382a.E());
            } else {
                floatValue = b5Var.getValue().floatValue();
            }
            o4.p0();
            c0.h1 h1Var = c0.h1.f37382a;
            androidx.compose.ui.graphics.e6 e4 = x8.e(h1Var.F(), o4, 6);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.q c5 = androidx.compose.foundation.n.c(androidx.compose.foundation.z.g(androidx.compose.foundation.layout.c2.i(androidx.compose.foundation.layout.c2.B(oVar.c(companion, companion2.i()), f10744c), f10745d), h1Var.E(), daVar.a(z5, z4), e4), v4, e4);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a6 = androidx.compose.animation.a0.a(companion2, false, o4, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a7 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(c5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a7);
            } else {
                o4.C();
            }
            ld.p a8 = androidx.compose.animation.p.a(companion3, o4, a6, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, o4, j4, a8);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            long u4 = daVar.u(z5, z4);
            androidx.compose.ui.q c6 = pVar2.c(companion, companion2.o());
            o4.P(1420969929);
            boolean d5 = o4.d(floatValue);
            Object Q = o4.Q();
            if (d5 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new e(floatValue);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.ui.q c7 = androidx.compose.foundation.n.c(androidx.compose.foundation.layout.c2.o(androidx.compose.foundation.p1.b(androidx.compose.foundation.layout.f1.d(c6, (ld.l) Q), iVar, androidx.compose.material.ripple.p.e(false, androidx.compose.ui.unit.h.g(h1Var.C() / 2), 0L, o4, 54, 4)), l4), u4, e6Var);
            androidx.compose.ui.c i11 = companion2.i();
            o4.P(733328855);
            androidx.compose.ui.layout.m0 i12 = androidx.compose.foundation.layout.m.i(i11, false, o4, 6);
            o4.P(-1323940314);
            int j5 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B2 = o4.B();
            ld.a<androidx.compose.ui.node.g> a10 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(c7);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a10);
            } else {
                o4.C();
            }
            ld.p a11 = androidx.compose.animation.p.a(companion3, o4, i12, o4, B2);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j5))) {
                androidx.compose.animation.d.a(j5, o4, j5, a11);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            o4.P(1420970455);
            if (pVar != null) {
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(daVar.t(z5, z4))), pVar, o4, androidx.compose.runtime.b3.f15974d | ((i10 >> 12) & 112));
            }
            o4.p0();
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new f(oVar, z4, z5, daVar, b5Var, pVar, iVar, e6Var, f4, f5, f6, i4, i5));
        }
    }

    private static final boolean c(androidx.compose.runtime.b5<Boolean> b5Var) {
        return b5Var.getValue().booleanValue();
    }

    public static final float f() {
        return f10742a;
    }

    public static final float g() {
        return f10743b;
    }
}
