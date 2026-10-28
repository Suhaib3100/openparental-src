package androidx.compose.ui.input.pointer;

import androidx.compose.ui.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: HitPathTracker.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/g;", "", "Landroidx/compose/ui/layout/u;", "rootCoordinates", "<init>", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/input/pointer/a0;", "pointerId", "", "Landroidx/compose/ui/q$d;", "pointerInputNodes", "Lkotlin/k2;", "a", "(JLjava/util/List;)V", "Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "", "isInBounds", "b", "(Landroidx/compose/ui/input/pointer/h;Z)Z", "e", "()V", "f", "Landroidx/compose/ui/layout/u;", "Landroidx/compose/ui/input/pointer/n;", "Landroidx/compose/ui/input/pointer/n;", "d", "()Landroidx/compose/ui/input/pointer/n;", "root", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,554:1\n366#2,12:555\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n63#1:555,12\n*E\n"})
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18755c = androidx.compose.runtime.collection.g.f16132e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.layout.u rootCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final n root = new n();

    public g(@fg.l androidx.compose.ui.layout.u uVar) {
        this.rootCoordinates = uVar;
    }

    public static /* synthetic */ boolean c(g gVar, h hVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return gVar.b(hVar, z4);
    }

    public final void a(long pointerId, @fg.l List<? extends q.d> pointerInputNodes) {
        m mVar;
        n nVar = this.root;
        int size = pointerInputNodes.size();
        boolean z4 = true;
        for (int i4 = 0; i4 < size; i4++) {
            q.d dVar = pointerInputNodes.get(i4);
            if (z4) {
                androidx.compose.runtime.collection.g<m> g4 = nVar.g();
                int size2 = g4.getSize();
                if (size2 > 0) {
                    m[] L = g4.L();
                    int i5 = 0;
                    do {
                        mVar = L[i5];
                        if (kotlin.jvm.internal.l0.g(mVar.getModifierNode(), dVar)) {
                            break;
                        } else {
                            i5++;
                        }
                    } while (i5 < size2);
                }
                mVar = null;
                m mVar2 = mVar;
                if (mVar2 != null) {
                    mVar2.o();
                    mVar2.getPointerIds().a(pointerId);
                    nVar = mVar2;
                } else {
                    z4 = false;
                }
            }
            m mVar3 = new m(dVar);
            mVar3.getPointerIds().a(pointerId);
            nVar.g().b(mVar3);
            nVar = mVar3;
        }
    }

    public final boolean b(@fg.l h internalPointerEvent, boolean isInBounds) {
        if (this.root.a(internalPointerEvent.a(), this.rootCoordinates, internalPointerEvent, isInBounds)) {
            return this.root.e(internalPointerEvent) || this.root.f(internalPointerEvent.a(), this.rootCoordinates, internalPointerEvent, isInBounds);
        }
        return false;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final n getRoot() {
        return this.root;
    }

    public final void e() {
        this.root.d();
        this.root.c();
    }

    public final void f() {
        this.root.h();
    }
}
