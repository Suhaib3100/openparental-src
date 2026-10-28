package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'READ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class Permission {
    private static final /* synthetic */ Permission[] $VALUES;
    public static final Permission FULL_CONTROL;
    public static final Permission READ;
    public static final Permission WRITE;
    private String permission;

    static {
        String s4 = ProtectedSandApp.s("㕀\u0001");
        Permission permission = new Permission(s4, 0, s4);
        READ = permission;
        String s5 = ProtectedSandApp.s("㕁\u0001");
        Permission permission2 = new Permission(s5, 1, s5);
        WRITE = permission2;
        String s6 = ProtectedSandApp.s("㕂\u0001");
        Permission permission3 = new Permission(s6, 2, s6);
        FULL_CONTROL = permission3;
        $VALUES = new Permission[]{permission, permission2, permission3};
    }

    private Permission(String str, int i4, String str2) {
        this.permission = str2;
    }

    public static Permission fromValue(String str) {
        for (Permission permission : values()) {
            if (permission.permission.equalsIgnoreCase(str)) {
                return permission;
            }
        }
        return null;
    }

    public static Permission valueOf(String str) {
        return (Permission) Enum.valueOf(Permission.class, str);
    }

    public static Permission[] values() {
        return (Permission[]) $VALUES.clone();
    }

    public String getPermission() {
        return this.permission;
    }
}
