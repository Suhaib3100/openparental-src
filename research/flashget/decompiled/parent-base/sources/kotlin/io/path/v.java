package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;

/* compiled from: FileVisitorBuilder.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0013\u001a\u00020\u000426\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014JG\u0010\u0016\u001a\u00020\u000426\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014JG\u0010\u0019\u001a\u00020\u000426\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0014JI\u0010\u001a\u001a\u00020\u000428\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\u0017¢\u0006\f\b\u000e\u0012\b\b\t\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR*\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR,\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006&"}, d2 = {"Lkotlin/io/path/v;", "Lkotlin/io/path/u;", "<init>", "()V", "Lkotlin/k2;", "f", "", "function", "", "name", "g", "(Ljava/lang/Object;Ljava/lang/String;)V", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/r0;", "directory", "Ljava/nio/file/attribute/BasicFileAttributes;", "attributes", "Ljava/nio/file/FileVisitResult;", "b", "(Lld/p;)V", "file", "a", "Ljava/io/IOException;", "exception", "d", "c", "Ljava/nio/file/FileVisitor;", "e", "()Ljava/nio/file/FileVisitor;", "Lld/p;", "onPreVisitDirectory", "onVisitFile", "onVisitFileFailed", "onPostVisitDirectory", "", "Z", "isBuilt", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@t
/* loaded from: classes7.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onPreVisitDirectory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onVisitFile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super Path, ? super IOException, ? extends FileVisitResult> onVisitFileFailed;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private ld.p<? super Path, ? super IOException, ? extends FileVisitResult> onPostVisitDirectory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isBuilt;

    private final void f() {
        if (this.isBuilt) {
            throw new IllegalStateException(ProtectedSandApp.s("撳\u0001"));
        }
    }

    private final void g(Object function, String name) {
        if (function != null) {
            throw new IllegalStateException(androidx.compose.runtime.changelist.j.a(name, ProtectedSandApp.s("撴\u0001")));
        }
    }

    @Override // kotlin.io.path.u
    public void a(@fg.l ld.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, ProtectedSandApp.s("撵\u0001"));
        f();
        g(this.onVisitFile, ProtectedSandApp.s("撶\u0001"));
        this.onVisitFile = function;
    }

    @Override // kotlin.io.path.u
    public void b(@fg.l ld.p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, ProtectedSandApp.s("撵\u0001"));
        f();
        g(this.onPreVisitDirectory, ProtectedSandApp.s("撷\u0001"));
        this.onPreVisitDirectory = function;
    }

    @Override // kotlin.io.path.u
    public void c(@fg.l ld.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, ProtectedSandApp.s("撵\u0001"));
        f();
        g(this.onPostVisitDirectory, ProtectedSandApp.s("撸\u0001"));
        this.onPostVisitDirectory = function;
    }

    @Override // kotlin.io.path.u
    public void d(@fg.l ld.p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        kotlin.jvm.internal.l0.p(function, ProtectedSandApp.s("撵\u0001"));
        f();
        g(this.onVisitFileFailed, ProtectedSandApp.s("撹\u0001"));
        this.onVisitFileFailed = function;
    }

    @fg.l
    public final FileVisitor<Path> e() {
        f();
        this.isBuilt = true;
        return i.a(new x(this.onPreVisitDirectory, this.onVisitFile, this.onVisitFileFailed, this.onPostVisitDirectory));
    }
}
