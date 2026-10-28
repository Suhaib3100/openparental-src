package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.u;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.node.k;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import ld.l;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a8\u0010\f\u001a\u00020\u00002!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001e\u0010\u0013\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/draganddrop/d;", "a", "()Landroidx/compose/ui/draganddrop/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/b;", "Lkotlin/r0;", "name", "event", "", "shouldStartDragAndDrop", "Landroidx/compose/ui/draganddrop/g;", "target", "b", "(Lld/l;Landroidx/compose/ui/draganddrop/g;)Landroidx/compose/ui/draganddrop/d;", "Lkotlin/k2;", "f", "(Landroidx/compose/ui/draganddrop/g;Landroidx/compose/ui/draganddrop/b;)V", "Li0/f;", "position", "e", "(Landroidx/compose/ui/draganddrop/d;J)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,307:1\n56#2,4:308\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n300#1:308,4\n*E\n"})
/* loaded from: classes.dex */
public final class f {

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "it", "Landroidx/compose/ui/draganddrop/g;", "a", "(Landroidx/compose/ui/draganddrop/b;)Landroidx/compose/ui/draganddrop/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements l<androidx.compose.ui.draganddrop.b, g> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17411b = new a(1);

        a() {
            super(1);
        }

        @m
        public final g a(@fg.l androidx.compose.ui.draganddrop.b bVar) {
            return null;
        }

        @Override // ld.l
        public g invoke(androidx.compose.ui.draganddrop.b bVar) {
            return null;
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "startEvent", "Landroidx/compose/ui/draganddrop/g;", "a", "(Landroidx/compose/ui/draganddrop/b;)Landroidx/compose/ui/draganddrop/g;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements l<androidx.compose.ui.draganddrop.b, g> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<androidx.compose.ui.draganddrop.b, Boolean> f17412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f17413c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, g gVar) {
            super(1);
            this.f17412b = lVar;
            this.f17413c = gVar;
        }

        @Override // ld.l
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(@fg.l androidx.compose.ui.draganddrop.b bVar) {
            if (this.f17412b.invoke(bVar).booleanValue()) {
                return this.f17413c;
            }
            return null;
        }
    }

    @fg.l
    public static final d a() {
        return new e(a.f17411b);
    }

    @fg.l
    public static final d b(@fg.l l<? super androidx.compose.ui.draganddrop.b, Boolean> lVar, @fg.l g gVar) {
        return new e(new b(lVar, gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(d dVar, long j4) {
        if (!dVar.getNode().getIsAttached()) {
            return false;
        }
        u v4 = k.p(dVar).v();
        if (!v4.f()) {
            return false;
        }
        int m4 = androidx.compose.ui.unit.u.m(v4.c());
        long f4 = v.f(v4);
        float e4 = i0.f.e(f4);
        float r4 = i0.f.r(f4);
        float f5 = m4 + e4;
        float f6 = ((int) (r2 & 4294967295L)) + r4;
        float p4 = i0.f.p(j4);
        if (e4 > p4 || p4 > f5) {
            return false;
        }
        float r5 = i0.f.r(j4);
        return r4 <= r5 && r5 <= f6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g gVar, androidx.compose.ui.draganddrop.b bVar) {
        gVar.e2(bVar);
        gVar.r0(bVar);
    }
}
