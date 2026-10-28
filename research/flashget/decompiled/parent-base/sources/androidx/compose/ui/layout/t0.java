package androidx.compose.ui.layout;

import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiContentMeasurePolicy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/layout/s0;", "measurePolicy", "Landroidx/compose/ui/layout/m0;", "a", "(Landroidx/compose/ui/layout/s0;)Landroidx/compose/ui/layout/m0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 {

    /* compiled from: MultiContentMeasurePolicy.kt */
    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0013\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J)\u0010\u0014\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"androidx/compose/ui/layout/t0$a", "Landroidx/compose/ui/layout/m0;", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "Landroidx/compose/ui/layout/q;", "Landroidx/compose/ui/layout/p;", "", "height", "d", "(Landroidx/compose/ui/layout/q;Ljava/util/List;I)I", "width", "c", "b", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements m0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s0 f19107a;

        a(s0 s0Var) {
            this.f19107a = s0Var;
        }

        @Override // androidx.compose.ui.layout.m0
        @fg.l
        public n0 a(@fg.l o0 o0Var, @fg.l List<? extends l0> list, long j4) {
            return this.f19107a.a(o0Var, androidx.compose.ui.node.w0.a(o0Var), j4);
        }

        @Override // androidx.compose.ui.layout.m0
        public int b(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return this.f19107a.b(qVar, androidx.compose.ui.node.w0.a(qVar), i4);
        }

        @Override // androidx.compose.ui.layout.m0
        public int c(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return this.f19107a.c(qVar, androidx.compose.ui.node.w0.a(qVar), i4);
        }

        @Override // androidx.compose.ui.layout.m0
        public int d(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return this.f19107a.d(qVar, androidx.compose.ui.node.w0.a(qVar), i4);
        }

        @Override // androidx.compose.ui.layout.m0
        public int e(@fg.l q qVar, @fg.l List<? extends p> list, int i4) {
            return this.f19107a.e(qVar, androidx.compose.ui.node.w0.a(qVar), i4);
        }
    }

    @fg.l
    @kotlin.w0
    public static final m0 a(@fg.l s0 s0Var) {
        return new a(s0Var);
    }
}
