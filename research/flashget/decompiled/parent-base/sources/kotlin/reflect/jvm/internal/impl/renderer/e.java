package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
@r1({"SMAP\nDescriptorRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,320:1\n3792#2:321\n4307#2,2:322\n*S KotlinDebug\n*F\n+ 1 DescriptorRenderer.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererModifier\n*L\n314#1:321\n314#1:322,2\n*E\n"})
/* loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;

    @fg.l
    @kd.f
    public static final Set<e> ALL;

    @fg.l
    @kd.f
    public static final Set<e> ALL_EXCEPT_ANNOTATIONS;

    @fg.l
    public static final a Companion;
    private final boolean includeByDefault;
    public static final e VISIBILITY = new e(ProtectedSandApp.s("瞺\u0001"), 0, true);
    public static final e MODALITY = new e(ProtectedSandApp.s("瞻\u0001"), 1, true);
    public static final e OVERRIDE = new e(ProtectedSandApp.s("瞼\u0001"), 2, true);
    public static final e ANNOTATIONS = new e(ProtectedSandApp.s("瞽\u0001"), 3, false);
    public static final e INNER = new e(ProtectedSandApp.s("瞾\u0001"), 4, true);
    public static final e MEMBER_KIND = new e(ProtectedSandApp.s("瞿\u0001"), 5, true);
    public static final e DATA = new e(ProtectedSandApp.s("矀\u0001"), 6, true);
    public static final e INLINE = new e(ProtectedSandApp.s("矁\u0001"), 7, true);
    public static final e EXPECT = new e(ProtectedSandApp.s("矂\u0001"), 8, true);
    public static final e ACTUAL = new e(ProtectedSandApp.s("矃\u0001"), 9, true);
    public static final e CONST = new e(ProtectedSandApp.s("矄\u0001"), 10, true);
    public static final e LATEINIT = new e(ProtectedSandApp.s("矅\u0001"), 11, true);
    public static final e FUN = new e(ProtectedSandApp.s("矆\u0001"), 12, true);
    public static final e VALUE = new e(ProtectedSandApp.s("矇\u0001"), 13, true);

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    private static final /* synthetic */ e[] $values() {
        return new e[]{VISIBILITY, MODALITY, OVERRIDE, ANNOTATIONS, INNER, MEMBER_KIND, DATA, INLINE, EXPECT, ACTUAL, CONST, LATEINIT, FUN, VALUE};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        Companion = new a();
        e[] values = values();
        ArrayList arrayList = new ArrayList();
        for (e eVar : values) {
            if (eVar.includeByDefault) {
                arrayList.add(eVar);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = kotlin.collections.w.a6(arrayList);
        ALL = kotlin.collections.l.mz(values());
    }

    private e(String str, int i4, boolean z4) {
        this.includeByDefault = z4;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
