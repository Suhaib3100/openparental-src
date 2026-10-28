package net.time4j.tz.olson;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import qe.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'AZORES' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public final class ATLANTIC implements a {
    private static final /* synthetic */ ATLANTIC[] $VALUES;
    public static final ATLANTIC AZORES;
    public static final ATLANTIC BERMUDA;
    public static final ATLANTIC CANARY;
    public static final ATLANTIC CAPE_VERDE;
    public static final ATLANTIC FAROE;
    public static final ATLANTIC MADEIRA;
    public static final ATLANTIC REYKJAVIK;
    public static final ATLANTIC SOUTH_GEORGIA;
    public static final ATLANTIC STANLEY;
    public static final ATLANTIC ST_HELENA;
    private final String city;
    private final String country;

    /* renamed from: id, reason: collision with root package name */
    private final String f83635id;

    static {
        String s4 = ProtectedSandApp.s("鰬\u0001");
        String s5 = ProtectedSandApp.s("鰭\u0001");
        String s6 = ProtectedSandApp.s("鰮\u0001");
        ATLANTIC atlantic = new ATLANTIC(s4, 0, s5, s6);
        AZORES = atlantic;
        ATLANTIC atlantic2 = new ATLANTIC(ProtectedSandApp.s("鰱\u0001"), 1, ProtectedSandApp.s("鰯\u0001"), ProtectedSandApp.s("鰰\u0001"));
        BERMUDA = atlantic2;
        ATLANTIC atlantic3 = new ATLANTIC(ProtectedSandApp.s("鰴\u0001"), 2, ProtectedSandApp.s("鰲\u0001"), ProtectedSandApp.s("鰳\u0001"));
        CANARY = atlantic3;
        ATLANTIC atlantic4 = new ATLANTIC(ProtectedSandApp.s("鰷\u0001"), 3, ProtectedSandApp.s("鰵\u0001"), ProtectedSandApp.s("鰶\u0001"));
        CAPE_VERDE = atlantic4;
        ATLANTIC atlantic5 = new ATLANTIC(ProtectedSandApp.s("鰺\u0001"), 4, ProtectedSandApp.s("鰸\u0001"), ProtectedSandApp.s("鰹\u0001"));
        FAROE = atlantic5;
        ATLANTIC atlantic6 = new ATLANTIC(ProtectedSandApp.s("鰼\u0001"), 5, ProtectedSandApp.s("鰻\u0001"), s6);
        MADEIRA = atlantic6;
        ATLANTIC atlantic7 = new ATLANTIC(ProtectedSandApp.s("鰿\u0001"), 6, ProtectedSandApp.s("鰽\u0001"), ProtectedSandApp.s("鰾\u0001"));
        REYKJAVIK = atlantic7;
        ATLANTIC atlantic8 = new ATLANTIC(ProtectedSandApp.s("鱂\u0001"), 7, ProtectedSandApp.s("鱀\u0001"), ProtectedSandApp.s("鱁\u0001"));
        SOUTH_GEORGIA = atlantic8;
        ATLANTIC atlantic9 = new ATLANTIC(ProtectedSandApp.s("鱅\u0001"), 8, ProtectedSandApp.s("鱃\u0001"), ProtectedSandApp.s("鱄\u0001"));
        ST_HELENA = atlantic9;
        ATLANTIC atlantic10 = new ATLANTIC(ProtectedSandApp.s("鱈\u0001"), 9, ProtectedSandApp.s("鱆\u0001"), ProtectedSandApp.s("鱇\u0001"));
        STANLEY = atlantic10;
        $VALUES = new ATLANTIC[]{atlantic, atlantic2, atlantic3, atlantic4, atlantic5, atlantic6, atlantic7, atlantic8, atlantic9, atlantic10};
    }

    private ATLANTIC(String str, int i4, String str2, String str3) {
        this.f83635id = c.a(ProtectedSandApp.s("鱉\u0001"), str2);
        this.city = str2;
        this.country = str3;
    }

    public static ATLANTIC valueOf(String str) {
        return (ATLANTIC) Enum.valueOf(ATLANTIC.class, str);
    }

    public static ATLANTIC[] values() {
        return (ATLANTIC[]) $VALUES.clone();
    }

    @Override // net.time4j.tz.k
    public String canonical() {
        return this.f83635id;
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
        return ProtectedSandApp.s("鱊\u0001");
    }
}
