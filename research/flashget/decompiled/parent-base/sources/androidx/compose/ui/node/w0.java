package androidx.compose.ui.node;

import androidx.compose.ui.node.h0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MeasureScopeWithLayoutNode.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/q;", "scope", "", "Landroidx/compose/ui/layout/l0;", "a", "(Landroidx/compose/ui/layout/q;)Ljava/util/List;", "Landroidx/compose/ui/node/h0;", "", "b", "(Landroidx/compose/ui/node/h0;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n151#2,3:48\n33#2,4:51\n154#2,2:55\n38#2:57\n156#2:58\n1#3:59\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:48,3\n32#1:51,4\n32#1:55,2\n32#1:57\n32#1:58\n*E\n"})
/* loaded from: classes.dex */
public final class w0 {

    /* compiled from: MeasureScopeWithLayoutNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19523a;

        static {
            int[] iArr = new int[h0.e.values().length];
            try {
                iArr[h0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h0.e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h0.e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19523a = iArr;
        }
    }

    @fg.l
    public static final List<List<androidx.compose.ui.layout.l0>> a(@fg.l androidx.compose.ui.layout.q qVar) {
        kotlin.jvm.internal.l0.n(qVar, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        h0 layoutNode = ((v0) qVar).getLayoutNode();
        boolean b5 = b(layoutNode);
        List<h0> b02 = layoutNode.b0();
        ArrayList arrayList = new ArrayList(b02.size());
        int size = b02.size();
        for (int i4 = 0; i4 < size; i4++) {
            h0 h0Var = b02.get(i4);
            arrayList.add(b5 ? h0Var.W() : h0Var.X());
        }
        return arrayList;
    }

    private static final boolean b(h0 h0Var) {
        int i4 = a.f19523a[h0Var.l0().ordinal()];
        if (i4 == 1 || i4 == 2) {
            return true;
        }
        if (i4 == 3 || i4 == 4) {
            return false;
        }
        if (i4 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        h0 B0 = h0Var.B0();
        if (B0 != null) {
            return b(B0);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
