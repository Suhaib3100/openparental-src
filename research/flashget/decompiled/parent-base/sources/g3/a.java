package g3;

import androidx.annotation.c1;
import androidx.compose.runtime.changelist.j;
import fg.l;
import fg.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: ProcessLock.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001b"}, d2 = {"Lg3/a;", "", "", "name", "Ljava/io/File;", "lockDir", "", "processLock", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "Lkotlin/k2;", "b", "(Z)V", "d", "()V", "a", "Z", "Ljava/io/File;", "lockFile", "Ljava/util/concurrent/locks/Lock;", "c", "Ljava/util/concurrent/locks/Lock;", "threadLock", "Ljava/nio/channels/FileChannel;", "Ljava/nio/channels/FileChannel;", "lockChannel", "e", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c1({c1.a.LIBRARY_GROUP})
@r1({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean processLock;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @m
    private final File lockFile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final Lock threadLock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    private FileChannel lockChannel;

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final String f73900f = "SupportSQLiteLock";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final Map<String, Lock> f73901g = new HashMap();

    /* compiled from: ProcessLock.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg3/a$a;", "", "<init>", "()V", "", "key", "Ljava/util/concurrent/locks/Lock;", "b", "(Ljava/lang/String;)Ljava/util/concurrent/locks/Lock;", "TAG", "Ljava/lang/String;", "", "threadLocksMap", "Ljava/util/Map;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nProcessLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,103:1\n361#2,7:104\n*S KotlinDebug\n*F\n+ 1 ProcessLock.kt\nandroidx/sqlite/util/ProcessLock$Companion\n*L\n99#1:104,7\n*E\n"})
    /* renamed from: g3.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String key) {
            Lock lock;
            synchronized (a.f73901g) {
                try {
                    Map map = a.f73901g;
                    Object obj = map.get(key);
                    if (obj == null) {
                        obj = new ReentrantLock();
                        map.put(key, obj);
                    }
                    lock = (Lock) obj;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public Companion(w wVar) {
        }
    }

    public a(@l String name, @m File file, boolean z4) {
        l0.p(name, "name");
        this.processLock = z4;
        this.lockFile = file != null ? new File(file, j.a(name, ".lck")) : null;
        this.threadLock = INSTANCE.b(name);
    }

    public static /* synthetic */ void c(a aVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = aVar.processLock;
        }
        aVar.b(z4);
    }

    public final void b(boolean processLock) {
        this.threadLock.lock();
        if (processLock) {
            try {
                File file = this.lockFile;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.lockFile).getChannel();
                channel.lock();
                this.lockChannel = channel;
            } catch (IOException unused) {
                this.lockChannel = null;
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.threadLock.unlock();
    }
}
