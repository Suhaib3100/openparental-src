package kotlin.io.path;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;

/* compiled from: PathUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/io/path/PathRelativizer;", "", "()V", "emptyPath", "Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "parentPath", "tryRelativeTo", "path", "base", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.io.path.e0, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class PathRelativizer {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final PathRelativizer f23434a = new PathRelativizer();

    /* renamed from: b, reason: collision with root package name */
    private static final Path f23435b;

    /* renamed from: c, reason: collision with root package name */
    private static final Path f23436c;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        f23435b = path;
        path2 = Paths.get(ProtectedSandApp.s("䁎"), new String[0]);
        f23436c = path2;
    }

    private PathRelativizer() {
    }

    @d5.d
    public final Path a(@d5.d Path path, @d5.d Path path2) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        boolean J1;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        String A6;
        Path name;
        Path name2;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("䁏"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("䁐"));
        normalize = path2.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i5 = 0; i5 < min; i5++) {
            name = normalize.getName(i5);
            Path path3 = f23436c;
            if (!kotlin.jvm.internal.l0.g(name, path3)) {
                break;
            }
            name2 = normalize2.getName(i5);
            if (!kotlin.jvm.internal.l0.g(name2, path3)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("䁑"));
            }
        }
        if (kotlin.jvm.internal.l0.g(normalize2, normalize) || !kotlin.jvm.internal.l0.g(normalize, f23435b)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            kotlin.jvm.internal.l0.o(separator, ProtectedSandApp.s("䁒"));
            J1 = kotlin.text.e0.J1(obj, separator, false, 2, null);
            if (J1) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                A6 = kotlin.text.j0.A6(obj, separator2.length());
                normalize2 = fileSystem2.getPath(A6, new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        kotlin.jvm.internal.l0.m(normalize2);
        return normalize2;
    }
}
