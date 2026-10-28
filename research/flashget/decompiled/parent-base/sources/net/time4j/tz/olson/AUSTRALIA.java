package net.time4j.tz.olson;

import androidx.constraintlayout.core.motion.key.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import qe.a;

/* loaded from: classes7.dex */
public enum AUSTRALIA implements a {
    ADELAIDE(ProtectedSandApp.s("鱋\u0001")),
    BRISBANE(ProtectedSandApp.s("鱍\u0001")),
    BROKEN_HILL(ProtectedSandApp.s("鱏\u0001")),
    CURRIE(ProtectedSandApp.s("鱑\u0001")),
    DARWIN(ProtectedSandApp.s("鱓\u0001")),
    EUCLA(ProtectedSandApp.s("鱕\u0001")),
    HOBART(ProtectedSandApp.s("鱗\u0001")),
    LINDEMAN(ProtectedSandApp.s("鱙\u0001")),
    LORD_HOWE(ProtectedSandApp.s("鱛\u0001")),
    MELBOURNE(ProtectedSandApp.s("鱝\u0001")),
    PERTH(ProtectedSandApp.s("鱟\u0001")),
    SYDNEY(ProtectedSandApp.s("鱡\u0001"));

    private final String city;

    /* renamed from: id, reason: collision with root package name */
    private final String f83636id;

    AUSTRALIA(String str) {
        this.f83636id = c.a(ProtectedSandApp.s("鱣\u0001"), str);
        this.city = str;
    }

    @Override // net.time4j.tz.k
    public String canonical() {
        return this.f83636id;
    }

    @Override // qe.a
    public String getCity() {
        return this.city;
    }

    @Override // qe.a
    public String getCountry() {
        return ProtectedSandApp.s("鱤\u0001");
    }

    @Override // qe.a
    public String getRegion() {
        return ProtectedSandApp.s("鱥\u0001");
    }
}
