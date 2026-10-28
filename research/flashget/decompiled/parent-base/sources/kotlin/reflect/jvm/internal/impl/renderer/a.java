package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final a NO_ARGUMENTS = new a(ProtectedSandApp.s("盻\u0001"), 0, false, false, 3, null);
    public static final a UNLESS_EMPTY = new a(ProtectedSandApp.s("盼\u0001"), 1, true, false, 2, null);
    public static final a ALWAYS_PARENTHESIZED = new a(ProtectedSandApp.s("盽\u0001"), 2, true, true);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private a(String str, int i4, boolean z4, boolean z5) {
        this.includeAnnotationArguments = z4;
        this.includeEmptyAnnotationArguments = z5;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    /* synthetic */ a(String str, int i4, boolean z4, boolean z5, int i5, w wVar) {
        this(str, i4, (i5 & 1) != 0 ? false : z4, (i5 & 2) != 0 ? false : z5);
    }
}
