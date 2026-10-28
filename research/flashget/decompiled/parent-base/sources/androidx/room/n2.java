package androidx.room;

import androidx.annotation.c1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: SharedSQLiteStatement.kt */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, d2 = {"Landroidx/room/n2;", "", "Landroidx/room/c2;", "database", "<init>", "(Landroidx/room/c2;)V", "Lf3/i;", "createNewStatement", "()Lf3/i;", "", "canUseCached", "getStmt", "(Z)Lf3/i;", "", "createQuery", "()Ljava/lang/String;", "Lkotlin/k2;", "assertNotMainThread", "()V", "acquire", "statement", "release", "(Lf3/i;)V", "Landroidx/room/c2;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stmt$delegate", "Lkotlin/b0;", "stmt", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class n2 {

    @fg.l
    private final c2 database;

    @fg.l
    private final AtomicBoolean lock;

    /* renamed from: stmt$delegate, reason: from kotlin metadata */
    @fg.l
    private final kotlin.b0 stmt;

    /* compiled from: SharedSQLiteStatement.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf3/i;", "a", "()Lf3/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.a<f3.i> {
        a() {
            super(0);
        }

        @fg.l
        public final f3.i a() {
            return n2.this.createNewStatement();
        }

        @Override // ld.a
        public f3.i invoke() {
            return n2.this.createNewStatement();
        }
    }

    public n2(@fg.l c2 database) {
        kotlin.jvm.internal.l0.p(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        this.stmt = kotlin.c0.c(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f3.i createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final f3.i getStmt() {
        return (f3.i) this.stmt.getValue();
    }

    @fg.l
    public f3.i acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    @fg.l
    protected abstract String createQuery();

    public void release(@fg.l f3.i statement) {
        kotlin.jvm.internal.l0.p(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final f3.i getStmt(boolean canUseCached) {
        return canUseCached ? getStmt() : createNewStatement();
    }
}
