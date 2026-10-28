package androidx.compose.ui.focus;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: OneDimensionalFocusSearch.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/r0;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "Landroidx/compose/ui/node/h0;", "layoutNode", "Landroidx/compose/runtime/collection/g;", "d", "(Landroidx/compose/ui/node/h0;)Landroidx/compose/runtime/collection/g;", "focusTarget1", "focusTarget2", "", "a", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,266:1\n1#2:267\n48#3:268\n523#3:269\n523#3:270\n1208#4:271\n1187#4,2:272\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n245#1:268\n249#1:269\n250#1:270\n257#1:271\n257#1:272,2\n*E\n"})
/* loaded from: classes.dex */
final class r0 implements Comparator<FocusTargetNode> {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final r0 f17570b = new r0();

    private r0() {
    }

    private final androidx.compose.runtime.collection.g<androidx.compose.ui.node.h0> d(androidx.compose.ui.node.h0 layoutNode) {
        androidx.compose.runtime.collection.g<androidx.compose.ui.node.h0> gVar = new androidx.compose.runtime.collection.g<>(new androidx.compose.ui.node.h0[16], 0);
        while (layoutNode != null) {
            gVar.a(0, layoutNode);
            layoutNode = layoutNode.B0();
        }
        return gVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(@fg.m FocusTargetNode focusTarget1, @fg.m FocusTargetNode focusTarget2) {
        if (focusTarget1 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        if (focusTarget2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        int i4 = 0;
        if (!q0.g(focusTarget1) || !q0.g(focusTarget2)) {
            if (q0.g(focusTarget1)) {
                return -1;
            }
            return q0.g(focusTarget2) ? 1 : 0;
        }
        androidx.compose.ui.node.h0 p4 = androidx.compose.ui.node.k.p(focusTarget1);
        androidx.compose.ui.node.h0 p5 = androidx.compose.ui.node.k.p(focusTarget2);
        if (kotlin.jvm.internal.l0.g(p4, p5)) {
            return 0;
        }
        androidx.compose.runtime.collection.g<androidx.compose.ui.node.h0> d5 = d(p4);
        androidx.compose.runtime.collection.g<androidx.compose.ui.node.h0> d6 = d(p5);
        int min = Math.min(d5.getSize() - 1, d6.getSize() - 1);
        if (min >= 0) {
            while (kotlin.jvm.internal.l0.g(d5.L()[i4], d6.L()[i4])) {
                if (i4 != min) {
                    i4++;
                }
            }
            return kotlin.jvm.internal.l0.t(d5.L()[i4].C0(), d6.L()[i4].C0());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
