package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;

/* compiled from: FileVisitorBuilder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016R$\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/io/path/FileVisitorImpl;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "onPreVisitDirectory", "Lkotlin/Function2;", "Ljava/nio/file/attribute/BasicFileAttributes;", "Ljava/nio/file/FileVisitResult;", "onVisitFile", "onVisitFileFailed", "Ljava/io/IOException;", "onPostVisitDirectory", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "postVisitDirectory", "dir", "exc", "preVisitDirectory", "attrs", "visitFile", "file", "visitFileFailed", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.path.r, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class FileVisitorImpl extends SimpleFileVisitor<Path> {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private final q3.p<Path, BasicFileAttributes, FileVisitResult> f23490a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private final q3.p<Path, BasicFileAttributes, FileVisitResult> f23491b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private final q3.p<Path, IOException, FileVisitResult> f23492c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private final q3.p<Path, IOException, FileVisitResult> f23493d;

    /* JADX WARN: Multi-variable type inference failed */
    public FileVisitorImpl(@d5.e q3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @d5.e q3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @d5.e q3.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @d5.e q3.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f23490a = pVar;
        this.f23491b = pVar2;
        this.f23492c = pVar3;
        this.f23493d = pVar4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @d5.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(@d5.d Path path, @d5.e IOException iOException) {
        FileVisitResult g02;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃨"));
        q3.p<Path, IOException, FileVisitResult> pVar = this.f23493d;
        if (pVar != null && (g02 = pVar.g0(path, iOException)) != null) {
            return g02;
        }
        FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
        kotlin.jvm.internal.l0.o(postVisitDirectory, ProtectedSandApp.s("䃩"));
        return postVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @d5.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@d5.d Path path, @d5.d BasicFileAttributes basicFileAttributes) {
        FileVisitResult g02;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃪"));
        kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("䃫"));
        q3.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f23490a;
        if (pVar != null && (g02 = pVar.g0(path, basicFileAttributes)) != null) {
            return g02;
        }
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        kotlin.jvm.internal.l0.o(preVisitDirectory, ProtectedSandApp.s("䃬"));
        return preVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @d5.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@d5.d Path path, @d5.d BasicFileAttributes basicFileAttributes) {
        FileVisitResult g02;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃭"));
        kotlin.jvm.internal.l0.p(basicFileAttributes, ProtectedSandApp.s("䃮"));
        q3.p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f23491b;
        if (pVar != null && (g02 = pVar.g0(path, basicFileAttributes)) != null) {
            return g02;
        }
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        kotlin.jvm.internal.l0.o(visitFile, ProtectedSandApp.s("䃯"));
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @d5.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(@d5.d Path path, @d5.d IOException iOException) {
        FileVisitResult g02;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䃰"));
        kotlin.jvm.internal.l0.p(iOException, ProtectedSandApp.s("䃱"));
        q3.p<Path, IOException, FileVisitResult> pVar = this.f23492c;
        if (pVar != null && (g02 = pVar.g0(path, iOException)) != null) {
            return g02;
        }
        FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
        kotlin.jvm.internal.l0.o(visitFileFailed, ProtectedSandApp.s("䃲"));
        return visitFileFailed;
    }
}
