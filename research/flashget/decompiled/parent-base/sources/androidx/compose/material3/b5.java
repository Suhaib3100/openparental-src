package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Elevation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/b;", "Landroidx/compose/ui/unit/h;", "target", "Landroidx/compose/foundation/interaction/h;", "from", "to", "Lkotlin/k2;", "d", "(Landroidx/compose/animation/core/b;FLandroidx/compose/foundation/interaction/h;Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/animation/core/d0;", "a", "Landroidx/compose/animation/core/d0;", "OutgoingSpecEasing", "Landroidx/compose/animation/core/h2;", "b", "Landroidx/compose/animation/core/h2;", "DefaultIncomingSpec", "c", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.d0 f9831a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.h2<androidx.compose.ui.unit.h> f9832b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.h2<androidx.compose.ui.unit.h> f9833c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.animation.core.h2<androidx.compose.ui.unit.h> f9834d;

    static {
        androidx.compose.animation.core.x xVar = new androidx.compose.animation.core.x(0.4f, 0.0f, 0.6f, 1.0f);
        f9831a = xVar;
        f9832b = new androidx.compose.animation.core.h2<>(120, 0, androidx.compose.animation.core.m0.d(), 2, null);
        f9833c = new androidx.compose.animation.core.h2<>(150, 0, xVar, 2, null);
        f9834d = new androidx.compose.animation.core.h2<>(120, 0, xVar, 2, null);
    }

    @fg.m
    public static final Object d(@fg.l androidx.compose.animation.core.b<androidx.compose.ui.unit.h, ?> bVar, float f4, @fg.m androidx.compose.foundation.interaction.h hVar, @fg.m androidx.compose.foundation.interaction.h hVar2, @fg.l kotlin.coroutines.d<? super kotlin.k2> dVar) {
        androidx.compose.animation.core.k<androidx.compose.ui.unit.h> a5 = hVar2 != null ? a5.f9770a.a(hVar2) : hVar != null ? a5.f9770a.b(hVar) : null;
        if (a5 != null) {
            Object i4 = androidx.compose.animation.core.b.i(bVar, androidx.compose.ui.unit.h.d(f4), a5, null, null, dVar, 12, null);
            return i4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? i4 : kotlin.k2.f75408a;
        }
        Object C = bVar.C(androidx.compose.ui.unit.h.d(f4), dVar);
        return C == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? C : kotlin.k2.f75408a;
    }

    public static /* synthetic */ Object e(androidx.compose.animation.core.b bVar, float f4, androidx.compose.foundation.interaction.h hVar, androidx.compose.foundation.interaction.h hVar2, kotlin.coroutines.d dVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            hVar = null;
        }
        if ((i4 & 4) != 0) {
            hVar2 = null;
        }
        return d(bVar, f4, hVar, hVar2, dVar);
    }
}
