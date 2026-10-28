package kotlin.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@c1(version = "1.2")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/internal/q;", "", "<init>", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class q {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q LANGUAGE_VERSION = new q(ProtectedSandApp.s("掚\u0001"), 0);
    public static final q COMPILER_VERSION = new q(ProtectedSandApp.s("掛\u0001"), 1);
    public static final q API_VERSION = new q(ProtectedSandApp.s("掜\u0001"), 2);

    private static final /* synthetic */ q[] $values() {
        return new q[]{LANGUAGE_VERSION, COMPILER_VERSION, API_VERSION};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private q(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<q> getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
