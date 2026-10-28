package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/io/File;", "Lkotlin/io/i;", "direction", "Lkotlin/io/h;", "J", "(Ljava/io/File;Lkotlin/io/i;)Lkotlin/io/h;", "M", "(Ljava/io/File;)Lkotlin/io/h;", "L", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes7.dex */
class m extends l {
    @fg.l
    public static final h J(@fg.l File file, @fg.l i iVar) {
        l0.p(file, ProtectedSandApp.s("搊\u0001"));
        l0.p(iVar, ProtectedSandApp.s("搋\u0001"));
        return new h(file, iVar);
    }

    public static /* synthetic */ h K(File file, i iVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            iVar = i.TOP_DOWN;
        }
        return J(file, iVar);
    }

    @fg.l
    public static final h L(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("搊\u0001"));
        return J(file, i.BOTTOM_UP);
    }

    @fg.l
    public static final h M(@fg.l File file) {
        l0.p(file, ProtectedSandApp.s("搊\u0001"));
        return J(file, i.TOP_DOWN);
    }
}
