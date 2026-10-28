package com.tencent.cos.xml.model.tag.eventstreaming;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'USE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class FileHeaderInfo {
    private static final /* synthetic */ FileHeaderInfo[] $VALUES;
    public static final FileHeaderInfo IGNORE;
    public static final FileHeaderInfo NONE;
    public static final FileHeaderInfo USE;
    private final String headerInfo;

    static {
        String s4 = ProtectedSandApp.s("乇\u0001");
        FileHeaderInfo fileHeaderInfo = new FileHeaderInfo(s4, 0, s4);
        USE = fileHeaderInfo;
        String s5 = ProtectedSandApp.s("么\u0001");
        FileHeaderInfo fileHeaderInfo2 = new FileHeaderInfo(s5, 1, s5);
        IGNORE = fileHeaderInfo2;
        String s6 = ProtectedSandApp.s("义\u0001");
        FileHeaderInfo fileHeaderInfo3 = new FileHeaderInfo(s6, 2, s6);
        NONE = fileHeaderInfo3;
        $VALUES = new FileHeaderInfo[]{fileHeaderInfo, fileHeaderInfo2, fileHeaderInfo3};
    }

    private FileHeaderInfo(String str, int i4, String str2) {
        this.headerInfo = str2;
    }

    public static FileHeaderInfo fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("乌\u0001"));
        }
        for (FileHeaderInfo fileHeaderInfo : values()) {
            if (fileHeaderInfo.toString().equals(str)) {
                return fileHeaderInfo;
            }
        }
        throw new IllegalArgumentException(d.a(ProtectedSandApp.s("乊\u0001"), str, ProtectedSandApp.s("之\u0001")));
    }

    public static FileHeaderInfo valueOf(String str) {
        return (FileHeaderInfo) Enum.valueOf(FileHeaderInfo.class, str);
    }

    public static FileHeaderInfo[] values() {
        return (FileHeaderInfo[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.headerInfo;
    }
}
