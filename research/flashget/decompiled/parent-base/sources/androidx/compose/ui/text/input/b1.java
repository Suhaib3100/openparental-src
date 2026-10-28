package androidx.compose.ui.text.input;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: TextInputService.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010!\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u0011`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/input/b1;", "", "Landroidx/compose/ui/text/input/t0;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/t0;)V", "Landroidx/compose/ui/text/input/z0;", "value", "Landroidx/compose/ui/text/input/z;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/p;", "Lkotlin/k2;", "onEditCommand", "Landroidx/compose/ui/text/input/y;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/h1;", "d", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/z;Lld/l;Lld/l;)Landroidx/compose/ui/text/input/h1;", "e", "()V", "session", "g", "(Landroidx/compose/ui/text/input/h1;)V", "f", "c", "b", "a", "Landroidx/compose/ui/text/input/t0;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "_currentInputSession", "()Landroidx/compose/ui/text/input/h1;", "currentInputSession", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20985c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final t0 platformTextInputService;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<h1> _currentInputSession = new AtomicReference<>(null);

    public b1(@fg.l t0 t0Var) {
        this.platformTextInputService = t0Var;
    }

    @fg.m
    public final h1 a() {
        return this._currentInputSession.get();
    }

    @kotlin.k(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @kotlin.x0(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void b() {
        this.platformTextInputService.d();
    }

    @kotlin.k(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @kotlin.x0(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void c() {
        if (a() != null) {
            this.platformTextInputService.h();
        }
    }

    @fg.l
    public h1 d(@fg.l z0 value, @fg.l z imeOptions, @fg.l ld.l<? super List<? extends p>, k2> onEditCommand, @fg.l ld.l<? super y, k2> onImeActionPerformed) {
        this.platformTextInputService.c(value, imeOptions, onEditCommand, onImeActionPerformed);
        h1 h1Var = new h1(this, this.platformTextInputService);
        this._currentInputSession.set(h1Var);
        return h1Var;
    }

    @androidx.compose.ui.text.l
    public final void e() {
        this.platformTextInputService.a();
    }

    @androidx.compose.ui.text.l
    public final void f() {
        this.platformTextInputService.b();
    }

    public void g(@fg.l h1 session) {
        if (androidx.compose.animation.core.k1.a(this._currentInputSession, session, null)) {
            this.platformTextInputService.b();
        }
    }
}
