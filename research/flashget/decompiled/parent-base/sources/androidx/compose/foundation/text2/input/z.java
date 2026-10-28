package androidx.compose.foundation.text2.input;

import androidx.compose.foundation.z0;
import kotlin.Metadata;

/* compiled from: UndoState.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@z0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8F¢\u0006\f\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\f8F¢\u0006\f\u0012\u0004\b\u0012\u0010\b\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/text2/input/z;", "", "Landroidx/compose/foundation/text2/input/u;", "state", "<init>", "(Landroidx/compose/foundation/text2/input/u;)V", "Lkotlin/k2;", "g", "()V", "f", "a", "Landroidx/compose/foundation/text2/input/u;", "", "d", "()Z", "e", "canUndo", "b", "c", "canRedo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final int f9091b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u state;

    public z(@fg.l u uVar) {
        this.state = uVar;
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void e() {
    }

    public final void a() {
        this.state.getTextUndoManager().c();
    }

    public final boolean b() {
        return this.state.getTextUndoManager().e();
    }

    public final boolean d() {
        return this.state.getTextUndoManager().f();
    }

    public final void f() {
        this.state.getTextUndoManager().i(this.state);
    }

    public final void g() {
        this.state.getTextUndoManager().k(this.state);
    }
}
