package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0002\u0010\u0006R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/io/path/PathNode;", "", "path", "Ljava/nio/file/Path;", "key", "parent", "(Ljava/nio/file/Path;Ljava/lang/Object;Lkotlin/io/path/PathNode;)V", "contentIterator", "", "getContentIterator", "()Ljava/util/Iterator;", "setContentIterator", "(Ljava/util/Iterator;)V", "getKey", "()Ljava/lang/Object;", "getParent", "()Lkotlin/io/path/PathNode;", "getPath", "()Ljava/nio/file/Path;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.path.v, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class PathNode {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final Path f23499a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final Object f23500b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final PathNode f23501c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private Iterator<PathNode> f23502d;

    public PathNode(@d5.d Path path, @d5.e Object obj, @d5.e PathNode pathNode) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃵"));
        this.f23499a = path;
        this.f23500b = obj;
        this.f23501c = pathNode;
    }

    @d5.e
    public final Iterator<PathNode> a() {
        return this.f23502d;
    }

    @d5.e
    /* renamed from: b, reason: from getter */
    public final Object getF23500b() {
        return this.f23500b;
    }

    @d5.e
    /* renamed from: c, reason: from getter */
    public final PathNode getF23501c() {
        return this.f23501c;
    }

    @d5.d
    /* renamed from: d, reason: from getter */
    public final Path getF23499a() {
        return this.f23499a;
    }

    public final void e(@d5.e Iterator<PathNode> it) {
        this.f23502d = it;
    }
}
