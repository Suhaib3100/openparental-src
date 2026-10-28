package androidx.compose.foundation.text2;

import androidx.compose.animation.a0;
import androidx.compose.animation.y;
import androidx.compose.foundation.layout.c2;
import androidx.compose.foundation.text.b1;
import androidx.compose.foundation.text.d0;
import androidx.compose.foundation.text.f0;
import androidx.compose.foundation.text.r;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.foundation.text.selection.c0;
import androidx.compose.foundation.text2.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text2.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text2.input.internal.j0;
import androidx.compose.foundation.text2.input.internal.m0;
import androidx.compose.foundation.text2.input.t;
import androidx.compose.foundation.text2.input.u;
import androidx.compose.foundation.w2;
import androidx.compose.runtime.g0;
import androidx.compose.runtime.g3;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t3;
import androidx.compose.runtime.v3;
import androidx.compose.runtime.w0;
import androidx.compose.runtime.x;
import androidx.compose.ui.graphics.t1;
import androidx.compose.ui.input.pointer.k0;
import androidx.compose.ui.input.pointer.u0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.f1;
import androidx.compose.ui.platform.i5;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.text.input.z0;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import ld.p;

/* compiled from: BasicTextField2.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aï\u0001\u0010'\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u001228\b\u0002\u0010\u001c\u001a2\u0012\u0004\u0012\u00020\u0015\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0002\b\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(\u001aÛ\u0001\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u001228\b\u0002\u0010\u001c\u001a2\u0012\u0004\u0012\u00020\u0015\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0002\b\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100\u001a\u0017\u00101\u001a\u00020\u00032\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b1\u00100\"\u001a\u00105\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b+\u00102\u0012\u0004\b3\u00104¨\u00068²\u0006\u000e\u00107\u001a\u0002068\n@\nX\u008a\u008e\u0002"}, d2 = {"", "value", "Lkotlin/Function1;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/ui/q;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/foundation/text2/input/h;", "inputTransformation", "Landroidx/compose/ui/text/v0;", "textStyle", "Landroidx/compose/foundation/text/f0;", "keyboardOptions", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "Landroidx/compose/foundation/text2/input/t;", "lineLimits", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/d;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/n0;", "Lkotlin/r0;", "name", "getResult", "Lkotlin/u;", "onTextLayout", "Landroidx/compose/foundation/interaction/k;", "interactionSource", "Landroidx/compose/ui/graphics/t1;", "cursorBrush", "Landroidx/compose/foundation/text2/input/c;", "codepointTransformation", "Landroidx/compose/foundation/text2/f;", "decorator", "Landroidx/compose/foundation/w2;", "scrollState", "b", "(Ljava/lang/String;Lld/l;Landroidx/compose/ui/q;ZZLandroidx/compose/foundation/text2/input/h;Landroidx/compose/ui/text/v0;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;Landroidx/compose/foundation/text2/input/t;Lld/p;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Landroidx/compose/foundation/text2/input/c;Landroidx/compose/foundation/text2/f;Landroidx/compose/foundation/w2;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/foundation/text2/input/u;", "state", "a", "(Landroidx/compose/foundation/text2/input/u;Landroidx/compose/ui/q;ZZLandroidx/compose/foundation/text2/input/h;Landroidx/compose/ui/text/v0;Landroidx/compose/foundation/text/f0;Landroidx/compose/foundation/text/d0;Landroidx/compose/foundation/text2/input/t;Lld/p;Landroidx/compose/foundation/interaction/k;Landroidx/compose/ui/graphics/t1;Landroidx/compose/foundation/text2/input/c;Landroidx/compose/foundation/text2/f;Landroidx/compose/foundation/w2;Landroidx/compose/runtime/t;III)V", "Landroidx/compose/foundation/text2/input/internal/selection/i;", "selectionState", "e", "(Landroidx/compose/foundation/text2/input/internal/selection/i;Landroidx/compose/runtime/t;I)V", "f", "Landroidx/compose/foundation/text2/f;", "i", "()V", "DefaultTextFieldDecorator", "Landroidx/compose/ui/text/input/z0;", "valueWithSelection", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,543:1\n25#2:544\n25#2:551\n25#2:567\n67#2,3:574\n66#2:577\n36#2:585\n36#2:592\n456#2,8:619\n464#2,3:633\n467#2,3:637\n1116#3,6:545\n1116#3,6:552\n1116#3,6:558\n1116#3,6:568\n1116#3,3:578\n1119#3,3:582\n1116#3,6:586\n1116#3,6:593\n1116#3,6:642\n74#4:564\n74#4:565\n74#4:566\n74#4:599\n74#4:600\n74#4:601\n1#5:581\n68#6,6:602\n74#6:636\n78#6:641\n79#7,11:608\n92#7:640\n3737#8,6:627\n81#9:648\n107#9,2:649\n*S KotlinDebug\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt\n*L\n191#1:544\n201#1:551\n342#1:567\n347#1:574,3\n347#1:577\n358#1:585\n360#1:592\n424#1:619,8\n424#1:633,3\n424#1:637,3\n191#1:545,6\n201#1:552,6\n216#1:558,6\n342#1:568,6\n347#1:578,3\n347#1:582,3\n358#1:586,6\n360#1:593,6\n494#1:642,6\n336#1:564\n337#1:565\n338#1:566\n370#1:599\n371#1:600\n372#1:601\n424#1:602,6\n424#1:636\n424#1:641\n424#1:608,11\n424#1:640\n424#1:627,6\n201#1:648\n201#1:649,2\n*E\n"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.foundation.text2.f f8416a = g.f8479a;

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<z0, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<String, k2> f8417b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<z0> f8418c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.l<? super String, k2> lVar, androidx.compose.runtime.k2<z0> k2Var) {
            super(1);
            this.f8417b = lVar;
            this.f8418c = k2Var;
        }

        public final void a(@fg.l z0 z0Var) {
            if (!l0.g(z0Var.i(), b.g(this.f8418c).i())) {
                this.f8417b.invoke(z0Var.i());
            }
            this.f8418c.setValue(z0Var);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z0 z0Var) {
            a(z0Var);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text2.b$b, reason: collision with other inner class name */
    static final class C0176b extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8419b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<String, k2> f8420c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ q f8421d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8422e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f8423f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.h f8424g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ v0 f8425h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ f0 f8426i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ d0 f8427j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.t f8428k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.ui.unit.d, ld.a<androidx.compose.ui.text.n0>, k2> f8429l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8430m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ t1 f8431n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.c f8432o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.f f8433p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ w2 f8434q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f8435r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f8436s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f8437t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0176b(String str, ld.l<? super String, k2> lVar, q qVar, boolean z4, boolean z5, androidx.compose.foundation.text2.input.h hVar, v0 v0Var, f0 f0Var, d0 d0Var, androidx.compose.foundation.text2.input.t tVar, p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> pVar, androidx.compose.foundation.interaction.k kVar, t1 t1Var, androidx.compose.foundation.text2.input.c cVar, androidx.compose.foundation.text2.f fVar, w2 w2Var, int i4, int i5, int i6) {
            super(2);
            this.f8419b = str;
            this.f8420c = lVar;
            this.f8421d = qVar;
            this.f8422e = z4;
            this.f8423f = z5;
            this.f8424g = hVar;
            this.f8425h = v0Var;
            this.f8426i = f0Var;
            this.f8427j = d0Var;
            this.f8428k = tVar;
            this.f8429l = pVar;
            this.f8430m = kVar;
            this.f8431n = t1Var;
            this.f8432o = cVar;
            this.f8433p = fVar;
            this.f8434q = w2Var;
            this.f8435r = i4;
            this.f8436s = i5;
            this.f8437t = i6;
        }

        public final void a(@fg.m t tVar, int i4) {
            b.b(this.f8419b, this.f8420c, this.f8421d, this.f8422e, this.f8423f, this.f8424g, this.f8425h, this.f8426i, this.f8427j, this.f8428k, this.f8429l, this.f8430m, this.f8431n, this.f8432o, this.f8433p, this.f8434q, tVar, g3.b(this.f8435r | 1), g3.b(this.f8436s), this.f8437t);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8438b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0.a f8439c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1 f8440d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i5 f8441e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.d f8442f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f8443g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f8444h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.foundation.text2.input.internal.selection.i iVar, k0.a aVar, f1 f1Var, i5 i5Var, androidx.compose.ui.unit.d dVar, boolean z4, boolean z5) {
            super(0);
            this.f8438b = iVar;
            this.f8439c = aVar;
            this.f8440d = f1Var;
            this.f8441e = i5Var;
            this.f8442f = dVar;
            this.f8443g = z4;
            this.f8444h = z5;
        }

        public final void a() {
            this.f8438b.F0(this.f8439c, this.f8440d, this.f8441e, this.f8442f, this.f8443g, this.f8444h);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/v0;", "a", "(Landroidx/compose/runtime/w0;)Landroidx/compose/runtime/v0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,543:1\n64#2,5:544\n*S KotlinDebug\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$4\n*L\n387#1:544,5\n*E\n"})
    static final class d extends n0 implements ld.l<w0, androidx.compose.runtime.v0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8445b;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/w0$a", "Landroidx/compose/runtime/v0;", "Lkotlin/k2;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$4\n*L\n1#1,497:1\n388#2,2:498\n*E\n"})
        public static final class a implements androidx.compose.runtime.v0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8446a;

            public a(androidx.compose.foundation.text2.input.internal.selection.i iVar) {
                this.f8446a = iVar;
            }

            @Override // androidx.compose.runtime.v0
            public void dispose() {
                this.f8446a.U();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.foundation.text2.input.internal.selection.i iVar) {
            super(1);
            this.f8445b = iVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.runtime.v0 invoke(@fg.l w0 w0Var) {
            return new a(this.f8445b);
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$5$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,543:1\n68#2,6:544\n74#2:578\n78#2:583\n79#3,11:550\n92#3:582\n456#4,8:561\n464#4,3:575\n467#4,3:579\n3737#5,6:569\n*S KotlinDebug\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$BasicTextField2$5$1\n*L\n437#1:544,6\n437#1:578\n437#1:583\n437#1:550,11\n437#1:582\n437#1:561,8\n437#1:575,3\n437#1:579,3\n437#1:569,6\n*E\n"})
    static final class e extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.t f8447b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f8448c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v0 f8449d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8450e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f8451f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ m0 f8452g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8453h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ t1 f8454i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f8455j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f8456k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ w2 f8457l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.gestures.j0 f8458m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f8459n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.ui.unit.d, ld.a<androidx.compose.ui.text.n0>, k2> f8460o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.foundation.text2.input.t tVar, j0 j0Var, v0 v0Var, boolean z4, boolean z5, m0 m0Var, androidx.compose.foundation.text2.input.internal.selection.i iVar, t1 t1Var, boolean z6, boolean z7, w2 w2Var, androidx.compose.foundation.gestures.j0 j0Var2, boolean z10, p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> pVar) {
            super(2);
            this.f8447b = tVar;
            this.f8448c = j0Var;
            this.f8449d = v0Var;
            this.f8450e = z4;
            this.f8451f = z5;
            this.f8452g = m0Var;
            this.f8453h = iVar;
            this.f8454i = t1Var;
            this.f8455j = z6;
            this.f8456k = z7;
            this.f8457l = w2Var;
            this.f8458m = j0Var2;
            this.f8459n = z10;
            this.f8460o = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m t tVar, int i4) {
            int i5;
            int i6;
            if ((i4 & 11) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(1476233751, i4, -1, "androidx.compose.foundation.text2.BasicTextField2.<anonymous>.<anonymous> (BasicTextField2.kt:426)");
            }
            androidx.compose.foundation.text2.input.t tVar2 = this.f8447b;
            if (tVar2 instanceof t.b) {
                i5 = ((t.b) tVar2).getMinHeightInLines();
                i6 = ((t.b) this.f8447b).getMaxHeightInLines();
            } else {
                i5 = 1;
                i6 = 1;
            }
            q w32 = androidx.compose.ui.draw.h.b(b1.a(r.a(c2.k(q.INSTANCE, this.f8448c.f(), 0.0f, 2, null), this.f8449d, i5, i6), this.f8449d)).w3(new TextFieldCoreModifier(this.f8450e && this.f8451f, this.f8448c, this.f8452g, this.f8453h, this.f8454i, this.f8455j && !this.f8456k, this.f8457l, this.f8458m));
            j0 j0Var = this.f8448c;
            m0 m0Var = this.f8452g;
            v0 v0Var = this.f8449d;
            boolean z4 = this.f8459n;
            p<androidx.compose.ui.unit.d, ld.a<androidx.compose.ui.text.n0>, k2> pVar = this.f8460o;
            boolean z5 = this.f8455j;
            boolean z6 = this.f8450e;
            boolean z7 = this.f8451f;
            androidx.compose.foundation.text2.input.internal.selection.i iVar = this.f8453h;
            boolean z10 = this.f8456k;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = a0.a(androidx.compose.ui.c.INSTANCE, true, tVar, 48, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, k2> g4 = androidx.compose.ui.layout.a0.g(w32);
            if (tVar.s() == null) {
                androidx.compose.runtime.p.n();
            }
            tVar.W();
            if (tVar.getInserting()) {
                tVar.F(a6);
            } else {
                tVar.C();
            }
            p a7 = androidx.compose.animation.p.a(companion, tVar, a5, tVar, B);
            if (tVar.getInserting() || !l0.g(tVar.Q(), Integer.valueOf(j4))) {
                androidx.compose.animation.d.a(j4, tVar, j4, a7);
            }
            androidx.compose.animation.e.a(0, g4, v3.a(tVar), tVar, 2058660585);
            androidx.compose.foundation.layout.p pVar2 = androidx.compose.foundation.layout.p.f5235a;
            androidx.compose.foundation.layout.m.a(new TextFieldTextLayoutModifier(j0Var, m0Var, v0Var, z4, pVar), tVar, 0);
            tVar.P(-39277302);
            if (z5 && z6 && z7 && iVar.p0()) {
                b.f(iVar, tVar, 8);
                if (!z10) {
                    b.e(iVar, tVar, 8);
                }
            }
            if (y.a(tVar)) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f8461b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ q f8462c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8463d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f8464e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.h f8465f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ v0 f8466g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f8467h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d0 f8468i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.t f8469j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.ui.unit.d, ld.a<androidx.compose.ui.text.n0>, k2> f8470k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.interaction.k f8471l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ t1 f8472m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.c f8473n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.f f8474o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ w2 f8475p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f8476q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f8477r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f8478s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(u uVar, q qVar, boolean z4, boolean z5, androidx.compose.foundation.text2.input.h hVar, v0 v0Var, f0 f0Var, d0 d0Var, androidx.compose.foundation.text2.input.t tVar, p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, k2> pVar, androidx.compose.foundation.interaction.k kVar, t1 t1Var, androidx.compose.foundation.text2.input.c cVar, androidx.compose.foundation.text2.f fVar, w2 w2Var, int i4, int i5, int i6) {
            super(2);
            this.f8461b = uVar;
            this.f8462c = qVar;
            this.f8463d = z4;
            this.f8464e = z5;
            this.f8465f = hVar;
            this.f8466g = v0Var;
            this.f8467h = f0Var;
            this.f8468i = d0Var;
            this.f8469j = tVar;
            this.f8470k = pVar;
            this.f8471l = kVar;
            this.f8472m = t1Var;
            this.f8473n = cVar;
            this.f8474o = fVar;
            this.f8475p = w2Var;
            this.f8476q = i4;
            this.f8477r = i5;
            this.f8478s = i6;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b.a(this.f8461b, this.f8462c, this.f8463d, this.f8464e, this.f8465f, this.f8466g, this.f8467h, this.f8468i, this.f8469j, this.f8470k, this.f8471l, this.f8472m, this.f8473n, this.f8474o, this.f8475p, tVar, g3.b(this.f8476q | 1), g3.b(this.f8477r), this.f8478s);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "it", "<anonymous>", "(Lld/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class g implements androidx.compose.foundation.text2.f {

        /* renamed from: a, reason: collision with root package name */
        public static final g f8479a = new g();

        /* compiled from: BasicTextField2.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        static final class a extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<androidx.compose.runtime.t, Integer, k2> f8481c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f8482d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, int i4) {
                super(2);
                this.f8481c = pVar;
                this.f8482d = i4;
            }

            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                g.this.a(this.f8481c, tVar, g3.b(this.f8482d | 1));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
                a(tVar, num.intValue());
                return k2.f75408a;
            }
        }

        g() {
        }

        @Override // androidx.compose.foundation.text2.f
        @androidx.compose.runtime.j(scheme = "[0[0]]")
        @androidx.compose.runtime.i
        public final void a(@fg.l p<? super androidx.compose.runtime.t, ? super Integer, k2> pVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
            int i5;
            androidx.compose.runtime.t o4 = tVar.o(-186734623);
            if ((i4 & 14) == 0) {
                i5 = (o4.S(pVar) ? 4 : 2) | i4;
            } else {
                i5 = i4;
            }
            if ((i4 & 112) == 0) {
                i5 |= o4.q0(this) ? 32 : 16;
            }
            if ((i5 & 91) == 18 && o4.p()) {
                o4.d0();
            } else {
                if (x.b0()) {
                    x.r0(-186734623, i5, -1, "androidx.compose.foundation.text2.DefaultTextFieldDecorator.<no name provided>.Decoration (BasicTextField2.kt:541)");
                }
                if (androidx.compose.animation.r.a(i5 & 14, pVar, o4)) {
                    x.q0();
                }
            }
            t3 t4 = o4.t();
            if (t4 != null) {
                t4.a(new a(pVar, i4));
            }
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends n0 implements ld.l<z, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.e f8483b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.foundation.text2.input.internal.selection.e eVar) {
            super(1);
            this.f8483b = eVar;
        }

        public final void a(@fg.l z zVar) {
            zVar.b(c0.d(), new b0(androidx.compose.foundation.text.o.Cursor, this.f8483b.j(), androidx.compose.foundation.text.selection.a0.Middle, true, null));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(z zVar) {
            a(zVar);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldCursorHandle$2", f = "BasicTextField2.kt", i = {}, l = {503}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldCursorHandle$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    static final class i extends kotlin.coroutines.jvm.internal.o implements p<k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8484b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8485c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8486d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.foundation.text2.input.internal.selection.i iVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f8486d = iVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((i) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.f8486d, dVar);
            iVar.f8485c = obj;
            return iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8484b;
            if (i4 == 0) {
                a1.n(obj);
                k0 k0Var = (k0) this.f8485c;
                androidx.compose.foundation.text2.input.internal.selection.i iVar = this.f8486d;
                this.f8484b = 1;
                if (iVar.J(k0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8487b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8488c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.foundation.text2.input.internal.selection.i iVar, int i4) {
            super(2);
            this.f8487b = iVar;
            this.f8488c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b.e(this.f8487b, tVar, g3.b(this.f8488c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "<anonymous>", "()Li0/f;"}, k = 3, mv = {1, 8, 0})
    static final class k implements androidx.compose.foundation.text.selection.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8489b;

        k(androidx.compose.foundation.text2.input.internal.selection.i iVar) {
            this.f8489b = iVar;
        }

        @Override // androidx.compose.foundation.text.selection.n
        public final long a() {
            return this.f8489b.j0().j();
        }
    }

    /* compiled from: BasicTextField2.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$2", f = "BasicTextField2.kt", i = {}, l = {522}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    static final class l extends kotlin.coroutines.jvm.internal.o implements p<k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8490b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8492d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.foundation.text2.input.internal.selection.i iVar, kotlin.coroutines.d<? super l> dVar) {
            super(2, dVar);
            this.f8492d = iVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((l) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f8492d, dVar);
            lVar.f8491c = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8490b;
            if (i4 == 0) {
                a1.n(obj);
                k0 k0Var = (k0) this.f8491c;
                androidx.compose.foundation.text2.input.internal.selection.i iVar = this.f8492d;
                this.f8490b = 1;
                if (iVar.v0(k0Var, true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/f;", "<anonymous>", "()Li0/f;"}, k = 3, mv = {1, 8, 0})
    static final class m implements androidx.compose.foundation.text.selection.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8493b;

        m(androidx.compose.foundation.text2.input.internal.selection.i iVar) {
            this.f8493b = iVar;
        }

        @Override // androidx.compose.foundation.text.selection.n
        public final long a() {
            return this.f8493b.c0().j();
        }
    }

    /* compiled from: BasicTextField2.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.BasicTextField2Kt$TextFieldSelectionHandles$4", f = "BasicTextField2.kt", i = {}, l = {535}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/k0;", "Lkotlin/k2;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/k0;)V"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nBasicTextField2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTextField2.kt\nandroidx/compose/foundation/text2/BasicTextField2Kt$TextFieldSelectionHandles$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    static final class n extends kotlin.coroutines.jvm.internal.o implements p<k0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f8494b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f8495c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8496d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(androidx.compose.foundation.text2.input.internal.selection.i iVar, kotlin.coroutines.d<? super n> dVar) {
            super(2, dVar);
            this.f8496d = iVar;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l k0 k0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((n) create(k0Var, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f8496d, dVar);
            nVar.f8495c = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f8494b;
            if (i4 == 0) {
                a1.n(obj);
                k0 k0Var = (k0) this.f8495c;
                androidx.compose.foundation.text2.input.internal.selection.i iVar = this.f8496d;
                this.f8494b = 1;
                if (iVar.v0(k0Var, false, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: BasicTextField2.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class o extends n0 implements p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.i f8497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(androidx.compose.foundation.text2.input.internal.selection.i iVar, int i4) {
            super(2);
            this.f8497b = iVar;
            this.f8498c = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            b.f(this.f8497b, tVar, g3.b(this.f8498c | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x038d, code lost:
    
        if (r14 == androidx.compose.runtime.t.INSTANCE.a()) goto L241;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03bc  */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [androidx.compose.foundation.text2.f] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v34, types: [androidx.compose.foundation.text2.f] */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r47v0, types: [androidx.compose.foundation.text2.f, java.lang.Object] */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l androidx.compose.foundation.text2.input.u r34, @fg.m androidx.compose.ui.q r35, boolean r36, boolean r37, @fg.m androidx.compose.foundation.text2.input.h r38, @fg.m androidx.compose.ui.text.v0 r39, @fg.m androidx.compose.foundation.text.f0 r40, @fg.m androidx.compose.foundation.text.d0 r41, @fg.m androidx.compose.foundation.text2.input.t r42, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, kotlin.k2> r43, @fg.m androidx.compose.foundation.interaction.k r44, @fg.m androidx.compose.ui.graphics.t1 r45, @fg.m androidx.compose.foundation.text2.input.c r46, @fg.m androidx.compose.foundation.text2.f r47, @fg.m androidx.compose.foundation.w2 r48, @fg.m androidx.compose.runtime.t r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.b.a(androidx.compose.foundation.text2.input.u, androidx.compose.ui.q, boolean, boolean, androidx.compose.foundation.text2.input.h, androidx.compose.ui.text.v0, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, androidx.compose.foundation.text2.input.t, ld.p, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, androidx.compose.foundation.text2.input.c, androidx.compose.foundation.text2.f, androidx.compose.foundation.w2, androidx.compose.runtime.t, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0355  */
    @androidx.compose.foundation.z0
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@fg.l java.lang.String r40, @fg.l ld.l<? super java.lang.String, kotlin.k2> r41, @fg.m androidx.compose.ui.q r42, boolean r43, boolean r44, @fg.m androidx.compose.foundation.text2.input.h r45, @fg.m androidx.compose.ui.text.v0 r46, @fg.m androidx.compose.foundation.text.f0 r47, @fg.m androidx.compose.foundation.text.d0 r48, @fg.m androidx.compose.foundation.text2.input.t r49, @fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<androidx.compose.ui.text.n0>, kotlin.k2> r50, @fg.m androidx.compose.foundation.interaction.k r51, @fg.m androidx.compose.ui.graphics.t1 r52, @fg.m androidx.compose.foundation.text2.input.c r53, @fg.m androidx.compose.foundation.text2.f r54, @fg.m androidx.compose.foundation.w2 r55, @fg.m androidx.compose.runtime.t r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 1167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.b.b(java.lang.String, ld.l, androidx.compose.ui.q, boolean, boolean, androidx.compose.foundation.text2.input.h, androidx.compose.ui.text.v0, androidx.compose.foundation.text.f0, androidx.compose.foundation.text.d0, androidx.compose.foundation.text2.input.t, ld.p, androidx.compose.foundation.interaction.k, androidx.compose.ui.graphics.t1, androidx.compose.foundation.text2.input.c, androidx.compose.foundation.text2.f, androidx.compose.foundation.w2, androidx.compose.runtime.t, int, int, int):void");
    }

    private static final z0 c(androidx.compose.runtime.k2<z0> k2Var) {
        return k2Var.getValue();
    }

    private static final void d(androidx.compose.runtime.k2<z0> k2Var, z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void e(@fg.l androidx.compose.foundation.text2.input.internal.selection.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(773754631);
        if (x.b0()) {
            x.r0(773754631, i4, -1, "androidx.compose.foundation.text2.TextFieldCursorHandle (BasicTextField2.kt:487)");
        }
        androidx.compose.foundation.text2.input.internal.selection.e X = iVar.X();
        if (X.k()) {
            long j4 = X.j();
            q.Companion companion = q.INSTANCE;
            o4.P(-949361180);
            boolean q02 = o4.q0(X);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new h(X);
                o4.E(Q);
            }
            o4.p0();
            androidx.compose.foundation.text.a.a(j4, u0.e(androidx.compose.ui.semantics.o.f(companion, false, (ld.l) Q, 1, null), iVar, new i(iVar, null)), null, o4, 384);
        }
        if (x.b0()) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new j(iVar, i4));
        }
    }

    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    public static final void f(@fg.l androidx.compose.foundation.text2.input.internal.selection.i iVar, @fg.m androidx.compose.runtime.t tVar, int i4) {
        androidx.compose.runtime.t o4 = tVar.o(-1194626330);
        if (x.b0()) {
            x.r0(-1194626330, i4, -1, "androidx.compose.foundation.text2.TextFieldSelectionHandles (BasicTextField2.kt:512)");
        }
        androidx.compose.foundation.text2.input.internal.selection.e j02 = iVar.j0();
        o4.P(-1453543870);
        if (j02.k()) {
            androidx.compose.foundation.text.selection.a.b(new k(iVar), true, j02.h(), j02.i(), u0.e(q.INSTANCE, iVar, new l(iVar, null)), o4, 48);
        }
        o4.p0();
        androidx.compose.foundation.text2.input.internal.selection.e c02 = iVar.c0();
        if (c02.k()) {
            androidx.compose.foundation.text.selection.a.b(new m(iVar), false, c02.h(), c02.i(), u0.e(q.INSTANCE, iVar, new n(iVar, null)), o4, 48);
        }
        if (x.b0()) {
            x.q0();
        }
        t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new o(iVar, i4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z0 g(androidx.compose.runtime.k2 k2Var) {
        return (z0) k2Var.getValue();
    }

    public static final void h(androidx.compose.runtime.k2 k2Var, z0 z0Var) {
        k2Var.setValue(z0Var);
    }

    private static /* synthetic */ void i() {
    }
}
