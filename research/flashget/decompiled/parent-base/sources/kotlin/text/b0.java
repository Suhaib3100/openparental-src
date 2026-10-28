package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.k2;
import kotlin.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringBuilder.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a&\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\u000b\u001a\u00020\n2\u001b\u0010\t\u001a\u0017\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u001b\u0010\t\u001a\u0017\u0012\b\u0012\u00060\u0000j\u0002`\u0001\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0013\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\u0011\"\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a1\u0010\u0015\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0011\"\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a4\u0010\u001b\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001e\u001a&\u0010 \u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u001fH\u0087\b¢\u0006\u0004\b \u0010!\u001a&\u0010\"\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0087\b¢\u0006\u0004\b\"\u0010#\u001a&\u0010$\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0087\b¢\u0006\u0004\b$\u0010\u0005\u001a$\u0010%\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0012\u001a\u00020\u0017H\u0087\b¢\u0006\u0004\b%\u0010&\u001a$\u0010(\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0012\u001a\u00020'H\u0087\b¢\u0006\u0004\b(\u0010)\u001a$\u0010+\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0012\u001a\u00020*H\u0087\b¢\u0006\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "obj", "h0", "(Ljava/lang/StringBuilder;Ljava/lang/Object;)Ljava/lang/StringBuilder;", "Lkotlin/Function1;", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "", "t0", "(Lld/l;)Ljava/lang/String;", "", "capacity", "s0", "(ILld/l;)Ljava/lang/String;", "", "value", "k0", "(Ljava/lang/StringBuilder;[Ljava/lang/String;)Ljava/lang/StringBuilder;", "j0", "(Ljava/lang/StringBuilder;[Ljava/lang/Object;)Ljava/lang/StringBuilder;", "", "str", "offset", "len", "i0", "(Ljava/lang/StringBuilder;[CII)Ljava/lang/StringBuilder;", "l0", "(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;", "", "n0", "(Ljava/lang/StringBuilder;Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", "p0", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "o0", "r0", "(Ljava/lang/StringBuilder;[C)Ljava/lang/StringBuilder;", "", "m0", "(Ljava/lang/StringBuilder;C)Ljava/lang/StringBuilder;", "", "q0", "(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes7.dex */
public class b0 extends a0 {
    @kotlin.k(level = kotlin.m.WARNING, message = "Use append(value: Any?) instead", replaceWith = @x0(expression = "append(value = obj)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder h0(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        sb.append(obj);
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("菈\u0001"));
        return sb;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "Use appendRange instead.", replaceWith = @x0(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @kotlin.internal.f
    private static final StringBuilder i0(StringBuilder sb, char[] cArr, int i4, int i5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("菉\u0001"));
        throw new kotlin.g0(null, 1, null);
    }

    @fg.l
    public static final StringBuilder j0(@fg.l StringBuilder sb, @fg.l Object... objArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("菊\u0001"));
        for (Object obj : objArr) {
            sb.append(obj);
        }
        return sb;
    }

    @fg.l
    public static StringBuilder k0(@fg.l StringBuilder sb, @fg.l String... strArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        kotlin.jvm.internal.l0.p(strArr, ProtectedSandApp.s("菊\u0001"));
        for (String str : strArr) {
            sb.append(str);
        }
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder l0(StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, ProtectedSandApp.s("菈\u0001"));
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder m0(StringBuilder sb, char c5) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        sb.append(c5);
        String s4 = ProtectedSandApp.s("菈\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder n0(StringBuilder sb, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        sb.append(charSequence);
        String s4 = ProtectedSandApp.s("菈\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder o0(StringBuilder sb, Object obj) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        sb.append(obj);
        String s4 = ProtectedSandApp.s("菈\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder p0(StringBuilder sb, String str) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        sb.append(str);
        String s4 = ProtectedSandApp.s("菈\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder q0(StringBuilder sb, boolean z4) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        sb.append(z4);
        String s4 = ProtectedSandApp.s("菈\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final StringBuilder r0(StringBuilder sb, char[] cArr) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("菇\u0001"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("菊\u0001"));
        sb.append(cArr);
        String s4 = ProtectedSandApp.s("菈\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        return sb;
    }

    @c1(version = "1.1")
    @kotlin.internal.f
    private static final String s0(int i4, ld.l<? super StringBuilder, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("菋\u0001"));
        StringBuilder sb = new StringBuilder(i4);
        lVar.invoke(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("菌\u0001"));
        return sb2;
    }

    @kotlin.internal.f
    private static final String t0(ld.l<? super StringBuilder, k2> lVar) {
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("菋\u0001"));
        StringBuilder sb = new StringBuilder();
        lVar.invoke(sb);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("菌\u0001"));
        return sb2;
    }
}
