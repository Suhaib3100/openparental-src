package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: DepthSortedSet.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\fJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013JJ\u0010\u0018\u001a\u00020\r28\b\u0004\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\r0\u0014H\u0086\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001bR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, d2 = {"Landroidx/compose/ui/node/n;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/h0;", "node", "affectsLookahead", "e", "(Landroidx/compose/ui/node/h0;Z)Z", "d", "(Landroidx/compose/ui/node/h0;)Z", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/node/h0;Z)V", "l", "k", "i", "()Landroidx/compose/ui/node/h0;", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "block", "j", "(Lld/p;)V", "f", "()Z", "g", "(Z)Z", "h", "Landroidx/compose/ui/node/m;", "a", "Landroidx/compose/ui/node/m;", "lookaheadSet", "b", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,184:1\n96#2:185\n96#2:186\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n160#1:185\n172#1:186\n*E\n"})
/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final int f19439c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m lookaheadSet;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m set;

    public n(boolean z4) {
        this.lookaheadSet = new m(z4);
        this.set = new m(z4);
    }

    public final void c(@fg.l h0 node, boolean affectsLookahead) {
        if (affectsLookahead) {
            this.lookaheadSet.a(node);
        } else {
            if (this.lookaheadSet.b(node)) {
                return;
            }
            this.set.a(node);
        }
    }

    public final boolean d(@fg.l h0 node) {
        return this.lookaheadSet.b(node) || this.set.b(node);
    }

    public final boolean e(@fg.l h0 node, boolean affectsLookahead) {
        boolean b5 = this.lookaheadSet.b(node);
        return affectsLookahead ? b5 : b5 || this.set.b(node);
    }

    public final boolean f() {
        return this.set.d() && this.lookaheadSet.d();
    }

    public final boolean g(boolean affectsLookahead) {
        return (affectsLookahead ? this.lookaheadSet : this.set).d();
    }

    public final boolean h() {
        return !f();
    }

    @fg.l
    public final h0 i() {
        return !this.lookaheadSet.d() ? this.lookaheadSet.f() : this.set.f();
    }

    public final void j(@fg.l ld.p<? super h0, ? super Boolean, k2> block) {
        while (h()) {
            boolean d5 = this.lookaheadSet.d();
            block.invoke((!d5 ? this.lookaheadSet : this.set).f(), Boolean.valueOf(!d5));
        }
    }

    public final boolean k(@fg.l h0 node) {
        return this.set.h(node) || this.lookaheadSet.h(node);
    }

    public final boolean l(@fg.l h0 node, boolean affectsLookahead) {
        return affectsLookahead ? this.lookaheadSet.h(node) : this.set.h(node);
    }
}
