package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.k2;
import kotlin.w0;

/* compiled from: HexFormat.kt */
@kotlin.r
@c1(version = "1.9")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0004\r\u0011\u0013\u0016B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/text/k;", "", "", "upperCase", "Lkotlin/text/k$b;", "bytes", "Lkotlin/text/k$d;", "number", "<init>", "(ZLkotlin/text/k$b;Lkotlin/text/k$d;)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "e", "()Z", "b", "Lkotlin/text/k$b;", "c", "()Lkotlin/text/k$b;", "Lkotlin/text/k$d;", "d", "()Lkotlin/text/k$d;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final k f79104e;

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final k f79105f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean upperCase;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final b bytes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d number;

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ,\u0010\f\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001cR\u0011\u0010 \u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Lkotlin/text/k$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lkotlin/text/k$b$a;", "Lkotlin/k2;", "Lkotlin/u;", "builderAction", "b", "(Lld/l;)V", "Lkotlin/text/k$d$a;", "f", "Lkotlin/text/k;", "a", "()Lkotlin/text/k;", "", "Z", "e", "()Z", "g", "(Z)V", "upperCase", "Lkotlin/text/k$b$a;", "_bytes", "c", "Lkotlin/text/k$d$a;", "_number", "()Lkotlin/text/k$b$a;", "bytes", "d", "()Lkotlin/text/k$d$a;", "number", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean upperCase;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private b.a _bytes;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private d.a _number;

        @w0
        public a() {
            k.INSTANCE.getClass();
            this.upperCase = k.f79104e.getUpperCase();
        }

        @kotlin.internal.f
        private final void b(ld.l<? super b.a, k2> builderAction) {
            kotlin.jvm.internal.l0.p(builderAction, ProtectedSandApp.s("蒌\u0001"));
            builderAction.invoke(c());
        }

        @kotlin.internal.f
        private final void f(ld.l<? super d.a, k2> builderAction) {
            kotlin.jvm.internal.l0.p(builderAction, ProtectedSandApp.s("蒌\u0001"));
            builderAction.invoke(d());
        }

        @fg.l
        @w0
        public final k a() {
            b bVar;
            d dVar;
            boolean z4 = this.upperCase;
            b.a aVar = this._bytes;
            if (aVar == null || (bVar = aVar.a()) == null) {
                b.INSTANCE.getClass();
                bVar = b.f79113h;
            }
            d.a aVar2 = this._number;
            if (aVar2 == null || (dVar = aVar2.a()) == null) {
                d.INSTANCE.getClass();
                dVar = d.f79127e;
            }
            return new k(z4, bVar, dVar);
        }

        @fg.l
        public final b.a c() {
            if (this._bytes == null) {
                this._bytes = new b.a();
            }
            b.a aVar = this._bytes;
            kotlin.jvm.internal.l0.m(aVar);
            return aVar;
        }

        @fg.l
        public final d.a d() {
            if (this._number == null) {
                this._number = new d.a();
            }
            d.a aVar = this._number;
            kotlin.jvm.internal.l0.m(aVar);
            return aVar;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getUpperCase() {
            return this.upperCase;
        }

        public final void g(boolean z4) {
            this.upperCase = z4;
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u00162\u00020\u0001:\u0002\u0014\u0012B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lkotlin/text/k$b;", "", "", "bytesPerLine", "bytesPerGroup", "", "groupSeparator", "byteSeparator", "bytePrefix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "I", "g", "()I", "f", "c", "Ljava/lang/String;", "h", "d", "e", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: h, reason: collision with root package name */
        @fg.l
        private static final b f79113h = new b(Integer.MAX_VALUE, Integer.MAX_VALUE, ProtectedSandApp.s("蒔\u0001"), "", "", "");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerLine;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int bytesPerGroup;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String groupSeparator;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String byteSeparator;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String bytePrefix;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String byteSuffix;

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001d\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017\"\u0004\b\u001c\u0010\u0019R*\u0010\u001f\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u000f\u0010\u0017\"\u0004\b\u001e\u0010\u0019R*\u0010!\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b \u0010\u0019¨\u0006\""}, d2 = {"Lkotlin/text/k$b$a;", "", "<init>", "()V", "Lkotlin/text/k$b;", "a", "()Lkotlin/text/k$b;", "", "value", "I", "f", "()I", "l", "(I)V", "bytesPerLine", "b", "e", "k", "bytesPerGroup", "", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "groupSeparator", "d", "i", "byteSeparator", "h", "bytePrefix", "j", "byteSuffix", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int bytesPerLine;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int bytesPerGroup;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private String groupSeparator;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private String byteSeparator;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private String bytePrefix;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private String byteSuffix;

            public a() {
                Companion companion = b.INSTANCE;
                companion.getClass();
                this.bytesPerLine = b.f79113h.getBytesPerLine();
                companion.getClass();
                this.bytesPerGroup = b.f79113h.getBytesPerGroup();
                companion.getClass();
                this.groupSeparator = b.f79113h.getGroupSeparator();
                companion.getClass();
                this.byteSeparator = b.f79113h.getByteSeparator();
                companion.getClass();
                this.bytePrefix = b.f79113h.getBytePrefix();
                companion.getClass();
                this.byteSuffix = b.f79113h.getByteSuffix();
            }

            @fg.l
            public final b a() {
                return new b(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }

            @fg.l
            /* renamed from: b, reason: from getter */
            public final String getBytePrefix() {
                return this.bytePrefix;
            }

            @fg.l
            /* renamed from: c, reason: from getter */
            public final String getByteSeparator() {
                return this.byteSeparator;
            }

            @fg.l
            /* renamed from: d, reason: from getter */
            public final String getByteSuffix() {
                return this.byteSuffix;
            }

            /* renamed from: e, reason: from getter */
            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            /* renamed from: f, reason: from getter */
            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            @fg.l
            /* renamed from: g, reason: from getter */
            public final String getGroupSeparator() {
                return this.groupSeparator;
            }

            public final void h(@fg.l String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒍\u0001"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, org.apache.commons.lang3.m.f86065d, false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("蒎\u0001"), str));
                }
                this.bytePrefix = str;
            }

            public final void i(@fg.l String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒍\u0001"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, org.apache.commons.lang3.m.f86065d, false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("蒏\u0001"), str));
                }
                this.byteSeparator = str;
            }

            public final void j(@fg.l String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒍\u0001"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, org.apache.commons.lang3.m.f86065d, false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("蒐\u0001"), str));
                }
                this.byteSuffix = str;
            }

            public final void k(int i4) {
                if (i4 <= 0) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("蒑\u0001"), i4));
                }
                this.bytesPerGroup = i4;
            }

            public final void l(int i4) {
                if (i4 <= 0) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("蒒\u0001"), i4));
                }
                this.bytesPerLine = i4;
            }

            public final void m(@fg.l String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒓\u0001"));
                this.groupSeparator = str;
            }
        }

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/k$b$b;", "", "<init>", "()V", "Lkotlin/text/k$b;", "Default", "Lkotlin/text/k$b;", "a", "()Lkotlin/text/k$b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.k$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final b a() {
                return b.f79113h;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public b(int i4, int i5, @fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒕\u0001"));
            kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蒖\u0001"));
            kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("蒗\u0001"));
            kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("蒘\u0001"));
            this.bytesPerLine = i4;
            this.bytesPerGroup = i5;
            this.groupSeparator = str;
            this.byteSeparator = str2;
            this.bytePrefix = str3;
            this.byteSuffix = str4;
        }

        @fg.l
        public final StringBuilder b(@fg.l StringBuilder sb, @fg.l String indent) {
            kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("蒙\u0001"));
            kotlin.jvm.internal.l0.p(indent, ProtectedSandApp.s("蒚\u0001"));
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒛\u0001"));
            sb.append(this.bytesPerLine);
            String s4 = ProtectedSandApp.s("蒜\u0001");
            kotlin.jvm.internal.l0.o(sb, s4);
            String s5 = ProtectedSandApp.s("蒝\u0001");
            sb.append(s5);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒞\u0001"));
            sb.append(this.bytesPerGroup);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(s5);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒟\u0001"));
            sb.append(this.groupSeparator);
            kotlin.jvm.internal.l0.o(sb, s4);
            String s6 = ProtectedSandApp.s("蒠\u0001");
            sb.append(s6);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒡\u0001"));
            sb.append(this.byteSeparator);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(s6);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒢\u0001"));
            sb.append(this.bytePrefix);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(s6);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒣\u0001"));
            sb.append(this.byteSuffix);
            sb.append(ProtectedSandApp.s("蒤\u0001"));
            return sb;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        @fg.l
        /* renamed from: d, reason: from getter */
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        /* renamed from: f, reason: from getter */
        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        /* renamed from: g, reason: from getter */
        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        @fg.l
        /* renamed from: h, reason: from getter */
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ProtectedSandApp.s("蒥\u0001"));
            String s4 = ProtectedSandApp.s("蒜\u0001");
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            StringBuilder b5 = b(sb, ProtectedSandApp.s("蒦\u0001"));
            b5.append('\n');
            kotlin.jvm.internal.l0.o(b5, s4);
            sb.append(ProtectedSandApp.s("蒧\u0001"));
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("蒨\u0001"));
            return sb2;
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlin/text/k$c;", "", "<init>", "()V", "Lkotlin/text/k;", "Default", "Lkotlin/text/k;", "a", "()Lkotlin/text/k;", "UpperCase", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.k$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final k a() {
            return k.f79104e;
        }

        @fg.l
        public final k b() {
            return k.f79105f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00162\u00020\u0001:\u0002\u0011\u000fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00060\u000bj\u0002`\f2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/text/k$d;", "", "", "prefix", "suffix", "", "removeLeadingZeros", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "b", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "a", "Ljava/lang/String;", "c", "e", "Z", "d", "()Z", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: e, reason: collision with root package name */
        @fg.l
        private static final d f79127e = new d("", "", false);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String prefix;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String suffix;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean removeLeadingZeros;

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lkotlin/text/k$d$a;", "", "<init>", "()V", "Lkotlin/text/k$d;", "a", "()Lkotlin/text/k$d;", "", "value", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "prefix", "d", "g", "suffix", "", "c", "Z", "()Z", "f", "(Z)V", "removeLeadingZeros", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private String prefix;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private String suffix;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private boolean removeLeadingZeros;

            public a() {
                Companion companion = d.INSTANCE;
                companion.getClass();
                this.prefix = d.f79127e.getPrefix();
                companion.getClass();
                this.suffix = d.f79127e.getSuffix();
                companion.getClass();
                this.removeLeadingZeros = d.f79127e.getRemoveLeadingZeros();
            }

            @fg.l
            public final d a() {
                return new d(this.prefix, this.suffix, this.removeLeadingZeros);
            }

            @fg.l
            /* renamed from: b, reason: from getter */
            public final String getPrefix() {
                return this.prefix;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            @fg.l
            /* renamed from: d, reason: from getter */
            public final String getSuffix() {
                return this.suffix;
            }

            public final void e(@fg.l String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒩\u0001"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, org.apache.commons.lang3.m.f86065d, false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("蒪\u0001"), str));
                }
                this.prefix = str;
            }

            public final void f(boolean z4) {
                this.removeLeadingZeros = z4;
            }

            public final void g(@fg.l String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒩\u0001"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, org.apache.commons.lang3.m.f86065d, false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("蒫\u0001"), str));
                }
                this.suffix = str;
            }
        }

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/text/k$d$b;", "", "<init>", "()V", "Lkotlin/text/k$d;", "Default", "Lkotlin/text/k$d;", "a", "()Lkotlin/text/k$d;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.k$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final d a() {
                return d.f79127e;
            }

            public Companion(kotlin.jvm.internal.w wVar) {
            }
        }

        public d(@fg.l String str, @fg.l String str2, boolean z4) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("蒬\u0001"));
            kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("蒭\u0001"));
            this.prefix = str;
            this.suffix = str2;
            this.removeLeadingZeros = z4;
        }

        @fg.l
        public final StringBuilder b(@fg.l StringBuilder sb, @fg.l String indent) {
            kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("蒮\u0001"));
            kotlin.jvm.internal.l0.p(indent, ProtectedSandApp.s("蒯\u0001"));
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒰\u0001"));
            sb.append(this.prefix);
            String s4 = ProtectedSandApp.s("蒱\u0001");
            kotlin.jvm.internal.l0.o(sb, s4);
            String s5 = ProtectedSandApp.s("蒲\u0001");
            sb.append(s5);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒳\u0001"));
            sb.append(this.suffix);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(s5);
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append(indent);
            sb.append(ProtectedSandApp.s("蒴\u0001"));
            sb.append(this.removeLeadingZeros);
            return sb;
        }

        @fg.l
        /* renamed from: c, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        @fg.l
        /* renamed from: e, reason: from getter */
        public final String getSuffix() {
            return this.suffix;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ProtectedSandApp.s("蒵\u0001"));
            String s4 = ProtectedSandApp.s("蒱\u0001");
            kotlin.jvm.internal.l0.o(sb, s4);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s4);
            StringBuilder b5 = b(sb, ProtectedSandApp.s("蒶\u0001"));
            b5.append('\n');
            kotlin.jvm.internal.l0.o(b5, s4);
            sb.append(ProtectedSandApp.s("蒷\u0001"));
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("蒸\u0001"));
            return sb2;
        }
    }

    static {
        b.Companion companion = b.INSTANCE;
        companion.getClass();
        b bVar = b.f79113h;
        d.Companion companion2 = d.INSTANCE;
        companion2.getClass();
        f79104e = new k(false, bVar, d.f79127e);
        companion.getClass();
        b bVar2 = b.f79113h;
        companion2.getClass();
        f79105f = new k(true, bVar2, d.f79127e);
    }

    public k(boolean z4, @fg.l b bVar, @fg.l d dVar) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("蒺\u0001"));
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("蒻\u0001"));
        this.upperCase = z4;
        this.bytes = bVar;
        this.number = dVar;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final b getBytes() {
        return this.bytes;
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final d getNumber() {
        return this.number;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getUpperCase() {
        return this.upperCase;
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProtectedSandApp.s("蒼\u0001"));
        String s4 = ProtectedSandApp.s("蒽\u0001");
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append(ProtectedSandApp.s("蒾\u0001"));
        sb.append(this.upperCase);
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append(ProtectedSandApp.s("蒿\u0001"));
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append(ProtectedSandApp.s("蓀\u0001"));
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        b bVar = this.bytes;
        String s5 = ProtectedSandApp.s("蓁\u0001");
        StringBuilder b5 = bVar.b(sb, s5);
        b5.append('\n');
        kotlin.jvm.internal.l0.o(b5, s4);
        sb.append(ProtectedSandApp.s("蓂\u0001"));
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append(ProtectedSandApp.s("蓃\u0001"));
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        StringBuilder b6 = this.number.b(sb, s5);
        b6.append('\n');
        kotlin.jvm.internal.l0.o(b6, s4);
        sb.append(ProtectedSandApp.s("蓄\u0001"));
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s4);
        sb.append(ProtectedSandApp.s("蓅\u0001"));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("蓆\u0001"));
        return sb2;
    }
}
