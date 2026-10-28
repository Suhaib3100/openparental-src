package androidx.compose.foundation.text2.input;

import androidx.collection.n1;
import androidx.compose.foundation.z0;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: TextFieldBuffer.kt */
@z0
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001<B'\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\"J%\u0010(\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J;\u0010,\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010*\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020&H\u0000¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00060\u0001j\u0002`\u00022\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b1\u00102J-\u00101\u001a\u00060\u0001j\u0002`\u00022\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00103J\u001b\u00101\u001a\u00060\u0001j\u0002`\u00022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b1\u00106J\u0015\u00107\u001a\u0002042\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020&¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u000e¢\u0006\u0004\b>\u0010\u0012J\u0015\u0010?\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\bA\u0010@J\u0015\u0010B\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\bB\u0010@J\u0015\u0010C\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\bC\u0010@J\u0018\u0010D\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\bF\u0010EJ\u001e\u0010H\u001a\u00020\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u001aH\u0000ø\u0001\u0000¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010JR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010LR\u0018\u0010O\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010NR*\u0010T\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020\u001a8\u0006@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010Q\u001a\u0004\bR\u0010SR\u0011\u0010W\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0011\u0010]\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010`\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0017\u0010b\u001a\u00020\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\ba\u0010S\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, d2 = {"Landroidx/compose/foundation/text2/input/o;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Landroidx/compose/foundation/text2/input/q;", "initialValue", "Landroidx/compose/foundation/text2/input/internal/e;", "initialChanges", "sourceValue", "<init>", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/internal/e;Landroidx/compose/foundation/text2/input/q;)V", "", "replaceStart", "replaceEnd", "newLength", "Lkotlin/k2;", "n", "(III)V", "e", "()V", "index", "", "startExclusive", "endExclusive", "inCodepoints", "v", "(IZZZ)V", "Landroidx/compose/ui/text/t0;", "range", "w", "(JZ)V", "g", "(J)J", "d", "f", "(I)I", "c", "start", "end", "", "text", "s", "(IILjava/lang/CharSequence;)V", "textStart", "textEnd", "t", "(IILjava/lang/CharSequence;II)V", "newText", "A", "(Ljava/lang/CharSequence;)V", "append", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "", "char", "(C)Ljava/lang/Appendable;", "b", "(I)C", "", "toString", "()Ljava/lang/String;", "a", "()Ljava/lang/CharSequence;", "x", "r", "(I)V", "q", "p", "o", "z", "(J)V", "y", "composition", "B", "(Landroidx/compose/ui/text/t0;)Landroidx/compose/foundation/text2/input/q;", "Landroidx/compose/foundation/text2/input/q;", "Landroidx/compose/foundation/text2/input/internal/t;", "Landroidx/compose/foundation/text2/input/internal/t;", "buffer", "Landroidx/compose/foundation/text2/input/internal/e;", "changeTracker", "<set-?>", "J", "k", "()J", "selectionInChars", "j", "()I", "length", "i", "codepointLength", "Landroidx/compose/foundation/text2/input/o$a;", "h", "()Landroidx/compose/foundation/text2/input/o$a;", "changes", "m", "()Z", "hasSelection", "l", "selectionInCodepoints", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.internal.u(parameters = 0)
@r1({"SMAP\nTextFieldBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBufferKt\n*L\n1#1,646:1\n1#2:647\n589#3,43:648\n*S KotlinDebug\n*F\n+ 1 TextFieldBuffer.kt\nandroidx/compose/foundation/text2/input/TextFieldBuffer\n*L\n162#1:648,43\n*E\n"})
/* loaded from: classes.dex */
public final class o implements Appendable {

    /* renamed from: f, reason: collision with root package name */
    public static final int f9047f = 8;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q sourceValue;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.internal.t buffer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.foundation.text2.input.internal.e changeTracker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long selectionInChars;

    /* compiled from: TextFieldBuffer.kt */
    @z0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/o$a;", "", "", "changeIndex", "Landroidx/compose/ui/text/t0;", "c", "(I)J", "b", "a", "()I", "changeCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        int a();

        long b(int changeIndex);

        long c(int changeIndex);
    }

    public o(@fg.l q qVar, @fg.m androidx.compose.foundation.text2.input.internal.e eVar, @fg.l q qVar2) {
        this.sourceValue = qVar2;
        this.buffer = new androidx.compose.foundation.text2.input.internal.t(qVar);
        this.changeTracker = eVar != null ? new androidx.compose.foundation.text2.input.internal.e(eVar) : null;
        this.selectionInChars = qVar.getSelectionInChars();
    }

    public static /* synthetic */ q C(o oVar, t0 t0Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            t0Var = null;
        }
        return oVar.B(t0Var);
    }

    private final int c(int index) {
        return index;
    }

    private final long d(long range) {
        return u0.b(t0.n(range), (int) (range & 4294967295L));
    }

    private final void e() {
        androidx.compose.foundation.text2.input.internal.e eVar = this.changeTracker;
        if (eVar != null) {
            eVar.e();
        }
    }

    private final int f(int index) {
        return index;
    }

    private final long g(long range) {
        return u0.b(t0.n(range), (int) (range & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r5 == r1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(int r4, int r5, int r6) {
        /*
            r3 = this;
            androidx.compose.foundation.text2.input.internal.e r0 = r3.changeTracker
            if (r0 != 0) goto Ld
            androidx.compose.foundation.text2.input.internal.e r0 = new androidx.compose.foundation.text2.input.internal.e
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1, r2)
            r3.changeTracker = r0
        Ld:
            r0.f(r4, r5, r6)
            int r0 = java.lang.Math.min(r4, r5)
            int r4 = java.lang.Math.max(r4, r5)
            long r1 = r3.selectionInChars
            int r5 = androidx.compose.ui.text.t0.l(r1)
            long r1 = r3.selectionInChars
            int r1 = androidx.compose.ui.text.t0.k(r1)
            if (r1 >= r0) goto L27
            return
        L27:
            if (r5 > r0) goto L33
            if (r4 > r1) goto L33
            int r4 = r4 - r0
            int r6 = r6 - r4
            if (r5 != r1) goto L30
            goto L3e
        L30:
            int r0 = r1 + r6
            goto L48
        L33:
            if (r5 <= r0) goto L3a
            if (r1 >= r4) goto L3a
            int r0 = r0 + r6
            r5 = r0
            goto L48
        L3a:
            if (r5 < r4) goto L40
            int r4 = r4 - r0
            int r6 = r6 - r4
        L3e:
            int r5 = r5 + r6
            goto L30
        L40:
            if (r0 >= r5) goto L48
            int r5 = r0 + r6
            int r4 = r4 - r0
            int r6 = r6 - r4
            int r0 = r6 + r1
        L48:
            long r4 = androidx.compose.ui.text.u0.b(r5, r0)
            r3.selectionInChars = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.o.n(int, int, int):void");
    }

    public static /* synthetic */ void u(o oVar, int i4, int i5, CharSequence charSequence, int i6, int i7, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            i6 = 0;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            i7 = charSequence.length();
        }
        oVar.t(i4, i5, charSequence, i11, i7);
    }

    private final void v(int index, boolean startExclusive, boolean endExclusive, boolean inCodepoints) {
        int i4 = startExclusive ? 0 : -1;
        int e4 = endExclusive ? this.buffer.e() : this.buffer.e() + 1;
        if (i4 > index || index >= e4) {
            String str = inCodepoints ? "codepoints" : "chars";
            StringBuilder a5 = n1.a("Expected ", index, " to be in [", i4, ", ");
            a5.append(e4);
            a5.append(") ");
            a5.append(str);
            throw new IllegalArgumentException(a5.toString().toString());
        }
    }

    private final void w(long range, boolean inCodepoints) {
        long b5 = u0.b(0, this.buffer.e());
        if (inCodepoints) {
            b5 = d(b5);
        }
        if (t0.d(b5, range)) {
            return;
        }
        throw new IllegalArgumentException(("Expected " + ((Object) t0.q(range)) + " to be in " + ((Object) t0.q(b5)) + " (" + (inCodepoints ? "codepoints" : "chars") + ')').toString());
    }

    public final void A(@fg.l CharSequence newText) {
        int i4;
        int i5;
        int i6;
        int i7;
        androidx.compose.foundation.text2.input.internal.t tVar = this.buffer;
        int length = tVar.length();
        int length2 = newText.length();
        boolean z4 = false;
        if (tVar.length() <= 0 || newText.length() <= 0) {
            i4 = length;
            i5 = length2;
            i6 = 0;
            i7 = 0;
        } else {
            int i10 = 0;
            int i11 = 0;
            boolean z5 = false;
            while (true) {
                if (!z4) {
                    if (tVar.charAt(i10) == newText.charAt(i11)) {
                        i10++;
                        i11++;
                    } else {
                        z4 = true;
                    }
                }
                if (!z5) {
                    if (tVar.charAt(length - 1) == newText.charAt(length2 - 1)) {
                        length--;
                        length2--;
                    } else {
                        z5 = true;
                    }
                }
                if (i10 >= length || i11 >= length2 || (z4 && z5)) {
                    break;
                }
            }
            i4 = length;
            i5 = length2;
            i6 = i10;
            i7 = i11;
        }
        if (i6 < i4 || i7 < i5) {
            t(i6, i4, newText, i7, i5);
        }
    }

    @fg.l
    public final q B(@fg.m t0 composition) {
        return r.a(this.buffer.toString(), this.selectionInChars, composition);
    }

    @fg.l
    public final CharSequence a() {
        return this.buffer;
    }

    @Override // java.lang.Appendable
    @fg.l
    public Appendable append(char r12) {
        n(this.buffer.e(), this.buffer.e(), 1);
        androidx.compose.foundation.text2.input.internal.t tVar = this.buffer;
        androidx.compose.foundation.text2.input.internal.t.g(tVar, tVar.e(), this.buffer.e(), String.valueOf(r12), 0, 0, 24, null);
        return this;
    }

    public final char b(int index) {
        return this.buffer.a(index);
    }

    @fg.l
    public final a h() {
        androidx.compose.foundation.text2.input.internal.e eVar = this.changeTracker;
        return eVar != null ? eVar : e.f8517a;
    }

    public final int i() {
        androidx.compose.foundation.text2.input.internal.t tVar = this.buffer;
        return Character.codePointCount(tVar, 0, tVar.e());
    }

    public final int j() {
        return this.buffer.e();
    }

    /* renamed from: k, reason: from getter */
    public final long getSelectionInChars() {
        return this.selectionInChars;
    }

    public final long l() {
        return d(this.selectionInChars);
    }

    @kd.i(name = "hasSelection")
    public final boolean m() {
        return !t0.h(this.selectionInChars);
    }

    public final void o(int index) {
        v(index, false, true, false);
        int i4 = index + 1;
        int e4 = this.buffer.e();
        if (i4 > e4) {
            i4 = e4;
        }
        this.selectionInChars = u0.b(i4, i4);
    }

    public final void p(int index) {
        v(index, false, true, true);
        int i4 = index + 1;
        int i5 = i();
        if (i4 > i5) {
            i4 = i5;
        }
        this.selectionInChars = u0.b(i4, i4);
    }

    public final void q(int index) {
        v(index, true, false, false);
        this.selectionInChars = u0.b(index, index);
    }

    public final void r(int index) {
        v(index, true, false, true);
        this.selectionInChars = u0.b(index, index);
    }

    public final void s(int start, int end, @fg.l CharSequence text) {
        t(start, end, text, 0, text.length());
    }

    public final void t(int start, int end, @fg.l CharSequence text, int textStart, int textEnd) {
        if (start > end) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Expected start=", start, " <= end=", end).toString());
        }
        if (textStart > textEnd) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Expected textStart=", textStart, " <= textEnd=", textEnd).toString());
        }
        n(start, end, textEnd - textStart);
        this.buffer.f(start, end, text, textStart, textEnd);
    }

    @fg.l
    public String toString() {
        return this.buffer.toString();
    }

    public final void x() {
        s(0, this.buffer.e(), this.sourceValue.toString());
        this.selectionInChars = this.sourceValue.getSelectionInChars();
        e();
    }

    public final void y(long range) {
        w(range, false);
        this.selectionInChars = range;
    }

    public final void z(long range) {
        w(range, true);
        this.selectionInChars = g(range);
    }

    public /* synthetic */ o(q qVar, androidx.compose.foundation.text2.input.internal.e eVar, q qVar2, int i4, kotlin.jvm.internal.w wVar) {
        this(qVar, (i4 & 2) != 0 ? null : eVar, (i4 & 4) != 0 ? qVar : qVar2);
    }

    @Override // java.lang.Appendable
    @fg.l
    public Appendable append(@fg.m CharSequence text) {
        if (text != null) {
            n(this.buffer.e(), this.buffer.e(), text.length());
            androidx.compose.foundation.text2.input.internal.t tVar = this.buffer;
            androidx.compose.foundation.text2.input.internal.t.g(tVar, tVar.e(), this.buffer.e(), text, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    @fg.l
    public Appendable append(@fg.m CharSequence text, int start, int end) {
        if (text != null) {
            n(this.buffer.e(), this.buffer.e(), end - start);
            androidx.compose.foundation.text2.input.internal.t tVar = this.buffer;
            androidx.compose.foundation.text2.input.internal.t.g(tVar, tVar.e(), this.buffer.e(), text.subSequence(start, end), 0, 0, 24, null);
        }
        return this;
    }
}
