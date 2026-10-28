package androidx.compose.ui.draw;

import androidx.compose.ui.unit.w;
import kotlin.Metadata;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/draw/o;", "Landroidx/compose/ui/draw/d;", "<init>", "()V", "Li0/n;", "c", "J", "e", "()J", "size", "Landroidx/compose/ui/unit/w;", "d", "Landroidx/compose/ui/unit/w;", "getLayoutDirection", "()Landroidx/compose/ui/unit/w;", "layoutDirection", "Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/d;", "b", "()Landroidx/compose/ui/unit/d;", "density", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class o implements d {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final o f17450b = new o();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long size;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final w layoutDirection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final androidx.compose.ui.unit.d density;

    static {
        i0.n.INSTANCE.getClass();
        size = i0.n.f74172d;
        layoutDirection = w.Ltr;
        density = androidx.compose.ui.unit.f.a(1.0f, 1.0f);
    }

    private o() {
    }

    @Override // androidx.compose.ui.draw.d
    @fg.l
    public androidx.compose.ui.unit.d b() {
        return density;
    }

    @Override // androidx.compose.ui.draw.d
    public long e() {
        return size;
    }

    @Override // androidx.compose.ui.draw.d
    @fg.l
    public w getLayoutDirection() {
        return layoutDirection;
    }
}
