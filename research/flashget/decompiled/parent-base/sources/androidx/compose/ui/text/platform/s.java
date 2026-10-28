package androidx.compose.ui.text.platform;

import androidx.compose.runtime.b5;
import androidx.compose.runtime.k2;
import androidx.compose.runtime.t4;
import androidx.emoji2.text.g;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: EmojiCompatStatus.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/platform/s;", "Landroidx/compose/ui/text/platform/v;", "<init>", "()V", "Landroidx/compose/runtime/b5;", "", "c", "()Landroidx/compose/runtime/b5;", "a", "Landroidx/compose/runtime/b5;", "loadState", "fontLoaded", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class s implements v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private b5<Boolean> loadState;

    /* compiled from: EmojiCompatStatus.android.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/text/platform/s$a", "Landroidx/emoji2/text/g$g;", "Lkotlin/k2;", "b", "()V", "", "throwable", "a", "(Ljava/lang/Throwable;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends g.AbstractC0478g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2<Boolean> f21277a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f21278b;

        a(k2<Boolean> k2Var, s sVar) {
            this.f21277a = k2Var;
            this.f21278b = sVar;
        }

        @Override // androidx.emoji2.text.g.AbstractC0478g
        public void a(@fg.m Throwable throwable) {
            x xVar;
            s sVar = this.f21278b;
            xVar = w.f21291a;
            sVar.loadState = xVar;
        }

        @Override // androidx.emoji2.text.g.AbstractC0478g
        public void b() {
            this.f21277a.setValue(Boolean.TRUE);
            this.f21278b.loadState = new x(true);
        }
    }

    public s() {
        this.loadState = androidx.emoji2.text.g.q() ? c() : null;
    }

    private final b5<Boolean> c() {
        k2 g4;
        androidx.emoji2.text.g c5 = androidx.emoji2.text.g.c();
        if (c5.i() == 1) {
            return new x(true);
        }
        g4 = t4.g(Boolean.FALSE, null, 2, null);
        c5.B(new a(g4, this));
        return g4;
    }

    @Override // androidx.compose.ui.text.platform.v
    @fg.l
    public b5<Boolean> a() {
        x xVar;
        b5<Boolean> b5Var = this.loadState;
        if (b5Var != null) {
            l0.m(b5Var);
            return b5Var;
        }
        if (!androidx.emoji2.text.g.q()) {
            xVar = w.f21291a;
            return xVar;
        }
        b5<Boolean> c5 = c();
        this.loadState = c5;
        l0.m(c5);
        return c5;
    }
}
