package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.runtime.g3;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001az\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0090\u0001\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001ad\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001az\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001an\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0084\u0001\u0010!\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a%\u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b'\u0010(\u001a¬\u0001\u00103\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020)2\u0014\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,\u0018\u00010+2\u001c\u00100\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010/0+\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\u00102\u001a\u0004\u0018\u0001012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"", "text", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/text/v0;", "style", "Lkotlin/Function1;", "Landroidx/compose/ui/text/n0;", "Lkotlin/k2;", "onTextLayout", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/k2;", "color", "f", "(Ljava/lang/String;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;Lld/l;IZIILandroidx/compose/ui/graphics/k2;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/ui/text/e;", "", "Landroidx/compose/foundation/text/t;", "inlineContent", "d", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;Lld/l;IZIILjava/util/Map;Landroidx/compose/ui/graphics/k2;Landroidx/compose/runtime/t;II)V", "c", "(Ljava/lang/String;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;Lld/l;IZILandroidx/compose/runtime/t;II)V", "a", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;Lld/l;IZILjava/util/Map;Landroidx/compose/runtime/t;II)V", "b", "(Ljava/lang/String;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;Lld/l;IZIILandroidx/compose/runtime/t;II)V", "e", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/q;Landroidx/compose/ui/text/v0;Lld/l;IZIILjava/util/Map;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/foundation/text/selection/l0;", "selectionRegistrar", "Landroidx/compose/runtime/saveable/l;", "", "g", "(Landroidx/compose/foundation/text/selection/l0;)Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Li0/i;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/j;", "selectionController", "h", "(Landroidx/compose/ui/q;Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Lld/l;IZIILandroidx/compose/ui/text/font/y$b;Ljava/util/List;Lld/l;Landroidx/compose/foundation/text/modifiers/j;Landroidx/compose/ui/graphics/k2;)Landroidx/compose/ui/q;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,447:1\n74#2:448\n74#2:449\n74#2:460\n74#2:461\n74#2:490\n74#2:491\n74#2:502\n74#2:538\n67#3,3:450\n66#3:453\n286#3,8:467\n294#3,2:487\n67#3,3:492\n66#3:495\n286#3,8:508\n294#3,2:528\n25#3:531\n456#3,8:562\n464#3,6:576\n1116#4,6:454\n1116#4,6:496\n1116#4,6:532\n1116#4,6:539\n1116#4,6:545\n124#5,5:462\n130#5,5:475\n135#5:486\n137#5:489\n124#5,5:503\n130#5,5:516\n135#5:527\n137#5:530\n79#5,11:551\n92#5:582\n3737#6,6:480\n3737#6,6:521\n3737#6,6:570\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n96#1:448\n98#1:449\n125#1:460\n137#1:461\n190#1:490\n192#1:491\n221#1:502\n250#1:538\n103#1:450,3\n103#1:453\n145#1:467,8\n145#1:487,2\n197#1:492,3\n197#1:495\n209#1:508,8\n209#1:528,2\n234#1:531\n237#1:562,8\n237#1:576,6\n103#1:454,6\n197#1:496,6\n234#1:532,6\n252#1:539,6\n256#1:545,6\n145#1:462,5\n145#1:475,5\n145#1:486\n145#1:489\n209#1:503,5\n209#1:516,5\n209#1:527\n209#1:530\n237#1:551,11\n237#1:582\n145#1:480,6\n209#1:521,6\n237#1:570,6\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7240b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7241c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7242d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7243e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7244f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7245g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7246h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7247i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.k2 f7248j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7249k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7250l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, int i4, boolean z4, int i5, int i6, androidx.compose.ui.graphics.k2 k2Var, int i7, int i10) {
            super(2);
            this.f7240b = str;
            this.f7241c = qVar;
            this.f7242d = v0Var;
            this.f7243e = lVar;
            this.f7244f = i4;
            this.f7245g = z4;
            this.f7246h = i5;
            this.f7247i = i6;
            this.f7248j = k2Var;
            this.f7249k = i7;
            this.f7250l = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d.f(this.f7240b, this.f7241c, this.f7242d, this.f7243e, this.f7244f, this.f7245g, this.f7246h, this.f7247i, this.f7248j, tVar, g3.b(this.f7249k | 1), this.f7250l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Li0/i;", "it", "Lkotlin/k2;", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<? extends i0.i>, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<List<i0.i>> f7251b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.runtime.k2<List<i0.i>> k2Var) {
            super(1);
            this.f7251b = k2Var;
        }

        public final void a(@fg.l List<i0.i> list) {
            this.f7251b.setValue(list);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(List<? extends i0.i> list) {
            a(list);
            return k2.f75408a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Li0/i;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<List<? extends i0.i>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.k2<List<i0.i>> f7252b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.runtime.k2<List<i0.i>> k2Var) {
            super(0);
            this.f7252b = k2Var;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<i0.i> invoke() {
            return this.f7252b.getValue();
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.d$d, reason: collision with other inner class name */
    static final class C0133d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f7253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7254c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7255d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7256e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7257f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7258g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7259h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7260i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, t> f7261j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.k2 f7262k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7263l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f7264m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0133d(androidx.compose.ui.text.e eVar, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, int i4, boolean z4, int i5, int i6, Map<String, t> map, androidx.compose.ui.graphics.k2 k2Var, int i7, int i10) {
            super(2);
            this.f7253b = eVar;
            this.f7254c = qVar;
            this.f7255d = v0Var;
            this.f7256e = lVar;
            this.f7257f = i4;
            this.f7258g = z4;
            this.f7259h = i5;
            this.f7260i = i6;
            this.f7261j = map;
            this.f7262k = k2Var;
            this.f7263l = i7;
            this.f7264m = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d.d(this.f7253b, this.f7254c, this.f7255d, this.f7256e, this.f7257f, this.f7258g, this.f7259h, this.f7260i, this.f7261j, this.f7262k, tVar, g3.b(this.f7263l | 1), this.f7264m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7267d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7268e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7269f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7270g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7271h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7272i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f7273j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, int i4, boolean z4, int i5, int i6, int i7) {
            super(2);
            this.f7265b = str;
            this.f7266c = qVar;
            this.f7267d = v0Var;
            this.f7268e = lVar;
            this.f7269f = i4;
            this.f7270g = z4;
            this.f7271h = i5;
            this.f7272i = i6;
            this.f7273j = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d.c(this.f7265b, this.f7266c, this.f7267d, this.f7268e, this.f7269f, this.f7270g, this.f7271h, tVar, g3.b(this.f7272i | 1), this.f7273j);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f7274b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7275c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7276d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7277e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7278f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7279g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7280h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Map<String, t> f7281i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f7282j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7283k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.text.e eVar, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, int i4, boolean z4, int i5, Map<String, t> map, int i6, int i7) {
            super(2);
            this.f7274b = eVar;
            this.f7275c = qVar;
            this.f7276d = v0Var;
            this.f7277e = lVar;
            this.f7278f = i4;
            this.f7279g = z4;
            this.f7280h = i5;
            this.f7281i = map;
            this.f7282j = i6;
            this.f7283k = i7;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d.a(this.f7274b, this.f7275c, this.f7276d, this.f7277e, this.f7278f, this.f7279g, this.f7280h, this.f7281i, tVar, g3.b(this.f7282j | 1), this.f7283k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f7284b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7285c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7286d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7287e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7288f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7289g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7290h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7291i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f7292j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7293k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(String str, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, int i4, boolean z4, int i5, int i6, int i7, int i10) {
            super(2);
            this.f7284b = str;
            this.f7285c = qVar;
            this.f7286d = v0Var;
            this.f7287e = lVar;
            this.f7288f = i4;
            this.f7289g = z4;
            this.f7290h = i5;
            this.f7291i = i6;
            this.f7292j = i7;
            this.f7293k = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d.b(this.f7284b, this.f7285c, this.f7286d, this.f7287e, this.f7288f, this.f7289g, this.f7290h, this.f7291i, tVar, g3.b(this.f7292j | 1), this.f7293k);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.e f7294b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f7295c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f7296d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.l<androidx.compose.ui.text.n0, k2> f7297e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7298f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f7299g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7300h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f7301i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<String, t> f7302j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f7303k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f7304l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(androidx.compose.ui.text.e eVar, androidx.compose.ui.q qVar, androidx.compose.ui.text.v0 v0Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, int i4, boolean z4, int i5, int i6, Map<String, t> map, int i7, int i10) {
            super(2);
            this.f7294b = eVar;
            this.f7295c = qVar;
            this.f7296d = v0Var;
            this.f7297e = lVar;
            this.f7298f = i4;
            this.f7299g = z4;
            this.f7300h = i5;
            this.f7301i = i6;
            this.f7302j = map;
            this.f7303k = i7;
            this.f7304l = i10;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            d.e(this.f7294b, this.f7295c, this.f7296d, this.f7297e, this.f7298f, this.f7299g, this.f7300h, this.f7301i, this.f7302j, tVar, g3.b(this.f7303k | 1), this.f7304l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.a<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.l0 f7305b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.foundation.text.selection.l0 l0Var) {
            super(0);
            this.f7305b = l0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f7305b.a());
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.n0 implements ld.a<Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.l0 f7306b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.foundation.text.selection.l0 l0Var) {
            super(0);
            this.f7306b = l0Var;
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(this.f7306b.a());
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/ui/layout/a0$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class k extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f7307b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ld.a aVar) {
            super(0);
            this.f7307b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.g invoke() {
            return this.f7307b.invoke();
        }
    }

    /* compiled from: Composables.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "T", "Landroidx/compose/runtime/e;", "E", "invoke", "()Ljava/lang/Object;", "androidx/compose/ui/layout/a0$a", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ReusableComposeNode$1\n*L\n1#1,484:1\n*E\n"})
    public static final class l extends kotlin.jvm.internal.n0 implements ld.a<androidx.compose.ui.node.g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.a f7308b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ld.a aVar) {
            super(0);
            this.f7308b = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.g, java.lang.Object] */
        @Override // ld.a
        @fg.l
        public final androidx.compose.ui.node.g invoke() {
            return this.f7308b.invoke();
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "", "it", "a", "(Landroidx/compose/runtime/saveable/n;J)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, Long, Long> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text.selection.l0 f7309b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(androidx.compose.foundation.text.selection.l0 l0Var) {
            super(2);
            this.f7309b = l0Var;
        }

        @fg.m
        public final Long a(@fg.l androidx.compose.runtime.saveable.n nVar, long j4) {
            if (androidx.compose.foundation.text.selection.o0.b(this.f7309b, j4)) {
                return Long.valueOf(j4);
            }
            return null;
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ Long invoke(androidx.compose.runtime.saveable.n nVar, Long l4) {
            return a(nVar, l4.longValue());
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(J)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.n0 implements ld.l<Long, Long> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f7310b = new n(1);

        n() {
            super(1);
        }

        @fg.m
        public final Long a(long j4) {
            return Long.valueOf(j4);
        }

        @Override // ld.l
        public Long invoke(Long l4) {
            return Long.valueOf(l4.longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x004f  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.text.e r25, androidx.compose.ui.q r26, androidx.compose.ui.text.v0 r27, ld.l r28, int r29, boolean r30, int r31, java.util.Map r32, androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.d.a(androidx.compose.ui.text.e, androidx.compose.ui.q, androidx.compose.ui.text.v0, ld.l, int, boolean, int, java.util.Map, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006a  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compat")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r25, androidx.compose.ui.q r26, androidx.compose.ui.text.v0 r27, ld.l r28, int r29, boolean r30, int r31, int r32, androidx.compose.runtime.t r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.d.b(java.lang.String, androidx.compose.ui.q, androidx.compose.ui.text.v0, ld.l, int, boolean, int, int, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004d  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r21, androidx.compose.ui.q r22, androidx.compose.ui.text.v0 r23, ld.l r24, int r25, boolean r26, int r27, androidx.compose.runtime.t r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.d.c(java.lang.String, androidx.compose.ui.q, androidx.compose.ui.text.v0, ld.l, int, boolean, int, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0323  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l androidx.compose.ui.text.e r51, @fg.m androidx.compose.ui.q r52, @fg.m androidx.compose.ui.text.v0 r53, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r54, int r55, boolean r56, int r57, int r58, @fg.m java.util.Map<java.lang.String, androidx.compose.foundation.text.t> r59, @fg.m androidx.compose.ui.graphics.k2 r60, @fg.m androidx.compose.runtime.t r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.d.d(androidx.compose.ui.text.e, androidx.compose.ui.q, androidx.compose.ui.text.v0, ld.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.k2, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0088  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Maintained for binary compat")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(androidx.compose.ui.text.e r26, androidx.compose.ui.q r27, androidx.compose.ui.text.v0 r28, ld.l r29, int r30, boolean r31, int r32, int r33, java.util.Map r34, androidx.compose.runtime.t r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.d.e(androidx.compose.ui.text.e, androidx.compose.ui.q, androidx.compose.ui.text.v0, ld.l, int, boolean, int, int, java.util.Map, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014d  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(@fg.l java.lang.String r43, @fg.m androidx.compose.ui.q r44, @fg.m androidx.compose.ui.text.v0 r45, @fg.m ld.l<? super androidx.compose.ui.text.n0, kotlin.k2> r46, int r47, boolean r48, int r49, int r50, @fg.m androidx.compose.ui.graphics.k2 r51, @fg.m androidx.compose.runtime.t r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.d.f(java.lang.String, androidx.compose.ui.q, androidx.compose.ui.text.v0, ld.l, int, boolean, int, int, androidx.compose.ui.graphics.k2, androidx.compose.runtime.t, int, int):void");
    }

    private static final androidx.compose.runtime.saveable.l<Long, Long> g(androidx.compose.foundation.text.selection.l0 l0Var) {
        return androidx.compose.runtime.saveable.m.a(new m(l0Var), n.f7310b);
    }

    private static final androidx.compose.ui.q h(androidx.compose.ui.q qVar, androidx.compose.ui.text.e eVar, androidx.compose.ui.text.v0 v0Var, ld.l<? super androidx.compose.ui.text.n0, k2> lVar, int i4, boolean z4, int i5, int i6, y.b bVar, List<e.b<androidx.compose.ui.text.a0>> list, ld.l<? super List<i0.i>, k2> lVar2, androidx.compose.foundation.text.modifiers.j jVar, androidx.compose.ui.graphics.k2 k2Var) {
        if (jVar == null) {
            return qVar.w3(androidx.compose.ui.q.INSTANCE).w3(new TextAnnotatedStringElement(eVar, v0Var, bVar, lVar, i4, z4, i5, i6, list, lVar2, null, k2Var, null));
        }
        return qVar.w3(jVar.getModifier()).w3(new SelectableTextAnnotatedStringElement(eVar, v0Var, bVar, lVar, i4, z4, i5, i6, list, lVar2, jVar, k2Var, null));
    }
}
