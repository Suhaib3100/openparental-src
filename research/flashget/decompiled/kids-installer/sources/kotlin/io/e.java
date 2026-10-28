package kotlin.io;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0006"}, d2 = {"constructMessage", "", "file", "Ljava/io/File;", "other", "reason", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(ProtectedSandApp.s("㾍") + file2);
        }
        if (str != null) {
            sb.append(ProtectedSandApp.s("㾎").concat(str));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("㾏"));
        return sb2;
    }
}
