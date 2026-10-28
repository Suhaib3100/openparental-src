package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'STANDARD' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class COSStorageClass {
    private static final /* synthetic */ COSStorageClass[] $VALUES;
    public static final COSStorageClass ARCHIVE;
    public static final COSStorageClass COLD;
    public static final COSStorageClass DEEP_ARCHIVE;
    public static final COSStorageClass INTELLIGENT_TIERING;
    public static final COSStorageClass MAZ_COLD;
    public static final COSStorageClass MAZ_INTELLIGENT_TIERING;
    public static final COSStorageClass MAZ_STANDARD;
    public static final COSStorageClass MAZ_STANDARD_IA;
    public static final COSStorageClass STANDARD;
    public static final COSStorageClass STANDARD_IA;
    private String cosStorageClass;

    static {
        String s4 = ProtectedSandApp.s("㔕\u0001");
        COSStorageClass cOSStorageClass = new COSStorageClass(s4, 0, s4);
        STANDARD = cOSStorageClass;
        String s5 = ProtectedSandApp.s("㔖\u0001");
        COSStorageClass cOSStorageClass2 = new COSStorageClass(s5, 1, s5);
        STANDARD_IA = cOSStorageClass2;
        String s6 = ProtectedSandApp.s("㔗\u0001");
        COSStorageClass cOSStorageClass3 = new COSStorageClass(s6, 2, s6);
        COLD = cOSStorageClass3;
        String s7 = ProtectedSandApp.s("㔘\u0001");
        COSStorageClass cOSStorageClass4 = new COSStorageClass(s7, 3, s7);
        ARCHIVE = cOSStorageClass4;
        String s10 = ProtectedSandApp.s("㔙\u0001");
        COSStorageClass cOSStorageClass5 = new COSStorageClass(s10, 4, s10);
        DEEP_ARCHIVE = cOSStorageClass5;
        String s11 = ProtectedSandApp.s("㔚\u0001");
        COSStorageClass cOSStorageClass6 = new COSStorageClass(s11, 5, s11);
        INTELLIGENT_TIERING = cOSStorageClass6;
        String s12 = ProtectedSandApp.s("㔛\u0001");
        COSStorageClass cOSStorageClass7 = new COSStorageClass(s12, 6, s12);
        MAZ_STANDARD = cOSStorageClass7;
        String s13 = ProtectedSandApp.s("㔜\u0001");
        COSStorageClass cOSStorageClass8 = new COSStorageClass(s13, 7, s13);
        MAZ_STANDARD_IA = cOSStorageClass8;
        String s14 = ProtectedSandApp.s("㔝\u0001");
        COSStorageClass cOSStorageClass9 = new COSStorageClass(s14, 8, s14);
        MAZ_COLD = cOSStorageClass9;
        String s15 = ProtectedSandApp.s("㔞\u0001");
        COSStorageClass cOSStorageClass10 = new COSStorageClass(s15, 9, s15);
        MAZ_INTELLIGENT_TIERING = cOSStorageClass10;
        $VALUES = new COSStorageClass[]{cOSStorageClass, cOSStorageClass2, cOSStorageClass3, cOSStorageClass4, cOSStorageClass5, cOSStorageClass6, cOSStorageClass7, cOSStorageClass8, cOSStorageClass9, cOSStorageClass10};
    }

    private COSStorageClass(String str, int i4, String str2) {
        this.cosStorageClass = str2;
    }

    public static COSStorageClass fromString(String str) {
        for (COSStorageClass cOSStorageClass : values()) {
            if (cOSStorageClass.cosStorageClass.equalsIgnoreCase(str)) {
                return cOSStorageClass;
            }
        }
        return null;
    }

    public static COSStorageClass valueOf(String str) {
        return (COSStorageClass) Enum.valueOf(COSStorageClass.class, str);
    }

    public static COSStorageClass[] values() {
        return (COSStorageClass[]) $VALUES.clone();
    }

    public String getStorageClass() {
        return this.cosStorageClass;
    }
}
