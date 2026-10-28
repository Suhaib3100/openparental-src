package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Appendable.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u0001*\u00028\u00002\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\n\"\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\r\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u0001H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a&\u0010\u000f\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a$\u0010\u0012\u001a\u00060\u0000j\u0002`\u0001*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0002*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "T", "", "value", "", "startIndex", "endIndex", "f", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "a", "(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "c", "(Ljava/lang/Appendable;)Ljava/lang/Appendable;", "e", "(Ljava/lang/Appendable;Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "", "d", "(Ljava/lang/Appendable;C)Ljava/lang/Appendable;", "element", "Lkotlin/Function1;", "transform", "Lkotlin/k2;", "b", "(Ljava/lang/Appendable;Ljava/lang/Object;Lld/l;)V", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes7.dex */
public class w {
    @fg.l
    public static final <T extends Appendable> T a(@fg.l T t4, @fg.l CharSequence... charSequenceArr) {
        kotlin.jvm.internal.l0.p(t4, ProtectedSandApp.s("荭\u0001"));
        kotlin.jvm.internal.l0.p(charSequenceArr, ProtectedSandApp.s("荮\u0001"));
        for (CharSequence charSequence : charSequenceArr) {
            t4.append(charSequence);
        }
        return t4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@fg.l Appendable appendable, T t4, @fg.m ld.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("荭\u0001"));
        if (lVar != null) {
            appendable.append(lVar.invoke(t4));
            return;
        }
        if (t4 == 0 ? true : t4 instanceof CharSequence) {
            appendable.append((CharSequence) t4);
        } else if (t4 instanceof Character) {
            appendable.append(((Character) t4).charValue());
        } else {
            appendable.append(String.valueOf(t4));
        }
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable c(Appendable appendable) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("荭\u0001"));
        Appendable append = appendable.append('\n');
        kotlin.jvm.internal.l0.o(append, ProtectedSandApp.s("药\u0001"));
        return append;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable d(Appendable appendable, char c5) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("荭\u0001"));
        Appendable append = appendable.append(c5);
        String s4 = ProtectedSandApp.s("药\u0001");
        kotlin.jvm.internal.l0.o(append, s4);
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.l0.o(append2, s4);
        return append2;
    }

    @c1(version = "1.4")
    @kotlin.internal.f
    private static final Appendable e(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(appendable, ProtectedSandApp.s("荭\u0001"));
        Appendable append = appendable.append(charSequence);
        String s4 = ProtectedSandApp.s("药\u0001");
        kotlin.jvm.internal.l0.o(append, s4);
        Appendable append2 = append.append('\n');
        kotlin.jvm.internal.l0.o(append2, s4);
        return append2;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.4")
    public static final <T extends Appendable> T f(@fg.l T t4, @fg.l CharSequence charSequence, int i4, int i5) {
        kotlin.jvm.internal.l0.p(t4, ProtectedSandApp.s("荭\u0001"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("荮\u0001"));
        T t5 = (T) t4.append(charSequence, i4, i5);
        kotlin.jvm.internal.l0.n(t5, ProtectedSandApp.s("荰\u0001"));
        return t5;
    }
}
