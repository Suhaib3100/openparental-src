package kotlin.collections;

import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.MapBuilder;

@Metadata(d1 = {"kotlin/collections/MapsKt__MapWithDefaultKt", "kotlin/collections/MapsKt__MapsJVMKt", "kotlin/collections/MapsKt__MapsKt", "kotlin/collections/MapsKt___MapsJvmKt", "kotlin/collections/MapsKt___MapsKt"}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes6.dex */
public final class c1 extends h1 {
    private c1() {
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static Map g() {
        return new MapBuilder();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @d5.d
    public static Map h(int i5) {
        return new MapBuilder(i5);
    }
}
