package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;

/* compiled from: FileVisitorBuilder.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015R(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/io/path/x;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "Lkotlin/Function2;", "Ljava/nio/file/attribute/BasicFileAttributes;", "Ljava/nio/file/FileVisitResult;", "onPreVisitDirectory", "onVisitFile", "Ljava/io/IOException;", "onVisitFileFailed", "onPostVisitDirectory", "<init>", "(Lld/p;Lld/p;Lld/p;Lld/p;)V", "dir", "attrs", "b", "(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", "file", "c", "exc", "d", "(Ljava/nio/file/Path;Ljava/io/IOException;)Ljava/nio/file/FileVisitResult;", "a", "Lld/p;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class x extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.p<Path, BasicFileAttributes, FileVisitResult> onPreVisitDirectory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.p<Path, BasicFileAttributes, FileVisitResult> onVisitFile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.p<Path, IOException, FileVisitResult> onVisitFileFailed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final ld.p<Path, IOException, FileVisitResult> onPostVisitDirectory;

    /* JADX WARN: Multi-variable type inference failed */
    public x(@fg.m ld.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @fg.m ld.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @fg.m ld.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @fg.m ld.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.onPreVisitDirectory = pVar;
        this.onVisitFile = pVar2;
        this.onVisitFileFailed = pVar3;
        this.onPostVisitDirectory = pVar4;
    }

    @fg.l
    public FileVisitResult a(@fg.l Path dir, @fg.m IOException exc) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(dir, ProtectedSandApp.s("撺\u0001"));
        ld.p<Path, IOException, FileVisitResult> pVar = this.onPostVisitDirectory;
        if (pVar != null && (invoke = pVar.invoke(dir, exc)) != null) {
            return invoke;
        }
        FileVisitResult postVisitDirectory = super.postVisitDirectory(dir, exc);
        kotlin.jvm.internal.l0.o(postVisitDirectory, ProtectedSandApp.s("撻\u0001"));
        return postVisitDirectory;
    }

    @fg.l
    public FileVisitResult b(@fg.l Path dir, @fg.l BasicFileAttributes attrs) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(dir, ProtectedSandApp.s("撺\u0001"));
        kotlin.jvm.internal.l0.p(attrs, ProtectedSandApp.s("撼\u0001"));
        ld.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.onPreVisitDirectory;
        if (pVar != null && (invoke = pVar.invoke(dir, attrs)) != null) {
            return invoke;
        }
        FileVisitResult preVisitDirectory = super.preVisitDirectory(dir, attrs);
        kotlin.jvm.internal.l0.o(preVisitDirectory, ProtectedSandApp.s("撽\u0001"));
        return preVisitDirectory;
    }

    @fg.l
    public FileVisitResult c(@fg.l Path file, @fg.l BasicFileAttributes attrs) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("撾\u0001"));
        kotlin.jvm.internal.l0.p(attrs, ProtectedSandApp.s("撼\u0001"));
        ld.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.onVisitFile;
        if (pVar != null && (invoke = pVar.invoke(file, attrs)) != null) {
            return invoke;
        }
        FileVisitResult visitFile = super.visitFile(file, attrs);
        kotlin.jvm.internal.l0.o(visitFile, ProtectedSandApp.s("撿\u0001"));
        return visitFile;
    }

    @fg.l
    public FileVisitResult d(@fg.l Path file, @fg.l IOException exc) {
        FileVisitResult invoke;
        kotlin.jvm.internal.l0.p(file, ProtectedSandApp.s("撾\u0001"));
        kotlin.jvm.internal.l0.p(exc, ProtectedSandApp.s("擀\u0001"));
        ld.p<Path, IOException, FileVisitResult> pVar = this.onVisitFileFailed;
        if (pVar != null && (invoke = pVar.invoke(file, exc)) != null) {
            return invoke;
        }
        FileVisitResult visitFileFailed = super.visitFileFailed(file, exc);
        kotlin.jvm.internal.l0.o(visitFileFailed, ProtectedSandApp.s("擁\u0001"));
        return visitFileFailed;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        return a(h.a(obj), iOException);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return b(h.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return c(h.a(obj), basicFileAttributes);
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        return d(h.a(obj), iOException);
    }
}
