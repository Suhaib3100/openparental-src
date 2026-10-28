package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0005\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/snapshots/n;", "", "<init>", "()V", "Lkotlin/k2;", "a", "", "b", "()Z", "succeeded", "Landroidx/compose/runtime/snapshots/n$a;", "Landroidx/compose/runtime/snapshots/n$b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17119a = 0;

    /* compiled from: Snapshot.kt */
    @androidx.compose.runtime.internal.u(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/snapshots/n$a;", "Landroidx/compose/runtime/snapshots/n;", "Landroidx/compose/runtime/snapshots/m;", "snapshot", "<init>", "(Landroidx/compose/runtime/snapshots/m;)V", "Lkotlin/k2;", "a", "()V", "b", "Landroidx/compose/runtime/snapshots/m;", "c", "()Landroidx/compose/runtime/snapshots/m;", "", "()Z", "succeeded", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends n {

        /* renamed from: c, reason: collision with root package name */
        public static final int f17120c = 8;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final m snapshot;

        public a(@fg.l m mVar) {
            super(null);
            this.snapshot = mVar;
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void a() {
            this.snapshot.d();
            throw new SnapshotApplyConflictException(this.snapshot);
        }

        @Override // androidx.compose.runtime.snapshots.n
        public boolean b() {
            return false;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final m getSnapshot() {
            return this.snapshot;
        }
    }

    /* compiled from: Snapshot.kt */
    @androidx.compose.runtime.internal.u(parameters = 1)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/snapshots/n$b;", "Landroidx/compose/runtime/snapshots/n;", "<init>", "()V", "Lkotlin/k2;", "a", "", "b", "()Z", "succeeded", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends n {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final b f17122b = new b(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f17123c = 0;

        private b() {
            super(null);
        }

        @Override // androidx.compose.runtime.snapshots.n
        public void a() {
        }

        @Override // androidx.compose.runtime.snapshots.n
        public boolean b() {
            return true;
        }
    }

    public /* synthetic */ n(kotlin.jvm.internal.w wVar) {
        this();
    }

    public abstract void a();

    public abstract boolean b();

    private n() {
    }
}
