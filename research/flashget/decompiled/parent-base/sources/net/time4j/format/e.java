package net.time4j.format;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: DisplayMode.java */
/* loaded from: classes7.dex */
public enum e implements net.time4j.engine.z {
    FULL(0),
    LONG(1),
    MEDIUM(2),
    SHORT(3);

    private static e[] ENUMS = values();
    private final transient int style;

    e(int i4) {
        this.style = i4;
    }

    public static e ofStyle(int i4) {
        for (e eVar : ENUMS) {
            if (eVar.getStyleValue() == i4) {
                return eVar;
            }
        }
        throw new UnsupportedOperationException(android.support.v4.media.a.a(ProtectedSandApp.s("鎘\u0001"), i4));
    }

    @Override // net.time4j.engine.z
    public int getStyleValue() {
        return this.style;
    }
}
