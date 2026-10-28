package net.time4j.tz.olson;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import qe.a;

/* loaded from: classes7.dex */
public enum INDIAN implements a {
    ANTANANARIVO(ProtectedSandApp.s("鴇\u0001"), ProtectedSandApp.s("鴈\u0001")),
    CHAGOS(ProtectedSandApp.s("鴊\u0001"), ProtectedSandApp.s("鴋\u0001")),
    CHRISTMAS(ProtectedSandApp.s("鴍\u0001"), ProtectedSandApp.s("鴎\u0001")),
    COCOS(ProtectedSandApp.s("鴐\u0001"), ProtectedSandApp.s("鴑\u0001")),
    COMORO(ProtectedSandApp.s("鴓\u0001"), ProtectedSandApp.s("鴔\u0001")),
    KERGUELEN(ProtectedSandApp.s("鴖\u0001"), ProtectedSandApp.s("鴗\u0001")),
    MAHE(ProtectedSandApp.s("鴙\u0001"), ProtectedSandApp.s("鴚\u0001")),
    MALDIVES(ProtectedSandApp.s("鴜\u0001"), ProtectedSandApp.s("鴝\u0001")),
    MAURITIUS(ProtectedSandApp.s("鴟\u0001"), ProtectedSandApp.s("鴠\u0001")),
    MAYOTTE(ProtectedSandApp.s("鴢\u0001"), ProtectedSandApp.s("鴣\u0001")),
    REUNION(ProtectedSandApp.s("鴥\u0001"), ProtectedSandApp.s("鴦\u0001"));

    private final String city;
    private final String country;

    /* renamed from: id, reason: collision with root package name */
    private final String f83638id;

    INDIAN(String str, String str2) {
        this.f83638id = c.a(ProtectedSandApp.s("鴨\u0001"), str);
        this.city = str;
        this.country = str2;
    }

    @Override // net.time4j.tz.k
    public String canonical() {
        return this.f83638id;
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
        return ProtectedSandApp.s("鴩\u0001");
    }
}
