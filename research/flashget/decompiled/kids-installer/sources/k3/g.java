package k3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.internal.ContractsDsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContractBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContractsDsl
@f
@SinceKotlin(version = "1.3")
/* loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @ContractsDsl
    public static final g AT_MOST_ONCE = new g(ProtectedSandApp.s("㜖"), 0);

    @ContractsDsl
    public static final g AT_LEAST_ONCE = new g(ProtectedSandApp.s("㜗"), 1);

    @ContractsDsl
    public static final g EXACTLY_ONCE = new g(ProtectedSandApp.s("㜘"), 2);

    @ContractsDsl
    public static final g UNKNOWN = new g(ProtectedSandApp.s("㜙"), 3);

    private static final /* synthetic */ g[] $values() {
        return new g[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private g(String str, int i5) {
    }

    @d5.d
    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
