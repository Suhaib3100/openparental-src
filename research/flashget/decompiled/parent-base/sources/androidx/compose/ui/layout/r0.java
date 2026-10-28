package androidx.compose.ui.layout;

import kotlin.Metadata;

/* compiled from: LayoutInfo.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/r0;", "", "Landroidx/compose/ui/q;", "modifier", "Landroidx/compose/ui/layout/u;", "coordinates", "extra", "<init>", "(Landroidx/compose/ui/q;Landroidx/compose/ui/layout/u;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/q;", "c", "()Landroidx/compose/ui/q;", "b", "Landroidx/compose/ui/layout/u;", "()Landroidx/compose/ui/layout/u;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f19088d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.q modifier;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final u coordinates;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Object extra;

    public r0(@fg.l androidx.compose.ui.q qVar, @fg.l u uVar, @fg.m Object obj) {
        this.modifier = qVar;
        this.coordinates = uVar;
        this.extra = obj;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final u getCoordinates() {
        return this.coordinates;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final Object getExtra() {
        return this.extra;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.q getModifier() {
        return this.modifier;
    }

    @fg.l
    public String toString() {
        return "ModifierInfo(" + this.modifier + ", " + this.coordinates + ", " + this.extra + ')';
    }

    public /* synthetic */ r0(androidx.compose.ui.q qVar, u uVar, Object obj, int i4, kotlin.jvm.internal.w wVar) {
        this(qVar, uVar, (i4 & 4) != 0 ? null : obj);
    }
}
