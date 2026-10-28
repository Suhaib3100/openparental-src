package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000f\u001a\u00020\b2\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R$\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u001a\u001a\f\u0012\b\u0012\u00060\fj\u0002`\r0\u00168\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\n¨\u0006 "}, d2 = {"Lkotlin/io/path/s;", "", "", "limit", "<init>", "(I)V", "Ljava/nio/file/Path;", "name", "Lkotlin/k2;", "b", "(Ljava/nio/file/Path;)V", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "a", "(Ljava/lang/Exception;)V", "I", "<set-?>", "f", "()I", "totalExceptions", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "collectedExceptions", "Ljava/nio/file/Path;", "e", "()Ljava/nio/file/Path;", "g", "path", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int limit;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int totalExceptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Exception> collectedExceptions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Path path;

    public s() {
        this(0, 1, null);
    }

    public final void a(@fg.l Exception exception) {
        Throwable initCause;
        kotlin.jvm.internal.l0.p(exception, ProtectedSandApp.s("撬\u0001"));
        this.totalExceptions++;
        if (this.collectedExceptions.size() < this.limit) {
            if (this.path != null) {
                r.a();
                initCause = q.a(String.valueOf(this.path)).initCause(exception);
                kotlin.jvm.internal.l0.n(initCause, ProtectedSandApp.s("播\u0001"));
                exception = p.a(initCause);
            }
            this.collectedExceptions.add(exception);
        }
    }

    public final void b(@fg.l Path name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("撮\u0001"));
        Path path = this.path;
        this.path = path != null ? path.resolve(name) : null;
    }

    public final void c(@fg.l Path name) {
        kotlin.jvm.internal.l0.p(name, ProtectedSandApp.s("撮\u0001"));
        Path path = this.path;
        if (!kotlin.jvm.internal.l0.g(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("撯\u0001"));
        }
        Path path2 = this.path;
        this.path = path2 != null ? path2.getParent() : null;
    }

    @fg.l
    public final List<Exception> d() {
        return this.collectedExceptions;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final Path getPath() {
        return this.path;
    }

    /* renamed from: f, reason: from getter */
    public final int getTotalExceptions() {
        return this.totalExceptions;
    }

    public final void g(@fg.m Path path) {
        this.path = path;
    }

    public s(int i4) {
        this.limit = i4;
        this.collectedExceptions = new ArrayList();
    }

    public /* synthetic */ s(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? 64 : i4);
    }
}
