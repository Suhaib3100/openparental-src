package okio;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* compiled from: DeflaterSink.kt */
@p3.i(name = "-DeflaterSinkExtensions")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0005"}, d2 = {"Lokio/m0;", "Ljava/util/zip/Deflater;", "deflater", "Lokio/q;", "a", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class b {
    @d5.d
    public static final q a(@d5.d m0 m0Var, @d5.d Deflater deflater) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("栆"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("标"));
        return new q(m0Var, deflater);
    }

    public static /* synthetic */ q b(m0 m0Var, Deflater deflater, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("栈"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("栉"));
        return new q(m0Var, deflater);
    }
}
