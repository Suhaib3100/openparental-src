package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.e1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextPreparedSelection.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\u0019\u0010\u0013\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0002\b\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001d¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/selection/r0;", "Landroidx/compose/foundation/text/selection/b;", "Landroidx/compose/ui/text/input/z0;", "currentValue", "Landroidx/compose/ui/text/input/p0;", "offsetMapping", "Landroidx/compose/foundation/text/e1;", "layoutResultProxy", "Landroidx/compose/foundation/text/selection/w0;", "state", "<init>", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/p0;Landroidx/compose/foundation/text/e1;Landroidx/compose/foundation/text/selection/w0;)V", "", "pagesAmount", "j0", "(Landroidx/compose/foundation/text/e1;I)I", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/p;", "Lkotlin/u;", "or", "", "f0", "(Lld/l;)Ljava/util/List;", "l0", "()Landroidx/compose/foundation/text/selection/r0;", "k0", "k", "Landroidx/compose/ui/text/input/z0;", "g0", "()Landroidx/compose/ui/text/input/z0;", "l", "Landroidx/compose/foundation/text/e1;", "h0", "()Landroidx/compose/foundation/text/e1;", "i0", "value", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n74#2,5:438\n80#2:444\n74#2,7:445\n1#3:443\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n412#1:438,5\n412#1:444\n416#1:445,7\n*E\n"})
/* loaded from: classes.dex */
public final class r0 extends b<r0> {

    /* renamed from: m, reason: collision with root package name */
    public static final int f8110m = 8;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.z0 currentValue;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final e1 layoutResultProxy;

    public /* synthetic */ r0(androidx.compose.ui.text.input.z0 z0Var, androidx.compose.ui.text.input.p0 p0Var, e1 e1Var, w0 w0Var, int i4, kotlin.jvm.internal.w wVar) {
        this(z0Var, (i4 & 2) != 0 ? androidx.compose.ui.text.input.p0.INSTANCE.a() : p0Var, e1Var, (i4 & 8) != 0 ? new w0() : w0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int j0(androidx.compose.foundation.text.e1 r6, int r7) {
        /*
            r5 = this;
            androidx.compose.ui.layout.u r0 = r6.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            androidx.compose.ui.layout.u r1 = r6.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            i0.i r2 = androidx.compose.ui.layout.u.A(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1e
        L15:
            i0.i$a r0 = i0.i.INSTANCE
            r0.getClass()
            i0.i r2 = i0.i.a()
        L1e:
            androidx.compose.ui.text.input.p0 r0 = r5.getOffsetMapping()
            androidx.compose.ui.text.input.z0 r1 = r5.currentValue
            long r3 = r1.getSelection()
            int r1 = androidx.compose.ui.text.t0.i(r3)
            int r0 = r0.b(r1)
            androidx.compose.ui.text.n0 r1 = r6.getValue()
            i0.i r0 = r1.e(r0)
            float r1 = r0.t()
            float r0 = r0.getTop()
            long r2 = r2.z()
            float r2 = i0.n.m(r2)
            float r7 = (float) r7
            float r2 = r2 * r7
            float r2 = r2 + r0
            androidx.compose.ui.text.input.p0 r7 = r5.getOffsetMapping()
            androidx.compose.ui.text.n0 r6 = r6.getValue()
            long r0 = i0.g.a(r1, r2)
            int r6 = r6.x(r0)
            int r6 = r7.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.r0.j0(androidx.compose.foundation.text.e1, int):int");
    }

    @fg.m
    public final List<androidx.compose.ui.text.input.p> f0(@fg.l ld.l<? super r0, ? extends androidx.compose.ui.text.input.p> or) {
        if (!androidx.compose.ui.text.t0.h(getSelection())) {
            return kotlin.collections.w.O(new androidx.compose.ui.text.input.b("", 0), new androidx.compose.ui.text.input.y0(androidx.compose.ui.text.t0.l(getSelection()), androidx.compose.ui.text.t0.l(getSelection())));
        }
        androidx.compose.ui.text.input.p invoke = or.invoke(this);
        if (invoke != null) {
            return kotlin.collections.w.k(invoke);
        }
        return null;
    }

    @fg.l
    /* renamed from: g0, reason: from getter */
    public final androidx.compose.ui.text.input.z0 getCurrentValue() {
        return this.currentValue;
    }

    @fg.m
    /* renamed from: h0, reason: from getter */
    public final e1 getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    @fg.l
    public final androidx.compose.ui.text.input.z0 i0() {
        return androidx.compose.ui.text.input.z0.d(this.currentValue, getAnnotatedString(), getSelection(), null, 4, null);
    }

    @fg.l
    public final r0 k0() {
        e1 e1Var;
        if (B().length() > 0 && (e1Var = this.layoutResultProxy) != null) {
            int j02 = j0(e1Var, 1);
            a0(j02, j02);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @fg.l
    public final r0 l0() {
        e1 e1Var;
        if (B().length() > 0 && (e1Var = this.layoutResultProxy) != null) {
            int j02 = j0(e1Var, -1);
            a0(j02, j02);
        }
        kotlin.jvm.internal.l0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public r0(@fg.l androidx.compose.ui.text.input.z0 z0Var, @fg.l androidx.compose.ui.text.input.p0 p0Var, @fg.m e1 e1Var, @fg.l w0 w0Var) {
        super(z0Var.getAnnotatedString(), z0Var.getSelection(), e1Var != null ? e1Var.getValue() : null, p0Var, w0Var, null);
        this.currentValue = z0Var;
        this.layoutResultProxy = e1Var;
    }
}
