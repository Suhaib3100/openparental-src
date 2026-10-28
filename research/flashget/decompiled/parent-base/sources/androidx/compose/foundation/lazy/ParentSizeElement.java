package androidx.compose.foundation.lazy;

import androidx.compose.runtime.b5;
import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LazyItemScopeImpl.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/lazy/f0;", "", "fraction", "Landroidx/compose/runtime/b5;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLandroidx/compose/runtime/b5;Landroidx/compose/runtime/b5;Ljava/lang/String;)V", "n", "()Landroidx/compose/foundation/lazy/f0;", "node", "Lkotlin/k2;", "v", "(Landroidx/compose/foundation/lazy/f0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "F", "o", "()F", "e", "Landroidx/compose/runtime/b5;", "u", "()Landroidx/compose/runtime/b5;", "f", "r", "g", "Ljava/lang/String;", "s", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ParentSizeElement extends y0<f0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final b5<Integer> widthState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final b5<Integer> heightState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String inspectorName;

    public /* synthetic */ ParentSizeElement(float f4, b5 b5Var, b5 b5Var2, String str, int i4, kotlin.jvm.internal.w wVar) {
        this(f4, (i4 & 2) != 0 ? null : b5Var, (i4 & 4) != 0 ? null : b5Var2, str);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) other;
        return this.fraction == parentSizeElement.fraction && l0.g(this.widthState, parentSizeElement.widthState) && l0.g(this.heightState, parentSizeElement.heightState);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        b5<Integer> b5Var = this.widthState;
        int hashCode = (b5Var != null ? b5Var.hashCode() : 0) * 31;
        b5<Integer> b5Var2 = this.heightState;
        return Float.hashCode(this.fraction) + ((hashCode + (b5Var2 != null ? b5Var2.hashCode() : 0)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d(this.inspectorName);
        a2Var.e(Float.valueOf(this.fraction));
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public f0 i() {
        return new f0(this.fraction, this.widthState, this.heightState);
    }

    /* renamed from: o, reason: from getter */
    public final float getFraction() {
        return this.fraction;
    }

    @fg.m
    public final b5<Integer> r() {
        return this.heightState;
    }

    @fg.l
    /* renamed from: s, reason: from getter */
    public final String getInspectorName() {
        return this.inspectorName;
    }

    @fg.m
    public final b5<Integer> u() {
        return this.widthState;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l f0 node) {
        node.B7(this.fraction);
        node.D7(this.widthState);
        node.C7(this.heightState);
    }

    public ParentSizeElement(float f4, @fg.m b5<Integer> b5Var, @fg.m b5<Integer> b5Var2, @fg.l String str) {
        this.fraction = f4;
        this.widthState = b5Var;
        this.heightState = b5Var2;
        this.inspectorName = str;
    }
}
