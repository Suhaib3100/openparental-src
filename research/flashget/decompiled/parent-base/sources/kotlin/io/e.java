package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Exceptions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/io/File;", "file", "other", "", "reason", "b", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(ProtectedSandApp.s("掭\u0001") + file2);
        }
        if (str != null) {
            sb.append(ProtectedSandApp.s("掮\u0001").concat(str));
        }
        String sb2 = sb.toString();
        l0.o(sb2, ProtectedSandApp.s("掯\u0001"));
        return sb2;
    }
}
