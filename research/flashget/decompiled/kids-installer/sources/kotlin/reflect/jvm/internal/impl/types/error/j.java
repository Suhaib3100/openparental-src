package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.w;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNRESOLVED_TYPE_ALIAS' uses external variables
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
/* compiled from: ErrorTypeKind.kt */
/* loaded from: classes5.dex */
public final class j {
    public static final j AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE;
    public static final j CANNOT_COMPUTE_ERASED_BOUND;
    public static final j CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER;
    public static final j CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME;
    public static final j CYCLIC_SUPERTYPES;
    public static final j CYCLIC_UPPER_BOUNDS;
    public static final j DONT_CARE;
    public static final j EMPTY_CALLABLE_REFERENCE;
    public static final j ERROR_CLASS;
    public static final j ERROR_CONSTANT_VALUE;
    public static final j ERROR_DATA_FLOW_TYPE;
    public static final j ERROR_ENUM_TYPE;
    public static final j ERROR_EXPECTED_TYPE;
    public static final j ERROR_EXPRESSION_TYPE;
    public static final j ERROR_FLEXIBLE_TYPE;
    public static final j ERROR_PROPERTY_TYPE;
    public static final j ERROR_RAW_TYPE;
    public static final j ERROR_RECEIVER_TYPE;
    public static final j ERROR_SUPER_TYPE;
    public static final j ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT;
    public static final j ERROR_TYPE_PARAMETER;
    public static final j ERROR_TYPE_PROJECTION;
    public static final j ERROR_WHILE_RECONSTRUCTING_BARE_TYPE;
    public static final j FUNCTION_PLACEHOLDER_TYPE;
    public static final j ILLEGAL_TYPE_RANGE_FOR_DYNAMIC;
    public static final j IMPLICIT_RETURN_TYPE_FOR_FUNCTION;
    public static final j IMPLICIT_RETURN_TYPE_FOR_PROPERTY;
    public static final j IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR;
    public static final j INCONSISTENT_SUSPEND_FUNCTION;
    public static final j INTERSECTION_OF_ERROR_TYPES;
    public static final j KAPT_ERROR_TYPE;
    public static final j MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
    public static final j MISSED_TYPE_FOR_PARAMETER;
    public static final j NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT;
    public static final j NOT_FOUND_DESCRIPTOR_FOR_CLASS;
    public static final j NOT_FOUND_DESCRIPTOR_FOR_FUNCTION;
    public static final j NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER;
    public static final j NOT_FOUND_FQNAME;
    public static final j NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION;
    public static final j NOT_FOUND_UNSIGNED_TYPE;
    public static final j NO_RECORDED_TYPE;
    public static final j NO_TYPE_FOR_LOOP_PARAMETER;
    public static final j NO_TYPE_FOR_LOOP_RANGE;
    public static final j NO_TYPE_SPECIFIED;
    public static final j PARSE_ERROR_ARGUMENT;
    public static final j PROHIBITED_DYNAMIC_TYPE;
    public static final j RECURSIVE_ANNOTATION_TYPE;
    public static final j RECURSIVE_TYPE;
    public static final j RECURSIVE_TYPE_ALIAS;
    public static final j RESOLUTION_ERROR_TYPE;
    public static final j RETURN_NOT_ALLOWED;
    public static final j RETURN_TYPE;
    public static final j RETURN_TYPE_FOR_CONSTRUCTOR;
    public static final j RETURN_TYPE_FOR_FUNCTION;
    public static final j RETURN_TYPE_FOR_PROPERTY;
    public static final j STAR_PROJECTION_IN_CALL;
    public static final j STUB_TYPE;
    public static final j SUPER_TYPE_FOR_ERROR_TYPE;
    public static final j SYNTHETIC_ELEMENT_ERROR_TYPE;
    public static final j TYPE_FOR_COMPILER_EXCEPTION;
    public static final j TYPE_FOR_DELEGATION;
    public static final j TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
    public static final j TYPE_FOR_GENERATED_ERROR_EXPRESSION;
    public static final j TYPE_FOR_RESULT;
    public static final j TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS;
    public static final j UNABLE_TO_SUBSTITUTE_TYPE;
    public static final j UNAVAILABLE_TYPE_FOR_DECLARATION;
    public static final j UNEXPECTED_FLEXIBLE_TYPE_ID;
    public static final j UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE;
    public static final j UNINFERRED_LAMBDA_PARAMETER_TYPE;
    public static final j UNINFERRED_TYPE_VARIABLE;
    public static final j UNIT_RETURN_TYPE_FOR_INC_DEC;
    public static final j UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT;
    public static final j UNKNOWN_TYPE;
    public static final j UNMAPPED_ANNOTATION_TARGET_TYPE;
    public static final j UNRESOLVED_TYPE_ALIAS;
    public static final j UNSUPPORTED_CALLABLE_REFERENCE_TYPE;

    @d5.d
    private final String debugMessage;
    private final boolean isUnresolved;
    public static final j UNRESOLVED_TYPE = new j(ProtectedSandApp.s("噁"), 0, ProtectedSandApp.s("噂"), true);
    public static final j UNRESOLVED_TYPE_PARAMETER_TYPE = new j(ProtectedSandApp.s("噃"), 1, ProtectedSandApp.s("噄"), true);
    public static final j UNRESOLVED_CLASS_TYPE = new j(ProtectedSandApp.s("噆"), 2, ProtectedSandApp.s("噅"), true);
    public static final j UNRESOLVED_JAVA_CLASS = new j(ProtectedSandApp.s("噈"), 3, ProtectedSandApp.s("噇"), true);
    public static final j UNRESOLVED_DECLARATION = new j(ProtectedSandApp.s("噊"), 4, ProtectedSandApp.s("噉"), true);
    public static final j UNRESOLVED_KCLASS_CONSTANT_VALUE = new j(ProtectedSandApp.s("噌"), 5, ProtectedSandApp.s("噋"), true);
    public static final j UNRESOLVED_PARCEL_TYPE = new j(ProtectedSandApp.s("嚬"), 53, ProtectedSandApp.s("嚫"), true);
    private static final /* synthetic */ j[] $VALUES = $values();

    private static final /* synthetic */ j[] $values() {
        return new j[]{UNRESOLVED_TYPE, UNRESOLVED_TYPE_PARAMETER_TYPE, UNRESOLVED_CLASS_TYPE, UNRESOLVED_JAVA_CLASS, UNRESOLVED_DECLARATION, UNRESOLVED_KCLASS_CONSTANT_VALUE, UNRESOLVED_TYPE_ALIAS, RETURN_TYPE, RETURN_TYPE_FOR_FUNCTION, RETURN_TYPE_FOR_PROPERTY, RETURN_TYPE_FOR_CONSTRUCTOR, IMPLICIT_RETURN_TYPE_FOR_FUNCTION, IMPLICIT_RETURN_TYPE_FOR_PROPERTY, IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR, ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT, RECURSIVE_TYPE, RECURSIVE_TYPE_ALIAS, RECURSIVE_ANNOTATION_TYPE, CYCLIC_UPPER_BOUNDS, CYCLIC_SUPERTYPES, UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE, UNINFERRED_LAMBDA_PARAMETER_TYPE, UNINFERRED_TYPE_VARIABLE, RESOLUTION_ERROR_TYPE, ERROR_EXPECTED_TYPE, ERROR_DATA_FLOW_TYPE, ERROR_WHILE_RECONSTRUCTING_BARE_TYPE, UNABLE_TO_SUBSTITUTE_TYPE, DONT_CARE, STUB_TYPE, FUNCTION_PLACEHOLDER_TYPE, TYPE_FOR_RESULT, TYPE_FOR_COMPILER_EXCEPTION, ERROR_FLEXIBLE_TYPE, ERROR_RAW_TYPE, TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS, ILLEGAL_TYPE_RANGE_FOR_DYNAMIC, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, INCONSISTENT_SUSPEND_FUNCTION, UNEXPECTED_FLEXIBLE_TYPE_ID, UNKNOWN_TYPE, NO_TYPE_SPECIFIED, NO_TYPE_FOR_LOOP_RANGE, NO_TYPE_FOR_LOOP_PARAMETER, MISSED_TYPE_FOR_PARAMETER, MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, PARSE_ERROR_ARGUMENT, STAR_PROJECTION_IN_CALL, PROHIBITED_DYNAMIC_TYPE, NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT, UNIT_RETURN_TYPE_FOR_INC_DEC, RETURN_NOT_ALLOWED, UNRESOLVED_PARCEL_TYPE, KAPT_ERROR_TYPE, SYNTHETIC_ELEMENT_ERROR_TYPE, AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE, ERROR_EXPRESSION_TYPE, ERROR_RECEIVER_TYPE, ERROR_CONSTANT_VALUE, EMPTY_CALLABLE_REFERENCE, UNSUPPORTED_CALLABLE_REFERENCE_TYPE, TYPE_FOR_DELEGATION, UNAVAILABLE_TYPE_FOR_DECLARATION, ERROR_TYPE_PARAMETER, ERROR_TYPE_PROJECTION, ERROR_SUPER_TYPE, SUPER_TYPE_FOR_ERROR_TYPE, ERROR_PROPERTY_TYPE, ERROR_CLASS, TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, INTERSECTION_OF_ERROR_TYPES, CANNOT_COMPUTE_ERASED_BOUND, NOT_FOUND_UNSIGNED_TYPE, ERROR_ENUM_TYPE, NO_RECORDED_TYPE, NOT_FOUND_DESCRIPTOR_FOR_FUNCTION, NOT_FOUND_DESCRIPTOR_FOR_CLASS, NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER, UNMAPPED_ANNOTATION_TARGET_TYPE, UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, NOT_FOUND_FQNAME, TYPE_FOR_GENERATED_ERROR_EXPRESSION};
    }

    static {
        boolean z5 = false;
        int i5 = 2;
        w wVar = null;
        UNRESOLVED_TYPE_ALIAS = new j(ProtectedSandApp.s("噍"), 6, ProtectedSandApp.s("噎"), z5, i5, wVar);
        boolean z6 = false;
        int i6 = 2;
        w wVar2 = null;
        RETURN_TYPE = new j(ProtectedSandApp.s("噏"), 7, ProtectedSandApp.s("噐"), z6, i6, wVar2);
        RETURN_TYPE_FOR_FUNCTION = new j(ProtectedSandApp.s("噑"), 8, ProtectedSandApp.s("噒"), z5, i5, wVar);
        RETURN_TYPE_FOR_PROPERTY = new j(ProtectedSandApp.s("噓"), 9, ProtectedSandApp.s("噔"), z6, i6, wVar2);
        RETURN_TYPE_FOR_CONSTRUCTOR = new j(ProtectedSandApp.s("噕"), 10, ProtectedSandApp.s("噖"), z5, i5, wVar);
        IMPLICIT_RETURN_TYPE_FOR_FUNCTION = new j(ProtectedSandApp.s("噗"), 11, ProtectedSandApp.s("噘"), z6, i6, wVar2);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY = new j(ProtectedSandApp.s("噙"), 12, ProtectedSandApp.s("噚"), z5, i5, wVar);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR = new j(ProtectedSandApp.s("噛"), 13, ProtectedSandApp.s("噜"), z6, i6, wVar2);
        ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT = new j(ProtectedSandApp.s("噝"), 14, ProtectedSandApp.s("噞"), z5, i5, wVar);
        RECURSIVE_TYPE = new j(ProtectedSandApp.s("噟"), 15, ProtectedSandApp.s("噠"), z6, i6, wVar2);
        RECURSIVE_TYPE_ALIAS = new j(ProtectedSandApp.s("噡"), 16, ProtectedSandApp.s("噢"), z5, i5, wVar);
        RECURSIVE_ANNOTATION_TYPE = new j(ProtectedSandApp.s("噣"), 17, ProtectedSandApp.s("噤"), z6, i6, wVar2);
        CYCLIC_UPPER_BOUNDS = new j(ProtectedSandApp.s("噥"), 18, ProtectedSandApp.s("噦"), z5, i5, wVar);
        CYCLIC_SUPERTYPES = new j(ProtectedSandApp.s("噧"), 19, ProtectedSandApp.s("器"), z6, i6, wVar2);
        UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE = new j(ProtectedSandApp.s("噩"), 20, ProtectedSandApp.s("噪"), z5, i5, wVar);
        UNINFERRED_LAMBDA_PARAMETER_TYPE = new j(ProtectedSandApp.s("噫"), 21, ProtectedSandApp.s("噬"), z6, i6, wVar2);
        UNINFERRED_TYPE_VARIABLE = new j(ProtectedSandApp.s("噭"), 22, ProtectedSandApp.s("噮"), z5, i5, wVar);
        RESOLUTION_ERROR_TYPE = new j(ProtectedSandApp.s("噯"), 23, ProtectedSandApp.s("噰"), z6, i6, wVar2);
        ERROR_EXPECTED_TYPE = new j(ProtectedSandApp.s("噱"), 24, ProtectedSandApp.s("噲"), z5, i5, wVar);
        ERROR_DATA_FLOW_TYPE = new j(ProtectedSandApp.s("噳"), 25, ProtectedSandApp.s("噴"), z6, i6, wVar2);
        ERROR_WHILE_RECONSTRUCTING_BARE_TYPE = new j(ProtectedSandApp.s("噵"), 26, ProtectedSandApp.s("噶"), z5, i5, wVar);
        UNABLE_TO_SUBSTITUTE_TYPE = new j(ProtectedSandApp.s("噷"), 27, ProtectedSandApp.s("噸"), z6, i6, wVar2);
        DONT_CARE = new j(ProtectedSandApp.s("噹"), 28, ProtectedSandApp.s("噺"), z5, i5, wVar);
        STUB_TYPE = new j(ProtectedSandApp.s("噻"), 29, ProtectedSandApp.s("噼"), z6, i6, wVar2);
        FUNCTION_PLACEHOLDER_TYPE = new j(ProtectedSandApp.s("噽"), 30, ProtectedSandApp.s("噾"), z5, i5, wVar);
        TYPE_FOR_RESULT = new j(ProtectedSandApp.s("噿"), 31, ProtectedSandApp.s("嚀"), z6, i6, wVar2);
        TYPE_FOR_COMPILER_EXCEPTION = new j(ProtectedSandApp.s("嚁"), 32, ProtectedSandApp.s("嚂"), z5, i5, wVar);
        ERROR_FLEXIBLE_TYPE = new j(ProtectedSandApp.s("嚃"), 33, ProtectedSandApp.s("嚄"), z6, i6, wVar2);
        ERROR_RAW_TYPE = new j(ProtectedSandApp.s("嚅"), 34, ProtectedSandApp.s("嚆"), z5, i5, wVar);
        TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS = new j(ProtectedSandApp.s("嚇"), 35, ProtectedSandApp.s("嚈"), z6, i6, wVar2);
        ILLEGAL_TYPE_RANGE_FOR_DYNAMIC = new j(ProtectedSandApp.s("嚉"), 36, ProtectedSandApp.s("嚊"), z5, i5, wVar);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER = new j(ProtectedSandApp.s("嚋"), 37, ProtectedSandApp.s("嚌"), z6, i6, wVar2);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME = new j(ProtectedSandApp.s("嚍"), 38, ProtectedSandApp.s("嚎"), z5, i5, wVar);
        INCONSISTENT_SUSPEND_FUNCTION = new j(ProtectedSandApp.s("嚏"), 39, ProtectedSandApp.s("嚐"), z6, i6, wVar2);
        UNEXPECTED_FLEXIBLE_TYPE_ID = new j(ProtectedSandApp.s("嚑"), 40, ProtectedSandApp.s("嚒"), z5, i5, wVar);
        UNKNOWN_TYPE = new j(ProtectedSandApp.s("嚓"), 41, ProtectedSandApp.s("嚔"), z6, i6, wVar2);
        NO_TYPE_SPECIFIED = new j(ProtectedSandApp.s("嚕"), 42, ProtectedSandApp.s("嚖"), z5, i5, wVar);
        NO_TYPE_FOR_LOOP_RANGE = new j(ProtectedSandApp.s("嚗"), 43, ProtectedSandApp.s("嚘"), z6, i6, wVar2);
        NO_TYPE_FOR_LOOP_PARAMETER = new j(ProtectedSandApp.s("嚙"), 44, ProtectedSandApp.s("嚚"), z5, i5, wVar);
        MISSED_TYPE_FOR_PARAMETER = new j(ProtectedSandApp.s("嚛"), 45, ProtectedSandApp.s("嚜"), z6, i6, wVar2);
        MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER = new j(ProtectedSandApp.s("嚝"), 46, ProtectedSandApp.s("嚞"), z5, i5, wVar);
        PARSE_ERROR_ARGUMENT = new j(ProtectedSandApp.s("嚟"), 47, ProtectedSandApp.s("嚠"), z6, i6, wVar2);
        STAR_PROJECTION_IN_CALL = new j(ProtectedSandApp.s("嚡"), 48, ProtectedSandApp.s("嚢"), z5, i5, wVar);
        PROHIBITED_DYNAMIC_TYPE = new j(ProtectedSandApp.s("嚣"), 49, ProtectedSandApp.s("嚤"), z6, i6, wVar2);
        NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT = new j(ProtectedSandApp.s("嚥"), 50, ProtectedSandApp.s("嚦"), z5, i5, wVar);
        UNIT_RETURN_TYPE_FOR_INC_DEC = new j(ProtectedSandApp.s("嚧"), 51, ProtectedSandApp.s("嚨"), z6, i6, wVar2);
        RETURN_NOT_ALLOWED = new j(ProtectedSandApp.s("嚩"), 52, ProtectedSandApp.s("嚪"), z5, i5, wVar);
        KAPT_ERROR_TYPE = new j(ProtectedSandApp.s("嚭"), 54, ProtectedSandApp.s("嚮"), z5, i5, wVar);
        SYNTHETIC_ELEMENT_ERROR_TYPE = new j(ProtectedSandApp.s("嚯"), 55, ProtectedSandApp.s("嚰"), z6, i6, wVar2);
        boolean z7 = false;
        int i7 = 2;
        w wVar3 = null;
        AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE = new j(ProtectedSandApp.s("嚱"), 56, ProtectedSandApp.s("嚲"), z7, i7, wVar3);
        boolean z8 = false;
        int i8 = 2;
        w wVar4 = null;
        ERROR_EXPRESSION_TYPE = new j(ProtectedSandApp.s("嚳"), 57, ProtectedSandApp.s("嚴"), z8, i8, wVar4);
        ERROR_RECEIVER_TYPE = new j(ProtectedSandApp.s("嚵"), 58, ProtectedSandApp.s("嚶"), z7, i7, wVar3);
        ERROR_CONSTANT_VALUE = new j(ProtectedSandApp.s("嚷"), 59, ProtectedSandApp.s("嚸"), z8, i8, wVar4);
        EMPTY_CALLABLE_REFERENCE = new j(ProtectedSandApp.s("嚹"), 60, ProtectedSandApp.s("嚺"), z7, i7, wVar3);
        UNSUPPORTED_CALLABLE_REFERENCE_TYPE = new j(ProtectedSandApp.s("嚻"), 61, ProtectedSandApp.s("嚼"), z8, i8, wVar4);
        TYPE_FOR_DELEGATION = new j(ProtectedSandApp.s("嚽"), 62, ProtectedSandApp.s("嚾"), z7, i7, wVar3);
        UNAVAILABLE_TYPE_FOR_DECLARATION = new j(ProtectedSandApp.s("嚿"), 63, ProtectedSandApp.s("囀"), z8, i8, wVar4);
        ERROR_TYPE_PARAMETER = new j(ProtectedSandApp.s("囁"), 64, ProtectedSandApp.s("囂"), z7, i7, wVar3);
        ERROR_TYPE_PROJECTION = new j(ProtectedSandApp.s("囃"), 65, ProtectedSandApp.s("囄"), z8, i8, wVar4);
        ERROR_SUPER_TYPE = new j(ProtectedSandApp.s("囅"), 66, ProtectedSandApp.s("囆"), z7, i7, wVar3);
        SUPER_TYPE_FOR_ERROR_TYPE = new j(ProtectedSandApp.s("囇"), 67, ProtectedSandApp.s("囈"), z8, i8, wVar4);
        ERROR_PROPERTY_TYPE = new j(ProtectedSandApp.s("囉"), 68, ProtectedSandApp.s("囊"), z7, i7, wVar3);
        ERROR_CLASS = new j(ProtectedSandApp.s("囋"), 69, ProtectedSandApp.s("囌"), z8, i8, wVar4);
        TYPE_FOR_ERROR_TYPE_CONSTRUCTOR = new j(ProtectedSandApp.s("囍"), 70, ProtectedSandApp.s("囎"), z7, i7, wVar3);
        INTERSECTION_OF_ERROR_TYPES = new j(ProtectedSandApp.s("囏"), 71, ProtectedSandApp.s("囐"), z8, i8, wVar4);
        CANNOT_COMPUTE_ERASED_BOUND = new j(ProtectedSandApp.s("囑"), 72, ProtectedSandApp.s("囒"), z7, i7, wVar3);
        NOT_FOUND_UNSIGNED_TYPE = new j(ProtectedSandApp.s("囓"), 73, ProtectedSandApp.s("囔"), z8, i8, wVar4);
        ERROR_ENUM_TYPE = new j(ProtectedSandApp.s("囕"), 74, ProtectedSandApp.s("囖"), z7, i7, wVar3);
        NO_RECORDED_TYPE = new j(ProtectedSandApp.s("囗"), 75, ProtectedSandApp.s("囘"), z8, i8, wVar4);
        NOT_FOUND_DESCRIPTOR_FOR_FUNCTION = new j(ProtectedSandApp.s("囙"), 76, ProtectedSandApp.s("囚"), z7, i7, wVar3);
        NOT_FOUND_DESCRIPTOR_FOR_CLASS = new j(ProtectedSandApp.s("四"), 77, ProtectedSandApp.s("囜"), z8, i8, wVar4);
        NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER = new j(ProtectedSandApp.s("囝"), 78, ProtectedSandApp.s("回"), z7, i7, wVar3);
        UNMAPPED_ANNOTATION_TARGET_TYPE = new j(ProtectedSandApp.s("囟"), 79, ProtectedSandApp.s("因"), z8, i8, wVar4);
        UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT = new j(ProtectedSandApp.s("囡"), 80, ProtectedSandApp.s("团"), z7, i7, wVar3);
        NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION = new j(ProtectedSandApp.s("団"), 81, ProtectedSandApp.s("囤"), z8, i8, wVar4);
        NOT_FOUND_FQNAME = new j(ProtectedSandApp.s("囥"), 82, ProtectedSandApp.s("囦"), z7, i7, wVar3);
        TYPE_FOR_GENERATED_ERROR_EXPRESSION = new j(ProtectedSandApp.s("囧"), 83, ProtectedSandApp.s("囨"), z8, i8, wVar4);
    }

    private j(String str, int i5, String str2, boolean z5) {
        this.debugMessage = str2;
        this.isUnresolved = z5;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @d5.d
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final boolean isUnresolved() {
        return this.isUnresolved;
    }

    /* synthetic */ j(String str, int i5, String str2, boolean z5, int i6, w wVar) {
        this(str, i5, str2, (i6 & 2) != 0 ? false : z5);
    }
}
