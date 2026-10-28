package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StringBuilderJVM.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a%\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a-\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a-\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a\u0014\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u0012H\u0007\u001a\u001d\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0087\b\u001a\u0014\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0087\b\u001a%\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u0014\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001d\u0010\u0018\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\bH\u0087\b\u001a%\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a5\u0010\u001b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a5\u0010\u001b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a!\u0010\u001c\u001a\u00020\u001d*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\n\u001a-\u0010\u001e\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0087\b\u001a7\u0010\u001f\u001a\u00020\u001d*\u00060\u0001j\u0002`\u00022\u0006\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0087\b¨\u0006\""}, d2 = {"appendLine", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "Ljava/lang/StringBuffer;", "", "", "", "", "", "", "appendRange", "", "startIndex", "endIndex", "", "appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "", "", "", "clear", "deleteAt", "index", "deleteRange", "insertRange", "set", "", "setRange", "toCharArray", "destination", "destinationOffset", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: classes6.dex */
class a0 extends z {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder A(StringBuilder sb, long j5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貋"));
        sb.append(j5);
        String s5 = ProtectedSandApp.s("貌");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder B(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貍"));
        sb.append(stringBuffer);
        String s5 = ProtectedSandApp.s("貎");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder C(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貏"));
        sb.append((CharSequence) sb2);
        String s5 = ProtectedSandApp.s("貐");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder D(StringBuilder sb, short s5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貑"));
        sb.append((int) s5);
        String s6 = ProtectedSandApp.s("貒");
        kotlin.jvm.internal.l0.o(sb, s6);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s6);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder E(StringBuilder sb, CharSequence charSequence, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貓"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("貔"));
        sb.append(charSequence, i5, i6);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貕"));
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder F(StringBuilder sb, char[] cArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貖"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("貗"));
        sb.append(cArr, i5, i6 - i5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貘"));
        return sb;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @d5.d
    public static final Appendable G(@d5.d Appendable appendable) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("貙"));
        Appendable append = appendable.append(SystemProperties.f27122b);
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("貚"));
        return append;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final Appendable H(Appendable appendable, char c6) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("貛"));
        Appendable append = appendable.append(c6);
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("貜"));
        return G(append);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final Appendable I(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("貝"));
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("貞"));
        return G(append);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine()", imports = {}))
    @d5.d
    public static final StringBuilder J(@d5.d StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貟"));
        sb.append(SystemProperties.f27122b);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("負"));
        return sb;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder K(StringBuilder sb, byte b6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("財"));
        sb.append((int) b6);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貢"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder L(StringBuilder sb, char c6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貣"));
        sb.append(c6);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貤"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder M(StringBuilder sb, double d6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貥"));
        sb.append(d6);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貦"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder N(StringBuilder sb, float f6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貧"));
        sb.append(f6);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貨"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder O(StringBuilder sb, int i5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("販"));
        sb.append(i5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貪"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder P(StringBuilder sb, long j5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貫"));
        sb.append(j5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("責"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder Q(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貭"));
        sb.append(charSequence);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貮"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder R(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貯"));
        sb.append(obj);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貰"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder S(StringBuilder sb, String str) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貱"));
        sb.append(str);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貲"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder T(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貳"));
        sb.append(stringBuffer);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貴"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder U(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貵"));
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貶"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder V(StringBuilder sb, short s5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("買"));
        sb.append((int) s5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貸"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder W(StringBuilder sb, boolean z5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貹"));
        sb.append(z5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貺"));
        return J(sb);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @ReplaceWith(expression = "appendLine(value)", imports = {}))
    @InlineOnly
    private static final StringBuilder X(StringBuilder sb, char[] cArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("費"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("貼"));
        sb.append(cArr);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("貽"));
        return J(sb);
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final StringBuilder Y(@d5.d StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貾"));
        sb.setLength(0);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder Z(StringBuilder sb, int i5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("貿"));
        StringBuilder deleteCharAt = sb.deleteCharAt(i5);
        kotlin.jvm.internal.l0.o(deleteCharAt, ProtectedSandApp.s("賀"));
        return deleteCharAt;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder a0(StringBuilder sb, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賁"));
        StringBuilder delete = sb.delete(i5, i6);
        kotlin.jvm.internal.l0.o(delete, ProtectedSandApp.s("賂"));
        return delete;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder b0(StringBuilder sb, int i5, CharSequence charSequence, int i6, int i7) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賃"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("賄"));
        StringBuilder insert = sb.insert(i5, charSequence, i6, i7);
        kotlin.jvm.internal.l0.o(insert, ProtectedSandApp.s("賅"));
        return insert;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder c0(StringBuilder sb, int i5, char[] cArr, int i6, int i7) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賆"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("資"));
        StringBuilder insert = sb.insert(i5, cArr, i6, i7 - i6);
        kotlin.jvm.internal.l0.o(insert, ProtectedSandApp.s("賈"));
        return insert;
    }

    @InlineOnly
    private static final void d0(StringBuilder sb, int i5, char c6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賉"));
        sb.setCharAt(i5, c6);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final StringBuilder e0(StringBuilder sb, int i5, int i6, String str) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賊"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("賋"));
        StringBuilder replace = sb.replace(i5, i6, str);
        kotlin.jvm.internal.l0.o(replace, ProtectedSandApp.s("賌"));
        return replace;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final void f0(StringBuilder sb, char[] cArr, int i5, int i6, int i7) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賍"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("賎"));
        sb.getChars(i6, i7, cArr, i5);
    }

    static /* synthetic */ void g0(StringBuilder sb, char[] cArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = sb.length();
        }
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賏"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("賐"));
        sb.getChars(i6, i7, cArr, i5);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder w(StringBuilder sb, byte b6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賑"));
        sb.append((int) b6);
        String s5 = ProtectedSandApp.s("賒");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder x(StringBuilder sb, double d6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賓"));
        sb.append(d6);
        String s5 = ProtectedSandApp.s("賔");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder y(StringBuilder sb, float f6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賕"));
        sb.append(f6);
        String s5 = ProtectedSandApp.s("賖");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder z(StringBuilder sb, int i5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賗"));
        sb.append(i5);
        String s5 = ProtectedSandApp.s("賘");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }
}
