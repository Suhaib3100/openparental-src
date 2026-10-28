package androidx.compose.ui.text.input;

import androidx.compose.runtime.m1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextFieldValue.kt */
@m1
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/input/z0;", "", "Landroidx/compose/ui/text/e;", "annotatedString", "Landroidx/compose/ui/text/t0;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/e;JLandroidx/compose/ui/text/t0;Lkotlin/jvm/internal/w;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/t0;Lkotlin/jvm/internal/w;)V", "b", "(Landroidx/compose/ui/text/e;JLandroidx/compose/ui/text/t0;)Landroidx/compose/ui/text/input/z0;", "c", "(Ljava/lang/String;JLandroidx/compose/ui/text/t0;)Landroidx/compose/ui/text/input/z0;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/e;", "f", "()Landroidx/compose/ui/text/e;", "J", "h", "()J", "Landroidx/compose/ui/text/t0;", "g", "()Landroidx/compose/ui/text/t0;", "i", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f21153e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.text.e annotatedString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long selection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.ui.text.t0 composition;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final androidx.compose.runtime.saveable.l<z0, Object> f21154f = androidx.compose.runtime.saveable.m.a(a.f21158b, b.f21159b);

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/saveable/n;", "Landroidx/compose/ui/text/input/z0;", "it", "", "a", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/ui/text/input/z0;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.p<androidx.compose.runtime.saveable.n, z0, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21158b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l z0 z0Var) {
            return kotlin.collections.w.s(androidx.compose.ui.text.h0.z(z0Var.getAnnotatedString(), androidx.compose.ui.text.h0.e(), nVar), androidx.compose.ui.text.h0.z(androidx.compose.ui.text.t0.b(z0Var.getSelection()), androidx.compose.ui.text.h0.j(androidx.compose.ui.text.t0.INSTANCE), nVar));
        }
    }

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/ui/text/input/z0;", "a", "(Ljava/lang/Object;)Landroidx/compose/ui/text/input/z0;"}, k = 3, mv = {1, 8, 0})
    @r1({"SMAP\nTextFieldValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,202:1\n55#2,2:203\n55#2,2:206\n1#3:205\n1#3:208\n*S KotlinDebug\n*F\n+ 1 TextFieldValue.kt\nandroidx/compose/ui/text/input/TextFieldValue$Companion$Saver$2\n*L\n168#1:203,2\n169#1:206,2\n168#1:205\n169#1:208\n*E\n"})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<Object, z0> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f21159b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z0 invoke(@fg.l Object obj) {
            kotlin.jvm.internal.l0.n(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            androidx.compose.runtime.saveable.l<androidx.compose.ui.text.e, Object> e4 = androidx.compose.ui.text.h0.e();
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.text.t0 t0Var = null;
            androidx.compose.ui.text.e b5 = (kotlin.jvm.internal.l0.g(obj2, bool) || obj2 == null) ? null : e4.b(obj2);
            kotlin.jvm.internal.l0.m(b5);
            Object obj3 = list.get(1);
            androidx.compose.runtime.saveable.l<androidx.compose.ui.text.t0, Object> j4 = androidx.compose.ui.text.h0.j(androidx.compose.ui.text.t0.INSTANCE);
            if (!kotlin.jvm.internal.l0.g(obj3, bool) && obj3 != null) {
                t0Var = j4.b(obj3);
            }
            kotlin.jvm.internal.l0.m(t0Var);
            return new z0(b5, t0Var.getPackedValue(), (androidx.compose.ui.text.t0) null, 4, (kotlin.jvm.internal.w) null);
        }
    }

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/z0$c;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/ui/text/input/z0;", "Saver", "Landroidx/compose/runtime/saveable/l;", "a", "()Landroidx/compose/runtime/saveable/l;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.input.z0$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final androidx.compose.runtime.saveable.l<z0, Object> a() {
            return z0.f21154f;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ z0(androidx.compose.ui.text.e eVar, long j4, androidx.compose.ui.text.t0 t0Var, kotlin.jvm.internal.w wVar) {
        this(eVar, j4, t0Var);
    }

    public static z0 d(z0 z0Var, androidx.compose.ui.text.e eVar, long j4, androidx.compose.ui.text.t0 t0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            eVar = z0Var.annotatedString;
        }
        if ((i4 & 2) != 0) {
            j4 = z0Var.selection;
        }
        if ((i4 & 4) != 0) {
            t0Var = z0Var.composition;
        }
        z0Var.getClass();
        return new z0(eVar, j4, t0Var);
    }

    public static /* synthetic */ z0 e(z0 z0Var, String str, long j4, androidx.compose.ui.text.t0 t0Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = z0Var.selection;
        }
        if ((i4 & 4) != 0) {
            t0Var = z0Var.composition;
        }
        return z0Var.c(str, j4, t0Var);
    }

    @fg.l
    public final z0 b(@fg.l androidx.compose.ui.text.e annotatedString, long selection, @fg.m androidx.compose.ui.text.t0 composition) {
        return new z0(annotatedString, selection, composition);
    }

    @fg.l
    public final z0 c(@fg.l String text, long selection, @fg.m androidx.compose.ui.text.t0 composition) {
        return new z0(new androidx.compose.ui.text.e(text, null, null, 6, null), selection, composition);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) other;
        return androidx.compose.ui.text.t0.g(this.selection, z0Var.selection) && kotlin.jvm.internal.l0.g(this.composition, z0Var.composition) && kotlin.jvm.internal.l0.g(this.annotatedString, z0Var.annotatedString);
    }

    @fg.l
    /* renamed from: f, reason: from getter */
    public final androidx.compose.ui.text.e getAnnotatedString() {
        return this.annotatedString;
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final androidx.compose.ui.text.t0 getComposition() {
        return this.composition;
    }

    /* renamed from: h, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public int hashCode() {
        int o4 = (androidx.compose.ui.text.t0.o(this.selection) + (this.annotatedString.hashCode() * 31)) * 31;
        androidx.compose.ui.text.t0 t0Var = this.composition;
        return o4 + (t0Var != null ? Long.hashCode(t0Var.getPackedValue()) : 0);
    }

    @fg.l
    public final String i() {
        return this.annotatedString.getText();
    }

    @fg.l
    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.annotatedString) + "', selection=" + ((Object) androidx.compose.ui.text.t0.q(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ z0(String str, long j4, androidx.compose.ui.text.t0 t0Var, kotlin.jvm.internal.w wVar) {
        this(str, j4, t0Var);
    }

    private z0(androidx.compose.ui.text.e eVar, long j4, androidx.compose.ui.text.t0 t0Var) {
        this.annotatedString = eVar;
        this.selection = androidx.compose.ui.text.u0.c(j4, 0, eVar.getText().length());
        this.composition = t0Var != null ? androidx.compose.ui.text.t0.b(androidx.compose.ui.text.u0.c(t0Var.getPackedValue(), 0, eVar.getText().length())) : null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(androidx.compose.ui.text.e r1, long r2, androidx.compose.ui.text.t0 r4, int r5, kotlin.jvm.internal.w r6) {
        /*
            r0 = this;
            r6 = r5 & 2
            if (r6 == 0) goto Ld
            androidx.compose.ui.text.t0$a r2 = androidx.compose.ui.text.t0.INSTANCE
            r2.getClass()
            long r2 = androidx.compose.ui.text.t0.a()
        Ld:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            r4 = 0
        L12:
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.z0.<init>(androidx.compose.ui.text.e, long, androidx.compose.ui.text.t0, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(java.lang.String r1, long r2, androidx.compose.ui.text.t0 r4, int r5, kotlin.jvm.internal.w r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto L13
            androidx.compose.ui.text.t0$a r2 = androidx.compose.ui.text.t0.INSTANCE
            r2.getClass()
            long r2 = androidx.compose.ui.text.t0.a()
        L13:
            r5 = r5 & 4
            if (r5 == 0) goto L18
            r4 = 0
        L18:
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.z0.<init>(java.lang.String, long, androidx.compose.ui.text.t0, int, kotlin.jvm.internal.w):void");
    }

    private z0(String str, long j4, androidx.compose.ui.text.t0 t0Var) {
        this(new androidx.compose.ui.text.e(str, null, null, 6, null), j4, t0Var);
    }
}
