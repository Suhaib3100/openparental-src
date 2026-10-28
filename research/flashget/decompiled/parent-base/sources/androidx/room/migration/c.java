package androidx.room.migration;

import fg.l;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: MigrationExt.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/migration/c;", "Landroidx/room/migration/b;", "", "startVersion", "endVersion", "Lkotlin/Function1;", "Lf3/d;", "Lkotlin/k2;", "migrateCallback", "<init>", "(IILld/l;)V", "db", "migrate", "(Lf3/d;)V", "a", "Lld/l;", "()Lld/l;", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class c extends b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<f3.d, k2> migrateCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i4, int i5, @l ld.l<? super f3.d, k2> lVar) {
        super(i4, i5);
        this.migrateCallback = lVar;
    }

    @l
    public final ld.l<f3.d, k2> a() {
        return this.migrateCallback;
    }

    @Override // androidx.room.migration.b
    public void migrate(@l f3.d db2) {
        this.migrateCallback.invoke(db2);
    }
}
