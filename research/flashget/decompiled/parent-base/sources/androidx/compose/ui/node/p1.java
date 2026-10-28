package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.annotation.c1;
import androidx.compose.ui.layout.i1;
import androidx.compose.ui.platform.d6;
import androidx.compose.ui.platform.g5;
import androidx.compose.ui.platform.i5;
import androidx.compose.ui.platform.p2;
import androidx.compose.ui.platform.s5;
import androidx.compose.ui.text.font.x;
import androidx.compose.ui.text.font.y;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Owner.kt */
@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 ]2\u00020\u0001:\u0002miJ5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H&ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH&ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b!\u0010\"J1\u0010)\u001a\u00020(2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\b0#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0&H&¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH&¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010\u000eJ\u001c\u00101\u001a\u0004\u0018\u0001002\u0006\u0010/\u001a\u00020.H&ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001d\u00104\u001a\u00020\b2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\b0&H&¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH&¢\u0006\u0004\b6\u0010,J\u0017\u00108\u001a\u00020\b2\u0006\u00103\u001a\u000207H&¢\u0006\u0004\b8\u00109R\u001a\u0010>\u001a\u00020:8gX§\u0004¢\u0006\f\u0012\u0004\b=\u0010,\u001a\u0004\b;\u0010<R\u001c\u0010C\u001a\u0004\u0018\u00010?8gX§\u0004¢\u0006\f\u0012\u0004\bB\u0010,\u001a\u0004\b@\u0010AR\u001a\u0010H\u001a\u00020D8&X§\u0004¢\u0006\f\u0012\u0004\bG\u0010,\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010w\u001a\u00020t8&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010{\u001a\u00020x8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R(\u0010\u008b\u0001\u001a\u00020\u00042\u0007\u0010\u0088\u0001\u001a\u00020\u00048&@gX¦\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010\u0019\"\u0005\b\u008a\u0001\u0010\u001cR\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010§\u0001\u001a\u00030¤\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006¨\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/p1;", "Landroidx/compose/ui/platform/p2;", "Landroidx/compose/ui/node/h0;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "Lkotlin/k2;", "Y", "(Landroidx/compose/ui/node/h0;ZZZ)V", "v", "(Landroidx/compose/ui/node/h0;ZZ)V", "y", "(Landroidx/compose/ui/node/h0;)V", "node", "T", "a0", "Li0/f;", "localPosition", "x", "(J)J", "positionInWindow", "X", "requestFocus", "()Z", "sendPointerUpdate", "r", "(Z)V", "Landroidx/compose/ui/unit/b;", "constraints", "V", "(Landroidx/compose/ui/node/h0;J)V", "E", "(Landroidx/compose/ui/node/h0;Z)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "Landroidx/compose/ui/node/o1;", "O", "(Lld/l;Lld/a;)Landroidx/compose/ui/node/o1;", "i0", "()V", "A", "Landroidx/compose/ui/input/key/c;", "keyEvent", "Landroidx/compose/ui/focus/f;", "Q", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/f;", "listener", "g0", "(Lld/a;)V", "h0", "Landroidx/compose/ui/node/p1$b;", "G", "(Landroidx/compose/ui/node/p1$b;)V", "Lh0/a0;", "j0", "()Lh0/a0;", "u", "autofillTree", "Lh0/j;", "H", "()Lh0/j;", "Z", "autofill", "Landroidx/compose/ui/text/font/x$b;", "S", "()Landroidx/compose/ui/text/font/x$b;", "R", "fontLoader", "getRoot", "()Landroidx/compose/ui/node/h0;", "root", "Landroidx/compose/ui/node/j0;", "b0", "()Landroidx/compose/ui/node/j0;", "sharedDrawScope", "Landroidx/compose/ui/node/x1;", "P", "()Landroidx/compose/ui/node/x1;", "rootForTest", "Lk0/a;", "f0", "()Lk0/a;", "hapticFeedBack", "Ll0/b;", "I", "()Ll0/b;", "inputModeManager", "Landroidx/compose/ui/platform/f1;", "c0", "()Landroidx/compose/ui/platform/f1;", "clipboardManager", "Landroidx/compose/ui/platform/b;", "D", "()Landroidx/compose/ui/platform/b;", "accessibilityManager", "Landroidx/compose/ui/platform/i5;", "N", "()Landroidx/compose/ui/platform/i5;", "textToolbar", "Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/text/input/b1;", "a", "()Landroidx/compose/ui/text/input/b1;", "textInputService", "Landroidx/compose/ui/platform/g5;", "W", "()Landroidx/compose/ui/platform/g5;", "softwareKeyboardController", "Landroidx/compose/ui/input/pointer/y;", "z", "()Landroidx/compose/ui/input/pointer/y;", "pointerIconService", "Landroidx/compose/ui/focus/s;", "t", "()Landroidx/compose/ui/focus/s;", "focusOwner", "Landroidx/compose/ui/platform/d6;", "d0", "()Landroidx/compose/ui/platform/d6;", "windowInfo", "Landroidx/compose/ui/text/font/y$b;", "K", "()Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "<set-?>", "l0", "B", "showLayoutBounds", "", "L", "()J", "measureIteration", "Landroidx/compose/ui/platform/s5;", "d", "()Landroidx/compose/ui/platform/s5;", "viewConfiguration", "Landroidx/compose/ui/node/r1;", "J", "()Landroidx/compose/ui/node/r1;", "snapshotObserver", "Landroidx/compose/ui/modifier/h;", "M", "()Landroidx/compose/ui/modifier/h;", "modifierLocalManager", "Lkotlin/coroutines/g;", "q", "()Lkotlin/coroutines/g;", "coroutineContext", "Landroidx/compose/ui/layout/i1$a;", "C", "()Landroidx/compose/ui/layout/i1$a;", "placementScope", "Landroidx/compose/ui/draganddrop/c;", "U", "()Landroidx/compose/ui/draganddrop/c;", "dragAndDropManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface p1 extends p2 {

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = Companion.f19456a;

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/p1$a;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "(Z)V", "enableExtraAssertions", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.p1$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f19456a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean a() {
            return enableExtraAssertions;
        }

        public final void b(boolean z4) {
            enableExtraAssertions = z4;
        }
    }

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/p1$b;", "", "Lkotlin/k2;", "s", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface b {
        void s();
    }

    static /* synthetic */ void F(p1 p1Var, h0 h0Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        p1Var.E(h0Var, z4);
    }

    @kotlin.k(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @kotlin.x0(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void R() {
    }

    @androidx.compose.ui.k
    static /* synthetic */ void Z() {
    }

    static /* synthetic */ void k0(p1 p1Var, h0 h0Var, boolean z4, boolean z5, boolean z6, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            z5 = false;
        }
        if ((i4 & 8) != 0) {
            z6 = true;
        }
        p1Var.Y(h0Var, z4, z5, z6);
    }

    static /* synthetic */ void s(p1 p1Var, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        p1Var.r(z4);
    }

    @androidx.compose.ui.k
    static /* synthetic */ void u() {
    }

    static /* synthetic */ void w(p1 p1Var, h0 h0Var, boolean z4, boolean z5, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            z5 = false;
        }
        p1Var.v(h0Var, z4, z5);
    }

    void A(@fg.l h0 layoutNode);

    @x
    @androidx.annotation.c1({c1.a.LIBRARY})
    void B(boolean z4);

    @fg.l
    default i1.a C() {
        return androidx.compose.ui.layout.j1.b(this);
    }

    @fg.l
    androidx.compose.ui.platform.b D();

    void E(@fg.l h0 layoutNode, boolean affectsLookahead);

    void G(@fg.l b listener);

    @androidx.compose.ui.k
    @fg.m
    h0.j H();

    @fg.l
    l0.b I();

    @fg.l
    r1 J();

    @fg.l
    y.b K();

    long L();

    @fg.l
    androidx.compose.ui.modifier.h M();

    @fg.l
    i5 N();

    @fg.l
    o1 O(@fg.l ld.l<? super androidx.compose.ui.graphics.v1, k2> drawBlock, @fg.l ld.a<k2> invalidateParentLayer);

    @fg.l
    x1 P();

    @fg.m
    androidx.compose.ui.focus.f Q(@fg.l KeyEvent keyEvent);

    @fg.l
    x.b S();

    void T(@fg.l h0 node);

    @fg.l
    androidx.compose.ui.draganddrop.c U();

    void V(@fg.l h0 layoutNode, long constraints);

    @fg.l
    g5 W();

    long X(long positionInWindow);

    void Y(@fg.l h0 layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    @fg.l
    androidx.compose.ui.text.input.b1 a();

    void a0(@fg.l h0 node);

    @fg.l
    androidx.compose.ui.unit.d b();

    @fg.l
    j0 b0();

    @fg.l
    androidx.compose.ui.platform.f1 c0();

    @fg.l
    s5 d();

    @fg.l
    d6 d0();

    @fg.l
    k0.a f0();

    void g0(@fg.l ld.a<k2> listener);

    @fg.l
    androidx.compose.ui.unit.w getLayoutDirection();

    @fg.l
    h0 getRoot();

    void h0();

    void i0();

    @fg.l
    @androidx.compose.ui.k
    h0.a0 j0();

    boolean l0();

    @fg.l
    kotlin.coroutines.g q();

    void r(boolean sendPointerUpdate);

    boolean requestFocus();

    @fg.l
    androidx.compose.ui.focus.s t();

    void v(@fg.l h0 layoutNode, boolean affectsLookahead, boolean forceRequest);

    long x(long localPosition);

    void y(@fg.l h0 layoutNode);

    @fg.l
    androidx.compose.ui.input.pointer.y z();
}
