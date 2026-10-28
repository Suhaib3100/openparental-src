package androidx.compose.ui.node;

import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import kotlin.Metadata;

/* compiled from: IntrinsicsPolicy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR/\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001f\u0010\f¨\u0006!"}, d2 = {"Landroidx/compose/ui/node/z;", "", "Landroidx/compose/ui/node/h0;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/h0;)V", "Landroidx/compose/ui/layout/m0;", "g", "()Landroidx/compose/ui/layout/m0;", "measurePolicy", "Lkotlin/k2;", "m", "(Landroidx/compose/ui/layout/m0;)V", "", "height", "i", "(I)I", "width", "h", "d", "c", "k", "j", "f", "e", "a", "Landroidx/compose/ui/node/h0;", "()Landroidx/compose/ui/node/h0;", "<set-?>", "b", "Landroidx/compose/runtime/k2;", "l", "measurePolicyState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n81#2:90\n107#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"})
/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19532d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final h0 layoutNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 measurePolicyState;

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final String f19533e = "Intrinsic size is queried but there is no measure policy in place.";

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final a f19531c = new a();

    /* compiled from: IntrinsicsPolicy.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/z$a;", "", "<init>", "()V", "", "NoPolicyError", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public z(@fg.l h0 h0Var) {
        k2 g4;
        this.layoutNode = h0Var;
        g4 = t4.g(null, null, 2, null);
        this.measurePolicyState = g4;
    }

    private final androidx.compose.ui.layout.m0 b() {
        return (androidx.compose.ui.layout.m0) this.measurePolicyState.getValue();
    }

    private final androidx.compose.ui.layout.m0 g() {
        androidx.compose.ui.layout.m0 b5 = b();
        if (b5 != null) {
            return b5;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
    }

    private final void l(androidx.compose.ui.layout.m0 m0Var) {
        this.measurePolicyState.setValue(m0Var);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final h0 getLayoutNode() {
        return this.layoutNode;
    }

    public final int c(int width) {
        return g().e(this.layoutNode.z0(), this.layoutNode.X(), width);
    }

    public final int d(int height) {
        return g().b(this.layoutNode.z0(), this.layoutNode.X(), height);
    }

    public final int e(int width) {
        return g().e(this.layoutNode.z0(), this.layoutNode.W(), width);
    }

    public final int f(int height) {
        return g().b(this.layoutNode.z0(), this.layoutNode.W(), height);
    }

    public final int h(int width) {
        return g().c(this.layoutNode.z0(), this.layoutNode.X(), width);
    }

    public final int i(int height) {
        return g().d(this.layoutNode.z0(), this.layoutNode.X(), height);
    }

    public final int j(int width) {
        return g().c(this.layoutNode.z0(), this.layoutNode.W(), width);
    }

    public final int k(int height) {
        return g().d(this.layoutNode.z0(), this.layoutNode.W(), height);
    }

    public final void m(@fg.l androidx.compose.ui.layout.m0 measurePolicy) {
        l(measurePolicy);
    }
}
