package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/s;", "Lkotlin/io/FileSystemException;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class s extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@fg.l File file) {
        super(file, null, null, 6, null);
        l0.p(file, ProtectedSandApp.s("擄\u0001"));
    }
}
