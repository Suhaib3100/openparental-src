package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;

/* compiled from: FileVisitorBuilder.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JB\u0010\u0005\u001a\u00020\u001128\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\n\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\f\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\r\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/io/path/FileVisitorBuilderImpl;", "Lkotlin/io/path/FileVisitorBuilder;", "()V", "isBuilt", "", "onPostVisitDirectory", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Ljava/io/IOException;", "Ljava/nio/file/FileVisitResult;", "onPreVisitDirectory", "Ljava/nio/file/attribute/BasicFileAttributes;", "onVisitFile", "onVisitFileFailed", "build", "Ljava/nio/file/FileVisitor;", "checkIsNotBuilt", "", "checkNotDefined", "function", "", "name", "", "Lkotlin/ParameterName;", "directory", "exception", "attributes", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalPathApi
/* renamed from: kotlin.io.path.q, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class FileVisitorBuilderImpl implements FileVisitorBuilder {

    /* renamed from: a, reason: collision with root package name */
    @d5.e
    private q3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f23485a;

    /* renamed from: b, reason: collision with root package name */
    @d5.e
    private q3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f23486b;

    /* renamed from: c, reason: collision with root package name */
    @d5.e
    private q3.p<? super Path, ? super IOException, ? extends FileVisitResult> f23487c;

    /* renamed from: d, reason: collision with root package name */
    @d5.e
    private q3.p<? super Path, ? super IOException, ? extends FileVisitResult> f23488d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f23489e;

    private final void f() {
        if (this.f23489e) {
            throw new IllegalStateException(ProtectedSandApp.s("䃞"));
        }
    }

    private final void g(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(androidx.concurrent.futures.b.a(str, ProtectedSandApp.s("䃟")));
        }
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void a(@d5.d q3.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("䃠"));
        f();
        g(this.f23487c, ProtectedSandApp.s("䃡"));
        this.f23487c = pVar;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void b(@d5.d q3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("䃢"));
        f();
        g(this.f23486b, ProtectedSandApp.s("䃣"));
        this.f23486b = pVar;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void c(@d5.d q3.p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("䃤"));
        f();
        g(this.f23488d, ProtectedSandApp.s("䃥"));
        this.f23488d = pVar;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void d(@d5.d q3.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("䃦"));
        f();
        g(this.f23485a, ProtectedSandApp.s("䃧"));
        this.f23485a = pVar;
    }

    @d5.d
    public final FileVisitor<Path> e() {
        f();
        this.f23489e = true;
        return new FileVisitorImpl(this.f23485a, this.f23486b, this.f23487c, this.f23488d);
    }
}
