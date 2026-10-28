package androidx.compose.foundation.text;

import androidx.compose.ui.platform.g5;
import androidx.compose.ui.text.input.y;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: KeyboardActionRunner.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text/b0;", "Landroidx/compose/foundation/text/c0;", "Landroidx/compose/ui/platform/g5;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/g5;)V", "Landroidx/compose/ui/text/input/y;", "imeAction", "Lkotlin/k2;", "d", "(I)V", "a", "Landroidx/compose/ui/platform/g5;", "Landroidx/compose/foundation/text/d0;", "b", "Landroidx/compose/foundation/text/d0;", "c", "()Landroidx/compose/foundation/text/d0;", "f", "(Landroidx/compose/foundation/text/d0;)V", "keyboardActions", "Landroidx/compose/ui/focus/m;", "Landroidx/compose/ui/focus/m;", "()Landroidx/compose/ui/focus/m;", "e", "(Landroidx/compose/ui/focus/m;)V", "focusManager", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f7122d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final g5 keyboardController;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public d0 keyboardActions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.focus.m focusManager;

    public b0(@fg.m g5 g5Var) {
        this.keyboardController = g5Var;
    }

    @Override // androidx.compose.foundation.text.c0
    public void a(int imeAction) {
        boolean l4;
        boolean l5;
        y.Companion companion = androidx.compose.ui.text.input.y.INSTANCE;
        companion.getClass();
        if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21137i)) {
            androidx.compose.ui.focus.m b5 = b();
            androidx.compose.ui.focus.f.INSTANCE.getClass();
            b5.g(androidx.compose.ui.focus.f.f17526c);
            return;
        }
        companion.getClass();
        if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21136h)) {
            androidx.compose.ui.focus.m b6 = b();
            androidx.compose.ui.focus.f.INSTANCE.getClass();
            b6.g(androidx.compose.ui.focus.f.f17527d);
            return;
        }
        companion.getClass();
        if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21138j)) {
            g5 g5Var = this.keyboardController;
            if (g5Var != null) {
                g5Var.a();
                return;
            }
            return;
        }
        companion.getClass();
        boolean z4 = true;
        if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21133e)) {
            l4 = true;
        } else {
            companion.getClass();
            l4 = androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21134f);
        }
        if (l4) {
            l5 = true;
        } else {
            companion.getClass();
            l5 = androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21135g);
        }
        if (!l5) {
            companion.getClass();
            z4 = androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21131c);
        }
        if (z4) {
            return;
        }
        companion.getClass();
        androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21132d);
    }

    @fg.l
    public final androidx.compose.ui.focus.m b() {
        androidx.compose.ui.focus.m mVar = this.focusManager;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.l0.S("focusManager");
        return null;
    }

    @fg.l
    public final d0 c() {
        d0 d0Var = this.keyboardActions;
        if (d0Var != null) {
            return d0Var;
        }
        kotlin.jvm.internal.l0.S("keyboardActions");
        return null;
    }

    public final void d(int imeAction) {
        boolean l4;
        ld.l<c0, k2> lVar;
        y.Companion companion = androidx.compose.ui.text.input.y.INSTANCE;
        companion.getClass();
        k2 k2Var = null;
        if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21138j)) {
            lVar = c().b();
        } else {
            companion.getClass();
            if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21133e)) {
                lVar = c().c();
            } else {
                companion.getClass();
                if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21137i)) {
                    lVar = c().d();
                } else {
                    companion.getClass();
                    if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21136h)) {
                        lVar = c().e();
                    } else {
                        companion.getClass();
                        if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21134f)) {
                            lVar = c().f();
                        } else {
                            companion.getClass();
                            if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21135g)) {
                                lVar = c().g();
                            } else {
                                companion.getClass();
                                if (androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21131c)) {
                                    l4 = true;
                                } else {
                                    companion.getClass();
                                    l4 = androidx.compose.ui.text.input.y.l(imeAction, androidx.compose.ui.text.input.y.f21132d);
                                }
                                if (!l4) {
                                    throw new IllegalStateException("invalid ImeAction");
                                }
                                lVar = null;
                            }
                        }
                    }
                }
            }
        }
        if (lVar != null) {
            lVar.invoke(this);
            k2Var = k2.f75408a;
        }
        if (k2Var == null) {
            a(imeAction);
        }
    }

    public final void e(@fg.l androidx.compose.ui.focus.m mVar) {
        this.focusManager = mVar;
    }

    public final void f(@fg.l d0 d0Var) {
        this.keyboardActions = d0Var;
    }
}
