package ud;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LookupLocation.kt */
/* loaded from: classes8.dex */
public final class d implements b {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FROM_IDE = new d(ProtectedSandApp.s("ꌧ\u0001"), 0);
    public static final d FROM_BACKEND = new d(ProtectedSandApp.s("ꌨ\u0001"), 1);
    public static final d FROM_TEST = new d(ProtectedSandApp.s("ꌩ\u0001"), 2);
    public static final d FROM_BUILTINS = new d(ProtectedSandApp.s("ꌪ\u0001"), 3);
    public static final d WHEN_CHECK_DECLARATION_CONFLICTS = new d(ProtectedSandApp.s("ꌫ\u0001"), 4);
    public static final d WHEN_CHECK_OVERRIDES = new d(ProtectedSandApp.s("ꌬ\u0001"), 5);
    public static final d FOR_SCRIPT = new d(ProtectedSandApp.s("ꌭ\u0001"), 6);
    public static final d FROM_REFLECTION = new d(ProtectedSandApp.s("ꌮ\u0001"), 7);
    public static final d WHEN_RESOLVE_DECLARATION = new d(ProtectedSandApp.s("ꌯ\u0001"), 8);
    public static final d WHEN_GET_DECLARATION_SCOPE = new d(ProtectedSandApp.s("ꌰ\u0001"), 9);
    public static final d WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS = new d(ProtectedSandApp.s("ꌱ\u0001"), 10);
    public static final d FOR_ALREADY_TRACKED = new d(ProtectedSandApp.s("ꌲ\u0001"), 11);
    public static final d WHEN_GET_ALL_DESCRIPTORS = new d(ProtectedSandApp.s("ꌳ\u0001"), 12);
    public static final d WHEN_TYPING = new d(ProtectedSandApp.s("ꌴ\u0001"), 13);
    public static final d WHEN_GET_SUPER_MEMBERS = new d(ProtectedSandApp.s("ꌵ\u0001"), 14);
    public static final d FOR_NON_TRACKED_SCOPE = new d(ProtectedSandApp.s("ꌶ\u0001"), 15);
    public static final d FROM_SYNTHETIC_SCOPE = new d(ProtectedSandApp.s("ꌷ\u0001"), 16);
    public static final d FROM_DESERIALIZATION = new d(ProtectedSandApp.s("ꌸ\u0001"), 17);
    public static final d FROM_JAVA_LOADER = new d(ProtectedSandApp.s("ꌹ\u0001"), 18);
    public static final d WHEN_GET_LOCAL_VARIABLE = new d(ProtectedSandApp.s("ꌺ\u0001"), 19);
    public static final d WHEN_FIND_BY_FQNAME = new d(ProtectedSandApp.s("ꌻ\u0001"), 20);
    public static final d WHEN_GET_COMPANION_OBJECT = new d(ProtectedSandApp.s("ꌼ\u0001"), 21);
    public static final d FOR_DEFAULT_IMPORTS = new d(ProtectedSandApp.s("ꌽ\u0001"), 22);

    private static final /* synthetic */ d[] $values() {
        return new d[]{FROM_IDE, FROM_BACKEND, FROM_TEST, FROM_BUILTINS, WHEN_CHECK_DECLARATION_CONFLICTS, WHEN_CHECK_OVERRIDES, FOR_SCRIPT, FROM_REFLECTION, WHEN_RESOLVE_DECLARATION, WHEN_GET_DECLARATION_SCOPE, WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS, FOR_ALREADY_TRACKED, WHEN_GET_ALL_DESCRIPTORS, WHEN_TYPING, WHEN_GET_SUPER_MEMBERS, FOR_NON_TRACKED_SCOPE, FROM_SYNTHETIC_SCOPE, FROM_DESERIALIZATION, FROM_JAVA_LOADER, WHEN_GET_LOCAL_VARIABLE, WHEN_FIND_BY_FQNAME, WHEN_GET_COMPANION_OBJECT, FOR_DEFAULT_IMPORTS};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private d(String str, int i4) {
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // ud.b
    @m
    public a getLocation() {
        return null;
    }
}
