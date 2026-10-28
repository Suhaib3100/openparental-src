package androidx.room;

import android.content.Context;
import androidx.room.c2;
import f3.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* compiled from: SQLiteCopyOpenHelper.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006="}, d2 = {"Landroidx/room/l2;", "Lf3/e;", "Landroidx/room/p;", "Landroid/content/Context;", "context", "", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "", "databaseVersion", "delegate", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILf3/e;)V", "", "writable", "Lkotlin/k2;", "e", "(Z)V", "destinationFile", "a", "(Ljava/io/File;Z)V", "databaseFile", "c", "b", "(Ljava/io/File;)Lf3/e;", "enabled", "setWriteAheadLoggingEnabled", "close", "()V", "Landroidx/room/n;", "databaseConfiguration", "d", "(Landroidx/room/n;)V", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/io/File;", "Ljava/util/concurrent/Callable;", "f", "I", "g", "Lf3/e;", "getDelegate", "()Lf3/e;", "h", "Landroidx/room/n;", "i", "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lf3/d;", "O2", "()Lf3/d;", "writableDatabase", "K2", "readableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l2 implements f3.e, p {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String copyFromAssetPath;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final File copyFromFile;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Callable<InputStream> copyFromInputStream;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int databaseVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f3.e delegate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private n databaseConfiguration;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean verified;

    /* compiled from: SQLiteCopyOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"androidx/room/l2$a", "Lf3/e$a;", "Lf3/d;", "db", "Lkotlin/k2;", "d", "(Lf3/d;)V", "", "oldVersion", "newVersion", "g", "(Lf3/d;II)V", "f", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends e.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f33817d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i4, int i5) {
            super(i5);
            this.f33817d = i4;
        }

        @Override // f3.e.a
        public void d(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }

        @Override // f3.e.a
        public void f(@fg.l f3.d db2) {
            kotlin.jvm.internal.l0.p(db2, "db");
            int i4 = this.f33817d;
            if (i4 < 1) {
                db2.setVersion(i4);
            }
        }

        @Override // f3.e.a
        public void g(@fg.l f3.d db2, int oldVersion, int newVersion) {
            kotlin.jvm.internal.l0.p(db2, "db");
        }
    }

    public l2(@fg.l Context context, @fg.m String str, @fg.m File file, @fg.m Callable<InputStream> callable, int i4, @fg.l f3.e delegate) {
        kotlin.jvm.internal.l0.p(context, "context");
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i4;
        this.delegate = delegate;
    }

    private final void a(File destinationFile, boolean writable) throws IOException {
        ReadableByteChannel newChannel;
        if (this.copyFromAssetPath != null) {
            newChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            kotlin.jvm.internal.l0.o(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            newChannel = new FileInputStream(this.copyFromFile).getChannel();
            kotlin.jvm.internal.l0.o(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                newChannel = Channels.newChannel(callable.call());
                kotlin.jvm.internal.l0.o(newChannel, "newChannel(inputStream)");
            } catch (Exception e4) {
                throw new IOException("inputStreamCallable exception on call", e4);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        kotlin.jvm.internal.l0.o(output, "output");
        androidx.room.util.c.a(newChannel, output);
        File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        kotlin.jvm.internal.l0.o(intermediateFile, "intermediateFile");
        c(intermediateFile, writable);
        if (intermediateFile.renameTo(destinationFile)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final f3.e b(File databaseFile) {
        try {
            int g4 = androidx.room.util.b.g(databaseFile);
            return new androidx.sqlite.db.framework.f().a(e.b.INSTANCE.a(this.context).d(databaseFile.getAbsolutePath()).c(new a(g4, g4 >= 1 ? g4 : 1)).b());
        } catch (IOException e4) {
            throw new RuntimeException("Malformed database file, unable to read version.", e4);
        }
    }

    private final void c(File databaseFile, boolean writable) {
        n nVar = this.databaseConfiguration;
        if (nVar == null) {
            kotlin.jvm.internal.l0.S("databaseConfiguration");
            nVar = null;
        }
        if (nVar.prepackagedDatabaseCallback == null) {
            return;
        }
        f3.e b5 = b(databaseFile);
        try {
            f3.d O2 = writable ? b5.O2() : b5.K2();
            n nVar2 = this.databaseConfiguration;
            if (nVar2 == null) {
                kotlin.jvm.internal.l0.S("databaseConfiguration");
                nVar2 = null;
            }
            c2.f fVar = nVar2.prepackagedDatabaseCallback;
            kotlin.jvm.internal.l0.m(fVar);
            fVar.a(O2);
            kotlin.k2 k2Var = kotlin.k2.f75408a;
            kotlin.io.b.a(b5, null);
        } finally {
        }
    }

    private final void e(boolean writable) {
        String name = this.delegate.getName();
        if (name == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.context.getDatabasePath(name);
        n nVar = this.databaseConfiguration;
        n nVar2 = null;
        if (nVar == null) {
            kotlin.jvm.internal.l0.S("databaseConfiguration");
            nVar = null;
        }
        g3.a aVar = new g3.a(name, this.context.getFilesDir(), nVar.multiInstanceInvalidation);
        try {
            g3.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    kotlin.jvm.internal.l0.o(databaseFile, "databaseFile");
                    a(databaseFile, writable);
                    return;
                } catch (IOException e4) {
                    throw new RuntimeException("Unable to copy database file.", e4);
                }
            }
            try {
                kotlin.jvm.internal.l0.o(databaseFile, "databaseFile");
                int g4 = androidx.room.util.b.g(databaseFile);
                if (g4 == this.databaseVersion) {
                    return;
                }
                n nVar3 = this.databaseConfiguration;
                if (nVar3 == null) {
                    kotlin.jvm.internal.l0.S("databaseConfiguration");
                } else {
                    nVar2 = nVar3;
                }
                if (nVar2.a(g4, this.databaseVersion)) {
                    return;
                }
                if (this.context.deleteDatabase(name)) {
                    try {
                        a(databaseFile, writable);
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
            }
        } finally {
            aVar.d();
        }
    }

    @Override // f3.e
    @fg.l
    public f3.d K2() {
        if (!this.verified) {
            e(false);
            this.verified = true;
        }
        return this.delegate.K2();
    }

    @Override // f3.e
    @fg.l
    public f3.d O2() {
        if (!this.verified) {
            e(true);
            this.verified = true;
        }
        return this.delegate.O2();
    }

    @Override // f3.e, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.delegate.close();
        this.verified = false;
    }

    public final void d(@fg.l n databaseConfiguration) {
        kotlin.jvm.internal.l0.p(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // f3.e
    @fg.m
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.room.p
    @fg.l
    public f3.e getDelegate() {
        return this.delegate;
    }

    @Override // f3.e
    @androidx.annotation.x0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
