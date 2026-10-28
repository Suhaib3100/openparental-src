package androidx.compose.ui.input.pointer;

import androidx.compose.ui.input.pointer.t;
import androidx.compose.ui.node.c2;
import androidx.compose.ui.node.d2;
import androidx.compose.ui.node.u1;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.k2;

/* compiled from: PointerIcon.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ*\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\rR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\b\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u0016\u00107\u001a\u0004\u0018\u0001048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Landroidx/compose/ui/input/pointer/v;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/c2;", "Landroidx/compose/ui/node/u1;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/input/pointer/w;", "icon", "", "overrideDescendants", "<init>", "(Landroidx/compose/ui/input/pointer/w;Z)V", "Lkotlin/k2;", "A7", "()V", "z7", "D7", "E7", "()Landroidx/compose/ui/input/pointer/v;", "C7", "F7", "B7", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "g1", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "E4", "j7", "", "p", "Ljava/lang/String;", "J7", "()Ljava/lang/String;", "traverseKey", "value", "q", "Landroidx/compose/ui/input/pointer/w;", "G7", "()Landroidx/compose/ui/input/pointer/w;", "K7", "(Landroidx/compose/ui/input/pointer/w;)V", "r", "Z", "H7", "()Z", "L7", "(Z)V", "s", "cursorInBoundsOfNode", "Landroidx/compose/ui/input/pointer/y;", "I7", "()Landroidx/compose/ui/input/pointer/y;", "pointerIconService", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v extends q.d implements c2, u1, androidx.compose.ui.node.h {

    /* renamed from: t, reason: collision with root package name */
    public static final int f18836t = 8;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String traverseKey;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private w icon;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean overrideDescendants;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean cursorInBoundsOfNode;

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/v;", "it", "", "a", "(Landroidx/compose/ui/input/pointer/v;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<v, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<v> f18841b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.h<v> hVar) {
            super(1);
            this.f18841b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l v vVar) {
            if (this.f18841b.f75329b == null && vVar.cursorInBoundsOfNode) {
                this.f18841b.f75329b = vVar;
            } else if (this.f18841b.f75329b != null && vVar.getOverrideDescendants() && vVar.cursorInBoundsOfNode) {
                this.f18841b.f75329b = vVar;
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/v;", "it", "Landroidx/compose/ui/node/c2$a$a;", "a", "(Landroidx/compose/ui/input/pointer/v;)Landroidx/compose/ui/node/c2$a$a;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<v, c2.Companion.EnumC0346a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.a f18842b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k1.a aVar) {
            super(1);
            this.f18842b = aVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c2.Companion.EnumC0346a invoke(@fg.l v vVar) {
            if (!vVar.cursorInBoundsOfNode) {
                return c2.Companion.EnumC0346a.ContinueTraversal;
            }
            this.f18842b.f75322b = false;
            return c2.Companion.EnumC0346a.CancelTraversal;
        }
    }

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/v;", "it", "Landroidx/compose/ui/node/c2$a$a;", "a", "(Landroidx/compose/ui/input/pointer/v;)Landroidx/compose/ui/node/c2$a$a;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.l<v, c2.Companion.EnumC0346a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<v> f18843b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.h<v> hVar) {
            super(1);
            this.f18843b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c2.Companion.EnumC0346a invoke(@fg.l v vVar) {
            c2.Companion.EnumC0346a enumC0346a = c2.Companion.EnumC0346a.ContinueTraversal;
            if (!vVar.cursorInBoundsOfNode) {
                return enumC0346a;
            }
            this.f18843b.f75329b = vVar;
            return vVar.getOverrideDescendants() ? c2.Companion.EnumC0346a.SkipSubtreeAndContinueTraversal : enumC0346a;
        }
    }

    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/v;", "it", "", "a", "(Landroidx/compose/ui/input/pointer/v;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.n0 implements ld.l<v, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<v> f18844b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1.h<v> hVar) {
            super(1);
            this.f18844b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@fg.l v vVar) {
            if (vVar.getOverrideDescendants() && vVar.cursorInBoundsOfNode) {
                this.f18844b.f75329b = vVar;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ v(w wVar, boolean z4, int i4, kotlin.jvm.internal.w wVar2) {
        this(wVar, (i4 & 2) != 0 ? false : z4);
    }

    private final void A7() {
        w wVar;
        v F7 = F7();
        if (F7 == null || (wVar = F7.icon) == null) {
            wVar = this.icon;
        }
        y I7 = I7();
        if (I7 != null) {
            I7.a(wVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void B7() {
        k2 k2Var;
        k1.h hVar = new k1.h();
        d2.d(this, new a(hVar));
        v vVar = (v) hVar.f75329b;
        if (vVar != null) {
            vVar.A7();
            k2Var = k2.f75408a;
        } else {
            k2Var = null;
        }
        if (k2Var == null) {
            z7();
        }
    }

    private final void C7() {
        v vVar;
        if (this.cursorInBoundsOfNode) {
            if (this.overrideDescendants || (vVar = E7()) == null) {
                vVar = this;
            }
            vVar.A7();
        }
    }

    private final void D7() {
        k1.a aVar = new k1.a();
        aVar.f75322b = true;
        if (!this.overrideDescendants) {
            d2.h(this, new b(aVar));
        }
        if (aVar.f75322b) {
            A7();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final v E7() {
        k1.h hVar = new k1.h();
        d2.h(this, new c(hVar));
        return (v) hVar.f75329b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final v F7() {
        k1.h hVar = new k1.h();
        d2.d(this, new d(hVar));
        return (v) hVar.f75329b;
    }

    private final y I7() {
        return (y) androidx.compose.ui.node.i.a(this, h1.q());
    }

    private final void z7() {
        y I7 = I7();
        if (I7 != null) {
            I7.a(null);
        }
    }

    @Override // androidx.compose.ui.node.u1
    public void E4() {
    }

    @fg.l
    /* renamed from: G7, reason: from getter */
    public final w getIcon() {
        return this.icon;
    }

    /* renamed from: H7, reason: from getter */
    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @fg.l
    /* renamed from: J7, reason: from getter */
    public String getTraverseKey() {
        return this.traverseKey;
    }

    public final void K7(@fg.l w wVar) {
        if (kotlin.jvm.internal.l0.g(this.icon, wVar)) {
            return;
        }
        this.icon = wVar;
        if (this.cursorInBoundsOfNode) {
            D7();
        }
    }

    public final void L7(boolean z4) {
        if (this.overrideDescendants != z4) {
            this.overrideDescendants = z4;
            if (z4) {
                if (this.cursorInBoundsOfNode) {
                    A7();
                }
            } else if (this.cursorInBoundsOfNode) {
                C7();
            }
        }
    }

    @Override // androidx.compose.ui.node.u1
    public void g1(@fg.l p pointerEvent, @fg.l r pass, long bounds) {
        if (pass == r.Main) {
            int type = pointerEvent.getType();
            t.Companion companion = t.INSTANCE;
            companion.getClass();
            if (t.k(type, t.f18828g)) {
                this.cursorInBoundsOfNode = true;
                D7();
                return;
            }
            int type2 = pointerEvent.getType();
            companion.getClass();
            if (t.k(type2, t.f18829h)) {
                this.cursorInBoundsOfNode = false;
                B7();
            }
        }
    }

    @Override // androidx.compose.ui.q.d
    public void j7() {
        this.cursorInBoundsOfNode = false;
        B7();
    }

    @Override // androidx.compose.ui.node.c2
    /* renamed from: s0 */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public v(@fg.l w wVar, boolean z4) {
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
        this.icon = wVar;
        this.overrideDescendants = z4;
    }
}
