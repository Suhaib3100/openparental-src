package androidx.compose.foundation.interaction;

import androidx.compose.runtime.x4;
import kotlin.Metadata;
import kotlin.k2;
import kotlinx.coroutines.flow.d0;
import kotlinx.coroutines.flow.k0;

/* compiled from: InteractionSource.kt */
@x4
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/interaction/l;", "Landroidx/compose/foundation/interaction/k;", "<init>", "()V", "Landroidx/compose/foundation/interaction/h;", "interaction", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/interaction/h;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "b", "(Landroidx/compose/foundation/interaction/h;)Z", "Lkotlinx/coroutines/flow/d0;", "Lkotlinx/coroutines/flow/d0;", "d", "()Lkotlinx/coroutines/flow/d0;", "interactions", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class l implements k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d0<h> interactions = k0.b(0, 16, kotlinx.coroutines.channels.i.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.k
    @fg.m
    public Object a(@fg.l h hVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
        Object emit = this.interactions.emit(hVar, dVar);
        return emit == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? emit : k2.f75408a;
    }

    @Override // androidx.compose.foundation.interaction.k
    public boolean b(@fg.l h interaction) {
        return this.interactions.b(interaction);
    }

    @Override // androidx.compose.foundation.interaction.i
    public kotlinx.coroutines.flow.i c() {
        return this.interactions;
    }

    @fg.l
    public d0<h> d() {
        return this.interactions;
    }
}
