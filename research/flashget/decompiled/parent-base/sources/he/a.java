package he;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kd.i;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.text.n;
import kotlin.text.o;

/* compiled from: RegexExtensions.kt */
@i(name = "RegexExtensionsJDK8Kt")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/text/n;", "", "name", "Lkotlin/text/m;", "a", "(Lkotlin/text/n;Ljava/lang/String;)Lkotlin/text/m;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    @m
    @c1(version = "1.2")
    public static final kotlin.text.m a(@l n nVar, @l String str) {
        l0.p(nVar, ProtectedSandApp.s("恏\u0001"));
        l0.p(str, ProtectedSandApp.s("恐\u0001"));
        o oVar = nVar instanceof o ? (o) nVar : null;
        if (oVar != null) {
            return oVar.get(str);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("恑\u0001"));
    }
}
