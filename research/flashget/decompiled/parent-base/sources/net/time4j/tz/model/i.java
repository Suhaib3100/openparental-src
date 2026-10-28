package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OffsetIndicator.java */
/* loaded from: classes7.dex */
public class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i STANDARD_TIME;
    public static final i UTC_TIME;
    static final i[] VALUES;
    public static final i WALL_TIME;

    /* compiled from: OffsetIndicator.java */
    enum a extends i {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.tz.model.i
        public char getSymbol() {
            return 'u';
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("餣\u0001"), 0);
        UTC_TIME = aVar;
        i iVar = new i(ProtectedSandApp.s("餤\u0001"), 1) { // from class: net.time4j.tz.model.i.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.tz.model.i
            public char getSymbol() {
                return 's';
            }
        };
        STANDARD_TIME = iVar;
        i iVar2 = new i(ProtectedSandApp.s("餥\u0001"), 2) { // from class: net.time4j.tz.model.i.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.tz.model.i
            public char getSymbol() {
                return 'w';
            }
        };
        WALL_TIME = iVar2;
        $VALUES = new i[]{aVar, iVar, iVar2};
        VALUES = values();
    }

    private i(String str, int i4) {
    }

    public static i parseSymbol(char c5) {
        if (c5 != 'g') {
            if (c5 == 's') {
                return STANDARD_TIME;
            }
            if (c5 != 'u') {
                if (c5 == 'w') {
                    return WALL_TIME;
                }
                if (c5 != 'z') {
                    throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("餦\u0001"), c5));
                }
            }
        }
        return UTC_TIME;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public char getSymbol() {
        throw new AbstractMethodError();
    }

    /* synthetic */ i(String str, int i4, a aVar) {
        this(str, i4);
    }
}
