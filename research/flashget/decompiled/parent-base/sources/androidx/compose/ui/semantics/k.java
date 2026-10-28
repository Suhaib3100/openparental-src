package androidx.compose.ui.semantics;

import androidx.compose.ui.semantics.w;
import androidx.compose.ui.text.n0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.x0;

/* compiled from: SemanticsProperties.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rRS\u0010\u001e\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR/\u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR>\u0010&\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR;\u0010(\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0'0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u001a\u0010\rR/\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b\u001b\u0010\rR/\u0010-\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b,\u0010\rR/\u00100\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b/\u0010\rR)\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b1\u0010\rR/\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u000b\u001a\u0004\b*\u0010\rR)\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u000b\u001a\u0004\b.\u0010\rR2\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010\u000b\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u0010\rR)\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b\u001c\u0010\rR)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b=\u0010\rR)\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u000b\u001a\u0004\b$\u0010\rR)\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\b\n\u0010\rR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b \u0010\rR)\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\bA\u0010\rR#\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0E0\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b;\u0010\rR)\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b5\u0010\rR)\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b3\u0010\rR)\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b7\u0010\r¨\u0006L"}, d2 = {"Landroidx/compose/ui/semantics/k;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/y;", "Landroidx/compose/ui/semantics/a;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/n0;", "", "b", "Landroidx/compose/ui/semantics/y;", "h", "()Landroidx/compose/ui/semantics/y;", "GetTextLayoutResult", "Lkotlin/Function0;", "c", "j", "OnClick", "d", "l", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/r0;", "name", "x", "y", "e", "u", "ScrollBy", "", "f", "v", "ScrollToIndex", "progress", "g", "w", "SetProgress", "Lkotlin/Function3;", "SetSelection", "Landroidx/compose/ui/text/e;", "i", "SetText", "z", "SetTextSubstitution", "k", "A", "ShowTextSubstitution", "a", "ClearTextSubstitution", "m", "InsertTextAtCursor", "n", "OnImeAction", "o", "r", "s", "PerformImeAction", "p", "CopyText", "q", "CutText", "PasteText", "Expand", "t", "Collapse", "Dismiss", "RequestFocus", "", "Landroidx/compose/ui/semantics/e;", "CustomActions", "PageUp", "PageLeft", "PageDown", "PageRight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1469:1\n553#2:1470\n552#2,9:1471\n553#2:1480\n552#2,9:1481\n553#2:1490\n552#2,9:1491\n553#2:1500\n552#2,9:1501\n553#2:1510\n552#2,9:1511\n553#2:1520\n552#2,9:1521\n553#2:1530\n552#2,9:1531\n553#2:1540\n552#2,9:1541\n553#2:1550\n552#2,9:1551\n553#2:1560\n552#2,9:1561\n553#2:1570\n552#2,9:1571\n553#2:1580\n552#2,9:1581\n553#2:1590\n552#2,9:1591\n553#2:1600\n552#2,9:1601\n553#2:1610\n552#2,9:1611\n553#2:1620\n552#2,9:1621\n553#2:1630\n552#2,9:1631\n553#2:1640\n552#2,9:1641\n553#2:1650\n552#2,9:1651\n553#2:1660\n552#2,9:1661\n553#2:1670\n552#2,9:1671\n553#2:1680\n552#2,9:1681\n553#2:1690\n552#2,9:1691\n553#2:1700\n552#2,9:1701\n553#2:1710\n552#2,9:1711\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n269#1:1470\n269#1:1471,9\n274#1:1480\n274#1:1481,9\n279#1:1490\n279#1:1491,9\n284#1:1500\n284#1:1501,9\n289#1:1510\n289#1:1511,9\n294#1:1520\n294#1:1521,9\n299#1:1530\n299#1:1531,9\n304#1:1540\n304#1:1541,9\n309#1:1550\n309#1:1551,9\n314#1:1560\n314#1:1561,9\n319#1:1570\n319#1:1571,9\n324#1:1580\n324#1:1581,9\n329#1:1590\n329#1:1591,9\n341#1:1600\n341#1:1601,9\n346#1:1610\n346#1:1611,9\n351#1:1620\n351#1:1621,9\n356#1:1630\n356#1:1631,9\n361#1:1640\n361#1:1641,9\n366#1:1650\n366#1:1651,9\n371#1:1660\n371#1:1661,9\n376#1:1670\n376#1:1671,9\n387#1:1680\n387#1:1681,9\n392#1:1690\n392#1:1691,9\n397#1:1700\n397#1:1701,9\n402#1:1710\n402#1:1711,9\n*E\n"})
/* loaded from: classes.dex */
public final class k {

    /* renamed from: A, reason: from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> PageRight;
    public static final int B;

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k f20321a = new k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.l<List<n0>, Boolean>>> GetTextLayoutResult;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> OnClick;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> OnLongClick;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.p<Float, Float, Boolean>>> ScrollBy;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.l<Integer, Boolean>>> ScrollToIndex;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.l<Float, Boolean>>> SetProgress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.q<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.l<androidx.compose.ui.text.e, Boolean>>> SetText;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.l<androidx.compose.ui.text.e, Boolean>>> SetTextSubstitution;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.l<Boolean, Boolean>>> ShowTextSubstitution;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> ClearTextSubstitution;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.l<androidx.compose.ui.text.e, Boolean>>> InsertTextAtCursor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> OnImeAction;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> PerformImeAction;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> CopyText;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> CutText;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> PasteText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> Expand;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> Collapse;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> Dismiss;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> RequestFocus;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<List<e>> CustomActions;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> PageUp;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> PageLeft;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<a<ld.a<Boolean>>> PageDown;

    static {
        w.a aVar = w.a.f20409b;
        GetTextLayoutResult = w.b("GetTextLayoutResult", aVar);
        OnClick = w.b("OnClick", aVar);
        OnLongClick = w.b("OnLongClick", aVar);
        ScrollBy = w.b("ScrollBy", aVar);
        ScrollToIndex = w.b("ScrollToIndex", aVar);
        SetProgress = w.b("SetProgress", aVar);
        SetSelection = w.b("SetSelection", aVar);
        SetText = w.b("SetText", aVar);
        SetTextSubstitution = w.b("SetTextSubstitution", aVar);
        ShowTextSubstitution = w.b("ShowTextSubstitution", aVar);
        ClearTextSubstitution = w.b("ClearTextSubstitution", aVar);
        InsertTextAtCursor = w.b("InsertTextAtCursor", aVar);
        OnImeAction = w.b("PerformImeAction", aVar);
        PerformImeAction = w.b("PerformImeAction", aVar);
        CopyText = w.b("CopyText", aVar);
        CutText = w.b("CutText", aVar);
        PasteText = w.b("PasteText", aVar);
        Expand = w.b("Expand", aVar);
        Collapse = w.b("Collapse", aVar);
        Dismiss = w.b("Dismiss", aVar);
        RequestFocus = w.b("RequestFocus", aVar);
        CustomActions = w.a("CustomActions");
        PageUp = w.b("PageUp", aVar);
        PageLeft = w.b("PageLeft", aVar);
        PageDown = w.b("PageDown", aVar);
        PageRight = w.b("PageRight", aVar);
        B = 8;
    }

    private k() {
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use `SemanticsActions.OnImeAction` instead.", replaceWith = @x0(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    public static /* synthetic */ void s() {
    }

    @fg.l
    public final y<a<ld.l<Boolean, Boolean>>> A() {
        return ShowTextSubstitution;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> a() {
        return ClearTextSubstitution;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> b() {
        return Collapse;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> c() {
        return CopyText;
    }

    @fg.l
    public final y<List<e>> d() {
        return CustomActions;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> e() {
        return CutText;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> f() {
        return Dismiss;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> g() {
        return Expand;
    }

    @fg.l
    public final y<a<ld.l<List<n0>, Boolean>>> h() {
        return GetTextLayoutResult;
    }

    @fg.l
    public final y<a<ld.l<androidx.compose.ui.text.e, Boolean>>> i() {
        return InsertTextAtCursor;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> j() {
        return OnClick;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> k() {
        return OnImeAction;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> l() {
        return OnLongClick;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> m() {
        return PageDown;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> n() {
        return PageLeft;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> o() {
        return PageRight;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> p() {
        return PageUp;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> q() {
        return PasteText;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> r() {
        return PerformImeAction;
    }

    @fg.l
    public final y<a<ld.a<Boolean>>> t() {
        return RequestFocus;
    }

    @fg.l
    public final y<a<ld.p<Float, Float, Boolean>>> u() {
        return ScrollBy;
    }

    @fg.l
    public final y<a<ld.l<Integer, Boolean>>> v() {
        return ScrollToIndex;
    }

    @fg.l
    public final y<a<ld.l<Float, Boolean>>> w() {
        return SetProgress;
    }

    @fg.l
    public final y<a<ld.q<Integer, Integer, Boolean, Boolean>>> x() {
        return SetSelection;
    }

    @fg.l
    public final y<a<ld.l<androidx.compose.ui.text.e, Boolean>>> y() {
        return SetText;
    }

    @fg.l
    public final y<a<ld.l<androidx.compose.ui.text.e, Boolean>>> z() {
        return SetTextSubstitution;
    }
}
