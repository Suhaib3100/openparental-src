package a1;

import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.a0;
import kotlin.collections.f1;
import kotlin.jvm.internal.l0;

/* compiled from: LanguageConfig.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/flashget/kidsdownloader/configs/LanguageConfig;", "", "()V", "map", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "serverAlertList", "", "serverAlertMap", "isServerAlertSupport", "", "lan", "isSupport", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final e f44a = new e();

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private static final HashMap<String, String> f45b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final HashMap<String, String> f46c;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final List<String> f47d;

    static {
        HashMap<String, String> M;
        HashMap<String, String> M2;
        List<String> O;
        String s5 = ProtectedSandApp.s("*");
        String s6 = ProtectedSandApp.s("+");
        String s7 = ProtectedSandApp.s(",");
        String s8 = ProtectedSandApp.s("/");
        String s9 = ProtectedSandApp.s("0");
        String s10 = ProtectedSandApp.s("1");
        String s11 = ProtectedSandApp.s("2");
        String s12 = ProtectedSandApp.s("5");
        String s13 = ProtectedSandApp.s("6");
        String s14 = ProtectedSandApp.s("7");
        String s15 = ProtectedSandApp.s("8");
        String s16 = ProtectedSandApp.s("9");
        String s17 = ProtectedSandApp.s("@");
        String s18 = ProtectedSandApp.s("C");
        String s19 = ProtectedSandApp.s("H");
        String s20 = ProtectedSandApp.s("I");
        String s21 = ProtectedSandApp.s("L");
        String s22 = ProtectedSandApp.s("M");
        String s23 = ProtectedSandApp.s("P");
        M = f1.M(new Pair(s5, s5), new Pair(s6, s6), new Pair(s7, s7), new Pair(ProtectedSandApp.s("-"), ProtectedSandApp.s(".")), new Pair(s8, s8), new Pair(s9, s9), new Pair(s10, s10), new Pair(s11, s11), new Pair(ProtectedSandApp.s("3"), ProtectedSandApp.s("4")), new Pair(s12, s12), new Pair(s13, s13), new Pair(s14, s14), new Pair(s15, s15), new Pair(s16, s16), new Pair(ProtectedSandApp.s(":"), ProtectedSandApp.s(";")), new Pair(ProtectedSandApp.s("<"), ProtectedSandApp.s("=")), new Pair(ProtectedSandApp.s(">"), ProtectedSandApp.s("?")), new Pair(s17, s17), new Pair(ProtectedSandApp.s("A"), ProtectedSandApp.s("B")), new Pair(s18, s18), new Pair(ProtectedSandApp.s("D"), ProtectedSandApp.s("E")), new Pair(ProtectedSandApp.s("F"), ProtectedSandApp.s("G")), new Pair(s19, s19), new Pair(s20, s20), new Pair(ProtectedSandApp.s("J"), ProtectedSandApp.s("K")), new Pair(s21, s21), new Pair(s22, s22), new Pair(ProtectedSandApp.s("N"), ProtectedSandApp.s("O")), new Pair(s23, s23));
        f45b = M;
        M2 = f1.M(new Pair(s5, s5), new Pair(s21, s21), new Pair(s22, s22), new Pair(s18, s18), new Pair(s17, s17), new Pair(s15, s15), new Pair(s14, s14), new Pair(s11, s11), new Pair(s10, s10), new Pair(s9, s9), new Pair(s6, s6), new Pair(s13, s13), new Pair(s23, s23), new Pair(s8, s8), new Pair(ProtectedSandApp.s("Q"), ProtectedSandApp.s("R")), new Pair(ProtectedSandApp.s("S"), ProtectedSandApp.s("T")), new Pair(s12, s12), new Pair(s16, s16), new Pair(s19, s19), new Pair(ProtectedSandApp.s("U"), ProtectedSandApp.s("V")), new Pair(s20, s20));
        f46c = M2;
        O = a0.O(ProtectedSandApp.s("W"), ProtectedSandApp.s("X"), ProtectedSandApp.s("Y"), ProtectedSandApp.s("Z"), ProtectedSandApp.s("["), ProtectedSandApp.s("\\"), ProtectedSandApp.s("]"), ProtectedSandApp.s("^"), ProtectedSandApp.s("_"), ProtectedSandApp.s("`"), ProtectedSandApp.s("a"), ProtectedSandApp.s("b"), ProtectedSandApp.s("c"), ProtectedSandApp.s("d"), ProtectedSandApp.s("e"), ProtectedSandApp.s("f"), ProtectedSandApp.s("g"), ProtectedSandApp.s("h"), ProtectedSandApp.s("i"), ProtectedSandApp.s("j"), ProtectedSandApp.s("k"));
        f47d = O;
    }

    private e() {
    }

    public final boolean a(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("l"));
        return f47d.contains(str);
    }

    public final boolean b(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("m"));
        Locale locale = Locale.getDefault();
        l0.o(locale, ProtectedSandApp.s("n"));
        String lowerCase = str.toLowerCase(locale);
        l0.o(lowerCase, ProtectedSandApp.s("o"));
        return !TextUtils.isEmpty(str) && l0.g(lowerCase, f45b.get(lowerCase));
    }
}
