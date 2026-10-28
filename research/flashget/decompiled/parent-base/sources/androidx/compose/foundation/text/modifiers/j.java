package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.selection.l0;
import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.p3;
import androidx.compose.ui.graphics.c2;
import androidx.compose.ui.graphics.g5;
import androidx.compose.ui.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: SelectionController.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b!\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/text/modifiers/j;", "Landroidx/compose/runtime/p3;", "", "selectableId", "Landroidx/compose/foundation/text/selection/l0;", "selectionRegistrar", "Landroidx/compose/ui/graphics/d2;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/l;", "params", "<init>", "(JLandroidx/compose/foundation/text/selection/l0;JLandroidx/compose/foundation/text/modifiers/l;Lkotlin/jvm/internal/w;)V", "Lkotlin/k2;", "b", "()V", "d", "c", "Landroidx/compose/ui/text/n0;", "textLayoutResult", "h", "(Landroidx/compose/ui/text/n0;)V", "Landroidx/compose/ui/layout/u;", "coordinates", "g", "(Landroidx/compose/ui/layout/u;)V", "Landroidx/compose/ui/graphics/drawscope/f;", "drawScope", "e", "(Landroidx/compose/ui/graphics/drawscope/f;)V", "J", "Landroidx/compose/foundation/text/selection/l0;", "Landroidx/compose/foundation/text/modifiers/l;", "Landroidx/compose/foundation/text/selection/o;", "f", "Landroidx/compose/foundation/text/selection/o;", "selectable", "Landroidx/compose/ui/q;", "Landroidx/compose/ui/q;", "()Landroidx/compose/ui/q;", "modifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,339:1\n215#2,8:340\n262#2,11:348\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n147#1:340,8\n147#1:348,11\n*E\n"})
/* loaded from: classes.dex */
public final class j implements p3 {

    /* renamed from: h, reason: collision with root package name */
    public static final int f7768h = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final l0 selectionRegistrar;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long backgroundSelectionColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private l params;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.text.selection.o selectable;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q modifier;

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/u;", "a", "()Landroidx/compose/ui/layout/u;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<androidx.compose.ui.layout.u> {
        a() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.layout.u invoke() {
            return j.this.params.getLayoutCoordinates();
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/u;", "a", "()Landroidx/compose/ui/layout/u;"}, k = 3, mv = {1, 8, 0})
    static final class b extends n0 implements ld.a<androidx.compose.ui.layout.u> {
        b() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.layout.u invoke() {
            return j.this.params.getLayoutCoordinates();
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/n0;", "a", "()Landroidx/compose/ui/text/n0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends n0 implements ld.a<androidx.compose.ui.text.n0> {
        c() {
            super(0);
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.n0 invoke() {
            return j.this.params.getTextLayoutResult();
        }
    }

    public /* synthetic */ j(long j4, l0 l0Var, long j5, l lVar, w wVar) {
        this(j4, l0Var, j5, lVar);
    }

    @Override // androidx.compose.runtime.p3
    public void b() {
        this.selectable = this.selectionRegistrar.h(new androidx.compose.foundation.text.selection.l(this.selectableId, new b(), new c()));
    }

    @Override // androidx.compose.runtime.p3
    public void c() {
        androidx.compose.foundation.text.selection.o oVar = this.selectable;
        if (oVar != null) {
            this.selectionRegistrar.d(oVar);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.p3
    public void d() {
        androidx.compose.foundation.text.selection.o oVar = this.selectable;
        if (oVar != null) {
            this.selectionRegistrar.d(oVar);
            this.selectable = null;
        }
    }

    public final void e(@fg.l androidx.compose.ui.graphics.drawscope.f drawScope) {
        androidx.compose.foundation.text.selection.q qVar = this.selectionRegistrar.b().get(Long.valueOf(this.selectableId));
        if (qVar == null) {
            return;
        }
        int g4 = !qVar.g() ? qVar.h().g() : qVar.f().g();
        int g5 = !qVar.g() ? qVar.f().g() : qVar.h().g();
        if (g4 == g5) {
            return;
        }
        androidx.compose.foundation.text.selection.o oVar = this.selectable;
        int h4 = oVar != null ? oVar.h() : 0;
        if (g4 > h4) {
            g4 = h4;
        }
        if (g5 > h4) {
            g5 = h4;
        }
        g5 e4 = this.params.e(g4, g5);
        if (e4 == null) {
            return;
        }
        if (!this.params.f()) {
            androidx.compose.ui.graphics.drawscope.f.N1(drawScope, e4, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float t4 = i0.n.t(drawScope.e());
        float m4 = i0.n.m(drawScope.e());
        c2.INSTANCE.getClass();
        int i4 = c2.f17637d;
        androidx.compose.ui.graphics.drawscope.d drawContext = drawScope.getDrawContext();
        long e5 = drawContext.e();
        drawContext.i().C();
        drawContext.getTransform().b(0.0f, 0.0f, t4, m4, i4);
        androidx.compose.ui.graphics.drawscope.f.N1(drawScope, e4, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        drawContext.i().o();
        drawContext.j(e5);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final q getModifier() {
        return this.modifier;
    }

    public final void g(@fg.l androidx.compose.ui.layout.u coordinates) {
        this.params = l.c(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.c(this.selectableId);
    }

    public final void h(@fg.l androidx.compose.ui.text.n0 textLayoutResult) {
        this.params = l.c(this.params, null, textLayoutResult, 1, null);
    }

    private j(long j4, l0 l0Var, long j5, l lVar) {
        q b5;
        this.selectableId = j4;
        this.selectionRegistrar = l0Var;
        this.backgroundSelectionColor = j5;
        this.params = lVar;
        b5 = k.b(l0Var, j4, new a());
        this.modifier = androidx.compose.foundation.text.e.a(b5, l0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(long r8, androidx.compose.foundation.text.selection.l0 r10, long r11, androidx.compose.foundation.text.modifiers.l r13, int r14, kotlin.jvm.internal.w r15) {
        /*
            r7 = this;
            r14 = r14 & 8
            if (r14 == 0) goto Ld
            androidx.compose.foundation.text.modifiers.l$a r13 = androidx.compose.foundation.text.modifiers.l.INSTANCE
            r13.getClass()
            androidx.compose.foundation.text.modifiers.l r13 = androidx.compose.foundation.text.modifiers.l.a()
        Ld:
            r6 = r13
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.j.<init>(long, androidx.compose.foundation.text.selection.l0, long, androidx.compose.foundation.text.modifiers.l, int, kotlin.jvm.internal.w):void");
    }
}
