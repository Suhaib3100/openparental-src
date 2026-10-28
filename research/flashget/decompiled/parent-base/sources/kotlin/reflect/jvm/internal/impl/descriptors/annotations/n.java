package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.z0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KotlinTarget.kt */
@r1({"SMAP\nKotlinTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,140:1\n3792#2:141\n4307#2,2:142\n*S KotlinDebug\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n*L\n81#1:141\n81#1:142,2\n*E\n"})
/* loaded from: classes7.dex */
public final class n {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;

    @fg.l
    private static final Set<n> ALL_TARGET_SET;

    @fg.l
    private static final List<n> ANNOTATION_CLASS_LIST;
    public static final n BACKING_FIELD;

    @fg.l
    private static final List<n> CLASS_LIST;

    @fg.l
    private static final List<n> COMPANION_OBJECT_LIST;
    public static final n CONSTRUCTOR;

    @fg.l
    public static final a Companion;

    @fg.l
    private static final Set<n> DEFAULT_TARGET_SET;

    @fg.l
    private static final List<n> ENUM_ENTRY_LIST;

    @fg.l
    private static final List<n> ENUM_LIST;
    public static final n FIELD;

    @fg.l
    private static final List<n> FILE_LIST;
    public static final n FUNCTION;

    @fg.l
    private static final List<n> FUNCTION_LIST;

    @fg.l
    private static final List<n> INTERFACE_LIST;

    @fg.l
    private static final List<n> LOCAL_CLASS_LIST;
    public static final n LOCAL_VARIABLE;

    @fg.l
    private static final List<n> OBJECT_LIST;
    public static final n PROPERTY;
    public static final n PROPERTY_GETTER;

    @fg.l
    private static final List<n> PROPERTY_GETTER_LIST;
    public static final n PROPERTY_SETTER;

    @fg.l
    private static final List<n> PROPERTY_SETTER_LIST;

    @fg.l
    private static final Map<e, n> USE_SITE_MAPPING;
    public static final n VALUE_PARAMETER;

    @fg.l
    private static final HashMap<String, n> map;

    @fg.l
    private final String description;
    private final boolean isDefault;
    public static final n CLASS = new n(ProtectedSandApp.s("欓\u0001"), 0, ProtectedSandApp.s("欔\u0001"), 0 == true ? 1 : 0, 2, null);
    public static final n ANNOTATION_CLASS = new n(ProtectedSandApp.s("欕\u0001"), 1, ProtectedSandApp.s("欖\u0001"), false, 2, null);
    public static final n TYPE_PARAMETER = new n(ProtectedSandApp.s("欗\u0001"), 2, ProtectedSandApp.s("欘\u0001"), false);
    public static final n TYPE = new n(ProtectedSandApp.s("欪\u0001"), 11, ProtectedSandApp.s("欩\u0001"), false);
    public static final n EXPRESSION = new n(ProtectedSandApp.s("欬\u0001"), 12, ProtectedSandApp.s("欫\u0001"), false);
    public static final n FILE = new n(ProtectedSandApp.s("欮\u0001"), 13, ProtectedSandApp.s("欭\u0001"), false);
    public static final n TYPEALIAS = new n(ProtectedSandApp.s("欰\u0001"), 14, ProtectedSandApp.s("欯\u0001"), false);
    public static final n TYPE_PROJECTION = new n(ProtectedSandApp.s("欲\u0001"), 15, ProtectedSandApp.s("欱\u0001"), false);
    public static final n STAR_PROJECTION = new n(ProtectedSandApp.s("欴\u0001"), 16, ProtectedSandApp.s("欳\u0001"), false);
    public static final n PROPERTY_PARAMETER = new n(ProtectedSandApp.s("欶\u0001"), 17, ProtectedSandApp.s("欵\u0001"), false);
    public static final n CLASS_ONLY = new n(ProtectedSandApp.s("欷\u0001"), 18, ProtectedSandApp.s("欔\u0001"), false);
    public static final n OBJECT = new n(ProtectedSandApp.s("欹\u0001"), 19, ProtectedSandApp.s("欸\u0001"), false);
    public static final n STANDALONE_OBJECT = new n(ProtectedSandApp.s("欻\u0001"), 20, ProtectedSandApp.s("欺\u0001"), false);
    public static final n COMPANION_OBJECT = new n(ProtectedSandApp.s("欽\u0001"), 21, ProtectedSandApp.s("欼\u0001"), false);
    public static final n INTERFACE = new n(ProtectedSandApp.s("欿\u0001"), 22, ProtectedSandApp.s("款\u0001"), false);
    public static final n ENUM_CLASS = new n(ProtectedSandApp.s("歁\u0001"), 23, ProtectedSandApp.s("歀\u0001"), false);
    public static final n ENUM_ENTRY = new n(ProtectedSandApp.s("歃\u0001"), 24, ProtectedSandApp.s("歂\u0001"), false);
    public static final n LOCAL_CLASS = new n(ProtectedSandApp.s("歅\u0001"), 25, ProtectedSandApp.s("歄\u0001"), false);
    public static final n LOCAL_FUNCTION = new n(ProtectedSandApp.s("歇\u0001"), 26, ProtectedSandApp.s("歆\u0001"), false);
    public static final n MEMBER_FUNCTION = new n(ProtectedSandApp.s("歉\u0001"), 27, ProtectedSandApp.s("歈\u0001"), false);
    public static final n TOP_LEVEL_FUNCTION = new n(ProtectedSandApp.s("歋\u0001"), 28, ProtectedSandApp.s("歊\u0001"), false);
    public static final n MEMBER_PROPERTY = new n(ProtectedSandApp.s("歍\u0001"), 29, ProtectedSandApp.s("歌\u0001"), false);
    public static final n MEMBER_PROPERTY_WITH_BACKING_FIELD = new n(ProtectedSandApp.s("歏\u0001"), 30, ProtectedSandApp.s("歎\u0001"), false);
    public static final n MEMBER_PROPERTY_WITH_DELEGATE = new n(ProtectedSandApp.s("歑\u0001"), 31, ProtectedSandApp.s("歐\u0001"), false);
    public static final n MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new n(ProtectedSandApp.s("歓\u0001"), 32, ProtectedSandApp.s("歒\u0001"), false);
    public static final n TOP_LEVEL_PROPERTY = new n(ProtectedSandApp.s("歕\u0001"), 33, ProtectedSandApp.s("歔\u0001"), false);
    public static final n TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new n(ProtectedSandApp.s("歗\u0001"), 34, ProtectedSandApp.s("歖\u0001"), false);
    public static final n TOP_LEVEL_PROPERTY_WITH_DELEGATE = new n(ProtectedSandApp.s("歙\u0001"), 35, ProtectedSandApp.s("歘\u0001"), false);
    public static final n TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new n(ProtectedSandApp.s("歛\u0001"), 36, ProtectedSandApp.s("歚\u0001"), false);
    public static final n INITIALIZER = new n(ProtectedSandApp.s("歟\u0001"), 38, ProtectedSandApp.s("歞\u0001"), false);
    public static final n DESTRUCTURING_DECLARATION = new n(ProtectedSandApp.s("歡\u0001"), 39, ProtectedSandApp.s("歠\u0001"), false);
    public static final n LAMBDA_EXPRESSION = new n(ProtectedSandApp.s("正\u0001"), 40, ProtectedSandApp.s("止\u0001"), false);
    public static final n ANONYMOUS_FUNCTION = new n(ProtectedSandApp.s("步\u0001"), 41, ProtectedSandApp.s("此\u0001"), false);
    public static final n OBJECT_LITERAL = new n(ProtectedSandApp.s("歧\u0001"), 42, ProtectedSandApp.s("武\u0001"), false);

    /* compiled from: KotlinTarget.kt */
    public static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    private static final /* synthetic */ n[] $values() {
        return new n[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS, TYPE_PROJECTION, STAR_PROJECTION, PROPERTY_PARAMETER, CLASS_ONLY, OBJECT, STANDALONE_OBJECT, COMPANION_OBJECT, INTERFACE, ENUM_CLASS, ENUM_ENTRY, LOCAL_CLASS, LOCAL_FUNCTION, MEMBER_FUNCTION, TOP_LEVEL_FUNCTION, MEMBER_PROPERTY, MEMBER_PROPERTY_WITH_BACKING_FIELD, MEMBER_PROPERTY_WITH_DELEGATE, MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, TOP_LEVEL_PROPERTY, TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD, TOP_LEVEL_PROPERTY_WITH_DELEGATE, TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE, BACKING_FIELD, INITIALIZER, DESTRUCTURING_DECLARATION, LAMBDA_EXPRESSION, ANONYMOUS_FUNCTION, OBJECT_LITERAL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i4 = 2;
        w wVar = null;
        boolean z4 = false;
        PROPERTY = new n(ProtectedSandApp.s("欙\u0001"), 3, ProtectedSandApp.s("欚\u0001"), z4, i4, wVar);
        int i5 = 2;
        w wVar2 = null;
        boolean z5 = false;
        FIELD = new n(ProtectedSandApp.s("欛\u0001"), 4, ProtectedSandApp.s("欜\u0001"), z5, i5, wVar2);
        LOCAL_VARIABLE = new n(ProtectedSandApp.s("欝\u0001"), 5, ProtectedSandApp.s("欞\u0001"), z4, i4, wVar);
        VALUE_PARAMETER = new n(ProtectedSandApp.s("欟\u0001"), 6, ProtectedSandApp.s("欠\u0001"), z5, i5, wVar2);
        CONSTRUCTOR = new n(ProtectedSandApp.s("次\u0001"), 7, ProtectedSandApp.s("欢\u0001"), z4, i4, wVar);
        FUNCTION = new n(ProtectedSandApp.s("欣\u0001"), 8, ProtectedSandApp.s("欤\u0001"), z5, i5, wVar2);
        PROPERTY_GETTER = new n(ProtectedSandApp.s("欥\u0001"), 9, ProtectedSandApp.s("欦\u0001"), z4, i4, wVar);
        PROPERTY_SETTER = new n(ProtectedSandApp.s("欧\u0001"), 10, ProtectedSandApp.s("欨\u0001"), z5, i5, wVar2);
        BACKING_FIELD = new n(ProtectedSandApp.s("歜\u0001"), 37, ProtectedSandApp.s("歝\u0001"), z4, i4, wVar);
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        Companion = new a();
        map = new HashMap<>();
        for (n nVar : values()) {
            map.put(nVar.name(), nVar);
        }
        n[] values = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar2 : values) {
            if (nVar2.isDefault) {
                arrayList.add(nVar2);
            }
        }
        DEFAULT_TARGET_SET = kotlin.collections.w.a6(arrayList);
        ALL_TARGET_SET = kotlin.collections.l.mz(values());
        n nVar3 = ANNOTATION_CLASS;
        n nVar4 = CLASS;
        ANNOTATION_CLASS_LIST = kotlin.collections.w.O(nVar3, nVar4);
        LOCAL_CLASS_LIST = kotlin.collections.w.O(LOCAL_CLASS, nVar4);
        CLASS_LIST = kotlin.collections.w.O(CLASS_ONLY, nVar4);
        n nVar5 = COMPANION_OBJECT;
        n nVar6 = OBJECT;
        COMPANION_OBJECT_LIST = kotlin.collections.w.O(nVar5, nVar6, nVar4);
        OBJECT_LIST = kotlin.collections.w.O(STANDALONE_OBJECT, nVar6, nVar4);
        INTERFACE_LIST = kotlin.collections.w.O(INTERFACE, nVar4);
        ENUM_LIST = kotlin.collections.w.O(ENUM_CLASS, nVar4);
        n nVar7 = ENUM_ENTRY;
        n nVar8 = PROPERTY;
        n nVar9 = FIELD;
        ENUM_ENTRY_LIST = kotlin.collections.w.O(nVar7, nVar8, nVar9);
        n nVar10 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = kotlin.collections.w.k(nVar10);
        n nVar11 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = kotlin.collections.w.k(nVar11);
        FUNCTION_LIST = kotlin.collections.w.k(FUNCTION);
        n nVar12 = FILE;
        FILE_LIST = kotlin.collections.w.k(nVar12);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar13 = VALUE_PARAMETER;
        USE_SITE_MAPPING = z0.W(new q0(eVar, nVar13), new q0(e.FIELD, nVar9), new q0(e.PROPERTY, nVar8), new q0(e.FILE, nVar12), new q0(e.PROPERTY_GETTER, nVar11), new q0(e.PROPERTY_SETTER, nVar10), new q0(e.RECEIVER, nVar13), new q0(e.SETTER_PARAMETER, nVar13), new q0(e.PROPERTY_DELEGATE_FIELD, nVar9));
    }

    private n(String str, int i4, String str2, boolean z4) {
        this.description = str2;
        this.isDefault = z4;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    /* synthetic */ n(String str, int i4, String str2, boolean z4, int i5, w wVar) {
        this(str, i4, str2, (i5 & 2) != 0 ? true : z4);
    }
}
