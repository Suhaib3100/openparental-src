package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a&\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\n\u001a*\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\n\u001a>\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001e\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u001e\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0004\u001a&\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\n\u001a\u001e\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\r\u001a*\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\n\u001a*\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\n\u001a>\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0017\u001a\u001d\u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010\u0004\u001a\u001d\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b#\u0010\u0004\u001a\u001d\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010\u0004\u001a'\u0010)\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*\u001a'\u0010,\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010&\u001a\u00020+2\b\b\u0002\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010-\u001a'\u0010/\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010&\u001a\u00020.2\b\b\u0002\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b/\u00100\u001a*\u00101\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\n\"\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103\"\u0014\u00106\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103\"\u0014\u00107\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103\"\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:\"\u0014\u0010<\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010:\"\u0014\u0010>\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010:\"\u0014\u0010?\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010:\"\u0014\u0010A\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010:\"\u0014\u0010B\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/h;", "width", "B", "(Landroidx/compose/ui/q;F)Landroidx/compose/ui/q;", "height", "i", "size", "w", "y", "(Landroidx/compose/ui/q;FF)Landroidx/compose/ui/q;", "Landroidx/compose/ui/unit/l;", "x", "(Landroidx/compose/ui/q;J)Landroidx/compose/ui/q;", "min", "max", "C", "j", "minWidth", "minHeight", "maxWidth", "maxHeight", "z", "(Landroidx/compose/ui/q;FFFF)Landroidx/compose/ui/q;", "t", "l", "o", "q", "p", "u", "m", "r", "", "fraction", "g", "c", "e", "Landroidx/compose/ui/c$b;", "align", "", "unbounded", "I", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c$b;Z)Landroidx/compose/ui/q;", "Landroidx/compose/ui/c$c;", "E", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c$c;Z)Landroidx/compose/ui/q;", "Landroidx/compose/ui/c;", "G", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c;Z)Landroidx/compose/ui/q;", "a", "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "d", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1112:1\n135#2:1113\n135#2:1114\n135#2:1115\n135#2:1116\n135#2:1117\n135#2:1118\n135#2:1119\n135#2:1120\n135#2:1121\n135#2:1122\n135#2:1123\n135#2:1124\n135#2:1125\n135#2:1126\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1113\n85#1:1114\n111#1:1115\n138#1:1116\n176#1:1117\n199#1:1118\n226#1:1119\n257#1:1120\n285#1:1121\n315#1:1122\n342#1:1123\n381#1:1124\n405#1:1125\n434#1:1126\n*E\n"})
/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final FillElement f4879a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final FillElement f4880b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final FillElement f4881c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final WrapContentElement f4882d;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final WrapContentElement f4883e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final WrapContentElement f4884f;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final WrapContentElement f4885g;

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final WrapContentElement f4886h;

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final WrapContentElement f4887i;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n86#2,3:171\n*E\n"})
    public static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4888b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f4) {
            super(1);
            this.f4888b = f4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("height");
            a2Var.e(androidx.compose.ui.unit.h.d(this.f4888b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n200#2,4:171\n*E\n"})
    public static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4889b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4890c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f4, float f5) {
            super(1);
            this.f4889b = f4;
            this.f4890c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("heightIn");
            androidx.compose.foundation.s1.a(this.f4889b, a2Var.getProperties(), "min", a2Var).c("max", androidx.compose.ui.unit.h.d(this.f4890c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n286#2,3:171\n*E\n"})
    public static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f4) {
            super(1);
            this.f4891b = f4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("requiredHeight");
            a2Var.e(androidx.compose.ui.unit.h.d(this.f4891b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n406#2,4:171\n*E\n"})
    public static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4892b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f4, float f5) {
            super(1);
            this.f4892b = f4;
            this.f4893c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("requiredHeightIn");
            androidx.compose.foundation.s1.a(this.f4892b, a2Var.getProperties(), "min", a2Var).c("max", androidx.compose.ui.unit.h.d(this.f4893c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n316#2,3:171\n*E\n"})
    public static final class e extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f4) {
            super(1);
            this.f4894b = f4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("requiredSize");
            a2Var.e(androidx.compose.ui.unit.h.d(this.f4894b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n343#2,4:171\n*E\n"})
    public static final class f extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4895b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4896c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f4, float f5) {
            super(1);
            this.f4895b = f4;
            this.f4896c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("requiredSize");
            androidx.compose.foundation.s1.a(this.f4895b, a2Var.getProperties(), "width", a2Var).c("height", androidx.compose.ui.unit.h.d(this.f4896c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n435#2,6:171\n*E\n"})
    public static final class g extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4897b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4898c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4899d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4900e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f4, float f5, float f6, float f7) {
            super(1);
            this.f4897b = f4;
            this.f4898c = f5;
            this.f4899d = f6;
            this.f4900e = f7;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("requiredSizeIn");
            androidx.compose.foundation.s1.a(this.f4899d, androidx.compose.foundation.s1.a(this.f4898c, androidx.compose.foundation.s1.a(this.f4897b, a2Var.getProperties(), "minWidth", a2Var), "minHeight", a2Var), "maxWidth", a2Var).c("maxHeight", androidx.compose.ui.unit.h.d(this.f4900e));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n258#2,3:171\n*E\n"})
    public static final class h extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f4) {
            super(1);
            this.f4901b = f4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("requiredWidth");
            a2Var.e(androidx.compose.ui.unit.h.d(this.f4901b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n382#2,4:171\n*E\n"})
    public static final class i extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4902b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4903c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(float f4, float f5) {
            super(1);
            this.f4902b = f4;
            this.f4903c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("requiredWidthIn");
            androidx.compose.foundation.s1.a(this.f4902b, a2Var.getProperties(), "min", a2Var).c("max", androidx.compose.ui.unit.h.d(this.f4903c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n112#2,3:171\n*E\n"})
    public static final class j extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4904b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(float f4) {
            super(1);
            this.f4904b = f4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("size");
            a2Var.e(androidx.compose.ui.unit.h.d(this.f4904b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n139#2,4:171\n*E\n"})
    public static final class k extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4905b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(float f4, float f5) {
            super(1);
            this.f4905b = f4;
            this.f4906c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("size");
            androidx.compose.foundation.s1.a(this.f4905b, a2Var.getProperties(), "width", a2Var).c("height", androidx.compose.ui.unit.h.d(this.f4906c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n227#2,6:171\n*E\n"})
    public static final class l extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4907b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4908c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f4909d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f4910e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(float f4, float f5, float f6, float f7) {
            super(1);
            this.f4907b = f4;
            this.f4908c = f5;
            this.f4909d = f6;
            this.f4910e = f7;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("sizeIn");
            androidx.compose.foundation.s1.a(this.f4909d, androidx.compose.foundation.s1.a(this.f4908c, androidx.compose.foundation.s1.a(this.f4907b, a2Var.getProperties(), "minWidth", a2Var), "minHeight", a2Var), "maxWidth", a2Var).c("maxHeight", androidx.compose.ui.unit.h.d(this.f4910e));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n62#2,3:171\n*E\n"})
    public static final class m extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4911b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(float f4) {
            super(1);
            this.f4911b = f4;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("width");
            a2Var.e(androidx.compose.ui.unit.h.d(this.f4911b));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/platform/a2;)V", "androidx/compose/ui/platform/y1$b"}, k = 3, mv = {1, 8, 0})
    @kotlin.jvm.internal.r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n177#2,4:171\n*E\n"})
    public static final class n extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.platform.a2, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f4912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f4913c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(float f4, float f5) {
            super(1);
            this.f4912b = f4;
            this.f4913c = f5;
        }

        public final void a(@fg.l androidx.compose.ui.platform.a2 a2Var) {
            a2Var.d("widthIn");
            androidx.compose.foundation.s1.a(this.f4912b, a2Var.getProperties(), "min", a2Var).c("max", androidx.compose.ui.unit.h.d(this.f4913c));
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.platform.a2 a2Var) {
            a(a2Var);
            return kotlin.k2.f75408a;
        }
    }

    static {
        FillElement.Companion companion = FillElement.INSTANCE;
        f4879a = companion.c(1.0f);
        f4880b = companion.a(1.0f);
        f4881c = companion.b(1.0f);
        WrapContentElement.Companion companion2 = WrapContentElement.INSTANCE;
        c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
        f4882d = companion2.c(companion3.m(), false);
        f4883e = companion2.c(companion3.u(), false);
        f4884f = companion2.a(companion3.q(), false);
        f4885g = companion2.a(companion3.w(), false);
        f4886h = companion2.b(companion3.i(), false);
        f4887i = companion2.b(companion3.C(), false);
    }

    public static androidx.compose.ui.q A(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 4) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f6 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 8) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f7 = androidx.compose.ui.unit.h.f21501f;
        }
        return z(qVar, f4, f5, f6, f7);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q B(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new SizeElement(f4, 0.0f, f4, 0.0f, true, androidx.compose.ui.platform.y1.e() ? new m(f4) : androidx.compose.ui.platform.y1.b(), 10, null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q C(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new SizeElement(f4, 0.0f, f5, 0.0f, true, androidx.compose.ui.platform.y1.e() ? new n(f4, f5) : androidx.compose.ui.platform.y1.b(), 10, null));
    }

    public static androidx.compose.ui.q D(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        return C(qVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q E(@fg.l androidx.compose.ui.q qVar, @fg.l c.InterfaceC0326c interfaceC0326c, boolean z4) {
        c.Companion companion = androidx.compose.ui.c.INSTANCE;
        return qVar.w3((!kotlin.jvm.internal.l0.g(interfaceC0326c, companion.q()) || z4) ? (!kotlin.jvm.internal.l0.g(interfaceC0326c, companion.w()) || z4) ? WrapContentElement.INSTANCE.a(interfaceC0326c, z4) : f4885g : f4884f);
    }

    public static /* synthetic */ androidx.compose.ui.q F(androidx.compose.ui.q qVar, c.InterfaceC0326c interfaceC0326c, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC0326c = androidx.compose.ui.c.INSTANCE.q();
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return E(qVar, interfaceC0326c, z4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q G(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.c cVar, boolean z4) {
        c.Companion companion = androidx.compose.ui.c.INSTANCE;
        return qVar.w3((!kotlin.jvm.internal.l0.g(cVar, companion.i()) || z4) ? (!kotlin.jvm.internal.l0.g(cVar, companion.C()) || z4) ? WrapContentElement.INSTANCE.b(cVar, z4) : f4887i : f4886h);
    }

    public static /* synthetic */ androidx.compose.ui.q H(androidx.compose.ui.q qVar, androidx.compose.ui.c cVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cVar = androidx.compose.ui.c.INSTANCE.i();
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return G(qVar, cVar, z4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q I(@fg.l androidx.compose.ui.q qVar, @fg.l c.b bVar, boolean z4) {
        c.Companion companion = androidx.compose.ui.c.INSTANCE;
        return qVar.w3((!kotlin.jvm.internal.l0.g(bVar, companion.m()) || z4) ? (!kotlin.jvm.internal.l0.g(bVar, companion.u()) || z4) ? WrapContentElement.INSTANCE.c(bVar, z4) : f4883e : f4882d);
    }

    public static /* synthetic */ androidx.compose.ui.q J(androidx.compose.ui.q qVar, c.b bVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            bVar = androidx.compose.ui.c.INSTANCE.m();
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return I(qVar, bVar, z4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new UnspecifiedConstraintsElement(f4, f5, null));
    }

    public static androidx.compose.ui.q b(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        return a(qVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        return qVar.w3(f4 == 1.0f ? f4880b : FillElement.INSTANCE.a(f4));
    }

    public static /* synthetic */ androidx.compose.ui.q d(androidx.compose.ui.q qVar, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return c(qVar, f4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q e(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        return qVar.w3(f4 == 1.0f ? f4881c : FillElement.INSTANCE.b(f4));
    }

    public static /* synthetic */ androidx.compose.ui.q f(androidx.compose.ui.q qVar, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return e(qVar, f4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q g(@fg.l androidx.compose.ui.q qVar, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        return qVar.w3(f4 == 1.0f ? f4879a : FillElement.INSTANCE.c(f4));
    }

    public static /* synthetic */ androidx.compose.ui.q h(androidx.compose.ui.q qVar, float f4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f4 = 1.0f;
        }
        return g(qVar, f4);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q i(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new SizeElement(0.0f, f4, 0.0f, f4, true, androidx.compose.ui.platform.y1.e() ? new a(f4) : androidx.compose.ui.platform.y1.b(), 5, null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q j(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new SizeElement(0.0f, f4, 0.0f, f5, true, androidx.compose.ui.platform.y1.e() ? new b(f4, f5) : androidx.compose.ui.platform.y1.b(), 5, null));
    }

    public static androidx.compose.ui.q k(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        return j(qVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q l(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new SizeElement(0.0f, f4, 0.0f, f4, false, androidx.compose.ui.platform.y1.e() ? new c(f4) : androidx.compose.ui.platform.y1.b(), 5, null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q m(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new SizeElement(0.0f, f4, 0.0f, f5, false, androidx.compose.ui.platform.y1.e() ? new d(f4, f5) : androidx.compose.ui.platform.y1.b(), 5, null));
    }

    public static androidx.compose.ui.q n(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        return m(qVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q o(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new SizeElement(f4, f4, f4, f4, false, androidx.compose.ui.platform.y1.e() ? new e(f4) : androidx.compose.ui.platform.y1.b(), null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q p(@fg.l androidx.compose.ui.q qVar, long j4) {
        return q(qVar, androidx.compose.ui.unit.l.p(j4), androidx.compose.ui.unit.l.m(j4));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q q(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new SizeElement(f4, f5, f4, f5, false, androidx.compose.ui.platform.y1.e() ? new f(f4, f5) : androidx.compose.ui.platform.y1.b(), null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q r(@fg.l androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7) {
        return qVar.w3(new SizeElement(f4, f5, f6, f7, false, androidx.compose.ui.platform.y1.e() ? new g(f4, f5, f6, f7) : androidx.compose.ui.platform.y1.b(), null));
    }

    public static androidx.compose.ui.q s(androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 4) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f6 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 8) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f7 = androidx.compose.ui.unit.h.f21501f;
        }
        return r(qVar, f4, f5, f6, f7);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q t(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new SizeElement(f4, 0.0f, f4, 0.0f, false, androidx.compose.ui.platform.y1.e() ? new h(f4) : androidx.compose.ui.platform.y1.b(), 10, null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q u(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new SizeElement(f4, 0.0f, f5, 0.0f, false, androidx.compose.ui.platform.y1.e() ? new i(f4, f5) : androidx.compose.ui.platform.y1.b(), 10, null));
    }

    public static androidx.compose.ui.q v(androidx.compose.ui.q qVar, float f4, float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f4 = androidx.compose.ui.unit.h.f21501f;
        }
        if ((i4 & 2) != 0) {
            androidx.compose.ui.unit.h.INSTANCE.getClass();
            f5 = androidx.compose.ui.unit.h.f21501f;
        }
        return u(qVar, f4, f5);
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q w(@fg.l androidx.compose.ui.q qVar, float f4) {
        return qVar.w3(new SizeElement(f4, f4, f4, f4, true, androidx.compose.ui.platform.y1.e() ? new j(f4) : androidx.compose.ui.platform.y1.b(), null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q x(@fg.l androidx.compose.ui.q qVar, long j4) {
        return y(qVar, androidx.compose.ui.unit.l.p(j4), androidx.compose.ui.unit.l.m(j4));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q y(@fg.l androidx.compose.ui.q qVar, float f4, float f5) {
        return qVar.w3(new SizeElement(f4, f5, f4, f5, true, androidx.compose.ui.platform.y1.e() ? new k(f4, f5) : androidx.compose.ui.platform.y1.b(), null));
    }

    @x4
    @fg.l
    public static final androidx.compose.ui.q z(@fg.l androidx.compose.ui.q qVar, float f4, float f5, float f6, float f7) {
        return qVar.w3(new SizeElement(f4, f5, f6, f7, true, androidx.compose.ui.platform.y1.e() ? new l(f4, f5, f6, f7) : androidx.compose.ui.platform.y1.b(), null));
    }
}
