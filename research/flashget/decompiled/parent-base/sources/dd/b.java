package dd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Ldd/b;", "", "<init>", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b CLASS = new b(ProtectedSandApp.s("径\u0001"), 0);
    public static final b ANNOTATION_CLASS = new b(ProtectedSandApp.s("待\u0001"), 1);
    public static final b TYPE_PARAMETER = new b(ProtectedSandApp.s("徆\u0001"), 2);
    public static final b PROPERTY = new b(ProtectedSandApp.s("徇\u0001"), 3);
    public static final b FIELD = new b(ProtectedSandApp.s("很\u0001"), 4);
    public static final b LOCAL_VARIABLE = new b(ProtectedSandApp.s("徉\u0001"), 5);
    public static final b VALUE_PARAMETER = new b(ProtectedSandApp.s("徊\u0001"), 6);
    public static final b CONSTRUCTOR = new b(ProtectedSandApp.s("律\u0001"), 7);
    public static final b FUNCTION = new b(ProtectedSandApp.s("後\u0001"), 8);
    public static final b PROPERTY_GETTER = new b(ProtectedSandApp.s("徍\u0001"), 9);
    public static final b PROPERTY_SETTER = new b(ProtectedSandApp.s("徎\u0001"), 10);
    public static final b TYPE = new b(ProtectedSandApp.s("徏\u0001"), 11);
    public static final b EXPRESSION = new b(ProtectedSandApp.s("徐\u0001"), 12);
    public static final b FILE = new b(ProtectedSandApp.s("徑\u0001"), 13);

    @c1(version = "1.1")
    public static final b TYPEALIAS = new b(ProtectedSandApp.s("徒\u0001"), 14);

    private static final /* synthetic */ b[] $values() {
        return new b[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private b(String str, int i4) {
    }

    @l
    public static kotlin.enums.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
