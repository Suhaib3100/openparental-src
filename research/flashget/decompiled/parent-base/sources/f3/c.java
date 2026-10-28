package f3;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.c1;
import androidx.annotation.x0;
import fg.l;
import fg.m;
import java.io.File;
import java.util.List;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SupportSQLiteCompat.kt */
@c1({c1.a.LIBRARY_GROUP})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lf3/c;", "", "<init>", "()V", "a", "b", "c", "d", "e", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJK\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0010\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\rH\u0007¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lf3/c$a;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/k2;", "a", "(Landroid/os/CancellationSignal;)V", "b", "()Landroid/os/CancellationSignal;", "Ljava/io/File;", "file", "", "c", "(Ljava/io/File;)Z", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "selectionArgs", "editTable", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "cursorFactory", "Landroid/database/Cursor;", "f", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "enable", "g", "(Landroid/database/sqlite/SQLiteDatabase;Z)V", "d", "(Landroid/database/sqlite/SQLiteDatabase;)V", "e", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "Landroid/database/sqlite/SQLiteOpenHelper;", "sQLiteOpenHelper", "enabled", "h", "(Landroid/database/sqlite/SQLiteOpenHelper;Z)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP})
    @x0(16)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f73857a = new a();

        private a() {
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final void a(@l CancellationSignal cancellationSignal) {
            l0.p(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final CancellationSignal b() {
            return new CancellationSignal();
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final boolean c(@l File file) {
            l0.p(file, "file");
            return SQLiteDatabase.deleteDatabase(file);
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final void d(@l SQLiteDatabase sQLiteDatabase) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final boolean e(@l SQLiteDatabase sQLiteDatabase) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final Cursor f(@l SQLiteDatabase sQLiteDatabase, @l String sql, @l String[] selectionArgs, @m String editTable, @l CancellationSignal cancellationSignal, @l SQLiteDatabase.CursorFactory cursorFactory) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            l0.p(sql, "sql");
            l0.p(selectionArgs, "selectionArgs");
            l0.p(cancellationSignal, "cancellationSignal");
            l0.p(cursorFactory, "cursorFactory");
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, editTable, cancellationSignal);
            l0.o(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return rawQueryWithFactory;
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final void g(@l SQLiteDatabase sQLiteDatabase, boolean enable) {
            l0.p(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(enable);
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final void h(@l SQLiteOpenHelper sQLiteOpenHelper, boolean enabled) {
            l0.p(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(enabled);
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf3/c$b;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", "a", "(Landroid/database/Cursor;)Landroid/net/Uri;", "Landroid/app/ActivityManager;", "activityManager", "", "b", "(Landroid/app/ActivityManager;)Z", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP})
    @x0(19)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final b f73858a = new b();

        private b() {
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final Uri a(@l Cursor cursor) {
            l0.p(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            l0.o(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final boolean b(@l ActivityManager activityManager) {
            l0.p(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf3/c$c;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "a", "(Landroid/content/Context;)Ljava/io/File;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP})
    @x0(21)
    /* renamed from: f3.c$c, reason: collision with other inner class name */
    public static final class C1020c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final C1020c f73859a = new C1020c();

        private C1020c() {
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final File a(@l Context context) {
            l0.p(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            l0.o(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf3/c$d;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "Lkotlin/k2;", "a", "(Landroid/database/Cursor;Landroid/os/Bundle;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP})
    @x0(23)
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final d f73860a = new d();

        private d() {
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final void a(@l Cursor cursor, @l Bundle extras) {
            l0.p(cursor, "cursor");
            l0.p(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf3/c$e;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "Lkotlin/k2;", "b", "(Landroid/database/Cursor;Landroid/content/ContentResolver;Ljava/util/List;)V", "a", "(Landroid/database/Cursor;)Ljava/util/List;", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP})
    @x0(29)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final e f73861a = new e();

        private e() {
        }

        @l
        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final List<Uri> a(@l Cursor cursor) {
            l0.p(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            l0.m(notificationUris);
            return notificationUris;
        }

        @n
        @c1({c1.a.LIBRARY_GROUP})
        public static final void b(@l Cursor cursor, @l ContentResolver cr, @l List<? extends Uri> uris) {
            l0.p(cursor, "cursor");
            l0.p(cr, "cr");
            l0.p(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }
    }

    private c() {
    }
}
