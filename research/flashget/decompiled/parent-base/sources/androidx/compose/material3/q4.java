package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Divider.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\f\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/material3/q4;", "", "<init>", "()V", "Landroidx/compose/ui/unit/h;", "b", "F", "()F", "Thickness", "Landroidx/compose/ui/graphics/d2;", "a", "(Landroidx/compose/runtime/t;I)J", "color", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final q4 f13649a = new q4();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Thickness = c0.l.f37624a.b();

    /* renamed from: c, reason: collision with root package name */
    public static final int f13651c = 0;

    private q4() {
    }

    @androidx.compose.runtime.i
    @kd.i(name = "getColor")
    public final long a(@fg.m androidx.compose.runtime.t tVar, int i4) {
        tVar.P(77461041);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.r0(77461041, i4, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:115)");
        }
        long k4 = b3.k(c0.l.f37624a.a(), tVar, 6);
        if (androidx.compose.runtime.x.b0()) {
            androidx.compose.runtime.x.q0();
        }
        tVar.p0();
        return k4;
    }

    public final float b() {
        return Thickness;
    }
}
