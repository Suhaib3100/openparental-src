package androidx.compose.foundation.text2.input;

import androidx.annotation.m1;
import androidx.compose.foundation.text2.input.o;
import androidx.compose.foundation.text2.input.x;
import androidx.compose.foundation.z0;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.x4;
import androidx.compose.ui.text.t0;
import androidx.compose.ui.text.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.w0;

/* compiled from: TextFieldState.kt */
@z0
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u00027<B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ1\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010#\u001a\u00020\u00132\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b!H\u0086\b¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020 2\u0006\u0010'\u001a\u00020\u000bH\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020 H\u0001¢\u0006\u0004\b*\u0010+JG\u0010-\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b!H\u0080\b¢\u0006\u0004\b-\u0010.J)\u0010/\u001a\u00020\u00132\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b!H\u0080\b¢\u0006\u0004\b/\u0010$J\u0017\u00102\u001a\u00020\u00132\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00132\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000bH\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010;\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010D\u001a\u00020,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b<\u0010=\u0012\u0004\bB\u0010C\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010K\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u00106R \u0010Q\u001a\u00020L8GX\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010M\u0012\u0004\bP\u0010C\u001a\u0004\bN\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u0002000R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010S¨\u0006U"}, d2 = {"Landroidx/compose/foundation/text2/input/u;", "", "", "initialText", "Landroidx/compose/ui/text/t0;", "initialSelectionInChars", "Landroidx/compose/foundation/text2/input/x;", "initialTextUndoManager", "<init>", "(Ljava/lang/String;JLandroidx/compose/foundation/text2/input/x;Lkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "Landroidx/compose/foundation/text2/input/q;", "previousValue", "Landroidx/compose/foundation/text2/input/h;", "inputTransformation", "", "notifyImeOfChanges", "Landroidx/compose/foundation/text2/input/internal/undo/c;", "undoBehavior", "Lkotlin/k2;", "f", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/h;ZLandroidx/compose/foundation/text2/input/internal/undo/c;)V", "postValue", "Landroidx/compose/foundation/text2/input/o$a;", "changes", "r", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o$a;Landroidx/compose/foundation/text2/input/internal/undo/c;)V", "oldValue", "newValue", "q", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/q;)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/o;", "Lkotlin/u;", "block", "g", "(Lld/l;)V", "toString", "()Ljava/lang/String;", "value", "w", "(Landroidx/compose/foundation/text2/input/q;)Landroidx/compose/foundation/text2/input/o;", "e", "(Landroidx/compose/foundation/text2/input/o;)V", "Landroidx/compose/foundation/text2/input/internal/m;", "h", "(Landroidx/compose/foundation/text2/input/h;ZLandroidx/compose/foundation/text2/input/internal/undo/c;Lld/l;)V", "j", "Landroidx/compose/foundation/text2/input/u$a;", "notifyImeListener", "d", "(Landroidx/compose/foundation/text2/input/u$a;)V", "s", "t", "(Landroidx/compose/foundation/text2/input/q;)V", "a", "Landroidx/compose/foundation/text2/input/x;", "n", "()Landroidx/compose/foundation/text2/input/x;", "textUndoManager", "b", "Landroidx/compose/foundation/text2/input/internal/m;", "k", "()Landroidx/compose/foundation/text2/input/internal/m;", "u", "(Landroidx/compose/foundation/text2/input/internal/m;)V", "l", "()V", "mainBuffer", "<set-?>", "c", "Landroidx/compose/runtime/k2;", "m", "()Landroidx/compose/foundation/text2/input/q;", "v", "text", "Landroidx/compose/foundation/text2/input/z;", "Landroidx/compose/foundation/text2/input/z;", "o", "()Landroidx/compose/foundation/text2/input/z;", "p", "undoState", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/runtime/collection/g;", "notifyImeListeners", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x4
@r1({"SMAP\nTextFieldState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,569:1\n1208#2:570\n1187#2,2:571\n81#3:573\n107#3,2:574\n460#4,11:576\n*S KotlinDebug\n*F\n+ 1 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n406#1:570\n406#1:571,2\n107#1:573\n107#1:574,2\n412#1:576,11\n*E\n"})
/* loaded from: classes.dex */
public final class u {

    /* renamed from: f, reason: collision with root package name */
    public static final int f9063f = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x textUndoManager;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.text2.input.internal.m mainBuffer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final k2 text;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final z undoState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.runtime.collection.g<a> notifyImeListeners;

    /* compiled from: TextFieldState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text2/input/u$a;", "", "Landroidx/compose/foundation/text2/input/q;", "oldValue", "newValue", "Lkotlin/k2;", "a", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/q;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        void a(@fg.l q oldValue, @fg.l q newValue);
    }

    /* compiled from: TextFieldState.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text2/input/u$b;", "Landroidx/compose/runtime/saveable/l;", "Landroidx/compose/foundation/text2/input/u;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/n;", "value", "d", "(Landroidx/compose/runtime/saveable/n;Landroidx/compose/foundation/text2/input/u;)Ljava/lang/Object;", "c", "(Ljava/lang/Object;)Landroidx/compose/foundation/text2/input/u;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.compose.runtime.internal.u(parameters = 1)
    public static final class b implements androidx.compose.runtime.saveable.l<u, Object> {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f9069a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f9070b = 0;

        private b() {
        }

        @Override // androidx.compose.runtime.saveable.l
        @fg.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u b(@fg.l Object value) {
            l0.n(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) value;
            Object obj = list.get(0);
            Object obj2 = list.get(1);
            Object obj3 = list.get(2);
            Object obj4 = list.get(3);
            l0.n(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            l0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            l0.n(obj3, "null cannot be cast to non-null type kotlin.Int");
            long b5 = u0.b(intValue, ((Integer) obj3).intValue());
            x.Companion.C0190a c0190a = x.Companion.C0190a.f9086a;
            l0.m(obj4);
            x b6 = c0190a.b(obj4);
            l0.m(b6);
            return new u(str, b5, b6, (kotlin.jvm.internal.w) null);
        }

        @Override // androidx.compose.runtime.saveable.l
        @fg.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object a(@fg.l androidx.compose.runtime.saveable.n nVar, @fg.l u uVar) {
            return kotlin.collections.w.O(uVar.m().toString(), Integer.valueOf(t0.n(uVar.m().getSelectionInChars())), Integer.valueOf((int) (uVar.m().getSelectionInChars() & 4294967295L)), x.Companion.C0190a.f9086a.a(nVar, uVar.getTextUndoManager()));
        }
    }

    /* compiled from: TextFieldState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9071a;

        static {
            int[] iArr = new int[androidx.compose.foundation.text2.input.internal.undo.c.values().length];
            try {
                iArr[androidx.compose.foundation.text2.input.internal.undo.c.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text2.input.internal.undo.c.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9071a = iArr;
        }
    }

    public /* synthetic */ u(String str, long j4, x xVar, kotlin.jvm.internal.w wVar) {
        this(str, j4, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(q previousValue, h inputTransformation, boolean notifyImeOfChanges, androidx.compose.foundation.text2.input.internal.undo.c undoBehavior) {
        q a5 = r.a(this.mainBuffer.toString(), this.mainBuffer.k(), this.mainBuffer.f());
        if (inputTransformation == null) {
            q m4 = m();
            v(a5);
            if (notifyImeOfChanges) {
                q(m4, a5);
            }
            r(previousValue, m(), this.mainBuffer.getChangeTracker(), undoBehavior);
            return;
        }
        q m5 = m();
        if (a5.d(m5) && t0.g(a5.getSelectionInChars(), m5.getSelectionInChars())) {
            v(a5);
            if (notifyImeOfChanges) {
                q(m5, a5);
                return;
            }
            return;
        }
        o oVar = new o(a5, this.mainBuffer.getChangeTracker(), m5);
        inputTransformation.a(m5, oVar);
        q B = oVar.B(a5.getCompositionInChars());
        if (l0.g(B, a5)) {
            v(B);
            if (notifyImeOfChanges) {
                q(m5, a5);
            }
        } else {
            t(B);
        }
        r(previousValue, m(), oVar.h(), undoBehavior);
    }

    public static void i(u uVar, h hVar, boolean z4, androidx.compose.foundation.text2.input.internal.undo.c cVar, ld.l lVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        if ((i4 & 4) != 0) {
            cVar = androidx.compose.foundation.text2.input.internal.undo.c.MergeIfPossible;
        }
        q m4 = uVar.m();
        uVar.mainBuffer.getChangeTracker().e();
        lVar.invoke(uVar.mainBuffer);
        if (uVar.mainBuffer.getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), uVar.mainBuffer.k()) && l0.g(m4.getCompositionInChars(), uVar.mainBuffer.f())) {
            return;
        }
        uVar.f(m4, hVar, z4, cVar);
    }

    @m1
    public static /* synthetic */ void l() {
    }

    @z0
    public static /* synthetic */ void p() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(q oldValue, q newValue) {
        androidx.compose.runtime.collection.g<a> gVar = this.notifyImeListeners;
        int size = gVar.getSize();
        if (size > 0) {
            a[] L = gVar.L();
            int i4 = 0;
            do {
                L[i4].a(oldValue, newValue);
                i4++;
            } while (i4 < size);
        }
    }

    private final void r(q previousValue, q postValue, o.a changes, androidx.compose.foundation.text2.input.internal.undo.c undoBehavior) {
        int i4 = c.f9071a[undoBehavior.ordinal()];
        if (i4 == 1) {
            this.textUndoManager.c();
        } else if (i4 == 2) {
            y.c(this.textUndoManager, previousValue, postValue, changes, true);
        } else {
            if (i4 != 3) {
                return;
            }
            y.c(this.textUndoManager, previousValue, postValue, changes, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(q qVar) {
        this.text.setValue(qVar);
    }

    public final void d(@fg.l a notifyImeListener) {
        this.notifyImeListeners.b(notifyImeListener);
    }

    @w0
    public final void e(@fg.l o newValue) {
        boolean z4 = newValue.h().a() > 0;
        boolean g4 = t0.g(newValue.getSelectionInChars(), this.mainBuffer.k());
        if (z4 || !g4) {
            t(o.C(newValue, null, 1, null));
        }
        this.textUndoManager.c();
    }

    public final void g(@fg.l ld.l<? super o, kotlin.k2> block) {
        o w4 = w(m());
        block.invoke(w4);
        e(w4);
    }

    public final void h(@fg.m h inputTransformation, boolean notifyImeOfChanges, @fg.l androidx.compose.foundation.text2.input.internal.undo.c undoBehavior, @fg.l ld.l<? super androidx.compose.foundation.text2.input.internal.m, kotlin.k2> block) {
        q m4 = m();
        this.mainBuffer.getChangeTracker().e();
        block.invoke(this.mainBuffer);
        if (this.mainBuffer.getChangeTracker().a() == 0 && t0.g(m4.getSelectionInChars(), this.mainBuffer.k()) && l0.g(m4.getCompositionInChars(), this.mainBuffer.f())) {
            return;
        }
        f(m4, inputTransformation, notifyImeOfChanges, undoBehavior);
    }

    public final void j(@fg.l ld.l<? super androidx.compose.foundation.text2.input.internal.m, kotlin.k2> block) {
        q m4 = m();
        this.mainBuffer.getChangeTracker().e();
        block.invoke(this.mainBuffer);
        q a5 = r.a(this.mainBuffer.toString(), this.mainBuffer.k(), this.mainBuffer.f());
        v(a5);
        q(m4, a5);
    }

    @fg.l
    /* renamed from: k, reason: from getter */
    public final androidx.compose.foundation.text2.input.internal.m getMainBuffer() {
        return this.mainBuffer;
    }

    @fg.l
    public final q m() {
        return (q) this.text.getValue();
    }

    @fg.l
    /* renamed from: n, reason: from getter */
    public final x getTextUndoManager() {
        return this.textUndoManager;
    }

    @fg.l
    @z0
    /* renamed from: o, reason: from getter */
    public final z getUndoState() {
        return this.undoState;
    }

    public final void s(@fg.l a notifyImeListener) {
        this.notifyImeListeners.j0(notifyImeListener);
    }

    @m1
    public final void t(@fg.l q newValue) {
        q a5 = r.a(this.mainBuffer.toString(), this.mainBuffer.k(), this.mainBuffer.f());
        boolean g4 = l0.g(newValue.getCompositionInChars(), this.mainBuffer.f());
        boolean z4 = true;
        boolean z5 = false;
        if (!a5.d(newValue)) {
            this.mainBuffer = new androidx.compose.foundation.text2.input.internal.m(newValue.toString(), newValue.getSelectionInChars(), (kotlin.jvm.internal.w) null);
        } else if (t0.g(a5.getSelectionInChars(), newValue.getSelectionInChars())) {
            z4 = false;
        } else {
            this.mainBuffer.r((int) (newValue.getSelectionInChars() >> 32), (int) (newValue.getSelectionInChars() & 4294967295L));
            z5 = true;
            z4 = false;
        }
        t0 compositionInChars = newValue.getCompositionInChars();
        if (compositionInChars == null || t0.h(compositionInChars.getPackedValue())) {
            this.mainBuffer.b();
        } else {
            this.mainBuffer.p(t0.l(compositionInChars.getPackedValue()), t0.k(compositionInChars.getPackedValue()));
        }
        if (z4 || (!z5 && !g4)) {
            this.mainBuffer.b();
        }
        if (!z4) {
            newValue = a5;
        }
        q a6 = r.a(newValue, this.mainBuffer.k(), this.mainBuffer.f());
        v(a6);
        q(a5, a6);
    }

    @fg.l
    public String toString() {
        return "TextFieldState(selectionInChars=" + ((Object) t0.q(m().getSelectionInChars())) + ", text=\"" + ((Object) m()) + "\")";
    }

    public final void u(@fg.l androidx.compose.foundation.text2.input.internal.m mVar) {
        this.mainBuffer = mVar;
    }

    @fg.l
    @w0
    public final o w(@fg.l q value) {
        return new o(value, null, null, 6, null);
    }

    public /* synthetic */ u(String str, long j4, kotlin.jvm.internal.w wVar) {
        this(str, j4);
    }

    private u(String str, long j4, x xVar) {
        k2 g4;
        this.textUndoManager = xVar;
        this.mainBuffer = new androidx.compose.foundation.text2.input.internal.m(str, u0.c(j4, 0, str.length()), (kotlin.jvm.internal.w) null);
        g4 = t4.g(r.c(str, j4), null, 2, null);
        this.text = g4;
        this.undoState = new z(this);
        this.notifyImeListeners = new androidx.compose.runtime.collection.g<>(new a[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u(java.lang.String r1, long r2, int r4, kotlin.jvm.internal.w r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto L12
            int r2 = r1.length()
            long r2 = androidx.compose.ui.text.u0.b(r2, r2)
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.u.<init>(java.lang.String, long, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u(String str, long j4) {
        this(str, j4, new x(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }
}
