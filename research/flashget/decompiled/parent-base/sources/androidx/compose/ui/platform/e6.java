package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: WindowInfo.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R0\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8W@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0014\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/e6;", "Landroidx/compose/ui/platform/d6;", "<init>", "()V", "Landroidx/compose/runtime/k2;", "", "a", "Landroidx/compose/runtime/k2;", "_isWindowFocused", "Landroidx/compose/ui/input/pointer/p0;", "value", "c", "()I", "e", "(I)V", "keyboardModifiers", "b", "()Z", "f", "(Z)V", "isWindowFocused", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e6 implements d6 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: c, reason: collision with root package name */
    public static final int f19833c = 0;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.k2<androidx.compose.ui.input.pointer.p0> f19834d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.k2<Boolean> _isWindowFocused;

    /* compiled from: WindowInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/e6$a;", "", "<init>", "()V", "Landroidx/compose/runtime/k2;", "Landroidx/compose/ui/input/pointer/p0;", "GlobalKeyboardModifiers", "Landroidx/compose/runtime/k2;", "a", "()Landroidx/compose/runtime/k2;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.e6$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.k2<androidx.compose.ui.input.pointer.p0> a() {
            return e6.f19834d;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    static {
        androidx.compose.runtime.k2<androidx.compose.ui.input.pointer.p0> g4;
        g4 = androidx.compose.runtime.t4.g(androidx.compose.ui.input.pointer.p0.a(0), null, 2, null);
        f19834d = g4;
    }

    public e6() {
        androidx.compose.runtime.k2<Boolean> g4;
        g4 = androidx.compose.runtime.t4.g(Boolean.FALSE, null, 2, null);
        this._isWindowFocused = g4;
    }

    public static /* synthetic */ void a() {
    }

    @Override // androidx.compose.ui.platform.d6
    public boolean b() {
        return this._isWindowFocused.getValue().booleanValue();
    }

    @Override // androidx.compose.ui.platform.d6
    @androidx.compose.ui.k
    public int c() {
        return f19834d.getValue().getPackedValue();
    }

    public void e(int i4) {
        f19834d.setValue(androidx.compose.ui.input.pointer.p0.a(i4));
    }

    public void f(boolean z4) {
        this._isWindowFocused.setValue(Boolean.valueOf(z4));
    }
}
