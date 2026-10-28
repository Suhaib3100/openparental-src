package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.r1;
import kotlin.o2;
import kotlin.x0;

/* compiled from: StringBuilderJVM.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u001b\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\t\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\t\u0010\n\u001a4\u0010\u000e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a,\u0010\u0012\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a>\u0010\u0017\u001a\u00020\b*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a4\u0010\u0019\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a4\u0010\u001c\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a<\u0010\u001e\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a<\u0010 \u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b \u0010!\u001a&\u0010#\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\"H\u0087\b¢\u0006\u0004\b#\u0010$\u001a,\u0010%\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0087\b¢\u0006\u0004\b%\u0010&\u001a$\u0010'\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b'\u0010\u0011\u001a$\u0010)\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020(H\u0087\b¢\u0006\u0004\b)\u0010*\u001a$\u0010,\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020+H\u0087\b¢\u0006\u0004\b,\u0010-\u001a$\u0010/\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020.H\u0087\b¢\u0006\u0004\b/\u00100\u001a$\u00102\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u000201H\u0087\b¢\u0006\u0004\b2\u00103\u001a$\u00105\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u000204H\u0087\b¢\u0006\u0004\b5\u00106\u001a\u001b\u00109\u001a\u000607j\u0002`8*\u000607j\u0002`8H\u0007¢\u0006\u0004\b9\u0010:\u001a&\u0010;\u001a\u000607j\u0002`8*\u000607j\u0002`82\b\u0010\u0007\u001a\u0004\u0018\u00010\u001bH\u0087\b¢\u0006\u0004\b;\u0010<\u001a$\u0010=\u001a\u000607j\u0002`8*\u000607j\u0002`82\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b=\u0010>\u001a\u001b\u0010?\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b?\u0010\u0003\u001a&\u0010@\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\"H\u0087\b¢\u0006\u0004\b@\u0010$\u001a&\u0010A\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u001bH\u0087\b¢\u0006\u0004\bA\u0010B\u001a&\u0010C\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0087\b¢\u0006\u0004\bC\u0010D\u001a&\u0010F\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010EH\u0087\b¢\u0006\u0004\bF\u0010G\u001a,\u0010H\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0087\b¢\u0006\u0004\bH\u0010&\u001a$\u0010I\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020\u0014H\u0087\b¢\u0006\u0004\bI\u0010J\u001a$\u0010K\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\bK\u0010L\u001a$\u0010N\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020MH\u0087\b¢\u0006\u0004\bN\u0010O\u001a$\u0010P\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\bP\u0010\u0011\u001a$\u0010Q\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020(H\u0087\b¢\u0006\u0004\bQ\u0010*\u001a$\u0010R\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020+H\u0087\b¢\u0006\u0004\bR\u0010-\u001a$\u0010S\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u00020.H\u0087\b¢\u0006\u0004\bS\u00100\u001a$\u0010T\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u000201H\u0087\b¢\u0006\u0004\bT\u00103\u001a$\u0010U\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0007\u001a\u000204H\u0087\b¢\u0006\u0004\bU\u00106¨\u0006V"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Y", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "", "index", "", "value", "Lkotlin/k2;", "d0", "(Ljava/lang/StringBuilder;IC)V", "startIndex", "endIndex", "", "e0", "(Ljava/lang/StringBuilder;IILjava/lang/String;)Ljava/lang/StringBuilder;", "Z", "(Ljava/lang/StringBuilder;I)Ljava/lang/StringBuilder;", "a0", "(Ljava/lang/StringBuilder;II)Ljava/lang/StringBuilder;", "", "destination", "destinationOffset", "f0", "(Ljava/lang/StringBuilder;[CIII)V", "F", "(Ljava/lang/StringBuilder;[CII)Ljava/lang/StringBuilder;", "", "E", "(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;", "c0", "(Ljava/lang/StringBuilder;I[CII)Ljava/lang/StringBuilder;", "b0", "(Ljava/lang/StringBuilder;ILjava/lang/CharSequence;II)Ljava/lang/StringBuilder;", "Ljava/lang/StringBuffer;", "B", "(Ljava/lang/StringBuilder;Ljava/lang/StringBuffer;)Ljava/lang/StringBuilder;", "C", "(Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "z", "", "D", "(Ljava/lang/StringBuilder;S)Ljava/lang/StringBuilder;", "", "w", "(Ljava/lang/StringBuilder;B)Ljava/lang/StringBuilder;", "", "A", "(Ljava/lang/StringBuilder;J)Ljava/lang/StringBuilder;", "", "y", "(Ljava/lang/StringBuilder;F)Ljava/lang/StringBuilder;", "", "x", "(Ljava/lang/StringBuilder;D)Ljava/lang/StringBuilder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "G", "(Ljava/lang/Appendable;)Ljava/lang/Appendable;", "I", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "H", "(Ljava/lang/Appendable;C)Ljava/lang/Appendable;", "J", "T", "Q", "(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", "S", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "", "R", "(Ljava/lang/StringBuilder;Ljava/lang/Object;)Ljava/lang/StringBuilder;", "U", "X", "(Ljava/lang/StringBuilder;[C)Ljava/lang/StringBuilder;", "L", "(Ljava/lang/StringBuilder;C)Ljava/lang/StringBuilder;", "", "W", "(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;", "O", "V", "K", "P", "N", "M", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@r1({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"})
/* loaded from: classes7.dex */
class a0 extends z {
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder A(StringBuilder sb, long j4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(j4);
        String s4 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder B(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(stringBuffer);
        String s4 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder C(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append((CharSequence) sb2);
        String s4 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder D(StringBuilder sb, short s4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append((int) s4);
        String s5 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder E(StringBuilder sb, CharSequence charSequence, int i4, int i5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("莃\u0001"));
        sb.append(charSequence, i4, i5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return sb;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder F(StringBuilder sb, char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("莃\u0001"));
        sb.append(cArr, i4, i5 - i4);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return sb;
    }

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine()", imports = {}))
    public static final Appendable G(@fg.l Appendable appendable) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("莁\u0001"));
        Appendable append = appendable.append(k0.LINE_SEPARATOR);
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("莂\u0001"));
        return append;
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable H(Appendable appendable, char c5) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("莁\u0001"));
        Appendable append = appendable.append(c5);
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("莂\u0001"));
        return G(append);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final Appendable I(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("莁\u0001"));
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("莂\u0001"));
        return G(append);
    }

    @fg.l
    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine()", imports = {}))
    public static final StringBuilder J(@fg.l StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(k0.LINE_SEPARATOR);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return sb;
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder K(StringBuilder sb, byte b5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append((int) b5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder L(StringBuilder sb, char c5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(c5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder M(StringBuilder sb, double d5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(d5);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder N(StringBuilder sb, float f4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(f4);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder O(StringBuilder sb, int i4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(i4);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder P(StringBuilder sb, long j4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(j4);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder Q(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(charSequence);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder R(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(obj);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder S(StringBuilder sb, String str) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(str);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder T(StringBuilder sb, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(stringBuffer);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder U(StringBuilder sb, StringBuilder sb2) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append((CharSequence) sb2);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder V(StringBuilder sb, short s4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append((int) s4);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder W(StringBuilder sb, boolean z4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(z4);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @kotlin.k(level = kotlin.m.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @x0(expression = "appendLine(value)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder X(StringBuilder sb, char[] cArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("莃\u0001"));
        sb.append(cArr);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("莂\u0001"));
        return J(sb);
    }

    @fg.l
    @c1(version = "1.3")
    public static final StringBuilder Y(@fg.l StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.setLength(0);
        return sb;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder Z(StringBuilder sb, int i4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        StringBuilder deleteCharAt = sb.deleteCharAt(i4);
        kotlin.jvm.internal.l0.o(deleteCharAt, ProtectedSandApp.s("莄\u0001"));
        return deleteCharAt;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder a0(StringBuilder sb, int i4, int i5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        StringBuilder delete = sb.delete(i4, i5);
        kotlin.jvm.internal.l0.o(delete, ProtectedSandApp.s("莅\u0001"));
        return delete;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder b0(StringBuilder sb, int i4, CharSequence charSequence, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("莃\u0001"));
        StringBuilder insert = sb.insert(i4, charSequence, i5, i6);
        kotlin.jvm.internal.l0.o(insert, ProtectedSandApp.s("莆\u0001"));
        return insert;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder c0(StringBuilder sb, int i4, char[] cArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("莃\u0001"));
        StringBuilder insert = sb.insert(i4, cArr, i5, i6 - i5);
        kotlin.jvm.internal.l0.o(insert, ProtectedSandApp.s("莆\u0001"));
        return insert;
    }

    @kotlin.internal.f
    private static final void d0(StringBuilder sb, int i4, char c5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.setCharAt(i4, c5);
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder e0(StringBuilder sb, int i4, int i5, String str) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("莃\u0001"));
        StringBuilder replace = sb.replace(i4, i5, str);
        kotlin.jvm.internal.l0.o(replace, ProtectedSandApp.s("莇\u0001"));
        return replace;
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    @kotlin.internal.f
    private static final void f0(StringBuilder sb, char[] cArr, int i4, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("莈\u0001"));
        sb.getChars(i5, i6, cArr, i4);
    }

    static /* synthetic */ void g0(StringBuilder sb, char[] cArr, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = sb.length();
        }
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("莈\u0001"));
        sb.getChars(i5, i6, cArr, i4);
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder w(StringBuilder sb, byte b5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append((int) b5);
        String s4 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder x(StringBuilder sb, double d5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(d5);
        String s4 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder y(StringBuilder sb, float f4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(f4);
        String s4 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder z(StringBuilder sb, int i4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("莁\u0001"));
        sb.append(i4);
        String s4 = ProtectedSandApp.s("莂\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }
}
