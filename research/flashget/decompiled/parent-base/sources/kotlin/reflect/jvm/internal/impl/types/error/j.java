package kotlin.reflect.jvm.internal.impl.types.error;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorTypeKind.kt */
/* loaded from: classes7.dex */
public final class j {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
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

    @fg.l
    private final String debugMessage;
    private final boolean isUnresolved;
    public static final j UNRESOLVED_TYPE = new j(ProtectedSandApp.s("繫\u0001"), 0, ProtectedSandApp.s("繬\u0001"), true);
    public static final j UNRESOLVED_TYPE_PARAMETER_TYPE = new j(ProtectedSandApp.s("繭\u0001"), 1, ProtectedSandApp.s("繮\u0001"), true);
    public static final j UNRESOLVED_CLASS_TYPE = new j(ProtectedSandApp.s("繰\u0001"), 2, ProtectedSandApp.s("繯\u0001"), true);
    public static final j UNRESOLVED_JAVA_CLASS = new j(ProtectedSandApp.s("繲\u0001"), 3, ProtectedSandApp.s("繱\u0001"), true);
    public static final j UNRESOLVED_DECLARATION = new j(ProtectedSandApp.s("繴\u0001"), 4, ProtectedSandApp.s("繳\u0001"), true);
    public static final j UNRESOLVED_KCLASS_CONSTANT_VALUE = new j(ProtectedSandApp.s("繶\u0001"), 5, ProtectedSandApp.s("繵\u0001"), true);
    public static final j UNRESOLVED_PARCEL_TYPE = new j(ProtectedSandApp.s("绖\u0001"), 53, ProtectedSandApp.s("绕\u0001"), true);

    private static final /* synthetic */ j[] $values() {
        return new j[]{UNRESOLVED_TYPE, UNRESOLVED_TYPE_PARAMETER_TYPE, UNRESOLVED_CLASS_TYPE, UNRESOLVED_JAVA_CLASS, UNRESOLVED_DECLARATION, UNRESOLVED_KCLASS_CONSTANT_VALUE, UNRESOLVED_TYPE_ALIAS, RETURN_TYPE, RETURN_TYPE_FOR_FUNCTION, RETURN_TYPE_FOR_PROPERTY, RETURN_TYPE_FOR_CONSTRUCTOR, IMPLICIT_RETURN_TYPE_FOR_FUNCTION, IMPLICIT_RETURN_TYPE_FOR_PROPERTY, IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR, ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT, RECURSIVE_TYPE, RECURSIVE_TYPE_ALIAS, RECURSIVE_ANNOTATION_TYPE, CYCLIC_UPPER_BOUNDS, CYCLIC_SUPERTYPES, UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE, UNINFERRED_LAMBDA_PARAMETER_TYPE, UNINFERRED_TYPE_VARIABLE, RESOLUTION_ERROR_TYPE, ERROR_EXPECTED_TYPE, ERROR_DATA_FLOW_TYPE, ERROR_WHILE_RECONSTRUCTING_BARE_TYPE, UNABLE_TO_SUBSTITUTE_TYPE, DONT_CARE, STUB_TYPE, FUNCTION_PLACEHOLDER_TYPE, TYPE_FOR_RESULT, TYPE_FOR_COMPILER_EXCEPTION, ERROR_FLEXIBLE_TYPE, ERROR_RAW_TYPE, TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS, ILLEGAL_TYPE_RANGE_FOR_DYNAMIC, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, INCONSISTENT_SUSPEND_FUNCTION, UNEXPECTED_FLEXIBLE_TYPE_ID, UNKNOWN_TYPE, NO_TYPE_SPECIFIED, NO_TYPE_FOR_LOOP_RANGE, NO_TYPE_FOR_LOOP_PARAMETER, MISSED_TYPE_FOR_PARAMETER, MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, PARSE_ERROR_ARGUMENT, STAR_PROJECTION_IN_CALL, PROHIBITED_DYNAMIC_TYPE, NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT, UNIT_RETURN_TYPE_FOR_INC_DEC, RETURN_NOT_ALLOWED, UNRESOLVED_PARCEL_TYPE, KAPT_ERROR_TYPE, SYNTHETIC_ELEMENT_ERROR_TYPE, AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE, ERROR_EXPRESSION_TYPE, ERROR_RECEIVER_TYPE, ERROR_CONSTANT_VALUE, EMPTY_CALLABLE_REFERENCE, UNSUPPORTED_CALLABLE_REFERENCE_TYPE, TYPE_FOR_DELEGATION, UNAVAILABLE_TYPE_FOR_DECLARATION, ERROR_TYPE_PARAMETER, ERROR_TYPE_PROJECTION, ERROR_SUPER_TYPE, SUPER_TYPE_FOR_ERROR_TYPE, ERROR_PROPERTY_TYPE, ERROR_CLASS, TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, INTERSECTION_OF_ERROR_TYPES, CANNOT_COMPUTE_ERASED_BOUND, NOT_FOUND_UNSIGNED_TYPE, ERROR_ENUM_TYPE, NO_RECORDED_TYPE, NOT_FOUND_DESCRIPTOR_FOR_FUNCTION, NOT_FOUND_DESCRIPTOR_FOR_CLASS, NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER, UNMAPPED_ANNOTATION_TARGET_TYPE, UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, NOT_FOUND_FQNAME, TYPE_FOR_GENERATED_ERROR_EXPRESSION};
    }

    static {
        int i4 = 2;
        w wVar = null;
        boolean z4 = false;
        UNRESOLVED_TYPE_ALIAS = new j(ProtectedSandApp.s("繷\u0001"), 6, ProtectedSandApp.s("繸\u0001"), z4, i4, wVar);
        int i5 = 2;
        w wVar2 = null;
        boolean z5 = false;
        RETURN_TYPE = new j(ProtectedSandApp.s("繹\u0001"), 7, ProtectedSandApp.s("繺\u0001"), z5, i5, wVar2);
        RETURN_TYPE_FOR_FUNCTION = new j(ProtectedSandApp.s("繻\u0001"), 8, ProtectedSandApp.s("繼\u0001"), z4, i4, wVar);
        RETURN_TYPE_FOR_PROPERTY = new j(ProtectedSandApp.s("繽\u0001"), 9, ProtectedSandApp.s("繾\u0001"), z5, i5, wVar2);
        RETURN_TYPE_FOR_CONSTRUCTOR = new j(ProtectedSandApp.s("繿\u0001"), 10, ProtectedSandApp.s("纀\u0001"), z4, i4, wVar);
        IMPLICIT_RETURN_TYPE_FOR_FUNCTION = new j(ProtectedSandApp.s("纁\u0001"), 11, ProtectedSandApp.s("纂\u0001"), z5, i5, wVar2);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY = new j(ProtectedSandApp.s("纃\u0001"), 12, ProtectedSandApp.s("纄\u0001"), z4, i4, wVar);
        IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR = new j(ProtectedSandApp.s("纅\u0001"), 13, ProtectedSandApp.s("纆\u0001"), z5, i5, wVar2);
        ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT = new j(ProtectedSandApp.s("纇\u0001"), 14, ProtectedSandApp.s("纈\u0001"), z4, i4, wVar);
        RECURSIVE_TYPE = new j(ProtectedSandApp.s("纉\u0001"), 15, ProtectedSandApp.s("纊\u0001"), z5, i5, wVar2);
        RECURSIVE_TYPE_ALIAS = new j(ProtectedSandApp.s("纋\u0001"), 16, ProtectedSandApp.s("續\u0001"), z4, i4, wVar);
        RECURSIVE_ANNOTATION_TYPE = new j(ProtectedSandApp.s("纍\u0001"), 17, ProtectedSandApp.s("纎\u0001"), z5, i5, wVar2);
        CYCLIC_UPPER_BOUNDS = new j(ProtectedSandApp.s("纏\u0001"), 18, ProtectedSandApp.s("纐\u0001"), z4, i4, wVar);
        CYCLIC_SUPERTYPES = new j(ProtectedSandApp.s("纑\u0001"), 19, ProtectedSandApp.s("纒\u0001"), z5, i5, wVar2);
        UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE = new j(ProtectedSandApp.s("纓\u0001"), 20, ProtectedSandApp.s("纔\u0001"), z4, i4, wVar);
        UNINFERRED_LAMBDA_PARAMETER_TYPE = new j(ProtectedSandApp.s("纕\u0001"), 21, ProtectedSandApp.s("纖\u0001"), z5, i5, wVar2);
        UNINFERRED_TYPE_VARIABLE = new j(ProtectedSandApp.s("纗\u0001"), 22, ProtectedSandApp.s("纘\u0001"), z4, i4, wVar);
        RESOLUTION_ERROR_TYPE = new j(ProtectedSandApp.s("纙\u0001"), 23, ProtectedSandApp.s("纚\u0001"), z5, i5, wVar2);
        ERROR_EXPECTED_TYPE = new j(ProtectedSandApp.s("纛\u0001"), 24, ProtectedSandApp.s("纜\u0001"), z4, i4, wVar);
        ERROR_DATA_FLOW_TYPE = new j(ProtectedSandApp.s("纝\u0001"), 25, ProtectedSandApp.s("纞\u0001"), z5, i5, wVar2);
        ERROR_WHILE_RECONSTRUCTING_BARE_TYPE = new j(ProtectedSandApp.s("纟\u0001"), 26, ProtectedSandApp.s("纠\u0001"), z4, i4, wVar);
        UNABLE_TO_SUBSTITUTE_TYPE = new j(ProtectedSandApp.s("纡\u0001"), 27, ProtectedSandApp.s("红\u0001"), z5, i5, wVar2);
        DONT_CARE = new j(ProtectedSandApp.s("纣\u0001"), 28, ProtectedSandApp.s("纤\u0001"), z4, i4, wVar);
        STUB_TYPE = new j(ProtectedSandApp.s("纥\u0001"), 29, ProtectedSandApp.s("约\u0001"), z5, i5, wVar2);
        FUNCTION_PLACEHOLDER_TYPE = new j(ProtectedSandApp.s("级\u0001"), 30, ProtectedSandApp.s("纨\u0001"), z4, i4, wVar);
        TYPE_FOR_RESULT = new j(ProtectedSandApp.s("纩\u0001"), 31, ProtectedSandApp.s("纪\u0001"), z5, i5, wVar2);
        TYPE_FOR_COMPILER_EXCEPTION = new j(ProtectedSandApp.s("纫\u0001"), 32, ProtectedSandApp.s("纬\u0001"), z4, i4, wVar);
        ERROR_FLEXIBLE_TYPE = new j(ProtectedSandApp.s("纭\u0001"), 33, ProtectedSandApp.s("纮\u0001"), z5, i5, wVar2);
        ERROR_RAW_TYPE = new j(ProtectedSandApp.s("纯\u0001"), 34, ProtectedSandApp.s("纰\u0001"), z4, i4, wVar);
        TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS = new j(ProtectedSandApp.s("纱\u0001"), 35, ProtectedSandApp.s("纲\u0001"), z5, i5, wVar2);
        ILLEGAL_TYPE_RANGE_FOR_DYNAMIC = new j(ProtectedSandApp.s("纳\u0001"), 36, ProtectedSandApp.s("纴\u0001"), z4, i4, wVar);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER = new j(ProtectedSandApp.s("纵\u0001"), 37, ProtectedSandApp.s("纶\u0001"), z5, i5, wVar2);
        CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME = new j(ProtectedSandApp.s("纷\u0001"), 38, ProtectedSandApp.s("纸\u0001"), z4, i4, wVar);
        INCONSISTENT_SUSPEND_FUNCTION = new j(ProtectedSandApp.s("纹\u0001"), 39, ProtectedSandApp.s("纺\u0001"), z5, i5, wVar2);
        UNEXPECTED_FLEXIBLE_TYPE_ID = new j(ProtectedSandApp.s("纻\u0001"), 40, ProtectedSandApp.s("纼\u0001"), z4, i4, wVar);
        UNKNOWN_TYPE = new j(ProtectedSandApp.s("纽\u0001"), 41, ProtectedSandApp.s("纾\u0001"), z5, i5, wVar2);
        NO_TYPE_SPECIFIED = new j(ProtectedSandApp.s("线\u0001"), 42, ProtectedSandApp.s("绀\u0001"), z4, i4, wVar);
        NO_TYPE_FOR_LOOP_RANGE = new j(ProtectedSandApp.s("绁\u0001"), 43, ProtectedSandApp.s("绂\u0001"), z5, i5, wVar2);
        NO_TYPE_FOR_LOOP_PARAMETER = new j(ProtectedSandApp.s("练\u0001"), 44, ProtectedSandApp.s("组\u0001"), z4, i4, wVar);
        MISSED_TYPE_FOR_PARAMETER = new j(ProtectedSandApp.s("绅\u0001"), 45, ProtectedSandApp.s("细\u0001"), z5, i5, wVar2);
        MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER = new j(ProtectedSandApp.s("织\u0001"), 46, ProtectedSandApp.s("终\u0001"), z4, i4, wVar);
        PARSE_ERROR_ARGUMENT = new j(ProtectedSandApp.s("绉\u0001"), 47, ProtectedSandApp.s("绊\u0001"), z5, i5, wVar2);
        STAR_PROJECTION_IN_CALL = new j(ProtectedSandApp.s("绋\u0001"), 48, ProtectedSandApp.s("绌\u0001"), z4, i4, wVar);
        PROHIBITED_DYNAMIC_TYPE = new j(ProtectedSandApp.s("绍\u0001"), 49, ProtectedSandApp.s("绎\u0001"), z5, i5, wVar2);
        NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT = new j(ProtectedSandApp.s("经\u0001"), 50, ProtectedSandApp.s("绐\u0001"), z4, i4, wVar);
        UNIT_RETURN_TYPE_FOR_INC_DEC = new j(ProtectedSandApp.s("绑\u0001"), 51, ProtectedSandApp.s("绒\u0001"), z5, i5, wVar2);
        RETURN_NOT_ALLOWED = new j(ProtectedSandApp.s("结\u0001"), 52, ProtectedSandApp.s("绔\u0001"), z4, i4, wVar);
        KAPT_ERROR_TYPE = new j(ProtectedSandApp.s("绗\u0001"), 54, ProtectedSandApp.s("绘\u0001"), z4, i4, wVar);
        SYNTHETIC_ELEMENT_ERROR_TYPE = new j(ProtectedSandApp.s("给\u0001"), 55, ProtectedSandApp.s("绚\u0001"), z5, i5, wVar2);
        int i6 = 2;
        w wVar3 = null;
        boolean z6 = false;
        AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE = new j(ProtectedSandApp.s("绛\u0001"), 56, ProtectedSandApp.s("络\u0001"), z6, i6, wVar3);
        int i7 = 2;
        w wVar4 = null;
        boolean z7 = false;
        ERROR_EXPRESSION_TYPE = new j(ProtectedSandApp.s("绝\u0001"), 57, ProtectedSandApp.s("绞\u0001"), z7, i7, wVar4);
        ERROR_RECEIVER_TYPE = new j(ProtectedSandApp.s("统\u0001"), 58, ProtectedSandApp.s("绠\u0001"), z6, i6, wVar3);
        ERROR_CONSTANT_VALUE = new j(ProtectedSandApp.s("绡\u0001"), 59, ProtectedSandApp.s("绢\u0001"), z7, i7, wVar4);
        EMPTY_CALLABLE_REFERENCE = new j(ProtectedSandApp.s("绣\u0001"), 60, ProtectedSandApp.s("绤\u0001"), z6, i6, wVar3);
        UNSUPPORTED_CALLABLE_REFERENCE_TYPE = new j(ProtectedSandApp.s("绥\u0001"), 61, ProtectedSandApp.s("绦\u0001"), z7, i7, wVar4);
        TYPE_FOR_DELEGATION = new j(ProtectedSandApp.s("继\u0001"), 62, ProtectedSandApp.s("绨\u0001"), z6, i6, wVar3);
        UNAVAILABLE_TYPE_FOR_DECLARATION = new j(ProtectedSandApp.s("绩\u0001"), 63, ProtectedSandApp.s("绪\u0001"), z7, i7, wVar4);
        ERROR_TYPE_PARAMETER = new j(ProtectedSandApp.s("绫\u0001"), 64, ProtectedSandApp.s("绬\u0001"), z6, i6, wVar3);
        ERROR_TYPE_PROJECTION = new j(ProtectedSandApp.s("续\u0001"), 65, ProtectedSandApp.s("绮\u0001"), z7, i7, wVar4);
        ERROR_SUPER_TYPE = new j(ProtectedSandApp.s("绯\u0001"), 66, ProtectedSandApp.s("绰\u0001"), z6, i6, wVar3);
        SUPER_TYPE_FOR_ERROR_TYPE = new j(ProtectedSandApp.s("绱\u0001"), 67, ProtectedSandApp.s("绲\u0001"), z7, i7, wVar4);
        ERROR_PROPERTY_TYPE = new j(ProtectedSandApp.s("绳\u0001"), 68, ProtectedSandApp.s("维\u0001"), z6, i6, wVar3);
        ERROR_CLASS = new j(ProtectedSandApp.s("绵\u0001"), 69, ProtectedSandApp.s("绶\u0001"), z7, i7, wVar4);
        TYPE_FOR_ERROR_TYPE_CONSTRUCTOR = new j(ProtectedSandApp.s("绷\u0001"), 70, ProtectedSandApp.s("绸\u0001"), z6, i6, wVar3);
        INTERSECTION_OF_ERROR_TYPES = new j(ProtectedSandApp.s("绹\u0001"), 71, ProtectedSandApp.s("绺\u0001"), z7, i7, wVar4);
        CANNOT_COMPUTE_ERASED_BOUND = new j(ProtectedSandApp.s("绻\u0001"), 72, ProtectedSandApp.s("综\u0001"), z6, i6, wVar3);
        NOT_FOUND_UNSIGNED_TYPE = new j(ProtectedSandApp.s("绽\u0001"), 73, ProtectedSandApp.s("绾\u0001"), z7, i7, wVar4);
        ERROR_ENUM_TYPE = new j(ProtectedSandApp.s("绿\u0001"), 74, ProtectedSandApp.s("缀\u0001"), z6, i6, wVar3);
        NO_RECORDED_TYPE = new j(ProtectedSandApp.s("缁\u0001"), 75, ProtectedSandApp.s("缂\u0001"), z7, i7, wVar4);
        NOT_FOUND_DESCRIPTOR_FOR_FUNCTION = new j(ProtectedSandApp.s("缃\u0001"), 76, ProtectedSandApp.s("缄\u0001"), z6, i6, wVar3);
        NOT_FOUND_DESCRIPTOR_FOR_CLASS = new j(ProtectedSandApp.s("缅\u0001"), 77, ProtectedSandApp.s("缆\u0001"), z7, i7, wVar4);
        NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER = new j(ProtectedSandApp.s("缇\u0001"), 78, ProtectedSandApp.s("缈\u0001"), z6, i6, wVar3);
        UNMAPPED_ANNOTATION_TARGET_TYPE = new j(ProtectedSandApp.s("缉\u0001"), 79, ProtectedSandApp.s("缊\u0001"), z7, i7, wVar4);
        UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT = new j(ProtectedSandApp.s("缋\u0001"), 80, ProtectedSandApp.s("缌\u0001"), z6, i6, wVar3);
        NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION = new j(ProtectedSandApp.s("缍\u0001"), 81, ProtectedSandApp.s("缎\u0001"), z7, i7, wVar4);
        NOT_FOUND_FQNAME = new j(ProtectedSandApp.s("缏\u0001"), 82, ProtectedSandApp.s("缐\u0001"), z6, i6, wVar3);
        TYPE_FOR_GENERATED_ERROR_EXPRESSION = new j(ProtectedSandApp.s("缑\u0001"), 83, ProtectedSandApp.s("缒\u0001"), z7, i7, wVar4);
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private j(String str, int i4, String str2, boolean z4) {
        this.debugMessage = str2;
        this.isUnresolved = z4;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    @fg.l
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    public final boolean isUnresolved() {
        return this.isUnresolved;
    }

    /* synthetic */ j(String str, int i4, String str2, boolean z4, int i5, w wVar) {
        this(str, i4, str2, (i5 & 2) != 0 ? false : z4);
    }
}
