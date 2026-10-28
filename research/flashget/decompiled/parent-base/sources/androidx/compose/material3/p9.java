package androidx.compose.material3;

import androidx.compose.foundation.layout.i;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.g;
import androidx.compose.ui.q;
import androidx.profileinstaller.o;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0099\u0001\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0015\b\u0002\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001aj\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ae\u0010\u001b\u001a\u00020\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001ag\u0010\u001f\u001a\u00020\u00032\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0005\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0013\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001c\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!\"\u0014\u0010$\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!\"\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!\"\u0014\u0010'\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010!\"\u0014\u0010)\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!\"\u0014\u0010+\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010!\"\u0014\u0010-\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/ui/q;", "modifier", "Lkotlin/Function0;", "Lkotlin/k2;", "Landroidx/compose/runtime/i;", "action", "dismissAction", "", "actionOnNewLine", "Landroidx/compose/ui/graphics/e6;", "shape", "Landroidx/compose/ui/graphics/d2;", "containerColor", "contentColor", "actionContentColor", "dismissActionContentColor", "content", "c", "(Landroidx/compose/ui/q;Lld/p;Lld/p;ZLandroidx/compose/ui/graphics/e6;JJJJLld/p;Landroidx/compose/runtime/t;II)V", "Landroidx/compose/material3/k9;", "snackbarData", "actionColor", "d", "(Landroidx/compose/material3/k9;Landroidx/compose/ui/q;ZLandroidx/compose/ui/graphics/e6;JJJJJLandroidx/compose/runtime/t;II)V", "text", "Landroidx/compose/ui/text/v0;", "actionTextStyle", "a", "(Lld/p;Lld/p;Lld/p;Landroidx/compose/ui/text/v0;JJLandroidx/compose/runtime/t;I)V", "actionTextColor", "dismissActionColor", "b", "Landroidx/compose/ui/unit/h;", "F", "ContainerMaxWidth", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "e", "SeparateButtonExtraY", "f", "SnackbarVerticalPadding", "g", "TextEndExtraSpacing", "h", "LongButtonVerticalOffset", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,437:1\n154#2:438\n154#2:514\n154#2:601\n154#2:760\n154#2:761\n154#2:762\n154#2:763\n154#2:764\n154#2:765\n154#2:766\n154#2:767\n74#3,6:439\n80#3:473\n84#3:600\n78#4,11:445\n78#4,11:480\n91#4:512\n78#4,11:521\n78#4,11:557\n91#4:589\n91#4:594\n91#4:599\n78#4,11:608\n78#4,11:642\n91#4:674\n78#4,11:682\n91#4:714\n78#4,11:722\n91#4:754\n91#4:759\n456#5,8:456\n464#5,3:470\n456#5,8:491\n464#5,3:505\n467#5,3:509\n456#5,8:532\n464#5,3:546\n456#5,8:568\n464#5,3:582\n467#5,3:586\n467#5,3:591\n467#5,3:596\n456#5,8:619\n464#5,3:633\n456#5,8:653\n464#5,3:667\n467#5,3:671\n456#5,8:693\n464#5,3:707\n467#5,3:711\n456#5,8:733\n464#5,3:747\n467#5,3:751\n467#5,3:756\n3737#6,6:464\n3737#6,6:499\n3737#6,6:540\n3737#6,6:576\n3737#6,6:627\n3737#6,6:661\n3737#6,6:701\n3737#6,6:741\n68#7,6:474\n74#7:508\n78#7:513\n68#7,6:515\n74#7:549\n78#7:595\n68#7,6:636\n74#7:670\n78#7:675\n68#7,6:676\n74#7:710\n78#7:715\n68#7,6:716\n74#7:750\n78#7:755\n86#8,7:550\n93#8:585\n97#8:590\n1116#9,6:602\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt\n*L\n240#1:438\n279#1:514\n333#1:601\n429#1:760\n430#1:761\n431#1:762\n432#1:763\n433#1:764\n434#1:765\n435#1:766\n436#1:767\n262#1:439,6\n262#1:473\n262#1:600\n262#1:445,11\n272#1:480,11\n272#1:512\n277#1:521,11\n281#1:557,11\n281#1:589\n277#1:594\n262#1:599\n310#1:608,11\n312#1:642,11\n312#1:674\n314#1:682,11\n314#1:714\n323#1:722,11\n323#1:754\n310#1:759\n262#1:456,8\n262#1:470,3\n272#1:491,8\n272#1:505,3\n272#1:509,3\n277#1:532,8\n277#1:546,3\n281#1:568,8\n281#1:582,3\n281#1:586,3\n277#1:591,3\n262#1:596,3\n310#1:619,8\n310#1:633,3\n312#1:653,8\n312#1:667,3\n312#1:671,3\n314#1:693,8\n314#1:707,3\n314#1:711,3\n323#1:733,8\n323#1:747,3\n323#1:751,3\n310#1:756,3\n262#1:464,6\n272#1:499,6\n277#1:540,6\n281#1:576,6\n310#1:627,6\n312#1:661,6\n314#1:701,6\n323#1:741,6\n272#1:474,6\n272#1:508\n272#1:513\n277#1:515,6\n277#1:549\n277#1:595\n312#1:636,6\n312#1:670\n312#1:675\n314#1:676,6\n314#1:710\n314#1:715\n323#1:716,6\n323#1:750\n323#1:755\n281#1:550,7\n281#1:585\n281#1:590\n335#1:602,6\n*E\n"})
/* loaded from: classes.dex */
public final class p9 {

    /* renamed from: d, reason: collision with root package name */
    private static final float f13382d;

    /* renamed from: g, reason: collision with root package name */
    private static final float f13385g;

    /* renamed from: a, reason: collision with root package name */
    private static final float f13379a = androidx.compose.ui.unit.h.g(600);

    /* renamed from: b, reason: collision with root package name */
    private static final float f13380b = 30;

    /* renamed from: c, reason: collision with root package name */
    private static final float f13381c = 16;

    /* renamed from: e, reason: collision with root package name */
    private static final float f13383e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final float f13384f = 6;

    /* renamed from: h, reason: collision with root package name */
    private static final float f13386h = 12;

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13387b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13388c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13389d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13390e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13391f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f13392g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13393h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.text.v0 v0Var, long j4, long j5, int i4) {
            super(2);
            this.f13387b = pVar;
            this.f13388c = pVar2;
            this.f13389d = pVar3;
            this.f13390e = v0Var;
            this.f13391f = j4;
            this.f13392g = j5;
            this.f13393h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p9.a(this.f13387b, this.f13388c, this.f13389d, this.f13390e, this.f13391f, this.f13392g, tVar, androidx.compose.runtime.g3.b(this.f13393h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n116#2,2:438\n33#2,6:440\n118#2:446\n116#2,2:447\n33#2,6:449\n118#2:455\n544#2,2:456\n33#2,6:458\n546#2:464\n1#3:465\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$OneRowSnackbar$2$1\n*L\n338#1:438,2\n338#1:440,6\n338#1:446\n340#1:447,2\n340#1:449,6\n340#1:455\n349#1:456,2\n349#1:458,6\n349#1:464\n*E\n"})
    static final class b implements androidx.compose.ui.layout.m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13394a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13395b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13396c;

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13397b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f13398c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13399d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f13400e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f13401f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.i1 f13402g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f13403h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f13404i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.i1 i1Var, int i4, androidx.compose.ui.layout.i1 i1Var2, int i5, int i6, androidx.compose.ui.layout.i1 i1Var3, int i7, int i10) {
                super(1);
                this.f13397b = i1Var;
                this.f13398c = i4;
                this.f13399d = i1Var2;
                this.f13400e = i5;
                this.f13401f = i6;
                this.f13402g = i1Var3;
                this.f13403h = i7;
                this.f13404i = i10;
            }

            public final void a(@fg.l i1.a aVar) {
                i1.a.m(aVar, this.f13397b, 0, this.f13398c, 0.0f, 4, null);
                androidx.compose.ui.layout.i1 i1Var = this.f13399d;
                if (i1Var != null) {
                    i1.a.m(aVar, i1Var, this.f13400e, this.f13401f, 0.0f, 4, null);
                }
                androidx.compose.ui.layout.i1 i1Var2 = this.f13402g;
                if (i1Var2 != null) {
                    i1.a.m(aVar, i1Var2, this.f13403h, this.f13404i, 0.0f, 4, null);
                }
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
                a(aVar);
                return kotlin.k2.f75408a;
            }
        }

        b(String str, String str2, String str3) {
            this.f13394a = str;
            this.f13395b = str2;
            this.f13396c = str3;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public final androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
            androidx.compose.ui.layout.l0 l0Var;
            androidx.compose.ui.layout.l0 l0Var2;
            int i4;
            int a5;
            int i5;
            androidx.compose.ui.layout.i1 i1Var;
            int i6;
            int q4;
            int min = Math.min(androidx.compose.ui.unit.b.p(j4), o0Var.q2(p9.f13379a));
            String str = this.f13394a;
            int size = list.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    l0Var = null;
                    break;
                }
                l0Var = list.get(i7);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var), str)) {
                    break;
                }
                i7++;
            }
            androidx.compose.ui.layout.l0 l0Var3 = l0Var;
            androidx.compose.ui.layout.i1 m02 = l0Var3 != null ? l0Var3.m0(j4) : null;
            String str2 = this.f13395b;
            int size2 = list.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    l0Var2 = null;
                    break;
                }
                l0Var2 = list.get(i10);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var2), str2)) {
                    break;
                }
                i10++;
            }
            androidx.compose.ui.layout.l0 l0Var4 = l0Var2;
            androidx.compose.ui.layout.i1 m03 = l0Var4 != null ? l0Var4.m0(j4) : null;
            int width = m02 != null ? m02.getWidth() : 0;
            int height = m02 != null ? m02.getHeight() : 0;
            int width2 = m03 != null ? m03.getWidth() : 0;
            int height2 = m03 != null ? m03.getHeight() : 0;
            int q22 = ((min - width) - width2) - (width2 == 0 ? o0Var.q2(p9.f13385g) : 0);
            int r4 = androidx.compose.ui.unit.b.r(j4);
            if (q22 >= r4) {
                r4 = q22;
            }
            String str3 = this.f13396c;
            int size3 = list.size();
            int i11 = 0;
            while (i11 < size3) {
                androidx.compose.ui.layout.l0 l0Var5 = list.get(i11);
                if (kotlin.jvm.internal.l0.g(androidx.compose.ui.layout.w.a(l0Var5), str3)) {
                    androidx.compose.ui.layout.i1 i1Var2 = m03;
                    int i12 = height2;
                    androidx.compose.ui.layout.i1 m04 = l0Var5.m0(androidx.compose.ui.unit.b.e(j4, 0, r4, 0, 0, 9, null));
                    int q5 = m04.q(androidx.compose.ui.layout.b.a());
                    if (q5 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    int q6 = m04.q(androidx.compose.ui.layout.b.b());
                    if (q6 == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("No baselines for text");
                    }
                    int i13 = min - width2;
                    int i14 = i13 - width;
                    if (q5 == q6) {
                        i5 = Math.max(o0Var.q2(c0.e1.f37200a.n()), Math.max(height, i12));
                        int a6 = r.a(m04, i5, 2);
                        a5 = (m02 == null || (q4 = m02.q(androidx.compose.ui.layout.b.a())) == Integer.MIN_VALUE) ? 0 : (q5 + a6) - q4;
                        i4 = a6;
                    } else {
                        int q23 = o0Var.q2(p9.f13380b) - q5;
                        int max = Math.max(o0Var.q2(c0.e1.f37200a.q()), m04.getHeight() + q23);
                        i4 = q23;
                        a5 = m02 != null ? r.a(m02, max, 2) : 0;
                        i5 = max;
                    }
                    if (i1Var2 != null) {
                        i1Var = i1Var2;
                        i6 = r.a(i1Var, i5, 2);
                    } else {
                        i1Var = i1Var2;
                        i6 = 0;
                    }
                    return androidx.compose.ui.layout.o0.x2(o0Var, min, i5, null, new a(m04, i4, i1Var, i13, i6, m02, i14, a5), 4, null);
                }
                i11++;
                height2 = height2;
                m03 = m03;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13406c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13407d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.v0 f13408e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13409f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f13410g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f13411h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.text.v0 v0Var, long j4, long j5, int i4) {
            super(2);
            this.f13405b = pVar;
            this.f13406c = pVar2;
            this.f13407d = pVar3;
            this.f13408e = v0Var;
            this.f13409f = j4;
            this.f13410g = j5;
            this.f13411h = i4;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p9.b(this.f13405b, this.f13406c, this.f13407d, this.f13408e, this.f13409f, this.f13410g, tVar, androidx.compose.runtime.g3.b(this.f13411h | 1));
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13413c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13414d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13415e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13416f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f13417g;

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13418b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13419c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13420d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.text.v0 f13421e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f13422f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f13423g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f13424h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.text.v0 v0Var, long j4, long j5, boolean z4) {
                super(2);
                this.f13418b = pVar;
                this.f13419c = pVar2;
                this.f13420d = pVar3;
                this.f13421e = v0Var;
                this.f13422f = j4;
                this.f13423g = j5;
                this.f13424h = z4;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 3) == 2 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(835891690, i4, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                }
                if (this.f13418b == null) {
                    tVar.P(-2104362406);
                    p9.b(this.f13419c, null, this.f13420d, this.f13421e, this.f13422f, this.f13423g, tVar, 48);
                    tVar.p0();
                } else if (this.f13424h) {
                    tVar.P(-2104362092);
                    p9.a(this.f13419c, this.f13418b, this.f13420d, this.f13421e, this.f13422f, this.f13423g, tVar, 0);
                    tVar.p0();
                } else {
                    tVar.P(-2104361812);
                    p9.b(this.f13419c, this.f13418b, this.f13420d, this.f13421e, this.f13422f, this.f13423g, tVar, 0);
                    tVar.p0();
                }
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
        d(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, long j4, long j5, boolean z4) {
            super(2);
            this.f13412b = pVar;
            this.f13413c = pVar2;
            this.f13414d = pVar3;
            this.f13415e = j4;
            this.f13416f = j5;
            this.f13417g = z4;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1829663446, i4, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
            }
            p6 p6Var = p6.f13227a;
            sb c5 = p6Var.c(tVar, 6);
            c0.e1 e1Var = c0.e1.f37200a;
            androidx.compose.runtime.f0.b(xa.f().e(tb.a(c5, e1Var.p())), androidx.compose.runtime.internal.c.b(tVar, 835891690, true, new a(this.f13412b, this.f13413c, this.f13414d, tb.a(p6Var.c(tVar, 6), e1Var.d()), this.f13415e, this.f13416f, this.f13417g)), tVar, androidx.compose.runtime.b3.f15974d | 48);
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

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13425b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13426c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13427d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f13428e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13429f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f13430g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f13431h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f13432i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f13433j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> f13434k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13435l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f13436m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(androidx.compose.ui.q qVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, boolean z4, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, long j6, long j7, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, int i4, int i5) {
            super(2);
            this.f13425b = qVar;
            this.f13426c = pVar;
            this.f13427d = pVar2;
            this.f13428e = z4;
            this.f13429f = e6Var;
            this.f13430g = j4;
            this.f13431h = j5;
            this.f13432i = j6;
            this.f13433j = j7;
            this.f13434k = pVar3;
            this.f13435l = i4;
            this.f13436m = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p9.c(this.f13425b, this.f13426c, this.f13427d, this.f13428e, this.f13429f, this.f13430g, this.f13431h, this.f13432i, this.f13433j, this.f13434k, tVar, androidx.compose.runtime.g3.b(this.f13435l | 1), this.f13436m);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k9 f13437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k9 k9Var) {
            super(2);
            this.f13437b = k9Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1266389126, i4, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
            }
            xa.c(this.f13437b.getVisuals().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131070);
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

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k9 f13438b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.q f13439c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f13440d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.e6 f13441e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13442f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f13443g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f13444h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f13445i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f13446j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f13447k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f13448l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k9 k9Var, androidx.compose.ui.q qVar, boolean z4, androidx.compose.ui.graphics.e6 e6Var, long j4, long j5, long j6, long j7, long j10, int i4, int i5) {
            super(2);
            this.f13438b = k9Var;
            this.f13439c = qVar;
            this.f13440d = z4;
            this.f13441e = e6Var;
            this.f13442f = j4;
            this.f13443g = j5;
            this.f13444h = j6;
            this.f13445i = j7;
            this.f13446j = j10;
            this.f13447k = i4;
            this.f13448l = i5;
        }

        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            p9.d(this.f13438b, this.f13439c, this.f13440d, this.f13441e, this.f13442f, this.f13443g, this.f13444h, this.f13445i, this.f13446j, tVar, androidx.compose.runtime.g3.b(this.f13447k | 1), this.f13448l);
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.runtime.t tVar, Integer num) {
            a(tVar, num.intValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,437:1\n1116#2,6:438\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$actionComposable$1\n*L\n216#1:438,6\n*E\n"})
    static final class h extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f13449b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k9 f13450c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13451d;

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k9 f13452b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k9 k9Var) {
                super(0);
                this.f13452b = k9Var;
            }

            public final void a() {
                this.f13452b.b();
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/x1;", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/layout/x1;Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.q<androidx.compose.foundation.layout.x1, androidx.compose.runtime.t, Integer, kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f13453b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f13453b = str;
            }

            @Override // ld.q
            public /* bridge */ /* synthetic */ kotlin.k2 R(androidx.compose.foundation.layout.x1 x1Var, androidx.compose.runtime.t tVar, Integer num) {
                a(x1Var, tVar, num.intValue());
                return kotlin.k2.f75408a;
            }

            @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.i
            public final void a(@fg.l androidx.compose.foundation.layout.x1 x1Var, @fg.m androidx.compose.runtime.t tVar, int i4) {
                if ((i4 & 17) == 16 && tVar.p()) {
                    tVar.d0();
                    return;
                }
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.r0(521110564, i4, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                }
                xa.c(this.f13453b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tVar, 0, 0, 131070);
                if (androidx.compose.runtime.x.b0()) {
                    androidx.compose.runtime.x.q0();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j4, k9 k9Var, String str) {
            super(2);
            this.f13449b = j4;
            this.f13450c = k9Var;
            this.f13451d = str;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1378313599, i4, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
            }
            n0 F = o0.f12901a.F(0L, this.f13449b, 0L, 0L, tVar, 24576, 13);
            tVar.P(-2057496839);
            boolean q02 = tVar.q0(this.f13450c);
            k9 k9Var = this.f13450c;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(k9Var);
                tVar.E(Q);
            }
            tVar.p0();
            q0.e((ld.a) Q, null, false, null, F, null, null, null, null, androidx.compose.runtime.internal.c.b(tVar, 521110564, true, new b(this.f13451d)), tVar, 805306368, 494);
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

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,437:1\n1116#2,6:438\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material3/SnackbarKt$Snackbar$dismissActionComposable$1\n*L\n227#1:438,6\n*E\n"})
    static final class i extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.t, Integer, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k9 f13454b;

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.a<kotlin.k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k9 f13455b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k9 k9Var) {
                super(0);
                this.f13455b = k9Var;
            }

            public final void a() {
                this.f13455b.dismiss();
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ kotlin.k2 invoke() {
                a();
                return kotlin.k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(k9 k9Var) {
            super(2);
            this.f13454b = k9Var;
        }

        @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.i
        public final void a(@fg.m androidx.compose.runtime.t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1812633777, i4, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
            }
            tVar.P(-2057496502);
            boolean q02 = tVar.q0(this.f13454b);
            k9 k9Var = this.f13454b;
            Object Q = tVar.Q();
            if (q02 || Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new a(k9Var);
                tVar.E(Q);
            }
            tVar.p0();
            m3.f12537a.getClass();
            u5.e((ld.a) Q, null, false, null, null, m3.f12538b, tVar, o.c.f32821k, 30);
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

    static {
        float f4 = 8;
        f13382d = f4;
        f13385g = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void a(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.text.v0 v0Var, long j4, long j5, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-1332496681);
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
            i5 |= o4.q0(v0Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.g(j4) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.g(j5) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-1332496681, i5, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:260)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q o5 = androidx.compose.foundation.layout.j1.o(androidx.compose.foundation.layout.c2.h(androidx.compose.foundation.layout.c2.D(companion, 0.0f, f13379a, 1, null), 0.0f, 1, null), f13381c, 0.0f, 0.0f, f13383e, 6, null);
            o4.P(-483455358);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f5073a;
            i.m r4 = iVar.r();
            c.Companion companion2 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a5 = androidx.compose.material3.d.a(companion2, r4, o4, 0, -1323940314);
            int j6 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion3 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a6 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o5);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a6);
            } else {
                o4.C();
            }
            ld.p a7 = androidx.compose.animation.p.a(companion3, o4, a5, o4, B);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                androidx.compose.animation.d.a(j6, o4, j6, a7);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.v vVar = androidx.compose.foundation.layout.v.f5347a;
            androidx.compose.ui.q i6 = androidx.compose.foundation.layout.c.i(companion, f13380b, f13386h);
            float f4 = f13382d;
            androidx.compose.ui.q o6 = androidx.compose.foundation.layout.j1.o(i6, 0.0f, 0.0f, f4, 0.0f, 11, null);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a8 = androidx.compose.animation.a0.a(companion2, false, o4, 0, -1323940314);
            int j7 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B2 = o4.B();
            ld.a<androidx.compose.ui.node.g> a10 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(o6);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a10);
            } else {
                o4.C();
            }
            ld.p a11 = androidx.compose.animation.p.a(companion3, o4, a8, o4, B2);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, o4, j7, a11);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar4 = androidx.compose.foundation.layout.p.f5235a;
            pVar.invoke(o4, Integer.valueOf(i5 & 14));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            androidx.compose.ui.q o7 = androidx.compose.foundation.layout.j1.o(vVar.e(companion, companion2.s()), 0.0f, 0.0f, pVar3 == null ? f4 : androidx.compose.ui.unit.h.g(0), 0.0f, 11, null);
            o4.P(733328855);
            androidx.compose.ui.layout.m0 a12 = androidx.compose.animation.a0.a(companion2, false, o4, 0, -1323940314);
            int j10 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B3 = o4.B();
            ld.a<androidx.compose.ui.node.g> a13 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(o7);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a13);
            } else {
                o4.C();
            }
            ld.p a14 = androidx.compose.animation.p.a(companion3, o4, a12, o4, B3);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j10))) {
                androidx.compose.animation.d.a(j10, o4, j10, a14);
            }
            androidx.compose.animation.e.a(0, g6, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            o4.P(693286680);
            androidx.compose.ui.layout.m0 d5 = androidx.compose.foundation.layout.w1.d(iVar.p(), companion2.w(), o4, 0);
            o4.P(-1323940314);
            int j11 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B4 = o4.B();
            ld.a<androidx.compose.ui.node.g> a15 = companion3.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g7 = androidx.compose.ui.layout.a0.g(companion);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a15);
            } else {
                o4.C();
            }
            ld.p a16 = androidx.compose.animation.p.a(companion3, o4, d5, o4, B4);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j11))) {
                androidx.compose.animation.d.a(j11, o4, j11, a16);
            }
            androidx.compose.animation.e.a(0, g7, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.y1 y1Var = androidx.compose.foundation.layout.y1.f5410a;
            androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(j4)), xa.f().e(v0Var)}, pVar2, o4, i5 & 112);
            o4.P(302367084);
            if (pVar3 != null) {
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j5)), pVar3, o4, ((i5 >> 3) & 112) | androidx.compose.runtime.b3.f15974d);
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
            t4.a(new a(pVar, pVar2, pVar3, v0Var, j4, j5, i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    public static final void b(ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar2, ld.p<? super androidx.compose.runtime.t, ? super Integer, kotlin.k2> pVar3, androidx.compose.ui.text.v0 v0Var, long j4, long j5, androidx.compose.runtime.t tVar, int i4) {
        int i5;
        androidx.compose.runtime.t o4 = tVar.o(-903235475);
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
            i5 |= o4.q0(v0Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= o4.g(j4) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= o4.g(j5) ? 131072 : 65536;
        }
        if ((74899 & i5) == 74898 && o4.p()) {
            o4.d0();
        } else {
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.r0(-903235475, i5, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:305)");
            }
            q.Companion companion = androidx.compose.ui.q.INSTANCE;
            androidx.compose.ui.q o5 = androidx.compose.foundation.layout.j1.o(companion, f13381c, 0.0f, pVar3 == null ? f13382d : androidx.compose.ui.unit.h.g(0), 0.0f, 10, null);
            o4.P(44739392);
            Object Q = o4.Q();
            if (Q == androidx.compose.runtime.t.INSTANCE.a()) {
                Q = new b("action", "dismissAction", "text");
                o4.E(Q);
            }
            androidx.compose.ui.layout.m0 m0Var = (androidx.compose.ui.layout.m0) Q;
            o4.p0();
            o4.P(-1323940314);
            int j6 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B = o4.B();
            g.Companion companion2 = androidx.compose.ui.node.g.INSTANCE;
            ld.a<androidx.compose.ui.node.g> a5 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g4 = androidx.compose.ui.layout.a0.g(o5);
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
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j6))) {
                androidx.compose.animation.d.a(j6, o4, j6, a6);
            }
            androidx.compose.animation.e.a(0, g4, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.ui.q m4 = androidx.compose.foundation.layout.j1.m(androidx.compose.ui.layout.w.b(companion, "text"), 0.0f, f13384f, 1, null);
            o4.P(733328855);
            c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.m0 a7 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
            int j7 = androidx.compose.runtime.p.j(o4, 0);
            androidx.compose.runtime.g0 B2 = o4.B();
            ld.a<androidx.compose.ui.node.g> a8 = companion2.a();
            ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g5 = androidx.compose.ui.layout.a0.g(m4);
            if (o4.s() == null) {
                androidx.compose.runtime.p.n();
            }
            o4.W();
            if (o4.getInserting()) {
                o4.F(a8);
            } else {
                o4.C();
            }
            ld.p a10 = androidx.compose.animation.p.a(companion2, o4, a7, o4, B2);
            if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j7))) {
                androidx.compose.animation.d.a(j7, o4, j7, a10);
            }
            androidx.compose.animation.e.a(0, g5, androidx.compose.runtime.v3.a(o4), o4, 2058660585);
            androidx.compose.foundation.layout.p pVar4 = androidx.compose.foundation.layout.p.f5235a;
            pVar.invoke(o4, Integer.valueOf(i5 & 14));
            o4.p0();
            o4.H();
            o4.p0();
            o4.p0();
            o4.P(-167734260);
            if (pVar2 != null) {
                androidx.compose.ui.q b5 = androidx.compose.ui.layout.w.b(companion, "action");
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a11 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
                int j10 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B3 = o4.B();
                ld.a<androidx.compose.ui.node.g> a12 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g6 = androidx.compose.ui.layout.a0.g(b5);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a12);
                } else {
                    o4.C();
                }
                ld.p a13 = androidx.compose.animation.p.a(companion2, o4, a11, o4, B3);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j10))) {
                    androidx.compose.animation.d.a(j10, o4, j10, a13);
                }
                g6.R(androidx.compose.runtime.v3.a(o4), o4, 0);
                o4.P(2058660585);
                androidx.compose.runtime.f0.c(new androidx.compose.runtime.b3[]{p3.a().e(androidx.compose.ui.graphics.d2.n(j4)), xa.f().e(v0Var)}, pVar2, o4, i5 & 112);
                o4.p0();
                o4.H();
                o4.p0();
                o4.p0();
            }
            o4.p0();
            o4.P(44738899);
            if (pVar3 != null) {
                androidx.compose.ui.q b6 = androidx.compose.ui.layout.w.b(companion, "dismissAction");
                o4.P(733328855);
                androidx.compose.ui.layout.m0 a14 = androidx.compose.animation.a0.a(companion3, false, o4, 0, -1323940314);
                int j11 = androidx.compose.runtime.p.j(o4, 0);
                androidx.compose.runtime.g0 B4 = o4.B();
                ld.a<androidx.compose.ui.node.g> a15 = companion2.a();
                ld.q<androidx.compose.runtime.v3<androidx.compose.ui.node.g>, androidx.compose.runtime.t, Integer, kotlin.k2> g7 = androidx.compose.ui.layout.a0.g(b6);
                if (o4.s() == null) {
                    androidx.compose.runtime.p.n();
                }
                o4.W();
                if (o4.getInserting()) {
                    o4.F(a15);
                } else {
                    o4.C();
                }
                ld.p a16 = androidx.compose.animation.p.a(companion2, o4, a14, o4, B4);
                if (o4.getInserting() || !kotlin.jvm.internal.l0.g(o4.Q(), Integer.valueOf(j11))) {
                    androidx.compose.animation.d.a(j11, o4, j11, a16);
                }
                g7.R(androidx.compose.runtime.v3.a(o4), o4, 0);
                o4.P(2058660585);
                androidx.compose.runtime.f0.b(p3.a().e(androidx.compose.ui.graphics.d2.n(j5)), pVar3, o4, ((i5 >> 3) & 112) | androidx.compose.runtime.b3.f15974d);
                o4.p0();
                o4.H();
                o4.p0();
                o4.p0();
            }
            o4.p0();
            o4.p0();
            o4.H();
            o4.p0();
            if (androidx.compose.runtime.x.b0()) {
                androidx.compose.runtime.x.q0();
            }
        }
        androidx.compose.runtime.t3 t4 = o4.t();
        if (t4 != null) {
            t4.a(new c(pVar, pVar2, pVar3, v0Var, j4, j5, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191  */
    @androidx.compose.runtime.j(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@fg.m androidx.compose.ui.q r25, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r26, @fg.m ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r27, boolean r28, @fg.m androidx.compose.ui.graphics.e6 r29, long r30, long r32, long r34, long r36, @fg.l ld.p<? super androidx.compose.runtime.t, ? super java.lang.Integer, kotlin.k2> r38, @fg.m androidx.compose.runtime.t r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p9.c(androidx.compose.ui.q, ld.p, ld.p, boolean, androidx.compose.ui.graphics.e6, long, long, long, long, ld.p, androidx.compose.runtime.t, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    @androidx.compose.runtime.n(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@fg.l androidx.compose.material3.k9 r39, @fg.m androidx.compose.ui.q r40, boolean r41, @fg.m androidx.compose.ui.graphics.e6 r42, long r43, long r45, long r47, long r49, long r51, @fg.m androidx.compose.runtime.t r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.p9.d(androidx.compose.material3.k9, androidx.compose.ui.q, boolean, androidx.compose.ui.graphics.e6, long, long, long, long, long, androidx.compose.runtime.t, int, int):void");
    }
}
