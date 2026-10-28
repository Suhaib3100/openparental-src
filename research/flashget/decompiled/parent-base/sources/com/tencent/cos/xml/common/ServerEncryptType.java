package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class ServerEncryptType {
    private static final /* synthetic */ ServerEncryptType[] $VALUES;
    public static final ServerEncryptType NONE;
    public static final ServerEncryptType SSE_C;
    public static final ServerEncryptType SSE_COS;
    public static final ServerEncryptType SSE_KMS;
    private String type;

    static {
        String s4 = ProtectedSandApp.s("㕨\u0001");
        ServerEncryptType serverEncryptType = new ServerEncryptType(s4, 0, s4);
        NONE = serverEncryptType;
        ServerEncryptType serverEncryptType2 = new ServerEncryptType(ProtectedSandApp.s("㕪\u0001"), 1, ProtectedSandApp.s("㕩\u0001"));
        SSE_C = serverEncryptType2;
        ServerEncryptType serverEncryptType3 = new ServerEncryptType(ProtectedSandApp.s("㕬\u0001"), 2, ProtectedSandApp.s("㕫\u0001"));
        SSE_COS = serverEncryptType3;
        ServerEncryptType serverEncryptType4 = new ServerEncryptType(ProtectedSandApp.s("㕮\u0001"), 3, ProtectedSandApp.s("㕭\u0001"));
        SSE_KMS = serverEncryptType4;
        $VALUES = new ServerEncryptType[]{serverEncryptType, serverEncryptType2, serverEncryptType3, serverEncryptType4};
    }

    private ServerEncryptType(String str, int i4, String str2) {
        this.type = str2;
    }

    public static ServerEncryptType fromString(String str) {
        for (ServerEncryptType serverEncryptType : values()) {
            if (serverEncryptType.type.equalsIgnoreCase(str)) {
                return serverEncryptType;
            }
        }
        return null;
    }

    public static ServerEncryptType valueOf(String str) {
        return (ServerEncryptType) Enum.valueOf(ServerEncryptType.class, str);
    }

    public static ServerEncryptType[] values() {
        return (ServerEncryptType[]) $VALUES.clone();
    }

    public String getType() {
        return this.type;
    }
}
