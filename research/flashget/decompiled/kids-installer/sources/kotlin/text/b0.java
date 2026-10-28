package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.m2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringBuilder.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001b\u0010\u0004\u001a\u0017\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001a6\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0004\u001a\u0017\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a\u001f\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0087\b\u001a/\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\f0\u000e\"\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000f\u001a/\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0010\u001a-\u0010\n\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u0007H\u0087\b\u001a\u001f\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0087\b\u001a\u001d\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0016H\u0087\b\u001a\u001d\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0017H\u0087\b\u001a\u001d\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\u0006\u0010\r\u001a\u00020\u0012H\u0087\b\u001a\u001f\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0018H\u0087\b\u001a\u001f\u0010\u0015\u001a\u00060\u0006j\u0002`\u0007*\u00060\u0006j\u0002`\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0087\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"buildString", "", "capacity", "", "builderAction", "Lkotlin/Function1;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "Lkotlin/ExtensionFunctionType;", "append", "obj", "", "value", "", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "str", "", "offset", "len", "appendLine", "", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes6.dex */
public class b0 extends a0 {
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @ReplaceWith(expression = "append(value = obj)", imports = {}))
    @InlineOnly
    private static final StringBuilder h0(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賙"));
        sb.append(obj);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("賚"));
        return sb;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use appendRange instead.", replaceWith = @ReplaceWith(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @InlineOnly
    private static final StringBuilder i0(StringBuilder sb, char[] cArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賛"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("賜"));
        throw new NotImplementedError(null, 1, null);
    }

    @d5.d
    public static final StringBuilder j0(@d5.d StringBuilder sb, @d5.d Object... objArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賝"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("賞"));
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @d5.d
    public static StringBuilder k0(@d5.d StringBuilder sb, @d5.d String... strArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賟"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("賠"));
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder l0(StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賡"));
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("賢"));
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder m0(StringBuilder sb, char c6) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賣"));
        sb.append(c6);
        String s5 = ProtectedSandApp.s("賤");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder n0(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賥"));
        sb.append(charSequence);
        String s5 = ProtectedSandApp.s("賦");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder o0(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賧"));
        sb.append(obj);
        String s5 = ProtectedSandApp.s("賨");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder p0(StringBuilder sb, String str) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賩"));
        sb.append(str);
        String s5 = ProtectedSandApp.s("質");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder q0(StringBuilder sb, boolean z5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賫"));
        sb.append(z5);
        String s5 = ProtectedSandApp.s("賬");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final StringBuilder r0(StringBuilder sb, char[] cArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("賭"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("賮"));
        sb.append(cArr);
        String s5 = ProtectedSandApp.s("賯");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        return sb;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final String s0(int i5, q3.l<? super StringBuilder, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("賰"));
        StringBuilder sb = new StringBuilder(i5);
        lVar.N(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("賱"));
        return sb2;
    }

    @InlineOnly
    private static final String t0(q3.l<? super StringBuilder, m2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("賲"));
        StringBuilder sb = new StringBuilder();
        lVar.N(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("賳"));
        return sb2;
    }
}
