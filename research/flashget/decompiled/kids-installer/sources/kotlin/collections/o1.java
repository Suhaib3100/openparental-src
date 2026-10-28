package kotlin.collections;

import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.SetBuilder;

@Metadata(d1 = {"kotlin/collections/SetsKt__SetsJVMKt", "kotlin/collections/SetsKt__SetsKt", "kotlin/collections/SetsKt___SetsKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class o1 extends r1 {
    private o1() {
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static Set d() {
        return new SetBuilder();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static Set e(int i5) {
        return new SetBuilder(i5);
    }

    @d5.d
    public static Set k() {
        return EmptySet.f23181o;
    }
}
