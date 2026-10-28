package androidx.compose.runtime.snapshots;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001d\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0014\u0010)\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010!R\u001c\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010*8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\"\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b.\u0010%¨\u00060"}, d2 = {"Landroidx/compose/runtime/snapshots/g;", "Landroidx/compose/runtime/snapshots/m;", "", "id", "Landroidx/compose/runtime/snapshots/t;", "invalid", "Lkotlin/Function1;", "", "Lkotlin/k2;", "readObserver", "parent", "<init>", "(ILandroidx/compose/runtime/snapshots/t;Lld/l;Landroidx/compose/runtime/snapshots/m;)V", "N", "(Lld/l;)Landroidx/compose/runtime/snapshots/g;", "u", "()V", "", "p", "()Z", "d", "Landroidx/compose/runtime/snapshots/p0;", "state", "", "M", "(Landroidx/compose/runtime/snapshots/p0;)Ljava/lang/Void;", "snapshot", "L", "(Landroidx/compose/runtime/snapshots/m;)Ljava/lang/Void;", "K", "g", "Landroidx/compose/runtime/snapshots/m;", "J", "()Landroidx/compose/runtime/snapshots/m;", "h", "Lld/l;", "k", "()Lld/l;", "l", "readOnly", "m", "root", "Landroidx/compose/runtime/collection/d;", "i", "()Landroidx/compose/runtime/collection/d;", "modified", "o", "writeObserver", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g extends m {

    /* renamed from: i, reason: collision with root package name */
    public static final int f17057i = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final m parent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.l<Object, k2> readObserver;

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "Lkotlin/k2;", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<Object, k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ld.l<Object, k2> f17061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ld.l<Object, k2> lVar, ld.l<Object, k2> lVar2) {
            super(1);
            this.f17060b = lVar;
            this.f17061c = lVar2;
        }

        public final void a(@fg.l Object obj) {
            this.f17060b.invoke(obj);
            this.f17061c.invoke(obj);
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Object obj) {
            a(obj);
            return k2.f75408a;
        }
    }

    public g(int i4, @fg.l t tVar, @fg.m ld.l<Object, k2> lVar, @fg.l m mVar) {
        super(i4, tVar, null);
        this.parent = mVar;
        mVar.s(this);
        if (lVar != null) {
            ld.l<Object, k2> k4 = mVar.k();
            if (k4 != null) {
                lVar = new a(lVar, k4);
            }
        } else {
            lVar = mVar.k();
        }
        this.readObserver = lVar;
    }

    @fg.l
    /* renamed from: J, reason: from getter */
    public final m getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public Void s(@fg.l m snapshot) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public Void t(@fg.l m snapshot) {
        throw b.a();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Void v(@fg.l p0 state) {
        v.f0();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.m
    @fg.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public g D(@fg.m ld.l<Object, k2> readObserver) {
        return new g(getId(), getInvalid(), readObserver, this.parent);
    }

    @Override // androidx.compose.runtime.snapshots.m
    public void d() {
        if (getDisposed()) {
            return;
        }
        if (getId() != this.parent.getId()) {
            b();
        }
        this.parent.t(this);
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
        return this.parent.m();
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
    public void u() {
    }
}
