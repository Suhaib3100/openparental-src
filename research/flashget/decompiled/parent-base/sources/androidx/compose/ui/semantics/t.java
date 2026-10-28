package androidx.compose.ui.semantics;

import androidx.compose.ui.text.t0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.x0;

/* compiled from: SemanticsProperties.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b\u001e\u0010\nR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\b\u001a\u0004\b\u000f\u0010\nR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\b\u001a\u0004\b&\u0010\nR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\b\u001a\u0004\b,\u0010\nR&\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\b\u0012\u0004\b+\u0010\u0003\u001a\u0004\b)\u0010\nR\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002000\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\b\u001a\u0004\b2\u0010\nR\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002040\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b \u0010\nR\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002040\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\b\u001a\u0004\b8\u0010\nR\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\b\u001a\u0004\b7\u0010\nR\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b5\u0010\nR\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\b\u001a\u0004\b>\u0010\nR\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b@\u0010\nR#\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00050\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\bD\u0010\nR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020B0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\bF\u0010\nR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b:\u0010\nR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020B0\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0012\u0010\nR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020J0\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\bL\u0010\nR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\"\u0010\nR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020(0\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\b\u001a\u0004\bK\u0010\nR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bR\u0010\nR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\bC\u0010\nR\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\b\u001a\u0004\b\u0016\u0010\nR)\u0010X\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020W0V0\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\b\u001a\u0004\b%\u0010\nR \u0010Y\u001a\b\u0012\u0004\u0012\u00020(0\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0003\u001a\u0004\b.\u0010\n¨\u0006Z"}, d2 = {"Landroidx/compose/ui/semantics/t;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/y;", "", "", "b", "Landroidx/compose/ui/semantics/y;", "c", "()Landroidx/compose/ui/semantics/y;", "ContentDescription", "A", "StateDescription", "Landroidx/compose/ui/semantics/h;", "d", "w", "ProgressBarRangeInfo", "e", "u", "PaneTitle", "Lkotlin/k2;", "f", "y", "SelectableGroup", "Landroidx/compose/ui/semantics/b;", "g", "a", "CollectionInfo", "Landroidx/compose/ui/semantics/c;", "h", "CollectionItemInfo", "i", "Heading", "j", "Disabled", "Landroidx/compose/ui/semantics/g;", "k", "t", "LiveRegion", "", "l", "Focused", "m", "s", "IsTraversalGroup", "n", "InvisibleToUser", "", "o", "G", "TraversalIndex", "Landroidx/compose/ui/semantics/j;", "p", "HorizontalScrollAxisRange", "q", "H", "VerticalScrollAxisRange", "r", "IsPopup", "IsDialog", "Landroidx/compose/ui/semantics/i;", "x", "Role", "B", "TestTag", "Landroidx/compose/ui/text/e;", "v", "C", "Text", "E", "TextSubstitution", "IsShowingTextSubstitution", "EditableText", "Landroidx/compose/ui/text/t0;", "z", "D", "TextSelectionRange", "Landroidx/compose/ui/text/input/y;", "ImeAction", "Selected", "Lp0/a;", "F", "ToggleableState", "Password", "Error", "Lkotlin/Function1;", "", "IndexForKey", "IsContainer", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final t f20369a = new t();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<List<String>> ContentDescription = w.b("ContentDescription", a.f20395b);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<String> StateDescription = w.a("StateDescription");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.semantics.h> ProgressBarRangeInfo = w.a("ProgressBarRangeInfo");

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<String> PaneTitle = w.b("PaneTitle", e.f20399b);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<k2> SelectableGroup = w.a("SelectableGroup");

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.semantics.b> CollectionInfo = w.a("CollectionInfo");

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.semantics.c> CollectionItemInfo = w.a("CollectionItemInfo");

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<k2> Heading = w.a("Heading");

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<k2> Disabled = w.a("Disabled");

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.semantics.g> LiveRegion = w.a("LiveRegion");

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<Boolean> Focused = w.a("Focused");

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<Boolean> IsTraversalGroup = w.a("IsTraversalGroup");

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<k2> InvisibleToUser = new y<>("InvisibleToUser", b.f20396b);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<Float> TraversalIndex = w.b("TraversalIndex", i.f20403b);

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<j> HorizontalScrollAxisRange = w.a("HorizontalScrollAxisRange");

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<j> VerticalScrollAxisRange = w.a("VerticalScrollAxisRange");

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<k2> IsPopup = w.b("IsPopup", d.f20398b);

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<k2> IsDialog = w.b("IsDialog", c.f20397b);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.semantics.i> Role = w.b("Role", f.f20400b);

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<String> TestTag = new y<>("TestTag", false, g.f20401b);

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<List<androidx.compose.ui.text.e>> Text = w.b("Text", h.f20402b);

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.text.e> TextSubstitution = new y<>("TextSubstitution", null, 2, null);

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<Boolean> IsShowingTextSubstitution = new y<>("IsShowingTextSubstitution", null, 2, null);

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.text.e> EditableText = w.a("EditableText");

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<t0> TextSelectionRange = w.a("TextSelectionRange");

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private static final y<androidx.compose.ui.text.input.y> ImeAction = w.a("ImeAction");

    /* renamed from: B, reason: from kotlin metadata */
    @fg.l
    private static final y<Boolean> Selected = w.a("Selected");

    /* renamed from: C, reason: from kotlin metadata */
    @fg.l
    private static final y<p0.a> ToggleableState = w.a("ToggleableState");

    /* renamed from: D, reason: from kotlin metadata */
    @fg.l
    private static final y<k2> Password = w.a("Password");

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private static final y<String> Error = w.a("Error");

    /* renamed from: F, reason: from kotlin metadata */
    @fg.l
    private static final y<ld.l<Object, Integer>> IndexForKey = new y<>("IndexForKey", null, 2, null);
    public static final int G = 8;

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$ContentDescription$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1469:1\n1#2:1470\n*E\n"})
    static final class a extends n0 implements ld.p<List<? extends String>, List<? extends String>, List<? extends String>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20395b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(@fg.m List<String> list, @fg.l List<String> list2) {
            List<String> Y5;
            if (list == null || (Y5 = kotlin.collections.w.Y5(list)) == null) {
                return list2;
            }
            Y5.addAll(list2);
            return Y5;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/k2;", "parentValue", "<anonymous parameter 1>", "a", "(Lkotlin/k2;Lkotlin/k2;)Lkotlin/k2;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.p<k2, k2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f20396b = new b(2);

        b() {
            super(2);
        }

        @fg.m
        public final k2 a(@fg.m k2 k2Var, @fg.l k2 k2Var2) {
            return k2Var;
        }

        @Override // ld.p
        public k2 invoke(k2 k2Var, k2 k2Var2) {
            return k2Var;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/k2;", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Lkotlin/k2;Lkotlin/k2;)Lkotlin/k2;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.p<k2, k2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20397b = new c(2);

        c() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k2 invoke(@fg.m k2 k2Var, @fg.l k2 k2Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/k2;", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Lkotlin/k2;Lkotlin/k2;)Lkotlin/k2;"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.p<k2, k2, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f20398b = new d(2);

        d() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k2 invoke(@fg.m k2 k2Var, @fg.l k2 k2Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.p<String, String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f20399b = new e(2);

        e() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(@fg.m String str, @fg.l String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/semantics/i;", "parentValue", "<anonymous parameter 1>", "a", "(Landroidx/compose/ui/semantics/i;I)Landroidx/compose/ui/semantics/i;"}, k = 3, mv = {1, 8, 0})
    static final class f extends n0 implements ld.p<androidx.compose.ui.semantics.i, androidx.compose.ui.semantics.i, androidx.compose.ui.semantics.i> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f20400b = new f(2);

        f() {
            super(2);
        }

        @fg.m
        public final androidx.compose.ui.semantics.i a(@fg.m androidx.compose.ui.semantics.i iVar, int i4) {
            return iVar;
        }

        @Override // ld.p
        public androidx.compose.ui.semantics.i invoke(androidx.compose.ui.semantics.i iVar, androidx.compose.ui.semantics.i iVar2) {
            androidx.compose.ui.semantics.i iVar3 = iVar;
            iVar2.getValue();
            return iVar3;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class g extends n0 implements ld.p<String, String, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f20401b = new g(2);

        g() {
            super(2);
        }

        @fg.m
        public final String a(@fg.m String str, @fg.l String str2) {
            return str;
        }

        @Override // ld.p
        public String invoke(String str, String str2) {
            return str;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/e;", "parentValue", "childValue", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsProperties$Text$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1469:1\n1#2:1470\n*E\n"})
    static final class h extends n0 implements ld.p<List<? extends androidx.compose.ui.text.e>, List<? extends androidx.compose.ui.text.e>, List<? extends androidx.compose.ui.text.e>> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f20402b = new h(2);

        h() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<androidx.compose.ui.text.e> invoke(@fg.m List<androidx.compose.ui.text.e> list, @fg.l List<androidx.compose.ui.text.e> list2) {
            List<androidx.compose.ui.text.e> Y5;
            if (list == null || (Y5 = kotlin.collections.w.Y5(list)) == null) {
                return list2;
            }
            Y5.addAll(list2);
            return Y5;
        }
    }

    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/Float;F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class i extends n0 implements ld.p<Float, Float, Float> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f20403b = new i(2);

        i() {
            super(2);
        }

        @fg.m
        public final Float a(@fg.m Float f4, float f5) {
            return f4;
        }

        @Override // ld.p
        public Float invoke(Float f4, Float f5) {
            Float f6 = f4;
            f5.floatValue();
            return f6;
        }
    }

    private t() {
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void m() {
    }

    @kotlin.k(message = "Use `isTraversalGroup` instead.", replaceWith = @x0(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void o() {
    }

    @fg.l
    public final y<String> A() {
        return StateDescription;
    }

    @fg.l
    public final y<String> B() {
        return TestTag;
    }

    @fg.l
    public final y<List<androidx.compose.ui.text.e>> C() {
        return Text;
    }

    @fg.l
    public final y<t0> D() {
        return TextSelectionRange;
    }

    @fg.l
    public final y<androidx.compose.ui.text.e> E() {
        return TextSubstitution;
    }

    @fg.l
    public final y<p0.a> F() {
        return ToggleableState;
    }

    @fg.l
    public final y<Float> G() {
        return TraversalIndex;
    }

    @fg.l
    public final y<j> H() {
        return VerticalScrollAxisRange;
    }

    @fg.l
    public final y<androidx.compose.ui.semantics.b> a() {
        return CollectionInfo;
    }

    @fg.l
    public final y<androidx.compose.ui.semantics.c> b() {
        return CollectionItemInfo;
    }

    @fg.l
    public final y<List<String>> c() {
        return ContentDescription;
    }

    @fg.l
    public final y<k2> d() {
        return Disabled;
    }

    @fg.l
    public final y<androidx.compose.ui.text.e> e() {
        return EditableText;
    }

    @fg.l
    public final y<String> f() {
        return Error;
    }

    @fg.l
    public final y<Boolean> g() {
        return Focused;
    }

    @fg.l
    public final y<k2> h() {
        return Heading;
    }

    @fg.l
    public final y<j> i() {
        return HorizontalScrollAxisRange;
    }

    @fg.l
    public final y<androidx.compose.ui.text.input.y> j() {
        return ImeAction;
    }

    @fg.l
    public final y<ld.l<Object, Integer>> k() {
        return IndexForKey;
    }

    @fg.l
    public final y<k2> l() {
        return InvisibleToUser;
    }

    @fg.l
    public final y<Boolean> n() {
        return IsTraversalGroup;
    }

    @fg.l
    public final y<k2> p() {
        return IsDialog;
    }

    @fg.l
    public final y<k2> q() {
        return IsPopup;
    }

    @fg.l
    public final y<Boolean> r() {
        return IsShowingTextSubstitution;
    }

    @fg.l
    public final y<Boolean> s() {
        return IsTraversalGroup;
    }

    @fg.l
    public final y<androidx.compose.ui.semantics.g> t() {
        return LiveRegion;
    }

    @fg.l
    public final y<String> u() {
        return PaneTitle;
    }

    @fg.l
    public final y<k2> v() {
        return Password;
    }

    @fg.l
    public final y<androidx.compose.ui.semantics.h> w() {
        return ProgressBarRangeInfo;
    }

    @fg.l
    public final y<androidx.compose.ui.semantics.i> x() {
        return Role;
    }

    @fg.l
    public final y<k2> y() {
        return SelectableGroup;
    }

    @fg.l
    public final y<Boolean> z() {
        return Selected;
    }
}
