package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class RestoreConfigure {
    public CASJobParameters casJobParameters;
    public int days;

    public static class CASJobParameters {
        public String tier = Tier.Standard.getTier();

        public String toString() {
            return c.a(new StringBuilder(ProtectedSandApp.s("䯆\u0001")), this.tier, ProtectedSandApp.s("䯇\u0001"));
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Expedited' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Tier {
        private static final /* synthetic */ Tier[] $VALUES;
        public static final Tier Bulk;
        public static final Tier Expedited;
        public static final Tier Standard;
        private String tier;

        static {
            String s4 = ProtectedSandApp.s("䯈\u0001");
            Tier tier = new Tier(s4, 0, s4);
            Expedited = tier;
            String s5 = ProtectedSandApp.s("䯉\u0001");
            Tier tier2 = new Tier(s5, 1, s5);
            Standard = tier2;
            String s6 = ProtectedSandApp.s("䯊\u0001");
            Tier tier3 = new Tier(s6, 2, s6);
            Bulk = tier3;
            $VALUES = new Tier[]{tier, tier2, tier3};
        }

        private Tier(String str, int i4, String str2) {
            this.tier = str2;
        }

        public static Tier valueOf(String str) {
            return (Tier) Enum.valueOf(Tier.class, str);
        }

        public static Tier[] values() {
            return (Tier[]) $VALUES.clone();
        }

        public String getTier() {
            return this.tier;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䯋\u0001"));
        sb.append(this.days);
        String s4 = ProtectedSandApp.s("䯌\u0001");
        sb.append(s4);
        CASJobParameters cASJobParameters = this.casJobParameters;
        if (cASJobParameters != null) {
            sb.append(cASJobParameters.toString());
            sb.append(s4);
        }
        sb.append(ProtectedSandApp.s("䯍\u0001"));
        return sb.toString();
    }
}
