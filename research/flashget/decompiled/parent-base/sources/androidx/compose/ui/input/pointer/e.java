package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* compiled from: PointerEvent.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@kotlin.k(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\b\u0012\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/e;", "", "", "positionChange", "downChange", "<init>", "(ZZ)V", "a", "Z", "c", "()Z", "f", "(Z)V", "d", "()V", "b", "e", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final int f18730c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean positionChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean downChange;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.e.<init>():void");
    }

    @kotlin.k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void b() {
    }

    @kotlin.k(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void d() {
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDownChange() {
        return this.downChange;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void e(boolean z4) {
        this.downChange = z4;
    }

    public final void f(boolean z4) {
        this.positionChange = z4;
    }

    public e(boolean z4, boolean z5) {
        this.positionChange = z4;
        this.downChange = z5;
    }

    public /* synthetic */ e(boolean z4, boolean z5, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? false : z4, (i4 & 2) != 0 ? false : z5);
    }
}
