package c3;

import androidx.annotation.c1;
import androidx.room.c2;
import androidx.room.m0;
import fg.l;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: ThreadSafeInvalidationObserver.kt */
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016¨\u0006\u0018"}, d2 = {"Lc3/b;", "Landroidx/room/m0$c;", "", "", "tables", "Lkotlin/Function0;", "Lkotlin/k2;", "onInvalidated", "<init>", "([Ljava/lang/String;Lld/a;)V", "", "c", "(Ljava/util/Set;)V", "Landroidx/room/c2;", "db", "e", "(Landroidx/room/c2;)V", "b", "Lld/a;", "d", "()Lld/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "registered", "room-paging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends m0.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.a<k2> onInvalidated;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final AtomicBoolean registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@l String[] tables, @l ld.a<k2> onInvalidated) {
        super(tables);
        l0.p(tables, "tables");
        l0.p(onInvalidated, "onInvalidated");
        this.onInvalidated = onInvalidated;
        this.registered = new AtomicBoolean(false);
    }

    @Override // androidx.room.m0.c
    public void c(@l Set<String> tables) {
        l0.p(tables, "tables");
        this.onInvalidated.invoke();
    }

    @l
    public final ld.a<k2> d() {
        return this.onInvalidated;
    }

    public final void e(@l c2 db2) {
        l0.p(db2, "db");
        if (this.registered.compareAndSet(false, true)) {
            db2.getInvalidationTracker().d(this);
        }
    }
}
