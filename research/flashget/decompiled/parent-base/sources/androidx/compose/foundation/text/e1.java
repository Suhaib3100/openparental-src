package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextLayoutResultProxy.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\bJ\u001a\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010(\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#\"\u0004\b'\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/foundation/text/e1;", "", "Landroidx/compose/ui/text/n0;", "value", "<init>", "(Landroidx/compose/ui/text/n0;)V", "Li0/f;", "a", "(J)J", "position", "", "coerceInVisibleBounds", "", "g", "(JZ)I", "", "vertical", "f", "(F)I", "lineIndex", "visibleEnd", "d", "(IZ)I", "offset", "j", "(J)Z", "m", "n", "Landroidx/compose/ui/text/n0;", "i", "()Landroidx/compose/ui/text/n0;", "Landroidx/compose/ui/layout/u;", "b", "Landroidx/compose/ui/layout/u;", "c", "()Landroidx/compose/ui/layout/u;", "l", "(Landroidx/compose/ui/layout/u;)V", "innerTextFieldCoordinates", "k", "decorationBoxCoordinates", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7320d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.n0 value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u innerTextFieldCoordinates;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u decorationBoxCoordinates;

    public e1(@fg.l androidx.compose.ui.text.n0 n0Var) {
        this.value = n0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long a(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.u r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L21
            boolean r1 = r0.f()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.u r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1f
            r3 = 0
            r4 = 2
            i0.i r2 = androidx.compose.ui.layout.u.A(r1, r0, r3, r4, r2)
            goto L1f
        L16:
            i0.i$a r0 = i0.i.INSTANCE
            r0.getClass()
            i0.i r2 = i0.i.a()
        L1f:
            if (r2 != 0) goto L2a
        L21:
            i0.i$a r0 = i0.i.INSTANCE
            r0.getClass()
            i0.i r2 = i0.i.a()
        L2a:
            long r6 = androidx.compose.foundation.text.f1.a(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.e1.a(long):long");
    }

    public static int e(e1 e1Var, int i4, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return e1Var.value.o(i4, z4);
    }

    public static /* synthetic */ int h(e1 e1Var, long j4, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return e1Var.g(j4, z4);
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.layout.u getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @fg.m
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.layout.u getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int d(int lineIndex, boolean visibleEnd) {
        return this.value.o(lineIndex, visibleEnd);
    }

    public final int f(float vertical) {
        return this.value.r(i0.f.r(m(a(i0.g.a(0.0f, vertical)))));
    }

    public final int g(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = a(position);
        }
        return this.value.x(m(position));
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final androidx.compose.ui.text.n0 getValue() {
        return this.value;
    }

    public final boolean j(long offset) {
        long m4 = m(a(offset));
        int r4 = this.value.r(i0.f.r(m4));
        return i0.f.p(m4) >= this.value.s(r4) && i0.f.p(m4) <= this.value.t(r4);
    }

    public final void k(@fg.m androidx.compose.ui.layout.u uVar) {
        this.decorationBoxCoordinates = uVar;
    }

    public final void l(@fg.m androidx.compose.ui.layout.u uVar) {
        this.innerTextFieldCoordinates = uVar;
    }

    public final long m(long offset) {
        androidx.compose.ui.layout.u uVar;
        androidx.compose.ui.layout.u uVar2 = this.innerTextFieldCoordinates;
        if (uVar2 == null) {
            return offset;
        }
        if (!uVar2.f()) {
            uVar2 = null;
        }
        if (uVar2 == null || (uVar = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        androidx.compose.ui.layout.u uVar3 = uVar.f() ? uVar : null;
        return uVar3 == null ? offset : uVar2.E(uVar3, offset);
    }

    public final long n(long offset) {
        androidx.compose.ui.layout.u uVar;
        androidx.compose.ui.layout.u uVar2 = this.innerTextFieldCoordinates;
        if (uVar2 == null) {
            return offset;
        }
        if (!uVar2.f()) {
            uVar2 = null;
        }
        if (uVar2 == null || (uVar = this.decorationBoxCoordinates) == null) {
            return offset;
        }
        androidx.compose.ui.layout.u uVar3 = uVar.f() ? uVar : null;
        return uVar3 == null ? offset : uVar3.E(uVar2, offset);
    }
}
