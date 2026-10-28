package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l1;
import androidx.compose.ui.q;
import androidx.compose.ui.text.input.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: StateSyncingModifier.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/v;", "Landroidx/compose/ui/q$d;", "Landroidx/compose/ui/node/k1;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/foundation/text2/input/u;", "state", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/z0;", "Lkotlin/k2;", "onValueChanged", "", "writeSelectionFromTextFieldValue", "<init>", "(Landroidx/compose/foundation/text2/input/u;Lld/l;Z)V", "value", "C7", "(Landroidx/compose/ui/text/input/z0;)V", "fireOnValueChanged", "z7", "(Z)V", "B7", "(Landroidx/compose/ui/text/input/z0;Lld/l;)V", "i7", "()V", "Landroidx/compose/ui/focus/j0;", "focusState", "e0", "(Landroidx/compose/ui/focus/j0;)V", "d2", "p", "Landroidx/compose/foundation/text2/input/u;", "q", "Lld/l;", "r", "Z", "s", "isFocused", "t", "Landroidx/compose/ui/text/input/z0;", "lastValueWhileFocused", "b7", "()Z", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nStateSyncingModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateSyncingModifier.kt\nandroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text2/input/TextFieldState\n*L\n1#1,171:1\n1#2:172\n123#3,4:173\n*S KotlinDebug\n*F\n+ 1 StateSyncingModifier.kt\nandroidx/compose/foundation/text2/input/internal/StateSyncingModifierNode\n*L\n142#1:173,4\n*E\n"})
/* loaded from: classes.dex */
final class v extends q.d implements k1, androidx.compose.ui.focus.i {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.foundation.text2.input.u state;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private ld.l<? super z0, k2> onValueChanged;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean writeSelectionFromTextFieldValue;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isFocused;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private z0 lastValueWhileFocused;

    /* compiled from: StateSyncingModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.a<k2> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1.h<androidx.compose.foundation.text2.input.q> f8981b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ v f8982c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.h<androidx.compose.foundation.text2.input.q> hVar, v vVar) {
            super(0);
            this.f8981b = hVar;
            this.f8982c = vVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.foundation.text2.input.q] */
        public final void a() {
            this.f8981b.f75329b = this.f8982c.state.m();
        }

        @Override // ld.a
        public /* bridge */ /* synthetic */ k2 invoke() {
            a();
            return k2.f75408a;
        }
    }

    public v(@fg.l androidx.compose.foundation.text2.input.u uVar, @fg.l ld.l<? super z0, k2> lVar, boolean z4) {
        this.state = uVar;
        this.onValueChanged = lVar;
        this.writeSelectionFromTextFieldValue = z4;
    }

    static /* synthetic */ void A7(v vVar, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        vVar.z7(z4);
    }

    private final void C7(z0 value) {
        androidx.compose.foundation.text2.input.u uVar = this.state;
        androidx.compose.foundation.text2.input.o w4 = uVar.w(uVar.m());
        w4.A(value.i());
        if (this.writeSelectionFromTextFieldValue) {
            w4.y(value.getSelection());
        }
        uVar.e(w4);
    }

    private final void z7(boolean fireOnValueChanged) {
        androidx.compose.foundation.text2.input.q qVar;
        androidx.compose.foundation.text2.input.q qVar2;
        k1.h hVar = new k1.h();
        l1.a(this, new a(hVar, this));
        if (fireOnValueChanged) {
            T t4 = hVar.f75329b;
            androidx.compose.foundation.text2.input.q qVar3 = null;
            if (t4 == 0) {
                kotlin.jvm.internal.l0.S("text");
                qVar = null;
            } else {
                qVar = (androidx.compose.foundation.text2.input.q) t4;
            }
            String obj = qVar.toString();
            T t5 = hVar.f75329b;
            if (t5 == 0) {
                kotlin.jvm.internal.l0.S("text");
                qVar2 = null;
            } else {
                qVar2 = (androidx.compose.foundation.text2.input.q) t5;
            }
            long selectionInChars = qVar2.getSelectionInChars();
            T t6 = hVar.f75329b;
            if (t6 == 0) {
                kotlin.jvm.internal.l0.S("text");
            } else {
                qVar3 = (androidx.compose.foundation.text2.input.q) t6;
            }
            this.onValueChanged.invoke(new z0(obj, selectionInChars, qVar3.getCompositionInChars(), (kotlin.jvm.internal.w) null));
        }
    }

    public final void B7(@fg.l z0 value, @fg.l ld.l<? super z0, k2> onValueChanged) {
        this.onValueChanged = onValueChanged;
        if (this.isFocused) {
            this.lastValueWhileFocused = value;
        } else {
            C7(value);
        }
    }

    @Override // androidx.compose.ui.q.d
    public boolean b7() {
        return false;
    }

    @Override // androidx.compose.ui.node.k1
    public void d2() {
        A7(this, false, 1, null);
    }

    @Override // androidx.compose.ui.focus.i
    public void e0(@fg.l androidx.compose.ui.focus.j0 focusState) {
        if (this.isFocused && !focusState.isFocused()) {
            z0 z0Var = this.lastValueWhileFocused;
            if (z0Var != null) {
                C7(z0Var);
            }
            this.lastValueWhileFocused = null;
        }
        this.isFocused = focusState.isFocused();
    }

    @Override // androidx.compose.ui.q.d
    public void i7() {
        z7(false);
    }
}
