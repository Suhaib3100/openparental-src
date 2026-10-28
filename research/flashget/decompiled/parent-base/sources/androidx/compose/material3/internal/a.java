package androidx.compose.material3.internal;

import androidx.compose.runtime.i;
import androidx.compose.runtime.t;
import androidx.compose.runtime.x;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.n0;
import kotlin.k2;
import ld.p;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f11674a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public static p<t, Integer, k2> f11675b = new androidx.compose.runtime.internal.b(-1952521318, false, C0251a.f11676b);

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/k2;", "a", "(Landroidx/compose/runtime/t;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.internal.a$a, reason: collision with other inner class name */
    static final class C0251a extends n0 implements p<t, Integer, k2> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0251a f11676b = new C0251a(2);

        C0251a() {
            super(2);
        }

        @i
        public final void a(@m t tVar, int i4) {
            if ((i4 & 3) == 2 && tVar.p()) {
                tVar.d0();
                return;
            }
            if (x.b0()) {
                x.r0(-1952521318, i4, -1, "androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.android.kt:263)");
            }
            if (x.b0()) {
                x.q0();
            }
        }

        @Override // ld.p
        public /* bridge */ /* synthetic */ k2 invoke(t tVar, Integer num) {
            a(tVar, num.intValue());
            return k2.f75408a;
        }
    }

    @l
    public final p<t, Integer, k2> a() {
        return f11675b;
    }
}
