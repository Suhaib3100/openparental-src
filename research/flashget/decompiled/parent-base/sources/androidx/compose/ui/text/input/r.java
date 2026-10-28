package androidx.compose.ui.text.input;

import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;

/* compiled from: EditProcessor.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0017R$\u0010!\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u001d8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/input/r;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/input/p;", "editCommands", "failedCommand", "", "c", "(Ljava/util/List;Landroidx/compose/ui/text/input/p;)Ljava/lang/String;", "g", "(Landroidx/compose/ui/text/input/p;)Ljava/lang/String;", "Landroidx/compose/ui/text/input/z0;", "value", "Landroidx/compose/ui/text/input/h1;", "textInputSession", "Lkotlin/k2;", "f", "(Landroidx/compose/ui/text/input/z0;Landroidx/compose/ui/text/input/h1;)V", "b", "(Ljava/util/List;)Landroidx/compose/ui/text/input/z0;", "h", "()Landroidx/compose/ui/text/input/z0;", "<set-?>", "a", "Landroidx/compose/ui/text/input/z0;", "e", "mBufferState", "Landroidx/compose/ui/text/input/s;", "Landroidx/compose/ui/text/input/s;", "d", "()Landroidx/compose/ui/text/input/s;", "mBuffer", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nEditProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n33#2,6:180\n1#3:186\n*S KotlinDebug\n*F\n+ 1 EditProcessor.kt\nandroidx/compose/ui/text/input/EditProcessor\n*L\n112#1:180,6\n*E\n"})
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c, reason: collision with root package name */
    public static final int f21090c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private z0 mBufferState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private s mBuffer;

    /* compiled from: EditProcessor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/p;", "it", "", "a", "(Landroidx/compose/ui/text/input/p;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.n0 implements ld.l<p, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f21093b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f21094c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, r rVar) {
            super(1);
            this.f21093b = pVar;
            this.f21094c = rVar;
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@fg.l p pVar) {
            StringBuilder a5 = j4.a(this.f21093b == pVar ? " > " : "   ");
            a5.append(this.f21094c.g(pVar));
            return a5.toString();
        }
    }

    public r() {
        androidx.compose.ui.text.e o4 = androidx.compose.ui.text.f.o();
        androidx.compose.ui.text.t0.INSTANCE.getClass();
        this.mBufferState = new z0(o4, androidx.compose.ui.text.t0.f21417c, (androidx.compose.ui.text.t0) null, (kotlin.jvm.internal.w) null);
        this.mBuffer = new s(this.mBufferState.getAnnotatedString(), this.mBufferState.getSelection(), (kotlin.jvm.internal.w) null);
    }

    private final String c(List<? extends p> editCommands, p failedCommand) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error while applying EditCommand batch to buffer (length=" + this.mBuffer.i() + ", composition=" + this.mBuffer.e() + ", selection=" + ((Object) androidx.compose.ui.text.t0.q(this.mBuffer.j())) + "):");
        kotlin.jvm.internal.l0.o(sb, "append(value)");
        sb.append('\n');
        kotlin.jvm.internal.l0.o(sb, "append('\\n')");
        kotlin.collections.g0.j3(editCommands, sb, (r14 & 2) != 0 ? ProtectedSandApp.s("慰\u0001") : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? ProtectedSandApp.s("慱\u0001") : null, (r14 & 64) != 0 ? null : new a(failedCommand, this));
        String sb2 = sb.toString();
        kotlin.jvm.internal.l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(p pVar) {
        if (pVar instanceof b) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            b bVar = (b) pVar;
            sb.append(bVar.d().length());
            sb.append(", newCursorPosition=");
            sb.append(bVar.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (pVar instanceof x0) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            x0 x0Var = (x0) pVar;
            sb2.append(x0Var.d().length());
            sb2.append(", newCursorPosition=");
            sb2.append(x0Var.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (pVar instanceof w0) {
            return pVar.toString();
        }
        if (pVar instanceof n) {
            return pVar.toString();
        }
        if (pVar instanceof o) {
            return pVar.toString();
        }
        if (pVar instanceof y0) {
            return pVar.toString();
        }
        if (pVar instanceof u) {
            ((u) pVar).getClass();
            return "FinishComposingTextCommand()";
        }
        if (pVar instanceof androidx.compose.ui.text.input.a) {
            ((androidx.compose.ui.text.input.a) pVar).getClass();
            return "BackspaceCommand()";
        }
        if (pVar instanceof i0) {
            return pVar.toString();
        }
        if (pVar instanceof m) {
            ((m) pVar).getClass();
            return "DeleteAllCommand()";
        }
        String W = l1.d(pVar.getClass()).W();
        if (W == null) {
            W = "{anonymous EditCommand}";
        }
        return "Unknown EditCommand: ".concat(W);
    }

    @fg.l
    public final z0 b(@fg.l List<? extends p> editCommands) {
        p pVar;
        Exception e4;
        p pVar2;
        try {
            int size = editCommands.size();
            int i4 = 0;
            pVar = null;
            while (i4 < size) {
                try {
                    pVar2 = editCommands.get(i4);
                } catch (Exception e5) {
                    e4 = e5;
                }
                try {
                    pVar2.a(this.mBuffer);
                    i4++;
                    pVar = pVar2;
                } catch (Exception e6) {
                    e4 = e6;
                    pVar = pVar2;
                    throw new RuntimeException(c(editCommands, pVar), e4);
                }
            }
            androidx.compose.ui.text.e u4 = this.mBuffer.u();
            long j4 = this.mBuffer.j();
            androidx.compose.ui.text.t0 b5 = androidx.compose.ui.text.t0.b(j4);
            b5.getPackedValue();
            androidx.compose.ui.text.t0 t0Var = androidx.compose.ui.text.t0.m(this.mBufferState.getSelection()) ? null : b5;
            z0 z0Var = new z0(u4, t0Var != null ? t0Var.getPackedValue() : androidx.compose.ui.text.u0.b(androidx.compose.ui.text.t0.k(j4), androidx.compose.ui.text.t0.l(j4)), this.mBuffer.e(), (kotlin.jvm.internal.w) null);
            this.mBufferState = z0Var;
            return z0Var;
        } catch (Exception e7) {
            pVar = null;
            e4 = e7;
        }
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final s getMBuffer() {
        return this.mBuffer;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final z0 getMBufferState() {
        return this.mBufferState;
    }

    public final void f(@fg.l z0 value, @fg.m h1 textInputSession) {
        boolean g4 = kotlin.jvm.internal.l0.g(value.getComposition(), this.mBuffer.e());
        boolean z4 = true;
        boolean z5 = false;
        if (!kotlin.jvm.internal.l0.g(this.mBufferState.getAnnotatedString(), value.getAnnotatedString())) {
            this.mBuffer = new s(value.getAnnotatedString(), value.getSelection(), (kotlin.jvm.internal.w) null);
        } else if (androidx.compose.ui.text.t0.g(this.mBufferState.getSelection(), value.getSelection())) {
            z4 = false;
        } else {
            this.mBuffer.r(androidx.compose.ui.text.t0.l(value.getSelection()), androidx.compose.ui.text.t0.k(value.getSelection()));
            z5 = true;
            z4 = false;
        }
        if (value.getComposition() == null) {
            this.mBuffer.b();
        } else if (!androidx.compose.ui.text.t0.h(value.getComposition().getPackedValue())) {
            this.mBuffer.p(androidx.compose.ui.text.t0.l(value.getComposition().getPackedValue()), androidx.compose.ui.text.t0.k(value.getComposition().getPackedValue()));
        }
        if (z4 || (!z5 && !g4)) {
            this.mBuffer.b();
            value = z0.d(value, null, 0L, null, 3, null);
        }
        z0 z0Var = this.mBufferState;
        this.mBufferState = value;
        if (textInputSession != null) {
            textInputSession.g(z0Var, value);
        }
    }

    @fg.l
    public final z0 h() {
        return this.mBufferState;
    }
}
