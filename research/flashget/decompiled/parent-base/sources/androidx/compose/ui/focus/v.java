package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.k2;

/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/q;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/t;", "Lkotlin/k2;", "Lkotlin/u;", "scope", "a", "(Landroidx/compose/ui/q;Lld/l;)Landroidx/compose/ui/q;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {

    /* compiled from: FocusProperties.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a implements z, kotlin.jvm.internal.d0 {

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ ld.l f17601b;

        a(ld.l lVar) {
            this.f17601b = lVar;
        }

        @Override // androidx.compose.ui.focus.z
        public final /* synthetic */ void a(t tVar) {
            this.f17601b.invoke(tVar);
        }

        @Override // kotlin.jvm.internal.d0
        @fg.l
        public final kotlin.v<?> d() {
            return this.f17601b;
        }

        public final boolean equals(@fg.m Object obj) {
            if ((obj instanceof z) && (obj instanceof kotlin.jvm.internal.d0)) {
                return kotlin.jvm.internal.l0.g(this.f17601b, ((kotlin.jvm.internal.d0) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return this.f17601b.hashCode();
        }
    }

    @fg.l
    public static final androidx.compose.ui.q a(@fg.l androidx.compose.ui.q qVar, @fg.l ld.l<? super t, k2> lVar) {
        return qVar.w3(new FocusPropertiesElement(new a(lVar)));
    }
}
