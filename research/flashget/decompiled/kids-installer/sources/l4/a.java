package l4;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;
import kotlin.text.MatchGroup;
import kotlin.text.MatchGroupCollection;
import kotlin.text.MatchNamedGroupCollection;
import p3.i;

/* compiled from: RegexExtensions.kt */
@i(name = "RegexExtensionsJDK8Kt")
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¨\u0006\u0005"}, d2 = {"get", "Lkotlin/text/MatchGroup;", "Lkotlin/text/MatchGroupCollection;", "name", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.text", xi = 48)
/* loaded from: classes5.dex */
public final class a {
    @SinceKotlin(version = "1.2")
    @e
    public static final MatchGroup a(@d MatchGroupCollection matchGroupCollection, @d String str) {
        l0.p(matchGroupCollection, ProtectedSandApp.s("庬"));
        l0.p(str, ProtectedSandApp.s("庭"));
        MatchNamedGroupCollection matchNamedGroupCollection = matchGroupCollection instanceof MatchNamedGroupCollection ? (MatchNamedGroupCollection) matchGroupCollection : null;
        if (matchNamedGroupCollection != null) {
            return matchNamedGroupCollection.c(str);
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("庮"));
    }
}
