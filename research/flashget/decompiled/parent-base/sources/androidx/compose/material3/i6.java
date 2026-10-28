package androidx.compose.material3;

import androidx.compose.material3.j6;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u001a©\u0001\u0010\u000f\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001av\u0010\u0016\u001a\u00020\u00012\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a`\u0010&\u001a\u00020%*\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a`\u0010*\u001a\u00020%*\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010)\u001a\u00020(2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001am\u00101\u001a\u000200*\u00020\u00182\u0006\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010/\u001a\u00020.2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b1\u00102\u001a5\u00108\u001a\u00020\u00012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00109\" \u0010?\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<\" \u0010B\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010:\u0012\u0004\bA\u0010>\u001a\u0004\b@\u0010<\" \u0010E\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b8\u0010:\u0012\u0004\bD\u0010>\u001a\u0004\bC\u0010<\" \u0010I\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bF\u0010:\u0012\u0004\bH\u0010>\u001a\u0004\bG\u0010<\" \u0010M\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bJ\u0010:\u0012\u0004\bL\u0010>\u001a\u0004\bK\u0010<\" \u0010Q\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010:\u0012\u0004\bP\u0010>\u001a\u0004\bO\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "headlineContent", "Landroidx/compose/ui/q;", "modifier", "overlineContent", "supportingContent", "leadingContent", "trailingContent", "Landroidx/compose/material3/g6;", "colors", "Landroidx/compose/ui/unit/h;", "tonalElevation", "shadowElevation", "a", "(Lld/p;Landroidx/compose/ui/q;Lld/p;Lld/p;Lld/p;Lld/p;Landroidx/compose/material3/g6;FFLandroidx/compose/runtime/t;II)V", "leading", "trailing", "headline", "overline", "supporting", "b", "(Lld/p;Lld/p;Lld/p;Lld/p;Lld/p;Landroidx/compose/runtime/t;I)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/i1;", "leadingPlaceable", "trailingPlaceable", "headlinePlaceable", "overlinePlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/foundation/layout/l1;", "paddingValues", "Landroidx/compose/ui/unit/b;", "constraints", "", "j", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/unit/w;Landroidx/compose/foundation/layout/l1;J)I", "Landroidx/compose/material3/j6;", "listItemType", "i", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;ILandroidx/compose/foundation/layout/l1;J)I", "width", "height", "", "isThreeLine", "Landroidx/compose/ui/layout/n0;", "w", "(Landroidx/compose/ui/layout/o0;IILandroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;Landroidx/compose/ui/layout/i1;ZLandroidx/compose/ui/unit/w;Landroidx/compose/foundation/layout/l1;)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/graphics/d2;", "color", "Lc0/r1;", "textToken", "content", "c", "(JLc0/r1;Lld/p;Landroidx/compose/runtime/t;I)V", "F", "s", "()F", "t", "()V", "ListItemVerticalPadding", "q", "r", "ListItemThreeLineVerticalPadding", "o", "p", "ListItemStartPadding", "d", "m", "n", "ListItemEndPadding", "e", "k", "l", "LeadingContentEndPadding", "f", "u", "v", "TrailingContentStartPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,581:1\n74#2:582\n1116#3,6:583\n1116#3,6:597\n166#4,7:589\n78#4,11:603\n91#4:634\n174#4:635\n36#5:596\n456#5,8:614\n464#5,6:628\n3737#6,6:622\n51#7:636\n51#7:637\n154#8:638\n154#8:639\n154#8:640\n154#8:641\n154#8:642\n154#8:643\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt\n*L\n169#1:582\n178#1:583,6\n170#1:597,6\n170#1:589,7\n170#1:603,11\n170#1:634\n170#1:635\n170#1:596\n170#1:614,8\n170#1:628,6\n170#1:622,6\n289#1:636\n320#1:637\n561#1:638\n564#1:639\n567#1:640\n570#1:641\n575#1:642\n580#1:643\n*E\n"})
/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f11472a = androidx.compose.ui.unit.h.g(8);

    /* renamed from: b, reason: collision with root package name */
    private static final float f11473b = 12;

    /* renamed from: c, reason: collision with root package name */
    private static final float f11474c;

    /* renamed from: d, reason: collision with root package name */
    private static final float f11475d;

    /* renamed from: e, reason: collision with root package name */
    private static final float f11476e;

    /* renamed from: f, reason: collision with root package name */
    private static final float f11477f;

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/z;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/semantics/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.semantics.z, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f11478b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.semantics.z zVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.semantics.z zVar) {
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11479b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11480c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11481d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11482e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11483f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5) {
            super(2);
            this.f11479b = pVar;
            this.f11480c = pVar2;
            this.f11481d = pVar3;
            this.f11482e = pVar4;
            this.f11483f = pVar5;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1502590376, i4, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:150)");
            }
            i6.b(this.f11479b, this.f11480c, this.f11481d, this.f11482e, this.f11483f, tVar, 384);
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

    /* compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f11485c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11486d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11487e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11488f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11489g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ g6 f11490h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f11491i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f11492j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11493k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11494l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, g6 g6Var, float f4, float f5, int i4, int i5) {
            super(2);
            this.f11484b = pVar;
            this.f11485c = qVar;
            this.f11486d = pVar2;
            this.f11487e = pVar3;
            this.f11488f = pVar4;
            this.f11489g = pVar5;
            this.f11490h = g6Var;
            this.f11491i = f4;
            this.f11492j = f5;
            this.f11493k = i4;
            this.f11494l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i6.a(this.f11484b, this.f11485c, this.f11486d, this.f11487e, this.f11488f, this.f11489g, this.f11490h, this.f11491i, this.f11492j, tVar, androidx.compose.runtime.g3.b(this.f11493k | 1), this.f11494l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g6 f11495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(g6 g6Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11495b = g6Var;
            this.f11496c = pVar;
        }

        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-403249643, i4, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:94)");
            }
            i6.c(this.f11495b.k(true), c0.f0.f37245a.u(), this.f11496c, tVar, 48);
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

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$decoratedLeadingContent$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,581:1\n68#2,6:582\n74#2:616\n78#2:621\n78#3,11:588\n91#3:620\n456#4,8:599\n464#4,3:613\n467#4,3:617\n3737#5,6:607\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$decoratedLeadingContent$1$1\n*L\n121#1:582,6\n121#1:616\n121#1:621\n121#1:588,11\n121#1:620\n121#1:599,8\n121#1:613,3\n121#1:617,3\n121#1:607,6\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g6 f11497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(g6 g6Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11497b = g6Var;
            this.f11498c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1400509200, i4, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:120)");
            }
            androidx.compose.ui.q o4 = androidx.compose.foundation.layout.j1.o(androidx.compose.ui.q.INSTANCE, 0.0f, 0.0f, i6.k(), 0.0f, 11, null);
            g6 g6Var = this.f11497b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11498c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o4);
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
            androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(g6Var.l(true))), pVar, tVar, androidx.compose.runtime.b3.f15974d);
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

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g6 f11499b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11500c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(g6 g6Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11499b = g6Var;
            this.f11500c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-764441232, i4, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:111)");
            }
            i6.c(this.f11499b.m(), c0.f0.f37245a.K(), this.f11500c, tVar, 48);
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

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g6 f11501b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(g6 g6Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11501b = g6Var;
            this.f11502c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1020860251, i4, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:102)");
            }
            i6.c(this.f11501b.n(), c0.f0.f37245a.R(), this.f11502c, tVar, 48);
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

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$decoratedTrailingContent$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,581:1\n68#2,6:582\n74#2:616\n78#2:621\n78#3,11:588\n91#3:620\n456#4,8:599\n464#4,3:613\n467#4,3:617\n3737#5,6:607\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItem$decoratedTrailingContent$1$1\n*L\n131#1:582,6\n131#1:616\n131#1:621\n131#1:588,11\n131#1:620\n131#1:599,8\n131#1:613,3\n131#1:617,3\n131#1:607,6\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g6 f11503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(g6 g6Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar) {
            super(2);
            this.f11503b = g6Var;
            this.f11504c = pVar;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1512306332, i4, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:130)");
            }
            androidx.compose.ui.q o4 = androidx.compose.foundation.layout.j1.o(androidx.compose.ui.q.INSTANCE, i6.u(), 0.0f, 0.0f, 0.0f, 14, null);
            g6 g6Var = this.f11503b;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> pVar = this.f11504c;
            tVar.P(733328855);
            androidx.compose.ui.layout.m0 a5 = androidx.compose.animation.a0.a(androidx.compose.ui.c.INSTANCE, false, tVar, 0, -1323940314);
            int j4 = androidx.compose.runtime.p.j(tVar, 0);
            androidx.compose.runtime.g0 B = tVar.B();
            g.Companion companion = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o4);
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
            i6.c(g6Var.o(true), c0.f0.f37245a.W(), pVar, tVar, 48);
            if (t.a(tVar)) {
                androidx.compose.runtime.x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItemLayout$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,581:1\n51#2:582\n92#2:583\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemKt$ListItemLayout$1$1\n*L\n185#1:582\n186#1:583\n*E\n"})
    static final class i implements androidx.compose.ui.layout.s0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.w f11505a;

        i(androidx.compose.ui.unit.w wVar) {
            this.f11505a = wVar;
        }

        @Override // androidx.compose.ui.layout.s0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends List<? extends androidx.compose.ui.layout.l0>> list, long j4) {
            List<? extends androidx.compose.ui.layout.l0> list2 = list.get(0);
            List<? extends androidx.compose.ui.layout.l0> list3 = list.get(1);
            List<? extends androidx.compose.ui.layout.l0> list4 = list.get(2);
            List<? extends androidx.compose.ui.layout.l0> list5 = list.get(3);
            List<? extends androidx.compose.ui.layout.l0> list6 = list.get(4);
            long i4 = androidx.compose.ui.unit.c.i(androidx.compose.ui.unit.b.e(j4, 0, 0, 0, 0, 10, null), -o0Var.q2(androidx.compose.ui.unit.h.g(i6.m() + i6.o())), -o0Var.q2(i6.s() * 2));
            androidx.compose.ui.layout.l0 l0Var = (androidx.compose.ui.layout.l0) kotlin.collections.w.G2(list5);
            androidx.compose.ui.layout.i1 m02 = l0Var != null ? l0Var.m0(i4) : null;
            int o4 = sa.o(m02);
            androidx.compose.ui.layout.l0 l0Var2 = (androidx.compose.ui.layout.l0) kotlin.collections.w.G2(list6);
            androidx.compose.ui.layout.i1 m03 = l0Var2 != null ? l0Var2.m0(androidx.compose.ui.unit.c.j(i4, -o4, 0, 2, null)) : null;
            int o5 = sa.o(m03) + o4;
            androidx.compose.ui.layout.l0 l0Var3 = (androidx.compose.ui.layout.l0) kotlin.collections.w.G2(list2);
            androidx.compose.ui.layout.i1 m04 = l0Var3 != null ? l0Var3.m0(androidx.compose.ui.unit.c.j(i4, -o5, 0, 2, null)) : null;
            int n4 = sa.n(m04);
            androidx.compose.ui.layout.l0 l0Var4 = (androidx.compose.ui.layout.l0) kotlin.collections.w.G2(list4);
            androidx.compose.ui.layout.i1 m05 = l0Var4 != null ? l0Var4.m0(androidx.compose.ui.unit.c.i(i4, -o5, -n4)) : null;
            int n5 = sa.n(m05) + n4;
            boolean z4 = (m05 == null || m05.q(androidx.compose.ui.layout.b.a()) == m05.q(androidx.compose.ui.layout.b.b())) ? false : true;
            androidx.compose.ui.layout.l0 l0Var5 = (androidx.compose.ui.layout.l0) kotlin.collections.w.G2(list3);
            androidx.compose.ui.layout.i1 m06 = l0Var5 != null ? l0Var5.m0(androidx.compose.ui.unit.c.i(i4, -o5, -n5)) : null;
            j6.Companion companion = j6.INSTANCE;
            int a5 = companion.a(m06 != null, m05 != null, z4);
            companion.getClass();
            boolean i5 = j6.i(a5, j6.f11908f);
            androidx.compose.foundation.layout.l1 d5 = androidx.compose.foundation.layout.j1.d(i6.o(), i5 ? i6.q() : i6.s(), i6.m(), i5 ? i6.q() : i6.s());
            androidx.compose.ui.layout.i1 i1Var = m02;
            androidx.compose.ui.layout.i1 i1Var2 = m03;
            androidx.compose.ui.layout.i1 i1Var3 = m04;
            androidx.compose.ui.layout.i1 i1Var4 = m06;
            androidx.compose.ui.layout.i1 i1Var5 = m05;
            return i6.w(o0Var, i6.j(o0Var, i1Var, i1Var2, i1Var3, i1Var4, i1Var5, this.f11505a, d5, j4), i6.i(o0Var, i1Var, i1Var2, i1Var3, i1Var4, i1Var5, a5, d5, j4), m02, m03, m04, m06, m05, i5, this.f11505a, d5);
        }
    }

    /* compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11506b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11507c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11508d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11509e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11510f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f11511g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, int i4) {
            super(2);
            this.f11506b = pVar;
            this.f11507c = pVar2;
            this.f11508d = pVar3;
            this.f11509e = pVar4;
            this.f11510f = pVar5;
            this.f11511g = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i6.b(this.f11506b, this.f11507c, this.f11508d, this.f11509e, this.f11510f, tVar, androidx.compose.runtime.g3.b(this.f11511g | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class k extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f11512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0.r1 f11513c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f11514d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11515e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(long j4, c0.r1 r1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, int i4) {
            super(2);
            this.f11512b = j4;
            this.f11513c = r1Var;
            this.f11514d = pVar;
            this.f11515e = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            i6.c(this.f11512b, this.f11513c, this.f11514d, tVar, androidx.compose.runtime.g3.b(this.f11515e | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f11516b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.l1 f11517c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.unit.w f11518d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11519e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11520f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f11521g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11522h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11523i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f11524j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f11525k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f11526l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(androidx.compose.ui.layout.o0 o0Var, androidx.compose.foundation.layout.l1 l1Var, androidx.compose.ui.unit.w wVar, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, boolean z4, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, int i4, int i5) {
            super(1);
            this.f11516b = o0Var;
            this.f11517c = l1Var;
            this.f11518d = wVar;
            this.f11519e = i1Var;
            this.f11520f = i1Var2;
            this.f11521g = z4;
            this.f11522h = i1Var3;
            this.f11523i = i1Var4;
            this.f11524j = i1Var5;
            this.f11525k = i4;
            this.f11526l = i5;
        }

        public final void a(@fg.l i1.a aVar) {
            int q22 = this.f11516b.q2(androidx.compose.foundation.layout.j1.i(this.f11517c, this.f11518d));
            int q23 = this.f11516b.q2(androidx.compose.foundation.layout.j1.h(this.f11517c, this.f11518d));
            int q24 = this.f11516b.q2(this.f11517c.getTop());
            androidx.compose.ui.layout.i1 i1Var = this.f11519e;
            if (i1Var != null) {
                i1.a.m(aVar, i1Var, q22, this.f11521g ? q24 : androidx.compose.ui.c.INSTANCE.q().a(i1Var.getHeight(), this.f11525k), 0.0f, 4, null);
            }
            androidx.compose.ui.layout.i1 i1Var2 = this.f11520f;
            if (i1Var2 != null) {
                i1.a.m(aVar, i1Var2, (this.f11526l - q23) - i1Var2.getWidth(), this.f11521g ? q24 : androidx.compose.ui.c.INSTANCE.q().a(i1Var2.getHeight(), this.f11525k), 0.0f, 4, null);
            }
            int o4 = q22 + sa.o(this.f11519e);
            if (!this.f11521g) {
                q24 = androidx.compose.ui.c.INSTANCE.q().a(sa.n(this.f11524j) + sa.n(this.f11523i) + sa.n(this.f11522h), this.f11525k);
            }
            androidx.compose.ui.layout.i1 i1Var3 = this.f11523i;
            if (i1Var3 != null) {
                i1.a.m(aVar, i1Var3, o4, q24, 0.0f, 4, null);
            }
            int n4 = sa.n(this.f11523i) + q24;
            androidx.compose.ui.layout.i1 i1Var4 = this.f11522h;
            if (i1Var4 != null) {
                i1.a.m(aVar, i1Var4, o4, n4, 0.0f, 4, null);
            }
            int n5 = sa.n(this.f11522h) + n4;
            androidx.compose.ui.layout.i1 i1Var5 = this.f11524j;
            if (i1Var5 != null) {
                i1.a.m(aVar, i1Var5, o4, n5, 0.0f, 4, null);
            }
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    static {
        float f4 = 16;
        f11474c = f4;
        f11475d = f4;
        f11476e = f4;
        f11477f = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.ui.q r39, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r40, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r41, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r42, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r43, @fg.m androidx.compose.material3.g6 r44, float r45, float r46, @fg.m androidx.compose.runtime.t r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.i6.a(ld.p, androidx.compose.ui.q, ld.p, ld.p, ld.p, ld.p, androidx.compose.material3.g6, float, float, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.i
    public static final void b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar4, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar5, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar6;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar7;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar8;
        ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar9;
        androidx.compose.runtime.t o4 = tVar.o(2052297037);
        if ((i4 & 6) == 0) {
            i5 = (o4.S(pVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.S(pVar2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(pVar3) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= o4.S(pVar4) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.S(pVar5) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(2052297037, i5, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:167)");
            }
            androidx.compose.ui.unit.w wVar = (androidx.compose.ui.unit.w) o4.x(androidx.compose.ui.platform.h1.p());
            if (pVar4 == null) {
                g3.f10844a.getClass();
                pVar6 = g3.f10845b;
            } else {
                pVar6 = pVar4;
            }
            if (pVar5 == null) {
                g3.f10844a.getClass();
                pVar7 = g3.f10846c;
            } else {
                pVar7 = pVar5;
            }
            if (pVar == null) {
                g3.f10844a.getClass();
                pVar8 = g3.f10847d;
            } else {
                pVar8 = pVar;
            }
            if (pVar2 == null) {
                g3.f10844a.getClass();
                pVar9 = g3.f10848e;
            } else {
                pVar9 = pVar2;
            }
            List O = kotlin.collections.w.O(pVar3, pVar6, pVar7, pVar8, pVar9);
            o4.P(1361340338);
            boolean q02 = o4.q0(wVar);
            Object Q = o4.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new i(wVar);
                o4.E(Q);
            }
            androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) Q;
            o4.p0();
            o4.P(1399185516);
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> e4 = androidx.compose.ui.layout.a0.e(O);
            o4.P(1157296644);
            boolean q03 = o4.q0(s0Var);
            Object Q2 = o4.Q();
            if (q03 || Q2 == androidx.compose.runtime.t.INSTANCE.a()) {
                Q2 = androidx.compose.ui.layout.t0.a(s0Var);
                o4.E(Q2);
            }
            o4.p0();
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q2;
            o4.P(-1323940314);
            int j4 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(companion);
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
            if (androidx.compose.foundation.x.a(0, e4, o4)) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new j(pVar, pVar2, pVar3, pVar4, pVar5, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[0[0]]")
    @androidx.compose.runtime.i
    public static final void c(long j4, c0.r1 r1Var, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(1133967795);
        if ((i4 & 6) == 0) {
            i5 = (o4.g(j4) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= o4.q0(r1Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= o4.S(pVar) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(1133967795, i5, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:518)");
            }
            w7.a(j4, tb.a(p6.f13227a.c(o4, 6), r1Var), pVar, o4, i5 & 910);
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new k(j4, r1Var, pVar, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, int i4, androidx.compose.foundation.layout.l1 l1Var, long j4) {
        float X;
        j6.Companion companion = j6.INSTANCE;
        companion.getClass();
        if (j6.i(i4, j6.f11906d)) {
            X = c0.f0.f37245a.I();
        } else {
            companion.getClass();
            X = j6.i(i4, j6.f11907e) ? c0.f0.f37245a.X() : c0.f0.f37245a.S();
        }
        int max = Math.max(androidx.compose.ui.unit.b.q(j4), o0Var.q2(X));
        float g4 = androidx.compose.ui.unit.h.g(l1Var.getBottom() + l1Var.getTop());
        int max2 = Math.max(max, Math.max(sa.n(i1Var), Math.max(sa.n(i1Var5) + sa.n(i1Var4) + sa.n(i1Var3), sa.n(i1Var2))) + o0Var.q2(g4));
        int o4 = androidx.compose.ui.unit.b.o(j4);
        return max2 > o4 ? o4 : max2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(androidx.compose.ui.layout.o0 o0Var, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, androidx.compose.ui.unit.w wVar, androidx.compose.foundation.layout.l1 l1Var, long j4) {
        if (androidx.compose.ui.unit.b.j(j4)) {
            return androidx.compose.ui.unit.b.p(j4);
        }
        int q22 = o0Var.q2(androidx.compose.ui.unit.h.g(l1Var.c(wVar) + l1Var.b(wVar)));
        return sa.o(i1Var2) + sa.o(i1Var) + q22 + Math.max(sa.o(i1Var3), Math.max(sa.o(i1Var4), sa.o(i1Var5)));
    }

    public static final float k() {
        return f11476e;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void l() {
    }

    public static final float m() {
        return f11475d;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void n() {
    }

    public static final float o() {
        return f11474c;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void p() {
    }

    public static final float q() {
        return f11473b;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void r() {
    }

    public static final float s() {
        return f11472a;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void t() {
    }

    public static final float u() {
        return f11477f;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.n0 w(androidx.compose.ui.layout.o0 o0Var, int i4, int i5, androidx.compose.ui.layout.i1 i1Var, androidx.compose.ui.layout.i1 i1Var2, androidx.compose.ui.layout.i1 i1Var3, androidx.compose.ui.layout.i1 i1Var4, androidx.compose.ui.layout.i1 i1Var5, boolean z4, androidx.compose.ui.unit.w wVar, androidx.compose.foundation.layout.l1 l1Var) {
        return androidx.compose.ui.layout.o0.x2(o0Var, i4, i5, null, new l(o0Var, l1Var, wVar, i1Var, i1Var2, z4, i1Var3, i1Var4, i1Var5, i5, i4), 4, null);
    }
}
