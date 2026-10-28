package androidx.compose.foundation.text2;

import androidx.compose.foundation.text2.input.h;
import androidx.compose.foundation.text2.input.o;
import androidx.compose.foundation.text2.input.q;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.internal.u;
import androidx.compose.ui.text.t0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;

/* compiled from: BasicSecureTextField.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138@@BX\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/text2/c;", "Landroidx/compose/foundation/text2/input/h;", "Lkotlin/Function0;", "Lkotlin/k2;", "scheduleHide", "<init>", "(Lld/a;)V", "Landroidx/compose/foundation/text2/input/q;", "originalValue", "Landroidx/compose/foundation/text2/input/o;", "valueWithChanges", "a", "(Landroidx/compose/foundation/text2/input/q;Landroidx/compose/foundation/text2/input/o;)V", "e", "()V", "b", "Lld/a;", "d", "()Lld/a;", "", "<set-?>", "c", "Landroidx/compose/runtime/i2;", "()I", "f", "(I)V", "revealCodepointIndex", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBasicSecureTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/PasswordRevealFilter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,523:1\n75#2:524\n108#2,2:525\n*S KotlinDebug\n*F\n+ 1 BasicSecureTextField.kt\nandroidx/compose/foundation/text2/PasswordRevealFilter\n*L\n412#1:524\n412#1:525,2\n*E\n"})
/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final int f8499d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.a<k2> scheduleHide;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final i2 revealCodepointIndex = androidx.compose.runtime.b.c(-1);

    public c(@l ld.a<k2> aVar) {
        this.scheduleHide = aVar;
    }

    private final void f(int i4) {
        this.revealCodepointIndex.k(i4);
    }

    @Override // androidx.compose.foundation.text2.input.h
    public void a(@l q originalValue, @l o valueWithChanges) {
        if (valueWithChanges.h().a() != 1 || t0.j(valueWithChanges.h().c(0)) != 1 || t0.j(valueWithChanges.h().b(0)) != 0 || valueWithChanges.m()) {
            f(-1);
            return;
        }
        int l4 = t0.l(valueWithChanges.h().c(0));
        if (this.revealCodepointIndex.f() != l4) {
            this.scheduleHide.invoke();
            f(l4);
        }
    }

    public final int c() {
        return this.revealCodepointIndex.f();
    }

    @l
    public final ld.a<k2> d() {
        return this.scheduleHide;
    }

    public final void e() {
        f(-1);
    }
}
