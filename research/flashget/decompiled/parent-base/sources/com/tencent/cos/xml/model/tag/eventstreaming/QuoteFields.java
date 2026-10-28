package com.tencent.cos.xml.model.tag.eventstreaming;

import android.support.v4.media.d;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALWAYS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class QuoteFields {
    private static final /* synthetic */ QuoteFields[] $VALUES;
    public static final QuoteFields ALWAYS;
    public static final QuoteFields ASNEEDED;
    private final String value;

    static {
        String s4 = ProtectedSandApp.s("亄\u0001");
        QuoteFields quoteFields = new QuoteFields(s4, 0, s4);
        ALWAYS = quoteFields;
        String s5 = ProtectedSandApp.s("亅\u0001");
        QuoteFields quoteFields2 = new QuoteFields(s5, 1, s5);
        ASNEEDED = quoteFields2;
        $VALUES = new QuoteFields[]{quoteFields, quoteFields2};
    }

    private QuoteFields(String str, int i4, String str2) {
        this.value = str2;
    }

    public static QuoteFields fromValue(String str) {
        if (str == null || "".equals(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("予\u0001"));
        }
        for (QuoteFields quoteFields : values()) {
            if (quoteFields.toString().equals(str)) {
                return quoteFields;
            }
        }
        throw new IllegalArgumentException(d.a(ProtectedSandApp.s("了\u0001"), str, ProtectedSandApp.s("亇\u0001")));
    }

    public static QuoteFields valueOf(String str) {
        return (QuoteFields) Enum.valueOf(QuoteFields.class, str);
    }

    public static QuoteFields[] values() {
        return (QuoteFields[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
