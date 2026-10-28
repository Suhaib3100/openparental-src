package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.ranges.IntRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharCategoryJVM.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006."}, d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "()I", "contains", "", "char", "", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.a, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class CharCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CharCategory[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE;

    @d5.d
    private final String code;
    private final int value;
    public static final CharCategory UNASSIGNED = new CharCategory(ProtectedSandApp.s("婒"), 0, 0, ProtectedSandApp.s("婑"));
    public static final CharCategory UPPERCASE_LETTER = new CharCategory(ProtectedSandApp.s("婔"), 1, 1, ProtectedSandApp.s("婓"));
    public static final CharCategory LOWERCASE_LETTER = new CharCategory(ProtectedSandApp.s("婖"), 2, 2, ProtectedSandApp.s("婕"));
    public static final CharCategory TITLECASE_LETTER = new CharCategory(ProtectedSandApp.s("婘"), 3, 3, ProtectedSandApp.s("婗"));
    public static final CharCategory MODIFIER_LETTER = new CharCategory(ProtectedSandApp.s("婚"), 4, 4, ProtectedSandApp.s("婙"));
    public static final CharCategory OTHER_LETTER = new CharCategory(ProtectedSandApp.s("婜"), 5, 5, ProtectedSandApp.s("婛"));
    public static final CharCategory NON_SPACING_MARK = new CharCategory(ProtectedSandApp.s("婞"), 6, 6, ProtectedSandApp.s("婝"));
    public static final CharCategory ENCLOSING_MARK = new CharCategory(ProtectedSandApp.s("婠"), 7, 7, ProtectedSandApp.s("婟"));
    public static final CharCategory COMBINING_SPACING_MARK = new CharCategory(ProtectedSandApp.s("婢"), 8, 8, ProtectedSandApp.s("婡"));
    public static final CharCategory DECIMAL_DIGIT_NUMBER = new CharCategory(ProtectedSandApp.s("婤"), 9, 9, ProtectedSandApp.s("婣"));
    public static final CharCategory LETTER_NUMBER = new CharCategory(ProtectedSandApp.s("婦"), 10, 10, ProtectedSandApp.s("婥"));
    public static final CharCategory OTHER_NUMBER = new CharCategory(ProtectedSandApp.s("婨"), 11, 11, ProtectedSandApp.s("婧"));
    public static final CharCategory SPACE_SEPARATOR = new CharCategory(ProtectedSandApp.s("婪"), 12, 12, ProtectedSandApp.s("婩"));
    public static final CharCategory LINE_SEPARATOR = new CharCategory(ProtectedSandApp.s("婬"), 13, 13, ProtectedSandApp.s("婫"));
    public static final CharCategory PARAGRAPH_SEPARATOR = new CharCategory(ProtectedSandApp.s("婮"), 14, 14, ProtectedSandApp.s("婭"));
    public static final CharCategory CONTROL = new CharCategory(ProtectedSandApp.s("婰"), 15, 15, ProtectedSandApp.s("婯"));
    public static final CharCategory FORMAT = new CharCategory(ProtectedSandApp.s("婲"), 16, 16, ProtectedSandApp.s("婱"));
    public static final CharCategory PRIVATE_USE = new CharCategory(ProtectedSandApp.s("婴"), 17, 18, ProtectedSandApp.s("婳"));
    public static final CharCategory SURROGATE = new CharCategory(ProtectedSandApp.s("婶"), 18, 19, ProtectedSandApp.s("婵"));
    public static final CharCategory DASH_PUNCTUATION = new CharCategory(ProtectedSandApp.s("婸"), 19, 20, ProtectedSandApp.s("婷"));
    public static final CharCategory START_PUNCTUATION = new CharCategory(ProtectedSandApp.s("婺"), 20, 21, ProtectedSandApp.s("婹"));
    public static final CharCategory END_PUNCTUATION = new CharCategory(ProtectedSandApp.s("婼"), 21, 22, ProtectedSandApp.s("婻"));
    public static final CharCategory CONNECTOR_PUNCTUATION = new CharCategory(ProtectedSandApp.s("婾"), 22, 23, ProtectedSandApp.s("婽"));
    public static final CharCategory OTHER_PUNCTUATION = new CharCategory(ProtectedSandApp.s("媀"), 23, 24, ProtectedSandApp.s("婿"));
    public static final CharCategory MATH_SYMBOL = new CharCategory(ProtectedSandApp.s("媂"), 24, 25, ProtectedSandApp.s("媁"));
    public static final CharCategory CURRENCY_SYMBOL = new CharCategory(ProtectedSandApp.s("媄"), 25, 26, ProtectedSandApp.s("媃"));
    public static final CharCategory MODIFIER_SYMBOL = new CharCategory(ProtectedSandApp.s("媆"), 26, 27, ProtectedSandApp.s("媅"));
    public static final CharCategory OTHER_SYMBOL = new CharCategory(ProtectedSandApp.s("媈"), 27, 28, ProtectedSandApp.s("媇"));
    public static final CharCategory INITIAL_QUOTE_PUNCTUATION = new CharCategory(ProtectedSandApp.s("媊"), 28, 29, ProtectedSandApp.s("媉"));
    public static final CharCategory FINAL_QUOTE_PUNCTUATION = new CharCategory(ProtectedSandApp.s("媌"), 29, 30, ProtectedSandApp.s("媋"));

    /* compiled from: CharCategoryJVM.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "()V", "valueOf", "Lkotlin/text/CharCategory;", "category", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.a$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @d5.d
        public final CharCategory a(int i5) {
            if (new IntRange(0, 16).v(i5)) {
                return (CharCategory) CharCategory.getEntries().get(i5);
            }
            if (new IntRange(18, 30).v(i5)) {
                return (CharCategory) CharCategory.getEntries().get(i5 - 1);
            }
            throw new IllegalArgumentException(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("婏"), i5, ProtectedSandApp.s("婐")));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private static final /* synthetic */ CharCategory[] $values() {
        return new CharCategory[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    static {
        CharCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        INSTANCE = new Companion(null);
    }

    private CharCategory(String str, int i5, int i6, String str2) {
        this.value = i6;
        this.code = str2;
    }

    @d5.d
    public static EnumEntries<CharCategory> getEntries() {
        return $ENTRIES;
    }

    public static CharCategory valueOf(String str) {
        return (CharCategory) Enum.valueOf(CharCategory.class, str);
    }

    public static CharCategory[] values() {
        return (CharCategory[]) $VALUES.clone();
    }

    public final boolean contains(char r22) {
        return Character.getType(r22) == this.value;
    }

    @d5.d
    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }
}
