package androidx.compose.ui.draganddrop;

import androidx.compose.runtime.internal.u;
import androidx.compose.ui.node.c2;
import androidx.compose.ui.node.d2;
import androidx.compose.ui.node.k;
import androidx.compose.ui.q;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;

/* compiled from: DragAndDropNode.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B,\u0012#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0002\b\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u001eJ\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010$\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u001eR1\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/draganddrop/e;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c2;", "Landroidx/compose/ui/draganddrop/d;", "Lkotlin/Function1;", "Landroidx/compose/ui/draganddrop/b;", "Lkotlin/r0;", "name", "event", "Landroidx/compose/ui/draganddrop/g;", "onDragAndDropStart", "<init>", "(Lld/l;)V", "Lkotlin/k2;", "j7", "()V", "Landroidx/compose/ui/draganddrop/h;", "transferData", "Li0/n;", "decorationSize", "Landroidx/compose/ui/graphics/drawscope/f;", "Lkotlin/u;", "drawDragDecoration", "L", "(Landroidx/compose/ui/draganddrop/h;JLld/l;)V", "startEvent", "", "W2", "(Landroidx/compose/ui/draganddrop/b;)Z", "k0", "(Landroidx/compose/ui/draganddrop/b;)V", "e2", "r0", "K1", "Y0", "m3", "N6", "p", "Lld/l;", "", "q", "Ljava/lang/Object;", "s0", "()Ljava/lang/Object;", "traverseKey", "r", "Landroidx/compose/ui/draganddrop/d;", "lastChildDragAndDropModifierNode", "s", "Landroidx/compose/ui/draganddrop/g;", "thisDragAndDropTarget", "t", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@u(parameters = 0)
@r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion\n*L\n1#1,307:1\n122#2,10:308\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n216#1:308,10\n*E\n"})
/* loaded from: classes.dex */
public final class e extends q.d implements c2, androidx.compose.ui.draganddrop.d {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: u, reason: collision with root package name */
    public static final int f17396u = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<androidx.compose.ui.draganddrop.b, g> onDragAndDropStart;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @l
    private final Object traverseKey = Companion.C0327a.f17401a;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @m
    private androidx.compose.ui.draganddrop.d lastChildDragAndDropModifierNode;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @m
    private g thisDragAndDropTarget;

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00042\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/draganddrop/e$a;", "", "<init>", "()V", "Landroidx/compose/ui/draganddrop/d;", "Lkotlin/Function1;", "", "predicate", "a", "(Landroidx/compose/ui/draganddrop/d;Lld/l;)Landroidx/compose/ui/draganddrop/d;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.draganddrop.e$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DragAndDropNode.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/e$a$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.draganddrop.e$a$a, reason: collision with other inner class name */
        private static final class C0327a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public static final C0327a f17401a = new C0327a();

            private C0327a() {
            }
        }

        /* compiled from: DragAndDropNode.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/c2;", "child", "Landroidx/compose/ui/node/c2$a$a;", "a", "(Landroidx/compose/ui/node/c2;)Landroidx/compose/ui/node/c2$a$a;"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1\n*L\n1#1,307:1\n*E\n"})
        /* renamed from: androidx.compose.ui.draganddrop.e$a$b */
        public static final class b extends n0 implements ld.l<c2, c2.Companion.EnumC0346a> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ld.l<androidx.compose.ui.draganddrop.d, Boolean> f17402b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ k1.h<androidx.compose.ui.draganddrop.d> f17403c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(ld.l<? super androidx.compose.ui.draganddrop.d, Boolean> lVar, k1.h<androidx.compose.ui.draganddrop.d> hVar) {
                super(1);
                this.f17402b = lVar;
                this.f17403c = hVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // ld.l
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c2.Companion.EnumC0346a invoke(@l c2 c2Var) {
                if (!(c2Var instanceof androidx.compose.ui.draganddrop.d) || !this.f17402b.invoke(c2Var).booleanValue()) {
                    return c2.Companion.EnumC0346a.ContinueTraversal;
                }
                this.f17403c.f75329b = c2Var;
                return c2.Companion.EnumC0346a.CancelTraversal;
            }
        }

        private Companion() {
        }

        private final androidx.compose.ui.draganddrop.d a(androidx.compose.ui.draganddrop.d dVar, ld.l<? super androidx.compose.ui.draganddrop.d, Boolean> lVar) {
            if (!dVar.getNode().getIsAttached()) {
                return null;
            }
            k1.h hVar = new k1.h();
            d2.g(dVar, C0327a.f17401a, new b(lVar, hVar));
            return (androidx.compose.ui.draganddrop.d) hVar.f75329b;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/e;", "child", "", "a", "(Landroidx/compose/ui/draganddrop/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.l<e, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f17404b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.b f17405c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f17406d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.a aVar, androidx.compose.ui.draganddrop.b bVar, e eVar) {
            super(1);
            this.f17404b = aVar;
            this.f17405c = bVar;
            this.f17406d = eVar;
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l e eVar) {
            k1.a aVar = this.f17404b;
            boolean z4 = aVar.f75322b;
            boolean W2 = eVar.W2(this.f17405c);
            e eVar2 = this.f17406d;
            if (W2) {
                k.q(eVar2).getDragAndDropManager().N(eVar);
            }
            k2 k2Var = k2.f75408a;
            aVar.f75322b = z4 | W2;
            return Boolean.TRUE;
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/e;", "child", "", "a", "(Landroidx/compose/ui/draganddrop/e;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.l<e, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.b f17407b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.draganddrop.b bVar) {
            super(1);
            this.f17407b = bVar;
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@l e eVar) {
            eVar.N6(this.f17407b);
            return Boolean.TRUE;
        }
    }

    /* compiled from: DragAndDropNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/c2;", "child", "Landroidx/compose/ui/node/c2$a$a;", "a", "(Landroidx/compose/ui/node/c2;)Landroidx/compose/ui/node/c2$a$a;", "androidx/compose/ui/draganddrop/e$a$b"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode$Companion$firstChildOrNull$1\n+ 2 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNode\n*L\n1#1,307:1\n218#2,2:308\n*E\n"})
    public static final class d extends n0 implements ld.l<c2, c2.Companion.EnumC0346a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h f17408b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f17409c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.draganddrop.b f17410d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k1.h hVar, e eVar, androidx.compose.ui.draganddrop.b bVar) {
            super(1);
            this.f17408b = hVar;
            this.f17409c = eVar;
            this.f17410d = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c2.Companion.EnumC0346a invoke(@l c2 c2Var) {
            boolean e4;
            if (c2Var instanceof androidx.compose.ui.draganddrop.d) {
                androidx.compose.ui.draganddrop.d dVar = (androidx.compose.ui.draganddrop.d) c2Var;
                if (k.q(this.f17409c).getDragAndDropManager().M(dVar)) {
                    e4 = f.e(dVar, i.a(this.f17410d));
                    if (e4) {
                        this.f17408b.f75329b = c2Var;
                        return c2.Companion.EnumC0346a.CancelTraversal;
                    }
                }
            }
            return c2.Companion.EnumC0346a.ContinueTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@l ld.l<? super androidx.compose.ui.draganddrop.b, ? extends g> lVar) {
        this.onDragAndDropStart = lVar;
    }

    @Override // androidx.compose.ui.draganddrop.g
    public void K1(@l androidx.compose.ui.draganddrop.b event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.K1(event);
            return;
        }
        androidx.compose.ui.draganddrop.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.K1(event);
        }
    }

    @Override // androidx.compose.ui.draganddrop.d
    public void L(@l h transferData, long decorationSize, @l ld.l<? super androidx.compose.ui.graphics.drawscope.f, k2> drawDragDecoration) {
        k.q(this).getDragAndDropManager().L(transferData, decorationSize, drawDragDecoration);
    }

    @Override // androidx.compose.ui.draganddrop.g
    public void N6(@l androidx.compose.ui.draganddrop.b event) {
        if (getNode().getIsAttached()) {
            d2.f(this, new c(event));
            g gVar = this.thisDragAndDropTarget;
            if (gVar != null) {
                gVar.N6(event);
            }
            this.thisDragAndDropTarget = null;
            this.lastChildDragAndDropModifierNode = null;
        }
    }

    @Override // androidx.compose.ui.draganddrop.d
    public boolean W2(@l androidx.compose.ui.draganddrop.b startEvent) {
        if (!getIsAttached()) {
            return false;
        }
        if (this.thisDragAndDropTarget != null) {
            throw new IllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        this.thisDragAndDropTarget = this.onDragAndDropStart.invoke(startEvent);
        k1.a aVar = new k1.a();
        d2.f(this, new b(aVar, startEvent, this));
        return aVar.f75322b || this.thisDragAndDropTarget != null;
    }

    @Override // androidx.compose.ui.draganddrop.g
    public void Y0(@l androidx.compose.ui.draganddrop.b event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.Y0(event);
        }
        androidx.compose.ui.draganddrop.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.Y0(event);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.g
    public void e2(@l androidx.compose.ui.draganddrop.b event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.e2(event);
            return;
        }
        androidx.compose.ui.draganddrop.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.e2(event);
        }
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.g
    public void k0(@l androidx.compose.ui.draganddrop.b event) {
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            gVar.k0(event);
            return;
        }
        androidx.compose.ui.draganddrop.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            dVar.k0(event);
        }
    }

    @Override // androidx.compose.ui.draganddrop.g
    public boolean m3(@l androidx.compose.ui.draganddrop.b event) {
        androidx.compose.ui.draganddrop.d dVar = this.lastChildDragAndDropModifierNode;
        if (dVar != null) {
            return dVar.m3(event);
        }
        g gVar = this.thisDragAndDropTarget;
        if (gVar != null) {
            return gVar.m3(event);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // androidx.compose.ui.draganddrop.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r0(@fg.l androidx.compose.ui.draganddrop.b r5) {
        /*
            r4 = this;
            androidx.compose.ui.draganddrop.d r0 = r4.lastChildDragAndDropModifierNode
            if (r0 == 0) goto L11
            long r1 = androidx.compose.ui.draganddrop.i.a(r5)
            boolean r1 = androidx.compose.ui.draganddrop.f.c(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L30
        L11:
            androidx.compose.ui.q$d r1 = r4.getNode()
            boolean r1 = r1.getIsAttached()
            if (r1 != 0) goto L1d
            r1 = 0
            goto L30
        L1d:
            kotlin.jvm.internal.k1$h r1 = new kotlin.jvm.internal.k1$h
            r1.<init>()
            androidx.compose.ui.draganddrop.e$a$a r2 = androidx.compose.ui.draganddrop.e.Companion.C0327a.f17401a
            androidx.compose.ui.draganddrop.e$d r3 = new androidx.compose.ui.draganddrop.e$d
            r3.<init>(r1, r4, r5)
            androidx.compose.ui.node.d2.g(r4, r2, r3)
            T r1 = r1.f75329b
            androidx.compose.ui.draganddrop.d r1 = (androidx.compose.ui.draganddrop.d) r1
        L30:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L3f
            androidx.compose.ui.draganddrop.g r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L3b
            r0.Y0(r5)
        L3b:
            androidx.compose.ui.draganddrop.f.d(r1, r5)
            goto L6c
        L3f:
            if (r1 != 0) goto L4e
            if (r0 == 0) goto L4e
            r0.Y0(r5)
            androidx.compose.ui.draganddrop.g r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            androidx.compose.ui.draganddrop.f.d(r0, r5)
            goto L6c
        L4e:
            boolean r2 = kotlin.jvm.internal.l0.g(r1, r0)
            if (r2 != 0) goto L5f
            if (r0 == 0) goto L59
            r0.Y0(r5)
        L59:
            if (r1 == 0) goto L6c
            androidx.compose.ui.draganddrop.f.d(r1, r5)
            goto L6c
        L5f:
            if (r1 == 0) goto L65
            r1.r0(r5)
            goto L6c
        L65:
            androidx.compose.ui.draganddrop.g r0 = r4.thisDragAndDropTarget
            if (r0 == 0) goto L6c
            r0.r0(r5)
        L6c:
            r4.lastChildDragAndDropModifierNode = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.draganddrop.e.r0(androidx.compose.ui.draganddrop.b):void");
    }

    @Override // androidx.compose.ui.node.c2
    @l
    /* renamed from: s0, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }
}
