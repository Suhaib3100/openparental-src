package kotlin.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KVisibility.kt */
@c1(version = "1.1")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/w;", "", "<init>", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class w {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w PUBLIC = new w(ProtectedSandApp.s("苃\u0001"), 0);
    public static final w PROTECTED = new w(ProtectedSandApp.s("苄\u0001"), 1);
    public static final w INTERNAL = new w(ProtectedSandApp.s("苅\u0001"), 2);
    public static final w PRIVATE = new w(ProtectedSandApp.s("苆\u0001"), 3);

    private static final /* synthetic */ w[] $values() {
        return new w[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    static {
        w[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private w(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<w> getEntries() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
