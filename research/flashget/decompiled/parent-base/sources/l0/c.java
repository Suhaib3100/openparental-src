package l0;

import androidx.compose.runtime.internal.u;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.compose.ui.k;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;

/* compiled from: InputModeManager.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR1\u0010\t\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Ll0/c;", "Ll0/b;", "Ll0/a;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILld/l;Lkotlin/jvm/internal/w;)V", "inputMode", "a", "(I)Z", "Lld/l;", "<set-?>", "b", "Landroidx/compose/runtime/k2;", "()I", "c", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nInputModeManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,77:1\n81#2:78\n107#2,2:79\n*S KotlinDebug\n*F\n+ 1 InputModeManager.kt\nandroidx/compose/ui/input/InputModeManagerImpl\n*L\n72#1:78\n72#1:79,2\n*E\n"})
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f81248c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<a, Boolean> onRequestInputModeChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final k2 inputMode;

    public /* synthetic */ c(int i4, ld.l lVar, w wVar) {
        this(i4, lVar);
    }

    @Override // l0.b
    @k
    public boolean a(int inputMode) {
        return this.onRequestInputModeChange.invoke(a.c(inputMode)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l0.b
    public int b() {
        return ((a) this.inputMode.getValue()).getValue();
    }

    public void c(int i4) {
        this.inputMode.setValue(a.c(i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(int i4, ld.l<? super a, Boolean> lVar) {
        k2 g4;
        this.onRequestInputModeChange = lVar;
        g4 = t4.g(a.c(i4), null, 2, null);
        this.inputMode = g4;
    }
}
