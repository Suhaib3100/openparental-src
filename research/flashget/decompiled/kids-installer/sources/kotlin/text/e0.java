package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.AbstractList;
import kotlin.collections.IntIterator;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringsJVM.kt */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a\f\u0010\u0017\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010 \u001a\u00020\u0011*\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\f\u0010$\u001a\u00020\u0002*\u00020\u0014H\u0007\u001a \u0010$\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\u0019\u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'H\u0087\u0004\u001a \u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087\b\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0087\b\u001a\f\u0010)\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\f\u0010*\u001a\u00020\u0002*\u00020\rH\u0007\u001a*\u0010*\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\f\u0010,\u001a\u00020\r*\u00020\u0002H\u0007\u001a*\u0010,\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\u001c\u0010-\u001a\u00020#*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a \u0010/\u001a\u00020#*\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u00100\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00104\u001a*\u00100\u001a\u00020\u0002*\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00105\u001a<\u00100\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00106\u001a2\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\n\u00109\u001a\u00020#*\u00020'\u001a\r\u0010:\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u001d\u0010;\u001a\u00020\u0011*\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010;\u001a\u00020\u0011*\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010A\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0011H\u0087\b\u001a4\u0010C\u001a\u00020#*\u00020'2\u0006\u0010D\u001a\u00020\u00112\u0006\u0010!\u001a\u00020'2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u0010C\u001a\u00020#*\u00020\u00022\u0006\u0010D\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0012\u0010F\u001a\u00020\u0002*\u00020'2\u0006\u0010G\u001a\u00020\u0011\u001a$\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020=2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020=2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\"\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020O*\u00020'2\u0006\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020\u0011\u001a\u001c\u0010S\u001a\u00020#*\u00020\u00022\u0006\u0010T\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010S\u001a\u00020#*\u00020\u00022\u0006\u0010T\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0015\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u0017\u0010V\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\r\u0010W\u001a\u00020\u0014*\u00020\u0002H\u0087\b\u001a3\u0010W\u001a\u00020\u0014*\u00020\u00022\u0006\u0010X\u001a\u00020\u00142\b\b\u0002\u0010Y\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a \u0010W\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\r\u0010Z\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010Z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u0017\u0010[\u001a\u00020Q*\u00020\u00022\b\b\u0002\u0010\\\u001a\u00020\u0011H\u0087\b\u001a\r\u0010]\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010]\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\r\u0010^\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010^\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\"%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006_"}, d2 = {"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "locale", "Ljava/util/Locale;", "codePointAt", "index", "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "concatToString", "startIndex", "contentEquals", "", "charSequence", "decapitalize", "decodeToString", "throwOnInvalidSequence", "encodeToByteArray", "endsWith", "suffix", "equals", "format", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "lowercase", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "uppercase", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension({"SMAP\nStringsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,829:1\n1174#2,2:830\n1#3:832\n1726#4,3:833\n*S KotlinDebug\n*F\n+ 1 StringsJVM.kt\nkotlin/text/StringsKt__StringsJVMKt\n*L\n73#1:830,2\n624#1:833,3\n*E\n"})
/* loaded from: classes6.dex */
public class e0 extends d0 {
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @d5.d
    public static final String A1(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贘"));
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        String s5 = ProtectedSandApp.s("贙");
        kotlin.jvm.internal.l0.o(substring, s5);
        kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("贚"));
        String lowerCase = substring.toLowerCase();
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("贛"));
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.l0.o(substring2, s5);
        sb.append(substring2);
        return sb.toString();
    }

    public static /* synthetic */ char[] A2(String str, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        return y2(str, i5, i6);
    }

    @LowPriorityInOverloadResolution
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @d5.d
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String B1(@d5.d String str, @d5.d Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贜"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("贝"));
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        String s5 = ProtectedSandApp.s("贞");
        kotlin.jvm.internal.l0.o(substring, s5);
        kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("负"));
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("贠"));
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        kotlin.jvm.internal.l0.o(substring2, s5);
        sb.append(substring2);
        return sb.toString();
    }

    static /* synthetic */ char[] B2(String str, char[] cArr, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i5 = 0;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = str.length();
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贡"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("财"));
        str.getChars(i6, i7, cArr, i5);
        return cArr;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final String C1(@d5.d byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("责"));
        return new String(bArr, Charsets.f27049b);
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final String C2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贤"));
        String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("败"));
        return lowerCase;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final String D1(@d5.d byte[] bArr, int i5, int i6, boolean z5) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("账"));
        AbstractList.f23126o.a(i5, i6, bArr.length);
        if (!z5) {
            return new String(bArr, i5, i6 - i5, Charsets.f27049b);
        }
        String charBuffer = Charsets.f27049b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i5, i6 - i5)).toString();
        kotlin.jvm.internal.l0.o(charBuffer, ProtectedSandApp.s("货"));
        return charBuffer;
    }

    @Deprecated(message = "Use lowercase() instead.", replaceWith = @ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final String D2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("质"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("贩"));
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("贪"));
        return lowerCase;
    }

    public static /* synthetic */ String E1(byte[] bArr, int i5, int i6, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = bArr.length;
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        return D1(bArr, i5, i6, z5);
    }

    @InlineOnly
    private static final Pattern E2(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贫"));
        Pattern compile = Pattern.compile(str, i5);
        kotlin.jvm.internal.l0.o(compile, ProtectedSandApp.s("贬"));
        return compile;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static byte[] F1(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("购"));
        byte[] bytes = str.getBytes(Charsets.f27049b);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("贮"));
        return bytes;
    }

    static /* synthetic */ Pattern F2(String str, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 0;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贯"));
        Pattern compile = Pattern.compile(str, i5);
        kotlin.jvm.internal.l0.o(compile, ProtectedSandApp.s("贰"));
        return compile;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final byte[] G1(@d5.d String str, int i5, int i6, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贱"));
        AbstractList.f23126o.a(i5, i6, str.length());
        if (!z5) {
            String substring = str.substring(i5, i6);
            kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("贲"));
            Charset charset = Charsets.f27049b;
            kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("贳"));
            byte[] bytes = substring.getBytes(charset);
            kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("贴"));
            return bytes;
        }
        ByteBuffer encode = Charsets.f27049b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i5, i6));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            kotlin.jvm.internal.l0.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                kotlin.jvm.internal.l0.m(array2);
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final String G2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贵"));
        String upperCase = str.toUpperCase();
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("贶"));
        return upperCase;
    }

    public static /* synthetic */ byte[] H1(String str, int i5, int i6, boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = str.length();
        }
        if ((i7 & 4) != 0) {
            z5 = false;
        }
        return G1(str, i5, i6, z5);
    }

    @Deprecated(message = "Use uppercase() instead.", replaceWith = @ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final String H2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贷"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("贸"));
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("费"));
        return upperCase;
    }

    public static final boolean I1(@d5.d String str, @d5.d String str2, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贺"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("贻"));
        return !z5 ? str.endsWith(str2) : b2(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String I2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贼"));
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("贽"));
        return upperCase;
    }

    public static /* synthetic */ boolean J1(String str, String str2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return I1(str, str2, z5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String J2(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("贾"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("贿"));
        String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.l0.o(upperCase, ProtectedSandApp.s("赀"));
        return upperCase;
    }

    public static boolean K1(@d5.e String str, @d5.e String str2, boolean z5) {
        return str == null ? str2 == null : !z5 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean L1(String str, String str2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return K1(str, str2, z5);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String M1(String str, Locale locale, Object... objArr) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赁"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("赂"));
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.l0.o(format, ProtectedSandApp.s("赃"));
        return format;
    }

    @InlineOnly
    private static final String N1(String str, Object... objArr) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("资"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("赅"));
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.l0.o(format, ProtectedSandApp.s("赆"));
        return format;
    }

    @InlineOnly
    private static final String O1(StringCompanionObject stringCompanionObject, String str, Object... objArr) {
        kotlin.jvm.internal.l0.p(stringCompanionObject, ProtectedSandApp.s("赇"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赈"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("赉"));
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.l0.o(format, ProtectedSandApp.s("赊"));
        return format;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final String P1(StringCompanionObject stringCompanionObject, Locale locale, String str, Object... objArr) {
        kotlin.jvm.internal.l0.p(stringCompanionObject, ProtectedSandApp.s("赋"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赌"));
        kotlin.jvm.internal.l0.p(objArr, ProtectedSandApp.s("赍"));
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        kotlin.jvm.internal.l0.o(format, ProtectedSandApp.s("赎"));
        return format;
    }

    @d5.d
    public static Comparator<String> Q1(@d5.d StringCompanionObject stringCompanionObject) {
        kotlin.jvm.internal.l0.p(stringCompanionObject, ProtectedSandApp.s("赏"));
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.l0.o(comparator, ProtectedSandApp.s("赐"));
        return comparator;
    }

    @InlineOnly
    private static final String R1(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赑"));
        String intern = str.intern();
        kotlin.jvm.internal.l0.o(intern, ProtectedSandApp.s("赒"));
        return intern;
    }

    public static boolean S1(@d5.d CharSequence charSequence) {
        boolean z5;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("赓"));
        if (charSequence.length() == 0) {
            return true;
        }
        Iterable f32 = h0.f3(charSequence);
        if (!(f32 instanceof Collection) || !((Collection) f32).isEmpty()) {
            Iterator it = f32.iterator();
            while (it.hasNext()) {
                if (!d.r(charSequence.charAt(((IntIterator) it).nextInt()))) {
                    z5 = false;
                    break;
                }
            }
        }
        z5 = true;
        return z5;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String T1(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赔"));
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("赕"));
        return lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String U1(String str, Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赖"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("赗"));
        String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.l0.o(lowerCase, ProtectedSandApp.s("赘"));
        return lowerCase;
    }

    @InlineOnly
    private static final int V1(String str, char c6, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赙"));
        return str.indexOf(c6, i5);
    }

    @InlineOnly
    private static final int W1(String str, String str2, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赚"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("赛"));
        return str.indexOf(str2, i5);
    }

    @InlineOnly
    private static final int X1(String str, char c6, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赜"));
        return str.lastIndexOf(c6, i5);
    }

    @InlineOnly
    private static final int Y1(String str, String str2, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赝"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("赞"));
        return str.lastIndexOf(str2, i5);
    }

    @InlineOnly
    private static final int Z1(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赟"));
        return str.offsetByCodePoints(i5, i6);
    }

    public static final boolean a2(@d5.d CharSequence charSequence, int i5, @d5.d CharSequence charSequence2, int i6, int i7, boolean z5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("赠"));
        kotlin.jvm.internal.l0.p(charSequence2, ProtectedSandApp.s("赡"));
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? b2((String) charSequence, i5, (String) charSequence2, i6, i7, z5) : h0.Y3(charSequence, i5, charSequence2, i6, i7, z5);
    }

    public static boolean b2(@d5.d String str, int i5, @d5.d String str2, int i6, int i7, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赢"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("赣"));
        return !z5 ? str.regionMatches(i5, str2, i6, i7) : str.regionMatches(z5, i5, str2, i6, i7);
    }

    public static /* synthetic */ boolean c2(CharSequence charSequence, int i5, CharSequence charSequence2, int i6, int i7, boolean z5, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            z5 = false;
        }
        return a2(charSequence, i5, charSequence2, i6, i7, z5);
    }

    @InlineOnly
    private static final String d1(StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(stringBuffer, ProtectedSandApp.s("赤"));
        return new String(stringBuffer);
    }

    public static /* synthetic */ boolean d2(String str, int i5, String str2, int i6, int i7, boolean z5, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            z5 = false;
        }
        return b2(str, i5, str2, i6, i7, z5);
    }

    @InlineOnly
    private static final String e1(StringBuilder sb) {
        kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("赥"));
        return new String(sb);
    }

    @d5.d
    public static String e2(@d5.d CharSequence charSequence, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("赦"));
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException((ProtectedSandApp.s("赧") + i5 + org.apache.commons.io.k.f32026a).toString());
        }
        if (i5 == 0) {
            return "";
        }
        if (i5 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                cArr[i6] = charAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i5);
        IntIterator a6 = kotlin.collections.o.a(1, i5);
        while (a6.hasNext()) {
            a6.nextInt();
            sb.append(charSequence);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.m(sb2);
        return sb2;
    }

    @InlineOnly
    private static final String f1(byte[] bArr) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("赨"));
        return new String(bArr, Charsets.f27049b);
    }

    @d5.d
    public static final String f2(@d5.d String str, char c6, char c7, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赩"));
        if (!z5) {
            String replace = str.replace(c6, c7);
            kotlin.jvm.internal.l0.o(replace, ProtectedSandApp.s("赪"));
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (e.J(charAt, c6, z5)) {
                charAt = c7;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("赫"));
        return sb2;
    }

    @InlineOnly
    private static final String g1(byte[] bArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("赬"));
        return new String(bArr, i5, i6, Charsets.f27049b);
    }

    @d5.d
    public static final String g2(@d5.d String str, @d5.d String str2, @d5.d String str3, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赭"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("赮"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("赯"));
        int i5 = 0;
        int l32 = h0.l3(str, str2, 0, z5);
        if (l32 < 0) {
            return str;
        }
        int length = str2.length();
        int i6 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i5, l32);
            sb.append(str3);
            i5 = l32 + length;
            if (l32 >= str.length()) {
                break;
            }
            l32 = h0.l3(str, str2, l32 + i6, z5);
        } while (l32 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("走"));
        return sb2;
    }

    @InlineOnly
    private static final String h1(byte[] bArr, int i5, int i6, Charset charset) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("赱"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("赲"));
        return new String(bArr, i5, i6, charset);
    }

    public static /* synthetic */ String h2(String str, char c6, char c7, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return f2(str, c6, c7, z5);
    }

    @InlineOnly
    private static final String i1(byte[] bArr, Charset charset) {
        kotlin.jvm.internal.l0.p(bArr, ProtectedSandApp.s("赳"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("赴"));
        return new String(bArr, charset);
    }

    public static /* synthetic */ String i2(String str, String str2, String str3, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return g2(str, str2, str3, z5);
    }

    @InlineOnly
    private static final String j1(char[] cArr) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("赵"));
        return new String(cArr);
    }

    @d5.d
    public static final String j2(@d5.d String str, char c6, char c7, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赶"));
        int o32 = h0.o3(str, c6, 0, z5, 2, null);
        return o32 < 0 ? str : h0.G4(str, o32, o32 + 1, String.valueOf(c7)).toString();
    }

    @InlineOnly
    private static final String k1(char[] cArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("起"));
        return new String(cArr, i5, i6);
    }

    @d5.d
    public static final String k2(@d5.d String str, @d5.d String str2, @d5.d String str3, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赸"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("赹"));
        kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("赺"));
        int p32 = h0.p3(str, str2, 0, z5, 2, null);
        return p32 < 0 ? str : h0.G4(str, p32, str2.length() + p32, str3).toString();
    }

    @InlineOnly
    private static final String l1(int[] iArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(iArr, ProtectedSandApp.s("赻"));
        return new String(iArr, i5, i6);
    }

    public static /* synthetic */ String l2(String str, char c6, char c7, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return j2(str, c6, c7, z5);
    }

    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @d5.d
    public static final String m1(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赼"));
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.l0.o(locale, ProtectedSandApp.s("赽"));
        return n1(str, locale);
    }

    public static /* synthetic */ String m2(String str, String str2, String str3, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return k2(str, str2, str3, z5);
    }

    @LowPriorityInOverloadResolution
    @Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @d5.d
    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String n1(@d5.d String str, @d5.d Locale locale) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("赾"));
        kotlin.jvm.internal.l0.p(locale, ProtectedSandApp.s("赿"));
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        char upperCase = Character.toUpperCase(charAt);
        String s5 = ProtectedSandApp.s("趀");
        if (titleCase != upperCase) {
            sb.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            kotlin.jvm.internal.l0.o(substring, s5);
            kotlin.jvm.internal.l0.n(substring, ProtectedSandApp.s("趁"));
            String upperCase2 = substring.toUpperCase(locale);
            kotlin.jvm.internal.l0.o(upperCase2, ProtectedSandApp.s("趂"));
            sb.append(upperCase2);
        }
        String substring2 = str.substring(1);
        kotlin.jvm.internal.l0.o(substring2, s5);
        sb.append(substring2);
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("趃"));
        return sb2;
    }

    @d5.d
    public static final List<String> n2(@d5.d CharSequence charSequence, @d5.d Pattern pattern, int i5) {
        List<String> t5;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趄"));
        kotlin.jvm.internal.l0.p(pattern, ProtectedSandApp.s("超"));
        h0.K4(i5);
        if (i5 == 0) {
            i5 = -1;
        }
        String[] split = pattern.split(charSequence, i5);
        kotlin.jvm.internal.l0.o(split, ProtectedSandApp.s("趆"));
        t5 = kotlin.collections.p.t(split);
        return t5;
    }

    @InlineOnly
    private static final int o1(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趇"));
        return str.codePointAt(i5);
    }

    public static /* synthetic */ List o2(CharSequence charSequence, Pattern pattern, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return n2(charSequence, pattern, i5);
    }

    @InlineOnly
    private static final int p1(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趈"));
        return str.codePointBefore(i5);
    }

    public static boolean p2(@d5.d String str, @d5.d String str2, int i5, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趉"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("越"));
        return !z5 ? str.startsWith(str2, i5) : b2(str, i5, str2, 0, str2.length(), z5);
    }

    @InlineOnly
    private static final int q1(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趋"));
        return str.codePointCount(i5, i6);
    }

    public static boolean q2(@d5.d String str, @d5.d String str2, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趌"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("趍"));
        return !z5 ? str.startsWith(str2) : b2(str, 0, str2, 0, str2.length(), z5);
    }

    public static int r1(@d5.d String str, @d5.d String str2, boolean z5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趎"));
        kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("趏"));
        return z5 ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    public static /* synthetic */ boolean r2(String str, String str2, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return p2(str, str2, i5, z5);
    }

    public static /* synthetic */ int s1(String str, String str2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return r1(str, str2, z5);
    }

    public static /* synthetic */ boolean s2(String str, String str2, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return q2(str, str2, z5);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final String t1(@d5.d char[] cArr) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("趐"));
        return new String(cArr);
    }

    @InlineOnly
    private static final String t2(String str, int i5) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趑"));
        String substring = str.substring(i5);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("趒"));
        return substring;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final String u1(@d5.d char[] cArr, int i5, int i6) {
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("趓"));
        AbstractList.f23126o.a(i5, i6, cArr.length);
        return new String(cArr, i5, i6 - i5);
    }

    @InlineOnly
    private static final String u2(String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趔"));
        String substring = str.substring(i5, i6);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("趕"));
        return substring;
    }

    public static /* synthetic */ String v1(char[] cArr, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        if ((i7 & 2) != 0) {
            i6 = cArr.length;
        }
        return u1(cArr, i5, i6);
    }

    @InlineOnly
    private static final byte[] v2(String str, Charset charset) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趖"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("趗"));
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("趘"));
        return bytes;
    }

    @SinceKotlin(version = "1.5")
    public static final boolean w1(@d5.e CharSequence charSequence, @d5.e CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? h0.V2(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    static /* synthetic */ byte[] w2(String str, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = Charsets.f27049b;
        }
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趙"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("趚"));
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("趛"));
        return bytes;
    }

    @SinceKotlin(version = "1.5")
    public static final boolean x1(@d5.e CharSequence charSequence, @d5.e CharSequence charSequence2, boolean z5) {
        return z5 ? h0.U2(charSequence, charSequence2) : w1(charSequence, charSequence2);
    }

    @InlineOnly
    private static final char[] x2(String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趜"));
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.l0.o(charArray, ProtectedSandApp.s("趝"));
        return charArray;
    }

    @InlineOnly
    private static final boolean y1(String str, CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趞"));
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("趟"));
        return str.contentEquals(charSequence);
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public static final char[] y2(@d5.d String str, int i5, int i6) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趠"));
        AbstractList.f23126o.a(i5, i6, str.length());
        char[] cArr = new char[i6 - i5];
        str.getChars(i5, i6, cArr, 0);
        return cArr;
    }

    @InlineOnly
    private static final boolean z1(String str, StringBuffer stringBuffer) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趡"));
        kotlin.jvm.internal.l0.p(stringBuffer, ProtectedSandApp.s("趢"));
        return str.contentEquals(stringBuffer);
    }

    @InlineOnly
    private static final char[] z2(String str, char[] cArr, int i5, int i6, int i7) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("趣"));
        kotlin.jvm.internal.l0.p(cArr, ProtectedSandApp.s("趤"));
        str.getChars(i6, i7, cArr, i5);
        return cArr;
    }
}
