package kotlin.collections;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/r1;", "", "<init>", "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class r1 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ r1[] $VALUES;
    public static final r1 Ready = new r1(ProtectedSandApp.s("戌\u0001"), 0);
    public static final r1 NotReady = new r1(ProtectedSandApp.s("戍\u0001"), 1);
    public static final r1 Done = new r1(ProtectedSandApp.s("戎\u0001"), 2);
    public static final r1 Failed = new r1(ProtectedSandApp.s("戏\u0001"), 3);

    private static final /* synthetic */ r1[] $values() {
        return new r1[]{Ready, NotReady, Done, Failed};
    }

    static {
        r1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private r1(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<r1> getEntries() {
        return $ENTRIES;
    }

    public static r1 valueOf(String str) {
        return (r1) Enum.valueOf(r1.class, str);
    }

    public static r1[] values() {
        return (r1[]) $VALUES.clone();
    }
}
