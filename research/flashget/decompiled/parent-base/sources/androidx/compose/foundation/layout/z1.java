package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.q;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/layout/z1;", "Landroidx/compose/ui/node/s1;", "Landroidx/compose/ui/q$d;", "<init>", "()V", "Landroidx/compose/ui/unit/d;", "", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "a", "b", "Landroidx/compose/foundation/layout/z1$a;", "Landroidx/compose/foundation/layout/z1$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class z1 extends q.d implements androidx.compose.ui.node.s1 {

    /* renamed from: p, reason: collision with root package name */
    public static final int f5419p = 0;

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\t*\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/layout/z1$a;", "Landroidx/compose/foundation/layout/z1;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/p0;", "", "block", "<init>", "(Lld/l;)V", "Landroidx/compose/ui/unit/d;", "", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "q", "Lld/l;", "y7", "()Lld/l;", "z7", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends z1 {

        /* renamed from: r, reason: collision with root package name */
        public static final int f5420r = 8;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private ld.l<? super androidx.compose.ui.layout.p0, Integer> block;

        public a(@fg.l ld.l<? super androidx.compose.ui.layout.p0, Integer> lVar) {
            this.block = lVar;
        }

        @Override // androidx.compose.foundation.layout.z1, androidx.compose.ui.node.s1
        @fg.l
        public Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
            v1 v1Var = obj instanceof v1 ? (v1) obj : null;
            if (v1Var == null) {
                v1Var = new v1(0.0f, false, null, 7, null);
            }
            x.Companion companion = x.INSTANCE;
            f.a aVar = new f.a(this.block);
            companion.getClass();
            v1Var.i(new x.a(aVar));
            return v1Var;
        }

        @fg.l
        public final ld.l<androidx.compose.ui.layout.p0, Integer> y7() {
            return this.block;
        }

        public final void z7(@fg.l ld.l<? super androidx.compose.ui.layout.p0, Integer> lVar) {
            this.block = lVar;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u0007*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/z1$b;", "Landroidx/compose/foundation/layout/z1;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "<init>", "(Landroidx/compose/ui/layout/a;)V", "Landroidx/compose/ui/unit/d;", "", "parentData", "T", "(Landroidx/compose/ui/unit/d;Ljava/lang/Object;)Ljava/lang/Object;", "q", "Landroidx/compose/ui/layout/a;", "y7", "()Landroidx/compose/ui/layout/a;", "z7", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends z1 {

        /* renamed from: r, reason: collision with root package name */
        public static final int f5422r = 8;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.ui.layout.a alignmentLine;

        public b(@fg.l androidx.compose.ui.layout.a aVar) {
            this.alignmentLine = aVar;
        }

        @Override // androidx.compose.foundation.layout.z1, androidx.compose.ui.node.s1
        @fg.l
        public Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj) {
            v1 v1Var = obj instanceof v1 ? (v1) obj : null;
            if (v1Var == null) {
                v1Var = new v1(0.0f, false, null, 7, null);
            }
            x.Companion companion = x.INSTANCE;
            f.b bVar = new f.b(this.alignmentLine);
            companion.getClass();
            v1Var.i(new x.a(bVar));
            return v1Var;
        }

        @fg.l
        /* renamed from: y7, reason: from getter */
        public final androidx.compose.ui.layout.a getAlignmentLine() {
            return this.alignmentLine;
        }

        public final void z7(@fg.l androidx.compose.ui.layout.a aVar) {
            this.alignmentLine = aVar;
        }
    }

    private z1() {
    }

    @Override // androidx.compose.ui.node.s1
    @fg.m
    public abstract Object T(@fg.l androidx.compose.ui.unit.d dVar, @fg.m Object obj);

    public z1(kotlin.jvm.internal.w wVar) {
    }
}
