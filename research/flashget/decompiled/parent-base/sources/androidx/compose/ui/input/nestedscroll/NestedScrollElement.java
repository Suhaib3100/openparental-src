package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.y0;
import androidx.compose.ui.platform.a2;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: NestedScrollModifier.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\f*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Landroidx/compose/ui/node/y0;", "Landroidx/compose/ui/input/nestedscroll/d;", "Landroidx/compose/ui/input/nestedscroll/a;", "connection", "Landroidx/compose/ui/input/nestedscroll/b;", "dispatcher", "<init>", "(Landroidx/compose/ui/input/nestedscroll/a;Landroidx/compose/ui/input/nestedscroll/b;)V", "n", "()Landroidx/compose/ui/input/nestedscroll/d;", "node", "Lkotlin/k2;", "s", "(Landroidx/compose/ui/input/nestedscroll/d;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/platform/a2;", "k", "(Landroidx/compose/ui/platform/a2;)V", "d", "Landroidx/compose/ui/input/nestedscroll/a;", "o", "()Landroidx/compose/ui/input/nestedscroll/a;", "e", "Landroidx/compose/ui/input/nestedscroll/b;", "r", "()Landroidx/compose/ui/input/nestedscroll/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NestedScrollElement extends y0<d> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final a connection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @m
    private final b dispatcher;

    public NestedScrollElement(@l a aVar, @m b bVar) {
        this.connection = aVar;
        this.dispatcher = bVar;
    }

    @Override // androidx.compose.ui.node.y0
    public boolean equals(@m Object other) {
        if (!(other instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) other;
        return l0.g(nestedScrollElement.connection, this.connection) && l0.g(nestedScrollElement.dispatcher, this.dispatcher);
    }

    @Override // androidx.compose.ui.node.y0
    public int hashCode() {
        int hashCode = this.connection.hashCode() * 31;
        b bVar = this.dispatcher;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.y0
    public void k(@l a2 a2Var) {
        a2Var.d("nestedScroll");
        a2Var.getProperties().c("connection", this.connection);
        a2Var.getProperties().c("dispatcher", this.dispatcher);
    }

    @Override // androidx.compose.ui.node.y0
    @l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public d i() {
        return new d(this.connection, this.dispatcher);
    }

    @l
    /* renamed from: o, reason: from getter */
    public final a getConnection() {
        return this.connection;
    }

    @m
    /* renamed from: r, reason: from getter */
    public final b getDispatcher() {
        return this.dispatcher;
    }

    @Override // androidx.compose.ui.node.y0
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m(@l d node) {
        node.H7(this.connection, this.dispatcher);
    }
}
