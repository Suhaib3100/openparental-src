package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* compiled from: SemanticsProperties.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@androidx.compose.ui.k
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/u;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/y;", "", "b", "Landroidx/compose/ui/semantics/y;", "a", "()Landroidx/compose/ui/semantics/y;", "TestTagsAsResourceId", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final u f20404a = new u();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private static final y<Boolean> TestTagsAsResourceId = new y<>("TestTagsAsResourceId", false, a.f20407b);

    /* renamed from: c, reason: collision with root package name */
    public static final int f20406c = 8;

    /* compiled from: SemanticsProperties.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<anonymous parameter 1>", "a", "(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.p<Boolean, Boolean, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20407b = new a(2);

        a() {
            super(2);
        }

        @fg.m
        public final Boolean a(@fg.m Boolean bool, boolean z4) {
            return bool;
        }

        @Override // ld.p
        public Boolean invoke(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            bool2.booleanValue();
            return bool3;
        }
    }

    private u() {
    }

    @androidx.compose.ui.k
    public static /* synthetic */ void b() {
    }

    @fg.l
    @androidx.compose.ui.k
    public final y<Boolean> a() {
        return TestTagsAsResourceId;
    }
}
