package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "followLinks", "", "(Z)V", "directoryNode", "Lkotlin/io/path/PathNode;", "entries", "Lkotlin/collections/ArrayDeque;", "getFollowLinks", "()Z", "preVisitDirectory", "Ljava/nio/file/FileVisitResult;", "dir", "attrs", "Ljava/nio/file/attribute/BasicFileAttributes;", "readEntries", "", "visitFile", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* renamed from: kotlin.io.path.i, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class DirectoryEntriesReader extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23456a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private PathNode f23457b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private ArrayDeque<PathNode> f23458c = new ArrayDeque<>();

    public DirectoryEntriesReader(boolean z5) {
        this.f23456a = z5;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getF23456a() {
        return this.f23456a;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @d5.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@d5.d Path path, @d5.d BasicFileAttributes basicFileAttributes) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁘"));
        kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("䁙"));
        this.f23458c.addLast(new PathNode(path, basicFileAttributes.fileKey(), this.f23457b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        kotlin.jvm.internal.l0.o(preVisitDirectory, ProtectedSandApp.s("䁚"));
        return preVisitDirectory;
    }

    @d5.d
    public final List<PathNode> c(@d5.d PathNode pathNode) {
        kotlin.jvm.internal.l0.p(pathNode, ProtectedSandApp.s("䁛"));
        this.f23457b = pathNode;
        Files.walkFileTree(pathNode.getF23499a(), LinkFollowing.f23494a.b(this.f23456a), 1, this);
        this.f23458c.removeFirst();
        ArrayDeque<PathNode> arrayDeque = this.f23458c;
        this.f23458c = new ArrayDeque<>();
        return arrayDeque;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@d5.d Path path, @d5.d BasicFileAttributes basicFileAttributes) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁜"));
        kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("䁝"));
        this.f23458c.addLast(new PathNode(path, null, this.f23457b));
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        kotlin.jvm.internal.l0.o(visitFile, ProtectedSandApp.s("䁞"));
        return visitFile;
    }
}
