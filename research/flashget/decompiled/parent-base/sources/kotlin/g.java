package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContractBuilder.kt */
@f
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lfd/g;", "", "<init>", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.internal.b
@c1(version = "1.3")
/* loaded from: classes7.dex */
public final class g {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @kotlin.internal.b
    public static final g AT_MOST_ONCE = new g(ProtectedSandApp.s("恇\u0001"), 0);

    @kotlin.internal.b
    public static final g AT_LEAST_ONCE = new g(ProtectedSandApp.s("恈\u0001"), 1);

    @kotlin.internal.b
    public static final g EXACTLY_ONCE = new g(ProtectedSandApp.s("恉\u0001"), 2);

    @kotlin.internal.b
    public static final g UNKNOWN = new g(ProtectedSandApp.s("恊\u0001"), 3);

    private static final /* synthetic */ g[] $values() {
        return new g[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private g(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
