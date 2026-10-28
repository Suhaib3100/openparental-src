package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text2.input.u;
import androidx.compose.runtime.b5;
import androidx.compose.runtime.o4;
import androidx.compose.runtime.x4;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: TransformedTextFieldState.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 &2\u00020\u0001:\u0002EGB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001aJ*\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010\u001aJ\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010\u001aJ\r\u0010'\u001a\u00020\f¢\u0006\u0004\b'\u0010\u001aJ\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u001aJ3\u0010.\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020!2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\f0*¢\u0006\u0002\b,H\u0086\b¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\n2\u0006\u00100\u001a\u00020\n¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b7\u00104J\u0018\u0010;\u001a\u00020:2\u0006\u00109\u001a\u000208H\u0086@¢\u0006\u0004\b;\u0010<J\u001a\u0010>\u001a\u00020!2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001e\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010L\u0018\u00010K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bT\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m0;", "", "Landroidx/compose/foundation/text2/input/u;", "textFieldState", "Landroidx/compose/foundation/text2/input/h;", "inputTransformation", "Landroidx/compose/foundation/text2/input/c;", "codepointTransformation", "<init>", "(Landroidx/compose/foundation/text2/input/u;Landroidx/compose/foundation/text2/input/h;Landroidx/compose/foundation/text2/input/c;)V", "", "transformedOffset", "Lkotlin/k2;", "s", "(I)V", "Landroidx/compose/ui/text/t0;", "transformedRange", "A", "(J)V", "untransformedRange", "B", "", "newText", "u", "(Ljava/lang/CharSequence;)V", "z", "()V", "h", "range", "Landroidx/compose/foundation/text2/input/internal/undo/c;", "undoBehavior", "x", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/c;)V", "", "clearComposition", "v", "(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text2/input/internal/undo/c;)V", "f", "e", "C", "t", "notifyImeOfChanges", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/m;", "Lkotlin/u;", "block", "i", "(ZLld/l;)V", "offset", "p", "(I)J", "q", "(J)J", "m", "(I)I", "n", "Landroidx/compose/foundation/text2/input/u$a;", "notifyImeListener", "", "g", "(Landroidx/compose/foundation/text2/input/u$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/foundation/text2/input/u;", "b", "Landroidx/compose/foundation/text2/input/h;", "c", "Landroidx/compose/foundation/text2/input/c;", "Landroidx/compose/runtime/b5;", "Landroidx/compose/foundation/text2/input/internal/m0$b;", "d", "Landroidx/compose/runtime/b5;", "transformedText", "Landroidx/compose/foundation/text2/input/q;", "k", "()Landroidx/compose/foundation/text2/input/q;", "text", "l", "untransformedText", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nTransformedTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n+ 2 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,393:1\n186#2,20:394\n186#2,20:414\n186#2,20:434\n186#2,20:454\n186#2,20:474\n186#2,20:494\n186#2,20:514\n186#2,20:534\n186#2,20:554\n314#3,11:574\n*S KotlinDebug\n*F\n+ 1 TransformedTextFieldState.kt\nandroidx/compose/foundation/text2/input/internal/TransformedTextFieldState\n*L\n93#1:394,20\n99#1:414,20\n106#1:434,20\n112#1:454,20\n131#1:474,20\n148#1:494,20\n166#1:514,20\n173#1:534,20\n201#1:554,20\n277#1:574,11\n*E\n"})
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final a f8695e = new a();

    /* renamed from: f, reason: collision with root package name */
    public static final int f8696f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.u textFieldState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.foundation.text2.input.h inputTransformation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final androidx.compose.foundation.text2.input.c codepointTransformation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final b5<b> transformedText;

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m0$a;", "", "<init>", "()V", "Landroidx/compose/foundation/text2/input/q;", "untransformedText", "Landroidx/compose/foundation/text2/input/c;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/internal/m0$b;", "d", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/c;)Landroidx/compose/foundation/text2/input/internal/m0$b;", "Landroidx/compose/ui/text/t0;", "range", "Landroidx/compose/foundation/text2/input/internal/r;", "mapping", "f", "(JLandroidx/compose/foundation/text2/input/internal/r;)J", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kd.n
        public final b d(androidx.compose.foundation.text2.input.q untransformedText, androidx.compose.foundation.text2.input.c codepointTransformation) {
            r rVar = new r();
            CharSequence b5 = androidx.compose.foundation.text2.input.d.b(untransformedText, codepointTransformation, rVar);
            t0 t0Var = null;
            if (b5 == untransformedText) {
                return null;
            }
            long f4 = f(untransformedText.getSelectionInChars(), rVar);
            t0 compositionInChars = untransformedText.getCompositionInChars();
            if (compositionInChars != null) {
                t0Var = t0.b(m0.f8695e.f(compositionInChars.getPackedValue(), rVar));
            }
            return new b(androidx.compose.foundation.text2.input.r.a(b5, f4, t0Var), rVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kd.n
        public final long e(long range, r mapping) {
            long b5 = mapping.b(t0.n(range));
            long b6 = t0.h(range) ? b5 : mapping.b((int) (4294967295L & range));
            int min = Math.min(t0.l(b5), t0.l(b6));
            int max = Math.max(t0.k(b5), t0.k(b6));
            return t0.m(range) ? u0.b(max, min) : u0.b(min, max);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kd.n
        public final long f(long range, r mapping) {
            long c5 = mapping.c(t0.n(range));
            long c6 = t0.h(range) ? c5 : mapping.c((int) (4294967295L & range));
            int min = Math.min(t0.l(c5), t0.l(c6));
            int max = Math.max(t0.k(c5), t0.k(c6));
            return t0.m(range) ? u0.b(max, min) : u0.b(min, max);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m0$b;", "", "Landroidx/compose/foundation/text2/input/q;", "text", "Landroidx/compose/foundation/text2/input/internal/r;", "offsetMapping", "<init>", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/internal/r;)V", "a", "()Landroidx/compose/foundation/text2/input/q;", "b", "()Landroidx/compose/foundation/text2/input/internal/r;", "c", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/internal/r;)Landroidx/compose/foundation/text2/input/internal/m0$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/text2/input/q;", "f", "Landroidx/compose/foundation/text2/input/internal/r;", "e", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.compose.foundation.text2.input.q text;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final r offsetMapping;

        public b(@fg.l androidx.compose.foundation.text2.input.q qVar, @fg.l r rVar) {
            this.text = qVar;
            this.offsetMapping = rVar;
        }

        public static b d(b bVar, androidx.compose.foundation.text2.input.q qVar, r rVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                qVar = bVar.text;
            }
            if ((i4 & 2) != 0) {
                rVar = bVar.offsetMapping;
            }
            bVar.getClass();
            return new b(qVar, rVar);
        }

        @fg.l
        /* renamed from: a, reason: from getter */
        public final androidx.compose.foundation.text2.input.q getText() {
            return this.text;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final r getOffsetMapping() {
            return this.offsetMapping;
        }

        @fg.l
        public final b c(@fg.l androidx.compose.foundation.text2.input.q text, @fg.l r offsetMapping) {
            return new b(text, offsetMapping);
        }

        @fg.l
        public final r e() {
            return this.offsetMapping;
        }

        public boolean equals(@fg.m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return kotlin.jvm.internal.l0.g(this.text, bVar.text) && kotlin.jvm.internal.l0.g(this.offsetMapping, bVar.offsetMapping);
        }

        @fg.l
        public final androidx.compose.foundation.text2.input.q f() {
            return this.text;
        }

        public int hashCode() {
            return this.offsetMapping.hashCode() + (this.text.hashCode() * 31);
        }

        @fg.l
        public String toString() {
            return "TransformedText(text=" + ((Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }
    }

    /* compiled from: TransformedTextFieldState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text2.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {394}, m = "collectImeNotifications", n = {"this", "notifyImeListener"}, s = {"L$0", "L$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f8703b;

        /* renamed from: c, reason: collision with root package name */
        Object f8704c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f8705d;

        /* renamed from: f, reason: collision with root package name */
        int f8707f;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f8705d = obj;
            this.f8707f |= Integer.MIN_VALUE;
            return m0.this.g(null, this);
        }
    }

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/k2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d extends n0 implements ld.l<Throwable, k2> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u.a f8709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u.a aVar) {
            super(1);
            this.f8709c = aVar;
        }

        @Override // ld.l
        public /* bridge */ /* synthetic */ k2 invoke(Throwable th) {
            invoke2(th);
            return k2.f75408a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@fg.m Throwable th) {
            m0.this.textFieldState.s(this.f8709c);
        }
    }

    /* compiled from: TransformedTextFieldState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/m0$b;", "a", "()Landroidx/compose/foundation/text2/input/internal/m0$b;"}, k = 3, mv = {1, 8, 0})
    static final class e extends n0 implements ld.a<b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.text2.input.c f8711c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.foundation.text2.input.c cVar) {
            super(0);
            this.f8711c = cVar;
        }

        @Override // ld.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return m0.f8695e.d(m0.this.textFieldState.m(), this.f8711c);
        }
    }

    public m0(@fg.l androidx.compose.foundation.text2.input.u uVar, @fg.m androidx.compose.foundation.text2.input.h hVar, @fg.m androidx.compose.foundation.text2.input.c cVar) {
        this.textFieldState = uVar;
        this.inputTransformation = hVar;
        this.codepointTransformation = cVar;
        this.transformedText = cVar != null ? o4.e(new e(cVar)) : null;
    }

    @kd.n
    private static final b d(androidx.compose.foundation.text2.input.q qVar, androidx.compose.foundation.text2.input.c cVar) {
        return f8695e.d(qVar, cVar);
    }

    public static /* synthetic */ void j(m0 m0Var, boolean z4, ld.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        androidx.compose.foundation.text2.input.u uVar = m0Var.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = m0Var.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        lVar.invoke(uVar.getMainBuffer());
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, z4, cVar);
    }

    @kd.n
    private static final long o(long j4, r rVar) {
        return f8695e.e(j4, rVar);
    }

    @kd.n
    private static final long r(long j4, r rVar) {
        return f8695e.f(j4, rVar);
    }

    public static /* synthetic */ void w(m0 m0Var, CharSequence charSequence, boolean z4, androidx.compose.foundation.text2.input.internal.undo.c cVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        if ((i4 & 4) != 0) {
            cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        }
        m0Var.v(charSequence, z4, cVar);
    }

    public static /* synthetic */ void y(m0 m0Var, CharSequence charSequence, long j4, androidx.compose.foundation.text2.input.internal.undo.c cVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        }
        m0Var.x(charSequence, j4, cVar);
    }

    public final void A(long transformedRange) {
        B(n(transformedRange));
    }

    public final void B(long untransformedRange) {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        uVar.getMainBuffer().r(t0.n(untransformedRange), (int) (untransformedRange & 4294967295L));
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, cVar);
    }

    public final void C() {
        this.textFieldState.getUndoState().g();
    }

    public final void e() {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        mainBuffer.r(t0.i(mainBuffer.k()), (int) (mainBuffer.k() & 4294967295L));
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, cVar);
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) other;
        if (kotlin.jvm.internal.l0.g(this.textFieldState, m0Var.textFieldState)) {
            return kotlin.jvm.internal.l0.g(this.codepointTransformation, m0Var.codepointTransformation);
        }
        return false;
    }

    public final void f() {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        mainBuffer.r(t0.k(mainBuffer.k()), t0.k(mainBuffer.k()));
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@fg.l androidx.compose.foundation.text2.input.u.a r5, @fg.l kotlin.coroutines.d<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text2.input.internal.m0.c
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text2.input.internal.m0$c r0 = (androidx.compose.foundation.text2.input.internal.m0.c) r0
            int r1 = r0.f8707f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8707f = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.m0$c r0 = new androidx.compose.foundation.text2.input.internal.m0$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8705d
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f8707f
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            java.lang.Object r5 = r0.f8704c
            androidx.compose.foundation.text2.input.u$a r5 = (androidx.compose.foundation.text2.input.u.a) r5
            java.lang.Object r5 = r0.f8703b
            androidx.compose.foundation.text2.input.internal.m0 r5 = (androidx.compose.foundation.text2.input.internal.m0) r5
            kotlin.a1.n(r6)
            goto L65
        L37:
            kotlin.a1.n(r6)
            r0.f8703b = r4
            r0.f8704c = r5
            r0.f8707f = r3
            kotlinx.coroutines.q r6 = new kotlinx.coroutines.q
            kotlin.coroutines.d r2 = kotlin.coroutines.intrinsics.b.e(r0)
            r6.<init>(r2, r3)
            r6.e0()
            androidx.compose.foundation.text2.input.u r2 = r4.textFieldState
            r2.d(r5)
            androidx.compose.foundation.text2.input.internal.m0$d r2 = new androidx.compose.foundation.text2.input.internal.m0$d
            r2.<init>(r5)
            r6.k0(r2)
            java.lang.Object r5 = r6.y()
            if (r5 != r1) goto L62
            kotlin.coroutines.jvm.internal.h.c(r0)
        L62:
            if (r5 != r1) goto L65
            return r1
        L65:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.m0.g(androidx.compose.foundation.text2.input.u$a, kotlin.coroutines.d):java.lang.Object");
    }

    public final void h() {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.NeverMerge;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        mainBuffer.c(t0.l(mainBuffer.k()), t0.k(mainBuffer.k()));
        mainBuffer.r(t0.l(mainBuffer.k()), t0.l(mainBuffer.k()));
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, cVar);
    }

    public int hashCode() {
        int hashCode = this.textFieldState.hashCode() * 31;
        androidx.compose.foundation.text2.input.c cVar = this.codepointTransformation;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final void i(boolean notifyImeOfChanges, @fg.l ld.l<? super m, k2> block) {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        block.invoke(uVar.getMainBuffer());
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, notifyImeOfChanges, cVar);
    }

    @fg.l
    public final androidx.compose.foundation.text2.input.q k() {
        b value;
        androidx.compose.foundation.text2.input.q f4;
        b5<b> b5Var = this.transformedText;
        return (b5Var == null || (value = b5Var.getValue()) == null || (f4 = value.f()) == null) ? this.textFieldState.m() : f4;
    }

    @fg.l
    public final androidx.compose.foundation.text2.input.q l() {
        return this.textFieldState.m();
    }

    public final int m(int offset) {
        b value;
        r e4;
        b5<b> b5Var = this.transformedText;
        return (b5Var == null || (value = b5Var.getValue()) == null || (e4 = value.e()) == null) ? offset : t0.l(e4.b(offset));
    }

    public final long n(long range) {
        b value;
        r e4;
        b5<b> b5Var = this.transformedText;
        return (b5Var == null || (value = b5Var.getValue()) == null || (e4 = value.e()) == null) ? range : f8695e.e(range, e4);
    }

    public final long p(int offset) {
        b value;
        r e4;
        b5<b> b5Var = this.transformedText;
        return (b5Var == null || (value = b5Var.getValue()) == null || (e4 = value.e()) == null) ? u0.b(offset, offset) : e4.c(offset);
    }

    public final long q(long range) {
        b value;
        r e4;
        b5<b> b5Var = this.transformedText;
        return (b5Var == null || (value = b5Var.getValue()) == null || (e4 = value.e()) == null) ? range : f8695e.f(range, e4);
    }

    public final void s(int transformedOffset) {
        A(u0.b(transformedOffset, transformedOffset));
    }

    public final void t() {
        this.textFieldState.getUndoState().f();
    }

    @fg.l
    public String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", codepointTransformation=" + this.codepointTransformation + ", transformedText=" + this.transformedText + ", text=\"" + ((Object) k()) + "\")";
    }

    public final void u(@fg.l CharSequence newText) {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        l.c(mainBuffer);
        l.b(mainBuffer, newText.toString(), 1);
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, cVar);
    }

    public final void v(@fg.l CharSequence newText, boolean clearComposition, @fg.l androidx.compose.foundation.text2.input.internal.undo.c undoBehavior) {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        if (clearComposition) {
            mainBuffer.b();
        }
        long k4 = mainBuffer.k();
        mainBuffer.o(t0.l(k4), t0.k(k4), newText);
        int length = newText.length() + t0.l(k4);
        mainBuffer.r(length, length);
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, undoBehavior);
    }

    public final void x(@fg.l CharSequence newText, long range, @fg.l androidx.compose.foundation.text2.input.internal.undo.c undoBehavior) {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        long n4 = n(range);
        mainBuffer.o(t0.l(n4), t0.k(n4), newText);
        int length = newText.length() + t0.l(n4);
        mainBuffer.r(length, length);
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, undoBehavior);
    }

    public final void z() {
        androidx.compose.foundation.text2.input.u uVar = this.textFieldState;
        androidx.compose.foundation.text2.input.h hVar = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.c cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        androidx.compose.foundation.text2.input.q m4 = uVar.m();
        uVar.getMainBuffer().getChangeTracker().e();
        m mainBuffer = uVar.getMainBuffer();
        mainBuffer.r(0, mainBuffer.j());
        if (uVar.getMainBuffer().getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.getMainBuffer().k()) && kotlin.jvm.internal.l0.g(m4.getCompositionInChars(), uVar.getMainBuffer().f())) {
            return;
        }
        uVar.f(m4, hVar, true, cVar);
    }
}
