package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.c1;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlinx.coroutines.l3;

/* compiled from: SnapshotContextElement.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/snapshots/p;", "Landroidx/compose/runtime/snapshots/o;", "Lkotlinx/coroutines/l3;", "Landroidx/compose/runtime/snapshots/m;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/m;)V", "Lkotlin/coroutines/g;", "context", "j", "(Lkotlin/coroutines/g;)Landroidx/compose/runtime/snapshots/m;", "oldState", "Lkotlin/k2;", "a", "(Lkotlin/coroutines/g;Landroidx/compose/runtime/snapshots/m;)V", "b", "Landroidx/compose/runtime/snapshots/m;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c1
/* loaded from: classes.dex */
final class p implements o, l3<m> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m snapshot;

    public p(@fg.l m mVar) {
        this.snapshot = mVar;
    }

    @Override // kotlinx.coroutines.l3
    public m M0(kotlin.coroutines.g gVar) {
        return this.snapshot.r();
    }

    @Override // kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g O(@fg.l kotlin.coroutines.g gVar) {
        return g.b.a.d(this, gVar);
    }

    @Override // kotlinx.coroutines.l3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void H(@fg.l kotlin.coroutines.g context, @fg.m m oldState) {
        this.snapshot.H(oldState);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.m
    public <E extends g.b> E c(@fg.l g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    @fg.l
    public kotlin.coroutines.g d(@fg.l g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.g.b, kotlin.coroutines.g
    public <R> R g(R r4, @fg.l ld.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // kotlin.coroutines.g.b
    @fg.l
    public g.c<?> getKey() {
        return o.INSTANCE;
    }

    @fg.m
    public m j(@fg.l kotlin.coroutines.g context) {
        return this.snapshot.r();
    }
}
