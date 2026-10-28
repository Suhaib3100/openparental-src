package androidx.compose.ui.node;

import androidx.compose.ui.graphics.q4;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.node.h0;
import androidx.compose.ui.unit.q;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: LayoutNodeLayoutDelegate.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0017\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001cR$\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001eR$\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0016\u00105\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001cR\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R*\u0010A\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010@R*\u0010E\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010@R*\u0010K\u001a\u0002062\u0006\u0010<\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010Q\u001a\u00060LR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR0\u0010W\u001a\b\u0018\u00010RR\u00020\u00002\f\u0010\u001a\u001a\b\u0018\u00010RR\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010X\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0011\u0010`\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0019\u0010c\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0019\u0010e\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bd\u0010bR\u0014\u0010g\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010HR\u0014\u0010h\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010HR\u0014\u0010k\u001a\u00020i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010jR\u0016\u0010m\u001a\u0004\u0018\u00010i8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010j\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/ui/node/m0;", "", "Landroidx/compose/ui/node/h0;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/h0;)V", "Landroidx/compose/ui/unit/b;", "constraints", "Lkotlin/k2;", "R", "(J)V", "Q", "L", "()V", "O", "M", "N", "P", "q", "W", "J", "S", "K", "a", "Landroidx/compose/ui/node/h0;", "", "<set-?>", "b", "Z", "v", "()Z", "detachedFromParentLookaheadPass", "Landroidx/compose/ui/node/h0$e;", "c", "Landroidx/compose/ui/node/h0$e;", "A", "()Landroidx/compose/ui/node/h0$e;", "layoutState", "d", "G", "measurePending", "e", "z", "layoutPending", "f", "layoutPendingForAlignment", "g", "D", "lookaheadMeasurePending", "h", "C", "lookaheadLayoutPending", "i", "lookaheadLayoutPendingForAlignment", "", "j", "I", "nextChildLookaheadPlaceOrder", "k", "nextChildPlaceOrder", "value", "l", "u", "V", "(Z)V", "coordinatesAccessedDuringPlacement", "m", "t", "U", "coordinatesAccessedDuringModifierPlacement", "n", "s", "()I", "T", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "Landroidx/compose/ui/node/m0$b;", "o", "Landroidx/compose/ui/node/m0$b;", "F", "()Landroidx/compose/ui/node/m0$b;", "measurePassDelegate", "Landroidx/compose/ui/node/m0$a;", "p", "Landroidx/compose/ui/node/m0$a;", "E", "()Landroidx/compose/ui/node/m0$a;", "lookaheadPassDelegate", "performMeasureConstraints", "Lkotlin/Function0;", "r", "Lld/a;", "performMeasureBlock", "Landroidx/compose/ui/node/e1;", "H", "()Landroidx/compose/ui/node/e1;", "outerCoordinator", "x", "()Landroidx/compose/ui/unit/b;", "lastConstraints", "y", "lastLookaheadConstraints", "w", "height", "width", "Landroidx/compose/ui/node/b;", "()Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "B", "lookaheadAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n1#2:1782\n*E\n"})
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: s, reason: collision with root package name */
    public static final int f19355s = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPass;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean measurePending;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPending;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int nextChildLookaheadPlaceOrder;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nextChildPlaceOrder;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringModifierPlacement;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a lookaheadPassDelegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private h0.e layoutState = h0.e.Idle;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b measurePassDelegate = new b();

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long performMeasureConstraints = androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null);

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<k2> performMeasureBlock = new d();

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\rJ\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\rJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\rJ\u001a\u0010#\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b&\u0010'J=\u0010/\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0019\u0010.\u001a\u0015\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b-H\u0014ø\u0001\u0000¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u0019H\u0096\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001aH\u0016¢\u0006\u0004\b7\u00106J\u0017\u00109\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001aH\u0016¢\u0006\u0004\b9\u00106J\u0017\u0010:\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001aH\u0016¢\u0006\u0004\b:\u00106J\u0015\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020%¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\rJ\r\u0010?\u001a\u00020%¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\bH\u0000¢\u0006\u0004\bA\u0010\rJ\r\u0010B\u001a\u00020\b¢\u0006\u0004\bB\u0010\rJ\r\u0010C\u001a\u00020\b¢\u0006\u0004\bC\u0010\rR\u0016\u0010E\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u00109R\u001e\u0010I\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001a8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010O\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010H\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010W\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010[\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u00109\u001a\u0004\bY\u0010@\"\u0004\bZ\u0010=R\"\u0010_\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u00109\u001a\u0004\b]\u0010@\"\u0004\b^\u0010=R\u0016\u0010a\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u00109R\u001e\u0010d\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bb\u0010cR*\u0010i\u001a\u00020(2\u0006\u0010F\u001a\u00020(8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR$\u0010m\u001a\u00020*2\u0006\u0010F\u001a\u00020*8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b2\u0010j\u001a\u0004\bk\u0010lRJ\u0010r\u001a\u0015\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b-2\u0019\u0010F\u001a\u0015\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b-8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\"\u0010u\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bs\u00109\u001a\u0004\bX\u0010@\"\u0004\bt\u0010=R\u001a\u0010y\u001a\u00020v8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010w\u001a\u0004\be\u0010xR\u001e\u0010}\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\u00070z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R$\u0010\u0081\u0001\u001a\u00020%8\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b~\u00109\u001a\u0004\b\u007f\u0010@\"\u0005\b\u0080\u0001\u0010=R'\u0010\u0084\u0001\u001a\u00020%2\u0006\u0010F\u001a\u00020%8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u0082\u0001\u00109\u001a\u0005\b\u0083\u0001\u0010@R\u0018\u0010\u0086\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u00109R.\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010F\u001a\u0005\u0018\u00010\u0087\u00018\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\b\u001b\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008d\u0001\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u00109R\u001c\u0010\u0091\u0001\u001a\u00070\u008e\u0001R\u00020\u00078@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001c\u0010\u0094\u0001\u001a\u0004\u0018\u00010!8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\"\u0010\u009c\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020\u00070\u0099\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bH\u0010\u009d\u0001R\u0016\u0010 \u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010LR\u0015\u0010¡\u0001\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¢\u0001"}, d2 = {"Landroidx/compose/ui/node/m0$a;", "Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/node/b;", "<init>", "(Landroidx/compose/ui/node/m0;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/node/m0;", "Lkotlin/k2;", "block", "Q0", "(Lld/l;)V", "N0", "()V", "A1", "Landroidx/compose/ui/node/h0;", "node", "h2", "(Landroidx/compose/ui/node/h0;)V", "K1", "P0", "y1", "I1", "V", "", "Landroidx/compose/ui/layout/a;", "", "y", "()Ljava/util/Map;", "N", "requestLayout", "s0", "F1", "Landroidx/compose/ui/unit/b;", "constraints", "m0", "(J)Landroidx/compose/ui/layout/i1;", "", "P1", "(J)Z", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "layerBlock", "H0", "(JFLld/l;)V", "alignmentLine", "q", "(Landroidx/compose/ui/layout/a;)I", "height", "k0", "(I)I", "l0", "width", "Z", "t", "forceRequest", "t1", "(Z)V", "x1", "m2", "()Z", "M1", "V1", "L1", "h", "relayoutWithoutParentInProgress", "<set-?>", "i", "I", "previousPlaceOrder", "j", "m1", "()I", "d2", "(I)V", "placeOrder", "Landroidx/compose/ui/node/h0$g;", "k", "Landroidx/compose/ui/node/h0$g;", "k1", "()Landroidx/compose/ui/node/h0$g;", "Z1", "(Landroidx/compose/ui/node/h0$g;)V", "measuredByParent", "l", "Y0", "X1", "duringAlignmentLinesQuery", "m", "r1", "f2", "placedOnce", "n", "measuredOnce", "o", "Landroidx/compose/ui/unit/b;", "lookaheadConstraints", "p", "J", "e1", "()J", "lastPosition", "F", "f1", "()F", "lastZIndex", "r", "Lld/l;", "c1", "()Lld/l;", "lastLayerBlock", "s", "e2", "isPlaced", "Landroidx/compose/ui/node/a;", "Landroidx/compose/ui/node/a;", "()Landroidx/compose/ui/node/a;", "alignmentLines", "Landroidx/compose/runtime/collection/g;", "u", "Landroidx/compose/runtime/collection/g;", "_childDelegates", "v", "V0", "W1", "childDelegatesDirty", "w", "g1", "layingOutChildren", "x", "parentDataDirty", "", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "parentData", "z", "onNodePlacedCalled", "Landroidx/compose/ui/node/m0$b;", "h1", "()Landroidx/compose/ui/node/m0$b;", "measurePassDelegate", "Z0", "()Landroidx/compose/ui/unit/b;", "lastConstraints", "Landroidx/compose/ui/node/e1;", "i0", "()Landroidx/compose/ui/node/e1;", "innerCoordinator", "", "S0", "()Ljava/util/List;", "childDelegates", "()Landroidx/compose/ui/node/b;", "parentAlignmentLinesOwner", "W", "measuredWidth", "measuredHeight", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n1078#1:1820\n1079#1,2:1829\n1078#1:1835\n1079#1,2:1844\n1078#1:1874\n1079#1,2:1883\n1187#2,2:1782\n1699#3:1784\n1700#3,6:1793\n1706#3,5:1803\n199#4:1785\n197#4:1808\n197#4:1821\n197#4:1836\n197#4:1850\n197#4:1862\n197#4:1875\n197#4:1889\n197#4:1901\n476#5,7:1786\n483#5,4:1799\n460#5,11:1809\n460#5,7:1822\n467#5,4:1831\n460#5,7:1837\n467#5,4:1846\n460#5,11:1851\n460#5,11:1863\n460#5,7:1876\n467#5,4:1885\n460#5,11:1890\n460#5,11:1902\n1#6:1913\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate\n*L\n1141#1:1820\n1141#1:1829,2\n1156#1:1835\n1156#1:1844,2\n1512#1:1874\n1512#1:1883,2\n1058#1:1782,2\n1067#1:1784\n1067#1:1793,6\n1067#1:1803,5\n1067#1:1785\n1078#1:1808\n1141#1:1821\n1156#1:1836\n1183#1:1850\n1209#1:1862\n1512#1:1875\n1534#1:1889\n1567#1:1901\n1067#1:1786,7\n1067#1:1799,4\n1078#1:1809,11\n1141#1:1822,7\n1141#1:1831,4\n1156#1:1837,7\n1156#1:1846,4\n1183#1:1851,11\n1209#1:1863,11\n1512#1:1876,7\n1512#1:1885,4\n1534#1:1890,11\n1567#1:1902,11\n*E\n"})
    public final class a extends androidx.compose.ui.layout.i1 implements androidx.compose.ui.layout.l0, androidx.compose.ui.node.b {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean relayoutWithoutParentInProgress;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int previousPlaceOrder = Integer.MAX_VALUE;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int placeOrder = Integer.MAX_VALUE;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private h0.g measuredByParent = h0.g.NotUsed;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private androidx.compose.ui.unit.b lookaheadConstraints;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private float lastZIndex;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.l<? super q4, k2> lastLayerBlock;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean isPlaced;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.node.a alignmentLines;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.collection.g<a> _childDelegates;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        private boolean childDelegatesDirty;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        private boolean layingOutChildren;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private boolean parentDataDirty;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Object parentData;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        private boolean onNodePlacedCalled;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.node.m0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0349a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19393a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f19394b;

            static {
                int[] iArr = new int[h0.e.values().length];
                try {
                    iArr[h0.e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h0.e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[h0.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[h0.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f19393a = iArr;
                int[] iArr2 = new int[h0.g.values().length];
                try {
                    iArr2[h0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[h0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f19394b = iArr2;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        @kotlin.jvm.internal.r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1781:1\n33#2,6:1782\n33#2,6:1788\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1\n*L\n1107#1:1782,6\n1114#1:1788,6\n*E\n"})
        static final class b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0 f19396c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ m0 f19397d;

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "child", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.node.m0$a$b$a, reason: collision with other inner class name */
            static final class C0350a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.b, k2> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0350a f19398b = new C0350a(1);

                C0350a() {
                    super(1);
                }

                public final void a(@fg.l androidx.compose.ui.node.b bVar) {
                    bVar.getAlignmentLines().y(false);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.b bVar) {
                    a(bVar);
                    return k2.f75408a;
                }
            }

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "child", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.node.m0$a$b$b, reason: collision with other inner class name */
            static final class C0351b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.b, k2> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0351b f19399b = new C0351b(1);

                C0351b() {
                    super(1);
                }

                public final void a(@fg.l androidx.compose.ui.node.b bVar) {
                    bVar.getAlignmentLines().v(bVar.getAlignmentLines().getUsedDuringParentLayout());
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.b bVar) {
                    a(bVar);
                    return k2.f75408a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(r0 r0Var, m0 m0Var) {
                super(0);
                this.f19396c = r0Var;
                this.f19397d = m0Var;
            }

            public final void a() {
                a.this.P0();
                a.this.N(C0350a.f19398b);
                r0 lookaheadDelegate = a.this.i0().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                    List<h0> Y = this.f19397d.layoutNode.Y();
                    int size = Y.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        r0 lookaheadDelegate2 = Y.get(i4).z0().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            lookaheadDelegate2.k1(isPlacingForAlignment);
                        }
                    }
                }
                this.f19396c.S0().q();
                r0 lookaheadDelegate3 = a.this.i0().getLookaheadDelegate();
                if (lookaheadDelegate3 != null) {
                    lookaheadDelegate3.getIsPlacingForAlignment();
                    List<h0> Y2 = this.f19397d.layoutNode.Y();
                    int size2 = Y2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        r0 lookaheadDelegate4 = Y2.get(i5).z0().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.k1(false);
                        }
                    }
                }
                a.this.N0();
                a.this.N(C0351b.f19399b);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f19400b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ p1 f19401c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ long f19402d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m0 m0Var, p1 p1Var, long j4) {
                super(0);
                this.f19400b = m0Var;
                this.f19401c = p1Var;
                this.f19402d = j4;
            }

            public final void a() {
                r0 lookaheadDelegate;
                i1.a aVar = null;
                if (n0.a(this.f19400b.layoutNode)) {
                    e1 wrappedBy = this.f19400b.H().getWrappedBy();
                    if (wrappedBy != null) {
                        aVar = wrappedBy.getPlacementScope();
                    }
                } else {
                    e1 wrappedBy2 = this.f19400b.H().getWrappedBy();
                    if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                        aVar = lookaheadDelegate.getPlacementScope();
                    }
                }
                if (aVar == null) {
                    aVar = this.f19401c.C();
                }
                m0 m0Var = this.f19400b;
                long j4 = this.f19402d;
                r0 lookaheadDelegate2 = m0Var.H().getLookaheadDelegate();
                kotlin.jvm.internal.l0.m(lookaheadDelegate2);
                i1.a.i(aVar, lookaheadDelegate2, j4, 0.0f, 2, null);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.b, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f19403b = new d(1);

            d() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.node.b bVar) {
                bVar.getAlignmentLines().z(false);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.b bVar) {
                a(bVar);
                return k2.f75408a;
            }
        }

        public a() {
            androidx.compose.ui.unit.q.INSTANCE.getClass();
            this.lastPosition = androidx.compose.ui.unit.q.f21519c;
            this.alignmentLines = new p0(this, null);
            this._childDelegates = new androidx.compose.runtime.collection.g<>(new a[16], 0);
            this.childDelegatesDirty = true;
            this.parentDataDirty = true;
            this.parentData = m0.this.getMeasurePassDelegate().getParentData();
        }

        private final void A1() {
            if (this.isPlaced) {
                int i4 = 0;
                this.isPlaced = false;
                androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
                int size = H0.getSize();
                if (size > 0) {
                    h0[] L = H0.L();
                    do {
                        a lookaheadPassDelegate = L[i4].getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                        lookaheadPassDelegate.A1();
                        i4++;
                    } while (i4 < size);
                }
            }
        }

        private final void I1() {
            h0 h0Var = m0.this.layoutNode;
            m0 m0Var = m0.this;
            androidx.compose.runtime.collection.g<h0> H0 = h0Var.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    h0 h0Var2 = L[i4];
                    if (h0Var2.n0() && h0Var2.u0() == h0.g.InMeasureBlock) {
                        a lookaheadPassDelegate = h0Var2.getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                        androidx.compose.ui.unit.b y4 = h0Var2.getLayoutDelegate().y();
                        kotlin.jvm.internal.l0.m(y4);
                        if (lookaheadPassDelegate.P1(y4.getValue())) {
                            h0.w1(m0Var.layoutNode, false, false, 3, null);
                        }
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        private final void K1() {
            h0.w1(m0.this.layoutNode, false, false, 3, null);
            h0 B0 = m0.this.layoutNode.B0();
            if (B0 == null || m0.this.layoutNode.getIntrinsicsUsageByParent() != h0.g.NotUsed) {
                return;
            }
            h0 h0Var = m0.this.layoutNode;
            int i4 = C0349a.f19393a[B0.l0().ordinal()];
            h0Var.I1(i4 != 2 ? i4 != 3 ? B0.getIntrinsicsUsageByParent() : h0.g.InLayoutBlock : h0.g.InMeasureBlock);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N0() {
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    a lookaheadPassDelegate = L[i4].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                    int i5 = lookaheadPassDelegate.previousPlaceOrder;
                    int i6 = lookaheadPassDelegate.placeOrder;
                    if (i5 != i6 && i6 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate.A1();
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void P0() {
            int i4 = 0;
            m0.this.nextChildLookaheadPlaceOrder = 0;
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                do {
                    a lookaheadPassDelegate = L[i4].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                    lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.placeOrder;
                    lookaheadPassDelegate.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate.measuredByParent == h0.g.InLayoutBlock) {
                        lookaheadPassDelegate.measuredByParent = h0.g.NotUsed;
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        private final void Q0(ld.l<? super a, k2> block) {
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    a lookaheadPassDelegate = L[i4].getLayoutDelegate().getLookaheadPassDelegate();
                    kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                    block.invoke(lookaheadPassDelegate);
                    i4++;
                } while (i4 < size);
            }
        }

        private final void h2(h0 node) {
            h0.g gVar;
            h0 B0 = node.B0();
            if (B0 == null) {
                this.measuredByParent = h0.g.NotUsed;
                return;
            }
            if (this.measuredByParent != h0.g.NotUsed && !node.getCanMultiMeasure()) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i4 = C0349a.f19393a[B0.l0().ordinal()];
            if (i4 == 1 || i4 == 2) {
                gVar = h0.g.InMeasureBlock;
            } else {
                if (i4 != 3 && i4 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + B0.l0());
                }
                gVar = h0.g.InLayoutBlock;
            }
            this.measuredByParent = gVar;
        }

        private final void y1() {
            boolean z4 = this.isPlaced;
            this.isPlaced = true;
            int i4 = 0;
            if (!z4 && m0.this.getLookaheadMeasurePending()) {
                h0.w1(m0.this.layoutNode, true, false, 2, null);
            }
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                do {
                    h0 h0Var = L[i4];
                    if (h0Var.C0() != Integer.MAX_VALUE) {
                        a o02 = h0Var.o0();
                        kotlin.jvm.internal.l0.m(o02);
                        o02.y1();
                        h0Var.B1(h0Var);
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        public final void F1() {
            androidx.compose.runtime.collection.g<h0> H0;
            int size;
            if (m0.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (H0 = m0.this.layoutNode.H0()).getSize()) <= 0) {
                return;
            }
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                m0 layoutDelegate = h0Var.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    h0.u1(h0Var, false, 1, null);
                }
                a lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.F1();
                }
                i4++;
            } while (i4 < size);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.i1
        public void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
            if (m0.this.layoutNode.getIsDeactivated()) {
                throw new IllegalArgumentException("place is called on a deactivated node");
            }
            m0.this.layoutState = h0.e.LookaheadLayingOut;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!androidx.compose.ui.unit.q.j(position, this.lastPosition)) {
                if (m0.this.getCoordinatesAccessedDuringModifierPlacement() || m0.this.getCoordinatesAccessedDuringPlacement()) {
                    m0.this.lookaheadLayoutPending = true;
                }
                F1();
            }
            p1 d5 = l0.d(m0.this.layoutNode);
            if (m0.this.getLookaheadLayoutPending() || !this.isPlaced) {
                m0.this.U(false);
                this.alignmentLines.w(false);
                r1.d(d5.getSnapshotObserver(), m0.this.layoutNode, false, new c(m0.this, d5, position), 2, null);
            } else {
                r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
                kotlin.jvm.internal.l0.m(lookaheadDelegate);
                lookaheadDelegate.M1(position);
                M1();
            }
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            m0.this.layoutState = h0.e.Idle;
        }

        @Override // androidx.compose.ui.node.b
        @fg.m
        public androidx.compose.ui.node.b I() {
            m0 layoutDelegate;
            h0 B0 = m0.this.layoutNode.B0();
            if (B0 == null || (layoutDelegate = B0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.B();
        }

        public final void L1() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            this.isPlaced = false;
        }

        public final void M1() {
            this.onNodePlacedCalled = true;
            h0 B0 = m0.this.layoutNode.B0();
            if (!this.isPlaced) {
                y1();
                if (this.relayoutWithoutParentInProgress && B0 != null) {
                    h0.u1(B0, false, 1, null);
                }
            }
            if (B0 == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && (B0.l0() == h0.e.LayingOut || B0.l0() == h0.e.LookaheadLayingOut)) {
                if (this.placeOrder != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                this.placeOrder = B0.getLayoutDelegate().nextChildLookaheadPlaceOrder;
                B0.getLayoutDelegate().nextChildLookaheadPlaceOrder++;
            }
            V();
        }

        @Override // androidx.compose.ui.node.b
        public void N(@fg.l ld.l<? super androidx.compose.ui.node.b, k2> block) {
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    androidx.compose.ui.node.b B = L[i4].getLayoutDelegate().B();
                    kotlin.jvm.internal.l0.m(B);
                    block.invoke(B);
                    i4++;
                } while (i4 < size);
            }
        }

        public final boolean P1(long constraints) {
            if (m0.this.layoutNode.getIsDeactivated()) {
                throw new IllegalArgumentException("measure is called on a deactivated node");
            }
            h0 B0 = m0.this.layoutNode.B0();
            m0.this.layoutNode.E1(m0.this.layoutNode.getCanMultiMeasure() || (B0 != null && B0.getCanMultiMeasure()));
            if (!m0.this.layoutNode.n0()) {
                androidx.compose.ui.unit.b bVar = this.lookaheadConstraints;
                if (bVar == null ? false : androidx.compose.ui.unit.b.g(bVar.getValue(), constraints)) {
                    p1 owner = m0.this.layoutNode.getOwner();
                    if (owner != null) {
                        owner.E(m0.this.layoutNode, true);
                    }
                    m0.this.layoutNode.D1();
                    return false;
                }
            }
            this.lookaheadConstraints = androidx.compose.ui.unit.b.b(constraints);
            J0(constraints);
            this.alignmentLines.x(false);
            N(d.f19403b);
            long measuredSize = this.measuredOnce ? getMeasuredSize() : androidx.compose.ui.unit.v.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.measuredOnce = true;
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                throw new IllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
            }
            m0.this.Q(constraints);
            I0(androidx.compose.ui.unit.v.a(lookaheadDelegate.getWidth(), lookaheadDelegate.getHeight()));
            return (androidx.compose.ui.unit.u.m(measuredSize) == lookaheadDelegate.getWidth() && ((int) (4294967295L & measuredSize)) == lookaheadDelegate.getHeight()) ? false : true;
        }

        @fg.l
        public final List<a> S0() {
            m0.this.layoutNode.Y();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.l();
            }
            h0 h0Var = m0.this.layoutNode;
            androidx.compose.runtime.collection.g<a> gVar = this._childDelegates;
            androidx.compose.runtime.collection.g<h0> H0 = h0Var.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    h0 h0Var2 = L[i4];
                    if (gVar.getSize() <= i4) {
                        a lookaheadPassDelegate = h0Var2.getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                        gVar.b(lookaheadPassDelegate);
                    } else {
                        a lookaheadPassDelegate2 = h0Var2.getLayoutDelegate().getLookaheadPassDelegate();
                        kotlin.jvm.internal.l0.m(lookaheadPassDelegate2);
                        gVar.s0(i4, lookaheadPassDelegate2);
                    }
                    i4++;
                } while (i4 < size);
            }
            gVar.p0(h0Var.Y().size(), gVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.l();
        }

        @Override // androidx.compose.ui.node.b
        public void V() {
            this.layingOutChildren = true;
            this.alignmentLines.s();
            if (m0.this.getLookaheadLayoutPending()) {
                I1();
            }
            r0 lookaheadDelegate = i0().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            if (m0.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && m0.this.getLookaheadLayoutPending())) {
                m0.this.lookaheadLayoutPending = false;
                h0.e layoutState = m0.this.getLayoutState();
                m0.this.layoutState = h0.e.LookaheadLayingOut;
                p1 d5 = l0.d(m0.this.layoutNode);
                m0.this.V(false);
                r1.f(d5.getSnapshotObserver(), m0.this.layoutNode, false, new b(lookaheadDelegate, m0.this), 2, null);
                m0.this.layoutState = layoutState;
                if (m0.this.getCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                m0.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (this.alignmentLines.getUsedDuringParentLayout()) {
                this.alignmentLines.v(true);
            }
            if (this.alignmentLines.getDirty() && this.alignmentLines.l()) {
                this.alignmentLines.r();
            }
            this.layingOutChildren = false;
        }

        /* renamed from: V0, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        public final void V1() {
            h0 B0;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("replace() called on item that was not placed");
                }
                this.onNodePlacedCalled = false;
                boolean z4 = this.isPlaced;
                H0(this.lastPosition, 0.0f, null);
                if (z4 && !this.onNodePlacedCalled && (B0 = m0.this.layoutNode.B0()) != null) {
                    h0.u1(B0, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @Override // androidx.compose.ui.layout.i1, androidx.compose.ui.layout.p0
        public int W() {
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return lookaheadDelegate.W();
        }

        public final void W1(boolean z4) {
            this.childDelegatesDirty = z4;
        }

        public final void X1(boolean z4) {
            this.duringAlignmentLinesQuery = z4;
        }

        /* renamed from: Y0, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        @Override // androidx.compose.ui.layout.p
        public int Z(int width) {
            K1();
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return lookaheadDelegate.Z(width);
        }

        @fg.m
        /* renamed from: Z0, reason: from getter */
        public final androidx.compose.ui.unit.b getLookaheadConstraints() {
            return this.lookaheadConstraints;
        }

        public final void Z1(@fg.l h0.g gVar) {
            this.measuredByParent = gVar;
        }

        @Override // androidx.compose.ui.layout.p0, androidx.compose.ui.layout.p
        @fg.m
        /* renamed from: a, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        @fg.m
        public final ld.l<q4, k2> c1() {
            return this.lastLayerBlock;
        }

        public final void d2(int i4) {
            this.placeOrder = i4;
        }

        /* renamed from: e1, reason: from getter */
        public final long getLastPosition() {
            return this.lastPosition;
        }

        public void e2(boolean z4) {
            this.isPlaced = z4;
        }

        /* renamed from: f1, reason: from getter */
        public final float getLastZIndex() {
            return this.lastZIndex;
        }

        public final void f2(boolean z4) {
            this.placedOnce = z4;
        }

        /* renamed from: g1, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @fg.l
        public final b h1() {
            return m0.this.getMeasurePassDelegate();
        }

        @Override // androidx.compose.ui.node.b
        @fg.l
        public e1 i0() {
            return m0.this.layoutNode.d0();
        }

        @Override // androidx.compose.ui.layout.p
        public int k0(int height) {
            K1();
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return lookaheadDelegate.k0(height);
        }

        @fg.l
        /* renamed from: k1, reason: from getter */
        public final h0.g getMeasuredByParent() {
            return this.measuredByParent;
        }

        @Override // androidx.compose.ui.node.b
        /* renamed from: l, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // androidx.compose.ui.layout.p
        public int l0(int height) {
            K1();
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return lookaheadDelegate.l0(height);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            if ((r0 != null ? r0.l0() : null) == androidx.compose.ui.node.h0.e.LookaheadLayingOut) goto L13;
         */
        @Override // androidx.compose.ui.layout.l0
        @fg.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.compose.ui.layout.i1 m0(long r4) {
            /*
                r3 = this;
                androidx.compose.ui.node.m0 r0 = androidx.compose.ui.node.m0.this
                androidx.compose.ui.node.h0 r0 = androidx.compose.ui.node.m0.a(r0)
                androidx.compose.ui.node.h0 r0 = r0.B0()
                r1 = 0
                if (r0 == 0) goto L12
                androidx.compose.ui.node.h0$e r0 = r0.l0()
                goto L13
            L12:
                r0 = r1
            L13:
                androidx.compose.ui.node.h0$e r2 = androidx.compose.ui.node.h0.e.LookaheadMeasuring
                if (r0 == r2) goto L2b
                androidx.compose.ui.node.m0 r0 = androidx.compose.ui.node.m0.this
                androidx.compose.ui.node.h0 r0 = androidx.compose.ui.node.m0.a(r0)
                androidx.compose.ui.node.h0 r0 = r0.B0()
                if (r0 == 0) goto L27
                androidx.compose.ui.node.h0$e r1 = r0.l0()
            L27:
                androidx.compose.ui.node.h0$e r0 = androidx.compose.ui.node.h0.e.LookaheadLayingOut
                if (r1 != r0) goto L31
            L2b:
                androidx.compose.ui.node.m0 r0 = androidx.compose.ui.node.m0.this
                r1 = 0
                androidx.compose.ui.node.m0.i(r0, r1)
            L31:
                androidx.compose.ui.node.m0 r0 = androidx.compose.ui.node.m0.this
                androidx.compose.ui.node.h0 r0 = androidx.compose.ui.node.m0.a(r0)
                r3.h2(r0)
                androidx.compose.ui.node.m0 r0 = androidx.compose.ui.node.m0.this
                androidx.compose.ui.node.h0 r0 = androidx.compose.ui.node.m0.a(r0)
                androidx.compose.ui.node.h0$g r0 = r0.getIntrinsicsUsageByParent()
                androidx.compose.ui.node.h0$g r1 = androidx.compose.ui.node.h0.g.NotUsed
                if (r0 != r1) goto L51
                androidx.compose.ui.node.m0 r0 = androidx.compose.ui.node.m0.this
                androidx.compose.ui.node.h0 r0 = androidx.compose.ui.node.m0.a(r0)
                r0.I()
            L51:
                r3.P1(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.m0.a.m0(long):androidx.compose.ui.layout.i1");
        }

        /* renamed from: m1, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        public final boolean m2() {
            if (this.parentData == null) {
                r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
                kotlin.jvm.internal.l0.m(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            r0 lookaheadDelegate2 = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }

        @Override // androidx.compose.ui.node.b
        @fg.l
        /* renamed from: p, reason: from getter */
        public androidx.compose.ui.node.a getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.p0
        public int q(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            h0 B0 = m0.this.layoutNode.B0();
            if ((B0 != null ? B0.l0() : null) == h0.e.LookaheadMeasuring) {
                this.alignmentLines.z(true);
            } else {
                h0 B02 = m0.this.layoutNode.B0();
                if ((B02 != null ? B02.l0() : null) == h0.e.LookaheadLayingOut) {
                    this.alignmentLines.y(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            int q4 = lookaheadDelegate.q(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return q4;
        }

        /* renamed from: r1, reason: from getter */
        public final boolean getPlacedOnce() {
            return this.placedOnce;
        }

        @Override // androidx.compose.ui.node.b
        public void requestLayout() {
            h0.u1(m0.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.b
        public void s0() {
            h0.w1(m0.this.layoutNode, false, false, 3, null);
        }

        @Override // androidx.compose.ui.layout.p
        public int t(int width) {
            K1();
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return lookaheadDelegate.t(width);
        }

        public final void t1(boolean forceRequest) {
            h0 B0;
            h0 B02 = m0.this.layoutNode.B0();
            h0.g intrinsicsUsageByParent = m0.this.layoutNode.getIntrinsicsUsageByParent();
            if (B02 == null || intrinsicsUsageByParent == h0.g.NotUsed) {
                return;
            }
            while (B02.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (B0 = B02.B0()) != null) {
                B02 = B0;
            }
            int i4 = C0349a.f19394b[intrinsicsUsageByParent.ordinal()];
            if (i4 == 1) {
                if (B02.getLookaheadRoot() != null) {
                    h0.w1(B02, forceRequest, false, 2, null);
                    return;
                } else {
                    h0.A1(B02, forceRequest, false, 2, null);
                    return;
                }
            }
            if (i4 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (B02.getLookaheadRoot() != null) {
                B02.t1(forceRequest);
            } else {
                B02.x1(forceRequest);
            }
        }

        @Override // androidx.compose.ui.layout.i1, androidx.compose.ui.layout.p0
        public int v() {
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            return lookaheadDelegate.v();
        }

        public final void x1() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.b
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> y() {
            if (!this.duringAlignmentLinesQuery) {
                if (m0.this.getLayoutState() == h0.e.LookaheadMeasuring) {
                    this.alignmentLines.x(true);
                    if (this.alignmentLines.getDirty()) {
                        m0.this.M();
                    }
                } else {
                    this.alignmentLines.w(true);
                }
            }
            r0 lookaheadDelegate = i0().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.k1(true);
            }
            V();
            r0 lookaheadDelegate2 = i0().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.k1(false);
            }
            return this.alignmentLines.h();
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ(\u0010\u000f\u001a\u00020\u00062\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000R\u00020\r\u0012\u0004\u0012\u00020\u00060\fH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\"\u0010\bJ\u001a\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0018\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0096\u0002¢\u0006\u0004\b-\u0010.J=\u0010/\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0019\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\u001aH\u0014ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001dJ\r\u00100\u001a\u00020\u0006¢\u0006\u0004\b0\u0010\bJ\u0017\u00102\u001a\u00020,2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020,2\u0006\u00101\u001a\u00020,H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00106\u001a\u00020,2\u0006\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b6\u00103J\u0017\u00107\u001a\u00020,2\u0006\u00105\u001a\u00020,H\u0016¢\u0006\u0004\b7\u00103J\r\u00108\u001a\u00020\u0006¢\u0006\u0004\b8\u0010\bJ\r\u00109\u001a\u00020'¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020,0;H\u0016¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b>\u0010\u0010J\u000f\u0010?\u001a\u00020\u0006H\u0016¢\u0006\u0004\b?\u0010\bJ\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\bJ\r\u0010A\u001a\u00020\u0006¢\u0006\u0004\bA\u0010\bJ\u0015\u0010C\u001a\u00020\u00062\u0006\u0010B\u001a\u00020'¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u0006¢\u0006\u0004\bE\u0010\bJ\r\u0010F\u001a\u00020\u0006¢\u0006\u0004\bF\u0010\bJ\r\u0010G\u001a\u00020\u0006¢\u0006\u0004\bG\u0010\bR\u0016\u0010I\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00106R$\u0010O\u001a\u00020,2\u0006\u0010J\u001a\u00020,8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR$\u0010R\u001a\u00020,2\u0006\u0010J\u001a\u00020,8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bP\u0010L\u001a\u0004\bQ\u0010NR\u0016\u0010T\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u00106R\u0016\u0010V\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00106R\"\u0010^\u001a\u00020W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010b\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u00106\u001a\u0004\b`\u0010:\"\u0004\ba\u0010DR\u001c\u0010e\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bc\u0010dR)\u0010h\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010iR\u0016\u0010l\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u00106R(\u0010r\u001a\u0004\u0018\u00010m2\b\u0010J\u001a\u0004\u0018\u00010m8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR*\u0010t\u001a\u00020'2\u0006\u0010J\u001a\u00020'8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00106\u001a\u0004\bU\u0010:\"\u0004\bs\u0010DR*\u0010x\u001a\u00020'2\u0006\u0010J\u001a\u00020'8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u00106\u001a\u0004\bv\u0010:\"\u0004\bw\u0010DR\u001a\u0010}\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\bf\u0010|R \u0010\u0081\u0001\u001a\f\u0012\b\u0012\u00060\u0000R\u00020\r0~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0085\u0001\u001a\u00020'8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u00106\u001a\u0005\b\u0083\u0001\u0010:\"\u0005\b\u0084\u0001\u0010DR&\u0010\u0087\u0001\u001a\u00020'2\u0006\u0010J\u001a\u00020'8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b<\u00106\u001a\u0005\b\u0086\u0001\u0010:R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R'\u0010\u0018\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010i\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u00106R+\u0010\u0092\u0001\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f¢\u0006\u0002\b\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010gR\u001e\u0010\u0094\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010dR\u0018\u0010\u0096\u0001\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010iR\u001d\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010\u008a\u0001R\u001c\u0010\u009a\u0001\u001a\u0004\u0018\u00010#8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\"\u0010¢\u0001\u001a\r\u0012\b\u0012\u00060\u0000R\u00020\r0\u009f\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020,8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010NR\u0015\u0010¥\u0001\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010NR\u0018\u0010§\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bL\u0010¦\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¨\u0001"}, d2 = {"Landroidx/compose/ui/node/m0$b;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/i1;", "Landroidx/compose/ui/node/b;", "<init>", "(Landroidx/compose/ui/node/m0;)V", "Lkotlin/k2;", "S0", "()V", "I1", "F1", "V0", "Lkotlin/Function1;", "Landroidx/compose/ui/node/m0;", "block", "Y0", "(Lld/l;)V", "Landroidx/compose/ui/node/h0;", "node", "v2", "(Landroidx/compose/ui/node/h0;)V", "Landroidx/compose/ui/unit/q;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/q4;", "Lkotlin/u;", "layerBlock", "Z1", "(JFLld/l;)V", "P1", "M1", "A1", "V", "W1", "Landroidx/compose/ui/unit/b;", "constraints", "m0", "(J)Landroidx/compose/ui/layout/i1;", "", "d2", "(J)Z", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "q", "(Landroidx/compose/ui/layout/a;)I", "H0", "e2", "height", "k0", "(I)I", "l0", "width", "Z", "t", "x1", "y2", "()Z", "", "y", "()Ljava/util/Map;", "N", "requestLayout", "s0", "L1", "forceRequest", "t1", "(Z)V", "V1", "K1", "X1", "h", "relayoutWithoutParentInProgress", "<set-?>", "i", "I", "m1", "()I", "previousPlaceOrder", "j", "k1", "placeOrder", "k", "measuredOnce", "l", "placedOnce", "Landroidx/compose/ui/node/h0$g;", "m", "Landroidx/compose/ui/node/h0$g;", "h1", "()Landroidx/compose/ui/node/h0$g;", "m2", "(Landroidx/compose/ui/node/h0$g;)V", "measuredByParent", "n", "e1", "h2", "duringAlignmentLinesQuery", "o", "J", "lastPosition", "p", "Lld/l;", "lastLayerBlock", "F", "lastZIndex", "r", "parentDataDirty", "", "s", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "parentData", "n2", "isPlaced", "u", "y1", "s2", "isPlacedByParent", "Landroidx/compose/ui/node/a;", "v", "Landroidx/compose/ui/node/a;", "()Landroidx/compose/ui/node/a;", "alignmentLines", "Landroidx/compose/runtime/collection/g;", "w", "Landroidx/compose/runtime/collection/g;", "_childDelegates", "x", "c1", "f2", "childDelegatesDirty", "g1", "layingOutChildren", "Lkotlin/Function0;", "z", "Lld/a;", "layoutChildrenBlock", "A", "r1", "()F", "B", "onNodePlacedCalled", "C", "placeOuterCoordinatorLayerBlock", "D", "placeOuterCoordinatorPosition", "E", "placeOuterCoordinatorZIndex", "placeOuterCoordinatorBlock", "f1", "()Landroidx/compose/ui/unit/b;", "lastConstraints", "Landroidx/compose/ui/node/e1;", "i0", "()Landroidx/compose/ui/node/e1;", "innerCoordinator", "", "Z0", "()Ljava/util/List;", "childDelegates", "W", "measuredWidth", "measuredHeight", "()Landroidx/compose/ui/node/b;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1781:1\n571#1:1820\n572#1,2:1829\n574#1:1835\n571#1:1862\n572#1,2:1871\n574#1:1877\n1187#2,2:1782\n1699#3:1784\n1700#3,6:1793\n1706#3,5:1803\n199#4:1785\n197#4:1808\n197#4:1821\n1247#4,7:1836\n197#4:1843\n1235#4,7:1855\n197#4:1863\n197#4:1878\n197#4:1891\n197#4:1903\n197#4:1915\n476#5,7:1786\n483#5,4:1799\n460#5,11:1809\n460#5,7:1822\n467#5,4:1831\n460#5,11:1844\n460#5,7:1864\n467#5,4:1873\n460#5,11:1879\n460#5,11:1892\n460#5,11:1904\n460#5,11:1916\n1#6:1890\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate\n*L\n437#1:1820\n437#1:1829,2\n437#1:1835\n557#1:1862\n557#1:1871,2\n557#1:1877\n336#1:1782,2\n346#1:1784\n346#1:1793,6\n346#1:1803,5\n346#1:1785\n419#1:1808\n437#1:1821\n456#1:1836,7\n461#1:1843\n511#1:1855,7\n557#1:1863\n571#1:1878\n863#1:1891\n889#1:1903\n925#1:1915\n346#1:1786,7\n346#1:1799,4\n419#1:1809,11\n437#1:1822,7\n437#1:1831,4\n461#1:1844,11\n557#1:1864,7\n557#1:1873,4\n571#1:1879,11\n863#1:1892,11\n889#1:1904,11\n925#1:1916,11\n*E\n"})
    public final class b extends androidx.compose.ui.layout.i1 implements androidx.compose.ui.layout.l0, androidx.compose.ui.node.b {

        /* renamed from: A, reason: from kotlin metadata */
        private float zIndex;

        /* renamed from: B, reason: from kotlin metadata */
        private boolean onNodePlacedCalled;

        /* renamed from: C, reason: from kotlin metadata */
        @fg.m
        private ld.l<? super q4, k2> placeOuterCoordinatorLayerBlock;

        /* renamed from: D, reason: from kotlin metadata */
        private long placeOuterCoordinatorPosition;

        /* renamed from: E, reason: from kotlin metadata */
        private float placeOuterCoordinatorZIndex;

        /* renamed from: F, reason: from kotlin metadata */
        @fg.l
        private final ld.a<k2> placeOuterCoordinatorBlock;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean relayoutWithoutParentInProgress;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private ld.l<? super q4, k2> lastLayerBlock;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private float lastZIndex;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean parentDataDirty;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Object parentData;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean isPlaced;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        private boolean isPlacedByParent;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.node.a alignmentLines;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.runtime.collection.g<b> _childDelegates;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        private boolean childDelegatesDirty;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        private boolean layingOutChildren;

        /* renamed from: z, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ld.a<k2> layoutChildrenBlock;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int previousPlaceOrder = Integer.MAX_VALUE;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int placeOrder = Integer.MAX_VALUE;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private h0.g measuredByParent = h0.g.NotUsed;

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f19423a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f19424b;

            static {
                int[] iArr = new int[h0.e.values().length];
                try {
                    iArr[h0.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h0.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f19423a = iArr;
                int[] iArr2 = new int[h0.g.values().length];
                try {
                    iArr2[h0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[h0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f19424b = iArr2;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.node.m0$b$b, reason: collision with other inner class name */
        static final class C0352b extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.node.m0$b$b$a */
            static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.b, k2> {

                /* renamed from: b, reason: collision with root package name */
                public static final a f19426b = new a(1);

                a() {
                    super(1);
                }

                public final void a(@fg.l androidx.compose.ui.node.b bVar) {
                    bVar.getAlignmentLines().y(false);
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.b bVar) {
                    a(bVar);
                    return k2.f75408a;
                }
            }

            /* compiled from: LayoutNodeLayoutDelegate.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.node.m0$b$b$b, reason: collision with other inner class name */
            static final class C0353b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.b, k2> {

                /* renamed from: b, reason: collision with root package name */
                public static final C0353b f19427b = new C0353b(1);

                C0353b() {
                    super(1);
                }

                public final void a(@fg.l androidx.compose.ui.node.b bVar) {
                    bVar.getAlignmentLines().v(bVar.getAlignmentLines().getUsedDuringParentLayout());
                }

                @Override // ld.l
                public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.b bVar) {
                    a(bVar);
                    return k2.f75408a;
                }
            }

            C0352b() {
                super(0);
            }

            public final void a() {
                b.this.V0();
                b.this.N(a.f19426b);
                b.this.i0().S0().q();
                b.this.S0();
                b.this.N(C0353b.f19427b);
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.a<k2> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m0 f19428b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f19429c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(m0 m0Var, b bVar) {
                super(0);
                this.f19428b = m0Var;
                this.f19429c = bVar;
            }

            public final void a() {
                i1.a C;
                e1 wrappedBy = this.f19428b.H().getWrappedBy();
                if (wrappedBy == null || (C = wrappedBy.getPlacementScope()) == null) {
                    C = l0.d(this.f19428b.layoutNode).C();
                }
                i1.a aVar = C;
                b bVar = this.f19429c;
                m0 m0Var = this.f19428b;
                ld.l<? super q4, k2> lVar = bVar.placeOuterCoordinatorLayerBlock;
                if (lVar == null) {
                    aVar.h(m0Var.H(), bVar.placeOuterCoordinatorPosition, bVar.placeOuterCoordinatorZIndex);
                } else {
                    aVar.v(m0Var.H(), bVar.placeOuterCoordinatorPosition, bVar.placeOuterCoordinatorZIndex, lVar);
                }
            }

            @Override // ld.a
            public /* bridge */ /* synthetic */ k2 invoke() {
                a();
                return k2.f75408a;
            }
        }

        /* compiled from: LayoutNodeLayoutDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.node.b, k2> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f19430b = new d(1);

            d() {
                super(1);
            }

            public final void a(@fg.l androidx.compose.ui.node.b bVar) {
                bVar.getAlignmentLines().z(false);
            }

            @Override // ld.l
            public /* bridge */ /* synthetic */ k2 invoke(androidx.compose.ui.node.b bVar) {
                a(bVar);
                return k2.f75408a;
            }
        }

        public b() {
            q.Companion companion = androidx.compose.ui.unit.q.INSTANCE;
            companion.getClass();
            this.lastPosition = androidx.compose.ui.unit.q.f21519c;
            this.parentDataDirty = true;
            this.alignmentLines = new i0(this, null);
            this._childDelegates = new androidx.compose.runtime.collection.g<>(new b[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new C0352b();
            companion.getClass();
            this.placeOuterCoordinatorPosition = androidx.compose.ui.unit.q.f21519c;
            this.placeOuterCoordinatorBlock = new c(m0.this, this);
        }

        private final void F1() {
            boolean z4 = this.isPlaced;
            this.isPlaced = true;
            h0 h0Var = m0.this.layoutNode;
            int i4 = 0;
            if (!z4) {
                if (h0Var.s0()) {
                    h0.A1(h0Var, true, false, 2, null);
                } else if (h0Var.n0()) {
                    h0.w1(h0Var, true, false, 2, null);
                }
            }
            e1 wrapped = h0Var.d0().getWrapped();
            for (e1 z02 = h0Var.z0(); !kotlin.jvm.internal.l0.g(z02, wrapped) && z02 != null; z02 = z02.getWrapped()) {
                if (z02.getLastLayerDrawingWasSkipped()) {
                    z02.M3();
                }
            }
            androidx.compose.runtime.collection.g<h0> H0 = h0Var.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                do {
                    h0 h0Var2 = L[i4];
                    if (h0Var2.C0() != Integer.MAX_VALUE) {
                        h0Var2.r0().F1();
                        h0Var.B1(h0Var2);
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        private final void I1() {
            if (this.isPlaced) {
                int i4 = 0;
                this.isPlaced = false;
                androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
                int size = H0.getSize();
                if (size > 0) {
                    h0[] L = H0.L();
                    do {
                        L[i4].r0().I1();
                        i4++;
                    } while (i4 < size);
                }
            }
        }

        private final void M1() {
            h0 h0Var = m0.this.layoutNode;
            m0 m0Var = m0.this;
            androidx.compose.runtime.collection.g<h0> H0 = h0Var.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    h0 h0Var2 = L[i4];
                    if (h0Var2.s0() && h0Var2.t0() == h0.g.InMeasureBlock && h0.p1(h0Var2, null, 1, null)) {
                        h0.A1(m0Var.layoutNode, false, false, 3, null);
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        private final void P1() {
            h0.A1(m0.this.layoutNode, false, false, 3, null);
            h0 B0 = m0.this.layoutNode.B0();
            if (B0 == null || m0.this.layoutNode.getIntrinsicsUsageByParent() != h0.g.NotUsed) {
                return;
            }
            h0 h0Var = m0.this.layoutNode;
            int i4 = a.f19423a[B0.l0().ordinal()];
            h0Var.I1(i4 != 1 ? i4 != 2 ? B0.getIntrinsicsUsageByParent() : h0.g.InLayoutBlock : h0.g.InMeasureBlock);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S0() {
            h0 h0Var = m0.this.layoutNode;
            androidx.compose.runtime.collection.g<h0> H0 = h0Var.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    h0 h0Var2 = L[i4];
                    if (h0Var2.r0().previousPlaceOrder != h0Var2.C0()) {
                        h0Var.l1();
                        h0Var.Q0();
                        if (h0Var2.C0() == Integer.MAX_VALUE) {
                            h0Var2.r0().I1();
                        }
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void V0() {
            m0.this.nextChildPlaceOrder = 0;
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    b r02 = L[i4].r0();
                    r02.previousPlaceOrder = r02.placeOrder;
                    r02.placeOrder = Integer.MAX_VALUE;
                    r02.isPlacedByParent = false;
                    if (r02.measuredByParent == h0.g.InLayoutBlock) {
                        r02.measuredByParent = h0.g.NotUsed;
                    }
                    i4++;
                } while (i4 < size);
            }
        }

        private final void Y0(ld.l<? super b, k2> block) {
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    block.invoke(L[i4].r0());
                    i4++;
                } while (i4 < size);
            }
        }

        private final void Z1(long position, float zIndex, ld.l<? super q4, k2> layerBlock) {
            if (m0.this.layoutNode.getIsDeactivated()) {
                throw new IllegalArgumentException("place is called on a deactivated node");
            }
            m0.this.layoutState = h0.e.LayingOut;
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            p1 d5 = l0.d(m0.this.layoutNode);
            if (m0.this.getLayoutPending() || !this.isPlaced) {
                this.alignmentLines.w(false);
                m0.this.U(false);
                this.placeOuterCoordinatorLayerBlock = layerBlock;
                this.placeOuterCoordinatorPosition = position;
                this.placeOuterCoordinatorZIndex = zIndex;
                d5.getSnapshotObserver().c(m0.this.layoutNode, false, this.placeOuterCoordinatorBlock);
                this.placeOuterCoordinatorLayerBlock = null;
            } else {
                m0.this.H().D4(position, zIndex, layerBlock);
                W1();
            }
            m0.this.layoutState = h0.e.Idle;
        }

        private final void v2(h0 node) {
            h0.g gVar;
            h0 B0 = node.B0();
            if (B0 == null) {
                this.measuredByParent = h0.g.NotUsed;
                return;
            }
            if (this.measuredByParent != h0.g.NotUsed && !node.getCanMultiMeasure()) {
                throw new IllegalStateException("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i4 = a.f19423a[B0.l0().ordinal()];
            if (i4 == 1) {
                gVar = h0.g.InMeasureBlock;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + B0.l0());
                }
                gVar = h0.g.InLayoutBlock;
            }
            this.measuredByParent = gVar;
        }

        public final void A1() {
            m0.this.detachedFromParentLookaheadPass = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.i1
        public void H0(long position, float zIndex, @fg.m ld.l<? super q4, k2> layerBlock) {
            i1.a C;
            this.isPlacedByParent = true;
            if (!androidx.compose.ui.unit.q.j(position, this.lastPosition)) {
                if (m0.this.getCoordinatesAccessedDuringModifierPlacement() || m0.this.getCoordinatesAccessedDuringPlacement()) {
                    m0.this.layoutPending = true;
                }
                L1();
            }
            if (n0.a(m0.this.layoutNode)) {
                e1 wrappedBy = m0.this.H().getWrappedBy();
                if (wrappedBy == null || (C = wrappedBy.getPlacementScope()) == null) {
                    C = l0.d(m0.this.layoutNode).C();
                }
                i1.a aVar = C;
                m0 m0Var = m0.this;
                a lookaheadPassDelegate = m0Var.getLookaheadPassDelegate();
                kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                h0 B0 = m0Var.layoutNode.B0();
                if (B0 != null) {
                    B0.getLayoutDelegate().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate.d2(Integer.MAX_VALUE);
                i1.a.g(aVar, lookaheadPassDelegate, (int) (position >> 32), (int) (4294967295L & position), 0.0f, 4, null);
            }
            a lookaheadPassDelegate2 = m0.this.getLookaheadPassDelegate();
            if ((lookaheadPassDelegate2 == null || lookaheadPassDelegate2.getPlacedOnce()) ? false : true) {
                throw new IllegalArgumentException("Error: Placement happened before lookahead.");
            }
            Z1(position, zIndex, layerBlock);
        }

        @Override // androidx.compose.ui.node.b
        @fg.m
        public androidx.compose.ui.node.b I() {
            m0 layoutDelegate;
            h0 B0 = m0.this.layoutNode.B0();
            if (B0 == null || (layoutDelegate = B0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.r();
        }

        public final void K1() {
            a lookaheadPassDelegate = m0.this.getLookaheadPassDelegate();
            h0 B0 = m0.this.layoutNode.B0();
            if (B0 == null) {
                throw new IllegalStateException("layoutNode parent is not set");
            }
            if (lookaheadPassDelegate == null) {
                throw new IllegalStateException("invalid lookaheadDelegate");
            }
            if (lookaheadPassDelegate.getMeasuredByParent() == h0.g.InMeasureBlock && B0.l0() == h0.e.Measuring) {
                androidx.compose.ui.unit.b lookaheadConstraints = lookaheadPassDelegate.getLookaheadConstraints();
                kotlin.jvm.internal.l0.m(lookaheadConstraints);
                m0(lookaheadConstraints.getValue());
            } else if (lookaheadPassDelegate.getMeasuredByParent() == h0.g.InLayoutBlock && B0.l0() == h0.e.LayingOut) {
                androidx.compose.ui.unit.b lookaheadConstraints2 = lookaheadPassDelegate.getLookaheadConstraints();
                kotlin.jvm.internal.l0.m(lookaheadConstraints2);
                m0(lookaheadConstraints2.getValue());
            }
        }

        public final void L1() {
            androidx.compose.runtime.collection.g<h0> H0;
            int size;
            if (m0.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (H0 = m0.this.layoutNode.H0()).getSize()) <= 0) {
                return;
            }
            h0[] L = H0.L();
            int i4 = 0;
            do {
                h0 h0Var = L[i4];
                m0 layoutDelegate = h0Var.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    h0.y1(h0Var, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().L1();
                i4++;
            } while (i4 < size);
        }

        @Override // androidx.compose.ui.node.b
        public void N(@fg.l ld.l<? super androidx.compose.ui.node.b, k2> block) {
            androidx.compose.runtime.collection.g<h0> H0 = m0.this.layoutNode.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    block.invoke(L[i4].getLayoutDelegate().r());
                    i4++;
                } while (i4 < size);
            }
        }

        @Override // androidx.compose.ui.node.b
        public void V() {
            this.layingOutChildren = true;
            this.alignmentLines.s();
            if (m0.this.getLayoutPending()) {
                M1();
            }
            if (m0.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !i0().getIsPlacingForAlignment() && m0.this.getLayoutPending())) {
                m0.this.layoutPending = false;
                h0.e layoutState = m0.this.getLayoutState();
                m0.this.layoutState = h0.e.LayingOut;
                m0.this.V(false);
                h0 h0Var = m0.this.layoutNode;
                l0.d(h0Var).getSnapshotObserver().e(h0Var, false, this.layoutChildrenBlock);
                m0.this.layoutState = layoutState;
                if (i0().getIsPlacingForAlignment() && m0.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                m0.this.layoutPendingForAlignment = false;
            }
            if (this.alignmentLines.getUsedDuringParentLayout()) {
                this.alignmentLines.v(true);
            }
            if (this.alignmentLines.getDirty() && this.alignmentLines.l()) {
                this.alignmentLines.r();
            }
            this.layingOutChildren = false;
        }

        public final void V1() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            this.isPlaced = false;
        }

        @Override // androidx.compose.ui.layout.i1, androidx.compose.ui.layout.p0
        public int W() {
            return m0.this.H().W();
        }

        public final void W1() {
            this.onNodePlacedCalled = true;
            h0 B0 = m0.this.layoutNode.B0();
            float zIndex = i0().getZIndex();
            h0 h0Var = m0.this.layoutNode;
            e1 z02 = h0Var.z0();
            e1 d02 = h0Var.d0();
            while (z02 != d02) {
                kotlin.jvm.internal.l0.n(z02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                d0 d0Var = (d0) z02;
                zIndex += d0Var.getZIndex();
                z02 = d0Var.getWrapped();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (B0 != null) {
                    B0.l1();
                }
                if (B0 != null) {
                    B0.Q0();
                }
            }
            if (!this.isPlaced) {
                if (B0 != null) {
                    B0.Q0();
                }
                F1();
                if (this.relayoutWithoutParentInProgress && B0 != null) {
                    h0.y1(B0, false, 1, null);
                }
            }
            if (B0 == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && B0.l0() == h0.e.LayingOut) {
                if (this.placeOrder != Integer.MAX_VALUE) {
                    throw new IllegalStateException("Place was called on a node which was placed already");
                }
                this.placeOrder = B0.getLayoutDelegate().nextChildPlaceOrder;
                B0.getLayoutDelegate().nextChildPlaceOrder++;
            }
            V();
        }

        public final void X1() {
            a lookaheadPassDelegate = m0.this.getLookaheadPassDelegate();
            if (lookaheadPassDelegate == null) {
                throw new IllegalStateException("invalid lookaheadDelegate");
            }
            H0(lookaheadPassDelegate.getLastPosition(), lookaheadPassDelegate.getLastZIndex(), lookaheadPassDelegate.c1());
        }

        @Override // androidx.compose.ui.layout.p
        public int Z(int width) {
            P1();
            return m0.this.H().Z(width);
        }

        @fg.l
        public final List<b> Z0() {
            m0.this.layoutNode.R1();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.l();
            }
            h0 h0Var = m0.this.layoutNode;
            androidx.compose.runtime.collection.g<b> gVar = this._childDelegates;
            androidx.compose.runtime.collection.g<h0> H0 = h0Var.H0();
            int size = H0.getSize();
            if (size > 0) {
                h0[] L = H0.L();
                int i4 = 0;
                do {
                    h0 h0Var2 = L[i4];
                    if (gVar.getSize() <= i4) {
                        gVar.b(h0Var2.getLayoutDelegate().getMeasurePassDelegate());
                    } else {
                        gVar.s0(i4, h0Var2.getLayoutDelegate().getMeasurePassDelegate());
                    }
                    i4++;
                } while (i4 < size);
            }
            gVar.p0(h0Var.Y().size(), gVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.l();
        }

        @Override // androidx.compose.ui.layout.p0, androidx.compose.ui.layout.p
        @fg.m
        /* renamed from: a, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        /* renamed from: c1, reason: from getter */
        public final boolean getChildDelegatesDirty() {
            return this.childDelegatesDirty;
        }

        public final boolean d2(long constraints) {
            if (m0.this.layoutNode.getIsDeactivated()) {
                throw new IllegalArgumentException("measure is called on a deactivated node");
            }
            p1 d5 = l0.d(m0.this.layoutNode);
            h0 B0 = m0.this.layoutNode.B0();
            boolean z4 = true;
            m0.this.layoutNode.E1(m0.this.layoutNode.getCanMultiMeasure() || (B0 != null && B0.getCanMultiMeasure()));
            if (!m0.this.layoutNode.s0() && androidx.compose.ui.unit.b.g(getMeasurementConstraints(), constraints)) {
                p1.F(d5, m0.this.layoutNode, false, 2, null);
                m0.this.layoutNode.D1();
                return false;
            }
            this.alignmentLines.x(false);
            N(d.f19430b);
            this.measuredOnce = true;
            long c5 = m0.this.H().c();
            J0(constraints);
            m0.this.R(constraints);
            if (androidx.compose.ui.unit.u.h(m0.this.H().c(), c5) && m0.this.H().getWidth() == getWidth() && m0.this.H().getHeight() == getHeight()) {
                z4 = false;
            }
            I0(androidx.compose.ui.unit.v.a(m0.this.H().getWidth(), m0.this.H().getHeight()));
            return z4;
        }

        /* renamed from: e1, reason: from getter */
        public final boolean getDuringAlignmentLinesQuery() {
            return this.duringAlignmentLinesQuery;
        }

        public final void e2() {
            h0 B0;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    throw new IllegalStateException("replace called on unplaced item");
                }
                boolean z4 = this.isPlaced;
                Z1(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
                if (z4 && !this.onNodePlacedCalled && (B0 = m0.this.layoutNode.B0()) != null) {
                    h0.y1(B0, false, 1, null);
                }
            } finally {
                this.relayoutWithoutParentInProgress = false;
            }
        }

        @fg.m
        public final androidx.compose.ui.unit.b f1() {
            if (this.measuredOnce) {
                return androidx.compose.ui.unit.b.b(getMeasurementConstraints());
            }
            return null;
        }

        public final void f2(boolean z4) {
            this.childDelegatesDirty = z4;
        }

        /* renamed from: g1, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        @fg.l
        /* renamed from: h1, reason: from getter */
        public final h0.g getMeasuredByParent() {
            return this.measuredByParent;
        }

        public final void h2(boolean z4) {
            this.duringAlignmentLinesQuery = z4;
        }

        @Override // androidx.compose.ui.node.b
        @fg.l
        public e1 i0() {
            return m0.this.layoutNode.d0();
        }

        @Override // androidx.compose.ui.layout.p
        public int k0(int height) {
            P1();
            return m0.this.H().k0(height);
        }

        /* renamed from: k1, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        @Override // androidx.compose.ui.node.b
        /* renamed from: l, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // androidx.compose.ui.layout.p
        public int l0(int height) {
            P1();
            return m0.this.H().l0(height);
        }

        @Override // androidx.compose.ui.layout.l0
        @fg.l
        public androidx.compose.ui.layout.i1 m0(long constraints) {
            h0.g intrinsicsUsageByParent = m0.this.layoutNode.getIntrinsicsUsageByParent();
            h0.g gVar = h0.g.NotUsed;
            if (intrinsicsUsageByParent == gVar) {
                m0.this.layoutNode.I();
            }
            if (n0.a(m0.this.layoutNode)) {
                a lookaheadPassDelegate = m0.this.getLookaheadPassDelegate();
                kotlin.jvm.internal.l0.m(lookaheadPassDelegate);
                lookaheadPassDelegate.Z1(gVar);
                lookaheadPassDelegate.m0(constraints);
            }
            v2(m0.this.layoutNode);
            d2(constraints);
            return this;
        }

        /* renamed from: m1, reason: from getter */
        public final int getPreviousPlaceOrder() {
            return this.previousPlaceOrder;
        }

        public final void m2(@fg.l h0.g gVar) {
            this.measuredByParent = gVar;
        }

        public void n2(boolean z4) {
            this.isPlaced = z4;
        }

        @Override // androidx.compose.ui.node.b
        @fg.l
        /* renamed from: p, reason: from getter */
        public androidx.compose.ui.node.a getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // androidx.compose.ui.layout.p0
        public int q(@fg.l androidx.compose.ui.layout.a alignmentLine) {
            h0 B0 = m0.this.layoutNode.B0();
            if ((B0 != null ? B0.l0() : null) == h0.e.Measuring) {
                this.alignmentLines.z(true);
            } else {
                h0 B02 = m0.this.layoutNode.B0();
                if ((B02 != null ? B02.l0() : null) == h0.e.LayingOut) {
                    this.alignmentLines.y(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int q4 = m0.this.H().q(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return q4;
        }

        /* renamed from: r1, reason: from getter */
        public final float getZIndex() {
            return this.zIndex;
        }

        @Override // androidx.compose.ui.node.b
        public void requestLayout() {
            h0.y1(m0.this.layoutNode, false, 1, null);
        }

        @Override // androidx.compose.ui.node.b
        public void s0() {
            h0.A1(m0.this.layoutNode, false, false, 3, null);
        }

        public final void s2(boolean z4) {
            this.isPlacedByParent = z4;
        }

        @Override // androidx.compose.ui.layout.p
        public int t(int width) {
            P1();
            return m0.this.H().t(width);
        }

        public final void t1(boolean forceRequest) {
            h0 B0;
            h0 B02 = m0.this.layoutNode.B0();
            h0.g intrinsicsUsageByParent = m0.this.layoutNode.getIntrinsicsUsageByParent();
            if (B02 == null || intrinsicsUsageByParent == h0.g.NotUsed) {
                return;
            }
            while (B02.getIntrinsicsUsageByParent() == intrinsicsUsageByParent && (B0 = B02.B0()) != null) {
                B02 = B0;
            }
            int i4 = a.f19424b[intrinsicsUsageByParent.ordinal()];
            if (i4 == 1) {
                h0.A1(B02, forceRequest, false, 2, null);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                B02.x1(forceRequest);
            }
        }

        @Override // androidx.compose.ui.layout.i1, androidx.compose.ui.layout.p0
        public int v() {
            return m0.this.H().v();
        }

        public final void x1() {
            this.parentDataDirty = true;
        }

        @Override // androidx.compose.ui.node.b
        @fg.l
        public Map<androidx.compose.ui.layout.a, Integer> y() {
            if (!this.duringAlignmentLinesQuery) {
                if (m0.this.getLayoutState() == h0.e.Measuring) {
                    this.alignmentLines.x(true);
                    if (this.alignmentLines.getDirty()) {
                        m0.this.L();
                    }
                } else {
                    this.alignmentLines.w(true);
                }
            }
            i0().k1(true);
            V();
            i0().k1(false);
            return this.alignmentLines.h();
        }

        /* renamed from: y1, reason: from getter */
        public final boolean getIsPlacedByParent() {
            return this.isPlacedByParent;
        }

        public final boolean y2() {
            if ((this.parentData == null && m0.this.H().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = m0.this.H().getParentData();
            return true;
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f19432c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j4) {
            super(0);
            this.f19432c = j4;
        }

        public final void a() {
            r0 lookaheadDelegate = m0.this.H().getLookaheadDelegate();
            kotlin.jvm.internal.l0.m(lookaheadDelegate);
            lookaheadDelegate.m0(this.f19432c);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    /* compiled from: LayoutNodeLayoutDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.a<k2> {
        d() {
            super(0);
        }

        public final void a() {
            m0.this.H().m0(m0.this.performMeasureConstraints);
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public m0(@fg.l h0 h0Var) {
        this.layoutNode = h0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(long constraints) {
        this.layoutState = h0.e.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        r1.h(l0.d(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new c(constraints), 2, null);
        M();
        if (n0.a(this.layoutNode)) {
            L();
        } else {
            this.measurePending = true;
        }
        this.layoutState = h0.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(long constraints) {
        h0.e eVar = this.layoutState;
        h0.e eVar2 = h0.e.Idle;
        if (eVar != eVar2) {
            throw new IllegalStateException("layout state is not idle before measure starts");
        }
        h0.e eVar3 = h0.e.Measuring;
        this.layoutState = eVar3;
        this.measurePending = false;
        this.performMeasureConstraints = constraints;
        l0.d(this.layoutNode).getSnapshotObserver().g(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == eVar3) {
            L();
            this.layoutState = eVar2;
        }
    }

    @fg.l
    /* renamed from: A, reason: from getter */
    public final h0.e getLayoutState() {
        return this.layoutState;
    }

    @fg.m
    public final androidx.compose.ui.node.b B() {
        return this.lookaheadPassDelegate;
    }

    /* renamed from: C, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* renamed from: D, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    @fg.m
    /* renamed from: E, reason: from getter */
    public final a getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    @fg.l
    /* renamed from: F, reason: from getter */
    public final b getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* renamed from: G, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    @fg.l
    public final e1 H() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    public final int I() {
        return this.measurePassDelegate.getWidth();
    }

    public final void J() {
        this.measurePassDelegate.x1();
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            aVar.x1();
        }
    }

    public final void K() {
        this.measurePassDelegate.f2(true);
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            aVar.W1(true);
        }
    }

    public final void L() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void M() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void N() {
        this.lookaheadMeasurePending = true;
    }

    public final void O() {
        this.measurePending = true;
    }

    public final void P() {
        h0.e l02 = this.layoutNode.l0();
        if (l02 == h0.e.LayingOut || l02 == h0.e.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                V(true);
            } else {
                U(true);
            }
        }
        if (l02 == h0.e.LookaheadLayingOut) {
            a aVar = this.lookaheadPassDelegate;
            if (aVar == null || !aVar.getLayingOutChildren()) {
                U(true);
            } else {
                V(true);
            }
        }
    }

    public final void S() {
        androidx.compose.ui.node.a alignmentLines;
        this.measurePassDelegate.getAlignmentLines().t();
        a aVar = this.lookaheadPassDelegate;
        if (aVar == null || (alignmentLines = aVar.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.t();
    }

    public final void T(int i4) {
        int i5 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i4;
        if ((i5 == 0) != (i4 == 0)) {
            h0 B0 = this.layoutNode.B0();
            m0 layoutDelegate = B0 != null ? B0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i4 == 0) {
                    layoutDelegate.T(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.T(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void U(boolean z4) {
        if (this.coordinatesAccessedDuringModifierPlacement != z4) {
            this.coordinatesAccessedDuringModifierPlacement = z4;
            if (z4 && !this.coordinatesAccessedDuringPlacement) {
                T(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z4 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                T(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void V(boolean z4) {
        if (this.coordinatesAccessedDuringPlacement != z4) {
            this.coordinatesAccessedDuringPlacement = z4;
            if (z4 && !this.coordinatesAccessedDuringModifierPlacement) {
                T(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z4 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                T(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void W() {
        h0 B0;
        if (this.measurePassDelegate.y2() && (B0 = this.layoutNode.B0()) != null) {
            h0.A1(B0, false, false, 3, null);
        }
        a aVar = this.lookaheadPassDelegate;
        if (aVar == null || !aVar.m2()) {
            return;
        }
        if (n0.a(this.layoutNode)) {
            h0 B02 = this.layoutNode.B0();
            if (B02 != null) {
                h0.A1(B02, false, false, 3, null);
                return;
            }
            return;
        }
        h0 B03 = this.layoutNode.B0();
        if (B03 != null) {
            h0.w1(B03, false, false, 3, null);
        }
    }

    public final void q() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new a();
        }
    }

    @fg.l
    public final androidx.compose.ui.node.b r() {
        return this.measurePassDelegate;
    }

    /* renamed from: s, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    /* renamed from: u, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* renamed from: v, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    public final int w() {
        return this.measurePassDelegate.getHeight();
    }

    @fg.m
    public final androidx.compose.ui.unit.b x() {
        return this.measurePassDelegate.f1();
    }

    @fg.m
    public final androidx.compose.ui.unit.b y() {
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            return aVar.getLookaheadConstraints();
        }
        return null;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }
}
