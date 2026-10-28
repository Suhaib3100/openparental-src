package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Comparable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: DisplayElement.java */
/* loaded from: classes7.dex */
public abstract class d<V extends Comparable<V>> extends net.time4j.engine.e<V> {

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f82827b;

    static {
        HashMap a5 = com.coremedia.iso.boxes.d.a(ProtectedSandApp.s("襹\u0001"), ProtectedSandApp.s("襺\u0001"), ProtectedSandApp.s("襻\u0001"), ProtectedSandApp.s("襼\u0001"));
        a5.put(ProtectedSandApp.s("襽\u0001"), ProtectedSandApp.s("襾\u0001"));
        String s4 = ProtectedSandApp.s("西\u0001");
        String s5 = ProtectedSandApp.s("覀\u0001");
        a5.put(s4, s5);
        a5.put(ProtectedSandApp.s("要\u0001"), s5);
        f82827b = Collections.unmodifiableMap(a5);
    }

    protected d(String str) {
        super(str);
    }

    @Override // net.time4j.engine.e, net.time4j.engine.q
    public String getDisplayName(Locale locale) {
        String s4;
        switch (getSymbol()) {
            case 'E':
            case 'e':
                s4 = ProtectedSandApp.s("覇\u0001");
                break;
            case 'G':
                s4 = ProtectedSandApp.s("覆\u0001");
                break;
            case 'H':
            case 'K':
            case 'h':
            case 'k':
                s4 = ProtectedSandApp.s("襾\u0001");
                break;
            case 'M':
                s4 = ProtectedSandApp.s("襼\u0001");
                break;
            case 'Q':
                s4 = ProtectedSandApp.s("覅\u0001");
                break;
            case 'W':
            case 'w':
                s4 = ProtectedSandApp.s("覄\u0001");
                break;
            case 'Y':
            case 'u':
            case 'y':
                s4 = ProtectedSandApp.s("襺\u0001");
                break;
            case 'd':
                s4 = ProtectedSandApp.s("覀\u0001");
                break;
            case 'm':
                s4 = ProtectedSandApp.s("覃\u0001");
                break;
            case 's':
                s4 = ProtectedSandApp.s("覂\u0001");
                break;
            default:
                String name = name();
                s4 = f82827b.get(name);
                if (s4 == null) {
                    return name;
                }
                break;
        }
        String str = b.f(locale).o().get(s4);
        return str == null ? name() : str;
    }
}
