package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170%J\u0016\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u0016\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bJ \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bH\u0007J\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020/H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00062"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchAt", "index", "matchEntire", "matches", "matchesAt", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "splitToSequence", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
/* renamed from: kotlin.text.r, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class Regex implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    @d5.d
    public static final a f27159q = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final Pattern f27160o;

    /* renamed from: p, reason: collision with root package name */
    @d5.e
    private Set<? extends RegexOption> f27161p;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.r$a */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i5) {
            return (i5 & 2) != 0 ? i5 | 64 : i5;
        }

        @d5.d
        public final String c(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宜"));
            String quote = Pattern.quote(str);
            kotlin.jvm.internal.l0.o(quote, ProtectedSandApp.s("宝"));
            return quote;
        }

        @d5.d
        public final String d(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("实"));
            String quoteReplacement = Matcher.quoteReplacement(str);
            kotlin.jvm.internal.l0.o(quoteReplacement, ProtectedSandApp.s("実"));
            return quoteReplacement;
        }

        @d5.d
        public final Regex e(@d5.d String str) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宠"));
            return new Regex(str, RegexOption.LITERAL);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.r$b */
    private static final class b implements Serializable {

        /* renamed from: q, reason: collision with root package name */
        @d5.d
        public static final a f27162q = new a(null);

        /* renamed from: r, reason: collision with root package name */
        private static final long f27163r = 0;

        /* renamed from: o, reason: collision with root package name */
        @d5.d
        private final String f27164o;

        /* renamed from: p, reason: collision with root package name */
        private final int f27165p;

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.r$b$a */
        public static final class a {
            private a() {
            }

            public a(kotlin.jvm.internal.w wVar) {
            }
        }

        public b(@d5.d String str, int i5) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("审"));
            this.f27164o = str;
            this.f27165p = i5;
        }

        private final Object c() {
            Pattern compile = Pattern.compile(this.f27164o, this.f27165p);
            kotlin.jvm.internal.l0.o(compile, ProtectedSandApp.s("客"));
            return new Regex(compile);
        }

        /* renamed from: a, reason: from getter */
        public final int getF27165p() {
            return this.f27165p;
        }

        @d5.d
        /* renamed from: b, reason: from getter */
        public final String getF27164o() {
            return this.f27164o;
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.r$c */
    /* loaded from: classes6.dex */
    static final class c extends Lambda implements q3.a<MatchResult> {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ CharSequence f27167q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f27168r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, int i5) {
            super(0);
            this.f27167q = charSequence;
            this.f27168r = i5;
        }

        @Override // q3.a
        @d5.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MatchResult n() {
            return Regex.this.c(this.f27167q, this.f27168r);
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.r$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class d extends kotlin.jvm.internal.h0 implements q3.l<MatchResult, MatchResult> {

        /* renamed from: x, reason: collision with root package name */
        public static final d f27169x = new d();

        d() {
            super(1, MatchResult.class, ProtectedSandApp.s("速"), ProtectedSandApp.s("造"), 0);
        }

        @Override // q3.l
        @d5.e
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final MatchResult N(@d5.d MatchResult matchResult) {
            kotlin.jvm.internal.l0.p(matchResult, ProtectedSandApp.s("逡"));
            return matchResult.next();
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "Lkotlin/text/FlagEnum;", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "kotlin/text/RegexKt$fromInt$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,397:1\n*E\n"})
    /* renamed from: kotlin.text.r$e */
    /* loaded from: classes6.dex */
    static final class e extends Lambda implements q3.l<RegexOption, Boolean> {

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f27170p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i5) {
            super(1);
            this.f27170p = i5;
        }

        @Override // q3.l
        @d5.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean N(RegexOption regexOption) {
            RegexOption regexOption2 = regexOption;
            return Boolean.valueOf((this.f27170p & regexOption2.getMask()) == regexOption2.getValue());
        }
    }

    /* compiled from: Regex.kt */
    @DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {275, 283, 287}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.r$f */
    /* loaded from: classes6.dex */
    static final class f extends RestrictedSuspendLambda implements q3.p<SequenceScope<? super String>, Continuation<? super m2>, Object> {

        /* renamed from: q, reason: collision with root package name */
        Object f27171q;

        /* renamed from: r, reason: collision with root package name */
        int f27172r;

        /* renamed from: s, reason: collision with root package name */
        int f27173s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f27174t;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ CharSequence f27176v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f27177w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CharSequence charSequence, int i5, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f27176v = charSequence;
            this.f27177w = i5;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0072 -> B:13:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.f27173s
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L35
                if (r1 == r4) goto L30
                if (r1 == r3) goto L20
                if (r1 != r2) goto L14
                kotlin.a1.n(r11)
                goto La1
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "逢"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                r11.<init>(r0)
                throw r11
            L20:
                int r1 = r10.f27172r
                java.lang.Object r5 = r10.f27171q
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r10.f27174t
                kotlin.sequences.o r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.a1.n(r11)
                r7 = r10
                r11 = r5
                goto L75
            L30:
                kotlin.a1.n(r11)
                goto Lb3
            L35:
                kotlin.a1.n(r11)
                java.lang.Object r11 = r10.f27174t
                kotlin.sequences.o r11 = (kotlin.sequences.SequenceScope) r11
                kotlin.text.r r1 = kotlin.text.Regex.this
                java.util.regex.Pattern r1 = kotlin.text.Regex.a(r1)
                java.lang.CharSequence r5 = r10.f27176v
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r10.f27177w
                if (r5 == r4) goto La4
                boolean r5 = r1.find()
                if (r5 != 0) goto L53
                goto La4
            L53:
                r5 = 0
                r7 = r10
                r6 = r11
                r11 = r1
                r1 = r5
            L58:
                java.lang.CharSequence r8 = r7.f27176v
                int r9 = r11.start()
                java.lang.CharSequence r5 = r8.subSequence(r5, r9)
                java.lang.String r5 = r5.toString()
                r7.f27174t = r6
                r7.f27171q = r11
                r7.f27172r = r1
                r7.f27173s = r3
                java.lang.Object r5 = r6.f(r5, r7)
                if (r5 != r0) goto L75
                return r0
            L75:
                int r5 = r11.end()
                int r1 = r1 + r4
                int r8 = r7.f27177w
                int r8 = r8 - r4
                if (r1 == r8) goto L85
                boolean r8 = r11.find()
                if (r8 != 0) goto L58
            L85:
                java.lang.CharSequence r11 = r7.f27176v
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r5, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.f27174t = r1
                r7.f27171q = r1
                r7.f27173s = r2
                java.lang.Object r11 = r6.f(r11, r7)
                if (r11 != r0) goto La1
                return r0
            La1:
                kotlin.m2 r11 = kotlin.m2.f23662a
                return r11
            La4:
                java.lang.CharSequence r1 = r10.f27176v
                java.lang.String r1 = r1.toString()
                r10.f27173s = r4
                java.lang.Object r11 = r11.f(r1, r10)
                if (r11 != r0) goto Lb3
                return r0
            Lb3:
                kotlin.m2 r11 = kotlin.m2.f23662a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.f.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d SequenceScope<? super String> sequenceScope, @d5.e Continuation<? super m2> continuation) {
            return ((f) c(sequenceScope, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            f fVar = Regex.this.new f(this.f27176v, this.f27177w, continuation);
            fVar.f27174t = obj;
            return fVar;
        }
    }

    @PublishedApi
    public Regex(@d5.d Pattern pattern) {
        kotlin.jvm.internal.l0.p(pattern, ProtectedSandApp.s("宫"));
        this.f27160o = pattern;
    }

    public static /* synthetic */ MatchResult d(Regex regex, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return regex.c(charSequence, i5);
    }

    public static /* synthetic */ Sequence f(Regex regex, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return regex.e(charSequence, i5);
    }

    public static /* synthetic */ List q(Regex regex, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return regex.p(charSequence, i5);
    }

    public static /* synthetic */ Sequence s(Regex regex, CharSequence charSequence, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return regex.r(charSequence, i5);
    }

    private final Object u() {
        String pattern = this.f27160o.pattern();
        kotlin.jvm.internal.l0.o(pattern, ProtectedSandApp.s("宬"));
        return new b(pattern, this.f27160o.flags());
    }

    public final boolean b(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宭"));
        return this.f27160o.matcher(charSequence).find();
    }

    @d5.e
    public final MatchResult c(@d5.d CharSequence charSequence, int i5) {
        MatchResult f6;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宮"));
        Matcher matcher = this.f27160o.matcher(charSequence);
        kotlin.jvm.internal.l0.o(matcher, ProtectedSandApp.s("宯"));
        f6 = s.f(matcher, i5, charSequence);
        return f6;
    }

    @d5.d
    public final Sequence<MatchResult> e(@d5.d CharSequence charSequence, int i5) {
        Sequence<MatchResult> n5;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宰"));
        if (i5 >= 0 && i5 <= charSequence.length()) {
            n5 = kotlin.sequences.s.n(new c(charSequence, i5), d.f27169x);
            return n5;
        }
        StringBuilder a6 = androidx.core.app.x.a(ProtectedSandApp.s("宱"), i5, ProtectedSandApp.s("宲"));
        a6.append(charSequence.length());
        throw new IndexOutOfBoundsException(a6.toString());
    }

    @d5.d
    public final Set<RegexOption> g() {
        Set set = this.f27161p;
        if (set != null) {
            return set;
        }
        int flags = this.f27160o.flags();
        EnumSet allOf = EnumSet.allOf(RegexOption.class);
        kotlin.jvm.internal.l0.m(allOf);
        kotlin.collections.f0.Q0(allOf, new e(flags));
        Set<RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        kotlin.jvm.internal.l0.o(unmodifiableSet, ProtectedSandApp.s("害"));
        this.f27161p = unmodifiableSet;
        return unmodifiableSet;
    }

    @d5.d
    public final String h() {
        String pattern = this.f27160o.pattern();
        kotlin.jvm.internal.l0.o(pattern, ProtectedSandApp.s("宴"));
        return pattern;
    }

    @SinceKotlin(version = "1.7")
    @d5.e
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final MatchResult i(@d5.d CharSequence charSequence, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宵"));
        Matcher region = this.f27160o.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i5, charSequence.length());
        if (!region.lookingAt()) {
            return null;
        }
        kotlin.jvm.internal.l0.m(region);
        return new MatcherMatchResult(region, charSequence);
    }

    @d5.e
    public final MatchResult j(@d5.d CharSequence charSequence) {
        MatchResult h5;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("家"));
        Matcher matcher = this.f27160o.matcher(charSequence);
        kotlin.jvm.internal.l0.o(matcher, ProtectedSandApp.s("宷"));
        h5 = s.h(matcher, charSequence);
        return h5;
    }

    public final boolean k(@d5.d CharSequence charSequence) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宸"));
        return this.f27160o.matcher(charSequence).matches();
    }

    @SinceKotlin(version = "1.7")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public final boolean l(@d5.d CharSequence charSequence, int i5) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("容"));
        return this.f27160o.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i5, charSequence.length()).lookingAt();
    }

    @d5.d
    public final String m(@d5.d CharSequence charSequence, @d5.d String str) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宺"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("宻"));
        String replaceAll = this.f27160o.matcher(charSequence).replaceAll(str);
        kotlin.jvm.internal.l0.o(replaceAll, ProtectedSandApp.s("宼"));
        return replaceAll;
    }

    @d5.d
    public final String n(@d5.d CharSequence charSequence, @d5.d q3.l<? super MatchResult, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("宽"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("宾"));
        int i5 = 0;
        MatchResult d6 = d(this, charSequence, 0, 2, null);
        if (d6 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i5, d6.d().f().intValue());
            sb.append(lVar.N(d6));
            i5 = d6.d().p().intValue() + 1;
            d6 = d6.next();
            if (i5 >= length) {
                break;
            }
        } while (d6 != null);
        if (i5 < length) {
            sb.append(charSequence, i5, length);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("宿"));
        return sb2;
    }

    @d5.d
    public final String o(@d5.d CharSequence charSequence, @d5.d String str) {
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("寀"));
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("寁"));
        String replaceFirst = this.f27160o.matcher(charSequence).replaceFirst(str);
        kotlin.jvm.internal.l0.o(replaceFirst, ProtectedSandApp.s("寂"));
        return replaceFirst;
    }

    @d5.d
    public final List<String> p(@d5.d CharSequence charSequence, int i5) {
        List<String> k5;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("寃"));
        h0.K4(i5);
        Matcher matcher = this.f27160o.matcher(charSequence);
        if (i5 == 1 || !matcher.find()) {
            k5 = kotlin.collections.z.k(charSequence.toString());
            return k5;
        }
        int i6 = 10;
        if (i5 > 0 && i5 <= 10) {
            i6 = i5;
        }
        ArrayList arrayList = new ArrayList(i6);
        int i7 = i5 - 1;
        int i8 = 0;
        do {
            arrayList.add(charSequence.subSequence(i8, matcher.start()).toString());
            i8 = matcher.end();
            if (i7 >= 0 && arrayList.size() == i7) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i8, charSequence.length()).toString());
        return arrayList;
    }

    @SinceKotlin(version = "1.6")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @d5.d
    public final Sequence<String> r(@d5.d CharSequence charSequence, int i5) {
        Sequence<String> b6;
        kotlin.jvm.internal.l0.p(charSequence, ProtectedSandApp.s("寄"));
        h0.K4(i5);
        b6 = kotlin.sequences.q.b(new f(charSequence, i5, null));
        return b6;
    }

    @d5.d
    /* renamed from: t, reason: from getter */
    public final Pattern getF27160o() {
        return this.f27160o;
    }

    @d5.d
    public String toString() {
        String pattern = this.f27160o.toString();
        kotlin.jvm.internal.l0.o(pattern, ProtectedSandApp.s("寅"));
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@d5.d java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "宣"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "室"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@d5.d java.lang.String r2, @d5.d kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "宨"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "宩"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            kotlin.text.r$a r0 = kotlin.text.Regex.f27159q
            int r3 = r3.getValue()
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "宪"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.t):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Regex(@d5.d java.lang.String r2, @d5.d java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "宥"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "宦"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            kotlin.text.r$a r0 = kotlin.text.Regex.f27159q
            int r3 = kotlin.text.s.e(r3)
            int r3 = kotlin.text.Regex.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "宧"
            java.lang.String r3 = com.flashget.kidsdownloader.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
