package androidx.compose.foundation.text;

import androidx.compose.runtime.e3;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.graphics.d5;
import androidx.compose.ui.platform.g5;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: CoreTextField.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJl\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u00108\"\u0004\b9\u0010:R+\u0010A\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010=\u001a\u0004\b0\u0010>\"\u0004\b?\u0010@R1\u0010H\u001a\u00020B2\u0006\u0010<\u001a\u00020B8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010=R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR+\u0010[\u001a\u00020V2\u0006\u0010<\u001a\u00020V8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010=\u001a\u0004\b+\u0010X\"\u0004\bY\u0010ZR+\u0010^\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010=\u001a\u0004\b\\\u0010>\"\u0004\b]\u0010@R+\u0010a\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010=\u001a\u0004\b_\u0010>\"\u0004\b`\u0010@R+\u0010e\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bb\u0010=\u001a\u0004\bc\u0010>\"\u0004\bd\u0010@R+\u0010h\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010=\u001a\u0004\bf\u0010>\"\u0004\bg\u0010@R$\u0010k\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010i\u001a\u0004\bj\u0010>R+\u0010n\u001a\u00020\u000f2\u0006\u0010<\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bc\u0010=\u001a\u0004\bl\u0010>\"\u0004\bm\u0010@R\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010pR\"\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010rR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0006¢\u0006\f\n\u0004\bR\u0010r\u001a\u0004\bW\u0010tR#\u0010v\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u00170\u00158\u0006¢\u0006\f\n\u0004\bl\u0010r\u001a\u0004\bP\u0010tR\u0017\u0010z\u001a\u00020w8\u0006¢\u0006\f\n\u0004\bj\u0010x\u001a\u0004\bb\u0010yR(\u0010\u007f\u001a\u0004\u0018\u00010I2\b\u0010{\u001a\u0004\u0018\u00010I8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010|\"\u0004\b}\u0010~R,\u0010\u0083\u0001\u001a\u0004\u0018\u00010N2\b\u0010{\u001a\u0004\u0018\u00010N8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bJ\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/foundation/text/c1;", "", "Landroidx/compose/foundation/text/m0;", "textDelegate", "Landroidx/compose/runtime/e3;", "recomposeScope", "Landroidx/compose/ui/platform/g5;", "keyboardController", "<init>", "(Landroidx/compose/foundation/text/m0;Landroidx/compose/runtime/e3;Landroidx/compose/ui/platform/g5;)V", "Landroidx/compose/ui/text/e;", "untransformedText", "visualText", "Landroidx/compose/ui/text/v0;", "textStyle", "", "softWrap", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/z0;", "Lkotlin/k2;", "onValueChange", "Landroidx/compose/foundation/text/d0;", "keyboardActions", "Landroidx/compose/ui/focus/m;", "focusManager", "Landroidx/compose/ui/graphics/d2;", "selectionBackgroundColor", "J", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/v0;ZLandroidx/compose/ui/unit/d;Landroidx/compose/ui/text/font/y$b;Lld/l;Landroidx/compose/foundation/text/d0;Landroidx/compose/ui/focus/m;J)V", "a", "Landroidx/compose/foundation/text/m0;", "s", "()Landroidx/compose/foundation/text/m0;", "H", "(Landroidx/compose/foundation/text/m0;)V", "b", "Landroidx/compose/runtime/e3;", "m", "()Landroidx/compose/runtime/e3;", "c", "Landroidx/compose/ui/platform/g5;", "f", "()Landroidx/compose/ui/platform/g5;", "Landroidx/compose/ui/text/input/r;", "d", "Landroidx/compose/ui/text/input/r;", "l", "()Landroidx/compose/ui/text/input/r;", "processor", "Landroidx/compose/ui/text/input/h1;", "e", "Landroidx/compose/ui/text/input/h1;", "()Landroidx/compose/ui/text/input/h1;", "z", "(Landroidx/compose/ui/text/input/h1;)V", "inputSession", "<set-?>", "Landroidx/compose/runtime/k2;", "()Z", "x", "(Z)V", "hasFocus", "Landroidx/compose/ui/unit/h;", "g", "i", "()F", "C", "(F)V", "minHeightForSingleLineField", "Landroidx/compose/ui/layout/u;", "h", "Landroidx/compose/ui/layout/u;", "_layoutCoordinates", "Landroidx/compose/runtime/k2;", "Landroidx/compose/foundation/text/e1;", "layoutResultState", "j", "Landroidx/compose/ui/text/e;", "t", "()Landroidx/compose/ui/text/e;", "I", "(Landroidx/compose/ui/text/e;)V", "Landroidx/compose/foundation/text/p;", "k", "()Landroidx/compose/foundation/text/p;", "w", "(Landroidx/compose/foundation/text/p;)V", "handleState", "p", "E", "showFloatingToolbar", "r", "G", "showSelectionHandleStart", "n", "q", "F", "showSelectionHandleEnd", "o", "D", "showCursorHandle", "Z", "v", "isLayoutResultStale", "u", "y", "isInTouchMode", "Landroidx/compose/foundation/text/b0;", "Landroidx/compose/foundation/text/b0;", "keyboardActionRunner", "Lld/l;", "onValueChangeOriginal", "()Lld/l;", "Landroidx/compose/ui/text/input/y;", "onImeActionPerformed", "Landroidx/compose/ui/graphics/d5;", "Landroidx/compose/ui/graphics/d5;", "()Landroidx/compose/ui/graphics/d5;", "selectionPaint", "value", "()Landroidx/compose/ui/layout/u;", "A", "(Landroidx/compose/ui/layout/u;)V", "layoutCoordinates", "()Landroidx/compose/foundation/text/e1;", "B", "(Landroidx/compose/foundation/text/e1;)V", "layoutResult", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n154#2:1196\n81#3:1197\n107#3,2:1198\n81#3:1200\n107#3,2:1201\n81#3:1204\n107#3,2:1205\n81#3:1207\n107#3,2:1208\n81#3:1210\n107#3,2:1211\n81#3:1213\n107#3,2:1214\n81#3:1216\n107#3,2:1217\n81#3:1219\n107#3,2:1220\n1#4:1203\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/TextFieldState\n*L\n829#1:1196\n824#1:1197\n824#1:1198,2\n829#1:1200\n829#1:1201,2\n889#1:1204\n889#1:1205,2\n899#1:1207\n899#1:1208,2\n905#1:1210\n905#1:1211,2\n911#1:1213\n911#1:1214,2\n917#1:1216\n917#1:1217,2\n929#1:1219\n929#1:1220,2\n*E\n"})
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: w, reason: collision with root package name */
    public static final int f7214w = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private m0 textDelegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e3 recomposeScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final g5 keyboardController;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.r processor = new androidx.compose.ui.text.input.r();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.input.h1 inputSession;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 hasFocus;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 minHeightForSingleLineField;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u _layoutCoordinates;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2<e1> layoutResultState;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.e untransformedText;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 handleState;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 showFloatingToolbar;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 showSelectionHandleStart;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 showSelectionHandleEnd;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 showCursorHandle;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isLayoutResultStale;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 isInTouchMode;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b0 keyboardActionRunner;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> onValueChangeOriginal;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> onValueChange;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<androidx.compose.ui.text.input.y, kotlin.k2> onImeActionPerformed;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d5 selectionPaint;

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/y;", "imeAction", "Lkotlin/k2;", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.y, kotlin.k2> {
        a() {
            super(1);
        }

        public final void a(int i4) {
            c1.this.keyboardActionRunner.d(i4);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.text.input.y yVar) {
            a(yVar.getValue());
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> {
        b() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
            String i4 = z0Var.i();
            androidx.compose.ui.text.e untransformedText = c1.this.getUntransformedText();
            if (!kotlin.jvm.internal.l0.g(i4, untransformedText != null ? untransformedText.getText() : null)) {
                c1.this.w(p.None);
            }
            c1.this.onValueChangeOriginal.invoke(z0Var);
            c1.this.getRecomposeScope().invalidate();
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            a(z0Var);
            return kotlin.k2.f75408a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "it", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/text/input/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f7239b = new c(1);

        c() {
            super(1);
        }

        public final void a(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(androidx.compose.ui.text.input.z0 z0Var) {
            return kotlin.k2.f75408a;
        }
    }

    public c1(@fg.l m0 m0Var, @fg.l e3 e3Var, @fg.m g5 g5Var) {
        k2 g4;
        k2 g5;
        k2<e1> g6;
        k2 g7;
        k2 g10;
        k2 g11;
        k2 g12;
        k2 g13;
        k2 g14;
        this.textDelegate = m0Var;
        this.recomposeScope = e3Var;
        this.keyboardController = g5Var;
        Boolean bool = Boolean.FALSE;
        g4 = t4.g(bool, null, 2, null);
        this.hasFocus = g4;
        g5 = t4.g(androidx.compose.ui.unit.h.d(androidx.compose.ui.unit.h.g(0)), null, 2, null);
        this.minHeightForSingleLineField = g5;
        g6 = t4.g(null, null, 2, null);
        this.layoutResultState = g6;
        g7 = t4.g(p.None, null, 2, null);
        this.handleState = g7;
        g10 = t4.g(bool, null, 2, null);
        this.showFloatingToolbar = g10;
        g11 = t4.g(bool, null, 2, null);
        this.showSelectionHandleStart = g11;
        g12 = t4.g(bool, null, 2, null);
        this.showSelectionHandleEnd = g12;
        g13 = t4.g(bool, null, 2, null);
        this.showCursorHandle = g13;
        this.isLayoutResultStale = true;
        g14 = t4.g(Boolean.TRUE, null, 2, null);
        this.isInTouchMode = g14;
        this.keyboardActionRunner = new b0(g5Var);
        this.onValueChangeOriginal = c.f7239b;
        this.onValueChange = new b();
        this.onImeActionPerformed = new a();
        this.selectionPaint = new androidx.compose.ui.graphics.t0();
    }

    public final void A(@fg.m androidx.compose.ui.layout.u uVar) {
        this._layoutCoordinates = uVar;
    }

    public final void B(@fg.m e1 e1Var) {
        this.layoutResultState.setValue(e1Var);
        this.isLayoutResultStale = false;
    }

    public final void C(float f4) {
        this.minHeightForSingleLineField.setValue(androidx.compose.ui.unit.h.d(f4));
    }

    public final void D(boolean z4) {
        this.showCursorHandle.setValue(Boolean.valueOf(z4));
    }

    public final void E(boolean z4) {
        this.showFloatingToolbar.setValue(Boolean.valueOf(z4));
    }

    public final void F(boolean z4) {
        this.showSelectionHandleEnd.setValue(Boolean.valueOf(z4));
    }

    public final void G(boolean z4) {
        this.showSelectionHandleStart.setValue(Boolean.valueOf(z4));
    }

    public final void H(@fg.l m0 m0Var) {
        this.textDelegate = m0Var;
    }

    public final void I(@fg.m androidx.compose.ui.text.e eVar) {
        this.untransformedText = eVar;
    }

    public final void J(@fg.l androidx.compose.ui.text.e untransformedText, @fg.l androidx.compose.ui.text.e visualText, @fg.l androidx.compose.ui.text.v0 textStyle, boolean softWrap, @fg.l androidx.compose.ui.unit.d density, @fg.l y.b fontFamilyResolver, @fg.l ld.l<? super androidx.compose.ui.text.input.z0, kotlin.k2> onValueChange, @fg.l d0 keyboardActions, @fg.l androidx.compose.ui.focus.m focusManager, long selectionBackgroundColor) {
        this.onValueChangeOriginal = onValueChange;
        this.selectionPaint.m(selectionBackgroundColor);
        b0 b0Var = this.keyboardActionRunner;
        b0Var.keyboardActions = keyboardActions;
        b0Var.focusManager = focusManager;
        this.untransformedText = untransformedText;
        m0 c5 = n0.c(this.textDelegate, visualText, textStyle, density, fontFamilyResolver, softWrap, 0, 0, 0, kotlin.collections.j0.f74919b, net.minidev.json.parser.f.f81763q, null);
        if (this.textDelegate != c5) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = c5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fg.l
    public final p c() {
        return (p) this.handleState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final androidx.compose.ui.text.input.h1 getInputSession() {
        return this.inputSession;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final g5 getKeyboardController() {
        return this.keyboardController;
    }

    @fg.m
    public final androidx.compose.ui.layout.u g() {
        androidx.compose.ui.layout.u uVar = this._layoutCoordinates;
        if (uVar == null || !uVar.f()) {
            return null;
        }
        return uVar;
    }

    @fg.m
    public final e1 h() {
        return this.layoutResultState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float i() {
        return ((androidx.compose.ui.unit.h) this.minHeightForSingleLineField.getValue()).u();
    }

    @fg.l
    public final ld.l<androidx.compose.ui.text.input.y, kotlin.k2> j() {
        return this.onImeActionPerformed;
    }

    @fg.l
    public final ld.l<androidx.compose.ui.text.input.z0, kotlin.k2> k() {
        return this.onValueChange;
    }

    @fg.l
    /* renamed from: l, reason: from getter */
    public final androidx.compose.ui.text.input.r getProcessor() {
        return this.processor;
    }

    @fg.l
    /* renamed from: m, reason: from getter */
    public final e3 getRecomposeScope() {
        return this.recomposeScope;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final d5 getSelectionPaint() {
        return this.selectionPaint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o() {
        return ((Boolean) this.showCursorHandle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return ((Boolean) this.showFloatingToolbar.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean q() {
        return ((Boolean) this.showSelectionHandleEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r() {
        return ((Boolean) this.showSelectionHandleStart.getValue()).booleanValue();
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final m0 getTextDelegate() {
        return this.textDelegate;
    }

    @fg.m
    /* renamed from: t, reason: from getter */
    public final androidx.compose.ui.text.e getUntransformedText() {
        return this.untransformedText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean u() {
        return ((Boolean) this.isInTouchMode.getValue()).booleanValue();
    }

    /* renamed from: v, reason: from getter */
    public final boolean getIsLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    public final void w(@fg.l p pVar) {
        this.handleState.setValue(pVar);
    }

    public final void x(boolean z4) {
        this.hasFocus.setValue(Boolean.valueOf(z4));
    }

    public final void y(boolean z4) {
        this.isInTouchMode.setValue(Boolean.valueOf(z4));
    }

    public final void z(@fg.m androidx.compose.ui.text.input.h1 h1Var) {
        this.inputSession = h1Var;
    }
}
