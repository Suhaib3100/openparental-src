package androidx.compose.foundation.layout;

import androidx.compose.runtime.x4;
import androidx.compose.ui.c;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\u0015*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/foundation/layout/j3;", "Landroidx/compose/foundation/layout/a0;", "direction", "", "unbounded", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/ui/unit/w;", "Landroidx/compose/ui/unit/q;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(Landroidx/compose/foundation/layout/a0;ZLld/p;Ljava/lang/Object;Ljava/lang/String;)V", "n", "()Landroidx/compose/foundation/layout/j3;", "node", "Lkotlin/k2;", "o", "(Landroidx/compose/foundation/layout/j3;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Landroidx/compose/foundation/layout/a0;", "e", "Z", "f", "Lld/p;", "g", "Ljava/lang/Object;", "h", "Ljava/lang/String;", "i", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends androidx.compose.ui.node.y0<j3> {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a0 direction;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> alignmentCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object align;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String inspectorName;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$a;", "", "<init>", "()V", "Landroidx/compose/ui/c$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/WrapContentElement;", "c", "(Landroidx/compose/ui/c$b;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/c$c;", "a", "(Landroidx/compose/ui/c$c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/c;", "b", "(Landroidx/compose/ui/c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/unit/u;", "size", "Landroidx/compose/ui/unit/w;", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/q;", "a", "(JLandroidx/compose/ui/unit/w;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        static final class C0088a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c.InterfaceC0326c f4849b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0088a(c.InterfaceC0326c interfaceC0326c) {
                super(2);
                this.f4849b = interfaceC0326c;
            }

            public final long a(long j4, @fg.l androidx.compose.ui.unit.w wVar) {
                return androidx.compose.ui.unit.r.a(0, this.f4849b.a(0, androidx.compose.ui.unit.u.j(j4)));
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.w wVar) {
                return androidx.compose.ui.unit.q.b(a(uVar.getPackedValue(), wVar));
            }
        }

        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/unit/u;", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/q;", "a", "(JLandroidx/compose/ui/unit/w;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$b */
        static final class b extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.c f4850b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.c cVar) {
                super(2);
                this.f4850b = cVar;
            }

            public final long a(long j4, @fg.l androidx.compose.ui.unit.w wVar) {
                androidx.compose.ui.c cVar = this.f4850b;
                androidx.compose.ui.unit.u.INSTANCE.getClass();
                return cVar.a(androidx.compose.ui.unit.u.f21529c, j4, wVar);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.w wVar) {
                return androidx.compose.ui.unit.q.b(a(uVar.getPackedValue(), wVar));
            }
        }

        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/unit/u;", "size", "Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/q;", "a", "(JLandroidx/compose/ui/unit/w;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$c */
        static final class c extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.ui.unit.u, androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c.b f4851b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(c.b bVar) {
                super(2);
                this.f4851b = bVar;
            }

            public final long a(long j4, @fg.l androidx.compose.ui.unit.w wVar) {
                return androidx.compose.ui.unit.r.a(this.f4851b.a(0, androidx.compose.ui.unit.u.m(j4), wVar), 0);
            }

            @Override // ld.p
            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar, androidx.compose.ui.unit.w wVar) {
                return androidx.compose.ui.unit.q.b(a(uVar.getPackedValue(), wVar));
            }
        }

        private Companion() {
        }

        @x4
        @fg.l
        public final WrapContentElement a(@fg.l c.InterfaceC0326c align, boolean unbounded) {
            return new WrapContentElement(a0.Vertical, unbounded, new C0088a(align), align, "wrapContentHeight");
        }

        @x4
        @fg.l
        public final WrapContentElement b(@fg.l androidx.compose.ui.c align, boolean unbounded) {
            return new WrapContentElement(a0.Both, unbounded, new b(align), align, "wrapContentSize");
        }

        @x4
        @fg.l
        public final WrapContentElement c(@fg.l c.b align, boolean unbounded) {
            return new WrapContentElement(a0.Horizontal, unbounded, new c(align), align, "wrapContentWidth");
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(@fg.l a0 a0Var, boolean z4, @fg.l ld.p<? super androidx.compose.ui.unit.u, ? super androidx.compose.ui.unit.w, androidx.compose.ui.unit.q> pVar, @fg.l Object obj, @fg.l String str) {
        this.direction = a0Var;
        this.unbounded = z4;
        this.alignmentCallback = pVar;
        this.align = obj;
        this.inspectorName = str;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && kotlin.jvm.internal.l0.g(this.align, wrapContentElement.align);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        return this.align.hashCode() + androidx.compose.animation.d1.a(this.unbounded, this.direction.hashCode() * 31, 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l androidx.compose.ui.platform.a2 a2Var) {
        a2Var.d(this.inspectorName);
        a2Var.getProperties().c("align", this.align);
        a2Var.getProperties().c("unbounded", Boolean.valueOf(this.unbounded));
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public j3 i() {
        return new j3(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l j3 node) {
        node.C7(this.direction);
        node.D7(this.unbounded);
        node.B7(this.alignmentCallback);
    }
}
