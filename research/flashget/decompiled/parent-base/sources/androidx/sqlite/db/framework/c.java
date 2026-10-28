package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.u;
import androidx.annotation.x0;
import f3.c;
import fg.l;
import fg.m;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import ld.r;

/* compiled from: FrameworkSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 T2\u00020\u0001:\u0002xVB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010$\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010#\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"\u0018\u00010!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J)\u0010*\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00062\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0!H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020'2\u0006\u0010&\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020'2\u0006\u0010&\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010/H\u0017¢\u0006\u0004\b1\u00102J'\u00108\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J5\u0010<\u001a\u0002042\u0006\u00103\u001a\u00020\u00062\b\u0010:\u001a\u0004\u0018\u00010\u00062\u0012\u0010;\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"\u0018\u00010!H\u0016¢\u0006\u0004\b<\u0010=JE\u0010>\u001a\u0002042\u0006\u00103\u001a\u00020\u00062\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\b\u0010:\u001a\u0004\u0018\u00010\u00062\u0012\u0010;\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"\u0018\u00010!H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010AJ)\u0010B\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010#\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\"0!H\u0016¢\u0006\u0004\bB\u0010%J\u0017\u0010D\u001a\u00020\u00162\u0006\u0010C\u001a\u000204H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u000204H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020\u0016H\u0017¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0016H\u0016¢\u0006\u0004\bP\u0010\u0018J\u000f\u0010Q\u001a\u00020\u000bH\u0017¢\u0006\u0004\bQ\u0010\rJ\u000f\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010\rJ\u0015\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020\u0002¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010\u0018R$\u0010^\u001a\u0002042\u0006\u0010Z\u001a\u0002048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010LR$\u0010c\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010e\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u0018R$\u0010h\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bf\u0010`\"\u0004\bg\u0010bR\u0014\u0010j\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0018R\u0014\u0010k\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0018R\u0016\u0010n\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0018R(\u0010u\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060r\u0018\u00010q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010w\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u0018¨\u0006y"}, d2 = {"Landroidx/sqlite/db/framework/c;", "Lf3/d;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "sql", "Lf3/i;", "i2", "(Ljava/lang/String;)Lf3/i;", "Lkotlin/k2;", "R", "()V", "J0", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "V0", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "l3", "Y0", "G0", "", "m3", "()Z", "P2", "", "sleepAfterYieldDelayMillis", "X1", "(J)Z", "numBytes", "L0", "(J)J", "", "", "bindArgs", "F1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "query", "Landroid/database/Cursor;", "U2", "(Ljava/lang/String;)Landroid/database/Cursor;", "Z1", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lf3/g;", "i1", "(Lf3/g;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "R1", "(Lf3/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", "P", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "F2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "b0", "(Ljava/lang/String;)V", "I0", "newVersion", "f1", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "y3", "(I)V", "enabled", "z2", "(Z)V", "F0", "a0", "close", "sqLiteDatabase", "c", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "b", "Landroid/database/sqlite/SQLiteDatabase;", "X0", "isDbLockedByCurrentThread", "value", "getVersion", "()I", "setVersion", "version", "E2", "()J", "f", "(J)V", "maximumSize", "W0", "isExecPerConnectionSQLSupported", "v", "B3", "pageSize", "v2", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "x3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "Z", "()Ljava/util/List;", "attachedDbs", "e0", "isDatabaseIntegrityOk", "a", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFrameworkSQLiteDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteDatabase.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteDatabase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,336:1\n1#2:337\n*E\n"})
/* loaded from: classes3.dex */
public final class c implements f3.d {

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final String[] f34080d = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final String[] f34081e = new String[0];

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final SQLiteDatabase delegate;

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/framework/c$a;", "", "<init>", "()V", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "bindArgs", "Lkotlin/k2;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(30)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f34083a = new a();

        private a() {
        }

        @u
        public final void a(@l SQLiteDatabase sQLiteDatabase, @l String sql, @m Object[] bindArgs) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            l0.p(sql, "sql");
            sQLiteDatabase.execPerConnectionSQL(sql, bindArgs);
        }
    }

    /* compiled from: FrameworkSQLiteDatabase.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteCursorDriver;", "masterQuery", "", "editTable", "Landroid/database/sqlite/SQLiteQuery;", "sqLiteQuery", "Landroid/database/sqlite/SQLiteCursor;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/sqlite/SQLiteCursor;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.sqlite.db.framework.c$c, reason: collision with other inner class name */
    static final class C0623c extends n0 implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f3.g f34084b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0623c(f3.g gVar) {
            super(4);
            this.f34084b = gVar;
        }

        @Override // ld.r
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor i(@m SQLiteDatabase sQLiteDatabase, @m SQLiteCursorDriver sQLiteCursorDriver, @m String str, @m SQLiteQuery sQLiteQuery) {
            f3.g gVar = this.f34084b;
            l0.m(sQLiteQuery);
            gVar.c(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(@l SQLiteDatabase delegate) {
        l0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor d(r tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l0.p(tmp0, "$tmp0");
        return (Cursor) tmp0.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(f3.g query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l0.p(query, "$query");
        l0.m(sQLiteQuery);
        query.c(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // f3.d
    public void B3(long j4) {
        this.delegate.setPageSize(j4);
    }

    @Override // f3.d
    public long E2() {
        return this.delegate.getMaximumSize();
    }

    @Override // f3.d
    public boolean F0() {
        return this.delegate.enableWriteAheadLogging();
    }

    @Override // f3.d
    public void F1(@l String sql, @m Object[] bindArgs) {
        l0.p(sql, "sql");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            throw new UnsupportedOperationException(android.support.v4.media.a.a("execPerConnectionSQL is not supported on a SDK version lower than 30, current version is: ", i4));
        }
        a.f34083a.a(this.delegate, sql, bindArgs);
    }

    @Override // f3.d
    public int F2(@l String table, int conflictAlgorithm, @l ContentValues values, @m String whereClause, @m Object[] whereArgs) {
        l0.p(table, "table");
        l0.p(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = whereArgs == null ? size : whereArgs.length + size;
        Object[] objArr = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f34080d[conflictAlgorithm]);
        sb.append(table);
        sb.append(" SET ");
        int i4 = 0;
        for (String str : values.keySet()) {
            sb.append(i4 > 0 ? "," : "");
            sb.append(str);
            objArr[i4] = values.get(str);
            sb.append("=?");
            i4++;
        }
        if (whereArgs != null) {
            for (int i5 = size; i5 < length; i5++) {
                objArr[i5] = whereArgs[i5 - size];
            }
        }
        if (!TextUtils.isEmpty(whereClause)) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        f3.i i22 = i2(sb2);
        f3.b.INSTANCE.b(i22, objArr);
        return i22.h0();
    }

    @Override // f3.d
    public void G0() {
        this.delegate.setTransactionSuccessful();
    }

    @Override // f3.d
    public void I0(@l String sql, @l Object[] bindArgs) throws SQLException {
        l0.p(sql, "sql");
        l0.p(bindArgs, "bindArgs");
        this.delegate.execSQL(sql, bindArgs);
    }

    @Override // f3.d
    public void J0() {
        this.delegate.beginTransactionNonExclusive();
    }

    @Override // f3.d
    public long L0(long numBytes) {
        this.delegate.setMaximumSize(numBytes);
        return this.delegate.getMaximumSize();
    }

    @Override // f3.d
    public int P(@l String table, @m String whereClause, @m Object[] whereArgs) {
        l0.p(table, "table");
        StringBuilder sb = new StringBuilder("DELETE FROM ");
        sb.append(table);
        if (whereClause != null && whereClause.length() != 0) {
            sb.append(" WHERE ");
            sb.append(whereClause);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        f3.i i22 = i2(sb2);
        f3.b.INSTANCE.b(i22, whereArgs);
        return i22.h0();
    }

    @Override // f3.d
    public boolean P2() {
        return this.delegate.yieldIfContendedSafely();
    }

    @Override // f3.d
    public void R() {
        this.delegate.beginTransaction();
    }

    @Override // f3.d
    @l
    @x0(16)
    public Cursor R1(@l final f3.g query, @m CancellationSignal cancellationSignal) {
        l0.p(query, "query");
        SQLiteDatabase sQLiteDatabase = this.delegate;
        String query2 = query.getQuery();
        String[] strArr = f34081e;
        l0.m(cancellationSignal);
        return c.a.f(sQLiteDatabase, query2, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor e4;
                e4 = c.e(f3.g.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return e4;
            }
        });
    }

    @Override // f3.d
    @l
    public Cursor U2(@l String query) {
        l0.p(query, "query");
        return i1(new f3.b(query));
    }

    @Override // f3.d
    public void V0(@l SQLiteTransactionListener transactionListener) {
        l0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListener(transactionListener);
    }

    @Override // f3.d
    public boolean W0() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Override // f3.d
    public boolean X0() {
        return this.delegate.isDbLockedByCurrentThread();
    }

    @Override // f3.d
    public boolean X1(long sleepAfterYieldDelayMillis) {
        return this.delegate.yieldIfContendedSafely(sleepAfterYieldDelayMillis);
    }

    @Override // f3.d
    public void Y0() {
        this.delegate.endTransaction();
    }

    @Override // f3.d
    public long Y2(@l String table, int conflictAlgorithm, @l ContentValues values) throws SQLException {
        l0.p(table, "table");
        l0.p(values, "values");
        return this.delegate.insertWithOnConflict(table, null, values, conflictAlgorithm);
    }

    @Override // f3.d
    @m
    public List<Pair<String, String>> Z() {
        return this.delegate.getAttachedDbs();
    }

    @Override // f3.d
    @l
    public Cursor Z1(@l String query, @l Object[] bindArgs) {
        l0.p(query, "query");
        l0.p(bindArgs, "bindArgs");
        return i1(new f3.b(query, bindArgs));
    }

    @Override // f3.d
    @x0(api = 16)
    public void a0() {
        c.a.d(this.delegate);
    }

    @Override // f3.d
    public void b0(@l String sql) throws SQLException {
        l0.p(sql, "sql");
        this.delegate.execSQL(sql);
    }

    public final boolean c(@l SQLiteDatabase sqLiteDatabase) {
        l0.p(sqLiteDatabase, "sqLiteDatabase");
        return l0.g(this.delegate, sqLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // f3.d
    public boolean e0() {
        return this.delegate.isDatabaseIntegrityOk();
    }

    public void f(long j4) {
        this.delegate.setMaximumSize(j4);
    }

    @Override // f3.d
    public boolean f1(int newVersion) {
        return this.delegate.needUpgrade(newVersion);
    }

    @Override // f3.d
    @m
    public String getPath() {
        return this.delegate.getPath();
    }

    @Override // f3.d
    public int getVersion() {
        return this.delegate.getVersion();
    }

    @Override // f3.d
    @l
    public Cursor i1(@l f3.g query) {
        l0.p(query, "query");
        final C0623c c0623c = new C0623c(query);
        Cursor rawQueryWithFactory = this.delegate.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor d5;
                d5 = c.d(r.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return d5;
            }
        }, query.getQuery(), f34081e, null);
        l0.o(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // f3.d
    @l
    public f3.i i2(@l String sql) {
        l0.p(sql, "sql");
        SQLiteStatement compileStatement = this.delegate.compileStatement(sql);
        l0.o(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    @Override // f3.d
    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    @Override // f3.d
    public void l3(@l SQLiteTransactionListener transactionListener) {
        l0.p(transactionListener, "transactionListener");
        this.delegate.beginTransactionWithListenerNonExclusive(transactionListener);
    }

    @Override // f3.d
    public boolean m3() {
        return this.delegate.inTransaction();
    }

    @Override // f3.d
    public void setLocale(@l Locale locale) {
        l0.p(locale, "locale");
        this.delegate.setLocale(locale);
    }

    @Override // f3.d
    public void setVersion(int i4) {
        this.delegate.setVersion(i4);
    }

    @Override // f3.d
    public long v() {
        return this.delegate.getPageSize();
    }

    @Override // f3.d
    public boolean v2() {
        return this.delegate.isReadOnly();
    }

    @Override // f3.d
    @x0(api = 16)
    public boolean x3() {
        return c.a.e(this.delegate);
    }

    @Override // f3.d
    public void y3(int cacheSize) {
        this.delegate.setMaxSqlCacheSize(cacheSize);
    }

    @Override // f3.d
    @x0(api = 16)
    public void z2(boolean enabled) {
        c.a.g(this.delegate, enabled);
    }
}
