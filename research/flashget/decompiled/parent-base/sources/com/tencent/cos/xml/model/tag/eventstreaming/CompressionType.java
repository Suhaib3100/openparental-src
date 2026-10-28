package com.tencent.cos.xml.model.tag.eventstreaming;

import android.support.v4.media.d;
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
/* loaded from: classes7.dex */
public final class CompressionType {
    private static final /* synthetic */ CompressionType[] $VALUES;
    public static final CompressionType BZIP2;
    public static final CompressionType GZIP;
    public static final CompressionType NONE;
    private final String compressionType;

    static {
        String s4 = ProtectedSandApp.s("乁\u0001");
        CompressionType compressionType = new CompressionType(s4, 0, s4);
        NONE = compressionType;
        String s5 = ProtectedSandApp.s("乂\u0001");
        CompressionType compressionType2 = new CompressionType(s5, 1, s5);
        GZIP = compressionType2;
        String s6 = ProtectedSandApp.s("乃\u0001");
        CompressionType compressionType3 = new CompressionType(s6, 2, s6);
        BZIP2 = compressionType3;
        $VALUES = new CompressionType[]{compressionType, compressionType2, compressionType3};
    }

    private CompressionType(String str, int i4, String str2) {
        this.compressionType = str2;
    }

    public static CompressionType fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("乆\u0001"));
        }
        for (CompressionType compressionType : values()) {
            if (compressionType.toString().equals(str)) {
                return compressionType;
            }
        }
        throw new IllegalArgumentException(d.a(ProtectedSandApp.s("乄\u0001"), str, ProtectedSandApp.s("久\u0001")));
    }

    public static CompressionType valueOf(String str) {
        return (CompressionType) Enum.valueOf(CompressionType.class, str);
    }

    public static CompressionType[] values() {
        return (CompressionType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.compressionType;
    }
}
