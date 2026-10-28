package kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/m;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class m {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m WARNING = new m(ProtectedSandApp.s("斀\u0001"), 0);
    public static final m ERROR = new m(ProtectedSandApp.s("斁\u0001"), 1);
    public static final m HIDDEN = new m(ProtectedSandApp.s("斂\u0001"), 2);

    private static final /* synthetic */ m[] $values() {
        return new m[]{WARNING, ERROR, HIDDEN};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private m(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<m> getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
