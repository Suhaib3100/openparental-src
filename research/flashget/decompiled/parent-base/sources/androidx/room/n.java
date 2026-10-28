package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.c1;
import androidx.room.c2;
import f3.e;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: DatabaseConfiguration.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b2\b\u0016\u0018\u00002\u00020\u0001BÏ\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n¢\u0006\u0004\b&\u0010'Bk\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b&\u0010(B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b&\u0010*B\u0097\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b&\u0010+B§\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b&\u0010,B±\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b&\u0010-B¿\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0004\b&\u0010.BÍ\u0001\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n¢\u0006\u0004\b&\u0010/J\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020\u0019H\u0017¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0019H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00107R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010@R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u00108R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010>R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010>R\u0014\u0010)\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010@¨\u0006V"}, d2 = {"Landroidx/room/n;", "", "Landroid/content/Context;", "context", "", "name", "Lf3/e$c;", "sqliteOpenHelperFactory", "Landroidx/room/c2$e;", "migrationContainer", "", "Landroidx/room/c2$b;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/c2$d;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/c2$f;", "prepackagedDatabaseCallback", "typeConverters", "Landroidx/room/migration/a;", "autoMigrationSpecs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/c2$f;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "multiInstanceInvalidation", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/c2$f;)V", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/c2$f;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Lf3/e$c;Landroidx/room/c2$e;Ljava/util/List;ZLandroidx/room/c2$d;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/c2$f;Ljava/util/List;Ljava/util/List;)V", "version", "b", "(I)Z", "fromVersion", "toVersion", "a", "(II)Z", "Landroid/content/Context;", "Ljava/lang/String;", "c", "Lf3/e$c;", "d", "Landroidx/room/c2$e;", "e", "Ljava/util/List;", "f", "Z", "g", "Landroidx/room/c2$d;", "h", "Ljava/util/concurrent/Executor;", "i", "j", "Landroid/content/Intent;", "k", "l", "m", "Ljava/util/Set;", "n", "o", "Ljava/io/File;", "p", "Ljava/util/concurrent/Callable;", "q", "Landroidx/room/c2$f;", "r", "s", "t", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final e.c sqliteOpenHelperFactory;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final c2.e migrationContainer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final List<c2.b> callbacks;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean allowMainThreadQueries;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final c2.d journalMode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final Executor queryExecutor;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final Executor transactionExecutor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public final Intent multiInstanceInvalidationServiceIntent;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean requireMigration;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Set<Integer> migrationNotRequiredFrom;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final String copyFromAssetPath;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final File copyFromFile;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final Callable<InputStream> copyFromInputStream;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public final c2.f prepackagedDatabaseCallback;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final List<Object> typeConverters;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final List<androidx.room.migration.a> autoMigrationSpecs;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @kd.f
    public final boolean multiInstanceInvalidation;

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"LambdaLast"})
    public n(@fg.l Context context, @fg.m String str, @fg.l e.c sqliteOpenHelperFactory, @fg.l c2.e migrationContainer, @fg.m List<? extends c2.b> list, boolean z4, @fg.l c2.d journalMode, @fg.l Executor queryExecutor, @fg.l Executor transactionExecutor, @fg.m Intent intent, boolean z5, boolean z6, @fg.m Set<Integer> set, @fg.m String str2, @fg.m File file, @fg.m Callable<InputStream> callable, @fg.m c2.f fVar, @fg.l List<? extends Object> typeConverters, @fg.l List<? extends androidx.room.migration.a> autoMigrationSpecs) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.l0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.l0.p(journalMode, "journalMode");
        kotlin.jvm.internal.l0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.l0.p(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.l0.p(typeConverters, "typeConverters");
        kotlin.jvm.internal.l0.p(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = sqliteOpenHelperFactory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z4;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z5;
        this.allowDestructiveMigrationOnDowngrade = z6;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = fVar;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.multiInstanceInvalidation = intent != null;
    }

    public boolean a(int fromVersion, int toVersion) {
        if ((fromVersion > toVersion && this.allowDestructiveMigrationOnDowngrade) || !this.requireMigration) {
            return false;
        }
        Set<Integer> set = this.migrationNotRequiredFrom;
        return set == null || !set.contains(Integer.valueOf(fromVersion));
    }

    @kotlin.k(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @kotlin.x0(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean b(int version) {
        return a(version, version + 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.x0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@fg.l android.content.Context r22, @fg.m java.lang.String r23, @fg.l f3.e.c r24, @fg.l androidx.room.c2.e r25, @fg.m java.util.List<? extends androidx.room.c2.b> r26, boolean r27, @fg.l androidx.room.c2.d r28, @fg.l java.util.concurrent.Executor r29, boolean r30, @fg.m java.util.Set<java.lang.Integer> r31) {
        /*
            r21 = this;
            java.lang.String r0 = "context"
            r2 = r22
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "migrationContainer"
            r5 = r25
            kotlin.jvm.internal.l0.p(r5, r0)
            java.lang.String r0 = "journalMode"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "queryExecutor"
            r10 = r29
            kotlin.jvm.internal.l0.p(r10, r0)
            kotlin.collections.j0 r20 = kotlin.collections.j0.f74919b
            r17 = 0
            r18 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r29
            r12 = r30
            r14 = r31
            r19 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.n.<init>(android.content.Context, java.lang.String, f3.e$c, androidx.room.c2$e, java.util.List, boolean, androidx.room.c2$d, java.util.concurrent.Executor, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.x0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@fg.l android.content.Context r21, @fg.m java.lang.String r22, @fg.l f3.e.c r23, @fg.l androidx.room.c2.e r24, @fg.m java.util.List<? extends androidx.room.c2.b> r25, boolean r26, @fg.l androidx.room.c2.d r27, @fg.l java.util.concurrent.Executor r28, @fg.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @fg.m java.util.Set<java.lang.Integer> r33) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            kotlin.collections.j0 r19 = kotlin.collections.j0.f74919b
            r16 = 0
            r17 = 0
            r14 = 0
            r15 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r18 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.n.<init>(android.content.Context, java.lang.String, f3.e$c, androidx.room.c2$e, java.util.List, boolean, androidx.room.c2$d, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.x0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@fg.l android.content.Context r21, @fg.m java.lang.String r22, @fg.l f3.e.c r23, @fg.l androidx.room.c2.e r24, @fg.m java.util.List<? extends androidx.room.c2.b> r25, boolean r26, @fg.l androidx.room.c2.d r27, @fg.l java.util.concurrent.Executor r28, @fg.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @fg.m java.util.Set<java.lang.Integer> r33, @fg.m java.lang.String r34, @fg.m java.io.File r35) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            kotlin.collections.j0 r19 = kotlin.collections.j0.f74919b
            r16 = 0
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r18 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.n.<init>(android.content.Context, java.lang.String, f3.e$c, androidx.room.c2$e, java.util.List, boolean, androidx.room.c2$d, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.x0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP_PREFIX})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@fg.l android.content.Context r21, @fg.m java.lang.String r22, @fg.l f3.e.c r23, @fg.l androidx.room.c2.e r24, @fg.m java.util.List<? extends androidx.room.c2.b> r25, boolean r26, @fg.l androidx.room.c2.d r27, @fg.l java.util.concurrent.Executor r28, @fg.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @fg.m java.util.Set<java.lang.Integer> r33, @fg.m java.lang.String r34, @fg.m java.io.File r35, @fg.m java.util.concurrent.Callable<java.io.InputStream> r36) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            kotlin.collections.j0 r19 = kotlin.collections.j0.f74919b
            r17 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r18 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.n.<init>(android.content.Context, java.lang.String, f3.e$c, androidx.room.c2$e, java.util.List, boolean, androidx.room.c2$d, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.x0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP_PREFIX})
    @android.annotation.SuppressLint({"LambdaLast"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(@fg.l android.content.Context r21, @fg.m java.lang.String r22, @fg.l f3.e.c r23, @fg.l androidx.room.c2.e r24, @fg.m java.util.List<? extends androidx.room.c2.b> r25, boolean r26, @fg.l androidx.room.c2.d r27, @fg.l java.util.concurrent.Executor r28, @fg.l java.util.concurrent.Executor r29, boolean r30, boolean r31, boolean r32, @fg.m java.util.Set<java.lang.Integer> r33, @fg.m java.lang.String r34, @fg.m java.io.File r35, @fg.m java.util.concurrent.Callable<java.io.InputStream> r36, @fg.m androidx.room.c2.f r37) {
        /*
            r20 = this;
            r1 = r21
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r23
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r24
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r27
            kotlin.jvm.internal.l0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r28
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r29
            kotlin.jvm.internal.l0.p(r9, r0)
            if (r30 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            kotlin.collections.j0 r19 = kotlin.collections.j0.f74919b
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.n.<init>(android.content.Context, java.lang.String, f3.e$c, androidx.room.c2$e, java.util.List, boolean, androidx.room.c2$d, java.util.concurrent.Executor, java.util.concurrent.Executor, boolean, boolean, boolean, java.util.Set, java.lang.String, java.io.File, java.util.concurrent.Callable, androidx.room.c2$f):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.x0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"LambdaLast"})
    public n(@fg.l Context context, @fg.m String str, @fg.l e.c sqliteOpenHelperFactory, @fg.l c2.e migrationContainer, @fg.m List<? extends c2.b> list, boolean z4, @fg.l c2.d journalMode, @fg.l Executor queryExecutor, @fg.l Executor transactionExecutor, boolean z5, boolean z6, boolean z7, @fg.m Set<Integer> set, @fg.m String str2, @fg.m File file, @fg.m Callable<InputStream> callable, @fg.m c2.f fVar, @fg.l List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z6, z7, set, str2, file, callable, fVar, typeConverters, kotlin.collections.j0.f74919b);
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.l0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.l0.p(journalMode, "journalMode");
        kotlin.jvm.internal.l0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.l0.p(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.l0.p(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "This constructor is deprecated.", replaceWith = @kotlin.x0(expression = "DatabaseConfiguration(Context, String, SupportSQLiteOpenHelper.Factory, RoomDatabase.MigrationContainer, List, boolean, RoomDatabase.JournalMode, Executor, Executor, Intent, boolean, boolean, Set, String, File, Callable, RoomDatabase.PrepackagedDatabaseCallback, List, List)", imports = {}))
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"LambdaLast"})
    public n(@fg.l Context context, @fg.m String str, @fg.l e.c sqliteOpenHelperFactory, @fg.l c2.e migrationContainer, @fg.m List<? extends c2.b> list, boolean z4, @fg.l c2.d journalMode, @fg.l Executor queryExecutor, @fg.l Executor transactionExecutor, boolean z5, boolean z6, boolean z7, @fg.m Set<Integer> set, @fg.m String str2, @fg.m File file, @fg.m Callable<InputStream> callable, @fg.m c2.f fVar, @fg.l List<? extends Object> typeConverters, @fg.l List<? extends androidx.room.migration.a> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z4, journalMode, queryExecutor, transactionExecutor, z5 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z6, z7, set, str2, file, callable, (c2.f) null, typeConverters, autoMigrationSpecs);
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        kotlin.jvm.internal.l0.p(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.l0.p(journalMode, "journalMode");
        kotlin.jvm.internal.l0.p(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.l0.p(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.l0.p(typeConverters, "typeConverters");
        kotlin.jvm.internal.l0.p(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
