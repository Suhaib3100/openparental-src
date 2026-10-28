package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.c1;
import androidx.compose.foundation.text.e1;
import androidx.compose.foundation.text.j1;
import androidx.compose.foundation.text.n1;
import androidx.compose.runtime.t4;
import androidx.compose.ui.platform.f1;
import androidx.compose.ui.platform.i5;
import androidx.compose.ui.platform.k5;
import androidx.compose.ui.text.input.a1;
import androidx.compose.ui.text.input.k1;
import i0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextFieldSelectionManager.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJB\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010!\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'J\u0019\u0010)\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\b)\u0010\nJ\u000f\u0010*\u001a\u00020\bH\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010-\u001a\u00020\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u0010\nJ\u000f\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b1\u0010+J\u000f\u00102\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u0010+J\u000f\u00103\u001a\u00020\bH\u0000¢\u0006\u0004\b3\u0010+J\u001d\u00104\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u00102\u0006\u00107\u001a\u000206H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\bH\u0000¢\u0006\u0004\b:\u0010+J\u000f\u0010;\u001a\u00020\bH\u0000¢\u0006\u0004\b;\u0010+J\u0018\u0010<\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0010ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0006H\u0000¢\u0006\u0004\b>\u0010?R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\"\u0010K\u001a\u00020D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR.\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010[\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\u000e8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010j\u001a\u00020c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010r\u001a\u0004\u0018\u00010k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010z\u001a\u0004\u0018\u00010s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR'\u0010\u0082\u0001\u001a\u0004\u0018\u00010{8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R/\u0010\u008e\u0001\u001a\u00020\u00062\u0006\u0010\\\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010^\u001a\u0005\b\u008c\u0001\u0010?\"\u0005\b\u008d\u0001\u0010\nR\u001e\u0010\u0090\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010OR\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001d\u0010\u0095\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u0010OR6\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0096\u00012\t\u0010\\\u001a\u0005\u0018\u00010\u0096\u00018F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0004\b0\u0010^\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R:\u0010 \u0001\u001a\u0004\u0018\u00010\u00102\b\u0010\\\u001a\u0004\u0018\u00010\u00108F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0016\n\u0005\b\u009c\u0001\u0010^\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0005\b\u009f\u0001\u0010.R\u0018\u0010¡\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010GR\u0018\u0010£\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010¢\u0001R\u001b\u0010¦\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010¥\u0001R\u001d\u0010©\u0001\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b-\u0010§\u0001\u001a\u0005\b¨\u0001\u0010'R \u0010¯\u0001\u001a\u00030ª\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R \u0010³\u0001\u001a\u0004\u0018\u00010\u001e8@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b²\u0001\u0010+\u001a\u0006\b°\u0001\u0010±\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006´\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/s0;", "", "Landroidx/compose/foundation/text/j1;", "undoManager", "<init>", "(Landroidx/compose/foundation/text/j1;)V", "", "show", "Lkotlin/k2;", "l0", "(Z)V", "Li0/i;", "z", "()Li0/i;", "Landroidx/compose/ui/text/input/z0;", "value", "Li0/f;", "currentPosition", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/w;", "adjustment", "isTouchBasedSelection", "Landroidx/compose/ui/text/t0;", "m0", "(Landroidx/compose/ui/text/input/z0;JZZLandroidx/compose/foundation/text/selection/w;Z)J", "Landroidx/compose/foundation/text/p;", "handleState", "c0", "(Landroidx/compose/foundation/text/p;)V", "Landroidx/compose/ui/text/e;", "annotatedString", "selection", "q", "(Landroidx/compose/ui/text/e;J)Landroidx/compose/ui/text/input/z0;", "Landroidx/compose/foundation/text/o0;", "S", "(Z)Landroidx/compose/foundation/text/o0;", "r", "()Landroidx/compose/foundation/text/o0;", "showFloatingToolbar", "v", "x", "()V", "position", "t", "(Li0/f;)V", "cancelSelection", "o", "V", "s", "W", "F", "(Z)J", "Landroidx/compose/ui/unit/d;", "density", "B", "(Landroidx/compose/ui/unit/d;)J", "k0", "T", "n", "(J)V", "U", "()Z", "a", "Landroidx/compose/foundation/text/j1;", "P", "()Landroidx/compose/foundation/text/j1;", "Landroidx/compose/ui/text/input/p0;", "b", "Landroidx/compose/ui/text/input/p0;", "I", "()Landroidx/compose/ui/text/input/p0;", "e0", "(Landroidx/compose/ui/text/input/p0;)V", "offsetMapping", "Lkotlin/Function1;", "c", "Lld/l;", "J", "()Lld/l;", "f0", "(Lld/l;)V", "onValueChange", "Landroidx/compose/foundation/text/c1;", "d", "Landroidx/compose/foundation/text/c1;", "K", "()Landroidx/compose/foundation/text/c1;", "g0", "(Landroidx/compose/foundation/text/c1;)V", "state", "<set-?>", "e", "Landroidx/compose/runtime/k2;", "Q", "()Landroidx/compose/ui/text/input/z0;", "i0", "(Landroidx/compose/ui/text/input/z0;)V", "Landroidx/compose/ui/text/input/k1;", "f", "Landroidx/compose/ui/text/input/k1;", "R", "()Landroidx/compose/ui/text/input/k1;", "j0", "(Landroidx/compose/ui/text/input/k1;)V", "visualTransformation", "Landroidx/compose/ui/platform/f1;", "g", "Landroidx/compose/ui/platform/f1;", "y", "()Landroidx/compose/ui/platform/f1;", "X", "(Landroidx/compose/ui/platform/f1;)V", "clipboardManager", "Landroidx/compose/ui/platform/i5;", "h", "Landroidx/compose/ui/platform/i5;", "L", "()Landroidx/compose/ui/platform/i5;", "h0", "(Landroidx/compose/ui/platform/i5;)V", "textToolbar", "Lk0/a;", "i", "Lk0/a;", "G", "()Lk0/a;", "d0", "(Lk0/a;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/a0;", "j", "Landroidx/compose/ui/focus/a0;", "E", "()Landroidx/compose/ui/focus/a0;", "b0", "(Landroidx/compose/ui/focus/a0;)V", "focusRequester", "k", "D", "a0", "editable", "l", "dragBeginPosition", "", "m", "Ljava/lang/Integer;", "dragBeginOffsetInText", "dragTotalDistance", "Landroidx/compose/foundation/text/o;", "C", "()Landroidx/compose/foundation/text/o;", "Z", "(Landroidx/compose/foundation/text/o;)V", "draggingHandle", "p", "A", "()Li0/f;", "Y", "currentDragPosition", "previousRawDragOffset", "Landroidx/compose/ui/text/input/z0;", "oldValue", "Landroidx/compose/foundation/text/selection/d0;", "Landroidx/compose/foundation/text/selection/d0;", "previousSelectionLayout", "Landroidx/compose/foundation/text/o0;", "M", "touchSelectionObserver", "Landroidx/compose/foundation/text/selection/j;", "u", "Landroidx/compose/foundation/text/selection/j;", "H", "()Landroidx/compose/foundation/text/selection/j;", "mouseSelectionObserver", "N", "()Landroidx/compose/ui/text/e;", "O", "transformedText", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1049:1\n81#2:1050\n107#2,2:1051\n81#2:1053\n107#2,2:1054\n81#2:1056\n107#2,2:1057\n81#2:1059\n107#2,2:1060\n1#3:1062\n154#4:1063\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n87#1:1050\n87#1:1051,2\n125#1:1053\n125#1:1054,2\n155#1:1056\n155#1:1057,2\n161#1:1059\n161#1:1060,2\n825#1:1063\n*E\n"})
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: v, reason: collision with root package name */
    public static final int f8113v = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final j1 undoManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.text.input.p0 offsetMapping;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.text.input.z0, k2> onValueChange;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private c1 state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 value;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private k1 visualTransformation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private f1 clipboardManager;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i5 textToolbar;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private k0.a hapticFeedBack;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.focus.a0 focusRequester;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 editable;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long dragBeginPosition;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Integer dragBeginOffsetInText;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long dragTotalDistance;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 draggingHandle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 currentDragPosition;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int previousRawDragOffset;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.text.input.z0 oldValue;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private d0 previousSelectionLayout;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text.o0 touchSelectionObserver;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j mouseSelectionObserver;

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"androidx/compose/foundation/text/selection/s0$a", "Landroidx/compose/foundation/text/o0;", "Li0/f;", "point", "Lkotlin/k2;", "a", "(J)V", "c", "()V", "startPoint", "b", "delta", "d", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements androidx.compose.foundation.text.o0 {
        a() {
        }

        @Override // androidx.compose.foundation.text.o0
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.o0
        public void b(long startPoint) {
            e1 h4;
            long a5 = c0.a(s0.this.F(true));
            c1 state = s0.this.getState();
            if (state == null || (h4 = state.h()) == null) {
                return;
            }
            long n4 = h4.n(a5);
            s0.this.dragBeginPosition = n4;
            s0.this.Y(i0.f.d(n4));
            s0 s0Var = s0.this;
            i0.f.INSTANCE.getClass();
            s0Var.dragTotalDistance = i0.f.f74147c;
            s0.this.Z(androidx.compose.foundation.text.o.Cursor);
            s0.this.l0(false);
        }

        @Override // androidx.compose.foundation.text.o0
        public void c() {
            s0.this.Z(null);
            s0.this.Y(null);
        }

        @Override // androidx.compose.foundation.text.o0
        public void d(long delta) {
            e1 h4;
            k0.a hapticFeedBack;
            s0 s0Var = s0.this;
            s0Var.dragTotalDistance = i0.f.v(s0Var.dragTotalDistance, delta);
            c1 state = s0.this.getState();
            if (state == null || (h4 = state.h()) == null) {
                return;
            }
            s0 s0Var2 = s0.this;
            s0Var2.Y(i0.f.d(i0.f.v(s0Var2.dragBeginPosition, s0Var2.dragTotalDistance)));
            androidx.compose.ui.text.input.p0 offsetMapping = s0Var2.getOffsetMapping();
            i0.f A = s0Var2.A();
            kotlin.jvm.internal.l0.m(A);
            int a5 = offsetMapping.a(e1.h(h4, A.getPackedValue(), false, 2, null));
            long b5 = androidx.compose.ui.text.u0.b(a5, a5);
            if (androidx.compose.ui.text.t0.g(b5, s0Var2.Q().getSelection())) {
                return;
            }
            c1 state2 = s0Var2.getState();
            if ((state2 == null || state2.u()) && (hapticFeedBack = s0Var2.getHapticFeedBack()) != null) {
                k0.b.INSTANCE.getClass();
                hapticFeedBack.a(k0.d.f74804a.b());
            }
            s0Var2.J().invoke(s0Var2.q(s0Var2.Q().getAnnotatedString(), b5));
        }

        @Override // androidx.compose.foundation.text.o0
        public void onCancel() {
        }

        @Override // androidx.compose.foundation.text.o0
        public void onStop() {
            s0.this.Z(null);
            s0.this.Y(null);
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"androidx/compose/foundation/text/selection/s0$b", "Landroidx/compose/foundation/text/o0;", "Li0/f;", "point", "Lkotlin/k2;", "a", "(J)V", "c", "()V", "startPoint", "b", "delta", "d", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements androidx.compose.foundation.text.o0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f8137b;

        b(boolean z4) {
            this.f8137b = z4;
        }

        @Override // androidx.compose.foundation.text.o0
        public void a(long point) {
            e1 h4;
            s0.this.Z(this.f8137b ? androidx.compose.foundation.text.o.SelectionStart : androidx.compose.foundation.text.o.SelectionEnd);
            long a5 = c0.a(s0.this.F(this.f8137b));
            c1 state = s0.this.getState();
            if (state == null || (h4 = state.h()) == null) {
                return;
            }
            long n4 = h4.n(a5);
            s0.this.dragBeginPosition = n4;
            s0.this.Y(i0.f.d(n4));
            s0 s0Var = s0.this;
            i0.f.INSTANCE.getClass();
            s0Var.dragTotalDistance = i0.f.f74147c;
            s0.this.previousRawDragOffset = -1;
            c1 state2 = s0.this.getState();
            if (state2 != null) {
                state2.y(true);
            }
            s0.this.l0(false);
        }

        @Override // androidx.compose.foundation.text.o0
        public void b(long startPoint) {
        }

        @Override // androidx.compose.foundation.text.o0
        public void c() {
            s0.this.Z(null);
            s0.this.Y(null);
            s0.this.l0(true);
        }

        @Override // androidx.compose.foundation.text.o0
        public void d(long delta) {
            s0 s0Var = s0.this;
            s0Var.dragTotalDistance = i0.f.v(s0Var.dragTotalDistance, delta);
            s0 s0Var2 = s0.this;
            s0Var2.Y(i0.f.d(i0.f.v(s0Var2.dragBeginPosition, s0.this.dragTotalDistance)));
            s0 s0Var3 = s0.this;
            androidx.compose.ui.text.input.z0 Q = s0Var3.Q();
            i0.f A = s0.this.A();
            kotlin.jvm.internal.l0.m(A);
            s0Var3.m0(Q, A.getPackedValue(), false, this.f8137b, w.INSTANCE.l(), true);
            s0.this.l0(false);
        }

        @Override // androidx.compose.foundation.text.o0
        public void onCancel() {
        }

        @Override // androidx.compose.foundation.text.o0
        public void onStop() {
            s0.this.Z(null);
            s0.this.Y(null);
            s0.this.l0(true);
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/text/selection/s0$c", "Landroidx/compose/foundation/text/selection/j;", "Li0/f;", "downPosition", "", "e", "(J)Z", "dragPosition", "b", "Landroidx/compose/foundation/text/selection/w;", "adjustment", "c", "(JLandroidx/compose/foundation/text/selection/w;)Z", "d", "Lkotlin/k2;", "a", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements j {
        c() {
        }

        @Override // androidx.compose.foundation.text.selection.j
        public void a() {
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean b(long dragPosition) {
            c1 state;
            if (s0.this.Q().i().length() == 0 || (state = s0.this.getState()) == null || state.h() == null) {
                return false;
            }
            s0 s0Var = s0.this;
            s0Var.m0(s0Var.Q(), dragPosition, false, false, w.INSTANCE.m(), false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean c(long downPosition, @fg.l w adjustment) {
            c1 state;
            if (s0.this.Q().i().length() == 0 || (state = s0.this.getState()) == null || state.h() == null) {
                return false;
            }
            androidx.compose.ui.focus.a0 focusRequester = s0.this.getFocusRequester();
            if (focusRequester != null) {
                focusRequester.e();
            }
            s0.this.dragBeginPosition = downPosition;
            s0.this.previousRawDragOffset = -1;
            s0.w(s0.this, false, 1, null);
            s0 s0Var = s0.this;
            s0Var.m0(s0Var.Q(), s0.this.dragBeginPosition, true, false, adjustment, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean d(long dragPosition, @fg.l w adjustment) {
            c1 state;
            if (s0.this.Q().i().length() == 0 || (state = s0.this.getState()) == null || state.h() == null) {
                return false;
            }
            s0 s0Var = s0.this;
            s0Var.m0(s0Var.Q(), dragPosition, false, false, adjustment, false);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.j
        public boolean e(long downPosition) {
            c1 state = s0.this.getState();
            if (state == null || state.h() == null) {
                return false;
            }
            s0.this.previousRawDragOffset = -1;
            s0 s0Var = s0.this;
            s0Var.m0(s0Var.Q(), downPosition, false, false, w.INSTANCE.m(), false);
            return true;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f8139b = new d(1);

        d() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
        }

        @Override // ld.l
        public k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        e() {
            super(0);
        }

        public final void a() {
            s0.p(s0.this, false, 1, null);
            s0.this.T();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        f() {
            super(0);
        }

        public final void a() {
            s0.this.s();
            s0.this.T();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        g() {
            super(0);
        }

        public final void a() {
            s0.this.V();
            s0.this.T();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        h() {
            super(0);
        }

        public final void a() {
            s0.this.W();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"androidx/compose/foundation/text/selection/s0$i", "Landroidx/compose/foundation/text/o0;", "Li0/f;", "point", "Lkotlin/k2;", "a", "(J)V", "c", "()V", "startPoint", "b", "delta", "d", "onStop", "onCancel", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class i implements androidx.compose.foundation.text.o0 {
        i() {
        }

        @Override // androidx.compose.foundation.text.o0
        public void a(long point) {
        }

        @Override // androidx.compose.foundation.text.o0
        public void b(long startPoint) {
            e1 h4;
            e1 h5;
            if (s0.this.C() != null) {
                return;
            }
            s0.this.Z(androidx.compose.foundation.text.o.SelectionEnd);
            s0.this.previousRawDragOffset = -1;
            s0.this.T();
            c1 state = s0.this.getState();
            if (state == null || (h5 = state.h()) == null || !h5.j(startPoint)) {
                c1 state2 = s0.this.getState();
                if (state2 != null && (h4 = state2.h()) != null) {
                    s0 s0Var = s0.this;
                    int a5 = s0Var.getOffsetMapping().a(e1.h(h4, startPoint, false, 2, null));
                    androidx.compose.ui.text.input.z0 q4 = s0Var.q(s0Var.Q().getAnnotatedString(), androidx.compose.ui.text.u0.b(a5, a5));
                    s0Var.v(false);
                    s0Var.c0(androidx.compose.foundation.text.p.Cursor);
                    k0.a hapticFeedBack = s0Var.getHapticFeedBack();
                    if (hapticFeedBack != null) {
                        k0.b.INSTANCE.getClass();
                        hapticFeedBack.a(k0.d.f74804a.b());
                    }
                    s0Var.J().invoke(q4);
                }
            } else {
                if (s0.this.Q().i().length() == 0) {
                    return;
                }
                s0.this.v(false);
                s0 s0Var2 = s0.this;
                androidx.compose.ui.text.input.z0 Q = s0Var2.Q();
                androidx.compose.ui.text.t0.INSTANCE.getClass();
                s0.this.dragBeginOffsetInText = Integer.valueOf((int) (s0Var2.m0(androidx.compose.ui.text.input.z0.d(Q, null, androidx.compose.ui.text.t0.f21417c, null, 5, null), startPoint, true, false, w.INSTANCE.l(), true) >> 32));
            }
            s0.this.dragBeginPosition = startPoint;
            s0 s0Var3 = s0.this;
            s0Var3.Y(i0.f.d(s0Var3.dragBeginPosition));
            s0 s0Var4 = s0.this;
            i0.f.INSTANCE.getClass();
            s0Var4.dragTotalDistance = i0.f.f74147c;
        }

        @Override // androidx.compose.foundation.text.o0
        public void c() {
        }

        @Override // androidx.compose.foundation.text.o0
        public void d(long delta) {
            e1 h4;
            long m02;
            if (s0.this.Q().i().length() == 0) {
                return;
            }
            s0 s0Var = s0.this;
            s0Var.dragTotalDistance = i0.f.v(s0Var.dragTotalDistance, delta);
            c1 state = s0.this.getState();
            if (state != null && (h4 = state.h()) != null) {
                s0 s0Var2 = s0.this;
                s0Var2.Y(i0.f.d(i0.f.v(s0Var2.dragBeginPosition, s0Var2.dragTotalDistance)));
                if (s0Var2.dragBeginOffsetInText == null) {
                    i0.f A = s0Var2.A();
                    kotlin.jvm.internal.l0.m(A);
                    if (!h4.j(A.getPackedValue())) {
                        int a5 = s0Var2.getOffsetMapping().a(e1.h(h4, s0Var2.dragBeginPosition, false, 2, null));
                        androidx.compose.ui.text.input.p0 offsetMapping = s0Var2.getOffsetMapping();
                        i0.f A2 = s0Var2.A();
                        kotlin.jvm.internal.l0.m(A2);
                        w m4 = a5 == offsetMapping.a(e1.h(h4, A2.getPackedValue(), false, 2, null)) ? w.INSTANCE.m() : w.INSTANCE.l();
                        androidx.compose.ui.text.input.z0 Q = s0Var2.Q();
                        i0.f A3 = s0Var2.A();
                        kotlin.jvm.internal.l0.m(A3);
                        m02 = s0Var2.m0(Q, A3.getPackedValue(), false, false, m4, true);
                        androidx.compose.ui.text.t0.b(m02);
                    }
                }
                Integer num = s0Var2.dragBeginOffsetInText;
                int intValue = num != null ? num.intValue() : h4.g(s0Var2.dragBeginPosition, false);
                i0.f A4 = s0Var2.A();
                kotlin.jvm.internal.l0.m(A4);
                int g4 = h4.g(A4.getPackedValue(), false);
                if (s0Var2.dragBeginOffsetInText == null && intValue == g4) {
                    return;
                }
                androidx.compose.ui.text.input.z0 Q2 = s0Var2.Q();
                i0.f A5 = s0Var2.A();
                kotlin.jvm.internal.l0.m(A5);
                m02 = s0Var2.m0(Q2, A5.getPackedValue(), false, false, w.INSTANCE.l(), true);
                androidx.compose.ui.text.t0.b(m02);
            }
            s0.this.l0(false);
        }

        @Override // androidx.compose.foundation.text.o0
        public void onCancel() {
        }

        @Override // androidx.compose.foundation.text.o0
        public void onStop() {
            s0.this.Z(null);
            s0.this.Y(null);
            s0.this.l0(true);
            s0.this.dragBeginOffsetInText = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void O() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(i0.f fVar) {
        this.currentDragPosition.setValue(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(androidx.compose.foundation.text.o oVar) {
        this.draggingHandle.setValue(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(androidx.compose.foundation.text.p handleState) {
        c1 c1Var = this.state;
        if (c1Var != null) {
            if (c1Var.c() == handleState) {
                c1Var = null;
            }
            if (c1Var != null) {
                c1Var.w(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(boolean show) {
        c1 c1Var = this.state;
        if (c1Var != null) {
            c1Var.E(show);
        }
        if (show) {
            k0();
        } else {
            T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long m0(androidx.compose.ui.text.input.z0 value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, w adjustment, boolean isTouchBasedSelection) {
        e1 h4;
        k0.a aVar;
        int i4;
        c1 c1Var = this.state;
        if (c1Var == null || (h4 = c1Var.h()) == null) {
            androidx.compose.ui.text.t0.INSTANCE.getClass();
            return androidx.compose.ui.text.t0.f21417c;
        }
        long b5 = androidx.compose.ui.text.u0.b(this.offsetMapping.b(androidx.compose.ui.text.t0.n(value.getSelection())), this.offsetMapping.b((int) (value.getSelection() & 4294967295L)));
        int g4 = h4.g(currentPosition, false);
        int i5 = (isStartHandle || isStartOfSelection) ? g4 : (int) (b5 >> 32);
        int i6 = (!isStartHandle || isStartOfSelection) ? g4 : (int) (b5 & 4294967295L);
        d0 d0Var = this.previousSelectionLayout;
        int i7 = -1;
        if (!isStartOfSelection && d0Var != null && (i4 = this.previousRawDragOffset) != -1) {
            i7 = i4;
        }
        d0 c5 = f0.c(h4.getValue(), i5, i6, i7, b5, isStartOfSelection, isStartHandle);
        if (!c5.i(d0Var)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = c5;
        this.previousRawDragOffset = g4;
        q a5 = adjustment.a(c5);
        long b6 = androidx.compose.ui.text.u0.b(this.offsetMapping.a(a5.h().g()), this.offsetMapping.a(a5.f().g()));
        if (androidx.compose.ui.text.t0.g(b6, value.getSelection())) {
            return value.getSelection();
        }
        boolean z4 = androidx.compose.ui.text.t0.m(b6) != androidx.compose.ui.text.t0.m(value.getSelection()) && androidx.compose.ui.text.t0.g(androidx.compose.ui.text.u0.b((int) (b6 & 4294967295L), (int) (b6 >> 32)), value.getSelection());
        boolean z5 = androidx.compose.ui.text.t0.h(b6) && androidx.compose.ui.text.t0.h(value.getSelection());
        if (isTouchBasedSelection && value.i().length() > 0 && !z4 && !z5 && (aVar = this.hapticFeedBack) != null) {
            k0.b.INSTANCE.getClass();
            aVar.a(k0.d.f74804a.b());
        }
        androidx.compose.ui.text.input.z0 q4 = q(value.getAnnotatedString(), b6);
        this.onValueChange.invoke(q4);
        c0(androidx.compose.ui.text.t0.h(q4.getSelection()) ? androidx.compose.foundation.text.p.Cursor : androidx.compose.foundation.text.p.Selection);
        c1 c1Var2 = this.state;
        if (c1Var2 != null) {
            c1Var2.y(isTouchBasedSelection);
        }
        c1 c1Var3 = this.state;
        if (c1Var3 != null) {
            c1Var3.G(t0.c(this, true));
        }
        c1 c1Var4 = this.state;
        if (c1Var4 != null) {
            c1Var4.F(t0.c(this, false));
        }
        return b6;
    }

    public static /* synthetic */ void p(s0 s0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        s0Var.o(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.text.input.z0 q(androidx.compose.ui.text.e annotatedString, long selection) {
        return new androidx.compose.ui.text.input.z0(annotatedString, selection, (androidx.compose.ui.text.t0) null, 4, (kotlin.jvm.internal.w) null);
    }

    public static /* synthetic */ void u(s0 s0Var, i0.f fVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fVar = null;
        }
        s0Var.t(fVar);
    }

    public static /* synthetic */ void w(s0 s0Var, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        s0Var.v(z4);
    }

    private final i0.i z() {
        long j4;
        long j5;
        float f4;
        androidx.compose.ui.layout.u g4;
        androidx.compose.ui.text.n0 value;
        i0.i e4;
        androidx.compose.ui.layout.u g5;
        androidx.compose.ui.text.n0 value2;
        i0.i e5;
        androidx.compose.ui.layout.u g6;
        androidx.compose.ui.layout.u g7;
        c1 c1Var = this.state;
        if (c1Var != null) {
            if (c1Var.getIsLayoutResultStale()) {
                c1Var = null;
            }
            if (c1Var != null) {
                int b5 = this.offsetMapping.b(androidx.compose.ui.text.t0.n(Q().getSelection()));
                int b6 = this.offsetMapping.b((int) (Q().getSelection() & 4294967295L));
                c1 c1Var2 = this.state;
                if (c1Var2 == null || (g7 = c1Var2.g()) == null) {
                    i0.f.INSTANCE.getClass();
                    j4 = i0.f.f74147c;
                } else {
                    j4 = g7.r0(F(true));
                }
                c1 c1Var3 = this.state;
                if (c1Var3 == null || (g6 = c1Var3.g()) == null) {
                    i0.f.INSTANCE.getClass();
                    j5 = i0.f.f74147c;
                } else {
                    j5 = g6.r0(F(false));
                }
                c1 c1Var4 = this.state;
                float f5 = 0.0f;
                if (c1Var4 == null || (g5 = c1Var4.g()) == null) {
                    f4 = 0.0f;
                } else {
                    e1 h4 = c1Var.h();
                    f4 = i0.f.r(g5.r0(i0.g.a(0.0f, (h4 == null || (value2 = h4.getValue()) == null || (e5 = value2.e(b5)) == null) ? 0.0f : e5.getTop())));
                }
                c1 c1Var5 = this.state;
                if (c1Var5 != null && (g4 = c1Var5.g()) != null) {
                    e1 h5 = c1Var.h();
                    f5 = i0.f.r(g4.r0(i0.g.a(0.0f, (h5 == null || (value = h5.getValue()) == null || (e4 = value.e(b6)) == null) ? 0.0f : e4.getTop())));
                }
                return new i0.i(Math.min(i0.f.p(j4), i0.f.p(j5)), Math.min(f4, f5), Math.max(i0.f.p(j4), i0.f.p(j5)), (c1Var.getTextDelegate().getDensity().getDensity() * androidx.compose.ui.unit.h.g(25)) + Math.max(i0.f.r(j4), i0.f.r(j5)));
            }
        }
        i0.i.INSTANCE.getClass();
        return i0.i.f74153g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final i0.f A() {
        return (i0.f) this.currentDragPosition.getValue();
    }

    public final long B(@fg.l androidx.compose.ui.unit.d density) {
        int b5 = this.offsetMapping.b(androidx.compose.ui.text.t0.n(Q().getSelection()));
        c1 c1Var = this.state;
        e1 h4 = c1Var != null ? c1Var.h() : null;
        kotlin.jvm.internal.l0.m(h4);
        androidx.compose.ui.text.n0 value = h4.getValue();
        i0.i e4 = value.e(kotlin.ranges.s.I(b5, 0, value.getLayoutInput().getText().length()));
        return i0.g.a((density.v5(androidx.compose.foundation.text.p0.c()) / 2) + e4.t(), e4.j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.m
    public final androidx.compose.foundation.text.o C() {
        return (androidx.compose.foundation.text.o) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    @fg.m
    /* renamed from: E, reason: from getter */
    public final androidx.compose.ui.focus.a0 getFocusRequester() {
        return this.focusRequester;
    }

    public final long F(boolean isStartHandle) {
        e1 h4;
        androidx.compose.ui.text.n0 value;
        c1 c1Var = this.state;
        if (c1Var == null || (h4 = c1Var.h()) == null || (value = h4.getValue()) == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        androidx.compose.ui.text.e N = N();
        if (N == null) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        if (kotlin.jvm.internal.l0.g(N.getText(), value.getLayoutInput().getText().getText())) {
            long selection = Q().getSelection();
            return z0.b(value, this.offsetMapping.b(isStartHandle ? androidx.compose.ui.text.t0.n(selection) : androidx.compose.ui.text.t0.i(selection)), isStartHandle, androidx.compose.ui.text.t0.m(Q().getSelection()));
        }
        i0.f.INSTANCE.getClass();
        return i0.f.f74149e;
    }

    @fg.m
    /* renamed from: G, reason: from getter */
    public final k0.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @fg.l
    /* renamed from: H, reason: from getter */
    public final j getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    @fg.l
    /* renamed from: I, reason: from getter */
    public final androidx.compose.ui.text.input.p0 getOffsetMapping() {
        return this.offsetMapping;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.text.input.z0, k2> J() {
        return this.onValueChange;
    }

    @fg.m
    /* renamed from: K, reason: from getter */
    public final c1 getState() {
        return this.state;
    }

    @fg.m
    /* renamed from: L, reason: from getter */
    public final i5 getTextToolbar() {
        return this.textToolbar;
    }

    @fg.l
    /* renamed from: M, reason: from getter */
    public final androidx.compose.foundation.text.o0 getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    @fg.m
    public final androidx.compose.ui.text.e N() {
        androidx.compose.foundation.text.m0 textDelegate;
        c1 c1Var = this.state;
        if (c1Var == null || (textDelegate = c1Var.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    @fg.m
    /* renamed from: P, reason: from getter */
    public final j1 getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final androidx.compose.ui.text.input.z0 Q() {
        return (androidx.compose.ui.text.input.z0) this.value.getValue();
    }

    @fg.l
    /* renamed from: R, reason: from getter */
    public final k1 getVisualTransformation() {
        return this.visualTransformation;
    }

    @fg.l
    public final androidx.compose.foundation.text.o0 S(boolean isStartHandle) {
        return new b(isStartHandle);
    }

    public final void T() {
        i5 i5Var;
        i5 i5Var2 = this.textToolbar;
        if ((i5Var2 != null ? i5Var2.getStatus() : null) != k5.Shown || (i5Var = this.textToolbar) == null) {
            return;
        }
        i5Var.a();
    }

    public final boolean U() {
        return !kotlin.jvm.internal.l0.g(this.oldValue.i(), Q().i());
    }

    public final void V() {
        androidx.compose.ui.text.e b5;
        f1 f1Var = this.clipboardManager;
        if (f1Var == null || (b5 = f1Var.b()) == null) {
            return;
        }
        androidx.compose.ui.text.e q4 = a1.c(Q(), Q().i().length()).q(b5).q(a1.b(Q(), Q().i().length()));
        int length = b5.length() + androidx.compose.ui.text.t0.l(Q().getSelection());
        this.onValueChange.invoke(q(q4, androidx.compose.ui.text.u0.b(length, length)));
        c0(androidx.compose.foundation.text.p.None);
        j1 j1Var = this.undoManager;
        if (j1Var != null) {
            j1Var.a();
        }
    }

    public final void W() {
        androidx.compose.ui.text.input.z0 q4 = q(Q().getAnnotatedString(), androidx.compose.ui.text.u0.b(0, Q().i().length()));
        this.onValueChange.invoke(q4);
        this.oldValue = androidx.compose.ui.text.input.z0.d(this.oldValue, null, q4.getSelection(), null, 5, null);
        v(true);
    }

    public final void X(@fg.m f1 f1Var) {
        this.clipboardManager = f1Var;
    }

    public final void a0(boolean z4) {
        this.editable.setValue(Boolean.valueOf(z4));
    }

    public final void b0(@fg.m androidx.compose.ui.focus.a0 a0Var) {
        this.focusRequester = a0Var;
    }

    public final void d0(@fg.m k0.a aVar) {
        this.hapticFeedBack = aVar;
    }

    public final void e0(@fg.l androidx.compose.ui.text.input.p0 p0Var) {
        this.offsetMapping = p0Var;
    }

    public final void f0(@fg.l ld.l<? super androidx.compose.ui.text.input.z0, k2> lVar) {
        this.onValueChange = lVar;
    }

    public final void g0(@fg.m c1 c1Var) {
        this.state = c1Var;
    }

    public final void h0(@fg.m i5 i5Var) {
        this.textToolbar = i5Var;
    }

    public final void i0(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
        this.value.setValue(z0Var);
    }

    public final void j0(@fg.l k1 k1Var) {
        this.visualTransformation = k1Var;
    }

    public final void k0() {
        f1 f1Var;
        c1 c1Var = this.state;
        if (c1Var == null || c1Var.u()) {
            boolean z4 = this.visualTransformation instanceof androidx.compose.ui.text.input.r0;
            e eVar = (androidx.compose.ui.text.t0.h(Q().getSelection()) || z4) ? null : new e();
            f fVar = (androidx.compose.ui.text.t0.h(Q().getSelection()) || !D() || z4) ? null : new f();
            g gVar = (D() && (f1Var = this.clipboardManager) != null && f1Var.a()) ? new g() : null;
            h hVar = androidx.compose.ui.text.t0.j(Q().getSelection()) != Q().i().length() ? new h() : null;
            i5 i5Var = this.textToolbar;
            if (i5Var != null) {
                i5Var.c(z(), eVar, gVar, fVar, hVar);
            }
        }
    }

    public final void n(long position) {
        e1 h4;
        c1 c1Var = this.state;
        if (c1Var == null || (h4 = c1Var.h()) == null) {
            return;
        }
        if (androidx.compose.ui.text.t0.e(Q().getSelection(), e1.h(h4, position, false, 2, null))) {
            return;
        }
        this.previousRawDragOffset = -1;
        m0(Q(), position, true, false, w.INSTANCE.o(), false);
    }

    public final void o(boolean cancelSelection) {
        if (androidx.compose.ui.text.t0.h(Q().getSelection())) {
            return;
        }
        f1 f1Var = this.clipboardManager;
        if (f1Var != null) {
            f1Var.c(a1.a(Q()));
        }
        if (cancelSelection) {
            int k4 = androidx.compose.ui.text.t0.k(Q().getSelection());
            this.onValueChange.invoke(q(Q().getAnnotatedString(), androidx.compose.ui.text.u0.b(k4, k4)));
            c0(androidx.compose.foundation.text.p.None);
        }
    }

    @fg.l
    public final androidx.compose.foundation.text.o0 r() {
        return new a();
    }

    public final void s() {
        if (androidx.compose.ui.text.t0.h(Q().getSelection())) {
            return;
        }
        f1 f1Var = this.clipboardManager;
        if (f1Var != null) {
            f1Var.c(a1.a(Q()));
        }
        androidx.compose.ui.text.e q4 = a1.c(Q(), Q().i().length()).q(a1.b(Q(), Q().i().length()));
        int l4 = androidx.compose.ui.text.t0.l(Q().getSelection());
        this.onValueChange.invoke(q(q4, androidx.compose.ui.text.u0.b(l4, l4)));
        c0(androidx.compose.foundation.text.p.None);
        j1 j1Var = this.undoManager;
        if (j1Var != null) {
            j1Var.a();
        }
    }

    public final void t(@fg.m i0.f position) {
        if (!androidx.compose.ui.text.t0.h(Q().getSelection())) {
            c1 c1Var = this.state;
            e1 h4 = c1Var != null ? c1Var.h() : null;
            int k4 = (position == null || h4 == null) ? androidx.compose.ui.text.t0.k(Q().getSelection()) : this.offsetMapping.a(e1.h(h4, position.getPackedValue(), false, 2, null));
            this.onValueChange.invoke(androidx.compose.ui.text.input.z0.d(Q(), null, androidx.compose.ui.text.u0.b(k4, k4), null, 5, null));
        }
        c0((position == null || Q().i().length() <= 0) ? androidx.compose.foundation.text.p.None : androidx.compose.foundation.text.p.Cursor);
        l0(false);
    }

    public final void v(boolean showFloatingToolbar) {
        androidx.compose.ui.focus.a0 a0Var;
        c1 c1Var = this.state;
        if (c1Var != null && !c1Var.d() && (a0Var = this.focusRequester) != null) {
            a0Var.e();
        }
        this.oldValue = Q();
        l0(showFloatingToolbar);
        c0(androidx.compose.foundation.text.p.Selection);
    }

    public final void x() {
        l0(false);
        c0(androidx.compose.foundation.text.p.None);
    }

    @fg.m
    /* renamed from: y, reason: from getter */
    public final f1 getClipboardManager() {
        return this.clipboardManager;
    }

    public s0(@fg.m j1 j1Var) {
        androidx.compose.runtime.k2 g4;
        androidx.compose.runtime.k2 g5;
        androidx.compose.runtime.k2 g6;
        androidx.compose.runtime.k2 g7;
        this.undoManager = j1Var;
        this.offsetMapping = n1.b();
        this.onValueChange = d.f8139b;
        g4 = t4.g(new androidx.compose.ui.text.input.z0((String) null, 0L, (androidx.compose.ui.text.t0) null, 7, (kotlin.jvm.internal.w) null), null, 2, null);
        this.value = g4;
        this.visualTransformation = k1.INSTANCE.c();
        g5 = t4.g(Boolean.TRUE, null, 2, null);
        this.editable = g5;
        f.Companion companion = i0.f.INSTANCE;
        companion.getClass();
        this.dragBeginPosition = i0.f.f74147c;
        companion.getClass();
        this.dragTotalDistance = i0.f.f74147c;
        g6 = t4.g(null, null, 2, null);
        this.draggingHandle = g6;
        g7 = t4.g(null, null, 2, null);
        this.currentDragPosition = g7;
        this.previousRawDragOffset = -1;
        this.oldValue = new androidx.compose.ui.text.input.z0((String) null, 0L, (androidx.compose.ui.text.t0) null, 7, (kotlin.jvm.internal.w) null);
        this.touchSelectionObserver = new i();
        this.mouseSelectionObserver = new c();
    }

    public /* synthetic */ s0(j1 j1Var, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : j1Var);
    }
}
