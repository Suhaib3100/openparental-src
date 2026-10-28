package androidx.compose.ui.platform;

import kotlin.Metadata;

/* compiled from: InspectableValue.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bR%\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/b2;", "Landroidx/compose/ui/platform/x1;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/a2;", "Lkotlin/k2;", "Lkotlin/u;", "info", "<init>", "(Lld/l;)V", "b", "Lld/l;", "c", "Landroidx/compose/ui/platform/a2;", "_values", "i", "()Landroidx/compose/ui/platform/a2;", "values", "", "h", "()Ljava/lang/String;", "nameFallback", "", "()Ljava/lang/Object;", "valueOverride", "Lkotlin/sequences/m;", "Landroidx/compose/ui/platform/m5;", "g", "()Lkotlin/sequences/m;", "inspectableElements", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b2 implements x1 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19775d = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.l<a2, kotlin.k2> info;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a2 _values;

    /* JADX WARN: Multi-variable type inference failed */
    public b2(@fg.l ld.l<? super a2, kotlin.k2> lVar) {
        this.info = lVar;
    }

    private final a2 i() {
        a2 a2Var = this._values;
        if (a2Var == null) {
            a2Var = new a2();
            this.info.invoke(a2Var);
        }
        this._values = a2Var;
        return a2Var;
    }

    @Override // androidx.compose.ui.platform.x1
    @fg.m
    public Object b() {
        return i().getValue();
    }

    @Override // androidx.compose.ui.platform.x1
    @fg.l
    public kotlin.sequences.m<m5> g() {
        return i().getProperties();
    }

    @Override // androidx.compose.ui.platform.x1
    @fg.m
    public String h() {
        return i().getName();
    }
}
