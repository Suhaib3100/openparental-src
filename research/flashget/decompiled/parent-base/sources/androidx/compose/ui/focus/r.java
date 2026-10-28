package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FocusOrderModifier.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/r;", "Landroidx/compose/ui/focus/z;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/o;", "Lkotlin/k2;", "Lkotlin/u;", "focusOrderReceiver", "<init>", "(Lld/l;)V", "Landroidx/compose/ui/focus/t;", "focusProperties", "a", "(Landroidx/compose/ui/focus/t;)V", "b", "Lld/l;", "()Lld/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r implements z {

    /* renamed from: c, reason: collision with root package name */
    public static final int f17568c = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<o, k2> focusOrderReceiver;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@fg.l ld.l<? super o, k2> lVar) {
        this.focusOrderReceiver = lVar;
    }

    @Override // androidx.compose.ui.focus.z
    public void a(@fg.l t focusProperties) {
        this.focusOrderReceiver.invoke(new o(focusProperties));
    }

    @fg.l
    public final ld.l<o, k2> b() {
        return this.focusOrderReceiver;
    }
}
