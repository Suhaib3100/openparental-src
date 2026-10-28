package androidx.compose.foundation.text;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.Metadata;

/* compiled from: UndoManager.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/j1;", "", "", "maxStoredCharacters", "<init>", "(I)V", "Lkotlin/k2;", "e", "()V", "Landroidx/compose/ui/text/input/z0;", "value", "", "now", "f", "(Landroidx/compose/ui/text/input/z0;J)V", "a", "c", "(Landroidx/compose/ui/text/input/z0;)V", "h", "()Landroidx/compose/ui/text/input/z0;", "d", "I", "b", "()I", "Landroidx/compose/foundation/text/j1$a;", "Landroidx/compose/foundation/text/j1$a;", "undoStack", "redoStack", "storedCharacters", "Ljava/lang/Long;", "lastSnapshot", "", "Z", "forceNextSnapshot", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f7454g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int maxStoredCharacters;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a undoStack;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private a redoStack;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int storedCharacters;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Long lastSnapshot;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean forceNextSnapshot;

    public j1() {
        this(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e A[LOOP:0: B:7:0x000e->B:12:0x001e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[EDGE_INSN: B:13:0x0023->B:14:0x0023 BREAK  A[LOOP:0: B:7:0x000e->B:12:0x001e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e() {
        /*
            r3 = this;
            androidx.compose.foundation.text.j1$a r0 = r3.undoStack
            r1 = 0
            if (r0 == 0) goto La
            androidx.compose.foundation.text.j1$a r2 = r0.getNext()
            goto Lb
        La:
            r2 = r1
        Lb:
            if (r2 != 0) goto Le
            return
        Le:
            if (r0 == 0) goto L1b
            androidx.compose.foundation.text.j1$a r2 = r0.getNext()
            if (r2 == 0) goto L1b
            androidx.compose.foundation.text.j1$a r2 = r2.getNext()
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L23
            androidx.compose.foundation.text.j1$a r0 = r0.getNext()
            goto Le
        L23:
            if (r0 != 0) goto L26
            goto L29
        L26:
            r0.c(r1)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.j1.e():void");
    }

    public static void g(j1 j1Var, androidx.compose.ui.text.input.z0 z0Var, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = System.currentTimeMillis();
        }
        j1Var.f(z0Var, j4);
    }

    public final void a() {
        this.forceNextSnapshot = true;
    }

    /* renamed from: b, reason: from getter */
    public final int getMaxStoredCharacters() {
        return this.maxStoredCharacters;
    }

    public final void c(@fg.l androidx.compose.ui.text.input.z0 value) {
        androidx.compose.ui.text.input.z0 value2;
        this.forceNextSnapshot = false;
        a aVar = this.undoStack;
        if (kotlin.jvm.internal.l0.g(value, aVar != null ? aVar.getValue() : null)) {
            return;
        }
        String i4 = value.i();
        a aVar2 = this.undoStack;
        if (kotlin.jvm.internal.l0.g(i4, (aVar2 == null || (value2 = aVar2.getValue()) == null) ? null : value2.i())) {
            a aVar3 = this.undoStack;
            if (aVar3 == null) {
                return;
            }
            aVar3.d(value);
            return;
        }
        this.undoStack = new a(this.undoStack, value);
        this.redoStack = null;
        int length = value.i().length() + this.storedCharacters;
        this.storedCharacters = length;
        if (length > this.maxStoredCharacters) {
            e();
        }
    }

    @fg.m
    public final androidx.compose.ui.text.input.z0 d() {
        a aVar = this.redoStack;
        if (aVar == null) {
            return null;
        }
        this.redoStack = aVar.getNext();
        this.undoStack = new a(this.undoStack, aVar.getValue());
        this.storedCharacters = aVar.getValue().i().length() + this.storedCharacters;
        return aVar.getValue();
    }

    public final void f(@fg.l androidx.compose.ui.text.input.z0 value, long now) {
        if (!this.forceNextSnapshot) {
            Long l4 = this.lastSnapshot;
            if (now <= (l4 != null ? l4.longValue() : 0L) + k1.a()) {
                return;
            }
        }
        this.lastSnapshot = Long.valueOf(now);
        c(value);
    }

    @fg.m
    public final androidx.compose.ui.text.input.z0 h() {
        a next;
        a aVar = this.undoStack;
        if (aVar == null || (next = aVar.getNext()) == null) {
            return null;
        }
        this.undoStack = next;
        this.storedCharacters -= aVar.getValue().i().length();
        this.redoStack = new a(this.redoStack, aVar.getValue());
        return next.getValue();
    }

    public j1(int i4) {
        this.maxStoredCharacters = i4;
    }

    /* compiled from: UndoManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/text/j1$a;", "", "next", "Landroidx/compose/ui/text/input/z0;", "value", "<init>", "(Landroidx/compose/foundation/text/j1$a;Landroidx/compose/ui/text/input/z0;)V", "a", "Landroidx/compose/foundation/text/j1$a;", "()Landroidx/compose/foundation/text/j1$a;", "c", "(Landroidx/compose/foundation/text/j1$a;)V", "b", "Landroidx/compose/ui/text/input/z0;", "()Landroidx/compose/ui/text/input/z0;", "d", "(Landroidx/compose/ui/text/input/z0;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private a next;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private androidx.compose.ui.text.input.z0 value;

        public a(@fg.m a aVar, @fg.l androidx.compose.ui.text.input.z0 z0Var) {
            this.next = aVar;
            this.value = z0Var;
        }

        @fg.m
        /* renamed from: a, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        @fg.l
        /* renamed from: b, reason: from getter */
        public final androidx.compose.ui.text.input.z0 getValue() {
            return this.value;
        }

        public final void c(@fg.m a aVar) {
            this.next = aVar;
        }

        public final void d(@fg.l androidx.compose.ui.text.input.z0 z0Var) {
            this.value = z0Var;
        }

        public /* synthetic */ a(a aVar, androidx.compose.ui.text.input.z0 z0Var, int i4, kotlin.jvm.internal.w wVar) {
            this((i4 & 1) != 0 ? null : aVar, z0Var);
        }
    }

    public /* synthetic */ j1(int i4, int i5, kotlin.jvm.internal.w wVar) {
        this((i5 & 1) != 0 ? AndroidComposeViewAccessibilityDelegateCompat.Q2 : i4);
    }
}
