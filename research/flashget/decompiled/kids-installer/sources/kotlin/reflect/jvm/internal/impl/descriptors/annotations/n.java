package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a0;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.collections.z;
import kotlin.jvm.internal.w;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PROPERTY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: KotlinTarget.kt */
/* loaded from: classes5.dex */
public final class n {

    @d5.d
    private static final Set<n> ALL_TARGET_SET;

    @d5.d
    private static final List<n> ANNOTATION_CLASS_LIST;

    @d5.d
    private static final List<n> CLASS_LIST;

    @d5.d
    private static final List<n> COMPANION_OBJECT_LIST;
    public static final n CONSTRUCTOR;

    @d5.d
    private static final Set<n> DEFAULT_TARGET_SET;

    @d5.d
    private static final List<n> ENUM_ENTRY_LIST;

    @d5.d
    private static final List<n> ENUM_LIST;
    public static final n FIELD;

    @d5.d
    private static final List<n> FILE_LIST;
    public static final n FUNCTION;

    @d5.d
    private static final List<n> FUNCTION_LIST;

    @d5.d
    private static final List<n> INTERFACE_LIST;

    @d5.d
    private static final List<n> LOCAL_CLASS_LIST;
    public static final n LOCAL_VARIABLE;

    @d5.d
    private static final List<n> OBJECT_LIST;
    public static final n PROPERTY;
    public static final n PROPERTY_GETTER;

    @d5.d
    private static final List<n> PROPERTY_GETTER_LIST;
    public static final n PROPERTY_SETTER;

    @d5.d
    private static final List<n> PROPERTY_SETTER_LIST;

    @d5.d
    private static final Map<e, n> USE_SITE_MAPPING;
    public static final n VALUE_PARAMETER;

    @d5.d
    private final String description;
    private final boolean isDefault;
    public static final n CLASS = new n(ProtectedSandApp.s("䜕"), 0, ProtectedSandApp.s("䜖"), false, 2, null);
    public static final n ANNOTATION_CLASS = new n(ProtectedSandApp.s("䜗"), 1, ProtectedSandApp.s("䜘"), false, 2, null);
    public static final n TYPE_PARAMETER = new n(ProtectedSandApp.s("䜙"), 2, ProtectedSandApp.s("䜚"), false);
    public static final n TYPE = new n(ProtectedSandApp.s("䜬"), 11, ProtectedSandApp.s("䜫"), false);
    public static final n EXPRESSION = new n(ProtectedSandApp.s("䜮"), 12, ProtectedSandApp.s("䜭"), false);
    public static final n FILE = new n(ProtectedSandApp.s("䜰"), 13, ProtectedSandApp.s("䜯"), false);
    public static final n TYPEALIAS = new n(ProtectedSandApp.s("䜲"), 14, ProtectedSandApp.s("䜱"), false);
    public static final n TYPE_PROJECTION = new n(ProtectedSandApp.s("䜴"), 15, ProtectedSandApp.s("䜳"), false);
    public static final n STAR_PROJECTION = new n(ProtectedSandApp.s("䜶"), 16, ProtectedSandApp.s("䜵"), false);
    public static final n PROPERTY_PARAMETER = new n(ProtectedSandApp.s("䜸"), 17, ProtectedSandApp.s("䜷"), false);
    public static final n CLASS_ONLY = new n(ProtectedSandApp.s("䜺"), 18, ProtectedSandApp.s("䜹"), false);
    public static final n OBJECT = new n(ProtectedSandApp.s("䜼"), 19, ProtectedSandApp.s("䜻"), false);
    public static final n STANDALONE_OBJECT = new n(ProtectedSandApp.s("䜾"), 20, ProtectedSandApp.s("䜽"), false);
    public static final n COMPANION_OBJECT = new n(ProtectedSandApp.s("䝀"), 21, ProtectedSandApp.s("䜿"), false);
    public static final n INTERFACE = new n(ProtectedSandApp.s("䝂"), 22, ProtectedSandApp.s("䝁"), false);
    public static final n ENUM_CLASS = new n(ProtectedSandApp.s("䝄"), 23, ProtectedSandApp.s("䝃"), false);
    public static final n ENUM_ENTRY = new n(ProtectedSandApp.s("䝆"), 24, ProtectedSandApp.s("䝅"), false);
    public static final n LOCAL_CLASS = new n(ProtectedSandApp.s("䝈"), 25, ProtectedSandApp.s("䝇"), false);
    public static final n LOCAL_FUNCTION = new n(ProtectedSandApp.s("䝊"), 26, ProtectedSandApp.s("䝉"), false);
    public static final n MEMBER_FUNCTION = new n(ProtectedSandApp.s("䝌"), 27, ProtectedSandApp.s("䝋"), false);
    public static final n TOP_LEVEL_FUNCTION = new n(ProtectedSandApp.s("䝎"), 28, ProtectedSandApp.s("䝍"), false);
    public static final n MEMBER_PROPERTY = new n(ProtectedSandApp.s("䝐"), 29, ProtectedSandApp.s("䝏"), false);
    public static final n MEMBER_PROPERTY_WITH_BACKING_FIELD = new n(ProtectedSandApp.s("䝒"), 30, ProtectedSandApp.s("䝑"), false);
    public static final n MEMBER_PROPERTY_WITH_DELEGATE = new n(ProtectedSandApp.s("䝔"), 31, ProtectedSandApp.s("䝓"), false);
    public static final n MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new n(ProtectedSandApp.s("䝖"), 32, ProtectedSandApp.s("䝕"), false);
    public static final n TOP_LEVEL_PROPERTY = new n(ProtectedSandApp.s("䝘"), 33, ProtectedSandApp.s("䝗"), false);
    public static final n TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = new n(ProtectedSandApp.s("䝚"), 34, ProtectedSandApp.s("䝙"), false);
    public static final n TOP_LEVEL_PROPERTY_WITH_DELEGATE = new n(ProtectedSandApp.s("䝜"), 35, ProtectedSandApp.s("䝛"), false);
    public static final n TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = new n(ProtectedSandApp.s("䝞"), 36, ProtectedSandApp.s("䝝"), false);
    public static final n BACKING_FIELD = new n(ProtectedSandApp.s("䝟"), 37, ProtectedSandApp.s("䝠"), false, 2, null);
    public static final n INITIALIZER = new n(ProtectedSandApp.s("䝢"), 38, ProtectedSandApp.s("䝡"), false);
    public static final n DESTRUCTURING_DECLARATION = new n(ProtectedSandApp.s("䝤"), 39, ProtectedSandApp.s("䝣"), false);
    public static final n LAMBDA_EXPRESSION = new n(ProtectedSandApp.s("䝦"), 40, ProtectedSandApp.s("䝥"), false);
    public static final n ANONYMOUS_FUNCTION = new n(ProtectedSandApp.s("䝨"), 41, ProtectedSandApp.s("䝧"), false);
    public static final n OBJECT_LITERAL = new n(ProtectedSandApp.s("䝪"), 42, ProtectedSandApp.s("䝩"), false);
    private static final /* synthetic */ n[] $VALUES = $values();

    @d5.d
    public static final a Companion = new a(null);

    @d5.d
    private static final HashMap<String, n> map = new HashMap<>();

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

    static {
        Set<n> a6;
        Set<n> lz;
        List<n> O;
        List<n> O2;
        List<n> O3;
        List<n> O4;
        List<n> O5;
        List<n> O6;
        List<n> O7;
        List<n> O8;
        List<n> k5;
        List<n> k6;
        List<n> k7;
        List<n> k8;
        Map<e, n> W;
        boolean z5 = false;
        int i5 = 2;
        w wVar = null;
        PROPERTY = new n(ProtectedSandApp.s("䜛"), 3, ProtectedSandApp.s("䜜"), z5, i5, wVar);
        boolean z6 = false;
        int i6 = 2;
        w wVar2 = null;
        FIELD = new n(ProtectedSandApp.s("䜝"), 4, ProtectedSandApp.s("䜞"), z6, i6, wVar2);
        LOCAL_VARIABLE = new n(ProtectedSandApp.s("䜟"), 5, ProtectedSandApp.s("䜠"), z5, i5, wVar);
        VALUE_PARAMETER = new n(ProtectedSandApp.s("䜡"), 6, ProtectedSandApp.s("䜢"), z6, i6, wVar2);
        CONSTRUCTOR = new n(ProtectedSandApp.s("䜣"), 7, ProtectedSandApp.s("䜤"), z5, i5, wVar);
        FUNCTION = new n(ProtectedSandApp.s("䜥"), 8, ProtectedSandApp.s("䜦"), z6, i6, wVar2);
        PROPERTY_GETTER = new n(ProtectedSandApp.s("䜧"), 9, ProtectedSandApp.s("䜨"), z5, i5, wVar);
        PROPERTY_SETTER = new n(ProtectedSandApp.s("䜩"), 10, ProtectedSandApp.s("䜪"), z6, i6, wVar2);
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
        a6 = j0.a6(arrayList);
        DEFAULT_TARGET_SET = a6;
        lz = t.lz(values());
        ALL_TARGET_SET = lz;
        n nVar3 = CLASS;
        O = a0.O(ANNOTATION_CLASS, nVar3);
        ANNOTATION_CLASS_LIST = O;
        O2 = a0.O(LOCAL_CLASS, nVar3);
        LOCAL_CLASS_LIST = O2;
        O3 = a0.O(CLASS_ONLY, nVar3);
        CLASS_LIST = O3;
        n nVar4 = OBJECT;
        O4 = a0.O(COMPANION_OBJECT, nVar4, nVar3);
        COMPANION_OBJECT_LIST = O4;
        O5 = a0.O(STANDALONE_OBJECT, nVar4, nVar3);
        OBJECT_LIST = O5;
        O6 = a0.O(INTERFACE, nVar3);
        INTERFACE_LIST = O6;
        O7 = a0.O(ENUM_CLASS, nVar3);
        ENUM_LIST = O7;
        n nVar5 = PROPERTY;
        n nVar6 = FIELD;
        O8 = a0.O(ENUM_ENTRY, nVar5, nVar6);
        ENUM_ENTRY_LIST = O8;
        n nVar7 = PROPERTY_SETTER;
        k5 = z.k(nVar7);
        PROPERTY_SETTER_LIST = k5;
        n nVar8 = PROPERTY_GETTER;
        k6 = z.k(nVar8);
        PROPERTY_GETTER_LIST = k6;
        k7 = z.k(FUNCTION);
        FUNCTION_LIST = k7;
        n nVar9 = FILE;
        k8 = z.k(nVar9);
        FILE_LIST = k8;
        e eVar = e.CONSTRUCTOR_PARAMETER;
        n nVar10 = VALUE_PARAMETER;
        W = f1.W(new Pair(eVar, nVar10), new Pair(e.FIELD, nVar6), new Pair(e.PROPERTY, nVar5), new Pair(e.FILE, nVar9), new Pair(e.PROPERTY_GETTER, nVar8), new Pair(e.PROPERTY_SETTER, nVar7), new Pair(e.RECEIVER, nVar10), new Pair(e.SETTER_PARAMETER, nVar10), new Pair(e.PROPERTY_DELEGATE_FIELD, nVar6));
        USE_SITE_MAPPING = W;
    }

    private n(String str, int i5, String str2, boolean z5) {
        this.description = str2;
        this.isDefault = z5;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    /* synthetic */ n(String str, int i5, String str2, boolean z5, int i6, w wVar) {
        this(str, i5, str2, (i6 & 2) != 0 ? true : z5);
    }
}
