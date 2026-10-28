package net.time4j.calendar.bahai;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FormattedContent.java */
/* loaded from: classes7.dex */
public abstract class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f HTML;
    public static final f MEANING;
    public static final f TRANSCRIPTION;

    /* compiled from: FormattedContent.java */
    enum a extends f {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // net.time4j.calendar.bahai.f
        String variant() {
            return ProtectedSandApp.s("赣\u0001");
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("赠\u0001"), 0);
        TRANSCRIPTION = aVar;
        f fVar = new f(ProtectedSandApp.s("赡\u0001"), 1) { // from class: net.time4j.calendar.bahai.f.b
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.bahai.f
            String variant() {
                return ProtectedSandApp.s("赤\u0001");
            }
        };
        MEANING = fVar;
        f fVar2 = new f(ProtectedSandApp.s("赢\u0001"), 2) { // from class: net.time4j.calendar.bahai.f.c
            {
                a aVar2 = null;
            }

            @Override // net.time4j.calendar.bahai.f
            String variant() {
                return ProtectedSandApp.s("赥\u0001");
            }
        };
        HTML = fVar2;
        $VALUES = new f[]{aVar, fVar, fVar2};
    }

    private f(String str, int i4) {
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    abstract String variant();

    /* synthetic */ f(String str, int i4, a aVar) {
        this(str, i4);
    }
}
