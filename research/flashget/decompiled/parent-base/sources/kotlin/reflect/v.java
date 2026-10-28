package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVariance.kt */
@c1(version = "1.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/v;", "", "<init>", "(Ljava/lang/String;I)V", "INVARIANT", "IN", "OUT", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class v {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v INVARIANT = new v(ProtectedSandApp.s("苀\u0001"), 0);
    public static final v IN = new v(ProtectedSandApp.s("苁\u0001"), 1);
    public static final v OUT = new v(ProtectedSandApp.s("苂\u0001"), 2);

    private static final /* synthetic */ v[] $values() {
        return new v[]{INVARIANT, IN, OUT};
    }

    static {
        v[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private v(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<v> getEntries() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
