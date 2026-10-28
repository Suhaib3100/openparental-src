package kotlin.reflect.jvm.internal.impl.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Modality.kt */
/* loaded from: classes7.dex */
public final class e0 {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;

    @fg.l
    public static final a Companion;
    public static final e0 FINAL = new e0(ProtectedSandApp.s("歷\u0001"), 0);
    public static final e0 SEALED = new e0(ProtectedSandApp.s("歸\u0001"), 1);
    public static final e0 OPEN = new e0(ProtectedSandApp.s("歹\u0001"), 2);
    public static final e0 ABSTRACT = new e0(ProtectedSandApp.s("歺\u0001"), 3);

    /* compiled from: Modality.kt */
    public static final class a {
        private a() {
        }

        @fg.l
        public final e0 a(boolean z4, boolean z5, boolean z6) {
            return z4 ? e0.SEALED : z5 ? e0.ABSTRACT : z6 ? e0.OPEN : e0.FINAL;
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{FINAL, SEALED, OPEN, ABSTRACT};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        Companion = new a();
    }

    private e0(String str, int i4) {
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
