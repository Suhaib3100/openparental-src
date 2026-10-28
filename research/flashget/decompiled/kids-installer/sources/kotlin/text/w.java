package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Appendable.kt */
@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u001a9\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u00032\u0006\u0010\n\u001a\u0002H\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010\fH\u0000¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u0003H\u0087\b\u001a\u001d\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a\u001f\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0006H\u0087\b\u001a7\u0010\u0010\u001a\u0002H\u0001\"\f\b\u0000\u0010\u0001*\u00060\u0002j\u0002`\u0003*\u0002H\u00012\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"append", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "value", "", "", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "appendElement", "", "element", "transform", "Lkotlin/Function1;", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "appendLine", "", "appendRange", "startIndex", "", "endIndex", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes5.dex */
public class w {
    @d5.d
    public static final <T extends Appendable> T a(@d5.d T t5, @d5.d CharSequence... charSequenceArr) {
        kotlin.jvm.internal.l0.p(t5, ProtectedSandApp.s("寏"));
        kotlin.jvm.internal.l0.p(charSequenceArr, ProtectedSandApp.s("寐"));
        for (CharSequence charSequence : charSequenceArr) {
            t5.append(charSequence);
        }
        return t5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@d5.d Appendable appendable, T t5, @d5.e q3.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("寑"));
        if (lVar != null) {
            appendable.append(lVar.N(t5));
            return;
        }
        if (t5 == 0 ? true : t5 instanceof CharSequence) {
            appendable.append((CharSequence) t5);
        } else if (t5 instanceof Character) {
            appendable.append(((Character) t5).charValue());
        } else {
            appendable.append(String.valueOf(t5));
        }
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable c(Appendable appendable) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("寒"));
        Appendable append = appendable.append('\n');
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("寓"));
        return append;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable d(Appendable appendable, char c6) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("寔"));
        Appendable append = appendable.append(c6);
        String s5 = ProtectedSandApp.s("寕");
        kotlin.jvm.internal.l0.o(append, s5);
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.l0.o(append2, s5);
        return append2;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final Appendable e(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("寖"));
        Appendable append = appendable.append(charSequence);
        String s5 = ProtectedSandApp.s("寗");
        kotlin.jvm.internal.l0.o(append, s5);
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.l0.o(append2, s5);
        return append2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final <T extends Appendable> T f(@d5.d T t5, @d5.d CharSequence charSequence, int i5, int i6) {
        kotlin.jvm.internal.l0.p(t5, ProtectedSandApp.s("寘"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("寙"));
        T t6 = (T) t5.append(charSequence, i5, i6);
        kotlin.jvm.internal.l0.n(t6, ProtectedSandApp.s("寚"));
        return t6;
    }
}
