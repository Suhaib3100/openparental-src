package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;

/* compiled from: PathUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/io/path/k0;", "", "<init>", "()V", "Ljava/nio/file/Path;", "path", "base", "a", "(Ljava/nio/file/Path;Ljava/nio/file/Path;)Ljava/nio/file/Path;", "kotlin.jvm.PlatformType", "b", "Ljava/nio/file/Path;", "emptyPath", "c", "parentPath", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final k0 f75225a = new k0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Path emptyPath;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Path parentPath;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        emptyPath = path;
        path2 = Paths.get(ProtectedSandApp.s("摰\u0001"), new String[0]);
        parentPath = path2;
    }

    private k0() {
    }

    @fg.l
    public final Path a(@fg.l Path path, @fg.l Path base) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        Path name;
        Path name2;
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摱\u0001"));
        kotlin.jvm.internal.l0.p(base, ProtectedSandApp.s("摲\u0001"));
        normalize = base.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i4 = 0; i4 < min; i4++) {
            name = normalize.getName(i4);
            Path path2 = parentPath;
            if (!kotlin.jvm.internal.l0.g(name, path2)) {
                break;
            }
            name2 = normalize2.getName(i4);
            if (!kotlin.jvm.internal.l0.g(name2, path2)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("摳\u0001"));
            }
        }
        if (kotlin.jvm.internal.l0.g(normalize2, normalize) || !kotlin.jvm.internal.l0.g(normalize, emptyPath)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            kotlin.jvm.internal.l0.o(separator, ProtectedSandApp.s("摴\u0001"));
            if (kotlin.text.v.J1(obj, separator, false, 2, null)) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                normalize2 = fileSystem2.getPath(kotlin.text.v.A6(obj, separator2.length()), new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        kotlin.jvm.internal.l0.m(normalize2);
        return normalize2;
    }
}
