package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0007j\u0002`\bJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fR\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lkotlin/io/path/ExceptionsCollector;", "", "limit", "", "(I)V", "collectedExceptions", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCollectedExceptions", "()Ljava/util/List;", "path", "Ljava/nio/file/Path;", "getPath", "()Ljava/nio/file/Path;", "setPath", "(Ljava/nio/file/Path;)V", "<set-?>", "totalExceptions", "getTotalExceptions", "()I", "collect", "", "exception", "enterEntry", "name", "exitEntry", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.path.n, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class ExceptionsCollector {

    /* renamed from: a, reason: collision with root package name */
    private final int f23481a;

    /* renamed from: b, reason: collision with root package name */
    private int f23482b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final List<Exception> f23483c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private Path f23484d;

    public ExceptionsCollector() {
        this(0, 1, null);
    }

    public final void a(@d5.d Exception exc) {
        kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("䃙"));
        this.f23482b++;
        if (this.f23483c.size() < this.f23481a) {
            if (this.f23484d != null) {
                Throwable initCause = new FileSystemException(String.valueOf(this.f23484d)).initCause(exc);
                kotlin.jvm.internal.l0.n(initCause, ProtectedSandApp.s("䃚"));
                exc = (FileSystemException) initCause;
            }
            this.f23483c.add(exc);
        }
    }

    public final void b(@d5.d Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃛"));
        Path path2 = this.f23484d;
        this.f23484d = path2 != null ? path2.resolve(path) : null;
    }

    public final void c(@d5.d Path path) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃜"));
        Path path2 = this.f23484d;
        if (!kotlin.jvm.internal.l0.g(path, path2 != null ? path2.getFileName() : null)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("䃝").toString());
        }
        Path path3 = this.f23484d;
        this.f23484d = path3 != null ? path3.getParent() : null;
    }

    @d5.d
    public final List<Exception> d() {
        return this.f23483c;
    }

    @d5.e
    /* renamed from: e, reason: from getter */
    public final Path getF23484d() {
        return this.f23484d;
    }

    /* renamed from: f, reason: from getter */
    public final int getF23482b() {
        return this.f23482b;
    }

    public final void g(@d5.e Path path) {
        this.f23484d = path;
    }

    public ExceptionsCollector(int i5) {
        this.f23481a = i5;
        this.f23483c = new ArrayList();
    }

    public /* synthetic */ ExceptionsCollector(int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 64 : i5);
    }
}
