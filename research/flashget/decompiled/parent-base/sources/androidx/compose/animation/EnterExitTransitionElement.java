package androidx.compose.animation;

import androidx.compose.animation.core.e2;
import androidx.compose.ui.platform.a2;
import kotlin.Metadata;

/* compiled from: EnterExitTransition.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u008d\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u0018*\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J(\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010!J(\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J¤\u0001\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00032 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b5\u00106R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001fR:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010!\"\u0004\b=\u0010>R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010;\u001a\u0004\b@\u0010!\"\u0004\bA\u0010>R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010;\u001a\u0004\bC\u0010!\"\u0004\bD\u0010>R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010%\"\u0004\bH\u0010IR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010'\"\u0004\bM\u0010NR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010)\"\u0004\bR\u0010S¨\u0006T"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/animation/e0;", "Landroidx/compose/animation/core/e2;", "Landroidx/compose/animation/b0;", "transition", "Landroidx/compose/animation/core/e2$a;", "Landroidx/compose/ui/unit/u;", "Landroidx/compose/animation/core/p;", "sizeAnimation", "Landroidx/compose/ui/unit/q;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/f0;", "enter", "Landroidx/compose/animation/h0;", "exit", "Landroidx/compose/animation/o0;", "graphicsLayerBlock", "<init>", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Landroidx/compose/animation/o0;)V", "A", "()Landroidx/compose/animation/e0;", "node", "Lkotlin/k2;", "S", "(Landroidx/compose/animation/e0;)V", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "n", "()Landroidx/compose/animation/core/e2;", "o", "()Landroidx/compose/animation/core/e2$a;", "r", "s", "u", "()Landroidx/compose/animation/f0;", "v", "()Landroidx/compose/animation/h0;", "w", "()Landroidx/compose/animation/o0;", "x", "(Landroidx/compose/animation/core/e2;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/core/e2$a;Landroidx/compose/animation/f0;Landroidx/compose/animation/h0;Landroidx/compose/animation/o0;)Landroidx/compose/animation/EnterExitTransitionElement;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/animation/core/e2;", "K", "e", "Landroidx/compose/animation/core/e2$a;", "H", "Q", "(Landroidx/compose/animation/core/e2$a;)V", "f", "F", "O", "g", "J", "R", "h", "Landroidx/compose/animation/f0;", "B", "L", "(Landroidx/compose/animation/f0;)V", "i", "Landroidx/compose/animation/h0;", "C", "M", "(Landroidx/compose/animation/h0;)V", "j", "Landroidx/compose/animation/o0;", "D", "N", "(Landroidx/compose/animation/o0;)V", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class EnterExitTransitionElement extends androidx.compose.ui.node.y0<e0> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e2<b0> transition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> sizeAnimation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> offsetAnimation;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> slideAnimation;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private f0 enter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private h0 exit;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private o0 graphicsLayerBlock;

    public EnterExitTransitionElement(@fg.l e2<b0> e2Var, @fg.m e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> aVar, @fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar2, @fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar3, @fg.l f0 f0Var, @fg.l h0 h0Var, @fg.l o0 o0Var) {
        this.transition = e2Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = f0Var;
        this.exit = h0Var;
        this.graphicsLayerBlock = o0Var;
    }

    public static EnterExitTransitionElement z(EnterExitTransitionElement enterExitTransitionElement, e2 e2Var, e2.a aVar, e2.a aVar2, e2.a aVar3, f0 f0Var, h0 h0Var, o0 o0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            e2Var = enterExitTransitionElement.transition;
        }
        if ((i4 & 2) != 0) {
            aVar = enterExitTransitionElement.sizeAnimation;
        }
        e2.a aVar4 = aVar;
        if ((i4 & 4) != 0) {
            aVar2 = enterExitTransitionElement.offsetAnimation;
        }
        e2.a aVar5 = aVar2;
        if ((i4 & 8) != 0) {
            aVar3 = enterExitTransitionElement.slideAnimation;
        }
        e2.a aVar6 = aVar3;
        if ((i4 & 16) != 0) {
            f0Var = enterExitTransitionElement.enter;
        }
        f0 f0Var2 = f0Var;
        if ((i4 & 32) != 0) {
            h0Var = enterExitTransitionElement.exit;
        }
        h0 h0Var2 = h0Var;
        if ((i4 & 64) != 0) {
            o0Var = enterExitTransitionElement.graphicsLayerBlock;
        }
        enterExitTransitionElement.getClass();
        return new EnterExitTransitionElement(e2Var, aVar4, aVar5, aVar6, f0Var2, h0Var2, o0Var);
    }

    @Override // androidx.compose.ui.node.y0
    @fg.l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public e0 i() {
        return new e0(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.graphicsLayerBlock);
    }

    @fg.l
    /* renamed from: B, reason: from getter */
    public final f0 getEnter() {
        return this.enter;
    }

    @fg.l
    /* renamed from: C, reason: from getter */
    public final h0 getExit() {
        return this.exit;
    }

    @fg.l
    /* renamed from: D, reason: from getter */
    public final o0 getGraphicsLayerBlock() {
        return this.graphicsLayerBlock;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> F() {
        return this.offsetAnimation;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> H() {
        return this.sizeAnimation;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> J() {
        return this.slideAnimation;
    }

    @fg.l
    public final e2<b0> K() {
        return this.transition;
    }

    public final void L(@fg.l f0 f0Var) {
        this.enter = f0Var;
    }

    public final void M(@fg.l h0 h0Var) {
        this.exit = h0Var;
    }

    public final void N(@fg.l o0 o0Var) {
        this.graphicsLayerBlock = o0Var;
    }

    public final void O(@fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar) {
        this.offsetAnimation = aVar;
    }

    public final void Q(@fg.m e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> aVar) {
        this.sizeAnimation = aVar;
    }

    public final void R(@fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar) {
        this.slideAnimation = aVar;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void m(@fg.l e0 node) {
        node.R7(this.transition);
        node.P7(this.sizeAnimation);
        node.O7(this.offsetAnimation);
        node.Q7(this.slideAnimation);
        node.K7(this.enter);
        node.L7(this.exit);
        node.M7(this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) other;
        return kotlin.jvm.internal.l0.g(this.transition, enterExitTransitionElement.transition) && kotlin.jvm.internal.l0.g(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && kotlin.jvm.internal.l0.g(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && kotlin.jvm.internal.l0.g(this.slideAnimation, enterExitTransitionElement.slideAnimation) && kotlin.jvm.internal.l0.g(this.enter, enterExitTransitionElement.enter) && kotlin.jvm.internal.l0.g(this.exit, enterExitTransitionElement.exit) && kotlin.jvm.internal.l0.g(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = this.transition.hashCode() * 31;
        e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> aVar = this.sizeAnimation;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar2 = this.offsetAnimation;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> aVar3 = this.slideAnimation;
        return this.graphicsLayerBlock.hashCode() + ((this.exit.hashCode() + ((this.enter.hashCode() + ((hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@fg.l a2 a2Var) {
        a2Var.d("enterExitTransition");
        a2Var.getProperties().c("transition", this.transition);
        a2Var.getProperties().c("sizeAnimation", this.sizeAnimation);
        a2Var.getProperties().c("offsetAnimation", this.offsetAnimation);
        a2Var.getProperties().c("slideAnimation", this.slideAnimation);
        a2Var.getProperties().c("enter", this.enter);
        a2Var.getProperties().c("exit", this.exit);
        a2Var.getProperties().c("graphicsLayerBlock", this.graphicsLayerBlock);
    }

    @fg.l
    public final e2<b0> n() {
        return this.transition;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> o() {
        return this.sizeAnimation;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> r() {
        return this.offsetAnimation;
    }

    @fg.m
    public final e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> s() {
        return this.slideAnimation;
    }

    @fg.l
    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    @fg.l
    public final f0 u() {
        return this.enter;
    }

    @fg.l
    public final h0 v() {
        return this.exit;
    }

    @fg.l
    public final o0 w() {
        return this.graphicsLayerBlock;
    }

    @fg.l
    public final EnterExitTransitionElement x(@fg.l e2<b0> transition, @fg.m e2<b0>.a<androidx.compose.ui.unit.u, androidx.compose.animation.core.p> sizeAnimation, @fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> offsetAnimation, @fg.m e2<b0>.a<androidx.compose.ui.unit.q, androidx.compose.animation.core.p> slideAnimation, @fg.l f0 enter, @fg.l h0 exit, @fg.l o0 graphicsLayerBlock) {
        return new EnterExitTransitionElement(transition, sizeAnimation, offsetAnimation, slideAnimation, enter, exit, graphicsLayerBlock);
    }
}
