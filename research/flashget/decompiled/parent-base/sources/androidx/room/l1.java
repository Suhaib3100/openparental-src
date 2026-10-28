package androidx.room;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.room.c2;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: QueryInterceptorDatabase.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tH\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\f2\u0014\b\u0001\u0010\u001a\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0018J(\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u0016H\u0097\u0001¢\u0006\u0004\b(\u0010)J\u0018\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0018\u00102\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b2\u00103JF\u00104\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0096\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b6\u0010\u0018J\u0018\u00108\u001a\u00020\u00162\u0006\u00107\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\tH\u0016¢\u0006\u0004\b=\u0010\u000bJ\u000f\u0010>\u001a\u00020\tH\u0016¢\u0006\u0004\b>\u0010\u000bJ\u0017\u0010A\u001a\u00020\t2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\t2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bC\u0010BJ\u000f\u0010D\u001a\u00020\tH\u0016¢\u0006\u0004\bD\u0010\u000bJ\u000f\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u0010\u000bJ\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010IJ)\u0010J\u001a\u00020G2\u0006\u0010F\u001a\u00020\f2\u0010\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000fH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020G2\u0006\u0010F\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ!\u0010Q\u001a\u00020G2\u0006\u0010F\u001a\u00020L2\b\u0010P\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010TJ)\u0010U\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\f2\u0010\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000fH\u0016¢\u0006\u0004\bU\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R(\u0010`\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0]\u0018\u00010\\8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\ba\u0010\u0018R\u0014\u0010d\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bc\u0010\u0018R\u0014\u0010f\u001a\u00020\u00168VX\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010\u0018R\u0014\u0010g\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bg\u0010\u0018R\u0014\u0010i\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010\u0018R\u0014\u0010k\u001a\u00020\u00168WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bj\u0010\u0018R\u0014\u0010n\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001c\u0010r\u001a\u00020!8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bo\u0010m\"\u0004\bp\u0010qR\u0016\u0010u\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001c\u0010y\u001a\u00020\u00128\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\bv\u0010w\"\u0004\bx\u00100¨\u0006z"}, d2 = {"Landroidx/room/l1;", "Lf3/d;", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/c2$g;", "queryCallback", "<init>", "(Lf3/d;Ljava/util/concurrent/Executor;Landroidx/room/c2$g;)V", "Lkotlin/k2;", "close", "()V", "", "table", "whereClause", "", "", "whereArgs", "", "P", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "a0", "", "F0", "()Z", "sql", "bindArgs", "F1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "m3", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "newVersion", "f1", "(I)Z", "enabled", "z2", "(Z)V", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "y3", "(I)V", "numBytes", "L0", "(J)J", "F2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "P2", "sleepAfterYieldDelayMillis", "X1", "(J)Z", "Lf3/i;", "i2", "(Ljava/lang/String;)Lf3/i;", "R", "J0", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "V0", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "l3", "Y0", "G0", "query", "Landroid/database/Cursor;", "U2", "(Ljava/lang/String;)Landroid/database/Cursor;", "Z1", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lf3/g;", "i1", "(Lf3/g;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "R1", "(Lf3/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "b0", "(Ljava/lang/String;)V", "I0", "b", "Lf3/d;", "c", "Ljava/util/concurrent/Executor;", "d", "Landroidx/room/c2$g;", "", "Landroid/util/Pair;", "Z", "()Ljava/util/List;", "attachedDbs", "e0", "isDatabaseIntegrityOk", "X0", "isDbLockedByCurrentThread", "W0", "isExecPerConnectionSQLSupported", "isOpen", "v2", "isReadOnly", "x3", "isWriteAheadLoggingEnabled", "E2", "()J", "maximumSize", "v", "B3", "(J)V", "pageSize", "getPath", "()Ljava/lang/String;", "path", "getVersion", "()I", "setVersion", "version", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nQueryInterceptorDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,146:1\n1#2:147\n37#3,2:148\n*S KotlinDebug\n*F\n+ 1 QueryInterceptorDatabase.kt\nandroidx/room/QueryInterceptorDatabase\n*L\n143#1:148,2\n*E\n"})
/* loaded from: classes3.dex */
public final class l1 implements f3.d {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f3.d delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Executor queryCallbackExecutor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2.g queryCallback;

    public l1(@fg.l f3.d delegate, @fg.l Executor queryCallbackExecutor, @fg.l c2.g queryCallback) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        kotlin.jvm.internal.l0.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.l0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(l1 this$0, f3.g query, o1 queryInterceptorProgram) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(query, "$query");
        kotlin.jvm.internal.l0.p(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.a(query.getQuery(), queryInterceptorProgram.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(l1 this$0, f3.g query, o1 queryInterceptorProgram) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(query, "$query");
        kotlin.jvm.internal.l0.p(queryInterceptorProgram, "$queryInterceptorProgram");
        this$0.queryCallback.a(query.getQuery(), queryInterceptorProgram.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(l1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a("TRANSACTION SUCCESSFUL", kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN EXCLUSIVE TRANSACTION", kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN DEFERRED TRANSACTION", kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(l1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN EXCLUSIVE TRANSACTION", kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(l1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a("BEGIN DEFERRED TRANSACTION", kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(l1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a("END TRANSACTION", kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(l1 this$0, String sql) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(sql, "$sql");
        this$0.queryCallback.a(sql, kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(l1 this$0, String sql, List inputArguments) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(sql, "$sql");
        kotlin.jvm.internal.l0.p(inputArguments, "$inputArguments");
        this$0.queryCallback.a(sql, inputArguments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(l1 this$0, String query) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(query, "$query");
        this$0.queryCallback.a(query, kotlin.collections.j0.f74919b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(l1 this$0, String query, Object[] bindArgs) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        kotlin.jvm.internal.l0.p(query, "$query");
        kotlin.jvm.internal.l0.p(bindArgs, "$bindArgs");
        this$0.queryCallback.a(query, kotlin.collections.l.Ky(bindArgs));
    }

    @Override // f3.d
    public void B3(long j4) {
        this.delegate.B3(j4);
    }

    @Override // f3.d
    public long E2() {
        return this.delegate.E2();
    }

    @Override // f3.d
    public boolean F0() {
        return this.delegate.F0();
    }

    @Override // f3.d
    public void F1(@fg.l String sql, @fg.m @SuppressLint({"ArrayReturn"}) Object[] bindArgs) {
        kotlin.jvm.internal.l0.p(sql, "sql");
        this.delegate.F1(sql, bindArgs);
    }

    @Override // f3.d
    public int F2(@fg.l String table, int conflictAlgorithm, @fg.l ContentValues values, @fg.m String whereClause, @fg.m Object[] whereArgs) {
        kotlin.jvm.internal.l0.p(table, "table");
        kotlin.jvm.internal.l0.p(values, "values");
        return this.delegate.F2(table, conflictAlgorithm, values, whereClause, whereArgs);
    }

    @Override // f3.d
    public void G0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.f1
            @Override // java.lang.Runnable
            public final void run() {
                l1.D(l1.this);
            }
        });
        this.delegate.G0();
    }

    @Override // f3.d
    public void I0(@fg.l final String sql, @fg.l Object[] bindArgs) {
        kotlin.jvm.internal.l0.p(sql, "sql");
        kotlin.jvm.internal.l0.p(bindArgs, "bindArgs");
        kotlin.collections.builders.b bVar = new kotlin.collections.builders.b();
        kotlin.collections.w.s0(bVar, bindArgs);
        final List a5 = kotlin.collections.w.a(bVar);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.h1
            @Override // java.lang.Runnable
            public final void run() {
                l1.x(l1.this, sql, a5);
            }
        });
        this.delegate.I0(sql, a5.toArray(new Object[0]));
    }

    @Override // f3.d
    public void J0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.g1
            @Override // java.lang.Runnable
            public final void run() {
                l1.o(l1.this);
            }
        });
        this.delegate.J0();
    }

    @Override // f3.d
    public long L0(long numBytes) {
        return this.delegate.L0(numBytes);
    }

    @Override // f3.d
    public int P(@fg.l String table, @fg.m String whereClause, @fg.m Object[] whereArgs) {
        kotlin.jvm.internal.l0.p(table, "table");
        return this.delegate.P(table, whereClause, whereArgs);
    }

    @Override // f3.d
    public boolean P2() {
        return this.delegate.P2();
    }

    @Override // f3.d
    public void R() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.e1
            @Override // java.lang.Runnable
            public final void run() {
                l1.n(l1.this);
            }
        });
        this.delegate.R();
    }

    @Override // f3.d
    @fg.l
    public Cursor R1(@fg.l final f3.g query, @fg.m CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.l0.p(query, "query");
        final o1 o1Var = new o1();
        query.c(o1Var);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.k1
            @Override // java.lang.Runnable
            public final void run() {
                l1.C(l1.this, query, o1Var);
            }
        });
        return this.delegate.i1(query);
    }

    @Override // f3.d
    @fg.l
    public Cursor U2(@fg.l final String query) {
        kotlin.jvm.internal.l0.p(query, "query");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.b1
            @Override // java.lang.Runnable
            public final void run() {
                l1.y(l1.this, query);
            }
        });
        return this.delegate.U2(query);
    }

    @Override // f3.d
    public void V0(@fg.l SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.l0.p(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.j1
            @Override // java.lang.Runnable
            public final void run() {
                l1.q(l1.this);
            }
        });
        this.delegate.V0(transactionListener);
    }

    @Override // f3.d
    public boolean W0() {
        return this.delegate.W0();
    }

    @Override // f3.d
    public boolean X0() {
        return this.delegate.X0();
    }

    @Override // f3.d
    public boolean X1(long sleepAfterYieldDelayMillis) {
        return this.delegate.X1(sleepAfterYieldDelayMillis);
    }

    @Override // f3.d
    public void Y0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.z0
            @Override // java.lang.Runnable
            public final void run() {
                l1.t(l1.this);
            }
        });
        this.delegate.Y0();
    }

    @Override // f3.d
    public long Y2(@fg.l String table, int conflictAlgorithm, @fg.l ContentValues values) {
        kotlin.jvm.internal.l0.p(table, "table");
        kotlin.jvm.internal.l0.p(values, "values");
        return this.delegate.Y2(table, conflictAlgorithm, values);
    }

    @Override // f3.d
    @fg.m
    public List<Pair<String, String>> Z() {
        return this.delegate.Z();
    }

    @Override // f3.d
    @fg.l
    public Cursor Z1(@fg.l final String query, @fg.l final Object[] bindArgs) {
        kotlin.jvm.internal.l0.p(query, "query");
        kotlin.jvm.internal.l0.p(bindArgs, "bindArgs");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.c1
            @Override // java.lang.Runnable
            public final void run() {
                l1.z(l1.this, query, bindArgs);
            }
        });
        return this.delegate.Z1(query, bindArgs);
    }

    @Override // f3.d
    @androidx.annotation.x0(api = 16)
    public void a0() {
        this.delegate.a0();
    }

    @Override // f3.d
    public void b0(@fg.l final String sql) {
        kotlin.jvm.internal.l0.p(sql, "sql");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.d1
            @Override // java.lang.Runnable
            public final void run() {
                l1.u(l1.this, sql);
            }
        });
        this.delegate.b0(sql);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // f3.d
    public boolean e0() {
        return this.delegate.e0();
    }

    @Override // f3.d
    public boolean f1(int newVersion) {
        return this.delegate.f1(newVersion);
    }

    @Override // f3.d
    @fg.m
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // f3.d
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // f3.d
    @fg.l
    public Cursor i1(@fg.l final f3.g query) {
        kotlin.jvm.internal.l0.p(query, "query");
        final o1 o1Var = new o1();
        query.c(o1Var);
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.i1
            @Override // java.lang.Runnable
            public final void run() {
                l1.B(l1.this, query, o1Var);
            }
        });
        return this.delegate.i1(query);
    }

    @Override // f3.d
    @fg.l
    public f3.i i2(@fg.l String sql) {
        kotlin.jvm.internal.l0.p(sql, "sql");
        return new u1(this.delegate.i2(sql), sql, this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // f3.d
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // f3.d
    public void l3(@fg.l SQLiteTransactionListener transactionListener) {
        kotlin.jvm.internal.l0.p(transactionListener, "transactionListener");
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.a1
            @Override // java.lang.Runnable
            public final void run() {
                l1.s(l1.this);
            }
        });
        this.delegate.l3(transactionListener);
    }

    @Override // f3.d
    public boolean m3() {
        return this.delegate.m3();
    }

    @Override // f3.d
    public void setLocale(@fg.l Locale locale) {
        kotlin.jvm.internal.l0.p(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // f3.d
    public void setVersion(int i4) {
        this.delegate.setVersion(i4);
    }

    @Override // f3.d
    public long v() {
        return this.delegate.v();
    }

    @Override // f3.d
    public boolean v2() {
        return this.delegate.v2();
    }

    @Override // f3.d
    @androidx.annotation.x0(api = 16)
    public boolean x3() {
        return this.delegate.x3();
    }

    @Override // f3.d
    public void y3(int cacheSize) {
        this.delegate.y3(cacheSize);
    }

    @Override // f3.d
    @androidx.annotation.x0(api = 16)
    public void z2(boolean enabled) {
        this.delegate.z2(enabled);
    }
}
