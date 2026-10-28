package androidx.compose.material3;

import androidx.compose.ui.layout.i1;
import kotlin.Metadata;

/* compiled from: InteractiveComponentSize.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/v6;", "Landroidx/compose/ui/layout/b0;", "Landroidx/compose/ui/unit/l;", "size", "<init>", "(JLkotlin/jvm/internal/w;)V", "Landroidx/compose/ui/layout/o0;", "Landroidx/compose/ui/layout/l0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "f", "(Landroidx/compose/ui/layout/o0;Landroidx/compose/ui/layout/l0;J)Landroidx/compose/ui/layout/n0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "J", "()J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class v6 implements androidx.compose.ui.layout.b0 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* compiled from: InteractiveComponentSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15053b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.i1 f15054c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f15055d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, androidx.compose.ui.layout.i1 i1Var, int i5) {
            super(1);
            this.f15053b = i4;
            this.f15054c = i1Var;
            this.f15055d = i5;
        }

        public final void a(@fg.l i1.a aVar) {
            i1.a.g(aVar, this.f15054c, kotlin.math.b.L0((this.f15053b - this.f15054c.getWidth()) / 2.0f), kotlin.math.b.L0((this.f15055d - this.f15054c.getHeight()) / 2.0f), 0.0f, 4, null);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ kotlin.k2 invoke(i1.a aVar) {
            a(aVar);
            return kotlin.k2.f75408a;
        }
    }

    public /* synthetic */ v6(long j4, kotlin.jvm.internal.w wVar) {
        this(j4);
    }

    /* renamed from: b, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public boolean equals(@fg.m Object other) {
        v6 v6Var = other instanceof v6 ? (v6) other : null;
        if (v6Var == null) {
            return false;
        }
        return androidx.compose.ui.unit.l.l(this.size, v6Var.size);
    }

    @Override // androidx.compose.ui.layout.b0
    @fg.l
    public androidx.compose.ui.layout.n0 f(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l androidx.compose.ui.layout.l0 l0Var, long j4) {
        androidx.compose.ui.layout.i1 m02 = l0Var.m0(j4);
        int max = Math.max(m02.getWidth(), o0Var.q2(androidx.compose.ui.unit.l.p(this.size)));
        int max2 = Math.max(m02.getHeight(), o0Var.q2(androidx.compose.ui.unit.l.m(this.size)));
        return androidx.compose.ui.layout.o0.x2(o0Var, max, max2, null, new a(max, m02, max2), 4, null);
    }

    public int hashCode() {
        return androidx.compose.ui.unit.l.r(this.size);
    }

    private v6(long j4) {
        this.size = j4;
    }
}
