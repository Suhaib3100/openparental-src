package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: PointerInteropFilter.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.compose.ui.k
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/t0;", "Lkotlin/Function1;", "", "Lkotlin/k2;", "<init>", "()V", "disallowIntercept", "b", "(Z)V", "Landroidx/compose/ui/input/pointer/m0;", "Landroidx/compose/ui/input/pointer/m0;", "a", "()Landroidx/compose/ui/input/pointer/m0;", "c", "(Landroidx/compose/ui/input/pointer/m0;)V", "pointerInteropFilter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 implements ld.l<Boolean, k2> {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18832c = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private m0 pointerInteropFilter;

    @fg.m
    /* renamed from: a, reason: from getter */
    public final m0 getPointerInteropFilter() {
        return this.pointerInteropFilter;
    }

    public void b(boolean disallowIntercept) {
        m0 m0Var = this.pointerInteropFilter;
        if (m0Var == null) {
            return;
        }
        m0Var.e(disallowIntercept);
    }

    public final void c(@fg.m m0 m0Var) {
        this.pointerInteropFilter = m0Var;
    }

    @Override // ld.l
    public /* bridge */ /* synthetic */ k2 invoke(Boolean bool) {
        b(bool.booleanValue());
        return k2.f75408a;
    }
}
