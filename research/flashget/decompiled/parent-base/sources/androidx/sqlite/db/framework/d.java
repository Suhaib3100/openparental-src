package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.x0;
import androidx.sqlite.db.framework.d;
import f3.c;
import f3.e;
import fg.l;
import fg.m;
import java.io.File;
import java.util.UUID;
import kd.j;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 02\u00020\u0001:\u00031\u0013\u0015B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001b\u0010&\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u001e\u0010#*\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,¨\u00062"}, d2 = {"Landroidx/sqlite/db/framework/d;", "Lf3/e;", "Landroid/content/Context;", "context", "", "name", "Lf3/e$a;", "callback", "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$a;ZZ)V", "enabled", "Lkotlin/k2;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "b", "Landroid/content/Context;", "c", "Ljava/lang/String;", "d", "Lf3/e$a;", "e", "Z", "f", "Lkotlin/b0;", "Landroidx/sqlite/db/framework/d$c;", "g", "Lkotlin/b0;", "lazyDelegate", "h", "writeAheadLoggingEnabled", "()Landroidx/sqlite/db/framework/d$c;", "getDelegate$delegate", "(Landroidx/sqlite/db/framework/d;)Ljava/lang/Object;", "delegate", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lf3/d;", "O2", "()Lf3/d;", "writableDatabase", "K2", "readableDatabase", "i", "a", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements f3.e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @m
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final e.a callback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean useNoBackupDirectory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean allowDataLossOnRecovery;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @l
    private final b0<c> lazyDelegate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean writeAheadLoggingEnabled;

    /* renamed from: j, reason: collision with root package name */
    @l
    private static final String f34086j = "SupportSQLite";

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/sqlite/db/framework/d$b;", "", "Landroidx/sqlite/db/framework/c;", "db", "<init>", "(Landroidx/sqlite/db/framework/c;)V", "a", "Landroidx/sqlite/db/framework/c;", "()Landroidx/sqlite/db/framework/c;", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @m
        private androidx.sqlite.db.framework.c db;

        public b(@m androidx.sqlite.db.framework.c cVar) {
            this.db = cVar;
        }

        @m
        /* renamed from: a, reason: from getter */
        public final androidx.sqlite.db.framework.c getDb() {
            return this.db;
        }

        public final void b(@m androidx.sqlite.db.framework.c cVar) {
            this.db = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0003:(,B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001cJ'\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b,\u00104R\u0016\u00105\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00103R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R\u0016\u00109\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103¨\u0006;"}, d2 = {"Landroidx/sqlite/db/framework/d$c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "Landroidx/sqlite/db/framework/d$b;", "dbRef", "Lf3/e$a;", "callback", "", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/framework/d$b;Lf3/e$a;Z)V", "writable", "Landroid/database/sqlite/SQLiteDatabase;", "k", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "i", "Lf3/d;", "g", "(Z)Lf3/d;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/c;", "h", "(Landroid/database/sqlite/SQLiteDatabase;)Landroidx/sqlite/db/framework/c;", "Lkotlin/k2;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "db", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "b", "Landroid/content/Context;", "e", "()Landroid/content/Context;", "c", "Landroidx/sqlite/db/framework/d$b;", "f", "()Landroidx/sqlite/db/framework/d$b;", "d", "Lf3/e$a;", "()Lf3/e$a;", "Z", "()Z", "migrated", "Lg3/a;", "Lg3/a;", "lock", "opened", "a", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c extends SQLiteOpenHelper {

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final Context context;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        private final b dbRef;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final e.a callback;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean allowDataLossOnRecovery;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean migrated;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @l
        private final g3.a lock;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean opened;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/sqlite/db/framework/d$c$a;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/sqlite/db/framework/d$c$b;", "callbackName", "", "cause", "<init>", "(Landroidx/sqlite/db/framework/d$c$b;Ljava/lang/Throwable;)V", "b", "Landroidx/sqlite/db/framework/d$c$b;", "a", "()Landroidx/sqlite/db/framework/d$c$b;", "c", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class a extends RuntimeException {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @l
            private final b callbackName;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @l
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@l b callbackName, @l Throwable cause) {
                super(cause);
                l0.p(callbackName, "callbackName");
                l0.p(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }

            @l
            /* renamed from: a, reason: from getter */
            public final b getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            @l
            public Throwable getCause() {
                return this.cause;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/framework/d$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/db/framework/d$c$c;", "", "<init>", "()V", "Landroidx/sqlite/db/framework/d$b;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/c;", "a", "(Landroidx/sqlite/db/framework/d$b;Landroid/database/sqlite/SQLiteDatabase;)Landroidx/sqlite/db/framework/c;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nFrameworkSQLiteOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameworkSQLiteOpenHelper.kt\nandroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
        /* renamed from: androidx.sqlite.db.framework.d$c$c, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @l
            public final androidx.sqlite.db.framework.c a(@l b refHolder, @l SQLiteDatabase sqLiteDatabase) {
                l0.p(refHolder, "refHolder");
                l0.p(sqLiteDatabase, "sqLiteDatabase");
                androidx.sqlite.db.framework.c db2 = refHolder.getDb();
                if (db2 != null && db2.c(sqLiteDatabase)) {
                    return db2;
                }
                androidx.sqlite.db.framework.c cVar = new androidx.sqlite.db.framework.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            public Companion(w wVar) {
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.sqlite.db.framework.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0625d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34105a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f34105a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@l Context context, @m String str, @l final b dbRef, @l final e.a callback, boolean z4) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.b(e.a.this, dbRef, sQLiteDatabase);
                }
            });
            l0.p(context, "context");
            l0.p(dbRef, "dbRef");
            l0.p(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z4;
            if (str == null) {
                str = UUID.randomUUID().toString();
                l0.o(str, "randomUUID().toString()");
            }
            this.lock = new g3.a(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e.a callback, b dbRef, SQLiteDatabase dbObj) {
            l0.p(callback, "$callback");
            l0.p(dbRef, "$dbRef");
            Companion companion = INSTANCE;
            l0.o(dbObj, "dbObj");
            callback.c(companion.a(dbRef, dbObj));
        }

        private final SQLiteDatabase i(boolean writable) {
            if (writable) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                l0.o(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            l0.o(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase k(boolean writable) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z4 = this.opened;
            if (databaseName != null && !z4 && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    parentFile.toString();
                }
            }
            try {
                return i(writable);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return i(writable);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i4 = C0625d.f34105a[aVar.getCallbackName().ordinal()];
                        if (i4 == 1) {
                            throw cause;
                        }
                        if (i4 == 2) {
                            throw cause;
                        }
                        if (i4 == 3) {
                            throw cause;
                        }
                        if (i4 == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                        if (databaseName == null || !this.allowDataLossOnRecovery) {
                            throw th;
                        }
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return i(writable);
                    } catch (a e4) {
                        throw e4.getCause();
                    }
                }
            }
        }

        /* renamed from: c, reason: from getter */
        public final boolean getAllowDataLossOnRecovery() {
            return this.allowDataLossOnRecovery;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                g3.a.c(this.lock, false, 1, null);
                super.close();
                this.dbRef.b(null);
                this.opened = false;
            } finally {
                this.lock.d();
            }
        }

        @l
        /* renamed from: d, reason: from getter */
        public final e.a getCallback() {
            return this.callback;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final b getDbRef() {
            return this.dbRef;
        }

        @l
        public final f3.d g(boolean writable) {
            try {
                this.lock.b((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase k4 = k(writable);
                if (!this.migrated) {
                    androidx.sqlite.db.framework.c h4 = h(k4);
                    this.lock.d();
                    return h4;
                }
                close();
                f3.d g4 = g(writable);
                this.lock.d();
                return g4;
            } catch (Throwable th) {
                this.lock.d();
                throw th;
            }
        }

        @l
        public final androidx.sqlite.db.framework.c h(@l SQLiteDatabase sqLiteDatabase) {
            l0.p(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.a(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@l SQLiteDatabase db2) {
            l0.p(db2, "db");
            if (!this.migrated && this.callback.version != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.b(h(db2));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@l SQLiteDatabase sqLiteDatabase) {
            l0.p(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.d(h(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(@l SQLiteDatabase db2, int oldVersion, int newVersion) {
            l0.p(db2, "db");
            this.migrated = true;
            try {
                this.callback.e(h(db2), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(@l SQLiteDatabase db2) {
            l0.p(db2, "db");
            if (!this.migrated) {
                try {
                    this.callback.f(h(db2));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@l SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            l0.p(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.g(h(sqLiteDatabase), oldVersion, newVersion);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/sqlite/db/framework/d$c;", "a", "()Landroidx/sqlite/db/framework/d$c;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.sqlite.db.framework.d$d, reason: collision with other inner class name */
    static final class C0626d extends n0 implements ld.a<c> {
        C0626d() {
            super(0);
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.name == null || !d.this.useNoBackupDirectory) {
                cVar = new c(d.this.context, d.this.name, new b(null), d.this.callback, d.this.allowDataLossOnRecovery);
            } else {
                cVar = new c(d.this.context, new File(c.C1020c.a(d.this.context), d.this.name).getAbsolutePath(), new b(null), d.this.callback, d.this.allowDataLossOnRecovery);
            }
            c.a.h(cVar, d.this.writeAheadLoggingEnabled);
            return cVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public d(@l Context context, @m String str, @l e.a callback) {
        this(context, str, callback, false, false, 24, null);
        l0.p(context, "context");
        l0.p(callback, "callback");
    }

    private final c g() {
        return this.lazyDelegate.getValue();
    }

    private static Object h(d dVar) {
        return dVar.lazyDelegate;
    }

    @Override // f3.e
    @l
    public f3.d K2() {
        return g().g(false);
    }

    @Override // f3.e
    @l
    public f3.d O2() {
        return g().g(true);
    }

    @Override // f3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.p()) {
            g().close();
        }
    }

    @Override // f3.e
    @m
    /* renamed from: getDatabaseName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Override // f3.e
    @x0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.p()) {
            c.a.h(g(), enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @j
    public d(@l Context context, @m String str, @l e.a callback, boolean z4) {
        this(context, str, callback, z4, false, 16, null);
        l0.p(context, "context");
        l0.p(callback, "callback");
    }

    @j
    public d(@l Context context, @m String str, @l e.a callback, boolean z4, boolean z5) {
        l0.p(context, "context");
        l0.p(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z4;
        this.allowDataLossOnRecovery = z5;
        this.lazyDelegate = c0.c(new C0626d());
    }

    public /* synthetic */ d(Context context, String str, e.a aVar, boolean z4, boolean z5, int i4, w wVar) {
        this(context, str, aVar, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? false : z5);
    }
}
