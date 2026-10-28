package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.c1;
import androidx.view.LiveData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;

/* compiled from: InvalidationTracker.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0005DH-/?BX\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\rB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b!\u0010\"J'\u0010(\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0000¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0017¢\u0006\u0004\b0\u0010.J\u000f\u00102\u001a\u000201H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u0010\u0011J\u000f\u00105\u001a\u00020\u000fH\u0017¢\u0006\u0004\b5\u0010\u0011J#\u00107\u001a\u00020\u000f2\u0012\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005H\u0007¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b9\u0010\"J\u000f\u0010:\u001a\u00020\u000fH\u0000¢\u0006\u0004\b:\u0010\u0011J;\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010;2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000<H\u0017¢\u0006\u0004\b?\u0010@JC\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010;2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u0006\u0010A\u001a\u0002012\u000e\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000<H\u0017¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR+\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010IR&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010I\u001a\u0004\bJ\u0010KR\"\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010M\u001a\u0004\bN\u0010OR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010QR\u001a\u0010V\u001a\u00020R8GX\u0087\u0004¢\u0006\f\n\u0004\b2\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010Y\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR$\u0010_\u001a\u0004\u0018\u00010Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010[\u001a\u0004\bW\u0010\\\"\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010eR&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020h0g8\u0000X\u0081\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\ba\u0010kR\u0018\u0010o\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010nR\u0014\u0010q\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010pR\u0014\u0010r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010pR\u001a\u0010u\u001a\u00020s8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010t\u0012\u0004\bi\u0010\u0011¨\u0006v"}, d2 = {"Landroidx/room/m0;", "", "Landroidx/room/c2;", "database", "", "", "shadowTablesMap", "", "Lkd/o;", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/c2;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/c2;[Ljava/lang/String;)V", "Lkotlin/k2;", "q", "()V", "Lf3/d;", "db", "", "tableId", "A", "(Lf3/d;I)V", "y", "D", "([Ljava/lang/String;)[Ljava/lang/String;", "names", "u", "Landroidx/room/d;", "autoCloser", "v", "(Landroidx/room/d;)V", "o", "(Lf3/d;)V", "Landroid/content/Context;", "context", "name", "Landroid/content/Intent;", "serviceIntent", "x", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "z", "Landroidx/room/m0$c;", "observer", "c", "(Landroidx/room/m0$c;)V", "d", "t", "", "g", "()Z", "r", "s", "tables", "p", "([Ljava/lang/String;)V", "C", "B", "T", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "e", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "f", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "a", "Landroidx/room/c2;", "i", "()Landroidx/room/c2;", "b", "Ljava/util/Map;", "m", "()Ljava/util/Map;", "tableIdLookup", "[Ljava/lang/String;", "n", "()[Ljava/lang/String;", "tablesNames", "Landroidx/room/d;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "k", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "h", "Z", "initialized", "Lf3/i;", "Lf3/i;", "()Lf3/i;", "w", "(Lf3/i;)V", "cleanupStatement", "Landroidx/room/m0$b;", "j", "Landroidx/room/m0$b;", "observedTableTracker", "Landroidx/room/j0;", "Landroidx/room/j0;", "invalidationLiveDataContainer", "Landroidx/arch/core/internal/b;", "Landroidx/room/m0$d;", "l", "Landroidx/arch/core/internal/b;", "()Landroidx/arch/core/internal/b;", "observerMap", "Landroidx/room/s0;", "Landroidx/room/s0;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "syncTriggersLock", "trackerLock", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "refreshRunnable", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
/* loaded from: classes3.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2 database;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, String> shadowTablesMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, Set<String>> viewTables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, Integer> tableIdLookup;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String[] tablesNames;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.room.d autoCloser;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY})
    private final AtomicBoolean pendingRefresh;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile boolean initialized;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private volatile f3.i cleanupStatement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b observedTableTracker;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final j0 invalidationLiveDataContainer;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @androidx.annotation.b0("observerMap")
    private final androidx.arch.core.internal.b<c, d> observerMap;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private s0 multiInstanceInvalidationClient;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object syncTriggersLock;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Object trackerLock;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    @androidx.annotation.c1({c1.a.LIBRARY})
    public final Runnable refreshRunnable;

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final String f33820s = "room_table_modification_log";

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final String f33821t = "table_id";

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final String f33822u = "invalidated";

    /* renamed from: v, reason: collision with root package name */
    @fg.l
    private static final String f33823v = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";

    /* renamed from: w, reason: collision with root package name */
    @fg.l
    public static final String f33824w = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";

    /* renamed from: x, reason: collision with root package name */
    @fg.l
    public static final String f33825x = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final String[] f33819r = {"UPDATE", "DELETE", "INSERT"};

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u001a\u0010\u0011\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001a"}, d2 = {"Landroidx/room/m0$a;", "", "<init>", "()V", "", "tableName", "triggerType", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lf3/d;", "database", "Lkotlin/k2;", "a", "(Lf3/d;)V", "RESET_UPDATED_TABLES_SQL", "Ljava/lang/String;", "b", "SELECT_UPDATED_TABLES_SQL", "c", "CREATE_TRACKING_TABLE_SQL", "INVALIDATED_COLUMN_NAME", "TABLE_ID_COLUMN_NAME", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.m0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @androidx.annotation.m1
        public static /* synthetic */ void b() {
        }

        @androidx.annotation.m1
        public static /* synthetic */ void c() {
        }

        public final void a(@fg.l f3.d database) {
            kotlin.jvm.internal.l0.p(database, "database");
            if (database.x3()) {
                database.J0();
            } else {
                database.R();
            }
        }

        @fg.l
        public final String d(@fg.l String tableName, @fg.l String triggerType) {
            kotlin.jvm.internal.l0.p(tableName, "tableName");
            kotlin.jvm.internal.l0.p(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\n\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\"\u0010 \u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u0012\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/room/m0$b;", "", "", "tableCount", "<init>", "(I)V", "", "tableIds", "", "d", "([I)Z", "e", "Lkotlin/k2;", "f", "()V", "c", "()[I", "", "a", "[J", "b", "()[J", "tableObservers", "", "[Z", "triggerStates", "[I", "triggerStateChanges", "Z", "()Z", "g", "(Z)V", "needsSync", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final int f33843f = 0;

        /* renamed from: g, reason: collision with root package name */
        public static final int f33844g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f33845h = 2;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final long[] tableObservers;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final boolean[] triggerStates;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final int[] triggerStateChanges;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean needsSync;

        public b(int i4) {
            this.tableObservers = new long[i4];
            this.triggerStates = new boolean[i4];
            this.triggerStateChanges = new int[i4];
        }

        /* renamed from: a, reason: from getter */
        public final boolean getNeedsSync() {
            return this.needsSync;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final long[] getTableObservers() {
            return this.tableObservers;
        }

        @fg.m
        @kd.i(name = "getTablesToSync")
        @androidx.annotation.m1
        public final int[] c() {
            synchronized (this) {
                try {
                    if (!this.needsSync) {
                        return null;
                    }
                    long[] jArr = this.tableObservers;
                    int length = jArr.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        int i6 = i5 + 1;
                        int i7 = 1;
                        boolean z4 = jArr[i4] > 0;
                        boolean[] zArr = this.triggerStates;
                        if (z4 != zArr[i5]) {
                            int[] iArr = this.triggerStateChanges;
                            if (!z4) {
                                i7 = 2;
                            }
                            iArr[i5] = i7;
                        } else {
                            this.triggerStateChanges[i5] = 0;
                        }
                        zArr[i5] = z4;
                        i4++;
                        i5 = i6;
                    }
                    this.needsSync = false;
                    return (int[]) this.triggerStateChanges.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean d(@fg.l int... tableIds) {
            boolean z4;
            kotlin.jvm.internal.l0.p(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z4 = false;
                    for (int i4 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j4 = jArr[i4];
                        jArr[i4] = 1 + j4;
                        if (j4 == 0) {
                            z4 = true;
                            this.needsSync = true;
                        }
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z4;
        }

        public final boolean e(@fg.l int... tableIds) {
            boolean z4;
            kotlin.jvm.internal.l0.p(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z4 = false;
                    for (int i4 : tableIds) {
                        long[] jArr = this.tableObservers;
                        long j4 = jArr[i4];
                        jArr[i4] = j4 - 1;
                        if (j4 == 1) {
                            z4 = true;
                            this.needsSync = true;
                        }
                    }
                    kotlin.k2 k2Var = kotlin.k2.f75408a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z4;
        }

        public final void f() {
            synchronized (this) {
                Arrays.fill(this.triggerStates, false);
                this.needsSync = true;
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
        }

        public final void g(boolean z4) {
            this.needsSync = z4;
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroidx/room/m0$d;", "", "Landroidx/room/m0$c;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/m0$c;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "Lkotlin/k2;", "c", "(Ljava/util/Set;)V", "tables", "d", "([Ljava/lang/String;)V", "a", "Landroidx/room/m0$c;", "()Landroidx/room/m0$c;", "b", "[I", "()[I", "[Ljava/lang/String;", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    public static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final c observer;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final int[] tableIds;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String[] tableNames;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Set<String> singleTableSet;

        public d(@fg.l c observer, @fg.l int[] tableIds, @fg.l String[] tableNames) {
            kotlin.jvm.internal.l0.p(observer, "observer");
            kotlin.jvm.internal.l0.p(tableIds, "tableIds");
            kotlin.jvm.internal.l0.p(tableNames, "tableNames");
            this.observer = observer;
            this.tableIds = tableIds;
            this.tableNames = tableNames;
            this.singleTableSet = !(tableNames.length == 0) ? kotlin.collections.l1.f(tableNames[0]) : kotlin.collections.l0.f74939b;
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final c getObserver() {
            return this.observer;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final int[] getTableIds() {
            return this.tableIds;
        }

        public final void c(@fg.l Set<Integer> invalidatedTablesIds) {
            Set<String> set;
            kotlin.jvm.internal.l0.p(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.tableIds;
            int length = iArr.length;
            if (length != 0) {
                int i4 = 0;
                if (length != 1) {
                    kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
                    int[] iArr2 = this.tableIds;
                    int length2 = iArr2.length;
                    int i5 = 0;
                    while (i4 < length2) {
                        int i6 = i5 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i4]))) {
                            jVar.add(this.tableNames[i5]);
                        }
                        i4++;
                        i5 = i6;
                    }
                    set = kotlin.collections.l1.a(jVar);
                } else {
                    set = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : kotlin.collections.l0.f74939b;
                }
            } else {
                set = kotlin.collections.l0.f74939b;
            }
            if (set.isEmpty()) {
                return;
            }
            this.observer.c(set);
        }

        public final void d(@fg.l String[] tables) {
            Set<String> set;
            kotlin.jvm.internal.l0.p(tables, "tables");
            int length = this.tableNames.length;
            if (length == 0) {
                set = kotlin.collections.l0.f74939b;
            } else if (length == 1) {
                int length2 = tables.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        set = kotlin.collections.l0.f74939b;
                        break;
                    } else {
                        if (kotlin.text.v.K1(tables[i4], this.tableNames[0], true)) {
                            set = this.singleTableSet;
                            break;
                        }
                        i4++;
                    }
                }
            } else {
                kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
                for (String str : tables) {
                    for (String str2 : this.tableNames) {
                        if (kotlin.text.v.K1(str2, str, true)) {
                            jVar.add(str2);
                        }
                    }
                }
                set = kotlin.collections.l1.a(jVar);
            }
            if (set.isEmpty()) {
                return;
            }
            this.observer.c(set);
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/room/m0$e;", "Landroidx/room/m0$c;", "Landroidx/room/m0;", "tracker", "delegate", "<init>", "(Landroidx/room/m0;Landroidx/room/m0$c;)V", "", "", "tables", "Lkotlin/k2;", "c", "(Ljava/util/Set;)V", "b", "Landroidx/room/m0;", "e", "()Landroidx/room/m0;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "d", "()Ljava/lang/ref/WeakReference;", "delegateRef", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends c {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final m0 tracker;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final WeakReference<c> delegateRef;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@fg.l m0 tracker, @fg.l c delegate) {
            super(delegate.getTables());
            kotlin.jvm.internal.l0.p(tracker, "tracker");
            kotlin.jvm.internal.l0.p(delegate, "delegate");
            this.tracker = tracker;
            this.delegateRef = new WeakReference<>(delegate);
        }

        @Override // androidx.room.m0.c
        public void c(@fg.l Set<String> tables) {
            kotlin.jvm.internal.l0.p(tables, "tables");
            c cVar = this.delegateRef.get();
            if (cVar == null) {
                this.tracker.t(this);
            } else {
                cVar.c(tables);
            }
        }

        @fg.l
        public final WeakReference<c> d() {
            return this.delegateRef;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final m0 getTracker() {
            return this.tracker;
        }
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/room/m0$f", "Ljava/lang/Runnable;", "", "", "a", "()Ljava/util/Set;", "Lkotlin/k2;", "run", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$refreshRunnable$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,840:1\n1855#2,2:841\n145#3,7:843\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$refreshRunnable$1\n*L\n399#1:841,2\n408#1:843,7\n*E\n"})
    public static final class f implements Runnable {
        f() {
        }

        private final Set<Integer> a() {
            m0 m0Var = m0.this;
            kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
            Cursor query$default = c2.query$default(m0Var.getDatabase(), new f3.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            try {
                Cursor cursor = query$default;
                while (cursor.moveToNext()) {
                    jVar.add(Integer.valueOf(cursor.getInt(0)));
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
                kotlin.io.b.a(query$default, null);
                Set<Integer> a5 = kotlin.collections.l1.a(jVar);
                if (!a5.isEmpty()) {
                    if (m0.this.getCleanupStatement() == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    f3.i cleanupStatement = m0.this.getCleanupStatement();
                    if (cleanupStatement == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cleanupStatement.h0();
                }
                return a5;
            } finally {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        
            if (r0 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        
            r0.e();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        
            if (r2.isEmpty() != false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
        
            r0 = r4.f33857b.j();
            r1 = r4.f33857b;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        
            monitor-enter(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
        
            r1 = r1.j().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c7, code lost:
        
            if (r1.hasNext() == false) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        
            ((androidx.room.m0.d) ((java.util.Map.Entry) r1.next()).getValue()).c(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
        
            r1 = kotlin.k2.f75408a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00dd, code lost:
        
            monitor-exit(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
        
            if (r0 == null) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0098, code lost:
        
            if (r0 == null) goto L40;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.c2 r0 = r0.getDatabase()
                java.util.concurrent.locks.Lock r0 = r0.getCloseLock$room_runtime_release()
                r0.lock()
                androidx.room.m0 r1 = androidx.room.m0.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                boolean r1 = r1.g()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                if (r1 != 0) goto L24
                r0.unlock()
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.d r0 = androidx.room.m0.b(r0)
                if (r0 == 0) goto L23
                r0.e()
            L23:
                return
            L24:
                androidx.room.m0 r1 = androidx.room.m0.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                java.util.concurrent.atomic.AtomicBoolean r1 = r1.getPendingRefresh()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                r2 = 1
                r3 = 0
                boolean r1 = r1.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                if (r1 != 0) goto L41
                r0.unlock()
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.d r0 = androidx.room.m0.b(r0)
                if (r0 == 0) goto L40
                r0.e()
            L40:
                return
            L41:
                androidx.room.m0 r1 = androidx.room.m0.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                androidx.room.c2 r1 = r1.getDatabase()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                boolean r1 = r1.inTransaction()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                if (r1 == 0) goto L5c
                r0.unlock()
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.d r0 = androidx.room.m0.b(r0)
                if (r0 == 0) goto L5b
                r0.e()
            L5b:
                return
            L5c:
                androidx.room.m0 r1 = androidx.room.m0.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                androidx.room.c2 r1 = r1.getDatabase()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                f3.e r1 = r1.getOpenHelper()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                f3.d r1 = r1.O2()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                r1.J0()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                java.util.Set r2 = r4.a()     // Catch: java.lang.Throwable -> L88
                r1.G0()     // Catch: java.lang.Throwable -> L88
                r1.Y0()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                r0.unlock()
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.d r0 = androidx.room.m0.b(r0)
                if (r0 == 0) goto La9
            L82:
                r0.e()
                goto La9
            L86:
                r1 = move-exception
                goto Le2
            L88:
                r2 = move-exception
                r1.Y0()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
                throw r2     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9b
            L8d:
                kotlin.collections.l0 r2 = kotlin.collections.l0.f74939b     // Catch: java.lang.Throwable -> L86
                r0.unlock()
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.d r0 = androidx.room.m0.b(r0)
                if (r0 == 0) goto La9
                goto L82
            L9b:
                kotlin.collections.l0 r2 = kotlin.collections.l0.f74939b     // Catch: java.lang.Throwable -> L86
                r0.unlock()
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.d r0 = androidx.room.m0.b(r0)
                if (r0 == 0) goto La9
                goto L82
            La9:
                r0 = r2
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Le1
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.arch.core.internal.b r0 = r0.j()
                androidx.room.m0 r1 = androidx.room.m0.this
                monitor-enter(r0)
                androidx.arch.core.internal.b r1 = r1.j()     // Catch: java.lang.Throwable -> Ld9
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Ld9
            Lc3:
                boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Ld9
                if (r3 == 0) goto Ldb
                java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Ld9
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Ld9
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Ld9
                androidx.room.m0$d r3 = (androidx.room.m0.d) r3     // Catch: java.lang.Throwable -> Ld9
                r3.c(r2)     // Catch: java.lang.Throwable -> Ld9
                goto Lc3
            Ld9:
                r1 = move-exception
                goto Ldf
            Ldb:
                kotlin.k2 r1 = kotlin.k2.f75408a     // Catch: java.lang.Throwable -> Ld9
                monitor-exit(r0)
                goto Le1
            Ldf:
                monitor-exit(r0)
                throw r1
            Le1:
                return
            Le2:
                r0.unlock()
                androidx.room.m0 r0 = androidx.room.m0.this
                androidx.room.d r0 = androidx.room.m0.b(r0)
                if (r0 == 0) goto Lf0
                r0.e()
            Lf0:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.m0.f.run():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public m0(@fg.l c2 database, @fg.l Map<String, String> shadowTablesMap, @fg.l Map<String, Set<String>> viewTables, @fg.l String... tableNames) {
        String str;
        kotlin.jvm.internal.l0.p(database, "database");
        kotlin.jvm.internal.l0.p(shadowTablesMap, "shadowTablesMap");
        kotlin.jvm.internal.l0.p(viewTables, "viewTables");
        kotlin.jvm.internal.l0.p(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.pendingRefresh = new AtomicBoolean(false);
        this.observedTableTracker = new b(tableNames.length);
        this.invalidationLiveDataContainer = new j0(database);
        this.observerMap = new androidx.arch.core.internal.b<>();
        this.syncTriggersLock = new Object();
        this.trackerLock = new Object();
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = tableNames[i4];
            Locale US = Locale.US;
            kotlin.jvm.internal.l0.o(US, "US");
            String lowerCase = str2.toLowerCase(US);
            kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.tableIdLookup.put(lowerCase, Integer.valueOf(i4));
            String str3 = this.shadowTablesMap.get(tableNames[i4]);
            if (str3 != null) {
                kotlin.jvm.internal.l0.o(US, "US");
                str = str3.toLowerCase(US);
                kotlin.jvm.internal.l0.o(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i4] = lowerCase;
        }
        this.tablesNames = strArr;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String value = entry.getValue();
            Locale US2 = Locale.US;
            kotlin.jvm.internal.l0.o(US2, "US");
            String lowerCase2 = value.toLowerCase(US2);
            kotlin.jvm.internal.l0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.tableIdLookup.containsKey(lowerCase2)) {
                String key = entry.getKey();
                kotlin.jvm.internal.l0.o(US2, "US");
                String lowerCase3 = key.toLowerCase(US2);
                kotlin.jvm.internal.l0.o(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map<String, Integer> map = this.tableIdLookup;
                map.put(lowerCase3, kotlin.collections.z0.K(map, lowerCase2));
            }
        }
        this.refreshRunnable = new f();
    }

    private final void A(f3.d db2, int tableId) {
        String str = this.tablesNames[tableId];
        for (String str2 : f33819r) {
            String str3 = "DROP TRIGGER IF EXISTS " + INSTANCE.d(str, str2);
            kotlin.jvm.internal.l0.o(str3, "StringBuilder().apply(builderAction).toString()");
            db2.b0(str3);
        }
    }

    private final String[] D(String[] tableNames) {
        String[] u4 = u(tableNames);
        for (String str : u4) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            kotlin.jvm.internal.l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException("There is no table with name ".concat(str).toString());
            }
        }
        return u4;
    }

    @androidx.annotation.m1
    public static /* synthetic */ void l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        synchronized (this.trackerLock) {
            this.initialized = false;
            this.observedTableTracker.f();
            f3.i iVar = this.cleanupStatement;
            if (iVar != null) {
                iVar.close();
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            }
        }
    }

    private final String[] u(String[] names) {
        kotlin.collections.builders.j jVar = new kotlin.collections.builders.j();
        for (String str : names) {
            Map<String, Set<String>> map = this.viewTables;
            Locale US = Locale.US;
            kotlin.jvm.internal.l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map<String, Set<String>> map2 = this.viewTables;
                kotlin.jvm.internal.l0.o(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                kotlin.jvm.internal.l0.o(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map2.get(lowerCase2);
                kotlin.jvm.internal.l0.m(set);
                jVar.addAll(set);
            } else {
                jVar.add(str);
            }
        }
        return (String[]) kotlin.collections.l1.a(jVar).toArray(new String[0]);
    }

    private final void y(f3.d db2, int tableId) {
        db2.b0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + tableId + ", 0)");
        String str = this.tablesNames[tableId];
        for (String str2 : f33819r) {
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append(INSTANCE.d(str, str2));
            sb.append(" AFTER ");
            l0.a(sb, str2, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(tableId);
            sb.append(" AND invalidated = 0; END");
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            db2.b0(sb2);
        }
    }

    public final void B() {
        if (this.database.isOpenInternal()) {
            C(this.database.getOpenHelper().O2());
        }
    }

    public final void C(@fg.l f3.d database) {
        kotlin.jvm.internal.l0.p(database, "database");
        if (database.m3()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.database.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            try {
                synchronized (this.syncTriggersLock) {
                    int[] c5 = this.observedTableTracker.c();
                    if (c5 == null) {
                        return;
                    }
                    INSTANCE.a(database);
                    try {
                        int length = c5.length;
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < length) {
                            int i6 = c5[i4];
                            int i7 = i5 + 1;
                            if (i6 == 1) {
                                y(database, i5);
                            } else if (i6 == 2) {
                                A(database, i5);
                            }
                            i4++;
                            i5 = i7;
                        }
                        database.G0();
                        database.Y0();
                        kotlin.k2 k2Var = kotlin.k2.f75408a;
                    } catch (Throwable th) {
                        database.Y0();
                        throw th;
                    }
                }
            } finally {
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    @androidx.annotation.n1
    @SuppressLint({"RestrictedApi"})
    public void c(@fg.l c observer) {
        d j4;
        kotlin.jvm.internal.l0.p(observer, "observer");
        String[] u4 = u(observer.getTables());
        ArrayList arrayList = new ArrayList(u4.length);
        for (String str : u4) {
            Map<String, Integer> map = this.tableIdLookup;
            Locale US = Locale.US;
            kotlin.jvm.internal.l0.o(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
            arrayList.add(num);
        }
        int[] U5 = kotlin.collections.w.U5(arrayList);
        d dVar = new d(observer, U5, u4);
        synchronized (this.observerMap) {
            j4 = this.observerMap.j(observer, dVar);
        }
        if (j4 == null && this.observedTableTracker.d(Arrays.copyOf(U5, U5.length))) {
            B();
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void d(@fg.l c observer) {
        kotlin.jvm.internal.l0.p(observer, "observer");
        c(new e(this, observer));
    }

    @fg.l
    @kotlin.k(message = "Use [createLiveData(String[], boolean, Callable)]")
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> e(@fg.l String[] tableNames, @fg.l Callable<T> computeFunction) {
        kotlin.jvm.internal.l0.p(tableNames, "tableNames");
        kotlin.jvm.internal.l0.p(computeFunction, "computeFunction");
        return f(tableNames, false, computeFunction);
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> f(@fg.l String[] tableNames, boolean inTransaction, @fg.l Callable<T> computeFunction) {
        kotlin.jvm.internal.l0.p(tableNames, "tableNames");
        kotlin.jvm.internal.l0.p(computeFunction, "computeFunction");
        return this.invalidationLiveDataContainer.a(D(tableNames), inTransaction, computeFunction);
    }

    public final boolean g() {
        if (!this.database.isOpenInternal()) {
            return false;
        }
        if (!this.initialized) {
            this.database.getOpenHelper().O2();
        }
        return this.initialized;
    }

    @fg.m
    /* renamed from: h, reason: from getter */
    public final f3.i getCleanupStatement() {
        return this.cleanupStatement;
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final c2 getDatabase() {
        return this.database;
    }

    @fg.l
    public final androidx.arch.core.internal.b<c, d> j() {
        return this.observerMap;
    }

    @fg.l
    @androidx.annotation.c1({c1.a.LIBRARY})
    /* renamed from: k, reason: from getter */
    public final AtomicBoolean getPendingRefresh() {
        return this.pendingRefresh;
    }

    @fg.l
    public final Map<String, Integer> m() {
        return this.tableIdLookup;
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final String[] getTablesNames() {
        return this.tablesNames;
    }

    public final void o(@fg.l f3.d database) {
        kotlin.jvm.internal.l0.p(database, "database");
        synchronized (this.trackerLock) {
            if (this.initialized) {
                return;
            }
            database.b0("PRAGMA temp_store = MEMORY;");
            database.b0("PRAGMA recursive_triggers='ON';");
            database.b0("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            C(database);
            this.cleanupStatement = database.i2("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.initialized = true;
            kotlin.k2 k2Var = kotlin.k2.f75408a;
        }
    }

    @androidx.annotation.c1({c1.a.LIBRARY})
    public final void p(@fg.l String... tables) {
        kotlin.jvm.internal.l0.p(tables, "tables");
        synchronized (this.observerMap) {
            try {
                Iterator<Map.Entry<K, V>> it = this.observerMap.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    kotlin.jvm.internal.l0.o(entry, "(observer, wrapper)");
                    c cVar = (c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!cVar.b()) {
                        dVar.d(tables);
                    }
                }
                kotlin.k2 k2Var = kotlin.k2.f75408a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r() {
        if (this.pendingRefresh.compareAndSet(false, true)) {
            androidx.room.d dVar = this.autoCloser;
            if (dVar != null) {
                dVar.n();
            }
            this.database.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @androidx.annotation.n1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void s() {
        androidx.room.d dVar = this.autoCloser;
        if (dVar != null) {
            dVar.n();
        }
        B();
        this.refreshRunnable.run();
    }

    @androidx.annotation.n1
    @SuppressLint({"RestrictedApi"})
    public void t(@fg.l c observer) {
        d l4;
        kotlin.jvm.internal.l0.p(observer, "observer");
        synchronized (this.observerMap) {
            l4 = this.observerMap.l(observer);
        }
        if (l4 != null) {
            b bVar = this.observedTableTracker;
            int[] tableIds = l4.getTableIds();
            if (bVar.e(Arrays.copyOf(tableIds, tableIds.length))) {
                B();
            }
        }
    }

    public final void v(@fg.l androidx.room.d autoCloser) {
        kotlin.jvm.internal.l0.p(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.q(new Runnable() { // from class: androidx.room.k0
            @Override // java.lang.Runnable
            public final void run() {
                m0.this.q();
            }
        });
    }

    public final void w(@fg.m f3.i iVar) {
        this.cleanupStatement = iVar;
    }

    public final void x(@fg.l Context context, @fg.l String name, @fg.l Intent serviceIntent) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(name, "name");
        kotlin.jvm.internal.l0.p(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationClient = new s0(context, name, serviceIntent, this, this.database.getQueryExecutor());
    }

    public final void z() {
        s0 s0Var = this.multiInstanceInvalidationClient;
        if (s0Var != null) {
            s0Var.s();
        }
        this.multiInstanceInvalidationClient = null;
    }

    /* compiled from: InvalidationTracker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/room/m0$c;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "Lkotlin/k2;", "c", "(Ljava/util/Set;)V", "a", "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "b", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String[] tables;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected c(@fg.l java.lang.String r2, @fg.l java.lang.String... r3) {
            /*
                r1 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.l0.p(r2, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.l0.p(r3, r0)
                kotlin.collections.builders.b r0 = new kotlin.collections.builders.b
                r0.<init>()
                kotlin.collections.w.s0(r0, r3)
                r0.add(r2)
                java.util.List r2 = kotlin.collections.w.a(r0)
                java.util.Collection r2 = (java.util.Collection) r2
                r3 = 0
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.Object[] r2 = r2.toArray(r3)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.m0.c.<init>(java.lang.String, java.lang.String[]):void");
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }

        public boolean b() {
            return false;
        }

        public abstract void c(@fg.l Set<String> tables);

        public c(@fg.l String[] tables) {
            kotlin.jvm.internal.l0.p(tables, "tables");
            this.tables = tables;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public m0(@fg.l c2 database, @fg.l String... tableNames) {
        this(database, kotlin.collections.z0.z(), kotlin.collections.z0.z(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        kotlin.jvm.internal.l0.p(database, "database");
        kotlin.jvm.internal.l0.p(tableNames, "tableNames");
    }
}
