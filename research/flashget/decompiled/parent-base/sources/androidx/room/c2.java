package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.annotation.c1;
import f3.c;
import f3.e;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

/* compiled from: RoomDatabase.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u001d\b&\u0018\u0000 \u0083\u00012\u00020\u0001:\u000e\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u001a\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0015H$¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H$¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u001c0\u0019H\u0015¢\u0006\u0004\b&\u0010'J\u001d\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00050(H\u0017¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH'¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u000bH\u0017¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u000bH\u0017¢\u0006\u0004\b.\u0010\u0003J+\u00100\u001a\u0002032\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u000101H\u0016¢\u0006\u0004\b0\u00104J#\u00100\u001a\u0002032\u0006\u00100\u001a\u0002052\n\b\u0002\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b0\u00108J\u0017\u0010;\u001a\u00020:2\u0006\u00109\u001a\u00020/H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000bH\u0017¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u000bH\u0017¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u000bH\u0017¢\u0006\u0004\b?\u0010\u0003J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ#\u0010B\u001a\u00028\u0000\"\u0004\b\u0000\u0010D2\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0016¢\u0006\u0004\bB\u0010FJ\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0014¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u001e\u0010N\u001a\u0004\u0018\u00010G8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bN\u0010O\u0012\u0004\bP\u0010\u0003R\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010U\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010%R\u0016\u0010Z\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010\\\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010[R$\u0010^\u001a\n\u0012\u0004\u0012\u00020]\u0018\u00010\u001c8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\b^\u0010_\u0012\u0004\b`\u0010\u0003RR\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0a2\u001a\u0010b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u0005\u0012\u0004\u0012\u00020\u001a0a8E@EX\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010c\u001a\u0004\bd\u0010'\"\u0004\be\u0010fR\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010k\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020n0m8G¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR#\u0010s\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00010a8G¢\u0006\f\n\u0004\bs\u0010c\u001a\u0004\bt\u0010'R$\u0010u\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010cR\u001a\u0010v\u001a\u00020K8VX\u0096\u0004¢\u0006\f\u0012\u0004\bw\u0010\u0003\u001a\u0004\bv\u0010MR\u0017\u0010x\u001a\u00020K8G¢\u0006\f\u0012\u0004\by\u0010\u0003\u001a\u0004\bx\u0010MR\u0014\u0010|\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0014\u0010~\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010{R\u0015\u0010\b\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0082\u0001\u001a\u00020K8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010M¨\u0006\u008b\u0001"}, d2 = {"Landroidx/room/c2;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "clazz", "Lf3/e;", "openHelper", "unwrapOpenHelper", "(Ljava/lang/Class;Lf3/e;)Ljava/lang/Object;", "Lkotlin/k2;", "internalBeginTransaction", "internalEndTransaction", "Ljava/util/concurrent/locks/Lock;", "getCloseLock$room_runtime_release", "()Ljava/util/concurrent/locks/Lock;", "getCloseLock", "klass", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Landroidx/room/n;", "configuration", "init", "(Landroidx/room/n;)V", "", "Landroidx/room/migration/a;", "autoMigrationSpecs", "", "Landroidx/room/migration/b;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "config", "createOpenHelper", "(Landroidx/room/n;)Lf3/e;", "Landroidx/room/m0;", "createInvalidationTracker", "()Landroidx/room/m0;", "getRequiredTypeConverters", "()Ljava/util/Map;", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "clearAllTables", "close", "assertNotMainThread", "assertNotSuspendingTransaction", "", "query", "", "args", "Landroid/database/Cursor;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lf3/g;", "Landroid/os/CancellationSignal;", "signal", "(Lf3/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "sql", "Lf3/i;", "compileStatement", "(Ljava/lang/String;)Lf3/i;", "beginTransaction", "endTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "body", "runInTransaction", "(Ljava/lang/Runnable;)V", "V", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lf3/d;", "db", "internalInitInvalidationTracker", "(Lf3/d;)V", "", "inTransaction", "()Z", "mDatabase", "Lf3/d;", "getMDatabase$annotations", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "internalTransactionExecutor", "internalOpenHelper", "Lf3/e;", "invalidationTracker", "Landroidx/room/m0;", "getInvalidationTracker", "allowMainThreadQueries", "Z", "writeAheadLoggingEnabled", "Landroidx/room/c2$b;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "", "<set-?>", "Ljava/util/Map;", "getAutoMigrationSpecs", "setAutoMigrationSpecs", "(Ljava/util/Map;)V", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "readWriteLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Landroidx/room/d;", "autoCloser", "Landroidx/room/d;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "backingFieldMap", "getBackingFieldMap", "typeConverters", "isOpen", "isOpen$annotations", "isOpenInternal", "isOpenInternal$annotations", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "getTransactionExecutor", "transactionExecutor", "getOpenHelper", "()Lf3/e;", "isMainThread$room_runtime_release", "isMainThread", "Companion", "a", "b", "c", "d", "e", "f", "g", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1548:1\n215#2,2:1549\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase\n*L\n261#1:1549,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class c2 {

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @fg.m
    private androidx.room.d autoCloser;

    @fg.l
    private final Map<String, Object> backingFieldMap;
    private f3.e internalOpenHelper;
    private Executor internalQueryExecutor;
    private Executor internalTransactionExecutor;

    @fg.m
    @kd.f
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    protected List<? extends b> mCallbacks;

    @fg.m
    @kd.f
    protected volatile f3.d mDatabase;

    @fg.l
    private final Map<Class<?>, Object> typeConverters;
    private boolean writeAheadLoggingEnabled;

    @fg.l
    private final m0 invalidationTracker = createInvalidationTracker();

    @fg.l
    private Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> autoMigrationSpecs = new LinkedHashMap();

    @fg.l
    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    @fg.l
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J)\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0$\"\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b7\u00106J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b8\u0010.J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010:\u001a\u000209H\u0017¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b=\u0010.J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b>\u0010.J!\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010A\u001a\u00020?\"\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010H\u001a\u00020G2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\bI\u0010JJ\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010K\u001a\u00020\u0003H\u0016¢\u0006\u0004\bL\u0010MJ'\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u0010O\u001a\u00020N2\u0006\u0010Q\u001a\u00020PH\u0017¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00028\u0000H\u0016¢\u0006\u0004\bT\u0010UR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010VR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010WR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010XR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020D0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010\\R\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010^R\u0018\u0010`\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010_R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00030Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020)0Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010ZR\u0018\u0010c\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010_R\u0018\u0010d\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010_R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010eR\u0016\u0010h\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010gR\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010iR\u0018\u0010k\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010jR\u0016\u0010l\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010gR\u0016\u0010m\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010gR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010nR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010oR\u0014\u0010r\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010qR\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020@0s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010tR\u001e\u0010v\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010XR\u0018\u0010z\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u001e\u0010}\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006~"}, d2 = {"Landroidx/room/c2$a;", "Landroidx/room/c2;", "T", "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "databaseFilePath", "g", "(Ljava/lang/String;)Landroidx/room/c2$a;", "Landroidx/room/c2$f;", "callback", "h", "(Ljava/lang/String;Landroidx/room/c2$f;)Landroidx/room/c2$a;", "Ljava/io/File;", "databaseFile", "i", "(Ljava/io/File;)Landroidx/room/c2$a;", "j", "(Ljava/io/File;Landroidx/room/c2$f;)Landroidx/room/c2$a;", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "inputStreamCallable", "k", "(Ljava/util/concurrent/Callable;)Landroidx/room/c2$a;", "l", "(Ljava/util/concurrent/Callable;Landroidx/room/c2$f;)Landroidx/room/c2$a;", "Lf3/e$c;", "factory", "q", "(Lf3/e$c;)Landroidx/room/c2$a;", "", "Landroidx/room/migration/b;", "migrations", "c", "([Landroidx/room/migration/b;)Landroidx/room/c2$a;", "Landroidx/room/migration/a;", "autoMigrationSpec", "a", "(Landroidx/room/migration/a;)Landroidx/room/c2$a;", "e", "()Landroidx/room/c2$a;", "Landroidx/room/c2$d;", "journalMode", "s", "(Landroidx/room/c2$d;)Landroidx/room/c2$a;", "Ljava/util/concurrent/Executor;", "executor", "v", "(Ljava/util/concurrent/Executor;)Landroidx/room/c2$a;", "w", "m", "Landroid/content/Intent;", "invalidationServiceIntent", "t", "(Landroid/content/Intent;)Landroidx/room/c2$a;", "n", "p", "", "", "startVersions", "o", "([I)Landroidx/room/c2$a;", "Landroidx/room/c2$b;", "b", "(Landroidx/room/c2$b;)Landroidx/room/c2$a;", "Landroidx/room/c2$g;", "queryCallback", "u", "(Landroidx/room/c2$g;Ljava/util/concurrent/Executor;)Landroidx/room/c2$a;", "typeConverter", "d", "(Ljava/lang/Object;)Landroidx/room/c2$a;", "", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "r", "(JLjava/util/concurrent/TimeUnit;)Landroidx/room/c2$a;", "f", "()Landroidx/room/c2;", "Landroid/content/Context;", "Ljava/lang/Class;", "Ljava/lang/String;", "", "Ljava/util/List;", "callbacks", "Landroidx/room/c2$f;", "prepackagedDatabaseCallback", "Landroidx/room/c2$g;", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "typeConverters", "autoMigrationSpecs", "queryExecutor", "transactionExecutor", "Lf3/e$c;", "", "Z", "allowMainThreadQueries", "Landroidx/room/c2$d;", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "J", "Ljava/util/concurrent/TimeUnit;", "Landroidx/room/c2$e;", "Landroidx/room/c2$e;", "migrationContainer", "", "Ljava/util/Set;", "migrationsNotRequiredFrom", "migrationStartAndEndVersions", "copyFromAssetPath", "x", "Ljava/io/File;", "copyFromFile", "y", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n1#2:1549\n*E\n"})
    public static class a<T extends c2> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Class<T> klass;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private final String name;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<b> callbacks;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private f prepackagedDatabaseCallback;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private g queryCallback;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Executor queryCallbackExecutor;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final List<Object> typeConverters;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private List<androidx.room.migration.a> autoMigrationSpecs;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Executor queryExecutor;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Executor transactionExecutor;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private e.c factory;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private boolean allowMainThreadQueries;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private d journalMode;

        /* renamed from: o, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Intent multiInstanceInvalidationIntent;

        /* renamed from: p, reason: collision with root package name and from kotlin metadata */
        private boolean requireMigration;

        /* renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean allowDestructiveMigrationOnDowngrade;

        /* renamed from: r, reason: collision with root package name and from kotlin metadata */
        private long autoCloseTimeout;

        /* renamed from: s, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private TimeUnit autoCloseTimeUnit;

        /* renamed from: t, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final e migrationContainer;

        /* renamed from: u, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Set<Integer> migrationsNotRequiredFrom;

        /* renamed from: v, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Set<Integer> migrationStartAndEndVersions;

        /* renamed from: w, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private String copyFromAssetPath;

        /* renamed from: x, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private File copyFromFile;

        /* renamed from: y, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Callable<InputStream> copyFromInputStream;

        public a(@fg.l Context context, @fg.l Class<T> klass, @fg.m String str) {
            kotlin.jvm.internal.l0.p(context, "context");
            kotlin.jvm.internal.l0.p(klass, "klass");
            this.context = context;
            this.klass = klass;
            this.name = str;
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.autoMigrationSpecs = new ArrayList();
            this.journalMode = d.AUTOMATIC;
            this.requireMigration = true;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new e();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
        }

        @fg.l
        public a<T> a(@fg.l androidx.room.migration.a autoMigrationSpec) {
            kotlin.jvm.internal.l0.p(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        @fg.l
        public a<T> b(@fg.l b callback) {
            kotlin.jvm.internal.l0.p(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @fg.l
        public a<T> c(@fg.l androidx.room.migration.b... migrations) {
            kotlin.jvm.internal.l0.p(migrations, "migrations");
            if (this.migrationStartAndEndVersions == null) {
                this.migrationStartAndEndVersions = new HashSet();
            }
            for (androidx.room.migration.b bVar : migrations) {
                Set<Integer> set = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.l0.m(set);
                set.add(Integer.valueOf(bVar.startVersion));
                Set<Integer> set2 = this.migrationStartAndEndVersions;
                kotlin.jvm.internal.l0.m(set2);
                set2.add(Integer.valueOf(bVar.endVersion));
            }
            this.migrationContainer.c((androidx.room.migration.b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @fg.l
        public a<T> d(@fg.l Object typeConverter) {
            kotlin.jvm.internal.l0.p(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @fg.l
        public a<T> e() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @fg.l
        public T f() {
            e.c cVar;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor g4 = androidx.arch.core.executor.c.g();
                this.transactionExecutor = g4;
                this.queryExecutor = g4;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            Set<Integer> set = this.migrationStartAndEndVersions;
            if (set != null) {
                kotlin.jvm.internal.l0.m(set);
                Iterator<Integer> it = set.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (this.migrationsNotRequiredFrom.contains(Integer.valueOf(intValue))) {
                        throw new IllegalArgumentException(android.support.v4.media.a.a("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                    }
                }
            }
            e.c cVar2 = this.factory;
            if (cVar2 == null) {
                cVar2 = new androidx.sqlite.db.framework.f();
            }
            if (cVar2 != null) {
                if (this.autoCloseTimeout > 0) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j4 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.queryExecutor;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar2 = new androidx.room.f(cVar2, new androidx.room.d(j4, timeUnit, executor2));
                }
                String str = this.copyFromAssetPath;
                if (str != null || this.copyFromFile != null || this.copyFromInputStream != null) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i4 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i5 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i4 + i5 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    cVar2 = new m2(str, file, callable, cVar2);
                }
            } else {
                cVar2 = null;
            }
            if (cVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            g gVar = this.queryCallback;
            if (gVar != null) {
                Executor executor3 = this.queryCallbackExecutor;
                if (executor3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (gVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar = new n1(cVar2, executor3, gVar);
            } else {
                cVar = cVar2;
            }
            Context context = this.context;
            String str2 = this.name;
            e eVar = this.migrationContainer;
            List<b> list = this.callbacks;
            boolean z4 = this.allowMainThreadQueries;
            d resolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor4 = this.queryExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor5 = this.transactionExecutor;
            if (executor5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            n nVar = new n(context, str2, cVar, eVar, list, z4, resolve$room_runtime_release, executor4, executor5, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, (List<? extends Object>) this.typeConverters, this.autoMigrationSpecs);
            T t4 = (T) b2.b(this.klass, "_Impl");
            t4.init(nVar);
            return t4;
        }

        @fg.l
        public a<T> g(@fg.l String databaseFilePath) {
            kotlin.jvm.internal.l0.p(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @fg.l
        @SuppressLint({"BuilderSetStyle"})
        public a<T> h(@fg.l String databaseFilePath, @fg.l f callback) {
            kotlin.jvm.internal.l0.p(databaseFilePath, "databaseFilePath");
            kotlin.jvm.internal.l0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @fg.l
        public a<T> i(@fg.l File databaseFile) {
            kotlin.jvm.internal.l0.p(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @fg.l
        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        public a<T> j(@fg.l File databaseFile, @fg.l f callback) {
            kotlin.jvm.internal.l0.p(databaseFile, "databaseFile");
            kotlin.jvm.internal.l0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @fg.l
        @SuppressLint({"BuilderSetStyle"})
        public a<T> k(@fg.l Callable<InputStream> inputStreamCallable) {
            kotlin.jvm.internal.l0.p(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @fg.l
        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        public a<T> l(@fg.l Callable<InputStream> inputStreamCallable, @fg.l f callback) {
            kotlin.jvm.internal.l0.p(inputStreamCallable, "inputStreamCallable");
            kotlin.jvm.internal.l0.p(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @fg.l
        public a<T> m() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @fg.l
        public a<T> n() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @fg.l
        public a<T> o(@fg.l int... startVersions) {
            kotlin.jvm.internal.l0.p(startVersions, "startVersions");
            for (int i4 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i4));
            }
            return this;
        }

        @fg.l
        public a<T> p() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @fg.l
        public a<T> q(@fg.m e.c factory) {
            this.factory = factory;
            return this;
        }

        @fg.l
        @z
        public a<T> r(@androidx.annotation.g0(from = 0) long autoCloseTimeout, @fg.l TimeUnit autoCloseTimeUnit) {
            kotlin.jvm.internal.l0.p(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (autoCloseTimeout < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.autoCloseTimeout = autoCloseTimeout;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        @fg.l
        public a<T> s(@fg.l d journalMode) {
            kotlin.jvm.internal.l0.p(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @fg.l
        @z
        public a<T> t(@fg.l Intent invalidationServiceIntent) {
            kotlin.jvm.internal.l0.p(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        @fg.l
        public a<T> u(@fg.l g queryCallback, @fg.l Executor executor) {
            kotlin.jvm.internal.l0.p(queryCallback, "queryCallback");
            kotlin.jvm.internal.l0.p(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            return this;
        }

        @fg.l
        public a<T> v(@fg.l Executor executor) {
            kotlin.jvm.internal.l0.p(executor, "executor");
            this.queryExecutor = executor;
            return this;
        }

        @fg.l
        public a<T> w(@fg.l Executor executor) {
            kotlin.jvm.internal.l0.p(executor, "executor");
            this.transactionExecutor = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/room/c2$b;", "", "<init>", "()V", "Lf3/d;", "db", "Lkotlin/k2;", "a", "(Lf3/d;)V", "c", "b", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public void a(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }

        public void b(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }

        public void c(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/room/c2$d;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/app/ActivityManager;", "activityManager", "", "isLowRamDevice", "(Landroid/app/ActivityManager;)Z", "Landroid/content/Context;", "context", "resolve$room_runtime_release", "(Landroid/content/Context;)Landroidx/room/c2$d;", "resolve", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean isLowRamDevice(ActivityManager activityManager) {
            return c.b.b(activityManager);
        }

        @fg.l
        public final d resolve$room_runtime_release(@fg.l Context context) {
            kotlin.jvm.internal.l0.p(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00190\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!R,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040#0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$¨\u0006%"}, d2 = {"Landroidx/room/c2$e;", "", "<init>", "()V", "Landroidx/room/migration/b;", "migration", "Lkotlin/k2;", "a", "(Landroidx/room/migration/b;)V", "", "result", "", "upgrade", "", "start", "end", "", "f", "(Ljava/util/List;ZII)Ljava/util/List;", "", "migrations", "c", "([Landroidx/room/migration/b;)V", "b", "(Ljava/util/List;)V", "", "g", "()Ljava/util/Map;", "e", "(II)Ljava/util/List;", "startVersion", "endVersion", "d", "(II)Z", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nRoomDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1548:1\n13579#2,2:1549\n1855#3,2:1551\n361#4,7:1553\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1371#1:1549,2\n1381#1:1551,2\n1387#1:1553,7\n*E\n"})
    public static class e {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Map<Integer, TreeMap<Integer, androidx.room.migration.b>> migrations = new LinkedHashMap();

        private final void a(androidx.room.migration.b migration) {
            int i4 = migration.startVersion;
            int i5 = migration.endVersion;
            Map<Integer, TreeMap<Integer, androidx.room.migration.b>> map = this.migrations;
            Integer valueOf = Integer.valueOf(i4);
            TreeMap<Integer, androidx.room.migration.b> treeMap = map.get(valueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(valueOf, treeMap);
            }
            TreeMap<Integer, androidx.room.migration.b> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i5))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i5)));
                migration.toString();
            }
            treeMap2.put(Integer.valueOf(i5), migration);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.util.List<androidx.room.migration.b> f(java.util.List<androidx.room.migration.b> r7, boolean r8, int r9, int r10) {
            /*
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L63
                goto L7
            L5:
                if (r9 <= r10) goto L63
            L7:
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.b>> r0 = r6.migrations
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L5f
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r4 = "targetVersion"
                if (r8 == 0) goto L44
                int r5 = r9 + 1
                kotlin.jvm.internal.l0.o(r3, r4)
                int r4 = r3.intValue()
                if (r5 > r4) goto L26
                if (r4 > r10) goto L26
                goto L4f
            L44:
                kotlin.jvm.internal.l0.o(r3, r4)
                int r4 = r3.intValue()
                if (r10 > r4) goto L26
                if (r4 >= r9) goto L26
            L4f:
                java.lang.Object r9 = r0.get(r3)
                kotlin.jvm.internal.l0.m(r9)
                r7.add(r9)
                int r9 = r3.intValue()
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L0
                return r1
            L63:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.c2.e.f(java.util.List, boolean, int, int):java.util.List");
        }

        public void b(@fg.l List<? extends androidx.room.migration.b> migrations) {
            kotlin.jvm.internal.l0.p(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                a((androidx.room.migration.b) it.next());
            }
        }

        public void c(@fg.l androidx.room.migration.b... migrations) {
            kotlin.jvm.internal.l0.p(migrations, "migrations");
            for (androidx.room.migration.b bVar : migrations) {
                a(bVar);
            }
        }

        public final boolean d(int startVersion, int endVersion) {
            Map<Integer, Map<Integer, androidx.room.migration.b>> g4 = g();
            if (!g4.containsKey(Integer.valueOf(startVersion))) {
                return false;
            }
            Map<Integer, androidx.room.migration.b> map = g4.get(Integer.valueOf(startVersion));
            if (map == null) {
                map = kotlin.collections.z0.z();
            }
            return map.containsKey(Integer.valueOf(endVersion));
        }

        @fg.m
        public List<androidx.room.migration.b> e(int start, int end) {
            if (start == end) {
                return kotlin.collections.j0.f74919b;
            }
            return f(new ArrayList(), end > start, start, end);
        }

        @fg.l
        public Map<Integer, Map<Integer, androidx.room.migration.b>> g() {
            return this.migrations;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/room/c2$f;", "", "<init>", "()V", "Lf3/d;", "db", "Lkotlin/k2;", "a", "(Lf3/d;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f {
        public void a(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/room/c2$g;", "", "", "sqlQuery", "", "bindArgs", "Lkotlin/k2;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface g {
        void a(@fg.l String sqlQuery, @fg.l List<? extends Object> bindArgs);
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "it", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {
        h() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l f3.d it) {
            kotlin.jvm.internal.l0.p(it, "it");
            c2.this.internalBeginTransaction();
            return null;
        }
    }

    /* compiled from: RoomDatabase.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "it", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {
        i() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l f3.d it) {
            kotlin.jvm.internal.l0.p(it, "it");
            c2.this.internalEndTransaction();
            return null;
        }
    }

    public c2() {
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.l0.o(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    @kotlin.k(message = "Will be hidden in a future release.")
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @kotlin.k(message = "Will be hidden in the next release.")
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        f3.d O2 = getOpenHelper().O2();
        getInvalidationTracker().C(O2);
        if (O2.x3()) {
            O2.J0();
        } else {
            O2.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().O2().Y0();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().r();
    }

    public static /* synthetic */ void isOpen$annotations() {
    }

    public static /* synthetic */ void isOpenInternal$annotations() {
    }

    public static /* synthetic */ Cursor query$default(c2 c2Var, f3.g gVar, CancellationSignal cancellationSignal, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i4 & 2) != 0) {
            cancellationSignal = null;
        }
        return c2Var.query(gVar, cancellationSignal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T unwrapOpenHelper(Class<T> clazz, f3.e openHelper) {
        if (clazz.isInstance(openHelper)) {
            return openHelper;
        }
        if (openHelper instanceof p) {
            return (T) unwrapOpenHelper(clazz, ((p) openHelper).getDelegate());
        }
        return null;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @kotlin.k(message = "beginTransaction() is deprecated", replaceWith = @kotlin.x0(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        androidx.room.d dVar = this.autoCloser;
        if (dVar == null) {
            internalBeginTransaction();
        } else {
            dVar.g(new h());
        }
    }

    @androidx.annotation.n1
    public abstract void clearAllTables();

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            kotlin.jvm.internal.l0.o(writeLock, "readWriteLock.writeLock()");
            writeLock.lock();
            try {
                getInvalidationTracker().z();
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @fg.l
    public f3.i compileStatement(@fg.l String sql) {
        kotlin.jvm.internal.l0.p(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().O2().i2(sql);
    }

    @fg.l
    protected abstract m0 createInvalidationTracker();

    @fg.l
    protected abstract f3.e createOpenHelper(@fg.l n config);

    @kotlin.k(message = "endTransaction() is deprecated", replaceWith = @kotlin.x0(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        androidx.room.d dVar = this.autoCloser;
        if (dVar == null) {
            internalEndTransaction();
        } else {
            dVar.g(new i());
        }
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    protected final Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    @fg.l
    @kd.o
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public List<androidx.room.migration.b> getAutoMigrations(@fg.l Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> autoMigrationSpecs) {
        kotlin.jvm.internal.l0.p(autoMigrationSpecs, "autoMigrationSpecs");
        return kotlin.collections.j0.f74919b;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final Map<String, Object> getBackingFieldMap() {
        return this.backingFieldMap;
    }

    @fg.l
    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        kotlin.jvm.internal.l0.o(readLock, "readWriteLock.readLock()");
        return readLock;
    }

    @fg.l
    public m0 getInvalidationTracker() {
        return this.invalidationTracker;
    }

    @fg.l
    public f3.e getOpenHelper() {
        f3.e eVar = this.internalOpenHelper;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.l0.S("internalOpenHelper");
        return null;
    }

    @fg.l
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.l0.S("internalQueryExecutor");
        return null;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public Set<Class<? extends androidx.room.migration.a>> getRequiredAutoMigrationSpecs() {
        return kotlin.collections.l0.f74939b;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return kotlin.collections.z0.z();
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    @fg.l
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.l0.S("internalTransactionExecutor");
        return null;
    }

    @fg.m
    public <T> T getTypeConverter(@fg.l Class<T> klass) {
        kotlin.jvm.internal.l0.p(klass, "klass");
        return (T) this.typeConverters.get(klass);
    }

    public boolean inTransaction() {
        return getOpenHelper().O2().m3();
    }

    @androidx.annotation.i
    public void init(@fg.l n configuration) {
        kotlin.jvm.internal.l0.p(configuration, "configuration");
        this.internalOpenHelper = createOpenHelper(configuration);
        Set<Class<? extends androidx.room.migration.a>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        BitSet bitSet = new BitSet();
        Iterator<Class<? extends androidx.room.migration.a>> it = requiredAutoMigrationSpecs.iterator();
        while (true) {
            int i4 = -1;
            if (it.hasNext()) {
                Class<? extends androidx.room.migration.a> next = it.next();
                int size = configuration.autoMigrationSpecs.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (next.isAssignableFrom(configuration.autoMigrationSpecs.get(size).getClass())) {
                            bitSet.set(size);
                            i4 = size;
                            break;
                        } else if (i5 < 0) {
                            break;
                        } else {
                            size = i5;
                        }
                    }
                }
                if (i4 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.autoMigrationSpecs.put(next, configuration.autoMigrationSpecs.get(i4));
            } else {
                int size2 = configuration.autoMigrationSpecs.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i6 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i6 < 0) {
                            break;
                        } else {
                            size2 = i6;
                        }
                    }
                }
                for (androidx.room.migration.b bVar : getAutoMigrations(this.autoMigrationSpecs)) {
                    if (!configuration.migrationContainer.d(bVar.startVersion, bVar.endVersion)) {
                        configuration.migrationContainer.c(bVar);
                    }
                }
                l2 l2Var = (l2) unwrapOpenHelper(l2.class, getOpenHelper());
                if (l2Var != null) {
                    l2Var.d(configuration);
                }
                androidx.room.e eVar = (androidx.room.e) unwrapOpenHelper(androidx.room.e.class, getOpenHelper());
                if (eVar != null) {
                    this.autoCloser = eVar.autoCloser;
                    getInvalidationTracker().v(eVar.autoCloser);
                }
                boolean z4 = configuration.journalMode == d.WRITE_AHEAD_LOGGING;
                getOpenHelper().setWriteAheadLoggingEnabled(z4);
                this.mCallbacks = configuration.callbacks;
                this.internalQueryExecutor = configuration.queryExecutor;
                this.internalTransactionExecutor = new s2(configuration.transactionExecutor);
                this.allowMainThreadQueries = configuration.allowMainThreadQueries;
                this.writeAheadLoggingEnabled = z4;
                if (configuration.multiInstanceInvalidationServiceIntent != null) {
                    if (configuration.name == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    getInvalidationTracker().x(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
                }
                Map<Class<?>, List<Class<?>>> requiredTypeConverters = getRequiredTypeConverters();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry<Class<?>, List<Class<?>>> entry : requiredTypeConverters.entrySet()) {
                    Class<?> key = entry.getKey();
                    for (Class<?> cls : entry.getValue()) {
                        int size3 = configuration.typeConverters.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i7 = size3 - 1;
                                if (cls.isAssignableFrom(configuration.typeConverters.get(size3).getClass())) {
                                    bitSet2.set(size3);
                                    break;
                                } else if (i7 < 0) {
                                    break;
                                } else {
                                    size3 = i7;
                                }
                            }
                        }
                        size3 = -1;
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.typeConverters.put(cls, configuration.typeConverters.get(size3));
                    }
                }
                int size4 = configuration.typeConverters.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i10 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i10 < 0) {
                        return;
                    } else {
                        size4 = i10;
                    }
                }
            }
        }
    }

    protected void internalInitInvalidationTracker(@fg.l f3.d db2) {
        kotlin.jvm.internal.l0.p(db2, "db");
        getInvalidationTracker().o(db2);
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        Boolean bool;
        boolean isOpen;
        androidx.room.d dVar = this.autoCloser;
        if (dVar != null) {
            isOpen = dVar.p();
        } else {
            f3.d dVar2 = this.mDatabase;
            if (dVar2 == null) {
                bool = null;
                return kotlin.jvm.internal.l0.g(bool, Boolean.TRUE);
            }
            isOpen = dVar2.isOpen();
        }
        bool = Boolean.valueOf(isOpen);
        return kotlin.jvm.internal.l0.g(bool, Boolean.TRUE);
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
        f3.d dVar = this.mDatabase;
        return dVar != null && dVar.isOpen();
    }

    @fg.l
    @kd.j
    public final Cursor query(@fg.l f3.g query) {
        kotlin.jvm.internal.l0.p(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@fg.l Runnable body) {
        kotlin.jvm.internal.l0.p(body, "body");
        beginTransaction();
        try {
            body.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    protected final void setAutoMigrationSpecs(@fg.l Map<Class<? extends androidx.room.migration.a>, androidx.room.migration.a> map) {
        kotlin.jvm.internal.l0.p(map, "<set-?>");
        this.autoMigrationSpecs = map;
    }

    @kotlin.k(message = "setTransactionSuccessful() is deprecated", replaceWith = @kotlin.x0(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().O2().G0();
    }

    @fg.l
    public Cursor query(@fg.l String query, @fg.m Object[] args) {
        kotlin.jvm.internal.l0.p(query, "query");
        return getOpenHelper().O2().i1(new f3.b(query, args));
    }

    @fg.l
    @kd.j
    public Cursor query(@fg.l f3.g query, @fg.m CancellationSignal signal) {
        kotlin.jvm.internal.l0.p(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().O2().R1(query, signal);
        }
        return getOpenHelper().O2().i1(query);
    }

    public <V> V runInTransaction(@fg.l Callable<V> body) {
        kotlin.jvm.internal.l0.p(body, "body");
        beginTransaction();
        try {
            V call = body.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }
}
