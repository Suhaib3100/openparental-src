package f3;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.x0;
import fg.l;
import fg.m;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SupportSQLiteDatabase.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\tJ\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u001c\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00022\u0010\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001aH&¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u00020#2\u0006\u0010\"\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010+H'¢\u0006\u0004\b-\u0010.J'\u00104\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H&¢\u0006\u0004\b4\u00105J5\u00108\u001a\u0002002\u0006\u0010/\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u00022\u0012\u00107\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aH&¢\u0006\u0004\b8\u00109JE\u0010:\u001a\u0002002\u0006\u0010/\u001a\u00020\u00022\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\b\u00106\u001a\u0004\u0018\u00010\u00022\u0012\u00107\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aH&¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b<\u0010=J)\u0010>\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001aH&¢\u0006\u0004\b>\u0010\u001eJ\u0017\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u000200H&¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u00072\u0006\u0010C\u001a\u00020BH&¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u000200H&¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u0012H'¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0012H&¢\u0006\u0004\bL\u0010\u0014J\u000f\u0010M\u001a\u00020\u0007H'¢\u0006\u0004\bM\u0010\tR\u0014\u0010O\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0014R\u0014\u0010Q\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0014R\u001c\u0010U\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010HR\u0014\u0010X\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u001c\u0010\\\u001a\u00020\u00168&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u0010W\"\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0014R\u0014\u0010_\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0014R\u0016\u0010b\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010d\u001a\u00020\u00128gX¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0014R(\u0010i\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020f\u0018\u00010e8fX¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010k\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006lÀ\u0006\u0001"}, d2 = {"Lf3/d;", "Ljava/io/Closeable;", "", "sql", "Lf3/i;", "i2", "(Ljava/lang/String;)Lf3/i;", "Lkotlin/k2;", "R", "()V", "J0", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "V0", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "l3", "Y0", "G0", "", "m3", "()Z", "P2", "", "sleepAfterYieldDelayMillis", "X1", "(J)Z", "", "", "bindArgs", "F1", "(Ljava/lang/String;[Ljava/lang/Object;)V", "numBytes", "L0", "(J)J", "query", "Landroid/database/Cursor;", "U2", "(Ljava/lang/String;)Landroid/database/Cursor;", "Z1", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lf3/g;", "i1", "(Lf3/g;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "R1", "(Lf3/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", "P", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "F2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "b0", "(Ljava/lang/String;)V", "I0", "newVersion", "f1", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "y3", "(I)V", "enabled", "z2", "(Z)V", "F0", "a0", "X0", "isDbLockedByCurrentThread", "W0", "isExecPerConnectionSQLSupported", "getVersion", "()I", "setVersion", "version", "E2", "()J", "maximumSize", "v", "B3", "(J)V", "pageSize", "v2", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "x3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "Z", "()Ljava/util/List;", "attachedDbs", "e0", "isDatabaseIntegrityOk", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface d extends Closeable {
    void B3(long j4);

    long E2();

    boolean F0();

    default void F1(@l String sql, @m @SuppressLint({"ArrayReturn"}) Object[] bindArgs) {
        l0.p(sql, "sql");
        throw new UnsupportedOperationException();
    }

    int F2(@l String table, int conflictAlgorithm, @l ContentValues values, @m String whereClause, @m Object[] whereArgs);

    void G0();

    void I0(@l String sql, @l Object[] bindArgs) throws SQLException;

    void J0();

    long L0(long numBytes);

    int P(@l String table, @m String whereClause, @m Object[] whereArgs);

    boolean P2();

    void R();

    @l
    @x0(api = 16)
    Cursor R1(@l g query, @m CancellationSignal cancellationSignal);

    @l
    Cursor U2(@l String query);

    void V0(@l SQLiteTransactionListener transactionListener);

    default boolean W0() {
        return false;
    }

    boolean X0();

    boolean X1(long sleepAfterYieldDelayMillis);

    void Y0();

    long Y2(@l String table, int conflictAlgorithm, @l ContentValues values) throws SQLException;

    @m
    List<Pair<String, String>> Z();

    @l
    Cursor Z1(@l String query, @l Object[] bindArgs);

    @x0(api = 16)
    void a0();

    void b0(@l String sql) throws SQLException;

    boolean e0();

    boolean f1(int newVersion);

    @m
    String getPath();

    int getVersion();

    @l
    Cursor i1(@l g query);

    @l
    i i2(@l String sql);

    boolean isOpen();

    void l3(@l SQLiteTransactionListener transactionListener);

    boolean m3();

    void setLocale(@l Locale locale);

    void setVersion(int i4);

    long v();

    boolean v2();

    @x0(api = 16)
    boolean x3();

    void y3(int cacheSize);

    @x0(api = 16)
    void z2(boolean enabled);
}
