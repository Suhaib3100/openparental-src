package kotlin.text;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharCategoryJVM.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00063"}, d2 = {"Lkotlin/text/a;", "", "", "value", "", "code", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "", "char", "", "contains", "(C)Z", "I", "getValue", "()I", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "Companion", "a", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE;

    @fg.l
    private final String code;
    private final int value;
    public static final a UNASSIGNED = new a(ProtectedSandApp.s("莊\u0001"), 0, 0, ProtectedSandApp.s("莉\u0001"));
    public static final a UPPERCASE_LETTER = new a(ProtectedSandApp.s("莌\u0001"), 1, 1, ProtectedSandApp.s("莋\u0001"));
    public static final a LOWERCASE_LETTER = new a(ProtectedSandApp.s("莎\u0001"), 2, 2, ProtectedSandApp.s("莍\u0001"));
    public static final a TITLECASE_LETTER = new a(ProtectedSandApp.s("莐\u0001"), 3, 3, ProtectedSandApp.s("莏\u0001"));
    public static final a MODIFIER_LETTER = new a(ProtectedSandApp.s("莒\u0001"), 4, 4, ProtectedSandApp.s("莑\u0001"));
    public static final a OTHER_LETTER = new a(ProtectedSandApp.s("莔\u0001"), 5, 5, ProtectedSandApp.s("莓\u0001"));
    public static final a NON_SPACING_MARK = new a(ProtectedSandApp.s("莖\u0001"), 6, 6, ProtectedSandApp.s("莕\u0001"));
    public static final a ENCLOSING_MARK = new a(ProtectedSandApp.s("莘\u0001"), 7, 7, ProtectedSandApp.s("莗\u0001"));
    public static final a COMBINING_SPACING_MARK = new a(ProtectedSandApp.s("莚\u0001"), 8, 8, ProtectedSandApp.s("莙\u0001"));
    public static final a DECIMAL_DIGIT_NUMBER = new a(ProtectedSandApp.s("莜\u0001"), 9, 9, ProtectedSandApp.s("莛\u0001"));
    public static final a LETTER_NUMBER = new a(ProtectedSandApp.s("莞\u0001"), 10, 10, ProtectedSandApp.s("莝\u0001"));
    public static final a OTHER_NUMBER = new a(ProtectedSandApp.s("莠\u0001"), 11, 11, ProtectedSandApp.s("莟\u0001"));
    public static final a SPACE_SEPARATOR = new a(ProtectedSandApp.s("莢\u0001"), 12, 12, ProtectedSandApp.s("莡\u0001"));
    public static final a LINE_SEPARATOR = new a(ProtectedSandApp.s("莤\u0001"), 13, 13, ProtectedSandApp.s("莣\u0001"));
    public static final a PARAGRAPH_SEPARATOR = new a(ProtectedSandApp.s("莦\u0001"), 14, 14, ProtectedSandApp.s("莥\u0001"));
    public static final a CONTROL = new a(ProtectedSandApp.s("莨\u0001"), 15, 15, ProtectedSandApp.s("莧\u0001"));
    public static final a FORMAT = new a(ProtectedSandApp.s("莪\u0001"), 16, 16, ProtectedSandApp.s("莩\u0001"));
    public static final a PRIVATE_USE = new a(ProtectedSandApp.s("莬\u0001"), 17, 18, ProtectedSandApp.s("莫\u0001"));
    public static final a SURROGATE = new a(ProtectedSandApp.s("莮\u0001"), 18, 19, ProtectedSandApp.s("莭\u0001"));
    public static final a DASH_PUNCTUATION = new a(ProtectedSandApp.s("莰\u0001"), 19, 20, ProtectedSandApp.s("莯\u0001"));
    public static final a START_PUNCTUATION = new a(ProtectedSandApp.s("莲\u0001"), 20, 21, ProtectedSandApp.s("莱\u0001"));
    public static final a END_PUNCTUATION = new a(ProtectedSandApp.s("莴\u0001"), 21, 22, ProtectedSandApp.s("莳\u0001"));
    public static final a CONNECTOR_PUNCTUATION = new a(ProtectedSandApp.s("莶\u0001"), 22, 23, ProtectedSandApp.s("莵\u0001"));
    public static final a OTHER_PUNCTUATION = new a(ProtectedSandApp.s("莸\u0001"), 23, 24, ProtectedSandApp.s("获\u0001"));
    public static final a MATH_SYMBOL = new a(ProtectedSandApp.s("莺\u0001"), 24, 25, ProtectedSandApp.s("莹\u0001"));
    public static final a CURRENCY_SYMBOL = new a(ProtectedSandApp.s("莼\u0001"), 25, 26, ProtectedSandApp.s("莻\u0001"));
    public static final a MODIFIER_SYMBOL = new a(ProtectedSandApp.s("莾\u0001"), 26, 27, ProtectedSandApp.s("莽\u0001"));
    public static final a OTHER_SYMBOL = new a(ProtectedSandApp.s("菀\u0001"), 27, 28, ProtectedSandApp.s("莿\u0001"));
    public static final a INITIAL_QUOTE_PUNCTUATION = new a(ProtectedSandApp.s("菂\u0001"), 28, 29, ProtectedSandApp.s("菁\u0001"));
    public static final a FINAL_QUOTE_PUNCTUATION = new a(ProtectedSandApp.s("菄\u0001"), 29, 30, ProtectedSandApp.s("菃\u0001"));

    /* compiled from: CharCategoryJVM.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/a$a;", "", "<init>", "()V", "", "category", "Lkotlin/text/a;", "a", "(I)Lkotlin/text/a;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @fg.l
        public final a a(int category) {
            if (new kotlin.ranges.l(0, 16, 1).r(category)) {
                return (a) a.getEntries().get(category);
            }
            if (new kotlin.ranges.l(18, 30, 1).r(category)) {
                return (a) a.getEntries().get(category - 1);
            }
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("荫\u0001"), category, ProtectedSandApp.s("荬\u0001")));
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private static final /* synthetic */ a[] $values() {
        return new a[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        INSTANCE = new Companion();
    }

    private a(String str, int i4, int i5, String str2) {
        this.value = i5;
        this.code = str2;
    }

    @fg.l
    public static kotlin.enums.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean contains(char r22) {
        return Character.getType(r22) == this.value;
    }

    @fg.l
    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }
}
