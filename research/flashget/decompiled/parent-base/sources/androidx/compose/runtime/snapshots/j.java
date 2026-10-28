package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000eR\u0014\u0010'\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR4\u00100\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010*8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/compose/runtime/snapshots/j;", "Landroidx/compose/runtime/snapshots/m;", "", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "Lkotlin/Function1;", "", "Lkotlin/k2;", "readObserver", "<init>", "(ILandroidx/compose/runtime/snapshots/t;Lld/l;)V", "", "p", "()Z", "D", "(Lld/l;)Landroidx/compose/runtime/snapshots/m;", "u", "()V", "d", "snapshot", "s", "(Landroidx/compose/runtime/snapshots/m;)V", "t", "Landroidx/compose/runtime/snapshots/p0;", "state", "v", "(Landroidx/compose/runtime/snapshots/p0;)V", "g", "Lld/l;", "k", "()Lld/l;", "h", "I", "snapshots", "l", "readOnly", "m", "()Landroidx/compose/runtime/snapshots/m;", "root", "o", "writeObserver", "Landroidx/compose/runtime/collection/d;", "value", "i", "()Landroidx/compose/runtime/collection/d;", "J", "(Landroidx/compose/runtime/collection/d;)V", "modified", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j extends m {

    /* renamed from: i, reason: collision with root package name */
    public static final int f17096i = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Object, k2> readObserver;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    public j(int i4, @fg.l t tVar, @fg.m ld.l<Object, k2> lVar) {
        super(i4, tVar, null);
        this.readObserver = lVar;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    public m D(@fg.m ld.l<Object, k2> readObserver) {
        v.n0(this);
        return new g(getId(), getInvalid(), readObserver, this);
    }

    public void J(@fg.m androidx.compose.runtime.collection.d<p0> dVar) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        if (getDisposed()) {
            return;
        }
        t(this);
        super.d();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public androidx.compose.runtime.collection.d<p0> i() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public ld.l<Object, k2> k() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean l() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    public m m() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.m
    public ld.l<Object, k2> o() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public boolean p() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void s(@fg.l m snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void t(@fg.l m snapshot) {
        int i4 = this.snapshots - 1;
        this.snapshots = i4;
        if (i4 == 0) {
            b();
        }
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void u() {
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void v(@fg.l p0 state) {
        v.f0();
        throw new KotlinNothingValueException();
    }
}
