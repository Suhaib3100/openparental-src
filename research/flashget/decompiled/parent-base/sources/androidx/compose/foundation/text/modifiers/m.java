package androidx.compose.foundation.text.modifiers;

import androidx.compose.animation.d1;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.p;
import androidx.compose.ui.node.c0;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.r;
import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.z;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.e;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.style.t;
import androidx.compose.ui.text.v0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q0;

/* compiled from: TextAnnotatedStringNode.kt */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0084\u0001B¯\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u0005H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00112\b\u0010,\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u0015\u0010/\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b/\u0010)JV\u00100\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b0\u00101JK\u00102\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b2\u00103J-\u00108\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u0011¢\u0006\u0004\b8\u00109J\u0013\u0010;\u001a\u00020\r*\u00020:H\u0016¢\u0006\u0004\b;\u0010<J(\u0010D\u001a\u00020C2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020Aø\u0001\u0000¢\u0006\u0004\bD\u0010EJ&\u0010F\u001a\u00020C*\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010EJ%\u0010K\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0013¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u00020\u0013*\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0013H\u0016¢\u0006\u0004\bM\u0010LJ%\u0010O\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0013¢\u0006\u0004\bO\u0010LJ#\u0010P\u001a\u00020\u0013*\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010LJ%\u0010Q\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0013¢\u0006\u0004\bQ\u0010LJ#\u0010R\u001a\u00020\u0013*\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u0010LJ%\u0010S\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0013¢\u0006\u0004\bS\u0010LJ#\u0010T\u001a\u00020\u0013*\u00020G2\u0006\u0010@\u001a\u00020I2\u0006\u0010N\u001a\u00020\u0013H\u0016¢\u0006\u0004\bT\u0010LJ\u0015\u0010W\u001a\u00020\r2\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u0013\u0010Y\u001a\u00020\r*\u00020UH\u0016¢\u0006\u0004\bY\u0010XR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010ZR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010bR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010bR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010`R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR$\u0010r\u001a\u0010\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u0013\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR*\u0010x\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0v\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010`R0\u0010\u0080\u0001\u001a\u0004\u0018\u00010y2\b\u0010z\u001a\u0004\u0018\u00010y8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bY\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0017\u0010\u0083\u0001\u001a\u00020$8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0085\u0001"}, d2 = {"Landroidx/compose/foundation/text/modifiers/m;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/node/q;", "Landroidx/compose/ui/node/y1;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/v0;", "style", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/n0;", "Lkotlin/k2;", "onTextLayout", "Landroidx/compose/ui/text/style/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$b;", "Landroidx/compose/ui/text/a0;", "placeholders", "Li0/i;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/j;", "selectionController", "Landroidx/compose/ui/graphics/k2;", "overrideColor", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;Landroidx/compose/ui/text/font/y$b;Lld/l;IZIILjava/util/List;Lld/l;Landroidx/compose/foundation/text/modifiers/j;Landroidx/compose/ui/graphics/k2;Lkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/foundation/text/modifiers/f;", "I7", "(Landroidx/compose/ui/unit/d;)Landroidx/compose/foundation/text/modifiers/f;", "updatedText", "P7", "(Landroidx/compose/ui/text/e;)Z", "E7", "()V", "color", "S7", "(Landroidx/compose/ui/graphics/k2;Landroidx/compose/ui/text/v0;)Z", "U7", "T7", "(Landroidx/compose/ui/text/v0;Ljava/util/List;IIZLandroidx/compose/ui/text/font/y$b;I)Z", "R7", "(Lld/l;Lld/l;Landroidx/compose/foundation/text/modifiers/j;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "F7", "(ZZZZ)V", "Landroidx/compose/ui/semantics/z;", "f6", "(Landroidx/compose/ui/semantics/z;)V", "Landroidx/compose/ui/layout/o0;", "measureScope", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "M7", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "f", "Landroidx/compose/ui/layout/q;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/p;", "height", "O7", "(Landroidx/compose/ui/layout/q;Landroidx/compose/ui/layout/p;I)I", "P", "width", "N7", "G", "L7", "V", "K7", "p", "Landroidx/compose/ui/graphics/drawscope/c;", "contentDrawScope", "G7", "(Landroidx/compose/ui/graphics/drawscope/c;)V", "E", "Landroidx/compose/ui/text/e;", "q", "Landroidx/compose/ui/text/v0;", "r", "Landroidx/compose/ui/text/font/y$b;", "s", "Lld/l;", "t", "I", "u", "Z", "v", "w", "x", "Ljava/util/List;", "y", "z", "Landroidx/compose/foundation/text/modifiers/j;", "A", "Landroidx/compose/ui/graphics/k2;", "", "Landroidx/compose/ui/layout/a;", "B", "Ljava/util/Map;", "baselineCache", "C", "Landroidx/compose/foundation/text/modifiers/f;", "_layoutCache", "", "D", "semanticsTextLayoutResult", "Landroidx/compose/foundation/text/modifiers/m$a;", "<set-?>", "Landroidx/compose/runtime/k2;", "J7", "()Landroidx/compose/foundation/text/modifiers/m$a;", "Q7", "(Landroidx/compose/foundation/text/modifiers/m$a;)V", "textSubstitution", "H7", "()Landroidx/compose/foundation/text/modifiers/f;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,541:1\n1#2:542\n81#3:543\n107#3,2:544\n246#4:546\n646#5:547\n646#5:548\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n263#1:543\n263#1:544,2\n486#1:546\n515#1:547\n517#1:548\n*E\n"})
/* loaded from: classes.dex */
public final class m extends q.d implements c0, androidx.compose.ui.node.q, y1 {
    public static final int F = 8;

    /* renamed from: A, reason: from kotlin metadata */
    @fg.m
    private k2 overrideColor;

    /* renamed from: B, reason: from kotlin metadata */
    @fg.m
    private Map<androidx.compose.ui.layout.a, Integer> baselineCache;

    /* renamed from: C, reason: from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.text.modifiers.f _layoutCache;

    /* renamed from: D, reason: from kotlin metadata */
    @fg.m
    private ld.l<? super List<n0>, Boolean> semanticsTextLayoutResult;

    /* renamed from: E, reason: from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 textSubstitution;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.ui.text.e text;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private v0 style;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private y.b fontFamilyResolver;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super n0, kotlin.k2> onTextLayout;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int overflow;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean softWrap;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int maxLines;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private int minLines;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private List<e.b<a0>> placeholders;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.l<? super List<i0.i>, kotlin.k2> onPlaceholderLayout;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private j selectionController;

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<List<n0>, Boolean> {
        b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(@fg.l java.util.List<androidx.compose.ui.text.n0> r38) {
            /*
                r37 = this;
                r0 = r37
                androidx.compose.foundation.text.modifiers.m r1 = androidx.compose.foundation.text.modifiers.m.this
                androidx.compose.foundation.text.modifiers.f r1 = androidx.compose.foundation.text.modifiers.m.z7(r1)
                androidx.compose.ui.text.n0 r2 = r1.getLayoutCache()
                if (r2 == 0) goto Lbb
                androidx.compose.ui.text.m0 r1 = new androidx.compose.ui.text.m0
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                androidx.compose.ui.text.e r4 = r3.getText()
                androidx.compose.foundation.text.modifiers.m r3 = androidx.compose.foundation.text.modifiers.m.this
                androidx.compose.ui.text.v0 r5 = androidx.compose.foundation.text.modifiers.m.B7(r3)
                androidx.compose.foundation.text.modifiers.m r3 = androidx.compose.foundation.text.modifiers.m.this
                androidx.compose.ui.graphics.k2 r3 = androidx.compose.foundation.text.modifiers.m.A7(r3)
                if (r3 == 0) goto L2b
                long r6 = r3.a()
                goto L34
            L2b:
                androidx.compose.ui.graphics.d2$a r3 = androidx.compose.ui.graphics.d2.INSTANCE
                r3.getClass()
                long r6 = androidx.compose.ui.graphics.d2.k()
            L34:
                r35 = 16777214(0xfffffe, float:2.3509884E-38)
                r36 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                androidx.compose.ui.text.v0 r5 = androidx.compose.ui.text.v0.j0(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                java.util.List r6 = r3.i()
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                int r7 = r3.getMaxLines()
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                boolean r8 = r3.getSoftWrap()
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                int r9 = r3.getOverflow()
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                androidx.compose.ui.unit.d r10 = r3.getDensity()
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                androidx.compose.ui.unit.w r11 = r3.getLayoutDirection()
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                androidx.compose.ui.text.font.y$b r12 = r3.getFontFamilyResolver()
                androidx.compose.ui.text.m0 r3 = r2.getLayoutInput()
                long r13 = r3.getConstraints()
                r15 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
                r6 = 2
                r7 = 0
                r4 = 0
                androidx.compose.ui.text.n0 r1 = androidx.compose.ui.text.n0.b(r2, r3, r4, r6, r7)
                if (r1 == 0) goto Lbb
                r2 = r38
                r2.add(r1)
                goto Lbc
            Lbb:
                r1 = 0
            Lbc:
                if (r1 == 0) goto Lc0
                r1 = 1
                goto Lc1
            Lc0:
                r1 = 0
            Lc1:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.m.b.invoke(java.util.List):java.lang.Boolean");
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "updatedText", "", "a", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.e, Boolean> {
        c() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l androidx.compose.ui.text.e eVar) {
            m.this.P7(eVar);
            z1.b(m.this);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<Boolean, Boolean> {
        d() {
            super(1);
        }

        @fg.l
        public final Boolean a(boolean z4) {
            if (m.this.J7() == null) {
                return Boolean.FALSE;
            }
            a J7 = m.this.J7();
            if (J7 != null) {
                J7.l(z4);
            }
            z1.b(m.this);
            f0.b(m.this);
            r.a(m.this);
            return Boolean.TRUE;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.n0 implements ld.a<Boolean> {
        e() {
            super(0);
        }

        @Override // ld.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            m.y7(m.this);
            z1.b(m.this);
            f0.b(m.this);
            r.a(m.this);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f7812b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i1 i1Var) {
            super(1);
            this.f7812b = i1Var;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f7812b, 0, 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ m(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l lVar, int i4, boolean z4, int i5, int i6, List list, ld.l lVar2, j jVar, k2 k2Var, w wVar) {
        this(eVar, v0Var, bVar, lVar, i4, z4, i5, i6, list, lVar2, jVar, k2Var);
    }

    private final void E7() {
        Q7(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.foundation.text.modifiers.f H7() {
        if (this._layoutCache == null) {
            this._layoutCache = new androidx.compose.foundation.text.modifiers.f(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
        }
        androidx.compose.foundation.text.modifiers.f fVar = this._layoutCache;
        l0.m(fVar);
        return fVar;
    }

    private final androidx.compose.foundation.text.modifiers.f I7(androidx.compose.ui.unit.d density) {
        androidx.compose.foundation.text.modifiers.f g4;
        a J7 = J7();
        if (J7 != null && J7.j() && (g4 = J7.g()) != null) {
            g4.l(density);
            return g4;
        }
        androidx.compose.foundation.text.modifiers.f H7 = H7();
        H7.l(density);
        return H7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final a J7() {
        return (a) this.textSubstitution.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P7(androidx.compose.ui.text.e updatedText) {
        kotlin.k2 k2Var;
        a J7 = J7();
        if (J7 == null) {
            a aVar = new a(this.text, updatedText, false, null, 12, null);
            androidx.compose.foundation.text.modifiers.f fVar = new androidx.compose.foundation.text.modifiers.f(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, null);
            fVar.l(H7().getDensity());
            aVar.k(fVar);
            Q7(aVar);
            return true;
        }
        if (l0.g(updatedText, J7.i())) {
            return false;
        }
        J7.m(updatedText);
        androidx.compose.foundation.text.modifiers.f g4 = J7.g();
        if (g4 != null) {
            g4.o(updatedText, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
            k2Var = kotlin.k2.f75408a;
        } else {
            k2Var = null;
        }
        return k2Var != null;
    }

    private final void Q7(a aVar) {
        this.textSubstitution.setValue(aVar);
    }

    public static final void y7(m mVar) {
        mVar.Q7(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:16:0x006e, B:18:0x0076, B:20:0x0084, B:22:0x008c, B:23:0x0095, B:25:0x009e, B:26:0x00a0, B:28:0x00a9, B:39:0x00b9, B:41:0x00bd, B:42:0x00cb, B:45:0x00f8, B:46:0x00d9, B:48:0x00ea, B:49:0x00f1, B:50:0x00c2), top: B:15:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:16:0x006e, B:18:0x0076, B:20:0x0084, B:22:0x008c, B:23:0x0095, B:25:0x009e, B:26:0x00a0, B:28:0x00a9, B:39:0x00b9, B:41:0x00bd, B:42:0x00cb, B:45:0x00f8, B:46:0x00d9, B:48:0x00ea, B:49:0x00f1, B:50:0x00c2), top: B:15:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:16:0x006e, B:18:0x0076, B:20:0x0084, B:22:0x008c, B:23:0x0095, B:25:0x009e, B:26:0x00a0, B:28:0x00a9, B:39:0x00b9, B:41:0x00bd, B:42:0x00cb, B:45:0x00f8, B:46:0x00d9, B:48:0x00ea, B:49:0x00f1, B:50:0x00c2), top: B:15:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:16:0x006e, B:18:0x0076, B:20:0x0084, B:22:0x008c, B:23:0x0095, B:25:0x009e, B:26:0x00a0, B:28:0x00a9, B:39:0x00b9, B:41:0x00bd, B:42:0x00cb, B:45:0x00f8, B:46:0x00d9, B:48:0x00ea, B:49:0x00f1, B:50:0x00c2), top: B:15:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:16:0x006e, B:18:0x0076, B:20:0x0084, B:22:0x008c, B:23:0x0095, B:25:0x009e, B:26:0x00a0, B:28:0x00a9, B:39:0x00b9, B:41:0x00bd, B:42:0x00cb, B:45:0x00f8, B:46:0x00d9, B:48:0x00ea, B:49:0x00f1, B:50:0x00c2), top: B:15:0x006e }] */
    @Override // androidx.compose.ui.node.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(@fg.l androidx.compose.ui.graphics.drawscope.c r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.m.E(androidx.compose.ui.graphics.drawscope.c):void");
    }

    public final void F7(boolean drawChanged, boolean textChanged, boolean layoutChanged, boolean callbacksChanged) {
        if (getIsAttached()) {
            if (textChanged || (drawChanged && this.semanticsTextLayoutResult != null)) {
                z1.b(this);
            }
            if (textChanged || layoutChanged || callbacksChanged) {
                H7().o(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
                f0.b(this);
                r.a(this);
            }
            if (drawChanged) {
                r.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.c0
    public int G(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return I7(qVar).d(i4, qVar.getLayoutDirection());
    }

    public final void G7(@fg.l androidx.compose.ui.graphics.drawscope.c contentDrawScope) {
        E(contentDrawScope);
    }

    public final int K7(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l p measurable, int width) {
        return p(intrinsicMeasureScope, measurable, width);
    }

    public final int L7(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l p measurable, int height) {
        return V(intrinsicMeasureScope, measurable, height);
    }

    @fg.l
    public final androidx.compose.ui.layout.n0 M7(@fg.l o0 measureScope, @fg.l androidx.compose.ui.layout.l0 measurable, long constraints) {
        return f(measureScope, measurable, constraints);
    }

    public final int N7(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l p measurable, int width) {
        return G(intrinsicMeasureScope, measurable, width);
    }

    public final int O7(@fg.l androidx.compose.ui.layout.q intrinsicMeasureScope, @fg.l p measurable, int height) {
        return P(intrinsicMeasureScope, measurable, height);
    }

    @Override // androidx.compose.ui.node.c0
    public int P(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return I7(qVar).j(qVar.getLayoutDirection());
    }

    public final boolean R7(@fg.m ld.l<? super n0, kotlin.k2> onTextLayout, @fg.m ld.l<? super List<i0.i>, kotlin.k2> onPlaceholderLayout, @fg.m j selectionController) {
        boolean z4;
        if (l0.g(this.onTextLayout, onTextLayout)) {
            z4 = false;
        } else {
            this.onTextLayout = onTextLayout;
            z4 = true;
        }
        if (!l0.g(this.onPlaceholderLayout, onPlaceholderLayout)) {
            this.onPlaceholderLayout = onPlaceholderLayout;
            z4 = true;
        }
        if (l0.g(this.selectionController, selectionController)) {
            return z4;
        }
        this.selectionController = selectionController;
        return true;
    }

    public final boolean S7(@fg.m k2 color, @fg.l v0 style) {
        boolean g4 = l0.g(color, this.overrideColor);
        this.overrideColor = color;
        return (g4 && style.Z(this.style)) ? false : true;
    }

    public final boolean T7(@fg.l v0 style, @fg.m List<e.b<a0>> placeholders, int minLines, int maxLines, boolean softWrap, @fg.l y.b fontFamilyResolver, int overflow) {
        boolean z4 = !this.style.a0(style);
        this.style = style;
        if (!l0.g(this.placeholders, placeholders)) {
            this.placeholders = placeholders;
            z4 = true;
        }
        if (this.minLines != minLines) {
            this.minLines = minLines;
            z4 = true;
        }
        if (this.maxLines != maxLines) {
            this.maxLines = maxLines;
            z4 = true;
        }
        if (this.softWrap != softWrap) {
            this.softWrap = softWrap;
            z4 = true;
        }
        if (!l0.g(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z4 = true;
        }
        if (t.g(this.overflow, overflow)) {
            return z4;
        }
        this.overflow = overflow;
        return true;
    }

    public final boolean U7(@fg.l androidx.compose.ui.text.e text) {
        if (l0.g(this.text, text)) {
            return false;
        }
        this.text = text;
        Q7(null);
        return true;
    }

    @Override // androidx.compose.ui.node.c0
    public int V(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return I7(qVar).h(qVar.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.foundation.text.modifiers.f I7 = I7(o0Var);
        boolean f4 = I7.f(j4, o0Var.getLayoutDirection());
        n0 c5 = I7.c();
        c5.getMultiParagraph().getIntrinsics().c();
        if (f4) {
            f0.a(this);
            ld.l<? super n0, kotlin.k2> lVar = this.onTextLayout;
            if (lVar != null) {
                lVar.invoke(c5);
            }
            j jVar = this.selectionController;
            if (jVar != null) {
                jVar.h(c5);
            }
            this.baselineCache = z0.W(new q0(androidx.compose.ui.layout.b.a(), Integer.valueOf(kotlin.math.b.L0(c5.getFirstBaseline()))), new q0(androidx.compose.ui.layout.b.b(), Integer.valueOf(kotlin.math.b.L0(c5.getLastBaseline()))));
        }
        ld.l<? super List<i0.i>, kotlin.k2> lVar2 = this.onPlaceholderLayout;
        if (lVar2 != null) {
            lVar2.invoke(c5.A());
        }
        i1 m02 = l0Var.m0(androidx.compose.foundation.text.modifiers.b.d(androidx.compose.ui.unit.b.INSTANCE, androidx.compose.ui.unit.u.m(c5.getSize()), (int) (c5.getSize() & 4294967295L)));
        int size = (int) (c5.getSize() >> 32);
        int size2 = (int) (c5.getSize() & 4294967295L);
        Map<androidx.compose.ui.layout.a, Integer> map = this.baselineCache;
        l0.m(map);
        return o0Var.U3(size, size2, map, new f(m02));
    }

    @Override // androidx.compose.ui.node.y1
    public void f6(@fg.l z zVar) {
        ld.l lVar = this.semanticsTextLayoutResult;
        if (lVar == null) {
            lVar = new b();
            this.semanticsTextLayoutResult = lVar;
        }
        androidx.compose.ui.semantics.w.s1(zVar, this.text);
        a J7 = J7();
        if (J7 != null) {
            androidx.compose.ui.semantics.w.w1(zVar, J7.i());
            androidx.compose.ui.semantics.w.p1(zVar, J7.j());
        }
        androidx.compose.ui.semantics.w.y1(zVar, null, new c(), 1, null);
        androidx.compose.ui.semantics.w.E1(zVar, null, new d(), 1, null);
        androidx.compose.ui.semantics.w.f(zVar, null, new e(), 1, null);
        androidx.compose.ui.semantics.w.Z(zVar, null, lVar, 1, null);
    }

    @Override // androidx.compose.ui.node.c0
    public int p(@fg.l androidx.compose.ui.layout.q qVar, @fg.l p pVar, int i4) {
        return I7(qVar).d(i4, qVar.getLayoutDirection());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(androidx.compose.ui.text.e r17, androidx.compose.ui.text.v0 r18, androidx.compose.ui.text.font.y.b r19, ld.l r20, int r21, boolean r22, int r23, int r24, java.util.List r25, ld.l r26, androidx.compose.foundation.text.modifiers.j r27, androidx.compose.ui.graphics.k2 r28, int r29, kotlin.jvm.internal.w r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L9
            r7 = r2
            goto Lb
        L9:
            r7 = r20
        Lb:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            androidx.compose.ui.text.style.t$a r1 = androidx.compose.ui.text.style.t.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.style.t.a()
            r8 = r1
            goto L1c
        L1a:
            r8 = r21
        L1c:
            r1 = r0 & 32
            r3 = 1
            if (r1 == 0) goto L23
            r9 = r3
            goto L25
        L23:
            r9 = r22
        L25:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r1
            goto L30
        L2e:
            r10 = r23
        L30:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L36
            r11 = r3
            goto L38
        L36:
            r11 = r24
        L38:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3e
            r12 = r2
            goto L40
        L3e:
            r12 = r25
        L40:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L46
            r13 = r2
            goto L48
        L46:
            r13 = r26
        L48:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4e
            r14 = r2
            goto L50
        L4e:
            r14 = r27
        L50:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L56
            r15 = r2
            goto L58
        L56:
            r15 = r28
        L58:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.m.<init>(androidx.compose.ui.text.e, androidx.compose.ui.text.v0, androidx.compose.ui.text.font.y$b, ld.l, int, boolean, int, int, java.util.List, ld.l, androidx.compose.foundation.text.modifiers.j, androidx.compose.ui.graphics.k2, int, kotlin.jvm.internal.w):void");
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @u(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/foundation/text/modifiers/m$a;", "", "Landroidx/compose/ui/text/e;", "original", "substitution", "", "isShowingSubstitution", "Landroidx/compose/foundation/text/modifiers/f;", "layoutCache", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/e;ZLandroidx/compose/foundation/text/modifiers/f;)V", "a", "()Landroidx/compose/ui/text/e;", "b", "c", "()Z", "d", "()Landroidx/compose/foundation/text/modifiers/f;", "e", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/e;ZLandroidx/compose/foundation/text/modifiers/f;)Landroidx/compose/foundation/text/modifiers/m$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/e;", "h", "i", "m", "(Landroidx/compose/ui/text/e;)V", "Z", "j", "l", "(Z)V", "Landroidx/compose/foundation/text/modifiers/f;", "g", "k", "(Landroidx/compose/foundation/text/modifiers/f;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: e, reason: collision with root package name */
        public static final int f7803e = 8;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.ui.text.e original;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.ui.text.e substitution;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isShowingSubstitution;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private androidx.compose.foundation.text.modifiers.f layoutCache;

        public a(@fg.l androidx.compose.ui.text.e eVar, @fg.l androidx.compose.ui.text.e eVar2, boolean z4, @fg.m androidx.compose.foundation.text.modifiers.f fVar) {
            this.original = eVar;
            this.substitution = eVar2;
            this.isShowingSubstitution = z4;
            this.layoutCache = fVar;
        }

        public static a f(a aVar, androidx.compose.ui.text.e eVar, androidx.compose.ui.text.e eVar2, boolean z4, androidx.compose.foundation.text.modifiers.f fVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                eVar = aVar.original;
            }
            if ((i4 & 2) != 0) {
                eVar2 = aVar.substitution;
            }
            if ((i4 & 4) != 0) {
                z4 = aVar.isShowingSubstitution;
            }
            if ((i4 & 8) != 0) {
                fVar = aVar.layoutCache;
            }
            aVar.getClass();
            return new a(eVar, eVar2, z4, fVar);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final androidx.compose.ui.text.e getOriginal() {
            return this.original;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final androidx.compose.ui.text.e getSubstitution() {
            return this.substitution;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        @fg.m
        /* renamed from: d, reason: from getter */
        public final androidx.compose.foundation.text.modifiers.f getLayoutCache() {
            return this.layoutCache;
        }

        @fg.l
        public final a e(@fg.l androidx.compose.ui.text.e original, @fg.l androidx.compose.ui.text.e substitution, boolean isShowingSubstitution, @fg.m androidx.compose.foundation.text.modifiers.f layoutCache) {
            return new a(original, substitution, isShowingSubstitution, layoutCache);
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return l0.g(this.original, aVar.original) && l0.g(this.substitution, aVar.substitution) && this.isShowingSubstitution == aVar.isShowingSubstitution && l0.g(this.layoutCache, aVar.layoutCache);
        }

        @fg.m
        public final androidx.compose.foundation.text.modifiers.f g() {
            return this.layoutCache;
        }

        @fg.l
        public final androidx.compose.ui.text.e h() {
            return this.original;
        }

        public int hashCode() {
            int a5 = d1.a(this.isShowingSubstitution, (this.substitution.hashCode() + (this.original.hashCode() * 31)) * 31, 31);
            androidx.compose.foundation.text.modifiers.f fVar = this.layoutCache;
            return a5 + (fVar == null ? 0 : fVar.hashCode());
        }

        @fg.l
        public final androidx.compose.ui.text.e i() {
            return this.substitution;
        }

        public final boolean j() {
            return this.isShowingSubstitution;
        }

        public final void k(@fg.m androidx.compose.foundation.text.modifiers.f fVar) {
            this.layoutCache = fVar;
        }

        public final void l(boolean z4) {
            this.isShowingSubstitution = z4;
        }

        public final void m(@fg.l androidx.compose.ui.text.e eVar) {
            this.substitution = eVar;
        }

        @fg.l
        public String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }

        public /* synthetic */ a(androidx.compose.ui.text.e eVar, androidx.compose.ui.text.e eVar2, boolean z4, androidx.compose.foundation.text.modifiers.f fVar, int i4, w wVar) {
            this(eVar, eVar2, (i4 & 4) != 0 ? false : z4, (i4 & 8) != 0 ? null : fVar);
        }
    }

    private m(androidx.compose.ui.text.e eVar, v0 v0Var, y.b bVar, ld.l<? super n0, kotlin.k2> lVar, int i4, boolean z4, int i5, int i6, List<e.b<a0>> list, ld.l<? super List<i0.i>, kotlin.k2> lVar2, j jVar, k2 k2Var) {
        androidx.compose.runtime.k2 g4;
        this.text = eVar;
        this.style = v0Var;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = lVar;
        this.overflow = i4;
        this.softWrap = z4;
        this.maxLines = i5;
        this.minLines = i6;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = jVar;
        this.overrideColor = k2Var;
        g4 = t4.g(null, null, 2, null);
        this.textSubstitution = g4;
    }
}
