package androidx.compose.ui.focus;

import kotlin.Metadata;

/* compiled from: FocusOrderModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.k(message = "Use FocusProperties instead")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010 \u001a\u00020\t2\u0006\u0010 \u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000e¨\u0006#"}, d2 = {"Landroidx/compose/ui/focus/o;", "", "Landroidx/compose/ui/focus/t;", "focusProperties", "<init>", "(Landroidx/compose/ui/focus/t;)V", "()V", "a", "Landroidx/compose/ui/focus/t;", "Landroidx/compose/ui/focus/a0;", "next", "d", "()Landroidx/compose/ui/focus/a0;", "l", "(Landroidx/compose/ui/focus/a0;)V", "previous", "e", "m", "up", "h", "p", "down", "i", "left", "c", "k", "right", "f", "n", "start", "g", "o", "end", "b", "j", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final int f17555b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t focusProperties;

    public o(@fg.l t tVar) {
        this.focusProperties = tVar;
    }

    @fg.l
    public final a0 a() {
        return this.focusProperties.getDown();
    }

    @fg.l
    public final a0 b() {
        return this.focusProperties.getEnd();
    }

    @fg.l
    public final a0 c() {
        return this.focusProperties.getLeft();
    }

    @fg.l
    public final a0 d() {
        return this.focusProperties.getNext();
    }

    @fg.l
    public final a0 e() {
        return this.focusProperties.getPrevious();
    }

    @fg.l
    public final a0 f() {
        return this.focusProperties.getRight();
    }

    @fg.l
    public final a0 g() {
        return this.focusProperties.getStart();
    }

    @fg.l
    public final a0 h() {
        return this.focusProperties.getUp();
    }

    public final void i(@fg.l a0 a0Var) {
        this.focusProperties.o(a0Var);
    }

    public final void j(@fg.l a0 a0Var) {
        this.focusProperties.p(a0Var);
    }

    public final void k(@fg.l a0 a0Var) {
        this.focusProperties.q(a0Var);
    }

    public final void l(@fg.l a0 a0Var) {
        this.focusProperties.y(a0Var);
    }

    public final void m(@fg.l a0 a0Var) {
        this.focusProperties.x(a0Var);
    }

    public final void n(@fg.l a0 a0Var) {
        this.focusProperties.r(a0Var);
    }

    public final void o(@fg.l a0 a0Var) {
        this.focusProperties.s(a0Var);
    }

    public final void p(@fg.l a0 a0Var) {
        this.focusProperties.j(a0Var);
    }

    public o() {
        this(new u());
    }
}
