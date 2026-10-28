package androidx.compose.foundation.text2.input.internal;

import androidx.compose.runtime.o4;
import androidx.compose.runtime.t4;
import androidx.compose.ui.text.font.y;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TextLayoutState.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&RC\u00100\u001a#\u0012\u0004\u0012\u00020\u0011\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190)\u0012\u0004\u0012\u00020\u000e\u0018\u00010(¢\u0006\u0002\b*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001d\u00104\u001a\u0004\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u00103R/\u0010=\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R/\u0010?\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00108\u001a\u0004\b1\u0010:\"\u0004\b>\u0010<R/\u0010B\u001a\u0004\u0018\u0001052\b\u00106\u001a\u0004\u0018\u0001058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b@\u00108\u001a\u0004\b7\u0010:\"\u0004\bA\u0010<R1\u0010G\u001a\u00020C2\u0006\u00106\u001a\u00020C8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b@\u0010D\"\u0004\bE\u0010F\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/j0;", "", "<init>", "()V", "Li0/f;", "b", "(J)J", "Landroidx/compose/foundation/text2/input/internal/m0;", "textFieldState", "Landroidx/compose/ui/text/v0;", "textStyle", "", "singleLine", "softWrap", "Lkotlin/k2;", "r", "(Landroidx/compose/foundation/text2/input/internal/m0;Landroidx/compose/ui/text/v0;ZZ)V", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/text/font/y$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/text/n0;", "l", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/w;Landroidx/compose/ui/text/font/y$b;J)Landroidx/compose/ui/text/n0;", "position", "coerceInVisibleBounds", "", "g", "(JZ)I", "offset", "k", "(J)Z", "Landroidx/compose/foundation/text2/input/internal/e0;", "a", "Landroidx/compose/foundation/text2/input/internal/e0;", "layoutCache", "Lkotlin/Function2;", "Lkotlin/Function0;", "Lkotlin/u;", "Lld/p;", "i", "()Lld/p;", "p", "(Lld/p;)V", "onTextLayout", "c", "e", "()Landroidx/compose/ui/text/n0;", "layoutResult", "Landroidx/compose/ui/layout/u;", "<set-?>", "d", "Landroidx/compose/runtime/k2;", "j", "()Landroidx/compose/ui/layout/u;", "q", "(Landroidx/compose/ui/layout/u;)V", "textLayoutNodeCoordinates", "m", "coreNodeCoordinates", "f", "n", "decoratorNodeCoordinates", "Landroidx/compose/ui/unit/h;", "()F", "o", "(F)V", "minHeightForSingleLineField", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n154#2:234\n81#3:235\n81#3:236\n107#3,2:237\n81#3:239\n107#3,2:240\n81#3:242\n107#3,2:243\n81#3:245\n107#3,2:246\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutState\n*L\n79#1:234\n45#1:235\n72#1:236\n72#1:237,2\n73#1:239\n73#1:240,2\n74#1:242\n74#1:243,2\n79#1:245\n79#1:246,2\n*E\n"})
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f8675h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private e0 layoutCache;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<n0>, k2> onTextLayout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e0 layoutResult;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 textLayoutNodeCoordinates;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 coreNodeCoordinates;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 decoratorNodeCoordinates;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2 minHeightForSingleLineField;

    /* compiled from: TextLayoutState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/n0;", "a", "()Landroidx/compose/ui/text/n0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<n0> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n0 invoke() {
            return j0.this.layoutCache.getValue();
        }
    }

    public j0() {
        androidx.compose.runtime.k2 g4;
        e0 e0Var = new e0();
        this.layoutCache = e0Var;
        this.layoutResult = e0Var;
        this.textLayoutNodeCoordinates = androidx.compose.runtime.b.e(null, o4.m());
        this.coreNodeCoordinates = androidx.compose.runtime.b.e(null, o4.m());
        this.decoratorNodeCoordinates = androidx.compose.runtime.b.e(null, o4.m());
        g4 = t4.g(androidx.compose.ui.unit.h.d(androidx.compose.ui.unit.h.g(0)), null, 2, null);
        this.minHeightForSingleLineField = g4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long b(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.u r0 = r5.j()
            if (r0 == 0) goto L25
            boolean r1 = r0.f()
            if (r1 == 0) goto L1a
            androidx.compose.ui.layout.u r1 = r5.d()
            r2 = 0
            if (r1 == 0) goto L23
            r3 = 0
            r4 = 2
            i0.i r2 = androidx.compose.ui.layout.u.A(r1, r0, r3, r4, r2)
            goto L23
        L1a:
            i0.i$a r0 = i0.i.INSTANCE
            r0.getClass()
            i0.i r2 = i0.i.a()
        L23:
            if (r2 != 0) goto L2e
        L25:
            i0.i$a r0 = i0.i.INSTANCE
            r0.getClass()
            i0.i r2 = i0.i.a()
        L2e:
            long r6 = androidx.compose.foundation.text2.input.internal.k0.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.j0.b(long):long");
    }

    public static /* synthetic */ int h(j0 j0Var, long j4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return j0Var.g(j4, z4);
    }

    @fg.m
    public final androidx.compose.ui.layout.u c() {
        return (androidx.compose.ui.layout.u) this.coreNodeCoordinates.getValue();
    }

    @fg.m
    public final androidx.compose.ui.layout.u d() {
        return (androidx.compose.ui.layout.u) this.decoratorNodeCoordinates.getValue();
    }

    @fg.m
    public final n0 e() {
        return this.layoutResult.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float f() {
        return ((androidx.compose.ui.unit.h) this.minHeightForSingleLineField.getValue()).u();
    }

    public final int g(long position, boolean coerceInVisibleBounds) {
        n0 e4 = e();
        if (e4 == null) {
            return -1;
        }
        if (coerceInVisibleBounds) {
            position = b(position);
        }
        return e4.x(k0.b(this, position));
    }

    @fg.m
    public final ld.p<androidx.compose.ui.unit.d, ld.a<n0>, k2> i() {
        return this.onTextLayout;
    }

    @fg.m
    public final androidx.compose.ui.layout.u j() {
        return (androidx.compose.ui.layout.u) this.textLayoutNodeCoordinates.getValue();
    }

    public final boolean k(long offset) {
        n0 e4 = e();
        if (e4 == null) {
            return false;
        }
        long b5 = k0.b(this, b(offset));
        int r4 = e4.r(i0.f.r(b5));
        return i0.f.p(b5) >= e4.s(r4) && i0.f.p(b5) <= e4.t(r4);
    }

    @fg.l
    public final n0 l(@fg.l androidx.compose.ui.unit.d density, @fg.l androidx.compose.ui.unit.w layoutDirection, @fg.l y.b fontFamilyResolver, long constraints) {
        n0 s4 = this.layoutCache.s(density, layoutDirection, fontFamilyResolver, constraints);
        ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<n0>, k2> pVar = this.onTextLayout;
        if (pVar != null) {
            pVar.invoke(density, new a());
        }
        return s4;
    }

    public final void m(@fg.m androidx.compose.ui.layout.u uVar) {
        this.coreNodeCoordinates.setValue(uVar);
    }

    public final void n(@fg.m androidx.compose.ui.layout.u uVar) {
        this.decoratorNodeCoordinates.setValue(uVar);
    }

    public final void o(float f4) {
        this.minHeightForSingleLineField.setValue(androidx.compose.ui.unit.h.d(f4));
    }

    public final void p(@fg.m ld.p<? super androidx.compose.ui.unit.d, ? super ld.a<n0>, k2> pVar) {
        this.onTextLayout = pVar;
    }

    public final void q(@fg.m androidx.compose.ui.layout.u uVar) {
        this.textLayoutNodeCoordinates.setValue(uVar);
    }

    public final void r(@fg.l m0 textFieldState, @fg.l v0 textStyle, boolean singleLine, boolean softWrap) {
        this.layoutCache.Q(textFieldState, textStyle, singleLine, softWrap);
    }
}
