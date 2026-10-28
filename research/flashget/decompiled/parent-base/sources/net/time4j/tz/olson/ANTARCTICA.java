package net.time4j.tz.olson;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import qe.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CASEY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class ANTARCTICA implements a {
    private static final /* synthetic */ ANTARCTICA[] $VALUES;
    public static final ANTARCTICA CASEY;
    public static final ANTARCTICA DAVIS;
    public static final ANTARCTICA DUMONTDURVILLE;
    public static final ANTARCTICA MACQUARIE;
    public static final ANTARCTICA MAWSON;
    public static final ANTARCTICA MCMURDO;
    public static final ANTARCTICA PALMER;
    public static final ANTARCTICA ROTHERA;
    public static final ANTARCTICA SYOWA;
    public static final ANTARCTICA VOSTOK;
    private final String city;
    private final String country;

    /* renamed from: id, reason: collision with root package name */
    private final String f83633id;

    static {
        String s4 = ProtectedSandApp.s("魂\u0001");
        String s5 = ProtectedSandApp.s("魃\u0001");
        String s6 = ProtectedSandApp.s("魄\u0001");
        ANTARCTICA antarctica = new ANTARCTICA(s4, 0, s5, s6);
        CASEY = antarctica;
        ANTARCTICA antarctica2 = new ANTARCTICA(ProtectedSandApp.s("魆\u0001"), 1, ProtectedSandApp.s("魅\u0001"), s6);
        DAVIS = antarctica2;
        ANTARCTICA antarctica3 = new ANTARCTICA(ProtectedSandApp.s("魈\u0001"), 2, ProtectedSandApp.s("魇\u0001"), s6);
        DUMONTDURVILLE = antarctica3;
        ANTARCTICA antarctica4 = new ANTARCTICA(ProtectedSandApp.s("魋\u0001"), 3, ProtectedSandApp.s("魉\u0001"), ProtectedSandApp.s("魊\u0001"));
        MACQUARIE = antarctica4;
        ANTARCTICA antarctica5 = new ANTARCTICA(ProtectedSandApp.s("魍\u0001"), 4, ProtectedSandApp.s("魌\u0001"), s6);
        MAWSON = antarctica5;
        ANTARCTICA antarctica6 = new ANTARCTICA(ProtectedSandApp.s("魏\u0001"), 5, ProtectedSandApp.s("魎\u0001"), s6);
        MCMURDO = antarctica6;
        ANTARCTICA antarctica7 = new ANTARCTICA(ProtectedSandApp.s("魑\u0001"), 6, ProtectedSandApp.s("魐\u0001"), s6);
        PALMER = antarctica7;
        ANTARCTICA antarctica8 = new ANTARCTICA(ProtectedSandApp.s("魓\u0001"), 7, ProtectedSandApp.s("魒\u0001"), s6);
        ROTHERA = antarctica8;
        ANTARCTICA antarctica9 = new ANTARCTICA(ProtectedSandApp.s("魕\u0001"), 8, ProtectedSandApp.s("魔\u0001"), s6);
        SYOWA = antarctica9;
        ANTARCTICA antarctica10 = new ANTARCTICA(ProtectedSandApp.s("魗\u0001"), 9, ProtectedSandApp.s("魖\u0001"), s6);
        VOSTOK = antarctica10;
        $VALUES = new ANTARCTICA[]{antarctica, antarctica2, antarctica3, antarctica4, antarctica5, antarctica6, antarctica7, antarctica8, antarctica9, antarctica10};
    }

    private ANTARCTICA(String str, int i4, String str2, String str3) {
        this.f83633id = c.a(ProtectedSandApp.s("魘\u0001"), str2);
        this.city = str2;
        this.country = str3;
    }

    public static ANTARCTICA valueOf(String str) {
        return (ANTARCTICA) Enum.valueOf(ANTARCTICA.class, str);
    }

    public static ANTARCTICA[] values() {
        return (ANTARCTICA[]) $VALUES.clone();
    }

    @Override // net.time4j.tz.k
    public String canonical() {
        return this.f83633id;
    }

    @Override // qe.a
    public String getCity() {
        return this.city;
    }

    @Override // qe.a
    public String getCountry() {
        return this.country;
    }

    @Override // qe.a
    public String getRegion() {
        return ProtectedSandApp.s("魙\u0001");
    }
}
