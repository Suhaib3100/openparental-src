package androidx.compose.foundation.text2.input.internal;

import android.view.View;
import androidx.annotation.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* compiled from: ComposeInputMethodManager.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/foundation/text2/input/internal/g;", "a", "(Landroid/view/View;)Landroidx/compose/foundation/text2/input/internal/g;", "Lkotlin/Function1;", "factory", "b", "(Lld/l;)Lld/l;", "Lld/l;", "ComposeInputMethodManagerFactory", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private static ld.l<? super View, ? extends g> f8684a = a.f8685b;

    /* compiled from: ComposeInputMethodManager.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/foundation/text2/input/internal/g;", "a", "(Landroid/view/View;)Landroidx/compose/foundation/text2/input/internal/g;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<View, g> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f8685b = new a(1);

        a() {
            super(1);
        }

        @fg.l
        public final g a(@fg.l View view) {
            return new j(view);
        }

        @Override // ld.l
        public g invoke(View view) {
            return new j(view);
        }
    }

    @fg.l
    public static final g a(@fg.l View view) {
        return f8684a.invoke(view);
    }

    @fg.l
    @fg.p
    @m1
    public static final ld.l<View, g> b(@fg.l ld.l<? super View, ? extends g> lVar) {
        ld.l lVar2 = f8684a;
        f8684a = lVar;
        return lVar2;
    }
}
