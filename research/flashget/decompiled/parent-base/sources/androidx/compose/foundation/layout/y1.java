package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Row.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/layout/y1;", "Landroidx/compose/foundation/layout/x1;", "<init>", "()V", "Landroidx/compose/ui/q;", "", "weight", "", "fill", "b", "(Landroidx/compose/ui/q;FZ)Landroidx/compose/ui/q;", "Landroidx/compose/ui/c$c;", "alignment", "f", "(Landroidx/compose/ui/q;Landroidx/compose/ui/c$c;)Landroidx/compose/ui/q;", "Landroidx/compose/ui/layout/m;", "alignmentLine", "d", "(Landroidx/compose/ui/q;Landroidx/compose/ui/layout/m;)Landroidx/compose/ui/q;", "c", "(Landroidx/compose/ui/q;)Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/p0;", "", "alignmentLineBlock", "a", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1#2:265\n*E\n"})
/* loaded from: classes.dex */
public final class y1 implements x1 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final y1 f5410a = new y1();

    /* renamed from: b, reason: collision with root package name */
    public static final int f5411b = 0;

    private y1() {
    }

    @Override // androidx.compose.foundation.layout.x1
    @fg.l
    public androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super androidx.compose.ui.layout.p0, Integer> lVar) {
        return qVar.w3(new WithAlignmentLineBlockElement(lVar));
    }

    @Override // androidx.compose.foundation.layout.x1
    @x4
    @fg.l
    public androidx.compose.ui.q b(@fg.l androidx.compose.ui.q qVar, float f4, boolean z4) {
        if (f4 > com.google.firebase.remoteconfig.p.f60679p) {
            return qVar.w3(new LayoutWeightElement(kotlin.ranges.s.A(f4, Float.MAX_VALUE), z4));
        }
        throw new IllegalArgumentException(("invalid weight " + f4 + "; must be greater than zero").toString());
    }

    @Override // androidx.compose.foundation.layout.x1
    @x4
    @fg.l
    public androidx.compose.ui.q c(@fg.l androidx.compose.ui.q qVar) {
        return d(qVar, androidx.compose.ui.layout.b.a());
    }

    @Override // androidx.compose.foundation.layout.x1
    @x4
    @fg.l
    public androidx.compose.ui.q d(@fg.l androidx.compose.ui.q qVar, @fg.l androidx.compose.ui.layout.m mVar) {
        return qVar.w3(new WithAlignmentLineElement(mVar));
    }

    @Override // androidx.compose.foundation.layout.x1
    @x4
    @fg.l
    public androidx.compose.ui.q f(@fg.l androidx.compose.ui.q qVar, @fg.l c.InterfaceC0326c interfaceC0326c) {
        return qVar.w3(new VerticalAlignElement(interfaceC0326c));
    }
}
