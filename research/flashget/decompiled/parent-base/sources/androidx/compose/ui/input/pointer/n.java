package androidx.compose.ui.input.pointer;

import androidx.collection.e1;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: HitPathTracker.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/n;", "", "<init>", "()V", "Landroidx/collection/e1;", "Landroidx/compose/ui/input/pointer/b0;", "changes", "Landroidx/compose/ui/layout/u;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "", "isInBounds", "a", "(Landroidx/collection/e1;Landroidx/compose/ui/layout/u;Landroidx/compose/ui/input/pointer/h;Z)Z", "f", "e", "(Landroidx/compose/ui/input/pointer/h;)Z", "Lkotlin/k2;", "d", "c", "h", "b", "(Landroidx/compose/ui/input/pointer/h;)V", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/ui/input/pointer/m;", "Landroidx/compose/runtime/collection/g;", "g", "()Landroidx/compose/runtime/collection/g;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,554:1\n1208#2:555\n1187#2,2:556\n460#3,11:558\n460#3,11:569\n460#3,11:580\n460#3,11:591\n523#3:602\n48#3:603\n523#3:604\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n145#1:555\n145#1:556,2\n154#1:558,11\n184#1:569,11\n203#1:580,11\n214#1:591,11\n230#1:602\n242#1:603\n243#1:604\n*E\n"})
/* loaded from: classes.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public static final int f18794b = androidx.compose.runtime.collection.g.f16132e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<m> children = new androidx.compose.runtime.collection.g<>(new m[16], 0);

    public boolean a(@fg.l e1<b0> changes, @fg.l androidx.compose.ui.layout.u parentCoordinates, @fg.l h internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.g<m> gVar = this.children;
        int size = gVar.getSize();
        if (size <= 0) {
            return false;
        }
        m[] L = gVar.L();
        int i4 = 0;
        boolean z4 = false;
        do {
            z4 = L[i4].a(changes, parentCoordinates, internalPointerEvent, isInBounds) || z4;
            i4++;
        } while (i4 < size);
        return z4;
    }

    public void b(@fg.l h internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.L()[size].getPointerIds().i()) {
                this.children.n0(size);
            }
        }
    }

    public final void c() {
        this.children.m();
    }

    public void d() {
        androidx.compose.runtime.collection.g<m> gVar = this.children;
        int size = gVar.getSize();
        if (size > 0) {
            m[] L = gVar.L();
            int i4 = 0;
            do {
                L[i4].d();
                i4++;
            } while (i4 < size);
        }
    }

    public boolean e(@fg.l h internalPointerEvent) {
        androidx.compose.runtime.collection.g<m> gVar = this.children;
        int size = gVar.getSize();
        boolean z4 = false;
        if (size > 0) {
            m[] L = gVar.L();
            int i4 = 0;
            boolean z5 = false;
            do {
                z5 = L[i4].e(internalPointerEvent) || z5;
                i4++;
            } while (i4 < size);
            z4 = z5;
        }
        b(internalPointerEvent);
        return z4;
    }

    public boolean f(@fg.l e1<b0> changes, @fg.l androidx.compose.ui.layout.u parentCoordinates, @fg.l h internalPointerEvent, boolean isInBounds) {
        androidx.compose.runtime.collection.g<m> gVar = this.children;
        int size = gVar.getSize();
        if (size <= 0) {
            return false;
        }
        m[] L = gVar.L();
        int i4 = 0;
        boolean z4 = false;
        do {
            z4 = L[i4].f(changes, parentCoordinates, internalPointerEvent, isInBounds) || z4;
            i4++;
        } while (i4 < size);
        return z4;
    }

    @fg.l
    public final androidx.compose.runtime.collection.g<m> g() {
        return this.children;
    }

    public final void h() {
        int i4 = 0;
        while (i4 < this.children.getSize()) {
            m mVar = this.children.L()[i4];
            if (mVar.getModifierNode().getIsAttached()) {
                i4++;
                mVar.h();
            } else {
                this.children.n0(i4);
                mVar.d();
            }
        }
    }
}
