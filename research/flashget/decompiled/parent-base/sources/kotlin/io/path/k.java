package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PathTreeWalk.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/io/path/k;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "", "followLinks", "<init>", "(Z)V", "Lkotlin/io/path/b0;", "directoryNode", "", "c", "(Lkotlin/io/path/b0;)Ljava/util/List;", "dir", "Ljava/nio/file/attribute/BasicFileAttributes;", "attrs", "Ljava/nio/file/FileVisitResult;", "b", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", "file", "d", "a", "Z", "()Z", "Lkotlin/io/path/b0;", "Lkotlin/collections/k;", "Lkotlin/collections/k;", "entries", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
/* loaded from: classes7.dex */
final class k extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean followLinks;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b0 directoryNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private kotlin.collections.k<b0> entries = new kotlin.collections.k<>();

    public k(boolean z4) {
        this.followLinks = z4;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getFollowLinks() {
        return this.followLinks;
    }

    @fg.l
    public FileVisitResult b(@fg.l Path dir, @fg.l BasicFileAttributes attrs) {
        kotlin.jvm.internal.l0.p(dir, ProtectedSandApp.s("摵\u0001"));
        kotlin.jvm.internal.l0.p(attrs, ProtectedSandApp.s("摶\u0001"));
        this.entries.addLast(new b0(dir, attrs.fileKey(), this.directoryNode));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.l0.o(preVisitDirectory, ProtectedSandApp.s("摷\u0001"));
        return preVisitDirectory;
    }

    @fg.l
    public final List<b0> c(@fg.l b0 directoryNode) {
        kotlin.jvm.internal.l0.p(directoryNode, ProtectedSandApp.s("摸\u0001"));
        this.directoryNode = directoryNode;
        Files.walkFileTree(directoryNode.getPath(), z.f75259a.b(this.followLinks), 1, i.a(this));
        this.entries.removeFirst();
        kotlin.collections.k<b0> kVar = this.entries;
        this.entries = new kotlin.collections.k<>();
        return kVar;
    }

    @fg.l
    public FileVisitResult d(@fg.l Path file, @fg.l BasicFileAttributes attrs) {
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("摹\u0001"));
        kotlin.jvm.internal.l0.p(attrs, ProtectedSandApp.s("摶\u0001"));
        this.entries.addLast(new b0(file, null, this.directoryNode));
        FileVisitResult visitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.l0.o(visitFile, ProtectedSandApp.s("摺\u0001"));
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(h.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return d(h.a(obj), basicFileAttributes);
    }
}
