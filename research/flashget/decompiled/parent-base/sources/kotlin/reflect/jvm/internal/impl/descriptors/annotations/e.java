package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnnotationUseSiteTarget.kt */
/* loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @fg.l
    private final String renderName;
    public static final e FIELD = new e(ProtectedSandApp.s("櫤\u0001"), 0, null, 1, null);
    public static final e FILE = new e(ProtectedSandApp.s("櫥\u0001"), 1, null, 1, null);
    public static final e PROPERTY = new e(ProtectedSandApp.s("櫦\u0001"), 2, null, 1, null);
    public static final e PROPERTY_GETTER = new e(ProtectedSandApp.s("櫨\u0001"), 3, ProtectedSandApp.s("櫧\u0001"));
    public static final e PROPERTY_SETTER = new e(ProtectedSandApp.s("櫪\u0001"), 4, ProtectedSandApp.s("櫩\u0001"));
    public static final e RECEIVER = new e(ProtectedSandApp.s("櫫\u0001"), 5, null, 1, null);
    public static final e CONSTRUCTOR_PARAMETER = new e(ProtectedSandApp.s("櫭\u0001"), 6, ProtectedSandApp.s("櫬\u0001"));
    public static final e SETTER_PARAMETER = new e(ProtectedSandApp.s("櫯\u0001"), 7, ProtectedSandApp.s("櫮\u0001"));
    public static final e PROPERTY_DELEGATE_FIELD = new e(ProtectedSandApp.s("櫱\u0001"), 8, ProtectedSandApp.s("櫰\u0001"));

    private static final /* synthetic */ e[] $values() {
        return new e[]{FIELD, FILE, PROPERTY, PROPERTY_GETTER, PROPERTY_SETTER, RECEIVER, CONSTRUCTOR_PARAMETER, SETTER_PARAMETER, PROPERTY_DELEGATE_FIELD};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private e(String str, int i4, String str2) {
        this.renderName = str2 == null ? de.a.f(name()) : str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    @fg.l
    public final String getRenderName() {
        return this.renderName;
    }

    /* synthetic */ e(String str, int i4, String str2, int i5, w wVar) {
        this(str, i4, (i5 & 1) != 0 ? null : str2);
    }
}
