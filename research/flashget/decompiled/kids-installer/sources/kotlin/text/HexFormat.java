package kotlin.text;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.m2;

/* compiled from: HexFormat.kt */
@ExperimentalStdlibApi
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/text/HexFormat;", "", "upperCase", "", "bytes", "Lkotlin/text/HexFormat$BytesHexFormat;", "number", "Lkotlin/text/HexFormat$NumberHexFormat;", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "getUpperCase", "()Z", "toString", "", "Builder", "BytesHexFormat", "Companion", "NumberHexFormat", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.k, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class HexFormat {

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    public static final c f27090d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    private static final HexFormat f27091e;

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final HexFormat f27092f;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27093a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final b f27094b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final d f27095c;

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0001J%\u0010\u0007\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000J%\u0010\n\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "()V", "_bytes", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "_number", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "bytes", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "number", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "upperCase", "", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "build", "Lkotlin/text/HexFormat;", "", "builderAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.k$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f27096a;

        /* renamed from: b, reason: collision with root package name */
        @d5.e
        private b.a f27097b;

        /* renamed from: c, reason: collision with root package name */
        @d5.e
        private d.a f27098c;

        @PublishedApi
        public a() {
            HexFormat.f27090d.getClass();
            this.f27096a = HexFormat.f27091e.getF27093a();
        }

        @InlineOnly
        private final void b(q3.l<? super b.a, m2> lVar) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("嬒"));
            lVar.N(c());
        }

        @InlineOnly
        private final void f(q3.l<? super d.a, m2> lVar) {
            kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("嬓"));
            lVar.N(d());
        }

        @PublishedApi
        @d5.d
        public final HexFormat a() {
            b bVar;
            d dVar;
            boolean z5 = this.f27096a;
            b.a aVar = this.f27097b;
            if (aVar == null || (bVar = aVar.a()) == null) {
                b.f27099g.getClass();
                bVar = b.f27100h;
            }
            d.a aVar2 = this.f27098c;
            if (aVar2 == null || (dVar = aVar2.a()) == null) {
                d.f27113d.getClass();
                dVar = d.f27114e;
            }
            return new HexFormat(z5, bVar, dVar);
        }

        @d5.d
        public final b.a c() {
            if (this.f27097b == null) {
                this.f27097b = new b.a();
            }
            b.a aVar = this.f27097b;
            kotlin.jvm.internal.l0.m(aVar);
            return aVar;
        }

        @d5.d
        public final d.a d() {
            if (this.f27098c == null) {
                this.f27098c = new d.a();
            }
            d.a aVar = this.f27098c;
            kotlin.jvm.internal.l0.m(aVar);
            return aVar;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getF27096a() {
            return this.f27096a;
        }

        public final void g(boolean z5) {
            this.f27096a = z5;
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ%\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0018J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001c"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "bytesPerLine", "", "bytesPerGroup", "groupSeparator", "", "byteSeparator", "bytePrefix", "byteSuffix", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBytePrefix", "()Ljava/lang/String;", "getByteSeparator", "getByteSuffix", "getBytesPerGroup", "()I", "getBytesPerLine", "getGroupSeparator", "appendOptionsTo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "toString", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.k$b */
    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        @d5.d
        public static final C0406b f27099g = new C0406b(null);

        /* renamed from: h, reason: collision with root package name */
        @d5.d
        private static final b f27100h = new b(Integer.MAX_VALUE, Integer.MAX_VALUE, ProtectedSandApp.s("嬝"), "", "", "");

        /* renamed from: a, reason: collision with root package name */
        private final int f27101a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27102b;

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        private final String f27103c;

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        private final String f27104d;

        /* renamed from: e, reason: collision with root package name */
        @d5.d
        private final String f27105e;

        /* renamed from: f, reason: collision with root package name */
        @d5.d
        private final String f27106f;

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006\u001f"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "()V", "value", "", "bytePrefix", "getBytePrefix", "()Ljava/lang/String;", "setBytePrefix", "(Ljava/lang/String;)V", "byteSeparator", "getByteSeparator", "setByteSeparator", "byteSuffix", "getByteSuffix", "setByteSuffix", "", "bytesPerGroup", "getBytesPerGroup", "()I", "setBytesPerGroup", "(I)V", "bytesPerLine", "getBytesPerLine", "setBytesPerLine", "groupSeparator", "getGroupSeparator", "setGroupSeparator", "build", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.k$b$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f27107a;

            /* renamed from: b, reason: collision with root package name */
            private int f27108b;

            /* renamed from: c, reason: collision with root package name */
            @d5.d
            private String f27109c;

            /* renamed from: d, reason: collision with root package name */
            @d5.d
            private String f27110d;

            /* renamed from: e, reason: collision with root package name */
            @d5.d
            private String f27111e;

            /* renamed from: f, reason: collision with root package name */
            @d5.d
            private String f27112f;

            public a() {
                C0406b c0406b = b.f27099g;
                c0406b.getClass();
                this.f27107a = b.f27100h.getF27101a();
                c0406b.getClass();
                this.f27108b = b.f27100h.getF27102b();
                c0406b.getClass();
                this.f27109c = b.f27100h.getF27103c();
                c0406b.getClass();
                this.f27110d = b.f27100h.getF27104d();
                c0406b.getClass();
                this.f27111e = b.f27100h.getF27105e();
                c0406b.getClass();
                this.f27112f = b.f27100h.getF27106f();
            }

            @d5.d
            public final b a() {
                return new b(this.f27107a, this.f27108b, this.f27109c, this.f27110d, this.f27111e, this.f27112f);
            }

            @d5.d
            /* renamed from: b, reason: from getter */
            public final String getF27111e() {
                return this.f27111e;
            }

            @d5.d
            /* renamed from: c, reason: from getter */
            public final String getF27110d() {
                return this.f27110d;
            }

            @d5.d
            /* renamed from: d, reason: from getter */
            public final String getF27112f() {
                return this.f27112f;
            }

            /* renamed from: e, reason: from getter */
            public final int getF27108b() {
                return this.f27108b;
            }

            /* renamed from: f, reason: from getter */
            public final int getF27107a() {
                return this.f27107a;
            }

            @d5.d
            /* renamed from: g, reason: from getter */
            public final String getF27109c() {
                return this.f27109c;
            }

            public final void h(@d5.d String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬔"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, '\r', false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("嬕"), str));
                }
                this.f27111e = str;
            }

            public final void i(@d5.d String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬖"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, '\r', false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("嬗"), str));
                }
                this.f27110d = str;
            }

            public final void j(@d5.d String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬘"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, '\r', false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("嬙"), str));
                }
                this.f27112f = str;
            }

            public final void k(int i5) {
                if (i5 <= 0) {
                    throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("嬚"), i5));
                }
                this.f27108b = i5;
            }

            public final void l(int i5) {
                if (i5 <= 0) {
                    throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a(ProtectedSandApp.s("嬛"), i5));
                }
                this.f27107a = i5;
            }

            public final void m(@d5.d String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬜"));
                this.f27109c = str;
            }
        }

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.k$b$b, reason: collision with other inner class name */
        public static final class C0406b {
            private C0406b() {
            }

            @d5.d
            public final b a() {
                return b.f27100h;
            }

            public C0406b(kotlin.jvm.internal.w wVar) {
            }
        }

        public b(int i5, int i6, @d5.d String str, @d5.d String str2, @d5.d String str3, @d5.d String str4) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬞"));
            kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("嬟"));
            kotlin.jvm.internal.l0.p(str3, ProtectedSandApp.s("嬠"));
            kotlin.jvm.internal.l0.p(str4, ProtectedSandApp.s("嬡"));
            this.f27101a = i5;
            this.f27102b = i6;
            this.f27103c = str;
            this.f27104d = str2;
            this.f27105e = str3;
            this.f27106f = str4;
        }

        @d5.d
        public final StringBuilder b(@d5.d StringBuilder sb, @d5.d String str) {
            kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("嬢"));
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬣"));
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬤"));
            sb.append(this.f27101a);
            String s5 = ProtectedSandApp.s("嬥");
            kotlin.jvm.internal.l0.o(sb, s5);
            String s6 = ProtectedSandApp.s("嬦");
            sb.append(s6);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬧"));
            sb.append(this.f27102b);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(s6);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬨"));
            sb.append(this.f27103c);
            kotlin.jvm.internal.l0.o(sb, s5);
            String s7 = ProtectedSandApp.s("嬩");
            sb.append(s7);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬪"));
            sb.append(this.f27104d);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(s7);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬫"));
            sb.append(this.f27105e);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(s7);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬬"));
            sb.append(this.f27106f);
            sb.append(ProtectedSandApp.s("嬭"));
            return sb;
        }

        @d5.d
        /* renamed from: c, reason: from getter */
        public final String getF27105e() {
            return this.f27105e;
        }

        @d5.d
        /* renamed from: d, reason: from getter */
        public final String getF27104d() {
            return this.f27104d;
        }

        @d5.d
        /* renamed from: e, reason: from getter */
        public final String getF27106f() {
            return this.f27106f;
        }

        /* renamed from: f, reason: from getter */
        public final int getF27102b() {
            return this.f27102b;
        }

        /* renamed from: g, reason: from getter */
        public final int getF27101a() {
            return this.f27101a;
        }

        @d5.d
        /* renamed from: h, reason: from getter */
        public final String getF27103c() {
            return this.f27103c;
        }

        @d5.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ProtectedSandApp.s("嬮"));
            String s5 = ProtectedSandApp.s("嬯");
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            StringBuilder b6 = b(sb, ProtectedSandApp.s("嬰"));
            b6.append('\n');
            kotlin.jvm.internal.l0.o(b6, s5);
            sb.append(ProtectedSandApp.s("嬱"));
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("嬲"));
            return sb2;
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.k$c */
    public static final class c {
        private c() {
        }

        @d5.d
        public final HexFormat a() {
            return HexFormat.f27091e;
        }

        @d5.d
        public final HexFormat b() {
            return HexFormat.f27092f;
        }

        public c(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "prefix", "", "suffix", "removeLeadingZeros", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPrefix", "()Ljava/lang/String;", "getRemoveLeadingZeros", "()Z", "getSuffix", "appendOptionsTo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "toString", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.text.k$d */
    public static final class d {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        public static final b f27113d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        @d5.d
        private static final d f27114e = new d("", "", false);

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        private final String f27115a;

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final String f27116b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f27117c;

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "()V", "value", "", "prefix", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "removeLeadingZeros", "", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "suffix", "getSuffix", "setSuffix", "build", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.k$d$a */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private String f27118a;

            /* renamed from: b, reason: collision with root package name */
            @d5.d
            private String f27119b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f27120c;

            public a() {
                b bVar = d.f27113d;
                bVar.getClass();
                this.f27118a = d.f27114e.getF27115a();
                bVar.getClass();
                this.f27119b = d.f27114e.getF27116b();
                bVar.getClass();
                this.f27120c = d.f27114e.getF27117c();
            }

            @d5.d
            public final d a() {
                return new d(this.f27118a, this.f27119b, this.f27120c);
            }

            @d5.d
            /* renamed from: b, reason: from getter */
            public final String getF27118a() {
                return this.f27118a;
            }

            /* renamed from: c, reason: from getter */
            public final boolean getF27120c() {
                return this.f27120c;
            }

            @d5.d
            /* renamed from: d, reason: from getter */
            public final String getF27119b() {
                return this.f27119b;
            }

            public final void e(@d5.d String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬳"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, '\r', false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("嬴"), str));
                }
                this.f27118a = str;
            }

            public final void f(boolean z5) {
                this.f27120c = z5;
            }

            public final void g(@d5.d String str) {
                kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬵"));
                if (h0.S2(str, '\n', false, 2, null) || h0.S2(str, '\r', false, 2, null)) {
                    throw new IllegalArgumentException(androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("嬶"), str));
                }
                this.f27119b = str;
            }
        }

        /* compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.text.k$d$b */
        public static final class b {
            private b() {
            }

            @d5.d
            public final d a() {
                return d.f27114e;
            }

            public b(kotlin.jvm.internal.w wVar) {
            }
        }

        public d(@d5.d String str, @d5.d String str2, boolean z5) {
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬷"));
            kotlin.jvm.internal.l0.p(str2, ProtectedSandApp.s("嬸"));
            this.f27115a = str;
            this.f27116b = str2;
            this.f27117c = z5;
        }

        @d5.d
        public final StringBuilder b(@d5.d StringBuilder sb, @d5.d String str) {
            kotlin.jvm.internal.l0.p(sb, ProtectedSandApp.s("嬹"));
            kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("嬺"));
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬻"));
            sb.append(this.f27115a);
            String s5 = ProtectedSandApp.s("嬼");
            kotlin.jvm.internal.l0.o(sb, s5);
            String s6 = ProtectedSandApp.s("嬽");
            sb.append(s6);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬾"));
            sb.append(this.f27116b);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(s6);
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append(str);
            sb.append(ProtectedSandApp.s("嬿"));
            sb.append(this.f27117c);
            return sb;
        }

        @d5.d
        /* renamed from: c, reason: from getter */
        public final String getF27115a() {
            return this.f27115a;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getF27117c() {
            return this.f27117c;
        }

        @d5.d
        /* renamed from: e, reason: from getter */
        public final String getF27116b() {
            return this.f27116b;
        }

        @d5.d
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(ProtectedSandApp.s("孀"));
            String s5 = ProtectedSandApp.s("孁");
            kotlin.jvm.internal.l0.o(sb, s5);
            sb.append('\n');
            kotlin.jvm.internal.l0.o(sb, s5);
            StringBuilder b6 = b(sb, ProtectedSandApp.s("孂"));
            b6.append('\n');
            kotlin.jvm.internal.l0.o(b6, s5);
            sb.append(ProtectedSandApp.s("孃"));
            String sb2 = sb.toString();
            kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("孄"));
            return sb2;
        }
    }

    static {
        b.C0406b c0406b = b.f27099g;
        c0406b.getClass();
        b bVar = b.f27100h;
        d.b bVar2 = d.f27113d;
        bVar2.getClass();
        f27091e = new HexFormat(false, bVar, d.f27114e);
        c0406b.getClass();
        b bVar3 = b.f27100h;
        bVar2.getClass();
        f27092f = new HexFormat(true, bVar3, d.f27114e);
    }

    public HexFormat(boolean z5, @d5.d b bVar, @d5.d d dVar) {
        kotlin.jvm.internal.l0.p(bVar, ProtectedSandApp.s("孆"));
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("孇"));
        this.f27093a = z5;
        this.f27094b = bVar;
        this.f27095c = dVar;
    }

    @d5.d
    /* renamed from: c, reason: from getter */
    public final b getF27094b() {
        return this.f27094b;
    }

    @d5.d
    /* renamed from: d, reason: from getter */
    public final d getF27095c() {
        return this.f27095c;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getF27093a() {
        return this.f27093a;
    }

    @d5.d
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProtectedSandApp.s("孈"));
        String s5 = ProtectedSandApp.s("孉");
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append(ProtectedSandApp.s("孊"));
        sb.append(this.f27093a);
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append(ProtectedSandApp.s("孋"));
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append(ProtectedSandApp.s("孌"));
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        b bVar = this.f27094b;
        String s6 = ProtectedSandApp.s("孍");
        StringBuilder b6 = bVar.b(sb, s6);
        b6.append('\n');
        kotlin.jvm.internal.l0.o(b6, s5);
        sb.append(ProtectedSandApp.s("孎"));
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append(ProtectedSandApp.s("孏"));
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        StringBuilder b7 = this.f27095c.b(sb, s6);
        b7.append('\n');
        kotlin.jvm.internal.l0.o(b7, s5);
        sb.append(ProtectedSandApp.s("子"));
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, s5);
        sb.append(ProtectedSandApp.s("孑"));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, ProtectedSandApp.s("孒"));
        return sb2;
    }
}
