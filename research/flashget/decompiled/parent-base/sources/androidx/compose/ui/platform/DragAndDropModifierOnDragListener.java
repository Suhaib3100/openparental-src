package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002Be\u0012\\\u0010\u0010\u001aX\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 Rj\u0010\u0010\u001aX\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/platform/DragAndDropModifierOnDragListener;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/c;", "Lkotlin/Function3;", "Landroidx/compose/ui/draganddrop/h;", "Lkotlin/r0;", "name", "transferData", "Li0/n;", "decorationSize", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/k2;", "Lkotlin/u;", "drawDragDecoration", "", "startDrag", "<init>", "(Lld/q;)V", "Landroid/view/View;", "view", "Landroid/view/DragEvent;", "event", "onDrag", "(Landroid/view/View;Landroid/view/DragEvent;)Z", "L", "(Landroidx/compose/ui/draganddrop/h;JLld/l;)Z", "Landroidx/compose/ui/draganddrop/d;", "node", "N", "(Landroidx/compose/ui/draganddrop/d;)V", "M", "(Landroidx/compose/ui/draganddrop/d;)Z", "a", "Lld/q;", "Landroidx/compose/ui/draganddrop/e;", "b", "Landroidx/compose/ui/draganddrop/e;", "rootDragAndDropNode", "Landroidx/collection/d;", "c", "Landroidx/collection/d;", "interestedNodes", "Landroidx/compose/ui/q;", "d", "Landroidx/compose/ui/q;", "()Landroidx/compose/ui/q;", "modifier", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/DragAndDropModifierOnDragListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2348:1\n1855#2,2:2349\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/DragAndDropModifierOnDragListener\n*L\n2300#1:2349,2\n*E\n"})
/* loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, androidx.compose.ui.draganddrop.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.q<androidx.compose.ui.draganddrop.h, i0.n, ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2>, Boolean> startDrag;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.draganddrop.e rootDragAndDropNode = new androidx.compose.ui.draganddrop.e(a.f19691b);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.collection.d<androidx.compose.ui.draganddrop.d> interestedNodes = new androidx.collection.d<>(0, 1, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.q modifier = new androidx.compose.ui.node.y0<androidx.compose.ui.draganddrop.e>() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // androidx.compose.ui.node.y0
        public boolean equals(@fg.m Object other) {
            return other == this;
        }

        @Override // androidx.compose.ui.node.y0
        public int hashCode() {
            androidx.compose.ui.draganddrop.e eVar;
            eVar = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return eVar.hashCode();
        }

        @Override // androidx.compose.ui.node.y0
        public androidx.compose.ui.draganddrop.e i() {
            androidx.compose.ui.draganddrop.e eVar;
            eVar = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return eVar;
        }

        @Override // androidx.compose.ui.node.y0
        public void k(@fg.l a2 a2Var) {
            a2Var.d("RootDragAndDropNode");
        }

        @Override // androidx.compose.ui.node.y0
        public void m(androidx.compose.ui.draganddrop.e eVar) {
        }

        @fg.l
        public androidx.compose.ui.draganddrop.e n() {
            androidx.compose.ui.draganddrop.e eVar;
            eVar = DragAndDropModifierOnDragListener.this.rootDragAndDropNode;
            return eVar;
        }

        public void o(@fg.l androidx.compose.ui.draganddrop.e node) {
        }
    };

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "it", "Landroidx/compose/ui/draganddrop/g;", "a", "(Landroidx/compose/ui/draganddrop/b;)Landroidx/compose/ui/draganddrop/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<androidx.compose.ui.draganddrop.b, androidx.compose.ui.draganddrop.g> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f19691b = new a(1);

        a() {
            super(1);
        }

        @fg.m
        public final androidx.compose.ui.draganddrop.g a(@fg.l androidx.compose.ui.draganddrop.b bVar) {
            return null;
        }

        @Override // ld.l
        public androidx.compose.ui.draganddrop.g invoke(androidx.compose.ui.draganddrop.b bVar) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropModifierOnDragListener(@fg.l ld.q<? super androidx.compose.ui.draganddrop.h, ? super i0.n, ? super ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2>, Boolean> qVar) {
        this.startDrag = qVar;
    }

    @Override // androidx.compose.ui.draganddrop.c
    public boolean L(@fg.l androidx.compose.ui.draganddrop.h transferData, long decorationSize, @fg.l ld.l<? super androidx.compose.ui.graphics.drawscope.f, kotlin.k2> drawDragDecoration) {
        return this.startDrag.R(transferData, i0.n.c(decorationSize), drawDragDecoration).booleanValue();
    }

    @Override // androidx.compose.ui.draganddrop.c
    public boolean M(@fg.l androidx.compose.ui.draganddrop.d node) {
        return this.interestedNodes.contains(node);
    }

    @Override // androidx.compose.ui.draganddrop.c
    public void N(@fg.l androidx.compose.ui.draganddrop.d node) {
        this.interestedNodes.add(node);
    }

    @Override // androidx.compose.ui.draganddrop.c
    @fg.l
    /* renamed from: c, reason: from getter */
    public androidx.compose.ui.q getModifier() {
        return this.modifier;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(@fg.l View view, @fg.l DragEvent event) {
        androidx.compose.ui.draganddrop.b bVar = new androidx.compose.ui.draganddrop.b(event);
        switch (event.getAction()) {
            case 1:
                boolean W2 = this.rootDragAndDropNode.W2(bVar);
                Iterator<androidx.compose.ui.draganddrop.d> it = this.interestedNodes.iterator();
                while (it.hasNext()) {
                    it.next().k0(bVar);
                }
                break;
            case 2:
                this.rootDragAndDropNode.r0(bVar);
                break;
            case 4:
                this.rootDragAndDropNode.N6(bVar);
                break;
            case 5:
                this.rootDragAndDropNode.e2(bVar);
                break;
            case 6:
                this.rootDragAndDropNode.Y0(bVar);
                break;
        }
        return false;
    }
}
