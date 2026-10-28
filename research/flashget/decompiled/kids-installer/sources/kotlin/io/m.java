package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0007"}, d2 = {"walk", "Lkotlin/io/FileTreeWalk;", "Ljava/io/File;", "direction", "Lkotlin/io/FileWalkDirection;", "walkBottomUp", "walkTopDown", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes6.dex */
class m extends l {
    @d5.d
    public static final FileTreeWalk J(@d5.d File file, @d5.d FileWalkDirection fileWalkDirection) {
        l0.p(file, ProtectedSandApp.s("緒"));
        l0.p(fileWalkDirection, ProtectedSandApp.s("緓"));
        return new FileTreeWalk(file, fileWalkDirection);
    }

    public static /* synthetic */ FileTreeWalk K(File file, FileWalkDirection fileWalkDirection, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return J(file, fileWalkDirection);
    }

    @d5.d
    public static final FileTreeWalk L(@d5.d File file) {
        l0.p(file, ProtectedSandApp.s("緔"));
        return J(file, FileWalkDirection.BOTTOM_UP);
    }

    @d5.d
    public static final FileTreeWalk M(@d5.d File file) {
        l0.p(file, ProtectedSandApp.s("緕"));
        return J(file, FileWalkDirection.TOP_DOWN);
    }
}
