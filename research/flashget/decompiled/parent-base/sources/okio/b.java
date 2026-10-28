package okio;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.zip.Deflater;
import kotlin.Metadata;

/* compiled from: DeflaterSink.kt */
@kd.i(name = "-DeflaterSinkExtensions")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lokio/m0;", "Ljava/util/zip/Deflater;", "deflater", "Lokio/q;", "a", "(Lokio/m0;Ljava/util/zip/Deflater;)Lokio/q;", "okio"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class b {
    @fg.l
    public static final q a(@fg.l m0 m0Var, @fg.l Deflater deflater) {
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("Ἔ"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("Ἕ"));
        return new q(m0Var, deflater);
    }

    public static /* synthetic */ q b(m0 m0Var, Deflater deflater, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            deflater = new Deflater();
        }
        kotlin.jvm.internal.l0.p(m0Var, ProtectedSandApp.s("Ἔ"));
        kotlin.jvm.internal.l0.p(deflater, ProtectedSandApp.s("Ἕ"));
        return new q(m0Var, deflater);
    }
}
