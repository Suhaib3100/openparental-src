package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.graphics.y4;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: CursorAnchorInfoController.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010 \u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010%R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/input/l;", "", "Landroidx/compose/ui/input/pointer/r0;", "rootPositionCalculator", "Landroidx/compose/ui/text/input/c0;", "inputMethodManager", "<init>", "(Landroidx/compose/ui/input/pointer/r0;Landroidx/compose/ui/text/input/c0;)V", "Lkotlin/k2;", "c", "()V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/z0;", "textFieldValue", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/y4;", "textFieldToRootTransform", "Li0/i;", "innerTextFieldBounds", "decorationBoxBounds", "d", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/ui/text/n0;Lld/l;Li0/i;Li0/i;)V", "a", "Landroidx/compose/ui/input/pointer/r0;", "Landroidx/compose/ui/text/input/c0;", "Z", "monitorEnabled", "hasPendingImmediateRequest", "e", "f", "g", "h", "i", "Landroidx/compose/ui/text/input/z0;", "j", "Landroidx/compose/ui/text/n0;", "k", "Landroidx/compose/ui/text/input/p0;", "l", "Lld/l;", "m", "Li0/i;", "n", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "o", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "builder", "p", "[F", "matrix", "Landroid/graphics/Matrix;", "q", "Landroid/graphics/Matrix;", "androidMatrix", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: r, reason: collision with root package name */
    public static final int f21051r = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.input.pointer.r0 rootPositionCalculator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c0 inputMethodManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean monitorEnabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hasPendingImmediateRequest;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean includeInsertionMarker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean includeCharacterBounds;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean includeEditorBounds;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean includeLineBounds;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private z0 textFieldValue;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.text.n0 textLayoutResult;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private p0 offsetMapping;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.i innerTextFieldBounds;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private i0.i decorationBoxBounds;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super y4, k2> textFieldToRootTransform = b.f21070b;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final float[] matrix = y4.c(null, 1, null);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Matrix androidMatrix = new Matrix();

    /* compiled from: CursorAnchorInfoController.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/y4;", "it", "Lkotlin/k2;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<y4, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21069b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l float[] fArr) {
        }

        @Override // ld.l
        public k2 invoke(y4 y4Var) {
            y4Var.y();
            return k2.f75408a;
        }
    }

    /* compiled from: CursorAnchorInfoController.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/y4;", "it", "Lkotlin/k2;", "a", "([F)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<y4, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21070b = new b(1);

        b() {
            super(1);
        }

        public final void a(@fg.l float[] fArr) {
        }

        @Override // ld.l
        public k2 invoke(y4 y4Var) {
            y4Var.y();
            return k2.f75408a;
        }
    }

    public l(@fg.l androidx.compose.ui.input.pointer.r0 r0Var, @fg.l c0 c0Var) {
        this.rootPositionCalculator = r0Var;
        this.inputMethodManager = c0Var;
    }

    private final void c() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(y4.a(this.matrix));
            this.rootPositionCalculator.e(this.matrix);
            androidx.compose.ui.graphics.s0.a(this.androidMatrix, this.matrix);
            c0 c0Var = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            z0 z0Var = this.textFieldValue;
            kotlin.jvm.internal.l0.m(z0Var);
            p0 p0Var = this.offsetMapping;
            kotlin.jvm.internal.l0.m(p0Var);
            androidx.compose.ui.text.n0 n0Var = this.textLayoutResult;
            kotlin.jvm.internal.l0.m(n0Var);
            Matrix matrix = this.androidMatrix;
            i0.i iVar = this.innerTextFieldBounds;
            kotlin.jvm.internal.l0.m(iVar);
            i0.i iVar2 = this.decorationBoxBounds;
            kotlin.jvm.internal.l0.m(iVar2);
            c0Var.f(k.b(builder, z0Var, p0Var, n0Var, matrix, iVar, iVar2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void a() {
        this.textFieldValue = null;
        this.offsetMapping = null;
        this.textLayoutResult = null;
        this.textFieldToRootTransform = a.f21069b;
        this.innerTextFieldBounds = null;
        this.decorationBoxBounds = null;
    }

    public final void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        this.includeInsertionMarker = includeInsertionMarker;
        this.includeCharacterBounds = includeCharacterBounds;
        this.includeEditorBounds = includeEditorBounds;
        this.includeLineBounds = includeLineBounds;
        if (immediate) {
            this.hasPendingImmediateRequest = true;
            if (this.textFieldValue != null) {
                c();
            }
        }
        this.monitorEnabled = monitor;
    }

    public final void d(@fg.l z0 textFieldValue, @fg.l p0 offsetMapping, @fg.l androidx.compose.ui.text.n0 textLayoutResult, @fg.l ld.l<? super y4, k2> textFieldToRootTransform, @fg.l i0.i innerTextFieldBounds, @fg.l i0.i decorationBoxBounds) {
        this.textFieldValue = textFieldValue;
        this.offsetMapping = offsetMapping;
        this.textLayoutResult = textLayoutResult;
        this.textFieldToRootTransform = textFieldToRootTransform;
        this.innerTextFieldBounds = innerTextFieldBounds;
        this.decorationBoxBounds = decorationBoxBounds;
        if (this.hasPendingImmediateRequest || this.monitorEnabled) {
            c();
        }
    }
}
