package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlin.o2;
import kotlin.w0;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\u0018\u0000 >2\u00060\u0001j\u0002`\u0002:\u0002?\u0018B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b$\u0010\u001dJ\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0019H\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J)\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130*¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0007¢\u0006\u0004\b.\u0010)J%\u00101\u001a\b\u0012\u0004\u0012\u00020\u0007002\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020\u0019¢\u0006\u0004\b1\u00102J'\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020\u0019H\u0007¢\u0006\u0004\b3\u0010 J\u000f\u00104\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0003¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00108R\u001e\u0010:\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0011\u0010\b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b;\u00105R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r8F¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lkotlin/text/r;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/t;", "option", "(Ljava/lang/String;Lkotlin/text/t;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "u", "()Ljava/lang/Object;", "", "input", "", "k", "(Ljava/lang/CharSequence;)Z", "b", "", "startIndex", "Lkotlin/text/p;", "c", "(Ljava/lang/CharSequence;I)Lkotlin/text/p;", "Lkotlin/sequences/m;", "e", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/m;", "j", "(Ljava/lang/CharSequence;)Lkotlin/text/p;", "index", "i", "l", "(Ljava/lang/CharSequence;I)Z", "replacement", "m", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "n", "(Ljava/lang/CharSequence;Lld/l;)Ljava/lang/String;", "o", "limit", "", "p", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "r", "toString", "()Ljava/lang/String;", "t", "()Ljava/util/regex/Pattern;", "Ljava/util/regex/Pattern;", "Ljava/util/Set;", "_options", "h", "g", "()Ljava/util/Set;", "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n22#2,3:398\n1#3:401\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:398,3\n*E\n"})
/* loaded from: classes7.dex */
public final class r implements Serializable {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Pattern nativePattern;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Set<? extends t> _options;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/text/r$a;", "", "<init>", "()V", "", "flags", "b", "(I)I", "", "literal", "Lkotlin/text/r;", "e", "(Ljava/lang/String;)Lkotlin/text/r;", "c", "(Ljava/lang/String;)Ljava/lang/String;", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.r$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int flags) {
            return (flags & 2) != 0 ? flags | 64 : flags;
        }

        @fg.l
        public final String c(@fg.l String literal) {
            kotlin.jvm.internal.l0.p(literal, ProtectedSandApp.s("蓝\u0001"));
            String quote = Pattern.quote(literal);
            kotlin.jvm.internal.l0.o(quote, ProtectedSandApp.s("蓞\u0001"));
            return quote;
        }

        @fg.l
        public final String d(@fg.l String literal) {
            kotlin.jvm.internal.l0.p(literal, ProtectedSandApp.s("蓝\u0001"));
            String quoteReplacement = Matcher.quoteReplacement(literal);
            kotlin.jvm.internal.l0.o(quoteReplacement, ProtectedSandApp.s("蓟\u0001"));
            return quoteReplacement;
        }

        @fg.l
        public final r e(@fg.l String literal) {
            kotlin.jvm.internal.l0.p(literal, ProtectedSandApp.s("蓝\u0001"));
            return new r(literal, t.LITERAL);
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0010B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/text/r$b;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "", "flags", "<init>", "(Ljava/lang/String;I)V", "", "c", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "I", "a", "()I", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f79176e = 0;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String pattern;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int flags;

        public b(@fg.l String str, int i4) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蓠\u0001"));
            this.pattern = str;
            this.flags = i4;
        }

        private final Object c() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            kotlin.jvm.internal.l0.o(compile, ProtectedSandApp.s("蓡\u0001"));
            return new r(compile);
        }

        /* renamed from: a, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final String getPattern() {
            return this.pattern;
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/p;", "a", "()Lkotlin/text/p;"}, k = 3, mv = {1, 9, 0})
    static final class c extends kotlin.jvm.internal.n0 implements ld.a<p> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CharSequence f79180c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f79181d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence, int i4) {
            super(0);
            this.f79180c = charSequence;
            this.f79181d = i4;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return r.this.c(this.f79180c, this.f79181d);
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class d extends kotlin.jvm.internal.h0 implements ld.l<p, p> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f79182d = new d();

        d() {
            super(1, p.class, ProtectedSandApp.s("蓣\u0001"), ProtectedSandApp.s("蓢\u0001"), 0);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final p invoke(@fg.l p pVar) {
            kotlin.jvm.internal.l0.p(pVar, ProtectedSandApp.s("蓤\u0001"));
            return pVar.next();
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/text/i;", "", "T", "kotlin.jvm.PlatformType", "it", "", "a", "(Ljava/lang/Enum;)Ljava/lang/Boolean;", "kotlin/text/s$a"}, k = 3, mv = {1, 9, 0})
    @r1({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/RegexKt$fromInt$1$1\n*L\n1#1,397:1\n*E\n"})
    static final class e extends kotlin.jvm.internal.n0 implements ld.l<t, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f79183b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i4) {
            super(1);
            this.f79183b = i4;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(t tVar) {
            t tVar2 = tVar;
            return Boolean.valueOf((this.f79183b & tVar2.getMask()) == tVar2.getValue());
        }
    }

    /* compiled from: Regex.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {275, 283, 287}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/o;", "", "Lkotlin/k2;", "<anonymous>", "(Lkotlin/sequences/o;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends kotlin.coroutines.jvm.internal.k implements ld.p<kotlin.sequences.o<? super String>, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: c, reason: collision with root package name */
        Object f79184c;

        /* renamed from: d, reason: collision with root package name */
        int f79185d;

        /* renamed from: e, reason: collision with root package name */
        int f79186e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f79187f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CharSequence f79189h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f79190i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CharSequence charSequence, int i4, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f79189h = charSequence;
            this.f79190i = i4;
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l kotlin.sequences.o<? super String> oVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(oVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            f fVar = r.this.new f(this.f79189h, this.f79190i, dVar);
            fVar.f79187f = obj;
            return fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0070 -> B:13:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@fg.l java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                int r1 = r9.f79186e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2f
                if (r1 == r3) goto L20
                if (r1 != r2) goto L14
                kotlin.a1.n(r10)
                goto L9f
            L14:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "蓥\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                r10.<init>(r0)
                throw r10
            L20:
                int r1 = r9.f79185d
                java.lang.Object r5 = r9.f79184c
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r9.f79187f
                kotlin.sequences.o r6 = (kotlin.sequences.o) r6
                kotlin.a1.n(r10)
                r10 = r5
                goto L73
            L2f:
                kotlin.a1.n(r10)
                goto Lb1
            L34:
                kotlin.a1.n(r10)
                java.lang.Object r10 = r9.f79187f
                kotlin.sequences.o r10 = (kotlin.sequences.o) r10
                kotlin.text.r r1 = kotlin.text.r.this
                java.util.regex.Pattern r1 = kotlin.text.r.a(r1)
                java.lang.CharSequence r5 = r9.f79189h
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r9.f79190i
                if (r5 == r4) goto La2
                boolean r5 = r1.find()
                if (r5 != 0) goto L52
                goto La2
            L52:
                r5 = 0
                r6 = r10
                r10 = r1
                r1 = r5
            L56:
                java.lang.CharSequence r7 = r9.f79189h
                int r8 = r10.start()
                java.lang.CharSequence r5 = r7.subSequence(r5, r8)
                java.lang.String r5 = r5.toString()
                r9.f79187f = r6
                r9.f79184c = r10
                r9.f79185d = r1
                r9.f79186e = r3
                java.lang.Object r5 = r6.b(r5, r9)
                if (r5 != r0) goto L73
                return r0
            L73:
                int r5 = r10.end()
                int r1 = r1 + r4
                int r7 = r9.f79190i
                int r7 = r7 - r4
                if (r1 == r7) goto L83
                boolean r7 = r10.find()
                if (r7 != 0) goto L56
            L83:
                java.lang.CharSequence r10 = r9.f79189h
                int r1 = r10.length()
                java.lang.CharSequence r10 = r10.subSequence(r5, r1)
                java.lang.String r10 = r10.toString()
                r1 = 0
                r9.f79187f = r1
                r9.f79184c = r1
                r9.f79186e = r2
                java.lang.Object r10 = r6.b(r10, r9)
                if (r10 != r0) goto L9f
                return r0
            L9f:
                kotlin.k2 r10 = kotlin.k2.f75408a
                return r10
            La2:
                java.lang.CharSequence r1 = r9.f79189h
                java.lang.String r1 = r1.toString()
                r9.f79186e = r4
                java.lang.Object r10 = r10.b(r1, r9)
                if (r10 != r0) goto Lb1
                return r0
            Lb1:
                kotlin.k2 r10 = kotlin.k2.f75408a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @w0
    public r(@fg.l Pattern pattern) {
        kotlin.jvm.internal.l0.p(pattern, ProtectedSandApp.s("蓪\u0001"));
        this.nativePattern = pattern;
    }

    public static /* synthetic */ p d(r rVar, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return rVar.c(charSequence, i4);
    }

    public static /* synthetic */ kotlin.sequences.m f(r rVar, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return rVar.e(charSequence, i4);
    }

    public static /* synthetic */ List q(r rVar, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return rVar.p(charSequence, i4);
    }

    public static /* synthetic */ kotlin.sequences.m s(r rVar, CharSequence charSequence, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return rVar.r(charSequence, i4);
    }

    private final Object u() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.l0.o(pattern, ProtectedSandApp.s("蓫\u0001"));
        return new b(pattern, this.nativePattern.flags());
    }

    public final boolean b(@fg.l CharSequence input) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        return this.nativePattern.matcher(input).find();
    }

    @fg.m
    public final p c(@fg.l CharSequence input, int startIndex) {
        p f4;
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.l0.o(matcher, ProtectedSandApp.s("蓭\u0001"));
        f4 = s.f(matcher, startIndex, input);
        return f4;
    }

    @fg.l
    public final kotlin.sequences.m<p> e(@fg.l CharSequence input, int startIndex) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        if (startIndex >= 0 && startIndex <= input.length()) {
            return kotlin.sequences.p.n(new c(input, startIndex), d.f79182d);
        }
        StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("蓮\u0001"), startIndex, ProtectedSandApp.s("蓯\u0001"));
        a5.append(input.length());
        throw new IndexOutOfBoundsException(a5.toString());
    }

    @fg.l
    public final Set<t> g() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet allOf = EnumSet.allOf(t.class);
        kotlin.jvm.internal.l0.m(allOf);
        kotlin.collections.w.Q0(allOf, new e(flags));
        Set<t> unmodifiableSet = Collections.unmodifiableSet(allOf);
        kotlin.jvm.internal.l0.o(unmodifiableSet, ProtectedSandApp.s("蓰\u0001"));
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    @fg.l
    public final String h() {
        String pattern = this.nativePattern.pattern();
        kotlin.jvm.internal.l0.o(pattern, ProtectedSandApp.s("蓫\u0001"));
        return pattern;
    }

    @o2(markerClass = {kotlin.r.class})
    @fg.m
    @c1(version = "1.7")
    public final p i(@fg.l CharSequence input, int index) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        Matcher region = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (!region.lookingAt()) {
            return null;
        }
        kotlin.jvm.internal.l0.m(region);
        return new q(region, input);
    }

    @fg.m
    public final p j(@fg.l CharSequence input) {
        p h4;
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        Matcher matcher = this.nativePattern.matcher(input);
        kotlin.jvm.internal.l0.o(matcher, ProtectedSandApp.s("蓭\u0001"));
        h4 = s.h(matcher, input);
        return h4;
    }

    public final boolean k(@fg.l CharSequence input) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        return this.nativePattern.matcher(input).matches();
    }

    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.7")
    public final boolean l(@fg.l CharSequence input, int index) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length()).lookingAt();
    }

    @fg.l
    public final String m(@fg.l CharSequence input, @fg.l String replacement) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        kotlin.jvm.internal.l0.p(replacement, ProtectedSandApp.s("蓱\u0001"));
        String replaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.l0.o(replaceAll, ProtectedSandApp.s("蓲\u0001"));
        return replaceAll;
    }

    @fg.l
    public final String n(@fg.l CharSequence input, @fg.l ld.l<? super p, ? extends CharSequence> transform) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        kotlin.jvm.internal.l0.p(transform, ProtectedSandApp.s("蓳\u0001"));
        int i4 = 0;
        p d5 = d(this, input, 0, 2, null);
        if (d5 == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, i4, d5.c().c().intValue());
            sb.append(transform.invoke(d5));
            i4 = d5.c().h().intValue() + 1;
            d5 = d5.next();
            if (i4 >= length) {
                break;
            }
        } while (d5 != null);
        if (i4 < length) {
            sb.append(input, i4, length);
        }
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("蓴\u0001"));
        return sb2;
    }

    @fg.l
    public final String o(@fg.l CharSequence input, @fg.l String replacement) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        kotlin.jvm.internal.l0.p(replacement, ProtectedSandApp.s("蓱\u0001"));
        String replaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        kotlin.jvm.internal.l0.o(replaceFirst, ProtectedSandApp.s("蓵\u0001"));
        return replaceFirst;
    }

    @fg.l
    public final List<String> p(@fg.l CharSequence input, int limit) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        h0.K4(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return kotlin.collections.w.k(input.toString());
        }
        int i4 = 10;
        if (limit > 0 && limit <= 10) {
            i4 = limit;
        }
        ArrayList arrayList = new ArrayList(i4);
        int i5 = limit - 1;
        int i6 = 0;
        do {
            arrayList.add(input.subSequence(i6, matcher.start()).toString());
            i6 = matcher.end();
            if (i5 >= 0 && arrayList.size() == i5) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i6, input.length()).toString());
        return arrayList;
    }

    @fg.l
    @o2(markerClass = {kotlin.r.class})
    @c1(version = "1.6")
    public final kotlin.sequences.m<String> r(@fg.l CharSequence input, int limit) {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("蓬\u0001"));
        h0.K4(limit);
        return kotlin.sequences.p.b(new f(input, limit, null));
    }

    @fg.l
    /* renamed from: t, reason: from getter */
    public final Pattern getNativePattern() {
        return this.nativePattern;
    }

    @fg.l
    public String toString() {
        String pattern = this.nativePattern.toString();
        kotlin.jvm.internal.l0.o(pattern, ProtectedSandApp.s("蓴\u0001"));
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@fg.l java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "蓦\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "蓧\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@fg.l java.lang.String r2, @fg.l kotlin.text.t r3) {
        /*
            r1 = this;
            java.lang.String r0 = "蓦\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "蓩\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            kotlin.text.r$a r0 = kotlin.text.r.INSTANCE
            int r3 = r3.getValue()
            int r3 = kotlin.text.r.Companion.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "蓧\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.<init>(java.lang.String, kotlin.text.t):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@fg.l java.lang.String r2, @fg.l java.util.Set<? extends kotlin.text.t> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "蓦\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "蓨\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r3, r0)
            kotlin.text.r$a r0 = kotlin.text.r.INSTANCE
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r3 = kotlin.text.s.e(r3)
            int r3 = kotlin.text.r.Companion.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "蓧\u0001"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            kotlin.jvm.internal.l0.o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.r.<init>(java.lang.String, java.util.Set):void");
    }
}
