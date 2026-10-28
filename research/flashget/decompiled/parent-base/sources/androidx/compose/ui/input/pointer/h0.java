package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u0003R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00168VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\"\u001a\u00020\b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/input/pointer/h0;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/p;", "pointerEvent", "Landroidx/compose/ui/input/pointer/r;", "pass", "Landroidx/compose/ui/unit/u;", "bounds", "Lkotlin/k2;", "h", "(Landroidx/compose/ui/input/pointer/p;Landroidx/compose/ui/input/pointer/r;J)V", "g", "Landroidx/compose/ui/layout/u;", "a", "Landroidx/compose/ui/layout/u;", "b", "()Landroidx/compose/ui/layout/u;", "j", "(Landroidx/compose/ui/layout/u;)V", "layoutCoordinates", "", "Z", "f", "()Z", "i", "(Z)V", "isAttached", "c", "d", "shareWithSiblings", "e", "()J", "size", "interceptOutOfBoundsChildEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18762c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.ui.layout.u layoutCoordinates;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isAttached;

    public static /* synthetic */ void d() {
    }

    public boolean a() {
        return false;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.layout.u getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public boolean c() {
        return false;
    }

    public final long e() {
        androidx.compose.ui.layout.u uVar = this.layoutCoordinates;
        if (uVar != null) {
            return uVar.c();
        }
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        return androidx.compose.ui.unit.u.f21529c;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsAttached() {
        return this.isAttached;
    }

    public abstract void g();

    public abstract void h(@fg.l p pointerEvent, @fg.l r pass, long bounds);

    public final void i(boolean z4) {
        this.isAttached = z4;
    }

    public final void j(@fg.m androidx.compose.ui.layout.u uVar) {
        this.layoutCoordinates = uVar;
    }
}
