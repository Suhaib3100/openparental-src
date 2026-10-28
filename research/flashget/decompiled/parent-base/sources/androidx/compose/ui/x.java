package androidx.compose.ui;

import androidx.compose.ui.layout.i1;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.node.c0;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;

/* compiled from: ZIndexModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/x;", "Landroidx/compose/ui/node/c0;", "Landroidx/compose/ui/q$d;", "", "zIndex", "<init>", "(F)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "", "toString", "()Ljava/lang/String;", "p", "F", "y7", "()F", "z7", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x extends q.d implements c0 {

    /* renamed from: q, reason: collision with root package name */
    public static final int f21768q = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* compiled from: ZIndexModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<i1.a, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f21770b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f21771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1 i1Var, x xVar) {
            super(1);
            this.f21770b = i1Var;
            this.f21771c = xVar;
        }

        public final void a(@fg.l i1.a aVar) {
            aVar.f(this.f21770b, 0, 0, this.f21771c.getZIndex());
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(i1.a aVar) {
            a(aVar);
            return k2.f75408a;
        }
    }

    public x(float f4) {
        this.zIndex = f4;
    }

    @Override // androidx.compose.ui.node.c0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l o0 o0Var, @fg.l l0 l0Var, long j4) {
        i1 m02 = l0Var.m0(j4);
        return o0.x2(o0Var, m02.getWidth(), m02.getHeight(), null, new a(m02, this), 4, null);
    }

    @fg.l
    public String toString() {
        return androidx.compose.animation.b.a(new StringBuilder("ZIndexModifier(zIndex="), this.zIndex, ')');
    }

    /* renamed from: y7, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void z7(float f4) {
        this.zIndex = f4;
    }
}
