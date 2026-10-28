package androidx.content;

import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.k2;

/* compiled from: NamedNavArgument.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "name", "Lkotlin/Function1;", "Landroidx/navigation/r;", "Lkotlin/k2;", "Lkotlin/u;", "builder", "Landroidx/navigation/j;", "a", "(Ljava/lang/String;Lld/l;)Landroidx/navigation/j;", "navigation-common_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k {
    @l
    public static final j a(@l String name, @l ld.l<? super r, k2> builder) {
        l0.p(name, "name");
        l0.p(builder, "builder");
        r rVar = new r();
        builder.invoke(rVar);
        return new j(name, rVar.a());
    }
}
