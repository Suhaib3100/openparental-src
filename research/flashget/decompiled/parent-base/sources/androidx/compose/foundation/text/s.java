package androidx.compose.foundation.text;

import androidx.compose.foundation.w1;
import androidx.compose.ui.layout.i1;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TextFieldScroll.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010*\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010\u001aR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/foundation/text/s;", "Landroidx/compose/ui/layout/b0;", "Landroidx/compose/foundation/text/z0;", "scrollerPosition", "", "cursorOffset", "Landroidx/compose/ui/text/input/i1;", "transformedText", "Lkotlin/Function0;", "Landroidx/compose/foundation/text/e1;", "textLayoutResultProvider", "<init>", "(Landroidx/compose/foundation/text/z0;ILandroidx/compose/ui/text/input/i1;Lld/a;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "b", "()Landroidx/compose/foundation/text/z0;", "c", "()I", "d", "()Landroidx/compose/ui/text/input/i1;", "e", "()Lld/a;", "g", "(Landroidx/compose/foundation/text/z0;ILandroidx/compose/ui/text/input/i1;Lld/a;)Landroidx/compose/foundation/text/s;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text/z0;", "j", "I", "i", "Landroidx/compose/ui/text/input/i1;", "m", "Lld/a;", "k", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class s implements androidx.compose.ui.layout.b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z0 scrollerPosition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int cursorOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.input.i1 transformedText;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.a<e1> textLayoutResultProvider;

    /* compiled from: TextFieldScroll.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.o0 f7879b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f7880c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f7881d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f7882e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.o0 o0Var, s sVar, androidx.compose.ui.layout.i1 i1Var, int i4) {
            super(1);
            this.f7879b = o0Var;
            this.f7880c = sVar;
            this.f7881d = i1Var;
            this.f7882e = i4;
        }

        public final void a(@fg.l i1.a aVar) {
            i0.i b5;
            androidx.compose.ui.layout.o0 o0Var = this.f7879b;
            int i4 = this.f7880c.i();
            androidx.compose.ui.text.input.i1 m4 = this.f7880c.m();
            e1 invoke = this.f7880c.k().invoke();
            b5 = y0.b(o0Var, i4, m4, invoke != null ? invoke.getValue() : null, this.f7879b.getLayoutDirection() == androidx.compose.ui.unit.w.Rtl, this.f7881d.getWidth());
            this.f7880c.j().l(androidx.compose.foundation.gestures.j0.Horizontal, b5, this.f7882e, this.f7881d.getWidth());
            i1.a.m(aVar, this.f7881d, kotlin.math.b.L0(-this.f7880c.j().d()), 0, 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public s(@fg.l z0 z0Var, int i4, @fg.l androidx.compose.ui.text.input.i1 i1Var, @fg.l ld.a<e1> aVar) {
        this.scrollerPosition = z0Var;
        this.cursorOffset = i4;
        this.transformedText = i1Var;
        this.textLayoutResultProvider = aVar;
    }

    public static s h(s sVar, z0 z0Var, int i4, androidx.compose.ui.text.input.i1 i1Var, ld.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z0Var = sVar.scrollerPosition;
        }
        if ((i5 & 2) != 0) {
            i4 = sVar.cursorOffset;
        }
        if ((i5 & 4) != 0) {
            i1Var = sVar.transformedText;
        }
        if ((i5 & 8) != 0) {
            aVar = sVar.textLayoutResultProvider;
        }
        sVar.getClass();
        return new s(z0Var, i4, i1Var, aVar);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final z0 getScrollerPosition() {
        return this.scrollerPosition;
    }

    /* renamed from: c, reason: from getter */
    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final androidx.compose.ui.text.input.i1 getTransformedText() {
        return this.transformedText;
    }

    @fg.l
    public final ld.a<e1> e() {
        return this.textLayoutResultProvider;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return kotlin.jvm.internal.l0.g(this.scrollerPosition, sVar.scrollerPosition) && this.cursorOffset == sVar.cursorOffset && kotlin.jvm.internal.l0.g(this.transformedText, sVar.transformedText) && kotlin.jvm.internal.l0.g(this.textLayoutResultProvider, sVar.textLayoutResultProvider);
    }

    @Override // androidx.compose.ui.layout.b0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(l0Var.l0(androidx.compose.ui.unit.b.o(j4)) < androidx.compose.ui.unit.b.p(j4) ? j4 : androidx.compose.ui.unit.b.e(j4, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int min = Math.min(m02.getWidth(), androidx.compose.ui.unit.b.p(j4));
        return androidx.compose.ui.layout.o0.x2(o0Var, min, m02.getHeight(), null, new a(o0Var, this, m02, min), 4, null);
    }

    @fg.l
    public final s g(@fg.l z0 scrollerPosition, int cursorOffset, @fg.l androidx.compose.ui.text.input.i1 transformedText, @fg.l ld.a<e1> textLayoutResultProvider) {
        return new s(scrollerPosition, cursorOffset, transformedText, textLayoutResultProvider);
    }

    public int hashCode() {
        return this.textLayoutResultProvider.hashCode() + ((this.transformedText.hashCode() + w1.a(this.cursorOffset, this.scrollerPosition.hashCode() * 31, 31)) * 31);
    }

    public final int i() {
        return this.cursorOffset;
    }

    @fg.l
    public final z0 j() {
        return this.scrollerPosition;
    }

    @fg.l
    public final ld.a<e1> k() {
        return this.textLayoutResultProvider;
    }

    @fg.l
    public final androidx.compose.ui.text.input.i1 m() {
        return this.transformedText;
    }

    @fg.l
    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
