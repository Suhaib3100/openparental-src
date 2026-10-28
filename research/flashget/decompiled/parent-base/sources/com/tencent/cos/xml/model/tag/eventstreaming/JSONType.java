package com.tencent.cos.xml.model.tag.eventstreaming;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOCUMENT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class JSONType {
    private static final /* synthetic */ JSONType[] $VALUES;
    public static final JSONType DOCUMENT;
    public static final JSONType LINES;
    private final String jsonType;

    static {
        String s4 = ProtectedSandApp.s("乮\u0001");
        JSONType jSONType = new JSONType(s4, 0, s4);
        DOCUMENT = jSONType;
        String s5 = ProtectedSandApp.s("乯\u0001");
        JSONType jSONType2 = new JSONType(s5, 1, s5);
        LINES = jSONType2;
        $VALUES = new JSONType[]{jSONType, jSONType2};
    }

    private JSONType(String str, int i4, String str2) {
        this.jsonType = str2;
    }

    public static JSONType fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("乲\u0001"));
        }
        for (JSONType jSONType : values()) {
            if (jSONType.toString().equals(str)) {
                return jSONType;
            }
        }
        throw new IllegalArgumentException(d.a(ProtectedSandApp.s("买\u0001"), str, ProtectedSandApp.s("乱\u0001")));
    }

    public static JSONType valueOf(String str) {
        return (JSONType) Enum.valueOf(JSONType.class, str);
    }

    public static JSONType[] values() {
        return (JSONType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.jsonType;
    }
}
