package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.i1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Spacer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Landroidx/compose/ui/layout/m0;", "<init>", "()V", "Landroidx/compose/ui/layout/o0;", "", "Landroidx/compose/ui/layout/l0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/n0;", "a", "(Landroidx/compose/ui/layout/o0;Ljava/util/List;J)Landroidx/compose/ui/layout/n0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g2 implements androidx.compose.ui.layout.m0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g2 f5038a = new g2();

    /* compiled from: Spacer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/i1$a;", "Lkotlin/k2;", "a", "(Landroidx/compose/ui/layout/i1$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<i1.a, kotlin.k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f5039b = new a(1);

        a() {
            super(1);
        }

        public final void a(@fg.l i1.a aVar) {
        }

        @Override // ld.l
        public kotlin.k2 invoke(i1.a aVar) {
            return kotlin.k2.f75408a;
        }
    }

    private g2() {
    }

    @Override // androidx.compose.ui.layout.m0
    @fg.l
    public androidx.compose.ui.layout.n0 a(@fg.l androidx.compose.ui.layout.o0 o0Var, @fg.l List<? extends androidx.compose.ui.layout.l0> list, long j4) {
        return androidx.compose.ui.layout.o0.x2(o0Var, androidx.compose.ui.unit.b.n(j4) ? androidx.compose.ui.unit.b.p(j4) : 0, androidx.compose.ui.unit.b.l(j4) ? androidx.compose.ui.unit.b.o(j4) : 0, null, a.f5039b, 4, null);
    }
}
