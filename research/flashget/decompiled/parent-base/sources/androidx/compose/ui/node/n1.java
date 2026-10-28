package androidx.compose.ui.node;

import kotlin.Metadata;

/* compiled from: OnPositionedDispatcher.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R \u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/n1;", "", "<init>", "()V", "Landroidx/compose/ui/node/h0;", "layoutNode", "Lkotlin/k2;", "b", "(Landroidx/compose/ui/node/h0;)V", "", "c", "()Z", "node", "d", "rootNode", "e", "a", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "layoutNodes", "", "[Landroidx/compose/ui/node/h0;", "cachedNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.jvm.internal.r1({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,94:1\n1208#2:95\n1187#2,2:96\n728#3,2:98\n728#3,2:100\n523#3:102\n460#3,11:104\n197#4:103\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:95\n26#1:96,2\n32#1:98,2\n38#1:100,2\n57#1:102\n75#1:104,11\n75#1:103\n*E\n"})
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19444d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f19445e = 16;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<h0> layoutNodes = new androidx.compose.runtime.collection.g<>(new h0[16], 0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private h0[] cachedNodes;

    private final void b(h0 layoutNode) {
        layoutNode.N();
        int i4 = 0;
        layoutNode.K1(false);
        androidx.compose.runtime.collection.g<h0> H0 = layoutNode.H0();
        int size = H0.getSize();
        if (size > 0) {
            h0[] L = H0.L();
            do {
                b(L[i4]);
                i4++;
            } while (i4 < size);
        }
    }

    public final void a() {
        this.layoutNodes.v0(Companion.C0354a.f19448b);
        int size = this.layoutNodes.getSize();
        h0[] h0VarArr = this.cachedNodes;
        if (h0VarArr == null || h0VarArr.length < size) {
            h0VarArr = new h0[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i4 = 0; i4 < size; i4++) {
            h0VarArr[i4] = this.layoutNodes.L()[i4];
        }
        this.layoutNodes.m();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = h0VarArr;
                return;
            }
            h0 h0Var = h0VarArr[size];
            kotlin.jvm.internal.l0.m(h0Var);
            if (h0Var.getNeedsOnPositionedDispatch()) {
                b(h0Var);
            }
        }
    }

    public final boolean c() {
        return this.layoutNodes.V();
    }

    public final void d(@fg.l h0 node) {
        this.layoutNodes.b(node);
        node.K1(true);
    }

    public final void e(@fg.l h0 rootNode) {
        this.layoutNodes.m();
        this.layoutNodes.b(rootNode);
        rootNode.K1(true);
    }
}
