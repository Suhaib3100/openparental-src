package kotlin.io.path;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: PathRecursiveFunctions.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlin/io/path/f;", "Lkotlin/io/path/a;", "<init>", "()V", "Ljava/nio/file/Path;", "target", "", "followLinks", "Lkotlin/io/path/b;", "a", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Lkotlin/io/path/b;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@t
/* loaded from: classes7.dex */
final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final f f75221a = new f();

    private f() {
    }

    @Override // kotlin.io.path.a
    @fg.l
    public b a(@fg.l Path path, @fg.l Path path2, boolean z4) {
        kotlin.jvm.internal.l0.p(path, ProtectedSandApp.s("摭\u0001"));
        kotlin.jvm.internal.l0.p(path2, ProtectedSandApp.s("摮\u0001"));
        LinkOption[] a5 = z.f75259a.a(z4);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a5, a5.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(a5, a5.length);
            kotlin.jvm.internal.l0.o(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), ProtectedSandApp.s("摯\u0001"));
        }
        return b.CONTINUE;
    }
}
